package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.shy;
import xsna.so;
import xsna.urd0;

/* compiled from: PhotoTag.kt */
/* loaded from: classes4.dex */
public final class PhotoTag implements Parcelable {
    public static final Parcelable.Creator<PhotoTag> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final Integer d;
    public final String e;
    public final String f;
    public final int g;
    public final Float h;
    public final Float i;

    /* compiled from: PhotoTag.kt */
    public static final class a implements Parcelable.Creator<PhotoTag> {
        @Override // android.os.Parcelable.Creator
        public final PhotoTag createFromParcel(Parcel parcel) {
            Integer valueOf;
            Float f;
            Float f2;
            Float valueOf2;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(PhotoTag.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
                f = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                f = null;
            }
            String readString = parcel.readString();
            Float f3 = f;
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            Float valueOf3 = parcel.readInt() == 0 ? f3 : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                Float f4 = valueOf3;
                valueOf2 = f3;
                f2 = f4;
            } else {
                f2 = valueOf3;
                valueOf2 = Float.valueOf(parcel.readFloat());
            }
            return new PhotoTag(readInt, userId, valueOf, readString, readString2, readInt2, f2, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoTag[] newArray(int i) {
            return new PhotoTag[i];
        }
    }

    public PhotoTag(int i, UserId userId, Integer num, String str, String str2, int i2, Float f, Float f2) {
        this.b = i;
        this.c = userId;
        this.d = num;
        this.e = str;
        this.f = str2;
        this.g = i2;
        this.h = f;
        this.i = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoTag)) {
            return false;
        }
        PhotoTag photoTag = (PhotoTag) obj;
        return this.b == photoTag.b && epx.f(this.c, photoTag.c) && epx.f(this.d, photoTag.d) && epx.f(this.e, photoTag.e) && epx.f(this.f, photoTag.f) && this.g == photoTag.g && epx.f(this.h, photoTag.h) && epx.f(this.i, photoTag.i);
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        Integer num = this.d;
        int a3 = urd0.a((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int a4 = shy.a(this.g, (a3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Float f = this.h;
        int hashCode = (a4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.i;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoTag(id=");
        sb.append(this.b);
        sb.append(", productOwnerId=");
        sb.append(this.c);
        sb.append(", productId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", imageUrl=");
        sb.append(this.f);
        sb.append(", photoId=");
        sb.append(this.g);
        sb.append(", x=");
        sb.append(this.h);
        sb.append(", y=");
        return so.b(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        Float f = this.h;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
        }
        Float f2 = this.i;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
        }
    }
}
