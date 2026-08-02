package defpackage;

import com.equativ.displaysdk.adadapter.SASMediationBannerAdapterWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class peg extends sq3 {
    public SASMediationBannerAdapterWrapper r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SASMediationBannerAdapterWrapper t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peg(SASMediationBannerAdapterWrapper sASMediationBannerAdapterWrapper, rq3 rq3Var) {
        super(rq3Var);
        this.t = sASMediationBannerAdapterWrapper;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.loadAd(null, null, null, null, null, null, null, this);
    }
}
