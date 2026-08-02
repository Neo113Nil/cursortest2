package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "IsReadyToPayRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzn();

    @SafeParcelable.Field(id = 2)
    ArrayList<Integer> zzao;

    @SafeParcelable.Field(id = 4)
    private String zzby;

    @SafeParcelable.Field(id = 5)
    private String zzbz;

    @SafeParcelable.Field(id = 6)
    ArrayList<Integer> zzca;

    @SafeParcelable.Field(id = 7)
    boolean zzcb;

    @SafeParcelable.Field(id = 8)
    private String zzcc;

    @Deprecated
    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedCardNetwork(int i11) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzao == null) {
                isReadyToPayRequest.zzao = new ArrayList<>();
            }
            IsReadyToPayRequest.this.zzao.add(Integer.valueOf(i11));
            return this;
        }

        public final Builder addAllowedCardNetworks(Collection<Integer> collection) {
            Preconditions.checkArgument((collection == null || collection.isEmpty()) ? false : true, "allowedCardNetworks can't be null or empty. If you want the defaults, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzao == null) {
                isReadyToPayRequest.zzao = new ArrayList<>();
            }
            IsReadyToPayRequest.this.zzao.addAll(collection);
            return this;
        }

        public final Builder addAllowedPaymentMethod(int i11) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzca == null) {
                isReadyToPayRequest.zzca = new ArrayList<>();
            }
            IsReadyToPayRequest.this.zzca.add(Integer.valueOf(i11));
            return this;
        }

        public final Builder addAllowedPaymentMethods(Collection<Integer> collection) {
            Preconditions.checkArgument((collection == null || collection.isEmpty()) ? false : true, "allowedPaymentMethods can't be null or empty. If you want the default, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzca == null) {
                isReadyToPayRequest.zzca = new ArrayList<>();
            }
            IsReadyToPayRequest.this.zzca.addAll(collection);
            return this;
        }

        public final IsReadyToPayRequest build() {
            return IsReadyToPayRequest.this;
        }

        public final Builder setExistingPaymentMethodRequired(boolean z11) {
            IsReadyToPayRequest.this.zzcb = z11;
            return this;
        }
    }

    IsReadyToPayRequest() {
    }

    public static IsReadyToPayRequest fromJson(String str) {
        Builder newBuilder = newBuilder();
        IsReadyToPayRequest.this.zzcc = (String) Preconditions.checkNotNull(str, "isReadyToPayRequestJson cannot be null!");
        return newBuilder.build();
    }

    @Deprecated
    public static Builder newBuilder() {
        return new Builder();
    }

    @Deprecated
    public final ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzao;
    }

    @Deprecated
    public final ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzca;
    }

    @Deprecated
    public final boolean isExistingPaymentMethodRequired() {
        return this.zzcb;
    }

    public final String toJson() {
        return this.zzcc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.zzao, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzby, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbz, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzca, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzcb);
        SafeParcelWriter.writeString(parcel, 8, this.zzcc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    IsReadyToPayRequest(@SafeParcelable.Param(id = 2) ArrayList<Integer> arrayList, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) ArrayList<Integer> arrayList2, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str3) {
        this.zzao = arrayList;
        this.zzby = str;
        this.zzbz = str2;
        this.zzca = arrayList2;
        this.zzcb = z11;
        this.zzcc = str3;
    }
}
