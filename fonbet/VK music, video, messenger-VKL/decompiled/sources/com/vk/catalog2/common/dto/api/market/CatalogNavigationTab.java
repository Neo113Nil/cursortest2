package com.vk.catalog2.common.dto.api.market;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.market.catalog.CatalogMarketSorting;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.f370;
import xsna.fq;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CatalogNavigationTab.kt */
/* loaded from: classes16.dex */
public final class CatalogNavigationTab extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogNavigationTab> CREATOR = new b();
    public static final a m = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Image g;
    public final boolean h;
    public final Integer i;
    public final Integer j;
    public final CatalogMarketFilter k;
    public final CatalogMarketSorting l;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogNavigationTab> {
        @Override // xsna.aay
        public final CatalogNavigationTab a(JSONObject jSONObject) {
            return new CatalogNavigationTab(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogNavigationTab> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogNavigationTab a(Serializer serializer) {
            return new CatalogNavigationTab(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogNavigationTab[i];
        }
    }

    public CatalogNavigationTab(String str, String str2, String str3, String str4, String str5, Image image, boolean z, Integer num, Integer num2, CatalogMarketFilter catalogMarketFilter, CatalogMarketSorting catalogMarketSorting) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = image;
        this.h = z;
        this.i = num;
        this.j = num2;
        this.k = catalogMarketFilter;
        this.l = catalogMarketSorting;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.V(this.i);
        serializer.V(this.j);
        serializer.i0(this.k);
        serializer.i0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogNavigationTab)) {
            return false;
        }
        CatalogNavigationTab catalogNavigationTab = (CatalogNavigationTab) obj;
        return epx.f(this.b, catalogNavigationTab.b) && epx.f(this.c, catalogNavigationTab.c) && epx.f(this.d, catalogNavigationTab.d) && epx.f(this.e, catalogNavigationTab.e) && epx.f(this.f, catalogNavigationTab.f) && epx.f(this.g, catalogNavigationTab.g) && this.h == catalogNavigationTab.h && epx.f(this.i, catalogNavigationTab.i) && epx.f(this.j, catalogNavigationTab.j) && epx.f(this.k, catalogNavigationTab.k) && epx.f(this.l, catalogNavigationTab.l);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int b2 = qoy.b(fq.b(this.g, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.h);
        Integer num = this.i;
        int hashCode2 = (b2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CatalogMarketFilter catalogMarketFilter = this.k;
        int hashCode4 = (hashCode3 + (catalogMarketFilter == null ? 0 : catalogMarketFilter.hashCode())) * 31;
        CatalogMarketSorting catalogMarketSorting = this.l;
        return hashCode4 + (catalogMarketSorting != null ? catalogMarketSorting.hashCode() : 0);
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CatalogNavigationTab["), this.b, ']');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogNavigationTab(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, r0, r9, r10, r11, r14 != null ? new CatalogMarketSorting(r14) : null);
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("type");
        String optString4 = jSONObject.optString("target_url");
        String optString5 = jSONObject.optString("target_section_id");
        Image image = new Image(jSONObject.optJSONArray("icons"), null, 2, null);
        boolean optBoolean = jSONObject.optBoolean("is_featured");
        Integer x = f370.x(jSONObject, "category_tree_id");
        Integer x2 = f370.x(jSONObject, "root_category_id");
        JSONObject optJSONObject = jSONObject.optJSONObject("filter");
        CatalogMarketFilter catalogMarketFilter = optJSONObject != null ? new CatalogMarketFilter(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("sorting");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogNavigationTab(Serializer serializer) {
        this(r3, r4, r5, r6, r0 == null ? "" : r0, (Image) serializer.G(Image.class.getClassLoader()), serializer.m(), serializer.v(), serializer.v(), (CatalogMarketFilter) serializer.G(CatalogMarketFilter.class.getClassLoader()), (CatalogMarketSorting) serializer.G(CatalogMarketSorting.class.getClassLoader()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        String H5 = serializer.H();
    }
}
