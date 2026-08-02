package ig;

import eg.a0;
import eg.c0;
import eg.e1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f11257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg.z f11258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f11259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg.h f11260d;

    public i(Ref.ObjectRef objectRef, eg.z zVar, k kVar, hg.h hVar) {
        this.f11257a = objectRef;
        this.f11258b = zVar;
        this.f11259c = kVar;
        this.f11260d = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, eg.t1] */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        h hVar;
        int i5;
        i iVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f11256e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f11256e = i10 - Integer.MIN_VALUE;
                Object obj2 = hVar.f11254c;
                lf.a aVar = lf.a.f20034a;
                i5 = hVar.f11256e;
                if (i5 != 0) {
                    h8.b.B(obj2);
                    e1 e1Var = (e1) this.f11257a.element;
                    if (e1Var != null) {
                        e1Var.k(new l("Child of the scoped flow was cancelled"));
                        hVar.f11252a = this;
                        hVar.f11253b = obj;
                        hVar.f11256e = 1;
                        if (e1Var.w(hVar) == aVar) {
                            return aVar;
                        }
                    }
                    iVar = this;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hVar.f11253b;
                    iVar = hVar.f11252a;
                    h8.b.B(obj2);
                }
                iVar.f11257a.element = c0.t(iVar.f11258b, null, a0.f9139d, new androidx.lifecycle.o(iVar.f11259c, iVar.f11260d, obj, (Continuation) null), 1);
                return Unit.f19194a;
            }
        }
        hVar = new h(this, continuation);
        Object obj22 = hVar.f11254c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = hVar.f11256e;
        if (i5 != 0) {
        }
        iVar.f11257a.element = c0.t(iVar.f11258b, null, a0.f9139d, new androidx.lifecycle.o(iVar.f11259c, iVar.f11260d, obj, (Continuation) null), 1);
        return Unit.f19194a;
    }
}
