package kh;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final q f19188a;

    public t(q connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f19188a = connection;
    }

    @Override // kh.v
    public final v a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // kh.v
    public final q b() {
        return this.f19188a;
    }

    @Override // kh.v
    public final boolean c() {
        return true;
    }

    @Override // kh.v, lh.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // kh.v
    public final u d() {
        throw new IllegalStateException("already connected");
    }

    @Override // kh.v
    public final u f() {
        throw new IllegalStateException("already connected");
    }
}
