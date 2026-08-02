package com.adsbynimbus.google;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import defpackage.bf3;
import defpackage.fhh;
import defpackage.hcd;
import defpackage.jcd;
import defpackage.ky1;
import defpackage.l0g;
import defpackage.nf;
import defpackage.o6a;
import defpackage.qcd;
import defpackage.qyf;
import defpackage.rik;
import defpackage.tnf;
import defpackage.wcd;
import defpackage.wt3;
import defpackage.zf;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes.dex */
public class NimbusCustomEventInterstitial implements CustomEventInterstitial, l0g, nf {
    public static final String EXTRA_POSITION = "position";
    public static final String POSITION_DEFAULT = "GAM Interstitial";
    public ky1 a;
    public WeakReference b;
    public CustomEventInterstitialListener c;
    public wcd d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.adsbynimbus.google.NimbusCustomEventInterstitial$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[wt3.D(6).length];
            a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static void loadAd(@NonNull NimbusCustomEventInterstitial nimbusCustomEventInterstitial, @NonNull hcd hcdVar) {
        if (nimbusCustomEventInterstitial.b.get() != null) {
            Activity activity = (Activity) nimbusCustomEventInterstitial.b.get();
            fhh fhhVar = qyf.a;
            hcdVar.getClass();
            activity.getClass();
            ky1 u = rik.u(activity, hcdVar);
            nimbusCustomEventInterstitial.a = u;
            if (u != null) {
                u.d.add(nimbusCustomEventInterstitial);
                nimbusCustomEventInterstitial.c.onAdLoaded();
                return;
            }
        }
        nimbusCustomEventInterstitial.c.onAdFailedToLoad(0);
    }

    @NonNull
    public static Bundle newRequestParameters(@NonNull String str) {
        return bf3.f("position", str);
    }

    @Override // defpackage.nf
    public void onAdEvent(zf zfVar) {
        CustomEventInterstitialListener customEventInterstitialListener = this.c;
        if (customEventInterstitialListener != null) {
            if (zfVar == zf.c) {
                customEventInterstitialListener.onAdClicked();
                this.c.onAdLeftApplication();
            } else if (zfVar == zf.j) {
                customEventInterstitialListener.onAdClosed();
            }
        }
    }

    @Override // defpackage.vcd
    public void onAdResponse(wcd wcdVar) {
        this.d = wcdVar;
        loadAd(this, wcdVar);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        ky1 ky1Var = this.a;
        if (ky1Var != null) {
            ky1Var.a();
            this.a = null;
        }
    }

    @Override // defpackage.l0g, defpackage.pcd
    public void onError(qcd qcdVar) {
        if (this.c != null) {
            int C = wt3.C(qcdVar.a);
            CustomEventInterstitialListener customEventInterstitialListener = this.c;
            if (C == 1) {
                customEventInterstitialListener.onAdFailedToLoad(3);
            } else if (C != 2) {
                customEventInterstitialListener.onAdFailedToLoad(0);
            } else {
                customEventInterstitialListener.onAdFailedToLoad(2);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(Context context, CustomEventInterstitialListener customEventInterstitialListener, String str, MediationAdRequest mediationAdRequest, Bundle bundle) {
        if (!(context instanceof FragmentActivity)) {
            customEventInterstitialListener.onAdFailedToLoad(0);
            return;
        }
        this.b = new WeakReference((FragmentActivity) context);
        this.c = customEventInterstitialListener;
        wcd wcdVar = this.d;
        if (wcdVar != null) {
            loadAd(this, wcdVar);
            return;
        }
        jcd jcdVar = new jcd();
        String str2 = POSITION_DEFAULT;
        if (bundle != null) {
            str2 = bundle.getString("position", POSITION_DEFAULT);
        }
        str2.getClass();
        o6a.G(jcdVar, context, tnf.g(str2), this);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        ky1 ky1Var = this.a;
        if (ky1Var != null) {
            ky1Var.l();
        } else {
            this.c.onAdFailedToLoad(0);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
    }
}
