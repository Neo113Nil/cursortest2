package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;

/* compiled from: PhotoTagRequestParam.kt */
/* loaded from: classes4.dex */
public final class PhotoTagRequestParam implements Parcelable {
    public static final Parcelable.Creator<PhotoTagRequestParam> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;

    /* compiled from: PhotoTagRequestParam.kt */
    public static final class a implements Parcelable.Creator<PhotoTagRequestParam> {
        @Override // android.os.Parcelable.Creator
        public final PhotoTagRequestParam createFromParcel(Parcel parcel) {
            return new PhotoTagRequestParam(parcel.readInt(), (UserId) parcel.readParcelable(PhotoTagRequestParam.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoTagRequestParam[] newArray(int i) {
            return new PhotoTagRequestParam[i];
        }
    }

    public PhotoTagRequestParam(int i, UserId userId, String str) {
        this.b = i;
        this.c = userId;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoTagRequestParam)) {
            return false;
        }
        PhotoTagRequestParam photoTagRequestParam = (PhotoTagRequestParam) obj;
        return this.b == photoTagRequestParam.b && epx.f(this.c, photoTagRequestParam.c) && epx.f(this.d, photoTagRequestParam.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoTagRequestParam(photoId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", accessKey=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
