package com.vk.dto.common;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.f370;

/* compiled from: MarketItemRating.kt */
/* loaded from: classes18.dex */
public final class MarketItemRating extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MarketItemRating> CREATOR = new b();
    public static final a e = new a();
    public final Float b;
    public final Integer c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MarketItemRating> {
        @Override // xsna.aay
        public final MarketItemRating a(JSONObject jSONObject) {
            return new MarketItemRating(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MarketItemRating> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketItemRating a(Serializer serializer) {
            return new MarketItemRating(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketItemRating[i];
        }
    }

    public MarketItemRating(JSONObject jSONObject) {
        this.b = f370.u(CampaignEx.JSON_KEY_STAR, jSONObject);
        this.c = Integer.valueOf(jSONObject.optInt("reviews_count"));
        this.d = jSONObject.optString("reviews_count_text");
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Float f = this.b;
        serializer.P(f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Integer num = this.c;
        serializer.S(num != null ? num.intValue() : 0);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(CampaignEx.JSON_KEY_STAR, this.b);
        jSONObject.putOpt("reviews_count", this.c);
        jSONObject.putOpt("reviews_count_text", this.d);
        return jSONObject;
    }

    public MarketItemRating(Serializer serializer) {
        this.b = Float.valueOf(serializer.s());
        this.c = Integer.valueOf(serializer.u());
        this.d = serializer.H();
    }

    public MarketItemRating(Float f, Integer num, String str) {
        this.b = f;
        this.c = num;
        this.d = str;
    }
}
