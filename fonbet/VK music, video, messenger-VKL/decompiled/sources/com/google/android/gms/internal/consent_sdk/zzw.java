package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import java.util.HashSet;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
final class zzw {
    private final zzx zza;
    private final zzck zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    public zzw(zzx zzxVar, zzck zzckVar) {
        this.zza = zzxVar;
        this.zzb = zzckVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzz zza() throws zzg {
        zzap zzapVar;
        zzap zzapVar2;
        String str;
        zze zzeVar;
        zzan zzanVar;
        int i = this.zzb.zzf;
        boolean z = i == 8;
        zzapVar = this.zza.zzc;
        zzapVar.zzh(z);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(this.zzb.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(this.zzb.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        zzck zzckVar = this.zzb;
        int i3 = zzckVar.zzg;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i4 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str2 = zzckVar.zza;
        zzbp zzbpVar = str2 == null ? null : new zzbp(zzckVar.zzb, str2);
        zzapVar2 = this.zza.zzc;
        zzapVar2.zzj(new HashSet(zzckVar.zzd));
        for (zzcj zzcjVar : this.zzb.zze) {
            int i5 = zzcjVar.zzb;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    str = "write";
                } else if (i6 == 2) {
                    str = "clear";
                }
                if (str == null) {
                    zzx zzxVar = this.zza;
                    zzeVar = zzxVar.zza;
                    String str3 = zzcjVar.zza;
                    zzanVar = zzxVar.zzb;
                    zzeVar.zzb(str, str3, zzanVar);
                }
            }
            str = null;
            if (str == null) {
            }
        }
        return new zzz(this.zzc, this.zzd, zzbpVar, null);
    }
}
