package le;

import com.sports.insider.ui.pays.LivePayFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19876b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LivePayFragment f19878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(LivePayFragment livePayFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19876b = i5;
        this.f19878d = livePayFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19876b) {
            case 0:
                m mVar = new m(this.f19878d, continuation, 0);
                mVar.f19877c = obj;
                return mVar;
            default:
                m mVar2 = new m(this.f19878d, continuation, 1);
                mVar2.f19877c = obj;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19876b) {
        }
        return ((m) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19876b;
        LivePayFragment livePayFragment = this.f19878d;
        switch (i5) {
            case 0:
                eg.z zVar = (eg.z) this.f19877c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar = eg.m0.f9201a;
                return eg.c0.e(zVar, lg.d.f20063c, new l(livePayFragment, null, 0), 2);
            default:
                eg.z zVar2 = (eg.z) this.f19877c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = eg.m0.f9201a;
                return eg.c0.e(zVar2, lg.d.f20063c, new l(livePayFragment, null, 1), 2);
        }
    }
}
