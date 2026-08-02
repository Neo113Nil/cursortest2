package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Y3;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.protos.Sdk;
import io.sentry.protocol.DebugMeta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdsq {
    private final Context zza;
    private final zzdrw zzb;
    private final zzbai zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbhd zzf;
    private final Executor zzg;
    private final zzblh zzh;
    private final zzdti zzi;
    private final zzdvw zzj;
    private final ScheduledExecutorService zzk;
    private final zzdur zzl;
    private final zzdyz zzm;
    private final zzfro zzn;
    private final zzeju zzo;
    private final zzekf zzp;
    private final zzfkq zzq;
    private final zzdyu zzr;
    private final zzeac zzs;

    public zzdsq(Context context, zzdrw zzdrwVar, zzbai zzbaiVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbhd zzbhdVar, Executor executor, zzfkm zzfkmVar, zzdti zzdtiVar, zzdvw zzdvwVar, ScheduledExecutorService scheduledExecutorService, zzdyz zzdyzVar, zzfro zzfroVar, zzeju zzejuVar, zzdur zzdurVar, zzekf zzekfVar, zzfkq zzfkqVar, zzdyu zzdyuVar, zzeac zzeacVar) {
        this.zza = context;
        this.zzb = zzdrwVar;
        this.zzc = zzbaiVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbhdVar;
        this.zzg = executor;
        this.zzh = zzfkmVar.zzj;
        this.zzi = zzdtiVar;
        this.zzj = zzdvwVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdyzVar;
        this.zzn = zzfroVar;
        this.zzo = zzejuVar;
        this.zzl = zzdurVar;
        this.zzp = zzekfVar;
        this.zzq = zzfkqVar;
        this.zzr = zzdyuVar;
        this.zzs = zzeacVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzew zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzs(optJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzgvz.zzi();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgvz.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzew zzs = zzs(optJSONArray.optJSONObject(i));
            if (zzs != null) {
                arrayList.add(zzs);
            }
        }
        return zzgvz.zzq(arrayList);
    }

    private final ListenableFuture zzm(JSONArray jSONArray, boolean z, boolean z2, zzdyi zzdyiVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzhbi.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyiVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzhbi.zzk(zzhbi.zzm(arrayList), zzdsp.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ListenableFuture zzn(JSONObject jSONObject, boolean z, zzdyi zzdyiVar) {
        HashMap hashMap;
        final String optString;
        int i;
        double d;
        if (jSONObject == null) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeP)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeQ))) {
                HashMap hashMap2 = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeR)).split(",")) {
                    try {
                        hashMap2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                hashMap = hashMap2;
                optString = jSONObject.optString("url");
                if (!TextUtils.isEmpty(optString) && hashMap == null) {
                    return zzhbi.zza(null);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue() && zzdyiVar != null) {
                    this.zzr.zzf(zzdyiVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                }
                final double optDouble = jSONObject.optDouble("scale", 1.0d);
                boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
                final int optInt = jSONObject.optInt("width", -1);
                final int optInt2 = jSONObject.optInt("height", -1);
                if (!z) {
                    i = optInt;
                    d = optDouble;
                } else {
                    if (hashMap == null) {
                        return zzq("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zzhbi.zzk(this.zzb.zza(optString, optDouble, optBoolean), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdsf
                            @Override // com.google.android.gms.internal.ads.zzgsn
                            public final /* synthetic */ Object apply(Object obj) {
                                return new zzbld(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                            }
                        }, this.zzg), null);
                    }
                    d = optDouble;
                    i = optInt;
                }
                return zzhbi.zza(new zzbld(null, Uri.parse(optString), d, i, optInt2, hashMap));
            }
        }
        hashMap = null;
        optString = jSONObject.optString("url");
        if (!TextUtils.isEmpty(optString)) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyiVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final double optDouble2 = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean2 = jSONObject.optBoolean("is_transparent", true);
        final int optInt3 = jSONObject.optInt("width", -1);
        final int optInt22 = jSONObject.optInt("height", -1);
        if (!z) {
        }
        return zzhbi.zza(new zzbld(null, Uri.parse(optString), d, i, optInt22, hashMap));
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfjt zzfjtVar, zzfjw zzfjwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        final ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString(CreativeInfo.al), zzfjtVar, zzfjwVar, zzr(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcdbVar);
        return zzhbi.zzj(zzb, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsk
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzcki zzckiVar = (zzcki) obj;
                if (zzckiVar == null || zzckiVar.zzh() == null) {
                    throw new zzeov(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzcff.zzh);
    }

    private final ListenableFuture zzq(String str, boolean z, final ListenableFuture listenableFuture, Object obj) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcV)).booleanValue()) {
            zzcfi.zza(listenableFuture, str, this.zzg);
        }
        if (z) {
            return zzhbi.zzj(listenableFuture, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsm
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj2) {
                    return obj2 != null ? ListenableFuture.this : zzhbi.zzc(new zzeov(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcff.zzh);
        }
        final Object obj2 = null;
        return zzhbi.zzh(listenableFuture, Exception.class, new zzhaq(obj2) { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzhbi.zza(null);
            }
        }, zzcff.zzh);
    }

    private static final com.google.android.gms.ads.internal.client.zzew zzs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzew(optString, optString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, zzdyi zzdyiVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdyiVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdyi zzdyiVar) {
        zzblh zzblhVar = this.zzh;
        return zzm(jSONObject.optJSONArray(DebugMeta.JsonKeys.IMAGES), zzblhVar.zzb, zzblhVar.zzd, zzdyiVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfjt zzfjtVar, final zzfjw zzfjwVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdb zzcdbVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlt)).booleanValue()) {
            return zzhbi.zza(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(DebugMeta.JsonKeys.IMAGES);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzhbi.zza(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeP)).booleanValue()) {
            if (optJSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeQ))) {
                return zzhbi.zza(null);
            }
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString(CreativeInfo.al);
        final com.google.android.gms.ads.internal.client.zzr zzr = zzr(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyi.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture zzj = zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdsq.this.zzh(zzr, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar, optString, optString2, obj);
            }
        }, zzcff.zzf);
        ListenableFuture zzj2 = zzhbi.zzj(zzj, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                if (((zzcki) obj) != null) {
                    return ListenableFuture.this;
                }
                throw new zzeov(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcff.zzh);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcV)).booleanValue()) {
            zzcfi.zza(zzj2, "NativeAssetsLoader.loadImageHtml", this.zzg);
        }
        return zzj2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdyi zzdyiVar) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(Y3.c);
        if (optJSONObject == null) {
            return zzhbi.zza(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray(DebugMeta.JsonKeys.IMAGES);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzq("NativeAssetsLoader.loadAttributionInfo", optJSONObject.optBoolean("require"), zzhbi.zzk(zzm(optJSONArray, false, true, zzdyiVar), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdsi
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzdsq.this.zzi(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdb zzcdbVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzhbi.zza(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzhbi.zza(null);
        }
        final String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzhbi.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyi.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zzj = zzhbi.zzj(zzhbi.zza(null), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzdsj
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdsq.this.zzj(optString, zzcdbVar, zzbVar, obj);
            }
        }, zzcff.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcV)).booleanValue()) {
            zzcfi.zza(zzj, "NativeAssetsLoader.omidWebView", this.zzg);
        }
        return zzj;
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyi.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcfk zzcfkVar = new zzcfk();
        zzhbi.zzr(listenableFuture, new zzdse(this, zzcfkVar), zzcff.zzf);
        return zzcfkVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfjt zzfjtVar, zzfjw zzfjwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        zzdsq zzdsqVar;
        ListenableFuture zza;
        JSONObject zzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (zzi != null) {
            return zzp(zzi, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzhbi.zza(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzls)).booleanValue() && optJSONObject.has(CreativeInfo.al);
        if (TextUtils.isEmpty(optString) && !z) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            return zzhbi.zza(null);
        }
        if (z) {
            zzdsqVar = this;
            zza = zzdsqVar.zzp(optJSONObject, zzfjtVar, zzfjwVar, zzbVar, zzcdbVar);
        } else {
            zzdsqVar = this;
            zza = zzdsqVar.zzi.zza(optJSONObject, zzbVar, zzcdbVar);
        }
        return zzq(true != z ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, zzhbi.zzi(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeH)).intValue(), TimeUnit.SECONDS, zzdsqVar.zzk), null);
    }

    final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfjt zzfjtVar, zzfjw zzfjwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar, String str, String str2, Object obj) {
        zzeac zzeacVar;
        zzcki zza = this.zzj.zza(zzrVar, zzfjtVar, zzfjwVar);
        final zzcfj zza2 = zzcfj.zza(zza);
        zzduo zza3 = this.zzl.zza();
        zzcmg zzP = zza.zzP();
        zzbhv zzbhvVar = zzbie.zzpe;
        zzP.zzab(zza3, zza3, zza3, zza3, zza3, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() ? null : zzcdbVar, this.zzo, this.zzn, this.zzm, null, zza3, null, null, null, null, null, null, null);
        zza.zzab("/getNativeAdViewSignals", zzbpd.zzs);
        zza.zzab("/getNativeClickMeta", zzbpd.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziM)).booleanValue() && (zzeacVar = this.zzs) != null) {
                zza.zzab("/onDeviceStorageEvent", new zzbpm(zzeacVar));
            }
        }
        zza.zzP().zzS(true);
        zza.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdso
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcfj zzcfjVar = zzcfj.this;
                if (z) {
                    zzcfjVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcfjVar.zzd(new zzeov(1, sb.toString()));
            }
        });
        zza.zzau(str, str2, null);
        return zza2;
    }

    final /* synthetic */ zzbla zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzo = zzo(jSONObject, InAppMessageBase.BG_COLOR);
        Integer zzo2 = zzo(jSONObject, InAppMessageBase.MESSAGE_TEXT_COLOR);
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbla(optString, list, zzo, zzo2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ ListenableFuture zzj(String str, zzcdb zzcdbVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzekf zzekfVar = this.zzp;
        zzcki zza = zzcky.zza(context, zzcms.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzekfVar, this.zzq, this.zzm);
        final zzcfj zza2 = zzcfj.zza(zza);
        zza.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdsn
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzcfj.this.zzb();
            }
        });
        zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpe)).booleanValue()) {
            if (zzcdbVar != null) {
                zza.zzP().zzj(zzcdbVar);
            }
            zza.zzP().zzi(zzbVar);
        }
        return zza2;
    }

    private final com.google.android.gms.ads.internal.client.zzr zzr(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }
}
