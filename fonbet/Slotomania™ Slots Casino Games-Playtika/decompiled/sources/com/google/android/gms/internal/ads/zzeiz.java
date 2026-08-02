package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import androidx.autofill.HintConstants;
import com.google.android.gms.internal.ads.zzbhj;
import com.safedk.android.analytics.brandsafety.m;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeiz extends zzeja {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdbk zzc;
    private final TelephonyManager zzd;
    private final zzeir zze;
    private zzbhj.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbhj.zzaf.zzd.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbhj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbhj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbhj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbhj.zzaf.zzd.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbhj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbhj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbhj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbhj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbhj.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbhj.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbhj.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbhj.zzaf.zzd.CONNECTING);
    }

    zzeiz(Context context, zzdbk zzdbkVar, zzeir zzeirVar, zzein zzeinVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeinVar, zzgVar);
        this.zzb = context;
        this.zzc = zzdbkVar;
        this.zze = zzeirVar;
        this.zzd = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    static final /* synthetic */ zzbhj.zzaf.zzd zze(Bundle bundle) {
        return (zzbhj.zzaf.zzd) zzg.get(zzflb.zza(zzflb.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbhj.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbhj.zzq zzg(boolean z) {
        return z ? zzbhj.zzq.ENUM_TRUE : zzbhj.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z) {
        zzhbi.zzr(this.zzc.zza(new Bundle()), new zzeiy(this, z), zzcff.zzh);
    }

    final /* synthetic */ zzbhj.zzab zzb(Bundle bundle) {
        zzbhj.zzab.zzb zzbVar;
        zzbhj.zzab.zza zzq = zzbhj.zzab.zzq();
        int i = bundle.getInt(m.R, -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzf = zzbhj.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbhj.zzq.ENUM_FALSE;
            if (i == 0) {
                zzq.zzc(zzbhj.zzab.zzc.CELL);
            } else if (i != 1) {
                zzq.zzc(zzbhj.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzq.zzc(zzbhj.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbhj.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbhj.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbhj.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbhj.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzq.zzg(zzbVar);
        }
        return zzq.zzbu();
    }

    final /* synthetic */ byte[] zzc(boolean z, ArrayList arrayList, zzbhj.zzab zzabVar, zzbhj.zzaf.zzd zzdVar) {
        zzbhj.zzaf.zza.C0128zza zzz = zzbhj.zzaf.zza.zzz();
        zzz.zzv(arrayList);
        Context context = this.zzb;
        zzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzf(context, this.zzd));
        zzeir zzeirVar = this.zze;
        zzz.zzk(zzeirVar.zzf());
        zzz.zzo(zzeirVar.zzj());
        zzz.zzR(zzeirVar.zzd());
        zzz.zzZ(zzdVar);
        zzz.zzz(zzabVar);
        zzz.zzV(this.zzf);
        zzz.zzg(zzg(z));
        zzz.zzad(zzeirVar.zzb());
        zzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return zzz.zzbu().zzaN();
    }

    final /* synthetic */ zzeir zzd() {
        return this.zze;
    }
}
