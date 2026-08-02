package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sxd implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wzc c;
    public final /* synthetic */ n9j d;
    public final /* synthetic */ uah e;

    public sxd(boolean z, boolean z2, wzc wzcVar, n9j n9jVar, uah uahVar) {
        this.a = z;
        this.b = z2;
        this.c = wzcVar;
        this.d = n9jVar;
        this.e = uahVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            a99.f.q(this.a, this.b, this.c, null, this.d, this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 100663296, 200);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
