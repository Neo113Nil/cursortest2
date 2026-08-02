package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sy1 extends xka implements Function1 {
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ int k;
    public final /* synthetic */ uah l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy1(float f, float f2, int i, uah uahVar, boolean z) {
        super(1);
        this.i = f;
        this.j = f2;
        this.k = i;
        this.l = uahVar;
        this.m = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f4g f4gVar = (f4g) obj;
        float j = f4gVar.s.j() * this.i;
        float j2 = f4gVar.s.j() * this.j;
        f4gVar.f((j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || j2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? null : new qy1(this.k, j, j2));
        uah uahVar = this.l;
        if (uahVar == null) {
            uahVar = oyn.e;
        }
        f4gVar.o(uahVar);
        f4gVar.d(this.m);
        return Unit.a;
    }
}
