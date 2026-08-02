package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MoneyGetTransferLinksResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetTransferLinksResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetTransferLinksResponseDto> CREATOR = new a();

    @pmi0("anonymous_link")
    private final String anonymousLink;

    @pmi0("public_link")
    private final String publicLink;

    /* compiled from: MoneyGetTransferLinksResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetTransferLinksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferLinksResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetTransferLinksResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferLinksResponseDto[] newArray(int i) {
            return new MoneyGetTransferLinksResponseDto[i];
        }
    }

    public MoneyGetTransferLinksResponseDto(String str, String str2) {
        this.publicLink = str;
        this.anonymousLink = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetTransferLinksResponseDto)) {
            return false;
        }
        MoneyGetTransferLinksResponseDto moneyGetTransferLinksResponseDto = (MoneyGetTransferLinksResponseDto) obj;
        return epx.f(this.publicLink, moneyGetTransferLinksResponseDto.publicLink) && epx.f(this.anonymousLink, moneyGetTransferLinksResponseDto.anonymousLink);
    }

    public final int hashCode() {
        return this.anonymousLink.hashCode() + (this.publicLink.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetTransferLinksResponseDto(publicLink=");
        sb.append(this.publicLink);
        sb.append(", anonymousLink=");
        return ho8.a(sb, this.anonymousLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.publicLink);
        parcel.writeString(this.anonymousLink);
    }
}
