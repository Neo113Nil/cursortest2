package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.w1l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzemv {
    public final String c;
    public zzflg d = null;
    public zzfld e = null;
    public com.google.android.gms.ads.internal.client.zzv f = null;
    public final Map b = Collections.synchronizedMap(new HashMap());
    public final List a = w1l.n();

    public zzemv(String str) {
        this.c = str;
    }

    public static String d(zzfld zzfldVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E4)).booleanValue() ? zzfldVar.p0 : zzfldVar.w;
    }

    public final void a(zzfld zzfldVar) {
        String d = d(zzfldVar);
        Map map = this.b;
        Object obj = map.get(d);
        List list = this.a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.f = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }

    public final synchronized void b(zzfld zzfldVar, int i) {
        Map map = this.b;
        String d = d(zzfldVar);
        if (map.containsKey(d)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfldVar.v;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfldVar.E, 0L, null, bundle, zzfldVar.F, zzfldVar.G, zzfldVar.H, zzfldVar.I);
        try {
            this.a.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.b.put(d, zzvVar);
    }

    public final void c(zzfld zzfldVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String d = d(zzfldVar);
        Map map = this.b;
        if (map.containsKey(d)) {
            if (this.e == null) {
                this.e = zzfldVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(d);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P7)).booleanValue() && z) {
                this.f = zzvVar;
            }
        }
    }
}
