package com.google.android.material.textfield;

import C0.j;
import Ja.AbstractC1358h;
import Ja.r;
import Ja.u;
import Ja.y;
import L2.C1378c;
import L2.v;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C2053h;
import androidx.appcompat.widget.C2068x;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.a0;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.i;
import com.google.android.material.shape.n;
import com.google.android.material.textfield.TextInputLayout;
import com.plaid.internal.EnumC3631g;
import ia.k;
import ia.l;
import ia.m;
import ja.AbstractC5104a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.AbstractC5335a;
import l0.AbstractC5338c;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import sa.AbstractC6344a;
import w0.C6695a;
import xa.AbstractC6816b;
import xa.C6815a;
import xa.o;
import y0.z;
import za.h;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: l5, reason: collision with root package name */
    public static final int f36240l5 = l.f48580s;

    /* renamed from: m5, reason: collision with root package name */
    public static final int[][] f36241m5 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f36242A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f36243B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f36244C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f36245D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f36246E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f36247F;

    /* renamed from: G, reason: collision with root package name */
    public i f36248G;

    /* renamed from: H, reason: collision with root package name */
    public i f36249H;

    /* renamed from: I, reason: collision with root package name */
    public StateListDrawable f36250I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f36251J;

    /* renamed from: K, reason: collision with root package name */
    public i f36252K;

    /* renamed from: L, reason: collision with root package name */
    public i f36253L;

    /* renamed from: O, reason: collision with root package name */
    public n f36254O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f36255P;

    /* renamed from: P4, reason: collision with root package name */
    public int f36256P4;

    /* renamed from: Q4, reason: collision with root package name */
    public Drawable f36257Q4;

    /* renamed from: R, reason: collision with root package name */
    public final int f36258R;

    /* renamed from: R4, reason: collision with root package name */
    public ColorStateList f36259R4;

    /* renamed from: S4, reason: collision with root package name */
    public ColorStateList f36260S4;

    /* renamed from: T, reason: collision with root package name */
    public int f36261T;

    /* renamed from: T1, reason: collision with root package name */
    public final Rect f36262T1;

    /* renamed from: T4, reason: collision with root package name */
    public int f36263T4;

    /* renamed from: U4, reason: collision with root package name */
    public int f36264U4;

    /* renamed from: V, reason: collision with root package name */
    public int f36265V;

    /* renamed from: V1, reason: collision with root package name */
    public final RectF f36266V1;

    /* renamed from: V4, reason: collision with root package name */
    public int f36267V4;

    /* renamed from: W, reason: collision with root package name */
    public int f36268W;

    /* renamed from: W4, reason: collision with root package name */
    public ColorStateList f36269W4;

    /* renamed from: X4, reason: collision with root package name */
    public int f36270X4;

    /* renamed from: Y4, reason: collision with root package name */
    public int f36271Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public int f36272Z4;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f36273a;

    /* renamed from: a5, reason: collision with root package name */
    public int f36274a5;

    /* renamed from: b, reason: collision with root package name */
    public final y f36275b;

    /* renamed from: b1, reason: collision with root package name */
    public int f36276b1;

    /* renamed from: b2, reason: collision with root package name */
    public Typeface f36277b2;

    /* renamed from: b5, reason: collision with root package name */
    public int f36278b5;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.material.textfield.a f36279c;

    /* renamed from: c5, reason: collision with root package name */
    public int f36280c5;

    /* renamed from: d, reason: collision with root package name */
    public final int f36281d;

    /* renamed from: d5, reason: collision with root package name */
    public boolean f36282d5;

    /* renamed from: e, reason: collision with root package name */
    public EditText f36283e;

    /* renamed from: e5, reason: collision with root package name */
    public final C6815a f36284e5;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f36285f;

    /* renamed from: f5, reason: collision with root package name */
    public boolean f36286f5;

    /* renamed from: g, reason: collision with root package name */
    public int f36287g;

    /* renamed from: g1, reason: collision with root package name */
    public int f36288g1;

    /* renamed from: g2, reason: collision with root package name */
    public Drawable f36289g2;

    /* renamed from: g5, reason: collision with root package name */
    public boolean f36290g5;

    /* renamed from: h, reason: collision with root package name */
    public int f36291h;

    /* renamed from: h5, reason: collision with root package name */
    public ValueAnimator f36292h5;

    /* renamed from: i, reason: collision with root package name */
    public int f36293i;

    /* renamed from: i5, reason: collision with root package name */
    public boolean f36294i5;

    /* renamed from: j, reason: collision with root package name */
    public int f36295j;

    /* renamed from: j5, reason: collision with root package name */
    public boolean f36296j5;

    /* renamed from: k, reason: collision with root package name */
    public final u f36297k;

    /* renamed from: k5, reason: collision with root package name */
    public boolean f36298k5;

    /* renamed from: l, reason: collision with root package name */
    public boolean f36299l;

    /* renamed from: m, reason: collision with root package name */
    public int f36300m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36301n;

    /* renamed from: o, reason: collision with root package name */
    public f f36302o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f36303p;

    /* renamed from: p1, reason: collision with root package name */
    public int f36304p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f36305p2;

    /* renamed from: q, reason: collision with root package name */
    public int f36306q;

    /* renamed from: r, reason: collision with root package name */
    public int f36307r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f36308s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36309t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f36310u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f36311v;

    /* renamed from: w, reason: collision with root package name */
    public int f36312w;

    /* renamed from: x, reason: collision with root package name */
    public C1378c f36313x;

    /* renamed from: x1, reason: collision with root package name */
    public int f36314x1;

    /* renamed from: x2, reason: collision with root package name */
    public final LinkedHashSet f36315x2;

    /* renamed from: y, reason: collision with root package name */
    public C1378c f36316y;

    /* renamed from: y1, reason: collision with root package name */
    public final Rect f36317y1;

    /* renamed from: y2, reason: collision with root package name */
    public Drawable f36318y2;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f36319z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f36320c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f36321d;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f36320c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f36320c, parcel, i10);
            parcel.writeInt(this.f36321d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f36320c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f36321d = parcel.readInt() == 1;
        }
    }

    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public int f36322a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f36323b;

        public a(EditText editText) {
            this.f36323b = editText;
            this.f36322a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.f36296j5);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f36299l) {
                textInputLayout.l0(editable);
            }
            if (TextInputLayout.this.f36309t) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.f36323b.getLineCount();
            int i10 = this.f36322a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int minimumHeight = this.f36323b.getMinimumHeight();
                    int i11 = TextInputLayout.this.f36280c5;
                    if (minimumHeight != i11) {
                        this.f36323b.setMinimumHeight(i11);
                    }
                }
                this.f36322a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b extends C2075a {
        public b() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.d1(false);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f36279c.h();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f36284e5.D0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C2075a {

        /* renamed from: a, reason: collision with root package name */
        public final TextInputLayout f36328a;

        public e(TextInputLayout textInputLayout) {
            this.f36328a = textInputLayout;
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            EditText editText = this.f36328a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f36328a.getHint();
            CharSequence error = this.f36328a.getError();
            CharSequence placeholderText = this.f36328a.getPlaceholderText();
            int counterMaxLength = this.f36328a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f36328a.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean Q10 = this.f36328a.Q();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : "";
            this.f36328a.f36275b.A(zVar);
            if (!isEmpty) {
                zVar.Z0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                zVar.Z0(charSequence);
                if (!Q10 && placeholderText != null) {
                    zVar.Z0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                zVar.Z0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    zVar.I0(charSequence);
                } else {
                    if (!isEmpty) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    zVar.Z0(charSequence);
                }
                zVar.V0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            zVar.L0(counterMaxLength);
            if (z10) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                zVar.D0(error);
            }
            View t10 = this.f36328a.f36297k.t();
            if (t10 != null) {
                zVar.J0(t10);
            }
            this.f36328a.f36279c.m().o(view, zVar);
        }

        @Override // androidx.core.view.C2075a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f36328a.f36279c.m().p(view, accessibilityEvent);
        }
    }

    public interface f {
        int a(Editable editable);
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48269x0);
    }

    public static Drawable I(i iVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC6344a.j(i11, i10, 0.1f), i10}), iVar, iVar);
    }

    public static Drawable L(Context context, i iVar, int i10, int[][] iArr) {
        int c10 = AbstractC6344a.c(context, ia.c.f48260t, "TextInputLayout");
        i iVar2 = new i(iVar.H());
        int j10 = AbstractC6344a.j(i10, c10, 0.1f);
        iVar2.f0(new ColorStateList(iArr, new int[]{j10, 0}));
        iVar2.setTint(c10);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j10, c10});
        i iVar3 = new i(iVar.H());
        iVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar2, iVar3), iVar});
    }

    public static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f36283e;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.f36248G;
        }
        int d10 = AbstractC6344a.d(this.f36283e, AbstractC5335a.f55005t);
        int i10 = this.f36261T;
        if (i10 == 2) {
            return L(getContext(), this.f36248G, d10, f36241m5);
        }
        if (i10 == 1) {
            return I(this.f36248G, this.f36314x1, d10, f36241m5);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f36250I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f36250I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f36250I.addState(new int[0], H(false));
        }
        return this.f36250I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f36249H == null) {
            this.f36249H = H(true);
        }
        return this.f36249H;
    }

    public static void m0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? k.f48525c : k.f48523b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f36283e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f36283e = editText;
        int i10 = this.f36287g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f36293i);
        }
        int i11 = this.f36291h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f36295j);
        }
        this.f36251J = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.f36284e5.R0(this.f36283e.getTypeface());
        this.f36284e5.A0(this.f36283e.getTextSize());
        this.f36284e5.u0(this.f36283e.getLetterSpacing());
        int gravity = this.f36283e.getGravity();
        this.f36284e5.m0((gravity & (-113)) | 48);
        this.f36284e5.z0(gravity);
        this.f36280c5 = editText.getMinimumHeight();
        this.f36283e.addTextChangedListener(new a(editText));
        if (this.f36259R4 == null) {
            this.f36259R4 = this.f36283e.getHintTextColors();
        }
        if (this.f36245D) {
            if (TextUtils.isEmpty(this.f36246E)) {
                CharSequence hint = this.f36283e.getHint();
                this.f36285f = hint;
                setHint(hint);
                this.f36283e.setHint((CharSequence) null);
            }
            this.f36247F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.f36303p != null) {
            l0(this.f36283e.getText());
        }
        q0();
        this.f36297k.f();
        this.f36275b.bringToFront();
        this.f36279c.bringToFront();
        D();
        this.f36279c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f36246E)) {
            return;
        }
        this.f36246E = charSequence;
        this.f36284e5.O0(charSequence);
        if (this.f36282d5) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f36309t == z10) {
            return;
        }
        if (z10) {
            k();
        } else {
            a0();
            this.f36310u = null;
        }
        this.f36309t = z10;
    }

    public final void A(boolean z10) {
        ValueAnimator valueAnimator = this.f36292h5;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f36292h5.cancel();
        }
        if (z10 && this.f36290g5) {
            m(1.0f);
        } else {
            this.f36284e5.D0(1.0f);
        }
        this.f36282d5 = false;
        if (C()) {
            W();
        }
        z0();
        this.f36275b.l(false);
        this.f36279c.H(false);
    }

    public final void A0(Editable editable) {
        if (this.f36302o.a(editable) != 0 || this.f36282d5) {
            M();
        } else {
            g0();
        }
    }

    public final C1378c B() {
        C1378c c1378c = new C1378c();
        c1378c.h0(h.f(getContext(), ia.c.f48218W, 87));
        c1378c.j0(h.g(getContext(), ia.c.f48227c0, AbstractC5104a.f53858a));
        return c1378c;
    }

    public final void B0(boolean z10, boolean z11) {
        int defaultColor = this.f36269W4.getDefaultColor();
        int colorForState = this.f36269W4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f36269W4.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f36304p1 = colorForState2;
        } else if (z11) {
            this.f36304p1 = colorForState;
        } else {
            this.f36304p1 = defaultColor;
        }
    }

    public final boolean C() {
        return this.f36245D && !TextUtils.isEmpty(this.f36246E) && (this.f36248G instanceof AbstractC1358h);
    }

    public void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f36248G == null || this.f36261T == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f36283e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f36283e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f36304p1 = this.f36278b5;
        } else if (d0()) {
            if (this.f36269W4 != null) {
                B0(z11, z10);
            } else {
                this.f36304p1 = getErrorCurrentTextColors();
            }
        } else if (!this.f36301n || (textView = this.f36303p) == null) {
            if (z11) {
                this.f36304p1 = this.f36267V4;
            } else if (z10) {
                this.f36304p1 = this.f36264U4;
            } else {
                this.f36304p1 = this.f36263T4;
            }
        } else if (this.f36269W4 != null) {
            B0(z11, z10);
        } else {
            this.f36304p1 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f36279c.I();
        Z();
        if (this.f36261T == 2) {
            int i10 = this.f36268W;
            if (z11 && isEnabled()) {
                this.f36268W = this.f36288g1;
            } else {
                this.f36268W = this.f36276b1;
            }
            if (this.f36268W != i10) {
                X();
            }
        }
        if (this.f36261T == 1) {
            if (!isEnabled()) {
                this.f36314x1 = this.f36271Y4;
            } else if (z10 && !z11) {
                this.f36314x1 = this.f36274a5;
            } else if (z11) {
                this.f36314x1 = this.f36272Z4;
            } else {
                this.f36314x1 = this.f36270X4;
            }
        }
        n();
    }

    public final void D() {
        Iterator it = this.f36315x2.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    public final void E(Canvas canvas) {
        i iVar;
        if (this.f36253L == null || (iVar = this.f36252K) == null) {
            return;
        }
        iVar.draw(canvas);
        if (this.f36283e.isFocused()) {
            Rect bounds = this.f36253L.getBounds();
            Rect bounds2 = this.f36252K.getBounds();
            float H10 = this.f36284e5.H();
            int centerX = bounds2.centerX();
            bounds.left = AbstractC5104a.c(centerX, bounds2.left, H10);
            bounds.right = AbstractC5104a.c(centerX, bounds2.right, H10);
            this.f36253L.draw(canvas);
        }
    }

    public final void F(Canvas canvas) {
        if (this.f36245D) {
            this.f36284e5.k(canvas);
        }
    }

    public final void G(boolean z10) {
        ValueAnimator valueAnimator = this.f36292h5;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f36292h5.cancel();
        }
        if (z10 && this.f36290g5) {
            m(0.0f);
        } else {
            this.f36284e5.D0(0.0f);
        }
        if (C() && ((AbstractC1358h) this.f36248G).z0()) {
            z();
        }
        this.f36282d5 = true;
        M();
        this.f36275b.l(true);
        this.f36279c.H(true);
    }

    public final i H(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ia.e.f48292B0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f36283e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ia.e.f48297E);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ia.e.f48369t0);
        n m10 = n.a().E(f10).J(f10).v(dimensionPixelOffset).z(dimensionPixelOffset).m();
        EditText editText2 = this.f36283e;
        i r10 = i.r(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        r10.setShapeAppearanceModel(m10);
        r10.i0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return r10;
    }

    public final int J(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f36283e.getCompoundPaddingLeft() : this.f36279c.y() : this.f36275b.c());
    }

    public final int K(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f36283e.getCompoundPaddingRight() : this.f36275b.c() : this.f36279c.y());
    }

    public final void M() {
        TextView textView = this.f36310u;
        if (textView == null || !this.f36309t) {
            return;
        }
        textView.setText((CharSequence) null);
        v.a(this.f36273a, this.f36316y);
        this.f36310u.setVisibility(4);
    }

    public boolean N() {
        return this.f36279c.F();
    }

    public boolean O() {
        return this.f36297k.A();
    }

    public boolean P() {
        return this.f36297k.B();
    }

    public final boolean Q() {
        return this.f36282d5;
    }

    public final boolean R() {
        return getHintMaxLines() == 1;
    }

    public final boolean S() {
        if (d0()) {
            return true;
        }
        return this.f36303p != null && this.f36301n;
    }

    public boolean T() {
        return this.f36247F;
    }

    public final boolean U() {
        return this.f36261T == 1 && this.f36283e.getMinLines() <= 1;
    }

    public final void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.f36261T != 0) {
            v0();
        }
        b0();
    }

    public final void W() {
        if (C()) {
            RectF rectF = this.f36266V1;
            this.f36284e5.o(rectF, this.f36283e.getWidth(), this.f36283e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f36268W);
            rectF.top = 0.0f;
            ((AbstractC1358h) this.f36248G).C0(rectF);
        }
    }

    public final void X() {
        if (!C() || this.f36282d5) {
            return;
        }
        z();
        W();
    }

    public void Z() {
        this.f36275b.m();
    }

    public final void a0() {
        TextView textView = this.f36310u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f36273a.addView(view, layoutParams2);
        this.f36273a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    public final void b0() {
        EditText editText = this.f36283e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f36261T;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public void c0(TextView textView, int i10) {
        try {
            j.m(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        j.m(textView, l.i.f55158b);
        textView.setTextColor(AbstractC5338c.getColor(getContext(), ia.d.f48274a));
    }

    public boolean d0() {
        return this.f36297k.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        AutofillId autofillId;
        EditText editText = this.f36283e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f36285f != null) {
            boolean z10 = this.f36247F;
            this.f36247F = false;
            CharSequence hint = editText.getHint();
            this.f36283e.setHint(this.f36285f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f36283e.setHint(hint);
                this.f36247F = z10;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f36273a.getChildCount());
        for (int i11 = 0; i11 < this.f36273a.getChildCount(); i11++) {
            View childAt = this.f36273a.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f36283e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f36296j5 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f36296j5 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f36294i5) {
            return;
        }
        this.f36294i5 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C6815a c6815a = this.f36284e5;
        boolean M02 = c6815a != null ? c6815a.M0(drawableState) : false;
        if (this.f36283e != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (M02) {
            invalidate();
        }
        this.f36294i5 = false;
    }

    public final boolean e0() {
        return (this.f36279c.G() || ((this.f36279c.A() && N()) || this.f36279c.w() != null)) && this.f36279c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f36275b.getMeasuredWidth() > 0;
    }

    public final void g0() {
        if (this.f36310u == null || !this.f36309t || TextUtils.isEmpty(this.f36308s)) {
            return;
        }
        this.f36310u.setText(this.f36308s);
        v.a(this.f36273a, this.f36313x);
        this.f36310u.setVisibility(0);
        this.f36310u.bringToFront();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f36283e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    @NonNull
    public i getBoxBackground() {
        int i10 = this.f36261T;
        if (i10 == 1 || i10 == 2) {
            return this.f36248G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f36314x1;
    }

    public int getBoxBackgroundMode() {
        return this.f36261T;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f36265V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return o.j(this) ? this.f36254O.j().a(this.f36266V1) : this.f36254O.l().a(this.f36266V1);
    }

    public float getBoxCornerRadiusBottomStart() {
        return o.j(this) ? this.f36254O.l().a(this.f36266V1) : this.f36254O.j().a(this.f36266V1);
    }

    public float getBoxCornerRadiusTopEnd() {
        return o.j(this) ? this.f36254O.r().a(this.f36266V1) : this.f36254O.t().a(this.f36266V1);
    }

    public float getBoxCornerRadiusTopStart() {
        return o.j(this) ? this.f36254O.t().a(this.f36266V1) : this.f36254O.r().a(this.f36266V1);
    }

    public int getBoxStrokeColor() {
        return this.f36267V4;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f36269W4;
    }

    public int getBoxStrokeWidth() {
        return this.f36276b1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f36288g1;
    }

    public int getCounterMaxLength() {
        return this.f36300m;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f36299l && this.f36301n && (textView = this.f36303p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f36242A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f36319z;
    }

    public ColorStateList getCursorColor() {
        return this.f36243B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f36244C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f36259R4;
    }

    public EditText getEditText() {
        return this.f36283e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f36279c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f36279c.n();
    }

    public int getEndIconMinSize() {
        return this.f36279c.o();
    }

    public int getEndIconMode() {
        return this.f36279c.p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f36279c.q();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f36279c.r();
    }

    public CharSequence getError() {
        if (this.f36297k.A()) {
            return this.f36297k.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f36297k.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f36297k.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f36297k.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f36279c.s();
    }

    public CharSequence getHelperText() {
        if (this.f36297k.B()) {
            return this.f36297k.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f36297k.u();
    }

    public CharSequence getHint() {
        if (this.f36245D) {
            return this.f36246E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f36284e5.r();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f36284e5.w();
    }

    public int getHintMaxLines() {
        return this.f36284e5.A();
    }

    public ColorStateList getHintTextColor() {
        return this.f36260S4;
    }

    @NonNull
    public f getLengthCounter() {
        return this.f36302o;
    }

    public int getMaxEms() {
        return this.f36291h;
    }

    public int getMaxWidth() {
        return this.f36295j;
    }

    public int getMinEms() {
        return this.f36287g;
    }

    public int getMinWidth() {
        return this.f36293i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f36279c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f36279c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f36309t) {
            return this.f36308s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f36312w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f36311v;
    }

    public CharSequence getPrefixText() {
        return this.f36275b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f36275b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f36275b.d();
    }

    @NonNull
    public n getShapeAppearanceModel() {
        return this.f36254O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f36275b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f36275b.f();
    }

    public int getStartIconMinSize() {
        return this.f36275b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f36275b.h();
    }

    public CharSequence getSuffixText() {
        return this.f36279c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f36279c.x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f36279c.z();
    }

    public Typeface getTypeface() {
        return this.f36277b2;
    }

    public final void h0() {
        if (this.f36261T == 1) {
            if (Ca.c.l(getContext())) {
                this.f36265V = getResources().getDimensionPixelSize(ia.e.f48323T);
            } else if (Ca.c.k(getContext())) {
                this.f36265V = getResources().getDimensionPixelSize(ia.e.f48322S);
            }
        }
    }

    public final void i0(Rect rect) {
        i iVar = this.f36252K;
        if (iVar != null) {
            int i10 = rect.bottom;
            iVar.setBounds(rect.left, i10 - this.f36276b1, rect.right, i10);
        }
        i iVar2 = this.f36253L;
        if (iVar2 != null) {
            int i11 = rect.bottom;
            iVar2.setBounds(rect.left, i11 - this.f36288g1, rect.right, i11);
        }
    }

    public void j(g gVar) {
        this.f36315x2.add(gVar);
        if (this.f36283e != null) {
            gVar.a(this);
        }
    }

    public final void j0(int i10) {
        this.f36284e5.U0(i10);
        Rect rect = this.f36317y1;
        AbstractC6816b.a(this, this.f36283e, rect);
        this.f36284e5.g0(s(rect));
        v0();
        l();
        t0(i10);
    }

    public final void k() {
        TextView textView = this.f36310u;
        if (textView != null) {
            this.f36273a.addView(textView);
            this.f36310u.setVisibility(0);
        }
    }

    public final void k0() {
        if (this.f36303p != null) {
            EditText editText = this.f36283e;
            l0(editText == null ? null : editText.getText());
        }
    }

    public final void l() {
        if (this.f36283e == null || this.f36261T != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.f36283e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f36284e5.r() + this.f36281d), this.f36283e.getPaddingEnd(), getResources().getDimensionPixelSize(ia.e.f48317O));
        } else if (Ca.c.l(getContext())) {
            EditText editText2 = this.f36283e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(ia.e.f48321R), this.f36283e.getPaddingEnd(), getResources().getDimensionPixelSize(ia.e.f48320Q));
        } else if (Ca.c.k(getContext())) {
            EditText editText3 = this.f36283e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(ia.e.f48319P), this.f36283e.getPaddingEnd(), getResources().getDimensionPixelSize(ia.e.f48317O));
        }
    }

    public void l0(Editable editable) {
        int a10 = this.f36302o.a(editable);
        boolean z10 = this.f36301n;
        int i10 = this.f36300m;
        if (i10 == -1) {
            this.f36303p.setText(String.valueOf(a10));
            this.f36303p.setContentDescription(null);
            this.f36301n = false;
        } else {
            this.f36301n = a10 > i10;
            m0(getContext(), this.f36303p, a10, this.f36300m, this.f36301n);
            if (z10 != this.f36301n) {
                n0();
            }
            this.f36303p.setText(C6695a.c().j(getContext().getString(k.f48526d, Integer.valueOf(a10), Integer.valueOf(this.f36300m))));
        }
        if (this.f36283e == null || z10 == this.f36301n) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    public void m(float f10) {
        if (this.f36284e5.H() == f10) {
            return;
        }
        if (this.f36292h5 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36292h5 = valueAnimator;
            valueAnimator.setInterpolator(h.g(getContext(), ia.c.f48225b0, AbstractC5104a.f53859b));
            this.f36292h5.setDuration(h.f(getContext(), ia.c.f48217V, 167));
            this.f36292h5.addUpdateListener(new d());
        }
        this.f36292h5.setFloatValues(this.f36284e5.H(), f10);
        this.f36292h5.start();
    }

    public final void n() {
        i iVar = this.f36248G;
        if (iVar == null) {
            return;
        }
        n H10 = iVar.H();
        n nVar = this.f36254O;
        if (H10 != nVar) {
            this.f36248G.setShapeAppearanceModel(nVar);
        }
        if (x()) {
            this.f36248G.m0(this.f36268W, this.f36304p1);
        }
        int r10 = r();
        this.f36314x1 = r10;
        this.f36248G.f0(ColorStateList.valueOf(r10));
        o();
        s0();
    }

    public final void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f36303p;
        if (textView != null) {
            c0(textView, this.f36301n ? this.f36306q : this.f36307r);
            if (!this.f36301n && (colorStateList2 = this.f36319z) != null) {
                this.f36303p.setTextColor(colorStateList2);
            }
            if (!this.f36301n || (colorStateList = this.f36242A) == null) {
                return;
            }
            this.f36303p.setTextColor(colorStateList);
        }
    }

    public final void o() {
        if (this.f36252K == null || this.f36253L == null) {
            return;
        }
        if (y()) {
            this.f36252K.f0(this.f36283e.isFocused() ? ColorStateList.valueOf(this.f36263T4) : ColorStateList.valueOf(this.f36304p1));
            this.f36253L.f0(ColorStateList.valueOf(this.f36304p1));
        }
        invalidate();
    }

    public final void o0() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f36243B;
        if (colorStateList2 == null) {
            colorStateList2 = AbstractC6344a.g(getContext(), AbstractC5335a.f55004s);
        }
        EditText editText = this.f36283e;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f36283e.getTextCursorDrawable();
            Drawable mutate = AbstractC5597a.r(textCursorDrawable2).mutate();
            if (S() && (colorStateList = this.f36244C) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36284e5.Z(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f36279c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f36298k5 = false;
        boolean u02 = u0();
        boolean p02 = p0();
        if (u02 || p02) {
            this.f36283e.post(new Runnable() { // from class: Ja.G
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.f36283e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f36283e;
        if (editText != null) {
            Rect rect = this.f36317y1;
            AbstractC6816b.a(this, editText, rect);
            i0(rect);
            if (this.f36245D) {
                this.f36284e5.A0(this.f36283e.getTextSize());
                int gravity = this.f36283e.getGravity();
                this.f36284e5.m0((gravity & (-113)) | 48);
                this.f36284e5.z0(gravity);
                this.f36284e5.g0(s(rect));
                this.f36284e5.t0(v(rect));
                this.f36284e5.b0();
                if (!C() || this.f36282d5) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f36298k5) {
            this.f36279c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f36298k5 = true;
        }
        y0();
        this.f36279c.x0();
        if (R()) {
            return;
        }
        j0((this.f36283e.getMeasuredWidth() - this.f36283e.getCompoundPaddingLeft()) - this.f36283e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f36320c);
        if (savedState.f36321d) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f36255P) {
            float a10 = this.f36254O.r().a(this.f36266V1);
            float a11 = this.f36254O.t().a(this.f36266V1);
            n m10 = n.a().D(this.f36254O.s()).I(this.f36254O.q()).u(this.f36254O.k()).y(this.f36254O.i()).E(a11).J(a10).v(this.f36254O.l().a(this.f36266V1)).z(this.f36254O.j().a(this.f36266V1)).m();
            this.f36255P = z10;
            setShapeAppearanceModel(m10);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (d0()) {
            savedState.f36320c = getError();
        }
        savedState.f36321d = this.f36279c.E();
        return savedState;
    }

    public final void p(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f36258R;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    public boolean p0() {
        boolean z10;
        if (this.f36283e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f36275b.getMeasuredWidth() - this.f36283e.getPaddingLeft();
            if (this.f36289g2 == null || this.f36305p2 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f36289g2 = colorDrawable;
                this.f36305p2 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f36283e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f36289g2;
            if (drawable != drawable2) {
                this.f36283e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f36289g2 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f36283e.getCompoundDrawablesRelative();
                this.f36283e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f36289g2 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f36279c.z().getMeasuredWidth() - this.f36283e.getPaddingRight();
            CheckableImageButton k10 = this.f36279c.k();
            if (k10 != null) {
                measuredWidth2 = measuredWidth2 + k10.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) k10.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f36283e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f36318y2;
            if (drawable3 != null && this.f36256P4 != measuredWidth2) {
                this.f36256P4 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f36283e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f36318y2, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f36318y2 = colorDrawable2;
                this.f36256P4 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f36318y2;
            if (drawable4 != drawable5) {
                this.f36257Q4 = drawable4;
                this.f36283e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f36318y2 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f36283e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f36318y2) {
                this.f36283e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f36257Q4, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.f36318y2 = null;
            return z11;
        }
        return z10;
    }

    public final void q() {
        int i10 = this.f36261T;
        if (i10 == 0) {
            this.f36248G = null;
            this.f36252K = null;
            this.f36253L = null;
            return;
        }
        if (i10 == 1) {
            this.f36248G = new i(this.f36254O);
            this.f36252K = new i();
            this.f36253L = new i();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f36261T + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f36245D || (this.f36248G instanceof AbstractC1358h)) {
                this.f36248G = new i(this.f36254O);
            } else {
                this.f36248G = AbstractC1358h.y0(this.f36254O);
            }
            this.f36252K = null;
            this.f36253L = null;
        }
    }

    public void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f36283e;
        if (editText == null || this.f36261T != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (I.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(C2053h.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f36301n && (textView = this.f36303p) != null) {
            background.setColorFilter(C2053h.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC5597a.c(background);
            this.f36283e.refreshDrawableState();
        }
    }

    public final int r() {
        return this.f36261T == 1 ? AbstractC6344a.i(AbstractC6344a.e(this, ia.c.f48260t, 0), this.f36314x1) : this.f36314x1;
    }

    public final void r0() {
        this.f36283e.setBackground(getEditTextBoxBackground());
    }

    public final Rect s(Rect rect) {
        if (this.f36283e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f36262T1;
        boolean j10 = o.j(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f36261T;
        if (i10 == 1) {
            rect2.left = J(rect.left, j10);
            rect2.top = rect.top + this.f36265V;
            rect2.right = K(rect.right, j10);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = J(rect.left, j10);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, j10);
            return rect2;
        }
        rect2.left = rect.left + this.f36283e.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f36283e.getPaddingRight();
        return rect2;
    }

    public void s0() {
        EditText editText = this.f36283e;
        if (editText == null || this.f36248G == null) {
            return;
        }
        if ((this.f36251J || editText.getBackground() == null) && this.f36261T != 0) {
            r0();
            this.f36251J = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f36314x1 != i10) {
            this.f36314x1 = i10;
            this.f36270X4 = i10;
            this.f36272Z4 = i10;
            this.f36274a5 = i10;
            n();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(AbstractC5338c.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f36270X4 = defaultColor;
        this.f36314x1 = defaultColor;
        this.f36271Y4 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f36272Z4 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f36274a5 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f36261T) {
            return;
        }
        this.f36261T = i10;
        if (this.f36283e != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f36265V = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f36254O = this.f36254O.w().C(i10, this.f36254O.r()).H(i10, this.f36254O.t()).t(i10, this.f36254O.j()).x(i10, this.f36254O.l()).m();
        n();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f36267V4 != i10) {
            this.f36267V4 = i10;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f36263T4 = colorStateList.getDefaultColor();
            this.f36278b5 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f36264U4 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f36267V4 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f36267V4 != colorStateList.getDefaultColor()) {
            this.f36267V4 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f36269W4 != colorStateList) {
            this.f36269W4 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f36276b1 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f36288g1 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f36299l != z10) {
            if (z10) {
                C2068x c2068x = new C2068x(getContext());
                this.f36303p = c2068x;
                c2068x.setId(ia.g.f48434h0);
                Typeface typeface = this.f36277b2;
                if (typeface != null) {
                    this.f36303p.setTypeface(typeface);
                }
                this.f36303p.setMaxLines(1);
                this.f36297k.e(this.f36303p, 2);
                ((ViewGroup.MarginLayoutParams) this.f36303p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(ia.e.f48316N0));
                n0();
                k0();
            } else {
                this.f36297k.C(this.f36303p, 2);
                this.f36303p = null;
            }
            this.f36299l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f36300m != i10) {
            if (i10 > 0) {
                this.f36300m = i10;
            } else {
                this.f36300m = -1;
            }
            if (this.f36299l) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f36306q != i10) {
            this.f36306q = i10;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f36242A != colorStateList) {
            this.f36242A = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f36307r != i10) {
            this.f36307r = i10;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f36319z != colorStateList) {
            this.f36319z = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f36243B != colorStateList) {
            this.f36243B = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f36244C != colorStateList) {
            this.f36244C = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f36259R4 = colorStateList;
        this.f36260S4 = colorStateList;
        if (this.f36283e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f36279c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f36279c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f36279c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f36279c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f36279c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f36279c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f36279c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f36279c.W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f36279c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f36279c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f36279c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f36279c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f36297k.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f36297k.w();
        } else {
            this.f36297k.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f36297k.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f36297k.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f36297k.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f36279c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f36279c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f36279c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f36279c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f36279c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f36297k.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f36297k.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f36286f5 != z10) {
            this.f36286f5 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.f36297k.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f36297k.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f36297k.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f36297k.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f36245D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f36290g5 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f36245D) {
            this.f36245D = z10;
            if (z10) {
                CharSequence hint = this.f36283e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f36246E)) {
                        setHint(hint);
                    }
                    this.f36283e.setHint((CharSequence) null);
                }
                this.f36247F = true;
            } else {
                this.f36247F = false;
                if (!TextUtils.isEmpty(this.f36246E) && TextUtils.isEmpty(this.f36283e.getHint())) {
                    this.f36283e.setHint(this.f36246E);
                }
                setHintInternal(null);
            }
            if (this.f36283e != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        this.f36284e5.i0(i10);
        this.f36284e5.v0(i10);
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        this.f36284e5.j0(i10);
        this.f36260S4 = this.f36284e5.p();
        if (this.f36283e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f36260S4 != colorStateList) {
            if (this.f36259R4 == null) {
                this.f36284e5.l0(colorStateList);
            }
            this.f36260S4 = colorStateList;
            if (this.f36283e != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull f fVar) {
        this.f36302o = fVar;
    }

    public void setMaxEms(int i10) {
        this.f36291h = i10;
        EditText editText = this.f36283e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f36295j = i10;
        EditText editText = this.f36283e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f36287g = i10;
        EditText editText = this.f36283e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f36293i = i10;
        EditText editText = this.f36283e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f36279c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f36279c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f36279c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f36279c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f36279c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f36310u == null) {
            C2068x c2068x = new C2068x(getContext());
            this.f36310u = c2068x;
            c2068x.setId(ia.g.f48440k0);
            this.f36310u.setImportantForAccessibility(1);
            this.f36310u.setAccessibilityLiveRegion(1);
            C1378c B10 = B();
            this.f36313x = B10;
            B10.m0(67L);
            this.f36316y = B();
            setPlaceholderTextAppearance(this.f36312w);
            setPlaceholderTextColor(this.f36311v);
            AbstractC2082d0.l0(this.f36310u, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f36309t) {
                setPlaceholderTextEnabled(true);
            }
            this.f36308s = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f36312w = i10;
        TextView textView = this.f36310u;
        if (textView != null) {
            j.m(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f36311v != colorStateList) {
            this.f36311v = colorStateList;
            TextView textView = this.f36310u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f36275b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f36275b.o(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f36275b.p(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull n nVar) {
        i iVar = this.f36248G;
        if (iVar == null || iVar.H() == nVar) {
            return;
        }
        this.f36254O = nVar;
        n();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f36275b.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f36275b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f36275b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f36275b.v(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f36275b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f36275b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f36275b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f36275b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f36279c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f36279c.q0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f36279c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f36283e;
        if (editText != null) {
            AbstractC2082d0.l0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f36277b2) {
            this.f36277b2 = typeface;
            this.f36284e5.R0(typeface);
            this.f36297k.N(typeface);
            TextView textView = this.f36303p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, Rect rect2, float f10) {
        return U() ? (int) (rect2.top + f10) : rect.bottom - this.f36283e.getCompoundPaddingBottom();
    }

    public final void t0(int i10) {
        if (this.f36283e == null) {
            return;
        }
        float D10 = this.f36284e5.D();
        if (this.f36308s != null) {
            TextPaint textPaint = new TextPaint(EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
            textPaint.set(this.f36310u.getPaint());
            textPaint.setTextSize(this.f36310u.getTextSize());
            textPaint.setTypeface(this.f36310u.getTypeface());
            textPaint.setLetterSpacing(this.f36310u.getLetterSpacing());
            r2 = (this.f36261T == 1 ? this.f36281d + this.f36284e5.r() + this.f36265V : 0.0f) + xa.g.b(this.f36308s, textPaint, i10).g(getLayoutDirection() == 1).f(true).h(this.f36310u.getLineSpacingExtra(), this.f36310u.getLineSpacingMultiplier()).j(new xa.h() { // from class: Ja.I
                @Override // xa.h
                public final void a(StaticLayout.Builder builder) {
                    builder.setBreakStrategy(TextInputLayout.this.f36310u.getBreakStrategy());
                }
            }).a().getHeight();
        }
        float max = Math.max(D10, r2);
        if (this.f36283e.getMeasuredHeight() < max) {
            this.f36283e.setMinimumHeight(Math.round(max));
        }
    }

    public final int u(Rect rect, float f10) {
        if (U()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return (rect.top + this.f36283e.getCompoundPaddingTop()) - ((this.f36261T != 0 || R()) ? 0 : (int) (this.f36284e5.E() / 2.0f));
    }

    public final boolean u0() {
        int max;
        if (this.f36283e == null || this.f36283e.getMeasuredHeight() >= (max = Math.max(this.f36279c.getMeasuredHeight(), this.f36275b.getMeasuredHeight()))) {
            return false;
        }
        this.f36283e.setMinimumHeight(max);
        return true;
    }

    public final Rect v(Rect rect) {
        if (this.f36283e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f36262T1;
        float E10 = R() ? this.f36284e5.E() : this.f36284e5.B() * this.f36284e5.z();
        rect2.left = rect.left + this.f36283e.getCompoundPaddingLeft();
        rect2.top = u(rect, E10);
        rect2.right = rect.right - this.f36283e.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, E10);
        return rect2;
    }

    public final void v0() {
        if (this.f36261T != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36273a.getLayoutParams();
            int w10 = w();
            if (w10 != layoutParams.topMargin) {
                layoutParams.topMargin = w10;
                this.f36273a.requestLayout();
            }
        }
    }

    public final int w() {
        if (!this.f36245D) {
            return 0;
        }
        int i10 = this.f36261T;
        if (i10 == 0) {
            return (int) this.f36284e5.r();
        }
        if (i10 != 2) {
            return 0;
        }
        return R() ? (int) (this.f36284e5.r() / 2.0f) : Math.max(0, (int) (this.f36284e5.r() - (this.f36284e5.n() / 2.0f)));
    }

    public void w0(boolean z10) {
        x0(z10, false);
    }

    public final boolean x() {
        return this.f36261T == 2 && y();
    }

    public final void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f36283e;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f36283e;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f36259R4;
        if (colorStateList2 != null) {
            this.f36284e5.e0(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f36259R4;
            this.f36284e5.e0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f36278b5) : this.f36278b5));
        } else if (d0()) {
            this.f36284e5.e0(this.f36297k.r());
        } else if (this.f36301n && (textView = this.f36303p) != null) {
            this.f36284e5.e0(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f36260S4) != null) {
            this.f36284e5.l0(colorStateList);
        }
        if (z13 || !this.f36286f5 || (isEnabled() && z12)) {
            if (z11 || this.f36282d5) {
                A(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f36282d5) {
            G(z10);
        }
    }

    public final boolean y() {
        return this.f36268W > -1 && this.f36304p1 != 0;
    }

    public final void y0() {
        EditText editText;
        if (this.f36310u == null || (editText = this.f36283e) == null) {
            return;
        }
        this.f36310u.setGravity(editText.getGravity());
        this.f36310u.setPadding(this.f36283e.getCompoundPaddingLeft(), this.f36283e.getCompoundPaddingTop(), this.f36283e.getCompoundPaddingRight(), this.f36283e.getCompoundPaddingBottom());
    }

    public final void z() {
        if (C()) {
            ((AbstractC1358h) this.f36248G).A0();
        }
    }

    public final void z0() {
        EditText editText = this.f36283e;
        A0(editText == null ? null : editText.getText());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r5), attributeSet, i10);
        int i11 = f36240l5;
        this.f36287g = -1;
        this.f36291h = -1;
        this.f36293i = -1;
        this.f36295j = -1;
        this.f36297k = new u(this);
        this.f36302o = new f() { // from class: Ja.H
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.f36317y1 = new Rect();
        this.f36262T1 = new Rect();
        this.f36266V1 = new RectF();
        this.f36315x2 = new LinkedHashSet();
        C6815a c6815a = new C6815a(this);
        this.f36284e5 = c6815a;
        this.f36298k5 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f36273a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AbstractC5104a.f53858a;
        c6815a.P0(timeInterpolator);
        c6815a.K0(timeInterpolator);
        c6815a.m0(8388659);
        a0 j10 = xa.l.j(context2, attributeSet, m.TextInputLayout, i10, i11, m.f48666H7, m.f48646F7, m.f48839Z7, m.f48889e8, m.f48939j8);
        y yVar = new y(this, j10);
        this.f36275b = yVar;
        this.f36245D = j10.a(m.f48919h8, true);
        setHint(j10.p(m.f48998p7));
        this.f36290g5 = j10.a(m.f48909g8, true);
        this.f36286f5 = j10.a(m.f48859b8, true);
        if (j10.s(m.f49018r7)) {
            setMinEms(j10.k(m.f49018r7, -1));
        } else if (j10.s(m.f48988o7)) {
            setMinWidth(j10.f(m.f48988o7, -1));
        }
        if (j10.s(m.f49008q7)) {
            setMaxEms(j10.k(m.f49008q7, -1));
        } else if (j10.s(m.f48978n7)) {
            setMaxWidth(j10.f(m.f48978n7, -1));
        }
        this.f36254O = n.e(context2, attributeSet, i10, i11).m();
        this.f36258R = context2.getResources().getDimensionPixelOffset(ia.e.f48310K0);
        this.f36265V = j10.e(m.f49048u7, 0);
        this.f36281d = getResources().getDimensionPixelSize(ia.e.f48299F);
        this.f36276b1 = j10.f(m.f48606B7, context2.getResources().getDimensionPixelSize(ia.e.f48312L0));
        this.f36288g1 = j10.f(m.f48616C7, context2.getResources().getDimensionPixelSize(ia.e.f48314M0));
        this.f36268W = this.f36276b1;
        float d10 = j10.d(m.f49088y7, -1.0f);
        float d11 = j10.d(m.f49078x7, -1.0f);
        float d12 = j10.d(m.f49058v7, -1.0f);
        float d13 = j10.d(m.f49068w7, -1.0f);
        n.b w10 = this.f36254O.w();
        if (d10 >= 0.0f) {
            w10.E(d10);
        }
        if (d11 >= 0.0f) {
            w10.J(d11);
        }
        if (d12 >= 0.0f) {
            w10.z(d12);
        }
        if (d13 >= 0.0f) {
            w10.v(d13);
        }
        this.f36254O = w10.m();
        ColorStateList b10 = Ca.c.b(context2, j10, m.f49028s7);
        if (b10 != null) {
            int defaultColor = b10.getDefaultColor();
            this.f36270X4 = defaultColor;
            this.f36314x1 = defaultColor;
            if (b10.isStateful()) {
                this.f36271Y4 = b10.getColorForState(new int[]{-16842910}, -1);
                this.f36272Z4 = b10.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f36274a5 = b10.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f36272Z4 = this.f36270X4;
                ColorStateList a10 = AbstractC5596a.a(context2, ia.d.f48285l);
                this.f36271Y4 = a10.getColorForState(new int[]{-16842910}, -1);
                this.f36274a5 = a10.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f36314x1 = 0;
            this.f36270X4 = 0;
            this.f36271Y4 = 0;
            this.f36272Z4 = 0;
            this.f36274a5 = 0;
        }
        if (j10.s(m.f48968m7)) {
            ColorStateList c10 = j10.c(m.f48968m7);
            this.f36260S4 = c10;
            this.f36259R4 = c10;
        }
        ColorStateList b11 = Ca.c.b(context2, j10, m.f49098z7);
        this.f36267V4 = j10.b(m.f49098z7, 0);
        this.f36263T4 = AbstractC5338c.getColor(context2, ia.d.f48286m);
        this.f36278b5 = AbstractC5338c.getColor(context2, ia.d.f48287n);
        this.f36264U4 = AbstractC5338c.getColor(context2, ia.d.f48288o);
        if (b11 != null) {
            setBoxStrokeColorStateList(b11);
        }
        if (j10.s(m.f48596A7)) {
            setBoxStrokeErrorColor(Ca.c.b(context2, j10, m.f48596A7));
        }
        if (j10.n(m.f48939j8, -1) != -1) {
            setHintTextAppearance(j10.n(m.f48939j8, 0));
        }
        this.f36243B = j10.c(m.f48686J7);
        this.f36244C = j10.c(m.f48696K7);
        int n10 = j10.n(m.f48839Z7, 0);
        CharSequence p10 = j10.p(m.f48794U7);
        int k10 = j10.k(m.f48785T7, 1);
        boolean a11 = j10.a(m.f48803V7, false);
        int n11 = j10.n(m.f48889e8, 0);
        boolean a12 = j10.a(m.f48879d8, false);
        CharSequence p11 = j10.p(m.f48869c8);
        int n12 = j10.n(m.f49019r8, 0);
        CharSequence p12 = j10.p(m.f49009q8);
        boolean a13 = j10.a(m.f48626D7, false);
        setCounterMaxLength(j10.k(m.f48636E7, -1));
        this.f36307r = j10.n(m.f48666H7, 0);
        this.f36306q = j10.n(m.f48646F7, 0);
        setBoxBackgroundMode(j10.k(m.f49038t7, 0));
        setErrorContentDescription(p10);
        setErrorAccessibilityLiveRegion(k10);
        setCounterOverflowTextAppearance(this.f36306q);
        setHelperTextTextAppearance(n11);
        setErrorTextAppearance(n10);
        setCounterTextAppearance(this.f36307r);
        setPlaceholderText(p12);
        setPlaceholderTextAppearance(n12);
        if (j10.s(m.f48849a8)) {
            setErrorTextColor(j10.c(m.f48849a8));
        }
        if (j10.s(m.f48899f8)) {
            setHelperTextColor(j10.c(m.f48899f8));
        }
        if (j10.s(m.f48949k8)) {
            setHintTextColor(j10.c(m.f48949k8));
        }
        if (j10.s(m.f48676I7)) {
            setCounterTextColor(j10.c(m.f48676I7));
        }
        if (j10.s(m.f48656G7)) {
            setCounterOverflowTextColor(j10.c(m.f48656G7));
        }
        if (j10.s(m.f49029s8)) {
            setPlaceholderTextColor(j10.c(m.f49029s8));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, j10);
        this.f36279c = aVar;
        boolean a14 = j10.a(m.f48958l7, true);
        setHintMaxLines(j10.k(m.f48929i8, 1));
        j10.x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(yVar);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(a14);
        setHelperTextEnabled(a12);
        setErrorEnabled(a11);
        setCounterEnabled(a13);
        setHelperText(p11);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f36279c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f36279c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f36279c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f36279c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f36279c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f36275b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f36275b.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
