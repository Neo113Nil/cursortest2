package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.fun;
import defpackage.inn;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjg implements zzbqh {
    public boolean a;

    public static int b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String o = fc6.o(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi(o);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            bf3.v(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i);
            sb.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return i;
    }

    public static void c(zzcht zzchtVar, Map map) {
        zzchl zzchlVar = zzchtVar.g;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (zzchlVar != null) {
                    zzchlVar.A(parseInt);
                }
            } catch (NumberFormatException unused) {
                String k = bf3.k("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi(k);
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            if (zzchlVar != null) {
                zzchlVar.B(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            if (zzchlVar != null) {
                zzchlVar.e(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            if (zzchlVar != null) {
                zzchlVar.f(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            if (zzchlVar == null) {
                return;
            }
            zzchlVar.g(parseInt5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        int min;
        int min2;
        int i;
        boolean z;
        int i2;
        zzcht zzchtVar;
        zzchl zzchlVar;
        zzcif zzcifVar = (zzcif) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer y = (zzcifVar.l0() == null || (zzchtVar = zzcifVar.l0().e) == null || (zzchlVar = zzchtVar.g) == null) ? null : zzchlVar.y();
        if (valueOf != null && y != null && !valueOf.equals(y) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh("Event intended for player " + valueOf + ", but sent to player " + y + " - event ignored");
            return;
        }
        Integer num2 = valueOf;
        if (zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            zzo.zzd(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcifVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcifVar.zzv(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzcifVar.n("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
                hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzcifVar.n("onVideoEvent", hashMap3);
            return;
        }
        zzchu l0 = zzcifVar.l0();
        if (l0 == null) {
            zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals("position");
        if (equals || equals2) {
            Context context = zzcifVar.getContext();
            int b = b(context, map, "x", 0);
            int b2 = b(context, map, "y", 0);
            int b3 = b(context, map, "w", -1);
            inn innVar = zzbjg.T4;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                min = b3 == -1 ? zzcifVar.j() : Math.min(b3, zzcifVar.j());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int j = zzcifVar.j();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + mz1.d(String.valueOf(b3).length() + 72, 4, String.valueOf(j)) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(b3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(j);
                    sb2.append(", x ");
                    sb2.append(b);
                    sb2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                min = Math.min(b3, zzcifVar.j() - b);
            }
            int b4 = b(context, map, com.mbridge.msdk.foundation.same.report.h.b, -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                min2 = b4 == -1 ? zzcifVar.zzx() : Math.min(b4, zzcifVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int zzx = zzcifVar.zzx();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b2).length() + mz1.d(String.valueOf(b4).length() + 75, 4, String.valueOf(zzx)) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(b4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(zzx);
                    sb3.append(", y ");
                    sb3.append(b2);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                min2 = Math.min(b4, zzcifVar.zzx() - b2);
            }
            try {
                i = Integer.parseInt((String) map.get(SearchResponseKt.PLAYER_ENTITY));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || l0.e != null) {
                Preconditions.e("The underlay may only be modified from the UI thread.");
                zzcht zzchtVar2 = l0.e;
                if (zzchtVar2 != null) {
                    zzchtVar2.n(b, b2, min, min2);
                    return;
                }
                return;
            }
            zzcie zzcieVar = new zzcie((String) map.get("flags"));
            if (l0.e == null) {
                zzcmi zzcmiVar = l0.b;
                n nVar = zzcmiVar.a;
                zzbjn.a(nVar.L.b, nVar.J, "vpr2");
                zzcht zzchtVar3 = new zzcht(l0.a, zzcmiVar, i, parseBoolean, zzcmiVar.a.L.b, zzcieVar, l0.d);
                l0.e = zzchtVar3;
                l0.c.addView(zzchtVar3, 0, new ViewGroup.LayoutParams(-1, -1));
                l0.e.n(b, b2, min, min2);
                zzcmiVar.a.n.l = false;
            }
            zzcht zzchtVar4 = l0.e;
            if (zzchtVar4 != null) {
                c(zzchtVar4, map);
                return;
            }
            return;
        }
        zzcms zzh = zzcifVar.zzh();
        if (zzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float parseFloat = Float.parseFloat(str6);
                    synchronized (zzh.b) {
                        zzh.j = parseFloat;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (zzh.b) {
                    z = zzh.h;
                    i2 = zzh.e;
                    zzh.e = 3;
                }
                zzcgj.f.execute(new fun(zzh, i2, 3, z, z));
                return;
            }
        }
        zzcht zzchtVar5 = l0.e;
        if (zzchtVar5 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            zzcifVar.n("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcifVar.getContext();
            int b5 = b(context2, map, "x", 0);
            float b6 = b(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, b5, b6, 0);
            zzchl zzchlVar2 = zzchtVar5.g;
            if (zzchlVar2 != null) {
                zzchlVar2.dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int parseFloat2 = (int) (Float.parseFloat(str7) * 1000.0f);
                zzchl zzchlVar3 = zzchtVar5.g;
                if (zzchlVar3 == null) {
                    return;
                }
                zzchlVar3.p(parseFloat2);
                return;
            } catch (NumberFormatException unused5) {
                zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzchtVar5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzchtVar5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzchl zzchlVar4 = zzchtVar5.g;
            if (zzchlVar4 == null) {
                return;
            }
            if (TextUtils.isEmpty(zzchtVar5.n)) {
                zzchtVar5.c("no_src", new String[0]);
                return;
            } else {
                zzchlVar4.z(zzchtVar5.n, zzchtVar5.o, num2);
                return;
            }
        }
        if (str.equals("loadControl")) {
            c(zzchtVar5, map);
            return;
        }
        if (str.equals("muted")) {
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("muted"));
            zzchl zzchlVar5 = zzchtVar5.g;
            if (parseBoolean2) {
                if (zzchlVar5 == null) {
                    return;
                }
                zzcij zzcijVar = zzchlVar5.b;
                zzcijVar.e = true;
                zzcijVar.a();
                zzchlVar5.x();
                return;
            }
            if (zzchlVar5 == null) {
                return;
            }
            zzcij zzcijVar2 = zzchlVar5.b;
            zzcijVar2.e = false;
            zzcijVar2.a();
            zzchlVar5.x();
            return;
        }
        if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
            zzchl zzchlVar6 = zzchtVar5.g;
            if (zzchlVar6 == null) {
                return;
            }
            zzchlVar6.m();
            return;
        }
        if (str.equals("play")) {
            zzchl zzchlVar7 = zzchtVar5.g;
            if (zzchlVar7 == null) {
                return;
            }
            zzchlVar7.l();
            return;
        }
        if (str.equals("show")) {
            zzchtVar5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R2)).booleanValue() && TextUtils.isEmpty(str8)) {
                zzo.zzi("Src parameter missing from src video GMSG.");
                return;
            }
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        String string = jSONArray.getString(i5);
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R2)).booleanValue() || !TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R2)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder(str9.length() + 41);
                        sb4.append("All demuxed URLs are empty for playback: ");
                        sb4.append(str9);
                        zzo.zzi(sb4.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused7) {
                    zzo.zzi("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                zzcifVar.n0(num.intValue());
            }
            zzchtVar5.n = str8;
            zzchtVar5.o = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = zzcifVar.getContext();
            int b7 = b(context3, map, "dx", 0);
            int b8 = b(context3, map, "dy", 0);
            float f = b7;
            float f2 = b8;
            zzchl zzchlVar8 = zzchtVar5.g;
            if (zzchlVar8 != null) {
                zzchlVar8.q(f, f2);
            }
            if (this.a) {
                return;
            }
            zzcifVar.zzl();
            this.a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                zzchtVar5.a();
                return;
            } else {
                zzo.zzi("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            zzo.zzi("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float parseFloat3 = Float.parseFloat(str10);
            zzchl zzchlVar9 = zzchtVar5.g;
            if (zzchlVar9 == null) {
                return;
            }
            zzcij zzcijVar3 = zzchlVar9.b;
            zzcijVar3.f = parseFloat3;
            zzcijVar3.a();
            zzchlVar9.x();
        } catch (NumberFormatException unused8) {
            zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
