package r4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f22306c;

    /* renamed from: a, reason: collision with root package name */
    public final c f22307a;

    /* renamed from: b, reason: collision with root package name */
    public final c f22308b;

    static {
        b bVar = b.f22292a;
        f22306c = new i(bVar, bVar);
    }

    public i(c cVar, c cVar2) {
        this.f22307a = cVar;
        this.f22308b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f22307a, iVar.f22307a) && Intrinsics.areEqual(this.f22308b, iVar.f22308b);
    }

    public final int hashCode() {
        return this.f22308b.hashCode() + (this.f22307a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f22307a + ", height=" + this.f22308b + ')';
    }
}
