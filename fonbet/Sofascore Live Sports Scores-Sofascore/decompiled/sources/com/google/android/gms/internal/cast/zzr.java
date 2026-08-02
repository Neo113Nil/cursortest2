package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import defpackage.dmi;
import defpackage.dno;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzr {
    public static final Logger j = new Logger("FeatureUsageAnalytics", null);
    public static final String k = "22.2.0";
    public static zzr l;
    public final zzj a;
    public final SharedPreferences b;
    public final String c;
    public long i;
    public final DefaultClock h = DefaultClock.a;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final zzfk e = new zzfk(Looper.getMainLooper());
    public final dno d = new dno(this, 16);

    public zzr(SharedPreferences sharedPreferences, zzj zzjVar, String str) {
        this.b = sharedPreferences;
        this.a = zzjVar;
        this.c = str;
    }

    public static void a(zzpm zzpmVar) {
        zzr zzrVar;
        if (!zzj.l || (zzrVar = l) == null) {
            return;
        }
        SharedPreferences sharedPreferences = zzrVar.b;
        String num = Integer.toString(zzpmVar.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String q = dmi.q("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(q)) {
            q = dmi.q("feature_usage_timestamp_detected_feature_", num);
        }
        DefaultClock defaultClock = zzrVar.h;
        Preconditions.i(defaultClock);
        edit.putLong(q, defaultClock.a()).apply();
        zzrVar.f.add(zzpmVar);
        zzrVar.e.post(zzrVar.d);
    }

    public static zzpm c(String str) {
        switch (Integer.parseInt(str)) {
            case 0:
                return zzpm.DEVELOPER_FEATURE_FLAG_UNKNOWN;
            case 1:
                return zzpm.CAF_CAST_BUTTON;
            case 2:
                return zzpm.CAF_EXPANDED_CONTROLLER;
            case 3:
                return zzpm.CAF_MINI_CONTROLLER;
            case 4:
                return zzpm.CAF_CONTAINER_CONTROLLER;
            case 5:
                return zzpm.CAST_CONTEXT;
            case 6:
                return zzpm.IMAGE_CACHE;
            case 7:
                return zzpm.IMAGE_PICKER;
            case 8:
                return zzpm.AD_BREAK_PARSER;
            case 9:
                return zzpm.UI_STYLE;
            case 10:
                return zzpm.HARDWARE_VOLUME_BUTTON;
            case 11:
                return zzpm.NON_CAST_DEVICE_PROVIDER;
            case 12:
                return zzpm.PAUSE_CONTROLLER;
            case 13:
                return zzpm.SEEK_CONTROLLER;
            case 14:
                return zzpm.STREAM_VOLUME;
            case 15:
                return zzpm.UI_MEDIA_CONTROLLER;
            case 16:
                return zzpm.PLAYBACK_RATE_CONTROLLER;
            case 17:
                return zzpm.PRECACHE;
            case 18:
                return zzpm.INSTRUCTIONS_VIEW;
            case 19:
                return zzpm.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
            case 20:
                return zzpm.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
            case 21:
                return zzpm.OPTION_DISABLE_DISCOVERY_AUTOSTART;
            case 22:
                return zzpm.OPTION_DISABLE_ANALYTICS_LOGGING;
            case 23:
                return zzpm.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
            case 24:
                return zzpm.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
            case 25:
                return zzpm.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
            case 26:
                return zzpm.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
            case 27:
                return zzpm.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
            case 28:
                return zzpm.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
            case 29:
                return zzpm.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
            case 30:
                return zzpm.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
            case 31:
                return zzpm.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
            case 32:
                return zzpm.CAST_UNAVAILABLE_BUTTON_VISIBLE;
            case 33:
                return zzpm.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
            case 34:
                return zzpm.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
            case 35:
                return zzpm.CAST_OUTPUT_SWITCHER_ENABLED;
            case 36:
                return zzpm.CAST_TRANSFER_TO_LOCAL_ENABLED;
            case 37:
                return zzpm.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
            case 38:
                return zzpm.CAST_BUTTON_DELEGATE;
            case 39:
                return zzpm.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
            case 40:
                return zzpm.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
            case 41:
                return zzpm.CAST_TRANSFER_TO_LOCAL_USED;
            case 42:
                return zzpm.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case 43:
                return zzpm.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 44:
                return zzpm.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case 45:
                return zzpm.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 46:
                return zzpm.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
            case 47:
                return zzpm.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 48:
                return zzpm.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
            case 49:
                return zzpm.CAF_NOTIFICATION_SERVICE;
            case 50:
                return zzpm.HARDWARE_VOLUME_BUTTON_PRESS;
            case 51:
                return zzpm.CAST_SDK_DEFAULT_DEVICE_DIALOG;
            case 52:
                return zzpm.CAST_SDK_CUSTOM_DEVICE_DIALOG;
            case 53:
                return zzpm.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
            case 54:
                return zzpm.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
            case 55:
                return zzpm.CAF_MEDIA_NOTIFICATION_PROXY;
            case 56:
                return zzpm.REMOTE_CONNECTION_MANAGER_ACQUIRED;
            case 57:
                return zzpm.REMOTE_CONNECTION_CALLBACK_SET;
            default:
                return null;
        }
    }

    public final void b(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
