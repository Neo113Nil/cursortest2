package com.vk.catalog2.common.dto.api.sport;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogSportsMatchTeam.kt */
/* loaded from: classes16.dex */
public final class CatalogSportsMatchTeam extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSportsMatchTeam> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSportsMatchTeam> {
        @Override // xsna.aay
        public final CatalogSportsMatchTeam a(JSONObject jSONObject) {
            return new CatalogSportsMatchTeam(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSportsMatchTeam> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSportsMatchTeam a(Serializer serializer) {
            return new CatalogSportsMatchTeam(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSportsMatchTeam[i];
        }
    }

    public CatalogSportsMatchTeam(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSportsMatchTeam)) {
            return false;
        }
        CatalogSportsMatchTeam catalogSportsMatchTeam = (CatalogSportsMatchTeam) obj;
        return epx.f(this.b, catalogSportsMatchTeam.b) && epx.f(this.c, catalogSportsMatchTeam.c) && epx.f(this.d, catalogSportsMatchTeam.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSportsMatchTeam(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        return ho8.a(sb, this.d, ')');
    }

    public CatalogSportsMatchTeam(JSONObject jSONObject) {
        this(jSONObject.optString("id"), jSONObject.optString("title"), jSONObject.optString(CampaignEx.JSON_KEY_IMAGE_URL));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSportsMatchTeam(Serializer serializer) {
        this(r0, r2, r4 != null ? r4 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
    }
}
