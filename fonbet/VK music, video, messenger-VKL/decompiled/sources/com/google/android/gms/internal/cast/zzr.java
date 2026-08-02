package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.base.TimeUtils;
import xsna.avf;
import xsna.exc0;
import xsna.fo8;
import xsna.jcl;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzr {
    private static final o100 zza = new o100("FeatureUsageAnalytics", null);
    private static final String zzb = "22.3.1";

    @Nullable
    private static zzr zzc;
    private final zzj zzd;
    private final SharedPreferences zze;
    private final String zzf;
    private long zzl;
    private final avf zzk = jcl.a;
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Handler zzh = new zzfk(Looper.getMainLooper());
    private final Runnable zzg = new Runnable() { // from class: com.google.android.gms.internal.cast.zzq
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzr.this.zze();
        }
    };

    private zzr(SharedPreferences sharedPreferences, zzj zzjVar, String str) {
        this.zze = sharedPreferences;
        this.zzd = zzjVar;
        this.zzf = str;
    }

    public static synchronized zzr zza(SharedPreferences sharedPreferences, zzj zzjVar, String str) {
        zzr zzrVar;
        synchronized (zzr.class) {
            try {
                if (zzc == null) {
                    zzc = new zzr(sharedPreferences, zzjVar, str);
                }
                zzrVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzrVar;
    }

    public static void zzb(zzpm zzpmVar) {
        zzr zzrVar;
        if (!zzj.zza || (zzrVar = zzc) == null) {
            return;
        }
        zzrVar.zze.edit().putLong(zzrVar.zzi(Integer.toString(zzpmVar.zza())), zzrVar.zzh()).apply();
        zzrVar.zzi.add(zzpmVar);
        zzrVar.zzg();
    }

    public static String zzd(String str, String str2) {
        return fo8.a(str, str2);
    }

    private final void zzf(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.zze.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    private final void zzg() {
        this.zzh.post(this.zzg);
    }

    private final long zzh() {
        avf avfVar = this.zzk;
        exc0.i(avfVar);
        return avfVar.currentTimeMillis();
    }

    private final String zzi(String str) {
        SharedPreferences sharedPreferences = this.zze;
        String zzd = zzd("feature_usage_timestamp_reported_feature_", str);
        return sharedPreferences.contains(zzd) ? zzd : zzd("feature_usage_timestamp_detected_feature_", str);
    }

    @Nullable
    private static zzpm zzj(String str) {
        try {
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
        } catch (NumberFormatException unused) {
            return zzpm.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    public final void zzc() {
        zzpm zzj;
        SharedPreferences sharedPreferences = this.zze;
        Set set = this.zzi;
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        set.clear();
        Set set2 = this.zzj;
        set2.clear();
        this.zzl = 0L;
        String str = zzb;
        if (!str.equals(string) || !this.zzf.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(str2);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            zzf(hashSet);
            sharedPreferences.edit().putString("feature_usage_sdk_version", str).putString("feature_usage_package_name", this.zzf).apply();
            return;
        }
        this.zzl = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long zzh = zzh();
        HashSet hashSet2 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j = sharedPreferences.getLong(str3, 0L);
                if (j != 0 && zzh - j > 1209600000) {
                    hashSet2.add(str3);
                } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                    zzpm zzj2 = zzj(str3.substring(41));
                    if (zzj2 != null) {
                        set2.add(zzj2);
                        set.add(zzj2);
                    }
                } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (zzj = zzj(str3.substring(41))) != null) {
                    set.add(zzj);
                }
            }
        }
        zzf(hashSet2);
        exc0.i(this.zzh);
        exc0.i(this.zzg);
        zzg();
    }

    public final /* synthetic */ void zze() {
        Set set = this.zzi;
        if (set.isEmpty()) {
            return;
        }
        Set set2 = this.zzj;
        long j = true != set2.equals(set) ? TimeUtils.MILLISECONDS_PER_DAY : 172800000L;
        long zzh = zzh();
        long j2 = this.zzl;
        if (j2 == 0 || zzh - j2 >= j) {
            zza.a("Upload the feature usage report.", new Object[0]);
            zzqb zza2 = zzqc.zza();
            zza2.zzb(zzb);
            zza2.zza(this.zzf);
            zzqc zzqcVar = (zzqc) zza2.zzu();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(set);
            zzpv zza3 = zzpw.zza();
            zza3.zzb(arrayList);
            zza3.zza(zzqcVar);
            zzpw zzpwVar = (zzpw) zza3.zzu();
            zzqq zzc2 = zzqr.zzc();
            zzc2.zzm(zzpwVar);
            this.zzd.zzd((zzqr) zzc2.zzu(), 243);
            SharedPreferences sharedPreferences = this.zze;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (!set2.equals(set)) {
                set2.clear();
                set2.addAll(set);
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    String num = Integer.toString(((zzpm) it.next()).zza());
                    String zzi = zzi(num);
                    String zzd = zzd("feature_usage_timestamp_reported_feature_", num);
                    if (!TextUtils.equals(zzi, zzd)) {
                        long j3 = sharedPreferences.getLong(zzi, 0L);
                        edit.remove(zzi);
                        if (j3 != 0) {
                            edit.putLong(zzd, j3);
                        }
                    }
                }
            }
            this.zzl = zzh;
            edit.putLong("feature_usage_last_report_time", zzh).apply();
        }
    }
}
