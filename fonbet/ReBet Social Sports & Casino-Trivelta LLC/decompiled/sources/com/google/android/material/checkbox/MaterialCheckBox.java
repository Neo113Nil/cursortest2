package com.google.android.material.checkbox;

import T7.S;
import T7.T;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
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
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.a0;
import androidx.vectordrawable.graphics.drawable.b;
import androidx.vectordrawable.graphics.drawable.c;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.twilio.voice.Constants;
import ia.f;
import ia.g;
import ia.k;
import ia.l;
import ia.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.AbstractC5335a;
import n.AbstractC5596a;
import sa.AbstractC6344a;
import ua.d;
import xa.o;

/* loaded from: classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int[] ERROR_STATE_SET;

    /* renamed from: y, reason: collision with root package name */
    public static final int[][] f35144y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f35145z;
    private int[] currentStateChecked;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f35146e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f35147f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f35148g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35149h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f35150i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35151j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f35152k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f35153l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f35154m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35155n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f35156o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f35157p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f35158q;

    /* renamed from: r, reason: collision with root package name */
    public int f35159r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35160s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f35161t;

    /* renamed from: u, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f35162u;

    /* renamed from: v, reason: collision with root package name */
    public final c f35163v;

    /* renamed from: w, reason: collision with root package name */
    public final b f35164w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f35143x = l.f48549A;
    private static final int[] INDETERMINATE_STATE_SET = {ia.c.f48255q0};

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f35165a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public final String a() {
            int i10 = this.f35165a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : ReactProgressBarViewManager.PROP_INDETERMINATE : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f35165a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f35165a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class a extends b {
        public a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f35156o;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f35156o;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.f35156o.getDefaultColor()));
            }
        }
    }

    static {
        int i10 = ia.c.f48253p0;
        ERROR_STATE_SET = new int[]{i10};
        f35144y = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f35145z = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", Constants.PLATFORM_ANDROID);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f55000o);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f35159r;
        return i10 == 1 ? getResources().getString(k.f48545w) : i10 == 0 ? getResources().getString(k.f48547y) : getResources().getString(k.f48546x);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f35148g == null) {
            int[][] iArr = f35144y;
            int[] iArr2 = new int[iArr.length];
            int d10 = AbstractC6344a.d(this, AbstractC5335a.f55004s);
            int d11 = AbstractC6344a.d(this, AbstractC5335a.f55007v);
            int d12 = AbstractC6344a.d(this, ia.c.f48260t);
            int d13 = AbstractC6344a.d(this, ia.c.f48250o);
            iArr2[0] = AbstractC6344a.j(d12, d11, 1.0f);
            iArr2[1] = AbstractC6344a.j(d12, d10, 1.0f);
            iArr2[2] = AbstractC6344a.j(d12, d13, 0.54f);
            iArr2[3] = AbstractC6344a.j(d12, d13, 0.38f);
            iArr2[4] = AbstractC6344a.j(d12, d13, 0.38f);
            this.f35148g = new ColorStateList(iArr, iArr2);
        }
        return this.f35148g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f35156o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final boolean c(a0 a0Var) {
        return a0Var.n(m.f48817X3, 0) == f35145z && a0Var.n(m.f48826Y3, 0) == 0;
    }

    public boolean d() {
        return this.f35151j;
    }

    public final void e() {
        this.f35153l = d.c(this.f35153l, this.f35156o, C0.c.c(this));
        this.f35154m = d.c(this.f35154m, this.f35157p, this.f35158q);
        g();
        h();
        super.setButtonDrawable(d.a(this.f35153l, this.f35154m));
        refreshDrawableState();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f35161t != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    public final void g() {
        c cVar;
        if (this.f35155n) {
            c cVar2 = this.f35163v;
            if (cVar2 != null) {
                cVar2.f(this.f35164w);
                this.f35163v.b(this.f35164w);
            }
            Drawable drawable = this.f35153l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f35163v) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(g.f48421b, g.f48448o0, cVar, false);
            ((AnimatedStateListDrawable) this.f35153l).addTransition(g.f48439k, g.f48448o0, this.f35163v, false);
        }
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f35153l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f35154m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f35157p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f35158q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f35156o;
    }

    public int getCheckedState() {
        return this.f35159r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f35152k;
    }

    public final void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f35153l;
        if (drawable != null && (colorStateList2 = this.f35156o) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f35154m;
        if (drawable2 == null || (colorStateList = this.f35157p) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f35159r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35149h && this.f35156o == null && this.f35157p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = d.e(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.f35150i || !TextUtils.isEmpty(getText()) || (a10 = C0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (o.j(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f35152k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f35165a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35165a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC5596a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f35154m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(AbstractC5596a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f35157p == colorStateList) {
            return;
        }
        this.f35157p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f35158q == mode) {
            return;
        }
        this.f35158q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f35156o == colorStateList) {
            return;
        }
        this.f35156o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f35150i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager a10;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f35159r != i10) {
            this.f35159r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f35160s) {
                return;
            }
            this.f35160s = true;
            LinkedHashSet linkedHashSet = this.f35147f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            if (this.f35159r != 2 && (onCheckedChangeListener = this.f35162u) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (a10 = T.a(getContext().getSystemService(S.a()))) != null) {
                a10.notifyValueChanged(this);
            }
            this.f35160s = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f35152k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f35151j == z10) {
            return;
        }
        this.f35151j = z10;
        refreshDrawableState();
        Iterator it = this.f35146e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f35162u = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f35161t = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f35149h = z10;
        if (z10) {
            C0.c.d(this, getMaterialThemeColorsTintList());
        } else {
            C0.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f35143x;
        this.f35146e = new LinkedHashSet();
        this.f35147f = new LinkedHashSet();
        this.f35163v = c.a(getContext(), f.f48387f);
        this.f35164w = new a();
        Context context2 = getContext();
        this.f35153l = C0.c.a(this);
        this.f35156o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        a0 j10 = xa.l.j(context2, attributeSet, m.MaterialCheckBox, i10, i11, new int[0]);
        this.f35154m = j10.g(m.f48835Z3);
        if (this.f35153l != null && xa.l.g(context2) && c(j10)) {
            super.setButtonDrawable((Drawable) null);
            this.f35153l = AbstractC5596a.b(context2, f.f48386e);
            this.f35155n = true;
            if (this.f35154m == null) {
                this.f35154m = AbstractC5596a.b(context2, f.f48388g);
            }
        }
        this.f35157p = Ca.c.b(context2, j10, m.f48845a4);
        this.f35158q = o.k(j10.k(m.f48855b4, -1), PorterDuff.Mode.SRC_IN);
        this.f35149h = j10.a(m.f48905g4, false);
        this.f35150i = j10.a(m.f48865c4, true);
        this.f35151j = j10.a(m.f48895f4, false);
        this.f35152k = j10.p(m.f48885e4);
        if (j10.s(m.f48875d4)) {
            setCheckedState(j10.k(m.f48875d4, 0));
        }
        j10.x();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f35153l = drawable;
        this.f35155n = false;
        e();
    }
}
