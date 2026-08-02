package k7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import k7.C7598b;
import ru.ozon.app.android.R;
import s7.C9616k;
import s7.C9619n;
import v7.d;
import y7.C10856g;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7597a extends Drawable implements C9616k.b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final WeakReference<Context> f71009a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final C10856g f71010b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final C9616k f71011c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final Rect f71012d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final C7598b f71013e;

    /* renamed from: f, reason: collision with root package name */
    private float f71014f;

    /* renamed from: g, reason: collision with root package name */
    private float f71015g;

    /* renamed from: h, reason: collision with root package name */
    private int f71016h;

    /* renamed from: i, reason: collision with root package name */
    private float f71017i;

    /* renamed from: j, reason: collision with root package name */
    private float f71018j;

    /* renamed from: k, reason: collision with root package name */
    private float f71019k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<View> f71020l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<FrameLayout> f71021m;

    private C7597a(@NonNull Context context, C7598b.a aVar) {
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f71009a = weakReference;
        C9619n.b(context);
        this.f71012d = new Rect();
        C10856g c10856g = new C10856g();
        this.f71010b = c10856g;
        C9616k c9616k = new C9616k(this);
        this.f71011c = c9616k;
        c9616k.d().setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (context3 != null && c9616k.c() != (dVar = new d(context3, R.style.TextAppearance_MaterialComponents_Badge)) && (context2 = weakReference.get()) != null) {
            c9616k.f(dVar, context2);
            k();
        }
        C7598b c7598b = new C7598b(context, aVar);
        this.f71013e = c7598b;
        this.f71016h = ((int) Math.pow(10.0d, c7598b.l() - 1.0d)) - 1;
        c9616k.g();
        k();
        invalidateSelf();
        c9616k.g();
        k();
        invalidateSelf();
        c9616k.d().setAlpha(c7598b.c());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c7598b.d());
        if (c10856g.q() != valueOf) {
            c10856g.B(valueOf);
            invalidateSelf();
        }
        c9616k.d().setColor(c7598b.f());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f71020l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f71020l.get();
            WeakReference<FrameLayout> weakReference3 = this.f71021m;
            j(view, weakReference3 != null ? weakReference3.get() : null);
        }
        k();
        setVisible(c7598b.s(), false);
    }

    @NonNull
    public static C7597a b(@NonNull Context context) {
        return new C7597a(context, null);
    }

    @NonNull
    static C7597a c(@NonNull Context context, @NonNull C7598b.a aVar) {
        return new C7597a(context, aVar);
    }

    @NonNull
    private String d() {
        int h11 = h();
        int i11 = this.f71016h;
        C7598b c7598b = this.f71013e;
        if (h11 <= i11) {
            return NumberFormat.getInstance(c7598b.n()).format(h());
        }
        Context context = this.f71009a.get();
        return context == null ? "" : String.format(c7598b.n(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f71016h), "+");
    }

    private void k() {
        Context context = this.f71009a.get();
        WeakReference<View> weakReference = this.f71020l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f71012d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference2 = this.f71021m;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        C7598b c7598b = this.f71013e;
        int p11 = (c7598b.r() ? c7598b.p() : c7598b.q()) + c7598b.b();
        int e11 = c7598b.e();
        if (e11 == 8388691 || e11 == 8388693) {
            this.f71015g = rect3.bottom - p11;
        } else {
            this.f71015g = rect3.top + p11;
        }
        int h11 = h();
        float f7 = c7598b.f71025d;
        if (h11 <= 9) {
            if (!c7598b.r()) {
                f7 = c7598b.f71024c;
            }
            this.f71017i = f7;
            this.f71019k = f7;
            this.f71018j = f7;
        } else {
            this.f71017i = f7;
            this.f71019k = f7;
            this.f71018j = (this.f71011c.e(d()) / 2.0f) + c7598b.f71026e;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(c7598b.r() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int j11 = (c7598b.r() ? c7598b.j() : c7598b.k()) + c7598b.a();
        int e12 = c7598b.e();
        if (e12 == 8388659 || e12 == 8388691) {
            int i11 = Y.f42258g;
            this.f71014f = view.getLayoutDirection() == 0 ? (rect3.left - this.f71018j) + dimensionPixelSize + j11 : ((rect3.right + this.f71018j) - dimensionPixelSize) - j11;
        } else {
            int i12 = Y.f42258g;
            this.f71014f = view.getLayoutDirection() == 0 ? ((rect3.right + this.f71018j) - dimensionPixelSize) - j11 : (rect3.left - this.f71018j) + dimensionPixelSize + j11;
        }
        float f11 = this.f71014f;
        float f12 = this.f71015g;
        float f13 = this.f71018j;
        float f14 = this.f71019k;
        rect2.set((int) (f11 - f13), (int) (f12 - f14), (int) (f11 + f13), (int) (f12 + f14));
        float f15 = this.f71017i;
        C10856g c10856g = this.f71010b;
        c10856g.y(f15);
        if (rect.equals(rect2)) {
            return;
        }
        c10856g.setBounds(rect2);
    }

    @Override // s7.C9616k.b
    public final void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty()) {
            return;
        }
        C7598b c7598b = this.f71013e;
        if (c7598b.c() == 0 || !isVisible()) {
            return;
        }
        this.f71010b.draw(canvas);
        if (c7598b.r()) {
            Rect rect = new Rect();
            String d11 = d();
            C9616k c9616k = this.f71011c;
            c9616k.d().getTextBounds(d11, 0, d11.length(), rect);
            canvas.drawText(d11, this.f71014f, this.f71015g + (rect.height() / 2), c9616k.d());
        }
    }

    public final CharSequence e() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        C7598b c7598b = this.f71013e;
        if (!c7598b.r()) {
            return c7598b.h();
        }
        if (c7598b.i() == 0 || (context = this.f71009a.get()) == null) {
            return null;
        }
        return h() <= this.f71016h ? context.getResources().getQuantityString(c7598b.i(), h(), Integer.valueOf(h())) : context.getString(c7598b.g(), Integer.valueOf(this.f71016h));
    }

    public final FrameLayout f() {
        WeakReference<FrameLayout> weakReference = this.f71021m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int g() {
        return this.f71013e.k();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f71013e.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f71012d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f71012d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int h() {
        C7598b c7598b = this.f71013e;
        if (c7598b.r()) {
            return c7598b.m();
        }
        return 0;
    }

    @NonNull
    final C7598b.a i() {
        return this.f71013e.o();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(@NonNull View view, FrameLayout frameLayout) {
        this.f71020l = new WeakReference<>(view);
        this.f71021m = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, s7.C9616k.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        C7598b c7598b = this.f71013e;
        c7598b.t(i11);
        this.f71011c.d().setAlpha(c7598b.c());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
