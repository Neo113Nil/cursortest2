package oi;

import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z extends gh.r0 {

    /* renamed from: c, reason: collision with root package name */
    public final gh.b0 f21361c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21362d;

    public z(gh.b0 b0Var, long j) {
        this.f21361c = b0Var;
        this.f21362d = j;
    }

    @Override // gh.r0
    public final long k() {
        return this.f21362d;
    }

    @Override // gh.r0
    public final BufferedSource m0() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // gh.r0
    public final gh.b0 n() {
        return this.f21361c;
    }
}
