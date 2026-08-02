package com.slotomania.plugins.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.io.File;
import java.util.Locale;

/* loaded from: classes6.dex */
public class SlotomaniaWidgetProvider extends AppWidgetProvider {
    public static final String ACTION_WIDGET_EXACT_COLLECT = "com.slotomania.plugins.widget.WIDGET_EXACT_COLLECT";
    public static final String ACTION_WIDGET_TICK = "com.slotomania.plugins.widget.WIDGET_TICK";
    public static final String DEEPLINK_FALLBACK = "slotomania://?ch=widget";
    public static final String HOURLY_BONUS_STATE_COLLECT = "collect";
    public static final String HOURLY_BONUS_STATE_TIMER = "timer";
    public static final String KEY_CACHED_IMAGE_URL = "cached_image_url";
    public static final String KEY_DEEPLINK = "deeplink";
    public static final String KEY_HOURLY_BONUS_STATE = "hourly_bonus_state";
    public static final String KEY_IMAGE_URL = "image_url";
    public static final String KEY_NEXT_BONUS_TIME_MILLIS_LEGACY = "next_bonus_time_millis";
    public static final String KEY_NEXT_HOURLY_BONUS_TIME_MILLIS = "next_hourly_bonus_time_millis";
    public static final String KEY_STATE = "state";
    public static final String KEY_WIDGET_STATE = "widget_state";
    private static final long LAST_MINUTE_THRESHOLD_MS = 60000;
    private static final long LAST_MINUTE_TICK_INTERVAL_MS = 10000;
    private static final int MAX_WIDGET_IMAGE_SIZE = 1200;
    public static final String PREFS_WIDGET = "slotomania_widget";
    private static final int REQUEST_EXACT_COLLECT = 1464419651;
    private static final int REQUEST_TICK = 1464419399;
    private static final String TAG = "SlotomaniaWidget";
    private static final long TICK_INTERVAL_MS = 60000;
    private static final float TIMER_TEXT_BOTTOM_RATIO = 0.81f;
    private static final float TIMER_TEXT_LEFT_RATIO = 0.6f;
    private static final float TIMER_TEXT_RIGHT_RATIO = 0.76f;
    private static final float TIMER_TEXT_TOP_RATIO = 0.65f;
    public static final String WIDGET_STATE_HOURLY_BONUS = "hourly_bonus";
    public static final String WIDGET_STATE_REGULAR = "regular";

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (ACTION_WIDGET_TICK.equals(action) || ACTION_WIDGET_EXACT_COLLECT.equals(action)) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) SlotomaniaWidgetProvider.class));
            for (int i : appWidgetIds) {
                updateAppWidget(context, appWidgetManager, i);
            }
            scheduleNextTickIfNeeded(context, appWidgetManager, appWidgetIds);
            return;
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            updateAppWidget(context, appWidgetManager, i);
        }
        scheduleNextTickIfNeeded(context, appWidgetManager, iArr);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        cancelScheduledAlarms(context);
    }

    public static void updateAllWidgetsNow(Context context) {
        Context applicationContext = context.getApplicationContext();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applicationContext);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) SlotomaniaWidgetProvider.class));
        for (int i : appWidgetIds) {
            updateAppWidget(applicationContext, appWidgetManager, i);
        }
        scheduleNextTickIfNeeded(applicationContext, appWidgetManager, appWidgetIds);
    }

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager, int i) {
        try {
            int identifier = context.getResources().getIdentifier(PREFS_WIDGET, TtmlNode.TAG_LAYOUT, context.getPackageName());
            int identifier2 = context.getResources().getIdentifier("widget_timer", "id", context.getPackageName());
            int identifier3 = context.getResources().getIdentifier("widget_hourly_bonus_image", "id", context.getPackageName());
            int identifier4 = context.getResources().getIdentifier("widget_overlay_image", "id", context.getPackageName());
            int identifier5 = context.getResources().getIdentifier("widget_root", "id", context.getPackageName());
            if (identifier == 0) {
                Log.e(TAG, "slotomania_widget layout id is 0. Skip widget update.");
                return;
            }
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), identifier);
            persistCollectStateIfTimeReached(context);
            String widgetState = getWidgetState(context);
            String hourlyBonusState = getHourlyBonusState(context);
            String timerText = getTimerText(context, widgetState, hourlyBonusState);
            boolean isState = isState(widgetState, WIDGET_STATE_HOURLY_BONUS);
            boolean isState2 = isState(hourlyBonusState, HOURLY_BONUS_STATE_COLLECT);
            if (isState && isState2) {
                if (identifier4 != 0) {
                    int identifier6 = context.getResources().getIdentifier("widget_overlay_collect", "drawable", context.getPackageName());
                    if (identifier6 != 0) {
                        remoteViews.setImageViewResource(identifier4, identifier6);
                        remoteViews.setViewVisibility(identifier4, 0);
                    } else {
                        remoteViews.setViewVisibility(identifier4, 8);
                    }
                }
                if (identifier2 != 0) {
                    remoteViews.setViewVisibility(identifier2, 8);
                }
            } else if (!isState || timerText.isEmpty()) {
                if (identifier4 != 0) {
                    remoteViews.setViewVisibility(identifier4, 8);
                }
                if (identifier2 != 0) {
                    remoteViews.setViewVisibility(identifier2, 8);
                }
            } else if (identifier4 != 0) {
                int identifier7 = context.getResources().getIdentifier("widget_overlay_timer", "drawable", context.getPackageName());
                if (identifier7 != 0) {
                    Bitmap buildTimerOverlayBitmap = buildTimerOverlayBitmap(context, timerText, identifier7);
                    if (buildTimerOverlayBitmap != null) {
                        remoteViews.setImageViewBitmap(identifier4, buildTimerOverlayBitmap);
                        if (identifier2 != 0) {
                            remoteViews.setViewVisibility(identifier2, 8);
                        }
                    } else {
                        remoteViews.setImageViewResource(identifier4, identifier7);
                        if (identifier2 != 0) {
                            remoteViews.setViewVisibility(identifier2, 0);
                            remoteViews.setTextViewText(identifier2, timerText);
                        }
                    }
                    remoteViews.setViewVisibility(identifier4, 0);
                } else {
                    remoteViews.setViewVisibility(identifier4, 8);
                }
            }
            applyHourlyBonusImage(context, remoteViews, identifier3);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getDeeplink(context)));
            intent.setFlags(335544320);
            intent.setPackage(context.getPackageName());
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
            if (identifier3 != 0) {
                remoteViews.setOnClickPendingIntent(identifier3, activity);
            }
            if (identifier4 != 0) {
                remoteViews.setOnClickPendingIntent(identifier4, activity);
            }
            if (identifier2 != 0) {
                remoteViews.setOnClickPendingIntent(identifier2, activity);
            }
            if (identifier5 != 0) {
                remoteViews.setOnClickPendingIntent(identifier5, activity);
            }
            appWidgetManager.updateAppWidget(i, remoteViews);
        } catch (Throwable th) {
            Log.e(TAG, "Failed to update widget", th);
        }
    }

    private static void applyHourlyBonusImage(Context context, RemoteViews remoteViews, int i) {
        if (i == 0) {
            return;
        }
        try {
            String normalizeImageUrl = normalizeImageUrl(context.getApplicationContext().getSharedPreferences(PREFS_WIDGET, 0).getString("image_url", ""));
            File cacheFileForImageUrl = SlotomaniaWidgetController.getCacheFileForImageUrl(context, normalizeImageUrl);
            if (!normalizeImageUrl.isEmpty()) {
                if (cacheFileForImageUrl != null && cacheFileForImageUrl.exists()) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(cacheFileForImageUrl.getAbsolutePath());
                    if (decodeFile != null && decodeFile.getWidth() > 0 && decodeFile.getHeight() > 0) {
                        remoteViews.setImageViewBitmap(i, scaleBitmap(decodeFile));
                        return;
                    } else {
                        if (decodeFile != null) {
                            decodeFile.recycle();
                        }
                        cacheFileForImageUrl.delete();
                    }
                }
                setDefaultImage(context, remoteViews, i);
                SlotomaniaWidgetController.ensureImageCached(context, normalizeImageUrl);
                return;
            }
            setDefaultImage(context, remoteViews, i);
        } catch (Throwable th) {
            Log.e(TAG, "applyHourlyBonusImage failed", th);
        }
    }

    private static Bitmap scaleBitmap(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 1200 && height <= 1200) {
            return bitmap;
        }
        float f = width;
        float f2 = height;
        float min = Math.min(1200.0f / f, 1200.0f / f2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f * min), (int) (f2 * min), true);
        if (createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    private static Bitmap buildTimerOverlayBitmap(Context context, String str, int i) {
        Bitmap copy;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        if (decodeResource == null || decodeResource.getWidth() <= 0 || decodeResource.getHeight() <= 0 || (copy = decodeResource.copy(Bitmap.Config.ARGB_8888, true)) == null) {
            return null;
        }
        if (copy != decodeResource) {
            decodeResource.recycle();
        }
        float height = copy.getHeight() * TIMER_TEXT_TOP_RATIO;
        float width = copy.getWidth() * TIMER_TEXT_RIGHT_RATIO;
        float height2 = copy.getHeight() * TIMER_TEXT_BOTTOM_RATIO;
        Paint paint = new Paint(129);
        paint.setColor(-1);
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize((height2 - height) * 0.54f);
        paint.setShadowLayer(3.0f, 0.0f, 1.0f, -1610612736);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        new Canvas(copy).drawText(str, ((copy.getWidth() * 0.6f) + width) * 0.5f, ((height + height2) * 0.5f) - ((fontMetrics.ascent + fontMetrics.descent) * 0.5f), paint);
        return copy;
    }

    private static void setDefaultImage(Context context, RemoteViews remoteViews, int i) {
        int identifier = context.getResources().getIdentifier("widget_slotomania", "drawable", context.getPackageName());
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier("widget_background", "drawable", context.getPackageName());
        }
        if (identifier != 0) {
            remoteViews.setImageViewResource(i, identifier);
        }
    }

    private static String normalizeImageUrl(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        return (trim.startsWith(d.v) || trim.startsWith(d.u)) ? trim : "";
    }

    private static void scheduleNextTickIfNeeded(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_WIDGET, 0);
        String widgetState = getWidgetState(context);
        String hourlyBonusState = getHourlyBonusState(context);
        if (!isState(widgetState, WIDGET_STATE_HOURLY_BONUS) || !isState(hourlyBonusState, HOURLY_BONUS_STATE_TIMER)) {
            cancelScheduledAlarms(context);
            return;
        }
        long nextHourlyBonusTimeMillis = getNextHourlyBonusTimeMillis(sharedPreferences);
        long currentTimeMillis = nextHourlyBonusTimeMillis - System.currentTimeMillis();
        if (nextHourlyBonusTimeMillis <= 0 || currentTimeMillis <= 0) {
            cancelScheduledAlarms(context);
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager != null) {
            PendingIntent buildTickPendingIntent = buildTickPendingIntent(context);
            PendingIntent buildExactCollectPendingIntent = buildExactCollectPendingIntent(context);
            alarmManager.cancel(buildTickPendingIntent);
            alarmManager.cancel(buildExactCollectPendingIntent);
            alarmManager.setAndAllowWhileIdle(3, SystemClock.elapsedRealtime() + Math.min(currentTimeMillis <= 60000 ? 10000L : 60000L, currentTimeMillis), buildTickPendingIntent);
            scheduleExactCollectAlarm(alarmManager, buildExactCollectPendingIntent, System.currentTimeMillis() + currentTimeMillis);
        }
    }

    private static PendingIntent buildTickPendingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) SlotomaniaWidgetProvider.class);
        intent.setAction(ACTION_WIDGET_TICK);
        intent.setPackage(context.getPackageName());
        return PendingIntent.getBroadcast(context, REQUEST_TICK, intent, 201326592);
    }

    private static PendingIntent buildExactCollectPendingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) SlotomaniaWidgetProvider.class);
        intent.setAction(ACTION_WIDGET_EXACT_COLLECT);
        intent.setPackage(context.getPackageName());
        return PendingIntent.getBroadcast(context, REQUEST_EXACT_COLLECT, intent, 201326592);
    }

    private static void scheduleExactCollectAlarm(AlarmManager alarmManager, PendingIntent pendingIntent, long j) {
        try {
            alarmManager.setExactAndAllowWhileIdle(0, j, pendingIntent);
        } catch (SecurityException unused) {
            alarmManager.setAndAllowWhileIdle(0, j, pendingIntent);
        }
    }

    private static void cancelScheduledAlarms(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager != null) {
            alarmManager.cancel(buildTickPendingIntent(context));
            alarmManager.cancel(buildExactCollectPendingIntent(context));
        }
    }

    private static void persistCollectStateIfTimeReached(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_WIDGET, 0);
        String widgetState = getWidgetState(context);
        String hourlyBonusState = getHourlyBonusState(context);
        if (isState(widgetState, WIDGET_STATE_HOURLY_BONUS) && isState(hourlyBonusState, HOURLY_BONUS_STATE_TIMER)) {
            long nextHourlyBonusTimeMillis = getNextHourlyBonusTimeMillis(sharedPreferences);
            if (nextHourlyBonusTimeMillis <= 0 || nextHourlyBonusTimeMillis - System.currentTimeMillis() > 0) {
                return;
            }
            sharedPreferences.edit().putString(KEY_HOURLY_BONUS_STATE, HOURLY_BONUS_STATE_COLLECT).putString("state", HOURLY_BONUS_STATE_COLLECT).putLong(KEY_NEXT_HOURLY_BONUS_TIME_MILLIS, 0L).putLong(KEY_NEXT_BONUS_TIME_MILLIS_LEGACY, 0L).apply();
        }
    }

    private static String getTimerText(Context context, String str, String str2) {
        if (!isState(str, WIDGET_STATE_HOURLY_BONUS) || isState(str2, HOURLY_BONUS_STATE_COLLECT)) {
            return "";
        }
        long nextHourlyBonusTimeMillis = getNextHourlyBonusTimeMillis(context.getApplicationContext().getSharedPreferences(PREFS_WIDGET, 0));
        long currentTimeMillis = nextHourlyBonusTimeMillis - System.currentTimeMillis();
        return (nextHourlyBonusTimeMillis <= 0 || currentTimeMillis <= 0) ? "" : formatRemainingMillis(currentTimeMillis);
    }

    private static String getWidgetState(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_WIDGET, 0);
        String string = sharedPreferences.getString(KEY_WIDGET_STATE, null);
        if (isState(string, WIDGET_STATE_REGULAR) || isState(string, WIDGET_STATE_HOURLY_BONUS)) {
            return string;
        }
        String string2 = sharedPreferences.getString("state", null);
        return (isState(string2, HOURLY_BONUS_STATE_TIMER) || isState(string2, HOURLY_BONUS_STATE_COLLECT)) ? WIDGET_STATE_HOURLY_BONUS : WIDGET_STATE_REGULAR;
    }

    private static String getHourlyBonusState(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_WIDGET, 0);
        String string = sharedPreferences.getString(KEY_HOURLY_BONUS_STATE, null);
        if (isState(string, HOURLY_BONUS_STATE_TIMER) || isState(string, HOURLY_BONUS_STATE_COLLECT)) {
            return string;
        }
        String string2 = sharedPreferences.getString("state", null);
        return (isState(string2, HOURLY_BONUS_STATE_TIMER) || isState(string2, HOURLY_BONUS_STATE_COLLECT)) ? string2 : HOURLY_BONUS_STATE_TIMER;
    }

    private static long getNextHourlyBonusTimeMillis(SharedPreferences sharedPreferences) {
        long j = sharedPreferences.getLong(KEY_NEXT_HOURLY_BONUS_TIME_MILLIS, 0L);
        return j > 0 ? j : sharedPreferences.getLong(KEY_NEXT_BONUS_TIME_MILLIS_LEGACY, 0L);
    }

    private static boolean isState(String str, String str2) {
        return str != null && str2.equalsIgnoreCase(str);
    }

    static String formatRemainingMillis(long j) {
        long max = (Math.max(0L, j) + 59999) / 60000;
        return String.format(Locale.US, "%02d:%02d", Long.valueOf(max / 60), Long.valueOf(max % 60));
    }

    static String getDeeplink(Context context) {
        String string = context.getApplicationContext().getSharedPreferences(PREFS_WIDGET, 0).getString("deeplink", null);
        return (string == null || string.trim().isEmpty()) ? DEEPLINK_FALLBACK : string.trim();
    }
}
