package com.vk.superapp.ads.js.bridge.api.events;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CheckBannerAd.kt */
/* loaded from: classes6.dex */
public final class CheckBannerAd$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public CheckBannerAd$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new CheckBannerAd$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckBannerAd$Response)) {
            return false;
        }
        CheckBannerAd$Response checkBannerAd$Response = (CheckBannerAd$Response) obj;
        return epx.f(this.type, checkBannerAd$Response.type) && epx.f(this.data, checkBannerAd$Response.data) && epx.f(this.requestId, checkBannerAd$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ CheckBannerAd$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppCheckBannerAdResult" : str, data, str2);
    }

    /* compiled from: CheckBannerAd.kt */
    public static final class Data {

        @pmi0("banner_align")
        private final String bannerAlign;

        @pmi0("banner_height")
        private final Integer bannerHeight;

        @pmi0("banner_location")
        private final String bannerLocation;

        @pmi0("banner_width")
        private final Integer bannerWidth;

        @pmi0("height_type")
        private final String heightType;

        @pmi0(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)
        private final String layoutType;

        @pmi0(X3.i.n)
        private final String orientation;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final boolean result;

        public Data(boolean z, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.result = z;
            this.bannerWidth = num;
            this.bannerHeight = num2;
            this.bannerLocation = str;
            this.bannerAlign = str2;
            this.layoutType = str3;
            this.heightType = str4;
            this.orientation = str5;
            this.requestId = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.result == data.result && epx.f(this.bannerWidth, data.bannerWidth) && epx.f(this.bannerHeight, data.bannerHeight) && epx.f(this.bannerLocation, data.bannerLocation) && epx.f(this.bannerAlign, data.bannerAlign) && epx.f(this.layoutType, data.layoutType) && epx.f(this.heightType, data.heightType) && epx.f(this.orientation, data.orientation) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.result) * 31;
            Integer num = this.bannerWidth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.bannerHeight;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.bannerLocation;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bannerAlign;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.layoutType;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.heightType;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.orientation;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.requestId;
            return hashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", bannerWidth=");
            sb.append(this.bannerWidth);
            sb.append(", bannerHeight=");
            sb.append(this.bannerHeight);
            sb.append(", bannerLocation=");
            sb.append(this.bannerLocation);
            sb.append(", bannerAlign=");
            sb.append(this.bannerAlign);
            sb.append(", layoutType=");
            sb.append(this.layoutType);
            sb.append(", heightType=");
            sb.append(this.heightType);
            sb.append(", orientation=");
            sb.append(this.orientation);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(boolean z, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
            this(z, num, num2, str, str2, str3, str4, r10, r11);
            String str7;
            String str8;
            num = (i & 2) != 0 ? null : num;
            num2 = (i & 4) != 0 ? null : num2;
            str = (i & 8) != 0 ? null : str;
            str2 = (i & 16) != 0 ? null : str2;
            str3 = (i & 32) != 0 ? null : str3;
            str4 = (i & 64) != 0 ? null : str4;
            if ((i & 128) != 0) {
                str7 = str6;
                str8 = null;
            } else {
                str7 = str6;
                str8 = str5;
            }
        }
    }
}
