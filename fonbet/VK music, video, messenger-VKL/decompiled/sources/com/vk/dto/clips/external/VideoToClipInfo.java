package com.vk.dto.clips.external;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.bh10;
import xsna.qoy;
import xsna.zcl;

/* compiled from: VideoToClipInfo.kt */
/* loaded from: classes18.dex */
public final class VideoToClipInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoToClipInfo> CREATOR = new a();
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoToClipInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoToClipInfo a(Serializer serializer) {
            return new VideoToClipInfo(serializer.w(), serializer.w(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoToClipInfo[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VideoToClipInfo(long j, long j2, boolean z, boolean z2, int i, zcl zclVar) {
        this(j, r6, r8, r9);
        boolean z3;
        boolean z4;
        long j3;
        j = (i & 1) != 0 ? 0L : j;
        if ((i & 2) != 0) {
            z3 = z2;
            z4 = z;
            j3 = 0;
        } else {
            z3 = z2;
            z4 = z;
            j3 = j2;
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.Y(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoToClipInfo)) {
            return false;
        }
        VideoToClipInfo videoToClipInfo = (VideoToClipInfo) obj;
        return this.b == videoToClipInfo.b && this.c == videoToClipInfo.c && this.d == videoToClipInfo.d && this.e == videoToClipInfo.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(bh10.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoToClipInfo(ownerId=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", showVtcModalIfNeed=");
        sb.append(this.d);
        sb.append(", processInputVideo=");
        return q0.a(sb, this.e, ')');
    }

    public VideoToClipInfo(long j, long j2, boolean z, boolean z2) {
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = z2;
    }
}
