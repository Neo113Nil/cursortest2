package io.seon.androidsdk.service;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.nfc.NfcAdapter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.PublisherMetadata;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class M4 extends AbstractC4950j {

    /* renamed from: e, reason: collision with root package name */
    public PowerManager f53055e = null;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f53056g;

    /* renamed from: n, reason: collision with root package name */
    public NfcAdapter f53057n;

    /* renamed from: o, reason: collision with root package name */
    public Context f53058o;

    /* renamed from: p, reason: collision with root package name */
    public SharedPreferences f53059p;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f53052j = {"battery_charging", "battery_health", "battery_level", "battery_temperature", "battery_voltage", "battery_total_capacity", "cpu_type", "cpu_count", "cpu_speed", "cpu_hash", "last_boot_time", "physical_memory", "system_uptime", "is_nfc_available", "is_nfc_enabled", "input_device_data", "power_source"};

    /* renamed from: q, reason: collision with root package name */
    public static final Lh.a f53054q = Lh.a.d(M4.class);

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f53053l = {"cpu_model", "Processor", "vendor_id", "Hardware", PublisherMetadata.CPU_ARCHITECTURE};

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f53055e = (PowerManager) this.f53058o.getSystemService("power");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        HashMap hashMap = new HashMap();
        byte[] bArr = new byte[1024];
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start().getInputStream();
            while (inputStream.read(bArr) != -1) {
                for (String str : new String(bArr).split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) {
                    String[] split = str.split(":");
                    if (split.length > 1) {
                        String replace = split[0].trim().replace(" ", "_");
                        if (!hashMap.containsKey(replace)) {
                            if (replace.equals("model_name")) {
                                replace = "cpu_model";
                            }
                            String trim = split[1].trim();
                            if (replace.equals("cpu_model")) {
                                trim = trim.replaceAll("\\s+", " ");
                            }
                            hashMap.put(replace, trim);
                        }
                    }
                }
            }
            inputStream.close();
        } catch (IOException unused) {
        }
        this.f53056g = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean m() {
        PowerManager powerManager = this.f53055e;
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    public static long y() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state", "r");
            long j10 = -1;
            while (true) {
                try {
                    String readLine = randomAccessFile.readLine();
                    if (readLine == null) {
                        return j10;
                    }
                    String[] split = readLine.split("\\s+");
                    if (split.length != 2) {
                        return -1L;
                    }
                    if (Integer.parseInt(split[1]) > 0) {
                        long parseLong = Long.parseLong(split[0].replace("\"", "")) / 1000;
                        if (parseLong > j10) {
                            j10 = parseLong;
                        }
                    }
                } catch (IOException unused) {
                    return j10;
                }
            }
        } catch (IOException unused2) {
            return -1L;
        }
    }

    public final double A() {
        try {
            BatteryManager batteryManager = (BatteryManager) this.f53058o.getSystemService("batterymanager");
            if (batteryManager == null) {
                return 0.0d;
            }
            int intProperty = batteryManager.getIntProperty(4);
            if (batteryManager.getIntProperty(1) / 1000.0d <= 0.0d || intProperty <= 0) {
                return 0.0d;
            }
            return Math.round(r4 / (intProperty / 100.0d));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public final String B() {
        try {
            return ((ActivityManager) this.f53058o.getSystemService("activity")).getDeviceConfigurationInfo().getGlEsVersion();
        } catch (Exception unused) {
            return null;
        }
    }

    public final HashMap C() {
        HashMap hashMap = new HashMap();
        try {
            InputManager inputManager = (InputManager) this.f53058o.getSystemService("input");
            for (int i10 = 0; i10 < inputManager.getInputDeviceIds().length; i10++) {
                C4955j4 c4955j4 = new C4955j4(inputManager.getInputDevice(inputManager.getInputDeviceIds()[i10]));
                hashMap.put(c4955j4.f53399a, c4955j4.f53400b);
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    public final long D() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }

    public final NfcAdapter E() {
        if (this.f53057n == null) {
            this.f53057n = NfcAdapter.getDefaultAdapter(this.f53058o);
        }
        return this.f53057n;
    }

    public final String F() {
        return Arrays.toString(Build.SUPPORTED_ABIS);
    }

    public final long G() {
        return SystemClock.elapsedRealtime() / 1000;
    }

    public final Long H() {
        try {
            if (this.f53059p.contains("phiMem")) {
                long j10 = this.f53059p.getLong("phiMem", -1L);
                if (j10 > 0) {
                    return Long.valueOf(j10);
                }
            }
        } catch (Exception unused) {
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile("/proc/meminfo", "r");
            try {
                Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile2.readLine());
                String str = "";
                while (matcher.find()) {
                    str = matcher.group(1);
                }
                randomAccessFile2.close();
                if (str == null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
                long parseDouble = ((long) Double.parseDouble(str)) * 1000;
                SharedPreferences.Editor edit = this.f53059p.edit();
                edit.putLong("phiMem", parseDouble);
                edit.apply();
                Long valueOf = Long.valueOf(parseDouble);
                try {
                    randomAccessFile2.close();
                } catch (IOException unused3) {
                }
                return valueOf;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I() {
        boolean z10;
        try {
            Intent registerReceiver = this.f53058o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("plugged", -1) : -1;
            if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                z10 = false;
                if (Build.VERSION.SDK_INT < 33) {
                    return (intExtra == 8) | z10;
                }
                return z10;
            }
            z10 = true;
            if (Build.VERSION.SDK_INT < 33) {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public final Boolean J() {
        return (Boolean) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.C4
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Boolean m10;
                m10 = M4.this.m();
                return m10;
            }
        });
    }

    public final boolean K() {
        return E() != null;
    }

    public final /* synthetic */ void L() {
        this.f53059p = this.f53058o.getSharedPreferences("seonLocalPreferences", 0);
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53058o = c4878a.a();
        this.f53368b = c4878a;
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.D4
            @Override // java.lang.Runnable
            public final void run() {
                M4.this.L();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.E4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.this.k();
                }
            }.run();
        } catch (Throwable unused2) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.F4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.this.l();
                }
            }.run();
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:2|3)|(7:7|8|9|10|(1:16)|18|19)|23|8|9|10|(3:12|14|16)|18|19) */
    @Override // io.seon.androidsdk.service.InterfaceC4966l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b() {
        boolean z10;
        HashMap hashMap = new HashMap();
        boolean z11 = false;
        if (Build.VERSION.SDK_INT >= 29 && E() != null) {
            z10 = E().isSecureNfcSupported();
            hashMap.put("is_secure_nfc_available", Boolean.valueOf(z10));
            if (Build.VERSION.SDK_INT >= 29 && E() != null && E() != null) {
                z11 = E().isSecureNfcEnabled();
            }
            hashMap.put("is_secure_nfc_enabled", Boolean.valueOf(z11));
            hashMap.put("gles_version", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.G4
                @Override // io.seon.androidsdk.service.N4
                public final Object a() {
                    return M4.this.B();
                }
            }));
            hashMap.put("supported_abis", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.H4
                @Override // io.seon.androidsdk.service.N4
                public final Object a() {
                    return M4.this.F();
                }
            }));
            hashMap.put("calculated_total_battery_capacity", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.I4
                @Override // io.seon.androidsdk.service.N4
                public final Object a() {
                    return Double.valueOf(M4.this.A());
                }
            }));
            hashMap.put("is_power_saving", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.J4
                @Override // io.seon.androidsdk.service.N4
                public final Object a() {
                    return M4.this.J();
                }
            }));
            return hashMap;
        }
        z10 = false;
        hashMap.put("is_secure_nfc_available", Boolean.valueOf(z10));
        if (Build.VERSION.SDK_INT >= 29) {
            z11 = E().isSecureNfcEnabled();
        }
        hashMap.put("is_secure_nfc_enabled", Boolean.valueOf(z11));
        hashMap.put("gles_version", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.G4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.B();
            }
        }));
        hashMap.put("supported_abis", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.H4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.F();
            }
        }));
        hashMap.put("calculated_total_battery_capacity", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.I4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Double.valueOf(M4.this.A());
            }
        }));
        hashMap.put("is_power_saving", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.J4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.J();
            }
        }));
        return hashMap;
    }

    public final Integer n() {
        int i10 = -1;
        try {
            Intent registerReceiver = this.f53058o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                i10 = registerReceiver.getIntExtra("level", -1);
            }
        } catch (Exception unused) {
        }
        return Integer.valueOf(i10);
    }

    public final boolean o() {
        if (E() != null) {
            return E().isEnabled();
        }
        return false;
    }

    public final String p(String str) {
        Object value;
        try {
            HashMap hashMap = this.f53056g;
            if (hashMap != null && str != null) {
                if (hashMap.containsKey(str)) {
                    value = this.f53056g.get(str);
                } else {
                    for (Map.Entry entry : this.f53056g.entrySet()) {
                        if (str.equalsIgnoreCase((String) entry.getKey())) {
                            value = entry.getValue();
                        }
                    }
                }
                return (String) value;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final String q() {
        try {
            Intent registerReceiver = this.f53058o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("health", 0) : 0;
            if (intExtra == 7) {
                return "COLD";
            }
            if (intExtra == 4) {
                return "DEAD";
            }
            if (intExtra == 2) {
                return "GOOD";
            }
            if (intExtra == 3) {
                return "OVER HEAT";
            }
            if (intExtra == 5) {
                return "OVER VOLTAGE";
            }
            if (intExtra == 1) {
                return "UNKNOWN";
            }
            if (intExtra == 6) {
                return "UNSPECIFIED FAILURE";
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String r() {
        Intent registerReceiver = this.f53058o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("plugged", -1) : 0;
        return intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? intExtra != 8 ? "NO DATA" : "DOCK" : "WIRELESS" : "USB" : "AC";
    }

    public final Double s() {
        try {
            return Double.valueOf((this.f53058o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null ? r1.getIntExtra("temperature", 0) : 0) / 10.0d);
        } catch (Exception unused) {
            return null;
        }
    }

    public final double t() {
        try {
            return ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(this.f53058o), null)).doubleValue();
        } catch (Exception e10) {
            V.j("BatTot", e10);
            return 0.0d;
        }
    }

    public final int u() {
        int i10 = -1;
        try {
            Intent registerReceiver = this.f53058o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                i10 = registerReceiver.getIntExtra("voltage", -1);
            }
        } catch (Exception unused) {
        }
        try {
            return Integer.toString(i10).length() <= 2 ? i10 * 1000 : i10;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public final int v() {
        try {
            return Runtime.getRuntime().availableProcessors();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final Object w() {
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (true) {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (i10 >= strArr.length) {
                    break;
                }
                String str = strArr[i10];
                if (str != null && !str.isEmpty()) {
                    sb2.append(str);
                    break;
                }
                i10++;
            }
            for (String str2 : f53053l) {
                String p10 = p(str2);
                if (p10 != null) {
                    sb2.append(p10);
                }
            }
            if (sb2.length() > 0) {
                try {
                    String sb3 = sb2.toString();
                    AtomicInteger atomicInteger = V.f53166a;
                    byte[] bytes = sb3.getBytes("UTF-8");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.reset();
                    messageDigest.update(bytes);
                    return V.d(messageDigest.digest());
                } catch (UnsupportedEncodingException | NoSuchAlgorithmException e10) {
                    f53054q.c(e10, 6);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final long x() {
        long j10 = -1;
        try {
            if (!new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").exists()) {
                return y();
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", "r");
                while (true) {
                    try {
                        String readLine = randomAccessFile.readLine();
                        if (readLine == null) {
                            randomAccessFile.close();
                            return j10;
                        }
                        j10 = Long.parseLong(readLine) / 1000;
                    } finally {
                    }
                }
            } catch (Exception e10) {
                V.j("CPUsp", e10);
                return j10;
            }
        } catch (Exception unused) {
            return j10;
        }
    }

    public final String z() {
        try {
            String p10 = p("cpu_model");
            if (p10 != null) {
                return p10;
            }
            String p11 = p("Processor");
            if (p11 != null) {
                return p11;
            }
            String p12 = p("Hardware");
            if (p12 != null) {
                return p12;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (i10 >= strArr.length) {
                    return null;
                }
                String str = strArr[i10];
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("battery_charging", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.K4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(M4.this.I());
            }
        }));
        hashMap.put("battery_health", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.t4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.q();
            }
        }));
        hashMap.put("battery_level", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.u4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Integer n10;
                n10 = M4.this.n();
                return n10;
            }
        }));
        hashMap.put("battery_temperature", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.v4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.s();
            }
        }));
        hashMap.put("battery_voltage", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.w4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Integer.valueOf(M4.this.u());
            }
        }));
        hashMap.put("battery_total_capacity", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.x4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Double.valueOf(M4.this.t());
            }
        }));
        hashMap.put("cpu_type", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.y4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.z();
            }
        }));
        hashMap.put("cpu_count", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.z4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Integer.valueOf(M4.this.v());
            }
        }));
        hashMap.put("cpu_speed", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.A4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Long.valueOf(M4.this.x());
            }
        }));
        hashMap.put("cpu_hash", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.B4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.w();
            }
        }));
        hashMap.put("last_boot_time", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.m4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Long.valueOf(M4.this.D());
            }
        }));
        hashMap.put("physical_memory", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.n4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.H();
            }
        }));
        hashMap.put("system_uptime", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.o4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Long.valueOf(M4.this.G());
            }
        }));
        hashMap.put("is_nfc_available", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.p4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(M4.this.K());
            }
        }));
        hashMap.put("is_nfc_enabled", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.q4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(M4.this.o());
            }
        }));
        hashMap.put("input_device_data", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.r4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.C();
            }
        }));
        hashMap.put("power_source", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.s4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return M4.this.r();
            }
        }));
        return hashMap;
    }
}
