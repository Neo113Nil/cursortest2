package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcjs;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzgvh;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzr;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.a;
import com.sofascore.model.mvvm.model.StatusKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g3g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g3g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.f = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02a2, code lost:
    
        if (r2.equals("expireFailed") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02b6, code lost:
    
        if (r2.equals("externalAbort") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c1, code lost:
    
        r0 = "policy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02bf, code lost:
    
        if (r2.equals("sizeExceeded") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d0, code lost:
    
        if (r2.equals("downloadTimeout") != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02de, code lost:
    
        r0 = "network";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02dc, code lost:
    
        if (r2.equals("badUrl") != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0299, code lost:
    
        if (r2.equals("noCacheDir") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a4, code lost:
    
        r0 = "io";
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        AtomicReference atomicReference;
        zznl zznlVar;
        zzgb zzgbVar;
        zzpp zzppVar;
        zzgb zzgbVar2;
        xei xeiVar = null;
        switch (this.a) {
            case 0:
                for (r3g r3gVar : (Collection) this.b) {
                    if (r3gVar != ((r3g) this.c)) {
                        r3gVar.a.l(grb.G);
                    }
                }
                Future future = (Future) this.d;
                if (future != null) {
                    future.cancel(false);
                }
                Future future2 = (Future) this.e;
                if (future2 != null) {
                    future2.cancel(false);
                }
                grb grbVar = (grb) this.f;
                ujg ujgVar = ((qrb) grbVar.D.a).F;
                synchronized (ujgVar.b) {
                    try {
                        ((HashSet) ujgVar.c).remove(grbVar);
                        if (((HashSet) ujgVar.c).isEmpty()) {
                            xeiVar = (xei) ujgVar.d;
                            ujgVar.c = new HashSet();
                        }
                    } finally {
                    }
                }
                if (xeiVar != null) {
                    ((qrb) ujgVar.e).E.a(xeiVar);
                    return;
                }
                return;
            case 1:
                ((bjn) this.b).g.d();
                ((Activity) this.c).startActivityForResult(hda.V((String) this.d, (String) this.e, (Map) this.f), 0);
                return;
            case 2:
                String str2 = "internal";
                HashMap l = i.l("event", "precacheCanceled");
                l.put("src", (String) this.b);
                String str3 = (String) this.c;
                if (!TextUtils.isEmpty(str3)) {
                    l.put("cachedSrc", str3);
                }
                String str4 = (String) this.d;
                switch (str4.hashCode()) {
                    case -1947652542:
                        str = StatusKt.STATUS_INTERRUPTED;
                        str4.equals(str);
                        break;
                    case -1396664534:
                        break;
                    case -1347010958:
                        str = "inProgress";
                        str4.equals(str);
                        break;
                    case -918817863:
                        break;
                    case -659376217:
                        str = "contentLengthMissing";
                        str4.equals(str);
                        break;
                    case -642208130:
                        str = "playerFailed";
                        str4.equals(str);
                        break;
                    case -354048396:
                        break;
                    case -32082395:
                        break;
                    case 3387234:
                        str = "noop";
                        str4.equals(str);
                        break;
                    case 96784904:
                        str = "error";
                        str4.equals(str);
                        break;
                    case 580119100:
                        break;
                    case 725497484:
                        break;
                }
                l.put("type", str2);
                l.put("reason", str4);
                String str5 = (String) this.e;
                if (!TextUtils.isEmpty(str5)) {
                    l.put(PglCryptUtils.KEY_MESSAGE, str5);
                }
                ((zzcjs) this.f).q(l);
                return;
            case 3:
                boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.Vb)).booleanValue();
                Throwable th = (Throwable) this.c;
                zzcub zzcubVar = (zzcub) ((utn) this.b).e;
                if (booleanValue) {
                    zzcas e = zzcaq.e(zzcubVar.a);
                    zzcubVar.i = e;
                    e.a("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    zzcas c = zzcaq.c(zzcubVar.a);
                    zzcubVar.h = c;
                    c.a("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                zzv zzvVar = (zzv) this.f;
                ((zzfte) this.d).b((String) this.e, zzvVar, null, null);
                return;
            case 4:
                zzecu zzecuVar = (zzecu) this.b;
                String str6 = (String) this.c;
                a3o a3oVar = (a3o) this.d;
                zzfmu zzfmuVar = (zzfmu) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                zzecuVar.getClass();
                try {
                    if (Objects.equals(str6, "com.google.ads.mediation.admob.AdMobAdapter")) {
                        a3oVar.zze();
                        return;
                    }
                    Context context = (Context) zzecuVar.g.get();
                    if (context == null) {
                        context = zzecuVar.f;
                    }
                    try {
                        try {
                            zzfmuVar.a.s0(new ObjectWrapper(context), a3oVar, arrayList);
                            return;
                        } catch (RemoteException e2) {
                            int i = zze.zza;
                            zzo.zzg("", e2);
                            return;
                        }
                    } catch (Throwable th2) {
                        throw new zzfmd(th2);
                    }
                } catch (RemoteException e3) {
                    throw new zzgvh(e3);
                } catch (zzfmd unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 74);
                    sb.append("Failed to initialize adapter. ");
                    sb.append(str6);
                    sb.append(" does not implement the initialize() method.");
                    a3oVar.zzf(sb.toString());
                    return;
                }
            case 5:
                veo veoVar = (veo) this.b;
                HashMap hashMap = (HashMap) this.c;
                Context context2 = (Context) this.d;
                View view = (View) this.e;
                Activity activity = (Activity) this.f;
                hashMap.putAll(veoVar.e.b(context2, view));
                veoVar.e(hashMap);
                hashMap.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
                hashMap.put("ctx", context2);
                hashMap.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
                hashMap.put("act", activity);
                hashMap.put("bds", null);
                return;
            case 6:
                String str7 = (String) this.f;
                veo veoVar2 = (veo) this.b;
                HashMap hashMap2 = (HashMap) this.c;
                Context context3 = (Context) this.d;
                View view2 = (View) this.e;
                hashMap2.putAll(veoVar2.e.c());
                veoVar2.e(hashMap2);
                hashMap2.put(InneractiveMediationDefs.GENDER_FEMALE, a.q);
                hashMap2.put("ctx", context3);
                hashMap2.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view2);
                hashMap2.put("act", null);
                hashMap2.put("bds", str7);
                return;
            case 7:
                zzjd zzjdVar = (zzjd) this.b;
                zzr zzrVar = (zzr) this.c;
                Bundle bundle = (Bundle) this.d;
                zzge zzgeVar = (zzge) this.e;
                String str8 = (String) this.f;
                zzpg zzpgVar = zzjdVar.a;
                zzpgVar.W();
                try {
                    zzgeVar.z(zzpgVar.e0(bundle, zzrVar));
                    return;
                } catch (RemoteException e4) {
                    zzpgVar.b().g.c(str8, e4, "Failed to return trigger URIs for app");
                    return;
                }
            case 8:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zznlVar = (zznl) this.f;
                            zzgbVar = zznlVar.e;
                        } catch (RemoteException e5) {
                            zzgu zzguVar = ((zzic) ((zznl) this.f).b).f;
                            zzic.m(zzguVar);
                            zzguVar.g.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.c, e5);
                            ((AtomicReference) this.b).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.b;
                        }
                        if (zzgbVar == null) {
                            zzgu zzguVar2 = ((zzic) zznlVar.b).f;
                            zzic.m(zzguVar2);
                            zzguVar2.g.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.c, (String) this.d);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(zzgbVar.r4((String) this.c, (String) this.d, (zzr) this.e));
                        } else {
                            atomicReference2.set(zzgbVar.A0(null, (String) this.c, (String) this.d));
                        }
                        zznlVar.d0();
                        atomicReference = (AtomicReference) this.b;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.b).notify();
                        throw th3;
                    }
                }
            default:
                zzcs zzcsVar = (zzcs) this.e;
                String str9 = (String) this.c;
                String str10 = (String) this.b;
                zznl zznlVar2 = (zznl) this.f;
                zzic zzicVar = (zzic) zznlVar2.b;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        zzgbVar2 = zznlVar2.e;
                    } catch (RemoteException e6) {
                        zzgu zzguVar3 = zzicVar.f;
                        zzic.m(zzguVar3);
                        zzguVar3.g.d("Failed to get conditional properties; remote exception", str10, str9, e6);
                    }
                    if (zzgbVar2 != null) {
                        arrayList2 = zzpp.K0(zzgbVar2.r4(str10, str9, (zzr) this.d));
                        zznlVar2.d0();
                        zzppVar = zzicVar.i;
                        zzic.k(zzppVar);
                        zzppVar.J0(zzcsVar, arrayList2);
                        return;
                    }
                    zzgu zzguVar4 = zzicVar.f;
                    zzic.m(zzguVar4);
                    zzguVar4.g.c(str10, str9, "Failed to get conditional properties; not connected to service");
                    zzppVar = zzicVar.i;
                    zzic.k(zzppVar);
                    zzppVar.J0(zzcsVar, arrayList2);
                    return;
                } catch (Throwable th4) {
                    zzpp zzppVar2 = zzicVar.i;
                    zzic.k(zzppVar2);
                    zzppVar2.J0(zzcsVar, arrayList2);
                    throw th4;
                }
        }
    }

    public /* synthetic */ g3g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
