package com.vk.dto.ads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.AdBannerStyle;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: AdBlockItem.kt */
/* loaded from: classes18.dex */
public final class AdBlockItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AdBlockItem> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final AdBannerStyle c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AdBlockItem> {
        @Override // xsna.aay
        public final AdBlockItem a(JSONObject jSONObject) {
            return new AdBlockItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AdBlockItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AdBlockItem a(Serializer serializer) {
            return new AdBlockItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdBlockItem[i];
        }
    }

    public AdBlockItem(String str, AdBannerStyle adBannerStyle, String str2) {
        this.b = str;
        this.c = adBannerStyle;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        AdBannerStyle adBannerStyle = this.c;
        serializer.j0(adBannerStyle != null ? adBannerStyle.h() : null);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBlockItem)) {
            return false;
        }
        AdBlockItem adBlockItem = (AdBlockItem) obj;
        return epx.f(this.b, adBlockItem.b) && this.c == adBlockItem.c && epx.f(this.d, adBlockItem.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        AdBannerStyle adBannerStyle = this.c;
        return this.d.hashCode() + ((hashCode + (adBannerStyle == null ? 0 : adBannerStyle.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdBlockItem(id=");
        sb.append(this.b);
        sb.append(", style=");
        sb.append(this.c);
        sb.append(", sdkSource=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdBlockItem(Serializer serializer) {
        this(r0, r2, r5 != null ? r5 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        AdBannerStyle.a aVar = AdBannerStyle.Companion;
        String H2 = serializer.H();
        aVar.getClass();
        AdBannerStyle a2 = AdBannerStyle.a.a(H2);
        String H3 = serializer.H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdBlockItem(JSONObject jSONObject) {
        this(r0, AdBannerStyle.a.a(r2), jSONObject.optString("sdk_source"));
        String optString = jSONObject.optString("id");
        AdBannerStyle.a aVar = AdBannerStyle.Companion;
        JSONObject optJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_LAYOUT);
        String optString2 = optJSONObject != null ? optJSONObject.optString(TtmlNode.TAG_STYLE) : null;
        aVar.getClass();
    }
}
