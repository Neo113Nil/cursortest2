package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StorePurchaseResponseDto.kt */
/* loaded from: classes15.dex */
public final class StorePurchaseResponseDto implements Parcelable {
    public static final Parcelable.Creator<StorePurchaseResponseDto> CREATOR = new a();

    @pmi0("consumed")
    private final BaseBoolIntDto consumed;

    @pmi0("error_fatal")
    private final BaseBoolIntDto errorFatal;

    @pmi0("error_message")
    private final String errorMessage;

    @pmi0("message")
    private final String message;

    @pmi0("order_id")
    private final Integer orderId;

    @pmi0("order_status")
    private final Integer orderStatus;

    @pmi0("product")
    private final StoreProductDto product;

    @pmi0("state")
    private final int state;

    @pmi0("subscription_id")
    private final Integer subscriptionId;

    /* compiled from: StorePurchaseResponseDto.kt */
    public static final class a implements Parcelable.Creator<StorePurchaseResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StorePurchaseResponseDto createFromParcel(Parcel parcel) {
            return new StorePurchaseResponseDto(parcel.readInt(), (BaseBoolIntDto) parcel.readParcelable(StorePurchaseResponseDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StoreProductDto.CREATOR.createFromParcel(parcel), (BaseBoolIntDto) parcel.readParcelable(StorePurchaseResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StorePurchaseResponseDto[] newArray(int i) {
            return new StorePurchaseResponseDto[i];
        }
    }

    public StorePurchaseResponseDto(int i, BaseBoolIntDto baseBoolIntDto, String str, String str2, StoreProductDto storeProductDto, BaseBoolIntDto baseBoolIntDto2, Integer num, Integer num2, Integer num3) {
        this.state = i;
        this.errorFatal = baseBoolIntDto;
        this.errorMessage = str;
        this.message = str2;
        this.product = storeProductDto;
        this.consumed = baseBoolIntDto2;
        this.subscriptionId = num;
        this.orderId = num2;
        this.orderStatus = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorePurchaseResponseDto)) {
            return false;
        }
        StorePurchaseResponseDto storePurchaseResponseDto = (StorePurchaseResponseDto) obj;
        return this.state == storePurchaseResponseDto.state && this.errorFatal == storePurchaseResponseDto.errorFatal && epx.f(this.errorMessage, storePurchaseResponseDto.errorMessage) && epx.f(this.message, storePurchaseResponseDto.message) && epx.f(this.product, storePurchaseResponseDto.product) && this.consumed == storePurchaseResponseDto.consumed && epx.f(this.subscriptionId, storePurchaseResponseDto.subscriptionId) && epx.f(this.orderId, storePurchaseResponseDto.orderId) && epx.f(this.orderStatus, storePurchaseResponseDto.orderStatus);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.state) * 31;
        BaseBoolIntDto baseBoolIntDto = this.errorFatal;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str = this.errorMessage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoreProductDto storeProductDto = this.product;
        int hashCode5 = (hashCode4 + (storeProductDto == null ? 0 : storeProductDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.consumed;
        int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Integer num = this.subscriptionId;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.orderId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.orderStatus;
        return hashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorePurchaseResponseDto(state=");
        sb.append(this.state);
        sb.append(", errorFatal=");
        sb.append(this.errorFatal);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", consumed=");
        sb.append(this.consumed);
        sb.append(", subscriptionId=");
        sb.append(this.subscriptionId);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", orderStatus=");
        return uqi.b(sb, this.orderStatus, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.state);
        parcel.writeParcelable(this.errorFatal, i);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.message);
        StoreProductDto storeProductDto = this.product;
        if (storeProductDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeProductDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.consumed, i);
        Integer num = this.subscriptionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.orderId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.orderStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ StorePurchaseResponseDto(int i, BaseBoolIntDto baseBoolIntDto, String str, String str2, StoreProductDto storeProductDto, BaseBoolIntDto baseBoolIntDto2, Integer num, Integer num2, Integer num3, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : baseBoolIntDto, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : storeProductDto, (i2 & 32) != 0 ? null : baseBoolIntDto2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : num3);
    }
}
