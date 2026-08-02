package com.vk.clips.editor.templates.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.gallery.TranscodingState;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.jeq0;
import xsna.ocr;
import xsna.qoy;
import xsna.shy;
import xsna.yds0;

/* compiled from: ClipsTemplateEditorVideoItem.kt */
/* loaded from: classes16.dex */
public final class ClipsTemplateEditorVideoItem implements Parcelable {
    public static final Parcelable.Creator<ClipsTemplateEditorVideoItem> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final TranscodingState i;
    public final VideoTransform j;
    public final boolean k;

    /* compiled from: ClipsTemplateEditorVideoItem.kt */
    public static final class a implements Parcelable.Creator<ClipsTemplateEditorVideoItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipsTemplateEditorVideoItem createFromParcel(Parcel parcel) {
            boolean z;
            TranscodingState transcodingState;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            boolean z2 = parcel.readInt() != 0;
            TranscodingState valueOf = TranscodingState.valueOf(parcel.readString());
            VideoTransform videoTransform = (VideoTransform) parcel.readParcelable(ClipsTemplateEditorVideoItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                transcodingState = valueOf;
                z = true;
            } else {
                z = false;
                transcodingState = valueOf;
            }
            return new ClipsTemplateEditorVideoItem(readString, readInt, readInt2, readLong, readLong2, readLong3, z2, transcodingState, videoTransform, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsTemplateEditorVideoItem[] newArray(int i) {
            return new ClipsTemplateEditorVideoItem[i];
        }
    }

    public ClipsTemplateEditorVideoItem(String str, int i, int i2, long j, long j2, long j3, boolean z, TranscodingState transcodingState, VideoTransform videoTransform, boolean z2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z;
        this.i = transcodingState;
        this.j = videoTransform;
        this.k = z2;
    }

    public static ClipsTemplateEditorVideoItem a(ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem, long j, long j2, VideoTransform videoTransform, int i) {
        String str = clipsTemplateEditorVideoItem.b;
        int i2 = clipsTemplateEditorVideoItem.c;
        int i3 = clipsTemplateEditorVideoItem.d;
        long j3 = clipsTemplateEditorVideoItem.e;
        long j4 = (i & 16) != 0 ? clipsTemplateEditorVideoItem.f : j;
        long j5 = (i & 32) != 0 ? clipsTemplateEditorVideoItem.g : j2;
        boolean z = clipsTemplateEditorVideoItem.h;
        TranscodingState transcodingState = clipsTemplateEditorVideoItem.i;
        VideoTransform videoTransform2 = (i & 256) != 0 ? clipsTemplateEditorVideoItem.j : videoTransform;
        boolean z2 = clipsTemplateEditorVideoItem.k;
        clipsTemplateEditorVideoItem.getClass();
        return new ClipsTemplateEditorVideoItem(str, i2, i3, j3, j4, j5, z, transcodingState, videoTransform2, z2);
    }

    public final yds0 d() {
        return new yds0(jeq0.g(this.b), ocr.j.getSTUB(), this.c, this.d, this.e, this.f, this.g, 896);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsTemplateEditorVideoItem)) {
            return false;
        }
        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = (ClipsTemplateEditorVideoItem) obj;
        return epx.f(this.b, clipsTemplateEditorVideoItem.b) && this.c == clipsTemplateEditorVideoItem.c && this.d == clipsTemplateEditorVideoItem.d && this.e == clipsTemplateEditorVideoItem.e && this.f == clipsTemplateEditorVideoItem.f && this.g == clipsTemplateEditorVideoItem.g && this.h == clipsTemplateEditorVideoItem.h && this.i == clipsTemplateEditorVideoItem.i && epx.f(this.j, clipsTemplateEditorVideoItem.j) && this.k == clipsTemplateEditorVideoItem.k;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + qoy.b(bh10.a(bh10.a(bh10.a(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        VideoTransform videoTransform = this.j;
        return Boolean.hashCode(this.k) + ((hashCode + (videoTransform == null ? 0 : videoTransform.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTemplateEditorVideoItem(fileUri=");
        sb.append(this.b);
        sb.append(", videoWidth=");
        sb.append(this.c);
        sb.append(", videoHeight=");
        sb.append(this.d);
        sb.append(", originalDurationMs=");
        sb.append(this.e);
        sb.append(", startMs=");
        sb.append(this.f);
        sb.append(", endMs=");
        sb.append(this.g);
        sb.append(", fromPhoto=");
        sb.append(this.h);
        sb.append(", transcodingState=");
        sb.append(this.i);
        sb.append(", transform=");
        sb.append(this.j);
        sb.append(", isSlowDown=");
        return q0.a(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i.name());
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k ? 1 : 0);
    }
}
