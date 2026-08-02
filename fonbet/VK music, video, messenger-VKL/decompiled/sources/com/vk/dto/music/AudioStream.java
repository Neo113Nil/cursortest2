package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: AudioStream.kt */
/* loaded from: classes18.dex */
public final class AudioStream extends Serializer.StreamParcelableAdapter implements bxx {
    public final String b;
    public final String c;
    public final String d;
    public static final Serializer.c<AudioStream> CREATOR = new b();
    public static final a e = new a();
    private static final AudioStream STUB = new AudioStream(null, null, null, 7, null);

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioStream> {
        @Override // xsna.aay
        public final AudioStream a(JSONObject jSONObject) {
            return new AudioStream(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioStream> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioStream a(Serializer serializer) {
            return new AudioStream(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioStream[i];
        }
    }

    public AudioStream() {
        this(null, null, null, 7, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "type");
        w9yVar.e(this.c, "url");
        w9yVar.e(this.d, "fallbackUrl");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStream)) {
            return false;
        }
        AudioStream audioStream = (AudioStream) obj;
        return epx.f(this.b, audioStream.b) && epx.f(this.c, audioStream.c) && epx.f(this.d, audioStream.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStream(type=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", fallbackUrl=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ AudioStream(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public AudioStream(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public AudioStream(JSONObject jSONObject) {
        this(jSONObject.optString("type"), jSONObject.optString("url"), jSONObject.optString("fallbackUrl"));
    }

    public AudioStream(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H());
    }
}
