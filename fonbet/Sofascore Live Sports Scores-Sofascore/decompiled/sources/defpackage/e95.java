package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class e95 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (defpackage.dnd.c(defpackage.qea.E(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005e -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(noi noiVar, long j, sq3 sq3Var) {
        u85 u85Var;
        int i;
        noi noiVar2;
        esf esfVar;
        Object b;
        Object obj;
        Object obj2;
        if (sq3Var instanceof u85) {
            u85Var = (u85) sq3Var;
            int i2 = u85Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u85Var.u = i2 - Integer.MIN_VALUE;
                Object obj3 = u85Var.t;
                lu3 lu3Var = lu3.a;
                i = u85Var.u;
                if (i != 0) {
                    y6a.M(obj3);
                    noiVar2 = noiVar;
                    if (!h(noiVar2.f.s, j)) {
                        esf esfVar2 = new esf();
                        esfVar2.a = j;
                        esfVar = esfVar2;
                        u85Var.r = noiVar2;
                        u85Var.s = esfVar;
                        u85Var.u = 1;
                        b = noiVar2.b(gze.b, u85Var);
                        if (b != lu3Var) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                esfVar = u85Var.s;
                noi noiVar3 = u85Var.r;
                y6a.M(obj3);
                fze fzeVar = (fze) obj3;
                List list = fzeVar.a;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (ufa.o(((mze) obj).a, esfVar.a)) {
                        break;
                    }
                    i4++;
                }
                mze mzeVar = (mze) obj;
                if (mzeVar == null) {
                    if (qea.n(mzeVar)) {
                        List list2 = fzeVar.a;
                        int size2 = list2.size();
                        while (true) {
                            if (i3 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i3);
                            if (((mze) obj2).d) {
                                break;
                            }
                            i3++;
                        }
                        mze mzeVar2 = (mze) obj2;
                        if (mzeVar2 != null) {
                            esfVar.a = mzeVar2.a;
                            noiVar2 = noiVar3;
                            u85Var.r = noiVar2;
                            u85Var.s = esfVar;
                            u85Var.u = 1;
                            b = noiVar2.b(gze.b, u85Var);
                            if (b != lu3Var) {
                                return lu3Var;
                            }
                            noi noiVar4 = noiVar2;
                            obj3 = b;
                            noiVar3 = noiVar4;
                        }
                    }
                    fze fzeVar2 = (fze) obj3;
                    List list3 = fzeVar2.a;
                    int size3 = list3.size();
                    int i32 = 0;
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    mze mzeVar3 = (mze) obj;
                    if (mzeVar3 == null) {
                        mzeVar3 = null;
                    }
                }
                if (mzeVar3 == null || mzeVar3.b()) {
                    return null;
                }
                return mzeVar3;
            }
        }
        u85Var = new u85(sq3Var);
        Object obj32 = u85Var.t;
        lu3 lu3Var2 = lu3.a;
        i = u85Var.u;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ac, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x016e -> B:11:0x0175). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(noi noiVar, long j, int i, fv2 fv2Var, h21 h21Var) {
        v85 v85Var;
        int i2;
        noi noiVar2;
        float i3;
        esf esfVar;
        am0 am0Var;
        Function2 function2;
        mze mzeVar;
        Object obj;
        int i4;
        long j2;
        char c;
        am0 am0Var2;
        mze mzeVar2;
        esf esfVar2;
        noi noiVar3;
        Object obj2;
        if (h21Var instanceof v85) {
            v85Var = (v85) h21Var;
            int i5 = v85Var.y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                v85Var.y = i5 - Integer.MIN_VALUE;
                Object obj3 = v85Var.x;
                lu3 lu3Var = lu3.a;
                i2 = v85Var.y;
                int i6 = 1;
                mze mzeVar3 = null;
                if (i2 != 0) {
                    y6a.M(obj3);
                    ewd ewdVar = ewd.b;
                    noiVar2 = noiVar;
                    if (h(noiVar2.f.s, j)) {
                        return null;
                    }
                    i3 = i(noiVar2.e(), i);
                    esfVar = new esf();
                    esfVar.a = j;
                    am0Var = new am0(ewdVar, 0L, 10);
                    function2 = fv2Var;
                    v85Var.r = function2;
                    v85Var.s = noiVar2;
                    v85Var.t = esfVar;
                    v85Var.u = am0Var;
                    v85Var.v = mzeVar3;
                    v85Var.w = i3;
                    v85Var.y = i6;
                    obj3 = noiVar2.b(gze.b, v85Var);
                } else if (i2 == 1) {
                    float f = v85Var.w;
                    am0Var = v85Var.u;
                    esf esfVar3 = v85Var.t;
                    noi noiVar4 = v85Var.s;
                    Function2 function22 = v85Var.r;
                    y6a.M(obj3);
                    i3 = f;
                    function2 = function22;
                    esfVar = esfVar3;
                    noiVar2 = noiVar4;
                    fze fzeVar = (fze) obj3;
                    List list = fzeVar.a;
                    int size = list.size();
                    mzeVar = mzeVar3;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            obj = mzeVar;
                            break;
                        }
                        obj = list.get(i7);
                        if (ufa.o(((mze) obj).a, esfVar.a)) {
                            break;
                        }
                        i7++;
                    }
                    mze mzeVar4 = (mze) obj;
                    if (mzeVar4 == null || mzeVar4.b()) {
                        return mzeVar;
                    }
                    if (qea.n(mzeVar4)) {
                        List list2 = fzeVar.a;
                        int size2 = list2.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                obj2 = mzeVar;
                                break;
                            }
                            obj2 = list2.get(i8);
                            if (((mze) obj2).d) {
                                break;
                            }
                            i8++;
                        }
                        mze mzeVar5 = (mze) obj2;
                        if (mzeVar5 == null) {
                            return mzeVar;
                        }
                        esfVar.a = mzeVar5.a;
                        mzeVar3 = mzeVar;
                        i6 = 1;
                    } else {
                        i4 = 1;
                        long u = am0Var.u(qea.E(mzeVar4, true), i3, true);
                        if ((9223372034707292159L & u) == 9205357640488583168L) {
                            j2 = 0;
                            gze gzeVar = gze.c;
                            v85Var.r = function2;
                            v85Var.s = noiVar2;
                            v85Var.t = esfVar;
                            v85Var.u = am0Var;
                            v85Var.v = mzeVar4;
                            v85Var.w = i3;
                            c = 2;
                            v85Var.y = 2;
                            if (noiVar2.b(gzeVar, v85Var) != lu3Var) {
                                noi noiVar5 = noiVar2;
                                am0Var2 = am0Var;
                                mzeVar2 = mzeVar4;
                                esfVar2 = esfVar;
                                noiVar3 = noiVar5;
                                if (!mzeVar2.b()) {
                                }
                            }
                            return lu3Var;
                        }
                        function2.invoke(mzeVar4, new Float(Float.intBitsToFloat((int) (u >> 32))));
                        if (mzeVar4.b()) {
                            return mzeVar4;
                        }
                        am0Var.b = 0L;
                        mzeVar3 = mzeVar;
                        i6 = 1;
                    }
                    v85Var.r = function2;
                    v85Var.s = noiVar2;
                    v85Var.t = esfVar;
                    v85Var.u = am0Var;
                    v85Var.v = mzeVar3;
                    v85Var.w = i3;
                    v85Var.y = i6;
                    obj3 = noiVar2.b(gze.b, v85Var);
                } else {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = v85Var.w;
                    mzeVar2 = v85Var.v;
                    am0Var2 = v85Var.u;
                    esf esfVar4 = v85Var.t;
                    noiVar3 = v85Var.s;
                    Function2 function23 = v85Var.r;
                    y6a.M(obj3);
                    c = 2;
                    i4 = 1;
                    mzeVar = null;
                    j2 = 0;
                    esfVar2 = esfVar4;
                    i3 = f2;
                    function2 = function23;
                    if (!mzeVar2.b()) {
                        return mzeVar;
                    }
                    mzeVar3 = mzeVar;
                    i6 = i4;
                    am0Var = am0Var2;
                    noiVar2 = noiVar3;
                    esfVar = esfVar2;
                    v85Var.r = function2;
                    v85Var.s = noiVar2;
                    v85Var.t = esfVar;
                    v85Var.u = am0Var;
                    v85Var.v = mzeVar3;
                    v85Var.w = i3;
                    v85Var.y = i6;
                    obj3 = noiVar2.b(gze.b, v85Var);
                }
            }
        }
        v85Var = new v85(h21Var);
        Object obj32 = v85Var.x;
        lu3 lu3Var2 = lu3.a;
        i2 = v85Var.y;
        int i62 = 1;
        mze mzeVar32 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[Catch: hze -> 0x00a4, TRY_LEAVE, TryCatch #0 {hze -> 0x00a4, blocks: (B:11:0x002a, B:12:0x0097, B:14:0x009b, B:34:0x007d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [fsf] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(noi noiVar, long j, h21 h21Var) {
        w85 w85Var;
        int i;
        Object obj;
        mze mzeVar;
        asf asfVar;
        try {
            if (h21Var instanceof w85) {
                w85Var = (w85) h21Var;
                int i2 = w85Var.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    w85Var.v = i2 - Integer.MIN_VALUE;
                    Object obj2 = w85Var.u;
                    Object obj3 = lu3.a;
                    i = w85Var.v;
                    if (i != 0) {
                        y6a.M(obj2);
                        if (!h(noiVar.f.s, j)) {
                            List list = noiVar.f.s.a;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i3);
                                if (ufa.o(((mze) obj).a, j)) {
                                    break;
                                }
                                i3++;
                            }
                            mzeVar = (mze) obj;
                            if (mzeVar != null) {
                                fsf fsfVar = new fsf();
                                fsf fsfVar2 = new fsf();
                                fsfVar2.a = mzeVar;
                                long b = noiVar.e().b();
                                asf asfVar2 = new asf();
                                Function2 x85Var = new x85(asfVar2, fsfVar2, fsfVar, null);
                                w85Var.r = mzeVar;
                                w85Var.s = fsfVar;
                                w85Var.t = asfVar2;
                                w85Var.v = 1;
                                if (noiVar.f(b, x85Var, w85Var) == obj3) {
                                    return obj3;
                                }
                                asfVar = asfVar2;
                                j = fsfVar;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asfVar = w85Var.t;
                    fsf fsfVar3 = w85Var.s;
                    mzeVar = w85Var.r;
                    y6a.M(obj2);
                    j = fsfVar3;
                    if (asfVar.a) {
                        mze mzeVar2 = (mze) j.a;
                        return mzeVar2 == null ? mzeVar : mzeVar2;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            if (asfVar.a) {
            }
            return null;
        } catch (hze unused) {
            mze mzeVar3 = (mze) j.a;
            return mzeVar3 == null ? mzeVar : mzeVar3;
        }
        w85Var = new w85(h21Var);
        Object obj22 = w85Var.u;
        Object obj32 = lu3.a;
        i = w85Var.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x016b -> B:11:0x0171). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(noi noiVar, long j, fvg fvgVar, h21 h21Var) {
        y85 y85Var;
        int i;
        noi noiVar2;
        float g;
        esf esfVar;
        am0 am0Var;
        Function2 function2;
        esf esfVar2;
        noi noiVar3;
        esf esfVar3;
        int size;
        mze mzeVar;
        int i2;
        Object obj;
        mze mzeVar2;
        Object obj2;
        Object b;
        if (h21Var instanceof y85) {
            y85Var = (y85) h21Var;
            int i3 = y85Var.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y85Var.y = i3 - Integer.MIN_VALUE;
                Object obj3 = y85Var.x;
                lu3 lu3Var = lu3.a;
                i = y85Var.y;
                int i4 = 1;
                mze mzeVar3 = null;
                if (i != 0) {
                    y6a.M(obj3);
                    noiVar2 = noiVar;
                    if (h(noiVar2.f.s, j)) {
                        return null;
                    }
                    g = noiVar2.e().g();
                    esfVar = new esf();
                    esfVar.a = j;
                    am0Var = new am0((Object) null, 0L, 10);
                    function2 = fvgVar;
                    y85Var.r = function2;
                    y85Var.s = noiVar2;
                    y85Var.t = esfVar;
                    y85Var.u = am0Var;
                    y85Var.v = mzeVar3;
                    y85Var.w = g;
                    y85Var.y = i4;
                    b = noiVar2.b(gze.b, y85Var);
                    if (b != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    float f = y85Var.w;
                    am0Var = y85Var.u;
                    esf esfVar4 = y85Var.t;
                    noiVar3 = y85Var.s;
                    Function2 function22 = y85Var.r;
                    y6a.M(obj3);
                    esfVar2 = esfVar4;
                    g = f;
                    function2 = function22;
                    esfVar3 = esfVar2;
                    fze fzeVar = (fze) obj3;
                    List list = fzeVar.a;
                    size = list.size();
                    mzeVar = mzeVar3;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    mzeVar2 = (mze) obj;
                    if (mzeVar2 != null) {
                        return mzeVar;
                    }
                    if (qea.n(mzeVar2)) {
                    }
                    y85Var.r = function2;
                    y85Var.s = noiVar2;
                    y85Var.t = esfVar;
                    y85Var.u = am0Var;
                    y85Var.v = mzeVar3;
                    y85Var.w = g;
                    y85Var.y = i4;
                    b = noiVar2.b(gze.b, y85Var);
                    if (b != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = y85Var.w;
                mze mzeVar4 = y85Var.v;
                am0 am0Var2 = y85Var.u;
                esf esfVar5 = y85Var.t;
                noi noiVar4 = y85Var.s;
                Function2 function23 = y85Var.r;
                y6a.M(obj3);
                esfVar3 = esfVar5;
                noiVar3 = noiVar4;
                char c = 2;
                int i5 = 1;
                mzeVar = null;
                long j2 = 0;
                float f3 = f2;
                function2 = function23;
                if (!mzeVar4.b()) {
                    return mzeVar;
                }
                mzeVar3 = mzeVar;
                i4 = i5;
                am0Var = am0Var2;
                g = f3;
                noiVar2 = noiVar3;
                esfVar = esfVar3;
                y85Var.r = function2;
                y85Var.s = noiVar2;
                y85Var.t = esfVar;
                y85Var.u = am0Var;
                y85Var.v = mzeVar3;
                y85Var.w = g;
                y85Var.y = i4;
                b = noiVar2.b(gze.b, y85Var);
                if (b != lu3Var) {
                    esfVar2 = esfVar;
                    noiVar3 = noiVar2;
                    obj3 = b;
                    esfVar3 = esfVar2;
                    fze fzeVar2 = (fze) obj3;
                    List list2 = fzeVar2.a;
                    size = list2.size();
                    mzeVar = mzeVar3;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj = mzeVar;
                            break;
                        }
                        obj = list2.get(i2);
                        if (ufa.o(((mze) obj).a, esfVar3.a)) {
                            break;
                        }
                        i2++;
                    }
                    mzeVar2 = (mze) obj;
                    if (mzeVar2 != null || mzeVar2.b()) {
                        return mzeVar;
                    }
                    if (qea.n(mzeVar2)) {
                        i5 = 1;
                        long u = am0Var.u(qea.E(mzeVar2, true), g, true);
                        if ((9223372034707292159L & u) != 9205357640488583168L) {
                            function2.invoke(mzeVar2, new dnd(u));
                            if (mzeVar2.b()) {
                                return mzeVar2;
                            }
                            am0Var.b = 0L;
                            mzeVar3 = mzeVar;
                            i4 = 1;
                            noiVar2 = noiVar3;
                            esfVar = esfVar3;
                        } else {
                            j2 = 0;
                            gze gzeVar = gze.c;
                            y85Var.r = function2;
                            y85Var.s = noiVar3;
                            y85Var.t = esfVar3;
                            y85Var.u = am0Var;
                            y85Var.v = mzeVar2;
                            y85Var.w = g;
                            c = 2;
                            y85Var.y = 2;
                            if (noiVar3.b(gzeVar, y85Var) != lu3Var) {
                                float f4 = g;
                                am0Var2 = am0Var;
                                mzeVar4 = mzeVar2;
                                f3 = f4;
                                if (!mzeVar4.b()) {
                                }
                            }
                        }
                    } else {
                        List list3 = fzeVar2.a;
                        int size2 = list3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = mzeVar;
                                break;
                            }
                            obj2 = list3.get(i6);
                            if (((mze) obj2).d) {
                                break;
                            }
                            i6++;
                        }
                        mze mzeVar5 = (mze) obj2;
                        if (mzeVar5 == null) {
                            return mzeVar;
                        }
                        esfVar3.a = mzeVar5.a;
                        mzeVar3 = mzeVar;
                        i4 = 1;
                        noiVar2 = noiVar3;
                        esfVar = esfVar3;
                    }
                    y85Var.r = function2;
                    y85Var.s = noiVar2;
                    y85Var.t = esfVar;
                    y85Var.u = am0Var;
                    y85Var.v = mzeVar3;
                    y85Var.w = g;
                    y85Var.y = i4;
                    b = noiVar2.b(gze.b, y85Var);
                    if (b != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        y85Var = new y85(h21Var);
        Object obj32 = y85Var.x;
        lu3 lu3Var2 = lu3.a;
        i = y85Var.y;
        int i42 = 1;
        mze mzeVar32 = null;
        if (i != 0) {
        }
    }

    public static final Object e(qze qzeVar, Function1 function1, Function0 function0, Function0 function02, Function2 function2, sq3 sq3Var) {
        Object s = oyn.s(qzeVar, new z85(new wc4(21), new y47(9, function1), function2, function02, new ma0(2, function0), (rq3) null), sq3Var);
        lu3 lu3Var = lu3.a;
        if (s != lu3Var) {
            s = Unit.a;
        }
        return s == lu3Var ? s : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0046 -> B:10:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(noi noiVar, long j, Function1 function1, h21 h21Var) {
        b95 b95Var;
        int i;
        mze mzeVar;
        if (h21Var instanceof b95) {
            b95Var = (b95) h21Var;
            int i2 = b95Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b95Var.u = i2 - Integer.MIN_VALUE;
                Object obj = b95Var.t;
                lu3 lu3Var = lu3.a;
                i = b95Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    b95Var.r = noiVar;
                    b95Var.s = function1;
                    b95Var.u = 1;
                    obj = a(noiVar, j, b95Var);
                    if (obj == lu3Var) {
                    }
                    mzeVar = (mze) obj;
                    if (mzeVar == null) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function12 = b95Var.s;
                    noi noiVar2 = b95Var.r;
                    y6a.M(obj);
                    function1 = function12;
                    noiVar = noiVar2;
                    mzeVar = (mze) obj;
                    if (mzeVar == null) {
                        if (qea.n(mzeVar)) {
                            return Boolean.TRUE;
                        }
                        function1.invoke(mzeVar);
                        j = mzeVar.a;
                        b95Var.r = noiVar;
                        b95Var.s = function1;
                        b95Var.u = 1;
                        obj = a(noiVar, j, b95Var);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        mzeVar = (mze) obj;
                        if (mzeVar == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        b95Var = new b95(h21Var);
        Object obj2 = b95Var.t;
        lu3 lu3Var2 = lu3.a;
        i = b95Var.u;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (r0 == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x007d -> B:10:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(noi noiVar, long j, kz3 kz3Var, h21 h21Var) {
        c95 c95Var;
        int i;
        noi noiVar2;
        long j2;
        c95 c95Var2;
        ewd ewdVar;
        kz3 kz3Var2;
        int i2;
        esf esfVar;
        ewd ewdVar2;
        noi noiVar3;
        Object b;
        noi noiVar4;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        if (h21Var instanceof c95) {
            c95Var = (c95) h21Var;
            int i3 = c95Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c95Var.x = i3 - Integer.MIN_VALUE;
                Object obj3 = c95Var.w;
                lu3 lu3Var = lu3.a;
                i = c95Var.x;
                mze mzeVar = null;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    esf esfVar2 = c95Var.v;
                    noiVar3 = c95Var.u;
                    ewdVar2 = c95Var.t;
                    noi noiVar5 = c95Var.s;
                    Function1 function1 = c95Var.r;
                    y6a.M(obj3);
                    esf esfVar3 = esfVar2;
                    noiVar2 = noiVar5;
                    ?? r10 = function1;
                    fze fzeVar = (fze) obj3;
                    List list = fzeVar.a;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            noiVar4 = noiVar3;
                            obj = null;
                            break;
                        }
                        obj = list.get(i5);
                        noiVar4 = noiVar3;
                        if (ufa.o(((mze) obj).a, esfVar3.a)) {
                            break;
                        }
                        i5++;
                        noiVar3 = noiVar4;
                    }
                    mze mzeVar2 = (mze) obj;
                    if (mzeVar2 == null) {
                        if (qea.n(mzeVar2)) {
                            List list2 = fzeVar.a;
                            int size2 = list2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list2.get(i6);
                                if (((mze) obj2).d) {
                                    break;
                                }
                                i6++;
                            }
                            mze mzeVar3 = (mze) obj2;
                            if (mzeVar3 != null) {
                                esfVar3.a = mzeVar3.a;
                                i2 = 1;
                            }
                        } else {
                            i2 = 1;
                            long E = qea.E(mzeVar2, true);
                            if (ewdVar2 != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (ewdVar2 == ewd.a ? E & 4294967295L : E >> 32));
                            } else {
                                intBitsToFloat = dnd.d(E);
                            }
                        }
                        noiVar3 = noiVar4;
                        kz3Var2 = r10;
                        i4 = i2;
                        esfVar = esfVar3;
                        c95Var.r = kz3Var2;
                        c95Var.s = noiVar2;
                        c95Var.t = ewdVar2;
                        c95Var.u = noiVar3;
                        c95Var.v = esfVar;
                        c95Var.x = i4;
                        b = noiVar3.b(gze.b, c95Var);
                        if (b == lu3Var) {
                            return lu3Var;
                        }
                        esf esfVar4 = esfVar;
                        r10 = kz3Var2;
                        obj3 = b;
                        esfVar3 = esfVar4;
                        fze fzeVar2 = (fze) obj3;
                        List list3 = fzeVar2.a;
                        int size3 = list3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52++;
                            noiVar3 = noiVar4;
                        }
                        mze mzeVar22 = (mze) obj;
                        if (mzeVar22 == null) {
                            mzeVar22 = null;
                        }
                    }
                    i2 = 1;
                    if (mzeVar22 == null || mzeVar22.b()) {
                        mzeVar = null;
                    } else if (qea.n(mzeVar22)) {
                        mzeVar = mzeVar22;
                    } else {
                        r10.invoke(mzeVar22);
                        c95Var2 = c95Var;
                        ewdVar = ewdVar2;
                        kz3Var2 = r10;
                        i4 = i2;
                        j2 = mzeVar22.a;
                        esfVar = new esf();
                        esfVar.a = j2;
                        ewdVar2 = ewdVar;
                        c95Var = c95Var2;
                        noiVar3 = noiVar2;
                        c95Var.r = kz3Var2;
                        c95Var.s = noiVar2;
                        c95Var.t = ewdVar2;
                        c95Var.u = noiVar3;
                        c95Var.v = esfVar;
                        c95Var.x = i4;
                        b = noiVar3.b(gze.b, c95Var);
                        if (b == lu3Var) {
                        }
                    }
                    return Boolean.valueOf((boolean) (mzeVar == null ? i2 : 0));
                }
                y6a.M(obj3);
                ewd ewdVar3 = ewd.b;
                noiVar2 = noiVar;
                j2 = j;
                if (h(noiVar2.f.s, j2)) {
                    i2 = 1;
                    return Boolean.valueOf((boolean) (mzeVar == null ? i2 : 0));
                }
                c95Var2 = c95Var;
                ewdVar = ewdVar3;
                kz3Var2 = kz3Var;
                esfVar = new esf();
                esfVar.a = j2;
                ewdVar2 = ewdVar;
                c95Var = c95Var2;
                noiVar3 = noiVar2;
                c95Var.r = kz3Var2;
                c95Var.s = noiVar2;
                c95Var.t = ewdVar2;
                c95Var.u = noiVar3;
                c95Var.v = esfVar;
                c95Var.x = i4;
                b = noiVar3.b(gze.b, c95Var);
                if (b == lu3Var) {
                }
            }
        }
        c95Var = new c95(h21Var);
        Object obj32 = c95Var.w;
        lu3 lu3Var2 = lu3.a;
        i = c95Var.x;
        mze mzeVar4 = null;
        int i42 = 1;
        if (i == 0) {
        }
    }

    public static final boolean h(fze fzeVar, long j) {
        Object obj;
        List list = fzeVar.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ufa.o(((mze) obj).a, j)) {
                break;
            }
            i++;
        }
        mze mzeVar = (mze) obj;
        if (mzeVar != null && mzeVar.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float i(hsk hskVar, int i) {
        return i == 2 ? hskVar.g() * a : hskVar.g();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0544 -> B:59:0x03a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0597 -> B:56:0x059e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0235 -> B:141:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x02cc -> B:141:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x0327 -> B:142:0x0391). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x037a -> B:138:0x0386). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x061f -> B:12:0x0622). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0415 -> B:65:0x03c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x04e2 -> B:59:0x03a4). Please report as a decompilation issue!!! */
    public static final java.lang.Object j(defpackage.noi r24, defpackage.mze r25, defpackage.wc4 r26, defpackage.y47 r27, kotlin.jvm.functions.Function2 r28, kotlin.jvm.functions.Function0 r29, defpackage.ma0 r30, defpackage.h21 r31) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e95.j(noi, mze, wc4, y47, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, ma0, h21):java.lang.Object");
    }
}
