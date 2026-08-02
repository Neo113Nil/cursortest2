package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.U3;
import defpackage.duf;
import defpackage.ec6;
import defpackage.fc6;
import defpackage.fuf;
import defpackage.joa;
import defpackage.kef;
import defpackage.ljg;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class F5 {
    public static final F5 a;
    public static final /* synthetic */ KProperty[] b;
    public static long c;
    public static String d;
    public static final String e;
    public static final M1 f;
    public static final M1 g;
    public static final M1 h;
    public static final String i;
    public static final Pair j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static volatile boolean n;
    public static volatile long o;
    public static final joa p;
    public static final joa q;
    public static final joa r;
    public static final JSONArray s;

    static {
        kef kefVar = new kef(F5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0);
        fuf fufVar = duf.a;
        b = new KProperty[]{fufVar.property1(kefVar), fufVar.property1(new kef(F5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0)), fufVar.property1(new kef(F5.class, "asyncNetworkInfo", "getAsyncNetworkInfo()Ljava/lang/String;", 0))};
        a = new F5();
        c = -1L;
        e = "F5";
        int i2 = 15;
        f = new M1(i2, new ec6(17), 12);
        g = new M1(i2, new ec6(18), 8);
        h = new M1("", new ec6(19), true, true);
        String str = Build.VERSION.RELEASE;
        str.getClass();
        i = str;
        int i3 = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        j = new Pair("d-api-lev", sb.toString());
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        k = str2;
        String str3 = Build.MODEL;
        str3.getClass();
        l = str3;
        String str4 = Build.HARDWARE;
        str4.getClass();
        m = str4;
        ysa ysaVar = ysa.b;
        p = ypa.a(ysaVar, new ec6(20));
        q = ypa.a(ysaVar, new ec6(15));
        joa a2 = ypa.a(ysaVar, new ec6(16));
        r = a2;
        s = (JSONArray) a2.getValue();
    }

    public static boolean A() {
        return true;
    }

    public static boolean B() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static final int C() {
        Context context = AbstractC3424fj.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(3:9|10|11)|(6:13|14|15|(1:17)|18|19)|22|14|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final D5 D() {
        boolean z;
        String str;
        a.getClass();
        try {
            Context context = AbstractC3424fj.a;
            if (context == null) {
                return new D5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getApplicationEnabledSetting("com.android.vending") >= 2) {
                z = true;
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
                return new D5(str, z);
            }
            z = false;
            str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
            if (str == null) {
            }
            return new D5(str, z);
        } catch (Exception e2) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e2));
            return new D5(null, false);
        }
    }

    public static void E() {
        AbstractC3424fj.g.submit(new defpackage.x(9));
    }

    public static final void F() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            c = availableBytes / 1048576;
        } catch (Exception e2) {
            AbstractC3776t9.a(e2);
        }
    }

    public static void G() {
        AbstractC3424fj.g.submit(new defpackage.x(14));
    }

    public static final void H() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID fromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                fromString.getClass();
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        j2 += storageStatsManager.getFreeBytes(fromString);
                    } catch (Exception e2) {
                        Q2 q2 = new Q2(e2);
                        joa joaVar = AbstractC3286aa.a;
                        AbstractC3286aa.a(q2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        c = j2 / 1048576;
    }

    public static void I() {
        AbstractC3424fj.g.submit(new defpackage.x(13));
    }

    public static final void J() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getFreeBytes(storageUuid);
                } catch (Exception e2) {
                    Q2 q2 = new Q2(e2);
                    joa joaVar = AbstractC3286aa.a;
                    AbstractC3286aa.a(q2);
                }
            }
        }
        c = j2 / 1048576;
    }

    public static void K() {
        AbstractC3424fj.g.submit(new defpackage.x(12));
    }

    public static final void L() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(blockCountLong / 1048576.0f);
            d = sb.toString();
        } catch (Exception e2) {
            AbstractC3776t9.a(e2);
        }
    }

    public static void M() {
        AbstractC3424fj.g.submit(new defpackage.x(10));
    }

    public static final void N() {
        UUID uuid;
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid2 = storageVolume.getUuid();
            if (uuid2 == null) {
                uuid = StorageManager.UUID_DEFAULT;
                uuid.getClass();
            } else {
                try {
                    uuid = UUID.fromString(uuid2);
                    uuid.getClass();
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getTotalBytes(uuid);
                } catch (Exception e2) {
                    Q2 q2 = new Q2(e2);
                    joa joaVar = AbstractC3286aa.a;
                    AbstractC3286aa.a(q2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2 / 1048576);
        d = sb.toString();
    }

    public static void O() {
        AbstractC3424fj.g.submit(new defpackage.x(11));
    }

    public static final void P() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        systemService.getClass();
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(U3.a.k);
        systemService2.getClass();
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        storageVolumes.getClass();
        long j2 = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getTotalBytes(storageUuid);
                } catch (Exception e2) {
                    Q2 q2 = new Q2(e2);
                    joa joaVar = AbstractC3286aa.a;
                    AbstractC3286aa.a(q2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2 / 1048576);
        d = sb.toString();
    }

    public static String a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities == null ? "" : networkCapabilities.hasTransport(0) ? ljg.j(networkInfo.getSubtype(), "0|") : networkCapabilities.hasTransport(1) ? "1" : networkCapabilities.hasTransport(2) ? com.ironsource.Fc.e : networkCapabilities.hasTransport(3) ? "9" : networkCapabilities.hasTransport(4) ? "17" : networkCapabilities.hasTransport(5) ? "10" : networkCapabilities.hasTransport(6) ? "11" : "8";
    }

    public static final int c() {
        Context context = AbstractC3424fj.a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean d() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String lowerCase6;
        String lowerCase7;
        a.getClass();
        try {
            String str = Build.FINGERPRINT;
            str.getClass();
            Locale locale = Locale.ROOT;
            locale.getClass();
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            String str2 = Build.MODEL;
            str2.getClass();
            lowerCase2 = str2.toLowerCase(locale);
            lowerCase2.getClass();
            String str3 = Build.MANUFACTURER;
            str3.getClass();
            lowerCase3 = str3.toLowerCase(locale);
            lowerCase3.getClass();
            String str4 = Build.BRAND;
            str4.getClass();
            lowerCase4 = str4.toLowerCase(locale);
            lowerCase4.getClass();
            String str5 = Build.DEVICE;
            str5.getClass();
            lowerCase5 = str5.toLowerCase(locale);
            lowerCase5.getClass();
            String str6 = Build.HARDWARE;
            str6.getClass();
            lowerCase6 = str6.toLowerCase(locale);
            lowerCase6.getClass();
            String str7 = Build.PRODUCT;
            str7.getClass();
            lowerCase7 = str7.toLowerCase(locale);
            lowerCase7.getClass();
        } catch (Exception unused) {
        }
        if (kotlin.text.c.v(lowerCase, "generic", false) || kotlin.text.c.v(lowerCase, "unknown", false) || StringsKt.J(lowerCase2, "google_sdk", false) || StringsKt.J(lowerCase2, "emu", false) || StringsKt.J(lowerCase2, "Android SDK built for x86", false) || StringsKt.J(lowerCase3, "Genymotion", false) || StringsKt.J(lowerCase7, "sdk", false) || StringsKt.J(lowerCase7, "vbox86p", false) || StringsKt.J(lowerCase7, "emu", false) || lowerCase6.equals("goldfish") || lowerCase6.equals("ranchu") || lowerCase6.equals("vbox86p") || StringsKt.J(lowerCase6, "nox", false)) {
            return true;
        }
        if (kotlin.text.c.v(lowerCase4, "generic", false)) {
            if (kotlin.text.c.v(lowerCase5, "generic", false)) {
                return true;
            }
        }
        return false;
    }

    public static String e() {
        Context context = AbstractC3424fj.a;
        if (context == null || !AbstractC3292ag.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            e2.toString();
        }
        return networkInfo == null ? "" : Build.VERSION.SDK_INT < 28 ? a(networkInfo) : a(connectivityManager, networkInfo);
    }

    public static Pair f() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair("d-airplane-m", "1") : new Pair("d-airplane-m", "0");
    }

    public static final String g() {
        F5 f5 = a;
        f5.getClass();
        String str = (String) h.getValue(f5, b[2]);
        return kotlin.text.c.v(str, "0", false) ? com.ironsource.L6.R0 : kotlin.text.c.v(str, "1", false) ? com.ironsource.Q3.b : "NIL";
    }

    public static Pair h() {
        if (Build.VERSION.SDK_INT >= 31) {
            I();
        } else {
            G();
        }
        long j2 = c;
        if (j2 != -1) {
            return new Pair("d-av-disk", String.valueOf(j2));
        }
        return null;
    }

    public static Pair i() {
        Context context = AbstractC3424fj.a;
        Integer num = null;
        if (context == null) {
            return null;
        }
        if (N3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            num = Integer.valueOf((int) ((r0.getIntExtra("level", -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        return new Pair("d-bat-lev", sb.toString());
    }

    public static Pair j() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair("d-bat-sav", "1") : new Pair("d-bat-sav", "0");
    }

    public static Pair k() {
        String str;
        int i2 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i2 == 16) {
            str = "0";
        } else {
            if (i2 != 32) {
                return null;
            }
            str = "1";
        }
        return new Pair("d-drk-m", str);
    }

    public static Pair l() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair m() {
        ArrayList arrayList = new ArrayList();
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        enabledInputMethodList.getClass();
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            enabledInputMethodSubtypeList.getClass();
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (Intrinsics.c(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    languageTag.getClass();
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    language.getClass();
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        return new Pair("d-key-lang", new JSONArray((Collection) arrayList).toString());
    }

    public static int n() {
        String e2 = e();
        if (kotlin.text.c.v(e2, "0", false)) {
            return 0;
        }
        return kotlin.text.c.v(e2, "1", false) ? 1 : 2;
    }

    public static final String o() {
        a.getClass();
        int n2 = n();
        return n2 != 0 ? n2 != 1 ? "NIL" : com.ironsource.Q3.b : com.ironsource.L6.R0;
    }

    public static HashMap p() {
        boolean enabled = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap hashMap = new HashMap();
        if (enabled) {
            hashMap.put("d-t1", s.toString());
            return hashMap;
        }
        e.getClass();
        return hashMap;
    }

    public static Pair q() {
        if (Build.VERSION.SDK_INT >= 31) {
            O();
        } else {
            M();
        }
        String str = d;
        if (str != null) {
            return new Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return true;
    }

    public static boolean z() {
        return true;
    }

    public final HashMap b(boolean z) {
        int i2;
        HashMap hashMap = new HashMap();
        hashMap.put("os-v", i);
        hashMap.put("d-brand-name", Build.BRAND);
        hashMap.put("d-manufacturer-name", k);
        hashMap.put("d-model-name", l);
        hashMap.put("d-nettype-raw", e());
        String locale = Locale.getDefault().toString();
        locale.getClass();
        hashMap.put("d-localization", locale);
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        hashMap.put("d-language", language);
        hashMap.put("d-devicemachinehw", m);
        if (System.currentTimeMillis() >= o) {
            SignalsConfig signalsConfig = (SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class);
            o = (signalsConfig.getLowMemoryFreq() * 1000) + System.currentTimeMillis();
            xw3.L(L9.c, null, null, new E5(null), 3);
        }
        hashMap.put("d-lowmem", String.valueOf(n));
        try {
            i2 = Runtime.getRuntime().availableProcessors();
        } catch (Exception e2) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e2);
            i2 = 0;
        }
        hashMap.put("d-pcount", String.valueOf(i2));
        hashMap.put("d-emu", String.valueOf(((Boolean) q.getValue()).booleanValue()));
        joa joaVar2 = p;
        hashMap.put("d-ps-disabled", String.valueOf(((D5) joaVar2.getValue()).a));
        String str = ((D5) joaVar2.getValue()).b;
        if (str == null) {
            str = "N/A";
        }
        hashMap.put("d-ps-v", str);
        hashMap.put("d-media-volume", String.valueOf(a(AbstractC3424fj.a, z)));
        return hashMap;
    }

    public static final String a() {
        a.getClass();
        return e();
    }

    public static String a(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type == 0) {
            return fc6.g(type, subtype, "|");
        }
        if (type != 1) {
            return String.valueOf(type);
        }
        return "1";
    }

    public final int a(Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        M1 m1 = g;
        KProperty[] kPropertyArr = b;
        int intValue = ((Number) m1.getValue(this, kPropertyArr[1])).intValue();
        int intValue2 = ((Number) f.getValue(this, kPropertyArr[0])).intValue();
        if (intValue2 <= 0) {
            return 0;
        }
        return (intValue * 100) / intValue2;
    }

    public final HashMap a(boolean z) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(b(z));
            hashMap.putAll(p());
            return hashMap;
        } catch (Exception e2) {
            e2.getMessage();
            return hashMap;
        }
    }

    public static final JSONArray b() {
        a.getClass();
        Context context = AbstractC3424fj.a;
        if (context != null) {
            try {
                SignalsConfig signalsConfig = (SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa a2 = Pa.a(context, "boot_time");
                JSONArray jSONArray = new JSONArray(a2.a.getString("bt", "[]"));
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long valueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (valueOf != null) {
                    if (Math.abs(valueOf.longValue() - currentTimeMillis) <= signalsConfig.getBts().getThreshold() * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(currentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                a2.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e2) {
                joa joaVar = AbstractC3286aa.a;
                AbstractC3776t9.a(e2);
            }
        }
        return new JSONArray();
    }
}
