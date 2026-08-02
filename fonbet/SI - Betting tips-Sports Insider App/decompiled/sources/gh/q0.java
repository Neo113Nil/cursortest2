package gh;

import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f10293c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f10295e;

    public q0(b0 b0Var, long j, BufferedSource bufferedSource) {
        this.f10293c = b0Var;
        this.f10294d = j;
        this.f10295e = bufferedSource;
    }

    @Override // gh.r0
    public final long k() {
        return this.f10294d;
    }

    @Override // gh.r0
    public final BufferedSource m0() {
        return this.f10295e;
    }

    @Override // gh.r0
    public final b0 n() {
        return this.f10293c;
    }
}
