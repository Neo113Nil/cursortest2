package com.vk.superapp.ads.js.bridge.api.events;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: HideBannerAd.kt */
/* loaded from: classes6.dex */
public final class HideBannerAd$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public HideBannerAd$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new HideBannerAd$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HideBannerAd$Response)) {
            return false;
        }
        HideBannerAd$Response hideBannerAd$Response = (HideBannerAd$Response) obj;
        return epx.f(this.type, hideBannerAd$Response.type) && epx.f(this.data, hideBannerAd$Response.data) && epx.f(this.requestId, hideBannerAd$Response.requestId);
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

    public /* synthetic */ HideBannerAd$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppHideBannerAdResult" : str, data, str2);
    }

    /* compiled from: HideBannerAd.kt */
    public static final class Data {

        @pmi0("banner_align")
        private final String bannerAlign;

        @pmi0("banner_height")
        private final int bannerHeight;

        @pmi0("banner_location")
        private final String bannerLocation;

        @pmi0("banner_width")
        private final int bannerWidth;

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

        public Data(boolean z, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.result = z;
            this.bannerWidth = i;
            this.bannerHeight = i2;
            this.bannerLocation = str;
            this.layoutType = str2;
            this.bannerAlign = str3;
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
            return this.result == data.result && this.bannerWidth == data.bannerWidth && this.bannerHeight == data.bannerHeight && epx.f(this.bannerLocation, data.bannerLocation) && epx.f(this.layoutType, data.layoutType) && epx.f(this.bannerAlign, data.bannerAlign) && epx.f(this.heightType, data.heightType) && epx.f(this.orientation, data.orientation) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(shy.a(this.bannerHeight, shy.a(this.bannerWidth, Boolean.hashCode(this.result) * 31, 31), 31), 31, this.bannerLocation), 31, this.layoutType);
            String str = this.bannerAlign;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.heightType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.orientation;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestId;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
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
            sb.append(", layoutType=");
            sb.append(this.layoutType);
            sb.append(", bannerAlign=");
            sb.append(this.bannerAlign);
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
        public /* synthetic */ Data(boolean z, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, zcl zclVar) {
            this(z, i, i2, str, str2, str3, str4, r10, r11);
            String str7;
            String str8;
            str3 = (i3 & 32) != 0 ? null : str3;
            str4 = (i3 & 64) != 0 ? null : str4;
            if ((i3 & 128) != 0) {
                str7 = str6;
                str8 = null;
            } else {
                str7 = str6;
                str8 = str5;
            }
        }
    }
}
