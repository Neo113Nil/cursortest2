package com.adsbynimbus.google;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventBanner;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import defpackage.ad2;
import defpackage.h10;
import defpackage.hs4;
import defpackage.icd;
import defpackage.jcd;
import defpackage.mz0;
import defpackage.nf;
import defpackage.oc3;
import defpackage.of;
import defpackage.qcd;
import defpackage.rob;
import defpackage.td4;
import defpackage.ucd;
import defpackage.wcd;
import defpackage.wt3;
import defpackage.xw3;
import defpackage.z45;
import defpackage.zf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes.dex */
public class NimbusCustomEventBanner implements CustomEventBanner, icd, nf {
    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_SCREEN_POSITION = "screen_position";
    public static final String POSITION_DEFAULT = "GAM Banner";
    public of a;
    public CustomEventBannerListener b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.adsbynimbus.google.NimbusCustomEventBanner$1, reason: invalid class name */
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

    @NonNull
    public static Bundle newRequestParameters(@NonNull String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("position", str);
        bundle.putInt(EXTRA_SCREEN_POSITION, i);
        return bundle;
    }

    @Override // defpackage.nf
    public void onAdEvent(zf zfVar) {
        CustomEventBannerListener customEventBannerListener = this.b;
        if (customEventBannerListener == null || zfVar != zf.c) {
            return;
        }
        customEventBannerListener.onAdClicked();
        this.b.onAdLeftApplication();
    }

    @Override // defpackage.pyf
    public void onAdRendered(of ofVar) {
        this.a = ofVar;
        ofVar.d.add(this);
        this.b.onAdLoaded(this.a.f());
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        of ofVar = this.a;
        if (ofVar != null) {
            ofVar.a();
        }
    }

    @Override // defpackage.icd, defpackage.pcd
    public void onError(qcd qcdVar) {
        if (this.b != null) {
            int C = wt3.C(qcdVar.a);
            CustomEventBannerListener customEventBannerListener = this.b;
            if (C == 1) {
                customEventBannerListener.onAdFailedToLoad(3);
            } else if (C != 2) {
                customEventBannerListener.onAdFailedToLoad(0);
            } else {
                customEventBannerListener.onAdFailedToLoad(2);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
        this.a.m();
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
        this.a.l();
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBanner
    public void requestBannerAd(Context context, CustomEventBannerListener customEventBannerListener, String str, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle) {
        byte byteValue;
        this.b = customEventBannerListener;
        try {
            jcd jcdVar = new jcd();
            FrameLayout frameLayout = new FrameLayout(context);
            String str2 = POSITION_DEFAULT;
            if (bundle == null) {
                byteValue = 0;
            } else {
                str2 = bundle.getString("position", POSITION_DEFAULT);
                byteValue = bundle.getByte(EXTRA_SCREEN_POSITION, (byte) 0).byteValue();
            }
            int width = adSize.getWidth();
            int height = adSize.getHeight();
            str2.getClass();
            ucd ucdVar = new ucd(str2);
            ucdVar.a.a[0].a = new mz0(width, height, byteValue, ucd.g, null, 156);
            td4.v0(ucdVar, 2);
            ad2 ad2Var = oc3.a;
            hs4 hs4Var = z45.a;
            xw3.L(ad2Var, rob.a, null, new h10(ucdVar, jcdVar, frameLayout, this, null, 15), 2);
        } catch (Exception unused) {
            customEventBannerListener.onAdFailedToLoad(1);
        }
    }

    @Override // defpackage.icd, defpackage.vcd
    public void onAdResponse(@NonNull wcd wcdVar) {
    }
}
