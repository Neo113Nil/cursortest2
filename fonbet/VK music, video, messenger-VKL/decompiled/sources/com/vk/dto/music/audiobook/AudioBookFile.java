package com.vk.dto.music.audiobook;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.vu5;
import xsna.w9y;

/* compiled from: AudioBookFile.kt */
/* loaded from: classes18.dex */
public final class AudioBookFile extends Serializer.StreamParcelableAdapter implements bxx {
    public final String b;
    public final int c;
    public static final a d = new a();
    public static final Serializer.c<AudioBookFile> CREATOR = new c();

    /* compiled from: AudioBookFile.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<AudioBookFile> {
        @Override // xsna.aay
        public final AudioBookFile a(JSONObject jSONObject) {
            return new AudioBookFile(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<AudioBookFile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioBookFile a(Serializer serializer) {
            return new AudioBookFile(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioBookFile[i];
        }
    }

    static {
        new b();
    }

    public AudioBookFile(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "url");
        w9yVar.c(Integer.valueOf(this.c), "duration");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookFile)) {
            return false;
        }
        AudioBookFile audioBookFile = (AudioBookFile) obj;
        return epx.f(this.b, audioBookFile.b) && this.c == audioBookFile.c;
    }

    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookFile(url=");
        sb.append(this.b);
        sb.append(", duration=");
        return vu5.b(sb, this.c, ')');
    }

    public AudioBookFile(JSONObject jSONObject) {
        this(jSONObject.optString("url"), jSONObject.optInt("duration"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookFile(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.u());
        String H = serializer.H();
    }
}
