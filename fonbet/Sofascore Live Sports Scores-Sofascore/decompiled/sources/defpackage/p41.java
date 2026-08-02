package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class p41 implements jb5, k41, bja {
    public float A;
    public BlurMaskFilter B;
    public ska C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final ska d = new ska(1, 0);
    public final ska e;
    public final ska f;
    public final ska g;
    public final ska h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final gmb o;
    public final mla p;
    public final l2a q;
    public final z78 r;
    public p41 s;
    public p41 t;
    public List u;
    public final ArrayList v;
    public final wvj w;
    public boolean x;
    public boolean y;
    public ska z;

    public p41(gmb gmbVar, mla mlaVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new ska(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new ska(mode2);
        ska skaVar = new ska(1, 0);
        this.g = skaVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        ska skaVar2 = new ska();
        skaVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = skaVar2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = gmbVar;
        this.p = mlaVar;
        List list = mlaVar.h;
        int i = 3;
        if (mlaVar.u == 3) {
            skaVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            skaVar.setXfermode(new PorterDuffXfermode(mode));
        }
        x50 x50Var = mlaVar.i;
        x50Var.getClass();
        wvj wvjVar = new wvj(x50Var);
        this.w = wvjVar;
        wvjVar.b(this);
        if (list != null && !list.isEmpty()) {
            l2a l2aVar = new l2a(list, 13);
            this.q = l2aVar;
            Iterator it = ((ArrayList) l2aVar.b).iterator();
            while (it.hasNext()) {
                ((o41) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.q.c).iterator();
            while (it2.hasNext()) {
                o41 o41Var = (o41) it2.next();
                f(o41Var);
                o41Var.a(this);
            }
        }
        mla mlaVar2 = this.p;
        if (mlaVar2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        z78 z78Var = new z78(mlaVar2.t);
        this.r = z78Var;
        z78Var.b = true;
        z78Var.a(new vvj(this, i));
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        f(this.r);
    }

    @Override // defpackage.k41
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.bja
    public final void c(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        p41 p41Var = this.s;
        mla mlaVar = this.p;
        if (p41Var != null) {
            String str = p41Var.p.c;
            aja ajaVar3 = new aja(ajaVar2);
            ajaVar3.a.add(str);
            if (ajaVar.a(i, this.s.p.c)) {
                p41 p41Var2 = this.s;
                aja ajaVar4 = new aja(ajaVar3);
                ajaVar4.b = p41Var2;
                arrayList.add(ajaVar4);
            }
            if (ajaVar.c(i, this.s.p.c) && ajaVar.d(i, mlaVar.c)) {
                this.s.p(ajaVar, ajaVar.b(i, this.s.p.c) + i, arrayList, ajaVar3);
            }
        }
        String str2 = mlaVar.c;
        String str3 = mlaVar.c;
        if (ajaVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                aja ajaVar5 = new aja(ajaVar2);
                ajaVar5.a.add(str3);
                if (ajaVar.a(i, str3)) {
                    aja ajaVar6 = new aja(ajaVar5);
                    ajaVar6.b = this;
                    arrayList.add(ajaVar6);
                }
                ajaVar2 = ajaVar5;
            }
            if (ajaVar.d(i, str3)) {
                p(ajaVar, ajaVar.b(i, str3) + i, arrayList, ajaVar2);
            }
        }
    }

    public void d(wj9 wj9Var, Object obj) {
        this.w.c(wj9Var, obj);
    }

    @Override // defpackage.jb5
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((p41) this.u.get(size)).w.e());
                }
            } else {
                p41 p41Var = this.t;
                if (p41Var != null) {
                    matrix2.preConcat(p41Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void f(o41 o41Var) {
        if (o41Var == null) {
            return;
        }
        this.v.add(o41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    @Override // defpackage.jb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        l2a l2aVar;
        Path path;
        float f;
        int i2;
        l2a l2aVar2;
        Path path2;
        RectF rectF;
        Matrix matrix2;
        ska skaVar;
        l2a l2aVar3;
        Path path3;
        Path path4;
        Path path5;
        Integer num;
        if (this.x) {
            mla mlaVar = this.p;
            boolean z = mlaVar.v;
            int i3 = mlaVar.y;
            if (z) {
                return;
            }
            h();
            Matrix matrix3 = this.b;
            matrix3.reset();
            matrix3.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix3.preConcat(((p41) this.u.get(size)).w.e());
            }
            wvj wvjVar = this.w;
            o41 o41Var = wvjVar.p;
            int intValue = (int) ((((i / 255.0f) * ((o41Var == null || (num = (Integer) o41Var.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !l() && i3 == 1) {
                matrix3.preConcat(wvjVar.e());
                j(canvas, matrix3, intValue, uc5Var);
                m();
                return;
            }
            RectF rectF2 = this.i;
            e(rectF2, matrix3, false);
            if (this.s != null && mlaVar.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.s.e(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            matrix3.preConcat(wvjVar.e());
            RectF rectF4 = this.k;
            rectF4.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            boolean l = l();
            l2a l2aVar4 = this.q;
            Path path6 = this.a;
            if (l) {
                int size2 = ((List) l2aVar4.d).size();
                int i4 = 0;
                while (i4 < size2) {
                    jvb jvbVar = (jvb) ((List) l2aVar4.d).get(i4);
                    Path path7 = (Path) ((o41) ((ArrayList) l2aVar4.b).get(i4)).e();
                    if (path7 == null) {
                        i2 = size2;
                    } else {
                        path6.set(path7);
                        path6.transform(matrix3);
                        int C = wt3.C(jvbVar.a);
                        i2 = size2;
                        if (C != 0) {
                            if (C != 1) {
                                if (C != 2) {
                                    if (C == 3) {
                                    }
                                    RectF rectF5 = this.m;
                                    path6.computeBounds(rectF5, false);
                                    if (i4 != 0) {
                                        rectF4.set(rectF5);
                                    } else {
                                        l2aVar2 = l2aVar4;
                                        path2 = path6;
                                        rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                        i4++;
                                        size2 = i2;
                                        l2aVar4 = l2aVar2;
                                        path6 = path2;
                                    }
                                }
                            }
                        }
                        if (jvbVar.d) {
                        }
                        RectF rectF52 = this.m;
                        path6.computeBounds(rectF52, false);
                        if (i4 != 0) {
                        }
                    }
                    l2aVar2 = l2aVar4;
                    path2 = path6;
                    i4++;
                    size2 = i2;
                    l2aVar4 = l2aVar2;
                    path6 = path2;
                }
                l2aVar = l2aVar4;
                path = path6;
                if (!rectF2.intersect(rectF4)) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    float width = canvas.getWidth();
                    float height = canvas.getHeight();
                    rectF = this.j;
                    rectF.set(f, f, width, height);
                    matrix2 = this.c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF);
                    }
                    if (!rectF2.intersect(rectF)) {
                        rectF2.set(f, f, f, f);
                    }
                    if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                        ska skaVar2 = this.d;
                        skaVar2.setAlpha(255);
                        int C2 = wt3.C(i3);
                        v7a.F(skaVar2, C2 == 1 ? C2 != 2 ? C2 != 3 ? C2 != 4 ? C2 != 5 ? C2 != 16 ? null : cy1.PLUS : cy1.LIGHTEN : cy1.DARKEN : cy1.OVERLAY : cy1.SCREEN : Build.VERSION.SDK_INT >= 29 ? cy1.MULTIPLY : cy1.MODULATE);
                        Matrix matrix4 = vik.a;
                        canvas.saveLayer(rectF2, skaVar2);
                        if (i3 == 2) {
                            i(canvas);
                        } else if (Build.VERSION.SDK_INT < 29) {
                            if (this.C == null) {
                                ska skaVar3 = new ska();
                                this.C = skaVar3;
                                skaVar3.setColor(-1);
                            }
                            l2aVar3 = l2aVar;
                            path3 = path;
                            canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.C);
                            j(canvas, matrix3, intValue, uc5Var);
                            if (l()) {
                                Paint paint = this.e;
                                canvas.saveLayer(rectF2, paint);
                                if (Build.VERSION.SDK_INT < 28) {
                                    i(canvas);
                                }
                                int i5 = 0;
                                while (true) {
                                    List list = (List) l2aVar3.d;
                                    ArrayList arrayList = (ArrayList) l2aVar3.b;
                                    if (i5 >= list.size()) {
                                        break;
                                    }
                                    jvb jvbVar2 = (jvb) list.get(i5);
                                    o41 o41Var2 = (o41) arrayList.get(i5);
                                    o41 o41Var3 = (o41) ((ArrayList) l2aVar3.c).get(i5);
                                    int i6 = jvbVar2.a;
                                    boolean z2 = jvbVar2.d;
                                    int C3 = wt3.C(i6);
                                    int i7 = i5;
                                    Paint paint2 = this.f;
                                    if (C3 == 0) {
                                        path4 = path3;
                                        if (z2) {
                                            Matrix matrix5 = vik.a;
                                            canvas.saveLayer(rectF2, skaVar2);
                                            canvas.drawRect(rectF2, skaVar2);
                                            path4.set((Path) o41Var2.e());
                                            path4.transform(matrix3);
                                            skaVar2.setAlpha((int) (((Integer) o41Var3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) o41Var2.e());
                                            path4.transform(matrix3);
                                            skaVar2.setAlpha((int) (((Integer) o41Var3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, skaVar2);
                                        }
                                    } else if (C3 == 1) {
                                        path4 = path3;
                                        if (i7 == 0) {
                                            skaVar2.setColor(-16777216);
                                            skaVar2.setAlpha(255);
                                            canvas.drawRect(rectF2, skaVar2);
                                        }
                                        if (z2) {
                                            Matrix matrix6 = vik.a;
                                            canvas.saveLayer(rectF2, paint2);
                                            canvas.drawRect(rectF2, skaVar2);
                                            paint2.setAlpha((int) (((Integer) o41Var3.e()).intValue() * 2.55f));
                                            path4.set((Path) o41Var2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) o41Var2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                        }
                                    } else if (C3 == 2) {
                                        if (z2) {
                                            Matrix matrix7 = vik.a;
                                            canvas.saveLayer(rectF2, paint);
                                            canvas.drawRect(rectF2, skaVar2);
                                            paint2.setAlpha((int) (((Integer) o41Var3.e()).intValue() * 2.55f));
                                            path5 = path3;
                                            path5.set((Path) o41Var2.e());
                                            path5.transform(matrix3);
                                            canvas.drawPath(path5, paint2);
                                            canvas.restore();
                                        } else {
                                            path5 = path3;
                                            Matrix matrix8 = vik.a;
                                            canvas.saveLayer(rectF2, paint);
                                            path5.set((Path) o41Var2.e());
                                            path5.transform(matrix3);
                                            skaVar2.setAlpha((int) (((Integer) o41Var3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path5, skaVar2);
                                            canvas.restore();
                                        }
                                        path4 = path5;
                                    } else if (C3 != 3) {
                                        path4 = path3;
                                    } else {
                                        if (!arrayList.isEmpty()) {
                                            int i8 = 0;
                                            while (true) {
                                                if (i8 >= list.size()) {
                                                    skaVar2.setAlpha(255);
                                                    canvas.drawRect(rectF2, skaVar2);
                                                    break;
                                                } else if (((jvb) list.get(i8)).a != 4) {
                                                    break;
                                                } else {
                                                    i8++;
                                                }
                                            }
                                        }
                                        path4 = path3;
                                    }
                                    i5 = i7 + 1;
                                    path3 = path4;
                                }
                                canvas.restore();
                            }
                            if (this.s != null) {
                                canvas.saveLayer(rectF2, this.g);
                                i(canvas);
                                this.s.g(canvas, matrix, i, null);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        l2aVar3 = l2aVar;
                        path3 = path;
                        j(canvas, matrix3, intValue, uc5Var);
                        if (l()) {
                        }
                        if (this.s != null) {
                        }
                        canvas.restore();
                    }
                    if (this.y && (skaVar = this.z) != null) {
                        skaVar.setStyle(Paint.Style.STROKE);
                        this.z.setColor(-251901);
                        this.z.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF2, this.z);
                        this.z.setStyle(Paint.Style.FILL);
                        this.z.setColor(1357638635);
                        canvas.drawRect(rectF2, this.z);
                    }
                    m();
                }
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float width2 = canvas.getWidth();
                float height2 = canvas.getHeight();
                rectF = this.j;
                rectF.set(f, f, width2, height2);
                matrix2 = this.c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                }
                if (!rectF2.intersect(rectF)) {
                }
                if (rectF2.width() >= 1.0f) {
                    ska skaVar22 = this.d;
                    skaVar22.setAlpha(255);
                    int C22 = wt3.C(i3);
                    v7a.F(skaVar22, C22 == 1 ? C22 != 2 ? C22 != 3 ? C22 != 4 ? C22 != 5 ? C22 != 16 ? null : cy1.PLUS : cy1.LIGHTEN : cy1.DARKEN : cy1.OVERLAY : cy1.SCREEN : Build.VERSION.SDK_INT >= 29 ? cy1.MULTIPLY : cy1.MODULATE);
                    Matrix matrix42 = vik.a;
                    canvas.saveLayer(rectF2, skaVar22);
                    if (i3 == 2) {
                    }
                    l2aVar3 = l2aVar;
                    path3 = path;
                    j(canvas, matrix3, intValue, uc5Var);
                    if (l()) {
                    }
                    if (this.s != null) {
                    }
                    canvas.restore();
                }
                if (this.y) {
                    skaVar.setStyle(Paint.Style.STROKE);
                    this.z.setColor(-251901);
                    this.z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.z);
                    this.z.setStyle(Paint.Style.FILL);
                    this.z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.z);
                }
                m();
            }
            l2aVar = l2aVar4;
            path = path6;
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float width22 = canvas.getWidth();
            float height22 = canvas.getHeight();
            rectF = this.j;
            rectF.set(f, f, width22, height22);
            matrix2 = this.c;
            canvas.getMatrix(matrix2);
            if (!matrix2.isIdentity()) {
            }
            if (!rectF2.intersect(rectF)) {
            }
            if (rectF2.width() >= 1.0f) {
            }
            if (this.y) {
            }
            m();
        }
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (p41 p41Var = this.t; p41Var != null; p41Var = p41Var.t) {
            this.u.add(p41Var);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i, uc5 uc5Var);

    public hpo k() {
        return this.p.w;
    }

    public final boolean l() {
        l2a l2aVar = this.q;
        return (l2aVar == null || ((ArrayList) l2aVar.b).isEmpty()) ? false : true;
    }

    public final void m() {
        tde tdeVar = this.o.a.a;
        String str = this.p.c;
        HashMap hashMap = tdeVar.c;
        if (tdeVar.a) {
            f1c f1cVar = (f1c) hashMap.get(str);
            if (f1cVar == null) {
                f1cVar = new f1c();
                hashMap.put(str, f1cVar);
            }
            int i = f1cVar.a + 1;
            f1cVar.a = i;
            if (i == Integer.MAX_VALUE) {
                f1cVar.a = i / 2;
            }
            if (str.equals("__container")) {
                zg0 zg0Var = new zg0(tdeVar.b);
                if (zg0Var.hasNext()) {
                    zg0Var.next().getClass();
                    pvd.j();
                }
            }
        }
    }

    public final void o(o41 o41Var) {
        this.v.remove(o41Var);
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new ska();
        }
        this.y = z;
    }

    public void r(float f) {
        wvj wvjVar = this.w;
        o41 o41Var = wvjVar.p;
        if (o41Var != null) {
            o41Var.i(f);
        }
        o41 o41Var2 = wvjVar.v;
        if (o41Var2 != null) {
            o41Var2.i(f);
        }
        o41 o41Var3 = wvjVar.w;
        if (o41Var3 != null) {
            o41Var3.i(f);
        }
        o41 o41Var4 = wvjVar.l;
        if (o41Var4 != null) {
            o41Var4.i(f);
        }
        o41 o41Var5 = wvjVar.m;
        if (o41Var5 != null) {
            o41Var5.i(f);
        }
        o41 o41Var6 = wvjVar.n;
        if (o41Var6 != null) {
            o41Var6.i(f);
        }
        o41 o41Var7 = wvjVar.o;
        if (o41Var7 != null) {
            o41Var7.i(f);
        }
        z78 z78Var = wvjVar.q;
        if (z78Var != null) {
            z78Var.i(f);
        }
        z78 z78Var2 = wvjVar.r;
        if (z78Var2 != null) {
            z78Var2.i(f);
        }
        z78 z78Var3 = wvjVar.s;
        if (z78Var3 != null) {
            z78Var3.i(f);
        }
        z78 z78Var4 = wvjVar.t;
        if (z78Var4 != null) {
            z78Var4.i(f);
        }
        z78 z78Var5 = wvjVar.u;
        if (z78Var5 != null) {
            z78Var5.i(f);
        }
        int i = 0;
        l2a l2aVar = this.q;
        if (l2aVar != null) {
            ArrayList arrayList = (ArrayList) l2aVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((o41) arrayList.get(i2)).i(f);
            }
        }
        z78 z78Var6 = this.r;
        if (z78Var6 != null) {
            z78Var6.i(f);
        }
        p41 p41Var = this.s;
        if (p41Var != null) {
            p41Var.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((o41) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
    }

    public void p(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
    }
}
