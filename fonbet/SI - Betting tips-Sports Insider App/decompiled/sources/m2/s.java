package m2;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements b {

    /* renamed from: a, reason: collision with root package name */
    public final s2.b f20267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20268b;

    /* renamed from: c, reason: collision with root package name */
    public final FunctionReferenceImpl f20269c;

    /* renamed from: d, reason: collision with root package name */
    public final gf.t f20270d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(s2.b driver, String fileName, Function2 function2) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f20267a = driver;
        this.f20268b = fileName;
        this.f20269c = (FunctionReferenceImpl) function2;
        this.f20270d = gf.k.b(new a2.q(28, this));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // m2.b
    public final Object H(boolean z5, Function2 function2, mf.c cVar) {
        r rVar = (r) cVar.getContext().r(r.f20265b);
        q qVar = rVar != null ? rVar.f20266a : null;
        if (qVar != null) {
            return function2.invoke(qVar, cVar);
        }
        q qVar2 = new q(this.f20269c, (s2.a) this.f20270d.getValue());
        return eg.c0.A(new r(qVar2), new kd.e(function2, qVar2, (Continuation) null), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        gf.t tVar = this.f20270d;
        if (tVar.f10037b != gf.f0.f10021a) {
            ((s2.a) tVar.getValue()).close();
        }
    }
}
