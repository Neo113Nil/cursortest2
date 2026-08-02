package com.vk.superapp.api.dto.identity;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: WebIdentityEmail.kt */
/* loaded from: classes6.dex */
public final class WebIdentityEmail extends WebIdentityCard {
    public static final Serializer.c<WebIdentityEmail> CREATOR = new a();
    public final WebIdentityLabel b;
    public final String c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebIdentityEmail> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebIdentityEmail a(Serializer serializer) {
            return new WebIdentityEmail(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebIdentityEmail[i];
        }
    }

    public WebIdentityEmail(WebIdentityLabel webIdentityLabel, String str, int i) {
        this.b = webIdentityLabel;
        this.c = str;
        this.d = i;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final WebIdentityLabel Ab() {
        return this.b;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final JSONObject Bb() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.b.c);
        jSONObject.put("email", this.c);
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
        serializer.S(this.d);
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebIdentityEmail)) {
            return false;
        }
        WebIdentityEmail webIdentityEmail = (WebIdentityEmail) obj;
        return epx.f(this.b, webIdentityEmail.b) && epx.f(this.c, webIdentityEmail.c) && this.d == webIdentityEmail.d;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final String getTitle() {
        return this.b.c;
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final String getType() {
        return "email";
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final int hashCode() {
        return Integer.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final String toString() {
        StringBuilder sb = new StringBuilder("WebIdentityEmail(label=");
        sb.append(this.b);
        sb.append(", email=");
        sb.append(this.c);
        sb.append(", id=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // com.vk.superapp.api.dto.identity.WebIdentityCard
    public final int zb() {
        return this.d;
    }

    public WebIdentityEmail(Serializer serializer) {
        this((WebIdentityLabel) serializer.G(WebIdentityLabel.class.getClassLoader()), serializer.H(), serializer.u());
    }
}
