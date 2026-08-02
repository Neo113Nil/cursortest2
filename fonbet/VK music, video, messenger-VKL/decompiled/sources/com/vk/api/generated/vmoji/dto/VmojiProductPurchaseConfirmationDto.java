package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VmojiProductPurchaseConfirmationDto.kt */
/* loaded from: classes15.dex */
public final class VmojiProductPurchaseConfirmationDto implements Parcelable {
    public static final Parcelable.Creator<VmojiProductPurchaseConfirmationDto> CREATOR = new a();

    @pmi0("balance")
    private final int balance;

    @pmi0("product")
    private final VmojiProductDto product;

    /* compiled from: VmojiProductPurchaseConfirmationDto.kt */
    public static final class a implements Parcelable.Creator<VmojiProductPurchaseConfirmationDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiProductPurchaseConfirmationDto createFromParcel(Parcel parcel) {
            return new VmojiProductPurchaseConfirmationDto(VmojiProductDto.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiProductPurchaseConfirmationDto[] newArray(int i) {
            return new VmojiProductPurchaseConfirmationDto[i];
        }
    }

    public VmojiProductPurchaseConfirmationDto(VmojiProductDto vmojiProductDto, int i) {
        this.product = vmojiProductDto;
        this.balance = i;
    }

    public final int A7() {
        return this.balance;
    }

    public final VmojiProductDto d() {
        return this.product;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiProductPurchaseConfirmationDto)) {
            return false;
        }
        VmojiProductPurchaseConfirmationDto vmojiProductPurchaseConfirmationDto = (VmojiProductPurchaseConfirmationDto) obj;
        return epx.f(this.product, vmojiProductPurchaseConfirmationDto.product) && this.balance == vmojiProductPurchaseConfirmationDto.balance;
    }

    public final int hashCode() {
        return Integer.hashCode(this.balance) + (this.product.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductPurchaseConfirmationDto(product=");
        sb.append(this.product);
        sb.append(", balance=");
        return vu5.b(sb, this.balance, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.product.writeToParcel(parcel, i);
        parcel.writeInt(this.balance);
    }
}
