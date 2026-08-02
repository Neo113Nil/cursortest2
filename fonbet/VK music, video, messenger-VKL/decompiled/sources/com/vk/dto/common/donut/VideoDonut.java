package com.vk.dto.common.donut;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.donut.chip.VideoDonutChip;
import com.vk.dto.common.donut.popup.VideoDonutPopup;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.shy;
import xsna.w9y;
import xsna.zcl;

/* compiled from: VideoDonut.kt */
/* loaded from: classes18.dex */
public final class VideoDonut extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoDonut> CREATOR = new b();
    public static final a f = new a();
    public final boolean b;
    public final int c;
    public final VideoDonutChip d;
    public final VideoDonutPopup e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<VideoDonut> {
        @Override // xsna.aay
        public final VideoDonut a(JSONObject jSONObject) {
            return new VideoDonut(jSONObject, (zcl) null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoDonut> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoDonut a(Serializer serializer) {
            return new VideoDonut(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoDonut[i];
        }
    }

    public VideoDonut(boolean z, int i, VideoDonutChip videoDonutChip, VideoDonutPopup videoDonutPopup) {
        this.b = z;
        this.c = i;
        this.d = videoDonutChip;
        this.e = videoDonutPopup;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.S(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.b(Boolean.valueOf(this.b), "is_don");
        w9yVar.c(Integer.valueOf(this.c), "level_id");
        w9yVar.g("chip", this.d);
        w9yVar.g("popup", this.e);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonut)) {
            return false;
        }
        VideoDonut videoDonut = (VideoDonut) obj;
        return this.b == videoDonut.b && this.c == videoDonut.c && epx.f(this.d, videoDonut.d) && epx.f(this.e, videoDonut.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, Boolean.hashCode(this.b) * 31, 31)) * 31;
        VideoDonutPopup videoDonutPopup = this.e;
        return hashCode + (videoDonutPopup == null ? 0 : videoDonutPopup.hashCode());
    }

    public final String toString() {
        return "VideoDonut(isDon=" + this.b + ", levelId=" + this.c + ", chip=" + this.d + ", popup=" + this.e + ')';
    }

    public VideoDonut(JSONObject jSONObject, zcl zclVar) {
        this(jSONObject.optBoolean("is_don", false), jSONObject.optInt("level_id", 0), (VideoDonutChip) VideoDonutChip.d.a(jSONObject.getJSONObject("chip")), jSONObject.has("popup") ? (VideoDonutPopup) VideoDonutPopup.f.a(jSONObject.getJSONObject("popup")) : null);
    }

    public VideoDonut(Serializer serializer, zcl zclVar) {
        this(serializer.m(), serializer.u(), (VideoDonutChip) serializer.G(VideoDonutChip.class.getClassLoader()), (VideoDonutPopup) serializer.G(VideoDonutPopup.class.getClassLoader()));
    }
}
