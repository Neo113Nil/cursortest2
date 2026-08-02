package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.openadsdk.core.settings.ork;
import com.bytedance.sdk.openadsdk.utils.qf;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSupport;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import defpackage.lnb;
import defpackage.vxd;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class DeviceUtils {
    private static int dax = 0;
    private static int gbb = 0;
    private static int hc = 0;
    private static int jr = 0;
    private static int kj = 0;
    public static String pcc = "";
    private static int vy;
    private static volatile long sf = System.currentTimeMillis();
    private static volatile boolean gm = false;
    private static volatile boolean oo = false;
    private static volatile boolean vj = false;
    private static volatile boolean wh = true;
    private static long qf = 0;
    private static String ork = "";
    private static int vh = 0;
    private static final AtomicBoolean tmg = new AtomicBoolean(false);
    private static AtomicBoolean nac = new AtomicBoolean(false);
    private static final Object lu = new Object();
    private static volatile String gpj = null;
    private static volatile String lo = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends BroadcastReceiver {
        private pcc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void sf(Context context) {
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(new pcc(), intentFilter, 2);
                } else {
                    context.registerReceiver(new pcc(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.fum(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.dax = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.wh = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.wh = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.sf = System.currentTimeMillis();
            }
        }
    }

    private static int dax(Context context) {
        int i;
        try {
            i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i == 32) {
            return 1;
        }
        return i == 16 ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fum(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.dax = DeviceUtils.tz(applicationContext);
            }
        });
    }

    public static boolean gm(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    private static String gpj() {
        try {
            if (gpj == null) {
                synchronized (lu) {
                    try {
                        if (gpj == null) {
                            gpj = pcc(String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), com.bytedance.sdk.openadsdk.core.gm.pcc().sf("bt_time", ""), "bt_time");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable unused) {
            gpj = "";
        }
        return gpj;
    }

    private static void jr(Context context) {
        if (context == null || !tmg.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.yt.vj.pcc("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ork = packageInfo.versionName;
                vh = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int kj(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    private static void lo(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            vy = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            hc = streamVolume;
            gbb = (int) ((streamVolume / vy) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    private static String lu() {
        try {
            return lo == null ? com.bytedance.sdk.openadsdk.core.gm.pcc().sf("bt_id", "") : lo;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void nac() {
        if (com.bytedance.sdk.openadsdk.core.lu.oo().mk("bt_id")) {
            try {
                if (lo == null) {
                    synchronized (lu) {
                        try {
                            if (lo == null) {
                                lo = pcc(PglSupport.getBootid(), com.bytedance.sdk.openadsdk.core.gm.pcc().sf("bt_id", ""), "bt_id");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
                lo = "";
            }
        }
    }

    private static int of(Context context) {
        try {
            String str = Build.MANUFACTURER;
            return str.equalsIgnoreCase("XIAOMI") ? Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0 : (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int oo(Context context) {
        if (gm(context)) {
            return 3;
        }
        return sf(context) ? 2 : 1;
    }

    public static String ork() {
        if (TextUtils.isEmpty(pcc)) {
            pcc = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("framework_name", "");
        }
        return pcc;
    }

    public static JSONObject pcc(Context context, boolean z) {
        String ork2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", kj(context));
            sf(jSONObject);
            jSONObject.put("type", oo(context));
            jSONObject.put(L6.F, 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", kun.kj(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.oo.gm());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.oo.sf());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.oo.oo());
            jSONObject.put("screen_scale", rj.wh(context));
            jSONObject.put("density", rj.kj(context));
            jSONObject.put("screen_width", rj.gm(context));
            jSONObject.put("screen_height", rj.vj(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.tmg.gm.wh());
            com.bytedance.sdk.openadsdk.core.settings.vh oo2 = com.bytedance.sdk.openadsdk.core.lu.oo();
            if (oo2.mk("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.hc.gm(context));
            jSONObject.put("rom_version", mk.pcc());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.hc.sf(context));
            jSONObject.put("timezone", kun.tsz());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.hc.sf());
            jSONObject.put("carrier_name", ye.pcc());
            if (z) {
                ork2 = kun.pcc(context);
                jSONObject.put("board", Build.BOARD);
                jSONObject.put("device_city", kun.yt());
                pcc(jSONObject);
            } else {
                ork2 = kun.ork();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(ork2) * 1024));
            jSONObject.put("locale_language", oo());
            jSONObject.put("screen_bright", Math.ceil(vj() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !sf() ? 1 : 0);
            jSONObject.put("cpu_num", ork.sf());
            jSONObject.put("cpu_max_freq", ork.gm());
            jSONObject.put("cpu_min_freq", ork.oo());
            qf.pcc pcc2 = qf.pcc();
            jSONObject.put("battery_remaining_pct", (int) pcc2.sf);
            jSONObject.put("is_charging", pcc2.pcc);
            jSONObject.put("total_space", String.valueOf(kun.sf(context)));
            jSONObject.put("free_space_in", String.valueOf(kun.hc()));
            jSONObject.put("sdcard_size", String.valueOf(kun.gbb()));
            jSONObject.put("rooted", kun.dax());
            jSONObject.put("enable_assisted_clicking", wh());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.tz.pcc(context, "tt_choose_language"));
            jSONObject.put("airplane", vy(context));
            jSONObject.put("darkmode", dax(context));
            jSONObject.put("headset", nac(context));
            jSONObject.put("ringmute", ork(context));
            jSONObject.put("screenscale", lu(context));
            jSONObject.put("volume", kj());
            jSONObject.put("low_power_mode", gpj(context));
            jSONObject.put("enable_draw_feed", kun.lq());
            if (z) {
                kj.pcc(jSONObject, context);
                jSONObject.put("gp_v_name", vj(context));
                jSONObject.put("gp_v_code", wh(context));
            }
            if (oo2.mk("mnc")) {
                jSONObject.put("mnc", ye.gm());
            }
            if (oo2.mk("mcc")) {
                jSONObject.put("mcc", ye.sf());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.pcc.pcc.sf(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.pcc.pcc.pcc());
            String gm2 = com.bytedance.sdk.openadsdk.core.tmg.gm.gm();
            com.bytedance.sdk.openadsdk.core.tmg.gm.oo();
            if (!TextUtils.isEmpty(gm2)) {
                jSONObject.put("sof_chara", gm2);
            }
            String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!sf2.isEmpty()) {
                jSONObject.put("ipv6", sf2);
            }
            jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.fum.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject qf(Context context) {
        return pcc(context, false);
    }

    public static boolean sf() {
        if (SystemClock.elapsedRealtime() - qf >= 20000) {
            qf = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService("power");
                if (powerManager != null) {
                    wh = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return wh;
    }

    public static void tmg(Context context) {
        Context applicationContext;
        if (vj || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                yt(applicationContext);
            } else {
                pcc.sf(applicationContext);
            }
            vj = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int tz(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return of(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void vh() {
        com.bytedance.sdk.openadsdk.core.settings.vh.pcc(new ork.pcc() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void pcc() {
                com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void sf() {
                com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(true);
                DeviceUtils.nac();
            }
        });
        Context pcc2 = com.bytedance.sdk.openadsdk.core.lu.pcc();
        if (pcc2 != null) {
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("cpu_count", ork.pcc());
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("cpu_max_frequency", ork.pcc(ork.pcc()));
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("cpu_min_frequency", ork.sf(ork.pcc()));
            String vh2 = kun.vh();
            if (vh2 != null) {
                com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("total_memory", vh2);
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("total_internal_storage", kun.tmg());
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("free_internal_storage", com.bytedance.sdk.component.utils.nac.pcc());
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("total_sdcard_storage", kun.jr());
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("is_root", kun.nac() ? 1 : 0);
            if (TextUtils.isEmpty(ork())) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    pcc = "unity";
                } catch (ClassNotFoundException unused) {
                    pcc = IronSourceConstants.EVENTS_NATIVE;
                }
                com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("framework_name", pcc);
            }
            tmg();
            lo(pcc2);
            dax = tz(pcc2);
            kj.pcc(pcc2);
            nac();
        }
    }

    public static float vj() {
        int i = -1;
        try {
            Context pcc2 = com.bytedance.sdk.openadsdk.core.lu.pcc();
            if (pcc2 != null) {
                i = Settings.System.getInt(pcc2.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return vxd.b(i, 255.0f, 10.0f) / 10.0f;
    }

    public static int vy(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int wh() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    private static void yt(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.fum(applicationContext);
            }
        });
    }

    public static int qf() {
        return hc;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.hc.vy> pcc = new CopyOnWriteArrayList<>();

        public static void pcc(com.bytedance.sdk.openadsdk.hc.vy vyVar) {
            if (vyVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.hc.vy> copyOnWriteArrayList = pcc;
                if (copyOnWriteArrayList.contains(vyVar)) {
                    return;
                }
                copyOnWriteArrayList.add(vyVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void sf(Context context) {
            if (DeviceUtils.oo || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.vy.pcc());
                boolean unused = DeviceUtils.oo = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.jr = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.hc = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!pcc.isEmpty()) {
                        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.hc.vy> it = AudioInfoReceiver.pcc.iterator();
                                while (it.hasNext()) {
                                    it.next().gm(DeviceUtils.hc);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.vy != 0) {
                        int unused3 = DeviceUtils.gbb = (int) ((DeviceUtils.hc / DeviceUtils.vy) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void sf(com.bytedance.sdk.openadsdk.hc.vy vyVar) {
            if (vyVar == null) {
                return;
            }
            pcc.remove(vyVar);
        }
    }

    public static int vy() {
        return vy;
    }

    public static String oo() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    private static void gm(JSONObject jSONObject) throws JSONException {
        jSONObject.put(L6.B, Build.MODEL);
        com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(jSONObject);
    }

    private static float lu(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int gm() {
        return com.bytedance.sdk.openadsdk.core.gm.pcc().sf("limit_ad_track", -1);
    }

    public static int ork(Context context) {
        return kj;
    }

    public static int kj() {
        return gbb;
    }

    public static int wh(Context context) {
        if (!tmg.get()) {
            jr(context);
        }
        return vh;
    }

    public static void tmg() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                kj = 1;
            } else if (ringerMode == 1) {
                kj = 2;
            } else {
                kj = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static String vj(Context context) {
        if (!tmg.get()) {
            jr(context);
        }
        return ork;
    }

    public static boolean sf(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static void sf(JSONObject jSONObject) throws JSONException {
        gm(jSONObject);
    }

    private static int gpj(Context context) {
        return dax;
    }

    private static int nac(Context context) {
        return jr;
    }

    public static void vh(Context context) {
        AudioInfoReceiver.sf(context);
    }

    public static void pcc(Context context) {
        if (gm) {
            return;
        }
        try {
            sf sfVar = new sf();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(sfVar, intentFilter);
            gm = true;
        } catch (Throwable unused) {
        }
    }

    public static long pcc() {
        return sf;
    }

    public static void pcc(JSONObject jSONObject) {
        try {
            com.bytedance.sdk.openadsdk.core.settings.vh oo2 = com.bytedance.sdk.openadsdk.core.lu.oo();
            if (oo2.mk("boot")) {
                jSONObject.put("bt_time", gpj());
            } else {
                jSONObject.put("bt_time", "not_allowed");
                com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("bt_time");
            }
            if (oo2.mk("bt_id")) {
                jSONObject.put("bt_id", lu());
            } else {
                jSONObject.put("bt_id", "not_allowed");
                com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("bt_id");
            }
        } catch (Throwable unused) {
        }
    }

    private static String pcc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split = str2.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            int jsj = com.bytedance.sdk.openadsdk.core.settings.vh.sf().jsj();
            if (jsj != 1) {
                if (str.equals(split[0]) || ("bt_time".equals(str3) && Math.abs(Long.parseLong(str) - Long.parseLong(split[0])) < 1000)) {
                    return str2;
                }
                if (split.length < jsj) {
                    str = lnb.o(str, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, str2);
                } else {
                    int lastIndexOf = str2.lastIndexOf(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    if (lastIndexOf != -1) {
                        str = lnb.o(str, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, str2.substring(0, lastIndexOf));
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc().pcc(str3, str);
        return str;
    }
}
