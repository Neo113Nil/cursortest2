package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴮ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0813 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2614;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityInitError f2615;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Set f2616;

    public C0813(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        this.f2616 = set;
        this.f2615 = iSAdQualityInitError;
        this.f2614 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        for (ISAdQualityInitListener iSAdQualityInitListener : this.f2616) {
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitFailed(this.f2615, this.f2614);
            }
        }
        this.f2616.clear();
    }
}
