package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.ac0;
import defpackage.cb0;
import defpackage.fd0;
import defpackage.fs0;
import defpackage.gjj;
import defpackage.i9a;
import defpackage.lvk;
import defpackage.wfj;
import defpackage.xc0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements fs0 {
    public final cb0 a;
    public final xc0 b;
    public ac0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gjj.a(context);
        wfj.a(getContext(), this);
        cb0 cb0Var = new cb0(this);
        this.a = cb0Var;
        cb0Var.d(attributeSet, i);
        xc0 xc0Var = new xc0(this);
        this.b = xc0Var;
        xc0Var.f(attributeSet, i);
        xc0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @NonNull
    private ac0 getEmojiTextViewHelper() {
        ac0 ac0Var = this.c;
        if (ac0Var != null) {
            return ac0Var;
        }
        ac0 ac0Var2 = new ac0(this);
        this.c = ac0Var2;
        return ac0Var2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.a();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (lvk.c) {
            return super.getAutoSizeMaxTextSize();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return Math.round(xc0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (lvk.c) {
            return super.getAutoSizeMinTextSize();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return Math.round(xc0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (lvk.c) {
            return super.getAutoSizeStepGranularity();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return Math.round(xc0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (lvk.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        xc0 xc0Var = this.b;
        return xc0Var != null ? xc0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (lvk.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return xc0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i9a.N(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            return cb0Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            return cb0Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        xc0 xc0Var = this.b;
        if (xc0Var == null || lvk.c) {
            return;
        }
        xc0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            fd0 fd0Var = xc0Var.i;
            if (lvk.c || !fd0Var.e()) {
                return;
            }
            fd0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.fs0
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (lvk.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (lvk.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (lvk.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i9a.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        xc0 xc0Var = this.b;
        xc0Var.k(colorStateList);
        xc0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        xc0 xc0Var = this.b;
        xc0Var.l(mode);
        xc0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.g(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = lvk.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            fd0 fd0Var = xc0Var.i;
            if (z || fd0Var.e()) {
                return;
            }
            fd0Var.f(f, i);
        }
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }
}
