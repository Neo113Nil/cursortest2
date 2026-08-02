package io.seon.androidsdk.service;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: io.seon.androidsdk.service.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4938h3 {

    /* renamed from: f, reason: collision with root package name */
    public static PackageManager f53321f;

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f53322g = {"cpu_type", "kernel_arch", "battery_voltage", "battery_temperature", "kernel_version", "wifi_ssid", "is_tablet", "input_device_data", "battery_total_capacity", "cpu_count", "device_id"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f53323a;

    /* renamed from: c, reason: collision with root package name */
    public String f53325c;

    /* renamed from: e, reason: collision with root package name */
    public final Map f53327e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f53326d = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final C4954j3 f53324b = new C4986n3().a();

    static {
        Lh.a.d(C4938h3.class);
    }

    public C4938h3(Context context, HashMap hashMap) {
        this.f53323a = context;
        this.f53327e = hashMap;
    }

    public static C4938h3 a(Context context, JSONObject jSONObject) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        try {
            f53321f = context.getPackageManager();
            HashMap hashMap = new HashMap();
            String[] strArr = f53322g;
            for (int i10 = 0; i10 < 11; i10++) {
                String str = strArr[i10];
                if (jSONObject.has(str) && !hashMap.containsKey(str)) {
                    hashMap.put(str, jSONObject.get(str));
                }
            }
            return new C4938h3(context.getApplicationContext(), hashMap);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b() {
        try {
            int round = (int) Math.round(((Double) this.f53327e.get(EmulatorDetector$PayloadProps.BATTERY_CAPACITY.toString())).doubleValue());
            String str = (String) this.f53327e.get(EmulatorDetector$PayloadProps.DEVICE_ID.toString());
            int intValue = ((Integer) this.f53327e.get(EmulatorDetector$PayloadProps.CPU_COUNT.toString())).intValue();
            if (round == 1000) {
                if (str != null && str.length() < 64) {
                    this.f53326d.add("compound emu trigger - device id: ".concat(str));
                } else if (intValue == 1) {
                    this.f53326d.add("compound emu trigger - cpu count: 1");
                } else {
                    f();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void c(InterfaceC4922f3 interfaceC4922f3) {
        String str = Build.PRODUCT;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.DISPLAY;
        String str6 = Build.MODEL;
        String str7 = Build.HARDWARE;
        String str8 = Build.BOARD;
        String str9 = Build.SERIAL;
        String str10 = Build.HOST;
        String str11 = Build.BOOTLOADER;
        Build.getRadioVersion();
        String str12 = Build.FINGERPRINT;
        boolean e10 = e();
        if (interfaceC4922f3 != null) {
            interfaceC4922f3.a(e10, this.f53326d, this.f53325c);
        }
    }

    public final boolean d(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    String str2 = strArr[i10];
                    if (str2 == null && str == null) {
                        this.f53326d.add("Build prop: null filter: null");
                        return true;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!str2.isEmpty()) {
                        Locale locale = Locale.ENGLISH;
                        if (str.toLowerCase(locale).contains(str2.toLowerCase(locale))) {
                            this.f53326d.add("Build prop: " + str + " filter: " + str2);
                            return true;
                        }
                    } else if (str.equalsIgnoreCase(str2)) {
                        this.f53326d.add("Build prop: empty filter: empty");
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r12.f53325c = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        boolean g10 = g() | h();
        String[] strArr = {"BlueStacks", "Genymotion", "Droid4X", "Windroy", "LDPlayer", "Andy", "MEMU", "MUMU", "QEMU", "Titan_Engine", "NOX"};
        try {
            Iterator it = this.f53326d.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                for (int i10 = 0; i10 < 11; i10++) {
                    String str2 = strArr[i10];
                    if (str.toLowerCase().contains(str2.toLowerCase())) {
                        break loop0;
                    }
                }
            }
        } catch (Exception unused) {
        }
        b();
        return g10;
    }

    public final boolean f() {
        try {
            int[] iArr = {17, 19, 18};
            int[] iArr2 = {13, 12, 6};
            ArrayList arrayList = new ArrayList();
            SensorManager sensorManager = (SensorManager) this.f53323a.getSystemService("sensor");
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (sensorManager.getDefaultSensor(i11) == null) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr2[i12];
                if (sensorManager.getDefaultSensor(i13) != null && arrayList.size() > 2) {
                    this.f53326d.add("compound emu trigger - sensors missing: " + TextUtils.join(", ", arrayList) + " has sensor: " + i13);
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:0|1|(2:2|3)|4|(3:142|(5:145|146|(2:148|(2:152|153)(2:150|151))|154|143)|155)|6|7|8|9|10|(33:12|(1:14)|15|16|(1:137)(1:20)|21|(1:23)(2:126|(2:127|(2:129|(1:132)(1:131))(1:136)))|24|25|26|27|(1:124)(1:31)|32|(1:123)(1:36)|37|(1:(2:39|(2:42|43)(1:41))(4:113|114|(2:116|(2:119|120)(1:118))|121))|44|45|46|47|48|(3:50|(2:52|(3:55|56|57)(1:54))|109)|110|58|(7:61|62|63|64|(3:69|70|71)|72|59)|77|78|(1:80)(1:107)|81|(3:87|88|(1:90)(3:91|(4:93|(3:96|(3:98|99|100)(1:102)|94)|103|104)|105))|83|84|85)|140|(0)|15|16|(1:18)|137|21|(0)(0)|24|25|26|27|(1:29)|124|32|(1:34)|123|37|(2:(0)(0)|41)|44|45|46|47|48|(0)|110|58|(1:59)|77|78|(0)(0)|81|(0)|83|84|85|(1:(16:122|46|47|48|(0)|110|58|(1:59)|77|78|(0)(0)|81|(0)|83|84|85))) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        r17.f53326d.add("CPU type: " + r3 + " Filter: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b2, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ed A[Catch: Exception -> 0x0257, TryCatch #2 {Exception -> 0x0257, blocks: (B:27:0x01b9, B:29:0x01bf, B:31:0x01c5, B:32:0x01cd, B:34:0x01d5, B:36:0x01db, B:37:0x01e3, B:39:0x01ed, B:43:0x01ff, B:44:0x024f, B:41:0x0219, B:114:0x021c, B:116:0x0224, B:120:0x0236), top: B:26:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0261 A[Catch: Exception -> 0x0294, TryCatch #5 {Exception -> 0x0294, blocks: (B:48:0x0259, B:50:0x0261, B:52:0x0271, B:56:0x0279), top: B:47:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0315 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        String str;
        Class<String> cls;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        HashMap hashMap;
        boolean z14;
        String str2;
        int length;
        int i11;
        String str3;
        ArrayList arrayList;
        String str4;
        Class<String> cls2 = String.class;
        try {
            Class<?> loadClass = this.f53323a.getApplicationContext().getClassLoader().loadClass("android.os.SystemProperties");
            str = (String) loadClass.getMethod("get", cls2).invoke(loadClass, "ro.build.flavor");
        } catch (Exception unused) {
            str = null;
        }
        boolean d10 = d(str, this.f53324b.f53393u) | d(Build.FINGERPRINT, this.f53324b.f53381i) | d(Build.MODEL, this.f53324b.f53382j) | d(Build.DEVICE, this.f53324b.f53383k) | d(Build.MANUFACTURER, this.f53324b.f53384l) | d(Build.DISPLAY, this.f53324b.f53385m);
        String str5 = Build.HARDWARE;
        boolean d11 = d10 | d(str5, this.f53324b.f53386n);
        String str6 = Build.PRODUCT;
        boolean d12 = d11 | d(str6, this.f53324b.f53387o) | d(Build.BOARD, this.f53324b.f53388p) | d(str5, this.f53324b.f53386n) | d(str6, this.f53324b.f53387o) | d(Build.HOST, this.f53324b.f53390r) | d(Build.BRAND, this.f53324b.f53392t);
        SensorManager sensorManager = (SensorManager) this.f53323a.getSystemService("sensor");
        if (sensorManager != null) {
            loop7: for (Sensor sensor : sensorManager.getSensorList(-1)) {
                String str7 = sensor.getVendor() + " " + sensor.getName();
                String[] strArr = this.f53324b.f53397y;
                int length2 = strArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    String str8 = strArr[i12];
                    Locale locale = Locale.ENGLISH;
                    cls = cls2;
                    if (str7.toLowerCase(locale).contains(str8.toLowerCase(locale))) {
                        this.f53326d.add("Sensor name: " + str7 + " filter: " + str8);
                        z10 = true;
                        break loop7;
                    }
                    i12++;
                    cls2 = cls;
                }
            }
        }
        cls = cls2;
        z10 = false;
        boolean z15 = z10 | d12;
        if (this.f53327e.containsKey("is_tablet")) {
            z11 = ((Boolean) this.f53327e.get("is_tablet")).booleanValue();
            if (!z11) {
                z15 |= d(Build.getRadioVersion(), this.f53324b.f53391s);
            }
            Map map = this.f53327e;
            str4 = (String) ((map == null && map.containsKey("cpu_type")) ? this.f53327e.get("cpu_type") : null);
            if (str4 == null) {
                int i13 = 0;
                while (true) {
                    String[] strArr2 = this.f53324b.f53394v;
                    if (i13 >= strArr2.length) {
                        break;
                    }
                    String str9 = strArr2[i13];
                    Locale locale2 = Locale.ENGLISH;
                    String lowerCase = str9.toLowerCase(locale2);
                    if (str4.toLowerCase(locale2).contains(lowerCase.toLowerCase(locale2))) {
                        break;
                    }
                    i13++;
                }
            }
            boolean z16 = false;
            boolean z17 = z16 | z15;
            Map map2 = this.f53327e;
            String str10 = (String) ((map2 == null && map2.containsKey("kernel_arch")) ? this.f53327e.get("kernel_arch") : null);
            Map map3 = this.f53327e;
            String str11 = (String) ((map3 == null && map3.containsKey("kernel_version")) ? this.f53327e.get("kernel_version") : null);
            String[] strArr3 = this.f53324b.f53395w;
            length = strArr3.length;
            i11 = 0;
            while (true) {
                if (i11 >= length) {
                    String str12 = strArr3[i11];
                    Locale locale3 = Locale.ENGLISH;
                    if (str10.toLowerCase(locale3).contains(str12.toLowerCase(locale3))) {
                        str3 = "Kernel arch: " + str10 + " filter: " + str12;
                        arrayList = this.f53326d;
                        break;
                    }
                    i11++;
                } else {
                    for (String str13 : this.f53324b.f53396x) {
                        Locale locale4 = Locale.ENGLISH;
                        if (str11.toLowerCase(locale4).contains(str13.toLowerCase(locale4))) {
                            str3 = "Kernel version: " + str11 + " filter: " + str13;
                            arrayList = this.f53326d;
                        }
                    }
                }
            }
            arrayList.add(str3);
            boolean z18 = true;
            boolean z19 = z17 | z18;
            if (this.f53327e.containsKey("wifi_ssid")) {
                String str14 = (String) this.f53327e.get("wifi_ssid");
                for (String str15 : this.f53324b.f53380h) {
                    if (str15.equalsIgnoreCase(str14)) {
                        this.f53326d.add("SSID: " + str14);
                        z12 = true;
                        break;
                    }
                }
            }
            z12 = false;
            boolean z20 = z12 | z19;
            i10 = 0;
            for (Map.Entry entry : this.f53324b.f53377e.entrySet()) {
                Context context = this.f53323a;
                String str16 = (String) entry.getKey();
                try {
                    Class<?> loadClass2 = context.getApplicationContext().getClassLoader().loadClass("android.os.SystemProperties");
                    str2 = (String) loadClass2.getMethod("get", cls).invoke(loadClass2, str16);
                } catch (Exception unused2) {
                    str2 = null;
                }
                if (entry.getValue() != null && str2.contains((CharSequence) entry.getValue())) {
                    i10++;
                }
            }
            if (i10 >= this.f53324b.f53398z) {
                this.f53326d.add("Qemu props count: " + i10);
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z21 = z20 | z13;
            hashMap = (HashMap) this.f53327e.get("input_device_data");
            if (hashMap != null) {
                try {
                    if (!hashMap.isEmpty()) {
                        loop3: for (String str17 : this.f53324b.f53373a) {
                            Iterator it = hashMap.keySet().iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).contains(str17)) {
                                    this.f53326d.add("Input device: " + hashMap + " Filter: " + str17);
                                    z14 = true;
                                    break loop3;
                                }
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
            z14 = false;
            return z21 | z14;
        }
        z11 = false;
        if (!z11) {
        }
        Map map4 = this.f53327e;
        str4 = (String) ((map4 == null && map4.containsKey("cpu_type")) ? this.f53327e.get("cpu_type") : null);
        if (str4 == null) {
        }
        boolean z162 = false;
        boolean z172 = z162 | z15;
        Map map22 = this.f53327e;
        String str102 = (String) ((map22 == null && map22.containsKey("kernel_arch")) ? this.f53327e.get("kernel_arch") : null);
        Map map32 = this.f53327e;
        String str112 = (String) ((map32 == null && map32.containsKey("kernel_version")) ? this.f53327e.get("kernel_version") : null);
        String[] strArr32 = this.f53324b.f53395w;
        length = strArr32.length;
        i11 = 0;
        while (true) {
            if (i11 >= length) {
            }
            i11++;
        }
        arrayList.add(str3);
        boolean z182 = true;
        boolean z192 = z172 | z182;
        if (this.f53327e.containsKey("wifi_ssid")) {
        }
        z12 = false;
        boolean z202 = z12 | z192;
        i10 = 0;
        while (r3.hasNext()) {
        }
        if (i10 >= this.f53324b.f53398z) {
        }
        boolean z212 = z202 | z13;
        hashMap = (HashMap) this.f53327e.get("input_device_data");
        if (hashMap != null) {
        }
        z14 = false;
        return z212 | z14;
        z182 = false;
        boolean z1922 = z172 | z182;
        if (this.f53327e.containsKey("wifi_ssid")) {
        }
        z12 = false;
        boolean z2022 = z12 | z1922;
        i10 = 0;
        while (r3.hasNext()) {
        }
        if (i10 >= this.f53324b.f53398z) {
        }
        boolean z2122 = z2022 | z13;
        hashMap = (HashMap) this.f53327e.get("input_device_data");
        if (hashMap != null) {
        }
        z14 = false;
        return z2122 | z14;
    }

    public final boolean h() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        int parseInt;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        Throwable th2;
        ActivityManager activityManager;
        String[] strArr;
        List<ApplicationInfo> installedApplications;
        PackageManager.ApplicationInfoFlags of2;
        File file;
        String str2;
        String str3 = "/proc/";
        HashMap hashMap = this.f53324b.f53375c;
        for (String str4 : hashMap.keySet()) {
            try {
                file = new File(str4);
                str2 = (String) hashMap.get(str4);
            } catch (Exception unused) {
            }
            if (file.exists()) {
                this.f53326d.add("File: " + str4 + " Engine: " + str2);
                if (!Objects.equals(str2, "UNKNOWN")) {
                    this.f53325c = str2;
                }
                z10 = true;
                break;
            }
            continue;
        }
        z10 = false;
        C4954j3 c4954j3 = this.f53324b;
        if (c4954j3.f53372A && (strArr = c4954j3.f53378f) != null && strArr.length != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = f53321f;
                of2 = PackageManager.ApplicationInfoFlags.of(128L);
                installedApplications = packageManager.getInstalledApplications(of2);
            } else {
                installedApplications = f53321f.getInstalledApplications(128);
            }
            loop1: for (ApplicationInfo applicationInfo : installedApplications) {
                for (String str5 : this.f53324b.f53378f) {
                    if (applicationInfo.packageName.startsWith(str5)) {
                        this.f53326d.add("Package name: " + applicationInfo.packageName);
                        z11 = true;
                        break loop1;
                    }
                }
            }
        }
        z11 = false;
        boolean z16 = z10 | z11;
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        int i10 = 0;
        loop3: while (true) {
            if (i10 >= 2) {
                z12 = false;
                break;
            }
            File file2 = fileArr[i10];
            if (file2.exists() && file2.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    fileInputStream2.read(bArr);
                    fileInputStream2.close();
                } catch (Exception unused2) {
                }
                String str6 = new String(bArr);
                for (String str7 : this.f53324b.f53376d) {
                    if (str6.contains(str7)) {
                        this.f53326d.add("Driver: " + str6 + " filter: " + str7);
                        z12 = true;
                        break loop3;
                    }
                }
            }
            i10++;
        }
        boolean z17 = z16 | z12;
        if (Build.VERSION.SDK_INT < 26 && (activityManager = (ActivityManager) this.f53323a.getSystemService("activity")) != null) {
            loop5: for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
                for (String str8 : this.f53324b.f53378f) {
                    String className = runningServiceInfo.service.getClassName();
                    Locale locale = Locale.ENGLISH;
                    if (className.toLowerCase(locale).contains(str8.toLowerCase(locale))) {
                        this.f53326d.add("Service: " + runningServiceInfo.service.getClassName() + " Filter: " + str8);
                        z13 = true;
                        break loop5;
                    }
                }
            }
        }
        z13 = false;
        boolean z18 = z13 | z17;
        File[] listFiles = new File("/proc").listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i11 = 0;
            while (i11 < length) {
                File file3 = listFiles[i11];
                try {
                    file3.getAbsolutePath();
                    parseInt = Integer.parseInt(file3.getAbsolutePath().replace(str3, ""));
                    fileInputStream = new FileInputStream(new File(str3 + parseInt + "/status"));
                } catch (Exception unused3) {
                    str = str3;
                    z14 = z18;
                }
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                    } catch (Throwable th3) {
                        th = th3;
                        str = str3;
                        z14 = z18;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        String[] strArr2 = this.f53324b.f53374b;
                        int length2 = strArr2.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            String str9 = strArr2[i12];
                            str = str3;
                            try {
                                Locale locale2 = Locale.ENGLISH;
                                z14 = z18;
                                try {
                                    if (readLine.toLowerCase(locale2).contains(str9.toLowerCase(locale2))) {
                                        this.f53326d.add("Process: " + readLine + " Filter: " + str9 + " Procid: " + parseInt);
                                        bufferedReader.close();
                                        inputStreamReader.close();
                                        fileInputStream.close();
                                        z15 = true;
                                        break;
                                    }
                                    i12++;
                                    str3 = str;
                                    z18 = z14;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th2 = th;
                                    try {
                                        bufferedReader.close();
                                        throw th2;
                                    } catch (Throwable th5) {
                                        th2.addSuppressed(th5);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                z14 = z18;
                                th2 = th;
                                bufferedReader.close();
                                throw th2;
                            }
                        }
                        str = str3;
                        z14 = z18;
                        try {
                            bufferedReader.close();
                            try {
                                inputStreamReader.close();
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused4) {
                                }
                                i11++;
                                str3 = str;
                                z18 = z14;
                            } catch (Throwable th7) {
                                th = th7;
                                Throwable th8 = th;
                                try {
                                    fileInputStream.close();
                                    throw th8;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                    throw th8;
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            Throwable th11 = th;
                            try {
                                inputStreamReader.close();
                                throw th11;
                            } catch (Throwable th12) {
                                th11.addSuppressed(th12);
                                throw th11;
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        str = str3;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    str = str3;
                    z14 = z18;
                }
            }
        }
        z14 = z18;
        z15 = false;
        return z14 | z15;
    }
}
