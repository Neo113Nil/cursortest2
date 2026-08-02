package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "GiftCardWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzk();

    @SafeParcelable.Field(id = 4)
    String pin;

    @SafeParcelable.Field(id = 2)
    CommonWalletObject zzbn;

    @SafeParcelable.Field(id = 3)
    String zzbo;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    String zzbp;

    @SafeParcelable.Field(id = 6)
    long zzbq;

    @SafeParcelable.Field(id = 7)
    String zzbr;

    @SafeParcelable.Field(id = 8)
    long zzbs;

    @SafeParcelable.Field(id = 9)
    String zzbt;

    public final class Builder {
        private CommonWalletObject.zza zzbu;

        private Builder() {
            this.zzbu = CommonWalletObject.zzg();
        }

        public final Builder addImageModuleDataMainImageUri(UriData uriData) {
            this.zzbu.zza(uriData);
            return this;
        }

        public final Builder addImageModuleDataMainImageUris(Collection<UriData> collection) {
            this.zzbu.zzd(collection);
            return this;
        }

        public final Builder addInfoModuleDataLabelValueRow(LabelValueRow labelValueRow) {
            this.zzbu.zza(labelValueRow);
            return this;
        }

        public final Builder addInfoModuleDataLabelValueRows(Collection<LabelValueRow> collection) {
            this.zzbu.zzc(collection);
            return this;
        }

        public final Builder addLinksModuleDataUri(UriData uriData) {
            this.zzbu.zzb(uriData);
            return this;
        }

        public final Builder addLinksModuleDataUris(Collection<UriData> collection) {
            this.zzbu.zzf(collection);
            return this;
        }

        public final Builder addLocation(LatLng latLng) {
            this.zzbu.zza(latLng);
            return this;
        }

        public final Builder addLocations(Collection<LatLng> collection) {
            this.zzbu.zzb(collection);
            return this;
        }

        public final Builder addMessage(WalletObjectMessage walletObjectMessage) {
            this.zzbu.zza(walletObjectMessage);
            return this;
        }

        public final Builder addMessages(Collection<WalletObjectMessage> collection) {
            this.zzbu.zza(collection);
            return this;
        }

        public final Builder addTextModuleData(TextModuleData textModuleData) {
            this.zzbu.zza(textModuleData);
            return this;
        }

        public final Builder addTextModulesData(Collection<TextModuleData> collection) {
            this.zzbu.zze(collection);
            return this;
        }

        public final GiftCardWalletObject build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zzbo), "Card number is required.");
            GiftCardWalletObject.this.zzbn = this.zzbu.zzh();
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zzbn.getName()), "Card name is required.");
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zzbn.getIssuerName()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        public final Builder setBalanceCurrencyCode(String str) {
            GiftCardWalletObject.this.zzbr = str;
            return this;
        }

        public final Builder setBalanceMicros(long j11) {
            GiftCardWalletObject.this.zzbq = j11;
            return this;
        }

        public final Builder setBalanceUpdateTime(long j11) {
            GiftCardWalletObject.this.zzbs = j11;
            return this;
        }

        public final Builder setBarcodeAlternateText(String str) {
            this.zzbu.zze(str);
            return this;
        }

        @Deprecated
        public final Builder setBarcodeLabel(String str) {
            this.zzbu.zzh(str);
            return this;
        }

        public final Builder setBarcodeType(String str) {
            this.zzbu.zzf(str);
            return this;
        }

        public final Builder setBarcodeValue(String str) {
            this.zzbu.zzg(str);
            return this;
        }

        @Deprecated
        public final Builder setCardIdentifier(String str) {
            GiftCardWalletObject.this.zzbp = str;
            return this;
        }

        public final Builder setCardNumber(String str) {
            GiftCardWalletObject.this.zzbo = str;
            return this;
        }

        public final Builder setClassId(String str) {
            this.zzbu.zzb(str);
            return this;
        }

        public final Builder setEventNumber(String str) {
            GiftCardWalletObject.this.zzbt = str;
            return this;
        }

        public final Builder setId(String str) {
            this.zzbu.zza(str);
            return this;
        }

        @Deprecated
        public final Builder setInfoModuleDataHexBackgroundColor(String str) {
            this.zzbu.zzj(str);
            return this;
        }

        @Deprecated
        public final Builder setInfoModuleDataHexFontColor(String str) {
            this.zzbu.zzi(str);
            return this;
        }

        public final Builder setInfoModuleDataShowLastUpdateTime(boolean z11) {
            this.zzbu.zza(z11);
            return this;
        }

        public final Builder setIssuerName(String str) {
            this.zzbu.zzd(str);
            return this;
        }

        public final Builder setPin(String str) {
            GiftCardWalletObject.this.pin = str;
            return this;
        }

        public final Builder setState(int i11) {
            this.zzbu.zzd(i11);
            return this;
        }

        public final Builder setTitle(String str) {
            this.zzbu.zzc(str);
            return this;
        }

        public final Builder setValidTimeInterval(TimeInterval timeInterval) {
            this.zzbu.zza(timeInterval);
            return this;
        }
    }

    GiftCardWalletObject() {
        this.zzbn = CommonWalletObject.zzg().zzh();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String getBalanceCurrencyCode() {
        return this.zzbr;
    }

    public final long getBalanceMicros() {
        return this.zzbq;
    }

    public final long getBalanceUpdateTime() {
        return this.zzbs;
    }

    public final String getBarcodeAlternateText() {
        return this.zzbn.getBarcodeAlternateText();
    }

    @Deprecated
    public final String getBarcodeLabel() {
        return this.zzbn.getBarcodeLabel();
    }

    public final String getBarcodeType() {
        return this.zzbn.getBarcodeType();
    }

    public final String getBarcodeValue() {
        return this.zzbn.getBarcodeValue();
    }

    @Deprecated
    public final String getCardIdentifier() {
        return this.zzbp;
    }

    public final String getCardNumber() {
        return this.zzbo;
    }

    public final String getClassId() {
        return this.zzbn.getClassId();
    }

    public final String getEventNumber() {
        return this.zzbt;
    }

    public final String getId() {
        return this.zzbn.getId();
    }

    public final ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzbn.getImageModuleDataMainImageUris();
    }

    @Deprecated
    public final String getInfoModuleDataHexBackgroundColor() {
        return this.zzbn.getInfoModuleDataHexBackgroundColor();
    }

    @Deprecated
    public final String getInfoModuleDataHexFontColor() {
        return this.zzbn.getInfoModuleDataHexFontColor();
    }

    public final ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzbn.getInfoModuleDataLabelValueRows();
    }

    public final boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzbn.getInfoModuleDataShowLastUpdateTime();
    }

    public final String getIssuerName() {
        return this.zzbn.getIssuerName();
    }

    public final ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzbn.getLinksModuleDataUris();
    }

    public final ArrayList<LatLng> getLocations() {
        return this.zzbn.getLocations();
    }

    public final ArrayList<WalletObjectMessage> getMessages() {
        return this.zzbn.getMessages();
    }

    public final String getPin() {
        return this.pin;
    }

    public final int getState() {
        return this.zzbn.getState();
    }

    public final ArrayList<TextModuleData> getTextModulesData() {
        return this.zzbn.getTextModulesData();
    }

    public final String getTitle() {
        return this.zzbn.getName();
    }

    public final TimeInterval getValidTimeInterval() {
        return this.zzbn.getValidTimeInterval();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzbn, i11, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbo, false);
        SafeParcelWriter.writeString(parcel, 4, this.pin, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbp, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzbq);
        SafeParcelWriter.writeString(parcel, 7, this.zzbr, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzbs);
        SafeParcelWriter.writeString(parcel, 9, this.zzbt, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    GiftCardWalletObject(@SafeParcelable.Param(id = 2) CommonWalletObject commonWalletObject, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) long j11, @SafeParcelable.Param(id = 7) String str4, @SafeParcelable.Param(id = 8) long j12, @SafeParcelable.Param(id = 9) String str5) {
        CommonWalletObject.zzg().zzh();
        this.zzbn = commonWalletObject;
        this.zzbo = str;
        this.pin = str2;
        this.zzbq = j11;
        this.zzbr = str4;
        this.zzbs = j12;
        this.zzbt = str5;
        this.zzbp = str3;
    }
}
