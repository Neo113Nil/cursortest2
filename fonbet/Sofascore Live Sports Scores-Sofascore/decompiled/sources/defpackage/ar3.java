package defpackage;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ar3 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar3(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (this.r) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ar3 ar3Var = new ar3(i, (rq3) obj3, 0);
                ar3Var.s = booleanValue;
                ar3Var.t = booleanValue2;
                return ar3Var.invokeSuspend(Unit.a);
            case 1:
                boolean booleanValue3 = bool.booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                ar3 ar3Var2 = new ar3(i, (rq3) obj3, 1);
                ar3Var2.s = booleanValue3;
                ar3Var2.t = booleanValue4;
                return ar3Var2.invokeSuspend(Unit.a);
            case 2:
                boolean booleanValue5 = bool.booleanValue();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                ar3 ar3Var3 = new ar3(i, (rq3) obj3, 2);
                ar3Var3.s = booleanValue5;
                ar3Var3.t = booleanValue6;
                return ar3Var3.invokeSuspend(Unit.a);
            case 3:
                boolean booleanValue7 = bool.booleanValue();
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                ar3 ar3Var4 = new ar3(i, (rq3) obj3, i);
                ar3Var4.s = booleanValue7;
                ar3Var4.t = booleanValue8;
                return ar3Var4.invokeSuspend(Unit.a);
            case 4:
                boolean booleanValue9 = bool.booleanValue();
                boolean booleanValue10 = ((Boolean) obj2).booleanValue();
                ar3 ar3Var5 = new ar3(i, (rq3) obj3, 4);
                ar3Var5.s = booleanValue9;
                ar3Var5.t = booleanValue10;
                return ar3Var5.invokeSuspend(Unit.a);
            case 5:
                boolean booleanValue11 = bool.booleanValue();
                boolean booleanValue12 = ((Boolean) obj2).booleanValue();
                ar3 ar3Var6 = new ar3(i, (rq3) obj3, 5);
                ar3Var6.s = booleanValue11;
                ar3Var6.t = booleanValue12;
                return ar3Var6.invokeSuspend(Unit.a);
            default:
                boolean booleanValue13 = bool.booleanValue();
                boolean booleanValue14 = ((Boolean) obj2).booleanValue();
                ar3 ar3Var7 = new ar3(i, (rq3) obj3, 6);
                ar3Var7.s = booleanValue13;
                ar3Var7.t = booleanValue14;
                return ar3Var7.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.r) {
            case 0:
                boolean z2 = this.s;
                boolean z3 = this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (z2 && !z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                boolean z4 = this.s;
                boolean z5 = this.t;
                if (z4 && z5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                boolean z6 = this.s;
                boolean z7 = this.t;
                if (z6 && z7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                boolean z8 = this.s;
                boolean z9 = this.t;
                if (z8 && z9) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                boolean z10 = this.s;
                boolean z11 = this.t;
                if (z10 && z11) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                boolean z12 = this.s;
                boolean z13 = this.t;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder("isAdDisplaying final: ");
                vxd.t(", _isAdDisplaying: ", ", webViewIsDisplaying: ", sb, z12 && z13, z12);
                sb.append(z13);
                MolocoLogger.info$default(molocoLogger, "TemplateFullscreenAd", sb.toString(), null, false, 12, null);
                if (z12 && z13) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                boolean z14 = this.s;
                boolean z15 = this.t;
                if (z14 && z15) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
