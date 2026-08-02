package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.chromium.net.NetError;
import xsna.am;
import xsna.anj;
import xsna.b0u0;
import xsna.biq;
import xsna.d33;
import xsna.d4g;
import xsna.dm10;
import xsna.fpo0;
import xsna.gcd0;
import xsna.h5s;
import xsna.hk;
import xsna.hqv;
import xsna.iut0;
import xsna.j1m;
import xsna.jl10;
import xsna.kgj0;
import xsna.kuw;
import xsna.ll10;
import xsna.luw;
import xsna.m33;
import xsna.mc;
import xsna.mf3;
import xsna.n8g;
import xsna.qm10;
import xsna.rko;
import xsna.rq2;
import xsna.ryo;
import xsna.t1u0;
import xsna.tb30;
import xsna.tmo;
import xsna.tpk0;
import xsna.uuj;
import xsna.uy6;
import xsna.vdo0;
import xsna.vpk;
import xsna.wog0;
import xsna.wuj;
import xsna.yyo0;
import xsna.zm10;
import xsna.zmp0;

/* loaded from: classes13.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int D0 = R$style.Widget_Design_TextInputLayout;
    public static final int[][] E0 = {new int[]{R.attr.state_pressed}, new int[0]};

    @Nullable
    public ColorStateList A;
    public boolean A0;

    @Nullable
    public ColorStateList B;
    public boolean B0;

    @Nullable
    public ColorStateList C;
    public boolean C0;
    public boolean D;
    public CharSequence E;
    public boolean F;

    @Nullable
    public MaterialShapeDrawable G;
    public MaterialShapeDrawable H;
    public StateListDrawable I;
    public boolean J;

    @Nullable
    public MaterialShapeDrawable K;

    @Nullable
    public MaterialShapeDrawable L;

    @NonNull
    public com.google.android.material.shape.a M;
    public boolean N;
    public final int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Rect W;
    public final Rect a0;

    @NonNull
    public final FrameLayout b;
    public final RectF b0;

    @NonNull
    public final tpk0 c;
    public Typeface c0;

    @NonNull
    public final com.google.android.material.textfield.a d;

    @Nullable
    public ColorDrawable d0;
    public EditText e;
    public int e0;
    public CharSequence f;
    public final LinkedHashSet<f> f0;
    public int g;

    @Nullable
    public ColorDrawable g0;
    public int h;
    public int h0;
    public int i;
    public Drawable i0;
    public int j;
    public ColorStateList j0;
    public final kuw k;
    public ColorStateList k0;
    public boolean l;
    public int l0;
    public int m;
    public int m0;
    public boolean n;
    public int n0;

    @NonNull
    public e o;
    public ColorStateList o0;

    @Nullable
    public AppCompatTextView p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int r0;
    public CharSequence s;
    public int s0;
    public boolean t;
    public int t0;
    public AppCompatTextView u;
    public int u0;

    @Nullable
    public ColorStateList v;
    public boolean v0;
    public int w;
    public final d4g w0;

    @Nullable
    public biq x;
    public boolean x0;

    @Nullable
    public biq y;
    public boolean y0;

    @Nullable
    public ColorStateList z;
    public ValueAnimator z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        @Nullable
        public CharSequence d;
        public boolean e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e = parcel.readInt() == 1;
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.d) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.d.h;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.w0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends hk {
        public final TextInputLayout b;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.b = textInputLayout;
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            TextInputLayout textInputLayout = this.b;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean z = textInputLayout.v0;
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : "";
            tpk0 tpk0Var = textInputLayout.c;
            AppCompatTextView appCompatTextView = tpk0Var.c;
            if (appCompatTextView.getVisibility() == 0) {
                amVar.a.setLabelFor(appCompatTextView);
                amVar.a.setTraversalAfter(appCompatTextView);
            } else {
                amVar.a.setTraversalAfter(tpk0Var.e);
            }
            if (!isEmpty) {
                amVar.A(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                amVar.A(charSequence);
                if (!z && placeholderText != null) {
                    amVar.A(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                amVar.A(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                amVar.a.setHintText(charSequence);
                amVar.a.setShowingHintText(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = amVar.a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = amVar.a;
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z2) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo2.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.k.y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo2.setLabelFor(appCompatTextView2);
            }
            textInputLayout.d.b().n(amVar);
        }

        @Override // xsna.hk
        public final void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.b.d.b().o(accessibilityEvent);
        }
    }

    public interface e {
    }

    public interface f {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface g {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r4, r5), attributeSet, r4);
        TypedArray typedArray;
        uuj uujVar;
        ?? r2;
        int i = R$attr.textInputStyle;
        int i2 = D0;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = new kuw(this);
        this.o = new kgj0(3);
        this.W = new Rect();
        this.a0 = new Rect();
        this.b0 = new RectF();
        this.f0 = new LinkedHashSet<>();
        d4g d4gVar = new d4g(this);
        this.w0 = d4gVar;
        this.C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = rq2.a;
        d4gVar.W = linearInterpolator;
        d4gVar.i(false);
        d4gVar.V = linearInterpolator;
        d4gVar.i(false);
        d4gVar.l(8388659);
        yyo0 e2 = fpo0.e(context2, attributeSet, R$styleable.TextInputLayout, i, i2, R$styleable.TextInputLayout_counterTextAppearance, R$styleable.TextInputLayout_counterOverflowTextAppearance, R$styleable.TextInputLayout_errorTextAppearance, R$styleable.TextInputLayout_helperTextTextAppearance, R$styleable.TextInputLayout_hintTextAppearance);
        tpk0 tpk0Var = new tpk0(this, e2);
        this.c = tpk0Var;
        int i3 = R$styleable.TextInputLayout_hintEnabled;
        TypedArray typedArray2 = e2.b;
        this.D = typedArray2.getBoolean(i3, true);
        setHint(typedArray2.getText(R$styleable.TextInputLayout_android_hint));
        this.y0 = typedArray2.getBoolean(R$styleable.TextInputLayout_hintAnimationEnabled, true);
        this.x0 = typedArray2.getBoolean(R$styleable.TextInputLayout_expandedHintEnabled, true);
        if (typedArray2.hasValue(R$styleable.TextInputLayout_android_minEms)) {
            setMinEms(typedArray2.getInt(R$styleable.TextInputLayout_android_minEms, -1));
        } else if (typedArray2.hasValue(R$styleable.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArray2.getDimensionPixelSize(R$styleable.TextInputLayout_android_minWidth, -1));
        }
        if (typedArray2.hasValue(R$styleable.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArray2.getInt(R$styleable.TextInputLayout_android_maxEms, -1));
        } else if (typedArray2.hasValue(R$styleable.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArray2.getDimensionPixelSize(R$styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.M = com.google.android.material.shape.a.c(context2, attributeSet, i, i2).a();
        this.O = context2.getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_box_label_cutout_padding);
        this.Q = typedArray2.getDimensionPixelOffset(R$styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.S = typedArray2.getDimensionPixelSize(R$styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_default));
        this.T = typedArray2.getDimensionPixelSize(R$styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_focused));
        this.R = this.S;
        float dimension = typedArray2.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArray2.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArray2.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArray2.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        com.google.android.material.shape.a aVar = this.M;
        aVar.getClass();
        new wog0();
        new wog0();
        new wog0();
        new wog0();
        new ryo();
        new ryo();
        new ryo();
        new ryo();
        wuj wujVar = aVar.a;
        wuj wujVar2 = aVar.b;
        wuj wujVar3 = aVar.c;
        wuj wujVar4 = aVar.d;
        uuj uujVar2 = aVar.e;
        uuj uujVar3 = aVar.f;
        uuj uujVar4 = aVar.g;
        uuj uujVar5 = aVar.h;
        ryo ryoVar = aVar.i;
        ryo ryoVar2 = aVar.j;
        ryo ryoVar3 = aVar.k;
        ryo ryoVar4 = aVar.l;
        if (dimension >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            typedArray = typedArray2;
            uujVar = new mc(dimension);
        } else {
            typedArray = typedArray2;
            uujVar = uujVar2;
        }
        uuj mcVar = dimension2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new mc(dimension2) : uujVar3;
        uuj mcVar2 = dimension3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new mc(dimension3) : uujVar4;
        uuj mcVar3 = dimension4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new mc(dimension4) : uujVar5;
        com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a();
        aVar2.a = wujVar;
        aVar2.b = wujVar2;
        aVar2.c = wujVar3;
        aVar2.d = wujVar4;
        aVar2.e = uujVar;
        aVar2.f = mcVar;
        aVar2.g = mcVar2;
        aVar2.h = mcVar3;
        aVar2.i = ryoVar;
        aVar2.j = ryoVar2;
        aVar2.k = ryoVar3;
        aVar2.l = ryoVar4;
        this.M = aVar2;
        ColorStateList b2 = qm10.b(context2, e2, R$styleable.TextInputLayout_boxBackgroundColor);
        if (b2 != null) {
            int defaultColor = b2.getDefaultColor();
            this.p0 = defaultColor;
            this.V = defaultColor;
            if (b2.isStateful()) {
                this.q0 = b2.getColorForState(new int[]{-16842910}, -1);
                this.r0 = b2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.s0 = b2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.r0 = this.p0;
                ColorStateList b3 = anj.b(R$color.mtrl_filled_background_color, context2);
                this.q0 = b3.getColorForState(new int[]{-16842910}, -1);
                this.s0 = b3.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
        }
        TypedArray typedArray3 = typedArray;
        if (typedArray3.hasValue(R$styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList a2 = e2.a(R$styleable.TextInputLayout_android_textColorHint);
            this.k0 = a2;
            this.j0 = a2;
        }
        ColorStateList b4 = qm10.b(context2, e2, R$styleable.TextInputLayout_boxStrokeColor);
        this.n0 = typedArray3.getColor(R$styleable.TextInputLayout_boxStrokeColor, 0);
        this.l0 = context2.getColor(R$color.mtrl_textinput_default_box_stroke_color);
        this.t0 = context2.getColor(R$color.mtrl_textinput_disabled_color);
        this.m0 = context2.getColor(R$color.mtrl_textinput_hovered_box_stroke_color);
        if (b4 != null) {
            setBoxStrokeColorStateList(b4);
        }
        if (typedArray3.hasValue(R$styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(qm10.b(context2, e2, R$styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArray3.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            r2 = 0;
            setHintTextAppearance(typedArray3.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, 0));
        } else {
            r2 = 0;
        }
        this.B = e2.a(R$styleable.TextInputLayout_cursorColor);
        this.C = e2.a(R$styleable.TextInputLayout_cursorErrorColor);
        int resourceId = typedArray3.getResourceId(R$styleable.TextInputLayout_errorTextAppearance, r2);
        CharSequence text = typedArray3.getText(R$styleable.TextInputLayout_errorContentDescription);
        int i4 = typedArray3.getInt(R$styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArray3.getBoolean(R$styleable.TextInputLayout_errorEnabled, r2);
        int resourceId2 = typedArray3.getResourceId(R$styleable.TextInputLayout_helperTextTextAppearance, r2);
        boolean z2 = typedArray3.getBoolean(R$styleable.TextInputLayout_helperTextEnabled, r2);
        CharSequence text2 = typedArray3.getText(R$styleable.TextInputLayout_helperText);
        int resourceId3 = typedArray3.getResourceId(R$styleable.TextInputLayout_placeholderTextAppearance, r2);
        CharSequence text3 = typedArray3.getText(R$styleable.TextInputLayout_placeholderText);
        boolean z3 = typedArray3.getBoolean(R$styleable.TextInputLayout_counterEnabled, r2);
        setCounterMaxLength(typedArray3.getInt(R$styleable.TextInputLayout_counterMaxLength, -1));
        this.r = typedArray3.getResourceId(R$styleable.TextInputLayout_counterTextAppearance, r2);
        this.q = typedArray3.getResourceId(R$styleable.TextInputLayout_counterOverflowTextAppearance, r2);
        setBoxBackgroundMode(typedArray3.getInt(R$styleable.TextInputLayout_boxBackgroundMode, r2));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray3.hasValue(R$styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(e2.a(R$styleable.TextInputLayout_errorTextColor));
        }
        if (typedArray3.hasValue(R$styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(e2.a(R$styleable.TextInputLayout_helperTextTextColor));
        }
        if (typedArray3.hasValue(R$styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(e2.a(R$styleable.TextInputLayout_hintTextColor));
        }
        if (typedArray3.hasValue(R$styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(e2.a(R$styleable.TextInputLayout_counterTextColor));
        }
        if (typedArray3.hasValue(R$styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(e2.a(R$styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArray3.hasValue(R$styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(e2.a(R$styleable.TextInputLayout_placeholderTextColor));
        }
        com.google.android.material.textfield.a aVar3 = new com.google.android.material.textfield.a(this, e2);
        this.d = aVar3;
        boolean z4 = typedArray3.getBoolean(R$styleable.TextInputLayout_android_enabled, true);
        e2.f();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setImportantForAccessibility(2);
        iut0.g.b(this, 1);
        frameLayout.addView(tpk0Var);
        frameLayout.addView(aVar3);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || gcd0.m(editText)) {
            return this.G;
        }
        int d2 = dm10.d(R$attr.colorControlHighlight, this.e);
        int i = this.P;
        int[][] iArr = E0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            MaterialShapeDrawable materialShapeDrawable = this.G;
            int i2 = this.V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{dm10.g(0.1f, d2, i2), i2}), materialShapeDrawable, materialShapeDrawable);
        }
        Context context = getContext();
        MaterialShapeDrawable materialShapeDrawable2 = this.G;
        TypedValue c2 = jl10.c(context, R$attr.colorSurface, "TextInputLayout");
        int i3 = c2.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : c2.data;
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.getShapeAppearanceModel());
        int g2 = dm10.g(0.1f, d2, color);
        materialShapeDrawable3.setFillColor(new ColorStateList(iArr, new int[]{g2, 0}));
        materialShapeDrawable3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{g2, color});
        MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.getShapeAppearanceModel());
        materialShapeDrawable4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], f(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = f(true);
        }
        return this.H;
    }

    public static void k(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.e = editText;
        int i = this.g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i2 = this.h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.j);
        }
        this.J = false;
        i();
        setTextInputAccessibilityDelegate(new d(this));
        Typeface typeface = this.e.getTypeface();
        d4g d4gVar = this.w0;
        boolean m = d4gVar.m(typeface);
        boolean o = d4gVar.o(typeface);
        if (m || o) {
            d4gVar.i(false);
        }
        float textSize = this.e.getTextSize();
        if (d4gVar.l != textSize) {
            d4gVar.l = textSize;
            d4gVar.i(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.e.getLetterSpacing();
        if (d4gVar.g0 != letterSpacing) {
            d4gVar.g0 = letterSpacing;
            d4gVar.i(false);
        }
        int gravity = this.e.getGravity();
        d4gVar.l((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
        if (d4gVar.j != gravity) {
            d4gVar.j = gravity;
            d4gVar.i(false);
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        this.u0 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new a(editText));
        if (this.j0 == null) {
            this.j0 = this.e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.p != null) {
            n(this.e.getText());
        }
        r();
        this.k.b();
        this.c.bringToFront();
        com.google.android.material.textfield.a aVar = this.d;
        aVar.bringToFront();
        Iterator<f> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        aVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        d4g d4gVar = this.w0;
        if (charSequence == null || !TextUtils.equals(d4gVar.G, charSequence)) {
            d4gVar.G = charSequence;
            d4gVar.H = null;
            Bitmap bitmap = d4gVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                d4gVar.K = null;
            }
            d4gVar.i(false);
        }
        if (this.v0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.t == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView != null) {
                this.b.addView(appCompatTextView);
                this.u.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.u;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.u = null;
        }
        this.t = z;
    }

    public final void a(float f2) {
        d4g d4gVar = this.w0;
        if (d4gVar.b == f2) {
            return;
        }
        if (this.z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z0 = valueAnimator;
            valueAnimator.setInterpolator(tb30.d(getContext(), R$attr.motionEasingEmphasizedInterpolator, rq2.b));
            this.z0.setDuration(tb30.c(R$attr.motionDurationMedium4, 167, getContext()));
            this.z0.addUpdateListener(new c());
        }
        this.z0.setFloatValues(d4gVar.b, f2);
        this.z0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 16;
        FrameLayout frameLayout = this.b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        MaterialShapeDrawable materialShapeDrawable = this.G;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.a shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        com.google.android.material.shape.a aVar = this.M;
        if (shapeAppearanceModel != aVar) {
            this.G.setShapeAppearanceModel(aVar);
        }
        if (this.P == 2 && (i = this.R) > -1 && (i2 = this.U) != 0) {
            this.G.setStroke(i, i2);
        }
        int i3 = this.V;
        if (this.P == 1) {
            i3 = n8g.i(this.V, dm10.b(R$attr.colorSurface, 0, getContext()));
        }
        this.V = i3;
        this.G.setFillColor(ColorStateList.valueOf(i3));
        MaterialShapeDrawable materialShapeDrawable2 = this.K;
        if (materialShapeDrawable2 != null && this.L != null) {
            if (this.R > -1 && this.U != 0) {
                materialShapeDrawable2.setFillColor(this.e.isFocused() ? ColorStateList.valueOf(this.l0) : ColorStateList.valueOf(this.U));
                this.L.setFillColor(ColorStateList.valueOf(this.U));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float e2;
        if (!this.D) {
            return 0;
        }
        int i = this.P;
        d4g d4gVar = this.w0;
        if (i == 0) {
            e2 = d4gVar.e();
        } else {
            if (i != 2) {
                return 0;
            }
            e2 = d4gVar.e() / 2.0f;
        }
        return (int) e2;
    }

    public final biq d() {
        biq biqVar = new biq();
        biqVar.setDuration(tb30.c(R$attr.motionDurationShort2, 87, getContext()));
        biqVar.setInterpolator(tb30.d(getContext(), R$attr.motionEasingLinearInterpolator, rq2.a));
        return biqVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z = this.D;
        d4g d4gVar = this.w0;
        if (z) {
            d4gVar.d(canvas);
        }
        if (this.L == null || (materialShapeDrawable = this.K) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f2 = d4gVar.b;
            int centerX = bounds2.centerX();
            bounds.left = rq2.c(centerX, bounds2.left, f2);
            bounds.right = rq2.c(centerX, bounds2.right, f2);
            this.L.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d4g d4gVar = this.w0;
        if (d4gVar != null) {
            d4gVar.R = drawableState;
            ColorStateList colorStateList2 = d4gVar.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = d4gVar.n) != null && colorStateList.isStateful())) {
                d4gVar.i(false);
                z = true;
                if (this.e != null) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z) {
                    invalidate();
                }
                this.A0 = false;
            }
        }
        z = false;
        if (this.e != null) {
        }
        r();
        x();
        if (z) {
        }
        this.A0 = false;
    }

    public final boolean e() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof vpk);
    }

    public final MaterialShapeDrawable f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.mtrl_shape_corner_size_small_component);
        float f2 = z ? dimensionPixelOffset : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        EditText editText = this.e;
        float popupElevation = editText instanceof ll10 ? ((ll10) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R$dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        wog0 wog0Var = new wog0();
        wog0 wog0Var2 = new wog0();
        wog0 wog0Var3 = new wog0();
        wog0 wog0Var4 = new wog0();
        ryo ryoVar = new ryo();
        ryo ryoVar2 = new ryo();
        ryo ryoVar3 = new ryo();
        ryo ryoVar4 = new ryo();
        mc mcVar = new mc(f2);
        mc mcVar2 = new mc(f2);
        mc mcVar3 = new mc(dimensionPixelOffset);
        mc mcVar4 = new mc(dimensionPixelOffset);
        com.google.android.material.shape.a aVar = new com.google.android.material.shape.a();
        aVar.a = wog0Var;
        aVar.b = wog0Var2;
        aVar.c = wog0Var3;
        aVar.d = wog0Var4;
        aVar.e = mcVar;
        aVar.f = mcVar2;
        aVar.g = mcVar4;
        aVar.h = mcVar3;
        aVar.i = ryoVar;
        aVar.j = ryoVar2;
        aVar.k = ryoVar3;
        aVar.l = ryoVar4;
        EditText editText2 = this.e;
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), popupElevation, editText2 instanceof ll10 ? ((ll10) editText2).getDropDownBackgroundTintList() : null);
        createWithElevationOverlay.setShapeAppearanceModel(aVar);
        createWithElevationOverlay.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return createWithElevationOverlay;
    }

    public final int g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.d.c() : this.c.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.P;
        if (i == 1 || i == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean d2 = t1u0.d(this);
        RectF rectF = this.b0;
        return d2 ? this.M.h.a(rectF) : this.M.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean d2 = t1u0.d(this);
        RectF rectF = this.b0;
        return d2 ? this.M.g.a(rectF) : this.M.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean d2 = t1u0.d(this);
        RectF rectF = this.b0;
        return d2 ? this.M.e.a(rectF) : this.M.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean d2 = t1u0.d(this);
        RectF rectF = this.b0;
        return d2 ? this.M.f.a(rectF) : this.M.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.n0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.l && this.n && (appCompatTextView = this.p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.z;
    }

    @Nullable
    public ColorStateList getCursorColor() {
        return this.B;
    }

    @Nullable
    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.j0;
    }

    @Nullable
    public EditText getEditText() {
        return this.e;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.d.h.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.d.h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.d.n;
    }

    public int getEndIconMode() {
        return this.d.j;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.d.o;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.d.h;
    }

    @Nullable
    public CharSequence getError() {
        kuw kuwVar = this.k;
        if (kuwVar.q) {
            return kuwVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.k.t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.k.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.k.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.d.d.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        kuw kuwVar = this.k;
        if (kuwVar.x) {
            return kuwVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.k.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.w0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d4g d4gVar = this.w0;
        return d4gVar.f(d4gVar.o);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.k0;
    }

    @NonNull
    public e getLengthCounter() {
        return this.o;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.d.h.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.d.h.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.c.d;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.c.c.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.c.c;
    }

    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.M;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.c.e.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.c.e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.c.h;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.c.i;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.d.q;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.d.r.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.d.r;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.c0;
    }

    public final int h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.c.a() : this.d.c());
    }

    public final void i() {
        int i = this.P;
        if (i == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i == 1) {
            this.G = new MaterialShapeDrawable(this.M);
            this.K = new MaterialShapeDrawable();
            this.L = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(h5s.c(this.P, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.D || (this.G instanceof vpk)) {
                this.G = new MaterialShapeDrawable(this.M);
            } else {
                com.google.android.material.shape.a aVar = this.M;
                int i2 = vpk.c;
                if (aVar == null) {
                    aVar = new com.google.android.material.shape.a();
                }
                vpk.a aVar2 = new vpk.a(aVar, new RectF());
                vpk.b bVar = new vpk.b(aVar2);
                bVar.b = aVar2;
                this.G = bVar;
            }
            this.K = null;
            this.L = null;
        }
        s();
        x();
        if (this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.Q = getResources().getDimensionPixelSize(R$dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (qm10.e(getContext())) {
                this.Q = getResources().getDimensionPixelSize(R$dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.e != null && this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.e;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (qm10.e(getContext())) {
                EditText editText2 = this.e;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.P != 0) {
            t();
        }
        EditText editText3 = this.e;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.P;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        float f6;
        int i2;
        if (e()) {
            int width = this.e.getWidth();
            int gravity = this.e.getGravity();
            d4g d4gVar = this.w0;
            boolean b2 = d4gVar.b(d4gVar.G);
            d4gVar.I = b2;
            Rect rect = d4gVar.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = d4gVar.j0;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = d4gVar.j0;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.b0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (d4gVar.j0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (d4gVar.I) {
                        f6 = d4gVar.j0;
                        f5 = f6 + max;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (d4gVar.I) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f6 = d4gVar.j0;
                    f5 = f6 + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = d4gVar.e() + rect.top;
                if (rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectF.height() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                float f7 = rectF.left;
                float f8 = this.O;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.R);
                vpk vpkVar = (vpk) this.G;
                vpkVar.getClass();
                vpkVar.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = d4gVar.j0 / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.b0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (d4gVar.j0 / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = d4gVar.e() + rect.top;
            if (rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
        }
    }

    public final void l(@NonNull AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(R$style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(R$color.design_error));
    }

    public final boolean m() {
        kuw kuwVar = this.k;
        return (kuwVar.o != 1 || kuwVar.r == null || TextUtils.isEmpty(kuwVar.p)) ? false : true;
    }

    public final void n(@Nullable Editable editable) {
        ((kgj0) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.n;
        int i = this.m;
        if (i == -1) {
            this.p.setText(String.valueOf(length));
            this.p.setContentDescription(null);
            this.n = false;
        } else {
            this.n = length > i;
            Context context = getContext();
            this.p.setContentDescription(context.getString(this.n ? R$string.character_counter_overflowed_content_description : R$string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.m)));
            if (z != this.n) {
                o();
            }
            uy6 c2 = uy6.c();
            AppCompatTextView appCompatTextView = this.p;
            String string = getContext().getString(R$string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.m));
            c2.getClass();
            vdo0.e eVar = vdo0.a;
            appCompatTextView.setText(string != null ? c2.d(string).toString() : null);
        }
        if (this.e == null || z == this.n) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.p;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.n ? this.q : this.r);
            if (!this.n && (colorStateList2 = this.z) != null) {
                this.p.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.A) == null) {
                return;
            }
            this.p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        com.google.android.material.textfield.a aVar = this.d;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.C0 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (max = Math.max(aVar.getMeasuredHeight(), this.c.getMeasuredHeight()))) {
            this.e.setMinimumHeight(max);
            z = true;
        }
        boolean q = q();
        if (z || q) {
            this.e.post(new mf3(this, 12));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.W;
            j1m.a(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.K;
            if (materialShapeDrawable != null) {
                int i5 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i5 - this.S, rect.right, i5);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.L;
            if (materialShapeDrawable2 != null) {
                int i6 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i6 - this.T, rect.right, i6);
            }
            if (this.D) {
                float textSize = this.e.getTextSize();
                d4g d4gVar = this.w0;
                if (d4gVar.l != textSize) {
                    d4gVar.l = textSize;
                    d4gVar.i(false);
                }
                int gravity = this.e.getGravity();
                d4gVar.l((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                if (d4gVar.j != gravity) {
                    d4gVar.j = gravity;
                    d4gVar.i(false);
                }
                if (this.e == null) {
                    throw new IllegalStateException();
                }
                boolean d2 = t1u0.d(this);
                int i7 = rect.bottom;
                Rect rect2 = this.a0;
                rect2.bottom = i7;
                int i8 = this.P;
                if (i8 == 1) {
                    rect2.left = g(rect.left, d2);
                    rect2.top = rect.top + this.Q;
                    rect2.right = h(rect.right, d2);
                } else if (i8 != 2) {
                    rect2.left = g(rect.left, d2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, d2);
                } else {
                    rect2.left = this.e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.e.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = d4gVar.h;
                if (rect3.left != i9 || rect3.top != i10 || rect3.right != i11 || rect3.bottom != i12) {
                    rect3.set(i9, i10, i11, i12);
                    d4gVar.S = true;
                }
                if (this.e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = d4gVar.U;
                textPaint.setTextSize(d4gVar.l);
                textPaint.setTypeface(d4gVar.z);
                textPaint.setLetterSpacing(d4gVar.g0);
                float f2 = -textPaint.ascent();
                rect2.left = this.e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.P != 1 || this.e.getMinLines() > 1) ? rect.top + this.e.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.P != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = d4gVar.g;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    d4gVar.S = true;
                }
                d4gVar.i(false);
                if (!e() || this.v0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.C0;
        com.google.android.material.textfield.a aVar = this.d;
        if (!z) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        if (this.u != null && (editText = this.e) != null) {
            this.u.setGravity(editText.getGravity());
            this.u.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        aVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        setError(savedState.d);
        if (savedState.e) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.N) {
            uuj uujVar = this.M.e;
            RectF rectF = this.b0;
            float a2 = uujVar.a(rectF);
            float a3 = this.M.f.a(rectF);
            float a4 = this.M.h.a(rectF);
            float a5 = this.M.g.a(rectF);
            com.google.android.material.shape.a aVar = this.M;
            wuj wujVar = aVar.a;
            wuj wujVar2 = aVar.b;
            wuj wujVar3 = aVar.d;
            wuj wujVar4 = aVar.c;
            a.C0123a c0123a = new a.C0123a();
            c0123a.a = wujVar2;
            float b2 = a.C0123a.b(wujVar2);
            if (b2 != -1.0f) {
                c0123a.n(b2);
            }
            c0123a.b = wujVar;
            float b3 = a.C0123a.b(wujVar);
            if (b3 != -1.0f) {
                c0123a.q(b3);
            }
            c0123a.f(wujVar4);
            c0123a.j(wujVar3);
            c0123a.n(a3);
            c0123a.q(a2);
            c0123a.g(a5);
            c0123a.k(a4);
            com.google.android.material.shape.a a6 = c0123a.a();
            this.N = z;
            setShapeAppearanceModel(a6);
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.d = getError();
        }
        com.google.android.material.textfield.a aVar = this.d;
        savedState.e = aVar.j != 0 && aVar.h.e;
        return savedState;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.B;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue a2 = jl10.a(R$attr.colorControlActivated, context);
            if (a2 != null) {
                int i = a2.resourceId;
                if (i != 0) {
                    colorStateList2 = anj.b(i, context);
                } else {
                    int i2 = a2.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.e;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.e.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.p != null && this.n)) && (colorStateList = this.C) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z;
        com.google.android.material.textfield.a aVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            tpk0 tpk0Var = this.c;
            if (tpk0Var.getMeasuredWidth() > 0) {
                int measuredWidth = tpk0Var.getMeasuredWidth() - this.e.getPaddingLeft();
                if (this.d0 == null || this.e0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.d0 = colorDrawable3;
                    this.e0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.d0;
                if (drawable2 != colorDrawable4) {
                    this.e.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    aVar = this.d;
                    if ((!aVar.e() || ((aVar.j != 0 && aVar.d()) || aVar.q != null)) && aVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = aVar.r.getMeasuredWidth() - this.e.getPaddingRight();
                        if (!aVar.e()) {
                            checkableImageButton = aVar.d;
                        } else if (aVar.j != 0 && aVar.d()) {
                            checkableImageButton = aVar.h;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                        colorDrawable = this.g0;
                        if (colorDrawable == null && this.h0 != measuredWidth2) {
                            this.h0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.g0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.g0 = colorDrawable5;
                            this.h0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.g0;
                        if (drawable != colorDrawable2) {
                            this.i0 = drawable;
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.g0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.g0) {
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.i0, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.g0 = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                aVar = this.d;
                if (aVar.e()) {
                }
                int measuredWidth22 = aVar.r.getMeasuredWidth() - this.e.getPaddingRight();
                if (!aVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                colorDrawable = this.g0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.g0;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.d0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.d0 = null;
            z = true;
            aVar = this.d;
            if (aVar.e()) {
            }
            int measuredWidth222 = aVar.r.getMeasuredWidth() - this.e.getPaddingRight();
            if (!aVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
            colorDrawable = this.g0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.g0;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        aVar = this.d;
        if (aVar.e()) {
        }
        int measuredWidth2222 = aVar.r.getMeasuredWidth() - this.e.getPaddingRight();
        if (!aVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
        colorDrawable = this.g0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.g0;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = rko.a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(d33.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (appCompatTextView = this.p) != null) {
            mutate.setColorFilter(d33.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.e;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            editText2.setBackground(editTextBoxBackground);
            this.J = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.V != i) {
            this.V = i;
            this.p0 = i;
            this.r0 = i;
            this.s0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.p0 = defaultColor;
        this.V = defaultColor;
        this.q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.P) {
            return;
        }
        this.P = i;
        if (this.e != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.Q = i;
    }

    public void setBoxCornerFamily(int i) {
        com.google.android.material.shape.a aVar = this.M;
        aVar.getClass();
        a.C0123a c0123a = new a.C0123a(aVar);
        c0123a.m(i, this.M.e);
        c0123a.p(i, this.M.f);
        c0123a.e(i, this.M.h);
        c0123a.i(i, this.M.g);
        this.M = c0123a.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.n0 != i) {
            this.n0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.l0 = colorStateList.getDefaultColor();
            this.t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.n0 != colorStateList.getDefaultColor()) {
            this.n0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.S = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.T = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            kuw kuwVar = this.k;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.p = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_counter);
                Typeface typeface = this.c0;
                if (typeface != null) {
                    this.p.setTypeface(typeface);
                }
                this.p.setMaxLines(1);
                kuwVar.a(this.p, 2);
                ((ViewGroup.MarginLayoutParams) this.p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.p != null) {
                    EditText editText = this.e;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                kuwVar.g(this.p, 2);
                this.p = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i > 0) {
                this.m = i;
            } else {
                this.m = -1;
            }
            if (!this.l || this.p == null) {
                return;
            }
            EditText editText = this.e;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.r != i) {
            this.r = i;
            o();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            o();
        }
    }

    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (m() || (this.p != null && this.n)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.j0 = colorStateList;
        this.k0 = colorStateList;
        if (this.e != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.d.h.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.d.h.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        com.google.android.material.textfield.a aVar = this.d;
        CharSequence text = i != 0 ? aVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = aVar.h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.d;
        Drawable a2 = i != 0 ? m33.a(i, aVar.getContext()) : null;
        TextInputLayout textInputLayout = aVar.b;
        CheckableImageButton checkableImageButton = aVar.h;
        checkableImageButton.setImageDrawable(a2);
        if (a2 != null) {
            hqv.a(textInputLayout, checkableImageButton, aVar.l, aVar.m);
            hqv.c(textInputLayout, checkableImageButton, aVar.l);
        }
    }

    public void setEndIconMinSize(int i) {
        com.google.android.material.textfield.a aVar = this.d;
        if (i < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != aVar.n) {
            aVar.n = i;
            CheckableImageButton checkableImageButton = aVar.h;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = aVar.d;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.d.g(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.d;
        CheckableImageButton checkableImageButton = aVar.h;
        View.OnLongClickListener onLongClickListener = aVar.p;
        checkableImageButton.setOnClickListener(onClickListener);
        hqv.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.p = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hqv.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.o = scaleType;
        aVar.h.setScaleType(scaleType);
        aVar.d.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.d;
        if (aVar.l != colorStateList) {
            aVar.l = colorStateList;
            hqv.a(aVar.b, aVar.h, colorStateList, aVar.m);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.d;
        if (aVar.m != mode) {
            aVar.m = mode;
            hqv.a(aVar.b, aVar.h, aVar.l, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.d.h(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        kuw kuwVar = this.k;
        if (!kuwVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            kuwVar.f();
            return;
        }
        kuwVar.c();
        kuwVar.p = charSequence;
        kuwVar.r.setText(charSequence);
        int i = kuwVar.n;
        if (i != 1) {
            kuwVar.o = 1;
        }
        kuwVar.i(i, kuwVar.o, kuwVar.h(kuwVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        kuw kuwVar = this.k;
        kuwVar.t = i;
        AppCompatTextView appCompatTextView = kuwVar.r;
        if (appCompatTextView != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        kuw kuwVar = this.k;
        kuwVar.s = charSequence;
        AppCompatTextView appCompatTextView = kuwVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        kuw kuwVar = this.k;
        TextInputLayout textInputLayout = kuwVar.h;
        if (kuwVar.q == z) {
            return;
        }
        kuwVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(kuwVar.g);
            kuwVar.r = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_error);
            kuwVar.r.setTextAlignment(5);
            Typeface typeface = kuwVar.B;
            if (typeface != null) {
                kuwVar.r.setTypeface(typeface);
            }
            int i = kuwVar.u;
            kuwVar.u = i;
            AppCompatTextView appCompatTextView2 = kuwVar.r;
            if (appCompatTextView2 != null) {
                kuwVar.h.l(appCompatTextView2, i);
            }
            ColorStateList colorStateList = kuwVar.v;
            kuwVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = kuwVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = kuwVar.s;
            kuwVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = kuwVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = kuwVar.t;
            kuwVar.t = i2;
            AppCompatTextView appCompatTextView5 = kuwVar.r;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            kuwVar.r.setVisibility(4);
            kuwVar.a(kuwVar.r, 0);
        } else {
            kuwVar.f();
            kuwVar.g(kuwVar.r, 0);
            kuwVar.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        kuwVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.i(i != 0 ? m33.a(i, aVar.getContext()) : null);
        hqv.c(aVar.b, aVar.d, aVar.e);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.d;
        CheckableImageButton checkableImageButton = aVar.d;
        View.OnLongClickListener onLongClickListener = aVar.g;
        checkableImageButton.setOnClickListener(onClickListener);
        hqv.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.g = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hqv.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.d;
        if (aVar.e != colorStateList) {
            aVar.e = colorStateList;
            hqv.a(aVar.b, aVar.d, colorStateList, aVar.f);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.d;
        if (aVar.f != mode) {
            aVar.f = mode;
            hqv.a(aVar.b, aVar.d, aVar.e, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        kuw kuwVar = this.k;
        kuwVar.u = i;
        AppCompatTextView appCompatTextView = kuwVar.r;
        if (appCompatTextView != null) {
            kuwVar.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        kuw kuwVar = this.k;
        kuwVar.v = colorStateList;
        AppCompatTextView appCompatTextView = kuwVar.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            u(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        kuw kuwVar = this.k;
        if (isEmpty) {
            if (kuwVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!kuwVar.x) {
            setHelperTextEnabled(true);
        }
        kuwVar.c();
        kuwVar.w = charSequence;
        kuwVar.y.setText(charSequence);
        int i = kuwVar.n;
        if (i != 2) {
            kuwVar.o = 2;
        }
        kuwVar.i(i, kuwVar.o, kuwVar.h(kuwVar.y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        kuw kuwVar = this.k;
        kuwVar.A = colorStateList;
        AppCompatTextView appCompatTextView = kuwVar.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        kuw kuwVar = this.k;
        TextInputLayout textInputLayout = kuwVar.h;
        if (kuwVar.x == z) {
            return;
        }
        kuwVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(kuwVar.g);
            kuwVar.y = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_helper_text);
            kuwVar.y.setTextAlignment(5);
            Typeface typeface = kuwVar.B;
            if (typeface != null) {
                kuwVar.y.setTypeface(typeface);
            }
            kuwVar.y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = kuwVar.y;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i = kuwVar.z;
            kuwVar.z = i;
            AppCompatTextView appCompatTextView3 = kuwVar.y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = kuwVar.A;
            kuwVar.A = colorStateList;
            AppCompatTextView appCompatTextView4 = kuwVar.y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            kuwVar.a(kuwVar.y, 1);
            kuwVar.y.setAccessibilityDelegate(new luw(kuwVar));
        } else {
            kuwVar.c();
            int i2 = kuwVar.n;
            if (i2 == 2) {
                kuwVar.o = 0;
            }
            kuwVar.i(i2, kuwVar.o, kuwVar.h(kuwVar.y, ""));
            kuwVar.g(kuwVar.y, 1);
            kuwVar.y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        kuwVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        kuw kuwVar = this.k;
        kuwVar.z = i;
        AppCompatTextView appCompatTextView = kuwVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.y0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.D) {
            this.D = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d4g d4gVar = this.w0;
        d4gVar.k(i);
        this.k0 = d4gVar.o;
        if (this.e != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            if (this.j0 == null) {
                d4g d4gVar = this.w0;
                if (d4gVar.o != colorStateList) {
                    d4gVar.o = colorStateList;
                    d4gVar.i(false);
                }
            }
            this.k0 = colorStateList;
            if (this.e != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull e eVar) {
        this.o = eVar;
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.h.setContentDescription(i != 0 ? aVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.h.setImageDrawable(i != 0 ? m33.a(i, aVar.getContext()) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        com.google.android.material.textfield.a aVar = this.d;
        if (z && aVar.j != 1) {
            aVar.g(1);
        } else if (z) {
            aVar.getClass();
        } else {
            aVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.l = colorStateList;
        hqv.a(aVar.b, aVar.h, colorStateList, aVar.m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.m = mode;
        hqv.a(aVar.b, aVar.h, aVar.l, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.u = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.u;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            appCompatTextView2.setImportantForAccessibility(2);
            biq d2 = d();
            this.x = d2;
            d2.setStartDelay(67L);
            this.y = d();
            setPlaceholderTextAppearance(this.w);
            setPlaceholderTextColor(this.v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        EditText editText = this.e;
        v(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.w = i;
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        tpk0 tpk0Var = this.c;
        tpk0Var.getClass();
        tpk0Var.d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        tpk0Var.c.setText(charSequence);
        tpk0Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.c.c.setTextAppearance(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.c.c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        MaterialShapeDrawable materialShapeDrawable = this.G;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == aVar) {
            return;
        }
        this.M = aVar;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.c.e.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? m33.a(i, getContext()) : null);
    }

    public void setStartIconMinSize(int i) {
        tpk0 tpk0Var = this.c;
        if (i < 0) {
            tpk0Var.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != tpk0Var.h) {
            tpk0Var.h = i;
            CheckableImageButton checkableImageButton = tpk0Var.e;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        tpk0 tpk0Var = this.c;
        CheckableImageButton checkableImageButton = tpk0Var.e;
        View.OnLongClickListener onLongClickListener = tpk0Var.j;
        checkableImageButton.setOnClickListener(onClickListener);
        hqv.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        tpk0 tpk0Var = this.c;
        tpk0Var.j = onLongClickListener;
        CheckableImageButton checkableImageButton = tpk0Var.e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        hqv.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        tpk0 tpk0Var = this.c;
        tpk0Var.i = scaleType;
        tpk0Var.e.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        tpk0 tpk0Var = this.c;
        if (tpk0Var.f != colorStateList) {
            tpk0Var.f = colorStateList;
            hqv.a(tpk0Var.b, tpk0Var.e, colorStateList, tpk0Var.g);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        tpk0 tpk0Var = this.c;
        if (tpk0Var.g != mode) {
            tpk0Var.g = mode;
            hqv.a(tpk0Var.b, tpk0Var.e, tpk0Var.f, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.c.c(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.d;
        aVar.getClass();
        aVar.q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.r.setText(charSequence);
        aVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.d.r.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.d.r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable d dVar) {
        EditText editText = this.e;
        if (editText != null) {
            iut0.q(editText, dVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.c0) {
            this.c0 = typeface;
            d4g d4gVar = this.w0;
            boolean m = d4gVar.m(typeface);
            boolean o = d4gVar.o(typeface);
            if (m || o) {
                d4gVar.i(false);
            }
            kuw kuwVar = this.k;
            if (typeface != kuwVar.B) {
                kuwVar.B = typeface;
                AppCompatTextView appCompatTextView = kuwVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = kuwVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.P != 1) {
            FrameLayout frameLayout = this.b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.j0;
        d4g d4gVar = this.w0;
        if (colorStateList2 != null) {
            d4gVar.j(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.j0;
            d4gVar.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.t0) : this.t0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.k.r;
            d4gVar.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.n && (appCompatTextView = this.p) != null) {
            d4gVar.j(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.k0) != null && d4gVar.o != colorStateList) {
            d4gVar.o = colorStateList;
            d4gVar.i(false);
        }
        com.google.android.material.textfield.a aVar = this.d;
        tpk0 tpk0Var = this.c;
        if (z3 || !this.x0 || (isEnabled() && z4)) {
            if (z2 || this.v0) {
                ValueAnimator valueAnimator = this.z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.z0.cancel();
                }
                if (z && this.y0) {
                    a(1.0f);
                } else {
                    d4gVar.p(1.0f);
                }
                this.v0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.e;
                v(editText3 != null ? editText3.getText() : null);
                tpk0Var.k = false;
                tpk0Var.e();
                aVar.s = false;
                aVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.v0) {
            ValueAnimator valueAnimator2 = this.z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.z0.cancel();
            }
            if (z && this.y0) {
                a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                d4gVar.p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (e() && !((vpk) this.G).b.v.isEmpty() && e()) {
                ((vpk) this.G).b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.v0 = true;
            AppCompatTextView appCompatTextView3 = this.u;
            if (appCompatTextView3 != null && this.t) {
                appCompatTextView3.setText((CharSequence) null);
                zmp0.a(this.b, this.y);
                this.u.setVisibility(4);
            }
            tpk0Var.k = true;
            tpk0Var.e();
            aVar.s = true;
            aVar.n();
        }
    }

    public final void v(@Nullable Editable editable) {
        ((kgj0) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.b;
        if (length != 0 || this.v0) {
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || !this.t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            zmp0.a(frameLayout, this.y);
            this.u.setVisibility(4);
            return;
        }
        if (this.u == null || !this.t || TextUtils.isEmpty(this.s)) {
            return;
        }
        this.u.setText(this.s);
        zmp0.a(frameLayout, this.x);
        this.u.setVisibility(0);
        this.u.bringToFront();
        announceForAccessibility(this.s);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.o0.getDefaultColor();
        int colorForState = this.o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.U = colorForState2;
        } else if (z2) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    public final void x() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.U = this.t0;
        } else if (m()) {
            if (this.o0 != null) {
                w(z2, z);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.n || (appCompatTextView = this.p) == null) {
            if (z2) {
                this.U = this.n0;
            } else if (z) {
                this.U = this.m0;
            } else {
                this.U = this.l0;
            }
        } else if (this.o0 != null) {
            w(z2, z);
        } else {
            this.U = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        com.google.android.material.textfield.a aVar = this.d;
        TextInputLayout textInputLayout = aVar.b;
        CheckableImageButton checkableImageButton = aVar.h;
        TextInputLayout textInputLayout2 = aVar.b;
        aVar.l();
        hqv.c(textInputLayout2, aVar.d, aVar.e);
        hqv.c(textInputLayout2, checkableImageButton, aVar.l);
        if (aVar.b() instanceof tmo) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                hqv.a(textInputLayout, checkableImageButton, aVar.l, aVar.m);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        tpk0 tpk0Var = this.c;
        hqv.c(tpk0Var.b, tpk0Var.e, tpk0Var.f);
        if (this.P == 2) {
            int i = this.R;
            if (z2 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i && e() && !this.v0) {
                if (e()) {
                    ((vpk) this.G).b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                j();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.q0;
            } else if (z && !z2) {
                this.V = this.s0;
            } else if (z2) {
                this.V = this.r0;
            } else {
                this.V = this.p0;
            }
        }
        b();
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.c.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.d.h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.d.h.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.d.i(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.d.h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.d;
        TextInputLayout textInputLayout = aVar.b;
        CheckableImageButton checkableImageButton = aVar.h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            hqv.a(textInputLayout, checkableImageButton, aVar.l, aVar.m);
            hqv.c(textInputLayout, checkableImageButton, aVar.l);
        }
    }

    public class a implements TextWatcher {
        public int b;
        public final /* synthetic */ EditText c;

        public a(EditText editText) {
            this.c = editText;
            this.b = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u(!textInputLayout.B0, false);
            if (textInputLayout.l) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.t) {
                textInputLayout.v(editable);
            }
            EditText editText = this.c;
            int lineCount = editText.getLineCount();
            int i = this.b;
            if (lineCount != i) {
                if (lineCount < i) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    int minimumHeight = editText.getMinimumHeight();
                    int i2 = textInputLayout.u0;
                    if (minimumHeight != i2) {
                        editText.setMinimumHeight(i2);
                    }
                }
                this.b = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
