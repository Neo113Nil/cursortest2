package defpackage;

import com.sofascore.model.Sports;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mwe extends hoi implements Function2 {
    public x2g A;
    public x2g B;
    public boolean C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ awe F;
    public final /* synthetic */ nwe G;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public zu4 w;
    public x2g x;
    public x2g y;
    public x2g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwe(awe aweVar, nwe nweVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.F = aweVar;
        this.G = nweVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        mwe mweVar = new mwe(this.F, this.G, rq3Var);
        mweVar.E = obj;
        return mweVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mwe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x027b, code lost:
    
        if (defpackage.xw3.R(r15, r1, r18) == r13) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0231, code lost:
    
        if (r9 == r13) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01fe, code lost:
    
        if (r5 == r13) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01cc, code lost:
    
        if (r5 == r13) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        if (r5 == r13) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00da, code lost:
    
        if (defpackage.j58.k() != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zu4 zu4Var;
        zu4 p;
        Object w;
        zu4 zu4Var2;
        zu4 zu4Var3;
        boolean z;
        av4 av4Var;
        zu4 zu4Var4;
        x2g x2gVar;
        zu4 zu4Var5;
        zu4 zu4Var6;
        x2g x2gVar2;
        Object T;
        zu4 zu4Var7;
        x2g x2gVar3;
        x2g x2gVar4;
        x2g x2gVar5;
        x2g x2gVar6;
        Object T2;
        zu4 zu4Var8;
        x2g x2gVar7;
        x2g x2gVar8;
        x2g x2gVar9;
        x2g x2gVar10;
        Object T3;
        x2g x2gVar11;
        x2g x2gVar12;
        x2g x2gVar13;
        Object T4;
        x2g x2gVar14;
        x2g x2gVar15;
        x2g x2gVar16;
        x2g x2gVar17;
        Object T5;
        x2g x2gVar18;
        awe aweVar = this.F;
        String str = aweVar.e;
        ku3 ku3Var = (ku3) this.E;
        lu3 lu3Var = lu3.a;
        int i = this.D;
        nwe nweVar = this.G;
        switch (i) {
            case 0:
                y6a.M(obj);
                av4 t = xw3.t(ku3Var, null, new lwe(nweVar, aweVar, null, 5), 3);
                av4 t2 = str.equals(Sports.FOOTBALL) ? xw3.t(ku3Var, null, new lwe(nweVar, aweVar, null, 1), 3) : null;
                Set set = wyh.a;
                if (wyh.p.contains(str)) {
                    if (str.equals(Sports.BASKETBALL)) {
                        yea yeaVar = j58.a;
                        break;
                    }
                    zu4Var = xw3.t(ku3Var, null, new lwe(nweVar, aweVar, null, 2), 3);
                    av4 t3 = (!str.equals(Sports.BASKETBALL) || str.equals(Sports.ICE_HOCKEY)) ? xw3.t(ku3Var, null, new lwe(nweVar, aweVar, null, 3), 3) : null;
                    av4 t4 = !str.equals(Sports.BASKETBALL) ? xw3.t(ku3Var, null, new lwe(nweVar, aweVar, null, 4), 3) : null;
                    av4 t5 = !str.equals(Sports.FOOTBALL) ? xw3.t(ku3Var, null, new lwe(nweVar, aweVar, null, 0), 3) : null;
                    boolean t6 = ug5.t(aweVar.f);
                    p = yaa.p(ku3Var, t6, new lwe(nweVar, aweVar, null, 6));
                    this.E = null;
                    this.r = t2;
                    this.s = zu4Var;
                    this.t = t3;
                    this.u = t4;
                    this.v = t5;
                    this.w = p;
                    this.C = t6;
                    this.D = 1;
                    w = t.w(this);
                    if (w != lu3Var) {
                        zu4Var2 = t3;
                        zu4Var3 = t5;
                        z = t6;
                        av4Var = t2;
                        zu4Var4 = t4;
                        x2gVar = (x2g) w;
                        if (av4Var == null) {
                            this.E = null;
                            this.r = null;
                            this.s = zu4Var;
                            this.t = zu4Var2;
                            this.u = zu4Var4;
                            this.v = zu4Var3;
                            this.w = p;
                            this.x = x2gVar;
                            this.C = z;
                            this.D = 2;
                            T = av4Var.T(this);
                            if (T != lu3Var) {
                                zu4Var7 = p;
                                x2gVar3 = x2gVar;
                                zu4Var5 = zu4Var3;
                                zu4Var6 = zu4Var7;
                                x2gVar = x2gVar3;
                                x2gVar2 = (x2g) T;
                                if (zu4Var != null) {
                                    this.E = null;
                                    this.r = null;
                                    this.s = null;
                                    this.t = zu4Var2;
                                    this.u = zu4Var4;
                                    this.v = zu4Var5;
                                    this.w = zu4Var6;
                                    this.x = x2gVar;
                                    this.y = x2gVar2;
                                    this.C = z;
                                    this.D = 3;
                                    T2 = zu4Var.T(this);
                                    break;
                                } else {
                                    x2gVar4 = x2gVar;
                                    x2gVar5 = x2gVar2;
                                    x2gVar6 = null;
                                    if (zu4Var2 == null) {
                                        this.E = null;
                                        this.r = null;
                                        this.s = null;
                                        this.t = null;
                                        this.u = zu4Var4;
                                        this.v = zu4Var5;
                                        this.w = zu4Var6;
                                        this.x = x2gVar4;
                                        this.y = x2gVar5;
                                        this.z = x2gVar6;
                                        this.C = z;
                                        this.D = 4;
                                        T3 = zu4Var2.T(this);
                                        break;
                                    } else {
                                        zu4Var8 = zu4Var6;
                                        x2gVar7 = x2gVar4;
                                        x2gVar8 = x2gVar5;
                                        x2gVar9 = x2gVar6;
                                        x2gVar10 = null;
                                        if (zu4Var4 == null) {
                                            this.E = null;
                                            this.r = null;
                                            this.s = null;
                                            this.t = null;
                                            this.u = null;
                                            this.v = zu4Var5;
                                            this.w = zu4Var8;
                                            this.x = x2gVar7;
                                            this.y = x2gVar8;
                                            this.z = x2gVar9;
                                            this.A = x2gVar10;
                                            this.C = z;
                                            this.D = 5;
                                            T4 = zu4Var4.T(this);
                                            break;
                                        } else {
                                            x2gVar11 = x2gVar9;
                                            x2gVar12 = x2gVar10;
                                            x2gVar13 = null;
                                            if (zu4Var5 != null) {
                                                x2g x2gVar19 = x2gVar8;
                                                x2gVar14 = x2gVar11;
                                                x2gVar15 = x2gVar19;
                                                x2gVar16 = x2gVar13;
                                                x2gVar17 = null;
                                                boolean z2 = z;
                                                x2gVar18 = x2gVar7;
                                                x2g x2gVar20 = x2gVar12;
                                                if (!(x2gVar18 instanceof v2g)) {
                                                    hs4 hs4Var = z45.a;
                                                    kwe kweVar = new kwe(nweVar, (v2g) x2gVar18, aweVar, x2gVar15, x2gVar14, x2gVar20, x2gVar17, z2, zu4Var8, x2gVar16, null);
                                                    this.E = null;
                                                    this.r = null;
                                                    this.s = null;
                                                    this.t = null;
                                                    this.u = null;
                                                    this.v = null;
                                                    this.w = null;
                                                    this.x = null;
                                                    this.y = null;
                                                    this.z = null;
                                                    this.A = null;
                                                    this.B = null;
                                                    this.C = z2;
                                                    this.D = 7;
                                                    break;
                                                } else {
                                                    nweVar.g.j(new owe(null, null, null, null, null, null, null, false));
                                                }
                                                return Unit.a;
                                            }
                                            this.E = null;
                                            this.r = null;
                                            this.s = null;
                                            this.t = null;
                                            this.u = null;
                                            this.v = null;
                                            this.w = zu4Var8;
                                            this.x = x2gVar7;
                                            this.y = x2gVar8;
                                            this.z = x2gVar11;
                                            this.A = x2gVar12;
                                            this.B = x2gVar13;
                                            this.C = z;
                                            this.D = 6;
                                            T5 = zu4Var5.T(this);
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            zu4Var5 = zu4Var3;
                            zu4Var6 = p;
                            x2gVar2 = null;
                            if (zu4Var != null) {
                            }
                        }
                    }
                    return lu3Var;
                }
                zu4Var = null;
                if (str.equals(Sports.BASKETBALL)) {
                }
                if (!str.equals(Sports.BASKETBALL)) {
                }
                if (!str.equals(Sports.FOOTBALL)) {
                }
                boolean t62 = ug5.t(aweVar.f);
                p = yaa.p(ku3Var, t62, new lwe(nweVar, aweVar, null, 6));
                this.E = null;
                this.r = t2;
                this.s = zu4Var;
                this.t = t3;
                this.u = t4;
                this.v = t5;
                this.w = p;
                this.C = t62;
                this.D = 1;
                w = t.w(this);
                if (w != lu3Var) {
                }
                return lu3Var;
            case 1:
                z = this.C;
                p = this.w;
                zu4 zu4Var9 = this.v;
                zu4Var4 = this.u;
                zu4Var2 = this.t;
                zu4Var = this.s;
                av4Var = this.r;
                y6a.M(obj);
                zu4Var3 = zu4Var9;
                w = obj;
                x2gVar = (x2g) w;
                if (av4Var == null) {
                }
                break;
            case 2:
                z = this.C;
                x2gVar3 = this.x;
                zu4Var7 = this.w;
                zu4Var3 = this.v;
                zu4Var4 = this.u;
                zu4Var2 = this.t;
                zu4Var = this.s;
                y6a.M(obj);
                T = obj;
                zu4Var5 = zu4Var3;
                zu4Var6 = zu4Var7;
                x2gVar = x2gVar3;
                x2gVar2 = (x2g) T;
                if (zu4Var != null) {
                }
                break;
            case 3:
                z = this.C;
                x2gVar2 = this.y;
                x2gVar = this.x;
                zu4Var6 = this.w;
                zu4Var5 = this.v;
                zu4Var4 = this.u;
                zu4Var2 = this.t;
                y6a.M(obj);
                T2 = obj;
                x2gVar4 = x2gVar;
                x2gVar5 = x2gVar2;
                x2gVar6 = (x2g) T2;
                if (zu4Var2 == null) {
                }
                break;
            case 4:
                z = this.C;
                x2gVar6 = this.z;
                x2gVar5 = this.y;
                x2gVar4 = this.x;
                zu4Var6 = this.w;
                zu4Var5 = this.v;
                zu4Var4 = this.u;
                y6a.M(obj);
                T3 = obj;
                zu4Var8 = zu4Var6;
                x2gVar7 = x2gVar4;
                x2gVar8 = x2gVar5;
                x2gVar9 = x2gVar6;
                x2gVar10 = (x2g) T3;
                if (zu4Var4 == null) {
                }
                break;
            case 5:
                z = this.C;
                x2gVar10 = this.A;
                x2gVar9 = this.z;
                x2gVar8 = this.y;
                x2gVar7 = this.x;
                zu4Var8 = this.w;
                zu4Var5 = this.v;
                y6a.M(obj);
                T4 = obj;
                x2g x2gVar21 = x2gVar9;
                x2gVar12 = x2gVar10;
                x2gVar13 = (x2g) T4;
                x2gVar11 = x2gVar21;
                if (zu4Var5 != null) {
                }
                break;
            case 6:
                z = this.C;
                x2gVar13 = this.B;
                x2gVar12 = this.A;
                x2gVar11 = this.z;
                x2gVar8 = this.y;
                x2gVar7 = this.x;
                zu4Var8 = this.w;
                y6a.M(obj);
                T5 = obj;
                x2g x2gVar22 = x2gVar8;
                x2gVar14 = x2gVar11;
                x2gVar15 = x2gVar22;
                x2gVar16 = x2gVar13;
                x2gVar17 = (x2g) T5;
                boolean z22 = z;
                x2gVar18 = x2gVar7;
                x2g x2gVar202 = x2gVar12;
                if (!(x2gVar18 instanceof v2g)) {
                }
                return Unit.a;
            case 7:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
