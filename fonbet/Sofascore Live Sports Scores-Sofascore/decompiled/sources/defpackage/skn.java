package defpackage;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class skn {
    public static volatile zzcl d;
    public final iso a;
    public final nkn b;
    public volatile long c;

    public skn(iso isoVar) {
        Preconditions.i(isoVar);
        this.a = isoVar;
        this.b = new nkn(0, this, isoVar);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            iso isoVar = this.a;
            this.c = isoVar.f().a();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            isoVar.b().g.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        zzcl zzclVar;
        if (d != null) {
            return d;
        }
        synchronized (skn.class) {
            try {
                if (d == null) {
                    d = new zzcl(this.a.e().getMainLooper());
                }
                zzclVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzclVar;
    }
}
