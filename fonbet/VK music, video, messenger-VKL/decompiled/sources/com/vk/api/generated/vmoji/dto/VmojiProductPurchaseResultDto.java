package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VmojiProductPurchaseResultDto.kt */
/* loaded from: classes15.dex */
public final class VmojiProductPurchaseResultDto implements Parcelable {
    public static final Parcelable.Creator<VmojiProductPurchaseResultDto> CREATOR = new a();

    @pmi0("message")
    private final String message;

    @pmi0("product")
    private final VmojiProductDto product;

    /* compiled from: VmojiProductPurchaseResultDto.kt */
    public static final class a implements Parcelable.Creator<VmojiProductPurchaseResultDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiProductPurchaseResultDto createFromParcel(Parcel parcel) {
            return new VmojiProductPurchaseResultDto(VmojiProductDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiProductPurchaseResultDto[] newArray(int i) {
            return new VmojiProductPurchaseResultDto[i];
        }
    }

    public VmojiProductPurchaseResultDto(VmojiProductDto vmojiProductDto, String str) {
        this.product = vmojiProductDto;
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
        if (!(obj instanceof VmojiProductPurchaseResultDto)) {
            return false;
        }
        VmojiProductPurchaseResultDto vmojiProductPurchaseResultDto = (VmojiProductPurchaseResultDto) obj;
        return epx.f(this.product, vmojiProductPurchaseResultDto.product) && epx.f(this.message, vmojiProductPurchaseResultDto.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.product.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductPurchaseResultDto(product=");
        sb.append(this.product);
        sb.append(", message=");
        return ho8.a(sb, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.product.writeToParcel(parcel, i);
        parcel.writeString(this.message);
    }
}
