package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutGetInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<DonutGetInfoResponseDto> CREATOR = new a();

    @pmi0("group_donut_block")
    private final DonutGetInfoGroupDonutBlockDto groupDonutBlock;

    /* compiled from: DonutGetInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetInfoResponseDto createFromParcel(Parcel parcel) {
            return new DonutGetInfoResponseDto(parcel.readInt() == 0 ? null : DonutGetInfoGroupDonutBlockDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetInfoResponseDto[] newArray(int i) {
            return new DonutGetInfoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DonutGetInfoResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final DonutGetInfoGroupDonutBlockDto d() {
        return this.groupDonutBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonutGetInfoResponseDto) && epx.f(this.groupDonutBlock, ((DonutGetInfoResponseDto) obj).groupDonutBlock);
    }

    public final int hashCode() {
        DonutGetInfoGroupDonutBlockDto donutGetInfoGroupDonutBlockDto = this.groupDonutBlock;
        if (donutGetInfoGroupDonutBlockDto == null) {
            return 0;
        }
        return donutGetInfoGroupDonutBlockDto.hashCode();
    }

    public final String toString() {
        return "DonutGetInfoResponseDto(groupDonutBlock=" + this.groupDonutBlock + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DonutGetInfoGroupDonutBlockDto donutGetInfoGroupDonutBlockDto = this.groupDonutBlock;
        if (donutGetInfoGroupDonutBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutGetInfoGroupDonutBlockDto.writeToParcel(parcel, i);
        }
    }

    public DonutGetInfoResponseDto(DonutGetInfoGroupDonutBlockDto donutGetInfoGroupDonutBlockDto) {
        this.groupDonutBlock = donutGetInfoGroupDonutBlockDto;
    }

    public /* synthetic */ DonutGetInfoResponseDto(DonutGetInfoGroupDonutBlockDto donutGetInfoGroupDonutBlockDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : donutGetInfoGroupDonutBlockDto);
    }
}
