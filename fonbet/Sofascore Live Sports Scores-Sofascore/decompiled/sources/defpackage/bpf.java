package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bpf {
    public final Context a;
    public final ds4 b;
    public final mqi c;
    public final zid d;
    public final ad2 e;
    public final x6k f;
    public final jc3 g;
    public final ArrayList h;

    public bpf(Context context, ds4 ds4Var, mqi mqiVar, mqi mqiVar2, mqi mqiVar3, jc3 jc3Var, ws9 ws9Var, zid zidVar) {
        this.a = context;
        this.b = ds4Var;
        this.c = mqiVar;
        this.d = zidVar;
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        this.e = s9a.c(e.d(o, rob.a.f).plus(new zof(this)));
        rqi rqiVar = new rqi(this, context, ws9Var.b);
        x6k x6kVar = new x6k(this, rqiVar, zidVar);
        this.f = x6kVar;
        hc3 hc3Var = new hc3(jc3Var);
        hc3Var.b(new s92(2), jl9.class);
        hc3Var.b(new s92(5), String.class);
        hc3Var.b(new s92(1), Uri.class);
        hc3Var.b(new s92(4), Uri.class);
        hc3Var.b(new s92(3), Integer.class);
        hc3Var.b(new s92(0), byte[].class);
        Pair pair = new Pair(new fek(), Uri.class);
        ArrayList arrayList = hc3Var.c;
        arrayList.add(pair);
        arrayList.add(new Pair(new d18(ws9Var.a), File.class));
        hc3Var.d(new el9(mqiVar3, mqiVar2, ws9Var.c), Uri.class);
        hc3Var.d(new wi0(5), File.class);
        hc3Var.d(new wi0(0), Uri.class);
        hc3Var.d(new wi0(3), Uri.class);
        hc3Var.d(new wi0(6), Uri.class);
        hc3Var.d(new wi0(4), Drawable.class);
        hc3Var.d(new wi0(1), Bitmap.class);
        hc3Var.d(new wi0(2), ByteBuffer.class);
        rw1 rw1Var = new rw1(ws9Var.d, ws9Var.e);
        ArrayList arrayList2 = hc3Var.e;
        arrayList2.add(rw1Var);
        List R = oyn.R(hc3Var.a);
        this.g = new jc3(R, oyn.R(hc3Var.b), oyn.R(arrayList), oyn.R(hc3Var.d), oyn.R(arrayList2));
        this.h = CollectionsKt.x0(R, new fo5(this, x6kVar, zidVar));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(rqiVar);
    }

    public final l55 a(ot9 ot9Var) {
        av4 t = xw3.t(this.e, null, new wof(this, ot9Var, null, 0), 3);
        sti stiVar = ot9Var.c;
        return stiVar instanceof ku9 ? l.c(((ku9) stiVar).b).b() : new bka(t, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:24:0x00dd, B:26:0x00e7, B:27:0x00ea, B:29:0x00fb, B:30:0x00fe, B:32:0x0105, B:33:0x0108, B:15:0x00bb, B:17:0x00c1, B:19:0x00c6, B:80:0x0178, B:81:0x017f), top: B:14:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:24:0x00dd, B:26:0x00e7, B:27:0x00ea, B:29:0x00fb, B:30:0x00fe, B:32:0x0105, B:33:0x0108, B:15:0x00bb, B:17:0x00c1, B:19:0x00c6, B:80:0x0178, B:81:0x017f), top: B:14:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:24:0x00dd, B:26:0x00e7, B:27:0x00ea, B:29:0x00fb, B:30:0x00fe, B:32:0x0105, B:33:0x0108, B:15:0x00bb, B:17:0x00c1, B:19:0x00c6, B:80:0x0178, B:81:0x017f), top: B:14:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154 A[Catch: all -> 0x015d, TryCatch #6 {all -> 0x015d, blocks: (B:44:0x014e, B:46:0x0154, B:49:0x0161, B:51:0x0165), top: B:43:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161 A[Catch: all -> 0x015d, TryCatch #6 {all -> 0x015d, blocks: (B:44:0x014e, B:46:0x0154, B:49:0x0161, B:51:0x0165), top: B:43:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184 A[Catch: all -> 0x019d, TryCatch #5 {all -> 0x019d, blocks: (B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018d, B:63:0x0192, B:65:0x0199, B:66:0x019c, B:67:0x019f), top: B:55:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #5 {all -> 0x019d, blocks: (B:56:0x0180, B:58:0x0184, B:60:0x0188, B:62:0x018d, B:63:0x0192, B:65:0x0199, B:66:0x019c, B:67:0x019f), top: B:55:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /* JADX WARN: Type inference failed for: r1v9, types: [mt9] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ot9] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [f0g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ot9 ot9Var, int i, sq3 sq3Var) {
        yof yofVar;
        lu3 lu3Var;
        int i2;
        e26 e26Var;
        ?? r3;
        ?? r4;
        Bitmap bitmap;
        e26 e26Var2;
        ot9 ot9Var2;
        f0g f0gVar;
        bpf bpfVar;
        e26 e26Var3;
        f0g f0gVar2;
        ot9 ot9Var3;
        f0g f0gVar3;
        ot9 ot9Var4;
        xt9 xt9Var;
        Object R;
        f0g f0gVar4;
        ot9 ot9Var5;
        sti stiVar;
        mt9 mt9Var;
        Object c;
        bpf bpfVar2 = this;
        ot9 ot9Var6 = ot9Var;
        if (sq3Var instanceof yof) {
            yofVar = (yof) sq3Var;
            int i3 = yofVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yofVar.y = i3 - Integer.MIN_VALUE;
                yof yofVar2 = yofVar;
                Object obj = yofVar2.w;
                lu3Var = lu3.a;
                i2 = yofVar2.y;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            e26 e26Var4 = yofVar2.u;
                            ot9 ot9Var7 = yofVar2.t;
                            f0g f0gVar5 = yofVar2.s;
                            bpf bpfVar3 = yofVar2.r;
                            y6a.M(obj);
                            e26Var = e26Var4;
                            bpfVar2 = bpfVar3;
                            ot9Var5 = ot9Var7;
                            f0gVar4 = f0gVar5;
                        } else if (i2 == 2) {
                            Bitmap bitmap2 = yofVar2.v;
                            e26 e26Var5 = yofVar2.u;
                            ot9 ot9Var8 = yofVar2.t;
                            f0g f0gVar6 = yofVar2.s;
                            bpf bpfVar4 = yofVar2.r;
                            try {
                                y6a.M(obj);
                                bitmap = bitmap2;
                                e26Var2 = e26Var5;
                                ot9Var2 = ot9Var8;
                                f0gVar = f0gVar6;
                                bpfVar = bpfVar4;
                                try {
                                    e26Var2.getClass();
                                    au3 au3Var = ot9Var2.l;
                                    h10 h10Var = new h10(ot9Var2, bpfVar, (jjh) obj, e26Var2, bitmap, null, 21);
                                    e26Var = e26Var2;
                                    try {
                                        yofVar2.r = bpfVar;
                                        yofVar2.s = f0gVar;
                                        yofVar2.t = ot9Var2;
                                        yofVar2.u = e26Var;
                                        yofVar2.v = null;
                                        yofVar2.y = 3;
                                        R = xw3.R(au3Var, h10Var, yofVar2);
                                        if (R != lu3Var) {
                                            e26Var3 = e26Var;
                                            ot9Var4 = ot9Var2;
                                            obj = R;
                                            f0gVar3 = f0gVar;
                                            xt9Var = (xt9) obj;
                                            if (!(xt9Var instanceof fmi)) {
                                            }
                                            return xt9Var;
                                        }
                                        return lu3Var;
                                    } catch (Throwable th) {
                                        th = th;
                                        ot9Var3 = ot9Var2;
                                        f0gVar2 = f0gVar;
                                        bpfVar2 = bpfVar;
                                        r3 = ot9Var3;
                                        r4 = f0gVar2;
                                        if (th instanceof CancellationException) {
                                            bpfVar2.f.getClass();
                                            gq5 b = x6k.b(r3, th);
                                            bpfVar2.c(b, r3.c, e26Var);
                                            r4.k();
                                            return b;
                                        }
                                        zid zidVar = bpfVar2.d;
                                        if (zidVar != null && zidVar.b <= 4) {
                                            Objects.toString(r3.b);
                                        }
                                        e26Var.getClass();
                                        ?? r1 = r3.d;
                                        if (r1 != 0) {
                                            r1.a(r3);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    e26Var = e26Var2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                e26Var = e26Var5;
                                r3 = ot9Var8;
                                r4 = f0gVar6;
                                bpfVar2 = bpfVar4;
                                if (th instanceof CancellationException) {
                                }
                            }
                        } else {
                            if (i2 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            e26Var3 = yofVar2.u;
                            ot9 ot9Var9 = yofVar2.t;
                            f0g f0gVar7 = yofVar2.s;
                            bpf bpfVar5 = yofVar2.r;
                            y6a.M(obj);
                            bpfVar = bpfVar5;
                            ot9Var4 = ot9Var9;
                            f0gVar3 = f0gVar7;
                            try {
                                xt9Var = (xt9) obj;
                                if (!(xt9Var instanceof fmi)) {
                                    bpfVar.d((fmi) xt9Var, ot9Var4.c, e26Var3);
                                } else if (xt9Var instanceof gq5) {
                                    bpfVar.c((gq5) xt9Var, ot9Var4.c, e26Var3);
                                }
                                return xt9Var;
                            } catch (Throwable th4) {
                                th = th4;
                                e26Var = e26Var3;
                                ot9Var3 = ot9Var4;
                                f0gVar2 = f0gVar3;
                                bpfVar2 = bpfVar;
                                r3 = ot9Var3;
                                r4 = f0gVar2;
                                try {
                                    if (th instanceof CancellationException) {
                                    }
                                } finally {
                                    r4.k();
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        e26Var = bpfVar2;
                        bpfVar2 = -2147483648;
                        r3 = i2;
                        r4 = ot9Var6;
                    }
                } else {
                    y6a.M(obj);
                    yda x = bea.x(yofVar2.getContext());
                    x6k x6kVar = bpfVar2.f;
                    x6kVar.getClass();
                    g6b g6bVar = ot9Var6.p;
                    sti stiVar2 = ot9Var6.c;
                    f0g bvkVar = stiVar2 instanceof ku9 ? new bvk((bpf) x6kVar.b, ot9Var6, (ku9) stiVar2, g6bVar, x) : new q51(g6bVar, x);
                    bvkVar.h();
                    it9 a = ot9.a(ot9Var);
                    a.b = bpfVar2.b;
                    a.z = 0;
                    ot9 a2 = a.a();
                    e26Var = e26.a;
                    try {
                        if (a2.b == f8h.g) {
                            throw new qid("The request's data is null.");
                        }
                        bvkVar.m();
                        ot9Var5 = a2;
                        f0gVar4 = bvkVar;
                        if (i == 0) {
                            g6b g6bVar2 = a2.p;
                            yofVar2.r = bpfVar2;
                            yofVar2.s = bvkVar;
                            yofVar2.t = a2;
                            yofVar2.u = e26Var;
                            yofVar2.y = 1;
                            ot9Var5 = a2;
                            f0gVar4 = bvkVar;
                            if (c6o.B(g6bVar2, yofVar2) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r3 = a2;
                        r4 = bvkVar;
                        if (th instanceof CancellationException) {
                        }
                    }
                }
                if (((gpf) bpfVar2.c.getValue()) != null) {
                    ot9Var5.getClass();
                }
                Drawable drawable = ot9Var5.t;
                Integer num = ot9Var5.s;
                ot9Var5.x.getClass();
                Drawable b2 = j.b(ot9Var5, drawable, num);
                stiVar = ot9Var5.c;
                if (stiVar != null) {
                    stiVar.j(b2);
                }
                e26Var.getClass();
                mt9Var = ot9Var5.d;
                if (mt9Var != null) {
                    mt9Var.b(ot9Var5);
                }
                hkh hkhVar = ot9Var5.q;
                yofVar2.r = bpfVar2;
                yofVar2.s = f0gVar4;
                yofVar2.t = ot9Var5;
                yofVar2.u = e26Var;
                yofVar2.v = null;
                yofVar2.y = 2;
                c = hkhVar.c(yofVar2);
                if (c != lu3Var) {
                    bpfVar = bpfVar2;
                    e26Var2 = e26Var;
                    ot9Var2 = ot9Var5;
                    obj = c;
                    bitmap = null;
                    f0gVar = f0gVar4;
                    e26Var2.getClass();
                    au3 au3Var2 = ot9Var2.l;
                    h10 h10Var2 = new h10(ot9Var2, bpfVar, (jjh) obj, e26Var2, bitmap, null, 21);
                    e26Var = e26Var2;
                    yofVar2.r = bpfVar;
                    yofVar2.s = f0gVar;
                    yofVar2.t = ot9Var2;
                    yofVar2.u = e26Var;
                    yofVar2.v = null;
                    yofVar2.y = 3;
                    R = xw3.R(au3Var2, h10Var2, yofVar2);
                    if (R != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        yofVar = new yof(bpfVar2, sq3Var);
        yof yofVar22 = yofVar;
        Object obj2 = yofVar22.w;
        lu3Var = lu3.a;
        i2 = yofVar22.y;
        if (i2 == 0) {
        }
        if (((gpf) bpfVar2.c.getValue()) != null) {
        }
        Drawable drawable2 = ot9Var5.t;
        Integer num2 = ot9Var5.s;
        ot9Var5.x.getClass();
        Drawable b22 = j.b(ot9Var5, drawable2, num2);
        stiVar = ot9Var5.c;
        if (stiVar != null) {
        }
        e26Var.getClass();
        mt9Var = ot9Var5.d;
        if (mt9Var != null) {
        }
        hkh hkhVar2 = ot9Var5.q;
        yofVar22.r = bpfVar2;
        yofVar22.s = f0gVar4;
        yofVar22.t = ot9Var5;
        yofVar22.u = e26Var;
        yofVar22.v = null;
        yofVar22.y = 2;
        c = hkhVar2.c(yofVar22);
        if (c != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r5 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(gq5 gq5Var, sti stiVar, e26 e26Var) {
        ot9 ot9Var = gq5Var.b;
        Drawable drawable = gq5Var.a;
        zid zidVar = this.d;
        if (zidVar != null && zidVar.b <= 4) {
            Objects.toString(ot9Var.b);
            Objects.toString(gq5Var.c);
        }
        if (stiVar instanceof lxj) {
            ywj a = ot9Var.g.a((lxj) stiVar, gq5Var);
            if (!(a instanceof led)) {
                e26Var.getClass();
                a.a();
            }
            stiVar.I(drawable);
        }
        e26Var.getClass();
        mt9 mt9Var = ot9Var.d;
        if (mt9Var != null) {
            mt9Var.c(gq5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r9 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(fmi fmiVar, sti stiVar, e26 e26Var) {
        ot9 ot9Var = fmiVar.b;
        Drawable drawable = fmiVar.a;
        int i = fmiVar.c;
        zid zidVar = this.d;
        if (zidVar != null && zidVar.b <= 4) {
            Bitmap.Config[] configArr = l.a;
            int C = wt3.C(i);
            if (C != 0 && C != 1 && C != 2 && C != 3) {
                zzl.b();
                return;
            } else {
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    throw null;
                }
                Objects.toString(ot9Var.b);
            }
        }
        if (stiVar instanceof lxj) {
            ywj a = ot9Var.g.a((lxj) stiVar, fmiVar);
            if (!(a instanceof led)) {
                e26Var.getClass();
                a.a();
            }
            stiVar.c(drawable);
        }
        e26Var.getClass();
        mt9 mt9Var = ot9Var.d;
        if (mt9Var != null) {
            mt9Var.d(ot9Var, fmiVar);
        }
    }
}
