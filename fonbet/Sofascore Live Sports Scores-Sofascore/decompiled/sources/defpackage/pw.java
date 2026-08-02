package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pw extends sq3 {
    public csf r;
    public /* synthetic */ Object s;
    public final /* synthetic */ sw t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(sw swVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = swVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.F1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
