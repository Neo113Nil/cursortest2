package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p0 extends k0 {

    /* renamed from: d, reason: collision with root package name */
    public final o0 f861d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f862e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f863f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f864g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f865h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f866i;

    public p0(o0 o0Var) {
        super(o0Var);
        this.f863f = null;
        this.f864g = null;
        this.f865h = false;
        this.f866i = false;
        this.f861d = o0Var;
    }

    @Override // androidx.appcompat.widget.k0
    public final void a(AttributeSet attributeSet, int i5) {
        super.a(attributeSet, R.attr.seekBarStyle);
        o0 o0Var = this.f861d;
        Context context = o0Var.getContext();
        int[] iArr = i.a.f10836g;
        c4 f6 = c4.f(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        TypedArray typedArray = f6.f722b;
        androidx.core.view.z0.n(o0Var, o0Var.getContext(), iArr, attributeSet, f6.f722b, R.attr.seekBarStyle);
        Drawable c2 = f6.c(0);
        if (c2 != null) {
            o0Var.setThumb(c2);
        }
        Drawable b10 = f6.b(1);
        Drawable drawable = this.f862e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f862e = b10;
        if (b10 != null) {
            b10.setCallback(o0Var);
            b10.setLayoutDirection(o0Var.getLayoutDirection());
            if (b10.isStateful()) {
                b10.setState(o0Var.getDrawableState());
            }
            c();
        }
        o0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f864g = z1.c(typedArray.getInt(3, -1), this.f864g);
            this.f866i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f863f = f6.a(2);
            this.f865h = true;
        }
        f6.g();
        c();
    }

    public final void c() {
        Drawable drawable = this.f862e;
        if (drawable != null) {
            if (this.f865h || this.f866i) {
                Drawable mutate = drawable.mutate();
                this.f862e = mutate;
                if (this.f865h) {
                    mutate.setTintList(this.f863f);
                }
                if (this.f866i) {
                    this.f862e.setTintMode(this.f864g);
                }
                if (this.f862e.isStateful()) {
                    this.f862e.setState(this.f861d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f862e != null) {
            int max = this.f861d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f862e.getIntrinsicWidth();
                int intrinsicHeight = this.f862e.getIntrinsicHeight();
                int i5 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f862e.setBounds(-i5, -i10, i5, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f862e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
