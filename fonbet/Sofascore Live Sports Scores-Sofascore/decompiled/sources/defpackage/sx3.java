package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sx3 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final ar9 b;
    public final jd0 c;
    public final wj9 d;
    public final ng2 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        ljg.s(5, 6, "armeabi", "armeabi-v7a", hashMap);
        ljg.s(9, 0, "arm64-v8a", "x86", hashMap);
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.0";
    }

    public sx3(Context context, ar9 ar9Var, jd0 jd0Var, wj9 wj9Var, ng2 ng2Var) {
        this.a = context;
        this.b = ar9Var;
        this.c = jd0Var;
        this.d = wj9Var;
        this.e = ng2Var;
    }

    public static kt0 c(g7h g7hVar, int i) {
        String str = (String) g7hVar.c;
        String str2 = (String) g7hVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) g7hVar.d;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        g7h g7hVar2 = (g7h) g7hVar.e;
        if (i >= 8) {
            g7h g7hVar3 = g7hVar2;
            while (g7hVar3 != null) {
                g7hVar3 = (g7h) g7hVar3.e;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            yhk.s("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        kt0 c = (g7hVar2 == null || i3 != 0) ? null : c(g7hVar2, i + 1);
        if (b == 1) {
            return new kt0(str, str2, d, c, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            nt0 nt0Var = new nt0();
            nt0Var.e = i;
            nt0Var.f = (byte) (nt0Var.f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            nt0Var.a = max;
            byte b = (byte) (nt0Var.f | 1);
            nt0Var.b = str;
            nt0Var.c = fileName;
            nt0Var.d = j;
            nt0Var.f = (byte) (b | 2);
            arrayList.add(nt0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static lt0 e() {
        return new lt0("0", "0", 0L);
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        jd0 jd0Var = this.c;
        String str = jd0Var.e;
        if (str == null) {
            yhk.s("Null name");
            return null;
        }
        String str2 = jd0Var.b;
        if (b == 3) {
            return Collections.singletonList(new jt0(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final st0 b(int i) {
        boolean z;
        Float f2;
        long j;
        Intent registerReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        boolean z2 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException unused) {
        }
        if (registerReceiver != null) {
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            z = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = registerReceiver.getIntExtra("level", -1);
                intExtra2 = registerReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException unused2) {
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f2 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
                int i2 = (z || f2 == null) ? 1 : ((double) f2.floatValue()) < 0.99d ? 2 : 3;
                if (!k53.u0() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long X = k53.X(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = X - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                rt0 rt0Var = new rt0();
                rt0Var.a = valueOf;
                rt0Var.b = i2;
                byte b = (byte) (1 | rt0Var.g);
                rt0Var.c = z2;
                rt0Var.d = i;
                rt0Var.e = j;
                rt0Var.f = (r6.getBlockCount() * blockSize) - (blockSize * r6.getAvailableBlocks());
                rt0Var.g = (byte) (((byte) (((byte) (((byte) (2 | b)) | 4)) | 8)) | 16);
                return rt0Var.a();
            }
            f2 = null;
            if (f2 != null) {
            }
            if (z) {
            }
            if (!k53.u0()) {
                z2 = true;
            }
            long X2 = k53.X(context);
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
            j = X2 - memoryInfo2.availMem;
            if (j <= 0) {
            }
            long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
            rt0 rt0Var2 = new rt0();
            rt0Var2.a = valueOf;
            rt0Var2.b = i2;
            byte b2 = (byte) (1 | rt0Var2.g);
            rt0Var2.c = z2;
            rt0Var2.d = i;
            rt0Var2.e = j;
            rt0Var2.f = (r6.getBlockCount() * blockSize2) - (blockSize2 * r6.getAvailableBlocks());
            rt0Var2.g = (byte) (((byte) (((byte) (((byte) (2 | b2)) | 4)) | 8)) | 16);
            return rt0Var2.a();
        }
        z = false;
        f2 = null;
        if (f2 != null) {
        }
        if (z) {
        }
        if (!k53.u0()) {
        }
        long X22 = k53.X(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j = X22 - memoryInfo22.availMem;
        if (j <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        rt0 rt0Var22 = new rt0();
        rt0Var22.a = valueOf;
        rt0Var22.b = i2;
        byte b22 = (byte) (1 | rt0Var22.g);
        rt0Var22.c = z2;
        rt0Var22.d = i;
        rt0Var22.e = j;
        rt0Var22.f = (r6.getBlockCount() * blockSize22) - (blockSize22 * r6.getAvailableBlocks());
        rt0Var22.g = (byte) (((byte) (((byte) (((byte) (2 | b22)) | 4)) | 8)) | 16);
        return rt0Var22.a();
    }
}
