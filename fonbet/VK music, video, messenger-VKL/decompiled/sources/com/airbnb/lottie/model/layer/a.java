package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.a900;
import xsna.b3r0;
import xsna.b5h0;
import xsna.dg2;
import xsna.el3;
import xsna.gfj;
import xsna.hg90;
import xsna.hqr;
import xsna.ikp0;
import xsna.ix90;
import xsna.k800;
import xsna.p9e;
import xsna.plo;
import xsna.qus;
import xsna.tf6;
import xsna.tky;
import xsna.udy;
import xsna.vdy;
import xsna.xky;
import xsna.xo10;

/* compiled from: BaseLayer.java */
/* loaded from: classes12.dex */
public abstract class a implements plo, tf6.a, vdy {
    public float A;

    @Nullable
    public BlurMaskFilter B;

    @Nullable
    public xky C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final xky d = new xky(1);
    public final xky e;
    public final xky f;
    public final xky g;
    public final xky h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final k800 o;
    public final Layer p;

    @Nullable
    public final p9e q;

    @Nullable
    public final hqr r;

    @Nullable
    public a s;

    @Nullable
    public a t;
    public List<a> u;
    public final ArrayList v;
    public final ikp0 w;
    public boolean x;
    public boolean y;

    @Nullable
    public xky z;

    /* compiled from: BaseLayer.java */
    /* renamed from: com.airbnb.lottie.model.layer.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0096a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(k800 k800Var, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new xky(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new xky(mode2);
        xky xkyVar = new xky(1);
        this.g = xkyVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        xky xkyVar2 = new xky();
        xkyVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = xkyVar2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = k800Var;
        this.p = layer;
        List<Mask> list = layer.h;
        if (layer.u == Layer.MatteType.INVERT) {
            xkyVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            xkyVar.setXfermode(new PorterDuffXfermode(mode));
        }
        dg2 dg2Var = layer.i;
        dg2Var.getClass();
        ikp0 ikp0Var = new ikp0(dg2Var);
        this.w = ikp0Var;
        ikp0Var.b(this);
        if (list != null && !list.isEmpty()) {
            p9e p9eVar = new p9e(list);
            this.q = p9eVar;
            Iterator it = ((ArrayList) p9eVar.a).iterator();
            while (it.hasNext()) {
                ((tf6) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.q.b).iterator();
            while (it2.hasNext()) {
                tf6<?, ?> tf6Var = (tf6) it2.next();
                h(tf6Var);
                tf6Var.a(this);
            }
        }
        Layer layer2 = this.p;
        if (layer2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        hqr hqrVar = new hqr(layer2.t);
        this.r = hqrVar;
        hqrVar.b = true;
        hqrVar.a(new tf6.a() { // from class: xsna.uf6
            @Override // xsna.tf6.a
            public final void i() {
                com.airbnb.lottie.model.layer.a aVar = com.airbnb.lottie.model.layer.a.this;
                boolean z = aVar.r.m() == 1.0f;
                if (z != aVar.x) {
                    aVar.x = z;
                    aVar.o.invalidateSelf();
                }
            }
        });
        boolean z = this.r.f().floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        h(this.r);
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        a aVar = this.s;
        Layer layer = this.p;
        if (aVar != null) {
            String str = aVar.p.c;
            udy udyVar3 = new udy(udyVar2);
            udyVar3.a.add(str);
            if (udyVar.a(i, this.s.p.c)) {
                a aVar2 = this.s;
                udy udyVar4 = new udy(udyVar3);
                udyVar4.b = aVar2;
                arrayList.add(udyVar4);
            }
            if (udyVar.c(i, this.s.p.c) && udyVar.d(i, layer.c)) {
                this.s.p(udyVar, udyVar.b(i, this.s.p.c) + i, arrayList, udyVar3);
            }
        }
        String str2 = layer.c;
        String str3 = layer.c;
        if (udyVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                udy udyVar5 = new udy(udyVar2);
                udyVar5.a.add(str3);
                if (udyVar.a(i, str3)) {
                    udy udyVar6 = new udy(udyVar5);
                    udyVar6.b = this;
                    arrayList.add(udyVar6);
                }
                udyVar2 = udyVar5;
            }
            if (udyVar.d(i, str3)) {
                p(udyVar, udyVar.b(i, str3) + i, arrayList, udyVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0395  */
    @Override // xsna.plo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        float f;
        int i2;
        int i3;
        xky xkyVar;
        BlendModeCompat blendModeCompat;
        float f2;
        Integer f3;
        Canvas canvas2 = canvas;
        AsyncUpdates asyncUpdates = tky.a;
        if (this.x) {
            Layer layer = this.p;
            boolean z = layer.v;
            LBlendMode lBlendMode = layer.y;
            if (z) {
                return;
            }
            j();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(this.u.get(size).w.e());
            }
            AsyncUpdates asyncUpdates2 = tky.a;
            ikp0 ikp0Var = this.w;
            tf6<Integer, Integer> tf6Var = ikp0Var.p;
            int intValue = (int) ((((i / 255.0f) * ((tf6Var == null || (f3 = tf6Var.f()) == null) ? 100 : f3.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !m() && lBlendMode == LBlendMode.NORMAL) {
                matrix2.preConcat(ikp0Var.e());
                k(canvas2, matrix2, intValue, aVar);
                n();
                return;
            }
            RectF rectF = this.i;
            g(rectF, matrix2, false);
            if (this.s != null && layer.u != Layer.MatteType.INVERT) {
                RectF rectF2 = this.l;
                rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.s.g(rectF2, matrix, true);
                if (!rectF.intersect(rectF2)) {
                    rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            matrix2.preConcat(ikp0Var.e());
            RectF rectF3 = this.k;
            rectF3.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            boolean m = m();
            p9e p9eVar = this.q;
            Path path = this.a;
            if (m) {
                int size2 = ((List) p9eVar.c).size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        Mask mask = (Mask) ((List) p9eVar.c).get(i4);
                        Path path2 = (Path) ((tf6) ((ArrayList) p9eVar.a).get(i4)).f();
                        if (path2 != null) {
                            path.set(path2);
                            path.transform(matrix2);
                            i2 = size2;
                            int i5 = C0096a.b[mask.a.ordinal()];
                            if (i5 == 1 || i5 == 2 || ((i5 == 3 || i5 == 4) && mask.d)) {
                                break;
                            }
                            RectF rectF4 = this.m;
                            path.computeBounds(rectF4, false);
                            if (i4 == 0) {
                                rectF3.set(rectF4);
                            } else {
                                i3 = i4;
                                rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                i4 = i3 + 1;
                                size2 = i2;
                            }
                        } else {
                            i2 = size2;
                        }
                        i3 = i4;
                        i4 = i3 + 1;
                        size2 = i2;
                    } else if (!rectF.intersect(rectF3)) {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
            }
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float width = canvas2.getWidth();
            float height = canvas2.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas2.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF.intersect(rectF5)) {
                rectF.set(f, f, f, f);
            }
            AsyncUpdates asyncUpdates3 = tky.a;
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                xky xkyVar2 = this.d;
                xkyVar2.setAlpha(255);
                lBlendMode.getClass();
                switch (LBlendMode.a.a[lBlendMode.ordinal()]) {
                    case 2:
                        if (Build.VERSION.SDK_INT >= 29) {
                            blendModeCompat = BlendModeCompat.MULTIPLY;
                            break;
                        } else {
                            blendModeCompat = BlendModeCompat.MODULATE;
                            break;
                        }
                    case 3:
                        blendModeCompat = BlendModeCompat.SCREEN;
                        break;
                    case 4:
                        blendModeCompat = BlendModeCompat.OVERLAY;
                        break;
                    case 5:
                        blendModeCompat = BlendModeCompat.DARKEN;
                        break;
                    case 6:
                        blendModeCompat = BlendModeCompat.LIGHTEN;
                        break;
                    case 7:
                        blendModeCompat = BlendModeCompat.PLUS;
                        break;
                    default:
                        blendModeCompat = null;
                        break;
                }
                hg90.a(xkyVar2, blendModeCompat);
                b3r0.f(canvas2, xkyVar2, rectF);
                if (lBlendMode != LBlendMode.MULTIPLY) {
                    f2 = 1.0f;
                    canvas2.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
                } else {
                    f2 = 1.0f;
                    if (Build.VERSION.SDK_INT < 29) {
                        if (this.C == null) {
                            xky xkyVar3 = new xky();
                            this.C = xkyVar3;
                            xkyVar3.setColor(-1);
                        }
                        canvas2 = canvas;
                        canvas2.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.C);
                        k(canvas2, matrix2, intValue, aVar);
                        if (m()) {
                            xky xkyVar4 = this.e;
                            canvas2.saveLayer(rectF, xkyVar4);
                            int i6 = 0;
                            while (true) {
                                List list = (List) p9eVar.c;
                                ArrayList arrayList = (ArrayList) p9eVar.a;
                                List list2 = (List) p9eVar.c;
                                if (i6 < list.size()) {
                                    Mask mask2 = (Mask) list2.get(i6);
                                    tf6 tf6Var2 = (tf6) arrayList.get(i6);
                                    tf6 tf6Var3 = (tf6) ((ArrayList) p9eVar.b).get(i6);
                                    int[] iArr = C0096a.b;
                                    Mask.MaskMode maskMode = mask2.a;
                                    boolean z2 = mask2.d;
                                    int i7 = iArr[maskMode.ordinal()];
                                    int i8 = i6;
                                    if (i7 != 1) {
                                        xky xkyVar5 = this.f;
                                        if (i7 == 2) {
                                            if (i8 == 0) {
                                                xkyVar2.setColor(-16777216);
                                                xkyVar2.setAlpha(255);
                                                canvas2.drawRect(rectF, xkyVar2);
                                            }
                                            if (z2) {
                                                b3r0.f(canvas2, xkyVar5, rectF);
                                                canvas2.drawRect(rectF, xkyVar2);
                                                xkyVar5.setAlpha((int) (((Integer) tf6Var3.f()).intValue() * 2.55f));
                                                path.set((Path) tf6Var2.f());
                                                path.transform(matrix2);
                                                canvas2.drawPath(path, xkyVar5);
                                                canvas2.restore();
                                            } else {
                                                path.set((Path) tf6Var2.f());
                                                path.transform(matrix2);
                                                canvas2.drawPath(path, xkyVar5);
                                            }
                                        } else if (i7 != 3) {
                                            if (i7 == 4) {
                                                if (z2) {
                                                    b3r0.f(canvas2, xkyVar2, rectF);
                                                    canvas2.drawRect(rectF, xkyVar2);
                                                    path.set((Path) tf6Var2.f());
                                                    path.transform(matrix2);
                                                    xkyVar2.setAlpha((int) (((Integer) tf6Var3.f()).intValue() * 2.55f));
                                                    canvas2.drawPath(path, xkyVar5);
                                                    canvas2.restore();
                                                } else {
                                                    path.set((Path) tf6Var2.f());
                                                    path.transform(matrix2);
                                                    xkyVar2.setAlpha((int) (((Integer) tf6Var3.f()).intValue() * 2.55f));
                                                    canvas2.drawPath(path, xkyVar2);
                                                }
                                            }
                                        } else if (z2) {
                                            b3r0.f(canvas2, xkyVar4, rectF);
                                            canvas2.drawRect(rectF, xkyVar2);
                                            xkyVar5.setAlpha((int) (((Integer) tf6Var3.f()).intValue() * 2.55f));
                                            path.set((Path) tf6Var2.f());
                                            path.transform(matrix2);
                                            canvas2.drawPath(path, xkyVar5);
                                            canvas2.restore();
                                        } else {
                                            b3r0.f(canvas2, xkyVar4, rectF);
                                            path.set((Path) tf6Var2.f());
                                            path.transform(matrix2);
                                            xkyVar2.setAlpha((int) (((Integer) tf6Var3.f()).intValue() * 2.55f));
                                            canvas2.drawPath(path, xkyVar2);
                                            canvas2.restore();
                                        }
                                    } else if (!arrayList.isEmpty()) {
                                        for (int i9 = 0; i9 < list2.size(); i9++) {
                                            if (((Mask) list2.get(i9)).a == Mask.MaskMode.MASK_MODE_NONE) {
                                            }
                                        }
                                        xkyVar2.setAlpha(255);
                                        canvas2.drawRect(rectF, xkyVar2);
                                        i6 = i8 + 1;
                                    }
                                    i6 = i8 + 1;
                                } else {
                                    AsyncUpdates asyncUpdates4 = tky.a;
                                    canvas2.restore();
                                }
                            }
                        }
                        if (this.s != null) {
                            canvas2.saveLayer(rectF, this.g);
                            canvas2.drawRect(rectF.left - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2, this.h);
                            this.s.e(canvas2, matrix, i, null);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                }
                canvas2 = canvas;
                k(canvas2, matrix2, intValue, aVar);
                if (m()) {
                }
                if (this.s != null) {
                }
                canvas2.restore();
            }
            if (this.y && (xkyVar = this.z) != null) {
                xkyVar.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas2.drawRect(rectF, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas2.drawRect(rectF, this.z);
            }
            n();
        }
    }

    @Override // xsna.vdy
    public <T> void f(T t, @Nullable a900<T> a900Var) {
        this.w.c(t, a900Var);
    }

    @Override // xsna.plo
    public void g(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        j();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List<a> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.u.get(size).w.e());
                }
            } else {
                a aVar = this.t;
                if (aVar != null) {
                    matrix2.preConcat(aVar.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void h(@Nullable tf6<?, ?> tf6Var) {
        if (tf6Var == null) {
            return;
        }
        this.v.add(tf6Var);
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.o.invalidateSelf();
    }

    public final void j() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (a aVar = this.t; aVar != null; aVar = aVar.t) {
            this.u.add(aVar);
        }
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar);

    @Nullable
    public qus l() {
        return this.p.w;
    }

    public final boolean m() {
        p9e p9eVar = this.q;
        return (p9eVar == null || ((ArrayList) p9eVar.a).isEmpty()) ? false : true;
    }

    public final void n() {
        ix90 ix90Var = this.o.b.a;
        String str = this.p.c;
        HashMap hashMap = ix90Var.c;
        if (ix90Var.a) {
            xo10 xo10Var = (xo10) hashMap.get(str);
            if (xo10Var == null) {
                xo10Var = new xo10();
                hashMap.put(str, xo10Var);
            }
            int i = xo10Var.a + 1;
            xo10Var.a = i;
            if (i == Integer.MAX_VALUE) {
                xo10Var.a = i / 2;
            }
            if (str.equals("__container")) {
                el3 el3Var = ix90Var.b;
                el3Var.getClass();
                el3.a aVar = new el3.a();
                while (aVar.hasNext()) {
                    ((ix90.a) aVar.next()).a();
                }
            }
        }
    }

    public final void o(tf6<?, ?> tf6Var) {
        this.v.remove(tf6Var);
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new xky();
        }
        this.y = z;
    }

    public void r(float f) {
        AsyncUpdates asyncUpdates = tky.a;
        ikp0 ikp0Var = this.w;
        tf6<Integer, Integer> tf6Var = ikp0Var.p;
        if (tf6Var != null) {
            tf6Var.j(f);
        }
        tf6<?, Float> tf6Var2 = ikp0Var.v;
        if (tf6Var2 != null) {
            tf6Var2.j(f);
        }
        tf6<?, Float> tf6Var3 = ikp0Var.w;
        if (tf6Var3 != null) {
            tf6Var3.j(f);
        }
        tf6<PointF, PointF> tf6Var4 = ikp0Var.l;
        if (tf6Var4 != null) {
            tf6Var4.j(f);
        }
        tf6<?, PointF> tf6Var5 = ikp0Var.m;
        if (tf6Var5 != null) {
            tf6Var5.j(f);
        }
        tf6<b5h0, b5h0> tf6Var6 = ikp0Var.n;
        if (tf6Var6 != null) {
            tf6Var6.j(f);
        }
        tf6<Float, Float> tf6Var7 = ikp0Var.o;
        if (tf6Var7 != null) {
            tf6Var7.j(f);
        }
        hqr hqrVar = ikp0Var.q;
        if (hqrVar != null) {
            hqrVar.j(f);
        }
        hqr hqrVar2 = ikp0Var.r;
        if (hqrVar2 != null) {
            hqrVar2.j(f);
        }
        hqr hqrVar3 = ikp0Var.s;
        if (hqrVar3 != null) {
            hqrVar3.j(f);
        }
        hqr hqrVar4 = ikp0Var.t;
        if (hqrVar4 != null) {
            hqrVar4.j(f);
        }
        hqr hqrVar5 = ikp0Var.u;
        if (hqrVar5 != null) {
            hqrVar5.j(f);
        }
        int i = 0;
        p9e p9eVar = this.q;
        if (p9eVar != null) {
            ArrayList arrayList = (ArrayList) p9eVar.a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((tf6) arrayList.get(i2)).j(f);
            }
            AsyncUpdates asyncUpdates2 = tky.a;
        }
        hqr hqrVar6 = this.r;
        if (hqrVar6 != null) {
            hqrVar6.j(f);
        }
        a aVar = this.s;
        if (aVar != null) {
            aVar.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                AsyncUpdates asyncUpdates3 = tky.a;
                return;
            } else {
                ((tf6) arrayList2.get(i)).j(f);
                i++;
            }
        }
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
    }

    public void p(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
    }
}
