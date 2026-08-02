package com.vk.dto.discover.carousel;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: CarouselItem.kt */
/* loaded from: classes18.dex */
public abstract class CarouselItem implements Serializer.StreamParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
