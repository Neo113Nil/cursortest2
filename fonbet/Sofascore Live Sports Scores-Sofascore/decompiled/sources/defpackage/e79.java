package defpackage;

import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e79 {
    public static final boolean d;
    public static final boolean e;
    public static final File f;
    public static volatile e79 g;
    public int a;
    public boolean b = true;
    public final AtomicBoolean c = new AtomicBoolean(false);

    static {
        int i = Build.VERSION.SDK_INT;
        d = i < 29;
        e = i >= 28;
        f = new File("/proc/self/fd");
    }

    public static e79 a() {
        if (g == null) {
            synchronized (e79.class) {
                try {
                    if (g == null) {
                        g = new e79();
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT != 28) {
            return 20000;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return 500;
            }
        }
        return 20000;
    }

    public final boolean c(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z && e && ((!d || this.c.get()) && !z2 && i >= 0 && i2 >= 0)) {
            synchronized (this) {
                try {
                    int i3 = this.a + 1;
                    this.a = i3;
                    if (i3 >= 50) {
                        this.a = 0;
                        this.b = ((long) f.list().length) < ((long) b());
                    }
                    z3 = this.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }
}
