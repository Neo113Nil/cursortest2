package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeao;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzq {
    public final zzeao h;
    public ConcurrentHashMap i;
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final int a = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X7)).intValue();
    public final long b = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y7)).longValue();
    public final boolean c = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c8)).booleanValue();
    public final boolean d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b8)).booleanValue();
    public final Map e = Collections.synchronizedMap(new zzn(this));

    public zzq(zzeao zzeaoVar) {
        this.h = zzeaoVar;
    }

    public final synchronized void a() {
        long a = com.google.android.gms.ads.internal.zzt.zzk().a();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a - ((zzo) entry.getValue()).zza.longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("QueryJsonMap.removeExpiredEntries", e);
        }
    }

    public final synchronized void b(final zzeae zzeaeVar) {
        if (this.c) {
            ArrayDeque arrayDeque = this.g;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcgj.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzq zzqVar = zzq.this;
                    zzeae zzeaeVar2 = zzeaeVar;
                    zzqVar.c(zzeaeVar2, clone, "to");
                    zzqVar.c(zzeaeVar2, clone2, "of");
                }
            });
        }
    }

    public final void c(zzeae zzeaeVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzeaeVar.a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzv.zzb(jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.h.b(this.i);
        }
    }

    public final synchronized void zza(String str, String str2, zzeae zzeaeVar) {
        this.e.put(str, new zzo(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a()), str2, new HashSet()));
        a();
        b(zzeaeVar);
    }

    @Nullable
    public final synchronized String zzb(String str, zzeae zzeaeVar) {
        zzo zzoVar = (zzo) this.e.get(str);
        zzeaeVar.a.put("request_id", str);
        ConcurrentHashMap concurrentHashMap = zzeaeVar.a;
        if (zzoVar == null) {
            concurrentHashMap.put("mhit", "false");
            return null;
        }
        concurrentHashMap.put("mhit", "true");
        return zzoVar.zzb;
    }

    public final synchronized void zzc(String str) {
        this.e.remove(str);
    }

    public final synchronized boolean zzd(String str, String str2) {
        zzo zzoVar = (zzo) this.e.get(str);
        if (zzoVar != null) {
            if (zzoVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zze(String str, String str2, int i) {
        zzo zzoVar = (zzo) this.e.get(str);
        if (zzoVar == null) {
            return false;
        }
        Set set = zzoVar.zzc;
        set.add(str2);
        return set.size() < i;
    }
}
