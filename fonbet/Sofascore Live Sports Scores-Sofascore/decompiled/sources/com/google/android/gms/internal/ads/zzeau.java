package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeau {
    public final String e;
    public final zzeao f;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;
    public final com.google.android.gms.ads.internal.util.zzj a = com.google.android.gms.ads.internal.zzt.zzh().g();

    public zzeau(String str, zzeao zzeaoVar) {
        this.e = str;
        this.f = zzeaoVar;
    }

    public final synchronized void a(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P2)).booleanValue()) {
            HashMap e = e();
            e.put("action", "adapter_init_started");
            e.put("ancn", str);
            this.b.add(e);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P2)).booleanValue()) {
            HashMap e = e();
            e.put("action", "adapter_init_finished");
            e.put("ancn", str);
            this.b.add(e);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P2)).booleanValue()) {
            HashMap e = e();
            e.put("action", "adapter_init_finished");
            e.put("ancn", str);
            e.put("rqe", str2);
            this.b.add(e);
        }
    }

    public final synchronized void d() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P2)).booleanValue() && !this.c) {
            HashMap e = e();
            e.put("action", "init_started");
            this.b.add(e);
            this.c = true;
        }
    }

    public final HashMap e() {
        zzeao zzeaoVar = this.f;
        zzeaoVar.getClass();
        HashMap hashMap = new HashMap(zzeaoVar.a);
        hashMap.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), 10));
        hashMap.put("tid", this.a.zzx() ? "" : this.e);
        return hashMap;
    }
}
