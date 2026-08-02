package le;

import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.views.CheckPrice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayPremiumFragment f19884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(PayPremiumFragment payPremiumFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19883b = i5;
        this.f19884c = payPremiumFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19883b) {
            case 0:
                return new m1(this.f19884c, continuation, 0);
            default:
                return new m1(this.f19884c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19883b) {
        }
        return ((m1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        String u10;
        String concat;
        String l6;
        CheckPrice checkPrice;
        int i5 = this.f19883b;
        PayPremiumFragment payPremiumFragment = this.f19884c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                boolean z5 = true;
                if (l1.$EnumSwitchMapping$0[((androidx.lifecycle.g0) payPremiumFragment.getLifecycle()).f2169d.ordinal()] == 1) {
                    f2 H = payPremiumFragment.H();
                    androidx.lifecycle.p0 p0Var = H.H;
                    nc.f fVar = H.f19778p;
                    nc.f fVar2 = H.f19780s;
                    boolean z7 = fVar == null || fVar.expired();
                    if (fVar2 != null && !fVar2.expired()) {
                        z5 = false;
                    }
                    if (z7 && z5) {
                        p0Var.h(null);
                    } else {
                        if (z5) {
                            u10 = f2.u(fVar != null ? Long.valueOf(fVar.endTimeSecond()) : null);
                        } else if (z7) {
                            u10 = f2.u(fVar2 != null ? Long.valueOf(fVar2.endTimeSecond()) : null);
                        } else {
                            Long valueOf = fVar != null ? Long.valueOf(fVar.endTimeSecond()) : null;
                            Long valueOf2 = fVar2 != null ? Long.valueOf(fVar2.endTimeSecond()) : null;
                            u10 = (valueOf == null && valueOf2 == null) ? "" : valueOf == null ? f2.u(valueOf2) : valueOf2 == null ? f2.u(valueOf) : io.sentry.config.a.B((Math.min(valueOf.longValue(), valueOf2.longValue()) * 1000) - System.currentTimeMillis());
                        }
                        String str = H.G;
                        if (str != null && (concat = str.concat(" ")) != null && (l6 = r4.k.l(concat, u10)) != null) {
                            u10 = l6;
                        }
                        p0Var.h(u10);
                    }
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.w wVar = (ec.w) payPremiumFragment.f22459a;
                if (wVar == null || (checkPrice = wVar.f9035g) == null) {
                    return null;
                }
                return new Integer(checkPrice.getF7228i1());
        }
    }
}
