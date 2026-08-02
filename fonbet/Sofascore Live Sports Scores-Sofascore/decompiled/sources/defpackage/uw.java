package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class uw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx b;

    public /* synthetic */ uw(dx dxVar, int i) {
        this.a = i;
        this.b = dxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        dx dxVar = this.b;
        switch (i) {
            case 0:
                Object value = ((eoh) ((e1d) dxVar.h)).getValue();
                if (value != null) {
                    return value;
                }
                float h = ((xnh) dxVar.f).h();
                e1d e1dVar = (e1d) dxVar.c;
                if (Float.isNaN(h)) {
                    return ((eoh) e1dVar).getValue();
                }
                eoh eohVar = (eoh) e1dVar;
                float c = dxVar.f().c(eohVar.getValue());
                if (Float.isNaN(c) || h == c) {
                    return eohVar.getValue();
                }
                Object a = dxVar.f().a(h);
                return a == null ? eohVar.getValue() : a;
            case 1:
                float c2 = dxVar.f().c(((eoh) ((e1d) dxVar.d)).getValue());
                float c3 = dxVar.f().c(((ay4) dxVar.e).getValue()) - c2;
                float abs = Math.abs(c3);
                float f = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float k = (dxVar.k() - c2) / c3;
                    if (k < 1.0E-6f) {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else if (k <= 0.999999f) {
                        f = k;
                    }
                }
                return Float.valueOf(f);
            case 2:
                return dxVar.f();
            default:
                return new Pair(dxVar.f(), ((ay4) dxVar.e).getValue());
        }
    }
}
