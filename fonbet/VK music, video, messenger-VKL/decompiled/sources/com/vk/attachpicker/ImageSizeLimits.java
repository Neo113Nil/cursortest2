package com.vk.attachpicker;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ImageSizeLimits.kt */
/* loaded from: classes15.dex */
public final class ImageSizeLimits implements Parcelable {
    public static final Parcelable.Creator<ImageSizeLimits> CREATOR = new a();
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    /* compiled from: ImageSizeLimits.kt */
    public static final class a implements Parcelable.Creator<ImageSizeLimits> {
        @Override // android.os.Parcelable.Creator
        public final ImageSizeLimits createFromParcel(Parcel parcel) {
            return new ImageSizeLimits(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageSizeLimits[] newArray(int i) {
            return new ImageSizeLimits[i];
        }
    }

    public ImageSizeLimits() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSizeLimits)) {
            return false;
        }
        ImageSizeLimits imageSizeLimits = (ImageSizeLimits) obj;
        return epx.f(this.b, imageSizeLimits.b) && epx.f(this.c, imageSizeLimits.c) && epx.f(this.d, imageSizeLimits.d) && epx.f(this.e, imageSizeLimits.e);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageSizeLimits(minWidth=");
        sb.append(this.b);
        sb.append(", minHeight=");
        sb.append(this.c);
        sb.append(", maxWidth=");
        sb.append(this.d);
        sb.append(", maxHeight=");
        return uqi.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.e;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public ImageSizeLimits(Integer num, Integer num2, Integer num3, Integer num4) {
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
    }

    public /* synthetic */ ImageSizeLimits(Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
