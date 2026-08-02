package defpackage;

import android.os.Build;
import com.google.android.gms.internal.measurement.zzaag;
import com.google.android.gms.internal.measurement.zzxx;
import com.google.android.gms.internal.measurement.zzxz;
import com.google.android.gms.internal.measurement.zzzf;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p5n extends zzaag {
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final AtomicReference f;
    public static final AtomicLong g;
    public static final ConcurrentLinkedQueue h;
    public volatile zzzf b;

    static {
        String str = Build.FINGERPRINT;
        c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        e = "eng".equals(str3) || "userdebug".equals(str3);
        f = new AtomicReference();
        g = new AtomicLong();
        h = new ConcurrentLinkedQueue();
    }

    public static void e() {
        while (true) {
            m5n m5nVar = (m5n) h.poll();
            if (m5nVar == null) {
                return;
            }
            g.getAndDecrement();
            p5n p5nVar = m5nVar.a;
            zzxz zzxzVar = m5nVar.b;
            xcp xcpVar = zzxzVar.c;
            if ((xcpVar != null && Boolean.TRUE.equals(xcpVar.d(zzxx.g))) || p5nVar.b(zzxzVar.a)) {
                p5nVar.c(zzxzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        return this.b == null || this.b.b(level);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        if (this.b != null) {
            this.b.c(zzxzVar);
            return;
        }
        if (g.incrementAndGet() > 20) {
            h.poll();
        }
        h.offer(new m5n(this, zzxzVar));
        if (this.b != null) {
            e();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaag, com.google.android.gms.internal.measurement.zzzf
    public final void d(RuntimeException runtimeException, zzxz zzxzVar) {
        if (this.b != null) {
            this.b.d(runtimeException, zzxzVar);
        }
    }
}
