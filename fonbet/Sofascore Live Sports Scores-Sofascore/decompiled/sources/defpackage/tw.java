package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx b;

    public /* synthetic */ tw(dx dxVar, int i) {
        this.a = i;
        this.b = dxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dx dxVar = this.b;
        switch (i) {
            case 0:
                Object value = ((eoh) ((e1d) dxVar.d)).getValue();
                if (value != null) {
                    return value;
                }
                float h = ((xnh) dxVar.f).h();
                boolean isNaN = Float.isNaN(h);
                e1d e1dVar = (e1d) dxVar.c;
                return !isNaN ? dxVar.e(h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((eoh) e1dVar).getValue()) : ((eoh) e1dVar).getValue();
            case 1:
                Object value2 = ((eoh) ((e1d) dxVar.d)).getValue();
                if (value2 != null) {
                    return value2;
                }
                float h2 = ((xnh) dxVar.f).h();
                boolean isNaN2 = Float.isNaN(h2);
                e1d e1dVar2 = (e1d) dxVar.c;
                if (isNaN2) {
                    return ((eoh) e1dVar2).getValue();
                }
                Object value3 = ((eoh) e1dVar2).getValue();
                ptb g = dxVar.g();
                float d = g.d(value3);
                if (d != h2 && !Float.isNaN(d)) {
                    if (d < h2) {
                        Object b = g.b(h2, true);
                        if (b != null) {
                            return b;
                        }
                    } else {
                        Object b2 = g.b(h2, false);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                return value3;
            case 2:
                float d2 = dxVar.g().d(((eoh) ((e1d) dxVar.c)).getValue());
                float d3 = dxVar.g().d(((ay4) dxVar.n).getValue()) - d2;
                float abs = Math.abs(d3);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float k = (dxVar.k() - d2) / d3;
                    if (k >= 1.0E-6f) {
                        if (k <= 0.999999f) {
                            f = k;
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return dxVar.g();
            default:
                return new Pair(dxVar.g(), ((ay4) dxVar.e).getValue());
        }
    }
}
