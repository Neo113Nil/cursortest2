package q4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c4.m f21935a;

    /* renamed from: b, reason: collision with root package name */
    public final h f21936b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f21937c;

    public d(c4.m mVar, h hVar, Throwable th2) {
        this.f21935a = mVar;
        this.f21936b = hVar;
        this.f21937c = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f21935a, dVar.f21935a) && Intrinsics.areEqual(this.f21936b, dVar.f21936b) && Intrinsics.areEqual(this.f21937c, dVar.f21937c);
    }

    @Override // q4.k
    public final c4.m getImage() {
        return this.f21935a;
    }

    public final int hashCode() {
        c4.m mVar = this.f21935a;
        return this.f21937c.hashCode() + ((this.f21936b.hashCode() + ((mVar == null ? 0 : mVar.hashCode()) * 31)) * 31);
    }

    @Override // q4.k
    public final h s() {
        return this.f21936b;
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f21935a + ", request=" + this.f21936b + ", throwable=" + this.f21937c + ')';
    }
}
