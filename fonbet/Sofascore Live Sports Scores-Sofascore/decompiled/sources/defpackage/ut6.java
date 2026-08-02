package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ut6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ut6(long j, boolean z) {
        this.a = 1;
        this.b = j;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        switch (i) {
            case 0:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                if (z) {
                    ha5.o0(ymaVar, this.b, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                }
                break;
            case 1:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                b20 a = e20.a();
                if (z) {
                    a.g(Float.intBitsToFloat((int) (ha5Var.n() >> 32)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)));
                    a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    a.f(Float.intBitsToFloat((int) (ha5Var.n() >> 32)), Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)));
                    a.f(Float.intBitsToFloat((int) (ha5Var.n() >> 32)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                a.d();
                ha5.X0(ha5Var, a, this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                break;
            default:
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                float H0 = ha5Var2.H0(1.0f);
                float f = H0 / 2.0f;
                float intBitsToFloat = z ? 0.0f : Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                float intBitsToFloat2 = z ? Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) : 0.0f;
                float intBitsToFloat3 = z ? 0.0f : Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                if (!z) {
                    f = -f;
                }
                float f2 = intBitsToFloat + f;
                long j = this.b;
                ha5.W0(ha5Var2, j, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() >> 32))) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), H0, 0, null, 496);
                float f3 = intBitsToFloat3 + f;
                ha5.W0(ha5Var2, j, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(f3) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), H0, 0, null, 496);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ut6(boolean z, long j, int i) {
        this.a = i;
        this.c = z;
        this.b = j;
    }
}
