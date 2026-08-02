package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f10713b;

    /* renamed from: c, reason: collision with root package name */
    public int f10714c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f10717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, Continuation continuation, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.f10716e = objectRef;
        this.f10717f = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f10717f, continuation, this.f10716e);
        lVar.f10715d = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create(new gg.o(((gg.o) obj).f10095a), (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, com.android.billingclient.api.a] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10714c;
        if (i5 == 0) {
            h8.b.B(obj);
            ?? r72 = ((gg.o) this.f10715d).f10095a;
            boolean z5 = r72 instanceof gg.n;
            objectRef = this.f10716e;
            if (!z5) {
                objectRef.element = r72;
            }
            if (z5) {
                gg.m mVar = r72 instanceof gg.m ? (gg.m) r72 : null;
                Throwable th2 = mVar != null ? mVar.f10093a : null;
                if (th2 != null) {
                    throw th2;
                }
                Object obj2 = objectRef.element;
                if (obj2 != null) {
                    Object obj3 = obj2 != ig.c.f11245b ? obj2 : null;
                    this.f10715d = r72;
                    this.f10713b = objectRef;
                    this.f10714c = 1;
                    if (this.f10717f.d(obj3, this) == aVar) {
                        return aVar;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.element = ig.c.f11247d;
            }
            return Unit.f19194a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = this.f10713b;
        h8.b.B(obj);
        objectRef = objectRef2;
        objectRef.element = ig.c.f11247d;
        return Unit.f19194a;
    }
}
