package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "PaymentDataCreator")
/* loaded from: classes9.dex */
public final class PaymentData extends AbstractSafeParcelable implements AutoResolvableResult {
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzu();

    @SafeParcelable.Field(id = 5)
    private String zzbc;

    @SafeParcelable.Field(id = 1)
    private String zzbf;

    @SafeParcelable.Field(id = 4)
    private PaymentMethodToken zzbm;

    @SafeParcelable.Field(id = 7)
    private String zzcc;

    @SafeParcelable.Field(id = 2)
    private CardInfo zzde;

    @SafeParcelable.Field(id = 3)
    private UserAddress zzdf;

    @SafeParcelable.Field(id = 6)
    private Bundle zzdg;

    @SafeParcelable.Field(id = 8)
    private Bundle zzdh;

    public final class zza {
        private zza() {
        }
    }

    @SafeParcelable.Constructor
    PaymentData(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) CardInfo cardInfo, @SafeParcelable.Param(id = 3) UserAddress userAddress, @SafeParcelable.Param(id = 4) PaymentMethodToken paymentMethodToken, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) Bundle bundle, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Bundle bundle2) {
        this.zzbf = str;
        this.zzde = cardInfo;
        this.zzdf = userAddress;
        this.zzbm = paymentMethodToken;
        this.zzbc = str2;
        this.zzdg = bundle;
        this.zzcc = str3;
        this.zzdh = bundle2;
    }

    public static PaymentData fromJson(String str) {
        zza zzaVar = new zza();
        String str2 = (String) Preconditions.checkNotNull(str, "paymentDataJson cannot be null!");
        PaymentData paymentData = PaymentData.this;
        paymentData.zzcc = str2;
        return paymentData;
    }

    public static PaymentData getFromIntent(@NonNull Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @Deprecated
    public final CardInfo getCardInfo() {
        return this.zzde;
    }

    @Deprecated
    public final String getEmail() {
        return this.zzbf;
    }

    @Deprecated
    public final Bundle getExtraData() {
        return this.zzdg;
    }

    @Deprecated
    public final String getGoogleTransactionId() {
        return this.zzbc;
    }

    public final Bundle getLastSavedState() {
        return this.zzdh;
    }

    @Deprecated
    public final PaymentMethodToken getPaymentMethodToken() {
        return this.zzbm;
    }

    @Deprecated
    public final UserAddress getShippingAddress() {
        return this.zzdf;
    }

    @Override // com.google.android.gms.wallet.AutoResolvableResult
    public final void putIntoIntent(@NonNull Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    public final String toJson() {
        return this.zzcc;
    }

    public final PaymentData withLastSavedState(Bundle bundle) {
        this.zzdh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzbf, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzde, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbm, i11, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbc, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.zzdg, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzcc, false);
        SafeParcelWriter.writeBundle(parcel, 8, this.zzdh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private PaymentData() {
    }
}
