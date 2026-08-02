package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hlb extends xka implements Function1 {
    public final /* synthetic */ Context A;
    public final /* synthetic */ Function0 B;
    public final /* synthetic */ e1d C;
    public final /* synthetic */ Rect i;
    public final /* synthetic */ op3 j;
    public final /* synthetic */ io k;
    public final /* synthetic */ Matrix l;
    public final /* synthetic */ gmb m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ myf p;
    public final /* synthetic */ bl0 q;
    public final /* synthetic */ plb r;
    public final /* synthetic */ Map s;
    public final /* synthetic */ hmb t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlb(Rect rect, op3 op3Var, io ioVar, Matrix matrix, gmb gmbVar, boolean z, boolean z2, myf myfVar, bl0 bl0Var, plb plbVar, Map map, hmb hmbVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Context context, Function0 function0, e1d e1dVar) {
        super(1);
        this.i = rect;
        this.j = op3Var;
        this.k = ioVar;
        this.l = matrix;
        this.m = gmbVar;
        this.n = z;
        this.o = z2;
        this.p = myfVar;
        this.q = bl0Var;
        this.r = plbVar;
        this.s = map;
        this.t = hmbVar;
        this.u = z3;
        this.v = z4;
        this.w = z5;
        this.x = z6;
        this.y = z7;
        this.z = z8;
        this.A = context;
        this.B = function0;
        this.C = e1dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0412, code lost:
    
        if (r10.K != r7.a()) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0414, code lost:
    
        r4.execute(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0438, code lost:
    
        if (r10.K != r7.a()) goto L158;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ha5 ha5Var = (ha5) obj;
        ha5Var.getClass();
        uj2 t = ha5Var.L0().t();
        Rect rect = this.i;
        long f = yaa.f(rect.width(), rect.height());
        long f2 = d7a.f(wzb.b(njh.f(ha5Var.n())), wzb.b(njh.d(ha5Var.n())));
        long e = this.j.e(f, ha5Var.n());
        float f3 = njh.f(f);
        int i = mrg.a;
        int i2 = (int) (e >> 32);
        int i3 = (int) (e & 4294967295L);
        long a = this.k.a(d7a.f((int) (Float.intBitsToFloat(i2) * f3), (int) (Float.intBitsToFloat(i3) * njh.d(f))), f2, ha5Var.getLayoutDirection());
        Matrix matrix = this.l;
        matrix.reset();
        matrix.preTranslate((int) (a >> 32), (int) (a & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        gmb gmbVar = this.m;
        HashSet hashSet = (HashSet) gmbVar.l.a;
        boolean z = this.n;
        jmb jmbVar = jmb.a;
        boolean add = z ? hashSet.add(jmbVar) : hashSet.remove(jmbVar);
        if (gmbVar.a != null && add) {
            gmbVar.c();
        }
        gmbVar.e = this.o;
        gmbVar.v = this.p;
        gmbVar.e();
        gmbVar.L = this.q;
        gmbVar.n(this.r);
        Map map = gmbVar.j;
        Map map2 = this.s;
        if (map2 != map) {
            gmbVar.j = map2;
            gmbVar.invalidateSelf();
        }
        e1d e1dVar = this.C;
        hmb hmbVar = (hmb) e1dVar.getValue();
        hmb hmbVar2 = this.t;
        if (hmbVar2 != hmbVar) {
            hmb hmbVar3 = (hmb) e1dVar.getValue();
            if (hmbVar3 != null) {
                Iterator it = hmbVar3.a.iterator();
                while (it.hasNext()) {
                    gmbVar.a(((imb) it.next()).a, 1, null);
                }
                Iterator it2 = hmbVar3.b.iterator();
                while (it2.hasNext()) {
                    gmbVar.a(((imb) it2.next()).a, 1, null);
                }
                Iterator it3 = hmbVar3.c.iterator();
                while (it3.hasNext()) {
                    gmbVar.a(((imb) it3.next()).a, 1, null);
                }
                Iterator it4 = hmbVar3.d.iterator();
                while (it4.hasNext()) {
                    gmbVar.a(((imb) it4.next()).a, 1, null);
                }
                Iterator it5 = hmbVar3.e.iterator();
                while (it5.hasNext()) {
                    gmbVar.a(((imb) it5.next()).a, 1, null);
                }
                Iterator it6 = hmbVar3.f.iterator();
                while (it6.hasNext()) {
                    gmbVar.a(((imb) it6.next()).a, 1, null);
                }
                Iterator it7 = hmbVar3.g.iterator();
                while (it7.hasNext()) {
                    gmbVar.a(((imb) it7.next()).a, 1, null);
                }
                Iterator it8 = hmbVar3.h.iterator();
                while (it8.hasNext()) {
                    gmbVar.a(((imb) it8.next()).a, 1, null);
                }
                Iterator it9 = hmbVar3.i.iterator();
                while (it9.hasNext()) {
                    gmbVar.a(((imb) it9.next()).a, 1, null);
                }
                Iterator it10 = hmbVar3.j.iterator();
                while (it10.hasNext()) {
                    gmbVar.a(((imb) it10.next()).a, 1, null);
                }
            }
            if (hmbVar2 != null) {
                Iterator it11 = hmbVar2.a.iterator();
                while (it11.hasNext()) {
                    imb imbVar = (imb) it11.next();
                    gmbVar.a(imbVar.a, 1, new wc5(imbVar.b, 1));
                }
                Iterator it12 = hmbVar2.b.iterator();
                while (it12.hasNext()) {
                    imb imbVar2 = (imb) it12.next();
                    gmbVar.a(imbVar2.a, 1, new wc5(imbVar2.b, 1));
                }
                Iterator it13 = hmbVar2.c.iterator();
                while (it13.hasNext()) {
                    imb imbVar3 = (imb) it13.next();
                    gmbVar.a(imbVar3.a, 1, new wc5(imbVar3.b, 1));
                }
                Iterator it14 = hmbVar2.d.iterator();
                while (it14.hasNext()) {
                    imb imbVar4 = (imb) it14.next();
                    gmbVar.a(imbVar4.a, 1, new wc5(imbVar4.b, 1));
                }
                Iterator it15 = hmbVar2.e.iterator();
                while (it15.hasNext()) {
                    imb imbVar5 = (imb) it15.next();
                    gmbVar.a(imbVar5.a, 1, new wc5(imbVar5.b, 1));
                }
                Iterator it16 = hmbVar2.f.iterator();
                while (it16.hasNext()) {
                    imb imbVar6 = (imb) it16.next();
                    gmbVar.a(imbVar6.a, 1, new wc5(imbVar6.b, 1));
                }
                Iterator it17 = hmbVar2.g.iterator();
                while (it17.hasNext()) {
                    imb imbVar7 = (imb) it17.next();
                    gmbVar.a(imbVar7.a, 1, new wc5(imbVar7.b, 1));
                }
                Iterator it18 = hmbVar2.h.iterator();
                while (it18.hasNext()) {
                    imb imbVar8 = (imb) it18.next();
                    gmbVar.a(imbVar8.a, 1, new wc5(imbVar8.b, 1));
                }
                Iterator it19 = hmbVar2.i.iterator();
                while (it19.hasNext()) {
                    imb imbVar9 = (imb) it19.next();
                    gmbVar.a(imbVar9.a, 1, new wc5(imbVar9.b, 1));
                }
                Iterator it20 = hmbVar2.j.iterator();
                while (it20.hasNext()) {
                    imb imbVar10 = (imb) it20.next();
                    gmbVar.a(imbVar10.a, 1, new wc5(imbVar10.b, 1));
                }
            }
            e1dVar.setValue(hmbVar2);
        }
        boolean z2 = gmbVar.r;
        boolean z3 = this.u;
        if (z2 != z3) {
            gmbVar.r = z3;
            tg3 tg3Var = gmbVar.o;
            if (tg3Var != null) {
                tg3Var.q(z3);
            }
        }
        gmbVar.s = this.v;
        gmbVar.t = this.w;
        gmbVar.m = this.x;
        boolean z4 = gmbVar.n;
        boolean z5 = this.y;
        if (z5 != z4) {
            gmbVar.n = z5;
            tg3 tg3Var2 = gmbVar.o;
            if (tg3Var2 != null) {
                tg3Var2.L = z5;
            }
            gmbVar.invalidateSelf();
        }
        boolean z6 = gmbVar.u;
        boolean z7 = this.z;
        if (z7 != z6) {
            gmbVar.u = z7;
            gmbVar.invalidateSelf();
        }
        Iterator it21 = gmb.Q.iterator();
        yub yubVar = null;
        while (it21.hasNext()) {
            yubVar = gmbVar.a.d((String) it21.next());
            if (yubVar != null) {
                break;
            }
        }
        if (gmbVar.b(this.A) || yubVar == null) {
            gmbVar.u(((Number) this.B.invoke()).floatValue());
        } else {
            gmbVar.u(yubVar.b);
        }
        gmbVar.setBounds(0, 0, rect.width(), rect.height());
        Canvas b = xx.b(t);
        yp8 yp8Var = gmbVar.N;
        ThreadPoolExecutor threadPoolExecutor = gmb.R;
        smb smbVar = gmbVar.b;
        Semaphore semaphore = gmbVar.M;
        tg3 tg3Var3 = gmbVar.o;
        plb plbVar = gmbVar.a;
        if (tg3Var3 != null && plbVar != null) {
            bl0 bl0Var = gmbVar.L;
            if (bl0Var == null) {
                bl0Var = bl0.a;
            }
            boolean z8 = bl0Var == bl0.b;
            if (z8) {
                try {
                    semaphore.acquire();
                    if (gmbVar.v()) {
                        gmbVar.u(smbVar.a());
                    }
                } catch (InterruptedException unused) {
                    if (z8) {
                        semaphore.release();
                    }
                } catch (Throwable th) {
                    if (z8) {
                        semaphore.release();
                        if (tg3Var3.K != smbVar.a()) {
                            threadPoolExecutor.execute(yp8Var);
                        }
                    }
                    throw th;
                }
            }
            boolean z9 = gmbVar.e;
            int i4 = gmbVar.p;
            boolean z10 = gmbVar.w;
            if (z9) {
                try {
                    if (z10) {
                        b.save();
                        b.concat(matrix);
                        gmbVar.l(b, tg3Var3);
                        b.restore();
                    } else {
                        tg3Var3.g(b, matrix, i4, null);
                    }
                } catch (Throwable unused2) {
                    ajb.a.getClass();
                }
            } else if (z10) {
                b.save();
                b.concat(matrix);
                gmbVar.l(b, tg3Var3);
                b.restore();
            } else {
                tg3Var3.g(b, matrix, i4, null);
            }
            gmbVar.K = false;
            if (z8) {
                semaphore.release();
            }
        }
        return Unit.a;
    }
}
