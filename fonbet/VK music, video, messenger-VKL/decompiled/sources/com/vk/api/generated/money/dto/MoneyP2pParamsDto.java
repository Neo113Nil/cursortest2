package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: MoneyP2pParamsDto.kt */
/* loaded from: classes15.dex */
public final class MoneyP2pParamsDto implements Parcelable {
    public static final Parcelable.Creator<MoneyP2pParamsDto> CREATOR = new a();

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("max_amount")
    private final int maxAmount;

    @pmi0("min_amount")
    private final int minAmount;

    @pmi0("show_intro")
    private final boolean showIntro;

    /* compiled from: MoneyP2pParamsDto.kt */
    public static final class a implements Parcelable.Creator<MoneyP2pParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyP2pParamsDto createFromParcel(Parcel parcel) {
            return new MoneyP2pParamsDto(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyP2pParamsDto[] newArray(int i) {
            return new MoneyP2pParamsDto[i];
        }
    }

    public MoneyP2pParamsDto(int i, int i2, String str, boolean z) {
        this.minAmount = i;
        this.maxAmount = i2;
        this.currency = str;
        this.showIntro = z;
    }

    public final String d() {
        return this.currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.maxAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyP2pParamsDto)) {
            return false;
        }
        MoneyP2pParamsDto moneyP2pParamsDto = (MoneyP2pParamsDto) obj;
        return this.minAmount == moneyP2pParamsDto.minAmount && this.maxAmount == moneyP2pParamsDto.maxAmount && epx.f(this.currency, moneyP2pParamsDto.currency) && this.showIntro == moneyP2pParamsDto.showIntro;
    }

    public final int f() {
        return this.minAmount;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showIntro) + urd0.a(shy.a(this.maxAmount, Integer.hashCode(this.minAmount) * 31, 31), 31, this.currency);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyP2pParamsDto(minAmount=");
        sb.append(this.minAmount);
        sb.append(", maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", showIntro=");
        return q0.a(sb, this.showIntro, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.minAmount);
        parcel.writeInt(this.maxAmount);
        parcel.writeString(this.currency);
        parcel.writeInt(this.showIntro ? 1 : 0);
    }
}
