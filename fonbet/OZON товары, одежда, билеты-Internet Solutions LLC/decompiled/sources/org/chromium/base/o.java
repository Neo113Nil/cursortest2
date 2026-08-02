package org.chromium.base;

import android.os.StrictMode;
import java.io.Closeable;

/* loaded from: classes6.dex */
public class o implements Closeable {
    public static o c() {
        TraceEvent r11 = TraceEvent.r("StrictModeContext.allowAllVmPolicies");
        try {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            a aVar = new a(vmPolicy);
            if (r11 != null) {
                r11.close();
            }
            return aVar;
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static o d() {
        TraceEvent r11 = TraceEvent.r("StrictModeContext.allowDiskReads");
        try {
            a aVar = new a(StrictMode.allowThreadDiskReads());
            if (r11 != null) {
                r11.close();
            }
            return aVar;
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static o j() {
        TraceEvent r11 = TraceEvent.r("StrictModeContext.allowDiskWrites");
        try {
            a aVar = new a(StrictMode.allowThreadDiskWrites());
            if (r11 != null) {
                r11.close();
            }
            return aVar;
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw null;
    }

    private static class a extends o {

        /* renamed from: a, reason: collision with root package name */
        private final StrictMode.ThreadPolicy f78555a;

        /* renamed from: b, reason: collision with root package name */
        private final StrictMode.VmPolicy f78556b;

        private a(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
            this.f78555a = threadPolicy;
            this.f78556b = vmPolicy;
        }

        @Override // org.chromium.base.o, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            StrictMode.ThreadPolicy threadPolicy = this.f78555a;
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            StrictMode.VmPolicy vmPolicy = this.f78556b;
            if (vmPolicy != null) {
                StrictMode.setVmPolicy(vmPolicy);
            }
            TraceEvent.m(hashCode());
        }

        a(StrictMode.ThreadPolicy threadPolicy) {
            this(threadPolicy, null);
        }

        a(StrictMode.VmPolicy vmPolicy) {
            this(null, vmPolicy);
        }
    }
}
