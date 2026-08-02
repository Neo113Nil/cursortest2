package com.vk.catalog2.common.dto.api.market;

import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.urd0;

/* compiled from: CatalogMarketGroupInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogMarketGroupInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketGroupInfo> CREATOR = new b();
    public static final a h = new a();
    public final String b;
    public final CatalogLink c;
    public final String d;
    public final List<CatalogLink> e;
    public final CatalogLink f;
    public final List<CatalogLink> g;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogMarketGroupInfo> {
        @Override // xsna.aay
        public final CatalogMarketGroupInfo a(JSONObject jSONObject) {
            return new CatalogMarketGroupInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogMarketGroupInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketGroupInfo a(Serializer serializer) {
            return new CatalogMarketGroupInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketGroupInfo[i];
        }
    }

    public CatalogMarketGroupInfo(String str, CatalogLink catalogLink, String str2, List<CatalogLink> list, CatalogLink catalogLink2, List<CatalogLink> list2) {
        this.b = str;
        this.c = catalogLink;
        this.d = str2;
        this.e = list;
        this.f = catalogLink2;
        this.g = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.o0(this.e);
        serializer.i0(this.f);
        serializer.o0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketGroupInfo)) {
            return false;
        }
        CatalogMarketGroupInfo catalogMarketGroupInfo = (CatalogMarketGroupInfo) obj;
        return epx.f(this.b, catalogMarketGroupInfo.b) && epx.f(this.c, catalogMarketGroupInfo.c) && epx.f(this.d, catalogMarketGroupInfo.d) && epx.f(this.e, catalogMarketGroupInfo.e) && epx.f(this.f, catalogMarketGroupInfo.f) && epx.f(this.g, catalogMarketGroupInfo.g);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        CatalogLink catalogLink = this.f;
        int hashCode = (a2 + (catalogLink == null ? 0 : catalogLink.hashCode())) * 31;
        List<CatalogLink> list = this.g;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMarketGroupInfo(id=");
        sb.append(this.b);
        sb.append(", header=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", images=");
        sb.append(this.e);
        sb.append(", body=");
        sb.append(this.f);
        sb.append(", users=");
        return ms9.a(')', sb, this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketGroupInfo(JSONObject jSONObject) {
        this(r2, r3, r4, r6, r7, r5 == 0 ? EmptyList.b : r5);
        List list;
        String optString = jSONObject.optString("id");
        CatalogLink catalogLink = new CatalogLink(jSONObject.optJSONObject("header"));
        String optString2 = jSONObject.optString("url");
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        List list2 = 0;
        if (optJSONArray != null) {
            list = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    list.add(new CatalogLink(optJSONObject));
                }
            }
        } else {
            list = 0;
        }
        list = list == 0 ? EmptyList.b : list;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("body");
        CatalogLink catalogLink2 = optJSONObject2 != null ? new CatalogLink(optJSONObject2) : null;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("users");
        if (optJSONArray2 != null) {
            list2 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    list2.add(new CatalogLink(optJSONObject3));
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketGroupInfo(Serializer serializer) {
        this(r3, r4, r5, serializer.j(r1), (CatalogLink) serializer.G(CatalogLink.class.getClassLoader()), serializer.j(r1));
        String H = serializer.H();
        String str = H == null ? "" : H;
        CatalogLink catalogLink = (CatalogLink) serializer.G(CatalogLink.class.getClassLoader());
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        Serializer.c<CatalogLink> cVar = CatalogLink.CREATOR;
    }
}
