package com.vk.catalog2.common.dto.api.layout;

import com.vk.catalog2.common.dto.api.layout.GridItemType;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* compiled from: CatalogBannerLayout.kt */
/* loaded from: classes16.dex */
public final class CatalogBannerLayout extends CatalogLayout {
    public static final Serializer.c<CatalogBannerLayout> CREATOR = new a();
    public final GridItemType m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogBannerLayout> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogBannerLayout a(Serializer serializer) {
            return new CatalogBannerLayout(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogBannerLayout[i];
        }
    }

    public CatalogBannerLayout(JSONObject jSONObject) {
        super(jSONObject);
        GridItemType.a aVar = GridItemType.Companion;
        String optString = jSONObject.optString("type");
        aVar.getClass();
        this.m = GridItemType.a.a(optString);
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.m.getId());
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("type", this.m.name());
        return e5;
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return CatalogBannerLayout.class.equals(obj != null ? obj.getClass() : null) && super.equals(obj) && this.m == ((CatalogBannerLayout) obj).m;
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout
    public final int hashCode() {
        return this.m.hashCode() + (super.hashCode() * 31);
    }

    public CatalogBannerLayout(Serializer serializer) {
        super(serializer);
        GridItemType.a aVar = GridItemType.Companion;
        String H = serializer.H();
        aVar.getClass();
        this.m = GridItemType.a.a(H);
    }
}
