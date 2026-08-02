package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GiftsAppOrderDto.kt */
/* loaded from: classes14.dex */
public final class GiftsAppOrderDto implements Parcelable {
    public static final Parcelable.Creator<GiftsAppOrderDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    /* compiled from: GiftsAppOrderDto.kt */
    public static final class a implements Parcelable.Creator<GiftsAppOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsAppOrderDto createFromParcel(Parcel parcel) {
            return new GiftsAppOrderDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsAppOrderDto[] newArray(int i) {
            return new GiftsAppOrderDto[i];
        }
    }

    public GiftsAppOrderDto(String str) {
        this.id = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftsAppOrderDto) && epx.f(this.id, ((GiftsAppOrderDto) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("GiftsAppOrderDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
    }
}
