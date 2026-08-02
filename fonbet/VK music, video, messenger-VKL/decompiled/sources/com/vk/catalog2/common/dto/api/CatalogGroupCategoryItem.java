package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;

/* compiled from: CatalogGroupCategoryItem.kt */
/* loaded from: classes16.dex */
public final class CatalogGroupCategoryItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogGroupCategoryItem> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final CatalogButton c;

    /* compiled from: CatalogGroupCategoryItem.kt */
    public static final class a extends aay<CatalogGroupCategoryItem> {
        @Override // xsna.aay
        public final CatalogGroupCategoryItem a(JSONObject jSONObject) {
            return new CatalogGroupCategoryItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogGroupCategoryItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogGroupCategoryItem a(Serializer serializer) {
            return new CatalogGroupCategoryItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogGroupCategoryItem[i];
        }
    }

    public CatalogGroupCategoryItem(String str, CatalogButton catalogButton) {
        this.b = str;
        this.c = catalogButton;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogGroupCategoryItem)) {
            return false;
        }
        CatalogGroupCategoryItem catalogGroupCategoryItem = (CatalogGroupCategoryItem) obj;
        return epx.f(this.b, catalogGroupCategoryItem.b) && epx.f(this.c, catalogGroupCategoryItem.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CatalogButton catalogButton = this.c;
        return hashCode + (catalogButton == null ? 0 : catalogButton.hashCode());
    }

    public final String toString() {
        return "CatalogGroupCategoryItem(id=" + this.b + ", clickAction=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogGroupCategoryItem(JSONObject jSONObject) {
        this(r0, r3 != null ? (CatalogButton) CatalogButton.b.a(r3) : null);
        String optString = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("click_action");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogGroupCategoryItem(Serializer serializer) {
        this(r0 == null ? "" : r0, (CatalogButton) serializer.G(CatalogButton.class.getClassLoader()));
        String H = serializer.H();
    }
}
