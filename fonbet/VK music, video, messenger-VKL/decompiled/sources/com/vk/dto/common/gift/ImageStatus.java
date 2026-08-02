package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: ImageStatus.kt */
/* loaded from: classes18.dex */
public final class ImageStatus implements Serializer.StreamParcelable {
    public static final Serializer.c<ImageStatus> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ImageStatus> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageStatus a(Serializer serializer) {
            return new ImageStatus(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageStatus[i];
        }
    }

    public ImageStatus(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageStatus)) {
            return false;
        }
        ImageStatus imageStatus = (ImageStatus) obj;
        return epx.f(this.b, imageStatus.b) && this.c == imageStatus.c && this.d == imageStatus.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageStatus(url=");
        sb.append(this.b);
        sb.append(", packId=");
        sb.append(this.c);
        sb.append(", statusId=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageStatus(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.u(), serializer.u());
        String H = serializer.H();
    }
}
