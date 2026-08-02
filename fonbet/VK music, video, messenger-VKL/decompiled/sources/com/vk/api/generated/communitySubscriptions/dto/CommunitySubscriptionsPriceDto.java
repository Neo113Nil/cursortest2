package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommunitySubscriptionsPriceDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsPriceDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsPriceDto> CREATOR = new a();

    @pmi0("amount")
    private final int amount;

    @pmi0("text")
    private final String text;

    /* compiled from: CommunitySubscriptionsPriceDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsPriceDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsPriceDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsPriceDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsPriceDto[] newArray(int i) {
            return new CommunitySubscriptionsPriceDto[i];
        }
    }

    public CommunitySubscriptionsPriceDto(int i, String str) {
        this.amount = i;
        this.text = str;
    }

    public final int d() {
        return this.amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunitySubscriptionsPriceDto)) {
            return false;
        }
        CommunitySubscriptionsPriceDto communitySubscriptionsPriceDto = (CommunitySubscriptionsPriceDto) obj;
        return this.amount == communitySubscriptionsPriceDto.amount && epx.f(this.text, communitySubscriptionsPriceDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (Integer.hashCode(this.amount) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunitySubscriptionsPriceDto(amount=");
        sb.append(this.amount);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.amount);
        parcel.writeString(this.text);
    }
}
