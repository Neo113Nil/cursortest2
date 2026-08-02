package com.vk.catalog2.common.dto.ui.market;

import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategoryMappings;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.jgp;

/* compiled from: UIBlockNavigationTab.kt */
/* loaded from: classes16.dex */
public final class UIBlockNavigationTab extends UIBlock {
    public static final Serializer.c<UIBlockNavigationTab> CREATOR = new a();
    public final List<CatalogMarketCategoryMappings> A;
    public final CatalogClassifiedYoulaCity B;
    public final CatalogNavigationTab y;
    public final Map<Integer, CatalogMarketCategory> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockNavigationTab> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockNavigationTab a(Serializer serializer) {
            return new UIBlockNavigationTab(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockNavigationTab[i];
        }
    }

    public UIBlockNavigationTab(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogNavigationTab catalogNavigationTab, Map<Integer, CatalogMarketCategory> map, List<CatalogMarketCategoryMappings> list, CatalogClassifiedYoulaCity catalogClassifiedYoulaCity) {
        super(aVar);
        this.y = catalogNavigationTab;
        this.z = map;
        this.A = list;
        this.B = catalogClassifiedYoulaCity;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        Map<Integer, CatalogMarketCategory> map = this.z;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.S(((Number) entry.getKey()).intValue());
                serializer.i0((Serializer.StreamParcelable) entry.getValue());
            }
        }
        serializer.W(this.A);
        serializer.i0(this.B);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockNavigationTab) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockNavigationTab uIBlockNavigationTab = (UIBlockNavigationTab) obj;
        return epx.f(this.y, uIBlockNavigationTab.y) && epx.f(this.z, uIBlockNavigationTab.z) && epx.f(this.A, uIBlockNavigationTab.A) && epx.f(this.B, uIBlockNavigationTab.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "NAVIGATION_TAB[" + this.b + "]<" + this.d + ": " + this.e + '>';
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        CatalogNavigationTab catalogNavigationTab = this.y;
        CatalogNavigationTab catalogNavigationTab2 = new CatalogNavigationTab(catalogNavigationTab.b, catalogNavigationTab.c, catalogNavigationTab.d, catalogNavigationTab.e, catalogNavigationTab.f, catalogNavigationTab.g, catalogNavigationTab.h, catalogNavigationTab.i, catalogNavigationTab.j, catalogNavigationTab.k, catalogNavigationTab.l);
        HashMap hashMap = new HashMap(this.z);
        ArrayList arrayList = new ArrayList(this.A);
        CatalogClassifiedYoulaCity catalogClassifiedYoulaCity = this.B;
        return new UIBlockNavigationTab(Ab, catalogNavigationTab2, hashMap, arrayList, catalogClassifiedYoulaCity != null ? new CatalogClassifiedYoulaCity(catalogClassifiedYoulaCity.b, catalogClassifiedYoulaCity.c, catalogClassifiedYoulaCity.d, catalogClassifiedYoulaCity.e) : null);
    }

    public UIBlockNavigationTab(Serializer serializer) {
        super(serializer);
        Map<Integer, CatalogMarketCategory> map;
        this.y = (CatalogNavigationTab) serializer.G(CatalogNavigationTab.class.getClassLoader());
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u = serializer.u();
            if (u >= 0) {
                map = new LinkedHashMap<>();
                for (int i = 0; i < u; i++) {
                    Integer valueOf = Integer.valueOf(serializer.u());
                    CatalogMarketCategory catalogMarketCategory = (CatalogMarketCategory) serializer.G(CatalogMarketCategory.class.getClassLoader());
                    if (catalogMarketCategory != null) {
                        map.put(valueOf, catalogMarketCategory);
                    }
                }
            } else {
                map = jgp.b;
            }
            this.z = map;
            List<CatalogMarketCategoryMappings> l = serializer.l(CatalogMarketCategoryMappings.class.getClassLoader());
            this.A = l == null ? EmptyList.b : l;
            this.B = (CatalogClassifiedYoulaCity) serializer.G(CatalogClassifiedYoulaCity.class.getClassLoader());
        } finally {
        }
    }
}
