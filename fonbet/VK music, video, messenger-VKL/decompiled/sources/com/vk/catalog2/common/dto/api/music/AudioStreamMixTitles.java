package com.vk.catalog2.common.dto.api.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: AudioStreamMixTitles.kt */
/* loaded from: classes16.dex */
public final class AudioStreamMixTitles extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioStreamMixTitles> CREATOR = new b();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioStreamMixTitles> {
        @Override // xsna.aay
        public final AudioStreamMixTitles a(JSONObject jSONObject) {
            return new AudioStreamMixTitles(jSONObject.getString("common_state"), jSONObject.getString("play_state"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioStreamMixTitles> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioStreamMixTitles a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new AudioStreamMixTitles(H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioStreamMixTitles[i];
        }
    }

    static {
        new a();
    }

    public AudioStreamMixTitles(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static AudioStreamMixTitles zb(AudioStreamMixTitles audioStreamMixTitles) {
        String str = audioStreamMixTitles.b;
        String str2 = audioStreamMixTitles.c;
        audioStreamMixTitles.getClass();
        return new AudioStreamMixTitles(str, str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("common_state", this.b);
        jSONObject.put("play_state", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMixTitles)) {
            return false;
        }
        AudioStreamMixTitles audioStreamMixTitles = (AudioStreamMixTitles) obj;
        return epx.f(this.b, audioStreamMixTitles.b) && epx.f(this.c, audioStreamMixTitles.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixTitles(commonState=");
        sb.append(this.b);
        sb.append(", playState=");
        return ho8.a(sb, this.c, ')');
    }
}
