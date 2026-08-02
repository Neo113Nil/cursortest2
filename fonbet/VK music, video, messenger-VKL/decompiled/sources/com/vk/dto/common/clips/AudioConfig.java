package com.vk.dto.common.clips;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: AudioConfig.kt */
/* loaded from: classes18.dex */
public final class AudioConfig extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioConfig> CREATOR = new b();
    public static final a d = new a();
    public final int b;
    public final int c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioConfig> {
        @Override // xsna.aay
        public final AudioConfig a(JSONObject jSONObject) {
            return new AudioConfig(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioConfig a(Serializer serializer) {
            return new AudioConfig(serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioConfig[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioConfig() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "sample_rate");
        w9yVar.c(Integer.valueOf(this.c), "channel_count");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioConfig)) {
            return false;
        }
        AudioConfig audioConfig = (AudioConfig) obj;
        return this.b == audioConfig.b && this.c == audioConfig.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "sampleRate=" + this.b + ",channels=" + this.c;
    }

    public /* synthetic */ AudioConfig(int i, int i2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? 44100 : i, (i3 & 2) != 0 ? 2 : i2);
    }

    public AudioConfig(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public AudioConfig(JSONObject jSONObject) {
        this(jSONObject.getInt("sample_rate"), jSONObject.getInt("channel_count"));
    }
}
