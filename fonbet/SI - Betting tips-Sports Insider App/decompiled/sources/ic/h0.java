package ic;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public long f11121a;

    /* renamed from: b, reason: collision with root package name */
    public String f11122b;

    /* renamed from: c, reason: collision with root package name */
    public String f11123c;

    /* renamed from: d, reason: collision with root package name */
    public String f11124d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f11121a == h0Var.f11121a && Intrinsics.areEqual(this.f11122b, h0Var.f11122b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f11123c, h0Var.f11123c) && Intrinsics.areEqual(this.f11124d, h0Var.f11124d);
    }

    public final int hashCode() {
        long j = this.f11121a;
        int j6 = r4.k.j(((int) (j ^ (j >>> 32))) * 31, 961, this.f11122b);
        String str = this.f11123c;
        return this.f11124d.hashCode() + ((j6 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("productId", this.f11122b);
        jSONObject.put("subscriptionId", (Object) null);
        jSONObject.put("orderId", this.f11123c);
        jSONObject.put("purchaseToken", this.f11124d);
        jSONObject.put("purchaseTime", this.f11121a);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
