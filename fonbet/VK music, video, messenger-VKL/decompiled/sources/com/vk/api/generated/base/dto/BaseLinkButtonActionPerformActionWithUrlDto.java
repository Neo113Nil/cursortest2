package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkButtonActionPerformActionWithUrlDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionPerformActionWithUrlDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonActionPerformActionWithUrlDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionPerformActionsDto action;

    /* compiled from: BaseLinkButtonActionPerformActionWithUrlDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionPerformActionWithUrlDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionPerformActionWithUrlDto createFromParcel(Parcel parcel) {
            return new BaseLinkButtonActionPerformActionWithUrlDto(parcel.readInt() == 0 ? null : BaseLinkButtonActionPerformActionsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionPerformActionWithUrlDto[] newArray(int i) {
            return new BaseLinkButtonActionPerformActionWithUrlDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLinkButtonActionPerformActionWithUrlDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final BaseLinkButtonActionPerformActionsDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseLinkButtonActionPerformActionWithUrlDto) && this.action == ((BaseLinkButtonActionPerformActionWithUrlDto) obj).action;
    }

    public final int hashCode() {
        BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto = this.action;
        if (baseLinkButtonActionPerformActionsDto == null) {
            return 0;
        }
        return baseLinkButtonActionPerformActionsDto.hashCode();
    }

    public final String toString() {
        return "BaseLinkButtonActionPerformActionWithUrlDto(action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto = this.action;
        if (baseLinkButtonActionPerformActionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionPerformActionsDto.writeToParcel(parcel, i);
        }
    }

    public BaseLinkButtonActionPerformActionWithUrlDto(BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto) {
        this.action = baseLinkButtonActionPerformActionsDto;
    }

    public /* synthetic */ BaseLinkButtonActionPerformActionWithUrlDto(BaseLinkButtonActionPerformActionsDto baseLinkButtonActionPerformActionsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseLinkButtonActionPerformActionsDto);
    }
}
