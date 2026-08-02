package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class(creator = "WalletCardIntentExtraCreator")
/* loaded from: classes9.dex */
public final class WalletCardIntentExtra extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<WalletCardIntentExtra> CREATOR = new zzn();

    @SafeParcelable.Field(getter = "getKey", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getValueType", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getValueString", id = 3)
    private String zzc;

    @SafeParcelable.Field(getter = "getValueBytes", id = 4)
    private byte[] zzd;

    @SafeParcelable.Field(getter = "getValueBoolean", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getValueInt", id = 6)
    private int zzf;

    @SafeParcelable.Field(getter = "getValueLong", id = 7)
    private long zzg;

    @ShowFirstParty
    public static final class Builder {
        private final WalletCardIntentExtra zza;

        public Builder() {
            this.zza = new WalletCardIntentExtra(null);
        }

        @RecentlyNonNull
        public WalletCardIntentExtra build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setKey(@RecentlyNonNull String str) {
            this.zza.zza = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setValueBoolean(boolean z11) {
            this.zza.zze = z11;
            return this;
        }

        @RecentlyNonNull
        public Builder setValueBytes(byte[] bArr) {
            this.zza.zzd = bArr;
            return this;
        }

        @RecentlyNonNull
        public Builder setValueInt(int i11) {
            this.zza.zzf = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setValueLong(long j11) {
            this.zza.zzg = j11;
            return this;
        }

        @RecentlyNonNull
        public Builder setValueString(String str) {
            this.zza.zzc = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setValueType(int i11) {
            this.zza.zzb = i11;
            return this;
        }

        public Builder(@RecentlyNonNull WalletCardIntentExtra walletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra2 = new WalletCardIntentExtra(null);
            this.zza = walletCardIntentExtra2;
            walletCardIntentExtra2.zza = walletCardIntentExtra.zza;
            walletCardIntentExtra2.zzb = walletCardIntentExtra.zzb;
            walletCardIntentExtra2.zzc = walletCardIntentExtra.zzc;
            walletCardIntentExtra2.zzd = walletCardIntentExtra.zzd;
            walletCardIntentExtra2.zze = walletCardIntentExtra.zze;
            walletCardIntentExtra2.zzf = walletCardIntentExtra.zzf;
            walletCardIntentExtra2.zzg = walletCardIntentExtra.zzg;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ValueType {
        public static final int BOOLEAN = 3;
        public static final int BYTES = 2;
        public static final int INT = 4;
        public static final int LONG = 5;
        public static final int STRING = 1;
        public static final int VALUE_TYPE_UNKNOWN = 0;
    }

    private WalletCardIntentExtra() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra = (WalletCardIntentExtra) obj;
            if (Objects.equal(this.zza, walletCardIntentExtra.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(walletCardIntentExtra.zzb)) && Objects.equal(this.zzc, walletCardIntentExtra.zzc) && Arrays.equals(this.zzd, walletCardIntentExtra.zzd) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(walletCardIntentExtra.zze)) && Objects.equal(Integer.valueOf(this.zzf), Integer.valueOf(walletCardIntentExtra.zzf)) && Objects.equal(Long.valueOf(this.zzg), Long.valueOf(walletCardIntentExtra.zzg))) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public String getKey() {
        return this.zza;
    }

    public boolean getValueBoolean() {
        return this.zze;
    }

    @RecentlyNullable
    public byte[] getValueBytes() {
        return this.zzd;
    }

    public int getValueInt() {
        return this.zzf;
    }

    public long getValueLong() {
        return this.zzg;
    }

    @RecentlyNullable
    public String getValueString() {
        return this.zzc;
    }

    public int getValueType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Boolean.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getKey(), false);
        SafeParcelWriter.writeInt(parcel, 2, getValueType());
        SafeParcelWriter.writeString(parcel, 3, getValueString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getValueBytes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getValueBoolean());
        SafeParcelWriter.writeInt(parcel, 6, getValueInt());
        SafeParcelWriter.writeLong(parcel, 7, getValueLong());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ WalletCardIntentExtra(zzm zzmVar) {
    }

    @SafeParcelable.Constructor
    WalletCardIntentExtra(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) int i12, @SafeParcelable.Param(id = 7) long j11) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = z11;
        this.zzf = i12;
        this.zzg = j11;
    }
}
