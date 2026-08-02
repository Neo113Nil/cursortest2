package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
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

@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
/* loaded from: classes9.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzs();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int versionCode;

    @SafeParcelable.Field(id = 4)
    CommonWalletObject zzbn;

    @SafeParcelable.Field(id = 2)
    String zzce;

    @SafeParcelable.Field(id = 3)
    String zzdc;

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

        public final OfferWalletObject build() {
            OfferWalletObject.this.zzbn = this.zzbu.zzh();
            return OfferWalletObject.this;
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

        public final Builder setClassId(String str) {
            this.zzbu.zzb(str);
            return this;
        }

        public final Builder setId(String str) {
            this.zzbu.zza(str);
            OfferWalletObject.this.zzce = str;
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

        public final Builder setRedemptionCode(String str) {
            OfferWalletObject.this.zzdc = str;
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

    @SafeParcelable.Constructor
    OfferWalletObject(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) CommonWalletObject commonWalletObject) {
        this.versionCode = i11;
        this.zzdc = str2;
        if (i11 < 3) {
            this.zzbn = CommonWalletObject.zzg().zza(str).zzh();
        } else {
            this.zzbn = commonWalletObject;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public final String getClassId() {
        return this.zzbn.getClassId();
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

    public final String getRedemptionCode() {
        return this.zzdc;
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

    public final int getVersionCode() {
        return this.versionCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zzce, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbn, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    OfferWalletObject() {
        this.versionCode = 3;
    }
}
