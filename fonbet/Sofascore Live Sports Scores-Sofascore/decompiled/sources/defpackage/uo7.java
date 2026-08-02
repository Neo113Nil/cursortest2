package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uo7 extends hoi implements Function2 {
    public zu4 A;
    public List B;
    public List C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ho7 G;
    public final /* synthetic */ vo7 H;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public do7 u;
    public List v;
    public List w;
    public ho7 x;
    public av4 y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo7(ho7 ho7Var, vo7 vo7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.G = ho7Var;
        this.H = vo7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        uo7 uo7Var = new uo7(this.G, this.H, rq3Var);
        uo7Var.F = obj;
        return uo7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uo7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01a8, code lost:
    
        if (r6 == r10) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00de A[LOOP:8: B:179:0x00de->B:184:0x0129, LOOP_START, PHI: r1
      0x00de: PHI (r1v6 ho7) = (r1v2 ho7), (r1v10 ho7) binds: [B:178:0x00dc, B:184:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024c  */
    /* JADX WARN: Type inference failed for: r3v15, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v12, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v15, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.List] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        av4 t;
        av4 t2;
        Object w;
        zu4 zu4Var;
        ho7 ho7Var;
        Object obj2;
        ho7 ho7Var2;
        mj7 mj7Var;
        do7 do7Var;
        Object T;
        do7 do7Var2;
        int i2;
        List list;
        Object T2;
        List list2;
        Object obj3;
        ho7 ho7Var3;
        Object value;
        Object w2;
        av4 av4Var;
        int i3;
        zu4 zu4Var2;
        do7 do7Var3;
        List list3;
        List list4;
        ArrayList arrayList;
        zu4 zu4Var3;
        List list5;
        do7 do7Var4;
        List list6;
        List list7;
        km5 km5Var;
        av4 av4Var2;
        int i4;
        Object T3;
        ho7 ho7Var4;
        ArrayList arrayList2;
        av4 av4Var3;
        Object T4;
        List list8;
        List list9;
        List list10;
        List list11;
        ho7 ho7Var5;
        zu4 zu4Var4;
        Object T5;
        List list12;
        ho7 ho7Var6;
        List list13;
        do7 do7Var5;
        List<ho7> list14;
        List list15;
        List list16;
        Iterator it;
        boolean z;
        gv9 gv9Var;
        Iterator it2;
        ho7 a;
        ArrayList arrayList3;
        Object value2;
        vo7 vo7Var = this.H;
        fdi fdiVar = vo7Var.k;
        ku3 ku3Var = (ku3) this.F;
        lu3 lu3Var = lu3.a;
        int i5 = 2;
        rq3 rq3Var = null;
        switch (this.E) {
            case 0:
                y6a.M(obj);
                ho7 ho7Var7 = this.G;
                if (ho7Var7 != null) {
                    Object value3 = fdiVar.getValue();
                    po7 po7Var = value3 instanceof po7 ? (po7) value3 : null;
                    if (po7Var == null || (ho7Var2 = po7Var.b) == null || (mj7Var = ho7Var2.a) == null || mj7Var.a != ho7Var7.a.a) {
                        i = 1;
                        if (i != 0) {
                            while (true) {
                                Object value4 = fdiVar.getValue();
                                if (value4 instanceof po7) {
                                    po7 po7Var2 = (po7) value4;
                                    do7 do7Var6 = po7Var2.a;
                                    gv9 gv9Var2 = po7Var2.c;
                                    gv9 gv9Var3 = po7Var2.d;
                                    gv9 gv9Var4 = po7Var2.e;
                                    gv9 gv9Var5 = po7Var2.f;
                                    gv9 gv9Var6 = po7Var2.g;
                                    do7Var6.getClass();
                                    ho7Var7.getClass();
                                    gv9Var2.getClass();
                                    gv9Var3.getClass();
                                    gv9Var4.getClass();
                                    gv9Var6.getClass();
                                    ho7Var = ho7Var7;
                                    obj2 = new po7(do7Var6, ho7Var, gv9Var2, gv9Var3, gv9Var4, gv9Var5, gv9Var6, true);
                                } else {
                                    ho7Var = ho7Var7;
                                    obj2 = value4;
                                }
                                if (!fdiVar.k(value4, obj2)) {
                                    ho7Var7 = ho7Var;
                                }
                            }
                        }
                        av4 t3 = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, i5), 3);
                        t = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, 3), 3);
                        av4 t4 = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, 1), 3);
                        t2 = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, 0), 3);
                        this.F = ku3Var;
                        this.r = t;
                        this.s = t4;
                        this.t = t2;
                        this.D = i;
                        this.E = 1;
                        w = t3.w(this);
                        lu3 lu3Var2 = lu3.a;
                        if (w != lu3Var) {
                            zu4Var = t4;
                            do7Var = (do7) w;
                            if (do7Var != null) {
                                return Unit.a;
                            }
                            this.F = ku3Var;
                            this.r = null;
                            this.s = zu4Var;
                            this.t = t2;
                            this.u = do7Var;
                            this.D = i;
                            this.E = 2;
                            T = t.T(this);
                            if (T != lu3Var) {
                                int i6 = i;
                                do7Var2 = do7Var;
                                i2 = i6;
                                list = (List) T;
                                if (list != null) {
                                    return Unit.a;
                                }
                                this.F = ku3Var;
                                this.r = null;
                                this.s = zu4Var;
                                this.t = null;
                                this.u = do7Var2;
                                this.v = list;
                                this.D = i2;
                                this.E = 3;
                                T2 = t2.T(this);
                                break;
                            }
                        }
                        return lu3Var;
                    }
                }
                i = 0;
                if (i != 0) {
                }
                av4 t32 = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, i5), 3);
                t = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, 3), 3);
                av4 t42 = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, 1), 3);
                t2 = xw3.t(ku3Var, null, new to7(vo7Var, rq3Var, 0), 3);
                this.F = ku3Var;
                this.r = t;
                this.s = t42;
                this.t = t2;
                this.D = i;
                this.E = 1;
                w = t32.w(this);
                lu3 lu3Var22 = lu3.a;
                if (w != lu3Var) {
                }
                return lu3Var;
            case 1:
                int i7 = this.D;
                ?? r4 = this.t;
                zu4Var = this.s;
                t = this.r;
                y6a.M(obj);
                t2 = r4;
                i = i7;
                w = obj;
                do7Var = (do7) w;
                if (do7Var != null) {
                }
                break;
            case 2:
                i2 = this.D;
                do7 do7Var7 = this.u;
                ?? r42 = this.t;
                zu4Var = this.s;
                y6a.M(obj);
                t2 = r42;
                do7Var2 = do7Var7;
                T = obj;
                list = (List) T;
                if (list != null) {
                }
                break;
            case 3:
                i2 = this.D;
                list = this.v;
                do7Var2 = this.u;
                zu4Var = this.s;
                y6a.M(obj);
                T2 = obj;
                do7 do7Var8 = do7Var2;
                list2 = (List) T2;
                Object value5 = fdiVar.getValue();
                po7 po7Var3 = value5 instanceof po7 ? (po7) value5 : null;
                if (po7Var3 == null || (ho7Var3 = po7Var3.b) == null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            int i8 = ((ho7) obj3).a.a;
                            Integer num = vo7Var.j;
                            if (num != null && i8 == num.intValue()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    ho7 ho7Var8 = (ho7) obj3;
                    if (ho7Var8 == null) {
                        ho7Var3 = (ho7) CollectionsKt.j0(list);
                        if (ho7Var3 == null) {
                            do {
                                value = fdiVar.getValue();
                            } while (!fdiVar.k(value, new no7(do7Var8)));
                            return Unit.a;
                        }
                    } else {
                        ho7Var3 = ho7Var8;
                    }
                }
                av4 t5 = xw3.t(ku3Var, null, new so7(vo7Var, ho7Var3, rq3Var, 1), 3);
                av4 p = yaa.p(ku3Var, vo7Var.n == FantasyCompetitionType.WEEKLY, new so7(vo7Var, ho7Var3, rq3Var, 0));
                this.F = ku3Var;
                this.r = null;
                this.s = zu4Var;
                this.t = null;
                this.u = do7Var8;
                this.v = list;
                this.w = list2;
                this.x = ho7Var3;
                this.y = p;
                this.D = i2;
                this.E = 4;
                w2 = t5.w(this);
                lu3 lu3Var3 = lu3.a;
                if (w2 != lu3Var) {
                    av4Var = p;
                    i3 = i2;
                    zu4Var2 = zu4Var;
                    do7Var3 = do7Var8;
                    list3 = list;
                    list4 = (List) w2;
                    if (list4 != null) {
                        return Unit.a;
                    }
                    arrayList = new ArrayList(k13.r(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(hkg.g0((FantasyRoundPlayer) it4.next(), vo7Var.i()));
                    }
                    List list17 = list3;
                    zu4Var3 = zu4Var2;
                    list5 = list2;
                    av4 t6 = xw3.t(ku3Var, null, new u1(vo7Var, arrayList, ho7Var3, do7Var3, null, 23), 3);
                    if (av4Var != null) {
                        this.F = null;
                        this.r = null;
                        this.s = zu4Var3;
                        this.t = null;
                        this.u = do7Var3;
                        this.v = list17;
                        this.w = list5;
                        this.x = ho7Var3;
                        this.y = null;
                        this.z = arrayList;
                        this.A = t6;
                        this.D = i3;
                        this.E = 5;
                        T3 = av4Var.T(this);
                        if (T3 != lu3Var) {
                            do7Var4 = do7Var3;
                            list7 = list17;
                            ho7Var4 = ho7Var3;
                            arrayList2 = arrayList;
                            av4Var3 = t6;
                            i4 = i3;
                            ho7 ho7Var9 = ho7Var4;
                            av4Var2 = av4Var3;
                            arrayList = arrayList2;
                            ho7Var3 = ho7Var9;
                            List list18 = list5;
                            km5Var = (List) T3;
                            list6 = list18;
                            if (km5Var == null) {
                                km5Var = km5.a;
                            }
                            this.F = null;
                            this.r = null;
                            this.s = null;
                            this.t = null;
                            this.u = do7Var4;
                            this.v = list7;
                            this.w = list6;
                            this.x = ho7Var3;
                            this.y = null;
                            this.z = arrayList;
                            this.A = av4Var2;
                            this.B = km5Var;
                            this.D = i4;
                            this.E = 6;
                            T4 = zu4Var3.T(this);
                            if (T4 != lu3Var) {
                                av4 av4Var4 = av4Var2;
                                list8 = arrayList;
                                list9 = km5Var;
                                list10 = list7;
                                list11 = list6;
                                ho7Var5 = ho7Var3;
                                zu4Var4 = av4Var4;
                                List list19 = (List) T4;
                                this.F = null;
                                this.r = null;
                                this.s = null;
                                this.t = null;
                                this.u = do7Var4;
                                this.v = list10;
                                this.w = list11;
                                this.x = ho7Var5;
                                this.y = null;
                                this.z = list8;
                                this.A = null;
                                this.B = list9;
                                this.C = list19;
                                this.D = i4;
                                this.E = 7;
                                T5 = zu4Var4.T(this);
                                if (T5 != lu3Var) {
                                    list12 = list8;
                                    ho7Var6 = ho7Var5;
                                    list13 = list11;
                                    do7Var5 = do7Var4;
                                    list14 = list10;
                                    list15 = list19;
                                    list16 = (List) T5;
                                    if (list12 != null || !list12.isEmpty()) {
                                        it = list12.iterator();
                                        while (it.hasNext()) {
                                            if (((FantasyRoundPlayerUiModel) it.next()).w) {
                                                z = true;
                                                if (z) {
                                                    vo7Var.o = new Integer(ho7Var6.a.a);
                                                } else {
                                                    Integer num2 = vo7Var.o;
                                                    int i9 = ho7Var6.a.a;
                                                    if (num2 != null && num2.intValue() == i9) {
                                                        gv9Var = null;
                                                        vo7Var.o = null;
                                                        ArrayList arrayList4 = new ArrayList();
                                                        for (Object obj4 : list16) {
                                                            if (!((FantasyRoundPlayerUiModel) obj4).k) {
                                                                arrayList4.add(obj4);
                                                            }
                                                        }
                                                        it2 = arrayList4.iterator();
                                                        int i10 = 0;
                                                        while (it2.hasNext()) {
                                                            Integer num3 = ((FantasyRoundPlayerUiModel) it2.next()).n;
                                                            i10 += num3 != null ? num3.intValue() : 0;
                                                        }
                                                        int i11 = ho7Var6.d;
                                                        mj7 mj7Var2 = ho7Var6.a;
                                                        a = ho7.a(ho7Var6, new Integer(i10 - i11), 0, false, false, false, z, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                                                        arrayList3 = new ArrayList(k13.r(list14, 10));
                                                        for (ho7 ho7Var10 : list14) {
                                                            int i12 = ho7Var10.a.a;
                                                            if (i12 == mj7Var2.a) {
                                                                ho7Var10 = a;
                                                            } else {
                                                                Integer num4 = vo7Var.o;
                                                                if (num4 != null && i12 == num4.intValue()) {
                                                                    ho7Var10 = ho7.a(ho7Var10, null, 0, false, false, false, true, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                                                                }
                                                            }
                                                            arrayList3.add(ho7Var10);
                                                        }
                                                        do {
                                                            value2 = fdiVar.getValue();
                                                        } while (!fdiVar.k(value2, new po7(do7Var5, a, l6g.W(arrayList3), l6g.W(list13), l6g.W(list16), list15 == null ? l6g.W(list15) : gv9Var, l6g.W(list9), false)));
                                                        if (vo7Var.r() == null) {
                                                            vo7Var.s(mj7Var2);
                                                        }
                                                        return Unit.a;
                                                    }
                                                }
                                                gv9Var = null;
                                                ArrayList arrayList42 = new ArrayList();
                                                while (r9.hasNext()) {
                                                }
                                                it2 = arrayList42.iterator();
                                                int i102 = 0;
                                                while (it2.hasNext()) {
                                                }
                                                int i112 = ho7Var6.d;
                                                mj7 mj7Var22 = ho7Var6.a;
                                                a = ho7.a(ho7Var6, new Integer(i102 - i112), 0, false, false, false, z, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                                                arrayList3 = new ArrayList(k13.r(list14, 10));
                                                while (r5.hasNext()) {
                                                }
                                                do {
                                                    value2 = fdiVar.getValue();
                                                } while (!fdiVar.k(value2, new po7(do7Var5, a, l6g.W(arrayList3), l6g.W(list13), l6g.W(list16), list15 == null ? l6g.W(list15) : gv9Var, l6g.W(list9), false)));
                                                if (vo7Var.r() == null) {
                                                }
                                                return Unit.a;
                                            }
                                        }
                                    }
                                    z = false;
                                    if (z) {
                                    }
                                    gv9Var = null;
                                    ArrayList arrayList422 = new ArrayList();
                                    while (r9.hasNext()) {
                                    }
                                    it2 = arrayList422.iterator();
                                    int i1022 = 0;
                                    while (it2.hasNext()) {
                                    }
                                    int i1122 = ho7Var6.d;
                                    mj7 mj7Var222 = ho7Var6.a;
                                    a = ho7.a(ho7Var6, new Integer(i1022 - i1122), 0, false, false, false, z, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                                    arrayList3 = new ArrayList(k13.r(list14, 10));
                                    while (r5.hasNext()) {
                                    }
                                    do {
                                        value2 = fdiVar.getValue();
                                    } while (!fdiVar.k(value2, new po7(do7Var5, a, l6g.W(arrayList3), l6g.W(list13), l6g.W(list16), list15 == null ? l6g.W(list15) : gv9Var, l6g.W(list9), false)));
                                    if (vo7Var.r() == null) {
                                    }
                                    return Unit.a;
                                }
                            }
                        }
                    } else {
                        do7Var4 = do7Var3;
                        list6 = list5;
                        list7 = list17;
                        km5Var = null;
                        av4Var2 = t6;
                        i4 = i3;
                        if (km5Var == null) {
                        }
                        this.F = null;
                        this.r = null;
                        this.s = null;
                        this.t = null;
                        this.u = do7Var4;
                        this.v = list7;
                        this.w = list6;
                        this.x = ho7Var3;
                        this.y = null;
                        this.z = arrayList;
                        this.A = av4Var2;
                        this.B = km5Var;
                        this.D = i4;
                        this.E = 6;
                        T4 = zu4Var3.T(this);
                        if (T4 != lu3Var) {
                        }
                    }
                }
                return lu3Var;
            case 4:
                int i13 = this.D;
                av4 av4Var5 = this.y;
                ho7Var3 = this.x;
                List list20 = this.w;
                List list21 = this.v;
                do7 do7Var9 = this.u;
                zu4 zu4Var5 = this.s;
                y6a.M(obj);
                list2 = list20;
                do7Var3 = do7Var9;
                list3 = list21;
                w2 = obj;
                i3 = i13;
                av4Var = av4Var5;
                zu4Var2 = zu4Var5;
                list4 = (List) w2;
                if (list4 != null) {
                }
                break;
            case 5:
                i4 = this.D;
                ?? r3 = this.A;
                ?? r43 = this.z;
                ho7Var4 = this.x;
                List list22 = this.w;
                list7 = this.v;
                do7Var4 = this.u;
                zu4 zu4Var6 = this.s;
                y6a.M(obj);
                zu4Var3 = zu4Var6;
                list5 = list22;
                T3 = obj;
                av4Var3 = r3;
                arrayList2 = r43;
                ho7 ho7Var92 = ho7Var4;
                av4Var2 = av4Var3;
                arrayList = arrayList2;
                ho7Var3 = ho7Var92;
                List list182 = list5;
                km5Var = (List) T3;
                list6 = list182;
                if (km5Var == null) {
                }
                this.F = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = do7Var4;
                this.v = list7;
                this.w = list6;
                this.x = ho7Var3;
                this.y = null;
                this.z = arrayList;
                this.A = av4Var2;
                this.B = km5Var;
                this.D = i4;
                this.E = 6;
                T4 = zu4Var3.T(this);
                if (T4 != lu3Var) {
                }
                return lu3Var;
            case 6:
                i4 = this.D;
                list9 = this.B;
                zu4Var4 = this.A;
                list8 = this.z;
                ho7Var5 = this.x;
                list11 = this.w;
                List list23 = this.v;
                do7 do7Var10 = this.u;
                y6a.M(obj);
                list10 = list23;
                do7Var4 = do7Var10;
                T4 = obj;
                List list192 = (List) T4;
                this.F = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = do7Var4;
                this.v = list10;
                this.w = list11;
                this.x = ho7Var5;
                this.y = null;
                this.z = list8;
                this.A = null;
                this.B = list9;
                this.C = list192;
                this.D = i4;
                this.E = 7;
                T5 = zu4Var4.T(this);
                if (T5 != lu3Var) {
                }
                return lu3Var;
            case 7:
                list15 = this.C;
                list9 = this.B;
                list12 = this.z;
                ho7Var6 = this.x;
                list13 = this.w;
                list14 = this.v;
                do7 do7Var11 = this.u;
                y6a.M(obj);
                do7Var5 = do7Var11;
                T5 = obj;
                list16 = (List) T5;
                if (list12 != null) {
                    break;
                }
                it = list12.iterator();
                while (it.hasNext()) {
                }
                z = false;
                if (z) {
                }
                gv9Var = null;
                ArrayList arrayList4222 = new ArrayList();
                while (r9.hasNext()) {
                }
                it2 = arrayList4222.iterator();
                int i10222 = 0;
                while (it2.hasNext()) {
                }
                int i11222 = ho7Var6.d;
                mj7 mj7Var2222 = ho7Var6.a;
                a = ho7.a(ho7Var6, new Integer(i10222 - i11222), 0, false, false, false, z, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                arrayList3 = new ArrayList(k13.r(list14, 10));
                while (r5.hasNext()) {
                }
                do {
                    value2 = fdiVar.getValue();
                } while (!fdiVar.k(value2, new po7(do7Var5, a, l6g.W(arrayList3), l6g.W(list13), l6g.W(list16), list15 == null ? l6g.W(list15) : gv9Var, l6g.W(list9), false)));
                if (vo7Var.r() == null) {
                }
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
