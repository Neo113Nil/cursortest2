package le;

import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.views.CheckPrice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayExpressFragment f19792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(PayExpressFragment payExpressFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19791b = i5;
        this.f19792c = payExpressFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19791b) {
            case 0:
                return new g0(this.f19792c, continuation, 0);
            default:
                return new g0(this.f19792c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19791b) {
        }
        return ((g0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        String u10;
        String concat;
        String l6;
        CheckPrice checkPrice;
        int i5 = this.f19791b;
        PayExpressFragment payExpressFragment = this.f19792c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                boolean z5 = true;
                if (f0.$EnumSwitchMapping$0[((androidx.lifecycle.g0) payExpressFragment.getLifecycle()).f2169d.ordinal()] == 1) {
                    d1 H = payExpressFragment.H();
                    androidx.lifecycle.p0 p0Var = H.G;
                    nc.f fVar = H.f19738o;
                    nc.f fVar2 = H.f19740r;
                    boolean z7 = fVar == null || fVar.expired();
                    if (fVar2 != null && !fVar2.expired()) {
                        z5 = false;
                    }
                    if (z7 && z5) {
                        p0Var.h(null);
                    } else {
                        if (z5) {
                            u10 = d1.u(fVar != null ? Long.valueOf(fVar.endTimeSecond()) : null);
                        } else if (z7) {
                            u10 = d1.u(fVar2 != null ? Long.valueOf(fVar2.endTimeSecond()) : null);
                        } else {
                            Long valueOf = fVar != null ? Long.valueOf(fVar.endTimeSecond()) : null;
                            Long valueOf2 = fVar2 != null ? Long.valueOf(fVar2.endTimeSecond()) : null;
                            u10 = (valueOf == null && valueOf2 == null) ? "" : valueOf == null ? d1.u(valueOf2) : valueOf2 == null ? d1.u(valueOf) : io.sentry.config.a.B((Math.min(valueOf.longValue(), valueOf2.longValue()) * 1000) - System.currentTimeMillis());
                        }
                        String str = H.F;
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
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar == null || (checkPrice = vVar.f9024g) == null) {
                    return null;
                }
                return new Integer(checkPrice.getF7228i1());
        }
    }
}
