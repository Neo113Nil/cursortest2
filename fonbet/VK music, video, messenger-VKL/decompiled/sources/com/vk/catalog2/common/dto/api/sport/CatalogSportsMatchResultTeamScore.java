package com.vk.catalog2.common.dto.api.sport;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CatalogSportsMatchResultTeamScore.kt */
/* loaded from: classes16.dex */
public final class CatalogSportsMatchResultTeamScore extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSportsMatchResultTeamScore> CREATOR = new b();
    public static final a e = new a();
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSportsMatchResultTeamScore> {
        @Override // xsna.aay
        public final CatalogSportsMatchResultTeamScore a(JSONObject jSONObject) {
            return new CatalogSportsMatchResultTeamScore(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSportsMatchResultTeamScore> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSportsMatchResultTeamScore a(Serializer serializer) {
            return new CatalogSportsMatchResultTeamScore(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSportsMatchResultTeamScore[i];
        }
    }

    public CatalogSportsMatchResultTeamScore() {
        this(null, null, null, 7, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.V(this.c);
        serializer.V(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSportsMatchResultTeamScore)) {
            return false;
        }
        CatalogSportsMatchResultTeamScore catalogSportsMatchResultTeamScore = (CatalogSportsMatchResultTeamScore) obj;
        return epx.f(this.b, catalogSportsMatchResultTeamScore.b) && epx.f(this.c, catalogSportsMatchResultTeamScore.c) && epx.f(this.d, catalogSportsMatchResultTeamScore.d);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSportsMatchResultTeamScore(total=");
        sb.append(this.b);
        sb.append(", penalties=");
        sb.append(this.c);
        sb.append(", redCards=");
        return uqi.b(sb, this.d, ')');
    }

    public /* synthetic */ CatalogSportsMatchResultTeamScore(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }

    public CatalogSportsMatchResultTeamScore(Integer num, Integer num2, Integer num3) {
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public CatalogSportsMatchResultTeamScore(JSONObject jSONObject) {
        this(Integer.valueOf(jSONObject.optInt(X3.i.l)), Integer.valueOf(jSONObject.optInt("penalties")), Integer.valueOf(jSONObject.optInt("red_cards")));
    }

    public CatalogSportsMatchResultTeamScore(Serializer serializer) {
        this(Integer.valueOf(serializer.u()), Integer.valueOf(serializer.u()), Integer.valueOf(serializer.u()));
    }
}
