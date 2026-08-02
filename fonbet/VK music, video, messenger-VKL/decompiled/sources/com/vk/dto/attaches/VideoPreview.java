package com.vk.dto.attaches;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.i5s;
import xsna.zcl;

/* compiled from: VideoPreview.kt */
/* loaded from: classes18.dex */
public final class VideoPreview extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoPreview> CREATOR = new a();
    public int b;
    public int c;
    public long d;
    public String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoPreview> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoPreview a(Serializer serializer) {
            return new VideoPreview(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoPreview[i];
        }
    }

    public VideoPreview() {
        this.e = "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.Y(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VideoPreview.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        VideoPreview videoPreview = (VideoPreview) obj;
        return this.b == videoPreview.b && this.c == videoPreview.c && this.d == videoPreview.d && epx.f(this.e, videoPreview.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (((((this.b * 31) + this.c) * 31) + ((int) this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPreview(width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", url='");
        return i5s.a(sb, this.e, "')");
    }

    public VideoPreview(Serializer serializer, zcl zclVar) {
        this.e = "";
        this.b = serializer.u();
        this.c = serializer.u();
        this.d = serializer.w();
        String H = serializer.H();
        this.e = H != null ? H : "";
    }
}
