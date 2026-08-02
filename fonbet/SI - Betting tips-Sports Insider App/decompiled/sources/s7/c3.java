package s7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f3 f22676c;

    public c3(f3 f3Var, long j, int i5) {
        this.f22674a = i5;
        switch (i5) {
            case 1:
                this.f22675b = j;
                Objects.requireNonNull(f3Var);
                this.f22676c = f3Var;
                break;
            default:
                this.f22675b = j;
                Objects.requireNonNull(f3Var);
                this.f22676c = f3Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r2.f23138s.a() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.f22674a) {
            case 0:
                f3 f3Var = this.f22676c;
                io.sentry.android.replay.gestures.c cVar = f3Var.f22767f;
                f3Var.j();
                f3Var.n();
                f1 f1Var = (f1) f3Var.f3328a;
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                l0 l0Var = n0Var.f22910n;
                long j = this.f22675b;
                l0Var.b(Long.valueOf(j), "Activity resumed, time");
                e eVar = f1Var.f22743d;
                if (!eVar.t(null, x.V0)) {
                    if (!eVar.x()) {
                        v0 v0Var = f1Var.f22744e;
                        f1.k(v0Var);
                        break;
                    }
                    ((f3) cVar.f16042a).j();
                    ((e3) cVar.f16045d).c();
                    cVar.f16043b = j;
                    cVar.f16044c = j;
                } else if (eVar.x() || f3Var.f22765d) {
                    ((f3) cVar.f16042a).j();
                    ((e3) cVar.f16045d).c();
                    cVar.f16043b = j;
                    cVar.f16044c = j;
                }
                io.sentry.util.network.b bVar = f3Var.f22768g;
                f3 f3Var2 = (f3) bVar.f17177c;
                f3Var2.j();
                f1 f1Var2 = (f1) f3Var2.f3328a;
                d3 d3Var = (d3) bVar.f17176b;
                if (d3Var != null) {
                    f3Var2.f22764c.removeCallbacks(d3Var);
                }
                v0 v0Var2 = f1Var2.f22744e;
                e2 e2Var = f1Var2.f22751m;
                f1.k(v0Var2);
                v0Var2.f23138s.b(false);
                f3Var2.j();
                f3Var2.f22765d = false;
                if (f1Var2.f22743d.t(null, x.U0)) {
                    f1.l(e2Var);
                    if (e2Var.f22706n) {
                        n0 n0Var2 = f1Var2.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22910n.a("Retrying trigger URI registration in foreground");
                        f1.l(e2Var);
                        e2Var.I();
                    }
                }
                r7.a aVar = f3Var.f22766e;
                f3 f3Var3 = (f3) aVar.f22318b;
                f3Var3.j();
                f1 f1Var3 = (f1) f3Var3.f3328a;
                if (f1Var3.d()) {
                    f1Var3.f22749k.getClass();
                    aVar.l(System.currentTimeMillis());
                    break;
                }
                break;
            default:
                f3 f3Var4 = this.f22676c;
                f3Var4.j();
                f3Var4.n();
                f1 f1Var4 = (f1) f3Var4.f3328a;
                n0 n0Var3 = f1Var4.f22745f;
                f1.m(n0Var3);
                l0 l0Var2 = n0Var3.f22910n;
                long j6 = this.f22675b;
                l0Var2.b(Long.valueOf(j6), "Activity paused, time");
                io.sentry.util.network.b bVar2 = f3Var4.f22768g;
                f3 f3Var5 = (f3) bVar2.f17177c;
                ((f1) f3Var5.f3328a).f22749k.getClass();
                d3 d3Var2 = new d3(bVar2, System.currentTimeMillis(), j6);
                bVar2.f17176b = d3Var2;
                f3Var5.f22764c.postDelayed(d3Var2, 2000L);
                if (f1Var4.f22743d.x()) {
                    ((e3) f3Var4.f22767f.f16045d).c();
                    break;
                }
                break;
        }
    }
}
