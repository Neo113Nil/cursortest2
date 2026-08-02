package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzdyu;
import com.google.android.gms.internal.ads.zzdze;
import com.google.android.gms.internal.ads.zzfke;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzfpx;
import com.ironsource.Fc;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzv {
    public static boolean zza(zzfke zzfkeVar) {
        return zzg(zzfkeVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzb(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return ExifInterface.GPS_MEASUREMENT_3D;
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return Fc.e;
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfpx zzd(Bundle bundle) {
        char c;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfpx.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return zzfpx.SCAR_REQUEST_TYPE_UNSPECIFIED;
    }

    public static void zze(final zzdze zzdzeVar, zzdyu zzdyuVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhT)).booleanValue()) {
            final zzdyu zzdyuVar2 = null;
            zzcff.zza.execute(new Runnable(zzdyuVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzv.zzf(zzdze.this, null, this.zzb, this.zzc);
                }
            });
        }
    }

    static /* synthetic */ void zzf(zzdze zzdzeVar, zzdyu zzdyuVar, String str, Pair[] pairArr) {
        ConcurrentHashMap zzd = zzdzeVar.zzd();
        zzh(zzd, "action", str);
        for (Pair pair : pairArr) {
            zzh(zzd, (String) pair.first, (String) pair.second);
        }
        zzdzeVar.zzb(zzd);
    }

    public static int zzg(zzfkm zzfkmVar) {
        if (zzfkmVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkmVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzh(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
