package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.common.util.Clock;
import defpackage.hao;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfuj {
    public final zzfve c;
    public final zzfuf d;
    public final Context e;
    public volatile ConnectivityManager f;
    public final Clock h;
    public AtomicInteger i;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public zzfuj(zzfve zzfveVar, zzfuf zzfufVar, Context context, Clock clock) {
        this.c = zzfveVar;
        this.d = zzfufVar;
        this.e = context;
        this.h = clock;
    }

    public static String a(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        return wt3.m(str, "#", new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length()), name);
    }

    public final synchronized void b(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C)).booleanValue()) {
            c(z);
        }
    }

    public final synchronized void c(boolean z) {
        ConcurrentHashMap concurrentHashMap = this.a;
        try {
            if (z) {
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    ((zzfvd) it.next()).n();
                }
            } else {
                Iterator it2 = concurrentHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((zzfvd) it2.next()).g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.F)).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ArrayList d(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfp zzfpVar = (zzfp) it.next();
                String a = a(zzfpVar.zza, AdFormat.getAdFormat(zzfpVar.zzb));
                hashSet.add(a);
                ConcurrentHashMap concurrentHashMap = this.a;
                zzfvd zzfvdVar = (zzfvd) concurrentHashMap.get(a);
                if (zzfvdVar == null) {
                    ConcurrentHashMap concurrentHashMap2 = this.b;
                    if (concurrentHashMap2.containsKey(a)) {
                        zzfvd zzfvdVar2 = (zzfvd) concurrentHashMap2.get(a);
                        if (((zzfp) zzfvdVar2.e.get()).equals(zzfpVar)) {
                            zzfvdVar2.a(zzfpVar.zzd);
                            zzfvdVar2.n();
                            concurrentHashMap.put(a, zzfvdVar2);
                            concurrentHashMap2.remove(a);
                        } else {
                            arrayList.add(zzfpVar);
                        }
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else if (((zzfp) zzfvdVar.e.get()).equals(zzfpVar)) {
                    zzfvdVar.a(zzfpVar.zzd);
                } else {
                    this.b.put(a, zzfvdVar);
                    concurrentHashMap.remove(a);
                    arrayList.add(zzfpVar);
                }
            }
            Iterator it2 = this.a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.b.put((String) entry.getKey(), (zzfvd) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.b.entrySet().iterator();
            while (it3.hasNext()) {
                zzfvd zzfvdVar3 = (zzfvd) ((Map.Entry) it3.next()).getValue();
                zzfvdVar3.g.set(false);
                zzfvdVar3.p.set(false);
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E)).booleanValue()) {
                }
                Queue queue = zzfvdVar3.j;
                synchronized (queue) {
                    queue.clear();
                }
                if (!zzfvdVar3.l()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(String str, AdFormat adFormat) {
        boolean z;
        try {
            Clock clock = this.h;
            long a = clock.a();
            zzfvd g = g(str, adFormat);
            int i = 0;
            z = g != null && g.l();
            Long valueOf = z ? Long.valueOf(clock.a()) : null;
            hao haoVar = new hao(new zzful(str, adFormat));
            zzfuf zzfufVar = this.d;
            int s = g == null ? 0 : g.s();
            if (g != null) {
                i = g.t();
            }
            zzfufVar.c(s, i, a, valueOf, g != null ? g.o() : null, haoVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final synchronized Object f(AdFormat adFormat, Class cls, String str) {
        hao haoVar = new hao(new zzful(str, adFormat));
        zzfuf zzfufVar = this.d;
        Clock clock = this.h;
        zzfufVar.g("poll_ad", "ppac_ts", clock.a(), -1, -1, null, haoVar, "1");
        zzfvd g = g(str, adFormat);
        if (g == null) {
            return null;
        }
        try {
            String o = g.o();
            Object m = g.m();
            Object cast = m == null ? null : cls.cast(m);
            if (cast != null) {
                zzfufVar.d(clock.a(), g.s(), g.t(), o, haoVar, "1");
            }
            return cast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("PreloadAdManager.pollAd", e);
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    public final synchronized zzfvd g(String str, AdFormat adFormat) {
        return (zzfvd) this.a.get(a(str, adFormat));
    }
}
