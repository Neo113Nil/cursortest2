package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();

    @SafeParcelable.Field(id = 5)
    String zzbr;

    @SafeParcelable.Field(id = 2)
    int zzfw;

    @SafeParcelable.Field(id = 3)
    String zzfx;

    @SafeParcelable.Field(id = 4)
    double zzfy;

    @SafeParcelable.Field(id = 6)
    long zzfz;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.wobs.LoyaltyPointsBalance.Type.UNDEFINED", id = 7)
    int zzga;

    public final class Builder {
        private Builder() {
        }

        public final LoyaltyPointsBalance build() {
            return LoyaltyPointsBalance.this;
        }

        public final Builder setDouble(double d11) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzfy = d11;
            loyaltyPointsBalance.zzga = 2;
            return this;
        }

        public final Builder setInt(int i11) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzfw = i11;
            loyaltyPointsBalance.zzga = 0;
            return this;
        }

        public final Builder setMoney(String str, long j11) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzbr = str;
            loyaltyPointsBalance.zzfz = j11;
            loyaltyPointsBalance.zzga = 3;
            return this;
        }

        public final Builder setString(String str) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzfx = str;
            loyaltyPointsBalance.zzga = 1;
            return this;
        }
    }

    public interface Type {
        public static final int DOUBLE = 2;
        public static final int INT = 0;
        public static final int MONEY = 3;
        public static final int STRING = 1;
        public static final int UNDEFINED = -1;
    }

    @SafeParcelable.Constructor
    LoyaltyPointsBalance(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) double d11, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) long j11, @SafeParcelable.Param(id = 7) int i12) {
        this.zzfw = i11;
        this.zzfx = str;
        this.zzfy = d11;
        this.zzbr = str2;
        this.zzfz = j11;
        this.zzga = i12;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String getCurrencyCode() {
        return this.zzbr;
    }

    public final long getCurrencyMicros() {
        return this.zzfz;
    }

    public final double getDouble() {
        return this.zzfy;
    }

    public final int getInt() {
        return this.zzfw;
    }

    public final String getString() {
        return this.zzfx;
    }

    public final int getType() {
        return this.zzga;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzfw);
        SafeParcelWriter.writeString(parcel, 3, this.zzfx, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzfy);
        SafeParcelWriter.writeString(parcel, 5, this.zzbr, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzfz);
        SafeParcelWriter.writeInt(parcel, 7, this.zzga);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    LoyaltyPointsBalance() {
        this.zzga = -1;
        this.zzfw = -1;
        this.zzfy = -1.0d;
    }
}
