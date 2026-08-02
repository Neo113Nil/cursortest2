package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nv5 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ nv5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                boolean z = false;
                xtc xtcVar = (xtc) obj;
                long j = ((r13) obj2).a;
                of3 of3Var = (of3) obj3;
                int intValue = ((Number) obj4).intValue();
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                if ((intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z = true;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, z)) {
                    td4.G(this.b, xtcVar, false, 0L, av8Var, (intValue << 3) & 112, 12);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                boolean z2 = false;
                xtc xtcVar2 = (xtc) obj;
                long j2 = ((r13) obj2).a;
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                if ((intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z2 = true;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, z2)) {
                    td4.G(this.b, xtcVar2, false, 0L, av8Var2, (intValue2 << 3) & 112, 12);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                boolean z3 = false;
                xtc xtcVar3 = (xtc) obj;
                long j3 = ((r13) obj2).a;
                of3 of3Var3 = (of3) obj3;
                int intValue3 = ((Number) obj4).intValue();
                xtcVar3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xtcVar3) ? 4 : 2;
                }
                if ((intValue3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z3 = true;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, z3)) {
                    td4.G(this.b, xtcVar3, false, 0L, av8Var3, (intValue3 << 3) & 112, 12);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                boolean z4 = false;
                xtc xtcVar4 = (xtc) obj;
                long j4 = ((r13) obj2).a;
                of3 of3Var4 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                xtcVar4.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(xtcVar4) ? 4 : 2;
                }
                if ((intValue4 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z4 = true;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, z4)) {
                    td4.G(this.b, xtcVar4, false, 0L, av8Var4, (intValue4 << 3) & 112, 12);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                boolean z5 = false;
                xtc xtcVar5 = (xtc) obj;
                long j5 = ((r13) obj2).a;
                of3 of3Var5 = (of3) obj3;
                int intValue5 = ((Number) obj4).intValue();
                xtcVar5.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(xtcVar5) ? 4 : 2;
                }
                if ((intValue5 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z5 = true;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, z5)) {
                    td4.G(this.b, xtcVar5, false, 0L, av8Var5, (intValue5 << 3) & 112, 12);
                } else {
                    av8Var5.W();
                }
                break;
            default:
                xtc xtcVar6 = (xtc) obj;
                long j6 = ((r13) obj2).a;
                of3 of3Var6 = (of3) obj3;
                int intValue6 = ((Number) obj4).intValue();
                xtcVar6.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(xtcVar6) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    td4.G(this.b, xtcVar6, false, 0L, av8Var6, (intValue6 << 3) & 112, 12);
                } else {
                    av8Var6.W();
                }
                break;
        }
        return Unit.a;
    }
}
