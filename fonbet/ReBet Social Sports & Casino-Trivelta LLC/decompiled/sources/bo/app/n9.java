package bo.app;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25805a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f25806b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f25807c;

    public n9(int i10, Map responseHeaders, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        this.f25805a = i10;
        this.f25806b = responseHeaders;
        this.f25807c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return this.f25805a == n9Var.f25805a && Intrinsics.areEqual(this.f25806b, n9Var.f25806b) && Intrinsics.areEqual(this.f25807c, n9Var.f25807c);
    }

    public final int hashCode() {
        int hashCode = (this.f25806b.hashCode() + (Integer.hashCode(this.f25805a) * 31)) * 31;
        JSONObject jSONObject = this.f25807c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.f25805a + ", responseHeaders=" + this.f25806b + ", jsonResponse=" + this.f25807c + ")";
    }

    public /* synthetic */ n9(int i10, Map map, int i11) {
        this(i10, (i11 & 2) != 0 ? MapsKt.emptyMap() : map, (JSONObject) null);
    }
}
