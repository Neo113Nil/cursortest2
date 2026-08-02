package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jo4 extends wtc implements ga5 {
    public final wzc o;
    public boolean p;
    public boolean q;
    public boolean r;

    public jo4(wzc wzcVar) {
        this.o = wzcVar;
    }

    @Override // defpackage.wtc
    public final void c1() {
        xw3.L(Y0(), null, null, new q3(this, null, 19), 3);
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        ymaVar.a();
        wj2 wj2Var = ymaVar.a;
        if (this.p) {
            ha5.o0(ymaVar, r13.c(r13.b, 0.3f), 0L, wj2Var.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        } else if (this.q || this.r) {
            ha5.o0(ymaVar, r13.c(r13.b, 0.1f), 0L, wj2Var.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
    }
}
