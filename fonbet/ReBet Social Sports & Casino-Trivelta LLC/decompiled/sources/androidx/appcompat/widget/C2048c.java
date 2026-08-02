package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import l.AbstractC5335a;
import n.AbstractC5596a;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2048c extends AutoCompleteTextView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C2049d f17259a;

    /* renamed from: b, reason: collision with root package name */
    public final C2067w f17260b;

    /* renamed from: c, reason: collision with root package name */
    public final C2054i f17261c;

    public C2048c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54998m);
    }

    public void a(C2054i c2054i) {
        KeyListener keyListener = getKeyListener();
        if (c2054i.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = c2054i.a(keyListener);
            if (a10 == keyListener) {
                return;
            }
            super.setKeyListener(a10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2049d c2049d = this.f17259a;
        if (c2049d != null) {
            c2049d.b();
        }
        C2067w c2067w = this.f17260b;
        if (c2067w != null) {
            c2067w.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0.j.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2049d c2049d = this.f17259a;
        if (c2049d != null) {
            return c2049d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2049d c2049d = this.f17259a;
        if (c2049d != null) {
            return c2049d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17260b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17260b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f17261c.e(AbstractC2056k.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2049d c2049d = this.f17259a;
        if (c2049d != null) {
            c2049d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2049d c2049d = this.f17259a;
        if (c2049d != null) {
            c2049d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.f17260b;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.f17260b;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0.j.p(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC5596a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f17261c.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f17261c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2049d c2049d = this.f17259a;
        if (c2049d != null) {
            c2049d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2049d c2049d = this.f17259a;
        if (c2049d != null) {
            c2049d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f17260b.w(colorStateList);
        this.f17260b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f17260b.x(mode);
        this.f17260b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2067w c2067w = this.f17260b;
        if (c2067w != null) {
            c2067w.q(context, i10);
        }
    }

    public C2048c(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        W.a(this, getContext());
        a0 v10 = a0.v(getContext(), attributeSet, TINT_ATTRS, i10, 0);
        if (v10.s(0)) {
            setDropDownBackgroundDrawable(v10.g(0));
        }
        v10.x();
        C2049d c2049d = new C2049d(this);
        this.f17259a = c2049d;
        c2049d.e(attributeSet, i10);
        C2067w c2067w = new C2067w(this);
        this.f17260b = c2067w;
        c2067w.m(attributeSet, i10);
        c2067w.b();
        C2054i c2054i = new C2054i(this);
        this.f17261c = c2054i;
        c2054i.d(attributeSet, i10);
        a(c2054i);
    }
}
