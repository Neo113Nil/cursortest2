package com.adsbynimbus.google;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventBanner;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventListener;
import defpackage.cjb;
import defpackage.fhh;
import defpackage.hcd;
import defpackage.icd;
import defpackage.jcd;
import defpackage.ky1;
import defpackage.mz0;
import defpackage.nf;
import defpackage.o6a;
import defpackage.of;
import defpackage.qcd;
import defpackage.qyf;
import defpackage.rik;
import defpackage.td4;
import defpackage.tm8;
import defpackage.tnf;
import defpackage.ucd;
import defpackage.wcd;
import defpackage.wt3;
import defpackage.zf;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class NimbusCustomEvent implements CustomEventBanner, CustomEventInterstitial, icd, nf {
    public static final fhh REQUEST_MAP = new fhh(0);
    public CustomEventListener a;
    public CustomEventBannerListener b;
    public CustomEventInterstitialListener c;
    public of d;
    public FrameLayout e;
    public Context f;
    public WeakReference g;
    public boolean h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.adsbynimbus.google.NimbusCustomEvent$1, reason: invalid class name */
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

    public static boolean loadAdFromCache(NimbusCustomEvent nimbusCustomEvent, Bundle bundle) {
        hcd hcdVar;
        String string = bundle.getString("na_id");
        if (string == null || (hcdVar = (hcd) DynamicPriceRenderer.getDynamicPriceAdCache().e(string)) == null) {
            return false;
        }
        cjb.a("Loading cached NimbusAd: ".concat(string));
        loadNimbusAd(nimbusCustomEvent, hcdVar);
        return true;
    }

    public static void loadNimbusAd(NimbusCustomEvent nimbusCustomEvent, hcd hcdVar) {
        if (nimbusCustomEvent.h) {
            FrameLayout frameLayout = nimbusCustomEvent.e;
            fhh fhhVar = qyf.a;
            rik.t(hcdVar, frameLayout, nimbusCustomEvent);
            return;
        }
        WeakReference weakReference = nimbusCustomEvent.g;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context == null) {
            context = nimbusCustomEvent.f;
        }
        nimbusCustomEvent.f = null;
        if (context != null) {
            fhh fhhVar2 = qyf.a;
            ky1 u = rik.u(context, hcdVar);
            if (u != null) {
                nimbusCustomEvent.onAdRendered(u);
                return;
            }
        }
        nimbusCustomEvent.a.onAdFailedToLoad(0);
    }

    public static void setRequestForPosition(@NonNull String str, @NonNull ucd ucdVar) {
        REQUEST_MAP.put(str, ucdVar);
    }

    @Override // defpackage.nf
    public void onAdEvent(zf zfVar) {
        CustomEventListener customEventListener = this.a;
        if (customEventListener != null) {
            if (zfVar == zf.b) {
                if (this.h) {
                    return;
                }
                customEventListener.onAdOpened();
            } else if (zfVar == zf.c) {
                customEventListener.onAdClicked();
                this.a.onAdLeftApplication();
            } else if (zfVar == zf.j) {
                customEventListener.onAdClosed();
            }
        }
    }

    @Override // defpackage.pyf
    public void onAdRendered(of ofVar) {
        this.d = ofVar;
        ofVar.d.add(this);
        if (this.h) {
            this.b.onAdLoaded(ofVar.f());
        } else {
            this.c.onAdLoaded();
        }
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.icd, defpackage.vcd
    public void onAdResponse(@NonNull wcd wcdVar) {
        loadNimbusAd(this, wcdVar);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        of ofVar = this.d;
        if (ofVar != null) {
            ofVar.a();
            this.d = null;
        }
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f = null;
        this.a = null;
    }

    @Override // defpackage.icd, defpackage.pcd
    public void onError(qcd qcdVar) {
        if (this.a != null) {
            int C = wt3.C(qcdVar.a);
            CustomEventListener customEventListener = this.a;
            if (C == 1) {
                customEventListener.onAdFailedToLoad(3);
            } else if (C != 2) {
                customEventListener.onAdFailedToLoad(0);
            } else {
                customEventListener.onAdFailedToLoad(2);
            }
            onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBanner
    public void requestBannerAd(@NonNull Context context, @NonNull CustomEventBannerListener customEventBannerListener, String str, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, Bundle bundle) {
        this.h = true;
        this.b = customEventBannerListener;
        this.a = customEventBannerListener;
        this.e = new FrameLayout(context);
        if (bundle == null || !loadAdFromCache(this, bundle)) {
            if (str == null || str.isEmpty()) {
                str = NimbusCustomEventBanner.POSITION_DEFAULT;
            }
            ucd ucdVar = (ucd) REQUEST_MAP.get(str);
            if (ucdVar == null) {
                tm8 mapToFormat = GoogleExtensionsKt.mapToFormat(adSize, context);
                mapToFormat.getClass();
                ucd ucdVar2 = new ucd(str);
                ucdVar2.a.a[0].a = new mz0(mapToFormat.a, mapToFormat.b, (byte) 0, ucd.g, null, 156);
                td4.v0(ucdVar2, 2);
                ucdVar = ucdVar2;
            }
            o6a.G(new jcd(), context, ucdVar, this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(@NonNull Context context, @NonNull CustomEventInterstitialListener customEventInterstitialListener, String str, @NonNull MediationAdRequest mediationAdRequest, Bundle bundle) {
        this.h = false;
        this.c = customEventInterstitialListener;
        this.a = customEventInterstitialListener;
        if (bundle == null || !loadAdFromCache(this, bundle)) {
            if (str == null || str.isEmpty()) {
                str = NimbusCustomEventInterstitial.POSITION_DEFAULT;
            }
            ucd ucdVar = (ucd) REQUEST_MAP.get(str);
            if (ucdVar == null) {
                ucdVar = tnf.g(str);
            }
            this.f = context.getApplicationContext();
            this.g = new WeakReference(context);
            o6a.G(new jcd(), context, ucdVar, this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        of ofVar = this.d;
        if (ofVar != null) {
            ofVar.l();
        } else {
            this.a.onAdFailedToLoad(0);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
    }
}
