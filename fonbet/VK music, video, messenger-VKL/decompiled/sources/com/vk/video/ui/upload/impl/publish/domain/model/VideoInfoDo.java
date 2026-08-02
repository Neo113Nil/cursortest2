package com.vk.video.ui.upload.impl.publish.domain.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.qoy;
import xsna.qr;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: VideoInfoDo.kt */
/* loaded from: classes7.dex */
public final class VideoInfoDo implements Parcelable {
    public static final Parcelable.Creator<VideoInfoDo> CREATOR = new a();
    public final long b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Boolean f;
    public final Bitmap g;

    /* compiled from: VideoInfoDo.kt */
    public static final class a implements Parcelable.Creator<VideoInfoDo> {
        @Override // android.os.Parcelable.Creator
        public final VideoInfoDo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                valueOf = Boolean.valueOf(z2);
            }
            return new VideoInfoDo(readLong, z, readInt, readInt2, valueOf, null, 32, null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInfoDo[] newArray(int i) {
            return new VideoInfoDo[i];
        }
    }

    public VideoInfoDo(long j, boolean z, int i, int i2, Boolean bool, Bitmap bitmap) {
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = bool;
        this.g = bitmap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoDo)) {
            return false;
        }
        VideoInfoDo videoInfoDo = (VideoInfoDo) obj;
        return this.b == videoInfoDo.b && this.c == videoInfoDo.c && this.d == videoInfoDo.d && this.e == videoInfoDo.e && epx.f(this.f, videoInfoDo.f) && epx.f(this.g, videoInfoDo.g);
    }

    public final int hashCode() {
        int a2 = shy.a(this.e, shy.a(this.d, qoy.b(Long.hashCode(this.b) * 31, 31, this.c), 31), 31);
        Boolean bool = this.f;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Bitmap bitmap = this.g;
        return hashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfoDo(durationMs=");
        sb.append(this.b);
        sb.append(", canCompress=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", isMP4=");
        sb.append(this.f);
        sb.append(", preview=");
        return qr.c(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        Boolean bool = this.f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VideoInfoDo(long j, boolean z, int i, int i2, Boolean bool, Bitmap bitmap, int i3, zcl zclVar) {
        this(j, z, i, i2, bool, (i3 & 32) != 0 ? null : bitmap);
    }
}
