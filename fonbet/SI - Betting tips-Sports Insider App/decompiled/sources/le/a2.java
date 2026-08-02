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
public final class a2 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f19699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(f2 f2Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19698b = i5;
        this.f19699c = f2Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19698b) {
            case 0:
                return new a2(this.f19699c, continuation, 0);
            case 1:
                return new a2(this.f19699c, continuation, 1);
            case 2:
                return new a2(this.f19699c, continuation, 2);
            case 3:
                return new a2(this.f19699c, continuation, 3);
            default:
                return new a2(this.f19699c, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19698b) {
        }
        return ((a2) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19698b;
        int i10 = 3;
        Continuation continuation = null;
        f2 f2Var = this.f19699c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                f2Var.f19769f.f25123f.getClass();
                ge.q qVar = new ge.q(uc.c.a(), 7);
                lg.e eVar = eg.m0.f9201a;
                f2Var.A = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.n(qVar, lg.d.f20063c), new y1(f2Var, continuation, i10), 2), jg.q.f18523a), new ge.o(i10, continuation, 9)), androidx.lifecycle.d1.i(f2Var));
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                jg.d dVar = MyApp.f6830c;
                lg.e eVar2 = eg.m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                f2Var.B = eg.c0.t(dVar, dVar2, null, new y1(f2Var, continuation, 4), 2);
                f2Var.C = eg.c0.t(dVar, dVar2, null, new y1(f2Var, continuation, 5), 2);
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                s7.u uVar = f2Var.f19769f.f25075b;
                hg.g i11 = hg.u0.i(hg.u0.i(s7.u.e()));
                lg.e eVar3 = eg.m0.f9201a;
                f2Var.O = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.n(i11, lg.d.f20063c), new kd.e(f2Var, continuation, 18), 2), eg.m0.f9201a), new ge.o(i10, continuation, 10)), androidx.lifecycle.d1.i(f2Var));
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                wc.j0 j0Var = f2Var.f19769f;
                int i12 = f2Var.j;
                j0Var.getClass();
                ((la.s0) y3.m(la.s0.class, null, 6)).getClass();
                f2Var.J = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.n(hg.u0.n(new id.u(io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23427b.f24213a, new String[]{"table_prediction_preview"}, new eb.b(i12, 22)), 0), eg.m0.f9201a), lg.d.f20063c), new ab.b(f2Var, continuation, 24), 2), jg.q.f18523a), new ge.o(i10, continuation, 11)), androidx.lifecycle.d1.i(f2Var));
                break;
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                s1 s1Var = new s1();
                Integer valueOf = Integer.valueOf(f2Var.f19765b);
                HashMap hashMap = s1Var.f19939a;
                hashMap.put("announcementId", valueOf);
                hashMap.put("id", Integer.valueOf(f2Var.j));
                hashMap.put("type", 2);
                Intrinsics.checkNotNullExpressionValue(s1Var, "apply(...)");
                f2Var.j(s1Var);
                break;
        }
        return Unit.f19194a;
    }
}
