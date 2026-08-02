package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public int f10707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, Continuation continuation, Ref.ObjectRef objectRef) {
        super(1, continuation);
        this.f10708c = hVar;
        this.f10709d = objectRef;
    }

    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f10708c, continuation, this.f10709d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((k) create((Continuation) obj)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10707b;
        Ref.ObjectRef objectRef = this.f10709d;
        if (i5 == 0) {
            h8.b.B(obj);
            com.android.billingclient.api.a aVar2 = ig.c.f11245b;
            Object obj2 = objectRef.element;
            if (obj2 == aVar2) {
                obj2 = null;
            }
            this.f10707b = 1;
            if (this.f10708c.d(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        objectRef.element = null;
        return Unit.f19194a;
    }
}
