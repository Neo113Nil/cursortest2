package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.appsflyer.share.AdRevenueScheme;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.dvn;
import defpackage.fn0;
import defpackage.ox9;
import defpackage.qpn;
import defpackage.u2o;
import defpackage.utn;
import defpackage.uun;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeby extends zzbrk {
    public final zzecb b;
    public final zzebw c;
    public final HashMap d = new HashMap();

    public zzeby(zzecb zzecbVar, zzebw zzebwVar) {
        this.b = zzecbVar;
        this.c = zzebwVar;
    }

    public static com.google.android.gms.ads.internal.client.zzm E4(Map map) {
        zzn zznVar = new zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (!nextName.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            zznVar.zzb(bundle);
                            break;
                        }
                    case -839117230:
                        if (!nextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzd(jsonReader.nextBoolean());
                            break;
                        }
                    case -733436947:
                        if (!nextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                            break;
                        } else {
                            zznVar.zzf(1);
                            break;
                        }
                    case -99890337:
                        if (!nextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzh(jsonReader.nextInt());
                            break;
                        }
                    case 523149226:
                        if (!nextName.equals("keywords")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            zznVar.zzc(arrayList);
                            break;
                        }
                    case 597632527:
                        if (!nextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            String nextString = jsonReader.nextString();
                            if (!RequestConfiguration.zza.contains(nextString)) {
                                break;
                            } else {
                                zznVar.zzg(nextString);
                                break;
                            }
                        }
                    case 1411582723:
                        if (!nextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                            break;
                        } else {
                            zznVar.zze(1);
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zza = zznVar.zza();
        Bundle bundle2 = zza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zza.zza, zza.zzb, bundle3, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, bundle2, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx, zza.zzy, zza.zzz, zza.zzA, zza.zzB);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Bb)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map zzT = com.google.android.gms.ads.internal.util.zzs.zzT(parse);
            String str2 = (String) zzT.get("action");
            if (TextUtils.isEmpty(str2)) {
                zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            HashMap hashMap = this.d;
            zzebw zzebwVar = this.c;
            if (hashCode != 579053441) {
                if (hashCode == 871091088) {
                    String str3 = "initialize";
                    if (str2.equals("initialize")) {
                        hashMap.clear();
                        zzebwVar.getClass();
                        zzebwVar.b(new ox9(str3));
                        return;
                    }
                }
            } else if (str2.equals("dispose_all")) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((u2o) it.next()).zzc();
                }
                hashMap.clear();
                return;
            }
            String str4 = (String) zzT.get("obj_id");
            try {
                Objects.requireNonNull(str4);
                long parseLong = Long.parseLong(str4);
                int hashCode2 = str2.hashCode();
                String str5 = "rewarded";
                String str6 = "interstitial";
                String str7 = "creation";
                zzecb zzecbVar = this.b;
                switch (hashCode2) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            u2o u2oVar = (u2o) hashMap.get(Long.valueOf(parseLong));
                            if (u2oVar != null) {
                                u2oVar.zzb();
                                return;
                            }
                            zzo.zzd("Could not show H5 ad, object ID does not exist");
                            zzebwVar.getClass();
                            ox9 ox9Var = new ox9(str6);
                            ox9Var.b = Long.valueOf(parseLong);
                            ox9Var.d = "onNativeAdObjectNotAvailable";
                            zzebwVar.b(ox9Var);
                            return;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            u2o u2oVar2 = (u2o) hashMap.get(Long.valueOf(parseLong));
                            if (u2oVar2 != null) {
                                u2oVar2.zzb();
                                return;
                            }
                            zzo.zzd("Could not show H5 ad, object ID does not exist");
                            zzebwVar.getClass();
                            ox9 ox9Var2 = new ox9(str5);
                            ox9Var2.b = Long.valueOf(parseLong);
                            ox9Var2.d = "onNativeAdObjectNotAvailable";
                            zzebwVar.b(ox9Var2);
                            return;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            u2o u2oVar3 = (u2o) hashMap.get(Long.valueOf(parseLong));
                            if (u2oVar3 != null) {
                                u2oVar3.a(E4(zzT));
                                return;
                            }
                            zzo.zzd("Could not load H5 ad, object ID does not exist");
                            zzebwVar.getClass();
                            ox9 ox9Var3 = new ox9(str5);
                            ox9Var3.b = Long.valueOf(parseLong);
                            ox9Var3.d = "onNativeAdObjectNotAvailable";
                            zzebwVar.b(ox9Var3);
                            return;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            if (hashMap.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cb)).intValue()) {
                                zzo.zzi("Could not create H5 ad, too many existing objects");
                                zzebwVar.a(parseLong);
                                return;
                            }
                            Long valueOf = Long.valueOf(parseLong);
                            if (hashMap.containsKey(valueOf)) {
                                zzo.zzd("Could not create H5 ad, object ID already exists");
                                zzebwVar.a(parseLong);
                                return;
                            }
                            String str8 = (String) zzT.get(AdRevenueScheme.AD_UNIT);
                            if (TextUtils.isEmpty(str8)) {
                                zzo.zzi("Could not create H5 ad, missing ad unit id");
                                zzebwVar.a(parseLong);
                                return;
                            }
                            qpn zzc = zzecbVar.zzc();
                            zzc.h(parseLong);
                            zzc.g(str8);
                            utn a = zzc.a();
                            long longValue = ((Long) a.c).longValue();
                            dvn dvnVar = (dvn) a.e;
                            hashMap.put(valueOf, new zzecd(longValue, dvnVar.a, new zzebw(dvnVar.b), (uun) a.d, (String) a.b));
                            zzebwVar.getClass();
                            ox9 ox9Var4 = new ox9(str7);
                            ox9Var4.b = Long.valueOf(parseLong);
                            ox9Var4.d = "nativeObjectCreated";
                            zzebwVar.b(ox9Var4);
                            StringBuilder sb = new StringBuilder(String.valueOf(parseLong).length() + 39 + str8.length());
                            fn0.t(parseLong, "Created H5 interstitial #", " with ad unit ", sb);
                            sb.append(str8);
                            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            u2o u2oVar4 = (u2o) hashMap.get(Long.valueOf(parseLong));
                            if (u2oVar4 != null) {
                                u2oVar4.a(E4(zzT));
                                return;
                            }
                            zzo.zzd("Could not load H5 ad, object ID does not exist");
                            zzebwVar.getClass();
                            ox9 ox9Var5 = new ox9(str6);
                            ox9Var5.b = Long.valueOf(parseLong);
                            ox9Var5.d = "onNativeAdObjectNotAvailable";
                            zzebwVar.b(ox9Var5);
                            return;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Long valueOf2 = Long.valueOf(parseLong);
                            u2o u2oVar5 = (u2o) hashMap.get(valueOf2);
                            if (u2oVar5 == null) {
                                zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            u2oVar5.zzc();
                            hashMap.remove(valueOf2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(parseLong).length() + 16);
                            sb2.append("Disposed H5 ad #");
                            sb2.append(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            if (hashMap.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cb)).intValue()) {
                                zzo.zzi("Could not create H5 ad, too many existing objects");
                                zzebwVar.a(parseLong);
                                return;
                            }
                            Long valueOf3 = Long.valueOf(parseLong);
                            if (hashMap.containsKey(valueOf3)) {
                                zzo.zzd("Could not create H5 ad, object ID already exists");
                                zzebwVar.a(parseLong);
                                return;
                            }
                            String str9 = (String) zzT.get(AdRevenueScheme.AD_UNIT);
                            if (TextUtils.isEmpty(str9)) {
                                zzo.zzi("Could not create H5 ad, missing ad unit id");
                                zzebwVar.a(parseLong);
                                return;
                            }
                            qpn zzc2 = zzecbVar.zzc();
                            zzc2.h(parseLong);
                            zzc2.g(str9);
                            utn a2 = zzc2.a();
                            long longValue2 = ((Long) a2.c).longValue();
                            dvn dvnVar2 = (dvn) a2.e;
                            hashMap.put(valueOf3, new zzech(longValue2, dvnVar2.a, new zzebw(dvnVar2.b), (uun) a2.d, (String) a2.b));
                            zzebwVar.getClass();
                            ox9 ox9Var6 = new ox9(str7);
                            ox9Var6.b = Long.valueOf(parseLong);
                            ox9Var6.d = "nativeObjectCreated";
                            zzebwVar.b(ox9Var6);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(parseLong).length() + 35 + str9.length());
                            fn0.t(parseLong, "Created H5 rewarded #", " with ad unit ", sb3);
                            sb3.append(str9);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            return;
                        }
                        break;
                }
                zzo.zzd("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str4)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzf() {
        this.d.clear();
    }
}
