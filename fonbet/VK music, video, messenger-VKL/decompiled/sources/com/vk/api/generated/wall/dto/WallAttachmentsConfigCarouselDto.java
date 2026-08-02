package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallAttachmentsConfigCarouselDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsConfigCarouselDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsConfigCarouselDto> CREATOR = new a();

    @pmi0("ratio")
    private final WallAttachmentsConfigCarouselRatioDto ratio;

    /* compiled from: WallAttachmentsConfigCarouselDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsConfigCarouselDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigCarouselDto createFromParcel(Parcel parcel) {
            return new WallAttachmentsConfigCarouselDto(parcel.readInt() == 0 ? null : WallAttachmentsConfigCarouselRatioDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigCarouselDto[] newArray(int i) {
            return new WallAttachmentsConfigCarouselDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallAttachmentsConfigCarouselDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final WallAttachmentsConfigCarouselRatioDto d() {
        return this.ratio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallAttachmentsConfigCarouselDto) && epx.f(this.ratio, ((WallAttachmentsConfigCarouselDto) obj).ratio);
    }

    public final int hashCode() {
        WallAttachmentsConfigCarouselRatioDto wallAttachmentsConfigCarouselRatioDto = this.ratio;
        if (wallAttachmentsConfigCarouselRatioDto == null) {
            return 0;
        }
        return wallAttachmentsConfigCarouselRatioDto.hashCode();
    }

    public final String toString() {
        return "WallAttachmentsConfigCarouselDto(ratio=" + this.ratio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WallAttachmentsConfigCarouselRatioDto wallAttachmentsConfigCarouselRatioDto = this.ratio;
        if (wallAttachmentsConfigCarouselRatioDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallAttachmentsConfigCarouselRatioDto.writeToParcel(parcel, i);
        }
    }

    public WallAttachmentsConfigCarouselDto(WallAttachmentsConfigCarouselRatioDto wallAttachmentsConfigCarouselRatioDto) {
        this.ratio = wallAttachmentsConfigCarouselRatioDto;
    }

    public /* synthetic */ WallAttachmentsConfigCarouselDto(WallAttachmentsConfigCarouselRatioDto wallAttachmentsConfigCarouselRatioDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : wallAttachmentsConfigCarouselRatioDto);
    }
}
