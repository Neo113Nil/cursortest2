package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d6e extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ e6e s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6e(e6e e6eVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = e6eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
