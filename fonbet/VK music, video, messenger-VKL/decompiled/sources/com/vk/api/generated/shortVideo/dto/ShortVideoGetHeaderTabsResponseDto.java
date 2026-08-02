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

/* compiled from: ShortVideoGetHeaderTabsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetHeaderTabsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetHeaderTabsResponseDto> CREATOR = new a();

    @pmi0("tabs")
    private final List<ShortVideoGetHeaderTabsDto> tabs;

    /* compiled from: ShortVideoGetHeaderTabsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetHeaderTabsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetHeaderTabsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoGetHeaderTabsDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetHeaderTabsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetHeaderTabsResponseDto[] newArray(int i) {
            return new ShortVideoGetHeaderTabsResponseDto[i];
        }
    }

    public ShortVideoGetHeaderTabsResponseDto(List<ShortVideoGetHeaderTabsDto> list) {
        this.tabs = list;
    }

    public final List<ShortVideoGetHeaderTabsDto> d() {
        return this.tabs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoGetHeaderTabsResponseDto) && epx.f(this.tabs, ((ShortVideoGetHeaderTabsResponseDto) obj).tabs);
    }

    public final int hashCode() {
        return this.tabs.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoGetHeaderTabsResponseDto(tabs="), this.tabs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.tabs);
        while (a2.hasNext()) {
            ((ShortVideoGetHeaderTabsDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
