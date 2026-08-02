package com.vk.dto.common.donut.chip;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: VideoDonutChip.kt */
/* loaded from: classes18.dex */
public final class VideoDonutChip extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoDonutChip> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<VideoDonutChip> {
        @Override // xsna.aay
        public final VideoDonutChip a(JSONObject jSONObject) {
            return new VideoDonutChip(jSONObject, (zcl) null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoDonutChip> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoDonutChip a(Serializer serializer) {
            return new VideoDonutChip(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoDonutChip[i];
        }
    }

    public VideoDonutChip(String str, String str2) {
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
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "text");
        w9yVar.e(this.c, "accessibility_text");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonutChip)) {
            return false;
        }
        VideoDonutChip videoDonutChip = (VideoDonutChip) obj;
        return epx.f(this.b, videoDonutChip.b) && epx.f(this.c, videoDonutChip.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDonutChip(text=");
        sb.append(this.b);
        sb.append(", accessibilityText=");
        return ho8.a(sb, this.c, ')');
    }

    public VideoDonutChip(JSONObject jSONObject, zcl zclVar) {
        this(jSONObject.getString("text"), jSONObject.getString("accessibility_text"));
    }

    public VideoDonutChip(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H());
    }
}
