package s7;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2 f23168c;

    public w1(e2 e2Var, long j, int i5) {
        this.f23166a = i5;
        switch (i5) {
            case 1:
                this.f23167b = j;
                Objects.requireNonNull(e2Var);
                this.f23168c = e2Var;
                break;
            default:
                this.f23167b = j;
                Objects.requireNonNull(e2Var);
                this.f23168c = e2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23166a) {
            case 0:
                f1 f1Var = (f1) this.f23168c.f3328a;
                v0 v0Var = f1Var.f22744e;
                f1.k(v0Var);
                io.sentry.android.core.s sVar = v0Var.f23131k;
                long j = this.f23167b;
                sVar.b(j);
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22909m.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                e2 e2Var = this.f23168c;
                e2Var.j();
                e2Var.k();
                f1 f1Var2 = (f1) e2Var.f3328a;
                n0 n0Var2 = f1Var2.f22745f;
                f1.m(n0Var2);
                n0Var2.f22909m.a("Resetting analytics data (FE)");
                f3 f3Var = f1Var2.f22747h;
                f1.l(f3Var);
                f3Var.j();
                io.sentry.android.replay.gestures.c cVar = f3Var.f22767f;
                ((e3) cVar.f16045d).c();
                ((f1) ((f3) cVar.f16042a).f3328a).f22749k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cVar.f16043b = elapsedRealtime;
                cVar.f16044c = elapsedRealtime;
                f1Var2.r().o();
                boolean z5 = !f1Var2.d();
                v0 v0Var2 = f1Var2.f22744e;
                f1.k(v0Var2);
                v0Var2.f23127f.b(this.f23167b);
                f1 f1Var3 = (f1) v0Var2.f3328a;
                v0 v0Var3 = f1Var3.f22744e;
                f1.k(v0Var3);
                if (!TextUtils.isEmpty(v0Var3.f23141v.h())) {
                    v0Var2.f23141v.i(null);
                }
                v0Var2.f23136p.b(0L);
                v0Var2.q.b(0L);
                if (!f1Var3.f22743d.w()) {
                    v0Var2.s(z5);
                }
                v0Var2.f23142w.i(null);
                v0Var2.f23143x.b(0L);
                v0Var2.f23144y.V(null);
                y2 p10 = f1Var2.p();
                p10.j();
                p10.k();
                zzr z7 = p10.z(false);
                p10.v();
                ((f1) p10.f3328a).o().n();
                p10.x(new t2(p10, z7, 0));
                f1.l(f3Var);
                f3Var.f22766e.j();
                e2Var.f22710s = z5;
                f1Var2.p().n(new AtomicReference());
                break;
        }
    }
}
