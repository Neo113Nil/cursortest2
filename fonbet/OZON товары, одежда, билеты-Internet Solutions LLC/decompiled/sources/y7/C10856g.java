package y7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.BitSet;
import java.util.Objects;
import q7.C8995a;
import x7.C10673a;
import y7.k;
import y7.l;
import y7.n;

/* renamed from: y7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10856g extends Drawable implements o {

    /* renamed from: w, reason: collision with root package name */
    private static final Paint f106095w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f106096x = 0;

    /* renamed from: a, reason: collision with root package name */
    private b f106097a;

    /* renamed from: b, reason: collision with root package name */
    private final n.f[] f106098b;

    /* renamed from: c, reason: collision with root package name */
    private final n.f[] f106099c;

    /* renamed from: d, reason: collision with root package name */
    private final BitSet f106100d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f106101e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f106102f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f106103g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f106104h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f106105i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f106106j;

    /* renamed from: k, reason: collision with root package name */
    private final Region f106107k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f106108l;

    /* renamed from: m, reason: collision with root package name */
    private k f106109m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f106110n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f106111o;

    /* renamed from: p, reason: collision with root package name */
    private final C10673a f106112p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    private final l.b f106113q;

    /* renamed from: r, reason: collision with root package name */
    private final l f106114r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f106115s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f106116t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    private final RectF f106117u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f106118v;

    /* renamed from: y7.g$a */
    final class a implements l.b {
        a() {
        }
    }

    /* renamed from: y7.g$b */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public k f106120a;

        /* renamed from: b, reason: collision with root package name */
        public C8995a f106121b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f106122c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f106123d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f106124e;

        /* renamed from: f, reason: collision with root package name */
        public PorterDuff.Mode f106125f;

        /* renamed from: g, reason: collision with root package name */
        public Rect f106126g;

        /* renamed from: h, reason: collision with root package name */
        public float f106127h;

        /* renamed from: i, reason: collision with root package name */
        public float f106128i;

        /* renamed from: j, reason: collision with root package name */
        public float f106129j;

        /* renamed from: k, reason: collision with root package name */
        public int f106130k;

        /* renamed from: l, reason: collision with root package name */
        public float f106131l;

        /* renamed from: m, reason: collision with root package name */
        public float f106132m;

        /* renamed from: n, reason: collision with root package name */
        public int f106133n;

        /* renamed from: o, reason: collision with root package name */
        public int f106134o;

        /* renamed from: p, reason: collision with root package name */
        public int f106135p;

        /* renamed from: q, reason: collision with root package name */
        public Paint.Style f106136q;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            C10856g c10856g = new C10856g(this, 0);
            c10856g.f106101e = true;
            return c10856g;
        }
    }

    static {
        Paint paint = new Paint(1);
        f106095w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ C10856g(b bVar, int i11) {
        this(bVar);
    }

    private boolean L(int[] iArr) {
        boolean z11;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f106097a.f106122c == null || color2 == (colorForState2 = this.f106097a.f106122c.getColorForState(iArr, (color2 = (paint2 = this.f106110n).getColor())))) {
            z11 = false;
        } else {
            paint2.setColor(colorForState2);
            z11 = true;
        }
        if (this.f106097a.f106123d == null || color == (colorForState = this.f106097a.f106123d.getColorForState(iArr, (color = (paint = this.f106111o).getColor())))) {
            return z11;
        }
        paint.setColor(colorForState);
        return true;
    }

    private boolean M() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f106115s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f106116t;
        b bVar = this.f106097a;
        ColorStateList colorStateList = bVar.f106124e;
        PorterDuff.Mode mode = bVar.f106125f;
        Paint paint = this.f106110n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int h11 = h(color);
            porterDuffColorFilter = h11 != color ? new PorterDuffColorFilter(h11, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(h(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f106115s = porterDuffColorFilter;
        this.f106097a.getClass();
        this.f106116t = null;
        this.f106097a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f106115s) && Objects.equals(porterDuffColorFilter3, this.f106116t)) ? false : true;
    }

    private void N() {
        b bVar = this.f106097a;
        float f7 = bVar.f106132m + 0.0f;
        bVar.f106133n = (int) Math.ceil(0.75f * f7);
        this.f106097a.f106134o = (int) Math.ceil(f7 * 0.25f);
        M();
        super.invalidateSelf();
    }

    private void f(@NonNull Path path, @NonNull RectF rectF) {
        g(path, rectF);
        if (this.f106097a.f106127h != 1.0f) {
            Matrix matrix = this.f106102f;
            matrix.reset();
            float f7 = this.f106097a.f106127h;
            matrix.setScale(f7, f7, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f106117u, true);
    }

    private void i(@NonNull Canvas canvas) {
        if (this.f106100d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i11 = this.f106097a.f106134o;
        Path path = this.f106103g;
        C10673a c10673a = this.f106112p;
        if (i11 != 0) {
            canvas.drawPath(path, c10673a.c());
        }
        for (int i12 = 0; i12 < 4; i12++) {
            n.f fVar = this.f106098b[i12];
            int i13 = this.f106097a.f106133n;
            Matrix matrix = n.f.f106199a;
            fVar.a(matrix, c10673a, i13, canvas);
            this.f106099c[i12].a(matrix, c10673a, this.f106097a.f106133n, canvas);
        }
        if (this.f106118v) {
            b bVar = this.f106097a;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f106135p)) * bVar.f106134o);
            b bVar2 = this.f106097a;
            int cos = (int) (Math.cos(Math.toRadians(bVar2.f106135p)) * bVar2.f106134o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f106095w);
            canvas.translate(sin, cos);
        }
    }

    private void k(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.n(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a11 = kVar.f106144f.a(rectF) * this.f106097a.f106128i;
            canvas.drawRoundRect(rectF, a11, a11, paint);
        }
    }

    private boolean u() {
        Paint.Style style = this.f106097a.f106136q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f106111o.getStrokeWidth() > 0.0f;
    }

    public final void A(float f7) {
        b bVar = this.f106097a;
        if (bVar.f106132m != f7) {
            bVar.f106132m = f7;
            N();
        }
    }

    public final void B(ColorStateList colorStateList) {
        b bVar = this.f106097a;
        if (bVar.f106122c != colorStateList) {
            bVar.f106122c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void C(float f7) {
        b bVar = this.f106097a;
        if (bVar.f106128i != f7) {
            bVar.f106128i = f7;
            this.f106101e = true;
            invalidateSelf();
        }
    }

    public final void D(int i11, int i12, int i13, int i14) {
        b bVar = this.f106097a;
        if (bVar.f106126g == null) {
            bVar.f106126g = new Rect();
        }
        this.f106097a.f106126g.set(0, i12, 0, i14);
        invalidateSelf();
    }

    public final void E(Paint.Style style) {
        this.f106097a.f106136q = style;
        super.invalidateSelf();
    }

    public final void F(float f7) {
        b bVar = this.f106097a;
        if (bVar.f106131l != f7) {
            bVar.f106131l = f7;
            N();
        }
    }

    public final void G(boolean z11) {
        this.f106118v = z11;
    }

    public final void H() {
        this.f106112p.d(-12303292);
        this.f106097a.getClass();
        super.invalidateSelf();
    }

    public final void I(float f7, int i11) {
        K(f7);
        J(ColorStateList.valueOf(i11));
    }

    public final void J(ColorStateList colorStateList) {
        b bVar = this.f106097a;
        if (bVar.f106123d != colorStateList) {
            bVar.f106123d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void K(float f7) {
        this.f106097a.f106129j = f7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Paint paint = this.f106110n;
        paint.setColorFilter(this.f106115s);
        int alpha = paint.getAlpha();
        int i11 = this.f106097a.f106130k;
        paint.setAlpha(((i11 + (i11 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f106111o;
        paint2.setColorFilter(this.f106116t);
        paint2.setStrokeWidth(this.f106097a.f106129j);
        int alpha2 = paint2.getAlpha();
        int i12 = this.f106097a.f106130k;
        paint2.setAlpha(((i12 + (i12 >>> 7)) * alpha2) >>> 8);
        boolean z11 = this.f106101e;
        Path path = this.f106103g;
        if (z11) {
            float f7 = -(u() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f106097a.f106120a;
            kVar.getClass();
            k.a aVar = new k.a(kVar);
            InterfaceC10852c interfaceC10852c = kVar.f106143e;
            if (!(interfaceC10852c instanceof C10858i)) {
                interfaceC10852c = new C10851b(f7, interfaceC10852c);
            }
            aVar.q(interfaceC10852c);
            InterfaceC10852c interfaceC10852c2 = kVar.f106144f;
            if (!(interfaceC10852c2 instanceof C10858i)) {
                interfaceC10852c2 = new C10851b(f7, interfaceC10852c2);
            }
            aVar.u(interfaceC10852c2);
            InterfaceC10852c interfaceC10852c3 = kVar.f106146h;
            if (!(interfaceC10852c3 instanceof C10858i)) {
                interfaceC10852c3 = new C10851b(f7, interfaceC10852c3);
            }
            aVar.i(interfaceC10852c3);
            InterfaceC10852c interfaceC10852c4 = kVar.f106145g;
            if (!(interfaceC10852c4 instanceof C10858i)) {
                interfaceC10852c4 = new C10851b(f7, interfaceC10852c4);
            }
            aVar.m(interfaceC10852c4);
            k a11 = aVar.a();
            this.f106109m = a11;
            float f11 = this.f106097a.f106128i;
            RectF rectF = this.f106106j;
            rectF.set(o());
            float strokeWidth = u() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f106114r.a(a11, f11, rectF, null, this.f106104h);
            f(path, o());
            this.f106101e = false;
        }
        b bVar = this.f106097a;
        bVar.getClass();
        if (bVar.f106133n > 0) {
            int i13 = Build.VERSION.SDK_INT;
            if (!x() && !path.isConvex() && i13 < 29) {
                canvas.save();
                b bVar2 = this.f106097a;
                int sin = (int) (Math.sin(Math.toRadians(bVar2.f106135p)) * bVar2.f106134o);
                b bVar3 = this.f106097a;
                canvas.translate(sin, (int) (Math.cos(Math.toRadians(bVar3.f106135p)) * bVar3.f106134o));
                if (this.f106118v) {
                    RectF rectF2 = this.f106117u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f106097a.f106133n * 2) + ((int) rectF2.width()) + width, (this.f106097a.f106133n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f12 = (getBounds().left - this.f106097a.f106133n) - width;
                    float f13 = (getBounds().top - this.f106097a.f106133n) - height;
                    canvas2.translate(-f12, -f13);
                    i(canvas2);
                    canvas.drawBitmap(createBitmap, f12, f13, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    i(canvas);
                    canvas.restore();
                }
            }
        }
        b bVar4 = this.f106097a;
        Paint.Style style = bVar4.f106136q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            k(canvas, paint, path, bVar4.f106120a, o());
        }
        if (u()) {
            l(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    protected final void g(@NonNull Path path, @NonNull RectF rectF) {
        b bVar = this.f106097a;
        this.f106114r.a(bVar.f106120a, bVar.f106128i, rectF, this.f106113q, path);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f106097a.f106130k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f106097a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        this.f106097a.getClass();
        if (x()) {
            outline.setRoundRect(getBounds(), s() * this.f106097a.f106128i);
            return;
        }
        RectF o11 = o();
        Path path = this.f106103g;
        f(path, o11);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f106097a.f106126g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f106107k;
        region.set(bounds);
        RectF o11 = o();
        Path path = this.f106103g;
        f(path, o11);
        Region region2 = this.f106108l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    protected final int h(int i11) {
        b bVar = this.f106097a;
        float f7 = bVar.f106132m + 0.0f + bVar.f106131l;
        C8995a c8995a = bVar.f106121b;
        return c8995a != null ? c8995a.a(f7, i11) : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f106101e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f106097a.f106124e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f106097a.getClass();
        ColorStateList colorStateList2 = this.f106097a.f106123d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f106097a.f106122c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    protected final void j(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        k(canvas, paint, path, this.f106097a.f106120a, rectF);
    }

    protected void l(@NonNull Canvas canvas) {
        Paint paint = this.f106111o;
        Path path = this.f106104h;
        k kVar = this.f106109m;
        RectF rectF = this.f106106j;
        rectF.set(o());
        float strokeWidth = u() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        k(canvas, paint, path, kVar, rectF);
    }

    public final float m() {
        return this.f106097a.f106120a.f106146h.a(o());
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        b bVar = this.f106097a;
        b bVar2 = new b();
        bVar2.f106122c = null;
        bVar2.f106123d = null;
        bVar2.f106124e = null;
        bVar2.f106125f = PorterDuff.Mode.SRC_IN;
        bVar2.f106126g = null;
        bVar2.f106127h = 1.0f;
        bVar2.f106128i = 1.0f;
        bVar2.f106130k = 255;
        bVar2.f106131l = 0.0f;
        bVar2.f106132m = 0.0f;
        bVar2.f106133n = 0;
        bVar2.f106134o = 0;
        bVar2.f106135p = 0;
        bVar2.f106136q = Paint.Style.FILL_AND_STROKE;
        bVar2.f106120a = bVar.f106120a;
        bVar2.f106121b = bVar.f106121b;
        bVar2.f106129j = bVar.f106129j;
        bVar2.f106122c = bVar.f106122c;
        bVar2.f106123d = bVar.f106123d;
        bVar2.f106125f = bVar.f106125f;
        bVar2.f106124e = bVar.f106124e;
        bVar2.f106130k = bVar.f106130k;
        bVar2.f106127h = bVar.f106127h;
        bVar2.f106134o = bVar.f106134o;
        bVar2.f106128i = bVar.f106128i;
        bVar2.f106131l = bVar.f106131l;
        bVar2.f106132m = bVar.f106132m;
        bVar2.f106133n = bVar.f106133n;
        bVar2.f106135p = bVar.f106135p;
        bVar2.f106136q = bVar.f106136q;
        if (bVar.f106126g != null) {
            bVar2.f106126g = new Rect(bVar.f106126g);
        }
        this.f106097a = bVar2;
        return this;
    }

    public final float n() {
        return this.f106097a.f106120a.f106145g.a(o());
    }

    @NonNull
    protected final RectF o() {
        RectF rectF = this.f106105i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f106101e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, s7.C9616k.b
    protected boolean onStateChange(int[] iArr) {
        boolean z11 = L(iArr) || M();
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    public final float p() {
        return this.f106097a.f106132m;
    }

    public final ColorStateList q() {
        return this.f106097a.f106122c;
    }

    @NonNull
    public final k r() {
        return this.f106097a.f106120a;
    }

    public final float s() {
        return this.f106097a.f106120a.f106143e.a(o());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        b bVar = this.f106097a;
        if (bVar.f106130k != i11) {
            bVar.f106130k = i11;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f106097a.getClass();
        super.invalidateSelf();
    }

    @Override // y7.o
    public final void setShapeAppearanceModel(@NonNull k kVar) {
        this.f106097a.f106120a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f106097a.f106124e = colorStateList;
        M();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f106097a;
        if (bVar.f106125f != mode) {
            bVar.f106125f = mode;
            M();
            super.invalidateSelf();
        }
    }

    public final float t() {
        return this.f106097a.f106120a.f106144f.a(o());
    }

    public final void v(Context context) {
        this.f106097a.f106121b = new C8995a(context);
        N();
    }

    public final boolean w() {
        C8995a c8995a = this.f106097a.f106121b;
        return c8995a != null && c8995a.c();
    }

    public final boolean x() {
        return this.f106097a.f106120a.n(o());
    }

    public final void y(float f7) {
        setShapeAppearanceModel(this.f106097a.f106120a.o(f7));
    }

    public final void z(@NonNull C10858i c10858i) {
        k kVar = this.f106097a.f106120a;
        kVar.getClass();
        k.a aVar = new k.a(kVar);
        aVar.d(c10858i);
        setShapeAppearanceModel(aVar.a());
    }

    public C10856g() {
        this(new k());
    }

    public C10856g(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        this(k.c(context, attributeSet, i11, i12).a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10856g(@NonNull k kVar) {
        this(r0);
        b bVar = new b();
        bVar.f106122c = null;
        bVar.f106123d = null;
        bVar.f106124e = null;
        bVar.f106125f = PorterDuff.Mode.SRC_IN;
        bVar.f106126g = null;
        bVar.f106127h = 1.0f;
        bVar.f106128i = 1.0f;
        bVar.f106130k = 255;
        bVar.f106131l = 0.0f;
        bVar.f106132m = 0.0f;
        bVar.f106133n = 0;
        bVar.f106134o = 0;
        bVar.f106135p = 0;
        bVar.f106136q = Paint.Style.FILL_AND_STROKE;
        bVar.f106120a = kVar;
        bVar.f106121b = null;
    }

    private C10856g(@NonNull b bVar) {
        l lVar;
        this.f106098b = new n.f[4];
        this.f106099c = new n.f[4];
        this.f106100d = new BitSet(8);
        this.f106102f = new Matrix();
        this.f106103g = new Path();
        this.f106104h = new Path();
        this.f106105i = new RectF();
        this.f106106j = new RectF();
        this.f106107k = new Region();
        this.f106108l = new Region();
        Paint paint = new Paint(1);
        this.f106110n = paint;
        Paint paint2 = new Paint(1);
        this.f106111o = paint2;
        this.f106112p = new C10673a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.a.f106175a;
        } else {
            lVar = new l();
        }
        this.f106114r = lVar;
        this.f106117u = new RectF();
        this.f106118v = true;
        this.f106097a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        M();
        L(getState());
        this.f106113q = new a();
    }
}
