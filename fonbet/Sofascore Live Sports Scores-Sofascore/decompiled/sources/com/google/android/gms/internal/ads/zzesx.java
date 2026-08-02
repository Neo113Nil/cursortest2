package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzesx extends zzbxv {
    public static final /* synthetic */ int f = 0;
    public final zzbxt a;
    public final zzcgo b;
    public final JSONObject c;
    public final long d;
    public boolean e;

    public zzesx(String str, zzbxt zzbxtVar, zzcgo zzcgoVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.c = jSONObject;
        this.e = false;
        this.b = zzcgoVar;
        this.a = zzbxtVar;
        this.d = j;
        try {
            jSONObject.put("adapter_version", zzbxtVar.zzf().toString());
            jSONObject.put("sdk_version", zzbxtVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public final synchronized void E4(int i, String str) {
        try {
            if (this.e) {
                return;
            }
            try {
                JSONObject jSONObject = this.c;
                jSONObject.put("signal_error", str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r2)).booleanValue()) {
                    jSONObject.put(Payload.LATENCY, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.d);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.b.zzc(this.c);
            this.e = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final synchronized void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        E4(2, zzeVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final synchronized void zze(String str) {
        if (this.e) {
            return;
        }
        if (str == null) {
            synchronized (this) {
                E4(2, "Adapter returned null signals");
            }
            return;
        }
        try {
            JSONObject jSONObject = this.c;
            jSONObject.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r2)).booleanValue()) {
                jSONObject.put(Payload.LATENCY, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.d);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q2)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.b.zzc(this.c);
        this.e = true;
    }
}
