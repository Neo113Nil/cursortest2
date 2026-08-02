package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbaj;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcdx;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzdbo;
import com.google.android.gms.internal.ads.zzdie;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdyi;
import com.google.android.gms.internal.ads.zzdze;
import com.google.android.gms.internal.ads.zzfkl;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzgsn;
import com.google.android.gms.internal.ads.zzgtn;
import com.google.android.gms.internal.ads.zzhap;
import com.google.android.gms.internal.ads.zzhaq;
import com.google.android.gms.internal.ads.zzhba;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
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

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzap extends zzcdz {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbjj zzI;
    private final zzj zzJ;
    private final zza zzK;
    private final zzcmx zzf;
    private Context zzg;
    private final zzbai zzh;
    private final zzfkq zzi;
    private final zzfll zzj;
    private final zzhbs zzk;
    private final ScheduledExecutorService zzl;
    private zzbzh zzm;
    private final zzdze zzp;
    private final zzfro zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzik)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzij)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzim)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzio)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzin);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzip);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziq);

    zzap(zzcmx zzcmxVar, Context context, zzbai zzbaiVar, zzfll zzfllVar, zzhbs zzhbsVar, ScheduledExecutorService scheduledExecutorService, zzdze zzdzeVar, zzfro zzfroVar, VersionInfoParcel versionInfoParcel, zzbjj zzbjjVar, zzfkq zzfkqVar, zzj zzjVar, zza zzaVar) {
        List list;
        this.zzf = zzcmxVar;
        this.zzg = context;
        this.zzh = zzbaiVar;
        this.zzi = zzfkqVar;
        this.zzj = zzfllVar;
        this.zzk = zzhbsVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdzeVar;
        this.zzq = zzfroVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbjjVar;
        this.zzJ = zzjVar;
        this.zzK = zzaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzir)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzis));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzit));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziu));
            list = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziv));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    private final void zzR(final List list, final IObjectWrapper iObjectWrapper, zzbze zzbzeVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziA)).booleanValue()) {
            try {
                zzbzeVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        zzhbs zzhbsVar = this.zzk;
        ListenableFuture submit = zzhbsVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzap.this.zzo(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            submit = zzhbi.zzj(submit, new zzhaq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzap.this.zzp((ArrayList) obj);
                }
            }, zzhbsVar);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzhbi.zzr(submit, new zzz(this, zzbzeVar, z), this.zzf.zzb());
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbze zzbzeVar, boolean z) {
        ListenableFuture submit;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziA)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbzeVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            String valueOf = String.valueOf(list);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(valueOf2));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzd(uri)) {
                zzhbs zzhbsVar = this.zzk;
                submit = zzhbsVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzap.this.zzq(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    submit = zzhbi.zzj(submit, new zzhaq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzap.this.zzr((Uri) obj);
                        }
                    }, zzhbsVar);
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String valueOf3 = String.valueOf(uri);
                String.valueOf(valueOf3);
                String valueOf4 = String.valueOf(valueOf3);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf4));
                submit = zzhbi.zza(uri);
            }
            arrayList.add(submit);
        }
        zzhbi.zzr(zzhbi.zzm(arrayList), new zzaa(this, zzbzeVar, z), this.zzf.zzb());
    }

    private final void zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkV)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkY)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlc)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        zzap zzapVar;
        ListenableFuture zzc2;
        if (((Boolean) zzbkj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmw)).booleanValue()) {
            zzc2 = zzhbi.zzf(new zzhap() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                @Override // com.google.android.gms.internal.ads.zzhap
                public final /* synthetic */ ListenableFuture zza() {
                    return zzap.this.zzs();
                }
            }, zzcff.zza);
            zzapVar = this;
        } else {
            try {
                zzapVar = this;
                try {
                    zzc2 = zzapVar.zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
                } catch (NullPointerException e) {
                    e = e;
                    zzc2 = zzhbi.zzc(e);
                    zzhbi.zzr(zzc2, new zzab(this), zzapVar.zzf.zzb());
                }
            } catch (NullPointerException e2) {
                e = e2;
                zzapVar = this;
            }
        }
        zzhbi.zzr(zzc2, new zzab(this), zzapVar.zzf.zzb());
    }

    private static boolean zzV(Uri uri, List list, List list2) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzx zzW(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        char c;
        zzfkl zzfklVar = new zzfkl();
        if (BrandSafetyUtils.k.equals(str2)) {
            zzfklVar.zzj().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfklVar.zzj().zza(3);
        }
        zzw zzr = this.zzf.zzr();
        zzdbo zzdboVar = new zzdbo();
        zzdboVar.zza(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfklVar.zzg(str);
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzfklVar.zza(zzmVar);
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals(BrandSafetyUtils.k)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            zzrVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzr.zzc() : c != 3 ? c != 4 ? new com.google.android.gms.ads.internal.client.zzr() : com.google.android.gms.ads.internal.client.zzr.zzd() : com.google.android.gms.ads.internal.client.zzr.zzb() : new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
        }
        zzfklVar.zzc(zzrVar);
        zzfklVar.zzu(true);
        zzfklVar.zzv(bundle);
        zzdboVar.zzb(zzfklVar.zzA());
        zzr.zzc(zzdboVar.zze());
        zzas zzasVar = new zzas();
        zzasVar.zza(str2);
        zzr.zzb(new zzat(zzasVar, null));
        new zzdie();
        return zzr.zza();
    }

    private final ListenableFuture zzX(final String str) {
        final zzdul[] zzdulVarArr = new zzdul[1];
        ListenableFuture zzb2 = this.zzj.zzb();
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzap.this.zzu(zzdulVarArr, str, (zzdul) obj);
            }
        };
        zzhbs zzhbsVar = this.zzk;
        ListenableFuture zzj = zzhbi.zzj(zzb2, zzhaqVar, zzhbsVar);
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzap.this.zzv(zzdulVarArr);
            }
        }, zzhbsVar);
        return (zzhba) zzhbi.zzg((zzhba) zzhbi.zzk((zzhba) zzhbi.zzi(zzhba.zzw(zzj), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziB)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzal.zza, zzhbsVar), Exception.class, zzam.zza, zzhbsVar);
    }

    private final boolean zzY() {
        Map map;
        zzbzh zzbzhVar = this.zzm;
        return (zzbzhVar == null || (map = zzbzhVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + X3.j.c + uri2.substring(i));
    }

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzgtn.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* synthetic */ zzfps zzy(ListenableFuture listenableFuture, zzcee zzceeVar) {
        if (!zzfpv.zza() || !((Boolean) zzbjx.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfps zzb2 = ((zzx) zzhbi.zzs(listenableFuture)).zzb();
            zzb2.zzb(new ArrayList(Collections.singletonList(zzceeVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzceeVar.zzd;
            zzb2.zzc(zzmVar == null ? "" : zzmVar.zzp);
            zzb2.zzd(zzmVar.zzm);
            return zzb2;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ zzdze zzA() {
        return this.zzp;
    }

    final /* synthetic */ zzfro zzB() {
        return this.zzq;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    final /* synthetic */ String zzG() {
        return this.zzv;
    }

    final /* synthetic */ String zzH() {
        return this.zzw;
    }

    final /* synthetic */ AtomicInteger zzI() {
        return this.zzx;
    }

    final /* synthetic */ VersionInfoParcel zzJ() {
        return this.zzy;
    }

    final /* synthetic */ String zzK() {
        return this.zzz;
    }

    final /* synthetic */ void zzL(String str) {
        this.zzz = str;
    }

    final /* synthetic */ String zzM() {
        return this.zzA;
    }

    final /* synthetic */ AtomicBoolean zzN() {
        return this.zzG;
    }

    final /* synthetic */ AtomicInteger zzO() {
        return this.zzH;
    }

    final boolean zzc(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    final boolean zzd(Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zze(IObjectWrapper iObjectWrapper, final zzcee zzceeVar, zzcdx zzcdxVar) {
        ListenableFuture zza2;
        ListenableFuture zzc2;
        ListenableFuture listenableFuture;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue()) {
            bundle.putLong(zzdyi.PUBLIC_API_CALL.zza(), zzceeVar.zzd.zzz);
            bundle.putLong(zzdyi.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        this.zzg = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        zzfpi zzn = zzfpi.zzn(this.zzg, 22);
        zzn.zza();
        if ("UNKNOWN".equals(zzceeVar.zzb)) {
            List arrayList = new ArrayList();
            zzbhv zzbhvVar = zzbie.zziz;
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).split(","));
            }
            if (arrayList.contains(zzv.zzc(zzceeVar.zzd))) {
                listenableFuture = zzhbi.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                zzc2 = zzhbi.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                zzhbi.zzr(zzc2, new zzy(this, listenableFuture, zzceeVar, zzcdxVar, zzn), this.zzf.zzb());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmw)).booleanValue()) {
            zzhbs zzhbsVar = zzcff.zza;
            zza2 = zzhbsVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzap.this.zzn(zzceeVar, bundle);
                }
            });
            try {
                zzc2 = zzhbi.zzj(zza2, zzac.zza, zzhbsVar);
            } catch (NullPointerException e) {
                zzc2 = zzhbi.zzc(e);
            }
        } else {
            zzx zzW = zzW(this.zzg, zzceeVar.zza, zzceeVar.zzb, zzceeVar.zzc, zzceeVar.zzd, bundle);
            zza2 = zzhbi.zza(zzW);
            try {
                zzc2 = zzW.zza();
            } catch (NullPointerException e2) {
                zzc2 = zzhbi.zzc(e2);
            }
        }
        listenableFuture = zza2;
        zzhbi.zzr(zzc2, new zzy(this, listenableFuture, zzceeVar, zzcdxVar, zzn), this.zzf.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziA)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbzh zzbzhVar = this.zzm;
            this.zzn = zzbs.zzh(motionEvent, zzbzhVar == null ? null : zzbzhVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzc(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) {
        zzR(list, iObjectWrapper, zzbzeVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) {
        zzS(list, iObjectWrapper, zzbzeVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzi(zzbzh zzbzhVar) {
        this.zzm = zzbzhVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkU)).booleanValue()) {
            zzbhv zzbhvVar = zzbie.zziy;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                zzT();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zza zzaVar = this.zzK;
            final zze zzeVar = new zze(webView, zzaVar, zzcff.zzf);
            AdMobNetworkBridge.webviewAddJavascriptInterface(webView, new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzaVar, zzeVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzle)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzm();
            }
            if (((Boolean) zzbkj.zzc.zze()).booleanValue()) {
                zzaVar.zza(webView);
                if (((Boolean) zzbkj.zzd.zze()).booleanValue()) {
                    zzcff.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zze.this.zza();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlf)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) {
        zzR(list, iObjectWrapper, zzbzeVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) {
        zzS(list, iObjectWrapper, zzbzeVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzli)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        CustomTabsClient customTabsClient = (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2);
        CustomTabsCallback customTabsCallback = (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbjj zzbjjVar = this.zzI;
        zzbjjVar.zza(context, customTabsClient, str, customTabsCallback);
        if (((Boolean) zzbkj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzbkj.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return ObjectWrapper.wrap(zzbjjVar.zzb());
    }

    final /* synthetic */ zzx zzn(zzcee zzceeVar, Bundle bundle) {
        return zzW(this.zzg, zzceeVar.zza, zzceeVar.zzb, zzceeVar.zzc, zzceeVar.zzd, bundle);
    }

    final /* synthetic */ ArrayList zzo(List list, IObjectWrapper iObjectWrapper) {
        zzbai zzbaiVar = this.zzh;
        String zzj = zzbaiVar.zzb() != null ? zzbaiVar.zzb().zzj(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(zzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", zzj));
            } else {
                String valueOf = String.valueOf(uri);
                String.valueOf(valueOf);
                String valueOf2 = String.valueOf(valueOf);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf2));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzp(final ArrayList arrayList) {
        return zzhbi.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgsn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzap.this.zzt(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ Uri zzq(Uri uri, IObjectWrapper iObjectWrapper) {
        zzfkq zzfkqVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznu)).booleanValue() || (zzfkqVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfkqVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzbaj e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ ListenableFuture zzr(final Uri uri) {
        return zzhbi.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgsn(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzap.zzQ(uri, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ ListenableFuture zzs() {
        try {
            return zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
        } catch (NullPointerException e) {
            return zzhbi.zzc(e);
        }
    }

    final /* synthetic */ ArrayList zzt(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzu(zzdul[] zzdulVarArr, String str, zzdul zzdulVar) {
        zzdulVarArr[0] = zzdulVar;
        Context context = this.zzg;
        zzbzh zzbzhVar = this.zzm;
        Map map = zzbzhVar.zzb;
        JSONObject zze2 = zzbs.zze(context, map, map, zzbzhVar.zza, null);
        JSONObject zzb2 = zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject zzc2 = zzbs.zzc(this.zzm.zza);
        JSONObject zzd2 = zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zze2);
        jSONObject.put("ad_view_signal", zzb2);
        jSONObject.put("scroll_view_signal", zzc2);
        jSONObject.put("lock_screen_signal", zzd2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdulVar.zzc(str, jSONObject);
    }

    final /* synthetic */ void zzv(zzdul[] zzdulVarArr) {
        zzdul zzdulVar = zzdulVarArr[0];
        if (zzdulVar != null) {
            this.zzj.zzc(zzhbi.zza(zzdulVar));
        }
    }

    final /* synthetic */ void zzw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    final /* synthetic */ Context zzz() {
        return this.zzg;
    }
}
