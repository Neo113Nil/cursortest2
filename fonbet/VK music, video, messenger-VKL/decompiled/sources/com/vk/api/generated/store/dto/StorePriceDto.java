package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StorePriceDto.kt */
/* loaded from: classes15.dex */
public final class StorePriceDto implements Parcelable {
    public static final Parcelable.Creator<StorePriceDto> CREATOR = new a();

    @pmi0("amount")
    private final int amount;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    /* compiled from: StorePriceDto.kt */
    public static final class a implements Parcelable.Creator<StorePriceDto> {
        @Override // android.os.Parcelable.Creator
        public final StorePriceDto createFromParcel(Parcel parcel) {
            return new StorePriceDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StorePriceDto[] newArray(int i) {
            return new StorePriceDto[i];
        }
    }

    public StorePriceDto(int i, String str) {
        this.amount = i;
        this.currency = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorePriceDto)) {
            return false;
        }
        StorePriceDto storePriceDto = (StorePriceDto) obj;
        return this.amount == storePriceDto.amount && epx.f(this.currency, storePriceDto.currency);
    }

    public final int hashCode() {
        return this.currency.hashCode() + (Integer.hashCode(this.amount) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorePriceDto(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        return ho8.a(sb, this.currency, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.amount);
        parcel.writeString(this.currency);
    }
}
