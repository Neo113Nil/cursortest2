package e3;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends l0 {
    @Override // e3.l0
    public final m0 c() {
        if (this.f8539a && this.f8541c.j.f8509d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        Intrinsics.checkNotNullParameter(this, "builder");
        return new a0(this.f8540b, this.f8541c, this.f8542d);
    }

    @Override // e3.l0
    public final l0 d() {
        return this;
    }
}
