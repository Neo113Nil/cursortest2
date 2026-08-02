package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbki;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcal;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzdcy;
import com.google.android.gms.internal.ads.zzdcz;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzflj;
import com.google.android.gms.internal.ads.zzflv;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzfmv;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzhdi;
import com.ironsource.U3;
import com.ironsource.mediationsdk.j;
import defpackage.a70;
import defpackage.b0a;
import defpackage.ba4;
import defpackage.bf3;
import defpackage.ddb;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.inn;
import defpackage.ja4;
import defpackage.ogj;
import defpackage.olo;
import defpackage.sx2;
import defpackage.t94;
import defpackage.vlo;
import defpackage.xlo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzap extends zzcfd {
    public static final ArrayList G = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList H = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList I = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList J = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    public final zzbkl D;
    public final zzj E;
    public final zza F;
    public final zzcob a;
    public Context b;
    public final zzbbd c;
    public final zzfma d;
    public final zzfmv e;
    public final zzhdi f;
    public final ScheduledExecutorService g;
    public zzcal h;
    public final zzeao k;
    public final zzfte l;
    public final VersionInfoParcel t;
    public String u;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;
    public final ArrayList z;
    public Point i = new Point();
    public Point j = new Point();
    public final AtomicInteger s = new AtomicInteger(0);
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final AtomicInteger C = new AtomicInteger(0);
    public final boolean m = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q8)).booleanValue();
    public final boolean n = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.p8)).booleanValue();
    public final boolean o = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s8)).booleanValue();
    public final boolean p = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u8)).booleanValue();
    public final String q = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t8);
    public final String r = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v8);
    public final String v = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w8);

    public zzap(zzcob zzcobVar, Context context, zzbbd zzbbdVar, zzfmv zzfmvVar, zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, zzeao zzeaoVar, zzfte zzfteVar, VersionInfoParcel versionInfoParcel, zzbkl zzbklVar, zzfma zzfmaVar, zzj zzjVar, zza zzaVar) {
        ArrayList arrayList;
        this.a = zzcobVar;
        this.b = context;
        this.c = zzbbdVar;
        this.d = zzfmaVar;
        this.e = zzfmvVar;
        this.f = zzhdiVar;
        this.g = scheduledExecutorService;
        this.k = zzeaoVar;
        this.l = zzfteVar;
        this.t = versionInfoParcel;
        this.D = zzbklVar;
        this.E = zzjVar;
        this.F = zzaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x8)).booleanValue()) {
            this.w = M4((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y8));
            this.x = M4((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.z8));
            this.y = M4((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A8));
            arrayList = M4((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B8));
        } else {
            this.w = G;
            this.x = H;
            this.y = I;
            arrayList = J;
        }
        this.z = arrayList;
    }

    public static boolean I4(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri L4(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(uri2.substring(0, i));
        bf3.v(sb, str, U3.j.b, str2, U3.j.c);
        sb.append(uri2.substring(i));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList M4(String str) {
        String[] split = TextUtils.split(str, BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!b0a.U(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ zzfrg N4(ddb ddbVar, zzcfi zzcfiVar) {
        if (zzfrj.a() && ((Boolean) zzbla.e.c()).booleanValue()) {
            try {
                zzfrg zzb = ((zzx) zzhcy.j(ddbVar)).zzb();
                zzb.b(new ArrayList(Collections.singletonList(zzcfiVar.b)));
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzcfiVar.d;
                zzb.c(zzmVar == null ? "" : zzmVar.zzp);
                zzb.d(zzmVar.zzm);
                return zzb;
            } catch (ExecutionException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e);
            }
        }
        return null;
    }

    public final void E4(final List list, final IObjectWrapper iObjectWrapper, zzcai zzcaiVar, boolean z) {
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G8)).booleanValue()) {
            try {
                zzcaiVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzap zzapVar = zzap.this;
                zzbay zzbayVar = zzapVar.c.b;
                String zzj = zzbayVar != null ? zzbayVar.zzj(zzapVar.b, (View) ObjectWrapper.Z1(iObjectWrapper), null) : "";
                if (TextUtils.isEmpty(zzj)) {
                    ogj.k("Failed to get view signals.");
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (zzap.I4(uri, zzapVar.y, zzapVar.z)) {
                        arrayList.add(zzap.L4(uri, "ms", zzj));
                    } else {
                        String valueOf = String.valueOf(uri);
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf));
                        arrayList.add(uri);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                ogj.k("Empty impression URLs result.");
                return null;
            }
        };
        zzhdi zzhdiVar = this.f;
        ddb submit = zzhdiVar.submit(callable);
        zzcal zzcalVar = this.h;
        if (zzcalVar == null || (map = zzcalVar.b) == null || map.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        } else {
            submit = zzhcy.h(submit, new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ddb zza(Object obj) {
                    final ArrayList arrayList = (ArrayList) obj;
                    final zzap zzapVar = zzap.this;
                    return zzhcy.i(zzapVar.K4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgub() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                        @Override // com.google.android.gms.internal.ads.zzgub
                        public final Object apply(Object obj2) {
                            String str = (String) obj2;
                            ArrayList arrayList2 = new ArrayList();
                            for (Uri uri : arrayList) {
                                zzap zzapVar2 = zzap.this;
                                if (!zzap.I4(uri, zzapVar2.y, zzapVar2.z) || TextUtils.isEmpty(str)) {
                                    arrayList2.add(uri);
                                } else {
                                    arrayList2.add(zzap.L4(uri, "nas", str));
                                }
                            }
                            return arrayList2;
                        }
                    }, zzapVar.f);
                }
            }, zzhdiVar);
        }
        submit.addListener(new vlo(0, submit, new zzz(this, zzcaiVar, z)), this.a.d());
    }

    public final void F4(List list, final IObjectWrapper iObjectWrapper, zzcai zzcaiVar, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ddb ddbVar;
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G8)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzcaiVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.x;
            arrayList2 = this.w;
            if (!hasNext) {
                break;
            } else if (I4((Uri) it.next(), arrayList2, arrayList)) {
                i3++;
            }
        }
        if (i3 > 1) {
            String valueOf = String.valueOf(list);
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (I4(uri, arrayList2, arrayList)) {
                Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        zzfma zzfmaVar;
                        Uri uri2 = uri;
                        try {
                            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hd)).booleanValue();
                            zzap zzapVar = zzap.this;
                            IObjectWrapper iObjectWrapper2 = iObjectWrapper;
                            uri2 = (!booleanValue || (zzfmaVar = zzapVar.d) == null) ? zzapVar.c.b(uri2, zzapVar.b, (View) ObjectWrapper.Z1(iObjectWrapper2), null) : zzfmaVar.a(uri2, zzapVar.b, (View) ObjectWrapper.Z1(iObjectWrapper2), null);
                        } catch (zzbbe e2) {
                            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e2);
                        }
                        if (uri2.getQueryParameter("ms") != null) {
                            return uri2;
                        }
                        ogj.k("Failed to append spam signals to click url.");
                        return null;
                    }
                };
                zzhdi zzhdiVar = this.f;
                ddb submit = zzhdiVar.submit(callable);
                zzcal zzcalVar = this.h;
                if (zzcalVar == null || (map = zzcalVar.b) == null || map.isEmpty()) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                    ddbVar = submit;
                } else {
                    ddbVar = zzhcy.h(submit, new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ddb zza(Object obj) {
                            final Uri uri2 = (Uri) obj;
                            zzap zzapVar = zzap.this;
                            return zzhcy.i(zzapVar.K4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgub() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                                @Override // com.google.android.gms.internal.ads.zzgub
                                public final /* synthetic */ Object apply(Object obj2) {
                                    String str = (String) obj2;
                                    ArrayList arrayList4 = zzap.G;
                                    boolean isEmpty = TextUtils.isEmpty(str);
                                    Uri uri3 = uri2;
                                    return !isEmpty ? zzap.L4(uri3, "nas", str) : uri3;
                                }
                            }, zzapVar.f);
                        }
                    }, zzhdiVar);
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf2));
                ddbVar = zzhcy.a(uri);
            }
            arrayList3.add(ddbVar);
        }
        olo oloVar = new olo(zzgxm.x(arrayList3), true);
        oloVar.addListener(new vlo(i2, oloVar, new zzaa(this, zzcaiVar, z)), this.a.d());
    }

    public final void G4() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ib)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.lb)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pb)).booleanValue() && this.A.getAndSet(true)) {
                return;
            }
            H4();
        }
    }

    public final void H4() {
        zzap zzapVar;
        ddb b;
        if (((Boolean) zzblm.e.c()).booleanValue()) {
            this.E.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Jc)).booleanValue()) {
            b = zzhcy.d(new zzhcf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                @Override // com.google.android.gms.internal.ads.zzhcf
                /* renamed from: zza */
                public final /* synthetic */ ddb mo10zza() {
                    zzap zzapVar2 = zzap.this;
                    try {
                        return zzapVar2.J4(zzapVar2.b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
                    } catch (NullPointerException e) {
                        return zzhcy.b(e);
                    }
                }
            }, zzcgj.a);
            zzapVar = this;
        } else {
            try {
                zzapVar = this;
                try {
                    b = zzapVar.J4(this.b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
                } catch (NullPointerException e) {
                    e = e;
                    b = zzhcy.b(e);
                    zzab zzabVar = new zzab(zzapVar);
                    b.addListener(new vlo(0, b, zzabVar), zzapVar.a.d());
                }
            } catch (NullPointerException e2) {
                e = e2;
                zzapVar = this;
            }
        }
        zzab zzabVar2 = new zzab(zzapVar);
        b.addListener(new vlo(0, b, zzabVar2), zzapVar.a.d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r8.equals("REWARDED_INTERSTITIAL") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r9 = com.google.android.gms.ads.internal.client.zzr.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r8.equals("REWARDED") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzx J4(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        zzflv zzflvVar = new zzflv();
        boolean equals = "REWARDED".equals(str2);
        zzflj zzfljVar = zzflvVar.o;
        if (equals) {
            zzfljVar.a = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfljVar.a = 3;
        }
        sx2 n = this.a.n();
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.a = context;
        if (str == null) {
            str = "adUnitId";
        }
        zzflvVar.c = str;
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzflvVar.a = zzmVar;
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        zzrVar = com.google.android.gms.ads.internal.client.zzr.zzb();
                        break;
                    }
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        zzrVar = com.google.android.gms.ads.internal.client.zzr.zzd();
                        break;
                    }
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
                case 543046670:
                    break;
                case 1854800829:
                    break;
                case 1951953708:
                    if (str2.equals(j.a)) {
                        zzrVar = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
                        break;
                    }
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
                default:
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
            }
        }
        zzflvVar.b = zzrVar;
        zzflvVar.s = true;
        zzflvVar.t = bundle;
        zzdcyVar.b = zzflvVar.a();
        n.b = new zzdcz(zzdcyVar);
        zzas zzasVar = new zzas();
        zzasVar.zza(str2);
        n.c = new zzat(zzasVar);
        new zzdjo();
        return n.zza();
    }

    public final zzhcq K4(final String str) {
        final zzdvv[] zzdvvVarArr = new zzdvv[1];
        ddb b = this.e.b();
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ddb zza(Object obj) {
                zzdvv zzdvvVar = (zzdvv) obj;
                zzdvvVarArr[0] = zzdvvVar;
                zzap zzapVar = zzap.this;
                Context context = zzapVar.b;
                zzcal zzcalVar = zzapVar.h;
                Map map = zzcalVar.b;
                JSONObject zze2 = zzbs.zze(context, map, map, zzcalVar.a, null);
                JSONObject zzb = zzbs.zzb(zzapVar.b, zzapVar.h.a);
                JSONObject zzc = zzbs.zzc(zzapVar.h.a);
                JSONObject zzd = zzbs.zzd(zzapVar.b, zzapVar.h.a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", zze2);
                jSONObject.put("ad_view_signal", zzb);
                jSONObject.put("scroll_view_signal", zzc);
                jSONObject.put("lock_screen_signal", zzd);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", zzbs.zzf(null, zzapVar.b, zzapVar.j, zzapVar.i));
                }
                return zzdvvVar.a(str2, jSONObject);
            }
        };
        zzhdi zzhdiVar = this.f;
        hlo h = zzhcy.h(b, zzhcgVar, zzhdiVar);
        h.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.lang.Runnable
            public final void run() {
                zzap zzapVar = zzap.this;
                zzdvv zzdvvVar = zzdvvVarArr[0];
                if (zzdvvVar != null) {
                    zzfmv zzfmvVar = zzapVar.e;
                    xlo a = zzhcy.a(zzdvvVar);
                    synchronized (zzfmvVar) {
                        zzfmvVar.a.addFirst(a);
                    }
                }
            }
        }, zzhdiVar);
        return zzhcy.e(zzhcy.i((zzhcq) zzhcy.g(zzhcq.r(h), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H8)).intValue(), TimeUnit.MILLISECONDS, this.g), zzal.a, zzhdiVar), Exception.class, zzam.a, zzhdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zze(IObjectWrapper iObjectWrapper, final zzcfi zzcfiVar, @Nullable zzcfb zzcfbVar) {
        ddb b;
        ddb ddbVar;
        zzap zzapVar;
        ddb b2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue()) {
            bundle.putLong("api-call", zzcfiVar.d.zzz);
            bundle.putLong("dynamite-enter", com.google.android.gms.ads.internal.zzt.zzk().a());
        }
        this.b = (Context) ObjectWrapper.Z1(iObjectWrapper);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        zzfqw e = zzfqw.e(22, this.b);
        e.zza();
        if ("UNKNOWN".equals(zzcfiVar.b)) {
            List arrayList = new ArrayList();
            inn innVar = zzbjg.F8;
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
            }
            if (arrayList.contains(zzv.zzc(zzcfiVar.d))) {
                ddb b3 = zzhcy.b(new IllegalArgumentException("Unknown format is no longer supported."));
                zzapVar = this;
                ddbVar = b3;
                b = zzhcy.b(new IllegalArgumentException("Unknown format is no longer supported."));
                zzy zzyVar = new zzy(zzapVar, ddbVar, zzcfiVar, zzcfbVar, e);
                b.addListener(new vlo(0, b, zzyVar), zzapVar.a.d());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Jc)).booleanValue()) {
            hsn hsnVar = zzcgj.a;
            ddb submit = hsnVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzap zzapVar2 = zzap.this;
                    Context context = zzapVar2.b;
                    zzcfi zzcfiVar2 = zzcfiVar;
                    return zzapVar2.J4(context, zzcfiVar2.a, zzcfiVar2.b, zzcfiVar2.c, zzcfiVar2.d, bundle);
                }
            });
            try {
                b2 = zzhcy.h(submit, zzac.a, hsnVar);
            } catch (NullPointerException e2) {
                b2 = zzhcy.b(e2);
            }
            zzapVar = this;
            b = b2;
            ddbVar = submit;
        } else {
            zzx J4 = J4(this.b, zzcfiVar.a, zzcfiVar.b, zzcfiVar.c, zzcfiVar.d, bundle);
            ddb a = zzhcy.a(J4);
            try {
                b = J4.zza();
            } catch (NullPointerException e3) {
                b = zzhcy.b(e3);
            }
            ddbVar = a;
            zzapVar = this;
        }
        zzy zzyVar2 = new zzy(zzapVar, ddbVar, zzcfiVar, zzcfbVar, e);
        b.addListener(new vlo(0, b, zzyVar2), zzapVar.a.d());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G8)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.Z1(iObjectWrapper);
            zzcal zzcalVar = this.h;
            this.i = zzbs.zzh(motionEvent, zzcalVar == null ? null : zzcalVar.a);
            if (motionEvent.getAction() == 0) {
                this.j = this.i;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.i;
            obtain.setLocation(point.x, point.y);
            this.c.b.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        E4(list, iObjectWrapper, zzcaiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        F4(list, iObjectWrapper, zzcaiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzi(zzcal zzcalVar) {
        this.h = zzcalVar;
        this.e.a(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.hb)).booleanValue()) {
            inn innVar = zzbjg.E8;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                G4();
            }
            WebView webView = (WebView) ObjectWrapper.Z1(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            hsn hsnVar = zzcgj.f;
            zza zzaVar = this.F;
            zze zzeVar = new zze(webView, zzaVar, hsnVar);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.c, this.k, this.l, this.d, this.E, zzaVar, zzeVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.rb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().l.incrementAndGet();
            }
            if (((Boolean) zzblm.c.c()).booleanValue()) {
                zzaVar.zza(webView);
                if (((Boolean) zzblm.d.c()).booleanValue()) {
                    zzeVar.zza();
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                G4();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        E4(list, iObjectWrapper, zzcaiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        F4(list, iObjectWrapper, zzcaiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.vb)).booleanValue()) {
            return new ObjectWrapper(null);
        }
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        ba4 ba4Var = (ba4) ObjectWrapper.Z1(iObjectWrapper2);
        t94 t94Var = (t94) ObjectWrapper.Z1(iObjectWrapper3);
        zzbkl zzbklVar = this.D;
        zzbklVar.getClass();
        if (context == null) {
            a70.p("App Context parameter is null");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            a70.p("Origin parameter is empty or null");
            return null;
        }
        if (ba4Var == null) {
            a70.p("CustomTabsClient parameter is null");
            return null;
        }
        zzbklVar.l = context;
        zzbklVar.h = str;
        zzeao zzeaoVar = zzbklVar.d;
        zzbki zzbkiVar = new zzbki(zzbklVar, t94Var, zzeaoVar);
        zzbklVar.f = zzbkiVar;
        ja4 c = ba4Var.c(zzbkiVar);
        zzbklVar.g = c;
        if (c == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        zzv.zze(zzeaoVar, null, "pact_action", new Pair("pe", "pact_init"));
        if (((Boolean) zzblm.e.c()).booleanValue()) {
            this.E.zza();
        }
        if (((Boolean) zzblm.c.c()).booleanValue()) {
            this.F.zza(null);
        }
        return new ObjectWrapper(zzbklVar.g);
    }
}
