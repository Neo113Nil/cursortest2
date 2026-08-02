package org.chromium.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.Display;
import android.view.View;
import io.radar.sdk.RadarTrackingOptions;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class ApiCompatibilityUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ApiCompatUtil";

    private ApiCompatibilityUtils() {
    }

    public static byte[] getBytesUtf8(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Drawable getDrawable(Resources res, int id) throws Resources.NotFoundException {
        return getDrawableForDensity(res, id, 0);
    }

    public static Drawable getDrawableForDensity(Resources res, int id, int density) {
        Drawable drawableForDensity;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (density == 0) {
                drawableForDensity = res.getDrawable(id, null);
            } else {
                drawableForDensity = res.getDrawableForDensity(id, density, null);
            }
            return drawableForDensity;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static int checkPermission(Context context, String permission, int pid, int uid) {
        try {
            return context.checkPermission(permission, pid, uid);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static List<Integer> getTargetableDisplayIds(Activity activity) {
        DisplayManager displayManager;
        boolean isActivityStartAllowedOnDisplay;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = new ArrayList();
            if (activity != null && (displayManager = (DisplayManager) activity.getSystemService("display")) != null) {
                Display[] displays = displayManager.getDisplays();
                ActivityManager activityManager = (ActivityManager) activity.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
                for (Display display : displays) {
                    if (display.getState() == 2) {
                        isActivityStartAllowedOnDisplay = activityManager.isActivityStartAllowedOnDisplay(activity, display.getDisplayId(), new Intent(activity, activity.getClass()));
                        if (isActivityStartAllowedOnDisplay) {
                            arrayList.add(Integer.valueOf(display.getDisplayId()));
                        }
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static void setActivityOptionsBackgroundActivityStartAllowAlways(ActivityOptions options) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 35) {
            options.setPendingIntentBackgroundActivityStartMode(1);
        } else {
            options.setPendingIntentBackgroundActivityStartMode(getBackgroundActivityStartAllowAlwaysMode());
        }
    }

    private static int getBackgroundActivityStartAllowAlwaysMode() {
        try {
            Field declaredField = ActivityOptions.class.getDeclaredField("MODE_BACKGROUND_ACTIVITY_START_ALLOW_ALWAYS");
            declaredField.setAccessible(true);
            return declaredField.getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException("Background start mode cannot be found.", e);
        }
    }

    public static void setCreatorActivityOptionsBackgroundActivityStartMode(ActivityOptions options) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        options.setPendingIntentCreatorBackgroundActivityStartMode(1);
    }

    public static void clearHandwritingBoundsOffsetBottom(View view) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        try {
            Float f = (Float) View.class.getMethod("getHandwritingBoundsOffsetTop", null).invoke(view, null);
            f.floatValue();
            Float f2 = (Float) View.class.getMethod("getHandwritingBoundsOffsetLeft", null).invoke(view, null);
            f2.floatValue();
            Float f3 = (Float) View.class.getMethod("getHandwritingBoundsOffsetRight", null).invoke(view, null);
            f3.floatValue();
            View.class.getMethod("setHandwritingBoundsOffsets", Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE).invoke(view, f2, f, f3, 0);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
        }
    }

    public static boolean isRunningInUserTestHarness() {
        boolean isRunningInUserTestHarness;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isRunningInUserTestHarness = ActivityManager.isRunningInUserTestHarness();
        return isRunningInUserTestHarness;
    }

    public static Bitmap getBitmapByUri(ContentResolver cr, Uri uri) throws IOException {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(cr, uri);
            decodeBitmap = ImageDecoder.decodeBitmap(createSource);
            return decodeBitmap;
        }
        return MediaStore.Images.Media.getBitmap(cr, uri);
    }
}
