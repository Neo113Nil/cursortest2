package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class itk extends View {
    public static final yy2 k = new yy2(5);
    public final ba5 a;
    public final xj2 b;
    public final wj2 c;
    public boolean d;
    public Outline e;
    public boolean f;
    public kx4 g;
    public ema h;
    public Function1 i;
    public n29 j;

    public itk(ba5 ba5Var, xj2 xj2Var, wj2 wj2Var) {
        super(ba5Var.getContext());
        this.a = ba5Var;
        this.b = xj2Var;
        this.c = wj2Var;
        setOutlineProvider(k);
        this.f = true;
        this.g = xw3.d;
        this.h = ema.a;
        p29.a.getClass();
        this.i = s84.w;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xj2 xj2Var = this.b;
        wx wxVar = xj2Var.a;
        Canvas canvas2 = wxVar.a;
        wxVar.a = canvas;
        kx4 kx4Var = this.g;
        ema emaVar = this.h;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        n29 n29Var = this.j;
        Function1 function1 = this.i;
        wj2 wj2Var = this.c;
        kx4 u = wj2Var.b.u();
        sx2 sx2Var = wj2Var.b;
        ema z = sx2Var.z();
        uj2 t = sx2Var.t();
        long D = sx2Var.D();
        n29 n29Var2 = (n29) sx2Var.b;
        sx2Var.L(kx4Var);
        sx2Var.M(emaVar);
        sx2Var.K(wxVar);
        sx2Var.N(floatToRawIntBits);
        sx2Var.b = n29Var;
        wxVar.o();
        try {
            function1.invoke(wj2Var);
            wxVar.h();
            sx2Var.L(u);
            sx2Var.M(z);
            sx2Var.K(t);
            sx2Var.N(D);
            sx2Var.b = n29Var2;
            xj2Var.a.a = canvas2;
            this.d = false;
        } catch (Throwable th) {
            wxVar.h();
            sx2Var.L(u);
            sx2Var.M(z);
            sx2Var.K(t);
            sx2Var.N(D);
            sx2Var.b = n29Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f;
    }

    @NotNull
    public final xj2 getCanvasHolder() {
        return this.b;
    }

    @NotNull
    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
