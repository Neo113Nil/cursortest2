package m2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public int f20257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f20258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2.b0 f20259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf.i f20260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(q qVar, k2.b0 b0Var, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f20258c = qVar;
        this.f20259d = b0Var;
        this.f20260e = (mf.i) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        return new p(this.f20258c, this.f20259d, this.f20260e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p) create((Continuation) obj)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20257b;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            return obj;
        }
        h8.b.B(obj);
        this.f20257b = 1;
        Object e7 = this.f20258c.e(this.f20259d, this.f20260e, this);
        return e7 == aVar ? aVar : e7;
    }
}
