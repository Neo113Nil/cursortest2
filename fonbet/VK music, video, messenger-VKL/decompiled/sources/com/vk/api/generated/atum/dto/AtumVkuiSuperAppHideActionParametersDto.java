package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AtumVkuiSuperAppHideActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiSuperAppHideActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiSuperAppHideActionParametersDto> CREATOR = new a();

    @pmi0("uid")
    private final String uid;

    /* compiled from: AtumVkuiSuperAppHideActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiSuperAppHideActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSuperAppHideActionParametersDto createFromParcel(Parcel parcel) {
            return new AtumVkuiSuperAppHideActionParametersDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSuperAppHideActionParametersDto[] newArray(int i) {
            return new AtumVkuiSuperAppHideActionParametersDto[i];
        }
    }

    public AtumVkuiSuperAppHideActionParametersDto(String str) {
        this.uid = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumVkuiSuperAppHideActionParametersDto) && epx.f(this.uid, ((AtumVkuiSuperAppHideActionParametersDto) obj).uid);
    }

    public final int hashCode() {
        return this.uid.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AtumVkuiSuperAppHideActionParametersDto(uid="), this.uid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
    }
}
