package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BadgesDonutAmountDto.kt */
/* loaded from: classes14.dex */
public final class BadgesDonutAmountDto implements Parcelable {
    public static final Parcelable.Creator<BadgesDonutAmountDto> CREATOR = new a();

    @pmi0("amount")
    private final String amount;

    @pmi0("amount_number")
    private final Integer amountNumber;

    @pmi0("miniapp_url")
    private final String miniappUrl;

    /* compiled from: BadgesDonutAmountDto.kt */
    public static final class a implements Parcelable.Creator<BadgesDonutAmountDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesDonutAmountDto createFromParcel(Parcel parcel) {
            return new BadgesDonutAmountDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesDonutAmountDto[] newArray(int i) {
            return new BadgesDonutAmountDto[i];
        }
    }

    public BadgesDonutAmountDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesDonutAmountDto)) {
            return false;
        }
        BadgesDonutAmountDto badgesDonutAmountDto = (BadgesDonutAmountDto) obj;
        return epx.f(this.amount, badgesDonutAmountDto.amount) && epx.f(this.amountNumber, badgesDonutAmountDto.amountNumber) && epx.f(this.miniappUrl, badgesDonutAmountDto.miniappUrl);
    }

    public final int hashCode() {
        String str = this.amount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.amountNumber;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.miniappUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesDonutAmountDto(amount=");
        sb.append(this.amount);
        sb.append(", amountNumber=");
        sb.append(this.amountNumber);
        sb.append(", miniappUrl=");
        return ho8.a(sb, this.miniappUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.amount);
        Integer num = this.amountNumber;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.miniappUrl);
    }

    public BadgesDonutAmountDto(String str, Integer num, String str2) {
        this.amount = str;
        this.amountNumber = num;
        this.miniappUrl = str2;
    }

    public /* synthetic */ BadgesDonutAmountDto(String str, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
