package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cnh extends sq3 {
    public Function1 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ gnh t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnh(gnh gnhVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = gnhVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, this);
    }
}
