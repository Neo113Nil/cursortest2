package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;

/* compiled from: BaseSnackbarIconDto.kt */
/* loaded from: classes14.dex */
public final class BaseSnackbarIconDto implements Parcelable {
    public static final Parcelable.Creator<BaseSnackbarIconDto> CREATOR = new a();

    @pmi0("color")
    private final BaseSnackbarIconColorDto color;

    @pmi0("type")
    private final BaseSnackbarIconTypeDto type;

    /* compiled from: BaseSnackbarIconDto.kt */
    public static final class a implements Parcelable.Creator<BaseSnackbarIconDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarIconDto createFromParcel(Parcel parcel) {
            return new BaseSnackbarIconDto(BaseSnackbarIconTypeDto.CREATOR.createFromParcel(parcel), BaseSnackbarIconColorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarIconDto[] newArray(int i) {
            return new BaseSnackbarIconDto[i];
        }
    }

    public BaseSnackbarIconDto(BaseSnackbarIconTypeDto baseSnackbarIconTypeDto, BaseSnackbarIconColorDto baseSnackbarIconColorDto) {
        this.type = baseSnackbarIconTypeDto;
        this.color = baseSnackbarIconColorDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseSnackbarIconDto)) {
            return false;
        }
        BaseSnackbarIconDto baseSnackbarIconDto = (BaseSnackbarIconDto) obj;
        return this.type == baseSnackbarIconDto.type && this.color == baseSnackbarIconDto.color;
    }

    public final int hashCode() {
        return this.color.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "BaseSnackbarIconDto(type=" + this.type + ", color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.color.writeToParcel(parcel, i);
    }
}
