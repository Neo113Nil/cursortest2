package ha;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10431a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10432b;

    /* renamed from: c, reason: collision with root package name */
    public final d f10433c;

    /* renamed from: d, reason: collision with root package name */
    public final c f10434d;

    public a(int i5, String str, d dVar, c cVar) {
        this.f10431a = i5;
        this.f10432b = str;
        this.f10433c = dVar;
        this.f10434d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10431a == aVar.f10431a && Intrinsics.areEqual(this.f10432b, aVar.f10432b) && Intrinsics.areEqual(this.f10433c, aVar.f10433c) && Intrinsics.areEqual(this.f10434d, aVar.f10434d);
    }

    public final int hashCode() {
        int i5 = this.f10431a * 31;
        String str = this.f10432b;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f10433c;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f10434d;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "Identify(codeHttp=" + this.f10431a + ", errorHttp=" + this.f10432b + ", user=" + this.f10433c + ", prices=" + this.f10434d + ')';
    }
}
