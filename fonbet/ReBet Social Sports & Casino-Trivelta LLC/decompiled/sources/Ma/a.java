package Ma;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.AbstractC2074d;
import com.google.android.material.shape.g;
import com.google.android.material.shape.h;
import com.google.android.material.shape.i;
import com.google.android.material.shape.k;
import com.plaid.internal.EnumC3631g;
import ia.c;
import ia.e;
import ia.l;
import ia.m;
import ja.AbstractC5104a;
import sa.AbstractC6344a;
import xa.i;

/* loaded from: classes3.dex */
public class a extends i implements i.b {

    /* renamed from: b1, reason: collision with root package name */
    public static final int f7573b1 = l.f48561M;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f7574g1 = c.f48271y0;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f7575D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f7576E;

    /* renamed from: F, reason: collision with root package name */
    public final Paint.FontMetrics f7577F;

    /* renamed from: G, reason: collision with root package name */
    public final xa.i f7578G;

    /* renamed from: H, reason: collision with root package name */
    public final View.OnLayoutChangeListener f7579H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f7580I;

    /* renamed from: J, reason: collision with root package name */
    public int f7581J;

    /* renamed from: K, reason: collision with root package name */
    public int f7582K;

    /* renamed from: L, reason: collision with root package name */
    public int f7583L;

    /* renamed from: O, reason: collision with root package name */
    public int f7584O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f7585P;

    /* renamed from: R, reason: collision with root package name */
    public int f7586R;

    /* renamed from: T, reason: collision with root package name */
    public int f7587T;

    /* renamed from: V, reason: collision with root package name */
    public float f7588V;

    /* renamed from: W, reason: collision with root package name */
    public float f7589W;

    /* renamed from: X, reason: collision with root package name */
    public float f7590X;

    /* renamed from: Y, reason: collision with root package name */
    public float f7591Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f7592Z;

    /* renamed from: Ma.a$a, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC0155a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0155a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a.this.L0(view);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f7577F = new Paint.FontMetrics();
        xa.i iVar = new xa.i(this);
        this.f7578G = iVar;
        this.f7579H = new ViewOnLayoutChangeListenerC0155a();
        this.f7580I = new Rect();
        this.f7588V = 1.0f;
        this.f7589W = 1.0f;
        this.f7590X = 0.5f;
        this.f7591Y = 0.5f;
        this.f7592Z = 1.0f;
        this.f7576E = context;
        iVar.g().density = context.getResources().getDisplayMetrics().density;
        iVar.g().setTextAlign(Paint.Align.CENTER);
    }

    public static a A0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.F0(attributeSet, i10, i11);
        return aVar;
    }

    private void F0(AttributeSet attributeSet, int i10, int i11) {
        TypedArray i12 = xa.l.i(this.f7576E, attributeSet, m.Tooltip, i10, i11, new int[0]);
        this.f7586R = this.f7576E.getResources().getDimensionPixelSize(e.f48318O0);
        boolean z10 = i12.getBoolean(m.f48767R8, true);
        this.f7585P = z10;
        if (z10) {
            setShapeAppearanceModel(H().w().s(B0()).m());
        } else {
            this.f7586R = 0;
        }
        J0(i12.getText(m.f48747P8));
        Ca.e h10 = Ca.c.h(this.f7576E, i12, m.f48687J8);
        if (h10 != null && i12.hasValue(m.f48697K8)) {
            h10.n(Ca.c.a(this.f7576E, i12, m.f48697K8));
        }
        K0(h10);
        f0(ColorStateList.valueOf(i12.getColor(m.f48757Q8, AbstractC6344a.i(AbstractC2074d.k(AbstractC6344a.c(this.f7576E, R.attr.colorBackground, a.class.getCanonicalName()), EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE), AbstractC2074d.k(AbstractC6344a.c(this.f7576E, c.f48244l, a.class.getCanonicalName()), EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE)))));
        o0(ColorStateList.valueOf(AbstractC6344a.c(this.f7576E, c.f48260t, a.class.getCanonicalName())));
        this.f7581J = i12.getDimensionPixelSize(m.f48707L8, 0);
        this.f7582K = i12.getDimensionPixelSize(m.f48727N8, 0);
        this.f7583L = i12.getDimensionPixelSize(m.f48737O8, 0);
        this.f7584O = i12.getDimensionPixelSize(m.f48717M8, 0);
        i12.recycle();
    }

    private float y0() {
        this.f7578G.g().getFontMetrics(this.f7577F);
        Paint.FontMetrics fontMetrics = this.f7577F;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public final g B0() {
        float f10 = -x0();
        float width = (float) ((getBounds().width() - (this.f7586R * Math.sqrt(2.0d))) / 2.0d);
        return new k(new h(this.f7586R), Math.min(Math.max(f10, -width), width));
    }

    public void C0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f7579H);
    }

    public final void D0(Canvas canvas) {
        if (this.f7575D == null) {
            return;
        }
        int z02 = (int) z0(getBounds());
        if (this.f7578G.e() != null) {
            this.f7578G.g().drawableState = getState();
            this.f7578G.n(this.f7576E);
            this.f7578G.g().setAlpha((int) (this.f7592Z * 255.0f));
        }
        CharSequence charSequence = this.f7575D;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), z02, this.f7578G.g());
    }

    public final float E0() {
        CharSequence charSequence = this.f7575D;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f7578G.h(charSequence.toString());
    }

    public void G0(float f10, float f11) {
        this.f7590X = f10;
        this.f7591Y = f11;
        invalidateSelf();
    }

    public void H0(View view) {
        if (view == null) {
            return;
        }
        L0(view);
        view.addOnLayoutChangeListener(this.f7579H);
    }

    public void I0(float f10) {
        this.f7588V = f10;
        this.f7589W = f10;
        this.f7592Z = AbstractC5104a.b(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    public void J0(CharSequence charSequence) {
        if (TextUtils.equals(this.f7575D, charSequence)) {
            return;
        }
        this.f7575D = charSequence;
        this.f7578G.m(true);
        invalidateSelf();
    }

    public void K0(Ca.e eVar) {
        this.f7578G.k(eVar, this.f7576E);
    }

    public final void L0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f7587T = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f7580I);
    }

    @Override // xa.i.b
    public void a() {
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float x02 = x0();
        float f10 = (float) (-((this.f7586R * Math.sqrt(2.0d)) - this.f7586R));
        canvas.scale(this.f7588V, this.f7589W, getBounds().left + (getBounds().width() * this.f7590X), getBounds().top + (getBounds().height() * this.f7591Y));
        canvas.translate(x02, f10);
        super.draw(canvas);
        D0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f7578G.g().getTextSize(), this.f7583L);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f7581J * 2) + E0(), this.f7582K);
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f7585P) {
            setShapeAppearanceModel(H().w().s(B0()).m());
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable, xa.i.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float x0() {
        int i10;
        if (((this.f7580I.right - getBounds().right) - this.f7587T) - this.f7584O < 0) {
            i10 = ((this.f7580I.right - getBounds().right) - this.f7587T) - this.f7584O;
        } else {
            if (((this.f7580I.left - getBounds().left) - this.f7587T) + this.f7584O <= 0) {
                return 0.0f;
            }
            i10 = ((this.f7580I.left - getBounds().left) - this.f7587T) + this.f7584O;
        }
        return i10;
    }

    public final float z0(Rect rect) {
        return rect.centerY() - y0();
    }
}
