package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import defpackage.hao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzftu {
    public final HashMap a;
    public final zzfve b;
    public final zzfuf c;
    public final Context d;
    public volatile ConnectivityManager e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final Clock g;
    public AtomicInteger h;
    public final zzftp i;
    public final com.google.android.gms.ads.internal.util.zzg j;

    public zzftu(zzfve zzfveVar, zzfuf zzfufVar, Context context, Clock clock, zzftp zzftpVar, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(AdFormat.APP_OPEN_AD, new HashMap());
        hashMap.put(AdFormat.INTERSTITIAL, new HashMap());
        hashMap.put(AdFormat.REWARDED, new HashMap());
        this.b = zzfveVar;
        this.c = zzfufVar;
        this.d = context;
        this.g = clock;
        this.i = zzftpVar;
        this.j = zzjVar;
    }

    public final void a(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzfvd zzfvdVar = (zzfvd) arrayList.get(i);
            if (z) {
                zzfvdVar.n();
            } else {
                zzfvdVar.g.set(false);
            }
        }
    }

    public final Object b(AdFormat adFormat, Class cls, String str) {
        zzfuf zzfufVar = this.c;
        Clock clock = this.g;
        zzfufVar.g("poll_ad", "ppacwe_ts", clock.a(), -1, -1, null, null, "2");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(adFormat)) {
                    return null;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) hashMap.get(adFormat)).get(str);
                if (zzfvdVar != null && adFormat.equals(zzfvdVar.q())) {
                    zzful zzfulVar = new zzful(zzfvdVar.r(), zzfvdVar.q());
                    zzfulVar.c = str;
                    hao haoVar = new hao(zzfulVar);
                    zzfufVar.g("poll_ad", "ppac_ts", clock.a(), zzfvdVar.s(), zzfvdVar.t(), null, haoVar, "2");
                    try {
                        String o = zzfvdVar.o();
                        Object m = zzfvdVar.m();
                        Object cast = m == null ? null : cls.cast(m);
                        if (cast == null) {
                            return cast;
                        }
                        zzfufVar.d(clock.a(), zzfvdVar.s(), zzfvdVar.t(), o, haoVar, "2");
                        return cast;
                    } catch (ClassCastException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("PreloadAdManager.pollAd", e);
                        com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean c(AdFormat adFormat) {
        HashMap hashMap = this.a;
        int size = hashMap.containsKey(adFormat) ? ((Map) hashMap.get(adFormat)).size() : 0;
        int ordinal = adFormat.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D5)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C5)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B5)).intValue(), 1));
    }
}
