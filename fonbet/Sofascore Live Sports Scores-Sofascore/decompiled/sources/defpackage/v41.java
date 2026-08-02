package defpackage;

import com.sofascore.model.mvvm.IRecent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v41 extends hoi implements Function2 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ w41 G;
    public final /* synthetic */ IRecent H;
    public zu4 r;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public zu4 w;
    public zu4 x;
    public Object y;
    public Boolean[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(w41 w41Var, IRecent iRecent, rq3 rq3Var) {
        super(2, rq3Var);
        this.G = w41Var;
        this.H = iRecent;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        v41 v41Var = new v41(this.G, this.H, rq3Var);
        v41Var.F = obj;
        return v41Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v41) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0278, code lost:
    
        if (r3 == r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0582, code lost:
    
        if (r3.T(r25) != r2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x054d, code lost:
    
        if (r1 != r2) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0421, code lost:
    
        if (r4 != r2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03ae, code lost:
    
        if (r8 == r2) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0348  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v21, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v22, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v23, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v24, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v25, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v26, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r14v4, types: [zu4] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r1v9, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Boolean[], java.lang.Object, zu4] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v6, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r7v35, types: [zu4] */
    /* JADX WARN: Type inference failed for: r8v54, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        av4 t2;
        Boolean[] boolArr;
        Object w;
        zu4 zu4Var;
        zu4 zu4Var2;
        zu4 zu4Var3;
        zu4 zu4Var4;
        zu4 zu4Var5;
        ?? r4;
        boolean z;
        av4 av4Var;
        int i;
        ?? r17;
        Object T;
        ?? r42;
        zu4 zu4Var6;
        zu4 zu4Var7;
        int i2;
        boolean z2;
        Object T2;
        zu4 zu4Var8;
        int i3;
        zu4 zu4Var9;
        zu4 zu4Var10;
        zu4 zu4Var11;
        zu4 zu4Var12;
        zu4 zu4Var13;
        Boolean[] boolArr2;
        boolean z3;
        Object T3;
        boolean z4;
        Boolean[] boolArr3;
        zu4 zu4Var14;
        zu4 zu4Var15;
        zu4 zu4Var16;
        zu4 zu4Var17;
        boolean z5;
        boolean z6;
        Boolean[] boolArr4;
        Object T4;
        Boolean[] boolArr5;
        zu4 zu4Var18;
        zu4 zu4Var19;
        zu4 zu4Var20;
        zu4 zu4Var21;
        zu4 zu4Var22;
        int i4;
        boolean z7;
        Boolean[] boolArr6;
        boolean z8;
        ?? r6;
        List j;
        Iterator it;
        int i5;
        ?? r62;
        int i6;
        int i7;
        Object T5;
        zu4 zu4Var23;
        ?? r11;
        zu4 zu4Var24;
        boolean z9;
        zu4 zu4Var25;
        Object T6;
        int i8;
        boolean z10;
        zu4 zu4Var26;
        zu4 zu4Var27;
        boolean z11;
        Object T7;
        boolean z12;
        boolean z13;
        zu4 zu4Var28;
        int i9;
        zu4 zu4Var29;
        zu4 zu4Var30;
        boolean z14;
        Object T8;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        Object T9;
        boolean z18;
        av4 av4Var2;
        boolean z19;
        boolean z20;
        x4c x4cVar;
        Object T10;
        zbc zbcVar;
        gv9 gv9Var;
        Iterator it2;
        Object u;
        List list;
        boolean z21;
        av4 av4Var3;
        ArrayList arrayList;
        Object obj2;
        ku3 ku3Var = (ku3) this.F;
        lu3 lu3Var = lu3.a;
        int i11 = this.E;
        int i12 = 2;
        int i13 = 0;
        w41 w41Var = this.G;
        switch (i11) {
            case 0:
                y6a.M(obj);
                t = xw3.t(ku3Var, null, new u41(i12, null, i13), 3);
                zbc zbcVar2 = (zbc) w41Var.l().a();
                gv9 gv9Var2 = zbcVar2 != null ? zbcVar2.b : null;
                if (gv9Var2 != null && !gv9Var2.isEmpty()) {
                    r17 = 0;
                    zbcVar = (zbc) w41Var.l().a();
                    if (zbcVar != null && (gv9Var = zbcVar.b) != null) {
                        ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                        it2 = gv9Var.iterator();
                        while (it2.hasNext()) {
                            int ordinal = ((gec) it2.next()).ordinal();
                            if (ordinal == 0) {
                                list = km5.a;
                            } else if (ordinal == 1) {
                                list = a.c(xw3.t(ku3Var, null, new t41(w41Var, null, 6), 3));
                            } else if (ordinal == 2) {
                                list = a.c(xw3.t(ku3Var, null, new t41(w41Var, null, 7), 3));
                            } else if (ordinal == 3) {
                                rq3 rq3Var = null;
                                av4 t3 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var, 8), 3);
                                av4 t4 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var, 9), 3);
                                zu4[] zu4VarArr = new zu4[2];
                                zu4VarArr[r17] = t3;
                                zu4VarArr[1] = t4;
                                list = b.j(zu4VarArr);
                            } else {
                                if (ordinal != 4) {
                                    zzl.b();
                                    return null;
                                }
                                list = a.c(xw3.t(ku3Var, null, new t41(w41Var, null, 10), 3));
                            }
                            arrayList2.add(list);
                        }
                        ArrayList s = k13.s(arrayList2);
                        this.F = null;
                        this.r = t;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = null;
                        this.w = null;
                        this.x = null;
                        this.y = null;
                        this.E = 12;
                        u = m6k.u(s, this);
                        break;
                    }
                    arrayList = null;
                    if (arrayList != null) {
                        w41Var.o.l(l6g.W(arrayList));
                        Unit unit = Unit.a;
                    }
                    obj2 = null;
                    this.F = null;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.w = null;
                    this.x = null;
                    this.y = null;
                    this.E = 13;
                    break;
                } else {
                    rq3 rq3Var2 = null;
                    av4 t5 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var2, 1), 3);
                    av4 t6 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var2, 5), 3);
                    av4 t7 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var2, i12), 3);
                    av4 t8 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var2, 3), 3);
                    av4 t9 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var2, 4), 3);
                    t2 = xw3.t(ku3Var, null, new t41(w41Var, rq3Var2, i13), 3);
                    boolArr = new Boolean[4];
                    this.F = ku3Var;
                    this.r = t;
                    this.s = t5;
                    this.t = t6;
                    this.u = t7;
                    this.v = t8;
                    this.w = t9;
                    this.x = t2;
                    this.y = boolArr;
                    this.z = boolArr;
                    this.A = 0;
                    this.E = 1;
                    w = t5.w(this);
                    if (w != lu3Var) {
                        zu4Var = t6;
                        zu4Var2 = t9;
                        zu4Var3 = t7;
                        zu4Var4 = t8;
                        zu4Var5 = t5;
                        r4 = boolArr;
                        z = false;
                        av4Var = t;
                        i = 0;
                        r4[i] = w;
                        this.F = ku3Var;
                        this.r = av4Var;
                        this.s = zu4Var5;
                        this.t = zu4Var;
                        this.u = zu4Var3;
                        this.v = zu4Var4;
                        this.w = zu4Var2;
                        this.x = t2;
                        this.y = boolArr;
                        this.z = boolArr;
                        this.A = 1;
                        this.E = 2;
                        T = zu4Var.T(this);
                        if (T != lu3Var) {
                            r42 = boolArr;
                            zu4Var6 = t2;
                            zu4Var7 = av4Var;
                            i2 = 1;
                            z2 = z;
                            r42[i2] = T;
                            this.F = ku3Var;
                            this.r = zu4Var7;
                            this.s = zu4Var5;
                            this.t = zu4Var;
                            this.u = zu4Var3;
                            this.v = zu4Var4;
                            this.w = zu4Var2;
                            this.x = zu4Var6;
                            this.y = boolArr;
                            this.z = boolArr;
                            this.A = 2;
                            this.E = 3;
                            T2 = zu4Var3.T(this);
                            if (T2 != lu3Var) {
                                zu4Var8 = zu4Var5;
                                i3 = 2;
                                zu4Var9 = zu4Var;
                                zu4Var10 = zu4Var3;
                                zu4Var11 = zu4Var4;
                                zu4Var12 = zu4Var2;
                                zu4Var13 = zu4Var6;
                                boolArr2 = boolArr;
                                z3 = z2;
                                boolArr3 = boolArr2;
                                z4 = z3;
                                if (!((Boolean) T2).booleanValue()) {
                                    this.F = ku3Var;
                                    this.r = zu4Var7;
                                    this.s = zu4Var8;
                                    this.t = zu4Var9;
                                    this.u = zu4Var10;
                                    this.v = zu4Var11;
                                    this.w = zu4Var12;
                                    this.x = zu4Var13;
                                    this.y = boolArr2;
                                    this.z = boolArr;
                                    this.A = i3;
                                    this.E = 4;
                                    T3 = zu4Var11.T(this);
                                    boolArr6 = boolArr2;
                                    z7 = z3;
                                    break;
                                }
                                zu4 zu4Var31 = zu4Var8;
                                zu4Var14 = zu4Var10;
                                zu4Var15 = zu4Var31;
                                zu4Var16 = zu4Var11;
                                zu4Var17 = zu4Var7;
                                z5 = true;
                                boolArr4 = boolArr3;
                                z6 = z4;
                                boolArr[i3] = Boolean.valueOf(z5);
                                this.F = ku3Var;
                                this.r = zu4Var17;
                                this.s = zu4Var15;
                                this.t = zu4Var9;
                                this.u = zu4Var14;
                                this.v = zu4Var16;
                                this.w = zu4Var12;
                                this.x = zu4Var13;
                                this.y = boolArr4;
                                this.z = boolArr4;
                                this.A = 3;
                                this.E = 5;
                                T4 = zu4Var12.T(this);
                                if (T4 != lu3Var) {
                                    boolArr5 = boolArr4;
                                    zu4Var18 = zu4Var9;
                                    zu4Var19 = zu4Var15;
                                    zu4Var20 = zu4Var17;
                                    zu4Var21 = zu4Var12;
                                    zu4Var22 = zu4Var16;
                                    i4 = 3;
                                    r6 = boolArr4;
                                    z8 = z6;
                                    r6[i4] = T4;
                                    j = b.j(boolArr5);
                                    if (j == null && j.isEmpty()) {
                                        i5 = z8 ? 1 : 0;
                                        i6 = 1;
                                        r62 = 0;
                                    } else {
                                        it = j.iterator();
                                        i5 = z8 ? 1 : 0;
                                        while (it.hasNext()) {
                                            if (((Boolean) it.next()).booleanValue() && (i5 = i5 + 1) < 0) {
                                                b.p();
                                                throw null;
                                            }
                                        }
                                        r62 = 0;
                                        i6 = 1;
                                    }
                                    i7 = i5 <= i6 ? 1 : z8 ? 1 : 0;
                                    this.F = ku3Var;
                                    this.r = zu4Var20;
                                    this.s = r62;
                                    this.t = zu4Var18;
                                    this.u = zu4Var14;
                                    this.v = zu4Var22;
                                    this.w = zu4Var21;
                                    this.x = zu4Var13;
                                    this.y = r62;
                                    this.z = r62;
                                    this.A = i7;
                                    this.E = 6;
                                    T5 = zu4Var19.T(this);
                                    if (T5 != lu3Var) {
                                        zu4Var23 = zu4Var13;
                                        r11 = zu4Var20;
                                        zu4Var24 = zu4Var14;
                                        zu4Var25 = r62;
                                        z9 = z8;
                                        boolean booleanValue = ((Boolean) T5).booleanValue();
                                        this.F = ku3Var;
                                        this.r = r11;
                                        this.s = zu4Var25;
                                        this.t = zu4Var25;
                                        this.u = zu4Var24;
                                        this.v = zu4Var22;
                                        this.w = zu4Var21;
                                        this.x = zu4Var23;
                                        this.A = i7;
                                        this.C = booleanValue;
                                        this.E = 7;
                                        T6 = zu4Var18.T(this);
                                        if (T6 != lu3Var) {
                                            i8 = i7;
                                            z10 = booleanValue;
                                            zu4 zu4Var32 = zu4Var22;
                                            zu4Var26 = zu4Var24;
                                            zu4Var27 = zu4Var32;
                                            z11 = z9;
                                            boolean booleanValue2 = ((Boolean) T6).booleanValue();
                                            this.F = ku3Var;
                                            this.r = r11;
                                            this.s = null;
                                            this.t = null;
                                            this.u = null;
                                            this.v = zu4Var27;
                                            this.w = zu4Var21;
                                            this.x = zu4Var23;
                                            this.A = i8;
                                            this.C = z10;
                                            this.D = booleanValue2;
                                            this.E = 8;
                                            T7 = zu4Var26.T(this);
                                            if (T7 != lu3Var) {
                                                int i14 = i8;
                                                z12 = z10;
                                                z13 = booleanValue2;
                                                zu4Var28 = zu4Var23;
                                                i9 = i14;
                                                zu4 zu4Var33 = zu4Var21;
                                                zu4Var29 = zu4Var27;
                                                zu4Var30 = zu4Var33;
                                                z14 = z11;
                                                z15 = z14;
                                                if (!((Boolean) T7).booleanValue()) {
                                                    this.F = ku3Var;
                                                    this.r = r11;
                                                    this.s = null;
                                                    this.t = null;
                                                    this.u = null;
                                                    this.v = null;
                                                    this.w = zu4Var30;
                                                    this.x = zu4Var28;
                                                    this.A = i9;
                                                    this.C = z12;
                                                    this.D = z13;
                                                    this.E = 9;
                                                    T8 = zu4Var29.T(this);
                                                    z19 = z14;
                                                    break;
                                                }
                                                z16 = z13;
                                                i10 = 1;
                                                z17 = z15;
                                                this.F = ku3Var;
                                                this.r = r11;
                                                this.s = null;
                                                this.t = null;
                                                this.u = null;
                                                this.v = null;
                                                this.w = null;
                                                this.x = zu4Var28;
                                                this.A = i9;
                                                this.C = z12;
                                                this.D = z16;
                                                this.B = i10;
                                                this.E = 10;
                                                T9 = zu4Var30.T(this);
                                                if (T9 != lu3Var) {
                                                    z18 = z16;
                                                    av4Var2 = r11;
                                                    z20 = z17;
                                                    x4cVar = new x4c(i9 == 0 ? true : z20 ? 1 : 0, z12, z18, i10 == 0 ? true : z20 ? 1 : 0, ((Boolean) T9).booleanValue());
                                                    this.F = ku3Var;
                                                    this.r = av4Var2;
                                                    this.s = null;
                                                    this.t = null;
                                                    this.u = null;
                                                    this.v = null;
                                                    this.w = null;
                                                    this.x = null;
                                                    this.y = x4cVar;
                                                    this.E = 11;
                                                    T10 = zu4Var28.T(this);
                                                    av4Var3 = av4Var2;
                                                    z21 = z20;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return lu3Var;
                }
            case 1:
                i = this.A;
                Boolean[] boolArr7 = this.z;
                boolArr = (Boolean[]) this.y;
                ?? r63 = this.x;
                zu4Var2 = this.w;
                zu4Var4 = this.v;
                zu4Var3 = this.u;
                zu4Var = this.t;
                zu4Var5 = this.s;
                ?? r14 = this.r;
                y6a.M(obj);
                z = false;
                av4Var = r14;
                t2 = r63;
                w = obj;
                r4 = boolArr7;
                r4[i] = w;
                this.F = ku3Var;
                this.r = av4Var;
                this.s = zu4Var5;
                this.t = zu4Var;
                this.u = zu4Var3;
                this.v = zu4Var4;
                this.w = zu4Var2;
                this.x = t2;
                this.y = boolArr;
                this.z = boolArr;
                this.A = 1;
                this.E = 2;
                T = zu4Var.T(this);
                if (T != lu3Var) {
                }
                return lu3Var;
            case 2:
                int i15 = this.A;
                Boolean[] boolArr8 = this.z;
                boolArr = (Boolean[]) this.y;
                zu4Var6 = this.x;
                zu4Var2 = this.w;
                zu4Var4 = this.v;
                zu4Var3 = this.u;
                zu4Var = this.t;
                zu4Var5 = this.s;
                zu4Var7 = this.r;
                y6a.M(obj);
                z2 = false;
                i2 = i15;
                T = obj;
                r42 = boolArr8;
                r42[i2] = T;
                this.F = ku3Var;
                this.r = zu4Var7;
                this.s = zu4Var5;
                this.t = zu4Var;
                this.u = zu4Var3;
                this.v = zu4Var4;
                this.w = zu4Var2;
                this.x = zu4Var6;
                this.y = boolArr;
                this.z = boolArr;
                this.A = 2;
                this.E = 3;
                T2 = zu4Var3.T(this);
                if (T2 != lu3Var) {
                }
                return lu3Var;
            case 3:
                int i16 = this.A;
                Boolean[] boolArr9 = this.z;
                Boolean[] boolArr10 = (Boolean[]) this.y;
                zu4 zu4Var34 = this.x;
                zu4 zu4Var35 = this.w;
                zu4 zu4Var36 = this.v;
                zu4 zu4Var37 = this.u;
                zu4 zu4Var38 = this.t;
                zu4 zu4Var39 = this.s;
                zu4Var7 = this.r;
                y6a.M(obj);
                z3 = false;
                zu4Var8 = zu4Var39;
                zu4Var9 = zu4Var38;
                zu4Var10 = zu4Var37;
                zu4Var11 = zu4Var36;
                zu4Var12 = zu4Var35;
                zu4Var13 = zu4Var34;
                boolArr2 = boolArr10;
                boolArr = boolArr9;
                i3 = i16;
                T2 = obj;
                boolArr3 = boolArr2;
                z4 = z3;
                if (!((Boolean) T2).booleanValue()) {
                }
                zu4 zu4Var312 = zu4Var8;
                zu4Var14 = zu4Var10;
                zu4Var15 = zu4Var312;
                zu4Var16 = zu4Var11;
                zu4Var17 = zu4Var7;
                z5 = true;
                boolArr4 = boolArr3;
                z6 = z4;
                boolArr[i3] = Boolean.valueOf(z5);
                this.F = ku3Var;
                this.r = zu4Var17;
                this.s = zu4Var15;
                this.t = zu4Var9;
                this.u = zu4Var14;
                this.v = zu4Var16;
                this.w = zu4Var12;
                this.x = zu4Var13;
                this.y = boolArr4;
                this.z = boolArr4;
                this.A = 3;
                this.E = 5;
                T4 = zu4Var12.T(this);
                if (T4 != lu3Var) {
                }
                return lu3Var;
            case 4:
                int i17 = this.A;
                Boolean[] boolArr11 = this.z;
                Boolean[] boolArr12 = (Boolean[]) this.y;
                zu4 zu4Var40 = this.x;
                zu4 zu4Var41 = this.w;
                zu4Var11 = this.v;
                zu4Var10 = this.u;
                zu4Var9 = this.t;
                zu4 zu4Var42 = this.s;
                zu4 zu4Var43 = this.r;
                y6a.M(obj);
                z7 = false;
                zu4Var8 = zu4Var42;
                zu4Var7 = zu4Var43;
                zu4Var12 = zu4Var41;
                zu4Var13 = zu4Var40;
                boolArr6 = boolArr12;
                boolArr = boolArr11;
                i3 = i17;
                T3 = obj;
                boolArr3 = boolArr6;
                z4 = z7;
                if (!((Boolean) T3).booleanValue()) {
                    zu4 zu4Var44 = zu4Var8;
                    zu4Var14 = zu4Var10;
                    zu4Var15 = zu4Var44;
                    zu4Var16 = zu4Var11;
                    zu4Var17 = zu4Var7;
                    z5 = z7 ? 1 : 0;
                    boolArr4 = boolArr6;
                    z6 = z7;
                    boolArr[i3] = Boolean.valueOf(z5);
                    this.F = ku3Var;
                    this.r = zu4Var17;
                    this.s = zu4Var15;
                    this.t = zu4Var9;
                    this.u = zu4Var14;
                    this.v = zu4Var16;
                    this.w = zu4Var12;
                    this.x = zu4Var13;
                    this.y = boolArr4;
                    this.z = boolArr4;
                    this.A = 3;
                    this.E = 5;
                    T4 = zu4Var12.T(this);
                    if (T4 != lu3Var) {
                    }
                    return lu3Var;
                }
                zu4 zu4Var3122 = zu4Var8;
                zu4Var14 = zu4Var10;
                zu4Var15 = zu4Var3122;
                zu4Var16 = zu4Var11;
                zu4Var17 = zu4Var7;
                z5 = true;
                boolArr4 = boolArr3;
                z6 = z4;
                boolArr[i3] = Boolean.valueOf(z5);
                this.F = ku3Var;
                this.r = zu4Var17;
                this.s = zu4Var15;
                this.t = zu4Var9;
                this.u = zu4Var14;
                this.v = zu4Var16;
                this.w = zu4Var12;
                this.x = zu4Var13;
                this.y = boolArr4;
                this.z = boolArr4;
                this.A = 3;
                this.E = 5;
                T4 = zu4Var12.T(this);
                if (T4 != lu3Var) {
                }
                return lu3Var;
            case 5:
                i4 = this.A;
                Boolean[] boolArr13 = this.z;
                boolArr5 = (Boolean[]) this.y;
                zu4 zu4Var45 = this.x;
                zu4 zu4Var46 = this.w;
                zu4Var22 = this.v;
                zu4 zu4Var47 = this.u;
                zu4Var18 = this.t;
                zu4 zu4Var48 = this.s;
                zu4 zu4Var49 = this.r;
                y6a.M(obj);
                z8 = false;
                zu4Var14 = zu4Var47;
                zu4Var19 = zu4Var48;
                zu4Var20 = zu4Var49;
                zu4Var21 = zu4Var46;
                zu4Var13 = zu4Var45;
                r6 = boolArr13;
                T4 = obj;
                r6[i4] = T4;
                j = b.j(boolArr5);
                if (j == null) {
                    break;
                }
                it = j.iterator();
                i5 = z8 ? 1 : 0;
                while (it.hasNext()) {
                }
                r62 = 0;
                i6 = 1;
                if (i5 <= i6) {
                }
                this.F = ku3Var;
                this.r = zu4Var20;
                this.s = r62;
                this.t = zu4Var18;
                this.u = zu4Var14;
                this.v = zu4Var22;
                this.w = zu4Var21;
                this.x = zu4Var13;
                this.y = r62;
                this.z = r62;
                this.A = i7;
                this.E = 6;
                T5 = zu4Var19.T(this);
                if (T5 != lu3Var) {
                }
                return lu3Var;
            case 6:
                i7 = this.A;
                zu4 zu4Var50 = this.x;
                zu4 zu4Var51 = this.w;
                zu4 zu4Var52 = this.v;
                zu4Var24 = this.u;
                zu4 zu4Var53 = this.t;
                r11 = this.r;
                y6a.M(obj);
                zu4Var18 = zu4Var53;
                z9 = false;
                zu4Var22 = zu4Var52;
                zu4Var25 = null;
                zu4Var21 = zu4Var51;
                zu4Var23 = zu4Var50;
                T5 = obj;
                boolean booleanValue3 = ((Boolean) T5).booleanValue();
                this.F = ku3Var;
                this.r = r11;
                this.s = zu4Var25;
                this.t = zu4Var25;
                this.u = zu4Var24;
                this.v = zu4Var22;
                this.w = zu4Var21;
                this.x = zu4Var23;
                this.A = i7;
                this.C = booleanValue3;
                this.E = 7;
                T6 = zu4Var18.T(this);
                if (T6 != lu3Var) {
                }
                return lu3Var;
            case 7:
                z10 = this.C;
                i8 = this.A;
                zu4Var23 = this.x;
                zu4 zu4Var54 = this.w;
                zu4Var27 = this.v;
                zu4Var26 = this.u;
                r11 = this.r;
                y6a.M(obj);
                zu4Var21 = zu4Var54;
                z11 = false;
                T6 = obj;
                boolean booleanValue22 = ((Boolean) T6).booleanValue();
                this.F = ku3Var;
                this.r = r11;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = zu4Var27;
                this.w = zu4Var21;
                this.x = zu4Var23;
                this.A = i8;
                this.C = z10;
                this.D = booleanValue22;
                this.E = 8;
                T7 = zu4Var26.T(this);
                if (T7 != lu3Var) {
                }
                return lu3Var;
            case 8:
                z13 = this.D;
                z12 = this.C;
                i9 = this.A;
                zu4Var28 = this.x;
                zu4Var30 = this.w;
                zu4 zu4Var55 = this.v;
                r11 = this.r;
                y6a.M(obj);
                zu4Var29 = zu4Var55;
                z14 = false;
                T7 = obj;
                z15 = z14;
                if (!((Boolean) T7).booleanValue()) {
                }
                z16 = z13;
                i10 = 1;
                z17 = z15;
                this.F = ku3Var;
                this.r = r11;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = zu4Var28;
                this.A = i9;
                this.C = z12;
                this.D = z16;
                this.B = i10;
                this.E = 10;
                T9 = zu4Var30.T(this);
                if (T9 != lu3Var) {
                }
                return lu3Var;
            case 9:
                z13 = this.D;
                z12 = this.C;
                i9 = this.A;
                zu4Var28 = this.x;
                zu4Var30 = this.w;
                zu4 zu4Var56 = this.r;
                y6a.M(obj);
                r11 = zu4Var56;
                z19 = false;
                T8 = obj;
                z15 = z19;
                if (!((Boolean) T8).booleanValue()) {
                    z16 = z13;
                    i10 = z19 ? 1 : 0;
                    z17 = z19;
                    this.F = ku3Var;
                    this.r = r11;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.w = null;
                    this.x = zu4Var28;
                    this.A = i9;
                    this.C = z12;
                    this.D = z16;
                    this.B = i10;
                    this.E = 10;
                    T9 = zu4Var30.T(this);
                    if (T9 != lu3Var) {
                    }
                    return lu3Var;
                }
                z16 = z13;
                i10 = 1;
                z17 = z15;
                this.F = ku3Var;
                this.r = r11;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = zu4Var28;
                this.A = i9;
                this.C = z12;
                this.D = z16;
                this.B = i10;
                this.E = 10;
                T9 = zu4Var30.T(this);
                if (T9 != lu3Var) {
                }
                return lu3Var;
            case 10:
                i10 = this.B;
                boolean z22 = this.D;
                z12 = this.C;
                i9 = this.A;
                zu4Var28 = this.x;
                ?? r7 = this.r;
                y6a.M(obj);
                z18 = z22;
                z20 = false;
                av4Var2 = r7;
                T9 = obj;
                x4cVar = new x4c(i9 == 0 ? true : z20 ? 1 : 0, z12, z18, i10 == 0 ? true : z20 ? 1 : 0, ((Boolean) T9).booleanValue());
                this.F = ku3Var;
                this.r = av4Var2;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = x4cVar;
                this.E = 11;
                T10 = zu4Var28.T(this);
                av4Var3 = av4Var2;
                z21 = z20;
                break;
            case 11:
                x4cVar = (x4c) this.y;
                ?? r8 = this.r;
                y6a.M(obj);
                T10 = obj;
                z21 = false;
                av4Var3 = r8;
                boolean booleanValue4 = ((Boolean) T10).booleanValue();
                kp5 kp5Var = gec.e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : kp5Var) {
                    if (((Boolean) ((gec) obj3).b.invoke(x4cVar)).booleanValue()) {
                        arrayList3.add(obj3);
                    }
                }
                w41Var.n(new zbc(), new gk((Object) this.H, l6g.W(arrayList3), booleanValue4, 1));
                t = av4Var3;
                r17 = z21;
                zbcVar = (zbc) w41Var.l().a();
                if (zbcVar != null) {
                    ArrayList arrayList22 = new ArrayList(k13.r(gv9Var, 10));
                    it2 = gv9Var.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList s2 = k13.s(arrayList22);
                    this.F = null;
                    this.r = t;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.w = null;
                    this.x = null;
                    this.y = null;
                    this.E = 12;
                    u = m6k.u(s2, this);
                    break;
                }
                arrayList = null;
                if (arrayList != null) {
                }
                obj2 = null;
                this.F = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.E = 13;
                break;
            case 12:
                ?? r1 = this.r;
                y6a.M(obj);
                t = r1;
                u = obj;
                List list2 = (List) u;
                if (list2 != null) {
                    arrayList = k13.s(list2);
                    if (arrayList != null) {
                    }
                    obj2 = null;
                    this.F = null;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.w = null;
                    this.x = null;
                    this.y = null;
                    this.E = 13;
                    break;
                }
                arrayList = null;
                if (arrayList != null) {
                }
                obj2 = null;
                this.F = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.E = 13;
                break;
            case 13:
                y6a.M(obj);
                obj2 = null;
                w41Var.n(obj2, new dt(25));
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
