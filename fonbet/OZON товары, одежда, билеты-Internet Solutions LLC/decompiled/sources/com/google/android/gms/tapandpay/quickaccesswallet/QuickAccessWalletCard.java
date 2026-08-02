package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
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
@SafeParcelable.Class(creator = "QuickAccessWalletCardCreator")
/* loaded from: classes9.dex */
public final class QuickAccessWalletCard extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<QuickAccessWalletCard> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getCardId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getCardImage", id = 2)
    private Bitmap zzb;

    @SafeParcelable.Field(getter = "getContentDescription", id = 3)
    private String zzc;

    @SafeParcelable.Field(getter = "getIntents", id = 4)
    private WalletCardIntent[] zzd;

    @SafeParcelable.Field(getter = "getIconMessages", id = 5)
    private CardIconMessage[] zze;

    @SafeParcelable.Field(getter = "getAvailableTimestamp", id = 6)
    private long zzf;

    @SafeParcelable.Field(getter = "getExpirationTimestamp", id = 7)
    private long zzg;

    @ShowFirstParty
    public static final class Builder {
        private final QuickAccessWalletCard zza;

        public Builder() {
            this.zza = new QuickAccessWalletCard(null);
        }

        @RecentlyNonNull
        public QuickAccessWalletCard build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setAvailableTimestamp(long j11) {
            this.zza.zzf = j11;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardId(@RecentlyNonNull String str) {
            this.zza.zza = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardImage(@RecentlyNonNull Bitmap bitmap) {
            this.zza.zzb = bitmap;
            return this;
        }

        @RecentlyNonNull
        public Builder setContentDescription(@RecentlyNonNull String str) {
            this.zza.zzc = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setExpirationTimestamp(long j11) {
            this.zza.zzg = j11;
            return this;
        }

        @RecentlyNonNull
        public Builder setIconMessages(@RecentlyNonNull CardIconMessage[] cardIconMessageArr) {
            this.zza.zze = cardIconMessageArr;
            return this;
        }

        @RecentlyNonNull
        public Builder setIntents(@RecentlyNonNull WalletCardIntent[] walletCardIntentArr) {
            this.zza.zzd = walletCardIntentArr;
            return this;
        }

        public Builder(@RecentlyNonNull QuickAccessWalletCard quickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard2 = new QuickAccessWalletCard(null);
            this.zza = quickAccessWalletCard2;
            quickAccessWalletCard2.zza = quickAccessWalletCard.zza;
            quickAccessWalletCard2.zzb = quickAccessWalletCard.zzb;
            quickAccessWalletCard2.zzc = quickAccessWalletCard.zzc;
            quickAccessWalletCard2.zzd = quickAccessWalletCard.zzd;
            quickAccessWalletCard2.zze = quickAccessWalletCard.zze;
            quickAccessWalletCard2.zzf = quickAccessWalletCard.zzf;
            quickAccessWalletCard2.zzg = quickAccessWalletCard.zzg;
        }
    }

    private QuickAccessWalletCard() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard = (QuickAccessWalletCard) obj;
            if (Objects.equal(this.zza, quickAccessWalletCard.zza) && Objects.equal(this.zzb, quickAccessWalletCard.zzb) && Objects.equal(this.zzc, quickAccessWalletCard.zzc) && Arrays.equals(this.zzd, quickAccessWalletCard.zzd) && Arrays.equals(this.zze, quickAccessWalletCard.zze) && Objects.equal(Long.valueOf(this.zzf), Long.valueOf(quickAccessWalletCard.zzf)) && Objects.equal(Long.valueOf(this.zzg), Long.valueOf(quickAccessWalletCard.zzg))) {
                return true;
            }
        }
        return false;
    }

    public long getAvailableTimestamp() {
        return this.zzf;
    }

    @RecentlyNonNull
    public String getCardId() {
        return this.zza;
    }

    @RecentlyNonNull
    public Bitmap getCardImage() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getContentDescription() {
        return this.zzc;
    }

    public long getExpirationTimestamp() {
        return this.zzg;
    }

    @RecentlyNonNull
    public CardIconMessage[] getIconMessages() {
        return this.zze;
    }

    @RecentlyNonNull
    public WalletCardIntent[] getIntents() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)), Long.valueOf(this.zzf), Long.valueOf(this.zzg));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getCardImage(), i11, false);
        SafeParcelWriter.writeString(parcel, 3, getContentDescription(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, getIntents(), i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, getIconMessages(), i11, false);
        SafeParcelWriter.writeLong(parcel, 6, getAvailableTimestamp());
        SafeParcelWriter.writeLong(parcel, 7, getExpirationTimestamp());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ QuickAccessWalletCard(zze zzeVar) {
    }

    @SafeParcelable.Constructor
    QuickAccessWalletCard(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bitmap bitmap, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) WalletCardIntent[] walletCardIntentArr, @SafeParcelable.Param(id = 5) CardIconMessage[] cardIconMessageArr, @SafeParcelable.Param(id = 6) long j11, @SafeParcelable.Param(id = 7) long j12) {
        this.zza = str;
        this.zzb = bitmap;
        this.zzc = str2;
        this.zzd = walletCardIntentArr;
        this.zze = cardIconMessageArr;
        this.zzf = j11;
        this.zzg = j12;
    }
}
