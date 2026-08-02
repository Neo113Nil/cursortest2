package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.ironsource.X3;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzcic implements zzbpe {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                String sb2 = sb.toString();
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(length + 30 + String.valueOf(str2).length() + 6 + String.valueOf(i).length() + 1);
            sb3.append("Parse pixels for ");
            sb3.append(str);
            sb3.append(", got string ");
            sb3.append(str2);
            sb3.append(", int ");
            sb3.append(i);
            sb3.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
        }
        return i;
    }

    private static void zzc(zzcgp zzcgpVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcgpVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String format = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(format);
                return;
            }
        }
        if (str2 != null) {
            zzcgpVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcgpVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcgpVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcgpVar.zzB(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        Integer valueOf;
        int i;
        String str;
        zzchb zzchbVar = (zzchb) obj;
        String str2 = (String) map.get("action");
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer valueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zza = zzchbVar.zzdm() != null ? zzchbVar.zzdm().zza() : null;
        if (valueOf2 != null && zza != null && !valueOf2.equals(zza) && !str2.equals("load")) {
            String format = String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf2, zza);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(format);
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str2.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str2);
            sb.append(ServerSentEventKt.SPACE);
            sb.append(jSONObject2);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        if (str2.equals("background")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchbVar.setBackgroundColor(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str2.equals("playerBackground")) {
            String str4 = (String) map.get("color");
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchbVar.zzv(Color.parseColor(str4));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i4 = 0;
        if (str2.equals("decoderProps")) {
            String str5 = (String) map.get("mimeTypes");
            if (str5 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzchbVar.zze("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str5.split(",");
            int length = split.length;
            while (i4 < length) {
                String str6 = split[i4];
                hashMap2.put(str6, com.google.android.gms.ads.internal.util.zzch.zza(str6.trim()));
                i4++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzchbVar.zze("onVideoEvent", hashMap3);
            return;
        }
        zzcgq zzdm = zzchbVar.zzdm();
        if (zzdm == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str2.equals("new");
        boolean equals2 = str2.equals(X3.i.L);
        if (equals || equals2) {
            Context context = zzchbVar.getContext();
            int zzb = zzb(context, map, "x", 0);
            int zzb2 = zzb(context, map, "y", 0);
            int zzb3 = zzb(context, map, "w", -1);
            zzbhv zzbhvVar = zzbie.zzeL;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                min = zzb3 == -1 ? zzchbVar.zzy() : Math.min(zzb3, zzchbVar.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int zzy = zzchbVar.zzy();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb3).length() + 72 + String.valueOf(zzy).length() + 4 + String.valueOf(zzb).length() + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(zzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(zzy);
                    sb2.append(", x ");
                    sb2.append(zzb);
                    sb2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                min = Math.min(zzb3, zzchbVar.zzy() - zzb);
            }
            int i5 = min;
            int zzb4 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                min2 = zzb4 == -1 ? zzchbVar.zzx() : Math.min(zzb4, zzchbVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int zzx = zzchbVar.zzx();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zzb4).length() + 75 + String.valueOf(zzx).length() + 4 + String.valueOf(zzb2).length() + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(zzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(zzx);
                    sb3.append(", y ");
                    sb3.append(zzb2);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                min2 = Math.min(zzb4, zzchbVar.zzx() - zzb2);
            }
            int i6 = min2;
            try {
                i4 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i7 = i4;
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzdm.zzd() != null) {
                zzdm.zzb(zzb, zzb2, i5, i6);
                return;
            }
            zzdm.zzc(zzb, zzb2, i5, i6, i7, parseBoolean, new zzcha((String) map.get("flags")));
            zzcgp zzd = zzdm.zzd();
            if (zzd != null) {
                zzc(zzd, map);
                return;
            }
            return;
        }
        zzclo zzh = zzchbVar.zzh();
        if (zzh != null) {
            if (str2.equals("timeupdate")) {
                String str7 = (String) map.get("currentTime");
                if (str7 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzh.zzd(Float.parseFloat(str7));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str2.equals("skip")) {
                zzh.zzr();
                return;
            }
        }
        zzcgp zzd2 = zzdm.zzd();
        if (zzd2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            zzchbVar.zze("onVideoEvent", hashMap4);
            return;
        }
        if (str2.equals("click")) {
            Context context2 = zzchbVar.getContext();
            int zzb5 = zzb(context2, map, "x", 0);
            float zzb6 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb6, 0);
            zzd2.zzC(obtain);
            obtain.recycle();
            return;
        }
        if (str2.equals("currentTime")) {
            String str8 = (String) map.get(Globalization.TIME);
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzd2.zzt((int) (Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if (str2.equals("hide")) {
            zzd2.setVisibility(4);
            return;
        }
        if (str2.equals("remove")) {
            zzd2.setVisibility(8);
            return;
        }
        if (str2.equals("load")) {
            zzd2.zzq(valueOf2);
            return;
        }
        if (str2.equals("loadControl")) {
            zzc(zzd2, map);
            return;
        }
        if (str2.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzd2.zzu();
                return;
            } else {
                zzd2.zzv();
                return;
            }
        }
        if (str2.equals("pause")) {
            zzd2.zzr();
            return;
        }
        if (str2.equals("play")) {
            zzd2.zzs();
            return;
        }
        if (str2.equals("show")) {
            zzd2.setVisibility(0);
            return;
        }
        if (!str2.equals("src")) {
            if (str2.equals("touchMove")) {
                Context context3 = zzchbVar.getContext();
                zzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzchbVar.zzl();
                this.zza = true;
                return;
            }
            if (!str2.equals("volume")) {
                if (str2.equals("watermark")) {
                    zzd2.zzD();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown video action: ".concat(str2));
                    return;
                }
            }
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzd2.zzw(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        String str10 = (String) map.get("src");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcM)).booleanValue() && TextUtils.isEmpty(str10)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i = 1;
            } catch (NumberFormatException unused7) {
                String str11 = (String) map.get("periodicReportIntervalMs");
                String.valueOf(str11);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf(str11)));
            }
            String[] strArr = new String[i];
            strArr[0] = str10;
            str = (String) map.get("demuxed");
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        String string = jSONArray.getString(i8);
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcM)).booleanValue() || !TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcM)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 41);
                        sb4.append("All demuxed URLs are empty for playback: ");
                        sb4.append(str);
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb4.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused8) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for playback: ".concat(str));
                    strArr = new String[]{str10};
                }
            }
            if (valueOf != null) {
                zzchbVar.zzo(valueOf.intValue());
            }
            zzd2.zzo(str10, strArr);
        }
        i = 1;
        valueOf = null;
        String[] strArr2 = new String[i];
        strArr2[0] = str10;
        str = (String) map.get("demuxed");
        if (str != null) {
        }
        if (valueOf != null) {
        }
        zzd2.zzo(str10, strArr2);
    }
}
