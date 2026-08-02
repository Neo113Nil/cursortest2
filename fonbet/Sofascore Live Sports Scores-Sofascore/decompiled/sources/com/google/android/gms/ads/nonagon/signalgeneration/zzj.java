package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeao;
import defpackage.hsn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzj {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;
    public final zzeao d;
    public final hsn e;

    public zzj(Context context, zzeao zzeaoVar, hsn hsnVar) {
        this.c = context;
        this.d = zzeaoVar;
        this.e = hsnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(final boolean z, zzl zzlVar) {
        List list;
        try {
            HashMap hashMap = this.a;
            Boolean valueOf = Boolean.valueOf(z);
            zzl zzlVar2 = (zzl) hashMap.get(valueOf);
            if (zzlVar2 != null) {
                if (!zzlVar2.zzc()) {
                    if (zzlVar2.zza() != null) {
                        if (zzlVar.zza() != null) {
                        }
                        long longValue = (zzlVar.zza() == null ? (Long) zzblm.f.c() : (Long) zzblm.g.c()).longValue();
                        final boolean z2 = zzlVar.zza() != null;
                        zzcgj.d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzj.this.c(z, z2);
                            }
                        }, longValue, TimeUnit.SECONDS);
                        HashMap hashMap2 = this.b;
                        list = (List) hashMap2.get(valueOf);
                        hashMap2.put(valueOf, new ArrayList());
                        if (list == null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                d(zzlVar, (Pair) it.next(), false);
                            }
                        }
                    }
                }
            }
            hashMap.put(valueOf, zzlVar);
            long longValue2 = (zzlVar.zza() == null ? (Long) zzblm.f.c() : (Long) zzblm.g.c()).longValue();
            if (zzlVar.zza() != null) {
            }
            zzcgj.d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzj.this.c(z, z2);
                }
            }, longValue2, TimeUnit.SECONDS);
            HashMap hashMap22 = this.b;
            list = (List) hashMap22.get(valueOf);
            hashMap22.put(valueOf, new ArrayList());
            if (list == null) {
            }
        } finally {
        }
    }

    public final void b(final boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        HashMap hashMap = this.b;
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, new ArrayList());
        this.e.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.c(z, false);
            }
        });
    }

    public final synchronized void c(boolean z, boolean z2) {
        Throwable th;
        zzj zzjVar;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z);
                HashMap hashMap = this.a;
                Boolean valueOf = Boolean.valueOf(z);
                zzl zzlVar = (zzl) hashMap.get(valueOf);
                int i = 0;
                if (z2 && zzlVar != null) {
                    try {
                        i = zzlVar.zzd() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        zzjVar = this;
                        throw th;
                    }
                }
                zzl zzlVar2 = (zzl) hashMap.get(valueOf);
                final zzk zzkVar = new zzk(this, z, i, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.zze()), this.d);
                final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Jc)).booleanValue()) {
                    this.e.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            QueryInfo.generate(zzj.this.c, AdFormat.BANNER, build, zzkVar);
                            return Boolean.TRUE;
                        }
                    });
                } else {
                    QueryInfo.generate(this.c, AdFormat.BANNER, build, zzkVar);
                }
            } catch (Throwable th3) {
                th = th3;
                zzjVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void d(zzl zzlVar, Pair pair, boolean z) {
        zzlVar.zzf();
        QueryInfo zza = zzlVar.zza();
        if (zza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzb());
        }
        zzv.zze(this.d, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().a() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(zzlVar.zza() != null)));
    }

    public final synchronized void zza() {
        b(true);
        b(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a()));
        zzcgj.f.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Object obj2 = obj;
                boolean z = obj2 instanceof WebView;
                zzj zzjVar = zzj.this;
                boolean z2 = false;
                if (z) {
                    CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza(zzjVar.c);
                    if (zza != null) {
                        z2 = zza.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap hashMap = zzjVar.a;
                Boolean valueOf = Boolean.valueOf(z2);
                zzl zzlVar = (zzl) hashMap.get(valueOf);
                Pair pair2 = pair;
                if (zzlVar != null && !zzlVar.zzc()) {
                    zzjVar.d(zzlVar, pair2, true);
                    return;
                }
                HashMap hashMap2 = zzjVar.b;
                List list = (List) hashMap2.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    hashMap2.put(valueOf, list);
                }
                list.add(pair2);
            }
        });
    }
}
