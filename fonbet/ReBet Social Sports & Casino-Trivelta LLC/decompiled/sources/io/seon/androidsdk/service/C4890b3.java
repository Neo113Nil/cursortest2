package io.seon.androidsdk.service;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.EventKeys;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.seon.androidsdk.service.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4890b3 extends AbstractC4950j {

    /* renamed from: B, reason: collision with root package name */
    public static final L4 f53239B;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f53240j = {"android_version", "is_rooted", "kernel_arch", "kernel_name", "kernel_version", "usb_cable_state", "usb_debugging_state", "bootloader_state", "developer_options_state", EventKeys.TIMESTAMP};

    /* renamed from: q, reason: collision with root package name */
    public static final L4 f53241q;

    /* renamed from: r, reason: collision with root package name */
    public static final L4 f53242r;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f53243e;

    /* renamed from: g, reason: collision with root package name */
    public Context f53244g;

    /* renamed from: n, reason: collision with root package name */
    public String f53245n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f53246o = false;

    /* renamed from: p, reason: collision with root package name */
    public PackageManager f53247p = null;

    static {
        Lh.a.d(C4890b3.class);
        f53241q = new L4(30000L);
        f53242r = new L4(30000L);
        f53239B = new L4(5000L);
    }

    public static List C() {
        return Arrays.asList(null, "com.android.vending", "com.facebook.system");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        f53241q.a(new W2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s() {
        return (String) f53241q.a(new W2(this));
    }

    public final ArrayList A() {
        ArrayList arrayList = new ArrayList();
        try {
            N1 n12 = new N1();
            for (String str : n12.keySet()) {
                AtomicInteger atomicInteger = V.f53166a;
                try {
                    Class.forName(str);
                    arrayList.add((String) n12.get(str));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return arrayList;
    }

    public final OSProbe$OSEnum B() {
        try {
            return Settings.Global.getInt(this.f53244g.getContentResolver(), "development_settings_enabled", 0) == 1 ? OSProbe$OSEnum.DEV_OPTIONS_ENABLED : OSProbe$OSEnum.DEV_OPTIONS_DISABLED;
        } catch (Exception unused) {
            return OSProbe$OSEnum.UNKNOWN;
        }
    }

    public final List D() {
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = this.f53244g.getPackageManager();
            String[] strArr = packageManager.getPackageInfo(this.f53244g.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    int i10 = packageManager.checkPermission(str, this.f53244g.getPackageName()) == 0 ? 1 : 0;
                    int lastIndexOf = str.lastIndexOf(46);
                    if (lastIndexOf != -1 && lastIndexOf < str.length() - 1) {
                        str = str.substring(lastIndexOf + 1);
                    }
                    arrayList.add(String.format(Locale.ENGLISH, "%s: %d", str, Integer.valueOf(i10)));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String E() {
        try {
            Process exec = Runtime.getRuntime().exec("uname");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            char[] cArr = new char[4096];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                sb2.append(cArr, 0, read);
            }
            bufferedReader.close();
            try {
                exec.waitFor();
            } catch (Exception unused) {
            }
            return sb2.toString().replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "");
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String F() {
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("uname -r").getInputStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
            str = sb2.toString();
        } catch (Exception unused) {
            str = "Unknown";
        }
        if (str != null && str != "Unknown") {
            return str;
        }
        try {
            return System.getProperty("os.version");
        } catch (Exception unused2) {
            return "Unknown";
        }
    }

    public final C4977m2 G() {
        try {
            C4977m2 c4977m2 = new C4977m2();
            c4977m2.f53423a = new File("/proc/self/mounts").lastModified();
            c4977m2.f53424b = new File("/proc/self/mountinfo").lastModified();
            c4977m2.f53425c = new File("/proc/self/mountstats").lastModified();
            return c4977m2;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String H() {
        try {
            return this.f53243e.getString("nativeUnsafe", "");
        } catch (Exception unused) {
            return null;
        }
    }

    public final String I() {
        return System.getProperty("os.arch");
    }

    public final Map J() {
        try {
            return u(this.f53244g.getPackageName()).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Integer K() {
        try {
            return new PageSizeUtil(this.f53244g).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String L() {
        if (!this.f53246o) {
            try {
                Integer K10 = K();
                if (K10 != null && K10.intValue() <= 4096) {
                    if (Objects.equals(H(), "1")) {
                        x(V.t() > 1 ? "PARALLEL_RUN_DETECTED" : "NATIVE_CRASH_BIT_SET");
                    } else {
                        SharedPreferences.Editor edit = this.f53243e.edit();
                        edit.putString("nativeUnsafe", "1");
                        edit.commit();
                        Context context = this.f53244g;
                        if (!NativeDetector.f53086a) {
                            C8.c.a(context, "natdet");
                            NativeDetector.f53086a = true;
                        }
                        String glp = NativeDetector.glp();
                        edit.putString("nativeUnsafe", "0");
                        edit.apply();
                        x(glp);
                    }
                }
                x("UNSUPPORTED_PAGE_SIZE");
            } catch (Exception unused) {
            }
        }
        return this.f53245n;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[Catch: Exception -> 0x007d, TRY_ENTER, TryCatch #1 {Exception -> 0x007d, blocks: (B:3:0x0001, B:11:0x0032, B:12:0x0036, B:14:0x003c, B:17:0x004a, B:20:0x004f, B:23:0x0055, B:26:0x005d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List M() {
        ArrayList arrayList;
        List<ApplicationInfo> list;
        C5009q2 u10;
        int i10;
        PackageManager.ApplicationInfoFlags of2;
        try {
            arrayList = new ArrayList();
            try {
                i10 = Build.VERSION.SDK_INT;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        if (i10 < 30 || V.k(this.f53244g, "android.permission.QUERY_ALL_PACKAGES")) {
            if (i10 >= 33) {
                PackageManager packageManager = this.f53247p;
                of2 = PackageManager.ApplicationInfoFlags.of(0L);
                list = packageManager.getInstalledApplications(of2);
            } else {
                list = this.f53247p.getInstalledApplications(0);
            }
            if (list != null) {
                for (ApplicationInfo applicationInfo : list) {
                    String str = applicationInfo.packageName;
                    int i11 = applicationInfo.flags;
                    if ((i11 & 1) == 0 && (i11 & 128) == 0 && (u10 = u(str)) != null && u10.f53472d.booleanValue()) {
                        C4993o2 c4993o2 = new C4993o2(str, this.f53247p.getApplicationLabel(applicationInfo).toString());
                        c4993o2.f53456c = u10;
                        c4993o2.f53457d = Long.valueOf(w(str));
                        arrayList.add(c4993o2);
                    }
                }
                return arrayList;
            }
            return null;
        }
        list = null;
        if (list != null) {
        }
        return null;
    }

    public final OSProbe$OSEnum N() {
        try {
            return this.f53244g.registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE")).getExtras().getBoolean("connected") ? OSProbe$OSEnum.USB_CONNECTED : OSProbe$OSEnum.USB_DISCONNECTED;
        } catch (Exception e10) {
            V.j("USBStateError", e10);
            return OSProbe$OSEnum.UNKNOWN;
        }
    }

    public final OSProbe$OSEnum O() {
        try {
            return Settings.Global.getInt(this.f53244g.getContentResolver(), "adb_enabled", 0) == 1 ? OSProbe$OSEnum.USB_DEBUGGING_ENABLED : OSProbe$OSEnum.USB_DEBUGGING_DISABLED;
        } catch (Exception unused) {
            return OSProbe$OSEnum.UNKNOWN;
        }
    }

    public final long P() {
        return System.currentTimeMillis();
    }

    public final String Q() {
        return V.n(this.f53244g, "ro.boot.vbmeta.digest");
    }

    public final Boolean R() {
        try {
            return Boolean.valueOf(Debug.isDebuggerConnected());
        } catch (Exception e10) {
            V.j("DebCon", e10);
            return Boolean.FALSE;
        }
    }

    public final Boolean S() {
        return Boolean.valueOf(Objects.equals(V.n(this.f53244g, "ro.allow.mock.location"), "1"));
    }

    public final Boolean T() {
        boolean z10 = false;
        C4977m2 c4977m2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                c4977m2 = G();
                long j10 = c4977m2.f53423a;
                if (j10 == c4977m2.f53424b && j10 == c4977m2.f53425c) {
                    return Boolean.FALSE;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        long j11 = c4977m2.f53423a;
        long j12 = j11 - c4977m2.f53425c;
        long j13 = j11 - c4977m2.f53424b;
        if (j12 == 0 && j13 > 100) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53244g = c4878a.a();
        this.f53368b = c4878a;
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.D2
            @Override // java.lang.Runnable
            public final void run() {
                C4890b3.this.p();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.O2
                @Override // java.lang.Runnable
                public final void run() {
                    C4890b3.this.q();
                }
            }.run();
        } catch (Throwable unused2) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.U2
                @Override // java.lang.Runnable
                public final void run() {
                    C4890b3.this.r();
                }
            }.run();
        } catch (Throwable unused3) {
        }
        try {
            this.f53243e = this.f53244g.getSharedPreferences("seonLocalPreferences", 0);
        } catch (Exception unused4) {
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("is_safetynetfix_loaded", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.z2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.o();
            }
        }));
        hashMap.put("is_location_mocking_enabled", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.J2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.S();
            }
        }));
        hashMap.put("is_oem_unlock_allowed", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.K2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.l();
            }
        }));
        hashMap.put("ld_preload_string", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.L2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.L();
            }
        }));
        String str = (String) AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.M2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.H();
            }
        });
        if (Objects.equals(str, "1")) {
            hashMap.put("native_crash_bit", str);
        }
        hashMap.put("vbmeta_digest", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.N2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.Q();
            }
        }));
        hashMap.put("is_debugger_connected", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.P2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.R();
            }
        }));
        hashMap.put("is_magisk_by_mount", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Q2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.T();
            }
        }));
        hashMap.put("mount_files_modify_info", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.R2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.G();
            }
        }));
        hashMap.put("running_fingerprints", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.S2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Integer.valueOf(V.t());
            }
        }));
        hashMap.put("is_rooted_rootbeer", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.A2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(C4890b3.this.n());
            }
        }));
        hashMap.put("is_rooted_native", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.B2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(C4890b3.this.k());
            }
        }));
        hashMap.put("permissions", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.C2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.D();
            }
        }));
        hashMap.put("wrappers", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.E2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.A();
            }
        }));
        hashMap.put("page_size", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.F2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.K();
            }
        }));
        final long currentTimeMillis = System.currentTimeMillis();
        hashMap.put("ns_apps", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.G2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.M();
            }
        }));
        hashMap.put("ns_perf", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.H2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                String valueOf;
                valueOf = String.valueOf(System.currentTimeMillis() - currentTimeMillis);
                return valueOf;
            }
        }));
        hashMap.put("src_inf", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.I2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.J();
            }
        }));
        return hashMap;
    }

    public final boolean k() {
        try {
            String L10 = L();
            if (L10 == null || L10.isEmpty()) {
                return false;
            }
            if (!L10.contains("/system/bin/appwidget") && !L10.contains("magisk")) {
                if (!L10.contains("zygisk")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final Boolean l() {
        return Boolean.valueOf(Objects.equals(V.n(this.f53244g, "sys.oem_unlock_allowed"), "1"));
    }

    public final boolean m() {
        return n() || k();
    }

    public final boolean n() {
        final com.scottyab.rootbeer.b bVar = new com.scottyab.rootbeer.b(this.f53244g);
        bVar.q(false);
        return ((Boolean) f53239B.a(new N4() { // from class: io.seon.androidsdk.service.T2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(com.scottyab.rootbeer.b.this.n());
            }
        })).booleanValue();
    }

    public final Boolean o() {
        String[] strArr = {"ro.is_ever_orange", "ro.boot.warranty_bit"};
        for (int i10 = 0; i10 < 2; i10++) {
            String n10 = V.n(this.f53244g, strArr[i10]);
            if (n10 == null || n10.length() == 0) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public final /* synthetic */ void q() {
        f53242r.a(new V2(this));
    }

    public final /* synthetic */ void r() {
        this.f53247p = this.f53244g.getPackageManager();
    }

    public final /* synthetic */ String t() {
        return (String) f53242r.a(new V2(this));
    }

    public final C5009q2 u(String str) {
        String str2;
        String str3;
        String str4;
        InstallSourceInfo installSourceInfo;
        boolean z10;
        try {
            List C10 = C();
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    installSourceInfo = this.f53247p.getInstallSourceInfo(str);
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        str3 = installSourceInfo.getInitiatingPackageName();
                    } catch (Exception unused) {
                        str3 = null;
                    }
                } catch (Exception unused2) {
                    str2 = null;
                    str3 = null;
                }
                try {
                    str4 = installSourceInfo.getOriginatingPackageName();
                } catch (Exception unused3) {
                    str4 = null;
                    if (C10.contains(str2)) {
                        z10 = false;
                        return new C5009q2(str2, str3, str4, Boolean.valueOf(z10));
                    }
                    z10 = true;
                    return new C5009q2(str2, str3, str4, Boolean.valueOf(z10));
                }
            } else {
                str2 = this.f53247p.getInstallerPackageName(str);
                str4 = null;
                str3 = null;
            }
            if (C10.contains(str2) && C10.contains(str3) && C10.contains(str4)) {
                z10 = false;
                return new C5009q2(str2, str3, str4, Boolean.valueOf(z10));
            }
            z10 = true;
            return new C5009q2(str2, str3, str4, Boolean.valueOf(z10));
        } catch (Throwable unused4) {
            return null;
        }
    }

    public final long w(String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        String[] strArr = {"android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.NFC", "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_EXTERNAL_STORAGE"};
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.f53247p;
                of2 = PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(str, of2);
            } else {
                packageInfo = this.f53247p.getPackageInfo(str, 4096);
            }
            String[] strArr2 = packageInfo.requestedPermissions;
            if (strArr2 != null && strArr2.length != 0) {
                HashSet hashSet = new HashSet(Arrays.asList(strArr2));
                long j10 = 0;
                for (int i10 = 0; i10 < 13; i10++) {
                    if (hashSet.contains(strArr[i10])) {
                        j10 |= 1 << i10;
                    }
                }
                return j10;
            }
        } catch (Throwable unused) {
        }
        return 0L;
    }

    public final void x(String str) {
        this.f53245n = str;
        this.f53246o = true;
    }

    public final String y() {
        String str = Build.VERSION.RELEASE;
        return Build.VERSION.SDK_INT + " (" + str + ")";
    }

    public final OSProbe$OSEnum z() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ro.boot.vbmeta.device_state", new String[]{"unlocked"});
            hashMap.put("vendor.boot.vbmeta.device_state", new String[]{"unlocked"});
            hashMap.put("ro.boot.verifiedbootstate", new String[]{"orange", "yellow"});
            hashMap.put("ro.boot.flash.locked", new String[]{"0"});
            hashMap.put("ro.vendor.boot.warranty_bit", new String[]{"1"});
            hashMap.put("ro.boot.warranty_bit", new String[]{"1"});
            hashMap.put("ro.warranty_bit", new String[]{"1"});
            hashMap.put("ro.vendor.warranty_bit", new String[]{"1"});
            hashMap.put("ro.boot.veritymode", new String[]{"disabled"});
            for (String str : hashMap.keySet()) {
                String[] strArr = (String[]) hashMap.get(str);
                Objects.requireNonNull(strArr);
                for (String str2 : strArr) {
                    String n10 = V.n(this.f53244g, str);
                    if (n10 == null) {
                        break;
                    }
                    if (n10.trim().equalsIgnoreCase(str2)) {
                        return OSProbe$OSEnum.BOOTLOADER_STATE_UNLOCKED;
                    }
                }
            }
            return OSProbe$OSEnum.BOOTLOADER_STATE_LOCKED;
        } catch (Exception e10) {
            V.j("BTL", e10);
            return OSProbe$OSEnum.UNKNOWN;
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        this.f53246o = false;
        HashMap hashMap = new HashMap();
        hashMap.put("android_version", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.X2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.y();
            }
        }));
        hashMap.put("is_rooted", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Y2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(C4890b3.this.m());
            }
        }));
        hashMap.put("kernel_arch", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Z2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.I();
            }
        }));
        hashMap.put("kernel_name", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.a3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                String s10;
                s10 = C4890b3.this.s();
                return s10;
            }
        }));
        hashMap.put("kernel_version", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.t2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                String t10;
                t10 = C4890b3.this.t();
                return t10;
            }
        }));
        hashMap.put("usb_cable_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.u2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.N();
            }
        }));
        hashMap.put("usb_debugging_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.v2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.O();
            }
        }));
        hashMap.put("bootloader_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.w2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.z();
            }
        }));
        hashMap.put("developer_options_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.x2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4890b3.this.B();
            }
        }));
        hashMap.put(EventKeys.TIMESTAMP, AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.y2
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Long.valueOf(C4890b3.this.P());
            }
        }));
        return hashMap;
    }
}
