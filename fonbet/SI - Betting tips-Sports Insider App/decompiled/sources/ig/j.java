package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f11261b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f11263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg.h f11264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, hg.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f11263d = kVar;
        this.f11264e = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f11263d, this.f11264e, continuation);
        jVar.f11262c = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f11261b;
        if (i5 == 0) {
            h8.b.B(obj);
            eg.z zVar = (eg.z) this.f11262c;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            k kVar = this.f11263d;
            hg.g gVar = kVar.f11251d;
            i iVar = new i(objectRef, zVar, kVar, this.f11264e);
            this.f11261b = 1;
            if (gVar.a(iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }
}
