package j1;

import g6.h0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f18198a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18199b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18200c;

    public f(int i5, String identityHash, String legacyIdentityHash) {
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyIdentityHash, "legacyIdentityHash");
        this.f18198a = i5;
        this.f18199b = identityHash;
        this.f18200c = legacyIdentityHash;
    }

    public abstract void a(s2.a aVar);

    public abstract void b(s2.a aVar);

    public abstract void c(s2.a aVar);

    public abstract void d(s2.a aVar);

    public abstract void e(s2.a aVar);

    public abstract void f(s2.a aVar);

    public abstract h0 g(s2.a aVar);

    public f(i iVar) {
        this.f18198a = 0;
        this.f18200c = new d();
        this.f18199b = iVar;
    }
}
