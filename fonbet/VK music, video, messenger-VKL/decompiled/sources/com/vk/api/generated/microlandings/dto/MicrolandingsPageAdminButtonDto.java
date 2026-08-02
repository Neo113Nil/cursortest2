package com.vk.api.generated.microlandings.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MicrolandingsPageAdminButtonDto.kt */
/* loaded from: classes15.dex */
public final class MicrolandingsPageAdminButtonDto implements Parcelable {
    public static final Parcelable.Creator<MicrolandingsPageAdminButtonDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("hint_id")
    private final String hintId;

    /* compiled from: MicrolandingsPageAdminButtonDto.kt */
    public static final class a implements Parcelable.Creator<MicrolandingsPageAdminButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MicrolandingsPageAdminButtonDto createFromParcel(Parcel parcel) {
            return new MicrolandingsPageAdminButtonDto(parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MicrolandingsPageAdminButtonDto[] newArray(int i) {
            return new MicrolandingsPageAdminButtonDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MicrolandingsPageAdminButtonDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicrolandingsPageAdminButtonDto)) {
            return false;
        }
        MicrolandingsPageAdminButtonDto microlandingsPageAdminButtonDto = (MicrolandingsPageAdminButtonDto) obj;
        return epx.f(this.button, microlandingsPageAdminButtonDto.button) && epx.f(this.hintId, microlandingsPageAdminButtonDto.hintId);
    }

    public final int hashCode() {
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode = (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode()) * 31;
        String str = this.hintId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MicrolandingsPageAdminButtonDto(button=");
        sb.append(this.button);
        sb.append(", hintId=");
        return ho8.a(sb, this.hintId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.hintId);
    }

    public MicrolandingsPageAdminButtonDto(BaseLinkButtonDto baseLinkButtonDto, String str) {
        this.button = baseLinkButtonDto;
        this.hintId = str;
    }

    public /* synthetic */ MicrolandingsPageAdminButtonDto(BaseLinkButtonDto baseLinkButtonDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseLinkButtonDto, (i & 2) != 0 ? null : str);
    }
}
