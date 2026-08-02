package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fb0 extends CheckedTextView {
    public final gb0 a;
    public final cb0 b;
    public final xc0 c;
    public ac0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fb0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        gjj.a(context);
        wfj.a(getContext(), this);
        xc0 xc0Var = new xc0(this);
        this.c = xc0Var;
        xc0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        xc0Var.b();
        cb0 cb0Var = new cb0(this);
        this.b = cb0Var;
        cb0Var.d(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new gb0(this);
        Context context2 = getContext();
        int[] iArr = dkf.l;
        l2a y = l2a.y(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) y.c;
        bsk.p(this, getContext(), iArr, attributeSet, (TypedArray) y.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(td4.d0(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(y.m(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(fb5.c(typedArray.getInt(3, -1), null));
                }
                y.F();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(td4.d0(resourceId, getContext()));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            y.F();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            y.F();
            throw th;
        }
    }

    @NonNull
    private ac0 getEmojiTextViewHelper() {
        ac0 ac0Var = this.d;
        if (ac0Var != null) {
            return ac0Var;
        }
        ac0 ac0Var2 = new ac0(this);
        this.d = ac0Var2;
        return ac0Var2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        xc0 xc0Var = this.c;
        if (xc0Var != null) {
            xc0Var.b();
        }
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.a();
        }
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            gb0Var.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i9a.N(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            return cb0Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            return cb0Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCheckMarkTintList() {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            return (ColorStateList) gb0Var.a;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            return (PorterDuff.Mode) gb0Var.b;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xw3.N(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            if (gb0Var.e) {
                gb0Var.e = false;
            } else {
                gb0Var.e = true;
                gb0Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.c;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.c;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i9a.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            gb0Var.a = colorStateList;
            gb0Var.c = true;
            gb0Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            gb0Var.b = mode;
            gb0Var.d = true;
            gb0Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        xc0 xc0Var = this.c;
        xc0Var.k(colorStateList);
        xc0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        xc0 xc0Var = this.c;
        xc0Var.l(mode);
        xc0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xc0 xc0Var = this.c;
        if (xc0Var != null) {
            xc0Var.g(i, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(td4.d0(i, getContext()));
    }
}
