package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseObjectNameDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AudioGetSearchTrendsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetSearchTrendsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetSearchTrendsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<BaseObjectNameDto> items;

    /* compiled from: AudioGetSearchTrendsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetSearchTrendsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetSearchTrendsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(BaseObjectNameDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioGetSearchTrendsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetSearchTrendsResponseDto[] newArray(int i) {
            return new AudioGetSearchTrendsResponseDto[i];
        }
    }

    public AudioGetSearchTrendsResponseDto(int i, List<BaseObjectNameDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetSearchTrendsResponseDto)) {
            return false;
        }
        AudioGetSearchTrendsResponseDto audioGetSearchTrendsResponseDto = (AudioGetSearchTrendsResponseDto) obj;
        return this.count == audioGetSearchTrendsResponseDto.count && epx.f(this.items, audioGetSearchTrendsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetSearchTrendsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((BaseObjectNameDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
