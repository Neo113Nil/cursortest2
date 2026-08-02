package com.airbnb.lottie.model.layer;

import B3.a;
import B3.s;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.parser.C2956j;
import com.airbnb.lottie.utils.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, a.b, E3.f {

    /* renamed from: A, reason: collision with root package name */
    public Paint f28854A;

    /* renamed from: B, reason: collision with root package name */
    public float f28855B;

    /* renamed from: C, reason: collision with root package name */
    public BlurMaskFilter f28856C;

    /* renamed from: D, reason: collision with root package name */
    public A3.a f28857D;

    /* renamed from: a, reason: collision with root package name */
    public final Path f28858a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f28859b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f28860c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final Paint f28861d = new A3.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final Paint f28862e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f28863f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f28864g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f28865h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f28866i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f28867j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f28868k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f28869l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f28870m;

    /* renamed from: n, reason: collision with root package name */
    public final String f28871n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f28872o;

    /* renamed from: p, reason: collision with root package name */
    public final K f28873p;

    /* renamed from: q, reason: collision with root package name */
    public final e f28874q;

    /* renamed from: r, reason: collision with root package name */
    public B3.h f28875r;

    /* renamed from: s, reason: collision with root package name */
    public B3.d f28876s;

    /* renamed from: t, reason: collision with root package name */
    public b f28877t;

    /* renamed from: u, reason: collision with root package name */
    public b f28878u;

    /* renamed from: v, reason: collision with root package name */
    public List f28879v;

    /* renamed from: w, reason: collision with root package name */
    public final List f28880w;

    /* renamed from: x, reason: collision with root package name */
    public final s f28881x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28882y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28883z;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode;
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType;

        static {
            int[] iArr = new int[i.a.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(K k10, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f28862e = new A3.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f28863f = new A3.a(1, mode2);
        A3.a aVar = new A3.a(1);
        this.f28864g = aVar;
        this.f28865h = new A3.a(PorterDuff.Mode.CLEAR);
        this.f28866i = new RectF();
        this.f28867j = new RectF();
        this.f28868k = new RectF();
        this.f28869l = new RectF();
        this.f28870m = new RectF();
        this.f28872o = new Matrix();
        this.f28880w = new ArrayList();
        this.f28882y = true;
        this.f28855B = 0.0f;
        this.f28873p = k10;
        this.f28874q = eVar;
        this.f28871n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        s b10 = eVar.x().b();
        this.f28881x = b10;
        b10.e(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            B3.h hVar = new B3.h(eVar.h());
            this.f28875r = hVar;
            Iterator it = hVar.a().iterator();
            while (it.hasNext()) {
                ((B3.a) it.next()).a(this);
            }
            for (B3.a aVar2 : this.f28875r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        P();
    }

    public static b w(c cVar, e eVar, K k10, C2940j c2940j) {
        switch (a.$SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[eVar.g().ordinal()]) {
            case 1:
                return new g(k10, eVar, cVar, c2940j);
            case 2:
                return new c(k10, eVar, c2940j.o(eVar.n()), c2940j);
            case 3:
                return new h(k10, eVar);
            case 4:
                return new d(k10, eVar);
            case 5:
                return new f(k10, eVar);
            case 6:
                return new i(k10, eVar);
            default:
                com.airbnb.lottie.utils.g.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    public C2956j A() {
        return this.f28874q.d();
    }

    public e B() {
        return this.f28874q;
    }

    public boolean C() {
        B3.h hVar = this.f28875r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public boolean D() {
        return this.f28877t != null;
    }

    public final void E(RectF rectF, Matrix matrix) {
        this.f28868k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (C()) {
            int size = this.f28875r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.airbnb.lottie.model.content.i iVar = (com.airbnb.lottie.model.content.i) this.f28875r.b().get(i10);
                Path path = (Path) ((B3.a) this.f28875r.a().get(i10)).h();
                if (path != null) {
                    this.f28858a.set(path);
                    this.f28858a.transform(matrix);
                    int i11 = a.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f28858a.computeBounds(this.f28870m, false);
                    if (i10 == 0) {
                        this.f28868k.set(this.f28870m);
                    } else {
                        RectF rectF2 = this.f28868k;
                        rectF2.set(Math.min(rectF2.left, this.f28870m.left), Math.min(this.f28868k.top, this.f28870m.top), Math.max(this.f28868k.right, this.f28870m.right), Math.max(this.f28868k.bottom, this.f28870m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f28868k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void F(RectF rectF, Matrix matrix) {
        if (D() && this.f28874q.i() != e.b.INVERT) {
            this.f28869l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f28877t.f(this.f28869l, matrix, true);
            if (rectF.intersect(this.f28869l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void G() {
        this.f28873p.invalidateSelf();
    }

    public final void H(float f10) {
        this.f28873p.J().n().a(this.f28874q.j(), f10);
    }

    public void I(B3.a aVar) {
        this.f28880w.remove(aVar);
    }

    public void K(b bVar) {
        this.f28877t = bVar;
    }

    public void L(boolean z10) {
        if (z10 && this.f28854A == null) {
            this.f28854A = new A3.a();
        }
        this.f28883z = z10;
    }

    public void M(b bVar) {
        this.f28878u = bVar;
    }

    public void N(float f10) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("BaseLayer#setProgress");
            AbstractC2935e.b("BaseLayer#setProgress.transform");
        }
        this.f28881x.m(f10);
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("BaseLayer#setProgress.transform");
        }
        if (this.f28875r != null) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f28875r.a().size(); i10++) {
                ((B3.a) this.f28875r.a().get(i10)).n(f10);
            }
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f28876s != null) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.b("BaseLayer#setProgress.inout");
            }
            this.f28876s.n(f10);
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f28877t != null) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.b("BaseLayer#setProgress.matte");
            }
            this.f28877t.N(f10);
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("BaseLayer#setProgress.matte");
            }
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("BaseLayer#setProgress.animations." + this.f28880w.size());
        }
        for (int i11 = 0; i11 < this.f28880w.size(); i11++) {
            ((B3.a) this.f28880w.get(i11)).n(f10);
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("BaseLayer#setProgress.animations." + this.f28880w.size());
            AbstractC2935e.c("BaseLayer#setProgress");
        }
    }

    public final void O(boolean z10) {
        if (z10 != this.f28882y) {
            this.f28882y = z10;
            G();
        }
    }

    public final void P() {
        if (this.f28874q.f().isEmpty()) {
            O(true);
            return;
        }
        B3.d dVar = new B3.d(this.f28874q.f());
        this.f28876s = dVar;
        dVar.m();
        this.f28876s.a(new a.b() { // from class: com.airbnb.lottie.model.layer.a
            @Override // B3.a.b
            public final void a() {
                b.this.O(r2.f28876s.r() == 1.0f);
            }
        });
        O(((Float) this.f28876s.h()).floatValue() == 1.0f);
        j(this.f28876s);
    }

    @Override // B3.a.b
    public void a() {
        G();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        Paint paint;
        Integer num;
        AbstractC2935e.b(this.f28871n);
        if (!this.f28882y || this.f28874q.y()) {
            AbstractC2935e.c(this.f28871n);
            return;
        }
        t();
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("Layer#parentMatrix");
        }
        this.f28859b.reset();
        this.f28859b.set(matrix);
        for (int size = this.f28879v.size() - 1; size >= 0; size--) {
            this.f28859b.preConcat(((b) this.f28879v.get(size)).f28881x.i());
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("Layer#parentMatrix");
        }
        B3.a k10 = this.f28881x.k();
        int intValue = (int) ((((i10 / 255.0f) * ((k10 == null || (num = (Integer) k10.h()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!D() && !C() && x() == com.airbnb.lottie.model.content.h.NORMAL) {
            this.f28859b.preConcat(this.f28881x.i());
            if (AbstractC2935e.h()) {
                AbstractC2935e.b("Layer#drawLayer");
            }
            v(canvas, this.f28859b, intValue, dVar);
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("Layer#drawLayer");
            }
            H(AbstractC2935e.c(this.f28871n));
            return;
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("Layer#computeBounds");
        }
        f(this.f28866i, this.f28859b, false);
        F(this.f28866i, matrix);
        this.f28859b.preConcat(this.f28881x.i());
        E(this.f28866i, this.f28859b);
        this.f28867j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f28860c);
        if (!this.f28860c.isIdentity()) {
            Matrix matrix2 = this.f28860c;
            matrix2.invert(matrix2);
            this.f28860c.mapRect(this.f28867j);
        }
        if (!this.f28866i.intersect(this.f28867j)) {
            this.f28866i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("Layer#computeBounds");
        }
        if (this.f28866i.width() >= 1.0f && this.f28866i.height() >= 1.0f) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.b("Layer#saveLayer");
            }
            this.f28861d.setAlpha(255);
            androidx.core.graphics.f.b(this.f28861d, x().b());
            z.n(canvas, this.f28866i, this.f28861d);
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("Layer#saveLayer");
            }
            if (x() != com.airbnb.lottie.model.content.h.MULTIPLY) {
                u(canvas);
            } else if (Build.VERSION.SDK_INT < 29) {
                if (this.f28857D == null) {
                    A3.a aVar = new A3.a();
                    this.f28857D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f28866i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f28857D);
            }
            if (AbstractC2935e.h()) {
                AbstractC2935e.b("Layer#drawLayer");
            }
            v(canvas, this.f28859b, intValue, dVar);
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("Layer#drawLayer");
            }
            if (C()) {
                q(canvas, this.f28859b);
            }
            if (D()) {
                if (AbstractC2935e.h()) {
                    AbstractC2935e.b("Layer#drawMatte");
                    AbstractC2935e.b("Layer#saveLayer");
                }
                z.o(canvas, this.f28866i, this.f28864g, 19);
                if (AbstractC2935e.h()) {
                    AbstractC2935e.c("Layer#saveLayer");
                }
                u(canvas);
                this.f28877t.d(canvas, matrix, i10, null);
                if (AbstractC2935e.h()) {
                    AbstractC2935e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (AbstractC2935e.h()) {
                    AbstractC2935e.c("Layer#restoreLayer");
                    AbstractC2935e.c("Layer#drawMatte");
                }
            }
            if (AbstractC2935e.h()) {
                AbstractC2935e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("Layer#restoreLayer");
            }
        }
        if (this.f28883z && (paint = this.f28854A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f28854A.setColor(-251901);
            this.f28854A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f28866i, this.f28854A);
            this.f28854A.setStyle(Paint.Style.FILL);
            this.f28854A.setColor(1357638635);
            canvas.drawRect(this.f28866i, this.f28854A);
        }
        H(AbstractC2935e.c(this.f28871n));
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        this.f28881x.f(obj, cVar);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f28866i.set(0.0f, 0.0f, 0.0f, 0.0f);
        t();
        this.f28872o.set(matrix);
        if (z10) {
            List list = this.f28879v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f28872o.preConcat(((b) this.f28879v.get(size)).f28881x.i());
                }
            } else {
                b bVar = this.f28878u;
                if (bVar != null) {
                    this.f28872o.preConcat(bVar.f28881x.i());
                }
            }
        }
        this.f28872o.preConcat(this.f28881x.i());
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28874q.j();
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        b bVar = this.f28877t;
        if (bVar != null) {
            E3.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f28877t.getName(), i10)) {
                list.add(a10.i(this.f28877t));
            }
            if (eVar.g(this.f28877t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f28877t.J(eVar, eVar.e(this.f28877t.getName(), i10) + i10, list, a10);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                J(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    public void j(B3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f28880w.add(aVar);
    }

    public final void k(Canvas canvas, Matrix matrix, B3.a aVar, B3.a aVar2) {
        this.f28858a.set((Path) aVar.h());
        this.f28858a.transform(matrix);
        this.f28861d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f28858a, this.f28861d);
    }

    public final void m(Canvas canvas, Matrix matrix, B3.a aVar, B3.a aVar2) {
        z.n(canvas, this.f28866i, this.f28862e);
        this.f28858a.set((Path) aVar.h());
        this.f28858a.transform(matrix);
        this.f28861d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f28858a, this.f28861d);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, B3.a aVar, B3.a aVar2) {
        z.n(canvas, this.f28866i, this.f28861d);
        canvas.drawRect(this.f28866i, this.f28861d);
        this.f28858a.set((Path) aVar.h());
        this.f28858a.transform(matrix);
        this.f28861d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f28858a, this.f28863f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix, B3.a aVar, B3.a aVar2) {
        z.n(canvas, this.f28866i, this.f28862e);
        canvas.drawRect(this.f28866i, this.f28861d);
        this.f28863f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f28858a.set((Path) aVar.h());
        this.f28858a.transform(matrix);
        canvas.drawPath(this.f28858a, this.f28863f);
        canvas.restore();
    }

    public final void p(Canvas canvas, Matrix matrix, B3.a aVar, B3.a aVar2) {
        z.n(canvas, this.f28866i, this.f28863f);
        canvas.drawRect(this.f28866i, this.f28861d);
        this.f28863f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f28858a.set((Path) aVar.h());
        this.f28858a.transform(matrix);
        canvas.drawPath(this.f28858a, this.f28863f);
        canvas.restore();
    }

    public final void q(Canvas canvas, Matrix matrix) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("Layer#saveLayer");
        }
        z.o(canvas, this.f28866i, this.f28862e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            u(canvas);
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f28875r.b().size(); i10++) {
            com.airbnb.lottie.model.content.i iVar = (com.airbnb.lottie.model.content.i) this.f28875r.b().get(i10);
            B3.a aVar = (B3.a) this.f28875r.a().get(i10);
            B3.a aVar2 = (B3.a) this.f28875r.c().get(i10);
            int i11 = a.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f28861d.setColor(-16777216);
                        this.f28861d.setAlpha(255);
                        canvas.drawRect(this.f28866i, this.f28861d);
                    }
                    if (iVar.d()) {
                        p(canvas, matrix, aVar, aVar2);
                    } else {
                        r(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            n(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    o(canvas, matrix, aVar, aVar2);
                } else {
                    m(canvas, matrix, aVar, aVar2);
                }
            } else if (s()) {
                this.f28861d.setAlpha(255);
                canvas.drawRect(this.f28866i, this.f28861d);
            }
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("Layer#restoreLayer");
        }
    }

    public final void r(Canvas canvas, Matrix matrix, B3.a aVar) {
        this.f28858a.set((Path) aVar.h());
        this.f28858a.transform(matrix);
        canvas.drawPath(this.f28858a, this.f28863f);
    }

    public final boolean s() {
        if (this.f28875r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f28875r.b().size(); i10++) {
            if (((com.airbnb.lottie.model.content.i) this.f28875r.b().get(i10)).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void t() {
        if (this.f28879v != null) {
            return;
        }
        if (this.f28878u == null) {
            this.f28879v = Collections.EMPTY_LIST;
            return;
        }
        this.f28879v = new ArrayList();
        for (b bVar = this.f28878u; bVar != null; bVar = bVar.f28878u) {
            this.f28879v.add(bVar);
        }
    }

    public final void u(Canvas canvas) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("Layer#clearLayer");
        }
        RectF rectF = this.f28866i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f28865h);
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("Layer#clearLayer");
        }
    }

    public abstract void v(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar);

    public com.airbnb.lottie.model.content.h x() {
        return this.f28874q.a();
    }

    public com.airbnb.lottie.model.content.a y() {
        return this.f28874q.b();
    }

    public BlurMaskFilter z(float f10) {
        if (this.f28855B == f10) {
            return this.f28856C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f28856C = blurMaskFilter;
        this.f28855B = f10;
        return blurMaskFilter;
    }

    public void J(E3.e eVar, int i10, List list, E3.e eVar2) {
    }
}
