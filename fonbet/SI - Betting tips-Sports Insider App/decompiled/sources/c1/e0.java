package c1;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public Serializable f3364b;

    /* renamed from: c, reason: collision with root package name */
    public int f3365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f3367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f3368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Ref.ObjectRef objectRef, i0 i0Var, Ref.IntRef intRef, Continuation continuation) {
        super(1, continuation);
        this.f3366d = objectRef;
        this.f3367e = i0Var;
        this.f3368f = intRef;
    }

    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        return new e0(this.f3366d, this.f3367e, this.f3368f, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e0) create((Continuation) obj)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ref.ObjectRef objectRef;
        T t3;
        Ref.IntRef intRef;
        Object obj3;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f3365c;
        Ref.IntRef intRef2 = this.f3368f;
        Ref.ObjectRef objectRef2 = this.f3366d;
        i0 i0Var = this.f3367e;
        try {
        } catch (b unused) {
            Object obj4 = objectRef2.element;
            this.f3364b = intRef2;
            this.f3365c = 3;
            Object j = i0Var.j(obj4, true, this);
            obj2 = j;
        }
        if (i5 == 0) {
            h8.b.B(obj);
            this.f3364b = objectRef2;
            this.f3365c = 1;
            Object i10 = i0Var.i(this);
            if (i10 == aVar) {
                return aVar;
            }
            objectRef = objectRef2;
            t3 = i10;
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    intRef = (Ref.IntRef) this.f3364b;
                    h8.b.B(obj);
                    obj3 = obj;
                    intRef.element = ((Number) obj3).intValue();
                    return Unit.f19194a;
                }
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef2 = (Ref.IntRef) this.f3364b;
                h8.b.B(obj);
                obj2 = obj;
                intRef2.element = ((Number) obj2).intValue();
                return Unit.f19194a;
            }
            objectRef = (Ref.ObjectRef) this.f3364b;
            h8.b.B(obj);
            t3 = obj;
        }
        objectRef.element = t3;
        b1 g10 = i0Var.g();
        this.f3364b = intRef2;
        this.f3365c = 2;
        Integer a7 = g10.a();
        if (a7 == aVar) {
            return aVar;
        }
        intRef = intRef2;
        obj3 = a7;
        intRef.element = ((Number) obj3).intValue();
        return Unit.f19194a;
    }
}
