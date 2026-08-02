package i4;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import q4.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f10945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q4.h f10949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10951h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c4.i f10952i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, q4.h hVar2, Object obj, Ref.ObjectRef objectRef3, c4.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f10946c = hVar;
        this.f10947d = objectRef;
        this.f10948e = objectRef2;
        this.f10949f = hVar2;
        this.f10950g = obj;
        this.f10951h = objectRef3;
        this.f10952i = iVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f10946c, this.f10947d, this.f10948e, this.f10949f, this.f10950g, this.f10951h, this.f10952i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10945b;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            return obj;
        }
        h8.b.B(obj);
        f4.l lVar = (f4.l) this.f10947d.element;
        c4.e eVar = (c4.e) this.f10948e.element;
        n nVar = (n) this.f10951h.element;
        this.f10945b = 1;
        Object a7 = h.a(this.f10946c, lVar, eVar, this.f10949f, this.f10950g, nVar, this.f10952i, this);
        return a7 == aVar ? aVar : a7;
    }
}
