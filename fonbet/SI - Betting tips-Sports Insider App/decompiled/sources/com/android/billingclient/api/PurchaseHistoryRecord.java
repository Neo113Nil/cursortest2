package com.android.billingclient.api;

import android.text.TextUtils;
import com.sports.insider.data.room.general.table.AccountTable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    public final String f3960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3961b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f3962c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f3960a = str;
        this.f3961b = str2;
        this.f3962c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f3962c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                    arrayList.add(optJSONArray.optString(i5));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f3962c;
        return jSONObject.optString(AccountTable.tokenColumn, jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f3960a, purchaseHistoryRecord.f3960a) && TextUtils.equals(this.f3961b, purchaseHistoryRecord.f3961b);
    }

    public final int hashCode() {
        return this.f3960a.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f3960a));
    }
}
