package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bv2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ q50 c;
    public final /* synthetic */ q50 d;

    public /* synthetic */ bv2(long j, q50 q50Var, q50 q50Var2, int i) {
        this.a = i;
        this.b = j;
        this.c = q50Var;
        this.d = q50Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        q50 q50Var = this.d;
        q50 q50Var2 = this.c;
        switch (i) {
            case 0:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float H0 = ha5Var.H0(1.5f);
                long c = r13.c(this.b, ((Number) q50Var2.d()).floatValue());
                float floatValue = ((Number) q50Var.d()).floatValue();
                float f = H0 / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H0;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - H0;
                ha5.L(ha5Var, c, floatValue, 90.0f, floatToRawIntBits, (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)) | (Float.floatToRawIntBits(intBitsToFloat) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(H0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 832);
                break;
            default:
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                float floatValue2 = ((Number) q50Var2.d()).floatValue();
                long j = this.b;
                long c2 = r13.c(j, floatValue2);
                float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) / 2.0f;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) / 2.0f;
                ha5.U(ha5Var2, c2, ((Number) q50Var.d()).floatValue() * (njh.e(ha5Var2.n()) / 2.0f), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                float intBitsToFloat5 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) / 2.0f;
                float intBitsToFloat6 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) / 2.0f;
                ha5.U(ha5Var2, j, njh.e(ha5Var2.n()) * 0.1754386f, (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat6)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                break;
        }
        return Unit.a;
    }
}
