package defpackage;

import com.blaze.ima.ImaHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oqm extends sq3 {
    public ImaHandler r;
    public hr9 s;
    public bh t;
    public chh u;
    public hr4 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ImaHandler x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqm(ImaHandler imaHandler, rq3 rq3Var) {
        super(rq3Var);
        this.x = imaHandler;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object createAdsMediaSource;
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        createAdsMediaSource = this.x.createAdsMediaSource(null, null, null, null, null, false, null, this);
        return createAdsMediaSource;
    }
}
