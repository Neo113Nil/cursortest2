package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.MarketRejectInfoButtonsType;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;

/* compiled from: MarketRejectInfo.kt */
/* loaded from: classes18.dex */
public final class MarketRejectInfoButtons extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MarketRejectInfoButtons> CREATOR = new b();
    public static final a d = new a();
    public final MarketRejectInfoButtonsType b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MarketRejectInfoButtons> {
        @Override // xsna.aay
        public final MarketRejectInfoButtons a(JSONObject jSONObject) {
            MarketRejectInfoButtonsType.a aVar = MarketRejectInfoButtonsType.Companion;
            String string = jSONObject.getString("type");
            aVar.getClass();
            return new MarketRejectInfoButtons(MarketRejectInfoButtonsType.a.a(string), jSONObject.optString("url"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MarketRejectInfoButtons> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketRejectInfoButtons a(Serializer serializer) {
            MarketRejectInfoButtonsType marketRejectInfoButtonsType;
            String H = serializer.H();
            if (H != null) {
                MarketRejectInfoButtonsType.Companion.getClass();
                marketRejectInfoButtonsType = MarketRejectInfoButtonsType.a.a(H);
            } else {
                marketRejectInfoButtonsType = null;
            }
            return new MarketRejectInfoButtons(marketRejectInfoButtonsType, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketRejectInfoButtons[i];
        }
    }

    public MarketRejectInfoButtons(MarketRejectInfoButtonsType marketRejectInfoButtonsType, String str) {
        this.b = marketRejectInfoButtonsType;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        MarketRejectInfoButtonsType marketRejectInfoButtonsType = this.b;
        serializer.j0(marketRejectInfoButtonsType != null ? marketRejectInfoButtonsType.h() : null);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        MarketRejectInfoButtonsType marketRejectInfoButtonsType = this.b;
        jSONObject.putOpt("type", marketRejectInfoButtonsType != null ? marketRejectInfoButtonsType.h() : null);
        jSONObject.putOpt("url", this.c);
        return jSONObject;
    }
}
