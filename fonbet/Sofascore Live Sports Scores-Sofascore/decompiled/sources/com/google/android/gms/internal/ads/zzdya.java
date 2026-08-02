package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.hbo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdya {
    public final zzfms a;
    public final zzdxx b;

    public zzdya(zzfms zzfmsVar, zzdxx zzdxxVar) {
        this.a = zzfmsVar;
        this.b = zzdxxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(r6) != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbvx] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzbwv] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.google.android.gms.internal.ads.zzbvx] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.zzbwv] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbvu] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfmu a(String str, JSONObject jSONObject) {
        ?? r5;
        zzbvu zzbvuVar;
        zzdxx zzdxxVar = this.b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                r5 = new zzbwv(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                r5 = new zzbwv(new zzbym());
            } else {
                r5 = (zzbvu) this.a.c.get();
                if (r5 == 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbvuVar = r5;
                }
                try {
                    String string = jSONObject.getString("class_name");
                    r5 = r5.zzb(string) ? r5.zza("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : r5.A(string) ? r5.zza(string) : r5.zza("com.google.ads.mediation.customevent.CustomEventAdapter");
                } catch (JSONException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("Invalid custom event.", e);
                    zzbvuVar = r5;
                    r5 = zzbvuVar.zza(str);
                    zzfmu zzfmuVar = new zzfmu(r5);
                    zzdxxVar.a(str, zzfmuVar);
                    return zzfmuVar;
                }
            }
            zzfmu zzfmuVar2 = new zzfmu(r5);
            zzdxxVar.a(str, zzfmuVar2);
            return zzfmuVar2;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sa)).booleanValue()) {
                zzdxxVar.a(str, null);
            }
            throw new zzfmd(th);
        }
    }

    public final zzbxt b(String str) {
        zzbvu zzbvuVar = (zzbvu) this.a.c.get();
        if (zzbvuVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Unexpected call to adapter creator.");
            hbo.n();
            return null;
        }
        zzbxt n = zzbvuVar.n(str);
        zzdxx zzdxxVar = this.b;
        synchronized (zzdxxVar) {
            if (zzdxxVar.a.containsKey(str)) {
                return n;
            }
            try {
                zzdxxVar.a.put(str, new zzdxw(str, n.zzf(), n.zzg(), true));
                return n;
            } catch (Throwable unused) {
                return n;
            }
        }
    }
}
