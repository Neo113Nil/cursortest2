package pd;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.sports.insider.ui.activities.a f21788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i5, com.sports.insider.ui.activities.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f21787b = i5;
        this.f21788c = aVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21787b) {
            case 0:
                return new r(0, this.f21788c, continuation);
            case 1:
                return new r(1, this.f21788c, continuation);
            default:
                return new r(2, this.f21788c, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21787b) {
        }
        return ((r) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        int i5 = 2;
        switch (this.f21787b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                int i10 = com.sports.insider.ui.activities.a.G;
                pc.u uVar = (pc.u) y3.m(pc.u.class, null, 6);
                uVar.getClass();
                jg.d dVar = MyApp.f6830c;
                lg.e eVar = m0.f9201a;
                eg.y yVar = new eg.y("ObserveOnErrorEvent");
                eVar.getClass();
                uVar.f21719u = eg.c0.t(dVar, kotlin.coroutines.e.c(eVar, yVar), null, new pc.e(uVar, continuation, i5), 2);
                uVar.f21718t = eg.c0.t(dVar, kotlin.coroutines.e.c(eVar, new eg.y("ObserveOnPurchase")), null, new pc.q(uVar, continuation, 0), 2);
                ((pc.u) y3.m(pc.u.class, null, 6)).getClass();
                if (!pc.u.n().c()) {
                    ((pc.u) y3.m(pc.u.class, null, 6)).getClass();
                    pc.u.n().a();
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                int i11 = com.sports.insider.ui.activities.a.G;
                s7.u uVar2 = new s7.u(22);
                jg.d dVar2 = MyApp.f6830c;
                lg.e eVar2 = m0.f9201a;
                lg.d dVar3 = lg.d.f20063c;
                eg.y yVar2 = new eg.y("StateInAppBillingUseCase");
                dVar3.getClass();
                eg.c0.t(dVar2, kotlin.coroutines.e.c(dVar3, yVar2), null, new ve.p(uVar2, continuation, 15), 2);
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                com.google.android.play.core.appupdate.e eVar3 = (com.google.android.play.core.appupdate.e) this.f21788c.B.getValue();
                y yVar3 = this.f21788c.C;
                synchronized (eVar3) {
                    eVar3.f5998b.b(yVar3);
                }
                return Unit.f19194a;
        }
    }
}
