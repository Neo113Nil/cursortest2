package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.ceo;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0808 extends IronSourceAdQuality {

    /* renamed from: 丫, reason: contains not printable characters */
    public static C0808 f2582;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public C0748 f2585;

    /* renamed from: טּ, reason: contains not printable characters */
    public C0439 f2586;

    /* renamed from: ףּ, reason: contains not printable characters */
    public C0643 f2588;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public C0358 f2589;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C0926 f2590;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public C0392 f2591;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public ISAdQualityAdListener f2592;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public C0558 f2593;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public Context f2595;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public ISAdQualityConfig f2602;

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2584 = StringFog.decrypt("QUNQxxIatOV5dEX5\n", "ACcBsnN23ZE=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2583 = StringFog.decrypt("3mm3E/zM\n", "rQbYfpCtiIo=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0931 f2603 = new C0931();

    /* renamed from: ｋ, reason: contains not printable characters */
    public boolean f2601 = false;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public boolean f2600 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public boolean f2599 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public boolean f2598 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f2597 = false;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public ISAdQualityLogLevel f2596 = ISAdQualityLogLevel.INFO;

    /* renamed from: סּ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f2587 = new CopyOnWriteArraySet();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final C0841 f2594 = new C0841();

    static {
        StringFog.decrypt("FhI6hNTYl14XAS3Ez8WzQAMhKY/O38g=\n", "c2Rf6qCr8jA=\n");
        f2582 = null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m474(C0808 c0808) {
        boolean z;
        synchronized (c0808) {
            z = c0808.f2598;
        }
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m475(C0808 c0808) {
        synchronized (c0808) {
            c0808.f2600 = false;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m478(C0808 c0808, Context context) {
        c0808.getClass();
        try {
            context.registerReceiver(new C0843(), new IntentFilter(StringFog.decrypt("NNKNUgFgiLY80p1FAH3C+TbIgE8AJ67ZAeiscjdWr9AU8q5lKg==\n", "VbzpIG4J7Jg=\n")), null, AbstractC1008.f3251);
        } catch (Throwable th) {
            String str = f2584;
            AbstractC0420.m252(str, str, StringFog.decrypt("eMpSVLf2LDxRi0ldtft/PFvZG1qz5ngtTNIbSrfxaSFIzkk=\n", "Pqs7ONKSDEg=\n"), th, null, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void changeUserId(String str) {
        String str2;
        Exception exc;
        C0931 c0931;
        try {
            if (m494(str)) {
                synchronized (this) {
                    try {
                        c0931 = this.f2603;
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        AbstractC0356.m205(f2584, ceo.e("W7TOnyE1mrNqstWeNDWcpXu09ZRz\n", "Hsa88FMV6dY=\n", str2), exc, true, false, true);
                        return;
                    }
                }
                boolean equals = str.equals(c0931.m560());
                boolean z = !equals;
                boolean mo263 = AbstractC0430.m262().mo263();
                if (!equals && mo263) {
                    try {
                        C0926 c0926 = this.f2590;
                        c0926.getClass();
                        AbstractC1008.m611(new C1003(c0926));
                    } catch (Exception e2) {
                        exc = e2;
                        str2 = str;
                        AbstractC0356.m205(f2584, ceo.e("W7TOnyE1mrNqstWeNDWcpXu09ZRz\n", "Hsa88FMV6dY=\n", str2), exc, true, false, true);
                        return;
                    }
                }
                m492(this.f2595, str, z, true, mo263);
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (context instanceof Application) {
            m491((Application) context, (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m491((Application) context.getApplicationContext(), (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m491(activity.getApplication(), activity, str, (String) null, iSAdQualityConfig);
        } else {
            String decrypt = StringFog.decrypt("DG1y/7gtonMsSkrIrRPtditXR/KINKplIB5Q9IcspmcxHlLpjniuajZKE/mMeKx5ZUpK64x4gnwx\nV0XynSHsXjVOX/KKObd2KlA=\n", "RT4zm+lYwx8=\n");
            AbstractC0420.m245(f2584, decrypt);
            m482(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (context instanceof Application) {
            m491((Application) context, (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m491((Application) context.getApplicationContext(), (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m491(activity.getApplication(), activity, (String) null, str2, iSAdQualityConfig);
        } else {
            String decrypt = StringFog.decrypt("z7AzmKGLE7vvlwuvtLVcvuiKBpWRkhut48MRk56KF6/ywxOOl94fovWXUp6V3h2xppcLjJXeM7Ty\nigSVhIddlvaTHpWTnwa+6Y0=\n", "huNy/PD+ctc=\n");
            AbstractC0420.m245(f2584, decrypt);
            m482(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        boolean z;
        synchronized (this) {
            z = this.f2599;
        }
        if (z) {
            AbstractC0420.m245(f2584, StringFog.decrypt("FaxM13g+TTI4qQKTeW1KODvtT5Vod18jP6JM0H57SDI4uEfQIT53BBepc4VtclcjL+1xtEc+STYl\n7VGYeWpaOCGjDA==\n", "Vs0i8AwePlc=\n"));
            return;
        }
        if (!m486()) {
            AbstractC0420.m245(f2584, StringFog.decrypt("yH3ERqdYpHPleIoCpgujeeY8xwS3EbZi4nPEQaEdoXPlac9B/lieRcp4+xSyFL5i8jz5JZhYvmWr\ncsUV8xG5f/91yw26ArJypQ==\n", "ixyqYdN41xY=\n"));
            return;
        }
        this.f2586.getClass();
        if (iSAdQualityCustomMediationRevenue != null && iSAdQualityCustomMediationRevenue.getMediationNetwork() == ISAdQualityMediationNetwork.LEVEL_PLAY && iSAdQualityCustomMediationRevenue.getCustomData() != null && iSAdQualityCustomMediationRevenue.getCustomData().length() > 0) {
            C0439 c0439 = this.f2586;
            c0439.getClass();
            AbstractC1008.m614(new C0448(c0439, iSAdQualityCustomMediationRevenue));
            return;
        }
        C0439 c04392 = this.f2586;
        c04392.getClass();
        if (iSAdQualityCustomMediationRevenue != null) {
            if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
                AbstractC0420.m245(C0439.f1247, StringFog.decrypt("Vrho6SK+HIJ7vSatI+0biHj5a6sy9w6TfLZo7iT7GYJ7rGP0duwKkXC3c6t27QeIYLVi7jT7T4l6\ntyugM/kOk3yvYw==\n", "FdkGzlaeb+c=\n"));
                return;
            }
            ISAdQualityMediationNetwork mediationNetwork = iSAdQualityCustomMediationRevenue.getMediationNetwork();
            if (mediationNetwork == null || TextUtils.isEmpty(C0439.m271(mediationNetwork))) {
                AbstractC0420.m245(C0439.f1247, StringFog.decrypt("5kEKy0J1hmTLRESPQyaBbsgACYlSPJR1zE8KzEQwg2TLVQHWFjicctZJCosWOJBlzEEQhVk71W/A\nVBODRD4=\n", "pSBk7DZV9QE=\n"));
                return;
            }
            ISAdQualityAdType adType = iSAdQualityCustomMediationRevenue.getAdType();
            if (adType != ISAdQualityAdType.INTERSTITIAL && adType != ISAdQualityAdType.VIDEO && adType != ISAdQualityAdType.REWARDED_VIDEO && adType != ISAdQualityAdType.REWARDED && (iSAdQualityCustomMediationRevenue.getMediationNetwork() != ISAdQualityMediationNetwork.LEVEL_PLAY || iSAdQualityCustomMediationRevenue.getCustomData() == null || iSAdQualityCustomMediationRevenue.getCustomData().length() <= 0)) {
                AbstractC0420.m245(C0439.f1247, StringFog.decrypt("y9lrWv07v+bm3CUe/Gi47OWYaBjtcq334ddrXft+uubmzWBHqWi58/jXdwnsf+zi7JhxBPl+v6Pp\nymBd4HW45vrLcRT9cq3vpJhzFO1+o6+oymAK6Gmo5uyYcxTtfqOj6dZhXft+u+L63GAZ\n", "iLgFfYkbzIM=\n"));
                return;
            }
            C0461 c0461 = new C0461(c04392, iSAdQualityCustomMediationRevenue);
            C1037 c1037 = ((C0346) AbstractC0274.m142()).f3205;
            int i = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            if (c1037 != null) {
                i = c1037.f3308.optInt(StringFog.decrypt("voaw5A==\n", "3evCgFbojOg=\n"), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
            }
            AbstractC1008.m615(c0461, i);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        boolean z;
        synchronized (this) {
            z = this.f2599;
        }
        if (z) {
            AbstractC0420.m245(f2584, StringFog.decrypt("Q4HeERavitR0wNFSQuOQwnSF3lMQr9SRSbPxUjP6mN1plMkWMcuykXeBwxYR54zFZI/HWEw=\n", "AOCwNmKP+bE=\n"));
        } else {
            this.f2592 = iSAdQualityAdListener;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        boolean z;
        synchronized (this) {
            z = this.f2599;
        }
        if (z) {
            AbstractC0420.m245(f2584, StringFog.decrypt("tsplgZrVNz6Bi2jJgJMtPNWGK++9tCAKgMpnz5qMZAix4CvRj4ZkKJ3ef8KBgip1\n", "9asLpu71RFs=\n"));
        } else if (m488()) {
            AbstractC0420.m245(f2584, StringFog.decrypt("LCsjT5G12Dwbai4Hi/PCPk9nbSG21M8IGishAZHsiworAW0BlrXKNR0vLAyctcI3Bj4kCYn80TwL\nZA==\n", "b0pNaOWVq1k=\n"));
        } else {
            this.f2602 = iSAdQualityConfig;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setMetaData(String str, String str2) {
        boolean z;
        try {
            synchronized (this) {
                z = this.f2599;
            }
            if (z) {
                AbstractC0420.m245(f2584, StringFog.decrypt("VKd8rLeNo0Jj5n/ut8zwQ3ayc6vujZl0VqJD/qLBuVNu5kHPiI2nRmTmYeO22bRIYKg8\n", "F8YSi8Ot0Cc=\n"));
                return;
            }
            if (!m486()) {
                AbstractC0420.m245(f2584, StringFog.decrypt("rzryTkr0HbHWPOkHU+gPqZ8v4k5u0i+hpyDmAk71F+WlEcxOReQIqoQwpw1G7QKsmDKnSVTkGoiT\nIeYqRvUP4g==\n", "9lWHbieBbsU=\n"));
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (!AbstractC0428.f1222.contains(str)) {
                    if (AbstractC0428.m261(m489().f3112, str)) {
                        AbstractC0420.m245(f2584, StringFog.decrypt("fYUhs/2jhLJvlDTWuA==\n", "DuBV/pjX5fY=\n") + str + StringFog.decrypt("NUDVW8LBAlZ2GJADjoRPF3kFmA7EwQIXYQPV\n", "FWz1Z7CkZjc=\n") + 5 + StringFog.decrypt("dbSNz/zLU7YhuMjN/IdCsib3yPL6hVilPLePm/COQ7Z1vYnP/MtBtjmsjZU=\n", "Vdnou53rN9c=\n"));
                        return;
                    }
                    if (!AbstractC1067.m638(str, 64) || !AbstractC1067.m638(str2, 64)) {
                        AbstractC0420.m245(f2584, StringFog.decrypt("36oPoYRLQhzNuxrEwQ==\n", "rM977OE/I1g=\n") + str + StringFog.decrypt("cG2r3y7v5dUzNe6HYqqolCQp7sMw7+/TJCmrjDqq49skKauXNO+h3zU4q4Iy7qHAOCSrlT3m9NFw\nMuOMKebllDIkq4E5/vbRNS+r\n", "UEGL41yKgbQ=\n") + 1 + StringFog.decrypt("DD3yuYg=\n", "LFyc3aippE4=\n") + 64 + StringFog.decrypt("yPFLxvf5GU2N4FCJ\n", "6JIjp4WYejk=\n"));
                        return;
                    }
                }
                C0931 m489 = m489();
                if (str == null) {
                    m489.getClass();
                } else if (str2 == null) {
                    m489.f3112.remove(str);
                } else {
                    m489.f3112.put(str, str2);
                }
                if (StringFog.decrypt("wU7YgDHex/rHRtOdMdnN4tFB\n", "tC+8826took=\n").equals(str)) {
                    m489().f3110 = str2;
                }
            }
        } catch (Exception e) {
            AbstractC0356.m205(f2584, ceo.e("3NoLjzsphNjt3BCOLima2O3JWYQofZad\n", "mah54EkJ970=\n", str), e, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setSegment(ISAdQualitySegment iSAdQualitySegment) {
        boolean z;
        synchronized (this) {
            z = this.f2599;
        }
        if (z) {
            AbstractC0420.m245(f2584, StringFog.decrypt("MDYaNpPpwE0Hdwd0gKTWRgd3WTGumvJMIiIVfY69ygggEz8xkKjACAA/AWWDpsRGXQ==\n", "c1d0EefJsyg=\n"));
        } else {
            AbstractC1008.m614(new C0826(this, iSAdQualitySegment));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setUserConsent(boolean z) {
        C0931 c0931;
        synchronized (this) {
            c0931 = this.f2603;
        }
        c0931.f3116 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final synchronized void shutdown() {
        m493(false);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized void m483() {
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m484() {
        if (m485()) {
            AbstractC0420.m245(f2584, StringFog.decrypt("UgLq0rUp+S9lQ+2btWz4JHAPpIGkev5qfAzgkOEkqgNCIuCktGjmI2UapKaFQqo9cBCkhql8/i5+\nFOrb\n", "EWOE9cEJiko=\n"));
        } else if (m486()) {
            AbstractC0420.m245(f2584, StringFog.decrypt("egRjlEWjZz0XGH6UAKJsKFtRZIUWpCIkWBV1wAe1ZCZFFDCJC7l2IFYdeZoMvmVo\n", "N3EQ4GXQAkk=\n"));
        } else {
            this.f2597 = true;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized boolean m485() {
        return this.f2599;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized boolean m486() {
        return this.f2601;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m487() {
        return this.f2597;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:93:0x0124
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m491(android.app.Application r11, android.app.Activity r12, java.lang.String r13, java.lang.String r14, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.C0808.m491(android.app.Application, android.app.Activity, java.lang.String, java.lang.String, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig):void");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m488() {
        return this.f2600;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized C0931 m489() {
        return this.f2603;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m477(C0808 c0808) {
        synchronized (c0808) {
            c0808.f2601 = true;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C0808 m476() {
        C0808 c0808;
        synchronized (C0808.class) {
            try {
                c0808 = f2582;
                if (c0808 == null) {
                    c0808 = new C0808();
                    f2582 = c0808;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0808;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str) {
        initializeWithGameId(context, str, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0931 m479(C0808 c0808) {
        C0931 c0931;
        synchronized (c0808) {
            c0931 = c0808.f2603;
        }
        return c0931;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m481(C0808 c0808, boolean z) {
        synchronized (c0808) {
            c0808.f2598 = z;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m493(boolean z) {
        String str;
        String str2;
        C0909 c0909;
        try {
        } catch (Exception e) {
            AbstractC0356.m205(f2584, StringFog.decrypt("A3Yp7/dmRl0zcC/p6yEVUSlzNQ==\n", "RgRbgIVGNTU=\n"), e, true, false, true);
        }
        if (m485()) {
            AbstractC0420.m245(f2584, StringFog.decrypt("mP+Hj+yfROy42L+4+aEF97Df5orRmEDhtdXmmNWfUeS+26jF\n", "0azG673qJYA=\n"));
            return;
        }
        if (!m486()) {
            AbstractC0420.m245(f2584, StringFog.decrypt("bEsIK6t/lKdMbDAcvkHVvERraSGffJC5BXEnJo5jlKdMYiwr2ifVpUo4JyqfbtW/Sjg6J49+kaRS\ndmc=\n", "JRhJT/oK9cs=\n"));
            return;
        }
        String decrypt = StringFog.decrypt("Oxv0nvmiWHwbPMza+5NyMAUpxtrbv0xkFifClA==\n", "cki1+qjXORA=\n");
        if (z) {
            decrypt = decrypt + StringFog.decrypt("g3eJpHUphWLyZJqncX29JtN9mr9+ZrZr\n", "oxH7yxgJxAY=\n");
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "qxiab0zP\n";
            str2 = "2H3oGSm9pPk=\n";
        } else {
            str = "67Nv\n";
            str2 = "mNcER9/Mmtw=\n";
        }
        try {
            jSONObject.put(StringFog.decrypt("pA==\n", "10nEh6EOW+0=\n"), StringFog.decrypt(str, str2));
        } catch (JSONException unused) {
        }
        this.f2590.m556(StringFog.decrypt("9sWK2hc=\n", "grXVrmS4px8=\n"), jSONObject);
        AbstractC0274 m142 = AbstractC0274.m142();
        String str3 = f2583;
        C0346 c0346 = (C0346) m142;
        if (str3 != null) {
            c0909 = (C0909) c0346.mo152().get(str3);
        } else {
            c0346.getClass();
            c0909 = null;
        }
        String str4 = c0909 != null ? c0909.f3039 : null;
        if (!TextUtils.isEmpty(str4)) {
            decrypt = decrypt + StringFog.decrypt("l9+9R/NNzTrW27tdoU0=\n", "t6jUM5ttv18=\n") + str4;
        }
        AbstractC0420.m250(f2584, decrypt);
        m482(this.f2587, ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, decrypt);
        this.f2599 = true;
        AbstractC0274.m142().mo144();
        C0656.m396(this.f2595).m398();
        this.f2593.m364();
        C0392 c0392 = this.f2591;
        C0331 c0331 = c0392.f1142;
        c0331.f814.unregisterReceiver(c0331);
        c0392.f1141 = true;
        this.f2590.m545();
        C0750.f2474.m417();
        C0267.m138();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m494(String str) {
        boolean z;
        synchronized (this) {
            z = this.f2599;
        }
        if (z) {
            AbstractC0420.m245(f2584, StringFog.decrypt("dQdaNZdmw/VXCFN3wzPT+ERGXXbDa4DUZSdQQ5YnzPRCHxRBpw2A6lcVFGGLM9T5WRFaPA==\n", "NmY0EuNGoJ0=\n"));
            return false;
        }
        if (!m486()) {
            AbstractC0420.m245(f2584, StringFog.decrypt("UGEV+ibJyrApZw6zP9XYqGB0BfoC7/igWHsBtiLIwORaSiv6Kdnfq3trQLkq0NWtZ2lA/SjU2Kpu\nazWpLs7woC4=\n", "CQ5g2ku8ucQ=\n"));
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        AbstractC0420.m245(f2584, StringFog.decrypt("q5/HIcXmRqPFk9Qh0/RN9pHa0mSQ+1a9idrfc5DwTqGRgw==\n", "5fqwAbCVI9E=\n"));
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m492(Context context, String str, boolean z, boolean z2, boolean z3) {
        C0931 c0931;
        synchronized (this) {
            c0931 = this.f2603;
        }
        String m560 = c0931.m560();
        m489().m561(str);
        if (str == null) {
            AbstractC0420.m245(f2584, StringFog.decrypt("+ULMCmjDznzPdexlc6bOYM8w8DBWjsAp7Hz7JEmHzmTde/tlSZecbJxk8WVKg516nHG+M1uOh22c\nfvErF4ybZdAw6zZfkM5A+DDqKhqrvUjYQeskVouacJxD2g4U\n", "vBCeRTri7gk=\n"));
        } else if (str.equals(StringFog.decrypt("D6+ANPWeSP1DuJY1sIBH9Bo=\n", "bsH5QJ33Jpo=\n"))) {
            String str2 = f2584;
            StringBuilder m642 = AbstractC1072.m642("dIPnvgKJGSRepJKDNYhMDli/0tEkwFxdVbTTkCXETV1EotCDcOF9XQ==\n", "MdG18VCoOX0=\n", new StringBuilder(), str);
            m642.append(StringFog.decrypt("W5zejH42AWFV0e+LfncBcQfZrpR0dwJlBs+ugTsiHG0EyevAbiQXdlX1ysB9OAAkEN3tiDsiAWEH\nnPqPOx4hRRHt+4F3PgZ9Ve/KqzU=\n", "dbyO4BtXcgQ=\n"));
            AbstractC0420.m245(str2, m642.toString());
        } else {
            String str3 = f2584;
            AbstractC0420.m253(str3, str3, ceo.e("8ii7/9X1GRvPFrvsmdU+I4sUisbVyTk/2WeHydXVOWCL\n", "q0fOjfW8Slo=\n", str), true);
        }
        AbstractC0274 m142 = AbstractC0274.m142();
        C0846 c0846 = new C0846(this, z, context, z2, m560, z3);
        C0346 c0346 = (C0346) m142;
        Handler handler = c0346.f860;
        if (handler != null) {
            handler.post(new C0382(c0346, c0846));
        }
        JSONObject m490 = m490();
        if (m490 != null) {
            AbstractC0274 m1422 = AbstractC0274.m142();
            C0931 m489 = m489();
            C0346 c03462 = (C0346) m1422;
            c03462.f845 = 0L;
            c03462.f844 = m489;
            c03462.mo199(m490);
            c03462.m198();
            c03462.m194();
            return;
        }
        AbstractC0274.m142().mo157(context, m489(), true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m490() {
        C0931 c0931;
        synchronized (this) {
            c0931 = this.f2603;
        }
        ConcurrentHashMap concurrentHashMap = c0931.f3112;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(StringFog.decrypt("jIBdpm3HxX2yhkCWZg==\n", "7eQs+QSprAk=\n"))) {
            return null;
        }
        try {
            return new JSONObject((String) concurrentHashMap.get(StringFog.decrypt("pVuW1cO1P4SbXYvlyA==\n", "xD/niqrbVvA=\n")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m480(C0808 c0808, Context context) {
        String m208 = c0808.f2589.m208(StringFog.decrypt("AgEyU5POrB0iCw==\n", "a29GfeCr324=\n"));
        if (TextUtils.isEmpty(m208)) {
            return;
        }
        String decrypt = StringFog.decrypt("WDz6bpVehEFHYPB73liHDE0g+mGJSIxBXw==\n", "LE6bDfA85SI=\n");
        String decrypt2 = StringFog.decrypt("c6UVFdgTSJ1lqQgdwF9Rj26rFgHAGwad\n", "AMp6eLRyZe4=\n");
        Context applicationContext = context.getApplicationContext();
        C0710 c0710 = new C0710(applicationContext, decrypt);
        C0733 c0733 = new C0733(AbstractC0714.f2419, applicationContext.getPackageName(), AbstractC0707.m406(applicationContext), decrypt2);
        try {
            c0710.m410(StringFog.decrypt("1HxWYrrXX+D0dg==\n", "vRIiTMmyLJM=\n"), c0733.m415(m208));
        } catch (Throwable unused) {
        }
        c0808.f2589.m207(StringFog.decrypt("FEqon3FKGYY0QA==\n", "fSTcsQIvavU=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m482(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        if (set == null) {
            return;
        }
        AbstractC1008.m610(new C0813(set, iSAdQualityInitError, str));
    }
}
