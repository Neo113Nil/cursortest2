package kh;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    public final u f19123a;

    public j(Throwable e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        this.f19123a = new u(this, e7, 2);
    }

    @Override // kh.v
    public final v a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // kh.v
    public final q b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // kh.v
    public final boolean c() {
        return false;
    }

    @Override // kh.v, lh.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // kh.v
    public final u d() {
        return this.f19123a;
    }

    @Override // kh.v
    public final u f() {
        return this.f19123a;
    }
}
