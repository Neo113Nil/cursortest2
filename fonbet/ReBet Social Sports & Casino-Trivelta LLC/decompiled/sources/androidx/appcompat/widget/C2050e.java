package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import l.AbstractC5335a;
import n.AbstractC5596a;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2050e extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C2051f f17270a;

    /* renamed from: b, reason: collision with root package name */
    public final C2049d f17271b;

    /* renamed from: c, reason: collision with root package name */
    public final C2067w f17272c;

    /* renamed from: d, reason: collision with root package name */
    public C2055j f17273d;

    public C2050e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f55001p);
    }

    @NonNull
    private C2055j getEmojiTextViewHelper() {
        if (this.f17273d == null) {
            this.f17273d = new C2055j(this);
        }
        return this.f17273d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2067w c2067w = this.f17272c;
        if (c2067w != null) {
            c2067w.b();
        }
        C2049d c2049d = this.f17271b;
        if (c2049d != null) {
            c2049d.b();
        }
        C2051f c2051f = this.f17270a;
        if (c2051f != null) {
            c2051f.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0.j.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2049d c2049d = this.f17271b;
        if (c2049d != null) {
            return c2049d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2049d c2049d = this.f17271b;
        if (c2049d != null) {
            return c2049d.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2051f c2051f = this.f17270a;
        if (c2051f != null) {
            return c2051f.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2051f c2051f = this.f17270a;
        if (c2051f != null) {
            return c2051f.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17272c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17272c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC2056k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2049d c2049d = this.f17271b;
        if (c2049d != null) {
            c2049d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2049d c2049d = this.f17271b;
        if (c2049d != null) {
            c2049d.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2051f c2051f = this.f17270a;
        if (c2051f != null) {
            c2051f.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.f17272c;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.f17272c;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0.j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2049d c2049d = this.f17271b;
        if (c2049d != null) {
            c2049d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2049d c2049d = this.f17271b;
        if (c2049d != null) {
            c2049d.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2051f c2051f = this.f17270a;
        if (c2051f != null) {
            c2051f.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2051f c2051f = this.f17270a;
        if (c2051f != null) {
            c2051f.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f17272c.w(colorStateList);
        this.f17272c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f17272c.x(mode);
        this.f17272c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2067w c2067w = this.f17272c;
        if (c2067w != null) {
            c2067w.q(context, i10);
        }
    }

    public C2050e(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        W.a(this, getContext());
        C2067w c2067w = new C2067w(this);
        this.f17272c = c2067w;
        c2067w.m(attributeSet, i10);
        c2067w.b();
        C2049d c2049d = new C2049d(this);
        this.f17271b = c2049d;
        c2049d.e(attributeSet, i10);
        C2051f c2051f = new C2051f(this);
        this.f17270a = c2051f;
        c2051f.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC5596a.b(getContext(), i10));
    }
}
