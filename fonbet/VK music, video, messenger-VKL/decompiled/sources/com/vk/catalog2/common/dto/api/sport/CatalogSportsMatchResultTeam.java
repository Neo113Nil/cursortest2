package com.vk.catalog2.common.dto.api.sport;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.zcl;

/* compiled from: CatalogSportsMatchResultTeam.kt */
/* loaded from: classes16.dex */
public final class CatalogSportsMatchResultTeam extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSportsMatchResultTeam> CREATOR = new b();
    public static final a c = new a();
    public final CatalogSportsMatchResultTeamScore b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSportsMatchResultTeam> {
        @Override // xsna.aay
        public final CatalogSportsMatchResultTeam a(JSONObject jSONObject) {
            return new CatalogSportsMatchResultTeam(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSportsMatchResultTeam> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSportsMatchResultTeam a(Serializer serializer) {
            return new CatalogSportsMatchResultTeam(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSportsMatchResultTeam[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogSportsMatchResultTeam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogSportsMatchResultTeam) && epx.f(this.b, ((CatalogSportsMatchResultTeam) obj).b);
    }

    public final int hashCode() {
        CatalogSportsMatchResultTeamScore catalogSportsMatchResultTeamScore = this.b;
        if (catalogSportsMatchResultTeamScore == null) {
            return 0;
        }
        return catalogSportsMatchResultTeamScore.hashCode();
    }

    public final String toString() {
        return "CatalogSportsMatchResultTeam(score=" + this.b + ')';
    }

    public /* synthetic */ CatalogSportsMatchResultTeam(CatalogSportsMatchResultTeamScore catalogSportsMatchResultTeamScore, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : catalogSportsMatchResultTeamScore);
    }

    public CatalogSportsMatchResultTeam(CatalogSportsMatchResultTeamScore catalogSportsMatchResultTeamScore) {
        this.b = catalogSportsMatchResultTeamScore;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSportsMatchResultTeam(JSONObject jSONObject) {
        this(r0);
        CatalogSportsMatchResultTeamScore catalogSportsMatchResultTeamScore;
        JSONObject optJSONObject = jSONObject.optJSONObject("score");
        if (optJSONObject != null) {
            CatalogSportsMatchResultTeamScore.e.getClass();
            catalogSportsMatchResultTeamScore = new CatalogSportsMatchResultTeamScore(optJSONObject);
        } else {
            catalogSportsMatchResultTeamScore = null;
        }
    }

    public CatalogSportsMatchResultTeam(Serializer serializer) {
        this((CatalogSportsMatchResultTeamScore) serializer.G(CatalogSportsMatchResultTeamScore.class.getClassLoader()));
    }
}
