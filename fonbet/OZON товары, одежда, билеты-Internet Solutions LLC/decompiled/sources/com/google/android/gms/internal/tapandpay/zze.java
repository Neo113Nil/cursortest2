package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes9.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        switch (i11) {
            case 2:
                zzQ((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 3:
                zzu((Status) zzc.zza(parcel, Status.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 4:
                zzi((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzp) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzp.CREATOR));
                return true;
            case 5:
                zzP((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 6:
                zze((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 7:
            case 16:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            default:
                return false;
            case 8:
                zzd((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzj) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzj.CREATOR));
                return true;
            case 9:
                zzc((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 10:
                zzb();
                return true;
            case 11:
                zzn((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzd(parcel));
                return true;
            case 12:
                zzO((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 13:
                zzH((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzd(parcel));
                return true;
            case 14:
                zzI((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 15:
                zzf((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzl) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzl.CREATOR));
                return true;
            case 17:
                zzv((Status) zzc.zza(parcel, Status.CREATOR), (RetrieveInAppPaymentCredentialResponse) zzc.zza(parcel, RetrieveInAppPaymentCredentialResponse.CREATOR));
                return true;
            case 18:
                zzj((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 19:
                zzh((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 20:
                zzR((Status) zzc.zza(parcel, Status.CREATOR), (TokenStatus) zzc.zza(parcel, TokenStatus.CREATOR));
                return true;
            case 21:
                zzo((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzd(parcel));
                return true;
            case 22:
                zzw((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 23:
                zzN((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 24:
                zzq((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                zzp((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                zzL((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzad) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzad.CREATOR));
                return true;
            case 28:
                zzB((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzz) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzz.CREATOR));
                return true;
            case 29:
                zzC((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                zzk((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzr) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzr.CREATOR));
                return true;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                zzg((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzn) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzn.CREATOR));
                return true;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                zzK((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzab) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzab.CREATOR));
                return true;
            case 38:
                zzM((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                zzr((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzv) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzv.CREATOR));
                return true;
            case 40:
                zzs((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 41:
                zzJ((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzap) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzap.CREATOR));
                return true;
            case 42:
                zzt((Status) zzc.zza(parcel, Status.CREATOR), (GetGlobalActionCardsResponse) zzc.zza(parcel, GetGlobalActionCardsResponse.CREATOR));
                return true;
            case 43:
                zzz((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                zzD((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                zzE((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 46:
                zzy((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzx) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzx.CREATOR));
                return true;
            case 47:
                zzG((Status) zzc.zza(parcel, Status.CREATOR), (QuickAccessWalletConfig) zzc.zza(parcel, QuickAccessWalletConfig.CREATOR));
                return true;
            case 48:
                zzm((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzt) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzt.CREATOR));
                return true;
            case 49:
                zzx((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzd(parcel));
                return true;
            case 50:
                zzA((Status) zzc.zza(parcel, Status.CREATOR), (TokenInfo[]) parcel.createTypedArray(TokenInfo.CREATOR));
                return true;
            case 51:
                zzl((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzg) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzg.CREATOR));
                return true;
            case 52:
                zzF((Status) zzc.zza(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
        }
    }
}
