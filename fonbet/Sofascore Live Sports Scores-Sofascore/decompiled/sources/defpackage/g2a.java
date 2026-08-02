package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class g2a extends hoi implements Function2 {
    public /* synthetic */ float r;

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        g2a g2aVar = new g2a(2, rq3Var);
        g2aVar.r = ((Number) obj).floatValue();
        return g2aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g2a) create(Float.valueOf(((Number) obj).floatValue()), (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        return Boolean.valueOf(this.r > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
