package com.vk.catalog2.common.dto.api.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: AudioStreamMix.kt */
/* loaded from: classes16.dex */
public final class AudioStreamMix extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioStreamMix> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioStreamMix> {
        @Override // xsna.aay
        public final AudioStreamMix a(JSONObject jSONObject) {
            return new AudioStreamMix(jSONObject.getString("id"), jSONObject.getString("title"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioStreamMix> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioStreamMix a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new AudioStreamMix(H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioStreamMix[i];
        }
    }

    public AudioStreamMix(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b);
        jSONObject.put("title", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMix)) {
            return false;
        }
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
        return epx.f(this.b, audioStreamMix.b) && epx.f(this.c, audioStreamMix.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMix(id=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }
}
