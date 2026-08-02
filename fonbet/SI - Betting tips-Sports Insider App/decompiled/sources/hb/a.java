package hb;

import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f10467a;

    /* renamed from: b, reason: collision with root package name */
    public String f10468b;

    /* renamed from: c, reason: collision with root package name */
    public String f10469c;

    /* renamed from: d, reason: collision with root package name */
    public int f10470d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10467a == aVar.f10467a && Intrinsics.areEqual(this.f10468b, aVar.f10468b) && Intrinsics.areEqual(this.f10469c, aVar.f10469c) && this.f10470d == aVar.f10470d;
    }

    public final int hashCode() {
        int j = k.j(this.f10467a * 31, 31, this.f10468b);
        String str = this.f10469c;
        return ((j + (str == null ? 0 : str.hashCode())) * 31) + this.f10470d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventData(localId=");
        sb2.append(this.f10467a);
        sb2.append(", event=");
        sb2.append(this.f10468b);
        sb2.append(", eventValue=");
        sb2.append(this.f10469c);
        sb2.append(", createdAt=");
        return d9.e.i(sb2, this.f10470d, ')');
    }
}
