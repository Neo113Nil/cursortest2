package com.vk.libvideo.adfree.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: VideoAdFreeBottomSheetArguments.kt */
/* loaded from: classes18.dex */
public final class VideoAdFreeBottomSheetArguments implements Parcelable {
    public static final Parcelable.Creator<VideoAdFreeBottomSheetArguments> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    /* compiled from: VideoAdFreeBottomSheetArguments.kt */
    public static final class a implements Parcelable.Creator<VideoAdFreeBottomSheetArguments> {
        @Override // android.os.Parcelable.Creator
        public final VideoAdFreeBottomSheetArguments createFromParcel(Parcel parcel) {
            return new VideoAdFreeBottomSheetArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAdFreeBottomSheetArguments[] newArray(int i) {
            return new VideoAdFreeBottomSheetArguments[i];
        }
    }

    public VideoAdFreeBottomSheetArguments(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdFreeBottomSheetArguments)) {
            return false;
        }
        VideoAdFreeBottomSheetArguments videoAdFreeBottomSheetArguments = (VideoAdFreeBottomSheetArguments) obj;
        return epx.f(this.b, videoAdFreeBottomSheetArguments.b) && epx.f(this.c, videoAdFreeBottomSheetArguments.c) && epx.f(this.d, videoAdFreeBottomSheetArguments.d) && epx.f(this.e, videoAdFreeBottomSheetArguments.e) && epx.f(this.f, videoAdFreeBottomSheetArguments.f) && epx.f(this.g, videoAdFreeBottomSheetArguments.g) && this.h == videoAdFreeBottomSheetArguments.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdFreeBottomSheetArguments(termsOfServiceString=");
        sb.append(this.b);
        sb.append(", proceedButtonString=");
        sb.append(this.c);
        sb.append(", popupTitle=");
        sb.append(this.d);
        sb.append(", price=");
        sb.append(this.e);
        sb.append(", miniAppUrl=");
        sb.append(this.f);
        sb.append(", termsUrl=");
        sb.append(this.g);
        sb.append(", forceDarkTheme=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
