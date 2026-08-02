package m2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f20280b;

    /* renamed from: c, reason: collision with root package name */
    public int f20281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f20283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Ref.ObjectRef objectRef, w wVar, Continuation continuation) {
        super(2, continuation);
        this.f20282d = objectRef;
        this.f20283e = wVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f20282d, this.f20283e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        T t3;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20281c;
        if (i5 == 0) {
            h8.b.B(obj);
            Ref.ObjectRef objectRef2 = this.f20282d;
            this.f20280b = objectRef2;
            this.f20281c = 1;
            Object a7 = this.f20283e.a(this);
            if (a7 == aVar) {
                return aVar;
            }
            objectRef = objectRef2;
            t3 = a7;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.f20280b;
            h8.b.B(obj);
            t3 = obj;
        }
        objectRef.element = t3;
        return Unit.f19194a;
    }
}
