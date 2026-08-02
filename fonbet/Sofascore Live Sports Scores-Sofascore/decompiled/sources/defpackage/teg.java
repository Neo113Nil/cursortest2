package defpackage;

import com.equativ.displaysdk.adadapter.SASMediationInterstitialAdapterWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class teg extends sq3 {
    public SASMediationInterstitialAdapterWrapper r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SASMediationInterstitialAdapterWrapper t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teg(SASMediationInterstitialAdapterWrapper sASMediationInterstitialAdapterWrapper, rq3 rq3Var) {
        super(rq3Var);
        this.t = sASMediationInterstitialAdapterWrapper;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.loadAd(null, null, null, null, null, null, null, this);
    }
}
