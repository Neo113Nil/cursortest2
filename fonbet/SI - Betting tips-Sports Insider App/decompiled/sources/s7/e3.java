package s7;

import android.content.Intent;
import android.os.SystemClock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e3 extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(Object obj, m1 m1Var, int i5) {
        super(m1Var);
        this.f22715e = i5;
        this.f22716f = obj;
    }

    @Override // s7.k
    public final void a() {
        switch (this.f22715e) {
            case 0:
                io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.f22716f;
                f3 f3Var = (f3) cVar.f16042a;
                f3Var.j();
                f1 f1Var = (f1) f3Var.f3328a;
                f1Var.f22749k.getClass();
                cVar.e(SystemClock.elapsedRealtime(), false, false);
                r rVar = f1Var.f22752n;
                f1.j(rVar);
                f1Var.f22749k.getClass();
                rVar.m(SystemClock.elapsedRealtime());
                break;
            case 1:
                j3 j3Var = (j3) this.f22716f;
                j3Var.n();
                n0 n0Var = ((f1) j3Var.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22910n.a("Starting upload from DelayedRunnable");
                j3Var.f22859b.q();
                break;
            default:
                r3 r3Var = (r3) this.f22716f;
                r3Var.b().j();
                String str = (String) r3Var.q.pollFirst();
                if (str != null) {
                    r3Var.f().getClass();
                    r3Var.I = SystemClock.elapsedRealtime();
                    r3Var.a().f22910n.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    r3.S(r3Var.f22997l.f22740a, intent);
                }
                r3Var.H();
                break;
        }
    }
}
