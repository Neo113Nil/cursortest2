package com.vk.superapp.api.dto.identity;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: WebIdentityAddress.kt */
/* loaded from: classes6.dex */
public final class WebIdentityAddress extends WebIdentityCard {
    public static final Serializer.c<WebIdentityAddress> CREATOR = new a();
    public final WebIdentityLabel b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebIdentityAddress> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebIdentityAddress a(Serializer serializer) {
            return new WebIdentityAddress(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebIdentityAddress[i];
        }
    }

    public WebIdentityAddress(WebIdentityLabel webIdentityLabel, String str, String str2, String str3, int i, int i2, int i3) {
        this.b = webIdentityLabel;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final WebIdentityLabel Ab() {
        return this.b;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final JSONObject Bb() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.b.c);
        jSONObject.put("full_address", this.c);
        String str = this.d;
        if (str.length() > 0) {
            jSONObject.put("postal_code", str);
        }
        return jSONObject;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final String Cb() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.S(this.h);
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebIdentityAddress)) {
            return false;
        }
        WebIdentityAddress webIdentityAddress = (WebIdentityAddress) obj;
        return epx.f(this.b, webIdentityAddress.b) && epx.f(this.c, webIdentityAddress.c) && epx.f(this.d, webIdentityAddress.d) && epx.f(this.e, webIdentityAddress.e) && this.f == webIdentityAddress.f && this.g == webIdentityAddress.g && this.h == webIdentityAddress.h;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final String getTitle() {
        return this.b.c;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final String getType() {
        return RTCStatsConstants.KEY_ADDRESS;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, shy.a(this.f, urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final String toString() {
        StringBuilder sb = new StringBuilder("WebIdentityAddress(label=");
        sb.append(this.b);
        sb.append(", fullAddress=");
        sb.append(this.c);
        sb.append(", postalCode=");
        sb.append(this.d);
        sb.append(", specifiedAddress=");
        sb.append(this.e);
        sb.append(", id=");
        sb.append(this.f);
        sb.append(", cityId=");
        sb.append(this.g);
        sb.append(", countryId=");
        return vu5.b(sb, this.h, ')');
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final int zb() {
        return this.f;
    }

    public WebIdentityAddress(Serializer serializer) {
        this((WebIdentityLabel) serializer.G(WebIdentityLabel.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.u(), serializer.u());
    }
}
