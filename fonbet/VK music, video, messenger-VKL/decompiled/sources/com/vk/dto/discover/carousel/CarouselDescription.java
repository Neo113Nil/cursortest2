package com.vk.dto.discover.carousel;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: CarouselDescription.kt */
/* loaded from: classes18.dex */
public final class CarouselDescription implements Serializer.StreamParcelable {
    public static final Serializer.c<CarouselDescription> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CarouselDescription> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CarouselDescription a(Serializer serializer) {
            return new CarouselDescription(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarouselDescription[i];
        }
    }

    public CarouselDescription(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselDescription)) {
            return false;
        }
        CarouselDescription carouselDescription = (CarouselDescription) obj;
        return epx.f(this.b, carouselDescription.b) && epx.f(this.c, carouselDescription.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselDescription(text=");
        sb.append(this.b);
        sb.append(", type=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
