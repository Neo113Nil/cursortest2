package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class TimelineThumbsDo implements Parcelable {
    public static final Parcelable.Creator<TimelineThumbsDo> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final List<String> i;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<TimelineThumbsDo> {
        @Override // android.os.Parcelable.Creator
        public final TimelineThumbsDo createFromParcel(Parcel parcel) {
            return new TimelineThumbsDo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final TimelineThumbsDo[] newArray(int i) {
            return new TimelineThumbsDo[i];
        }
    }

    public TimelineThumbsDo() {
        this(0, 0, 0, 0, 0, 0, false, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineThumbsDo)) {
            return false;
        }
        TimelineThumbsDo timelineThumbsDo = (TimelineThumbsDo) obj;
        return this.b == timelineThumbsDo.b && this.c == timelineThumbsDo.c && this.d == timelineThumbsDo.d && this.e == timelineThumbsDo.e && this.f == timelineThumbsDo.f && this.g == timelineThumbsDo.g && this.h == timelineThumbsDo.h && epx.f(this.i, timelineThumbsDo.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + qoy.b(shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineThumbsDo(frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        sb.append(this.c);
        sb.append(", countPerRow=");
        sb.append(this.d);
        sb.append(", countPerImage=");
        sb.append(this.e);
        sb.append(", countTotal=");
        sb.append(this.f);
        sb.append(", frequency=");
        sb.append(this.g);
        sb.append(", isUnitedVideo=");
        sb.append(this.h);
        sb.append(", links=");
        return ms9.a(')', sb, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeStringList(this.i);
    }

    public TimelineThumbsDo(int i, int i2, int i3, int i4, int i5, int i6, boolean z, List list, int i7, zcl zclVar) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? false : z, (i7 & 128) != 0 ? EmptyList.b : list);
    }

    public TimelineThumbsDo(int i, int i2, int i3, int i4, int i5, int i6, boolean z, List<String> list) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = z;
        this.i = list;
    }
}
