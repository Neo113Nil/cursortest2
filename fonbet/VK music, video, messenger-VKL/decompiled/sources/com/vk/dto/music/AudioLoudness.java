package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.s3q0;
import xsna.w9y;
import xsna.xq;

/* compiled from: AudioLoudness.kt */
/* loaded from: classes18.dex */
public final class AudioLoudness extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioLoudness> CREATOR = new b();
    public final float b;
    public final float c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioLoudness> {
        @Override // xsna.aay
        public final AudioLoudness a(JSONObject jSONObject) {
            return new AudioLoudness(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioLoudness> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioLoudness a(Serializer serializer) {
            return new AudioLoudness(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioLoudness[i];
        }
    }

    static {
        new a();
    }

    public AudioLoudness(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.P(this.b);
        serializer.P(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(Float.valueOf(this.b), "lufs");
        w9yVar.e(Float.valueOf(this.c), "peak");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLoudness)) {
            return false;
        }
        AudioLoudness audioLoudness = (AudioLoudness) obj;
        return Float.compare(this.b, audioLoudness.b) == 0 && Float.compare(this.c, audioLoudness.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLoudness(lufs=");
        sb.append(this.b);
        sb.append(", peak=");
        return xq.c(')', this.c, sb);
    }

    public AudioLoudness(JSONObject jSONObject) {
        this((float) jSONObject.getDouble("lufs"), (float) jSONObject.getDouble("peak"));
    }

    public AudioLoudness(Serializer serializer) {
        this(serializer.s(), serializer.s());
    }
}
