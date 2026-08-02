package com.vk.dto.music.audiobook;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: AudioBookGenre.kt */
/* loaded from: classes18.dex */
public final class AudioBookGenre extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioBookGenre> CREATOR = new b();
    public final int b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioBookGenre> {
        @Override // xsna.aay
        public final AudioBookGenre a(JSONObject jSONObject) {
            return new AudioBookGenre(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioBookGenre> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioBookGenre a(Serializer serializer) {
            return new AudioBookGenre(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioBookGenre[i];
        }
    }

    static {
        new a();
    }

    public AudioBookGenre(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "id");
        w9yVar.e(this.c, "name");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookGenre)) {
            return false;
        }
        AudioBookGenre audioBookGenre = (AudioBookGenre) obj;
        return this.b == audioBookGenre.b && epx.f(this.c, audioBookGenre.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookGenre(id=");
        sb.append(this.b);
        sb.append(", name=");
        return ho8.a(sb, this.c, ')');
    }

    public AudioBookGenre(JSONObject jSONObject) {
        this(jSONObject.optInt("id"), jSONObject.optString("name"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookGenre(Serializer serializer) {
        this(r0, r2 == null ? "" : r2);
        int u = serializer.u();
        String H = serializer.H();
    }
}
