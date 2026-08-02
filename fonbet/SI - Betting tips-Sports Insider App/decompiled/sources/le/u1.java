package le;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f19962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f19963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.a f19964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Pair f19965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(f2 f2Var, ic.a aVar, ic.a aVar2, Pair pair, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19961b = i5;
        this.f19962c = f2Var;
        this.f19963d = aVar;
        this.f19964e = aVar2;
        this.f19965f = pair;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19961b) {
            case 0:
                return new u1(this.f19962c, this.f19963d, this.f19964e, this.f19965f, continuation, 0);
            default:
                return new u1(this.f19962c, this.f19963d, this.f19964e, this.f19965f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19961b) {
        }
        return ((u1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19961b;
        Pair pair = this.f19965f;
        ic.a aVar = this.f19964e;
        ic.a aVar2 = this.f19963d;
        f2 f2Var = this.f19962c;
        switch (i5) {
            case 0:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                f2Var.f19781t = aVar2;
                f2Var.f19782u = aVar;
                f2Var.M.h(pair);
                break;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                f2Var.f19783v = aVar2;
                f2Var.f19784w = aVar;
                f2Var.N.h(pair);
                break;
        }
        return Unit.f19194a;
    }
}
