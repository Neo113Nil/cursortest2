package e7;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d7.C4014c;
import d7.InterfaceC4012a;
import d7.InterfaceC4015d;
import g7.InterfaceC4364a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import q7.d;
import z7.AbstractC6940d;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4183a implements InterfaceC4012a, C4014c.b {

    /* renamed from: q, reason: collision with root package name */
    public static final C0664a f45742q = new C0664a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final Class f45743r = C4183a.class;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC6940d f45744a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4184b f45745b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4015d f45746c;

    @Nullable
    private final float[] cornerRadii;

    /* renamed from: d, reason: collision with root package name */
    public final c f45747d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45748e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4364a f45749f;

    /* renamed from: g, reason: collision with root package name */
    public final g7.b f45750g;

    /* renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f45751h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f45752i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f45753j;

    /* renamed from: k, reason: collision with root package name */
    public int f45754k;

    /* renamed from: l, reason: collision with root package name */
    public int f45755l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f45756m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f45757n;

    /* renamed from: o, reason: collision with root package name */
    public int f45758o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC4012a.InterfaceC0654a f45759p;

    /* renamed from: e7.a$a, reason: collision with other inner class name */
    public static final class C0664a {
        public /* synthetic */ C0664a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0664a() {
        }
    }

    public C4183a(AbstractC6940d platformBitmapFactory, InterfaceC4184b bitmapFrameCache, InterfaceC4015d animationInformation, c bitmapFrameRenderer, boolean z10, InterfaceC4364a interfaceC4364a, g7.b bVar, d dVar) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.f45744a = platformBitmapFactory;
        this.f45745b = bitmapFrameCache;
        this.f45746c = animationInformation;
        this.f45747d = bitmapFrameRenderer;
        this.f45748e = z10;
        this.f45749f = interfaceC4364a;
        this.f45750g = bVar;
        this.cornerRadii = null;
        this.f45751h = Bitmap.Config.ARGB_8888;
        this.f45752i = new Paint(6);
        this.f45756m = new Path();
        this.f45757n = new Matrix();
        this.f45758o = -1;
        s();
    }

    @Override // d7.InterfaceC4015d
    public int a() {
        return this.f45746c.a();
    }

    @Override // d7.InterfaceC4015d
    public int b() {
        return this.f45746c.b();
    }

    @Override // d7.InterfaceC4015d
    public int c() {
        return this.f45746c.c();
    }

    @Override // d7.InterfaceC4012a
    public void clear() {
        if (!this.f45748e) {
            this.f45745b.clear();
            return;
        }
        InterfaceC4364a interfaceC4364a = this.f45749f;
        if (interfaceC4364a != null) {
            interfaceC4364a.e();
        }
    }

    @Override // d7.InterfaceC4012a
    public int d() {
        return this.f45755l;
    }

    @Override // d7.InterfaceC4012a
    public void e(Rect rect) {
        this.f45753j = rect;
        this.f45747d.e(rect);
        s();
    }

    @Override // d7.InterfaceC4012a
    public int f() {
        return this.f45754k;
    }

    @Override // d7.InterfaceC4012a
    public void g(ColorFilter colorFilter) {
        this.f45752i.setColorFilter(colorFilter);
    }

    @Override // d7.InterfaceC4015d
    public int h() {
        return this.f45746c.h();
    }

    @Override // d7.InterfaceC4012a
    public void i(InterfaceC4012a.InterfaceC0654a interfaceC0654a) {
        this.f45759p = interfaceC0654a;
    }

    @Override // d7.InterfaceC4012a
    public boolean j(Drawable parent, Canvas canvas, int i10) {
        g7.b bVar;
        InterfaceC4364a interfaceC4364a;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean q10 = q(canvas, i10, 0);
        if (!this.f45748e && (bVar = this.f45750g) != null && (interfaceC4364a = this.f45749f) != null) {
            InterfaceC4364a.C0684a.f(interfaceC4364a, bVar, this.f45745b, this, i10, null, 16, null);
        }
        return q10;
    }

    @Override // d7.C4014c.b
    public void k() {
        if (!this.f45748e) {
            clear();
            return;
        }
        InterfaceC4364a interfaceC4364a = this.f45749f;
        if (interfaceC4364a != null) {
            interfaceC4364a.b();
        }
    }

    @Override // d7.InterfaceC4015d
    public int l(int i10) {
        return this.f45746c.l(i10);
    }

    @Override // d7.InterfaceC4012a
    public void m(int i10) {
        this.f45752i.setAlpha(i10);
    }

    @Override // d7.InterfaceC4015d
    public int n() {
        return this.f45746c.n();
    }

    public final void o(int i10, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.f45753j;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f45752i);
        } else if (t(i10, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.f45756m, this.f45752i);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f45752i);
        }
    }

    public final boolean p(int i10, H6.a aVar, Canvas canvas, int i11) {
        if (aVar == null || !H6.a.isValid(aVar)) {
            return false;
        }
        Object z02 = aVar.z0();
        Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
        o(i10, (Bitmap) z02, canvas);
        if (i11 == 3 || this.f45748e) {
            return true;
        }
        this.f45745b.b(i10, aVar, i11);
        return true;
    }

    public final boolean q(Canvas canvas, int i10, int i11) {
        H6.a e10;
        boolean p10;
        H6.a aVar = null;
        try {
            boolean z10 = false;
            int i12 = 1;
            if (this.f45748e) {
                InterfaceC4364a interfaceC4364a = this.f45749f;
                H6.a d10 = interfaceC4364a != null ? interfaceC4364a.d(i10, canvas.getWidth(), canvas.getHeight()) : null;
                if (d10 != null) {
                    try {
                        if (d10.isValid()) {
                            Object z02 = d10.z0();
                            Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
                            o(i10, (Bitmap) z02, canvas);
                            H6.a.U(d10);
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = d10;
                        H6.a.U(aVar);
                        throw th;
                    }
                }
                InterfaceC4364a interfaceC4364a2 = this.f45749f;
                if (interfaceC4364a2 != null) {
                    interfaceC4364a2.a(canvas.getWidth(), canvas.getHeight(), null);
                }
                H6.a.U(d10);
                return false;
            }
            if (i11 == 0) {
                e10 = this.f45745b.e(i10);
                p10 = p(i10, e10, canvas, 0);
            } else if (i11 == 1) {
                e10 = this.f45745b.d(i10, this.f45754k, this.f45755l);
                if (r(i10, e10) && p(i10, e10, canvas, 1)) {
                    z10 = true;
                }
                p10 = z10;
                i12 = 2;
            } else if (i11 == 2) {
                try {
                    e10 = this.f45744a.b(this.f45754k, this.f45755l, this.f45751h);
                    if (r(i10, e10) && p(i10, e10, canvas, 2)) {
                        z10 = true;
                    }
                    p10 = z10;
                    i12 = 3;
                } catch (RuntimeException e11) {
                    E6.a.H(f45743r, "Failed to create frame bitmap", e11);
                    H6.a.U(null);
                    return false;
                }
            } else {
                if (i11 != 3) {
                    H6.a.U(null);
                    return false;
                }
                e10 = this.f45745b.c(i10);
                p10 = p(i10, e10, canvas, 3);
                i12 = -1;
            }
            H6.a.U(e10);
            return (p10 || i12 == -1) ? p10 : q(canvas, i10, i12);
        } catch (Throwable th3) {
            th = th3;
            H6.a.U(aVar);
            throw th;
        }
    }

    public final boolean r(int i10, H6.a aVar) {
        if (aVar == null || !aVar.isValid()) {
            return false;
        }
        c cVar = this.f45747d;
        Object z02 = aVar.z0();
        Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
        boolean a10 = cVar.a(i10, (Bitmap) z02);
        if (!a10) {
            H6.a.U(aVar);
        }
        return a10;
    }

    public final void s() {
        int f10 = this.f45747d.f();
        this.f45754k = f10;
        if (f10 == -1) {
            Rect rect = this.f45753j;
            this.f45754k = rect != null ? rect.width() : -1;
        }
        int d10 = this.f45747d.d();
        this.f45755l = d10;
        if (d10 == -1) {
            Rect rect2 = this.f45753j;
            this.f45755l = rect2 != null ? rect2.height() : -1;
        }
    }

    public final boolean t(int i10, Bitmap bitmap, float f10, float f11) {
        if (this.cornerRadii == null) {
            return false;
        }
        if (i10 == this.f45758o) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f45757n.setRectToRect(new RectF(0.0f, 0.0f, this.f45754k, this.f45755l), new RectF(0.0f, 0.0f, f10, f11), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.f45757n);
        this.f45752i.setShader(bitmapShader);
        this.f45756m.addRoundRect(new RectF(0.0f, 0.0f, f10, f11), this.cornerRadii, Path.Direction.CW);
        this.f45758o = i10;
        return true;
    }
}
