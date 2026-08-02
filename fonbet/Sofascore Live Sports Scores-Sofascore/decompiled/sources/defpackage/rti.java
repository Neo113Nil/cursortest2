package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rti {
    public static final xf2 a = new xf2(3, null, 4);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.noi r5, boolean r6, defpackage.gze r7, defpackage.rq3 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.iti
            if (r0 == 0) goto L13
            r0 = r8
            iti r0 = (defpackage.iti) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            iti r0 = new iti
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            lu3 r1 = defpackage.lu3.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.t
            gze r6 = r0.s
            noi r7 = r0.r
            defpackage.y6a.M(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.a70.r(r5)
            r5 = 0
            return r5
        L38:
            defpackage.y6a.M(r8)
        L3b:
            r0.r = r5
            r0.s = r7
            r0.t = r6
            r0.v = r3
            java.lang.Object r8 = r5.b(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            fze r8 = (defpackage.fze) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rti.a(noi, boolean, gze, rq3):java.lang.Object");
    }

    public static /* synthetic */ Object b(noi noiVar, rq3 rq3Var, int i) {
        gze gzeVar = gze.a;
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            gzeVar = gze.b;
        }
        return a(noiVar, z, gzeVar, rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[LOOP:0: B:11:0x004a->B:12:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(noi noiVar, sq3 sq3Var) {
        jti jtiVar;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (sq3Var instanceof jti) {
            jtiVar = (jti) sq3Var;
            int i4 = jtiVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jtiVar.t = i4 - Integer.MIN_VALUE;
                Object obj = jtiVar.s;
                lu3 lu3Var = lu3.a;
                i = jtiVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    jtiVar.r = noiVar;
                    jtiVar.t = 1;
                    obj = noiVar.b(gze.b, jtiVar);
                    if (obj == lu3Var) {
                    }
                    fze fzeVar = (fze) obj;
                    List list = fzeVar.a;
                    size = list.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List list2 = fzeVar.a;
                    size2 = list2.size();
                    while (i2 < size2) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                noiVar = jtiVar.r;
                y6a.M(obj);
                fze fzeVar2 = (fze) obj;
                List list3 = fzeVar2.a;
                size = list3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    ((mze) list3.get(i3)).a();
                }
                List list22 = fzeVar2.a;
                size2 = list22.size();
                while (i2 < size2) {
                    if (((mze) list22.get(i2)).d) {
                        jtiVar.r = noiVar;
                        jtiVar.t = 1;
                        obj = noiVar.b(gze.b, jtiVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        fze fzeVar22 = (fze) obj;
                        List list32 = fzeVar22.a;
                        size = list32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List list222 = fzeVar22.a;
                        size2 = list222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return Unit.a;
            }
        }
        jtiVar = new jti(sq3Var);
        Object obj2 = jtiVar.s;
        lu3 lu3Var2 = lu3.a;
        i = jtiVar.t;
        if (i != 0) {
        }
    }

    public static Object d(qze qzeVar, vsc vscVar, Function1 function1, rq3 rq3Var, int i) {
        if ((i & 2) != 0) {
            vscVar = null;
        }
        Object r = s9a.r(new jk((Object) qzeVar, (Object) null, (Object) vscVar, (Object) a, (dt8) function1, (rq3) null, 22), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    public static boolean e(fze fzeVar, boolean z) {
        List list = fzeVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mze mzeVar = (mze) list.get(i);
            if (!(z ? qea.k(mzeVar) : qea.l(mzeVar))) {
                return false;
            }
        }
        return true;
    }

    public static g9i f(ku3 ku3Var, yda ydaVar, Function2 function2) {
        return xw3.L(ku3Var, null, nu3.d, new h4i(ydaVar, function2, (rq3) null, 10), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0151  */
    /* JADX WARN: Type inference failed for: r11v1, types: [rq3] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, rq3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(noi noiVar, ku3 ku3Var, j6f j6fVar, Function1 function1, Function1 function12, ct8 ct8Var, Function1 function13, h21 h21Var) {
        oti otiVar;
        int i;
        Object obj;
        j6f j6fVar2;
        Function1 function14;
        Function1 function15;
        ku3 ku3Var2;
        noi noiVar2;
        ct8 ct8Var2;
        Function1 function16;
        ?? r11;
        mze mzeVar;
        j6f j6fVar3;
        ct8 ct8Var3;
        yda ydaVar;
        Function1 function17;
        j6f j6fVar4;
        noi noiVar3;
        Function1 function18;
        Function1 function19;
        ct8 ct8Var4;
        noi noiVar4;
        ku3 ku3Var3;
        j6f j6fVar5;
        Function1 function110;
        Function1 function111;
        Function1 function112;
        rq3 rq3Var;
        mze mzeVar2;
        rq3 rq3Var2;
        g9i f;
        Function1 function113;
        ct8 ct8Var5;
        noi noiVar5;
        Function1 function114;
        j6f j6fVar6;
        Function1 function115;
        mze mzeVar3;
        yda ydaVar2;
        akb akbVar;
        j6f j6fVar7;
        ku3 ku3Var4;
        rq3 rq3Var3;
        rq3 rq3Var4;
        mze mzeVar4;
        zjb zjbVar;
        mze mzeVar5;
        j6f j6fVar8;
        Function1 function116;
        j6f j6fVar9;
        yda ydaVar3;
        mze mzeVar6;
        yda ydaVar4;
        mze mzeVar7;
        Function1 function117;
        ku3 ku3Var5;
        Function1 function118;
        rq3 rq3Var5;
        mze mzeVar8;
        rq3 rq3Var6;
        ?? r112;
        akb akbVar2;
        yda ydaVar5;
        ku3 ku3Var6;
        j6f j6fVar10;
        rq3 rq3Var7;
        if (h21Var instanceof oti) {
            otiVar = (oti) h21Var;
            int i2 = otiVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                otiVar.B = i2 - Integer.MIN_VALUE;
                Object obj2 = otiVar.A;
                lu3 lu3Var = lu3.a;
                i = otiVar.B;
                zjb zjbVar2 = zjb.a;
                xf2 xf2Var = a;
                int i3 = 1;
                switch (i) {
                    case 0:
                        obj = null;
                        y6a.M(obj2);
                        otiVar.r = noiVar;
                        otiVar.s = ku3Var;
                        j6fVar2 = j6fVar;
                        otiVar.t = j6fVar2;
                        otiVar.u = function1;
                        function14 = function12;
                        otiVar.v = function14;
                        otiVar.w = ct8Var;
                        function15 = function13;
                        otiVar.x = function15;
                        otiVar.B = 1;
                        Object b = b(noiVar, otiVar, 3);
                        if (b != lu3Var) {
                            ku3Var2 = ku3Var;
                            obj2 = b;
                            noiVar2 = noiVar;
                            ct8Var2 = ct8Var;
                            function16 = function1;
                            mze mzeVar9 = (mze) obj2;
                            mzeVar9.a();
                            r11 = 0;
                            rq3Var = null;
                            g9i L = xw3.L(ku3Var2, null, nu3.d, new mti(j6fVar2, r11, i3), 1);
                            if (ct8Var2 == xf2Var) {
                                j6f j6fVar11 = j6fVar2;
                                kti ktiVar = new kti(ct8Var2, j6fVar11, mzeVar9, r11, 1);
                                j6fVar3 = j6fVar11;
                                mzeVar = mzeVar9;
                                f(ku3Var2, L, ktiVar);
                            } else {
                                j6f j6fVar12 = j6fVar2;
                                mzeVar = mzeVar9;
                                j6fVar3 = j6fVar12;
                            }
                            if (function14 != null) {
                                otiVar.r = noiVar2;
                                otiVar.s = ku3Var2;
                                otiVar.t = j6fVar3;
                                otiVar.u = function16;
                                otiVar.v = function14;
                                otiVar.w = ct8Var2;
                                otiVar.x = function15;
                                otiVar.y = L;
                                otiVar.B = 2;
                                Object i4 = i(noiVar2, gze.b, otiVar);
                                if (i4 != lu3Var) {
                                    Function1 function119 = function14;
                                    ct8Var4 = ct8Var2;
                                    ydaVar = L;
                                    noiVar4 = noiVar2;
                                    ku3Var3 = ku3Var2;
                                    j6fVar5 = j6fVar3;
                                    obj2 = i4;
                                    function110 = function15;
                                    function111 = function16;
                                    function112 = function119;
                                    mzeVar2 = (mze) obj2;
                                    rq3Var2 = rq3Var;
                                    if (mzeVar2 == null) {
                                        f = f(ku3Var3, ydaVar, new lti(j6fVar5, rq3Var2, 3));
                                    } else {
                                        mzeVar2.a();
                                        f = f(ku3Var3, ydaVar, new lti(j6fVar5, rq3Var2, 4));
                                    }
                                    if (mzeVar2 != null) {
                                        if (function111 != null) {
                                            otiVar.r = noiVar4;
                                            otiVar.s = ku3Var3;
                                            otiVar.t = j6fVar5;
                                            otiVar.u = function111;
                                            otiVar.v = function112;
                                            otiVar.w = ct8Var4;
                                            otiVar.x = function110;
                                            otiVar.y = mzeVar2;
                                            otiVar.z = f;
                                            otiVar.B = 5;
                                            g9i g9iVar = f;
                                            Object g = noiVar4.g(noiVar4.e().a(), new b3h(mzeVar2, rq3Var2), otiVar);
                                            if (g != lu3Var) {
                                                function113 = function111;
                                                ct8Var5 = ct8Var4;
                                                noiVar5 = noiVar4;
                                                function114 = function112;
                                                j6fVar6 = j6fVar5;
                                                function115 = function110;
                                                mzeVar3 = mzeVar2;
                                                obj2 = g;
                                                ydaVar2 = g9iVar;
                                                rq3Var4 = rq3Var2;
                                                mzeVar4 = (mze) obj2;
                                                if (mzeVar4 == null) {
                                                    zjbVar = zjbVar2;
                                                    g9i L2 = xw3.L(ku3Var3, rq3Var4, nu3.d, new vki(ydaVar2, j6fVar6, rq3Var4, 7), 1);
                                                    if (ct8Var5 != xf2Var) {
                                                        j6f j6fVar13 = j6fVar6;
                                                        kti ktiVar2 = new kti(ct8Var5, j6fVar13, mzeVar4, rq3Var4, 2);
                                                        j6fVar8 = j6fVar13;
                                                        mzeVar5 = mzeVar4;
                                                        f(ku3Var3, L2, ktiVar2);
                                                    } else {
                                                        mzeVar5 = mzeVar4;
                                                        j6fVar8 = j6fVar6;
                                                    }
                                                    if (function114 == null) {
                                                        otiVar.r = ku3Var3;
                                                        otiVar.s = j6fVar8;
                                                        otiVar.t = function113;
                                                        otiVar.u = function115;
                                                        otiVar.v = L2;
                                                        otiVar.w = mzeVar3;
                                                        otiVar.x = rq3Var4;
                                                        otiVar.y = rq3Var4;
                                                        otiVar.z = rq3Var4;
                                                        otiVar.B = 6;
                                                        obj2 = i(noiVar5, gze.b, otiVar);
                                                        if (obj2 != lu3Var) {
                                                            ydaVar4 = L2;
                                                            mzeVar7 = mzeVar3;
                                                            function117 = function115;
                                                            ku3Var5 = ku3Var3;
                                                            function118 = function113;
                                                            rq3Var5 = rq3Var4;
                                                            mzeVar8 = (mze) obj2;
                                                            rq3Var6 = rq3Var5;
                                                            if (mzeVar8 != null) {
                                                                mzeVar8.a();
                                                                f(ku3Var5, ydaVar4, new lti(j6fVar8, rq3Var6, 5));
                                                                function118.invoke(new dnd(mzeVar8.c));
                                                            } else {
                                                                f(ku3Var5, ydaVar4, new lti(j6fVar8, rq3Var6, 6));
                                                                if (function117 != null) {
                                                                    function117.invoke(new dnd(mzeVar7.c));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        otiVar.r = noiVar5;
                                                        otiVar.s = ku3Var3;
                                                        otiVar.t = j6fVar8;
                                                        otiVar.u = function113;
                                                        otiVar.v = function114;
                                                        otiVar.w = function115;
                                                        otiVar.x = L2;
                                                        otiVar.y = mzeVar3;
                                                        otiVar.z = mzeVar5;
                                                        otiVar.B = 7;
                                                        Object h = h(noiVar5, gze.b, otiVar);
                                                        if (h != lu3Var) {
                                                            function116 = function113;
                                                            j6fVar9 = j6fVar8;
                                                            ydaVar3 = L2;
                                                            mzeVar6 = mzeVar5;
                                                            obj2 = h;
                                                            r112 = rq3Var4;
                                                            akbVar2 = (akb) obj2;
                                                            if (Intrinsics.c(akbVar2, zjbVar)) {
                                                                if (akbVar2 instanceof yjb) {
                                                                    mzeVar8 = ((yjb) akbVar2).a;
                                                                    mzeVar7 = mzeVar3;
                                                                    ydaVar4 = ydaVar3;
                                                                    function117 = function115;
                                                                    ku3Var5 = ku3Var3;
                                                                } else {
                                                                    if (!(akbVar2 instanceof xjb)) {
                                                                        zzl.b();
                                                                        return obj;
                                                                    }
                                                                    mzeVar7 = mzeVar3;
                                                                    ydaVar4 = ydaVar3;
                                                                    function117 = function115;
                                                                    ku3Var5 = ku3Var3;
                                                                    mzeVar8 = r112;
                                                                }
                                                                function118 = function116;
                                                                j6fVar8 = j6fVar9;
                                                                rq3Var6 = r112;
                                                                if (mzeVar8 != null) {
                                                                }
                                                            } else {
                                                                function114.invoke(new dnd(mzeVar6.c));
                                                                otiVar.r = ku3Var3;
                                                                otiVar.s = j6fVar9;
                                                                otiVar.t = ydaVar3;
                                                                otiVar.u = r112;
                                                                otiVar.v = r112;
                                                                otiVar.w = r112;
                                                                otiVar.x = r112;
                                                                otiVar.y = r112;
                                                                otiVar.z = r112;
                                                                otiVar.B = 8;
                                                                if (c(noiVar5, otiVar) != lu3Var) {
                                                                    ydaVar5 = ydaVar3;
                                                                    ku3Var6 = ku3Var3;
                                                                    j6fVar10 = j6fVar9;
                                                                    rq3Var7 = r112;
                                                                    f(ku3Var6, ydaVar5, new lti(j6fVar10, rq3Var7, 7));
                                                                    return Unit.a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (function115 != null) {
                                                    function115.invoke(new dnd(mzeVar3.c));
                                                }
                                            }
                                        } else if (function110 != null) {
                                            function110.invoke(new dnd(mzeVar2.c));
                                        }
                                    }
                                    return Unit.a;
                                }
                            } else {
                                otiVar.r = noiVar2;
                                otiVar.s = ku3Var2;
                                otiVar.t = j6fVar3;
                                otiVar.u = function16;
                                otiVar.v = function14;
                                otiVar.w = ct8Var2;
                                otiVar.x = function15;
                                otiVar.y = mzeVar;
                                otiVar.z = L;
                                otiVar.B = 3;
                                Object h2 = h(noiVar2, gze.b, otiVar);
                                if (h2 != lu3Var) {
                                    Function1 function120 = function16;
                                    ct8Var3 = ct8Var2;
                                    ydaVar = L;
                                    function17 = function120;
                                    Function1 function121 = function15;
                                    j6fVar4 = j6fVar3;
                                    obj2 = h2;
                                    noiVar3 = noiVar2;
                                    function18 = function14;
                                    function19 = function121;
                                    akbVar = (akb) obj2;
                                    if (Intrinsics.c(akbVar, zjbVar2)) {
                                        if (akbVar instanceof yjb) {
                                            mzeVar2 = ((yjb) akbVar).a;
                                        } else {
                                            if (!(akbVar instanceof xjb)) {
                                                zzl.b();
                                                return obj;
                                            }
                                            mzeVar2 = r11;
                                        }
                                        function110 = function19;
                                        ct8Var4 = ct8Var3;
                                        function112 = function18;
                                        ku3Var3 = ku3Var2;
                                        j6fVar5 = j6fVar4;
                                        function111 = function17;
                                        noiVar4 = noiVar3;
                                        rq3Var2 = r11;
                                        if (mzeVar2 == null) {
                                        }
                                        if (mzeVar2 != null) {
                                        }
                                        return Unit.a;
                                    }
                                    function18.invoke(new dnd(mzeVar.c));
                                    otiVar.r = ku3Var2;
                                    otiVar.s = j6fVar4;
                                    otiVar.t = ydaVar;
                                    otiVar.u = r11;
                                    otiVar.v = r11;
                                    otiVar.w = r11;
                                    otiVar.x = r11;
                                    otiVar.y = r11;
                                    otiVar.z = r11;
                                    otiVar.B = 4;
                                    if (c(noiVar3, otiVar) != lu3Var) {
                                        j6fVar7 = j6fVar4;
                                        ku3Var4 = ku3Var2;
                                        rq3Var3 = r11;
                                        f(ku3Var4, ydaVar, new lti(j6fVar7, rq3Var3, 2));
                                        return Unit.a;
                                    }
                                }
                            }
                        }
                        return lu3Var;
                    case 1:
                        obj = null;
                        Function1 function122 = (Function1) otiVar.x;
                        ct8 ct8Var6 = (ct8) otiVar.w;
                        function14 = (Function1) otiVar.v;
                        function16 = otiVar.u;
                        j6f j6fVar14 = (j6f) otiVar.t;
                        ku3Var2 = (ku3) otiVar.s;
                        noiVar2 = (noi) otiVar.r;
                        y6a.M(obj2);
                        function15 = function122;
                        ct8Var2 = ct8Var6;
                        j6fVar2 = j6fVar14;
                        mze mzeVar92 = (mze) obj2;
                        mzeVar92.a();
                        r11 = 0;
                        rq3Var = null;
                        g9i L3 = xw3.L(ku3Var2, null, nu3.d, new mti(j6fVar2, r11, i3), 1);
                        if (ct8Var2 == xf2Var) {
                        }
                        if (function14 != null) {
                        }
                        return lu3Var;
                    case 2:
                        obj = null;
                        ydaVar = (yda) otiVar.y;
                        function110 = (Function1) otiVar.x;
                        ct8Var4 = (ct8) otiVar.w;
                        function112 = (Function1) otiVar.v;
                        function111 = otiVar.u;
                        j6fVar5 = (j6f) otiVar.t;
                        ku3Var3 = (ku3) otiVar.s;
                        noiVar4 = (noi) otiVar.r;
                        y6a.M(obj2);
                        rq3Var = null;
                        mzeVar2 = (mze) obj2;
                        rq3Var2 = rq3Var;
                        if (mzeVar2 == null) {
                        }
                        if (mzeVar2 != null) {
                        }
                        return Unit.a;
                    case 3:
                        obj = null;
                        ydaVar = (yda) otiVar.z;
                        mzeVar = (mze) otiVar.y;
                        function19 = (Function1) otiVar.x;
                        ct8Var3 = (ct8) otiVar.w;
                        function18 = (Function1) otiVar.v;
                        function17 = otiVar.u;
                        j6fVar4 = (j6f) otiVar.t;
                        ku3Var2 = (ku3) otiVar.s;
                        noiVar3 = (noi) otiVar.r;
                        y6a.M(obj2);
                        r11 = 0;
                        akbVar = (akb) obj2;
                        if (Intrinsics.c(akbVar, zjbVar2)) {
                        }
                        break;
                    case 4:
                        ydaVar = (yda) otiVar.t;
                        j6fVar7 = (j6f) otiVar.s;
                        ku3Var4 = (ku3) otiVar.r;
                        y6a.M(obj2);
                        rq3Var3 = null;
                        f(ku3Var4, ydaVar, new lti(j6fVar7, rq3Var3, 2));
                        return Unit.a;
                    case 5:
                        obj = null;
                        ydaVar2 = (yda) otiVar.z;
                        mzeVar3 = (mze) otiVar.y;
                        Function1 function123 = (Function1) otiVar.x;
                        ct8Var5 = (ct8) otiVar.w;
                        Function1 function124 = (Function1) otiVar.v;
                        Function1 function125 = otiVar.u;
                        j6f j6fVar15 = (j6f) otiVar.t;
                        ku3Var3 = (ku3) otiVar.s;
                        noi noiVar6 = (noi) otiVar.r;
                        y6a.M(obj2);
                        function113 = function125;
                        function114 = function124;
                        function115 = function123;
                        noiVar5 = noiVar6;
                        j6fVar6 = j6fVar15;
                        rq3Var4 = 0;
                        mzeVar4 = (mze) obj2;
                        if (mzeVar4 == null) {
                        }
                        break;
                    case 6:
                        mzeVar7 = (mze) otiVar.w;
                        ydaVar4 = (yda) otiVar.v;
                        function117 = otiVar.u;
                        function118 = (Function1) otiVar.t;
                        j6fVar8 = (j6f) otiVar.s;
                        ku3Var5 = (ku3) otiVar.r;
                        y6a.M(obj2);
                        rq3Var5 = null;
                        mzeVar8 = (mze) obj2;
                        rq3Var6 = rq3Var5;
                        if (mzeVar8 != null) {
                        }
                        return Unit.a;
                    case 7:
                        mzeVar6 = (mze) otiVar.z;
                        mzeVar3 = (mze) otiVar.y;
                        ydaVar3 = (yda) otiVar.x;
                        function115 = (Function1) otiVar.w;
                        Function1 function126 = (Function1) otiVar.v;
                        function116 = otiVar.u;
                        j6fVar9 = (j6f) otiVar.t;
                        obj = null;
                        ku3 ku3Var7 = (ku3) otiVar.s;
                        noiVar5 = (noi) otiVar.r;
                        y6a.M(obj2);
                        ku3Var3 = ku3Var7;
                        function114 = function126;
                        zjbVar = zjbVar2;
                        r112 = 0;
                        akbVar2 = (akb) obj2;
                        if (Intrinsics.c(akbVar2, zjbVar)) {
                        }
                        break;
                    case 8:
                        ydaVar5 = (yda) otiVar.t;
                        j6fVar10 = (j6f) otiVar.s;
                        ku3Var6 = (ku3) otiVar.r;
                        y6a.M(obj2);
                        rq3Var7 = null;
                        f(ku3Var6, ydaVar5, new lti(j6fVar10, rq3Var7, 7));
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        otiVar = new oti(h21Var);
        Object obj22 = otiVar.A;
        lu3 lu3Var2 = lu3.a;
        i = otiVar.B;
        zjb zjbVar22 = zjb.a;
        xf2 xf2Var2 = a;
        int i32 = 1;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(noi noiVar, gze gzeVar, sq3 sq3Var) {
        pti ptiVar;
        int i;
        fsf fsfVar;
        try {
            if (sq3Var instanceof pti) {
                ptiVar = (pti) sq3Var;
                int i2 = ptiVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ptiVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = ptiVar.s;
                    Object obj2 = lu3.a;
                    i = ptiVar.t;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        fsf g = lnb.g(obj);
                        g.a = xjb.a;
                        long b = noiVar.e().b();
                        Function2 kj6Var = new kj6(gzeVar, g, rq3Var, 4);
                        ptiVar.r = g;
                        ptiVar.t = 1;
                        if (noiVar.f(b, kj6Var, ptiVar) == obj2) {
                            return obj2;
                        }
                        fsfVar = g;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fsfVar = ptiVar.r;
                        y6a.M(obj);
                    }
                    return fsfVar.a;
                }
            }
            if (i != 0) {
            }
            return fsfVar.a;
        } catch (hze unused) {
            return zjb.a;
        }
        ptiVar = new pti(sq3Var);
        Object obj3 = ptiVar.s;
        Object obj22 = lu3.a;
        i = ptiVar.t;
        rq3 rq3Var2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r0 == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(noi noiVar, gze gzeVar, h21 h21Var) {
        qti qtiVar;
        int i;
        noi noiVar2;
        qti qtiVar2;
        gze gzeVar2;
        noi noiVar3;
        gze gzeVar3;
        int size;
        int i2;
        Object b;
        if (h21Var instanceof qti) {
            qtiVar = (qti) h21Var;
            int i3 = qtiVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qtiVar.u = i3 - Integer.MIN_VALUE;
                Object obj = qtiVar.t;
                lu3 lu3Var = lu3.a;
                i = qtiVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    noiVar2 = noiVar;
                    qtiVar2 = qtiVar;
                    gzeVar2 = gzeVar;
                    qtiVar2.r = noiVar2;
                    qtiVar2.s = gzeVar2;
                    qtiVar2.u = 1;
                    b = noiVar2.b(gzeVar2, qtiVar2);
                    if (b != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    gzeVar3 = qtiVar.s;
                    noiVar3 = qtiVar.r;
                    y6a.M(obj);
                    List list = ((fze) obj).a;
                    size = list.size();
                    while (i2 < size) {
                    }
                    return list.get(0);
                }
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gzeVar3 = qtiVar.s;
                noiVar3 = qtiVar.r;
                y6a.M(obj);
                gze gzeVar4 = gzeVar3;
                qtiVar2 = qtiVar;
                gzeVar2 = gzeVar4;
                List list2 = ((fze) obj).a;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((mze) list2.get(i4)).b()) {
                        break;
                    }
                }
                noiVar2 = noiVar3;
                qtiVar2.r = noiVar2;
                qtiVar2.s = gzeVar2;
                qtiVar2.u = 1;
                b = noiVar2.b(gzeVar2, qtiVar2);
                if (b != lu3Var) {
                    noiVar3 = noiVar2;
                    obj = b;
                    qti qtiVar3 = qtiVar2;
                    gzeVar3 = gzeVar2;
                    qtiVar = qtiVar3;
                    List list3 = ((fze) obj).a;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!qea.m((mze) list3.get(i2))) {
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                mze mzeVar = (mze) list3.get(i5);
                                if (mzeVar.b() || qea.z(mzeVar, noiVar3.f.x, noiVar3.d())) {
                                    break;
                                }
                            }
                            gze gzeVar5 = gze.c;
                            qtiVar.r = noiVar3;
                            qtiVar.s = gzeVar3;
                            qtiVar.u = 2;
                            obj = noiVar3.b(gzeVar5, qtiVar);
                        }
                    }
                    return list3.get(0);
                }
                return lu3Var;
            }
        }
        qtiVar = new qti(h21Var);
        Object obj2 = qtiVar.t;
        lu3 lu3Var2 = lu3.a;
        i = qtiVar.u;
        if (i != 0) {
        }
    }
}
