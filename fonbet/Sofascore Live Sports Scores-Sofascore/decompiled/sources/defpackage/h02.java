package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class h02 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dfh b;

    public /* synthetic */ h02(dfh dfhVar, int i) {
        this.a = i;
        this.b = dfhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        dfh dfhVar = this.b;
        f4g f4gVar = (f4g) obj;
        switch (i) {
            case 0:
                dx dxVar = dfhVar.d;
                float h = ((xnh) dxVar.f).h();
                float c = dxVar.g().c();
                float f = h < c ? c - h : 0.0f;
                f4gVar.l(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (Float.intBitsToFloat((int) (f4gVar.r & 4294967295L)) + f) / Float.intBitsToFloat((int) (f4gVar.r & 4294967295L)) : 1.0f);
                f4gVar.s(uaa.h(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            default:
                dx dxVar2 = dfhVar.d;
                float h2 = ((xnh) dxVar2.f).h();
                float c2 = dxVar2.g().c();
                float f2 = h2 < c2 ? c2 - h2 : 0.0f;
                f4gVar.l(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f / ((Float.intBitsToFloat((int) (f4gVar.r & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & f4gVar.r))) : 1.0f);
                f4gVar.s(uaa.h(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
        return Unit.a;
    }
}
