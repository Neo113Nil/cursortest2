package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.o2o;
import defpackage.x5n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeam implements zzfqj {
    public final zzeae b;
    public final Clock c;
    public final HashMap a = new HashMap();
    public final HashMap d = new HashMap();

    public zzeam(zzeae zzeaeVar, Set set, Clock clock) {
        this.b = zzeaeVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            o2o o2oVar = (o2o) it.next();
            HashMap hashMap = this.d;
            o2oVar.getClass();
            hashMap.put(zzfqc.RENDERER, o2oVar);
        }
        this.c = clock;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void D(zzfqc zzfqcVar, String str, Throwable th) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(zzfqcVar)) {
            long elapsedRealtime = this.c.elapsedRealtime() - ((Long) hashMap.get(zzfqcVar)).longValue();
            this.b.a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.d.containsKey(zzfqcVar)) {
            a(zzfqcVar, false);
        }
    }

    public final void a(zzfqc zzfqcVar, boolean z) {
        o2o o2oVar = (o2o) this.d.get(zzfqcVar);
        if (o2oVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        zzfqc zzfqcVar2 = o2oVar.b;
        HashMap hashMap = this.a;
        if (hashMap.containsKey(zzfqcVar2)) {
            long elapsedRealtime = this.c.elapsedRealtime() - ((Long) hashMap.get(zzfqcVar2)).longValue();
            this.b.a.put("label.".concat(o2oVar.a), x5n.m(elapsedRealtime, str, new StringBuilder(String.valueOf(elapsedRealtime).length() + 2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void h(zzfqc zzfqcVar, String str) {
        this.a.put(zzfqcVar, Long.valueOf(this.c.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void t(zzfqc zzfqcVar, String str) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(zzfqcVar)) {
            long elapsedRealtime = this.c.elapsedRealtime() - ((Long) hashMap.get(zzfqcVar)).longValue();
            this.b.a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.d.containsKey(zzfqcVar)) {
            a(zzfqcVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void A(String str) {
    }
}
