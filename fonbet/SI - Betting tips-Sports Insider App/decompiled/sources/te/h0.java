package te;

import androidx.lifecycle.d1;
import com.google.android.gms.internal.measurement.y3;
import eg.m0;
import hg.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f23882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(l0 l0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23881b = i5;
        this.f23882c = l0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23881b) {
            case 0:
                return new h0(this.f23882c, continuation, 0);
            case 1:
                return new h0(this.f23882c, continuation, 1);
            case 2:
                return new h0(this.f23882c, continuation, 2);
            default:
                return new h0(this.f23882c, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23881b) {
        }
        return ((h0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23881b;
        l0 l0Var = this.f23882c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                l0Var.f23904h.h(f0.f23875b);
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                l0Var.p();
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                l0Var.p();
                break;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                md.m mVar = l0Var.f23900d;
                mVar.getClass();
                md.m.g().getClass();
                hg.u uVar = new hg.u(new hg.u(u0.i(new bd.g(new id.u(io.sentry.config.a.e(((rb.g) y3.m(rb.g.class, null, 6)).f22382a.f22378a, new String[]{"support_table"}, new k2.d0(20)), 2), mVar, 6)), new k0(l0Var, null), 2), new ge.o(3, null, 22));
                lg.e eVar = m0.f9201a;
                l0Var.f23905i = u0.p(u0.n(uVar, lg.d.f20063c), d1.i(l0Var));
                break;
        }
        return Unit.f19194a;
    }
}
