package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.shy;
import xsna.vu5;
import xsna.w9y;

/* compiled from: MusicPreviewUrl.kt */
/* loaded from: classes18.dex */
public final class MusicPreviewUrl extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MusicPreviewUrl> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicPreviewUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicPreviewUrl a(Serializer serializer) {
            return new MusicPreviewUrl(serializer.H(), serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicPreviewUrl[i];
        }
    }

    public MusicPreviewUrl(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "url");
        w9yVar.c(Integer.valueOf(this.c), "clip_from");
        w9yVar.c(Integer.valueOf(this.d), "clip_to");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicPreviewUrl)) {
            return false;
        }
        MusicPreviewUrl musicPreviewUrl = (MusicPreviewUrl) obj;
        return epx.f(this.b, musicPreviewUrl.b) && this.c == musicPreviewUrl.c && this.d == musicPreviewUrl.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPreviewUrl(url=");
        sb.append(this.b);
        sb.append(", clipFrom=");
        sb.append(this.c);
        sb.append(", clipTo=");
        return vu5.b(sb, this.d, ')');
    }
}
