package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TransactionInfoCreator")
/* loaded from: classes9.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new zzai();

    @SafeParcelable.Field(id = 1)
    int zzee;

    @SafeParcelable.Field(id = 2)
    String zzef;

    @SafeParcelable.Field(id = 3)
    String zzeg;

    public final class Builder {
        private Builder() {
        }

        public final TransactionInfo build() {
            Preconditions.checkNotEmpty(TransactionInfo.this.zzeg, "currencyCode must be set!");
            TransactionInfo transactionInfo = TransactionInfo.this;
            int i11 = transactionInfo.zzee;
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
            }
            if (i11 == 2) {
                Preconditions.checkNotEmpty(transactionInfo.zzef, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
            }
            TransactionInfo transactionInfo2 = TransactionInfo.this;
            if (transactionInfo2.zzee == 3) {
                Preconditions.checkNotEmpty(transactionInfo2.zzef, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
            }
            return TransactionInfo.this;
        }

        public final Builder setCurrencyCode(@NonNull String str) {
            TransactionInfo.this.zzeg = str;
            return this;
        }

        public final Builder setTotalPrice(@NonNull String str) {
            TransactionInfo.this.zzef = str;
            return this;
        }

        public final Builder setTotalPriceStatus(int i11) {
            TransactionInfo.this.zzee = i11;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public TransactionInfo(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.zzee = i11;
        this.zzef = str;
        this.zzeg = str2;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String getCurrencyCode() {
        return this.zzeg;
    }

    public final String getTotalPrice() {
        return this.zzef;
    }

    public final int getTotalPriceStatus() {
        return this.zzee;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzee);
        SafeParcelWriter.writeString(parcel, 2, this.zzef, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzeg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private TransactionInfo() {
    }
}
