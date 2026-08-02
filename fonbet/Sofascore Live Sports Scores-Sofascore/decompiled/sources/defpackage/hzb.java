package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hzb {
    public static final ColorDrawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final qzb c;
    public final qzb d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public vah n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public qzb r;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public final Rect b = new Rect();
    public boolean s = false;
    public float y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public hzb(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.e = -1.0f;
        this.a = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, sjf.a, i, R.style.CardView);
        qzb qzbVar = new qzb(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.c = qzbVar;
        qzbVar.p(materialCardView.getContext());
        qzbVar.v();
        wah m = qzbVar.k().m();
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.e = dimension;
            m.b(dimension);
        }
        this.d = new qzb();
        h(m.a());
        this.v = yfa.E(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, e80.a);
        this.w = x2a.M(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.x = x2a.M(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(hz8 hz8Var, float f) {
        return hz8Var instanceof p7g ? (float) ((1.0d - z) * f) : hz8Var instanceof oa4 ? f / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float a() {
        xah[] c = this.n.c();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (xah xahVar : c) {
            if (xahVar != null) {
                hz8 hz8Var = xahVar.a;
                qzb qzbVar = this.c;
                float b = b(hz8Var, qzbVar.m());
                hz8 hz8Var2 = xahVar.b;
                float[] fArr = qzbVar.C;
                float max = Math.max(b, b(hz8Var2, fArr != null ? fArr[0] : qzbVar.b.a.d().f.a(qzbVar.i())));
                hz8 hz8Var3 = xahVar.c;
                float[] fArr2 = qzbVar.C;
                float b2 = b(hz8Var3, fArr2 != null ? fArr2[1] : qzbVar.b.a.d().g.a(qzbVar.i()));
                hz8 hz8Var4 = xahVar.d;
                float[] fArr3 = qzbVar.C;
                f = Math.max(f, Math.max(max, Math.max(b2, b(hz8Var4, fArr3 != null ? fArr3[2] : qzbVar.b.a.d().h.a(qzbVar.i())))));
            }
        }
        return f;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new qzb(this.n);
            this.p = new RippleDrawable(this.l, null, this.r);
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.p, this.d, this.k});
        FocusRingDrawable.f(this.a.getContext(), layerDrawable2, this.r);
        layerDrawable2.setId(2, R.id.mtrl_card_checked_layer_id);
        this.q = layerDrawable2;
        return layerDrawable2;
    }

    public final gzb d(Drawable drawable) {
        int i;
        int i2;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            boolean i3 = i();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int ceil = (int) Math.ceil(maxCardElevation + (i3 ? a() : 0.0f));
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f = a();
            }
            i = (int) Math.ceil(maxCardElevation2 + f);
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new gzb(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.q != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                boolean i7 = i();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i3 = (int) Math.ceil((maxCardElevation + (i7 ? a() : 0.0f)) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f = a();
                }
                i4 = (int) Math.ceil((maxCardElevation2 + f) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i8 = this.h;
            boolean z2 = (i8 & 8388613) == 8388613;
            int i9 = this.f;
            int i10 = z2 ? ((i - i9) - this.g) - i4 : i9;
            int i11 = (i8 & 80) == 80 ? i9 : ((i2 - i9) - this.g) - i3;
            int i12 = (i8 & 8388613) == 8388613 ? i9 : ((i - i9) - this.g) - i4;
            if ((i8 & 80) == 80) {
                i9 = ((i2 - i9) - this.g) - i3;
            }
            int i13 = i9;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i12;
                i5 = i10;
            } else {
                i5 = i12;
                i6 = i10;
            }
            this.q.setLayerInset(2, i6, i13, i5, i11);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.k;
        if (drawable != null) {
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                if (z2) {
                    f = 1.0f;
                }
                this.y = f;
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            float f2 = this.y;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.u = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f);
            this.u = ofFloat;
            ofFloat.addUpdateListener(new s2(this, 13));
            this.u.setInterpolator(this.v);
            this.u.setDuration((long) ((z2 ? this.w : this.x) * f2));
            this.u.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.k = mutate;
            mutate.setTintList(this.m);
            f(this.a.i, false);
        } else {
            this.k = A;
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.k);
        }
    }

    public final void h(vah vahVar) {
        this.n = vahVar;
        qzb qzbVar = this.c;
        qzbVar.x(vahVar);
        this.d.x(vahVar);
        qzb qzbVar2 = this.r;
        if (qzbVar2 != null) {
            qzbVar2.x(vahVar);
        }
        qzbVar.x = !qzbVar.q();
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.q() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.j;
        Drawable c = j() ? c() : this.d;
        this.j = c;
        if (drawable != c) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c);
            } else {
                materialCardView.setForeground(d(c));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        boolean preventCornerOverlap = materialCardView.getPreventCornerOverlap();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float a = ((!preventCornerOverlap || this.c.q()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f = (float) ((1.0d - z) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a - f);
        Rect rect = this.b;
        materialCardView.c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        z41 z41Var = materialCardView.e;
        if (!((CardView) z41Var.c).getUseCompatPadding()) {
            z41Var.z(0, 0, 0, 0);
            return;
        }
        f7g f7gVar = (f7g) z41Var.b;
        float f2 = f7gVar.e;
        float f3 = f7gVar.a;
        int ceil = (int) Math.ceil(g7g.a(f2, f3, r0.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(g7g.b(f2, f3, r0.getPreventCornerOverlap()));
        z41Var.z(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z2 = this.s;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.j));
    }
}
