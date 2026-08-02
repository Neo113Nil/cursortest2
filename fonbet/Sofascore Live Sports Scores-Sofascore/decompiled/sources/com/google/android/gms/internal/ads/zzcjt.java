package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.fc6;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjt implements zzbqh {
    public static final Integer b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String o = fc6.o(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi(o);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b8, code lost:
    
        if (r2.setExecutable(true, false) == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    @Override // com.google.android.gms.internal.ads.zzbqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Map map) {
        zzcjs zzcjsVar;
        zzcjk zzcjkVar;
        zzcjs zzcjsVar2;
        zzcif zzcifVar = (zzcif) obj;
        if (zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcjl zzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzB.a(zzcifVar)) {
                return;
            }
            zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b = b("periodicReportIntervalMs", map);
        b("exoPlayerRenderingIntervalMs", map);
        b("exoPlayerIdleIntervalMs", map);
        zzcie zzcieVar = new zzcie((String) map.get("flags"));
        zzcjk zzcjkVar2 = null;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzcieVar.k) {
                Iterator it = zzB.a.iterator();
                while (it.hasNext()) {
                    zzcjkVar = (zzcjk) it.next();
                    if (zzcjkVar.b == zzcifVar && str.equals(zzcjkVar.d)) {
                        break;
                    }
                }
                zzcjkVar = null;
                if (zzcjkVar == null) {
                    zzo.zzi("Precache task is already running.");
                    return;
                }
                if (zzcifVar.zzk() == null) {
                    zzo.zzi("Precache requires a dependency provider.");
                    return;
                }
                Integer b2 = b(SearchResponseKt.PLAYER_ENTITY, map);
                if (b2 == null) {
                    b2 = 0;
                }
                if (b != null) {
                    zzcifVar.n0(b.intValue());
                }
                int intValue = b2.intValue();
                zzcjc zzcjcVar = zzcifVar.zzk().zzb;
                if (intValue > 0) {
                    int i2 = zzchw.b.get();
                    if (i2 < zzcieVar.g) {
                        zzckb zzckbVar = new zzckb(zzcifVar);
                        zzcku zzckuVar = new zzcku(zzcifVar.getContext(), zzcieVar, (zzcif) zzckbVar.c.get(), null);
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzh("ExoPlayerAdapter initialized.");
                        zzckbVar.d = zzckuVar;
                        zzckuVar.l = zzckbVar;
                        zzcjsVar2 = zzckbVar;
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s)).booleanValue()) {
                            i2 = zzcjy.o.get();
                        }
                        zzcjsVar2 = i2 < zzcieVar.b ? new zzcjy(zzcifVar, zzcieVar) : new zzcjw(zzcifVar);
                    }
                } else {
                    zzcjv zzcjvVar = new zzcjv(zzcifVar);
                    File cacheDir = zzcjvVar.a.getCacheDir();
                    if (cacheDir == null) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Context.getCacheDir() returned null");
                        zzcjsVar2 = zzcjvVar;
                    } else {
                        int i5 = zzgar.a;
                        File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                        zzcjvVar.d = file;
                        if (file.isDirectory() || file.mkdirs()) {
                            if (file.setReadable(true, false)) {
                                zzcjsVar2 = zzcjvVar;
                            }
                            String valueOf = String.valueOf(file.getAbsolutePath());
                            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi("Could not set cache file permissions at ".concat(valueOf));
                            zzcjvVar.d = null;
                            zzcjsVar2 = zzcjvVar;
                        } else {
                            String valueOf2 = String.valueOf(file.getAbsolutePath());
                            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi("Could not create preload cache directory at ".concat(valueOf2));
                            zzcjvVar.d = null;
                            zzcjsVar2 = zzcjvVar;
                        }
                    }
                }
                new zzcjk(zzcifVar, zzcjsVar2, str, strArr).zzb();
                zzcjsVar = zzcjsVar2;
            } else {
                Iterator it2 = zzB.a.iterator();
                while (it2.hasNext()) {
                    zzcjkVar = (zzcjk) it2.next();
                    if (zzcjkVar.b == zzcifVar) {
                        break;
                    }
                }
                zzcjkVar = null;
                if (zzcjkVar == null) {
                }
            }
        } else {
            Iterator it3 = zzB.a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                zzcjk zzcjkVar3 = (zzcjk) it3.next();
                if (zzcjkVar3.b == zzcifVar) {
                    zzcjkVar2 = zzcjkVar3;
                    break;
                }
            }
            if (zzcjkVar2 == null) {
                zzo.zzi("Precache must specify a source.");
                return;
            }
            zzcjsVar = zzcjkVar2.c;
        }
        Integer b3 = b("minBufferMs", map);
        if (b3 != null) {
            zzcjsVar.k(b3.intValue());
        }
        Integer b4 = b("maxBufferMs", map);
        if (b4 != null) {
            zzcjsVar.j(b4.intValue());
        }
        Integer b5 = b("bufferForPlaybackMs", map);
        if (b5 != null) {
            zzcjsVar.l(b5.intValue());
        }
        Integer b6 = b("bufferForPlaybackAfterRebufferMs", map);
        if (b6 != null) {
            zzcjsVar.n(b6.intValue());
        }
    }
}
