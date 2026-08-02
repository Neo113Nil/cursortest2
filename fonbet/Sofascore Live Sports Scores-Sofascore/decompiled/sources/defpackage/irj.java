package defpackage;

import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class irj {
    public final k6g a;
    public final erj c;
    public final frj e;
    public final fp4 f;
    public final sz8 d = new sz8(16);
    public final s82 b = new s82(23);

    public irj(k6g k6gVar) {
        this.a = k6gVar;
        int i = 0;
        this.c = new erj(this, i);
        this.e = new frj(this, i);
        int i2 = 1;
        this.f = new fp4(11, new erj(this, i2), new frj(this, i2));
    }

    public static String a(Gender gender) {
        int i = grj.a[gender.ordinal()];
        if (i == 1) {
            return "Male";
        }
        if (i == 2) {
            return "Female";
        }
        zzl.b();
        return null;
    }

    public static Gender b(String str) {
        if (Intrinsics.c(str, "Male")) {
            return Gender.Male;
        }
        if (Intrinsics.c(str, "Female")) {
            return Gender.Female;
        }
        a70.p(dmi.q("Can't convert value to enum, unknown value: ", str));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (defpackage.gz8.U(r0, r7.a, false, true, new defpackage.drj(r7, r8, r5 == true ? 1 : 0)) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(irj irjVar, UniqueTournament uniqueTournament, boolean z, sq3 sq3Var) {
        vqj vqjVar;
        int i;
        if (sq3Var instanceof vqj) {
            vqjVar = (vqj) sq3Var;
            int i2 = vqjVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vqjVar.w = i2 - Integer.MIN_VALUE;
                Object obj = vqjVar.u;
                lu3 lu3Var = lu3.a;
                i = vqjVar.w;
                Object[] objArr = 0;
                if (i != 0) {
                    y6a.M(obj);
                    vqjVar.r = irjVar;
                    vqjVar.s = uniqueTournament;
                    vqjVar.t = z;
                    vqjVar.w = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Boolean.valueOf(((Number) obj).longValue() != -1);
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = vqjVar.t;
                    uniqueTournament = vqjVar.s;
                    irjVar = vqjVar.r;
                    y6a.M(obj);
                }
                DbMyUniqueTournament dbMyUniqueTournament = new DbMyUniqueTournament(uniqueTournament.getId(), z);
                vqjVar.r = null;
                vqjVar.s = null;
                vqjVar.t = z;
                vqjVar.w = 2;
                obj = gz8.U(vqjVar, irjVar.a, false, true, new dvi(27, irjVar, dbMyUniqueTournament));
            }
        }
        vqjVar = new vqj(irjVar, sq3Var);
        Object obj2 = vqjVar.u;
        lu3 lu3Var2 = lu3.a;
        i = vqjVar.w;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        DbMyUniqueTournament dbMyUniqueTournament2 = new DbMyUniqueTournament(uniqueTournament.getId(), z);
        vqjVar.r = null;
        vqjVar.s = null;
        vqjVar.t = z;
        vqjVar.w = 2;
        obj2 = gz8.U(vqjVar, irjVar.a, false, true, new dvi(27, irjVar, dbMyUniqueTournament2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (defpackage.gz8.U(r0, r8.a, false, true, new defpackage.dvi(23, r8, r9)) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[LOOP:0: B:17:0x0062->B:19:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(irj irjVar, List list, sq3 sq3Var) {
        wqj wqjVar;
        int i;
        Iterator it;
        if (sq3Var instanceof wqj) {
            wqjVar = (wqj) sq3Var;
            int i2 = wqjVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wqjVar.v = i2 - Integer.MIN_VALUE;
                Object obj = wqjVar.t;
                lu3 lu3Var = lu3.a;
                i = wqjVar.v;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    wqjVar.r = irjVar;
                    wqjVar.s = list;
                    wqjVar.v = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = wqjVar.s;
                    irjVar = wqjVar.r;
                    y6a.M(obj);
                }
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new DbMyUniqueTournament(((UniqueTournament) it.next()).getId(), false));
                }
                wqjVar.r = null;
                wqjVar.s = null;
                wqjVar.v = 2;
                Object U = gz8.U(wqjVar, irjVar.a, false, true, new arj(irjVar, arrayList, i3));
                return U != lu3Var ? lu3Var : U;
            }
        }
        wqjVar = new wqj(irjVar, sq3Var);
        Object obj2 = wqjVar.t;
        lu3 lu3Var2 = lu3.a;
        i = wqjVar.v;
        int i32 = 1;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
        }
        wqjVar.r = null;
        wqjVar.s = null;
        wqjVar.v = 2;
        Object U2 = gz8.U(wqjVar, irjVar.a, false, true, new arj(irjVar, arrayList2, i32));
        if (U2 != lu3Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0060, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(irj irjVar, PinnedTournament pinnedTournament, sq3 sq3Var) {
        xqj xqjVar;
        int i;
        irj irjVar2;
        PinnedTournament pinnedTournament2;
        Iterator it;
        int i2;
        if (sq3Var instanceof xqj) {
            xqjVar = (xqj) sq3Var;
            int i3 = xqjVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xqjVar.x = i3 - Integer.MIN_VALUE;
                Object obj = xqjVar.v;
                lu3 lu3Var = lu3.a;
                i = xqjVar.x;
                int i4 = 0;
                int i5 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    xqjVar.r = irjVar;
                    xqjVar.s = pinnedTournament;
                    xqjVar.x = 1;
                    obj = gz8.U(xqjVar, irjVar.a, true, false, new brj(irjVar, i4));
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = xqjVar.u;
                        it = xqjVar.t;
                        pinnedTournament2 = xqjVar.s;
                        irjVar2 = xqjVar.r;
                        y6a.M(obj);
                        while (true) {
                            if (it.hasNext()) {
                                PinnedTournament pinnedTournament3 = (PinnedTournament) it.next();
                                int id = pinnedTournament3.getId();
                                int orderIndex = pinnedTournament3.getOrderIndex() + 1;
                                xqjVar.r = irjVar2;
                                xqjVar.s = pinnedTournament2;
                                xqjVar.t = it;
                                xqjVar.u = i2;
                                xqjVar.x = 2;
                                Object U = gz8.U(xqjVar, irjVar2.a, false, true, new nu9(orderIndex, id, i5));
                                if (U != lu3.a) {
                                    U = Unit.a;
                                }
                                if (U == lu3Var) {
                                    break;
                                }
                            } else {
                                xqjVar.r = null;
                                xqjVar.s = null;
                                xqjVar.t = null;
                                xqjVar.x = 3;
                                Object U2 = gz8.U(xqjVar, irjVar2.a, false, true, new dvi(24, irjVar2, pinnedTournament2));
                                if (U2 != lu3.a) {
                                    U2 = Unit.a;
                                }
                            }
                        }
                        return lu3Var;
                    }
                    pinnedTournament = xqjVar.s;
                    irjVar = xqjVar.r;
                    y6a.M(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    PinnedTournament pinnedTournament4 = (PinnedTournament) obj2;
                    if (pinnedTournament4.getId() != pinnedTournament.getId() && pinnedTournament4.getOrderIndex() >= pinnedTournament.getOrderIndex()) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                irjVar2 = irjVar;
                pinnedTournament2 = pinnedTournament;
                it = it2;
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                return lu3Var;
            }
        }
        xqjVar = new xqj(irjVar, sq3Var);
        Object obj3 = xqjVar.v;
        lu3 lu3Var2 = lu3.a;
        i = xqjVar.x;
        int i42 = 0;
        int i52 = 1;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r14.hasNext()) {
        }
        Iterator it22 = arrayList2.iterator();
        irjVar2 = irjVar;
        pinnedTournament2 = pinnedTournament;
        it = it22;
        i2 = 0;
        while (true) {
            if (it.hasNext()) {
            }
        }
        return lu3Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r12 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(irj irjVar, int i, sq3 sq3Var) {
        yqj yqjVar;
        int i2;
        int i3;
        irj irjVar2;
        int i4;
        Object U;
        if (sq3Var instanceof yqj) {
            yqjVar = (yqj) sq3Var;
            int i5 = yqjVar.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                yqjVar.w = i5 - Integer.MIN_VALUE;
                Object obj = yqjVar.u;
                lu3 lu3Var = lu3.a;
                i2 = yqjVar.w;
                int i6 = 3;
                int i7 = 2;
                int i8 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    yqjVar.r = irjVar;
                    yqjVar.s = i;
                    yqjVar.w = 1;
                    obj = gz8.U(yqjVar, irjVar.a, false, true, new kwi(i, 5));
                } else if (i2 == 1) {
                    i = yqjVar.s;
                    irjVar = yqjVar.r;
                    y6a.M(obj);
                } else if (i2 == 2) {
                    i4 = yqjVar.t;
                    i = yqjVar.s;
                    irjVar2 = yqjVar.r;
                    y6a.M(obj);
                    yqjVar.r = irjVar2;
                    yqjVar.s = i;
                    yqjVar.t = i4;
                    yqjVar.w = 3;
                    U = gz8.U(yqjVar, irjVar2.a, false, true, new kwi(i, i8));
                    if (U != lu3Var) {
                        U = Unit.a;
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = yqjVar.t;
                        y6a.M(obj);
                        i3 = i4;
                        return Boolean.valueOf(i3 != 0);
                    }
                    i4 = yqjVar.t;
                    i = yqjVar.s;
                    irjVar2 = yqjVar.r;
                    y6a.M(obj);
                    yqjVar.r = null;
                    yqjVar.s = i;
                    yqjVar.t = i4;
                    yqjVar.w = 4;
                    Object U2 = gz8.U(yqjVar, irjVar2.a, false, true, new kwi(i, i6));
                    if (U2 != lu3Var) {
                        U2 = Unit.a;
                    }
                }
                i3 = ((Number) obj).intValue() <= 0 ? 1 : 0;
                if (i3 != 0) {
                    yqjVar.r = irjVar;
                    yqjVar.s = i;
                    yqjVar.t = i3;
                    yqjVar.w = 2;
                    if (gz8.U(yqjVar, irjVar.a, false, true, new kwi(i, i7)) != lu3Var) {
                        irjVar2 = irjVar;
                        i4 = i3;
                        yqjVar.r = irjVar2;
                        yqjVar.s = i;
                        yqjVar.t = i4;
                        yqjVar.w = 3;
                        U = gz8.U(yqjVar, irjVar2.a, false, true, new kwi(i, i8));
                        if (U != lu3Var) {
                        }
                    }
                    return lu3Var;
                }
                return Boolean.valueOf(i3 != 0);
            }
        }
        yqjVar = new yqj(irjVar, sq3Var);
        Object obj2 = yqjVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = yqjVar.w;
        int i62 = 3;
        int i72 = 2;
        int i82 = 1;
        if (i2 != 0) {
        }
        if (((Number) obj2).intValue() <= 0) {
        }
        if (i3 != 0) {
        }
        return Boolean.valueOf(i3 != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object g(irj irjVar, ArrayList arrayList, sq3 sq3Var) {
        zqj zqjVar;
        int i;
        Iterator it;
        int i2;
        if (sq3Var instanceof zqj) {
            zqjVar = (zqj) sq3Var;
            int i3 = zqjVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zqjVar.w = i3 - Integer.MIN_VALUE;
                Object obj = zqjVar.u;
                Object obj2 = lu3.a;
                i = zqjVar.w;
                int i4 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    it = arrayList.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = zqjVar.t;
                    Iterator it2 = zqjVar.s;
                    irj irjVar2 = zqjVar.r;
                    y6a.M(obj);
                    it = it2;
                    i2 = i5;
                    irjVar = irjVar2;
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int intValue = ((Number) pair.a).intValue();
                    int intValue2 = ((Number) pair.b).intValue();
                    zqjVar.r = irjVar;
                    zqjVar.s = it;
                    zqjVar.t = i2;
                    zqjVar.w = 1;
                    Object U = gz8.U(zqjVar, irjVar.a, false, true, new nu9(intValue2, intValue, i4));
                    if (U != lu3.a) {
                        U = Unit.a;
                    }
                    if (U == obj2) {
                        return obj2;
                    }
                }
                return Unit.a;
            }
        }
        zqjVar = new zqj(irjVar, sq3Var);
        Object obj3 = zqjVar.u;
        Object obj22 = lu3.a;
        i = zqjVar.w;
        int i42 = 1;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }
}
