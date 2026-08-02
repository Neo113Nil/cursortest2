package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fo5 {
    public final bpf a;
    public final x6k b;
    public final zid c;
    public final wj9 d;

    public fo5(bpf bpfVar, x6k x6kVar, zid zidVar) {
        this.a = bpfVar;
        this.b = x6kVar;
        this.c = zidVar;
        this.d = new wj9(bpfVar, x6kVar, zidVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bc -> B:10:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nwh nwhVar, jc3 jc3Var, ot9 ot9Var, Object obj, xvd xvdVar, e26 e26Var, sq3 sq3Var) {
        wn5 wn5Var;
        fo5 fo5Var;
        int i;
        ot9 ot9Var2;
        Object obj2;
        xvd xvdVar2;
        e26 e26Var2;
        int i2;
        wn5 wn5Var2;
        nwh nwhVar2;
        jc3 jc3Var2;
        List list;
        Pair pair;
        if (sq3Var instanceof wn5) {
            wn5Var = (wn5) sq3Var;
            int i3 = wn5Var.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wn5Var.B = i3 - Integer.MIN_VALUE;
                fo5Var = this;
                Object obj3 = wn5Var.z;
                lu3 lu3Var = lu3.a;
                i = wn5Var.B;
                if (i != 0) {
                    y6a.M(obj3);
                    ot9Var2 = ot9Var;
                    obj2 = obj;
                    xvdVar2 = xvdVar;
                    e26Var2 = e26Var;
                    i2 = 0;
                    wn5Var2 = wn5Var;
                    nwhVar2 = nwhVar;
                    jc3Var2 = jc3Var;
                    bpf bpfVar = fo5Var.a;
                    list = jc3Var2.e;
                    if (i2 >= list.size()) {
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = wn5Var.y;
                    e26 e26Var3 = wn5Var.x;
                    xvd xvdVar3 = wn5Var.w;
                    Object obj4 = wn5Var.v;
                    ot9 ot9Var3 = wn5Var.u;
                    jc3 jc3Var3 = wn5Var.t;
                    nwh nwhVar3 = wn5Var.s;
                    fo5 fo5Var2 = wn5Var.r;
                    y6a.M(obj3);
                    wn5 wn5Var3 = wn5Var;
                    jc3Var2 = jc3Var3;
                    i2 = i4;
                    fo5Var = fo5Var2;
                    e26Var2 = e26Var3;
                    ot9Var2 = ot9Var3;
                    xvdVar2 = xvdVar3;
                    obj2 = obj4;
                    wl4 wl4Var = (wl4) obj3;
                    e26Var2.getClass();
                    if (wl4Var == null) {
                        BitmapDrawable bitmapDrawable = wl4Var.a;
                        boolean z = wl4Var.b;
                        int i5 = nwhVar3.c;
                        zt9 zt9Var = nwhVar3.a;
                        c18 c18Var = zt9Var instanceof c18 ? (c18) zt9Var : null;
                        return new un5(bitmapDrawable, z, i5, c18Var != null ? c18Var.c : null);
                    }
                    nwhVar2 = nwhVar3;
                    wn5Var2 = wn5Var3;
                    bpf bpfVar2 = fo5Var.a;
                    list = jc3Var2.e;
                    if (i2 >= list.size()) {
                        rw1 rw1Var = (rw1) list.get(i2);
                        rw1Var.getClass();
                        pair = new Pair(new vw1(nwhVar2.a, xvdVar2, rw1Var.b, rw1Var.a), Integer.valueOf(i2));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        hc5.f(mz1.m(obj2, "Unable to create a decoder that supports: "));
                        return null;
                    }
                    vw1 vw1Var = (vw1) pair.a;
                    int intValue = ((Number) pair.b).intValue() + 1;
                    e26Var2.getClass();
                    wn5Var2.r = fo5Var;
                    wn5Var2.s = nwhVar2;
                    wn5Var2.t = jc3Var2;
                    wn5Var2.u = ot9Var2;
                    wn5Var2.v = obj2;
                    wn5Var2.w = xvdVar2;
                    wn5Var2.x = e26Var2;
                    wn5Var2.y = intValue;
                    wn5Var2.B = 1;
                    Object a = vw1Var.a(wn5Var2);
                    if (a == lu3Var) {
                        return lu3Var;
                    }
                    wn5 wn5Var4 = wn5Var2;
                    nwhVar3 = nwhVar2;
                    obj3 = a;
                    i2 = intValue;
                    wn5Var3 = wn5Var4;
                    wl4 wl4Var2 = (wl4) obj3;
                    e26Var2.getClass();
                    if (wl4Var2 == null) {
                    }
                }
            }
        }
        fo5Var = this;
        wn5Var = new wn5(fo5Var, sq3Var);
        Object obj32 = wn5Var.z;
        lu3 lu3Var2 = lu3.a;
        i = wn5Var.B;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a8, code lost:
    
        if (r1 == r7) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:26:0x0049, B:27:0x012e, B:41:0x0063, B:43:0x00f2, B:45:0x00fd, B:50:0x0112, B:63:0x013c, B:65:0x0145, B:67:0x01c2, B:68:0x01c7), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:26:0x0049, B:27:0x012e, B:41:0x0063, B:43:0x00f2, B:45:0x00fd, B:50:0x0112, B:63:0x013c, B:65:0x0145, B:67:0x01c2, B:68:0x01c7), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ot9 ot9Var, Object obj, xvd xvdVar, e26 e26Var, sq3 sq3Var) {
        yn5 yn5Var;
        fsf fsfVar;
        nwh nwhVar;
        fo5 fo5Var;
        Object obj2;
        e26 e26Var2;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        fsf fsfVar5;
        ot9 ot9Var2;
        Object obj3;
        az7 az7Var;
        ot9 ot9Var3;
        fsf fsfVar6;
        e26 e26Var3;
        fo5 fo5Var2;
        fsf fsfVar7;
        fo5 fo5Var3;
        un5 un5Var;
        nwh nwhVar2;
        List list;
        Object obj4;
        Bitmap bitmap;
        try {
            if (sq3Var instanceof yn5) {
                yn5Var = (yn5) sq3Var;
                int i = yn5Var.B;
                if ((i & Integer.MIN_VALUE) != 0) {
                    yn5Var.B = i - Integer.MIN_VALUE;
                    yn5 yn5Var2 = yn5Var;
                    Object obj5 = yn5Var2.z;
                    lu3 lu3Var = lu3.a;
                    fsfVar = yn5Var2.B;
                    if (fsfVar != 0) {
                        fsf g = lnb.g(obj5);
                        g.a = xvdVar;
                        fsf fsfVar8 = new fsf();
                        fsfVar8.a = this.a.g;
                        fsf fsfVar9 = new fsf();
                        try {
                            x6k x6kVar = this.b;
                            if ((((xvd) g.a).b == Bitmap.Config.HARDWARE) && !((c79) x6kVar.d).e()) {
                                xvd xvdVar2 = (xvd) g.a;
                                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                g.a = xvd.a(xvdVar2);
                            }
                            ot9Var.getClass();
                            jc3 jc3Var = (jc3) fsfVar8.a;
                            xvd xvdVar3 = (xvd) g.a;
                            yn5Var2.r = this;
                            yn5Var2.s = ot9Var;
                            yn5Var2.t = obj;
                            yn5Var2.u = e26Var;
                            yn5Var2.v = g;
                            yn5Var2.w = fsfVar8;
                            yn5Var2.x = fsfVar9;
                            yn5Var2.y = fsfVar9;
                            yn5Var2.B = 1;
                            Object c = c(jc3Var, ot9Var, obj, xvdVar3, e26Var, yn5Var2);
                            if (c != lu3Var) {
                                fo5Var = this;
                                obj2 = obj;
                                e26Var2 = e26Var;
                                fsfVar2 = g;
                                fsfVar3 = fsfVar8;
                                fsfVar4 = fsfVar9;
                                fsfVar5 = fsfVar4;
                                ot9Var2 = ot9Var;
                                obj3 = c;
                            }
                            return lu3Var;
                        } catch (Throwable th) {
                            th = th;
                            fsfVar = fsfVar9;
                            Object obj6 = fsfVar.a;
                            nwhVar = obj6 instanceof nwh ? (nwh) obj6 : null;
                            if (nwhVar != null) {
                                l.a(nwhVar.a);
                            }
                            throw th;
                        }
                    }
                    if (fsfVar == 1) {
                        fsfVar4 = yn5Var2.y;
                        fsfVar5 = yn5Var2.x;
                        fsf fsfVar10 = yn5Var2.w;
                        fsf fsfVar11 = yn5Var2.v;
                        e26 e26Var4 = (e26) yn5Var2.u;
                        Object obj7 = yn5Var2.t;
                        ot9Var2 = yn5Var2.s;
                        fo5 fo5Var4 = yn5Var2.r;
                        y6a.M(obj5);
                        fsfVar3 = fsfVar10;
                        fsfVar2 = fsfVar11;
                        e26Var2 = e26Var4;
                        obj2 = obj7;
                        fo5Var = fo5Var4;
                        obj3 = obj5;
                    } else {
                        if (fsfVar != 2) {
                            if (fsfVar != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj5);
                            un5 un5Var2 = (un5) obj5;
                            Drawable drawable = un5Var2.a;
                            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return un5Var2;
                        }
                        fsfVar5 = yn5Var2.v;
                        fsfVar7 = (fsf) yn5Var2.u;
                        e26Var3 = (e26) yn5Var2.t;
                        ot9Var3 = yn5Var2.s;
                        fo5Var3 = yn5Var2.r;
                        y6a.M(obj5);
                        obj4 = obj5;
                        fsfVar6 = fsfVar7;
                        fo5Var2 = fo5Var3;
                        un5Var = (un5) obj4;
                        e26 e26Var5 = e26Var3;
                        ot9 ot9Var4 = ot9Var3;
                        Object obj8 = fsfVar5.a;
                        nwhVar2 = obj8 instanceof nwh ? (nwh) obj8 : null;
                        if (nwhVar2 != null) {
                            l.a(nwhVar2.a);
                        }
                        xvd xvdVar4 = (xvd) fsfVar6.a;
                        yn5Var2.r = null;
                        yn5Var2.s = null;
                        yn5Var2.t = null;
                        yn5Var2.u = null;
                        yn5Var2.v = null;
                        yn5Var2.w = null;
                        yn5Var2.x = null;
                        yn5Var2.y = null;
                        yn5Var2.B = 3;
                        fo5Var2.getClass();
                        list = ot9Var4.f;
                        obj5 = un5Var;
                        if (!list.isEmpty()) {
                            Drawable drawable2 = un5Var.a;
                            obj5 = xw3.R(ot9Var4.o, new do5(fo5Var2, un5Var, xvdVar4, list, e26Var5, ot9Var4, null), yn5Var2);
                        }
                    }
                    fsfVar4.a = obj3;
                    Object obj9 = fsfVar5.a;
                    az7Var = (az7) obj9;
                    if (az7Var instanceof nwh) {
                        ot9Var3 = ot9Var2;
                        fsfVar6 = fsfVar2;
                        e26Var3 = e26Var2;
                        if (!(az7Var instanceof ya5)) {
                            throw new ndd();
                        }
                        fo5Var2 = fo5Var;
                        un5Var = new un5(((ya5) obj9).a, ((ya5) obj9).b, ((ya5) obj9).c, null);
                        e26 e26Var52 = e26Var3;
                        ot9 ot9Var42 = ot9Var3;
                        Object obj82 = fsfVar5.a;
                        if (obj82 instanceof nwh) {
                        }
                        if (nwhVar2 != null) {
                        }
                        xvd xvdVar42 = (xvd) fsfVar6.a;
                        yn5Var2.r = null;
                        yn5Var2.s = null;
                        yn5Var2.t = null;
                        yn5Var2.u = null;
                        yn5Var2.v = null;
                        yn5Var2.w = null;
                        yn5Var2.x = null;
                        yn5Var2.y = null;
                        yn5Var2.B = 3;
                        fo5Var2.getClass();
                        list = ot9Var42.f;
                        obj5 = un5Var;
                        if (!list.isEmpty()) {
                        }
                    } else {
                        au3 au3Var = ot9Var2.n;
                        fsf fsfVar12 = fsfVar5;
                        ot9 ot9Var5 = ot9Var2;
                        try {
                            ts2 ts2Var = new ts2((Object) fo5Var, fsfVar12, fsfVar3, (Object) ot9Var5, obj2, fsfVar2, (Object) e26Var2, (rq3) null, 5);
                            ot9Var3 = ot9Var5;
                            fsf fsfVar13 = fsfVar2;
                            e26Var3 = e26Var2;
                            yn5Var2.r = fo5Var;
                            yn5Var2.s = ot9Var3;
                            yn5Var2.t = e26Var3;
                            yn5Var2.u = fsfVar13;
                            yn5Var2.v = fsfVar5;
                            yn5Var2.w = null;
                            yn5Var2.x = null;
                            yn5Var2.y = null;
                            yn5Var2.B = 2;
                            Object R = xw3.R(au3Var, ts2Var, yn5Var2);
                            if (R == lu3Var) {
                                return lu3Var;
                            }
                            fsfVar7 = fsfVar13;
                            fo5Var3 = fo5Var;
                            obj4 = R;
                            fsfVar6 = fsfVar7;
                            fo5Var2 = fo5Var3;
                            un5Var = (un5) obj4;
                            e26 e26Var522 = e26Var3;
                            ot9 ot9Var422 = ot9Var3;
                            Object obj822 = fsfVar5.a;
                            if (obj822 instanceof nwh) {
                            }
                            if (nwhVar2 != null) {
                            }
                            xvd xvdVar422 = (xvd) fsfVar6.a;
                            yn5Var2.r = null;
                            yn5Var2.s = null;
                            yn5Var2.t = null;
                            yn5Var2.u = null;
                            yn5Var2.v = null;
                            yn5Var2.w = null;
                            yn5Var2.x = null;
                            yn5Var2.y = null;
                            yn5Var2.B = 3;
                            fo5Var2.getClass();
                            list = ot9Var422.f;
                            obj5 = un5Var;
                            if (!list.isEmpty()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fsfVar = fsfVar12;
                            Object obj62 = fsfVar.a;
                            if (obj62 instanceof nwh) {
                            }
                            if (nwhVar != null) {
                            }
                            throw th;
                        }
                    }
                }
            }
            if (fsfVar != 0) {
            }
            fsfVar4.a = obj3;
            Object obj92 = fsfVar5.a;
            az7Var = (az7) obj92;
            if (az7Var instanceof nwh) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        yn5Var = new yn5(this, sq3Var);
        yn5 yn5Var22 = yn5Var;
        Object obj52 = yn5Var22.z;
        lu3 lu3Var2 = lu3.a;
        fsfVar = yn5Var22.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c1 -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(jc3 jc3Var, ot9 ot9Var, Object obj, xvd xvdVar, e26 e26Var, sq3 sq3Var) {
        ao5 ao5Var;
        fo5 fo5Var;
        int i;
        Object obj2;
        xvd xvdVar2;
        e26 e26Var2;
        int i2;
        ao5 ao5Var2;
        jc3 jc3Var2;
        ot9 ot9Var2;
        int size;
        Pair pair;
        if (sq3Var instanceof ao5) {
            ao5Var = (ao5) sq3Var;
            int i3 = ao5Var.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ao5Var.A = i3 - Integer.MIN_VALUE;
                fo5Var = this;
                Object obj3 = ao5Var.y;
                lu3 lu3Var = lu3.a;
                i = ao5Var.A;
                if (i != 0) {
                    y6a.M(obj3);
                    obj2 = obj;
                    xvdVar2 = xvdVar;
                    e26Var2 = e26Var;
                    i2 = 0;
                    ao5Var2 = ao5Var;
                    jc3Var2 = jc3Var;
                    ot9Var2 = ot9Var;
                    bpf bpfVar = fo5Var.a;
                    List list = jc3Var2.d;
                    size = list.size();
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
                    int i4 = ao5Var.x;
                    e26 e26Var3 = ao5Var.w;
                    xvdVar2 = ao5Var.v;
                    Object obj4 = ao5Var.u;
                    ot9 ot9Var3 = ao5Var.t;
                    jc3 jc3Var3 = ao5Var.s;
                    fo5 fo5Var2 = ao5Var.r;
                    y6a.M(obj3);
                    ao5 ao5Var3 = ao5Var;
                    ot9Var2 = ot9Var3;
                    i2 = i4;
                    fo5Var = fo5Var2;
                    e26Var2 = e26Var3;
                    obj2 = obj4;
                    az7 az7Var = (az7) obj3;
                    try {
                        e26Var2.getClass();
                        if (az7Var == null) {
                            return az7Var;
                        }
                        jc3Var2 = jc3Var3;
                        ao5Var2 = ao5Var3;
                        bpf bpfVar2 = fo5Var.a;
                        List list2 = jc3Var2.d;
                        size = list2.size();
                        while (true) {
                            if (i2 < size) {
                                pair = null;
                                break;
                            }
                            Pair pair2 = (Pair) list2.get(i2);
                            cz7 cz7Var = (cz7) pair2.a;
                            if (((Class) pair2.b).isAssignableFrom(obj2.getClass())) {
                                cz7Var.getClass();
                                ez7 a = cz7Var.a(obj2, xvdVar2);
                                if (a != null) {
                                    pair = new Pair(a, Integer.valueOf(i2));
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (pair != null) {
                            hc5.f(mz1.m(obj2, "Unable to create a fetcher that supports: "));
                            return null;
                        }
                        ez7 ez7Var = (ez7) pair.a;
                        int intValue = ((Number) pair.b).intValue() + 1;
                        e26Var2.getClass();
                        ao5Var2.r = fo5Var;
                        ao5Var2.s = jc3Var2;
                        ao5Var2.t = ot9Var2;
                        ao5Var2.u = obj2;
                        ao5Var2.v = xvdVar2;
                        ao5Var2.w = e26Var2;
                        ao5Var2.x = intValue;
                        ao5Var2.A = 1;
                        Object a2 = ez7Var.a(ao5Var2);
                        if (a2 == lu3Var) {
                            return lu3Var;
                        }
                        ao5 ao5Var4 = ao5Var2;
                        jc3Var3 = jc3Var2;
                        obj3 = a2;
                        i2 = intValue;
                        ao5Var3 = ao5Var4;
                        az7 az7Var2 = (az7) obj3;
                        e26Var2.getClass();
                        if (az7Var2 == null) {
                        }
                    } catch (Throwable th) {
                        nwh nwhVar = az7Var2 instanceof nwh ? (nwh) az7Var2 : null;
                        if (nwhVar != null) {
                            l.a(nwhVar.a);
                        }
                        throw th;
                    }
                }
            }
        }
        fo5Var = this;
        ao5Var = new ao5(fo5Var, sq3Var);
        Object obj32 = ao5Var.y;
        lu3 lu3Var2 = lu3.a;
        i = ao5Var.A;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(i5d i5dVar, sq3 sq3Var) {
        co5 co5Var;
        int i;
        fo5 fo5Var = this;
        i5d i5dVar2 = i5dVar;
        wj9 wj9Var = fo5Var.d;
        if (sq3Var instanceof co5) {
            co5Var = (co5) sq3Var;
            int i2 = co5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                co5Var.v = i2 - Integer.MIN_VALUE;
                co5 co5Var2 = co5Var;
                Object obj = co5Var2.t;
                lu3 lu3Var = lu3.a;
                i = co5Var2.v;
                if (i != 0) {
                    y6a.M(obj);
                    try {
                        ot9 ot9Var = (ot9) i5dVar2.e;
                        Object obj2 = ot9Var.b;
                        jjh jjhVar = (jjh) i5dVar2.f;
                        Bitmap.Config[] configArr = l.a;
                        e26 e26Var = (e26) i5dVar2.g;
                        xvd w = fo5Var.b.w(ot9Var, jjhVar);
                        int i3 = w.d;
                        List list = fo5Var.a.g.b;
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            try {
                                Pair pair = (Pair) list.get(i4);
                                s92 s92Var = (s92) pair.a;
                                if (((Class) pair.b).isAssignableFrom(obj2.getClass())) {
                                    s92Var.getClass();
                                    Object a = s92Var.a(obj2, w);
                                    if (a != null) {
                                        obj2 = a;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fo5Var = this;
                            }
                        }
                        MemoryCache$Key G = wj9Var.G(ot9Var, obj2, w, e26Var);
                        pec p = G != null ? wj9Var.p(ot9Var, G, jjhVar, i3) : null;
                        if (p != null) {
                            return wj9.I(i5dVar2, ot9Var, G, p);
                        }
                        au3 au3Var = ot9Var.m;
                        fo5Var = this;
                        ts2 ts2Var = new ts2(fo5Var, ot9Var, obj2, w, e26Var, G, i5dVar2, (rq3) null, 7);
                        co5Var2.r = fo5Var;
                        co5Var2.s = i5dVar2;
                        co5Var2.v = 1;
                        Object R = xw3.R(au3Var, ts2Var, co5Var2);
                        return R == lu3Var ? lu3Var : R;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5d i5dVar3 = co5Var2.s;
                    fo5 fo5Var2 = co5Var2.r;
                    try {
                        y6a.M(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        i5dVar2 = i5dVar3;
                        fo5Var = fo5Var2;
                    }
                }
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                x6k x6kVar = fo5Var.b;
                return x6k.b((ot9) i5dVar2.e, th);
            }
        }
        co5Var = new co5(fo5Var, sq3Var);
        co5 co5Var22 = co5Var;
        Object obj3 = co5Var22.t;
        lu3 lu3Var2 = lu3.a;
        i = co5Var22.v;
        if (i != 0) {
        }
        if (!(th instanceof CancellationException)) {
        }
    }
}
