package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.shy;
import xsna.zcl;

/* compiled from: ImageUrl.kt */
/* loaded from: classes17.dex */
public final class ImageUrl implements Parcelable {
    public static final Parcelable.Creator<ImageUrl> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    /* compiled from: ImageUrl.kt */
    public static final class a implements Parcelable.Creator<ImageUrl> {
        @Override // android.os.Parcelable.Creator
        public final ImageUrl createFromParcel(Parcel parcel) {
            return new ImageUrl(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageUrl[] newArray(int i) {
            return new ImageUrl[i];
        }
    }

    public ImageUrl(String str, int i, int i2, boolean z) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = Math.max(i2, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrl)) {
            return false;
        }
        ImageUrl imageUrl = (ImageUrl) obj;
        return epx.f(this.b, imageUrl.b) && this.c == imageUrl.c && this.d == imageUrl.d && this.e == imageUrl.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageUrl(url=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", isBase=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ ImageUrl(String str, int i, int i2, boolean z, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? false : z);
    }

    public /* synthetic */ ImageUrl(String str, int i, boolean z, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? false : z);
    }

    public ImageUrl(String str, int i, boolean z) {
        this(str, i, i, z);
    }
}
