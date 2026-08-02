package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ou6 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public boolean t;
    public boolean u;
    public Object v;
    public final /* synthetic */ Object w;
    public Object x;
    public final /* synthetic */ Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou6(boolean z, q50 q50Var, boolean z2, e1d e1dVar, q50 q50Var2, q50 q50Var3, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = z;
        this.w = q50Var;
        this.u = z2;
        this.x = e1dVar;
        this.y = q50Var2;
        this.z = q50Var3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                return new ou6((pu6) obj3, (ArrayList) obj2, rq3Var);
            default:
                ou6 ou6Var = new ou6(this.t, (q50) obj3, this.u, (e1d) this.x, (q50) obj2, (q50) this.z, rq3Var);
                ou6Var.v = obj;
                return ou6Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ou6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        if (r3.Z(r34) == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ho7 ho7Var;
        boolean z;
        boolean z2;
        Object R;
        boolean z3;
        ho7 ho7Var2;
        boolean z4;
        int i = this.r;
        int i2 = 0;
        Object obj2 = this.w;
        Object obj3 = this.y;
        rx6 rx6Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (i) {
            case 0:
                pu6 pu6Var = (pu6) obj2;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    g9i g9iVar = pu6Var.p;
                    if (g9iVar != null) {
                        this.s = 1;
                        break;
                    }
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z3 = this.u;
                    z4 = this.t;
                    ho7Var2 = (ho7) this.z;
                    ArrayList arrayList2 = (ArrayList) this.x;
                    pu6 pu6Var2 = (pu6) this.v;
                    y6a.M(obj);
                    arrayList = arrayList2;
                    pu6Var = pu6Var2;
                    R = obj;
                    rx6Var = (rx6) R;
                    z = z3;
                    z2 = z4;
                    ho7Var = ho7Var2;
                    pu6Var.x(hu6.a(pu6Var.l(), null, null, null, null, null, l6g.W(arrayList), null, null, null, z, z2, null, false, !ho7Var.a.d(), null, null, null, false, false, null, null, rx6Var, null, null, 14670303));
                    break;
                }
                gv9 gv9Var = pu6Var.l().d;
                if (gv9Var != null) {
                    arrayList = (ArrayList) obj3;
                    ho7Var = pu6Var.l().c;
                    if (ho7Var != null) {
                        Pair k = pu6Var.k(arrayList, gv9Var, ho7Var);
                        boolean booleanValue = ((Boolean) k.a).booleanValue();
                        boolean booleanValue2 = ((Boolean) k.b).booleanValue();
                        if (!arrayList.isEmpty()) {
                            this.v = pu6Var;
                            this.x = arrayList;
                            this.z = ho7Var;
                            this.t = booleanValue;
                            this.u = booleanValue2;
                            this.s = 2;
                            R = xw3.R(z45.a, new ju6(i2, arrayList, objArr == true ? 1 : 0), this);
                            if (R != lu3Var) {
                                z3 = booleanValue2;
                                ho7Var2 = ho7Var;
                                z4 = booleanValue;
                                rx6Var = (rx6) R;
                                z = z3;
                                z2 = z4;
                                ho7Var = ho7Var2;
                                pu6Var.x(hu6.a(pu6Var.l(), null, null, null, null, null, l6g.W(arrayList), null, null, null, z, z2, null, false, !ho7Var.a.d(), null, null, null, false, false, null, null, rx6Var, null, null, 14670303));
                            }
                            break;
                        } else {
                            z = booleanValue2;
                            z2 = booleanValue;
                            pu6Var.x(hu6.a(pu6Var.l(), null, null, null, null, null, l6g.W(arrayList), null, null, null, z, z2, null, false, !ho7Var.a.d(), null, null, null, false, false, null, null, rx6Var, null, null, 14670303));
                        }
                    }
                }
            default:
                q50 q50Var = (q50) this.z;
                q50 q50Var2 = (q50) obj3;
                e1d e1dVar = (e1d) this.x;
                q50 q50Var3 = (q50) obj2;
                ku3 ku3Var = (ku3) this.v;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (!this.t) {
                        xw3.L(ku3Var, null, null, new w07(q50Var3, objArr4 == true ? 1 : 0, 7), 3);
                        xw3.L(ku3Var, null, null, new w07(q50Var2, objArr3 == true ? 1 : 0, 8), 3);
                        xw3.L(ku3Var, null, null, new w07(q50Var, objArr2 == true ? 1 : 0, 9), 3);
                        break;
                    } else {
                        int m = tba.m(((Number) q50Var3.d()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 500);
                        if (((fm8) e1dVar.getValue()) != null) {
                            if (this.u) {
                                Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                this.v = ku3Var;
                                this.s = 1;
                                if (q50Var3.f(this, f) == lu3Var2) {
                                    break;
                                }
                            } else {
                                xw3.L(ku3Var, null, null, new bce(q50Var3, m, objArr5 == true ? 1 : 0, i2), 3);
                            }
                        }
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                xw3.L(ku3Var, null, null, new cce(q50Var2, e1dVar, q50Var, (rq3) null), 3);
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou6(pu6 pu6Var, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = pu6Var;
        this.y = arrayList;
    }
}
