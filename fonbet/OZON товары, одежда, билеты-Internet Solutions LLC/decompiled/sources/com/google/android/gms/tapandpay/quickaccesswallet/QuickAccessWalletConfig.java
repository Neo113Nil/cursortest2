package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class(creator = "QuickAccessWalletConfigCreator")
/* loaded from: classes9.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getCardWidthPx", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getCardHeightPx", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getMaxCards", id = 3)
    private int zzc;

    @SafeParcelable.Field(getter = "getCurrentWalletCardIds", id = 5)
    private String[] zzd;

    @ShowFirstParty
    public static final class Builder {
        private final QuickAccessWalletConfig zza;

        public Builder() {
            this.zza = new QuickAccessWalletConfig(null);
        }

        @RecentlyNonNull
        public QuickAccessWalletConfig build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setCardHeightPx(int i11) {
            this.zza.zzb = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardWidthPx(int i11) {
            this.zza.zza = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setCurrentWalletCardIds(@RecentlyNonNull String[] strArr) {
            this.zza.zzd = strArr;
            return this;
        }

        @RecentlyNonNull
        public Builder setMaxCards(int i11) {
            this.zza.zzc = i11;
            return this;
        }

        public Builder(@RecentlyNonNull QuickAccessWalletConfig quickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig2 = new QuickAccessWalletConfig(null);
            this.zza = quickAccessWalletConfig2;
            quickAccessWalletConfig2.zza = quickAccessWalletConfig.zza;
            quickAccessWalletConfig2.zzb = quickAccessWalletConfig.zzb;
            quickAccessWalletConfig2.zzc = quickAccessWalletConfig.zzc;
            quickAccessWalletConfig2.zzd = quickAccessWalletConfig.zzd;
        }
    }

    private QuickAccessWalletConfig() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(quickAccessWalletConfig.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(quickAccessWalletConfig.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(quickAccessWalletConfig.zzc)) && Arrays.equals(this.zzd, quickAccessWalletConfig.zzd)) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.zzb;
    }

    public int getCardWidthPx() {
        return this.zza;
    }

    @RecentlyNonNull
    public String[] getCurrentWalletCardIds() {
        return this.zzd;
    }

    public int getMaxCards() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 2, getCardHeightPx());
        SafeParcelWriter.writeInt(parcel, 3, getMaxCards());
        SafeParcelWriter.writeStringArray(parcel, 5, getCurrentWalletCardIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    QuickAccessWalletConfig(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13, @SafeParcelable.Param(id = 5) String[] strArr) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = strArr;
    }

    /* synthetic */ QuickAccessWalletConfig(zzg zzgVar) {
    }
}
