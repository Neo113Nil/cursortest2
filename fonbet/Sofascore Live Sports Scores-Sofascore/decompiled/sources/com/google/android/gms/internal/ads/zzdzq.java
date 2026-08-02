package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.google.android.gms.common.util.PlatformVersion;
import com.ironsource.U3;
import com.ironsource.Y1;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.pyh;
import defpackage.sgo;
import defpackage.vgo;
import defpackage.y0l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdzq implements zzdgv, zzdfd, zzdds, zzdmi {
    public final zzeae a;
    public final zzeao b;
    public final Context c;

    public zzdzq(zzeae zzeaeVar, zzeao zzeaoVar, Context context) {
        this.a = zzeaeVar;
        this.b = zzeaoVar;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
        zzeae zzeaeVar = this.a;
        zzeaeVar.getClass();
        zzfln zzflnVar = zzfloVar.b;
        List list = zzflnVar.a;
        if (!list.isEmpty()) {
            int i = ((zzfld) list.get(0)).b;
            zzeaeVar.b("ad_format", zzfld.a(i));
            if (i == 6) {
                zzeaeVar.a.put("as", true != zzeaeVar.b.g ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.U2)).booleanValue()) {
            zzeaeVar.b("mwl", Integer.toString(list.size()));
        }
        zzeaeVar.b("gqi", zzflnVar.b.b);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.db)).booleanValue()) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
        this.a.a(zzcbvVar.a);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.eb)).booleanValue()) {
            c();
        }
    }

    public final void a(Bundle bundle, zzgxm zzgxmVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong("public-api-callback", com.google.android.gms.ads.internal.zzt.zzk().a());
        zzeae zzeaeVar = this.a;
        zzeaeVar.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.df)).booleanValue()) {
            zzeaeVar.b("brr", true != zzeaeVar.c.q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            zzeaeVar.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgxmVar.size();
        for (int i = 0; i < size; i++) {
            zzdzt zzdztVar = (zzdzt) zzgxmVar.get(i);
            long j = bundle.getLong(zzdztVar.b.a, -1L);
            long j2 = bundle.getLong(zzdztVar.c.a, -1L);
            if (j > 0 && j2 > 0) {
                zzeaeVar.b(zzdztVar.a, String.valueOf(j2 - j));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.a.b(str, String.valueOf(j));
            }
        }
    }

    public final void c() {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        if (((Boolean) zzbln.d.c()).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().q.getAndSet(true) || !PlatformVersion.a()) {
            return;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.gb);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.c;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1)) == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            int reason = historicalProcessExitReasons.get(0).getReason();
            try {
                zzguz b = zzguz.a(new sgo(',')).b(vgo.c);
                zzguz zzguzVar = new zzguz(b.c, true, b.a);
                str.getClass();
                Iterator i = zzguzVar.c.i(zzguzVar, str);
                while (true) {
                    pyh pyhVar = (pyh) i;
                    if (!pyhVar.hasNext()) {
                        return;
                    }
                    String str2 = (String) pyhVar.next();
                    try {
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                        sb.append("Invalid number format in appExitInfoReasonAllowlist: ");
                        sb.append(str2);
                        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    }
                    if (Integer.parseInt(str2) == reason) {
                        zzeao zzeaoVar = this.b;
                        zzeaoVar.getClass();
                        HashMap hashMap = new HashMap(zzeaoVar.a);
                        hashMap.put("action", "aei");
                        hashMap.put("aeir", String.valueOf(reason));
                        zzeaoVar.c(hashMap);
                        return;
                    }
                }
            } catch (NoClassDefFoundError e) {
                e = e;
                com.google.android.gms.ads.internal.zzt.zzh().d("CsiAdLoadListener.maybeLogAppExitInfo", e);
            } catch (RuntimeException e2) {
                e = e2;
                com.google.android.gms.ads.internal.zzt.zzh().d("CsiAdLoadListener.maybeLogAppExitInfo", e);
            }
        } catch (NoClassDefFoundError | NoSuchMethodError | RuntimeException e3) {
            e = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void i0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeae zzeaeVar = this.a;
        zzeaeVar.a.put("action", "ftl");
        zzeaeVar.b("ftl", String.valueOf(zzeVar.zza));
        zzeaeVar.b("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o8)).booleanValue()) {
            zzeaeVar.b("emsg", zzeVar.zzb);
        }
        zzeaeVar.d();
        this.b.b(zzeaeVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdmi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzbc zzbcVar) {
        String str;
        zzcbv zzcbvVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z7)).booleanValue()) {
            return;
        }
        zzeao zzeaoVar = this.b;
        zzeae zzeaeVar = this.a;
        if (zzbcVar == null) {
            ConcurrentHashMap concurrentHashMap = zzeaeVar.a;
            concurrentHashMap.put("action", "sgs");
            concurrentHashMap.put("request_id", Y1.f);
            zzeaoVar.b(concurrentHashMap);
            return;
        }
        zzcbv zzcbvVar2 = zzbcVar.zzc;
        if (zzcbvVar2 != null) {
            a(zzcbvVar2.m, zzdzt.d);
        }
        try {
            JSONObject jSONObject = new JSONObject(zzbcVar.zzb);
            ConcurrentHashMap concurrentHashMap2 = zzeaeVar.a;
            ConcurrentHashMap concurrentHashMap3 = zzeaeVar.a;
            concurrentHashMap2.put("action", "sgs");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.nb)).booleanValue()) {
                try {
                    str = jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getBoolean("accept_3p_cookie") ? "1" : "0";
                } catch (JSONException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("Error retrieving JSONObject from the requestJson, ", e);
                }
                concurrentHashMap3.put("tpc", str);
                zzcbvVar = zzbcVar.zzc;
                if (zzcbvVar != null) {
                    zzeaeVar.a(zzcbvVar.a);
                }
                zzeaeVar.d();
                zzeaoVar.b(concurrentHashMap3);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.fb)).booleanValue()) {
                    return;
                }
                c();
                return;
            }
            str = "na";
            concurrentHashMap3.put("tpc", str);
            zzcbvVar = zzbcVar.zzc;
            if (zzcbvVar != null) {
            }
            zzeaeVar.d();
            zzeaoVar.b(concurrentHashMap3);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.fb)).booleanValue()) {
            }
        } catch (JSONException unused) {
            ConcurrentHashMap concurrentHashMap4 = zzeaeVar.a;
            concurrentHashMap4.put("action", "sgf");
            concurrentHashMap4.put("sgf_reason", "request_invalid");
            zzeaoVar.b(concurrentHashMap4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z7)).booleanValue()) {
            zzeae zzeaeVar = this.a;
            zzeaeVar.a.put("action", "sgf");
            zzeaeVar.b("sgf_reason", str);
            zzeaeVar.d();
            this.b.b(zzeaeVar.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        Bundle bundle;
        zzeae zzeaeVar = this.a;
        zzeaeVar.a.put("action", U3.i.r);
        synchronized (zzeaeVar) {
            bundle = zzeaeVar.e;
        }
        a(bundle, zzdzt.e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.oe)).booleanValue()) {
            zzeaeVar.a.put("mafe", true != y0l.b("MUTE_AUDIO") ? "0" : "1");
        }
        zzeaeVar.d();
        this.b.b(zzeaeVar.a);
    }
}
