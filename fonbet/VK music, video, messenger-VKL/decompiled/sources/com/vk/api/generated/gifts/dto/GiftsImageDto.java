package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GiftsImageDto.kt */
/* loaded from: classes14.dex */
public final class GiftsImageDto implements Parcelable {
    public static final Parcelable.Creator<GiftsImageDto> CREATOR = new a();

    @pmi0("sources")
    private final List<GiftsImageSourceDto> sources;

    /* compiled from: GiftsImageDto.kt */
    public static final class a implements Parcelable.Creator<GiftsImageDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsImageDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(GiftsImageSourceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GiftsImageDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsImageDto[] newArray(int i) {
            return new GiftsImageDto[i];
        }
    }

    public GiftsImageDto(List<GiftsImageSourceDto> list) {
        this.sources = list;
    }

    public final List<GiftsImageSourceDto> d() {
        return this.sources;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftsImageDto) && epx.f(this.sources, ((GiftsImageDto) obj).sources);
    }

    public final int hashCode() {
        return this.sources.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("GiftsImageDto(sources="), this.sources);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sources);
        while (a2.hasNext()) {
            ((GiftsImageSourceDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
