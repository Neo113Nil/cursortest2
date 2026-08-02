package com.vk.dto.search;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;

/* compiled from: SearchFilterItem.kt */
/* loaded from: classes18.dex */
public final class SearchFilterItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SearchFilterItem> CREATOR = new b();
    public static final a o = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final List<SearchQuickInnerFilterItem> n;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<SearchFilterItem> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
        @Override // xsna.aay
        public final SearchFilterItem a(JSONObject jSONObject) {
            ?? r14;
            String optString;
            String str;
            Serializer.c<SearchFilterItem> cVar = SearchFilterItem.CREATOR;
            JSONArray optJSONArray = jSONObject.optJSONArray("filter_selection_items");
            if (optJSONArray != null) {
                r14 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                int i = 0;
                while (i < length) {
                    int i2 = length;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    Serializer.c<SearchFilterItem> cVar2 = SearchFilterItem.CREATOR;
                    r14.add(new SearchQuickInnerFilterItem(jSONObject2.optString("title"), jSONObject2.optString("filter_parameter"), jSONObject2.optString("track_code"), jSONObject2.optString("filter_value_str"), Integer.valueOf(jSONObject2.optInt("filter_value_int")), jSONObject2.optBoolean("is_selected"), jSONObject2.optBoolean("is_default"), jSONObject2.optString("type"), jSONObject2.optBoolean("is_enabled"), jSONObject2.optBoolean("hide_title"), jSONObject2.optString("icon")));
                    i++;
                    length = i2;
                }
            } else {
                r14 = EmptyList.b;
            }
            List list = r14;
            JSONObject optJSONObject = jSONObject.optJSONObject("filter_binary_item");
            if (optJSONObject == null || (optString = optJSONObject.optString("filter_parameter")) == null) {
                optString = jSONObject.optString("filter_parameter");
            }
            String str2 = optString;
            String optString2 = jSONObject.optString("id");
            String optString3 = jSONObject.optString("title");
            String optString4 = jSONObject.optString("track_code");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("filter_binary_item");
            if (optJSONObject2 == null || (str = optJSONObject2.optString("filter_value_str")) == null) {
                str = "";
            }
            String str3 = str;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("filter_binary_item");
            Integer valueOf = optJSONObject3 != null ? Integer.valueOf(optJSONObject3.optInt("filter_value_int")) : null;
            JSONObject optJSONObject4 = jSONObject.optJSONObject("filter_binary_item");
            return new SearchFilterItem(optString2, optString3, str2, optString4, str3, valueOf, optJSONObject4 != null ? optJSONObject4.optBoolean("is_selected") : false, jSONObject.optBoolean("is_default"), jSONObject.optString("type"), jSONObject.optBoolean("is_enabled"), jSONObject.optBoolean("hide_title"), jSONObject.optString("icon"), list);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SearchFilterItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchFilterItem a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            String H4 = serializer.H();
            if (H4 == null) {
                H4 = "";
            }
            String H5 = serializer.H();
            if (H5 == null) {
                H5 = "";
            }
            Integer v = serializer.v();
            String str = H2;
            String str2 = H3;
            String str3 = H4;
            String str4 = H5;
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            String H6 = serializer.H();
            if (H6 == null) {
                H6 = "";
            }
            boolean m3 = serializer.m();
            String str5 = H6;
            boolean m4 = serializer.m();
            String H7 = serializer.H();
            String str6 = H7 != null ? H7 : "";
            ArrayList k = serializer.k(SearchQuickInnerFilterItem.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new SearchFilterItem(H, str, str2, str3, str4, v, m, m2, str5, m3, m4, str6, k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchFilterItem[i];
        }
    }

    public SearchFilterItem(String str, String str2, String str3, String str4, String str5, Integer num, boolean z, boolean z2, String str6, boolean z3, boolean z4, String str7, List<SearchQuickInnerFilterItem> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
        this.h = z;
        this.i = z2;
        this.j = str6;
        this.k = z3;
        this.l = z4;
        this.m = str7;
        this.n = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.V(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.j0(this.m);
        serializer.W(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFilterItem)) {
            return false;
        }
        SearchFilterItem searchFilterItem = (SearchFilterItem) obj;
        return epx.f(this.b, searchFilterItem.b) && epx.f(this.c, searchFilterItem.c) && epx.f(this.d, searchFilterItem.d) && epx.f(this.e, searchFilterItem.e) && epx.f(this.f, searchFilterItem.f) && epx.f(this.g, searchFilterItem.g) && this.h == searchFilterItem.h && this.i == searchFilterItem.i && epx.f(this.j, searchFilterItem.j) && this.k == searchFilterItem.k && this.l == searchFilterItem.l && epx.f(this.m, searchFilterItem.m) && epx.f(this.n, searchFilterItem.n);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        return this.n.hashCode() + urd0.a(qoy.b(qoy.b(urd0.a(qoy.b(qoy.b((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFilterItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", filterParameter=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", filterValue=");
        sb.append(this.f);
        sb.append(", filterValueInt=");
        sb.append(this.g);
        sb.append(", filterIsSelected=");
        sb.append(this.h);
        sb.append(", filterIsDefault=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(", isEnabled=");
        sb.append(this.k);
        sb.append(", hideTitle=");
        sb.append(this.l);
        sb.append(", icon=");
        sb.append(this.m);
        sb.append(", innerFilters=");
        return ms9.a(')', sb, this.n);
    }
}
