package le;

import com.sports.insider.ui.pays.PayExpressFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19727b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PayExpressFragment f19729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(PayExpressFragment payExpressFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19727b = i5;
        this.f19729d = payExpressFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19727b) {
            case 0:
                d0 d0Var = new d0(this.f19729d, continuation, 0);
                d0Var.f19728c = obj;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(this.f19729d, continuation, 1);
                d0Var2.f19728c = obj;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(this.f19729d, continuation, 2);
                d0Var3.f19728c = obj;
                return d0Var3;
            default:
                d0 d0Var4 = new d0(this.f19729d, continuation, 3);
                d0Var4.f19728c = obj;
                return d0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19727b) {
        }
        return ((d0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19727b;
        Continuation continuation = null;
        PayExpressFragment payExpressFragment = this.f19729d;
        int i10 = 2;
        switch (i5) {
            case 0:
                eg.z zVar = (eg.z) this.f19728c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar = eg.m0.f9201a;
                return eg.c0.e(zVar, lg.d.f20063c, new c0(payExpressFragment, continuation, 0), 2);
            case 1:
                eg.z zVar2 = (eg.z) this.f19728c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = eg.m0.f9201a;
                return eg.c0.e(zVar2, lg.d.f20063c, new c0(payExpressFragment, continuation, 1), 2);
            case 2:
                eg.z zVar3 = (eg.z) this.f19728c;
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar3 = eg.m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                eg.c0.e(zVar3, dVar, new c0(payExpressFragment, continuation, i10), 2);
                return eg.c0.e(zVar3, dVar, new c0(payExpressFragment, continuation, 3), 2);
            default:
                eg.z zVar4 = (eg.z) this.f19728c;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar4 = eg.m0.f9201a;
                return eg.c0.e(zVar4, lg.d.f20063c, new cd.j(payExpressFragment, continuation, 6), 2);
        }
    }
}
