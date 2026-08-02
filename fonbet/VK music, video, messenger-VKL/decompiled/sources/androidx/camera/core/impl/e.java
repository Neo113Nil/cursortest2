package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraInternal;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import xsna.lf9;
import xsna.obr;
import xsna.s100;
import xsna.sl9;
import xsna.tli0;
import xsna.we9;

/* compiled from: CameraStateRegistry.java */
/* loaded from: classes11.dex */
public final class e {
    public int e;
    public final StringBuilder a = new StringBuilder();
    public final Object b = new Object();
    public final HashMap d = new HashMap();
    public final int c = 1;

    /* compiled from: CameraStateRegistry.java */
    public static class a {
        public CameraInternal.State a = null;
        public final tli0 b;
        public final we9.c c;

        public a(@NonNull tli0 tli0Var, @NonNull we9.c cVar) {
            this.b = tli0Var;
            this.c = cVar;
        }
    }

    public e() {
        synchronized ("mLock") {
            this.e = 1;
        }
    }

    public final void a() {
        boolean b = s100.b("CameraStateRegistry");
        StringBuilder sb = this.a;
        if (b) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.d.entrySet()) {
            if (s100.b("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((lf9) entry.getKey()).toString(), ((a) entry.getValue()).a != null ? ((a) entry.getValue()).a.toString() : GrsBaseInfo.CountryCodeSource.UNKNOWN));
            }
            CameraInternal.State state = ((a) entry.getValue()).a;
            if (state != null && state.h()) {
                i++;
            }
        }
        boolean b2 = s100.b("CameraStateRegistry");
        int i2 = this.c;
        if (b2) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(sl9.c(i, i2, "Open count: ", " (Max allowed: ", ")"));
        }
        this.e = Math.max(i2 - i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:11:0x0039, B:13:0x0067, B:15:0x006b, B:17:0x006f, B:23:0x0081, B:25:0x0089, B:28:0x0094, B:31:0x009d, B:32:0x00a0, B:37:0x007d), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:11:0x0039, B:13:0x0067, B:15:0x006b, B:17:0x006f, B:23:0x0081, B:25:0x0089, B:28:0x0094, B:31:0x009d, B:32:0x00a0, B:37:0x007d), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(@NonNull we9 we9Var) {
        boolean z;
        synchronized (this.b) {
            try {
                a aVar = (a) this.d.get(we9Var);
                obr.e(aVar, "Camera must first be registered with registerCamera()");
                z = true;
                if (s100.b("CameraStateRegistry")) {
                    this.a.setLength(0);
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    int i = this.e;
                    CameraInternal.State state = aVar.a;
                    boolean z2 = state != null && state.h();
                    sb.append("tryOpenCamera(" + we9Var + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + aVar.a + ")]");
                }
                if (this.e <= 0) {
                    CameraInternal.State state2 = aVar.a;
                    if (!(state2 != null && state2.h())) {
                        z = false;
                        if (s100.b("CameraStateRegistry")) {
                            StringBuilder sb2 = this.a;
                            Locale locale2 = Locale.US;
                            sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                        }
                        if (z) {
                            a();
                        }
                    }
                }
                aVar.a = CameraInternal.State.OPENING;
                if (s100.b("CameraStateRegistry")) {
                }
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
