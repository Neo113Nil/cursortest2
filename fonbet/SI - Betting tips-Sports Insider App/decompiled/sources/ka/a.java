package ka;

import d9.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18946b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18947c;

    /* renamed from: d, reason: collision with root package name */
    public int f18948d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18949e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18950f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18951g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18952h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18953i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f18954k;

    /* renamed from: l, reason: collision with root package name */
    public int f18955l;

    public a(int i5, int i10, int i11, int i12, int i13, int i14, String str, String str2, int i15, String str3, String str4) {
        this.f18945a = i5;
        this.f18946b = i10;
        this.f18947c = i11;
        this.f18948d = i12;
        this.f18949e = i13;
        this.f18950f = i14;
        this.f18951g = str;
        this.f18952h = str2;
        this.f18953i = i15;
        this.j = str3;
        this.f18954k = str4;
    }

    public final String a(int i5) {
        String str = this.f18952h;
        if (i5 <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i5; i10++) {
            sb2.append(" ");
        }
        if (str == null) {
            return null;
        }
        return str + ((Object) sb2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18945a == aVar.f18945a && this.f18946b == aVar.f18946b && this.f18947c == aVar.f18947c && this.f18948d == aVar.f18948d && this.f18949e == aVar.f18949e && this.f18950f == aVar.f18950f && Intrinsics.areEqual(this.f18951g, aVar.f18951g) && Intrinsics.areEqual(this.f18952h, aVar.f18952h) && this.f18953i == aVar.f18953i && Intrinsics.areEqual(this.j, aVar.j) && Intrinsics.areEqual(this.f18954k, aVar.f18954k);
    }

    public final int hashCode() {
        int i5 = ((((((((((this.f18945a * 31) + this.f18946b) * 31) + this.f18947c) * 31) + this.f18948d) * 31) + this.f18949e) * 31) + this.f18950f) * 31;
        String str = this.f18951g;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18952h;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f18953i) * 31;
        String str3 = this.j;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18954k;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SupportData(id=");
        sb2.append(this.f18945a);
        sb2.append(", dateCreate=");
        sb2.append(this.f18946b);
        sb2.append(", dateUpdate=");
        sb2.append(this.f18947c);
        sb2.append(", stateRead=");
        sb2.append(this.f18948d);
        sb2.append(", readDate=");
        sb2.append(this.f18949e);
        sb2.append(", sendDate=");
        sb2.append(this.f18950f);
        sb2.append(", operatorName=");
        sb2.append(this.f18951g);
        sb2.append(", message=");
        sb2.append(this.f18952h);
        sb2.append(", type=");
        sb2.append(this.f18953i);
        sb2.append(", mime=");
        sb2.append(this.j);
        sb2.append(", content=");
        return e.k(sb2, this.f18954k, ')');
    }
}
