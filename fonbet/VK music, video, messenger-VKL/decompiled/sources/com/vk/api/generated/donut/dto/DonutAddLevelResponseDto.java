package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: DonutAddLevelResponseDto.kt */
/* loaded from: classes14.dex */
public final class DonutAddLevelResponseDto implements Parcelable {
    public static final Parcelable.Creator<DonutAddLevelResponseDto> CREATOR = new a();

    @pmi0("level")
    private final DonutLevelDto level;

    /* compiled from: DonutAddLevelResponseDto.kt */
    public static final class a implements Parcelable.Creator<DonutAddLevelResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutAddLevelResponseDto createFromParcel(Parcel parcel) {
            return new DonutAddLevelResponseDto(DonutLevelDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutAddLevelResponseDto[] newArray(int i) {
            return new DonutAddLevelResponseDto[i];
        }
    }

    public DonutAddLevelResponseDto(DonutLevelDto donutLevelDto) {
        this.level = donutLevelDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonutAddLevelResponseDto) && epx.f(this.level, ((DonutAddLevelResponseDto) obj).level);
    }

    public final int hashCode() {
        return this.level.hashCode();
    }

    public final String toString() {
        return "DonutAddLevelResponseDto(level=" + this.level + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.level.writeToParcel(parcel, i);
    }
}
