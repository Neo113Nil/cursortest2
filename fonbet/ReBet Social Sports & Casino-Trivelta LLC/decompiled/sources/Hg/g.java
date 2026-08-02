package Hg;

import Hg.m;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
public final class g implements b {

    /* renamed from: b, reason: collision with root package name */
    public final Hg.a f4924b;

    /* renamed from: c, reason: collision with root package name */
    public d f4925c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f4926d;

    /* renamed from: e, reason: collision with root package name */
    public final View f4927e;

    /* renamed from: f, reason: collision with root package name */
    public int f4928f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f4929g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4932j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f4933k;

    /* renamed from: a, reason: collision with root package name */
    public float f4923a = 16.0f;
    private final int[] rootLocation = new int[2];
    private final int[] blurViewLocation = new int[2];

    /* renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f4930h = new a();

    /* renamed from: i, reason: collision with root package name */
    public boolean f4931i = true;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            g.this.k();
            return true;
        }
    }

    public g(View view, ViewGroup viewGroup, int i10, Hg.a aVar) {
        this.f4929g = viewGroup;
        this.f4927e = view;
        this.f4928f = i10;
        this.f4924b = aVar;
        if (aVar instanceof k) {
            ((k) aVar).f(view.getContext());
        }
        i(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // Hg.e
    public e a(int i10) {
        if (this.f4928f != i10) {
            this.f4928f = i10;
            this.f4927e.invalidate();
        }
        return this;
    }

    @Override // Hg.e
    public e b(boolean z10) {
        this.f4931i = z10;
        c(z10);
        this.f4927e.invalidate();
        return this;
    }

    @Override // Hg.e
    public e c(boolean z10) {
        this.f4929g.getViewTreeObserver().removeOnPreDrawListener(this.f4930h);
        if (z10) {
            this.f4929g.getViewTreeObserver().addOnPreDrawListener(this.f4930h);
        }
        return this;
    }

    @Override // Hg.e
    public e d(Drawable drawable) {
        this.f4933k = drawable;
        return this;
    }

    @Override // Hg.b
    public void destroy() {
        c(false);
        this.f4924b.destroy();
        this.f4932j = false;
    }

    @Override // Hg.b
    public void e() {
        i(this.f4927e.getMeasuredWidth(), this.f4927e.getMeasuredHeight());
    }

    @Override // Hg.b
    public boolean f(Canvas canvas) {
        if (this.f4931i && this.f4932j) {
            if (canvas instanceof d) {
                return false;
            }
            float width = this.f4927e.getWidth() / this.f4926d.getWidth();
            canvas.save();
            canvas.scale(width, this.f4927e.getHeight() / this.f4926d.getHeight());
            this.f4924b.c(canvas, this.f4926d);
            canvas.restore();
            int i10 = this.f4928f;
            if (i10 != 0) {
                canvas.drawColor(i10);
            }
        }
        return true;
    }

    @Override // Hg.e
    public e g(float f10) {
        this.f4923a = f10;
        return this;
    }

    public final void h() {
        this.f4926d = this.f4924b.e(this.f4926d, this.f4923a);
        if (this.f4924b.b()) {
            return;
        }
        this.f4925c.setBitmap(this.f4926d);
    }

    public void i(int i10, int i11) {
        c(true);
        m mVar = new m(this.f4924b.d());
        if (mVar.b(i10, i11)) {
            this.f4927e.setWillNotDraw(true);
            return;
        }
        this.f4927e.setWillNotDraw(false);
        m.a d10 = mVar.d(i10, i11);
        this.f4926d = Bitmap.createBitmap(d10.f4949a, d10.f4950b, this.f4924b.a());
        this.f4925c = new d(this.f4926d);
        this.f4932j = true;
        k();
    }

    public final void j() {
        this.f4929g.getLocationOnScreen(this.rootLocation);
        this.f4927e.getLocationOnScreen(this.blurViewLocation);
        int[] iArr = this.blurViewLocation;
        int i10 = iArr[0];
        int[] iArr2 = this.rootLocation;
        int i11 = i10 - iArr2[0];
        int i12 = iArr[1] - iArr2[1];
        float height = this.f4927e.getHeight() / this.f4926d.getHeight();
        float width = this.f4927e.getWidth() / this.f4926d.getWidth();
        this.f4925c.translate((-i11) / width, (-i12) / height);
        this.f4925c.scale(1.0f / width, 1.0f / height);
    }

    public void k() {
        if (this.f4931i && this.f4932j) {
            Drawable drawable = this.f4933k;
            if (drawable == null) {
                this.f4926d.eraseColor(0);
            } else {
                drawable.draw(this.f4925c);
            }
            this.f4925c.save();
            j();
            this.f4929g.draw(this.f4925c);
            this.f4925c.restore();
            h();
        }
    }
}
