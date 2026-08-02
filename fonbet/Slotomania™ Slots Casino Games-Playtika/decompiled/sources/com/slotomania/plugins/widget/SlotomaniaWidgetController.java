package com.slotomania.plugins.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.google.common.net.HttpHeaders;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public final class SlotomaniaWidgetController {
    private static final String IMAGE_CACHE_EXTENSION = ".png";
    private static final String IMAGE_CACHE_PREFIX = "widget_background_cache_";
    private static final int IMAGE_DOWNLOAD_TIMEOUT_MS = 5000;
    private static final int IMAGE_MAX_SIZE_PX = 1200;
    private static final String LEGACY_IMAGE_CACHE_FILENAME = "widget_background_cache.png";
    private static final int MAX_CACHED_IMAGES = 5;
    private static final String TAG = "SlotomaniaWidget";
    private static String inFlightImageUrl;
    private static final Object IMAGE_DOWNLOAD_LOCK = new Object();
    private static final ExecutorService IMAGE_EXECUTOR = Executors.newSingleThreadExecutor();

    public enum HourlyBonusState {
        TIMER,
        COLLECT
    }

    public enum WidgetState {
        REGULAR,
        HOURLY_BONUS
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    private SlotomaniaWidgetController() {
    }

    public static void updateHourlyBonusState(Context context, HourlyBonusState hourlyBonusState, Long l, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor putLong = applicationContext.getSharedPreferences(SlotomaniaWidgetProvider.PREFS_WIDGET, 0).edit().putString(SlotomaniaWidgetProvider.KEY_WIDGET_STATE, SlotomaniaWidgetProvider.WIDGET_STATE_HOURLY_BONUS).putString(SlotomaniaWidgetProvider.KEY_HOURLY_BONUS_STATE, hourlyBonusState.name().toLowerCase()).putString("state", hourlyBonusState.name().toLowerCase()).putLong(SlotomaniaWidgetProvider.KEY_NEXT_BONUS_TIME_MILLIS_LEGACY, 0L);
        if (l != null) {
            putLong.putLong(SlotomaniaWidgetProvider.KEY_NEXT_HOURLY_BONUS_TIME_MILLIS, l.longValue());
        } else if (hourlyBonusState != HourlyBonusState.TIMER) {
            putLong.putLong(SlotomaniaWidgetProvider.KEY_NEXT_HOURLY_BONUS_TIME_MILLIS, 0L);
        }
        if (str != null) {
            putLong.putString("deeplink", str.trim());
        }
        String normalizeImageUrl = normalizeImageUrl(str2);
        if (normalizeImageUrl.isEmpty()) {
            putLong.remove("image_url");
            putLong.remove(SlotomaniaWidgetProvider.KEY_CACHED_IMAGE_URL);
            deleteLegacyCachedImageFile(applicationContext);
        } else {
            putLong.putString("image_url", normalizeImageUrl);
        }
        putLong.commit();
        if (!normalizeImageUrl.isEmpty()) {
            ensureImageCached(applicationContext, normalizeImageUrl);
        } else {
            refreshWidget(applicationContext);
        }
    }

    public static void setWidgetState(Context context, WidgetState widgetState) {
        SharedPreferences.Editor putString = context.getApplicationContext().getSharedPreferences(SlotomaniaWidgetProvider.PREFS_WIDGET, 0).edit().putString(SlotomaniaWidgetProvider.KEY_WIDGET_STATE, widgetState.name().toLowerCase());
        if (widgetState == WidgetState.REGULAR) {
            putString.putLong(SlotomaniaWidgetProvider.KEY_NEXT_HOURLY_BONUS_TIME_MILLIS, 0L);
        }
        putString.commit();
        refreshWidget(context);
    }

    public static void setDeeplink(Context context, String str) {
        context.getApplicationContext().getSharedPreferences(SlotomaniaWidgetProvider.PREFS_WIDGET, 0).edit().putString("deeplink", str != null ? str.trim() : "").commit();
        refreshWidget(context);
    }

    public static void setImageUrl(Context context, String str) {
        if (str == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String normalizeImageUrl = normalizeImageUrl(str);
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(SlotomaniaWidgetProvider.PREFS_WIDGET, 0);
        if (normalizeImageUrl.isEmpty()) {
            sharedPreferences.edit().remove("image_url").remove(SlotomaniaWidgetProvider.KEY_CACHED_IMAGE_URL).commit();
            deleteLegacyCachedImageFile(applicationContext);
            refreshWidget(applicationContext);
        } else {
            sharedPreferences.edit().putString("image_url", normalizeImageUrl).commit();
            ensureImageCached(applicationContext, normalizeImageUrl);
        }
    }

    public static void ensureImageCached(Context context, String str) {
        String normalizeImageUrl = normalizeImageUrl(str);
        if (normalizeImageUrl.isEmpty()) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (isCacheFileValid(getCacheFileForUrl(applicationContext, normalizeImageUrl))) {
            refreshWidget(applicationContext);
            return;
        }
        synchronized (IMAGE_DOWNLOAD_LOCK) {
            if (normalizeImageUrl.equals(inFlightImageUrl)) {
                return;
            }
            inFlightImageUrl = normalizeImageUrl;
            downloadAndCacheImage(applicationContext, normalizeImageUrl);
        }
    }

    private static boolean isCacheFileValid(File file) {
        if (file.exists() && file.length() > 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (options.outWidth > 0 && options.outHeight > 0) {
                return true;
            }
        }
        return false;
    }

    private static String normalizeImageUrl(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        return (trim.startsWith(d.v) || trim.startsWith(d.u)) ? trim : "";
    }

    private static void deleteLegacyCachedImageFile(Context context) {
        File file = new File(context.getCacheDir(), LEGACY_IMAGE_CACHE_FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    static File getCacheFileForImageUrl(Context context, String str) {
        String normalizeImageUrl = normalizeImageUrl(str);
        if (normalizeImageUrl.isEmpty()) {
            return null;
        }
        return getCacheFileForUrl(context.getApplicationContext(), normalizeImageUrl);
    }

    private static File getCacheFileForUrl(Context context, String str) {
        return new File(context.getCacheDir(), getCacheFileName(str));
    }

    private static String getCacheFileName(String str) {
        return IMAGE_CACHE_PREFIX + Integer.toHexString(str.hashCode()) + IMAGE_CACHE_EXTENSION;
    }

    public static void refreshWidget(Context context) {
        SlotomaniaWidgetProvider.updateAllWidgetsNow(context);
    }

    public static boolean requestPinWidget(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) WidgetPinActivity.class);
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        return true;
    }

    public static boolean isPinSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isWidgetOnHomeScreen(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SlotomaniaWidgetProvider.class));
        return appWidgetIds != null && appWidgetIds.length > 0;
    }

    private static void downloadAndCacheImage(final Context context, final String str) {
        IMAGE_EXECUTOR.execute(new Runnable() { // from class: com.slotomania.plugins.widget.SlotomaniaWidgetController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SlotomaniaWidgetController.lambda$downloadAndCacheImage$0(str, context);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void lambda$downloadAndCacheImage$0(String str, Context context) {
        HttpURLConnection httpURLConnection;
        File file;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "close");
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        synchronized (IMAGE_DOWNLOAD_LOCK) {
                            if (str.equals(inFlightImageUrl)) {
                                inFlightImageUrl = null;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    }
                    file = new File(context.getCacheDir(), getCacheFileName(str) + ".tmp");
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                        fileOutputStream.close();
                        inputStream.close();
                        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                        if (decodeFile != null && decodeFile.getWidth() > 0 && decodeFile.getHeight() > 0) {
                            Bitmap scaleBitmap = scaleBitmap(decodeFile, 1200);
                            if (scaleBitmap != decodeFile) {
                                decodeFile.recycle();
                            }
                            File cacheFileForUrl = getCacheFileForUrl(context, str);
                            FileOutputStream fileOutputStream2 = new FileOutputStream(cacheFileForUrl);
                            scaleBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            scaleBitmap.recycle();
                            if (file.exists()) {
                                file.delete();
                            }
                            cleanupCachedImageFiles(context, cacheFileForUrl.getName());
                            refreshWidget(context);
                            synchronized (IMAGE_DOWNLOAD_LOCK) {
                                if (str.equals(inFlightImageUrl)) {
                                    inFlightImageUrl = null;
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                return;
                            }
                            return;
                        }
                        if (file.exists()) {
                            file.delete();
                        }
                        synchronized (IMAGE_DOWNLOAD_LOCK) {
                            if (str.equals(inFlightImageUrl)) {
                                inFlightImageUrl = null;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.e(TAG, "Failed to cache widget image", e);
                        if (file != null && file.exists()) {
                            file.delete();
                        }
                        synchronized (IMAGE_DOWNLOAD_LOCK) {
                            if (str.equals(inFlightImageUrl)) {
                                inFlightImageUrl = null;
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    file = null;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (IMAGE_DOWNLOAD_LOCK) {
                    if (str.equals(inFlightImageUrl)) {
                        inFlightImageUrl = null;
                    }
                }
                if (0 != 0) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
            file = null;
        } catch (Throwable th2) {
            th = th2;
            synchronized (IMAGE_DOWNLOAD_LOCK) {
            }
        }
    }

    private static Bitmap scaleBitmap(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= i && height <= i) {
            return bitmap;
        }
        float f = i;
        float f2 = width;
        float f3 = height;
        float min = Math.min(f / f2, f / f3);
        return Bitmap.createScaledBitmap(bitmap, Math.round(f2 * min), Math.round(f3 * min), true);
    }

    private static void cleanupCachedImageFiles(Context context, String str) {
        File[] listFiles = context.getCacheDir().listFiles(new FilenameFilter() { // from class: com.slotomania.plugins.widget.SlotomaniaWidgetController.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2 != null && str2.startsWith(SlotomaniaWidgetController.IMAGE_CACHE_PREFIX) && str2.endsWith(SlotomaniaWidgetController.IMAGE_CACHE_EXTENSION);
            }
        });
        if (listFiles == null || listFiles.length <= 5) {
            return;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.slotomania.plugins.widget.SlotomaniaWidgetController.2
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return Long.compare(file.lastModified(), file2.lastModified());
            }
        });
        int length = listFiles.length;
        for (File file : listFiles) {
            if (length <= 5) {
                return;
            }
            if (!str.equals(file.getName()) && file.delete()) {
                length--;
            }
        }
    }
}
