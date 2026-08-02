package defpackage;

import com.equativ.displaysdk.adadapter.SASDefaultNativeAdAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zcg extends sq3 {
    public Object r;
    public SASDefaultNativeAdAdapter s;
    public SASDefaultNativeAdAdapter t;
    public /* synthetic */ Object u;
    public final /* synthetic */ SASDefaultNativeAdAdapter v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcg(SASDefaultNativeAdAdapter sASDefaultNativeAdAdapter, rq3 rq3Var) {
        super(rq3Var);
        this.v = sASDefaultNativeAdAdapter;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.loadAd(null, null, null, null, null, null, null, this);
    }
}
