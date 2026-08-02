package ja;

import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18361b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18363d;

    public a(String order, String productPay, int i5, int i10) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(productPay, "productPay");
        this.f18360a = order;
        this.f18361b = productPay;
        this.f18362c = i5;
        this.f18363d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f18360a, aVar.f18360a) && Intrinsics.areEqual(this.f18361b, aVar.f18361b) && this.f18362c == aVar.f18362c && this.f18363d == aVar.f18363d;
    }

    public final int hashCode() {
        return ((k.j(this.f18360a.hashCode() * 31, 31, this.f18361b) + this.f18362c) * 31) + this.f18363d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrdersData(order=");
        sb2.append(this.f18360a);
        sb2.append(", productPay=");
        sb2.append(this.f18361b);
        sb2.append(", id=");
        sb2.append(this.f18362c);
        sb2.append(", success=");
        return d9.e.i(sb2, this.f18363d, ')');
    }
}
