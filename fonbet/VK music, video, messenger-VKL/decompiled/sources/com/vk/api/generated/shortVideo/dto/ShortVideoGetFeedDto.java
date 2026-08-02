package com.vk.api.generated.shortVideo.dto;

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

/* compiled from: ShortVideoGetFeedDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetFeedDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetFeedDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoFeedItemShortVideoFullDto> items;

    /* compiled from: ShortVideoGetFeedDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetFeedDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetFeedDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoFeedItemShortVideoFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetFeedDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetFeedDto[] newArray(int i) {
            return new ShortVideoGetFeedDto[i];
        }
    }

    public ShortVideoGetFeedDto(List<ShortVideoFeedItemShortVideoFullDto> list) {
        this.items = list;
    }

    public final List<ShortVideoFeedItemShortVideoFullDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoGetFeedDto) && epx.f(this.items, ((ShortVideoGetFeedDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoGetFeedDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ShortVideoFeedItemShortVideoFullDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
