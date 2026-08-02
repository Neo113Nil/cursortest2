package com.vk.catalog2.common.dto.api.market;

import com.vk.core.serialize.Serializer;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.arm0;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.f370;
import xsna.ms9;

/* compiled from: CatalogMarketCategoryMappings.kt */
/* loaded from: classes16.dex */
public final class CatalogMarketCategoryMappings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketCategoryMappings> CREATOR = new b();
    public static final a g = new a();
    public final String b;
    public final List<String> c;
    public final CatalogMarketCategoryContext.Context d;
    public final CatalogMarketCategoryContext.Context e;
    public final ArrayList f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogMarketCategoryMappings> {
        @Override // xsna.aay
        public final CatalogMarketCategoryMappings a(JSONObject jSONObject) {
            return new CatalogMarketCategoryMappings(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogMarketCategoryMappings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketCategoryMappings a(Serializer serializer) {
            return new CatalogMarketCategoryMappings(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketCategoryMappings[i];
        }
    }

    public CatalogMarketCategoryMappings(String str, List<String> list) {
        this.b = str;
        this.c = list;
        List<String> b0 = drm0.b0(str, new char[]{','}, 0, 6);
        ArrayList arrayList = new ArrayList(c5g.u(b0, 10));
        for (String str2 : b0) {
            CatalogMarketCategoryContext.Context.Companion.getClass();
            arrayList.add(CatalogMarketCategoryContext.Context.a.a(str2));
        }
        this.d = (CatalogMarketCategoryContext.Context) arrayList.get(0);
        this.e = (CatalogMarketCategoryContext.Context) arrayList.get(1);
        List<String> list2 = this.c;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List b02 = drm0.b0((String) it.next(), new char[]{','}, 0, 6);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = b02.iterator();
            while (it2.hasNext()) {
                Integer m = arm0.m(10, (String) it2.next());
                if (m != null) {
                    arrayList3.add(m);
                }
            }
            arrayList2.add(arrayList3);
        }
        this.f = arrayList2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.l0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketCategoryMappings)) {
            return false;
        }
        CatalogMarketCategoryMappings catalogMarketCategoryMappings = (CatalogMarketCategoryMappings) obj;
        return epx.f(this.b, catalogMarketCategoryMappings.b) && epx.f(this.c, catalogMarketCategoryMappings.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMarketCategoryMappings(originalContexts=");
        sb.append(this.b);
        sb.append(", originalMappings=");
        return ms9.a(')', sb, this.c);
    }

    public CatalogMarketCategoryMappings(JSONObject jSONObject) {
        this(jSONObject.getString("mapping"), f370.O(jSONObject.getJSONArray("items")));
    }

    public CatalogMarketCategoryMappings(Serializer serializer) {
        this(serializer.H(), com.vk.core.serialize.a.a(serializer));
    }
}
