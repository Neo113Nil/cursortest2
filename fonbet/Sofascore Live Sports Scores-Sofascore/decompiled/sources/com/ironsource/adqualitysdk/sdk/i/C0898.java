package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẍ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0898 extends AbstractRunnableC0606 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0808 f3011;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3012;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ Application f3013;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f3014;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f3015;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityConfig f3016;

    public C0898(C0808 c0808, ISAdQualityConfig iSAdQualityConfig, String str, String str2, Application application, Activity activity) {
        this.f3011 = c0808;
        this.f3016 = iSAdQualityConfig;
        this.f3015 = str;
        this.f3014 = str2;
        this.f3013 = application;
        this.f3012 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        try {
            String userId = this.f3016.getUserId();
            C0808 c0808 = this.f3011;
            ISAdQualityLogLevel logLevel = this.f3016.getLogLevel();
            synchronized (c0808) {
                c0808.f2596 = logLevel;
            }
            this.f3011.m483();
            boolean isEmpty = TextUtils.isEmpty(this.f3015);
            if (isEmpty) {
                String decrypt = StringFog.decrypt("4kfBuefYJKzacNSH\n", "oyOQzIa0Tdg=\n");
                AbstractC0420.m253(decrypt, decrypt, StringFog.decrypt("wY43AARauv7yiTATTUy/4+DAORUAXvb+7MA=\n", "iOBedG071pc=\n") + this.f3014, true);
            } else {
                String decrypt2 = StringFog.decrypt("iXV+t5qDNNqxQmuJ\n", "yBEvwvvvXa4=\n");
                AbstractC0420.m253(decrypt2, decrypt2, StringFog.decrypt("PsimQxKKZCsNz6FQW5xhNh+GrkcLy2MnDoY=\n", "d6bPN3vrCEI=\n") + this.f3015, true);
            }
            C0656.m396(this.f3013.getApplicationContext()).m399();
            C0808.m481(this.f3011, this.f3016.isTestMode());
            if (this.f3016.isTestMode()) {
                AbstractC0420.m245(StringFog.decrypt("l2ycBkMG1EyvW4k4\n", "1gjNcyJqvTg=\n"), StringFog.decrypt("413Vqfeob3OVPaej0cZGPcA84IieikEk0TzwjsqOCCbRb/Oq0YJNb8Bu8oKfxwly8WriicqVCCXd\naO/HyoNbJvlz44KDklon0TzwjtKKCDDRPOOOzYVJINB548afxw==\n", "tByH577mKFI=\n"));
            }
            try {
                Class.forName(StringFog.decrypt("jbyR2C2v8DmDodvrMb/6dLizhsE=\n", "7NL1qkLGlBc=\n"));
            } catch (Throwable unused) {
            }
            Activity activity = this.f3012;
            if (activity != null) {
                AbstractC0416.m239(activity);
            } else {
                Application application = this.f3013;
                String str = AbstractC0416.f1206;
                if (application != null) {
                    AbstractC0416.m240(application.getApplicationContext());
                }
            }
            C0808 c08082 = this.f3011;
            if (isEmpty) {
                C0808.m479(c08082).f3118 = this.f3014;
            } else {
                C0808.m479(c08082).f3119 = this.f3015;
            }
            C0808.m479(this.f3011).f3115 = this.f3016.getInitializationSource();
            C0808.m479(this.f3011).f3114 = this.f3016.getCoppa();
            C0808.m479(this.f3011).f3113 = this.f3016.getDeviceIdType();
            if (this.f3016.getMetaData() != null) {
                C0931 m479 = C0808.m479(this.f3011);
                Map<String, String> metaData = this.f3016.getMetaData();
                m479.f3112.clear();
                if (metaData != null) {
                    m479.f3112.putAll(metaData);
                }
                if (this.f3016.getMetaData().containsKey(StringFog.decrypt("yK33VfGuTHLOpfxI8alGatii\n", "vcyTJq7dKQE=\n"))) {
                    C0808.m479(this.f3011).f3110 = this.f3016.getMetaData().get(StringFog.decrypt("FqwW0ydxM7QQpB3OJ3Y5rAaj\n", "Y81yoHgCVsc=\n"));
                }
            }
            Context applicationContext = this.f3013.getApplicationContext();
            this.f3011.f2595 = applicationContext;
            C0750.f2474.m418(applicationContext, !isEmpty ? this.f3015 : this.f3014);
            this.f3011.f2591 = new C0392(applicationContext);
            C0808 c08083 = this.f3011;
            c08083.f2589 = new C0358(applicationContext, c08083.f2594.f2780, "B0r1sW@sH3re");
            AbstractC0274 m142 = AbstractC0274.m142();
            C0808 c08084 = this.f3011;
            m142.mo156(applicationContext, c08084.f2591, c08084.f2594, new C1053(this), C0808.m474(c08084));
            C0808 c08085 = this.f3011;
            C0808 c08086 = this.f3011;
            c08085.f2588 = new C0643(applicationContext, c08086.f2591, c08086.f2594.f2781);
            String m377 = AbstractC0598.m377(applicationContext);
            AbstractC0274 m1422 = AbstractC0274.m142();
            C1051 c1051 = new C1051(this, m377);
            C0346 c0346 = (C0346) m1422;
            Handler handler = c0346.f860;
            if (handler != null) {
                handler.post(new C0357(c0346, c1051));
            }
            AbstractC0274 m1423 = AbstractC0274.m142();
            C1024 c1024 = new C1024(this);
            C0346 c03462 = (C0346) m1423;
            Handler handler2 = c03462.f860;
            if (handler2 != null) {
                handler2.post(new C0360(c03462, c1024));
            }
            C0808.m480(this.f3011, applicationContext);
            this.f3011.f2590 = new C0926(applicationContext, C0808.m479(this.f3011), this.f3011.f2594, this.f3012 != null, m377, new C1000(this));
            if (!this.f3016.isUserIdSet()) {
                C0808.m479(this.f3011).f3111 = true;
                C0358 c0358 = new C0358(this.f3011.f2590.f3096, C0926.f3088, C0926.f3087);
                String str2 = C0926.f3085;
                String m208 = c0358.m208(str2);
                if (TextUtils.isEmpty(m208)) {
                    m208 = UUID.randomUUID().toString();
                    c0358.m209(str2, m208);
                }
                userId = m208;
            }
            if (this.f3011.m487()) {
                this.f3011.f2590.m555(new C0999(this));
            }
            this.f3011.f2590.m554(new C0985(this));
            C0527 c0527 = new C0527();
            C0808 c08087 = this.f3011;
            C0808 c08088 = this.f3011;
            c08087.f2593 = new C0558(c08088.f2588, c08088.f2590, m377, c0527, new C0972(this));
            C0808 c08089 = this.f3011;
            c08089.f2593.f1829.f551 = new C0971(this);
            c08089.f2586 = new C0439(this.f3011.f2593);
            C0808 c080810 = this.f3011;
            c080810.f2585 = new C0748(c080810.f2590);
            AbstractC0420.m250(StringFog.decrypt("K/69ASZ05qcTyag/\n", "aprsdEcYj9M=\n"), StringFog.decrypt("jKsdyv1t80msjCX96FOyVrGZLtrFdvUFo5cujtlq/h/l\n", "xfhcrqwYkiU=\n") + this.f3011.f2594.f2783);
            C0808 c080811 = this.f3011;
            Activity activity2 = this.f3012;
            c080811.m492(activity2 != null ? activity2 : applicationContext, userId, true, false, true);
            C0808.m478(this.f3011, applicationContext);
            C0808.m477(this.f3011);
            C0808.m475(this.f3011);
        } catch (Throwable th) {
            String decrypt3 = StringFog.decrypt("AzJGoiHxGv0vNF2sP7gJ+ignFIQAkBfCMyFYpCeoU8ACCw==\n", "RkA0zVPRc5M=\n");
            AbstractC0356.m205(StringFog.decrypt("HV7h26z90PklafTl\n", "XDqwrs2RuY0=\n"), decrypt3, th, true, false, true);
            C0808.m482(this.f3011.f2587, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt3);
        }
    }
}
