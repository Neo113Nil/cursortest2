package le;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f19923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f19924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.a f19925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Pair f19926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(d1 d1Var, ic.a aVar, ic.a aVar2, Pair pair, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19922b = i5;
        this.f19923c = d1Var;
        this.f19924d = aVar;
        this.f19925e = aVar2;
        this.f19926f = pair;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19922b) {
            case 0:
                return new r0(this.f19923c, this.f19924d, this.f19925e, this.f19926f, continuation, 0);
            default:
                return new r0(this.f19923c, this.f19924d, this.f19925e, this.f19926f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19922b) {
        }
        return ((r0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19922b;
        Pair pair = this.f19926f;
        ic.a aVar = this.f19925e;
        ic.a aVar2 = this.f19924d;
        d1 d1Var = this.f19923c;
        switch (i5) {
            case 0:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                d1Var.f19741s = aVar2;
                d1Var.f19742t = aVar;
                d1Var.L.h(pair);
                break;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                d1Var.f19743u = aVar2;
                d1Var.f19744v = aVar;
                d1Var.M.h(pair);
                break;
        }
        return Unit.f19194a;
    }
}
