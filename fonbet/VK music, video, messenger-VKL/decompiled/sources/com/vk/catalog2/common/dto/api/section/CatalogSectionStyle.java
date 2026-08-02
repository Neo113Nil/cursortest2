package com.vk.catalog2.common.dto.api.section;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;

/* compiled from: CatalogSection.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionStyle extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSectionStyle> CREATOR = new b();
    public static final a d = new a();
    public final boolean b;
    public final boolean c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSectionStyle> {
        @Override // xsna.aay
        public final CatalogSectionStyle a(JSONObject jSONObject) {
            return new CatalogSectionStyle(jSONObject.optBoolean("no_top_separator", false), jSONObject.optBoolean("navbar_overlap", false));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSectionStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSectionStyle a(Serializer serializer) {
            return new CatalogSectionStyle(serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSectionStyle[i];
        }
    }

    public CatalogSectionStyle(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionStyle)) {
            return false;
        }
        CatalogSectionStyle catalogSectionStyle = (CatalogSectionStyle) obj;
        return this.b == catalogSectionStyle.b && this.c == catalogSectionStyle.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSectionStyle(isNoTopSeparator=");
        sb.append(this.b);
        sb.append(", navbarOverlap=");
        return q0.a(sb, this.c, ')');
    }
}
