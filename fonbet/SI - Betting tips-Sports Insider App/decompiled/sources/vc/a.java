package vc;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import rh.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {
    public static void a(int i5, long j, String priceCurrencyCode, String productId) {
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (i5 <= 0) {
            g.f22531e = null;
            return;
        }
        JSONObject put = new JSONObject().put("announcementId", i5).put("product", productId).put("price", j).put("currency", priceCurrencyCode);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        JSONArray jSONArray = g.f22531e;
        if ((jSONArray != null ? jSONArray.length() : 0) <= 0) {
            g.f22531e = new JSONArray().put(put);
            return;
        }
        JSONArray jSONArray2 = g.f22531e;
        Object obj = jSONArray2 != null ? jSONArray2.get(0) : null;
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        Integer valueOf = jSONObject != null ? Integer.valueOf(jSONObject.getInt("announcementId")) : null;
        if (valueOf == null || valueOf.intValue() != i5) {
            g.f22531e = new JSONArray().put(put);
            return;
        }
        JSONArray jSONArray3 = g.f22531e;
        if (jSONArray3 != null) {
            jSONArray3.put(put);
        }
    }
}
