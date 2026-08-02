package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfrl;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzv {
    public static boolean zza(zzflo zzfloVar) {
        return zzg(zzfloVar.a.a) != 1;
    }

    public static String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? CampaignEx.CLICKMODE_ON : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? Fc.e : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    @Nullable
    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfrl zzd(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        boolean isEmpty = TextUtils.isEmpty(string);
        zzfrl zzfrlVar = zzfrl.SCAR_REQUEST_TYPE_UNSPECIFIED;
        if (isEmpty) {
            return zzfrlVar;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    return zzfrl.SCAR_REQUEST_TYPE_ADMOB;
                }
                return zzfrlVar;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    return zzfrl.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                }
                return zzfrlVar;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    return zzfrl.SCAR_REQUEST_TYPE_GBID;
                }
                return zzfrlVar;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    return zzfrl.SCAR_REQUEST_TYPE_GOLDENEYE;
                }
                return zzfrlVar;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    return zzfrl.SCAR_REQUEST_TYPE_YAVIN;
                }
                return zzfrlVar;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    return zzfrl.SCAR_REQUEST_TYPE_UNITY;
                }
                return zzfrlVar;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    return zzfrl.SCAR_REQUEST_TYPE_PAW;
                }
                return zzfrlVar;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    return zzfrl.SCAR_REQUEST_TYPE_GUILDER;
                }
                return zzfrlVar;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    return zzfrl.SCAR_REQUEST_TYPE_GAM_S2S;
                }
                return zzfrlVar;
            default:
                return zzfrlVar;
        }
    }

    public static void zze(final zzeao zzeaoVar, @Nullable zzeae zzeaeVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z7)).booleanValue()) {
            zzcgj.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzeao zzeaoVar2 = zzeao.this;
                    zzeaoVar2.getClass();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzeaoVar2.a);
                    if (!TextUtils.isEmpty("action")) {
                        String str2 = str;
                        if (!TextUtils.isEmpty(str2)) {
                            concurrentHashMap.put("action", str2);
                        }
                    }
                    int i = 0;
                    while (true) {
                        Pair[] pairArr2 = pairArr;
                        if (i >= pairArr2.length) {
                            zzeaoVar2.b(concurrentHashMap);
                            return;
                        }
                        Pair pair = pairArr2[i];
                        String str3 = (String) pair.first;
                        String str4 = (String) pair.second;
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            concurrentHashMap.put(str3, str4);
                        }
                        i++;
                    }
                }
            });
        }
    }

    public static int zzg(zzflw zzflwVar) {
        if (zzflwVar.s) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
