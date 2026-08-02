package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nwc extends sq3 {
    public svg r;
    public csf s;
    public float t;
    public /* synthetic */ Object u;
    public final /* synthetic */ qwc v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwc(qwc qwcVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = qwcVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.l(null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
