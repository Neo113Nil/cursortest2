package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class l65 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ l65(long j, int i, float f) {
        this.a = i;
        this.b = f;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                ha5 ha5Var = (ha5) obj;
                float H0 = ha5Var.H0(f);
                float H02 = ha5Var.H0(f) / 2.0f;
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                ha5.W0(ha5Var, this.c, (Float.floatToRawIntBits(ha5Var.H0(f) / 2.0f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(H02) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), H0, 0, null, 496);
                break;
            case 1:
                ha5 ha5Var2 = (ha5) obj;
                float H03 = ha5Var2.H0(f);
                float H04 = ha5Var2.H0(f) / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                float H05 = ha5Var2.H0(f) / 2.0f;
                ha5.W0(ha5Var2, this.c, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(H04) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (4294967295L & Float.floatToRawIntBits(H05)), H03, 0, null, 496);
                break;
            default:
                ha5 ha5Var3 = (ha5) obj;
                ha5Var3.getClass();
                float H06 = ha5Var3.H0(24.0f);
                long floatToRawIntBits = (Float.floatToRawIntBits(H06) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var3.n() >> 32)) - f) << 32);
                float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var3.n() & 4294967295L)) - H06;
                ha5.W0(ha5Var3, this.c, floatToRawIntBits, (Float.floatToRawIntBits(r2) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat3)), ha5Var3.H0(2.0f), 0, null, 496);
                break;
        }
        return Unit.a;
    }
}
