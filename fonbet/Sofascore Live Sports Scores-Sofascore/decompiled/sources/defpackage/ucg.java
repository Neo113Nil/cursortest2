package defpackage;

import com.equativ.displaysdk.adadapter.SASDefaultBannerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ucg extends sq3 {
    public SASDefaultBannerAdapter r;
    public Object s;
    public SASDefaultBannerAdapter t;
    public /* synthetic */ Object u;
    public final /* synthetic */ SASDefaultBannerAdapter v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucg(SASDefaultBannerAdapter sASDefaultBannerAdapter, rq3 rq3Var) {
        super(rq3Var);
        this.v = sASDefaultBannerAdapter;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.loadAd(null, null, null, null, null, null, null, this);
    }
}
