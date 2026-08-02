package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiPurchaseProductResponseDto.kt */
/* loaded from: classes15.dex */
public final class VmojiPurchaseProductResponseDto implements Parcelable {
    public static final Parcelable.Creator<VmojiPurchaseProductResponseDto> CREATOR = new a();

    @pmi0("confirmation")
    private final VmojiProductPurchaseConfirmationDto confirmation;

    @pmi0("result")
    private final VmojiProductPurchaseResultDto result;

    /* compiled from: VmojiPurchaseProductResponseDto.kt */
    public static final class a implements Parcelable.Creator<VmojiPurchaseProductResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiPurchaseProductResponseDto createFromParcel(Parcel parcel) {
            return new VmojiPurchaseProductResponseDto(parcel.readInt() == 0 ? null : VmojiProductPurchaseConfirmationDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VmojiProductPurchaseResultDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiPurchaseProductResponseDto[] newArray(int i) {
            return new VmojiPurchaseProductResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VmojiPurchaseProductResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final VmojiProductPurchaseConfirmationDto d() {
        return this.confirmation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VmojiProductPurchaseResultDto e() {
        return this.result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiPurchaseProductResponseDto)) {
            return false;
        }
        VmojiPurchaseProductResponseDto vmojiPurchaseProductResponseDto = (VmojiPurchaseProductResponseDto) obj;
        return epx.f(this.confirmation, vmojiPurchaseProductResponseDto.confirmation) && epx.f(this.result, vmojiPurchaseProductResponseDto.result);
    }

    public final int hashCode() {
        VmojiProductPurchaseConfirmationDto vmojiProductPurchaseConfirmationDto = this.confirmation;
        int hashCode = (vmojiProductPurchaseConfirmationDto == null ? 0 : vmojiProductPurchaseConfirmationDto.hashCode()) * 31;
        VmojiProductPurchaseResultDto vmojiProductPurchaseResultDto = this.result;
        return hashCode + (vmojiProductPurchaseResultDto != null ? vmojiProductPurchaseResultDto.hashCode() : 0);
    }

    public final String toString() {
        return "VmojiPurchaseProductResponseDto(confirmation=" + this.confirmation + ", result=" + this.result + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VmojiProductPurchaseConfirmationDto vmojiProductPurchaseConfirmationDto = this.confirmation;
        if (vmojiProductPurchaseConfirmationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiProductPurchaseConfirmationDto.writeToParcel(parcel, i);
        }
        VmojiProductPurchaseResultDto vmojiProductPurchaseResultDto = this.result;
        if (vmojiProductPurchaseResultDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiProductPurchaseResultDto.writeToParcel(parcel, i);
        }
    }

    public VmojiPurchaseProductResponseDto(VmojiProductPurchaseConfirmationDto vmojiProductPurchaseConfirmationDto, VmojiProductPurchaseResultDto vmojiProductPurchaseResultDto) {
        this.confirmation = vmojiProductPurchaseConfirmationDto;
        this.result = vmojiProductPurchaseResultDto;
    }

    public /* synthetic */ VmojiPurchaseProductResponseDto(VmojiProductPurchaseConfirmationDto vmojiProductPurchaseConfirmationDto, VmojiProductPurchaseResultDto vmojiProductPurchaseResultDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : vmojiProductPurchaseConfirmationDto, (i & 2) != 0 ? null : vmojiProductPurchaseResultDto);
    }
}
