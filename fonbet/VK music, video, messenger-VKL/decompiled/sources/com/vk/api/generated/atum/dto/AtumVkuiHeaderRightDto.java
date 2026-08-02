package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiHeaderRightDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiHeaderRightDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiHeaderRightDto> CREATOR = new a();

    @pmi0("action_button")
    private final AtumVkuiHeaderRightContentDto actionButton;

    @pmi0("circle_icon")
    private final AtumVkuiHeaderCircleIconDto circleIcon;

    @pmi0("icon_button")
    private final AtumVkuiIconButtonDto iconButton;

    /* compiled from: AtumVkuiHeaderRightDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiHeaderRightDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderRightDto createFromParcel(Parcel parcel) {
            return new AtumVkuiHeaderRightDto((AtumVkuiHeaderRightContentDto) parcel.readParcelable(AtumVkuiHeaderRightDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AtumVkuiIconButtonDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiHeaderCircleIconDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderRightDto[] newArray(int i) {
            return new AtumVkuiHeaderRightDto[i];
        }
    }

    public AtumVkuiHeaderRightDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiHeaderRightDto)) {
            return false;
        }
        AtumVkuiHeaderRightDto atumVkuiHeaderRightDto = (AtumVkuiHeaderRightDto) obj;
        return epx.f(this.actionButton, atumVkuiHeaderRightDto.actionButton) && epx.f(this.iconButton, atumVkuiHeaderRightDto.iconButton) && epx.f(this.circleIcon, atumVkuiHeaderRightDto.circleIcon);
    }

    public final int hashCode() {
        AtumVkuiHeaderRightContentDto atumVkuiHeaderRightContentDto = this.actionButton;
        int hashCode = (atumVkuiHeaderRightContentDto == null ? 0 : atumVkuiHeaderRightContentDto.hashCode()) * 31;
        AtumVkuiIconButtonDto atumVkuiIconButtonDto = this.iconButton;
        int hashCode2 = (hashCode + (atumVkuiIconButtonDto == null ? 0 : atumVkuiIconButtonDto.hashCode())) * 31;
        AtumVkuiHeaderCircleIconDto atumVkuiHeaderCircleIconDto = this.circleIcon;
        return hashCode2 + (atumVkuiHeaderCircleIconDto != null ? atumVkuiHeaderCircleIconDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiHeaderRightDto(actionButton=" + this.actionButton + ", iconButton=" + this.iconButton + ", circleIcon=" + this.circleIcon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.actionButton, i);
        AtumVkuiIconButtonDto atumVkuiIconButtonDto = this.iconButton;
        if (atumVkuiIconButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiIconButtonDto.writeToParcel(parcel, i);
        }
        AtumVkuiHeaderCircleIconDto atumVkuiHeaderCircleIconDto = this.circleIcon;
        if (atumVkuiHeaderCircleIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiHeaderCircleIconDto.writeToParcel(parcel, i);
        }
    }

    public AtumVkuiHeaderRightDto(AtumVkuiHeaderRightContentDto atumVkuiHeaderRightContentDto, AtumVkuiIconButtonDto atumVkuiIconButtonDto, AtumVkuiHeaderCircleIconDto atumVkuiHeaderCircleIconDto) {
        this.actionButton = atumVkuiHeaderRightContentDto;
        this.iconButton = atumVkuiIconButtonDto;
        this.circleIcon = atumVkuiHeaderCircleIconDto;
    }

    public /* synthetic */ AtumVkuiHeaderRightDto(AtumVkuiHeaderRightContentDto atumVkuiHeaderRightContentDto, AtumVkuiIconButtonDto atumVkuiIconButtonDto, AtumVkuiHeaderCircleIconDto atumVkuiHeaderCircleIconDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumVkuiHeaderRightContentDto, (i & 2) != 0 ? null : atumVkuiIconButtonDto, (i & 4) != 0 ? null : atumVkuiHeaderCircleIconDto);
    }
}
