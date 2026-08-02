package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbpd {
    public static final zzbpe zza = zzbpc.zza;
    public static final zzbpe zzb = zzbot.zza;
    public static final zzbpe zzc = zzbou.zza;
    public static final zzbpe zzd = new zzbol();
    public static final zzbpe zze = new zzbom();
    public static final zzbpe zzf = zzboz.zza;
    public static final zzbpe zzg = new zzbon();
    public static final zzbpe zzh = new zzboo();
    public static final zzbpe zzi = zzbpa.zza;
    public static final zzbpe zzj = new zzbop();
    public static final zzbpe zzk = new zzboq();
    public static final zzbpe zzl = new zzcic();
    public static final zzbpe zzm = new zzcid();
    public static final zzbpe zzn = new zzbnx();
    public static final zzbpv zzo = new zzbpv();
    public static final zzbpe zzp = new zzbor();
    public static final zzbpe zzq = new zzbos();
    public static final zzbpe zzr = new zzbny();
    public static final zzbpe zzs = new zzbnz();
    public static final zzbpe zzt = new zzboa();
    public static final zzbpe zzu = new zzbob();
    public static final zzbpe zzv = new zzboc();
    public static final zzbpe zzw = new zzbod();
    public static final zzbpe zzx = new zzboe();
    public static final zzbpe zzy = new zzbof();
    public static final zzbpe zzz = new zzbog();
    public static final zzbpe zzA = new zzboh();
    public static final zzbpe zzB = new zzboj();
    public static final zzbpe zzC = new zzbok();

    public static ListenableFuture zza(zzcki zzckiVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzbai zzS = zzckiVar.zzS();
            zzfkq zzT = zzckiVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznu)).booleanValue() || zzT == null) {
                if (zzS != null && zzS.zza(parse)) {
                    parse = zzS.zzd(parse, zzckiVar.getContext(), zzckiVar.zzE(), zzckiVar.zzj());
                }
            } else if (zzS != null && zzS.zza(parse)) {
                parse = zzT.zza(parse, zzckiVar.getContext(), zzckiVar.zzE(), zzckiVar.zzj());
            }
        } catch (zzbaj unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        }
        Map hashMap = new HashMap();
        if (zzckiVar.zzC() != null) {
            hashMap = zzckiVar.zzC().zzaw;
        }
        final String zzb2 = zzcdp.zzb(parse, zzckiVar.getContext(), hashMap);
        long longValue = ((Long) zzbkd.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 260910000) {
            return zzhbi.zza(zzb2);
        }
        zzhba zzw2 = zzhba.zzw(zzckiVar.zzaF());
        zzbov zzbovVar = zzbov.zza;
        zzhbs zzhbsVar = zzcff.zzh;
        return (zzhba) zzhbi.zzg((zzhba) zzhbi.zzk((zzhba) zzhbi.zzg(zzw2, Throwable.class, zzbovVar, zzhbsVar), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzbow
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                String str2 = (String) obj;
                zzbpe zzbpeVar = zzbpd.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbkd.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String str4 = (String) zzbkd.zza.zze();
                    String str5 = (String) zzbkd.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzhbsVar), Throwable.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzbox
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpe zzbpeVar = zzbpd.zza;
                if (((Boolean) zzbkd.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzhbsVar);
    }

    public static zzbpe zzb(final zzdkm zzdkmVar, final zzcsx zzcsxVar) {
        return new zzbpe() { // from class: com.google.android.gms.internal.ads.zzboy
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcki zzckiVar = (zzcki) obj;
                zzbpd.zzc(map, zzdkm.this);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcsx zzcsxVar2 = zzcsxVar;
                zzhba zzw2 = zzhba.zzw(zzbpd.zza(zzckiVar, str));
                zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzbpb
                    @Override // com.google.android.gms.internal.ads.zzhaq
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcsx zzcsxVar3;
                        String str2 = (String) obj2;
                        zzbpe zzbpeVar = zzbpd.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlu)).booleanValue() && (zzcsxVar3 = zzcsx.this) != null && zzcsx.zzc(str)) ? zzcsxVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhbi.zza(str2);
                    }
                };
                zzhbs zzhbsVar = zzcff.zza;
                zzhbi.zzr((zzhba) zzhbi.zzj(zzw2, zzhaqVar, zzhbsVar), new zzboi(zzckiVar), zzhbsVar);
            }
        };
    }

    public static void zzc(Map map, zzdkm zzdkmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzme)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdkmVar != null) {
            zzdkmVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        r7 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zze(zzclu zzcluVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzcluVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            String.valueOf(optString7);
                            String valueOf = String.valueOf(optString7);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e2);
                        }
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo != null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo != null);
                }
                ((zzbsa) zzcluVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbsa) zzcluVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbsa) zzcluVar).zzd("openableIntents", new JSONObject());
        }
    }
}
