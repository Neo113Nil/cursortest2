package qd;

import androidx.lifecycle.d1;
import com.google.android.gms.internal.measurement.y3;
import eg.m0;
import eg.t1;
import eg.z;
import ge.o;
import ge.q;
import hg.u;
import hg.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;
import oe.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f22111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22110b = i5;
        this.f22111c = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22110b) {
            case 0:
                return new f(this.f22111c, continuation, 0);
            default:
                return new f(this.f22111c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22110b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        hg.g n9;
        int i5 = this.f22110b;
        h hVar = this.f22111c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                t1 t1Var = null;
                if (hVar.j != null) {
                    ((la.a) y3.m(la.a.class, null, 6)).getClass();
                    hg.g a7 = la.a.a();
                    lg.e eVar = m0.f9201a;
                    hg.g n10 = u0.n(new q(u0.n(a7, lg.d.f20063c), 8), m0.f9201a);
                    if (n10 != null && (n9 = u0.n(new u(n10, new j(hVar, t1Var, 17), 2), jg.q.f18523a)) != null) {
                        t1Var = u0.p(new u(n9, new o(3, t1Var, 20)), d1.i(hVar));
                    }
                }
                hVar.f22116c = t1Var;
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                hVar.f22122i.h(Boolean.TRUE);
                break;
        }
        return Unit.f19194a;
    }
}
