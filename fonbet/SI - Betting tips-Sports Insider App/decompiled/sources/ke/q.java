package ke;

import com.sports.insider.ui.onboarding.NoEthernetFragment;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19052b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NoEthernetFragment f19054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(NoEthernetFragment noEthernetFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19052b = i5;
        this.f19054d = noEthernetFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19052b) {
            case 0:
                q qVar = new q(this.f19054d, continuation, 0);
                qVar.f19053c = obj;
                return qVar;
            case 1:
                q qVar2 = new q(this.f19054d, continuation, 1);
                qVar2.f19053c = obj;
                return qVar2;
            default:
                q qVar3 = new q(this.f19054d, continuation, 2);
                qVar3.f19053c = obj;
                return qVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19052b) {
        }
        return ((q) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19052b;
        int i10 = 4;
        Continuation continuation = null;
        NoEthernetFragment noEthernetFragment = this.f19054d;
        int i11 = 2;
        switch (i5) {
            case 0:
                z zVar = (z) this.f19053c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar = m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                c0.e(zVar, dVar, new p(noEthernetFragment, continuation, 0), 2);
                c0.e(zVar, dVar, new p(noEthernetFragment, continuation, 1), 2);
                c0.e(zVar, dVar, new p(noEthernetFragment, continuation, i11), 2);
                c0.e(zVar, dVar, new p(noEthernetFragment, continuation, 3), 2);
                c0.e(zVar, dVar, new p(noEthernetFragment, continuation, i10), 2);
                return c0.e(zVar, dVar, new p(noEthernetFragment, continuation, 5), 2);
            case 1:
                z zVar2 = (z) this.f19053c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = m0.f9201a;
                return c0.e(zVar2, lg.d.f20063c, new cd.j(noEthernetFragment, continuation, i10), 2);
            default:
                z zVar3 = (z) this.f19053c;
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar3 = m0.f9201a;
                c0.e(zVar3, lg.d.f20063c, new p(noEthernetFragment, continuation, 6), 2);
                return Unit.f19194a;
        }
    }
}
