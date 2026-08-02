package com.google.android.material.checkbox;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.dm10;
import xsna.fm2;
import xsna.fpo0;
import xsna.i5s;
import xsna.jl10;
import xsna.kf2;
import xsna.lf2;
import xsna.m33;
import xsna.qm10;
import xsna.t1u0;
import xsna.tko;
import xsna.yyo0;
import xsna.zm10;

/* loaded from: classes13.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[] B;
    public static final int[][] C;

    @SuppressLint({"DiscouragedApi"})
    public static final int D;

    @NonNull
    public final LinkedHashSet<c> f;

    @NonNull
    public final LinkedHashSet<b> g;

    @Nullable
    public ColorStateList h;
    public boolean i;
    public boolean j;
    public boolean k;

    @Nullable
    public CharSequence l;

    @Nullable
    public Drawable m;

    @Nullable
    public Drawable n;
    public boolean o;

    @Nullable
    public ColorStateList p;

    @Nullable
    public ColorStateList q;

    @NonNull
    public PorterDuff.Mode r;
    public int s;
    public int[] t;
    public boolean u;

    @Nullable
    public CharSequence v;

    @Nullable
    public CompoundButton.OnCheckedChangeListener w;

    @Nullable
    public final fm2 x;
    public final a y;
    public static final int z = R$style.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] A = {R$attr.state_indeterminate};

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.b;
            return i5s.a(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.b));
        }
    }

    public class a extends lf2 {
        public a() {
        }

        @Override // xsna.lf2
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.p;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // xsna.lf2
        public final void b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.p;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.t, colorStateList.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    static {
        int i = R$attr.state_error;
        B = new int[]{i};
        C = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = R$attr.checkboxStyle;
        int i2 = z;
        this.f = new LinkedHashSet<>();
        this.g = new LinkedHashSet<>();
        this.x = fm2.a(R$drawable.mtrl_checkbox_button_checked_unchecked, getContext());
        this.y = new a();
        Context context2 = getContext();
        this.m = getButtonDrawable();
        this.p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        yyo0 e = fpo0.e(context2, attributeSet, R$styleable.MaterialCheckBox, i, i2, new int[0]);
        TypedArray typedArray = e.b;
        this.n = e.b(R$styleable.MaterialCheckBox_buttonIcon);
        if (this.m != null && jl10.b(R$attr.isMaterial3Theme, context2, false)) {
            int resourceId = typedArray.getResourceId(R$styleable.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArray.getResourceId(R$styleable.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == D && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.m = m33.a(R$drawable.mtrl_checkbox_button, context2);
                this.o = true;
                if (this.n == null) {
                    this.n = m33.a(R$drawable.mtrl_checkbox_button_icon, context2);
                }
            }
        }
        this.q = qm10.b(context2, e, R$styleable.MaterialCheckBox_buttonIconTint);
        this.r = t1u0.e(typedArray.getInt(R$styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.i = typedArray.getBoolean(R$styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.j = typedArray.getBoolean(R$styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.k = typedArray.getBoolean(R$styleable.MaterialCheckBox_errorShown, false);
        this.l = typedArray.getText(R$styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArray.hasValue(R$styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArray.getInt(R$styleable.MaterialCheckBox_checkedState, 0));
        }
        e.f();
        b();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i = this.s;
        return i == 1 ? getResources().getString(R$string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R$string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R$string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.h == null) {
            int d = dm10.d(R$attr.colorControlActivated, this);
            int d2 = dm10.d(R$attr.colorError, this);
            int d3 = dm10.d(R$attr.colorSurface, this);
            int d4 = dm10.d(R$attr.colorOnSurface, this);
            this.h = new ColorStateList(C, new int[]{dm10.g(1.0f, d3, d2), dm10.g(1.0f, d3, d), dm10.g(0.54f, d3, d4), dm10.g(0.38f, d3, d4), dm10.g(0.38f, d3, d4)});
        }
        return this.h;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.p;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        fm2.b bVar;
        this.m = tko.b(this.m, this.p, getButtonTintMode());
        this.n = tko.b(this.n, this.q, this.r);
        if (this.o) {
            fm2 fm2Var = this.x;
            if (fm2Var != null) {
                Drawable drawable = fm2Var.b;
                a aVar = this.y;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.a == null) {
                        aVar.a = new kf2(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.a);
                }
                ArrayList<lf2> arrayList = fm2Var.f;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fm2Var.f.size() == 0 && (bVar = fm2Var.e) != null) {
                        fm2Var.c.b.removeListener(bVar);
                        fm2Var.e = null;
                    }
                }
                fm2Var.b(aVar);
            }
            Drawable drawable2 = this.m;
            if ((drawable2 instanceof AnimatedStateListDrawable) && fm2Var != null) {
                ((AnimatedStateListDrawable) drawable2).addTransition(R$id.checked, R$id.unchecked, fm2Var, false);
                ((AnimatedStateListDrawable) this.m).addTransition(R$id.indeterminate, R$id.unchecked, fm2Var, false);
            }
        }
        Drawable drawable3 = this.m;
        if (drawable3 != null && (colorStateList2 = this.p) != null) {
            drawable3.setTintList(colorStateList2);
        }
        Drawable drawable4 = this.n;
        if (drawable4 != null && (colorStateList = this.q) != null) {
            drawable4.setTintList(colorStateList);
        }
        super.setButtonDrawable(tko.a(-1, -1, this.m, this.n));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.m;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.n;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.q;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.r;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.p;
    }

    public int getCheckedState() {
        return this.s;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i && this.p == null && this.q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (this.k) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        this.t = tko.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.j || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (t1u0.d(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(m33.a(i, getContext()));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.n = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(m33.a(i, getContext()));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.q == colorStateList) {
            return;
        }
        this.q = colorStateList;
        b();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.r == mode) {
            return;
        }
        this.r = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.j = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.s != i) {
            this.s = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet<b> linkedHashSet = this.g;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.s != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.k == z2) {
            return;
        }
        this.k = z2;
        refreshDrawableState();
        Iterator<c> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.i = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.m = drawable;
        this.o = false;
        b();
    }
}
