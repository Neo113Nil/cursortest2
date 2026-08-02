package com.vk.dto.common.clips;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: ClipAudioTemplate.kt */
/* loaded from: classes18.dex */
public final class ClipAudioTemplate extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ClipAudioTemplate> CREATOR = new b();
    public static final a c = new a();
    public final String b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipAudioTemplate> {
        @Override // xsna.aay
        public final ClipAudioTemplate a(JSONObject jSONObject) {
            return new ClipAudioTemplate(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipAudioTemplate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipAudioTemplate a(Serializer serializer) {
            return new ClipAudioTemplate(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipAudioTemplate[i];
        }
    }

    public ClipAudioTemplate(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "raw_id");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClipAudioTemplate) && epx.f(this.b, ((ClipAudioTemplate) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ClipAudioTemplate(rawId="), this.b, ')');
    }

    public final String zb() {
        return this.b;
    }

    public ClipAudioTemplate(JSONObject jSONObject) {
        this(jSONObject.getString("raw_id"));
    }
}
