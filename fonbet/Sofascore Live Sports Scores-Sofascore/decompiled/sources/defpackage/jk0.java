package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jk0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk0(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                jk0 jk0Var = new jk0(2, rq3Var, 0);
                jk0Var.s = ((Boolean) obj).booleanValue();
                return jk0Var;
            case 1:
                jk0 jk0Var2 = new jk0(2, rq3Var, 1);
                jk0Var2.s = ((Boolean) obj).booleanValue();
                return jk0Var2;
            case 2:
                jk0 jk0Var3 = new jk0(2, rq3Var, 2);
                jk0Var3.s = ((Boolean) obj).booleanValue();
                return jk0Var3;
            case 3:
                jk0 jk0Var4 = new jk0(2, rq3Var, 3);
                jk0Var4.s = ((Boolean) obj).booleanValue();
                return jk0Var4;
            case 4:
                jk0 jk0Var5 = new jk0(2, rq3Var, 4);
                jk0Var5.s = ((Boolean) obj).booleanValue();
                return jk0Var5;
            case 5:
                jk0 jk0Var6 = new jk0(2, rq3Var, 5);
                jk0Var6.s = ((Boolean) obj).booleanValue();
                return jk0Var6;
            case 6:
                jk0 jk0Var7 = new jk0(2, rq3Var, 6);
                jk0Var7.s = ((Boolean) obj).booleanValue();
                return jk0Var7;
            default:
                jk0 jk0Var8 = new jk0(2, rq3Var, 7);
                jk0Var8.s = ((Boolean) obj).booleanValue();
                return jk0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
        }
        return ((jk0) create(bool, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                break;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                break;
            default:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                break;
        }
        return Boolean.valueOf(this.s);
    }
}
