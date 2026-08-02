package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xe7 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ xe7(long j, Double d, float f, float f2, boolean z, cdi cdiVar, cdi cdiVar2) {
        this.b = j;
        this.f = d;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.g = cdiVar;
        this.h = cdiVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        boolean z = this.e;
        float f = this.d;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                v7b v7bVar = (v7b) obj2;
                List list = (List) obj3;
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / (((List) obj4).size() - 1);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 6.0f;
                b20 a = e20.a();
                v6a it = b.h(list).iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    float f2 = nextInt * intBitsToFloat;
                    float floatValue = ((Number) list.get(nextInt)).floatValue() * intBitsToFloat2;
                    if (nextInt == 0) {
                        a.g(f2, floatValue);
                    } else {
                        a.f(f2, floatValue);
                    }
                }
                float f3 = this.c;
                if (z) {
                    ha5.X0(ha5Var, a, this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, f5p.r(new float[]{f, f + f3}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 10), 52);
                } else {
                    ha5.D(ha5Var, a, v7bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 0, 52);
                }
                break;
            default:
                Double d = (Double) obj4;
                cdi cdiVar = (cdi) obj3;
                cdi cdiVar2 = (cdi) obj2;
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                ha5.o0(ha5Var2, this.b, 0L, ha5Var2.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                if (d != null) {
                    double a2 = llf.a((((Number) cdiVar.getValue()).floatValue() + 1.0d) / 2.0d, 0.0d, 1.0d);
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                    float f4 = 2.0f * this.c;
                    float max = Math.max((float) (a2 * (intBitsToFloat3 - f4)), f);
                    ha5.o0(ha5Var2, ((r13) cdiVar2.getValue()).a, (Float.floatToRawIntBits(r0) & 4294967295L) | (Float.floatToRawIntBits(z ? (Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - r0) - max : r0) << 32), (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) - f4) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                    break;
                } else {
                    break;
                }
        }
        return Unit.a;
    }

    public /* synthetic */ xe7(List list, boolean z, long j, float f, float f2, v7b v7bVar, List list2) {
        this.f = list;
        this.e = z;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.h = v7bVar;
        this.g = list2;
    }
}
