package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import l.AbstractC5335a;
import n.AbstractC5596a;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements C0.l {

    /* renamed from: a, reason: collision with root package name */
    public final C2052g f16913a;

    /* renamed from: b, reason: collision with root package name */
    public final C2049d f16914b;

    /* renamed from: c, reason: collision with root package name */
    public final C2067w f16915c;

    /* renamed from: d, reason: collision with root package name */
    public C2055j f16916d;

    public AppCompatCheckBox(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f55000o);
    }

    @NonNull
    private C2055j getEmojiTextViewHelper() {
        if (this.f16916d == null) {
            this.f16916d = new C2055j(this);
        }
        return this.f16916d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2049d c2049d = this.f16914b;
        if (c2049d != null) {
            c2049d.b();
        }
        C2067w c2067w = this.f16915c;
        if (c2067w != null) {
            c2067w.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2049d c2049d = this.f16914b;
        if (c2049d != null) {
            return c2049d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2049d c2049d = this.f16914b;
        if (c2049d != null) {
            return c2049d.d();
        }
        return null;
    }

    @Override // C0.l
    public ColorStateList getSupportButtonTintList() {
        C2052g c2052g = this.f16913a;
        if (c2052g != null) {
            return c2052g.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2052g c2052g = this.f16913a;
        if (c2052g != null) {
            return c2052g.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16915c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16915c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2049d c2049d = this.f16914b;
        if (c2049d != null) {
            c2049d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2049d c2049d = this.f16914b;
        if (c2049d != null) {
            c2049d.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2052g c2052g = this.f16913a;
        if (c2052g != null) {
            c2052g.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.f16915c;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.f16915c;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2049d c2049d = this.f16914b;
        if (c2049d != null) {
            c2049d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2049d c2049d = this.f16914b;
        if (c2049d != null) {
            c2049d.j(mode);
        }
    }

    @Override // C0.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2052g c2052g = this.f16913a;
        if (c2052g != null) {
            c2052g.f(colorStateList);
        }
    }

    @Override // C0.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2052g c2052g = this.f16913a;
        if (c2052g != null) {
            c2052g.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f16915c.w(colorStateList);
        this.f16915c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f16915c.x(mode);
        this.f16915c.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        W.a(this, getContext());
        C2052g c2052g = new C2052g(this);
        this.f16913a = c2052g;
        c2052g.d(attributeSet, i10);
        C2049d c2049d = new C2049d(this);
        this.f16914b = c2049d;
        c2049d.e(attributeSet, i10);
        C2067w c2067w = new C2067w(this);
        this.f16915c = c2067w;
        c2067w.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC5596a.b(getContext(), i10));
    }
}
