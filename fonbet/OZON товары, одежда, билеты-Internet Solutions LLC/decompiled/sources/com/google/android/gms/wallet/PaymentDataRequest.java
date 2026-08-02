package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
/* loaded from: classes9.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzw();

    @SafeParcelable.Field(id = 6)
    ArrayList<Integer> zzca;

    @SafeParcelable.Field(id = 10)
    String zzcc;

    @SafeParcelable.Field(id = 11)
    private Bundle zzdh;

    @SafeParcelable.Field(id = 1)
    boolean zzdj;

    @SafeParcelable.Field(id = 2)
    boolean zzdk;

    @SafeParcelable.Field(id = 3)
    CardRequirements zzdl;

    @SafeParcelable.Field(id = 4)
    boolean zzdm;

    @SafeParcelable.Field(id = 5)
    ShippingAddressRequirements zzdn;

    @SafeParcelable.Field(id = 7)
    PaymentMethodTokenizationParameters zzdo;

    @SafeParcelable.Field(id = 8)
    TransactionInfo zzdp;

    @SafeParcelable.Field(defaultValue = "true", id = 9)
    boolean zzdq;

    @Deprecated
    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedPaymentMethod(int i11) {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzca == null) {
                paymentDataRequest.zzca = new ArrayList<>();
            }
            PaymentDataRequest.this.zzca.add(Integer.valueOf(i11));
            return this;
        }

        public final Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            Preconditions.checkArgument((collection == null || collection.isEmpty()) ? false : true, "allowedPaymentMethods can't be null or empty!");
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzca == null) {
                paymentDataRequest.zzca = new ArrayList<>();
            }
            PaymentDataRequest.this.zzca.addAll(collection);
            return this;
        }

        public final PaymentDataRequest build() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzcc == null) {
                Preconditions.checkNotNull(paymentDataRequest.zzca, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.zzdl, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.zzdo != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.zzdp, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }

        public final Builder setCardRequirements(@NonNull CardRequirements cardRequirements) {
            PaymentDataRequest.this.zzdl = cardRequirements;
            return this;
        }

        public final Builder setEmailRequired(boolean z11) {
            PaymentDataRequest.this.zzdj = z11;
            return this;
        }

        public final Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            PaymentDataRequest.this.zzdo = paymentMethodTokenizationParameters;
            return this;
        }

        public final Builder setPhoneNumberRequired(boolean z11) {
            PaymentDataRequest.this.zzdk = z11;
            return this;
        }

        public final Builder setShippingAddressRequired(boolean z11) {
            PaymentDataRequest.this.zzdm = z11;
            return this;
        }

        public final Builder setShippingAddressRequirements(@NonNull ShippingAddressRequirements shippingAddressRequirements) {
            PaymentDataRequest.this.zzdn = shippingAddressRequirements;
            return this;
        }

        public final Builder setTransactionInfo(@NonNull TransactionInfo transactionInfo) {
            PaymentDataRequest.this.zzdp = transactionInfo;
            return this;
        }

        public final Builder setUiRequired(boolean z11) {
            PaymentDataRequest.this.zzdq = z11;
            return this;
        }
    }

    @SafeParcelable.Constructor
    PaymentDataRequest(@SafeParcelable.Param(id = 1) boolean z11, @SafeParcelable.Param(id = 2) boolean z12, @SafeParcelable.Param(id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(id = 4) boolean z13, @SafeParcelable.Param(id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(id = 6) ArrayList<Integer> arrayList, @SafeParcelable.Param(id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(id = 9) boolean z14, @SafeParcelable.Param(id = 10) String str, @SafeParcelable.Param(id = 11) Bundle bundle) {
        this.zzdj = z11;
        this.zzdk = z12;
        this.zzdl = cardRequirements;
        this.zzdm = z13;
        this.zzdn = shippingAddressRequirements;
        this.zzca = arrayList;
        this.zzdo = paymentMethodTokenizationParameters;
        this.zzdp = transactionInfo;
        this.zzdq = z14;
        this.zzcc = str;
        this.zzdh = bundle;
    }

    public static PaymentDataRequest fromJson(String str) {
        Builder newBuilder = newBuilder();
        PaymentDataRequest.this.zzcc = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return newBuilder.build();
    }

    @Deprecated
    public static Builder newBuilder() {
        return new Builder();
    }

    @Deprecated
    public final ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzca;
    }

    @Deprecated
    public final CardRequirements getCardRequirements() {
        return this.zzdl;
    }

    @Deprecated
    public final PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzdo;
    }

    public final Bundle getSavedState() {
        return this.zzdh;
    }

    @Deprecated
    public final ShippingAddressRequirements getShippingAddressRequirements() {
        return this.zzdn;
    }

    @Deprecated
    public final TransactionInfo getTransactionInfo() {
        return this.zzdp;
    }

    @Deprecated
    public final boolean isEmailRequired() {
        return this.zzdj;
    }

    @Deprecated
    public final boolean isPhoneNumberRequired() {
        return this.zzdk;
    }

    @Deprecated
    public final boolean isShippingAddressRequired() {
        return this.zzdm;
    }

    @Deprecated
    public final boolean isUiRequired() {
        return this.zzdq;
    }

    public final String toJson() {
        return this.zzcc;
    }

    public final PaymentDataRequest withSavedState(Bundle bundle) {
        this.zzdh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzdj);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdk);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdl, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdm);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzdn, i11, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzca, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdo, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzdp, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzdq);
        SafeParcelWriter.writeString(parcel, 10, this.zzcc, false);
        SafeParcelWriter.writeBundle(parcel, 11, this.zzdh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private PaymentDataRequest() {
        this.zzdq = true;
    }
}
