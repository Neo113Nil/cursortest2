package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xfi extends hoi implements Function2 {
    public final /* synthetic */ q50 A;
    public final /* synthetic */ q50 B;
    public final /* synthetic */ q50 C;
    public /* synthetic */ Object r;
    public final /* synthetic */ q50 s;
    public final /* synthetic */ q50 t;
    public final /* synthetic */ q50 u;
    public final /* synthetic */ q50 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ q50 x;
    public final /* synthetic */ q50 y;
    public final /* synthetic */ q50 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfi(q50 q50Var, q50 q50Var2, q50 q50Var3, q50 q50Var4, float f, q50 q50Var5, q50 q50Var6, q50 q50Var7, q50 q50Var8, q50 q50Var9, q50 q50Var10, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = q50Var;
        this.t = q50Var2;
        this.u = q50Var3;
        this.v = q50Var4;
        this.w = f;
        this.x = q50Var5;
        this.y = q50Var6;
        this.z = q50Var7;
        this.A = q50Var8;
        this.B = q50Var9;
        this.C = q50Var10;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        xfi xfiVar = new xfi(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, rq3Var);
        xfiVar.r = obj;
        return xfiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xfi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var = (ku3) this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        xw3.L(ku3Var, null, null, new w07(this.s, null, 22), 3);
        xw3.L(ku3Var, null, null, new w07(this.t, null, 23), 3);
        xw3.L(ku3Var, null, null, new w07(this.u, null, 24), 3);
        q50 q50Var = this.v;
        float f = this.w;
        xw3.L(ku3Var, null, null, new cba(q50Var, f, null, 4), 3);
        xw3.L(ku3Var, null, null, new cba(this.x, f, null, 5), 3);
        xw3.L(ku3Var, null, null, new cba(this.y, f, null, 6), 3);
        xw3.L(ku3Var, null, null, new w07(this.z, null, 25), 3);
        xw3.L(ku3Var, null, null, new w07(this.A, null, 26), 3);
        xw3.L(ku3Var, null, null, new w07(this.B, null, 27), 3);
        return xw3.L(ku3Var, null, null, new w07(this.C, null, 21), 3);
    }
}
