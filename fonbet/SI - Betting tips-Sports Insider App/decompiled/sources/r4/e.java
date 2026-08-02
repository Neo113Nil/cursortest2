package r4;

import c4.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: b, reason: collision with root package name */
    public final i f22296b;

    public e(i iVar) {
        this.f22296b = iVar;
    }

    @Override // r4.j
    public final Object a(t tVar) {
        return this.f22296b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f22296b, ((e) obj).f22296b);
    }

    public final int hashCode() {
        return this.f22296b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f22296b + ')';
    }
}
