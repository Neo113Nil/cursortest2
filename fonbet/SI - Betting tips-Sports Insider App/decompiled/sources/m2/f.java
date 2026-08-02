package m2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f20216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f20217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function2 function2, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f20217c = function2;
        this.f20218d = objectRef;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f20217c, this.f20218d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20216b;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            return obj;
        }
        h8.b.B(obj);
        Object obj2 = this.f20218d.element;
        this.f20216b = 1;
        Object invoke = this.f20217c.invoke(obj2, this);
        return invoke == aVar ? aVar : invoke;
    }
}
