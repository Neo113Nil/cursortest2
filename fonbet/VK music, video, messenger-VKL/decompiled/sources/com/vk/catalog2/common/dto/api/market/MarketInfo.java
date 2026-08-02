package com.vk.catalog2.common.dto.api.market;

import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.internal.api.GsonHolder;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketInfo.kt */
/* loaded from: classes16.dex */
public final class MarketInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MarketInfo> CREATOR = new b();
    public static final a i = new a();
    public final String b;
    public final MarketInfoType c;
    public final MarketInfoSubtype d;
    public final Integer e;
    public final Image f;
    public final Image g;
    public final MarketItemLabelActionDto h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketInfo.kt */
    public static final class MarketInfoSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MarketInfoSubtype[] $VALUES;
        public static final a Companion;
        public static final MarketInfoSubtype DEFAULT;
        public static final MarketInfoSubtype OZON_ONBOARDING;
        private final String text;

        /* compiled from: MarketInfo.kt */
        public static final class a {
            public static MarketInfoSubtype a(String str) {
                MarketInfoSubtype marketInfoSubtype = MarketInfoSubtype.OZON_ONBOARDING;
                if (epx.f(str, marketInfoSubtype.h())) {
                    return marketInfoSubtype;
                }
                MarketInfoSubtype marketInfoSubtype2 = MarketInfoSubtype.DEFAULT;
                epx.f(str, marketInfoSubtype2.h());
                return marketInfoSubtype2;
            }
        }

        static {
            MarketInfoSubtype marketInfoSubtype = new MarketInfoSubtype("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = marketInfoSubtype;
            MarketInfoSubtype marketInfoSubtype2 = new MarketInfoSubtype("OZON_ONBOARDING", 1, "ozon_onboarding");
            OZON_ONBOARDING = marketInfoSubtype2;
            MarketInfoSubtype[] marketInfoSubtypeArr = {marketInfoSubtype, marketInfoSubtype2};
            $VALUES = marketInfoSubtypeArr;
            $ENTRIES = new asp(marketInfoSubtypeArr);
            Companion = new a();
        }

        public MarketInfoSubtype(String str, int i, String str2) {
            this.text = str2;
        }

        public static MarketInfoSubtype valueOf(String str) {
            return (MarketInfoSubtype) Enum.valueOf(MarketInfoSubtype.class, str);
        }

        public static MarketInfoSubtype[] values() {
            return (MarketInfoSubtype[]) $VALUES.clone();
        }

        public final String h() {
            return this.text;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketInfo.kt */
    public static final class MarketInfoType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MarketInfoType[] $VALUES;
        public static final a Companion;
        public static final MarketInfoType NONE;
        public static final MarketInfoType OZON_INTEGRATION;
        private final String text;

        /* compiled from: MarketInfo.kt */
        public static final class a {
            public static MarketInfoType a(String str) {
                if (str == null) {
                    return MarketInfoType.NONE;
                }
                MarketInfoType marketInfoType = MarketInfoType.OZON_INTEGRATION;
                return str.equals(marketInfoType.h()) ? marketInfoType : MarketInfoType.NONE;
            }
        }

        static {
            MarketInfoType marketInfoType = new MarketInfoType("NONE", 0, "");
            NONE = marketInfoType;
            MarketInfoType marketInfoType2 = new MarketInfoType("OZON_INTEGRATION", 1, "ozon_integration");
            OZON_INTEGRATION = marketInfoType2;
            MarketInfoType[] marketInfoTypeArr = {marketInfoType, marketInfoType2};
            $VALUES = marketInfoTypeArr;
            $ENTRIES = new asp(marketInfoTypeArr);
            Companion = new a();
        }

        public MarketInfoType(String str, int i, String str2) {
            this.text = str2;
        }

        public static MarketInfoType valueOf(String str) {
            return (MarketInfoType) Enum.valueOf(MarketInfoType.class, str);
        }

        public static MarketInfoType[] values() {
            return (MarketInfoType[]) $VALUES.clone();
        }

        public final String h() {
            return this.text;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MarketInfo> {
        @Override // xsna.aay
        public final MarketInfo a(JSONObject jSONObject) {
            String optString = jSONObject.optString("text");
            MarketInfoType.a aVar = MarketInfoType.Companion;
            String optString2 = jSONObject.optString("type");
            aVar.getClass();
            MarketInfoType a = MarketInfoType.a.a(optString2);
            MarketInfoSubtype.a aVar2 = MarketInfoSubtype.Companion;
            String optString3 = jSONObject.optString("subtype");
            aVar2.getClass();
            MarketInfoSubtype a2 = MarketInfoSubtype.a.a(optString3);
            Integer valueOf = Integer.valueOf(jSONObject.optInt("market_info_id"));
            JSONObject optJSONObject = jSONObject.optJSONObject("logo");
            Image image = optJSONObject != null ? new Image((List<ImageSize>) Collections.singletonList(new ImageSize(optJSONObject, (String) null, 2, (zcl) null))) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("action_icon");
            return new MarketInfo(optString, a, a2, valueOf, image, optJSONObject2 != null ? new Image((List<ImageSize>) Collections.singletonList(new ImageSize(optJSONObject2, (String) null, 2, (zcl) null))) : null, (MarketItemLabelActionDto) GsonHolder.a().fromJson(jSONObject.optString("action"), MarketItemLabelActionDto.class));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MarketInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketInfo a(Serializer serializer) {
            String I = serializer.I();
            MarketInfoType.a aVar = MarketInfoType.Companion;
            String I2 = serializer.I();
            aVar.getClass();
            MarketInfoType a = MarketInfoType.a.a(I2);
            MarketInfoSubtype.a aVar2 = MarketInfoSubtype.Companion;
            String I3 = serializer.I();
            aVar2.getClass();
            return new MarketInfo(I, a, MarketInfoSubtype.a.a(I3), serializer.v(), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), (MarketItemLabelActionDto) serializer.A(MarketItemLabelActionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketInfo[i];
        }
    }

    public MarketInfo(String str, MarketInfoType marketInfoType, MarketInfoSubtype marketInfoSubtype, Integer num, Image image, Image image2, MarketItemLabelActionDto marketItemLabelActionDto) {
        this.b = str;
        this.c = marketInfoType;
        this.d = marketInfoSubtype;
        this.e = num;
        this.f = image;
        this.g = image2;
        this.h = marketItemLabelActionDto;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.m0(this.b);
        serializer.m0(this.c.h());
        serializer.m0(this.d.h());
        serializer.V(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.e0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MarketInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        MarketInfo marketInfo = (MarketInfo) obj;
        return epx.f(this.b, marketInfo.b) && this.c == marketInfo.c && this.d == marketInfo.d && epx.f(this.e, marketInfo.e) && epx.f(this.f, marketInfo.f) && epx.f(this.g, marketInfo.g) && epx.f(this.h, marketInfo.h);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31;
        Integer num = this.e;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Image image = this.f;
        int hashCode2 = (intValue + (image != null ? image.hashCode() : 0)) * 31;
        Image image2 = this.g;
        int hashCode3 = (hashCode2 + (image2 != null ? image2.hashCode() : 0)) * 31;
        MarketItemLabelActionDto marketItemLabelActionDto = this.h;
        return hashCode3 + (marketItemLabelActionDto != null ? marketItemLabelActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketInfo(text=" + this.b + ", type=" + this.c + ", subtype=" + this.d + ", id=" + this.e + ", logo=" + this.f + ", actionIcon=" + this.g + ", action=" + this.h + ')';
    }
}
