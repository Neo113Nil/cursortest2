package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a900;
import xsna.d6j0;
import xsna.ejo0;
import xsna.hqr;
import xsna.i700;
import xsna.k800;
import xsna.lmo;
import xsna.m22;
import xsna.n100;
import xsna.nf2;
import xsna.pjr0;
import xsna.t800;
import xsna.tf6;
import xsna.tky;
import xsna.udy;
import xsna.wek0;
import xsna.wjw;
import xsna.wm70;
import xsna.x500;

/* compiled from: CompositionLayer.java */
/* loaded from: classes12.dex */
public final class b extends com.airbnb.lottie.model.layer.a {

    @Nullable
    public tf6<Float, Float> D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final OffscreenLayer I;
    public final OffscreenLayer.b J;
    public float K;
    public boolean L;

    @Nullable
    public final lmo M;

    /* compiled from: CompositionLayer.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(k800 k800Var, Layer layer, List<Layer> list, i700 i700Var) {
        super(k800Var, layer);
        com.airbnb.lottie.model.layer.a aVar;
        com.airbnb.lottie.model.layer.a d6j0Var;
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new OffscreenLayer();
        this.J = new OffscreenLayer.b();
        this.L = true;
        nf2 nf2Var = layer.s;
        if (nf2Var != null) {
            hqr j = nf2Var.j();
            this.D = j;
            h(j);
            this.D.a(this);
        } else {
            this.D = null;
        }
        x500 x500Var = new x500(i700Var.j.size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.a aVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < x500Var.size(); i++) {
                    com.airbnb.lottie.model.layer.a aVar3 = (com.airbnb.lottie.model.layer.a) x500Var.get(x500Var.keyAt(i));
                    if (aVar3 != null && (aVar = (com.airbnb.lottie.model.layer.a) x500Var.get(aVar3.p.f)) != null) {
                        aVar3.t = aVar;
                    }
                }
                m22 m22Var = this.p.x;
                if (m22Var != null) {
                    this.M = new lmo(this, this, m22Var);
                    return;
                }
                return;
            }
            Layer layer2 = list.get(size);
            switch (a.C0096a.a[layer2.e.ordinal()]) {
                case 1:
                    d6j0Var = new d6j0(k800Var, layer2, this, i700Var);
                    break;
                case 2:
                    d6j0Var = new b(k800Var, layer2, (List) i700Var.c.get(layer2.g), i700Var);
                    break;
                case 3:
                    d6j0Var = new wek0(k800Var, layer2);
                    break;
                case 4:
                    d6j0Var = new wjw(k800Var, layer2);
                    break;
                case 5:
                    d6j0Var = new wm70(k800Var, layer2);
                    break;
                case 6:
                    d6j0Var = new ejo0(k800Var, layer2);
                    break;
                default:
                    n100.b("Unknown layer type " + layer2.e);
                    d6j0Var = null;
                    break;
            }
            if (d6j0Var != null) {
                x500Var.put(d6j0Var.p.d, d6j0Var);
                if (aVar2 != null) {
                    aVar2.s = d6j0Var;
                    aVar2 = null;
                } else {
                    this.E.add(0, d6j0Var);
                    int i2 = a.a[layer2.u.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = d6j0Var;
                    }
                }
            }
            size--;
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        super.f(t, a900Var);
        if (t == t800.C) {
            if (a900Var == null) {
                tf6<Float, Float> tf6Var = this.D;
                if (tf6Var != null) {
                    tf6Var.k(null);
                    return;
                }
                return;
            }
            pjr0 pjr0Var = new pjr0(null, a900Var);
            this.D = pjr0Var;
            pjr0Var.a(this);
            h(this.D);
            return;
        }
        lmo lmoVar = this.M;
        if (t == 5 && lmoVar != null) {
            lmoVar.c.k(a900Var);
            return;
        }
        if (t == t800.E && lmoVar != null) {
            lmoVar.b(a900Var);
            return;
        }
        if (t == t800.F && lmoVar != null) {
            lmoVar.e.k(a900Var);
            return;
        }
        if (t == t800.G && lmoVar != null) {
            lmoVar.f.k(a900Var);
        } else {
            if (t != t800.H || lmoVar == null) {
                return;
            }
            lmoVar.g.k(a900Var);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        super.g(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).g(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void k(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        Canvas canvas2;
        AsyncUpdates asyncUpdates = tky.a;
        boolean z = false;
        lmo lmoVar = this.M;
        boolean z2 = (aVar == null && lmoVar == null) ? false : true;
        k800 k800Var = this.o;
        boolean z3 = k800Var.v;
        ArrayList arrayList = this.E;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && k800Var.w)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (lmoVar != null) {
            aVar = lmoVar.a(matrix, i2);
        }
        boolean z4 = this.L;
        Layer layer = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(layer.c)) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, layer.o, layer.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.airbnb.lottie.model.layer.a aVar2 = (com.airbnb.lottie.model.layer.a) it.next();
                RectF rectF2 = this.H;
                aVar2.g(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        OffscreenLayer offscreenLayer = this.I;
        if (z) {
            OffscreenLayer.b bVar = this.J;
            bVar.b = null;
            bVar.a = i;
            if (aVar != null) {
                if (Color.alpha(aVar.d) > 0) {
                    bVar.b = aVar;
                } else {
                    bVar.b = null;
                }
                aVar = null;
            }
            canvas2 = offscreenLayer.e(canvas, rectF, bVar);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).e(canvas2, matrix, i2, aVar);
            }
        }
        if (z) {
            offscreenLayer.c();
        }
        canvas.restore();
        AsyncUpdates asyncUpdates2 = tky.a;
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void p(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((com.airbnb.lottie.model.layer.a) arrayList2.get(i2)).d(udyVar, i, arrayList, udyVar2);
            i2++;
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void q(boolean z) {
        super.q(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((com.airbnb.lottie.model.layer.a) it.next()).q(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void r(float f) {
        AsyncUpdates asyncUpdates = tky.a;
        this.K = f;
        super.r(f);
        tf6<Float, Float> tf6Var = this.D;
        Layer layer = this.p;
        if (tf6Var != null) {
            f = ((this.D.f().floatValue() * layer.b.n) - layer.b.l) / (this.o.b.c() + 0.01f);
        }
        if (this.D == null) {
            f -= layer.n / layer.b.c();
        }
        if (layer.m != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !"__container".equals(layer.c)) {
            f /= layer.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).r(f);
        }
        AsyncUpdates asyncUpdates2 = tky.a;
    }
}
