package la;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19538b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19539c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f19540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19538b = i5;
        this.f19540d = mVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19538b) {
            case 0:
                l lVar = new l(this.f19540d, continuation, 0);
                lVar.f19539c = obj;
                return lVar;
            case 1:
                l lVar2 = new l(this.f19540d, continuation, 1);
                lVar2.f19539c = obj;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f19540d, continuation, 2);
                lVar3.f19539c = obj;
                return lVar3;
            case 3:
                l lVar4 = new l(this.f19540d, continuation, 3);
                lVar4.f19539c = obj;
                return lVar4;
            default:
                l lVar5 = new l(this.f19540d, continuation, 4);
                lVar5.f19539c = obj;
                return lVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19538b) {
        }
        return ((l) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19538b;
        Continuation continuation = null;
        m mVar = this.f19540d;
        int i10 = 2;
        switch (i5) {
            case 0:
                eg.z zVar = (eg.z) this.f19539c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar = eg.m0.f9201a;
                return eg.c0.e(zVar, lg.d.f20063c, new k(mVar, continuation, 0), 2);
            case 1:
                eg.z zVar2 = (eg.z) this.f19539c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = eg.m0.f9201a;
                return eg.c0.e(zVar2, lg.d.f20063c, new androidx.lifecycle.b(mVar, continuation, 12), 2);
            case 2:
                eg.z zVar3 = (eg.z) this.f19539c;
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar3 = eg.m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                eg.y yVar = new eg.y("initAppMetricId");
                dVar.getClass();
                return eg.c0.e(zVar3, kotlin.coroutines.e.c(dVar, yVar), new k(mVar, continuation, 1), 2);
            case 3:
                eg.z zVar4 = (eg.z) this.f19539c;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar4 = eg.m0.f9201a;
                return eg.c0.e(zVar4, lg.d.f20063c, new k(mVar, continuation, i10), 2);
            default:
                eg.z zVar5 = (eg.z) this.f19539c;
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar5 = eg.m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                eg.y yVar2 = new eg.y("initPushToken");
                dVar2.getClass();
                return eg.c0.e(zVar5, kotlin.coroutines.e.c(dVar2, yVar2), new androidx.lifecycle.o(mVar, continuation, 21), 2);
        }
    }
}
