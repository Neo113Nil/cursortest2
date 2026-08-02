package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.TokenStatus;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public abstract class zzi extends zza implements zzf {
    public zzi() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.tapandpay.zza
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                zza((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 3:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (Bundle) zzd.zza(parcel, Bundle.CREATOR));
                return true;
            case 4:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzo) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzo.CREATOR));
                return true;
            case 5:
                zzb((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 6:
                zzc((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 7:
            case 16:
            case 34:
            default:
                return false;
            case 8:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzg) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzg.CREATOR));
                return true;
            case 9:
                zzd((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 10:
                zza();
                return true;
            case 11:
                zza((Status) zzd.zza(parcel, Status.CREATOR), zzd.zza(parcel));
                return true;
            case 12:
                zze((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 13:
                zzb((Status) zzd.zza(parcel, Status.CREATOR), zzd.zza(parcel));
                return true;
            case 14:
                zzf((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 15:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzi) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzi.CREATOR));
                return true;
            case 17:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzao) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzao.CREATOR));
                return true;
            case 18:
                zzb((Status) zzd.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 19:
                zzc((Status) zzd.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 20:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (TokenStatus) zzd.zza(parcel, TokenStatus.CREATOR));
                return true;
            case 21:
                zzc((Status) zzd.zza(parcel, Status.CREATOR), zzd.zza(parcel));
                return true;
            case 22:
                zzg((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 23:
                zzd((Status) zzd.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 24:
                zze((Status) zzd.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 25:
                zzh((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 26:
                zzd((Status) zzd.zza(parcel, Status.CREATOR), zzd.zza(parcel));
                return true;
            case 27:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzy) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzy.CREATOR));
                return true;
            case 28:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzu) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzu.CREATOR));
                return true;
            case 29:
                zzi((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 30:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzq) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzq.CREATOR));
                return true;
            case 31:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzk) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzk.CREATOR));
                return true;
            case 32:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzm) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzm.CREATOR));
                return true;
            case 33:
                zzj((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 35:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzw) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzw.CREATOR));
                return true;
            case 36:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzam) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzam.CREATOR));
                return true;
            case 37:
                zzk((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 38:
                zzl((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 39:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzs) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzs.CREATOR));
                return true;
            case 40:
                zzm((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 41:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (com.google.android.gms.tapandpay.firstparty.zzak) zzd.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzak.CREATOR));
                return true;
            case 42:
                zza((Status) zzd.zza(parcel, Status.CREATOR), (GetGlobalActionCardsResponse) zzd.zza(parcel, GetGlobalActionCardsResponse.CREATOR));
                return true;
            case 43:
                zza((Status) zzd.zza(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 44:
                zzn((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
            case 45:
                zzo((Status) zzd.zza(parcel, Status.CREATOR));
                return true;
        }
    }
}
