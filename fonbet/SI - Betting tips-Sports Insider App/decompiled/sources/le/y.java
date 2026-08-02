package le;

import com.sports.insider.MyApp;
import com.sports.insider.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f19999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19998b = i5;
        this.f19999c = zVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19998b) {
            case 0:
                return new y(this.f19999c, continuation, 0);
            case 1:
                return new y(this.f19999c, continuation, 1);
            default:
                return new y(this.f19999c, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19998b) {
        }
        return ((y) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19998b;
        Continuation continuation = null;
        int i10 = 2;
        z zVar = this.f19999c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                com.google.firebase.messaging.x xVar = zVar.f20027y;
                xVar.getClass();
                jg.d dVar = MyApp.f6830c;
                lg.e eVar = eg.m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                zVar.f20007c = eg.c0.t(dVar, dVar2, null, new u(zVar, continuation, 1), 2);
                xVar.getClass();
                zVar.f20008d = eg.c0.t(dVar, dVar2, null, new u(zVar, continuation, i10), 2);
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ((s7.u) zVar.f20027y.f6185d).getClass();
                hg.g i11 = hg.u0.i(hg.u0.i(s7.u.e()));
                lg.e eVar2 = eg.m0.f9201a;
                lg.d dVar3 = lg.d.f20063c;
                int i12 = 3;
                zVar.f20006b = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.n(i11, dVar3), new kd.e(zVar, continuation, 13), 2), dVar3), new ge.o(i12, continuation, i12)), androidx.lifecycle.d1.i(zVar));
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                y1.a aVar4 = new y1.a(R.id.action_livePayFragment_to_liveFragment);
                Intrinsics.checkNotNullExpressionValue(aVar4, "actionLivePayFragmentToLiveFragment(...)");
                zVar.f20011g.h(new ic.i0(new ic.f(aVar4)));
                break;
        }
        return Unit.f19194a;
    }
}
