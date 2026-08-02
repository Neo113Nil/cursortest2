package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.vu5;

/* compiled from: ImageStatusPack.kt */
/* loaded from: classes18.dex */
public final class ImageStatusPack implements Serializer.StreamParcelable {
    public static final Serializer.c<ImageStatusPack> CREATOR = new a();
    public final String b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ImageStatusPack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageStatusPack a(Serializer serializer) {
            return new ImageStatusPack(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageStatusPack[i];
        }
    }

    public ImageStatusPack(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageStatusPack)) {
            return false;
        }
        ImageStatusPack imageStatusPack = (ImageStatusPack) obj;
        return epx.f(this.b, imageStatusPack.b) && this.c == imageStatusPack.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageStatusPack(url=");
        sb.append(this.b);
        sb.append(", packId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageStatusPack(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.u());
        String H = serializer.H();
    }
}
