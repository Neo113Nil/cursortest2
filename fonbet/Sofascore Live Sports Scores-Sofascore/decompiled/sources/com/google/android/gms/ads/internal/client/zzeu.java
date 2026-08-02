package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbvq;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeu {
    public static zzeu m;
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    public zzem a;
    public zzey b;
    public zzel c;
    public zzcy j;
    public final Object d = new Object();
    public final Object e = new Object();
    public boolean g = false;
    public boolean h = false;
    public final Object i = new Object();
    public OnAdInspectorClosedListener k = null;
    public RequestConfiguration l = new RequestConfiguration.Builder().build();
    public final ArrayList f = new ArrayList();

    private zzeu() {
    }

    public static zzbsq a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbsh zzbshVar = (zzbsh) it.next();
            hashMap.put(zzbshVar.a, new zzbsp(zzbshVar.b ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbshVar.d, zzbshVar.c));
        }
        return new zzbsq(hashMap);
    }

    public static zzeu zzb() {
        zzeu zzeuVar;
        synchronized (zzeu.class) {
            try {
                zzeuVar = m;
                if (zzeuVar == null) {
                    zzeuVar = new zzeu();
                    m = zzeuVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeuVar;
    }

    public final void b(Context context) {
        if (this.j == null) {
            this.j = (zzcy) new zzat(zzay.zzb(), context).zzd(context, false);
        }
    }

    public final void c() {
        zzcy zzcyVar = this.j;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zze();
            this.j.zzj(null, new ObjectWrapper(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e);
        }
    }

    @Nullable
    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return this.a;
        }
        if (ordinal == 2) {
            return this.b;
        }
        if (ordinal != 5) {
            return null;
        }
        return this.c;
    }

    public final void zzc(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.d) {
            try {
                if (this.g) {
                    if (onInitializationCompleteListener != null) {
                        this.f.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.h) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zzl());
                    }
                    return;
                }
                this.g = true;
                if (onInitializationCompleteListener != null) {
                    this.f.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    a70.p("Context cannot be null.");
                    return;
                }
                synchronized (this.i) {
                    try {
                        b(context);
                        zzcy zzcyVar = this.j;
                        if (zzcyVar != null) {
                            zzcyVar.zzp(new zzet(this));
                            this.j.zzo(new zzbvq());
                        }
                        if (this.l.getTagForChildDirectedTreatment() != -1 || this.l.getTagForUnderAgeOfConsent() != -1) {
                            RequestConfiguration requestConfiguration = this.l;
                            zzcy zzcyVar2 = this.j;
                            if (zzcyVar2 != null) {
                                try {
                                    zzcyVar2.zzr(new zzfr(requestConfiguration));
                                } catch (RemoteException e) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e);
                                }
                            }
                        }
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e2);
                    } finally {
                    }
                    zzbjg.a(context);
                    if (((Boolean) zzblf.a.c()).booleanValue()) {
                        if (((Boolean) zzba.zzc().a(zzbjg.Nc)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on bg thread");
                            com.google.android.gms.ads.internal.util.client.zzb.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzer
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu zzeuVar = zzeu.this;
                                    synchronized (zzeuVar.i) {
                                        zzeuVar.c();
                                    }
                                }
                            });
                            this.a = new zzem(context);
                            this.b = new zzey(context);
                            this.c = new zzel(context);
                        }
                    }
                    if (((Boolean) zzblf.b.c()).booleanValue()) {
                        if (((Boolean) zzba.zzc().a(zzbjg.Nc)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzep
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu zzeuVar = zzeu.this;
                                    synchronized (zzeuVar.i) {
                                        zzeuVar.c();
                                    }
                                }
                            });
                            this.a = new zzem(context);
                            this.b = new zzey(context);
                            this.c = new zzel(context);
                        }
                    }
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                    c();
                    this.a = new zzem(context);
                    this.b = new zzey(context);
                    this.c = new zzel(context);
                }
            } finally {
            }
        }
    }

    public final void zzd() {
        synchronized (this.d) {
            this.h = false;
            this.g = false;
            this.f.clear();
        }
        synchronized (this.i) {
            try {
                zzcy zzcyVar = this.j;
                if (zzcyVar != null) {
                    zzcyVar.zzw();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to stop the SDK.", e);
            }
            this.j = null;
            zzem zzemVar = this.a;
            if (zzemVar != null) {
                zzemVar.zzg();
                this.a = null;
            }
            zzey zzeyVar = this.b;
            if (zzeyVar != null) {
                zzeyVar.zzg();
                this.b = null;
            }
            zzel zzelVar = this.c;
            if (zzelVar != null) {
                zzelVar.zzg();
                this.c = null;
            }
        }
    }

    public final Status zze(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        Status status;
        boolean z = false;
        zzbjg.a(context);
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String valueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            String m2 = wt3.m(valueOf, "#", new StringBuilder(valueOf.length() + 1 + String.valueOf(adUnitId).length()), adUnitId);
            hashMap.put(m2, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap, m2, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                hashMap2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + adFormat.name());
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + adFormat.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put((EnumMap) AdFormat.APP_OPEN_AD, (AdFormat) zzba.zzc().a(zzbjg.D5));
        enumMap.put((EnumMap) AdFormat.INTERSTITIAL, (AdFormat) zzba.zzc().a(zzbjg.B5));
        enumMap.put((EnumMap) AdFormat.REWARDED, (AdFormat) zzba.zzc().a(zzbjg.C5));
        for (Map.Entry entry : hashMap2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int intValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (intValue > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + adFormat2.name());
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String sb2 = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
            status = new Status(13, sb2, null, null);
        } else {
            status = Status.e;
        }
        String str = status.b;
        if (str == null) {
            str = "";
        }
        Preconditions.a(str, status.Y0());
        synchronized (this.e) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzv(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzen(this, preloadCallback));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e);
                return Status.g;
            }
        }
        return Status.e;
    }

    public final void zzf(float f) {
        boolean z = true;
        Preconditions.a("The app volume must be a value between 0 and 1 inclusive.", f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 1.0f);
        synchronized (this.i) {
            if (this.j == null) {
                z = false;
            }
            Preconditions.k("MobileAds.initialize() must be called prior to setting the app volume.", z);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzf(f);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e);
            }
        }
    }

    public final float zzg() {
        synchronized (this.i) {
            zzcy zzcyVar = this.j;
            float f = 1.0f;
            if (zzcyVar == null) {
                return 1.0f;
            }
            try {
                f = zzcyVar.zzk();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.i) {
            Preconditions.k("MobileAds.initialize() must be called prior to setting app muted state.", this.j != null);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzh(z);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e);
            }
        }
    }

    public final boolean zzi() {
        synchronized (this.i) {
            zzcy zzcyVar = this.j;
            boolean z = false;
            if (zzcyVar == null) {
                return false;
            }
            try {
                z = zzcyVar.zzl();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e);
            }
            return z;
        }
    }

    public final void zzj(Context context, String str) {
        synchronized (this.i) {
            Preconditions.k("MobileAds.initialize() must be called prior to opening debug menu.", this.j != null);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzi(new ObjectWrapper(context), str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzk(Class cls) {
        synchronized (this.i) {
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzn(cls.getCanonicalName());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e);
            }
        }
    }

    public final InitializationStatus zzl() {
        synchronized (this.i) {
            Preconditions.k("MobileAds.initialize() must be called prior to getting initialization status.", this.j != null);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return new InitializationStatus(this) { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzeo());
                        return hashMap;
                    }
                };
            }
            try {
                return a(zzcyVar.zzq());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new InitializationStatus(this) { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzeo());
                        return hashMap;
                    }
                };
            }
        }
    }

    public final void zzm(Context context) {
        synchronized (this.i) {
            b(context);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.i) {
            try {
                b(context);
                zzcy zzcyVar = this.j;
                if (zzcyVar == null) {
                    return;
                }
                this.k = onAdInspectorClosedListener;
                try {
                    zzcyVar.zzt(new zzes());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                    if (onAdInspectorClosedListener != null) {
                        onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzo() {
        synchronized (this.i) {
            Preconditions.k("MobileAds.initialize() must be called prior to getting version string.", this.j != null);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return "";
            }
            try {
                String zzm = zzcyVar.zzm();
                if (zzm == null) {
                    zzm = "";
                }
                return zzm;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e);
                return "";
            }
        }
    }

    @NonNull
    public final RequestConfiguration zzp() {
        return this.l;
    }

    public final void zzq(@NonNull RequestConfiguration requestConfiguration) {
        zzcy zzcyVar;
        Preconditions.a("Null passed to setRequestConfiguration.", requestConfiguration != null);
        synchronized (this.i) {
            try {
                RequestConfiguration requestConfiguration2 = this.l;
                this.l = requestConfiguration;
                if (this.j == null) {
                    return;
                }
                if ((requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) && (zzcyVar = this.j) != null) {
                    try {
                        zzcyVar.zzr(new zzfr(requestConfiguration));
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzr(boolean z) {
        synchronized (this.i) {
            Preconditions.k("MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.", this.j != null);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return false;
            }
            try {
                zzcyVar.zzu(z);
                return true;
            } catch (RemoteException e) {
                String str = z ? a.k : "disable";
                StringBuilder sb = new StringBuilder(str.length() + 40);
                sb.append("Unable to ");
                sb.append(str);
                sb.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb.toString(), e);
                return false;
            }
        }
    }

    public final void zzs(String str) {
        synchronized (this.i) {
            Preconditions.k("MobileAds.initialize() must be called prior to setting the plugin.", this.j != null);
            zzcy zzcyVar = this.j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzv(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e);
            }
        }
    }
}
