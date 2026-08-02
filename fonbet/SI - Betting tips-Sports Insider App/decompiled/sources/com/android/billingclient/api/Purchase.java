package com.android.billingclient.api;

import android.text.TextUtils;
import com.sports.insider.data.room.general.table.AccountTable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f3957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3958b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f3959c;

    public Purchase(String str, String str2) {
        this.f3957a = str;
        this.f3958b = str2;
        this.f3959c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f3959c;
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

    public final long b() {
        return this.f3959c.optLong("purchaseTime");
    }

    public final String c() {
        JSONObject jSONObject = this.f3959c;
        return jSONObject.optString(AccountTable.tokenColumn, jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f3957a, purchase.f3957a) && TextUtils.equals(this.f3958b, purchase.f3958b);
    }

    public final int hashCode() {
        return this.f3957a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f3957a));
    }
}
