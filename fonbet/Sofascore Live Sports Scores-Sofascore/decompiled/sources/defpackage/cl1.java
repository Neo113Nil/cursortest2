package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cl1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cdi b;

    public /* synthetic */ cl1(cdi cdiVar, int i) {
        this.a = i;
        this.b = cdiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        cdi cdiVar = this.b;
        switch (i) {
            case 0:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.g(((Number) cdiVar.getValue()).floatValue());
                break;
            case 1:
                f4g f4gVar2 = (f4g) obj;
                f4gVar2.getClass();
                f4gVar2.g(((Number) cdiVar.getValue()).floatValue());
                break;
            case 2:
                f4g f4gVar3 = (f4g) obj;
                f4gVar3.getClass();
                f4gVar3.g(((Number) cdiVar.getValue()).floatValue());
                break;
            case 3:
                f4g f4gVar4 = (f4g) obj;
                f4gVar4.getClass();
                f4gVar4.g(((Number) cdiVar.getValue()).floatValue());
                break;
            case 4:
                ha5 ha5Var = (ha5) obj;
                long j = ((r13) cdiVar.getValue()).a;
                if (!e8k.a(j, r13.i)) {
                    ha5.o0(ha5Var, j, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                }
                break;
            case 5:
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                long j2 = ((r13) cdiVar.getValue()).a;
                float intBitsToFloat = (Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - ha5Var2.H0(48.0f)) / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) - ha5Var2.H0(2.0f);
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                float H0 = ha5Var2.H0(48.0f);
                float H02 = ha5Var2.H0(2.0f);
                ha5.o0(ha5Var2, j2, floatToRawIntBits, (Float.floatToRawIntBits(H02) & 4294967295L) | (Float.floatToRawIntBits(H0) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                break;
            case 6:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var = (gv9) cdiVar.getValue();
                esaVar.a(gv9Var.size(), null, new uk1(9, gv9Var), new tc3(802480018, new zr3(2, gv9Var), true));
                break;
            case 7:
                f4g f4gVar5 = (f4g) obj;
                f4gVar5.getClass();
                f4gVar5.i(((Number) cdiVar.getValue()).floatValue());
                break;
            case 8:
                f4g f4gVar6 = (f4g) obj;
                f4gVar6.getClass();
                f4gVar6.b(((Number) cdiVar.getValue()).floatValue());
                break;
            case 9:
                f4g f4gVar7 = (f4g) obj;
                f4gVar7.getClass();
                f4gVar7.b(((Number) cdiVar.getValue()).floatValue());
                break;
            case 10:
                f4g f4gVar8 = (f4g) obj;
                f4gVar8.getClass();
                f4gVar8.b(((Number) cdiVar.getValue()).floatValue());
                break;
            case 11:
                f4g f4gVar9 = (f4g) obj;
                f4gVar9.getClass();
                f4gVar9.b(((Number) cdiVar.getValue()).floatValue());
                break;
            case 12:
                f4g f4gVar10 = (f4g) obj;
                f4gVar10.getClass();
                f4gVar10.b(((Number) cdiVar.getValue()).floatValue());
                break;
            case 13:
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                if (((gv9) cdiVar.getValue()).isEmpty()) {
                    esaVar2.f("LoadingIndicator", "LoadingIndicator", ok3.f);
                }
                gv9 gv9Var2 = (gv9) cdiVar.getValue();
                esaVar2.a(gv9Var2.size(), null, new uk1(10, gv9Var2), new tc3(802480018, new zr3(3, gv9Var2), true));
                break;
            case 14:
                f4g f4gVar11 = (f4g) obj;
                f4gVar11.getClass();
                f4gVar11.b(((Number) cdiVar.getValue()).floatValue());
                break;
            default:
                ((f4g) obj).b(((Number) cdiVar.getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
