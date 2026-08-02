package l1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import l1.C7785C;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7784B implements r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Paint f72185a;

    /* renamed from: b, reason: collision with root package name */
    private int f72186b = 3;

    /* renamed from: c, reason: collision with root package name */
    private Shader f72187c;

    /* renamed from: d, reason: collision with root package name */
    private C7809a0 f72188d;

    /* renamed from: e, reason: collision with root package name */
    private t0 f72189e;

    public C7784B(@NotNull Paint paint) {
        this.f72185a = paint;
    }

    @Override // l1.r0
    public final long a() {
        return C7811b0.b(this.f72185a.getColor());
    }

    @Override // l1.r0
    public final void b(long j11) {
        this.f72185a.setColor(C7811b0.i(j11));
    }

    @Override // l1.r0
    public final void c(C7809a0 c7809a0) {
        this.f72188d = c7809a0;
        this.f72185a.setColorFilter(c7809a0 != null ? c7809a0.a() : null);
    }

    @Override // l1.r0
    @NotNull
    public final Paint d() {
        return this.f72185a;
    }

    @Override // l1.r0
    public final Shader e() {
        return this.f72187c;
    }

    @Override // l1.r0
    public final void f(Shader shader) {
        this.f72187c = shader;
        this.f72185a.setShader(shader);
    }

    public final int g() {
        return this.f72186b;
    }

    @Override // l1.r0
    public final float getAlpha() {
        return this.f72185a.getAlpha() / 255.0f;
    }

    public final C7809a0 h() {
        return this.f72188d;
    }

    public final int i() {
        return this.f72185a.isFilterBitmap() ? 1 : 0;
    }

    public final t0 j() {
        return this.f72189e;
    }

    public final int k() {
        Paint.Cap strokeCap = this.f72185a.getStrokeCap();
        int i11 = strokeCap == null ? -1 : C7785C.a.f72190a[strokeCap.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int l() {
        Paint.Join strokeJoin = this.f72185a.getStrokeJoin();
        int i11 = strokeJoin == null ? -1 : C7785C.a.f72191b[strokeJoin.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final float m() {
        return this.f72185a.getStrokeMiter();
    }

    public final float n() {
        return this.f72185a.getStrokeWidth();
    }

    public final void o(int i11) {
        if (this.f72186b == i11) {
            return;
        }
        this.f72186b = i11;
        int i12 = Build.VERSION.SDK_INT;
        Paint paint = this.f72185a;
        if (i12 >= 29) {
            P0.f72241a.a(paint, i11);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C7843t.b(i11)));
        }
    }

    public final void p(int i11) {
        this.f72185a.setFilterBitmap(!(i11 == 0));
    }

    public final void q(t0 t0Var) {
        C7787E c7787e = (C7787E) t0Var;
        this.f72185a.setPathEffect(c7787e != null ? c7787e.a() : null);
        this.f72189e = t0Var;
    }

    public final void r(int i11) {
        this.f72185a.setStrokeCap(i11 == 2 ? Paint.Cap.SQUARE : i11 == 1 ? Paint.Cap.ROUND : i11 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void s(int i11) {
        this.f72185a.setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 2 ? Paint.Join.BEVEL : i11 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    @Override // l1.r0
    public final void setAlpha(float f7) {
        this.f72185a.setAlpha((int) Math.rint(f7 * 255.0f));
    }

    public final void t(float f7) {
        this.f72185a.setStrokeMiter(f7);
    }

    public final void u(float f7) {
        this.f72185a.setStrokeWidth(f7);
    }

    public final void v(int i11) {
        this.f72185a.setStyle(i11 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
