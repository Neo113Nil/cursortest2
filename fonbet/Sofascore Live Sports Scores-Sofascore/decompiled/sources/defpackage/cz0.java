package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState$State;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cz0 extends Drawable implements d9j {
    public final WeakReference a;
    public final qzb b;
    public final e9j c;
    public final Rect d;
    public final dz0 e;
    public float f;
    public float g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public WeakReference l;
    public WeakReference m;

    public cz0(Context context) {
        z7j z7jVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        m6k.x(context, "Theme.MaterialComponents", m6k.f);
        this.d = new Rect();
        e9j e9jVar = new e9j(this);
        this.c = e9jVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = e9jVar.a;
        textPaint.setTextAlign(align);
        dz0 dz0Var = new dz0(context);
        this.e = dz0Var;
        boolean f = f();
        BadgeState$State badgeState$State = dz0Var.b;
        qzb qzbVar = new qzb(xah.g(context, f ? badgeState$State.g.intValue() : badgeState$State.e.intValue(), f() ? badgeState$State.h.intValue() : badgeState$State.f.intValue()).a());
        this.b = qzbVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && e9jVar.g != (z7jVar = new z7j(context2, badgeState$State.d.intValue()))) {
            e9jVar.c(z7jVar, context2);
            textPaint.setColor(badgeState$State.c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = badgeState$State.l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.h = badgeState$State.m;
        }
        e9jVar.e = true;
        j();
        invalidateSelf();
        e9jVar.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState$State.b.intValue());
        if (qzbVar.b.c != valueOf) {
            qzbVar.t(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(badgeState$State.t.booleanValue(), false);
    }

    @Override // defpackage.d9j
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout d = d();
        if (d == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = d;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float f3 = (this.g - this.k) + f;
            float f4 = (this.f - this.j) + f2;
            View view5 = view3;
            float height = ((this.g + this.k) - view5.getHeight()) + f;
            float width = ((this.f + this.j) - view5.getWidth()) + f2;
            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.g = Math.abs(f3) + this.g;
            }
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f = Math.abs(f4) + this.f;
            }
            if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.g -= Math.abs(height);
            }
            if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        dz0 dz0Var = this.e;
        BadgeState$State badgeState$State = dz0Var.b;
        BadgeState$State badgeState$State2 = dz0Var.b;
        String str = badgeState$State.j;
        WeakReference weakReference = this.a;
        if (str == null) {
            if (!g()) {
                return null;
            }
            int i = this.h;
            if (i == -2 || e() <= i) {
                return NumberFormat.getInstance(badgeState$State2.n).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(badgeState$State2.n, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = badgeState$State.l;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!f() || (c = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        e9j e9jVar = this.c;
        e9jVar.a.getTextBounds(c, 0, c.length(), rect);
        float exactCenterY = this.g - rect.exactCenterY();
        canvas.drawText(c, this.f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), e9jVar.a);
    }

    public final int e() {
        int i = this.e.b.k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.e.b.j != null || g();
    }

    public final boolean g() {
        BadgeState$State badgeState$State = this.e.b;
        return badgeState$State.j == null && badgeState$State.k != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean f = f();
        dz0 dz0Var = this.e;
        this.b.setShapeAppearanceModel(xah.g(context, f ? dz0Var.b.g.intValue() : dz0Var.b.e.intValue(), f() ? dz0Var.b.h.intValue() : dz0Var.b.f.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        float f;
        float f2;
        int intValue;
        int intValue2;
        int intValue3;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.m;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean f10 = f();
        dz0 dz0Var = this.e;
        float f11 = f10 ? dz0Var.d : dz0Var.c;
        this.i = f11;
        if (f11 != -1.0f) {
            this.j = f11;
            this.k = f11;
        } else {
            this.j = Math.round((f() ? dz0Var.g : dz0Var.e) / 2.0f);
            this.k = Math.round((f() ? dz0Var.h : dz0Var.f) / 2.0f);
        }
        if (f()) {
            String c = c();
            float f12 = this.j;
            e9j e9jVar = this.c;
            this.j = Math.max(f12, (e9jVar.a(c) / 2.0f) + dz0Var.b.u.intValue());
            float f13 = this.k;
            if (e9jVar.e) {
                e9jVar.b(c);
            }
            float max = Math.max(f13, (e9jVar.d / 2.0f) + dz0Var.b.v.intValue());
            this.k = max;
            this.j = Math.max(this.j, max);
        }
        BadgeState$State badgeState$State = dz0Var.b;
        BadgeState$State badgeState$State2 = dz0Var.b;
        int i = dz0Var.l;
        int i2 = dz0Var.k;
        int intValue4 = badgeState$State.x.intValue();
        if (f()) {
            intValue4 = badgeState$State.z.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                f = -1.0f;
                f2 = 2.0f;
                intValue4 = e80.c(e80.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue4, intValue4 - badgeState$State.C.intValue());
                if (i2 == 0) {
                    intValue4 -= Math.round(this.k);
                }
                intValue = badgeState$State.B.intValue() + intValue4;
                intValue2 = badgeState$State2.s.intValue();
                if (intValue2 != 8388691 || intValue2 == 8388693) {
                    this.g = rect3.bottom - intValue;
                } else {
                    this.g = rect3.top + intValue;
                }
                int intValue5 = !f() ? badgeState$State.y.intValue() : badgeState$State.w.intValue();
                if (i2 == 1) {
                    intValue5 += f() ? dz0Var.j : dz0Var.i;
                }
                int intValue6 = badgeState$State.A.intValue() + intValue5;
                intValue3 = badgeState$State2.s.intValue();
                if (intValue3 != 8388659 || intValue3 == 8388691) {
                    if (i != 0) {
                        if (view.getLayoutDirection() == 0) {
                            f3 = rect3.left + this.j;
                            f4 = (this.k * f2) - intValue6;
                            f5 = f3 - f4;
                            this.f = f5;
                        } else {
                            f5 = (rect3.right - this.j) + ((this.k * f2) - intValue6);
                            this.f = f5;
                        }
                    } else if (view.getLayoutDirection() == 0) {
                        f5 = (rect3.left - this.j) + intValue6;
                        this.f = f5;
                    } else {
                        f3 = rect3.right + this.j;
                        f4 = intValue6;
                        f5 = f3 - f4;
                        this.f = f5;
                    }
                } else if (i == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f7 = rect3.right + this.j;
                        f8 = intValue6;
                        f9 = f7 - f8;
                        this.f = f9;
                    } else {
                        f9 = (rect3.left - this.j) + intValue6;
                        this.f = f9;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f9 = (rect3.right - this.j) + ((this.k * f2) - intValue6);
                    this.f = f9;
                } else {
                    f7 = rect3.left + this.j;
                    f8 = (this.k * f2) - intValue6;
                    f9 = f7 - f8;
                    this.f = f9;
                }
                if (badgeState$State.D.booleanValue()) {
                    b(view, null);
                } else {
                    ViewParent d = d();
                    if (d == null) {
                        d = view.getParent();
                    }
                    if ((d instanceof View) && (d.getParent() instanceof View)) {
                        b(view, (View) d.getParent());
                    }
                }
                float f14 = this.f;
                float f15 = this.g;
                float f16 = this.j;
                float f17 = this.k;
                rect2.set((int) (f14 - f16), (int) (f15 - f17), (int) (f14 + f16), (int) (f15 + f17));
                f6 = this.i;
                qzb qzbVar = this.b;
                if (f6 != f) {
                    qzbVar.setShapeAppearanceModel(qzbVar.b.a.a(f6));
                }
                if (rect.equals(rect2)) {
                    qzbVar.setBounds(rect2);
                    return;
                }
                return;
            }
        }
        f = -1.0f;
        f2 = 2.0f;
        if (i2 == 0) {
        }
        intValue = badgeState$State.B.intValue() + intValue4;
        intValue2 = badgeState$State2.s.intValue();
        if (intValue2 != 8388691) {
        }
        this.g = rect3.bottom - intValue;
        if (!f()) {
        }
        if (i2 == 1) {
        }
        int intValue62 = badgeState$State.A.intValue() + intValue5;
        intValue3 = badgeState$State2.s.intValue();
        if (intValue3 != 8388659) {
        }
        if (i != 0) {
        }
        if (badgeState$State.D.booleanValue()) {
        }
        float f142 = this.f;
        float f152 = this.g;
        float f162 = this.j;
        float f172 = this.k;
        rect2.set((int) (f142 - f162), (int) (f152 - f172), (int) (f142 + f162), (int) (f152 + f172));
        f6 = this.i;
        qzb qzbVar2 = this.b;
        if (f6 != f) {
        }
        if (rect.equals(rect2)) {
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.d9j
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        dz0 dz0Var = this.e;
        dz0Var.a.i = i;
        dz0Var.b.i = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
