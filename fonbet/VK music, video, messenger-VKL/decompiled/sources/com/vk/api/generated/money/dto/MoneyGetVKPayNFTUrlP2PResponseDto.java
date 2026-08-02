package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneyGetVKPayNFTUrlP2PResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetVKPayNFTUrlP2PResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetVKPayNFTUrlP2PResponseDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: MoneyGetVKPayNFTUrlP2PResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetVKPayNFTUrlP2PResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetVKPayNFTUrlP2PResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetVKPayNFTUrlP2PResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetVKPayNFTUrlP2PResponseDto[] newArray(int i) {
            return new MoneyGetVKPayNFTUrlP2PResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyGetVKPayNFTUrlP2PResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyGetVKPayNFTUrlP2PResponseDto) && epx.f(this.url, ((MoneyGetVKPayNFTUrlP2PResponseDto) obj).url);
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MoneyGetVKPayNFTUrlP2PResponseDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public MoneyGetVKPayNFTUrlP2PResponseDto(String str) {
        this.url = str;
    }

    public /* synthetic */ MoneyGetVKPayNFTUrlP2PResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
