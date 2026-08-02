package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Arrays;
import java.util.List;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@ShowFirstParty
@SafeParcelable.Class(creator = "CardInfoCreator")
@SafeParcelable.Reserved({1, 14})
/* loaded from: classes9.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new zzd();
    private static final com.google.android.gms.internal.tapandpay.zzar<Integer> zzL = com.google.android.gms.internal.tapandpay.zzar.zzi(10, 9);

    @SafeParcelable.Field(id = AppUpdateInfo.Factory.DAYS_BETWEEN_30)
    long zzA;

    @SafeParcelable.Field(id = DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER)
    long zzB;

    @SafeParcelable.Field(id = 32)
    boolean zzC;

    @SafeParcelable.Field(id = 33)
    long zzD;

    @SafeParcelable.Field(id = 34)
    String zzE;

    @SafeParcelable.Field(id = DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER)
    String zzF;

    @SafeParcelable.Field(id = DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER)
    zze zzG;

    @SafeParcelable.Field(id = DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER)
    int zzH;

    @SafeParcelable.Field(id = 38)
    boolean zzI;

    @SafeParcelable.Field(id = DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER)
    String zzJ;

    @SafeParcelable.Field(id = 40)
    int zzK;

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    byte[] zzb;

    @SafeParcelable.Field(id = 4)
    String zzc;

    @SafeParcelable.Field(id = 5)
    String zzd;

    @SafeParcelable.Field(id = 6)
    int zze;

    @SafeParcelable.Field(id = 7)
    TokenStatus zzf;

    @SafeParcelable.Field(id = 8)
    String zzg;

    @SafeParcelable.Field(id = 9)
    Uri zzh;

    @SafeParcelable.Field(id = 10)
    int zzi;

    @SafeParcelable.Field(id = 11)
    int zzj;

    @SafeParcelable.Field(id = 12)
    zzaj zzk;

    @SafeParcelable.Field(id = 13)
    String zzl;

    @SafeParcelable.Field(id = 15)
    zzaz zzm;

    @SafeParcelable.Field(id = 16)
    String zzn;

    @SafeParcelable.Field(id = 17)
    byte[] zzo;

    @SafeParcelable.Field(id = 18)
    int zzp;

    @SafeParcelable.Field(id = 20)
    int zzq;

    @SafeParcelable.Field(id = 21)
    int zzr;

    @SafeParcelable.Field(id = 22)
    zzah zzs;

    @SafeParcelable.Field(id = 23)
    zzaf zzt;

    @SafeParcelable.Field(id = 24)
    String zzu;

    @SafeParcelable.Field(id = TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER)
    zzan[] zzv;

    @SafeParcelable.Field(id = TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
    boolean zzw;

    @SafeParcelable.Field(id = DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER)
    List<zzb> zzx;

    @SafeParcelable.Field(id = 28)
    boolean zzy;

    @SafeParcelable.Field(id = 29)
    boolean zzz;

    @SafeParcelable.Constructor
    CardInfo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) int i11, @SafeParcelable.Param(id = 7) TokenStatus tokenStatus, @SafeParcelable.Param(id = 8) String str4, @SafeParcelable.Param(id = 9) Uri uri, @SafeParcelable.Param(id = 10) int i12, @SafeParcelable.Param(id = 11) int i13, @SafeParcelable.Param(id = 12) zzaj zzajVar, @SafeParcelable.Param(id = 13) String str5, @SafeParcelable.Param(id = 15) zzaz zzazVar, @SafeParcelable.Param(id = 16) String str6, @SafeParcelable.Param(id = 17) byte[] bArr2, @SafeParcelable.Param(id = 18) int i14, @SafeParcelable.Param(id = 20) int i15, @SafeParcelable.Param(id = 21) int i16, @SafeParcelable.Param(id = 22) zzah zzahVar, @SafeParcelable.Param(id = 23) zzaf zzafVar, @SafeParcelable.Param(id = 24) String str7, @SafeParcelable.Param(id = 25) zzan[] zzanVarArr, @SafeParcelable.Param(id = 26) boolean z11, @SafeParcelable.Param(id = 27) List<zzb> list, @SafeParcelable.Param(id = 28) boolean z12, @SafeParcelable.Param(id = 29) boolean z13, @SafeParcelable.Param(id = 30) long j11, @SafeParcelable.Param(id = 31) long j12, @SafeParcelable.Param(id = 32) boolean z14, @SafeParcelable.Param(id = 33) long j13, @SafeParcelable.Param(id = 34) String str8, @SafeParcelable.Param(id = 35) String str9, @SafeParcelable.Param(id = 36) zze zzeVar, @SafeParcelable.Param(id = 37) int i17, @SafeParcelable.Param(id = 38) boolean z15, @SafeParcelable.Param(id = 39) String str10, @SafeParcelable.Param(id = 40) int i18) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = i11;
        this.zzf = tokenStatus;
        this.zzg = str4;
        this.zzh = uri;
        this.zzi = i12;
        this.zzj = i13;
        this.zzk = zzajVar;
        this.zzl = str5;
        this.zzm = zzazVar;
        this.zzn = str6;
        this.zzo = bArr2;
        this.zzp = i14;
        this.zzq = i15;
        this.zzr = i16;
        this.zzs = zzahVar;
        this.zzt = zzafVar;
        this.zzu = str7;
        this.zzv = zzanVarArr;
        this.zzw = z11;
        this.zzx = list;
        this.zzy = z12;
        this.zzz = z13;
        this.zzA = j11;
        this.zzB = j12;
        this.zzC = z14;
        this.zzD = j13;
        this.zzE = str8;
        this.zzF = str9;
        this.zzG = zzeVar;
        this.zzH = i17;
        this.zzI = z15;
        this.zzJ = str10;
        this.zzK = i18;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (Objects.equal(this.zza, cardInfo.zza) && Arrays.equals(this.zzb, cardInfo.zzb) && Objects.equal(this.zzc, cardInfo.zzc) && Objects.equal(this.zzd, cardInfo.zzd) && this.zze == cardInfo.zze && Objects.equal(this.zzf, cardInfo.zzf) && Objects.equal(this.zzg, cardInfo.zzg) && Objects.equal(this.zzh, cardInfo.zzh) && this.zzi == cardInfo.zzi && this.zzj == cardInfo.zzj && Objects.equal(this.zzk, cardInfo.zzk) && Objects.equal(this.zzl, cardInfo.zzl) && Objects.equal(this.zzm, cardInfo.zzm) && this.zzp == cardInfo.zzp && this.zzq == cardInfo.zzq && this.zzr == cardInfo.zzr && Objects.equal(this.zzs, cardInfo.zzs) && Objects.equal(this.zzt, cardInfo.zzt) && Objects.equal(this.zzu, cardInfo.zzu) && Arrays.equals(this.zzv, cardInfo.zzv) && this.zzw == cardInfo.zzw && Objects.equal(this.zzx, cardInfo.zzx) && this.zzy == cardInfo.zzy && this.zzz == cardInfo.zzz && this.zzA == cardInfo.zzA && this.zzC == cardInfo.zzC && this.zzD == cardInfo.zzD && Objects.equal(this.zzE, cardInfo.zzE) && Objects.equal(this.zzF, cardInfo.zzF) && Objects.equal(this.zzG, cardInfo.zzG) && this.zzH == cardInfo.zzH && this.zzI == cardInfo.zzI && this.zzK == cardInfo.zzK) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), this.zzf, this.zzg, this.zzh, Integer.valueOf(this.zzi), Integer.valueOf(this.zzj), this.zzl, this.zzm, Integer.valueOf(this.zzp), Integer.valueOf(this.zzq), Integer.valueOf(this.zzr), this.zzs, this.zzt, this.zzu, this.zzv, Boolean.valueOf(this.zzw), this.zzx, Boolean.valueOf(this.zzy), Boolean.valueOf(this.zzz), Long.valueOf(this.zzA), Boolean.valueOf(this.zzC), Long.valueOf(this.zzD), this.zzE, this.zzF, this.zzG, Integer.valueOf(this.zzH), Boolean.valueOf(this.zzI), Integer.valueOf(this.zzK));
    }

    @RecentlyNonNull
    public final String toString() {
        Objects.ToStringHelper add = Objects.toStringHelper(this).add("billingCardId", this.zza);
        byte[] bArr = this.zzb;
        Objects.ToStringHelper add2 = add.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add("cardholderName", this.zzc).add("displayName", this.zzd).add("cardNetwork", Integer.valueOf(this.zze)).add("tokenStatus", this.zzf).add("panLastDigits", this.zzg).add("cardImageUrl", this.zzh).add("cardColor", Integer.valueOf(this.zzi)).add("overlayTextColor", Integer.valueOf(this.zzj));
        zzaj zzajVar = this.zzk;
        Objects.ToStringHelper add3 = add2.add("issuerInfo", zzajVar == null ? null : zzajVar.toString()).add("tokenLastDigits", this.zzl).add("transactionInfo", this.zzm).add("issuerTokenId", this.zzn);
        byte[] bArr2 = this.zzo;
        Objects.ToStringHelper add4 = add3.add("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2)).add("cachedEligibility", Integer.valueOf(this.zzp)).add("paymentProtocol", Integer.valueOf(this.zzq)).add("tokenType", Integer.valueOf(this.zzr)).add("inStoreCvmConfig", this.zzs).add("inAppCvmConfig", this.zzt).add("tokenDisplayName", this.zzu);
        zzan[] zzanVarArr = this.zzv;
        Objects.ToStringHelper add5 = add4.add("onlineAccountCardLinkInfos", zzanVarArr != null ? Arrays.toString(zzanVarArr) : null).add("allowAidSelection", Boolean.valueOf(this.zzw));
        String join = TextUtils.join(", ", this.zzx);
        StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
        sb2.append('[');
        sb2.append(join);
        sb2.append(']');
        return add5.add("badges", sb2.toString()).add("upgradeAvailable", Boolean.valueOf(this.zzy)).add("requiresSignature", Boolean.valueOf(this.zzz)).add("googleTokenId", Long.valueOf(this.zzA)).add("isTransit", Boolean.valueOf(this.zzC)).add("googleWalletId", Long.valueOf(this.zzD)).add("devicePaymentMethodId", this.zzE).add("cloudPaymentMethodId", this.zzF).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i11, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i11, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzi);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i11, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzm, i11, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzo, false);
        SafeParcelWriter.writeInt(parcel, 18, this.zzp);
        SafeParcelWriter.writeInt(parcel, 20, this.zzq);
        SafeParcelWriter.writeInt(parcel, 21, this.zzr);
        SafeParcelWriter.writeParcelable(parcel, 22, this.zzs, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzt, i11, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzu, false);
        SafeParcelWriter.writeTypedArray(parcel, 25, this.zzv, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzw);
        SafeParcelWriter.writeTypedList(parcel, 27, this.zzx, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzy);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzz);
        SafeParcelWriter.writeLong(parcel, 30, this.zzA);
        SafeParcelWriter.writeLong(parcel, 31, this.zzB);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzC);
        SafeParcelWriter.writeLong(parcel, 33, this.zzD);
        SafeParcelWriter.writeString(parcel, 34, this.zzE, false);
        SafeParcelWriter.writeString(parcel, 35, this.zzF, false);
        SafeParcelWriter.writeParcelable(parcel, 36, this.zzG, i11, false);
        SafeParcelWriter.writeInt(parcel, 37, this.zzH);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzI);
        SafeParcelWriter.writeString(parcel, 39, this.zzJ, false);
        SafeParcelWriter.writeInt(parcel, 40, this.zzK);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
