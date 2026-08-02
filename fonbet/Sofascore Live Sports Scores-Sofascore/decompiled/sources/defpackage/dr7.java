package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dr7 extends hoi implements gt8 {
    public /* synthetic */ List A;
    public /* synthetic */ List B;
    public final /* synthetic */ rr7 C;
    public zu4 r;
    public av4 s;
    public yq7[] t;
    public yq7 u;
    public yq7[] v;
    public int w;
    public int x;
    public /* synthetic */ List y;
    public /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr7(rr7 rr7Var, rq3 rq3Var) {
        super(6, rq3Var);
        this.C = rr7Var;
    }

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        dr7 dr7Var = new dr7(this.C, (rq3) obj6);
        dr7Var.y = (List) obj2;
        dr7Var.z = (List) obj3;
        dr7Var.A = (List) obj4;
        dr7Var.B = (List) obj5;
        return dr7Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x010f  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r15v12, types: [yq7] */
    /* JADX WARN: Type inference failed for: r1v10, types: [yq7] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yq7[] yq7VarArr;
        zu4 zu4Var;
        av4 av4Var;
        int i;
        yq7 yq7Var;
        yq7[] yq7VarArr2;
        yq7 yq7Var2;
        yq7[] yq7VarArr3;
        Object T;
        rq3 rq3Var;
        yq7[] yq7VarArr4;
        ?? r0;
        ArrayList arrayList;
        List list = this.y;
        List list2 = this.z;
        List list3 = this.A;
        List list4 = this.B;
        lu3 lu3Var = lu3.a;
        int i2 = this.x;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        if (i2 == 0) {
            y6a.M(obj);
            rr7 rr7Var = this.C;
            av4 t = xw3.t(un0.z(rr7Var), null, new br7(rr7Var, list, list3, r4, 0), 3);
            av4 t2 = xw3.t(un0.z(rr7Var), null, new cr7(rr7Var, list4, r4, i4), 3);
            av4 t3 = xw3.t(un0.z(rr7Var), null, new cr7(rr7Var, list2, r4, i5), 3);
            yq7VarArr = new yq7[3];
            yq7 yq7Var3 = yq7.d;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.r = t;
            this.s = t2;
            this.t = yq7VarArr;
            this.u = yq7Var3;
            this.v = yq7VarArr;
            this.w = 0;
            this.x = 1;
            Object w = t3.w(this);
            if (w != lu3Var) {
                zu4Var = t;
                obj = w;
                av4Var = t2;
                i = 0;
                yq7Var = yq7Var3;
                yq7VarArr2 = yq7VarArr;
            }
            return lu3Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.w;
                yq7[] yq7VarArr5 = this.v;
                ?? r1 = this.u;
                yq7VarArr4 = this.t;
                y6a.M(obj);
                r0 = yq7VarArr5;
                rq3Var = r1;
                r0[i3] = ((Collection) obj).isEmpty() ? null : rq3Var;
                yq7VarArr4.getClass();
                arrayList = new ArrayList(ph0.x(yq7VarArr4));
                if (!arrayList.isEmpty()) {
                    arrayList.add(0, yq7.c);
                }
                return arrayList;
            }
            i4 = this.w;
            yq7VarArr3 = this.v;
            yq7 yq7Var4 = this.u;
            yq7[] yq7VarArr6 = this.t;
            zu4Var = this.r;
            y6a.M(obj);
            yq7Var2 = yq7Var4;
            yq7VarArr = yq7VarArr6;
            if (((Collection) obj).isEmpty()) {
                yq7Var2 = null;
            }
            yq7VarArr3[i4] = yq7Var2;
            ?? r15 = yq7.f;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.r = null;
            this.s = null;
            this.t = yq7VarArr;
            this.u = r15;
            this.v = yq7VarArr;
            this.w = 2;
            this.x = 3;
            T = zu4Var.T(this);
            if (T != lu3Var) {
                yq7[] yq7VarArr7 = yq7VarArr;
                rq3Var = r15;
                obj = T;
                yq7VarArr4 = yq7VarArr7;
                r0 = yq7VarArr7;
                r0[i3] = ((Collection) obj).isEmpty() ? null : rq3Var;
                yq7VarArr4.getClass();
                arrayList = new ArrayList(ph0.x(yq7VarArr4));
                if (!arrayList.isEmpty()) {
                }
                return arrayList;
            }
            return lu3Var;
        }
        i = this.w;
        yq7[] yq7VarArr8 = this.v;
        yq7 yq7Var5 = this.u;
        yq7[] yq7VarArr9 = this.t;
        av4 av4Var2 = this.s;
        zu4 zu4Var2 = this.r;
        y6a.M(obj);
        yq7VarArr2 = yq7VarArr8;
        yq7VarArr = yq7VarArr9;
        zu4Var = zu4Var2;
        av4Var = av4Var2;
        yq7Var = yq7Var5;
        if (((Collection) obj).isEmpty()) {
            yq7Var = null;
        }
        yq7VarArr2[i] = yq7Var;
        yq7 yq7Var6 = yq7.e;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.r = zu4Var;
        this.s = null;
        this.t = yq7VarArr;
        this.u = yq7Var6;
        this.v = yq7VarArr;
        this.w = 1;
        this.x = 2;
        Object T2 = av4Var.T(this);
        if (T2 != lu3Var) {
            yq7Var2 = yq7Var6;
            obj = T2;
            yq7VarArr3 = yq7VarArr;
            if (((Collection) obj).isEmpty()) {
            }
            yq7VarArr3[i4] = yq7Var2;
            ?? r152 = yq7.f;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.r = null;
            this.s = null;
            this.t = yq7VarArr;
            this.u = r152;
            this.v = yq7VarArr;
            this.w = 2;
            this.x = 3;
            T = zu4Var.T(this);
            if (T != lu3Var) {
            }
        }
        return lu3Var;
    }
}
