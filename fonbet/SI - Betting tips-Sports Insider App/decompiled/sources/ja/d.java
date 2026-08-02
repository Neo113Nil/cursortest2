package ja;

import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f18408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18410c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18411d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18412e;

    public d(int i5, int i10, int i11, int i12, String lang) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        this.f18408a = i5;
        this.f18409b = lang;
        this.f18410c = i10;
        this.f18411d = i11;
        this.f18412e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18408a == dVar.f18408a && Intrinsics.areEqual(this.f18409b, dVar.f18409b) && this.f18410c == dVar.f18410c && this.f18411d == dVar.f18411d && this.f18412e == dVar.f18412e;
    }

    public final int hashCode() {
        return ((((k.j(this.f18408a * 31, 31, this.f18409b) + this.f18410c) * 31) + this.f18411d) * 31) + this.f18412e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestUpdateData(kindId=");
        sb2.append(this.f18408a);
        sb2.append(", lang=");
        sb2.append(this.f18409b);
        sb2.append(", timeStart=");
        sb2.append(this.f18410c);
        sb2.append(", timeEnd=");
        sb2.append(this.f18411d);
        sb2.append(", timeEndDownload=");
        return d9.e.i(sb2, this.f18412e, ')');
    }
}
