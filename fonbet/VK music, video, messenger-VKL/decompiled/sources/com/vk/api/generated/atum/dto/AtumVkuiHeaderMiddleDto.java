package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiHeaderMiddleDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiHeaderMiddleDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiHeaderMiddleDto> CREATOR = new a();

    @pmi0("size")
    private final AtumVkuiHeaderMiddleSizeDto size;

    @pmi0("subtitle")
    private final AtumVkuiHeaderSubtitleDto subtitle;

    @pmi0("title")
    private final AtumVkuiHeaderTitleDto title;

    /* compiled from: AtumVkuiHeaderMiddleDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiHeaderMiddleDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderMiddleDto createFromParcel(Parcel parcel) {
            return new AtumVkuiHeaderMiddleDto(AtumVkuiHeaderTitleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiHeaderMiddleSizeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiHeaderSubtitleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderMiddleDto[] newArray(int i) {
            return new AtumVkuiHeaderMiddleDto[i];
        }
    }

    public AtumVkuiHeaderMiddleDto(AtumVkuiHeaderTitleDto atumVkuiHeaderTitleDto, AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto, AtumVkuiHeaderSubtitleDto atumVkuiHeaderSubtitleDto) {
        this.title = atumVkuiHeaderTitleDto;
        this.size = atumVkuiHeaderMiddleSizeDto;
        this.subtitle = atumVkuiHeaderSubtitleDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiHeaderMiddleDto)) {
            return false;
        }
        AtumVkuiHeaderMiddleDto atumVkuiHeaderMiddleDto = (AtumVkuiHeaderMiddleDto) obj;
        return epx.f(this.title, atumVkuiHeaderMiddleDto.title) && this.size == atumVkuiHeaderMiddleDto.size && epx.f(this.subtitle, atumVkuiHeaderMiddleDto.subtitle);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto = this.size;
        int hashCode2 = (hashCode + (atumVkuiHeaderMiddleSizeDto == null ? 0 : atumVkuiHeaderMiddleSizeDto.hashCode())) * 31;
        AtumVkuiHeaderSubtitleDto atumVkuiHeaderSubtitleDto = this.subtitle;
        return hashCode2 + (atumVkuiHeaderSubtitleDto != null ? atumVkuiHeaderSubtitleDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiHeaderMiddleDto(title=" + this.title + ", size=" + this.size + ", subtitle=" + this.subtitle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto = this.size;
        if (atumVkuiHeaderMiddleSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiHeaderMiddleSizeDto.writeToParcel(parcel, i);
        }
        AtumVkuiHeaderSubtitleDto atumVkuiHeaderSubtitleDto = this.subtitle;
        if (atumVkuiHeaderSubtitleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiHeaderSubtitleDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiHeaderMiddleDto(AtumVkuiHeaderTitleDto atumVkuiHeaderTitleDto, AtumVkuiHeaderMiddleSizeDto atumVkuiHeaderMiddleSizeDto, AtumVkuiHeaderSubtitleDto atumVkuiHeaderSubtitleDto, int i, zcl zclVar) {
        this(atumVkuiHeaderTitleDto, (i & 2) != 0 ? null : atumVkuiHeaderMiddleSizeDto, (i & 4) != 0 ? null : atumVkuiHeaderSubtitleDto);
    }
}
