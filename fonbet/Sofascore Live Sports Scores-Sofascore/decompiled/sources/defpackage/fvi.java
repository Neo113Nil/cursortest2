package defpackage;

import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fvi {
    public final k6g a;
    public final sz8 d = new sz8(16);
    public final s82 b = new s82(22);
    public final evi c = new evi(this, 0);
    public final fp4 e = new fp4(11, new re9(this, 2), new evi(this, 1));

    public fvi(k6g k6gVar) {
        this.a = k6gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (defpackage.gz8.U(r0, r8.a, false, true, new defpackage.cvi(r8, r10, r5 == true ? 1 : 0)) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(fvi fviVar, Pair pair, sq3 sq3Var) {
        yui yuiVar;
        int i;
        if (sq3Var instanceof yui) {
            yuiVar = (yui) sq3Var;
            int i2 = yuiVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yuiVar.v = i2 - Integer.MIN_VALUE;
                Object obj = yuiVar.t;
                lu3 lu3Var = lu3.a;
                i = yuiVar.v;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    Team team = (Team) pair.a;
                    yuiVar.r = fviVar;
                    yuiVar.s = pair;
                    yuiVar.v = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Boolean.valueOf(((Number) obj).longValue() != -1);
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pair = yuiVar.s;
                    fviVar = yuiVar.r;
                    y6a.M(obj);
                }
                DbMyTeam dbMyTeam = new DbMyTeam(((Team) pair.a).getId(), ((Boolean) pair.b).booleanValue());
                yuiVar.r = null;
                yuiVar.s = null;
                yuiVar.v = 2;
                obj = gz8.U(yuiVar, fviVar.a, false, true, new dvi(objArr2 == true ? 1 : 0, fviVar, dbMyTeam));
            }
        }
        yuiVar = new yui(fviVar, sq3Var);
        Object obj2 = yuiVar.t;
        lu3 lu3Var2 = lu3.a;
        i = yuiVar.v;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i != 0) {
        }
        DbMyTeam dbMyTeam2 = new DbMyTeam(((Team) pair.a).getId(), ((Boolean) pair.b).booleanValue());
        yuiVar.r = null;
        yuiVar.s = null;
        yuiVar.v = 2;
        obj2 = gz8.U(yuiVar, fviVar.a, false, true, new dvi(objArr22 == true ? 1 : 0, fviVar, dbMyTeam2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008d -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(fvi fviVar, ArrayList arrayList, sq3 sq3Var) {
        zui zuiVar;
        int i;
        Iterator it;
        ArrayList arrayList2;
        int i2;
        int i3;
        if (sq3Var instanceof zui) {
            zuiVar = (zui) sq3Var;
            int i4 = zuiVar.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zuiVar.z = i4 - Integer.MIN_VALUE;
                Object obj = zuiVar.x;
                lu3 lu3Var = lu3.a;
                i = zuiVar.z;
                rq3 rq3Var = null;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
                    it = arrayList.iterator();
                    arrayList2 = arrayList3;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = zuiVar.w;
                    int i6 = zuiVar.v;
                    Collection collection = zuiVar.u;
                    Iterator it2 = zuiVar.t;
                    Collection collection2 = zuiVar.s;
                    fvi fviVar2 = zuiVar.r;
                    y6a.M(obj);
                    i2 = i5;
                    fviVar = fviVar2;
                    Iterator it3 = it2;
                    ArrayList arrayList4 = collection;
                    zui zuiVar2 = zuiVar;
                    int i7 = i6;
                    ArrayList arrayList5 = collection2;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    arrayList4.add(bool);
                    i3 = i7;
                    zuiVar = zuiVar2;
                    arrayList2 = arrayList5;
                    it = it3;
                    if (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        zuiVar.r = fviVar;
                        ArrayList arrayList6 = arrayList2;
                        zuiVar.s = arrayList6;
                        zuiVar.t = it;
                        zuiVar.u = arrayList6;
                        zuiVar.v = i3;
                        zuiVar.w = i2;
                        zuiVar.z = 1;
                        Object T = gz8.T(zuiVar, fviVar.a, new fzh(fviVar, pair, rq3Var, 3));
                        if (T == lu3Var) {
                            return lu3Var;
                        }
                        it3 = it;
                        arrayList4 = arrayList2;
                        zuiVar2 = zuiVar;
                        i7 = i3;
                        obj = T;
                        arrayList5 = arrayList4;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        arrayList4.add(bool2);
                        i3 = i7;
                        zuiVar = zuiVar2;
                        arrayList2 = arrayList5;
                        it = it3;
                        if (it.hasNext()) {
                            ArrayList arrayList7 = arrayList2;
                            if (arrayList7 == null || !arrayList7.isEmpty()) {
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    if (((Boolean) it4.next()).booleanValue()) {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                }
            }
        }
        zuiVar = new zui(fviVar, sq3Var);
        Object obj2 = zuiVar.x;
        lu3 lu3Var2 = lu3.a;
        i = zuiVar.z;
        rq3 rq3Var2 = null;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        if (defpackage.gz8.U(r0, r2.a, false, true, new defpackage.bvb(r10, 24)) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r11 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(fvi fviVar, int i, sq3 sq3Var) {
        avi aviVar;
        int i2;
        int i3;
        fvi fviVar2;
        int i4;
        if (sq3Var instanceof avi) {
            aviVar = (avi) sq3Var;
            int i5 = aviVar.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aviVar.w = i5 - Integer.MIN_VALUE;
                Object obj = aviVar.u;
                lu3 lu3Var = lu3.a;
                i2 = aviVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    aviVar.r = fviVar;
                    aviVar.s = i;
                    aviVar.w = 1;
                    obj = gz8.U(aviVar, fviVar.a, false, true, new bvb(i, 23));
                } else if (i2 == 1) {
                    i = aviVar.s;
                    fviVar = aviVar.r;
                    y6a.M(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = aviVar.t;
                        y6a.M(obj);
                        i3 = i4;
                        return Boolean.valueOf(i3 != 0);
                    }
                    i4 = aviVar.t;
                    i = aviVar.s;
                    fviVar2 = aviVar.r;
                    y6a.M(obj);
                    aviVar.r = null;
                    aviVar.s = i;
                    aviVar.t = i4;
                    aviVar.w = 3;
                }
                i3 = ((Number) obj).intValue() <= 0 ? 1 : 0;
                if (i3 != 0) {
                    aviVar.r = fviVar;
                    aviVar.s = i;
                    aviVar.t = i3;
                    aviVar.w = 2;
                    Object U = gz8.U(aviVar, fviVar.a, false, true, new bvb(i, 25));
                    if (U != lu3Var) {
                        U = Unit.a;
                    }
                    if (U != lu3Var) {
                        fviVar2 = fviVar;
                        i4 = i3;
                        aviVar.r = null;
                        aviVar.s = i;
                        aviVar.t = i4;
                        aviVar.w = 3;
                    }
                    return lu3Var;
                }
                return Boolean.valueOf(i3 != 0);
            }
        }
        aviVar = new avi(fviVar, sq3Var);
        Object obj2 = aviVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = aviVar.w;
        if (i2 != 0) {
        }
        if (((Number) obj2).intValue() <= 0) {
        }
        if (i3 != 0) {
        }
        return Boolean.valueOf(i3 != 0);
    }
}
