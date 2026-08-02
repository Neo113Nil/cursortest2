package le;

import com.sports.insider.R;
import com.sports.insider.ui.pays.PayExpressFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19879b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f19880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PayExpressFragment f19881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f19882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(PayExpressFragment payExpressFragment, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.f19881d = payExpressFragment;
        this.f19882e = bool;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19879b) {
            case 0:
                return new m0(this.f19882e, this.f19881d, continuation);
            default:
                return new m0(this.f19881d, this.f19882e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19879b) {
        }
        return ((m0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19879b;
        Boolean bool = this.f19882e;
        PayExpressFragment payExpressFragment = this.f19881d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f19880c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                        ((zc.k) payExpressFragment.H().f19730f.f25206h.getValue()).getClass();
                        return zc.k.h(R.string.GetExpress);
                    }
                    d1 H = payExpressFragment.H();
                    this.f19880c = 1;
                    obj = H.y(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return (String) obj;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f19880c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = eg.m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    m0 m0Var = new m0(bool, payExpressFragment, (Continuation) null);
                    this.f19880c = 1;
                    obj = eg.c0.A(dVar, m0Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                String str = (String) obj;
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar != null) {
                    vVar.f9020c.setButtonText(str);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Boolean bool, PayExpressFragment payExpressFragment, Continuation continuation) {
        super(2, continuation);
        this.f19882e = bool;
        this.f19881d = payExpressFragment;
    }
}
