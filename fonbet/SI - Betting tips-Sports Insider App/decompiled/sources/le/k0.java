package le;

import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.views.CheckPrice;
import com.sports.insider.ui.views.ProfitView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19847b;

    /* renamed from: c, reason: collision with root package name */
    public int f19848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19852g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(String str, ue.h hVar, int i5, int i10, Continuation continuation) {
        super(2, continuation);
        this.f19847b = 2;
        this.f19849d = str;
        this.f19852g = hVar;
        this.f19850e = i5;
        this.f19851f = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19847b) {
            case 0:
                return new k0((PayExpressFragment) this.f19852g, this.f19848c, this.f19849d, this.f19850e, this.f19851f, continuation, 0);
            case 1:
                return new k0((PayPremiumFragment) this.f19852g, this.f19848c, this.f19849d, this.f19850e, this.f19851f, continuation, 1);
            default:
                return new k0(this.f19849d, (ue.h) this.f19852g, this.f19850e, this.f19851f, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19847b) {
        }
        return ((k0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        CheckPrice checkPrice;
        ProfitView profitView;
        CheckPrice checkPrice2;
        ProfitView profitView2;
        int i5 = this.f19847b;
        Object obj2 = this.f19852g;
        int i10 = this.f19851f;
        int i11 = this.f19850e;
        String str = this.f19849d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                PayExpressFragment payExpressFragment = (PayExpressFragment) obj2;
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar != null && (profitView = vVar.f9025h) != null) {
                    profitView.setColorIcOk(new Integer(this.f19848c));
                }
                ec.v vVar2 = (ec.v) payExpressFragment.f22459a;
                if (vVar2 == null || (checkPrice = vVar2.f9024g) == null) {
                    return null;
                }
                checkPrice.k(i11, i10, str);
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                PayPremiumFragment payPremiumFragment = (PayPremiumFragment) obj2;
                ec.w wVar = (ec.w) payPremiumFragment.f22459a;
                if (wVar != null && (profitView2 = wVar.f9036h) != null) {
                    profitView2.setColorIcOk(new Integer(this.f19848c));
                }
                ec.w wVar2 = (ec.w) payPremiumFragment.f22459a;
                if (wVar2 == null || (checkPrice2 = wVar2.f9035g) == null) {
                    return null;
                }
                checkPrice2.k(i11, i10, str);
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f19848c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = eg.m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    bd.b bVar = new bd.b(2, null, 26);
                    this.f19848c = 1;
                    obj = eg.c0.A(dVar, bVar, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Number) obj).intValue() == 0) {
                    return Unit.f19194a;
                }
                da.o oVar = new da.o(str);
                if (i11 > 0) {
                    oVar.f8340a.put("id", Integer.valueOf(i11));
                }
                if (i10 > 0) {
                    oVar.j(i10);
                    oVar.l(0L);
                    oVar.k(null);
                }
                Intrinsics.checkNotNullExpressionValue(oVar, "also(...)");
                ((ue.h) obj2).e(oVar);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(rd.a aVar, int i5, String str, int i10, int i11, Continuation continuation, int i12) {
        super(2, continuation);
        this.f19847b = i12;
        this.f19852g = aVar;
        this.f19848c = i5;
        this.f19849d = str;
        this.f19850e = i10;
        this.f19851f = i11;
    }
}
