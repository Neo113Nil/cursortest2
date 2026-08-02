package le;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f19993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(d1 d1Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19992b = i5;
        this.f19993c = d1Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19992b) {
            case 0:
                return new x0(this.f19993c, continuation, 0);
            case 1:
                return new x0(this.f19993c, continuation, 1);
            case 2:
                return new x0(this.f19993c, continuation, 2);
            case 3:
                return new x0(this.f19993c, continuation, 3);
            default:
                return new x0(this.f19993c, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19992b) {
        }
        return ((x0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19992b;
        int i10 = 5;
        int i11 = 6;
        Continuation continuation = null;
        int i12 = 3;
        d1 d1Var = this.f19993c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                d1Var.f19730f.f25204f.getClass();
                ge.q qVar = new ge.q(uc.c.a(), 6);
                lg.e eVar = eg.m0.f9201a;
                d1Var.f19748z = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.n(qVar, lg.d.f20063c), new v0(d1Var, continuation, i12), 2), jg.q.f18523a), new ge.o(i12, continuation, i10)), androidx.lifecycle.d1.i(d1Var));
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                jg.d dVar = MyApp.f6830c;
                lg.e eVar2 = eg.m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                d1Var.A = eg.c0.t(dVar, dVar2, null, new v0(d1Var, continuation, 4), 2);
                d1Var.B = eg.c0.t(dVar, dVar2, null, new v0(d1Var, continuation, i10), 2);
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                s7.u uVar = d1Var.f19730f.f25075b;
                d1Var.N = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.i(hg.u0.i(s7.u.e())), new kd.e(d1Var, continuation, 14), 2), eg.m0.f9201a), new ge.o(i12, continuation, i11)), androidx.lifecycle.d1.i(d1Var));
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                wc.v vVar = d1Var.f19730f;
                int i13 = d1Var.j;
                vVar.getClass();
                ((la.s0) y3.m(la.s0.class, null, 6)).getClass();
                d1Var.I = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.n(hg.u0.n(new id.u(io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23427b.f24213a, new String[]{"table_prediction_preview"}, new eb.b(i13, 22)), 0), eg.m0.f9201a), lg.d.f20063c), new ab.b(d1Var, continuation, 21), 2), jg.q.f18523a), new ge.o(i12, continuation, 7)), androidx.lifecycle.d1.i(d1Var));
                break;
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                p0 p0Var = new p0();
                Integer valueOf = Integer.valueOf(d1Var.f19765b);
                HashMap hashMap = p0Var.f19905a;
                hashMap.put("announcementId", valueOf);
                hashMap.put("id", Integer.valueOf(d1Var.j));
                hashMap.put("type", 3);
                Intrinsics.checkNotNullExpressionValue(p0Var, "apply(...)");
                d1Var.j(p0Var);
                break;
        }
        return Unit.f19194a;
    }
}
