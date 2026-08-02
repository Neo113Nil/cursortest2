package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BaseSnackbarDto.kt */
/* loaded from: classes14.dex */
public final class BaseSnackbarDto implements Parcelable {
    public static final Parcelable.Creator<BaseSnackbarDto> CREATOR = new a();

    @pmi0("icon")
    private final BaseSnackbarIconDto icon;

    @pmi0("message")
    private final String message;

    /* compiled from: BaseSnackbarDto.kt */
    public static final class a implements Parcelable.Creator<BaseSnackbarDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarDto createFromParcel(Parcel parcel) {
            return new BaseSnackbarDto(BaseSnackbarIconDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarDto[] newArray(int i) {
            return new BaseSnackbarDto[i];
        }
    }

    public BaseSnackbarDto(BaseSnackbarIconDto baseSnackbarIconDto, String str) {
        this.icon = baseSnackbarIconDto;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseSnackbarDto)) {
            return false;
        }
        BaseSnackbarDto baseSnackbarDto = (BaseSnackbarDto) obj;
        return epx.f(this.icon, baseSnackbarDto.icon) && epx.f(this.message, baseSnackbarDto.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.icon.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseSnackbarDto(icon=");
        sb.append(this.icon);
        sb.append(", message=");
        return ho8.a(sb, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.icon.writeToParcel(parcel, i);
        parcel.writeString(this.message);
    }
}
