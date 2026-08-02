package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneyGetTransferStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetTransferStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetTransferStatusResponseDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("receipt_uri")
    private final String receiptUri;

    @pmi0("redirect_uri")
    private final String redirectUri;

    @pmi0("status")
    private final String status;

    /* compiled from: MoneyGetTransferStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetTransferStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferStatusResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetTransferStatusResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferStatusResponseDto[] newArray(int i) {
            return new MoneyGetTransferStatusResponseDto[i];
        }
    }

    public MoneyGetTransferStatusResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetTransferStatusResponseDto)) {
            return false;
        }
        MoneyGetTransferStatusResponseDto moneyGetTransferStatusResponseDto = (MoneyGetTransferStatusResponseDto) obj;
        return epx.f(this.status, moneyGetTransferStatusResponseDto.status) && epx.f(this.description, moneyGetTransferStatusResponseDto.description) && epx.f(this.redirectUri, moneyGetTransferStatusResponseDto.redirectUri) && epx.f(this.receiptUri, moneyGetTransferStatusResponseDto.receiptUri);
    }

    public final int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redirectUri;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiptUri;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetTransferStatusResponseDto(status=");
        sb.append(this.status);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", redirectUri=");
        sb.append(this.redirectUri);
        sb.append(", receiptUri=");
        return ho8.a(sb, this.receiptUri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
        parcel.writeString(this.description);
        parcel.writeString(this.redirectUri);
        parcel.writeString(this.receiptUri);
    }

    public MoneyGetTransferStatusResponseDto(String str, String str2, String str3, String str4) {
        this.status = str;
        this.description = str2;
        this.redirectUri = str3;
        this.receiptUri = str4;
    }

    public /* synthetic */ MoneyGetTransferStatusResponseDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
