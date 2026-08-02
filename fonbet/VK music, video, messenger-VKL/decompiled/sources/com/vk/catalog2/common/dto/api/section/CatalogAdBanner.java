package com.vk.catalog2.common.dto.api.section;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.vu5;

/* compiled from: CatalogSection.kt */
/* loaded from: classes16.dex */
public final class CatalogAdBanner extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogAdBanner> CREATOR = new b();
    public final int b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogAdBanner> {
        @Override // xsna.aay
        public final CatalogAdBanner a(JSONObject jSONObject) {
            return new CatalogAdBanner(jSONObject.optInt("slot_id"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogAdBanner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogAdBanner a(Serializer serializer) {
            return new CatalogAdBanner(serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogAdBanner[i];
        }
    }

    static {
        new a();
    }

    public CatalogAdBanner(int i) {
        this.b = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogAdBanner) && this.b == ((CatalogAdBanner) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("CatalogAdBanner(slotId="), this.b, ')');
    }
}
