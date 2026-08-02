package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: WebPhoto.kt */
/* loaded from: classes18.dex */
public final class WebPhoto implements Parcelable {
    public static final Parcelable.Creator<WebPhoto> CREATOR = new a();
    public final WebImage b;

    /* compiled from: WebPhoto.kt */
    public static final class a implements Parcelable.Creator<WebPhoto> {
        @Override // android.os.Parcelable.Creator
        public final WebPhoto createFromParcel(Parcel parcel) {
            return new WebPhoto((WebImage) parcel.readParcelable(WebPhoto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WebPhoto[] newArray(int i) {
            return new WebPhoto[i];
        }
    }

    public WebPhoto(WebImage webImage) {
        this.b = webImage;
    }

    public final WebImageSize a(int i) {
        WebImageSize e = this.b.e(i);
        if (e != null) {
            return e;
        }
        WebImageSize.CREATOR.getClass();
        return WebImageSize.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebPhoto) && epx.f(this.b, ((WebPhoto) obj).b);
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    public final String toString() {
        return "WebPhoto(sizes=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
