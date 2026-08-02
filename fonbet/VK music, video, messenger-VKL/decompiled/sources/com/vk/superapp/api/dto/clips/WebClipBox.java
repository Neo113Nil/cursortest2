package com.vk.superapp.api.dto.clips;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.ho8;

/* compiled from: WebClipBox.kt */
/* loaded from: classes6.dex */
public final class WebClipBox extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebClipBox> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: WebClipBox.kt */
    public static final class a {
        public static WebClipBox a(JSONObject jSONObject) {
            String D = f370.D(jSONObject, "camera_type");
            JSONObject optJSONObject = jSONObject.optJSONObject("clip_params");
            return new WebClipBox(optJSONObject != null ? f370.D(optJSONObject, "mask_id") : null, optJSONObject != null ? f370.D(optJSONObject, "duet_id") : null, optJSONObject != null ? f370.D(optJSONObject, "audio_id") : null, optJSONObject != null ? f370.x(optJSONObject, "audio_start") : null, optJSONObject != null ? f370.D(optJSONObject, "description") : null, D, optJSONObject != null ? f370.D(optJSONObject, "duet_type") : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<WebClipBox> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebClipBox a(Serializer serializer) {
            return new WebClipBox(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebClipBox[i];
        }
    }

    public WebClipBox(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.V(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebClipBox)) {
            return false;
        }
        WebClipBox webClipBox = (WebClipBox) obj;
        return epx.f(this.b, webClipBox.b) && epx.f(this.c, webClipBox.c) && epx.f(this.d, webClipBox.d) && epx.f(this.e, webClipBox.e) && epx.f(this.f, webClipBox.f) && epx.f(this.g, webClipBox.g) && epx.f(this.h, webClipBox.h);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebClipBox(maskId=");
        sb.append(this.b);
        sb.append(", duetId=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", audioStartTimeMs=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", cameraType=");
        sb.append(this.g);
        sb.append(", duetType=");
        return ho8.a(sb, this.h, ')');
    }

    public WebClipBox(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.v(), serializer.H(), serializer.H(), serializer.H());
    }
}
