package defpackage;

import android.content.Context;
import com.equativ.displaysdk.adadapter.SASDefaultInterstitialAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wcg extends sq3 {
    public SASDefaultInterstitialAdapter r;
    public Object s;
    public SASDefaultInterstitialAdapter t;
    public ct8 u;
    public Context v;
    public /* synthetic */ Object w;
    public final /* synthetic */ SASDefaultInterstitialAdapter x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcg(SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter, rq3 rq3Var) {
        super(rq3Var);
        this.x = sASDefaultInterstitialAdapter;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.loadAd(null, null, null, null, null, null, null, this);
    }
}
