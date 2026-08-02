package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x4e {
    public final Object a;
    public final a7e b;
    public final k9 c;
    public final sj3 d;
    public final Function0 e;
    public final dad f;
    public final AtomicBoolean g;
    public final g62 h;
    public final y4e i;
    public final aea j;
    public final v98 k;

    public x4e(Object obj, a7e a7eVar, k9 k9Var, sj3 sj3Var, int i, c7e c7eVar, Function0 function0) {
        a7eVar.getClass();
        this.a = obj;
        this.b = a7eVar;
        this.c = k9Var;
        this.d = sj3Var;
        this.e = function0;
        this.f = new dad(27);
        this.g = new AtomicBoolean(false);
        rq3 rq3Var = null;
        this.h = ml4.g(-2, 6, null);
        this.i = new y4e(k9Var);
        aea a = bea.a();
        this.j = a;
        this.k = new v98(new va8(this, rq3Var, 29), y6a.K(new g2(a, new va8(this, rq3Var, 28), rq3Var, 18)));
    }

    public static void h(sfb sfbVar, Object obj, z6e z6eVar) {
        if (z6eVar == null) {
            sfbVar.toString();
            Objects.toString(obj);
        } else {
            sfbVar.toString();
            Objects.toString(obj);
            z6eVar.toString();
        }
    }

    public final Object a(v98 v98Var, sfb sfbVar, hoi hoiVar) {
        rq3 rq3Var = null;
        z88 K = y6a.K(new j98(v98Var, new m4e(null, this, sfbVar), rq3Var, 1));
        q41 q41Var = new q41(sfbVar, rq3Var, 4);
        K.getClass();
        Object collect = k53.W(new pog(new j98(K, q41Var, rq3Var, 0)), -1).collect(new nk0(26, this, sfbVar), hoiVar);
        return collect == lu3.a ? collect : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        o4e o4eVar;
        int i;
        y4e y4eVar;
        j2d j2dVar;
        try {
            if (sq3Var instanceof o4e) {
                o4eVar = (o4e) sq3Var;
                int i2 = o4eVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    o4eVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = o4eVar.t;
                    lu3 lu3Var = lu3.a;
                    i = o4eVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        y4e y4eVar2 = this.i;
                        j2d j2dVar2 = y4eVar2.a;
                        o4eVar.r = y4eVar2;
                        o4eVar.s = j2dVar2;
                        o4eVar.v = 1;
                        if (j2dVar2.e(o4eVar) == lu3Var) {
                            return lu3Var;
                        }
                        y4eVar = y4eVar2;
                        j2dVar = j2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2dVar = o4eVar.s;
                        y4eVar = o4eVar.r;
                        y6a.M(obj);
                    }
                    return y4eVar.b.a((tvk) ((g7h) this.f.b).d);
                }
            }
            return y4eVar.b.a((tvk) ((g7h) this.f.b).d);
        } finally {
            j2dVar.f(null);
        }
        o4eVar = new o4e(this, sq3Var);
        Object obj2 = o4eVar.t;
        lu3 lu3Var2 = lu3.a;
        i = o4eVar.v;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x011f, code lost:
    
        if (r15 == r1) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:53:0x013c, B:55:0x015a), top: B:52:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [h2d, x4e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h2d] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v8, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        p4e p4eVar;
        ?? r2;
        Object obj;
        y4e y4eVar;
        a5e a5eVar;
        sfb sfbVar;
        String str;
        a7e a7eVar;
        z6e z6eVar;
        j2d j2dVar;
        y4e y4eVar2;
        boolean c;
        j2d j2dVar2;
        z6e z6eVar2;
        h2d h2dVar;
        g62 g62Var;
        z3e d;
        try {
            try {
                if (sq3Var instanceof p4e) {
                    p4eVar = (p4e) sq3Var;
                    int i = p4eVar.w;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        p4eVar.w = i - Integer.MIN_VALUE;
                        Object obj2 = p4eVar.u;
                        lu3 lu3Var = lu3.a;
                        r2 = p4eVar.w;
                        y4e y4eVar3 = this.i;
                        Object obj3 = this.a;
                        switch (r2) {
                            case 0:
                                y6a.M(obj2);
                                j2d j2dVar3 = y4eVar3.a;
                                p4eVar.r = y4eVar3;
                                p4eVar.s = j2dVar3;
                                p4eVar.w = 1;
                                if (j2dVar3.e(p4eVar) != lu3Var) {
                                    obj = j2dVar3;
                                    y4eVar = y4eVar3;
                                    a5eVar = y4eVar.b;
                                    sfbVar = sfb.a;
                                    p4eVar.r = obj;
                                    p4eVar.s = null;
                                    p4eVar.w = 2;
                                    r2 = obj;
                                    if (k(a5eVar, sfbVar, p4eVar) == lu3Var) {
                                    }
                                    Unit unit = Unit.a;
                                    r2.f(null);
                                    y6e g = g(sfb.a, obj3);
                                    str = Build.ID;
                                    a7eVar = this.b;
                                    if (str != null && Log.isLoggable("Paging", 3)) {
                                        Objects.toString(obj3);
                                        Objects.toString(a7eVar);
                                    }
                                    p4eVar.r = null;
                                    p4eVar.w = 3;
                                    obj2 = a7eVar.c(g, p4eVar);
                                    break;
                                }
                                return lu3Var;
                            case 1:
                                Object obj4 = (h2d) p4eVar.s;
                                y4eVar = (y4e) p4eVar.r;
                                y6a.M(obj2);
                                obj = obj4;
                                a5eVar = y4eVar.b;
                                sfbVar = sfb.a;
                                p4eVar.r = obj;
                                p4eVar.s = null;
                                p4eVar.w = 2;
                                r2 = obj;
                                if (k(a5eVar, sfbVar, p4eVar) == lu3Var) {
                                }
                                Unit unit2 = Unit.a;
                                r2.f(null);
                                y6e g2 = g(sfb.a, obj3);
                                str = Build.ID;
                                a7eVar = this.b;
                                if (str != null) {
                                    Objects.toString(obj3);
                                    Objects.toString(a7eVar);
                                    break;
                                }
                                p4eVar.r = null;
                                p4eVar.w = 3;
                                obj2 = a7eVar.c(g2, p4eVar);
                                break;
                            case 2:
                                h2d h2dVar2 = (h2d) p4eVar.r;
                                y6a.M(obj2);
                                r2 = h2dVar2;
                                Unit unit22 = Unit.a;
                                r2.f(null);
                                y6e g22 = g(sfb.a, obj3);
                                str = Build.ID;
                                a7eVar = this.b;
                                if (str != null) {
                                }
                                p4eVar.r = null;
                                p4eVar.w = 3;
                                obj2 = a7eVar.c(g22, p4eVar);
                                break;
                            case 3:
                                y6a.M(obj2);
                                z6eVar = (z6e) obj2;
                                if (!(z6eVar instanceof z6e)) {
                                    zzl.b();
                                    return null;
                                }
                                j2dVar = y4eVar3.a;
                                p4eVar.r = z6eVar;
                                p4eVar.s = y4eVar3;
                                p4eVar.t = j2dVar;
                                p4eVar.w = 4;
                                if (j2dVar.e(p4eVar) != lu3Var) {
                                    y4eVar2 = y4eVar3;
                                    try {
                                        a5e a5eVar2 = y4eVar2.b;
                                        sfb sfbVar2 = sfb.a;
                                        c = a5eVar2.c(0, sfbVar2, z6eVar, obj3);
                                        ejg ejgVar = a5eVar2.i;
                                        ejgVar.C(sfbVar2, pfb.c);
                                        z6eVar.getClass();
                                        sfb sfbVar3 = sfb.b;
                                        pfb pfbVar = pfb.b;
                                        ejgVar.C(sfbVar3, pfbVar);
                                        if (z6eVar.b == null) {
                                            ejgVar.C(sfb.c, pfbVar);
                                        }
                                        if (c) {
                                            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                h(sfbVar2, obj3, null);
                                            }
                                            return Unit.a;
                                        }
                                        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                            h(sfbVar2, obj3, z6eVar);
                                        }
                                        j2dVar2 = y4eVar3.a;
                                        p4eVar.r = z6eVar;
                                        p4eVar.s = y4eVar3;
                                        p4eVar.t = j2dVar2;
                                        p4eVar.w = 5;
                                        if (j2dVar2.e(p4eVar) != lu3Var) {
                                            z6eVar2 = z6eVar;
                                            try {
                                                a5e a5eVar3 = y4eVar3.b;
                                                g62Var = this.h;
                                                d = a5eVar3.d(z6eVar2, sfb.a);
                                                p4eVar.r = z6eVar2;
                                                p4eVar.s = j2dVar2;
                                                p4eVar.t = null;
                                                p4eVar.w = 6;
                                                if (g62Var.q(p4eVar, d) != lu3Var) {
                                                    h2dVar = j2dVar2;
                                                    Unit unit3 = Unit.a;
                                                    return Unit.a;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                h2dVar = j2dVar2;
                                                throw th;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                return lu3Var;
                            case 4:
                                j2dVar = p4eVar.t;
                                y4eVar2 = (y4e) p4eVar.s;
                                z6e z6eVar3 = (z6e) p4eVar.r;
                                y6a.M(obj2);
                                z6eVar = z6eVar3;
                                a5e a5eVar22 = y4eVar2.b;
                                sfb sfbVar22 = sfb.a;
                                c = a5eVar22.c(0, sfbVar22, z6eVar, obj3);
                                ejg ejgVar2 = a5eVar22.i;
                                ejgVar2.C(sfbVar22, pfb.c);
                                z6eVar.getClass();
                                sfb sfbVar32 = sfb.b;
                                pfb pfbVar2 = pfb.b;
                                ejgVar2.C(sfbVar32, pfbVar2);
                                if (z6eVar.b == null) {
                                }
                                if (c) {
                                }
                                break;
                            case 5:
                                j2dVar2 = p4eVar.t;
                                y4eVar3 = (y4e) p4eVar.s;
                                z6eVar2 = (z6e) p4eVar.r;
                                y6a.M(obj2);
                                a5e a5eVar32 = y4eVar3.b;
                                g62Var = this.h;
                                d = a5eVar32.d(z6eVar2, sfb.a);
                                p4eVar.r = z6eVar2;
                                p4eVar.s = j2dVar2;
                                p4eVar.t = null;
                                p4eVar.w = 6;
                                if (g62Var.q(p4eVar, d) != lu3Var) {
                                }
                                return lu3Var;
                            case 6:
                                h2dVar = (h2d) p4eVar.s;
                                try {
                                    y6a.M(obj2);
                                    Unit unit32 = Unit.a;
                                    return Unit.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            case 7:
                                j2d j2dVar4 = p4eVar.t;
                                y4e y4eVar4 = (y4e) p4eVar.s;
                                z6e z6eVar4 = (z6e) p4eVar.r;
                                y6a.M(obj2);
                                try {
                                    y4eVar4.b.a((tvk) ((g7h) this.f.b).d);
                                    j2dVar4.f(null);
                                    z6eVar4.getClass();
                                    sfb sfbVar4 = sfb.a;
                                    throw null;
                                } catch (Throwable th3) {
                                    j2dVar4.f(null);
                                    throw th3;
                                }
                            case 8:
                                j2d j2dVar5 = p4eVar.t;
                                y4e y4eVar5 = (y4e) p4eVar.s;
                                z6e z6eVar5 = (z6e) p4eVar.r;
                                y6a.M(obj2);
                                a5e a5eVar4 = y4eVar5.b;
                                if (z6eVar5 == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            case 9:
                                h2d h2dVar3 = (h2d) p4eVar.r;
                                y6a.M(obj2);
                                Unit unit4 = Unit.a;
                                h2dVar3.f(null);
                                return Unit.a;
                            default:
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (r2) {
                }
            } finally {
            }
        } catch (Throwable th4) {
            f(null);
            throw th4;
        }
        p4eVar = new p4e(this, sq3Var);
        Object obj22 = p4eVar.u;
        lu3 lu3Var2 = lu3.a;
        r2 = p4eVar.w;
        y4e y4eVar32 = this.i;
        Object obj32 = this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0335, code lost:
    
        r3 = r8;
        r7 = r13;
        r13 = r14;
        r14 = r15;
        r8 = r19;
        r9 = r21;
        r15 = r2;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0307 A[Catch: all -> 0x0325, TRY_LEAVE, TryCatch #2 {all -> 0x0325, blocks: (B:163:0x02ef, B:165:0x0307), top: B:162:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x046c A[Catch: all -> 0x00da, TryCatch #6 {all -> 0x00da, blocks: (B:65:0x0455, B:67:0x046c, B:69:0x0473, B:70:0x0478, B:71:0x0476, B:72:0x047b, B:133:0x00c8), top: B:132:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r1v36, types: [h2d] */
    /* JADX WARN: Type inference failed for: r22v0, types: [x4e] */
    /* JADX WARN: Type inference failed for: r23v0, types: [h2d, sfb] */
    /* JADX WARN: Type inference failed for: r4v24, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v37, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v21, types: [h2d] */
    /* JADX WARN: Type inference failed for: r7v26, types: [h2d] */
    /* JADX WARN: Type inference failed for: r8v10, types: [l4h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sfb sfbVar, jw8 jw8Var, rq3 rq3Var) {
        q4e q4eVar;
        int i;
        dsf dsfVar;
        sfb sfbVar2;
        h2d h2dVar;
        jw8 jw8Var2;
        y4e y4eVar;
        int ordinal;
        fsf fsfVar;
        j2d j2dVar;
        y4e y4eVar2;
        sfb sfbVar3;
        jw8 jw8Var3;
        dsf dsfVar2;
        fsf fsfVar2;
        ?? r7;
        String str;
        Object i2;
        Object obj;
        j2d j2dVar2;
        asf asfVar;
        jw8 jw8Var4;
        y6e y6eVar;
        sfb sfbVar4;
        fsf fsfVar3;
        Object obj2;
        dsf dsfVar3;
        y4e y4eVar3;
        z6e z6eVar;
        asf asfVar2;
        sfb sfbVar5;
        jw8 jw8Var5;
        y6e y6eVar2;
        h2d h2dVar2;
        y4e y4eVar4;
        sfb sfbVar6;
        g62 g62Var;
        a7e a7eVar;
        z6e z6eVar2;
        j2d j2dVar3;
        ?? r4;
        z6e z6eVar3;
        y6e y6eVar3;
        a5e a5eVar;
        jw8 jw8Var6;
        z6e z6eVar4;
        y6e y6eVar4;
        dsf dsfVar4;
        jw8 jw8Var7;
        j2d j2dVar4;
        String str2;
        g62 g62Var2;
        Object i3;
        z3e d;
        ?? r8;
        z6e z6eVar5;
        z6e z6eVar6;
        Object obj3;
        Object obj4;
        g62 g62Var3 = this.h;
        int i4 = this.c.a;
        try {
            if (rq3Var instanceof q4e) {
                q4eVar = (q4e) rq3Var;
                int i5 = q4eVar.D;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    q4eVar.D = i5 - Integer.MIN_VALUE;
                    Object obj5 = q4eVar.B;
                    lu3 lu3Var = lu3.a;
                    i = q4eVar.D;
                    a7e a7eVar2 = this.b;
                    String str3 = "Paging";
                    y4e y4eVar5 = this.i;
                    switch (i) {
                        case 0:
                            y6a.M(obj5);
                            if (sfbVar == sfb.a) {
                                a70.p("Use doInitialLoad for LoadType == REFRESH");
                                return null;
                            }
                            dsfVar = new dsf();
                            j2d j2dVar5 = y4eVar5.a;
                            q4eVar.r = sfbVar;
                            q4eVar.s = jw8Var;
                            q4eVar.t = dsfVar;
                            q4eVar.u = y4eVar5;
                            q4eVar.v = j2dVar5;
                            q4eVar.D = 1;
                            if (j2dVar5.e(q4eVar) != lu3Var) {
                                sfbVar2 = sfbVar;
                                h2dVar = j2dVar5;
                                jw8Var2 = jw8Var;
                                y4eVar = y4eVar5;
                                try {
                                    a5e a5eVar2 = y4eVar.b;
                                    ArrayList arrayList = a5eVar2.c;
                                    ordinal = sfbVar2.ordinal();
                                    if (ordinal != 0) {
                                        throw new IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                                    }
                                    if (ordinal == 1) {
                                        int i6 = (a5eVar2.e + jw8Var2.b.c) - 1;
                                        if (i6 > arrayList.size() - 1) {
                                            dsfVar.a = ((i6 - (arrayList.size() - 1)) * i4) + dsfVar.a;
                                            i6 = arrayList.size() - 1;
                                        }
                                        if (i6 >= 0) {
                                            int i7 = 0;
                                            while (true) {
                                                ArrayList arrayList2 = arrayList;
                                                dsfVar.a += ((z6e) arrayList.get(i7)).a.size();
                                                if (i7 != i6) {
                                                    i7++;
                                                    arrayList = arrayList2;
                                                }
                                            }
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            throw new ndd();
                                        }
                                        int i8 = a5eVar2.e + jw8Var2.b.d + 1;
                                        if (i8 < 0) {
                                            dsfVar.a = ((-i8) * i4) + dsfVar.a;
                                            i8 = 0;
                                        }
                                        int size = arrayList.size() - 1;
                                        if (i8 <= size) {
                                            while (true) {
                                                dsfVar.a += ((z6e) arrayList.get(i8)).a.size();
                                                if (i8 != size) {
                                                    i8++;
                                                }
                                            }
                                        }
                                    }
                                    Unit unit = Unit.a;
                                    h2dVar.f(null);
                                    fsfVar = new fsf();
                                    j2dVar = y4eVar5.a;
                                    q4eVar.r = sfbVar2;
                                    q4eVar.s = jw8Var2;
                                    q4eVar.t = dsfVar;
                                    q4eVar.u = fsfVar;
                                    q4eVar.v = y4eVar5;
                                    q4eVar.w = j2dVar;
                                    q4eVar.x = fsfVar;
                                    q4eVar.D = 2;
                                    if (j2dVar.e(q4eVar) != lu3Var) {
                                        y4eVar2 = y4eVar5;
                                        sfbVar3 = sfbVar2;
                                        jw8Var3 = jw8Var2;
                                        dsfVar2 = dsfVar;
                                        fsfVar2 = fsfVar;
                                        try {
                                            a5e a5eVar3 = y4eVar2.b;
                                            str = "Use doInitialLoad for LoadType == REFRESH";
                                            i2 = i(a5eVar3, sfbVar3, jw8Var3.a, jw8Var3.b.a(sfbVar3) + dsfVar2.a);
                                            if (i2 != null) {
                                                obj = null;
                                                j2dVar.f(null);
                                                fsfVar.a = obj;
                                                asfVar = new asf();
                                                obj4 = fsfVar2.a;
                                                if (obj4 != null) {
                                                }
                                                return Unit.a;
                                            }
                                            q4eVar.r = sfbVar3;
                                            q4eVar.s = jw8Var3;
                                            q4eVar.t = dsfVar2;
                                            q4eVar.u = fsfVar2;
                                            q4eVar.v = j2dVar;
                                            q4eVar.w = i2;
                                            q4eVar.x = fsfVar;
                                            q4eVar.D = 3;
                                            if (k(a5eVar3, sfbVar3, q4eVar) != lu3Var) {
                                                obj = i2;
                                                j2dVar2 = j2dVar;
                                                j2dVar = j2dVar2;
                                                j2dVar.f(null);
                                                fsfVar.a = obj;
                                                asfVar = new asf();
                                                obj4 = fsfVar2.a;
                                                if (obj4 != null) {
                                                    y6e g = g(sfbVar3, obj4);
                                                    if (Build.ID != null && Log.isLoggable(str3, 3)) {
                                                        sfbVar3.toString();
                                                        Objects.toString(fsfVar2.a);
                                                        Objects.toString(a7eVar2);
                                                    }
                                                    q4eVar.r = sfbVar3;
                                                    q4eVar.s = jw8Var3;
                                                    q4eVar.t = dsfVar2;
                                                    q4eVar.u = fsfVar2;
                                                    q4eVar.v = asfVar;
                                                    q4eVar.w = g;
                                                    q4eVar.x = null;
                                                    q4eVar.y = null;
                                                    q4eVar.D = 4;
                                                    Object c = a7eVar2.c(g, q4eVar);
                                                    if (c != lu3Var) {
                                                        obj2 = c;
                                                        y6eVar = g;
                                                        sfbVar4 = sfbVar3;
                                                        dsfVar3 = dsfVar2;
                                                        jw8Var4 = jw8Var3;
                                                        fsfVar3 = fsfVar2;
                                                        z6eVar6 = (z6e) obj2;
                                                        if (!(z6eVar6 instanceof z6e)) {
                                                            zzl.b();
                                                            return null;
                                                        }
                                                        int ordinal2 = sfbVar4.ordinal();
                                                        if (ordinal2 == 1) {
                                                            obj3 = null;
                                                        } else {
                                                            if (ordinal2 != 2) {
                                                                a70.p(str);
                                                                return null;
                                                            }
                                                            obj3 = z6eVar6.b;
                                                        }
                                                        a7eVar2.getClass();
                                                        if (Intrinsics.c(obj3, fsfVar3.a)) {
                                                            hc5.f(dii.d("The same value, " + fsfVar3.a + ", was passed as the " + (sfbVar4 == sfb.b ? "prevKey" : "nextKey") + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "));
                                                            return null;
                                                        }
                                                        h2dVar2 = y4eVar5.a;
                                                        q4eVar.r = sfbVar4;
                                                        q4eVar.s = jw8Var4;
                                                        q4eVar.t = dsfVar3;
                                                        q4eVar.u = fsfVar3;
                                                        q4eVar.v = asfVar;
                                                        q4eVar.w = y6eVar;
                                                        q4eVar.x = z6eVar6;
                                                        q4eVar.y = y4eVar5;
                                                        q4eVar.z = h2dVar2;
                                                        q4eVar.D = 5;
                                                        if (h2dVar2.e(q4eVar) != lu3Var) {
                                                            y6eVar2 = y6eVar;
                                                            sfbVar5 = sfbVar4;
                                                            jw8Var5 = jw8Var4;
                                                            asfVar2 = asfVar;
                                                            z6eVar = z6eVar6;
                                                            y4eVar3 = y4eVar5;
                                                            try {
                                                                a7eVar = a7eVar2;
                                                                g62Var = g62Var3;
                                                                if (y4eVar3.b.c(jw8Var5.a, sfbVar5, z6eVar, fsfVar3.a)) {
                                                                    if (Build.ID != null && Log.isLoggable(str3, 3)) {
                                                                        h(sfbVar5, fsfVar3.a, z6eVar);
                                                                    }
                                                                    dsfVar3.a = z6eVar.a.size() + dsfVar3.a;
                                                                    sfb sfbVar7 = sfb.b;
                                                                    if (sfbVar5 == sfbVar7 || (sfbVar5 == sfb.c && z6eVar.b == null)) {
                                                                        asfVar2.a = true;
                                                                    }
                                                                    if (l4e.a[sfbVar5.ordinal()] == 2) {
                                                                        sfbVar7 = sfb.c;
                                                                    }
                                                                    j2dVar3 = y4eVar5.a;
                                                                    q4eVar.r = sfbVar5;
                                                                    q4eVar.s = jw8Var5;
                                                                    q4eVar.t = dsfVar3;
                                                                    q4eVar.u = fsfVar3;
                                                                    q4eVar.v = asfVar2;
                                                                    q4eVar.w = y6eVar2;
                                                                    q4eVar.x = z6eVar;
                                                                    q4eVar.y = sfbVar7;
                                                                    q4eVar.z = y4eVar5;
                                                                    q4eVar.A = j2dVar3;
                                                                    q4eVar.D = 8;
                                                                    if (j2dVar3.e(q4eVar) != lu3Var) {
                                                                        z6eVar2 = z6eVar;
                                                                        sfbVar6 = sfbVar7;
                                                                        y4eVar4 = y4eVar5;
                                                                        try {
                                                                            a5e a5eVar4 = y4eVar4.b;
                                                                            vvk vvkVar = jw8Var5.b;
                                                                            sfbVar6.getClass();
                                                                            vvkVar.getClass();
                                                                            z6eVar3 = z6eVar2;
                                                                            jw8Var6 = jw8Var5;
                                                                            a5eVar = a5eVar4;
                                                                            r4 = j2dVar3;
                                                                            y6eVar3 = y6eVar2;
                                                                            str2 = str3;
                                                                            i3 = i(a5eVar, sfbVar5, jw8Var6.a, jw8Var6.b.a(sfbVar5) + dsfVar3.a);
                                                                            ejg ejgVar = a5eVar.i;
                                                                            fsfVar3.a = i3;
                                                                            if (i3 == null) {
                                                                                ejgVar.h(sfbVar5);
                                                                                ejgVar.C(sfbVar5, asfVar2.a ? pfb.b : pfb.c);
                                                                            }
                                                                            d = a5eVar.d(z6eVar3, sfbVar5);
                                                                            q4eVar.r = sfbVar5;
                                                                            q4eVar.s = jw8Var6;
                                                                            q4eVar.t = dsfVar3;
                                                                            q4eVar.u = fsfVar3;
                                                                            q4eVar.v = asfVar2;
                                                                            q4eVar.w = y6eVar3;
                                                                            q4eVar.x = z6eVar3;
                                                                            q4eVar.y = r4;
                                                                            q4eVar.z = null;
                                                                            q4eVar.A = null;
                                                                            q4eVar.D = 10;
                                                                            r8 = g62Var;
                                                                            if (r8.q(q4eVar, d) != lu3Var) {
                                                                                j2dVar4 = r4;
                                                                                z6eVar4 = z6eVar3;
                                                                                y6eVar4 = y6eVar3;
                                                                                fsfVar2 = fsfVar3;
                                                                                dsfVar4 = dsfVar3;
                                                                                jw8Var7 = jw8Var6;
                                                                                g62Var2 = r8;
                                                                                try {
                                                                                    Unit unit2 = Unit.a;
                                                                                    j2dVar4.f(null);
                                                                                    if (y6eVar4 instanceof w6e) {
                                                                                        z6eVar4.getClass();
                                                                                    }
                                                                                    if (y6eVar4 instanceof v6e) {
                                                                                        Object obj6 = z6eVar4.b;
                                                                                    }
                                                                                    g62Var3 = g62Var2;
                                                                                    asfVar = asfVar2;
                                                                                    dsfVar2 = dsfVar4;
                                                                                    jw8Var3 = jw8Var7;
                                                                                    a7eVar2 = a7eVar;
                                                                                    str3 = str2;
                                                                                    sfbVar3 = sfbVar5;
                                                                                    obj4 = fsfVar2.a;
                                                                                    if (obj4 != null) {
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    j2dVar4.f(null);
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            j2dVar4 = j2dVar3;
                                                                            j2dVar4.f(null);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else if (Build.ID != null && Log.isLoggable(str3, 2)) {
                                                                    h(sfbVar5, fsfVar3.a, z6eVar5);
                                                                }
                                                            } finally {
                                                                h2dVar2.f(null);
                                                            }
                                                        }
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r7 = j2dVar;
                                            r7.f(null);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    h2dVar.f(null);
                                    throw th4;
                                }
                            }
                            return lu3Var;
                        case 1:
                            h2dVar = (h2d) q4eVar.v;
                            y4eVar = (y4e) q4eVar.u;
                            dsfVar = q4eVar.t;
                            jw8Var2 = q4eVar.s;
                            sfbVar2 = q4eVar.r;
                            y6a.M(obj5);
                            a5e a5eVar22 = y4eVar.b;
                            ArrayList arrayList3 = a5eVar22.c;
                            ordinal = sfbVar2.ordinal();
                            if (ordinal != 0) {
                            }
                            break;
                        case 2:
                            fsfVar = (fsf) q4eVar.x;
                            ?? r42 = (h2d) q4eVar.w;
                            y4eVar2 = (y4e) q4eVar.v;
                            fsfVar2 = (fsf) q4eVar.u;
                            dsfVar2 = q4eVar.t;
                            jw8Var3 = q4eVar.s;
                            sfbVar3 = q4eVar.r;
                            y6a.M(obj5);
                            j2dVar = r42;
                            a5e a5eVar32 = y4eVar2.b;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            i2 = i(a5eVar32, sfbVar3, jw8Var3.a, jw8Var3.b.a(sfbVar3) + dsfVar2.a);
                            if (i2 != null) {
                            }
                            break;
                        case 3:
                            fsfVar = (fsf) q4eVar.x;
                            obj = q4eVar.w;
                            r7 = (h2d) q4eVar.v;
                            fsfVar2 = (fsf) q4eVar.u;
                            dsfVar2 = q4eVar.t;
                            jw8Var3 = q4eVar.s;
                            sfbVar3 = q4eVar.r;
                            try {
                                y6a.M(obj5);
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                j2dVar2 = r7;
                                j2dVar = j2dVar2;
                                j2dVar.f(null);
                                fsfVar.a = obj;
                                asfVar = new asf();
                                obj4 = fsfVar2.a;
                                if (obj4 != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th5) {
                                th = th5;
                                r7.f(null);
                                throw th;
                            }
                        case 4:
                            y6e y6eVar5 = (y6e) q4eVar.w;
                            asf asfVar3 = (asf) q4eVar.v;
                            fsf fsfVar4 = (fsf) q4eVar.u;
                            dsf dsfVar5 = q4eVar.t;
                            jw8Var4 = q4eVar.s;
                            sfb sfbVar8 = q4eVar.r;
                            y6a.M(obj5);
                            y6eVar = y6eVar5;
                            sfbVar4 = sfbVar8;
                            fsfVar3 = fsfVar4;
                            asfVar = asfVar3;
                            obj2 = obj5;
                            dsfVar3 = dsfVar5;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            z6eVar6 = (z6e) obj2;
                            if (!(z6eVar6 instanceof z6e)) {
                            }
                            break;
                        case 5:
                            h2d h2dVar3 = (h2d) q4eVar.z;
                            y4eVar3 = (y4e) q4eVar.y;
                            z6eVar = (z6e) q4eVar.x;
                            y6e y6eVar6 = (y6e) q4eVar.w;
                            asfVar2 = (asf) q4eVar.v;
                            fsfVar3 = (fsf) q4eVar.u;
                            dsfVar3 = q4eVar.t;
                            jw8 jw8Var8 = q4eVar.s;
                            sfb sfbVar9 = q4eVar.r;
                            y6a.M(obj5);
                            sfbVar5 = sfbVar9;
                            jw8Var5 = jw8Var8;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            y6eVar2 = y6eVar6;
                            h2dVar2 = h2dVar3;
                            a7eVar = a7eVar2;
                            g62Var = g62Var3;
                            if (y4eVar3.b.c(jw8Var5.a, sfbVar5, z6eVar, fsfVar3.a)) {
                            }
                            break;
                        case 6:
                            y4e y4eVar6 = (y4e) q4eVar.u;
                            z6e z6eVar7 = (z6e) q4eVar.t;
                            y6a.M(obj5);
                            a5e a5eVar5 = y4eVar6.b;
                            if (z6eVar7 == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        case 7:
                            a5e a5eVar6 = (a5e) q4eVar.u;
                            h2d h2dVar4 = (h2d) q4eVar.t;
                            jw8 jw8Var9 = q4eVar.s;
                            sfb sfbVar10 = q4eVar.r;
                            y6a.M(obj5);
                            a5eVar6.h.put(sfbVar10, jw8Var9.b);
                            Unit unit3 = Unit.a;
                            h2dVar4.f(null);
                            return Unit.a;
                        case 8:
                            j2d j2dVar6 = q4eVar.A;
                            y4eVar4 = (y4e) q4eVar.z;
                            sfbVar6 = (sfb) q4eVar.y;
                            z6e z6eVar8 = (z6e) q4eVar.x;
                            y6e y6eVar7 = (y6e) q4eVar.w;
                            asf asfVar4 = (asf) q4eVar.v;
                            fsf fsfVar5 = (fsf) q4eVar.u;
                            dsf dsfVar6 = q4eVar.t;
                            jw8 jw8Var10 = q4eVar.s;
                            sfb sfbVar11 = q4eVar.r;
                            y6a.M(obj5);
                            sfbVar5 = sfbVar11;
                            g62Var = g62Var3;
                            a7eVar = a7eVar2;
                            z6eVar2 = z6eVar8;
                            jw8Var5 = jw8Var10;
                            j2dVar3 = j2dVar6;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            y6eVar2 = y6eVar7;
                            asfVar2 = asfVar4;
                            fsfVar3 = fsfVar5;
                            dsfVar3 = dsfVar6;
                            a5e a5eVar42 = y4eVar4.b;
                            vvk vvkVar2 = jw8Var5.b;
                            sfbVar6.getClass();
                            vvkVar2.getClass();
                            z6eVar3 = z6eVar2;
                            jw8Var6 = jw8Var5;
                            a5eVar = a5eVar42;
                            r4 = j2dVar3;
                            y6eVar3 = y6eVar2;
                            str2 = str3;
                            i3 = i(a5eVar, sfbVar5, jw8Var6.a, jw8Var6.b.a(sfbVar5) + dsfVar3.a);
                            ejg ejgVar2 = a5eVar.i;
                            fsfVar3.a = i3;
                            if (i3 == null) {
                            }
                            d = a5eVar.d(z6eVar3, sfbVar5);
                            q4eVar.r = sfbVar5;
                            q4eVar.s = jw8Var6;
                            q4eVar.t = dsfVar3;
                            q4eVar.u = fsfVar3;
                            q4eVar.v = asfVar2;
                            q4eVar.w = y6eVar3;
                            q4eVar.x = z6eVar3;
                            q4eVar.y = r4;
                            q4eVar.z = null;
                            q4eVar.A = null;
                            q4eVar.D = 10;
                            r8 = g62Var;
                            if (r8.q(q4eVar, d) != lu3Var) {
                            }
                            return lu3Var;
                        case 9:
                            a5e a5eVar7 = (a5e) q4eVar.z;
                            r4 = (h2d) q4eVar.y;
                            z6eVar3 = (z6e) q4eVar.x;
                            y6eVar3 = (y6e) q4eVar.w;
                            asfVar2 = (asf) q4eVar.v;
                            fsfVar3 = (fsf) q4eVar.u;
                            dsfVar3 = q4eVar.t;
                            jw8 jw8Var11 = q4eVar.s;
                            sfb sfbVar12 = q4eVar.r;
                            try {
                                y6a.M(obj5);
                                Unit unit4 = Unit.a;
                                sfbVar5 = sfbVar12;
                                g62Var = g62Var3;
                                a7eVar = a7eVar2;
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                a5eVar = a5eVar7;
                                jw8Var6 = jw8Var11;
                                r4 = r4;
                                str2 = str3;
                                i3 = i(a5eVar, sfbVar5, jw8Var6.a, jw8Var6.b.a(sfbVar5) + dsfVar3.a);
                                ejg ejgVar22 = a5eVar.i;
                                fsfVar3.a = i3;
                                if (i3 == null) {
                                }
                                d = a5eVar.d(z6eVar3, sfbVar5);
                                q4eVar.r = sfbVar5;
                                q4eVar.s = jw8Var6;
                                q4eVar.t = dsfVar3;
                                q4eVar.u = fsfVar3;
                                q4eVar.v = asfVar2;
                                q4eVar.w = y6eVar3;
                                q4eVar.x = z6eVar3;
                                q4eVar.y = r4;
                                q4eVar.z = null;
                                q4eVar.A = null;
                                q4eVar.D = 10;
                                r8 = g62Var;
                                if (r8.q(q4eVar, d) != lu3Var) {
                                }
                                return lu3Var;
                            } catch (Throwable th6) {
                                th = th6;
                                j2dVar4 = r4;
                                j2dVar4.f(null);
                                throw th;
                            }
                        case 10:
                            ?? r1 = (h2d) q4eVar.y;
                            z6eVar4 = (z6e) q4eVar.x;
                            y6eVar4 = (y6e) q4eVar.w;
                            asf asfVar5 = (asf) q4eVar.v;
                            fsf fsfVar6 = (fsf) q4eVar.u;
                            dsfVar4 = q4eVar.t;
                            jw8Var7 = q4eVar.s;
                            sfb sfbVar13 = q4eVar.r;
                            try {
                                y6a.M(obj5);
                                asfVar2 = asfVar5;
                                fsfVar2 = fsfVar6;
                                sfbVar5 = sfbVar13;
                                a7eVar = a7eVar2;
                                str2 = "Paging";
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                j2dVar4 = r1;
                                g62Var2 = g62Var3;
                                Unit unit22 = Unit.a;
                                j2dVar4.f(null);
                                if (y6eVar4 instanceof w6e) {
                                }
                                if (y6eVar4 instanceof v6e) {
                                }
                                g62Var3 = g62Var2;
                                asfVar = asfVar2;
                                dsfVar2 = dsfVar4;
                                jw8Var3 = jw8Var7;
                                a7eVar2 = a7eVar;
                                str3 = str2;
                                sfbVar3 = sfbVar5;
                                obj4 = fsfVar2.a;
                                if (obj4 != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th7) {
                                th = th7;
                                j2dVar4 = r1;
                                j2dVar4.f(null);
                                throw th;
                            }
                        case 11:
                            h2d h2dVar5 = (h2d) q4eVar.x;
                            y4e y4eVar7 = (y4e) q4eVar.w;
                            asfVar = (asf) q4eVar.v;
                            fsfVar2 = (fsf) q4eVar.u;
                            dsfVar2 = q4eVar.t;
                            jw8Var3 = q4eVar.s;
                            sfbVar3 = q4eVar.r;
                            y6a.M(obj5);
                            try {
                                y4eVar7.b.a((tvk) ((g7h) this.f.b).d);
                                h2dVar5.f(null);
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                obj4 = fsfVar2.a;
                                if (obj4 != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th8) {
                                h2dVar5.f(null);
                                throw th8;
                            }
                        default:
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (Throwable th9) {
            sfbVar.f(null);
            throw th9;
        }
        q4eVar = new q4e(this, rq3Var);
        Object obj52 = q4eVar.B;
        lu3 lu3Var2 = lu3.a;
        i = q4eVar.D;
        a7e a7eVar22 = this.b;
        String str32 = "Paging";
        y4e y4eVar52 = this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:11:0x0051, B:13:0x0065, B:14:0x0094, B:19:0x0084), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:11:0x0051, B:13:0x0065, B:14:0x0094, B:19:0x0084), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sfb sfbVar, sq3 sq3Var) {
        r4e r4eVar;
        int i;
        j2d j2dVar;
        y4e y4eVar;
        try {
            if (sq3Var instanceof r4e) {
                r4eVar = (r4e) sq3Var;
                int i2 = r4eVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    r4eVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = r4eVar.u;
                    lu3 lu3Var = lu3.a;
                    i = r4eVar.w;
                    if (i != 0) {
                        y6a.M(obj);
                        if (sfbVar == sfb.a) {
                            a70.p("Called for REFRESH but this should only be called for either APPEND or PREPEND loads. This error indicates a bug in the Paging library. Please file a bug report in Buganizer.");
                            return null;
                        }
                        y4e y4eVar2 = this.i;
                        j2dVar = y4eVar2.a;
                        r4eVar.r = sfbVar;
                        r4eVar.s = y4eVar2;
                        r4eVar.t = j2dVar;
                        r4eVar.w = 1;
                        if (j2dVar.e(r4eVar) == lu3Var) {
                            return lu3Var;
                        }
                        y4eVar = y4eVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2d j2dVar2 = r4eVar.t;
                        y4eVar = r4eVar.s;
                        sfb sfbVar2 = r4eVar.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        sfbVar = sfbVar2;
                    }
                    a5e a5eVar = y4eVar.b;
                    int i3 = a5eVar.e;
                    ArrayList arrayList = a5eVar.c;
                    int i4 = -i3;
                    int size = (arrayList.size() - a5eVar.e) - 1;
                    this.f.u(sfbVar, sfbVar != sfb.c ? new tvk(size, b.i(((z6e) CollectionsKt.h0(arrayList)).a), a5eVar.b() - 1, 0, i4, size) : new tvk(i4, 0, 0, a5eVar.b() - 1, i4, size));
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            a5e a5eVar2 = y4eVar.b;
            int i32 = a5eVar2.e;
            ArrayList arrayList2 = a5eVar2.c;
            int i42 = -i32;
            int size2 = (arrayList2.size() - a5eVar2.e) - 1;
            this.f.u(sfbVar, sfbVar != sfb.c ? new tvk(size2, b.i(((z6e) CollectionsKt.h0(arrayList2)).a), a5eVar2.b() - 1, 0, i42, size2) : new tvk(i42, 0, 0, a5eVar2.b() - 1, i42, size2));
            Unit unit2 = Unit.a;
            j2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        r4eVar = new r4e(this, sq3Var);
        Object obj2 = r4eVar.u;
        lu3 lu3Var2 = lu3.a;
        i = r4eVar.w;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004d, B:13:0x0062, B:17:0x006b), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004d, B:13:0x0062, B:17:0x006b), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(z6e z6eVar, sq3 sq3Var) {
        s4e s4eVar;
        int i;
        z6e z6eVar2;
        y4e y4eVar;
        j2d j2dVar;
        int hashCode;
        LinkedHashMap linkedHashMap;
        Object obj;
        try {
            if (sq3Var instanceof s4e) {
                s4eVar = (s4e) sq3Var;
                int i2 = s4eVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    s4eVar.w = i2 - Integer.MIN_VALUE;
                    Object obj2 = s4eVar.u;
                    lu3 lu3Var = lu3.a;
                    i = s4eVar.w;
                    if (i != 0) {
                        y6a.M(obj2);
                        y4e y4eVar2 = this.i;
                        j2d j2dVar2 = y4eVar2.a;
                        s4eVar.r = z6eVar;
                        s4eVar.s = y4eVar2;
                        s4eVar.t = j2dVar2;
                        s4eVar.w = 1;
                        if (j2dVar2.e(s4eVar) == lu3Var) {
                            return lu3Var;
                        }
                        z6eVar2 = z6eVar;
                        y4eVar = y4eVar2;
                        j2dVar = j2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2dVar = s4eVar.t;
                        y4eVar = s4eVar.s;
                        z6eVar2 = s4eVar.r;
                        y6a.M(obj2);
                    }
                    a5e a5eVar = y4eVar.b;
                    z6eVar2.getClass();
                    hashCode = z6eVar2.hashCode();
                    linkedHashMap = a5eVar.d;
                    if (linkedHashMap.containsKey(Integer.valueOf(hashCode))) {
                        sw9.o(z6eVar2, ". This likely indicates an error in the library. Please file a bug in the Buganizer.", "Load key not found for Page ");
                        obj = null;
                    } else {
                        obj = linkedHashMap.get(Integer.valueOf(hashCode));
                    }
                    return obj;
                }
            }
            a5e a5eVar2 = y4eVar.b;
            z6eVar2.getClass();
            hashCode = z6eVar2.hashCode();
            linkedHashMap = a5eVar2.d;
            if (linkedHashMap.containsKey(Integer.valueOf(hashCode))) {
            }
            return obj;
        } finally {
            j2dVar.f(null);
        }
        s4eVar = new s4e(this, sq3Var);
        Object obj22 = s4eVar.u;
        lu3 lu3Var2 = lu3.a;
        i = s4eVar.w;
        if (i != 0) {
        }
    }

    public final y6e g(sfb sfbVar, Object obj) {
        sfb sfbVar2 = sfb.a;
        sfbVar.getClass();
        int ordinal = sfbVar.ordinal();
        if (ordinal == 0) {
            return new x6e(obj);
        }
        if (ordinal == 1) {
            if (obj != null) {
                return new w6e(obj);
            }
            a70.p("key cannot be null for prepend");
            return null;
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        if (obj != null) {
            return new v6e(obj);
        }
        a70.p("key cannot be null for append");
        return null;
    }

    public final Object i(a5e a5eVar, sfb sfbVar, int i, int i2) {
        a5eVar.getClass();
        int ordinal = sfbVar.ordinal();
        if (ordinal == 0) {
            a70.p("Cannot get loadId for loadType: REFRESH");
            return null;
        }
        if (ordinal != 1 && ordinal != 2) {
            zzl.b();
            return null;
        }
        if (i == 0) {
            a5eVar.i.h(sfbVar);
            if (i2 < this.c.b) {
                sfb sfbVar2 = sfb.b;
                ArrayList arrayList = a5eVar.c;
                if (sfbVar != sfbVar2) {
                    return ((z6e) CollectionsKt.h0(arrayList)).b;
                }
                ((z6e) CollectionsKt.Y(arrayList)).getClass();
                return null;
            }
        }
        return null;
    }

    public final Object j(sfb sfbVar, vvk vvkVar, v4e v4eVar) {
        if (l4e.a[sfbVar.ordinal()] == 1) {
            Object c = c(v4eVar);
            return c == lu3.a ? c : Unit.a;
        }
        if (vvkVar != null) {
            this.f.u(sfbVar, vvkVar);
            return Unit.a;
        }
        a70.r("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        return null;
    }

    public final Object k(a5e a5eVar, sfb sfbVar, sq3 sq3Var) {
        ejg ejgVar = a5eVar.i;
        qfb h = ejgVar.h(sfbVar);
        ofb ofbVar = ofb.b;
        if (h.equals(ofbVar)) {
            return Unit.a;
        }
        ejgVar.C(sfbVar, ofbVar);
        Object q = this.h.q(sq3Var, new a4e(ejgVar.F(), null));
        return q == lu3.a ? q : Unit.a;
    }

    public final void l(ku3 ku3Var) {
        rq3 rq3Var = null;
        xw3.L(ku3Var, null, null, new w4e(this, rq3Var, 0), 3);
        xw3.L(ku3Var, null, null, new w4e(this, rq3Var, 1), 3);
    }
}
