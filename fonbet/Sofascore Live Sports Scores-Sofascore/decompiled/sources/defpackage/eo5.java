package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eo5 {
    public final apf a;
    public final n72 b;
    public final f4a c;
    public final d4a d;

    public eo5(apf apfVar, n72 n72Var, f4a f4aVar) {
        this.a = apfVar;
        this.b = n72Var;
        this.c = f4aVar;
        this.d = new d4a(apfVar, f4aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:10:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fwh fwhVar, ic3 ic3Var, nt9 nt9Var, Object obj, tvd tvdVar, f7a f7aVar, sq3 sq3Var) {
        vn5 vn5Var;
        int i;
        int i2;
        int size;
        Pair pair;
        if (sq3Var instanceof vn5) {
            vn5Var = (vn5) sq3Var;
            int i3 = vn5Var.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vn5Var.A = i3 - Integer.MIN_VALUE;
                Object obj2 = vn5Var.y;
                lu3 lu3Var = lu3.a;
                i = vn5Var.A;
                if (i != 0) {
                    y6a.M(obj2);
                    i2 = 0;
                    size = ((List) ic3Var.g.getValue()).size();
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = vn5Var.x;
                    f7a f7aVar2 = vn5Var.w;
                    tvd tvdVar2 = vn5Var.v;
                    obj = vn5Var.u;
                    nt9 nt9Var2 = vn5Var.t;
                    ic3 ic3Var2 = vn5Var.s;
                    fwh fwhVar2 = vn5Var.r;
                    y6a.M(obj2);
                    f7aVar = f7aVar2;
                    ic3Var = ic3Var2;
                    tvdVar = tvdVar2;
                    nt9Var = nt9Var2;
                    vl4 vl4Var = (vl4) obj2;
                    f7aVar.getClass();
                    if (vl4Var == null) {
                        nr9 nr9Var = vl4Var.a;
                        boolean z = vl4Var.b;
                        pe4 pe4Var = fwhVar2.c;
                        yt9 yt9Var = fwhVar2.a;
                        b18 b18Var = yt9Var instanceof b18 ? (b18) yt9Var : null;
                        return new tn5(nr9Var, z, pe4Var, b18Var != null ? b18Var.c : null);
                    }
                    i2 = i4;
                    fwhVar = fwhVar2;
                    size = ((List) ic3Var.g.getValue()).size();
                    while (true) {
                        if (i2 >= size) {
                            pair = null;
                            break;
                        }
                        am4 a = ((zl4) ((List) ic3Var.g.getValue()).get(i2)).a(fwhVar, tvdVar);
                        if (a != null) {
                            pair = new Pair(a, Integer.valueOf(i2));
                            break;
                        }
                        i2++;
                    }
                    if (pair != null) {
                        hc5.f(mz1.m(obj, "Unable to create a decoder that supports: "));
                        return null;
                    }
                    am4 am4Var = (am4) pair.a;
                    int intValue = ((Number) pair.b).intValue() + 1;
                    f7aVar.getClass();
                    vn5Var.r = fwhVar;
                    vn5Var.s = ic3Var;
                    vn5Var.t = nt9Var;
                    vn5Var.u = obj;
                    vn5Var.v = tvdVar;
                    vn5Var.w = f7aVar;
                    vn5Var.x = intValue;
                    vn5Var.A = 1;
                    obj2 = am4Var.a(vn5Var);
                    if (obj2 == lu3Var) {
                        return lu3Var;
                    }
                    fwhVar2 = fwhVar;
                    i4 = intValue;
                    vl4 vl4Var2 = (vl4) obj2;
                    f7aVar.getClass();
                    if (vl4Var2 == null) {
                    }
                }
            }
        }
        vn5Var = new vn5(this, sq3Var);
        Object obj22 = vn5Var.y;
        lu3 lu3Var2 = lu3.a;
        i = vn5Var.A;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0143, code lost:
    
        if (r1 == r10) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:44:0x005e, B:46:0x00c5, B:48:0x00d0), top: B:43:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: all -> 0x004d, TryCatch #5 {all -> 0x004d, blocks: (B:22:0x0047, B:24:0x00f6, B:50:0x00da, B:55:0x00fc, B:57:0x0101, B:58:0x0158, B:59:0x015d), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(nt9 nt9Var, Object obj, tvd tvdVar, f7a f7aVar, sq3 sq3Var) {
        xn5 xn5Var;
        fsf fsfVar;
        fwh fwhVar;
        yt9 yt9Var;
        fsf fsfVar2;
        xn5 xn5Var2;
        nt9 nt9Var2;
        Object obj2;
        fsf fsfVar3;
        fsf fsfVar4;
        fsf fsfVar5;
        f7a f7aVar2;
        zy7 zy7Var;
        fsf fsfVar6;
        tn5 tn5Var;
        fsf fsfVar7;
        f7a f7aVar3;
        fwh fwhVar2;
        yt9 yt9Var2;
        try {
            if (sq3Var instanceof xn5) {
                xn5Var = (xn5) sq3Var;
                int i = xn5Var.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    xn5Var.A = i - Integer.MIN_VALUE;
                    xn5 xn5Var3 = xn5Var;
                    Object obj3 = xn5Var3.y;
                    Object obj4 = lu3.a;
                    fsfVar = xn5Var3.A;
                    if (fsfVar != 0) {
                        fsf g = lnb.g(obj3);
                        g.a = tvdVar;
                        fsfVar2 = new fsf();
                        fsfVar2.a = this.a.d;
                        fsf fsfVar8 = new fsf();
                        try {
                            g.a = this.c.C((tvd) g.a);
                            nt9Var.getClass();
                            ic3 ic3Var = (ic3) fsfVar2.a;
                            tvd tvdVar2 = (tvd) g.a;
                            xn5Var3.r = nt9Var;
                            xn5Var3.s = obj;
                            xn5Var3.t = f7aVar;
                            xn5Var3.u = g;
                            xn5Var3.v = fsfVar2;
                            xn5Var3.w = fsfVar8;
                            xn5Var3.x = fsfVar8;
                            xn5Var3.A = 1;
                            obj3 = c(ic3Var, nt9Var, obj, tvdVar2, f7aVar, xn5Var3);
                            xn5Var2 = xn5Var3;
                            if (obj3 != obj4) {
                                nt9Var2 = nt9Var;
                                obj2 = obj;
                                fsfVar3 = g;
                                fsfVar4 = fsfVar8;
                                fsfVar5 = fsfVar4;
                                f7aVar2 = f7aVar;
                            }
                            return obj4;
                        } catch (Throwable th) {
                            th = th;
                            fsfVar = fsfVar8;
                            Object obj5 = fsfVar.a;
                            if (obj5 instanceof fwh) {
                            }
                            if (fwhVar != null) {
                                dmi.v(yt9Var);
                            }
                            throw th;
                        }
                    }
                    if (fsfVar == 1) {
                        fsfVar4 = xn5Var3.x;
                        fsfVar5 = xn5Var3.w;
                        fsf fsfVar9 = xn5Var3.v;
                        fsf fsfVar10 = xn5Var3.u;
                        f7aVar2 = xn5Var3.t;
                        Object obj6 = xn5Var3.s;
                        nt9 nt9Var3 = xn5Var3.r;
                        try {
                            y6a.M(obj3);
                            xn5Var2 = xn5Var3;
                            fsfVar3 = fsfVar10;
                            obj2 = obj6;
                            fsfVar2 = fsfVar9;
                            nt9Var2 = nt9Var3;
                        } catch (Throwable th2) {
                            th = th2;
                            fsfVar = fsfVar5;
                            Object obj52 = fsfVar.a;
                            fwhVar = obj52 instanceof fwh ? (fwh) obj52 : null;
                            if (fwhVar != null && (yt9Var = fwhVar.a) != null) {
                                try {
                                    dmi.v(yt9Var);
                                } catch (RuntimeException e) {
                                    throw e;
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        if (fsfVar != 2) {
                            if (fsfVar != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj3);
                            tn5 tn5Var2 = (tn5) obj3;
                            nr9 nr9Var = tn5Var2.a;
                            Bitmap.Config[] configArr = gjk.a;
                            if (nr9Var instanceof ax1) {
                                ((ax1) nr9Var).a.prepareToDraw();
                            }
                            return tn5Var2;
                        }
                        fsfVar6 = xn5Var3.w;
                        fsfVar7 = xn5Var3.u;
                        f7aVar3 = xn5Var3.t;
                        nt9Var2 = xn5Var3.r;
                        y6a.M(obj3);
                        xn5Var2 = xn5Var3;
                        tn5Var = (tn5) obj3;
                        fsfVar3 = fsfVar7;
                        f7aVar2 = f7aVar3;
                        Object obj7 = fsfVar6.a;
                        fwhVar2 = obj7 instanceof fwh ? (fwh) obj7 : null;
                        if (fwhVar2 != null && (yt9Var2 = fwhVar2.a) != null) {
                            try {
                                dmi.v(yt9Var2);
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (Exception unused2) {
                            }
                        }
                        tvd tvdVar3 = (tvd) fsfVar3.a;
                        xn5Var2.r = null;
                        xn5Var2.s = null;
                        xn5Var2.t = null;
                        xn5Var2.u = null;
                        xn5Var2.v = null;
                        xn5Var2.w = null;
                        xn5Var2.x = null;
                        xn5Var2.A = 3;
                        obj3 = ok3.L(tn5Var, nt9Var2, tvdVar3, f7aVar2, xn5Var2);
                    }
                    fsfVar4.a = obj3;
                    Object obj8 = fsfVar5.a;
                    zy7Var = (zy7) obj8;
                    if (zy7Var instanceof fwh) {
                        fsfVar6 = fsfVar5;
                        if (!(zy7Var instanceof bs9)) {
                            throw new ndd();
                        }
                        tn5Var = new tn5(((bs9) obj8).a, ((bs9) obj8).b, ((bs9) obj8).c, null);
                        Object obj72 = fsfVar6.a;
                        if (obj72 instanceof fwh) {
                        }
                        if (fwhVar2 != null) {
                        }
                        tvd tvdVar32 = (tvd) fsfVar3.a;
                        xn5Var2.r = null;
                        xn5Var2.s = null;
                        xn5Var2.t = null;
                        xn5Var2.u = null;
                        xn5Var2.v = null;
                        xn5Var2.w = null;
                        xn5Var2.x = null;
                        xn5Var2.A = 3;
                        obj3 = ok3.L(tn5Var, nt9Var2, tvdVar32, f7aVar2, xn5Var2);
                    } else {
                        CoroutineContext coroutineContext = nt9Var2.k;
                        fsfVar6 = fsfVar5;
                        ts2 ts2Var = new ts2((Object) this, fsfVar6, fsfVar2, (Object) nt9Var2, obj2, fsfVar3, (Object) f7aVar2, (rq3) null, 4);
                        xn5Var2.r = nt9Var2;
                        xn5Var2.s = null;
                        xn5Var2.t = f7aVar2;
                        xn5Var2.u = fsfVar3;
                        xn5Var2.v = null;
                        xn5Var2.w = fsfVar6;
                        xn5Var2.x = null;
                        xn5Var2.A = 2;
                        obj3 = xw3.R(coroutineContext, ts2Var, xn5Var2);
                        if (obj3 == obj4) {
                            return obj4;
                        }
                        fsfVar7 = fsfVar3;
                        f7aVar3 = f7aVar2;
                        tn5Var = (tn5) obj3;
                        fsfVar3 = fsfVar7;
                        f7aVar2 = f7aVar3;
                        Object obj722 = fsfVar6.a;
                        if (obj722 instanceof fwh) {
                        }
                        if (fwhVar2 != null) {
                            dmi.v(yt9Var2);
                        }
                        tvd tvdVar322 = (tvd) fsfVar3.a;
                        xn5Var2.r = null;
                        xn5Var2.s = null;
                        xn5Var2.t = null;
                        xn5Var2.u = null;
                        xn5Var2.v = null;
                        xn5Var2.w = null;
                        xn5Var2.x = null;
                        xn5Var2.A = 3;
                        obj3 = ok3.L(tn5Var, nt9Var2, tvdVar322, f7aVar2, xn5Var2);
                    }
                }
            }
            if (fsfVar != 0) {
            }
            fsfVar4.a = obj3;
            Object obj82 = fsfVar5.a;
            zy7Var = (zy7) obj82;
            if (zy7Var instanceof fwh) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        xn5Var = new xn5(this, sq3Var);
        xn5 xn5Var32 = xn5Var;
        Object obj32 = xn5Var32.y;
        Object obj42 = lu3.a;
        fsfVar = xn5Var32.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00af -> B:10:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ic3 ic3Var, nt9 nt9Var, Object obj, tvd tvdVar, f7a f7aVar, sq3 sq3Var) {
        zn5 zn5Var;
        int i;
        int i2;
        int size;
        Pair pair;
        yt9 yt9Var;
        if (sq3Var instanceof zn5) {
            zn5Var = (zn5) sq3Var;
            int i3 = zn5Var.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zn5Var.z = i3 - Integer.MIN_VALUE;
                Object obj2 = zn5Var.x;
                lu3 lu3Var = lu3.a;
                i = zn5Var.z;
                if (i != 0) {
                    y6a.M(obj2);
                    i2 = 0;
                    size = ((List) ic3Var.f.getValue()).size();
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = zn5Var.w;
                    f7a f7aVar2 = zn5Var.v;
                    tvd tvdVar2 = zn5Var.u;
                    Object obj3 = zn5Var.t;
                    nt9 nt9Var2 = zn5Var.s;
                    ic3 ic3Var2 = zn5Var.r;
                    y6a.M(obj2);
                    int intValue = i4;
                    ic3Var = ic3Var2;
                    f7aVar = f7aVar2;
                    nt9Var = nt9Var2;
                    tvdVar = tvdVar2;
                    obj = obj3;
                    zy7 zy7Var = (zy7) obj2;
                    try {
                        f7aVar.getClass();
                        if (zy7Var == null) {
                            return zy7Var;
                        }
                        i2 = intValue;
                        size = ((List) ic3Var.f.getValue()).size();
                        while (true) {
                            if (i2 < size) {
                                pair = null;
                                break;
                            }
                            Pair pair2 = (Pair) ((List) ic3Var.f.getValue()).get(i2);
                            bz7 bz7Var = (bz7) pair2.a;
                            if (((KClass) pair2.b).isInstance(obj)) {
                                bz7Var.getClass();
                                dz7 a = bz7Var.a(obj, tvdVar, this.a);
                                if (a != null) {
                                    pair = new Pair(a, Integer.valueOf(i2));
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (pair != null) {
                            hc5.f(mz1.m(obj, "Unable to create a fetcher that supports: "));
                            return null;
                        }
                        dz7 dz7Var = (dz7) pair.a;
                        intValue = ((Number) pair.b).intValue() + 1;
                        f7aVar.getClass();
                        zn5Var.r = ic3Var;
                        zn5Var.s = nt9Var;
                        zn5Var.t = obj;
                        zn5Var.u = tvdVar;
                        zn5Var.v = f7aVar;
                        zn5Var.w = intValue;
                        zn5Var.z = 1;
                        obj2 = dz7Var.a(zn5Var);
                        if (obj2 == lu3Var) {
                            return lu3Var;
                        }
                        zy7 zy7Var2 = (zy7) obj2;
                        f7aVar.getClass();
                        if (zy7Var2 == null) {
                        }
                    } catch (Throwable th) {
                        fwh fwhVar = zy7Var2 instanceof fwh ? (fwh) zy7Var2 : null;
                        if (fwhVar != null && (yt9Var = fwhVar.a) != null) {
                            try {
                                dmi.v(yt9Var);
                            } catch (RuntimeException e) {
                                throw e;
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            }
        }
        zn5Var = new zn5(this, sq3Var);
        Object obj22 = zn5Var.x;
        lu3 lu3Var2 = lu3.a;
        i = zn5Var.z;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(i5d i5dVar, sq3 sq3Var) {
        bo5 bo5Var;
        int i;
        i5d i5dVar2 = i5dVar;
        d4a d4aVar = this.d;
        if (sq3Var instanceof bo5) {
            bo5Var = (bo5) sq3Var;
            int i2 = bo5Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bo5Var.u = i2 - Integer.MIN_VALUE;
                bo5 bo5Var2 = bo5Var;
                Object obj = bo5Var2.s;
                lu3 lu3Var = lu3.a;
                i = bo5Var2.u;
                if (i != 0) {
                    y6a.M(obj);
                    try {
                        nt9 nt9Var = (nt9) i5dVar2.e;
                        Object obj2 = nt9Var.b;
                        kjh kjhVar = (kjh) i5dVar2.f;
                        f7a f7aVar = (f7a) i5dVar2.g;
                        tvd s = this.c.s(nt9Var, kjhVar);
                        jrg jrgVar = s.c;
                        List list = this.a.d.b;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Pair pair = (Pair) list.get(i3);
                            q40 q40Var = (q40) pair.a;
                            if (((KClass) pair.b).isInstance(obj2)) {
                                q40Var.getClass();
                                eek a = q40Var.a(obj2, s);
                                if (a != null) {
                                    obj2 = a;
                                }
                            }
                        }
                        nec s2 = d4aVar.s(nt9Var, obj2, s, f7aVar);
                        oec r = s2 != null ? d4aVar.r(nt9Var, s2, kjhVar, jrgVar) : null;
                        if (r == null) {
                            CoroutineContext coroutineContext = nt9Var.j;
                            ts2 ts2Var = new ts2(this, nt9Var, obj2, s, f7aVar, s2, i5dVar2, (rq3) null, 6);
                            bo5Var2.r = i5dVar2;
                            bo5Var2.u = 1;
                            Object R = xw3.R(coroutineContext, ts2Var, bo5Var2);
                            return R == lu3Var ? lu3Var : R;
                        }
                        Map map = r.b;
                        nr9 nr9Var = r.a;
                        pe4 pe4Var = pe4.a;
                        Object obj3 = map.get("coil#disk_cache_key");
                        String str = obj3 instanceof String ? (String) obj3 : null;
                        Object obj4 = map.get("coil#is_sampled");
                        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                        return new emi(nr9Var, nt9Var, pe4Var, s2, str, bool != null ? bool.booleanValue() : false, i5dVar2.b);
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5d i5dVar3 = bo5Var2.r;
                    try {
                        y6a.M(obj);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        i5dVar2 = i5dVar3;
                    }
                }
                if (th instanceof CancellationException) {
                    return d2a.a((nt9) i5dVar2.e, th);
                }
                throw th;
            }
        }
        bo5Var = new bo5(this, sq3Var);
        bo5 bo5Var22 = bo5Var;
        Object obj5 = bo5Var22.s;
        lu3 lu3Var2 = lu3.a;
        i = bo5Var22.u;
        if (i != 0) {
        }
        if (th instanceof CancellationException) {
        }
    }
}
