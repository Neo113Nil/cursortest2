package com.vk.catalog2.common.dto.api.sport;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogSportMatchItem.kt */
/* loaded from: classes16.dex */
public final class CatalogSportMatchItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSportMatchItem> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSportMatchItem> {
        @Override // xsna.aay
        public final CatalogSportMatchItem a(JSONObject jSONObject) {
            Serializer.c<CatalogSportMatchItem> cVar = CatalogSportMatchItem.CREATOR;
            return new CatalogSportMatchItem(jSONObject.optString("id"), jSONObject.optString("track_code"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSportMatchItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSportMatchItem a(Serializer serializer) {
            return new CatalogSportMatchItem(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSportMatchItem[i];
        }
    }

    public CatalogSportMatchItem(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSportMatchItem)) {
            return false;
        }
        CatalogSportMatchItem catalogSportMatchItem = (CatalogSportMatchItem) obj;
        return epx.f(this.b, catalogSportMatchItem.b) && epx.f(this.c, catalogSportMatchItem.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSportMatchItem(id=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return ho8.a(sb, this.c, ')');
    }
}
