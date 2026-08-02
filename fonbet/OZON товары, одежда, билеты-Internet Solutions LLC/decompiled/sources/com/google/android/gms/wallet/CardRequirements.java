package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "CardRequirementsCreator")
/* loaded from: classes9.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zze();

    @SafeParcelable.Field(id = 1)
    ArrayList<Integer> zzao;

    @SafeParcelable.Field(defaultValue = "true", id = 2)
    boolean zzap;

    @SafeParcelable.Field(id = 3)
    boolean zzaq;

    @SafeParcelable.Field(id = 4)
    int zzar;

    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedCardNetwork(int i11) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zzao == null) {
                cardRequirements.zzao = new ArrayList<>();
            }
            CardRequirements.this.zzao.add(Integer.valueOf(i11));
            return this;
        }

        public final Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            Preconditions.checkArgument((collection == null || collection.isEmpty()) ? false : true, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zzao == null) {
                cardRequirements.zzao = new ArrayList<>();
            }
            CardRequirements.this.zzao.addAll(collection);
            return this;
        }

        public final CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.zzao, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        public final Builder setAllowPrepaidCards(boolean z11) {
            CardRequirements.this.zzap = z11;
            return this;
        }

        public final Builder setBillingAddressFormat(int i11) {
            CardRequirements.this.zzar = i11;
            return this;
        }

        public final Builder setBillingAddressRequired(boolean z11) {
            CardRequirements.this.zzaq = z11;
            return this;
        }
    }

    @SafeParcelable.Constructor
    CardRequirements(@SafeParcelable.Param(id = 1) ArrayList<Integer> arrayList, @SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) boolean z12, @SafeParcelable.Param(id = 4) int i11) {
        this.zzao = arrayList;
        this.zzap = z11;
        this.zzaq = z12;
        this.zzar = i11;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean allowPrepaidCards() {
        return this.zzap;
    }

    public final ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzao;
    }

    public final int getBillingAddressFormat() {
        return this.zzar;
    }

    public final boolean isBillingAddressRequired() {
        return this.zzaq;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zzao, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzap);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzaq);
        SafeParcelWriter.writeInt(parcel, 4, this.zzar);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CardRequirements() {
        this.zzap = true;
    }
}
