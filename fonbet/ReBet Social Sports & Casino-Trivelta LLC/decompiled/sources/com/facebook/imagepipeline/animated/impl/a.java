package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import v7.C6647b;
import v7.C6650e;
import v7.InterfaceC6646a;
import v7.InterfaceC6648c;
import v7.InterfaceC6649d;
import x7.C6802a;

/* loaded from: classes2.dex */
public class a implements InterfaceC6646a {

    /* renamed from: a, reason: collision with root package name */
    public final C6802a f30556a;

    /* renamed from: b, reason: collision with root package name */
    public final C6650e f30557b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6648c f30558c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f30559d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30560e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f30561f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final Rect f30562g = new Rect();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30563h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f30564i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f30565j;
    private final int[] mFrameDurationsMs;
    private final C6647b[] mFrameInfos;
    private final int[] mFrameTimestampsMs;

    public a(C6802a c6802a, C6650e c6650e, Rect rect, boolean z10) {
        this.f30556a = c6802a;
        this.f30557b = c6650e;
        InterfaceC6648c d10 = c6650e.d();
        this.f30558c = d10;
        int[] i10 = d10.i();
        this.mFrameDurationsMs = i10;
        c6802a.a(i10);
        this.f30560e = c6802a.c(i10);
        this.mFrameTimestampsMs = c6802a.b(i10);
        this.f30559d = m(d10, rect);
        this.f30563h = z10;
        this.mFrameInfos = new C6647b[d10.a()];
        for (int i11 = 0; i11 < this.f30558c.a(); i11++) {
            this.mFrameInfos[i11] = this.f30558c.c(i11);
        }
        Paint paint = new Paint();
        this.f30564i = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect m(InterfaceC6648c interfaceC6648c, Rect rect) {
        return rect == null ? new Rect(0, 0, interfaceC6648c.getWidth(), interfaceC6648c.getHeight()) : new Rect(0, 0, Math.min(rect.width(), interfaceC6648c.getWidth()), Math.min(rect.height(), interfaceC6648c.getHeight()));
    }

    @Override // v7.InterfaceC6646a
    public int a() {
        return this.f30558c.a();
    }

    @Override // v7.InterfaceC6646a
    public int b() {
        return this.f30558c.b();
    }

    @Override // v7.InterfaceC6646a
    public C6647b c(int i10) {
        return this.mFrameInfos[i10];
    }

    @Override // v7.InterfaceC6646a
    public int d() {
        return this.f30560e;
    }

    @Override // v7.InterfaceC6646a
    public void e(int i10, Canvas canvas) {
        InterfaceC6649d h10 = this.f30558c.h(i10);
        try {
            if (h10.getWidth() > 0 && h10.getHeight() > 0) {
                if (this.f30558c.d()) {
                    q(canvas, h10);
                } else {
                    p(canvas, h10);
                }
                h10.dispose();
            }
        } finally {
            h10.dispose();
        }
    }

    @Override // v7.InterfaceC6646a
    public InterfaceC6646a f(Rect rect) {
        return m(this.f30558c, rect).equals(this.f30559d) ? this : new a(this.f30556a, this.f30557b, rect, this.f30563h);
    }

    @Override // v7.InterfaceC6646a
    public int g(int i10) {
        return this.mFrameDurationsMs[i10];
    }

    @Override // v7.InterfaceC6646a
    public int getHeight() {
        return this.f30558c.getHeight();
    }

    @Override // v7.InterfaceC6646a
    public int getWidth() {
        return this.f30558c.getWidth();
    }

    @Override // v7.InterfaceC6646a
    public int h() {
        return this.f30559d.height();
    }

    @Override // v7.InterfaceC6646a
    public void i(int i10, Canvas canvas) {
        InterfaceC6649d h10 = this.f30558c.h(i10);
        C6647b c10 = this.f30558c.c(i10);
        C6647b c11 = i10 == 0 ? null : this.f30558c.c(i10 - 1);
        try {
            if (h10.getWidth() > 0 && h10.getHeight() > 0) {
                if (this.f30558c.d()) {
                    s(canvas, h10, c10, c11);
                } else {
                    r(canvas, h10, c10, c11);
                }
                h10.dispose();
            }
        } finally {
            h10.dispose();
        }
    }

    @Override // v7.InterfaceC6646a
    public int j() {
        return this.f30559d.width();
    }

    @Override // v7.InterfaceC6646a
    public C6650e k() {
        return this.f30557b;
    }

    public final synchronized void l() {
        Bitmap bitmap = this.f30565j;
        if (bitmap != null) {
            bitmap.recycle();
            this.f30565j = null;
        }
    }

    public final void n(Canvas canvas, float f10, float f11, C6647b c6647b) {
        if (c6647b.f67049g == C6647b.EnumC0938b.DISPOSE_TO_BACKGROUND) {
            int ceil = (int) Math.ceil(c6647b.f67046d * f10);
            int ceil2 = (int) Math.ceil(c6647b.f67047e * f11);
            int ceil3 = (int) Math.ceil(c6647b.f67044b * f10);
            int ceil4 = (int) Math.ceil(c6647b.f67045c * f11);
            canvas.drawRect(new Rect(ceil3, ceil4, ceil + ceil3, ceil2 + ceil4), this.f30564i);
        }
    }

    public final synchronized Bitmap o(int i10, int i11) {
        try {
            Bitmap bitmap = this.f30565j;
            if (bitmap != null) {
                if (bitmap.getWidth() >= i10) {
                    if (this.f30565j.getHeight() < i11) {
                    }
                }
                l();
            }
            if (this.f30565j == null) {
                this.f30565j = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            }
            this.f30565j.eraseColor(0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f30565j;
    }

    public final void p(Canvas canvas, InterfaceC6649d interfaceC6649d) {
        int width;
        int height;
        int b10;
        int c10;
        if (this.f30563h) {
            float max = Math.max(interfaceC6649d.getWidth() / Math.min(interfaceC6649d.getWidth(), canvas.getWidth()), interfaceC6649d.getHeight() / Math.min(interfaceC6649d.getHeight(), canvas.getHeight()));
            width = (int) (interfaceC6649d.getWidth() / max);
            height = (int) (interfaceC6649d.getHeight() / max);
            b10 = (int) (interfaceC6649d.b() / max);
            c10 = (int) (interfaceC6649d.c() / max);
        } else {
            width = interfaceC6649d.getWidth();
            height = interfaceC6649d.getHeight();
            b10 = interfaceC6649d.b();
            c10 = interfaceC6649d.c();
        }
        synchronized (this) {
            Bitmap o10 = o(width, height);
            this.f30565j = o10;
            interfaceC6649d.a(width, height, o10);
            canvas.save();
            canvas.translate(b10, c10);
            canvas.drawBitmap(this.f30565j, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    public final void q(Canvas canvas, InterfaceC6649d interfaceC6649d) {
        double width = this.f30559d.width() / this.f30558c.getWidth();
        double height = this.f30559d.height() / this.f30558c.getHeight();
        int round = (int) Math.round(interfaceC6649d.getWidth() * width);
        int round2 = (int) Math.round(interfaceC6649d.getHeight() * height);
        int b10 = (int) (interfaceC6649d.b() * width);
        int c10 = (int) (interfaceC6649d.c() * height);
        synchronized (this) {
            try {
                int width2 = this.f30559d.width();
                int height2 = this.f30559d.height();
                o(width2, height2);
                Bitmap bitmap = this.f30565j;
                if (bitmap != null) {
                    interfaceC6649d.a(round, round2, bitmap);
                }
                this.f30561f.set(0, 0, width2, height2);
                this.f30562g.set(b10, c10, width2 + b10, height2 + c10);
                Bitmap bitmap2 = this.f30565j;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f30561f, this.f30562g, (Paint) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(Canvas canvas, InterfaceC6649d interfaceC6649d, C6647b c6647b, C6647b c6647b2) {
        Rect rect = this.f30559d;
        if (rect == null || rect.width() <= 0 || this.f30559d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f30559d.width();
        if (c6647b2 != null) {
            n(canvas, width, width, c6647b2);
        }
        int width2 = interfaceC6649d.getWidth();
        int height = interfaceC6649d.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i10 = (int) (width2 * width);
        int i11 = (int) (height * width);
        int b10 = (int) (interfaceC6649d.b() * width);
        int c10 = (int) (interfaceC6649d.c() * width);
        Rect rect3 = new Rect(b10, c10, i10 + b10, i11 + c10);
        if (c6647b.f67048f == C6647b.a.NO_BLEND) {
            canvas.drawRect(rect3, this.f30564i);
        }
        synchronized (this) {
            Bitmap o10 = o(width2, height);
            interfaceC6649d.a(width2, height, o10);
            canvas.drawBitmap(o10, rect2, rect3, (Paint) null);
        }
    }

    public final void s(Canvas canvas, InterfaceC6649d interfaceC6649d, C6647b c6647b, C6647b c6647b2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int width = this.f30558c.getWidth();
        int height = this.f30558c.getHeight();
        float f14 = width;
        float f15 = height;
        int width2 = interfaceC6649d.getWidth();
        int height2 = interfaceC6649d.getHeight();
        int b10 = interfaceC6649d.b();
        int c10 = interfaceC6649d.c();
        if (f14 > canvas.getWidth() || f15 > canvas.getHeight()) {
            int min = Math.min(canvas.getWidth(), width);
            int min2 = Math.min(canvas.getHeight(), height);
            float f16 = f14 / f15;
            if (min > min2) {
                f11 = min;
                f10 = f11 / f16;
            } else {
                f10 = min2;
                f11 = f10 * f16;
            }
            f12 = f11 / f14;
            f13 = f10 / f15;
            width2 = (int) Math.ceil(interfaceC6649d.getWidth() * f12);
            height2 = (int) Math.ceil(interfaceC6649d.getHeight() * f13);
            b10 = (int) Math.ceil(interfaceC6649d.b() * f12);
            c10 = (int) Math.ceil(interfaceC6649d.c() * f13);
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(b10, c10, b10 + width2, c10 + height2);
        if (c6647b2 != null) {
            n(canvas, f12, f13, c6647b2);
        }
        if (c6647b.f67048f == C6647b.a.NO_BLEND) {
            canvas.drawRect(rect2, this.f30564i);
        }
        synchronized (this) {
            Bitmap o10 = o(width2, height2);
            interfaceC6649d.a(width2, height2, o10);
            canvas.drawBitmap(o10, rect, rect2, (Paint) null);
        }
    }
}
