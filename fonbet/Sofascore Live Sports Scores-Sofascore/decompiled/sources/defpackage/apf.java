package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class apf {
    public static final /* synthetic */ int f = 0;
    public final uof a;
    public final ad2 b = s9a.c(e.d(tz9.o(), new tu3(bu3.a, 2)));
    public final f4a c;
    public final ic3 d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(apf.class, "e");
    }

    public apf(uof uofVar) {
        this.a = uofVar;
        n72 n72Var = new n72();
        n72Var.b = new WeakReference(this);
        n72Var.c = new m30(n72Var, this);
        n72Var.d = new n30(n72Var);
        f4a f4aVar = new f4a(this);
        this.c = f4aVar;
        hc3 hc3Var = new hc3(uofVar.f);
        jt9 jt9Var = uofVar.b;
        Object obj = jt9Var.n.a.get(xs9.a);
        boolean booleanValue = ((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue();
        ArrayList arrayList = hc3Var.d;
        ArrayList arrayList2 = hc3Var.e;
        if (booleanValue) {
            arrayList.add(new s8f(23));
            arrayList2.add(new s8f(24));
        }
        int i = 0;
        q40 q40Var = new q40(i);
        fuf fufVar = duf.a;
        hc3Var.a(q40Var, fufVar.getOrCreateKotlinClass(Uri.class));
        int i2 = 3;
        hc3Var.a(new q40(i2), fufVar.getOrCreateKotlinClass(Integer.class));
        Pair pair = new Pair(new w20(0), fufVar.getOrCreateKotlinClass(eek.class));
        ArrayList arrayList3 = hc3Var.c;
        arrayList3.add(pair);
        hc3Var.c(new vi0(i), fufVar.getOrCreateKotlinClass(eek.class));
        hc3Var.c(new vi0(4), fufVar.getOrCreateKotlinClass(eek.class));
        hc3Var.c(new vi0(9), fufVar.getOrCreateKotlinClass(eek.class));
        hc3Var.c(new vi0(6), fufVar.getOrCreateKotlinClass(Drawable.class));
        sl6 sl6Var = ys9.a;
        Object obj2 = jt9Var.n.a.get(ys9.a);
        int intValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i3 = h4h.a;
        g4h g4hVar = new g4h(intValue);
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 1;
        Object obj3 = hf6.a;
        if (i4 >= 29) {
            Object obj4 = jt9Var.n.a.get(ys9.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = jt9Var.n.a.get(ys9.b);
                if (((hf6) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList2.add(new gc3(new bei(g4hVar), i5));
                }
            }
        }
        Object obj6 = jt9Var.n.a.get(ys9.b);
        arrayList2.add(new gc3(new qw1(g4hVar, (hf6) (obj6 != null ? obj6 : obj3)), i5));
        hc3Var.a(new q40(i5), fufVar.getOrCreateKotlinClass(File.class));
        hc3Var.c(new vi0(8), fufVar.getOrCreateKotlinClass(eek.class));
        hc3Var.c(new vi0(i2), fufVar.getOrCreateKotlinClass(ByteBuffer.class));
        hc3Var.a(new q40(4), fufVar.getOrCreateKotlinClass(String.class));
        int i6 = 2;
        hc3Var.a(new q40(i6), fufVar.getOrCreateKotlinClass(uae.class));
        arrayList3.add(new Pair(new w20(1), fufVar.getOrCreateKotlinClass(eek.class)));
        arrayList3.add(new Pair(new w20(2), fufVar.getOrCreateKotlinClass(eek.class)));
        hc3Var.c(new vi0(7), fufVar.getOrCreateKotlinClass(eek.class));
        hc3Var.c(new vi0(i6), fufVar.getOrCreateKotlinClass(byte[].class));
        hc3Var.c(new vi0(5), fufVar.getOrCreateKotlinClass(eek.class));
        hc3Var.c(new vi0(i5), fufVar.getOrCreateKotlinClass(Bitmap.class));
        eo5 eo5Var = new eo5(this, n72Var, f4aVar);
        ArrayList arrayList4 = hc3Var.a;
        arrayList4.add(eo5Var);
        this.d = new ic3(fcp.n0(arrayList4), fcp.n0(hc3Var.b), fcp.n0(arrayList3), fcp.n0(arrayList), fcp.n0(arrayList2));
    }

    public final j55 a(nt9 nt9Var) {
        return waa.B(nt9Var, xw3.t(this.b, (CoroutineContext) this.a.c.getValue(), new vof(this, nt9Var, null, 0), 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01a7, code lost:
    
        if (r1.n(r9) == r10) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0234 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:14:0x003a, B:15:0x022e, B:17:0x0234, B:21:0x023d, B:23:0x0241, B:24:0x024d, B:25:0x0252, B:62:0x006a, B:63:0x01b0, B:65:0x01b4, B:67:0x01ba, B:69:0x01c0, B:70:0x01c4, B:73:0x01ca, B:75:0x01d4, B:76:0x01e0, B:78:0x01e3), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x023d A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:14:0x003a, B:15:0x022e, B:17:0x0234, B:21:0x023d, B:23:0x0241, B:24:0x024d, B:25:0x0252, B:62:0x006a, B:63:0x01b0, B:65:0x01b4, B:67:0x01ba, B:69:0x01c0, B:70:0x01c4, B:73:0x01ca, B:75:0x01d4, B:76:0x01e0, B:78:0x01e3), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0267 A[Catch: all -> 0x0274, TRY_LEAVE, TryCatch #1 {all -> 0x0274, blocks: (B:45:0x0263, B:47:0x0267, B:50:0x0276, B:51:0x027b), top: B:44:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0276 A[Catch: all -> 0x0274, TRY_ENTER, TryCatch #1 {all -> 0x0274, blocks: (B:45:0x0263, B:47:0x0267, B:50:0x0276, B:51:0x027b), top: B:44:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006f  */
    /* JADX WARN: Type inference failed for: r17v0, types: [apf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [f7a] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [f7a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [nt9] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e0g] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(nt9 nt9Var, int i, sq3 sq3Var) {
        xof xofVar;
        nt9 nt9Var2;
        lu3 lu3Var;
        ?? r3;
        e0g h6Var;
        gkh gkhVar;
        e0g e0gVar;
        e3f e3fVar;
        jrg jrgVar;
        ImageView.ScaleType scaleType;
        nt9 nt9Var3;
        f7a f7aVar;
        tti ttiVar;
        Object c;
        nt9 nt9Var4;
        f7a f7aVar2;
        e0g e0gVar2;
        nr9 nr9Var;
        nr9 nr9Var2;
        fpf d;
        oec a;
        nt9 nt9Var5;
        nt9 nt9Var6;
        Object R;
        f7a f7aVar3;
        e0g e0gVar3;
        nt9 nt9Var7;
        wt9 wt9Var;
        ?? r4;
        ?? r5 = nt9Var;
        int i2 = i;
        try {
            if (sq3Var instanceof xof) {
                xofVar = (xof) sq3Var;
                r4 = xofVar.y;
                if ((r4 & Integer.MIN_VALUE) != 0) {
                    ?? r42 = r4 - Integer.MIN_VALUE;
                    xofVar.y = r42;
                    nt9Var2 = r42;
                    xof xofVar2 = xofVar;
                    Object obj = xofVar2.w;
                    lu3Var = lu3.a;
                    r3 = xofVar2.y;
                    if (r3 != 0) {
                        y6a.M(obj);
                        yda x = bea.x(xofVar2.getContext());
                        boolean z = i2 == 0;
                        f4a f4aVar = this.c;
                        f4aVar.getClass();
                        apf apfVar = (apf) f4aVar.b;
                        tti ttiVar2 = r5.c;
                        if (ttiVar2 instanceof sw8) {
                            g6b g6bVar = (g6b) fqj.w(r5, vt9.e);
                            if (g6bVar == null) {
                                g6bVar = f4a.h(r5);
                            }
                            h6Var = new avk(apfVar, r5, (sw8) ttiVar2, g6bVar, x);
                        } else {
                            g6b g6bVar2 = (g6b) fqj.w(r5, vt9.e);
                            if (g6bVar2 == null) {
                                g6bVar2 = z ? f4a.h(r5) : null;
                            }
                            h6Var = g6bVar2 != null ? new h6(5, g6bVar2, x) : new p51(x);
                        }
                        h6Var.h();
                        ht9 a2 = nt9.a(r5);
                        tti ttiVar3 = r5.c;
                        a2.b = apfVar.a.b;
                        kt9 kt9Var = r5.w;
                        gkh gkhVar2 = kt9Var.f;
                        if (gkhVar2 == null) {
                            if (ttiVar3 instanceof sw8) {
                                View view = ((sw8) ttiVar3).getView();
                                gkhVar = ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? gkh.y7 : new opf(view);
                            } else {
                                gkhVar = gkh.y7;
                            }
                            a2.p = gkhVar;
                        } else {
                            gkhVar = gkhVar2;
                        }
                        if (kt9Var.g == null) {
                            sw8 sw8Var = ttiVar3 instanceof sw8 ? (sw8) ttiVar3 : null;
                            View view2 = sw8Var != null ? sw8Var.getView() : null;
                            ImageView imageView = view2 instanceof ImageView ? (ImageView) view2 : null;
                            if (imageView != null) {
                                Bitmap.Config[] configArr = gjk.a;
                                ImageView.ScaleType scaleType2 = imageView.getScaleType();
                                int i3 = scaleType2 == null ? -1 : fjk.a[scaleType2.ordinal()];
                                jrgVar = (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) ? jrg.b : jrg.a;
                            } else {
                                jrgVar = r5.t;
                            }
                            a2.q = jrgVar;
                        }
                        if (kt9Var.h == null) {
                            if (gkhVar2 == null && Intrinsics.c(gkhVar, gkh.y7)) {
                                e3fVar = e3f.b;
                            } else {
                                if ((ttiVar3 instanceof sw8) && (gkhVar instanceof opf)) {
                                    sw8 sw8Var2 = (sw8) ttiVar3;
                                    if ((sw8Var2.getView() instanceof ImageView) && sw8Var2.getView() == ((opf) gkhVar).a) {
                                        e3fVar = e3f.b;
                                    }
                                }
                                e3fVar = e3f.a;
                            }
                            a2.r = e3fVar;
                        }
                        nt9Var2 = a2.a();
                        r3 = f7a.j;
                        try {
                            if (nt9Var2.b.equals(oid.a)) {
                                throw new pid("The request's data is null.");
                            }
                            h6Var.m();
                            if (i2 == 0) {
                                xofVar2.r = h6Var;
                                xofVar2.s = nt9Var2;
                                xofVar2.t = r3;
                                xofVar2.v = i2;
                                xofVar2.y = 1;
                            }
                            e0gVar = h6Var;
                            f7aVar = r3;
                            nt9Var3 = nt9Var2;
                        } catch (Throwable th) {
                            th = th;
                            r5 = h6Var;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } else if (r3 == 1) {
                        i2 = xofVar2.v;
                        f7a f7aVar4 = xofVar2.t;
                        nt9 nt9Var8 = xofVar2.s;
                        e0gVar = xofVar2.r;
                        y6a.M(obj);
                        f7aVar = f7aVar4;
                        nt9Var3 = nt9Var8;
                    } else {
                        if (r3 != 2) {
                            if (r3 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            f7aVar3 = xofVar2.t;
                            nt9Var7 = xofVar2.s;
                            e0gVar3 = xofVar2.r;
                            y6a.M(obj);
                            wt9Var = (wt9) obj;
                            if (!(wt9Var instanceof emi)) {
                                f((emi) wt9Var, nt9Var7.c, f7aVar3);
                            } else {
                                if (!(wt9Var instanceof fq5)) {
                                    throw new ndd();
                                }
                                e((fq5) wt9Var, nt9Var7.c, f7aVar3);
                            }
                            e0gVar3.k();
                            return wt9Var;
                        }
                        i2 = xofVar2.v;
                        nr9 nr9Var3 = xofVar2.u;
                        f7aVar2 = xofVar2.t;
                        nt9 nt9Var9 = xofVar2.s;
                        e0g e0gVar4 = xofVar2.r;
                        try {
                            y6a.M(obj);
                            nt9Var4 = nt9Var9;
                            nr9Var = nr9Var3;
                            e0gVar2 = e0gVar4;
                            nt9Var5 = nt9Var4;
                            int i4 = i2;
                            try {
                                kjh kjhVar = (kjh) obj;
                                f7aVar2.getClass();
                                CoroutineContext coroutineContext = nt9Var5.i;
                                nt9Var6 = nt9Var5;
                                try {
                                    h10 h10Var = new h10(nt9Var6, this, kjhVar, f7aVar2, nr9Var, null, 20);
                                    xofVar2.r = e0gVar2;
                                    xofVar2.s = nt9Var6;
                                    xofVar2.t = f7aVar2;
                                    xofVar2.u = null;
                                    xofVar2.v = i4;
                                    xofVar2.y = 3;
                                    R = xw3.R(coroutineContext, h10Var, xofVar2);
                                    if (R != lu3Var) {
                                        f7aVar3 = f7aVar2;
                                        e0gVar3 = e0gVar2;
                                        nt9Var7 = nt9Var6;
                                        obj = R;
                                        wt9Var = (wt9) obj;
                                        if (!(wt9Var instanceof emi)) {
                                        }
                                        e0gVar3.k();
                                        return wt9Var;
                                    }
                                    return lu3Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r3 = f7aVar2;
                                    r5 = e0gVar2;
                                    nt9Var2 = nt9Var6;
                                    try {
                                        if (th instanceof CancellationException) {
                                            r3.getClass();
                                            lt9 lt9Var = nt9Var2.d;
                                            throw th;
                                        }
                                        fq5 a3 = d2a.a(nt9Var2, th);
                                        e(a3, nt9Var2.c, r3);
                                        return a3;
                                    } finally {
                                        r5.k();
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                nt9Var6 = nt9Var5;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = f7aVar2;
                            nt9Var2 = nt9Var9;
                            r5 = e0gVar4;
                            if (th instanceof CancellationException) {
                            }
                        }
                    }
                    nec necVar = nt9Var3.o;
                    nr9 nr9Var4 = (necVar != null || (d = d()) == null || (a = d.a(necVar)) == null) ? null : a.a;
                    ttiVar = nt9Var3.c;
                    if (ttiVar != null) {
                        if (nr9Var4 == null) {
                            nr9Var2 = (nr9) nt9Var3.p.invoke(nt9Var3);
                            if (nr9Var2 == null) {
                                nr9Var2 = (nr9) nt9Var3.x.h.invoke(nt9Var3);
                            }
                        } else {
                            nr9Var2 = nr9Var4;
                        }
                        ttiVar.t(nr9Var2);
                    }
                    f7aVar.getClass();
                    gkh gkhVar3 = nt9Var3.s;
                    xofVar2.r = e0gVar;
                    xofVar2.s = nt9Var3;
                    xofVar2.t = f7aVar;
                    xofVar2.u = nr9Var4;
                    xofVar2.v = i2;
                    xofVar2.y = 2;
                    c = gkhVar3.c(xofVar2);
                    if (c != lu3Var) {
                        nt9Var4 = nt9Var3;
                        f7aVar2 = f7aVar;
                        e0gVar2 = e0gVar;
                        nr9Var = nr9Var4;
                        obj = c;
                        nt9Var5 = nt9Var4;
                        int i42 = i2;
                        kjh kjhVar2 = (kjh) obj;
                        f7aVar2.getClass();
                        CoroutineContext coroutineContext2 = nt9Var5.i;
                        nt9Var6 = nt9Var5;
                        h10 h10Var2 = new h10(nt9Var6, this, kjhVar2, f7aVar2, nr9Var, null, 20);
                        xofVar2.r = e0gVar2;
                        xofVar2.s = nt9Var6;
                        xofVar2.t = f7aVar2;
                        xofVar2.u = null;
                        xofVar2.v = i42;
                        xofVar2.y = 3;
                        R = xw3.R(coroutineContext2, h10Var2, xofVar2);
                        if (R != lu3Var) {
                        }
                    }
                    return lu3Var;
                }
            }
            if (r3 != 0) {
            }
            nec necVar2 = nt9Var3.o;
            if (necVar2 != null) {
            }
            ttiVar = nt9Var3.c;
            if (ttiVar != null) {
            }
            f7aVar.getClass();
            gkh gkhVar32 = nt9Var3.s;
            xofVar2.r = e0gVar;
            xofVar2.s = nt9Var3;
            xofVar2.t = f7aVar;
            xofVar2.u = nr9Var4;
            xofVar2.v = i2;
            xofVar2.y = 2;
            c = gkhVar32.c(xofVar2);
            if (c != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th5) {
            th = th5;
        }
        xofVar = new xof(this, sq3Var);
        nt9Var2 = r4;
        xof xofVar22 = xofVar;
        Object obj2 = xofVar22.w;
        lu3Var = lu3.a;
        r3 = xofVar22.y;
    }

    public final Object c(nt9 nt9Var, sq3 sq3Var) {
        return ((nt9Var.c instanceof sw8) || (nt9Var.s instanceof opf) || ((g6b) fqj.w(nt9Var, vt9.e)) != null) ? s9a.r(new v1f(this, nt9Var, (rq3) null, 4), sq3Var) : b(nt9Var, 1, sq3Var);
    }

    public final fpf d() {
        return (fpf) this.a.d.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(fq5 fq5Var, tti ttiVar, f7a f7aVar) {
        nt9 nt9Var = fq5Var.b;
        nr9 nr9Var = fq5Var.a;
        if (ttiVar instanceof kxj) {
            zwj a = ((qwj) fqj.w(nt9Var, vt9.a)).a((kxj) ttiVar, fq5Var);
            if (!(a instanceof ked)) {
                f7aVar.getClass();
                a.a();
            }
            ttiVar.D(nr9Var);
        }
        f7aVar.getClass();
        lt9 lt9Var = nt9Var.d;
        if (lt9Var != null) {
            lt9Var.E(fq5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(emi emiVar, tti ttiVar, f7a f7aVar) {
        nt9 nt9Var = emiVar.b;
        nr9 nr9Var = emiVar.a;
        if (ttiVar instanceof kxj) {
            zwj a = ((qwj) fqj.w(nt9Var, vt9.a)).a((kxj) ttiVar, emiVar);
            if (!(a instanceof ked)) {
                f7aVar.getClass();
                a.a();
            }
            ttiVar.A(nr9Var);
        }
        f7aVar.getClass();
        lt9 lt9Var = nt9Var.d;
        if (lt9Var != null) {
            lt9Var.onSuccess();
        }
    }
}
