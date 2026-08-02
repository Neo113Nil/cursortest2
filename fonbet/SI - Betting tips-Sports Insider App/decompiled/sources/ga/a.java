package ga;

import d9.e;
import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9909a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9910b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9911c;

    public a(int i5, String url, String image) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f9909a = i5;
        this.f9910b = url;
        this.f9911c = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9909a == aVar.f9909a && Intrinsics.areEqual(this.f9910b, aVar.f9910b) && Intrinsics.areEqual(this.f9911c, aVar.f9911c);
    }

    public final int hashCode() {
        return this.f9911c.hashCode() + k.j(this.f9909a * 31, 31, this.f9910b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertOptionData(id=");
        sb2.append(this.f9909a);
        sb2.append(", url=");
        sb2.append(this.f9910b);
        sb2.append(", image=");
        return e.k(sb2, this.f9911c, ')');
    }
}
