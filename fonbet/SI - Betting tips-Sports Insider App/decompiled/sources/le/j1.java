package le;

import com.sports.insider.ui.pays.PayPremiumFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19838b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PayPremiumFragment f19840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(PayPremiumFragment payPremiumFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19838b = i5;
        this.f19840d = payPremiumFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19838b) {
            case 0:
                j1 j1Var = new j1(this.f19840d, continuation, 0);
                j1Var.f19839c = obj;
                return j1Var;
            case 1:
                j1 j1Var2 = new j1(this.f19840d, continuation, 1);
                j1Var2.f19839c = obj;
                return j1Var2;
            case 2:
                j1 j1Var3 = new j1(this.f19840d, continuation, 2);
                j1Var3.f19839c = obj;
                return j1Var3;
            default:
                j1 j1Var4 = new j1(this.f19840d, continuation, 3);
                j1Var4.f19839c = obj;
                return j1Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19838b) {
        }
        return ((j1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19838b;
        Continuation continuation = null;
        PayPremiumFragment payPremiumFragment = this.f19840d;
        int i10 = 2;
        switch (i5) {
            case 0:
                eg.z zVar = (eg.z) this.f19839c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar = eg.m0.f9201a;
                return eg.c0.e(zVar, lg.d.f20063c, new i1(payPremiumFragment, continuation, 0), 2);
            case 1:
                eg.z zVar2 = (eg.z) this.f19839c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = eg.m0.f9201a;
                return eg.c0.e(zVar2, lg.d.f20063c, new i1(payPremiumFragment, continuation, 1), 2);
            case 2:
                eg.z zVar3 = (eg.z) this.f19839c;
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar3 = eg.m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                eg.c0.e(zVar3, dVar, new i1(payPremiumFragment, continuation, i10), 2);
                return eg.c0.e(zVar3, dVar, new i1(payPremiumFragment, continuation, 3), 2);
            default:
                eg.z zVar4 = (eg.z) this.f19839c;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar4 = eg.m0.f9201a;
                return eg.c0.e(zVar4, lg.d.f20063c, new cd.j(payPremiumFragment, continuation, 8), 2);
        }
    }
}
