package m4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f20415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20416b;

    /* renamed from: c, reason: collision with root package name */
    public final p f20417c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.l f20418d;

    public q(String str, String str2, p pVar, c4.l lVar) {
        this.f20415a = str;
        this.f20416b = str2;
        this.f20417c = pVar;
        this.f20418d = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f20415a, qVar.f20415a) && Intrinsics.areEqual(this.f20416b, qVar.f20416b) && Intrinsics.areEqual(this.f20417c, qVar.f20417c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f20418d, qVar.f20418d);
    }

    public final int hashCode() {
        return this.f20418d.f3595a.hashCode() + ((this.f20417c.f20414a.hashCode() + r4.k.j(this.f20415a.hashCode() * 31, 31, this.f20416b)) * 961);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f20415a + ", method=" + this.f20416b + ", headers=" + this.f20417c + ", body=null, extras=" + this.f20418d + ')';
    }
}
