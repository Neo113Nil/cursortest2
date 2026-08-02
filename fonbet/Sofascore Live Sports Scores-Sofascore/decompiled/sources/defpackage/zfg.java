package defpackage;

import android.content.Context;
import com.equativ.displaysdk.adadapter.SASParallaxBannerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zfg extends sq3 {
    public SASParallaxBannerAdapter r;
    public Context s;
    public nig t;
    public Object u;
    public SASParallaxBannerAdapter v;
    public SASParallaxBannerAdapter w;
    public /* synthetic */ Object x;
    public final /* synthetic */ SASParallaxBannerAdapter y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfg(SASParallaxBannerAdapter sASParallaxBannerAdapter, rq3 rq3Var) {
        super(rq3Var);
        this.y = sASParallaxBannerAdapter;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.loadAd(null, null, null, null, null, null, null, this);
    }
}
