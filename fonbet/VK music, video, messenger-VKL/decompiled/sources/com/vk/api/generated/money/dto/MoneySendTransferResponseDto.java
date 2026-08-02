package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneySendTransferResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneySendTransferResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneySendTransferResponseDto> CREATOR = new a();

    @pmi0("redirect_uri")
    private final String redirectUri;

    @pmi0("transfer_id")
    private final Integer transferId;

    /* compiled from: MoneySendTransferResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneySendTransferResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneySendTransferResponseDto createFromParcel(Parcel parcel) {
            return new MoneySendTransferResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneySendTransferResponseDto[] newArray(int i) {
            return new MoneySendTransferResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneySendTransferResponseDto() {
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
        if (!(obj instanceof MoneySendTransferResponseDto)) {
            return false;
        }
        MoneySendTransferResponseDto moneySendTransferResponseDto = (MoneySendTransferResponseDto) obj;
        return epx.f(this.transferId, moneySendTransferResponseDto.transferId) && epx.f(this.redirectUri, moneySendTransferResponseDto.redirectUri);
    }

    public final int hashCode() {
        Integer num = this.transferId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.redirectUri;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneySendTransferResponseDto(transferId=");
        sb.append(this.transferId);
        sb.append(", redirectUri=");
        return ho8.a(sb, this.redirectUri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.transferId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.redirectUri);
    }

    public MoneySendTransferResponseDto(Integer num, String str) {
        this.transferId = num;
        this.redirectUri = str;
    }

    public /* synthetic */ MoneySendTransferResponseDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
