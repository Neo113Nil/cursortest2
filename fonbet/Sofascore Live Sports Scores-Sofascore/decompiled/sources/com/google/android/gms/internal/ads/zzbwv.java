package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.bf3;
import defpackage.d1l;
import defpackage.hbo;
import defpackage.x6k;
import defpackage.zpn;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbwv extends zzbvw {
    public final MediationExtrasReceiver a;
    public zzbwx b;
    public zzccs c;
    public IObjectWrapper d;
    public View e;
    public MediationInterstitialAd f;
    public UnifiedNativeAdMapper g;
    public NativeAdMapper h;
    public MediationRewardedAd i;
    public MediationInterscrollerAd j;
    public MediationAppOpenAd k;
    public final String l = "";

    public zzbwv(Adapter adapter) {
        this.a = adapter;
    }

    public static final boolean G4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy();
    }

    public static final String H4(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void B(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof OnContextChangedListener) {
            ((OnContextChangedListener) mediationExtrasReceiver).onContextChanged(context);
        }
    }

    public final Bundle E4(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) {
        zzo.zzd("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzo.zzg("", th);
            hbo.n();
            return null;
        }
    }

    public final Bundle F4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    public final void I4(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof Adapter) {
            e4(this.d, zzmVar, str, new zzbwy((Adapter) mediationExtrasReceiver, this.c));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void M3() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onResume();
            } catch (Throwable th) {
                zzo.zzg("", th);
                hbo.n();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void Q0(boolean z) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationExtrasReceiver).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzo.zzg("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzd(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void R3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), "", E4(str, zzmVar, null), F4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str), ""), new zpn(this, zzbwaVar, 4));
                return;
            } catch (Exception e) {
                zzbvr.a(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
                hbo.n();
                return;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void U1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), "", E4(str, zzmVar, null), F4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str), ""), new zpn(this, zzbwaVar, 5));
                return;
            } catch (Exception e) {
                zzo.zzg("", e);
                zzbvr.a(iObjectWrapper, e, "adapter.loadAppOpenAd");
                hbo.n();
                return;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void W2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar, zzbmk zzbmkVar, ArrayList arrayList) {
        MediationExtrasReceiver mediationExtrasReceiver;
        MediationExtrasReceiver mediationExtrasReceiver2 = this.a;
        boolean z = mediationExtrasReceiver2 instanceof MediationNativeAdapter;
        if (!z && !(mediationExtrasReceiver2 instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver2.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            bf3.v(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzo.zzi(sb.toString());
            hbo.n();
            return;
        }
        zzo.zzd("Requesting native ad from adapter.");
        if (z) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationExtrasReceiver2;
                List list = zzmVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = zzmVar.zzb;
                Date date = j == -1 ? null : new Date(j);
                int i = zzmVar.zzd;
                Location location = zzmVar.zzk;
                boolean G4 = G4(zzmVar);
                int i2 = zzmVar.zzg;
                boolean z2 = zzmVar.zzr;
                H4(zzmVar, str);
                zzbxa zzbxaVar = new zzbxa(date, i, hashSet, location, G4, i2, zzbmkVar, arrayList, z2);
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.b = new zzbwx(zzbwaVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.Z1(iObjectWrapper), this.b, E4(str, zzmVar, str2), zzbxaVar, bundle2);
                return;
            } catch (Throwable th) {
                zzo.zzg("", th);
                zzbvr.a(iObjectWrapper, th, "adapter.requestNativeAd");
                hbo.n();
                return;
            }
        }
        if (!(mediationExtrasReceiver2 instanceof Adapter)) {
            return;
        }
        try {
            mediationExtrasReceiver = mediationExtrasReceiver2;
            try {
                ((Adapter) mediationExtrasReceiver2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), "", E4(str, zzmVar, str2), F4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str), this.l, zzbmkVar), new zpn(this, zzbwaVar, 3));
            } catch (Throwable th2) {
                th = th2;
                zzo.zzg("", th);
                zzbvr.a(iObjectWrapper, th, "adapter.loadNativeAdMapper");
                String message = th.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    hbo.n();
                    return;
                }
                try {
                    ((Adapter) mediationExtrasReceiver).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), "", E4(str, zzmVar, str2), F4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str), this.l, zzbmkVar), new zpn(this, zzbwaVar, 2));
                } catch (Throwable th3) {
                    zzo.zzg("", th3);
                    zzbvr.a(iObjectWrapper, th3, "adapter.loadNativeAd");
                    hbo.n();
                }
            }
        } catch (Throwable th4) {
            th = th4;
            mediationExtrasReceiver = mediationExtrasReceiver2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void Y0(IObjectWrapper iObjectWrapper) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzo.zzi(sb.toString());
            hbo.n();
            return;
        }
        zzo.zzd("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.k;
        if (mediationAppOpenAd == null) {
            zzo.zzf("Can not show null mediation app open ad.");
            hbo.n();
        } else {
            try {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.Z1(iObjectWrapper));
            } catch (RuntimeException e) {
                zzbvr.a(iObjectWrapper, e, "adapter.appOpen.showAd");
                throw e;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void Z2(IObjectWrapper iObjectWrapper) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzo.zzi(sb.toString());
            hbo.n();
            return;
        }
        zzo.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.i;
        if (mediationRewardedAd == null) {
            zzo.zzf("Can not show null mediation rewarded ad.");
            hbo.n();
        } else {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.Z1(iObjectWrapper));
            } catch (RuntimeException e) {
                zzbvr.a(iObjectWrapper, e, "adapter.rewarded.showAd");
                throw e;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void a4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        boolean z = mediationExtrasReceiver instanceof MediationInterstitialAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            bf3.v(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzo.zzi(sb.toString());
            hbo.n();
            return;
        }
        zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), "", E4(str, zzmVar, str2), F4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str), this.l), new zpn(this, zzbwaVar, 1));
                    return;
                } catch (Throwable th) {
                    zzo.zzg("", th);
                    zzbvr.a(iObjectWrapper, th, "adapter.loadInterstitialAd");
                    hbo.n();
                    return;
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            Date date = j == -1 ? null : new Date(j);
            int i = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean G4 = G4(zzmVar);
            int i2 = zzmVar.zzg;
            boolean z2 = zzmVar.zzr;
            H4(zzmVar, str);
            zzbwm zzbwmVar = new zzbwm(date, i, hashSet, location, G4, i2, z2);
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.Z1(iObjectWrapper), new zzbwx(zzbwaVar), E4(str, zzmVar, str2), zzbwmVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            zzo.zzg("", th2);
            zzbvr.a(iObjectWrapper, th2, "adapter.requestInterstitialAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwd b() {
        MediationInterscrollerAd mediationInterscrollerAd = this.j;
        if (mediationInterscrollerAd != null) {
            return new zzbww(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwj e() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof MediationNativeAdapter) {
            zzbwx zzbwxVar = this.b;
            if (zzbwxVar == null || (unifiedNativeAdMapper = zzbwxVar.b) == null) {
                return null;
            }
            return new zzbxb(unifiedNativeAdMapper);
        }
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.h;
        if (nativeAdMapper != null) {
            return new zzbwz(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper2 = this.g;
        if (unifiedNativeAdMapper2 != null) {
            return new zzbxb(unifiedNativeAdMapper2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void e4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), "", E4(str, zzmVar, null), F4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str), ""), new zpn(this, zzbwaVar, 4));
                return;
            } catch (Exception e) {
                zzo.zzg("", e);
                zzbvr.a(iObjectWrapper, e, "adapter.loadRewardedAd");
                hbo.n();
                return;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void h0(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        boolean z = mediationExtrasReceiver instanceof MediationBannerAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            bf3.v(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzo.zzi(sb.toString());
            hbo.n();
            return;
        }
        zzo.zzd("Requesting banner ad from adapter.");
        boolean z2 = zzrVar.zzn;
        int i = zzrVar.zze;
        int i2 = zzrVar.zzb;
        AdSize zzb = z2 ? com.google.android.gms.ads.zzc.zzb(i, i2) : com.google.android.gms.ads.zzc.zza(i, i2, zzrVar.zza);
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), "", E4(str, zzmVar, str2), F4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str), zzb, this.l), new zpn(this, zzbwaVar, 0));
                    return;
                } catch (Throwable th) {
                    zzo.zzg("", th);
                    zzbvr.a(iObjectWrapper, th, "adapter.loadBannerAd");
                    hbo.n();
                    return;
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            Date date = j == -1 ? null : new Date(j);
            int i3 = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean G4 = G4(zzmVar);
            int i4 = zzmVar.zzg;
            boolean z3 = zzmVar.zzr;
            H4(zzmVar, str);
            zzbwm zzbwmVar = new zzbwm(date, i3, hashSet, location, G4, i4, z3);
            Bundle bundle = zzmVar.zzm;
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.Z1(iObjectWrapper), new zzbwx(zzbwaVar), E4(str, zzmVar, str2), zzb, zzbwmVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            zzo.zzg("", th2);
            zzbvr.a(iObjectWrapper, th2, "adapter.requestBannerAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi l() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof Adapter) {
            return zzbyi.Y0(((Adapter) mediationExtrasReceiver).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwf m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void m3(IObjectWrapper iObjectWrapper, zzccs zzccsVar, List list) {
        zzo.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void o0(IObjectWrapper iObjectWrapper) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (!(mediationExtrasReceiver instanceof Adapter) && !(mediationExtrasReceiver instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            bf3.v(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzo.zzi(sb.toString());
            hbo.n();
            return;
        }
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzh();
            return;
        }
        zzo.zzd("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.f;
        if (mediationInterstitialAd == null) {
            zzo.zzf("Can not show null mediation interstitial ad.");
            hbo.n();
        } else {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.Z1(iObjectWrapper));
            } catch (RuntimeException e) {
                zzbvr.a(iObjectWrapper, e, "adapter.interstitial.showAd");
                throw e;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void q2(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        I4(zzmVar, str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void s0(IObjectWrapper iObjectWrapper, zzbsl zzbslVar, ArrayList arrayList) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            hbo.n();
            return;
        }
        try {
            d1l d1lVar = new d1l(9, this, zzbslVar);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzbsr zzbsrVar = (zzbsr) it.next();
                String str = zzbsrVar.a;
                AdFormat adFormat = null;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            adFormat = AdFormat.BANNER;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                            adFormat = AdFormat.NATIVE;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            adFormat = AdFormat.REWARDED;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            adFormat = AdFormat.INTERSTITIAL;
                            break;
                        }
                        break;
                    case 1167692200:
                        if (str.equals("app_open")) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.zd)).booleanValue()) {
                                adFormat = AdFormat.APP_OPEN_AD;
                                break;
                            }
                        }
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            adFormat = AdFormat.REWARDED_INTERSTITIAL;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList2.add(new MediationConfiguration(adFormat, zzbsrVar.b));
                }
            }
            ((Adapter) mediationExtrasReceiver).initialize((Context) ObjectWrapper.Z1(iObjectWrapper), d1lVar, arrayList2);
        } catch (Throwable th) {
            zzbvr.a(iObjectWrapper, th, "adapter.initialize");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void s3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, zzccs zzccsVar, String str) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.d = iObjectWrapper;
            this.c = zzccsVar;
            zzccsVar.s(new ObjectWrapper(mediationExtrasReceiver));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void t4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzo.zzi(sb.toString());
            hbo.n();
            return;
        }
        zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) mediationExtrasReceiver;
            x6k x6kVar = new x6k(this, zzbwaVar, adapter, false, 25);
            E4(str, zzmVar, str2);
            F4(zzmVar);
            G4(zzmVar);
            H4(zzmVar, str);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb);
            x6kVar.onFailure(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Exception e) {
            zzo.zzg("", e);
            zzbvr.a(iObjectWrapper, e, "adapter.loadInterscrollerAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final com.google.android.gms.ads.internal.client.zzea zzB() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzo.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzH() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof Adapter) {
            return zzbyi.Y0(((Adapter) mediationExtrasReceiver).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwg zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final IObjectWrapper zzf() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof MediationBannerAdapter) {
            try {
                return new ObjectWrapper(((MediationBannerAdapter) mediationExtrasReceiver).getBannerView());
            } catch (Throwable th) {
                zzo.zzg("", th);
                hbo.n();
                return null;
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            return new ObjectWrapper(this.e);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        bf3.v(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzo.zzi(sb.toString());
        hbo.n();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzo.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) mediationExtrasReceiver).showInterstitial();
                return;
            } catch (Throwable th) {
                zzo.zzg("", th);
                hbo.n();
                return;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzi() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onDestroy();
            } catch (Throwable th) {
                zzo.zzg("", th);
                hbo.n();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzl() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onPause();
            } catch (Throwable th) {
                zzo.zzg("", th);
                hbo.n();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzp() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if (mediationExtrasReceiver instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.i;
            if (mediationRewardedAd == null) {
                zzo.zzf("Can not show null mediated rewarded ad.");
                hbo.n();
                return;
            } else {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.Z1(this.d));
                    return;
                } catch (RuntimeException e) {
                    zzbvr.a(this.d, e, "adapter.showVideo");
                    throw e;
                }
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzq() {
        MediationExtrasReceiver mediationExtrasReceiver = this.a;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.c != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzo.zzi(sb.toString());
        hbo.n();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzx() {
        return false;
    }

    public zzbwv(MediationAdapter mediationAdapter) {
        this.a = mediationAdapter;
    }
}
