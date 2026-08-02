package oi;

import java.io.IOException;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y extends gh.r0 {

    /* renamed from: c, reason: collision with root package name */
    public final gh.r0 f21356c;

    /* renamed from: d, reason: collision with root package name */
    public final BufferedSource f21357d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f21358e;

    public y(gh.r0 r0Var) {
        this.f21356c = r0Var;
        this.f21357d = Okio.buffer(new d4.b(this, r0Var.m0()));
    }

    @Override // gh.r0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21356c.close();
    }

    @Override // gh.r0
    public final long k() {
        return this.f21356c.k();
    }

    @Override // gh.r0
    public final BufferedSource m0() {
        return this.f21357d;
    }

    @Override // gh.r0
    public final gh.b0 n() {
        return this.f21356c.n();
    }
}
