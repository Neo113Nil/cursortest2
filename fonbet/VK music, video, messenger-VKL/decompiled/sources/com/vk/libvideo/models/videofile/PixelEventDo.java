package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.air;
import xsna.epx;
import xsna.vby;

/* compiled from: VideoFilePlaybackDo.kt */
@vby
/* loaded from: classes3.dex */
public final class PixelEventDo implements Parcelable {
    public static final Parcelable.Creator<PixelEventDo> CREATOR = new a();
    public final String b;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<PixelEventDo> {
        @Override // android.os.Parcelable.Creator
        public final PixelEventDo createFromParcel(Parcel parcel) {
            return new PixelEventDo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PixelEventDo[] newArray(int i) {
            return new PixelEventDo[i];
        }
    }

    public /* synthetic */ PixelEventDo(String str) {
        this.b = str;
    }

    public static final /* synthetic */ PixelEventDo a(String str) {
        return new PixelEventDo(str);
    }

    public final /* synthetic */ String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PixelEventDo) {
            return epx.f(this.b, ((PixelEventDo) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return air.b(')', "PixelEventDo(value=", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
