package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import defpackage.da4;
import defpackage.dsn;
import defpackage.ea4;
import defpackage.gqn;
import defpackage.wjn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbym implements MediationInterstitialAdapter {
    public Activity a;
    public MediationInterstitialListener b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzo.zzd("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzo.zzd("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzo.zzd("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzo.zzi("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzo.zzi("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!zzbkh.a(context)) {
            zzo.zzi("Default browser does not support custom tabs. Bailing out.");
            this.b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzo.zzi("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.b.onAdFailedToLoad(this, 0);
        } else {
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            this.b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        ea4 a = new da4().a();
        a.a.setData(this.c);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new wjn(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(a.a, null), null, new gqn(this), null, new VersionInfoParcel(0, 0, false), null, null, ""), false, 3));
        dsn dsnVar = com.google.android.gms.ads.internal.zzt.zzh().m;
        dsnVar.getClass();
        long a2 = com.google.android.gms.ads.internal.zzt.zzk().a();
        synchronized (dsnVar.a) {
            try {
                if (dsnVar.c == 3) {
                    if (dsnVar.b + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a7)).longValue() <= a2) {
                        dsnVar.c = 1;
                    }
                }
            } finally {
            }
        }
        long a3 = com.google.android.gms.ads.internal.zzt.zzk().a();
        synchronized (dsnVar.a) {
            try {
                if (dsnVar.c != 2) {
                    return;
                }
                dsnVar.c = 3;
                if (dsnVar.c == 3) {
                    dsnVar.b = a3;
                }
            } finally {
            }
        }
    }
}
