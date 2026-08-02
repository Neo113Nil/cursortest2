package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zaa implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ cdi d;

    public /* synthetic */ zaa(int i, long j, cdi cdiVar) {
        this.b = i;
        this.c = j;
        this.d = cdiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        cdi cdiVar = this.d;
        int i2 = this.b;
        switch (i) {
            case 0:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.w((Float.intBitsToFloat((int) (((dnd) ((e1d) cdiVar).getValue()).a >> 32)) - (Float.intBitsToFloat((int) (f4gVar.r >> 32)) / 2.0f)) - (Float.intBitsToFloat((int) (this.c >> 32)) + i2));
                break;
            default:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float f = i2;
                long floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(ha5Var.H0(2.0f) + (((Number) cdiVar.getValue()).floatValue() * (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / f))) << 32);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(r1) & 4294967295L) | (Float.floatToRawIntBits(ha5Var.H0(16.0f)) << 32);
                float intBitsToFloat = (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) / f) - (ha5Var.H0(2.0f) * 2.0f);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                ha5.f0(ha5Var, this.c, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), floatToRawIntBits2, null, 240);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zaa(long j, int i, e1d e1dVar) {
        this.c = j;
        this.b = i;
        this.d = e1dVar;
    }
}
