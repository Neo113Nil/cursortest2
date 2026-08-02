package com.google.android.material.textfield;

import V4.C4075d;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
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
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C5064i;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.b0;
import androidx.core.text.a;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import com.google.android.material.internal.CheckableImageButton;
import i7.C7017a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import j.C7232a;
import j7.C7292a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n7.C8448a;
import ru.ozon.app.android.R;
import s7.C9608c;
import s7.C9609d;
import s7.C9619n;
import s7.C9621p;
import y7.C10856g;
import y7.InterfaceC10852c;
import y7.k;

/* loaded from: classes9.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    private CharSequence f58610A;

    /* renamed from: A0, reason: collision with root package name */
    private ColorStateList f58611A0;

    /* renamed from: B, reason: collision with root package name */
    @NonNull
    private final AppCompatTextView f58612B;

    /* renamed from: B0, reason: collision with root package name */
    private PorterDuff.Mode f58613B0;

    /* renamed from: C, reason: collision with root package name */
    private boolean f58614C;

    /* renamed from: C0, reason: collision with root package name */
    private ColorDrawable f58615C0;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f58616D;

    /* renamed from: D0, reason: collision with root package name */
    private int f58617D0;

    /* renamed from: E, reason: collision with root package name */
    private boolean f58618E;

    /* renamed from: E0, reason: collision with root package name */
    private Drawable f58619E0;

    /* renamed from: F, reason: collision with root package name */
    private C10856g f58620F;

    /* renamed from: F0, reason: collision with root package name */
    @NonNull
    private final CheckableImageButton f58621F0;

    /* renamed from: G, reason: collision with root package name */
    private C10856g f58622G;

    /* renamed from: G0, reason: collision with root package name */
    private ColorStateList f58623G0;

    /* renamed from: H, reason: collision with root package name */
    private C10856g f58624H;

    /* renamed from: H0, reason: collision with root package name */
    private PorterDuff.Mode f58625H0;

    /* renamed from: I, reason: collision with root package name */
    @NonNull
    private y7.k f58626I;

    /* renamed from: I0, reason: collision with root package name */
    private ColorStateList f58627I0;

    /* renamed from: J, reason: collision with root package name */
    private boolean f58628J;

    /* renamed from: J0, reason: collision with root package name */
    private ColorStateList f58629J0;

    /* renamed from: K, reason: collision with root package name */
    private final int f58630K;

    /* renamed from: K0, reason: collision with root package name */
    private int f58631K0;

    /* renamed from: L, reason: collision with root package name */
    private int f58632L;

    /* renamed from: L0, reason: collision with root package name */
    private int f58633L0;

    /* renamed from: M, reason: collision with root package name */
    private int f58634M;

    /* renamed from: M0, reason: collision with root package name */
    private int f58635M0;

    /* renamed from: N, reason: collision with root package name */
    private int f58636N;

    /* renamed from: N0, reason: collision with root package name */
    private ColorStateList f58637N0;

    /* renamed from: O, reason: collision with root package name */
    private int f58638O;

    /* renamed from: O0, reason: collision with root package name */
    private int f58639O0;

    /* renamed from: P, reason: collision with root package name */
    private int f58640P;

    /* renamed from: P0, reason: collision with root package name */
    private int f58641P0;

    /* renamed from: Q, reason: collision with root package name */
    private int f58642Q;

    /* renamed from: Q0, reason: collision with root package name */
    private int f58643Q0;

    /* renamed from: R, reason: collision with root package name */
    private int f58644R;

    /* renamed from: R0, reason: collision with root package name */
    private int f58645R0;

    /* renamed from: S, reason: collision with root package name */
    private final Rect f58646S;

    /* renamed from: S0, reason: collision with root package name */
    private int f58647S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f58648T0;

    /* renamed from: U0, reason: collision with root package name */
    final C9608c f58649U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f58650V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f58651W0;

    /* renamed from: X0, reason: collision with root package name */
    private ValueAnimator f58652X0;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean f58653Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f58654Z0;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f58655a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final s f58656b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final LinearLayout f58657c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final FrameLayout f58658d;

    /* renamed from: e, reason: collision with root package name */
    EditText f58659e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f58660f;

    /* renamed from: g, reason: collision with root package name */
    private int f58661g;

    /* renamed from: h, reason: collision with root package name */
    private int f58662h;

    /* renamed from: i, reason: collision with root package name */
    private int f58663i;

    /* renamed from: j, reason: collision with root package name */
    private int f58664j;

    /* renamed from: k, reason: collision with root package name */
    private final o f58665k;

    /* renamed from: l, reason: collision with root package name */
    boolean f58666l;

    /* renamed from: m, reason: collision with root package name */
    private int f58667m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f58668n;

    /* renamed from: o, reason: collision with root package name */
    private AppCompatTextView f58669o;

    /* renamed from: p, reason: collision with root package name */
    private int f58670p;

    /* renamed from: q, reason: collision with root package name */
    private int f58671q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f58672r;

    /* renamed from: r0, reason: collision with root package name */
    private final Rect f58673r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f58674s;

    /* renamed from: s0, reason: collision with root package name */
    private final RectF f58675s0;

    /* renamed from: t, reason: collision with root package name */
    private AppCompatTextView f58676t;

    /* renamed from: t0, reason: collision with root package name */
    private ColorDrawable f58677t0;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f58678u;

    /* renamed from: u0, reason: collision with root package name */
    private int f58679u0;

    /* renamed from: v, reason: collision with root package name */
    private int f58680v;

    /* renamed from: v0, reason: collision with root package name */
    private final LinkedHashSet<e> f58681v0;

    /* renamed from: w, reason: collision with root package name */
    private C4075d f58682w;

    /* renamed from: w0, reason: collision with root package name */
    private int f58683w0;

    /* renamed from: x, reason: collision with root package name */
    private C4075d f58684x;

    /* renamed from: x0, reason: collision with root package name */
    private final SparseArray<m> f58685x0;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f58686y;

    /* renamed from: y0, reason: collision with root package name */
    @NonNull
    private final CheckableImageButton f58687y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f58688z;

    /* renamed from: z0, reason: collision with root package name */
    private final LinkedHashSet<f> f58689z0;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.f58687y0.performClick();
            textInputLayout.f58687y0.jumpDrawablesToCurrentState();
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f58659e.requestLayout();
        }
    }

    final class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f58649U0.I(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C5305a {

        /* renamed from: a, reason: collision with root package name */
        private final TextInputLayout f58693a;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f58693a = textInputLayout;
        }

        @Override // androidx.core.view.C5305a
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull y2.q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            TextInputLayout textInputLayout = this.f58693a;
            EditText editText = textInputLayout.f58659e;
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence w11 = textInputLayout.w();
            CharSequence v11 = textInputLayout.v();
            CharSequence z11 = textInputLayout.z();
            int q11 = textInputLayout.q();
            CharSequence r11 = textInputLayout.r();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(w11);
            boolean E11 = textInputLayout.E();
            boolean isEmpty3 = TextUtils.isEmpty(v11);
            boolean z12 = (isEmpty3 && TextUtils.isEmpty(r11)) ? false : true;
            String charSequence = !isEmpty2 ? w11.toString() : "";
            textInputLayout.f58656b.i(qVar);
            if (!isEmpty) {
                qVar.r0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                qVar.r0(charSequence);
                if (!E11 && z11 != null) {
                    qVar.r0(charSequence + ", " + ((Object) z11));
                }
            } else if (z11 != null) {
                qVar.r0(z11);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                qVar.X(charSequence);
                qVar.o0(isEmpty);
            }
            if (text == null || text.length() != q11) {
                q11 = -1;
            }
            qVar.c0(q11);
            if (z12) {
                if (isEmpty3) {
                    v11 = r11;
                }
                qVar.T(v11);
            }
            AppCompatTextView o11 = textInputLayout.f58665k.o();
            if (o11 != null) {
                qVar.Z(o11);
            }
        }
    }

    public interface e {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface f {
        void a(@NonNull TextInputLayout textInputLayout, int i11);
    }

    static class g extends O2.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        CharSequence f58694c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58695d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f58696e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f58697f;

        /* renamed from: g, reason: collision with root package name */
        CharSequence f58698g;

        final class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final g createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i11) {
                return new g[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new g(parcel, null);
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f58694c) + " hint=" + ((Object) this.f58696e) + " helperText=" + ((Object) this.f58697f) + " placeholderText=" + ((Object) this.f58698g) + "}";
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            TextUtils.writeToParcel(this.f58694c, parcel, i11);
            parcel.writeInt(this.f58695d ? 1 : 0);
            TextUtils.writeToParcel(this.f58696e, parcel, i11);
            TextUtils.writeToParcel(this.f58697f, parcel, i11);
            TextUtils.writeToParcel(this.f58698g, parcel, i11);
        }

        g(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f58694c = (CharSequence) creator.createFromParcel(parcel);
            this.f58695d = parcel.readInt() == 1;
            this.f58696e = (CharSequence) creator.createFromParcel(parcel);
            this.f58697f = (CharSequence) creator.createFromParcel(parcel);
            this.f58698g = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout), attributeSet, R.attr.textInputStyle);
        FrameLayout frameLayout;
        int i11;
        CharSequence charSequence;
        ColorStateList c11;
        ColorStateList c12;
        ColorStateList c13;
        ColorStateList c14;
        ColorStateList b11;
        this.f58661g = -1;
        this.f58662h = -1;
        this.f58663i = -1;
        this.f58664j = -1;
        o oVar = new o(this);
        this.f58665k = oVar;
        this.f58646S = new Rect();
        this.f58673r0 = new Rect();
        this.f58675s0 = new RectF();
        this.f58681v0 = new LinkedHashSet<>();
        this.f58683w0 = 0;
        SparseArray<m> sparseArray = new SparseArray<>();
        this.f58685x0 = sparseArray;
        this.f58689z0 = new LinkedHashSet<>();
        C9608c c9608c = new C9608c(this);
        this.f58649U0 = c9608c;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f58655a = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f58658d = frameLayout3;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f58657c = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f58612B = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout3.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
        this.f58621F0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout3, false);
        this.f58687y0 = checkableImageButton2;
        frameLayout2.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = C7292a.f69463a;
        c9608c.R(linearInterpolator);
        c9608c.N(linearInterpolator);
        c9608c.w(8388659);
        b0 f7 = C9619n.f(context2, attributeSet, C7017a.f65933Q, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout, 22, 20, 35, 40, 44);
        s sVar = new s(this, f7);
        this.f58656b = sVar;
        this.f58614C = f7.a(43, true);
        d0(f7.p(4));
        this.f58651W0 = f7.a(42, true);
        this.f58650V0 = f7.a(37, true);
        if (f7.s(6)) {
            int k11 = f7.k(6, -1);
            this.f58661g = k11;
            EditText editText = this.f58659e;
            if (editText != null && k11 != -1) {
                editText.setMinEms(k11);
            }
        } else if (f7.s(3)) {
            int f11 = f7.f(3, -1);
            this.f58663i = f11;
            EditText editText2 = this.f58659e;
            if (editText2 != null && f11 != -1) {
                editText2.setMinWidth(f11);
            }
        }
        if (f7.s(5)) {
            int k12 = f7.k(5, -1);
            this.f58662h = k12;
            EditText editText3 = this.f58659e;
            if (editText3 != null && k12 != -1) {
                editText3.setMaxEms(k12);
            }
        } else if (f7.s(2)) {
            int f12 = f7.f(2, -1);
            this.f58664j = f12;
            EditText editText4 = this.f58659e;
            if (editText4 != null && f12 != -1) {
                editText4.setMaxWidth(f12);
            }
        }
        this.f58626I = y7.k.c(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout).a();
        this.f58630K = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f58634M = f7.e(9, 0);
        this.f58638O = f7.f(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f58640P = f7.f(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f58636N = this.f58638O;
        float d11 = f7.d(13);
        float d12 = f7.d(12);
        float d13 = f7.d(10);
        float d14 = f7.d(11);
        y7.k kVar = this.f58626I;
        kVar.getClass();
        k.a aVar = new k.a(kVar);
        if (d11 >= 0.0f) {
            aVar.p(d11);
        }
        if (d12 >= 0.0f) {
            aVar.t(d12);
        }
        if (d13 >= 0.0f) {
            aVar.l(d13);
        }
        if (d14 >= 0.0f) {
            aVar.h(d14);
        }
        this.f58626I = aVar.a();
        ColorStateList b12 = v7.c.b(context2, f7, 7);
        if (b12 != null) {
            int defaultColor = b12.getDefaultColor();
            this.f58639O0 = defaultColor;
            this.f58644R = defaultColor;
            if (b12.isStateful()) {
                this.f58641P0 = b12.getColorForState(new int[]{-16842910}, -1);
                this.f58643Q0 = b12.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.f58645R0 = b12.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.f58643Q0 = this.f58639O0;
                ColorStateList colorStateList = androidx.core.content.a.getColorStateList(context2, R.color.mtrl_filled_background_color);
                this.f58641P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f58645R0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.f58644R = 0;
            this.f58639O0 = 0;
            this.f58641P0 = 0;
            this.f58643Q0 = 0;
            this.f58645R0 = 0;
        }
        if (f7.s(1)) {
            ColorStateList c15 = f7.c(1);
            this.f58629J0 = c15;
            this.f58627I0 = c15;
        }
        ColorStateList b13 = v7.c.b(context2, f7, 14);
        this.f58635M0 = f7.b(14);
        this.f58631K0 = androidx.core.content.a.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f58647S0 = androidx.core.content.a.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.f58633L0 = androidx.core.content.a.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b13 != null) {
            N(b13);
        }
        if (f7.s(15) && this.f58637N0 != (b11 = v7.c.b(context2, f7, 15))) {
            this.f58637N0 = b11;
            C0();
        }
        if (f7.n(44, -1) != -1) {
            c9608c.u(f7.n(44, 0));
            this.f58629J0 = c9608c.f();
            if (this.f58659e != null) {
                x0(false, false);
                v0();
            }
        }
        int n11 = f7.n(35, 0);
        CharSequence p11 = f7.p(30);
        boolean a11 = f7.a(31, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (v7.c.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        if (f7.s(33)) {
            this.f58623G0 = v7.c.b(context2, f7, 33);
        }
        if (f7.s(34)) {
            this.f58625H0 = C9621p.e(f7.k(34, -1), null);
        }
        if (f7.s(32)) {
            b0(f7.g(32));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        int i12 = Y.f42258g;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.c(false);
        checkableImageButton.setFocusable(false);
        int n12 = f7.n(40, 0);
        boolean a12 = f7.a(39, false);
        CharSequence p12 = f7.p(38);
        int n13 = f7.n(52, 0);
        CharSequence p13 = f7.p(51);
        int n14 = f7.n(65, 0);
        CharSequence p14 = f7.p(64);
        boolean a13 = f7.a(18, false);
        int k13 = f7.k(19, -1);
        if (this.f58667m != k13) {
            if (k13 > 0) {
                this.f58667m = k13;
            } else {
                this.f58667m = -1;
            }
            if (this.f58666l && this.f58669o != null) {
                EditText editText5 = this.f58659e;
                p0(editText5 == null ? 0 : editText5.getText().length());
            }
        }
        this.f58671q = f7.n(22, 0);
        this.f58670p = f7.n(20, 0);
        L(f7.k(8, 0));
        if (v7.c.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        int n15 = f7.n(26, 0);
        sparseArray.append(-1, new com.google.android.material.textfield.f(this, n15));
        sparseArray.append(0, new q(this, 0));
        if (n15 == 0) {
            frameLayout = frameLayout3;
            i11 = f7.n(47, 0);
        } else {
            frameLayout = frameLayout3;
            i11 = n15;
        }
        sparseArray.append(1, new r(this, i11));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, n15));
        sparseArray.append(3, new h(this, n15));
        if (!f7.s(48)) {
            if (f7.s(28)) {
                this.f58611A0 = v7.c.b(context2, f7, 28);
            }
            if (f7.s(29)) {
                this.f58613B0 = C9621p.e(f7.k(29, -1), null);
            }
        }
        if (f7.s(27)) {
            V(f7.k(27, 0));
            if (f7.s(25)) {
                S(f7.p(25));
            }
            R(f7.a(24, true));
        } else if (f7.s(48)) {
            if (f7.s(49)) {
                this.f58611A0 = v7.c.b(context2, f7, 49);
            }
            if (f7.s(50)) {
                this.f58613B0 = C9621p.e(f7.k(50, -1), null);
            }
            V(f7.a(48, false) ? 1 : 0);
            S(f7.p(46));
        }
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        appCompatTextView.setAccessibilityLiveRegion(1);
        oVar.t(p11);
        oVar.x(n12);
        oVar.v(n11);
        h0(p13);
        this.f58680v = n13;
        AppCompatTextView appCompatTextView2 = this.f58676t;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextAppearance(n13);
        }
        m0(n14);
        if (f7.s(36)) {
            oVar.w(f7.c(36));
        }
        if (f7.s(41)) {
            oVar.z(f7.c(41));
        }
        if (f7.s(45) && this.f58629J0 != (c14 = f7.c(45))) {
            if (this.f58627I0 == null) {
                c9608c.v(c14);
            }
            this.f58629J0 = c14;
            if (this.f58659e != null) {
                x0(false, false);
            }
        }
        if (f7.s(23) && this.f58686y != (c13 = f7.c(23))) {
            this.f58686y = c13;
            q0();
        }
        if (f7.s(21) && this.f58688z != (c12 = f7.c(21))) {
            this.f58688z = c12;
            q0();
        }
        if (f7.s(53) && this.f58678u != (c11 = f7.c(53))) {
            this.f58678u = c11;
            AppCompatTextView appCompatTextView3 = this.f58676t;
            if (appCompatTextView3 != null && c11 != null) {
                appCompatTextView3.setTextColor(c11);
            }
        }
        if (f7.s(66)) {
            n0(f7.c(66));
        }
        setEnabled(f7.a(0, true));
        f7.x();
        setImportantForAccessibility(2);
        Y.I(1, this);
        ViewGroup viewGroup = frameLayout;
        viewGroup.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(viewGroup);
        frameLayout2.addView(sVar);
        frameLayout2.addView(linearLayout);
        addView(frameLayout2);
        oVar.y(a12);
        a0(a11);
        if (this.f58666l != a13) {
            if (a13) {
                AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext());
                this.f58669o = appCompatTextView4;
                appCompatTextView4.setId(R.id.textinput_counter);
                this.f58669o.setMaxLines(1);
                oVar.e(this.f58669o, 2);
                ((ViewGroup.MarginLayoutParams) this.f58669o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                q0();
                if (this.f58669o != null) {
                    EditText editText6 = this.f58659e;
                    p0(editText6 == null ? 0 : editText6.getText().length());
                }
                charSequence = null;
            } else {
                oVar.s(this.f58669o, 2);
                charSequence = null;
                this.f58669o = null;
            }
            this.f58666l = a13;
        } else {
            charSequence = null;
        }
        c0(p12);
        this.f58610A = TextUtils.isEmpty(p14) ? charSequence : p14;
        appCompatTextView.setText(p14);
        B0();
    }

    private void A0() {
        int i11;
        if (this.f58659e == null) {
            return;
        }
        if (C() || this.f58621F0.getVisibility() == 0) {
            i11 = 0;
        } else {
            EditText editText = this.f58659e;
            int i12 = Y.f42258g;
            i11 = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f58659e.getPaddingTop();
        int paddingBottom = this.f58659e.getPaddingBottom();
        int i13 = Y.f42258g;
        this.f58612B.setPaddingRelative(dimensionPixelSize, paddingTop, i11, paddingBottom);
    }

    private void B0() {
        AppCompatTextView appCompatTextView = this.f58612B;
        int visibility = appCompatTextView.getVisibility();
        int i11 = (this.f58610A == null || this.f58648T0) ? 8 : 0;
        if (visibility != i11) {
            t().c(i11 == 0);
        }
        t0();
        appCompatTextView.setVisibility(i11);
        r0();
    }

    private void G() {
        int i11 = this.f58632L;
        if (i11 == 0) {
            this.f58620F = null;
            this.f58622G = null;
            this.f58624H = null;
        } else if (i11 == 1) {
            this.f58620F = new C10856g(this.f58626I);
            this.f58622G = new C10856g();
            this.f58624H = new C10856g();
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(K00.b.e(this.f58632L, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f58614C || (this.f58620F instanceof com.google.android.material.textfield.g)) {
                this.f58620F = new C10856g(this.f58626I);
            } else {
                this.f58620F = new com.google.android.material.textfield.g(this.f58626I);
            }
            this.f58622G = null;
            this.f58624H = null;
        }
        EditText editText = this.f58659e;
        if (editText != null && this.f58620F != null && editText.getBackground() == null && this.f58632L != 0) {
            EditText editText2 = this.f58659e;
            C10856g c10856g = this.f58620F;
            int i12 = Y.f42258g;
            editText2.setBackground(c10856g);
        }
        C0();
        if (this.f58632L == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f58634M = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (v7.c.d(getContext())) {
                this.f58634M = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f58659e != null && this.f58632L == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.f58659e;
                int i13 = Y.f42258g;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.f58659e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (v7.c.d(getContext())) {
                EditText editText4 = this.f58659e;
                int i14 = Y.f42258g;
                editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.f58659e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f58632L != 0) {
            v0();
        }
    }

    private void H() {
        if (l()) {
            int width = this.f58659e.getWidth();
            int gravity = this.f58659e.getGravity();
            RectF rectF = this.f58675s0;
            this.f58649U0.e(rectF, width, gravity);
            float f7 = rectF.left;
            float f11 = this.f58630K;
            rectF.left = f7 - f11;
            rectF.right += f11;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f58636N);
            com.google.android.material.textfield.g gVar = (com.google.android.material.textfield.g) this.f58620F;
            gVar.getClass();
            gVar.P(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private static void I(@NonNull ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                I((ViewGroup) childAt, z11);
            }
        }
    }

    private static void g0(@NonNull CheckableImageButton checkableImageButton) {
        int i11 = Y.f42258g;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(hasOnClickListeners);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.c(hasOnClickListeners);
        checkableImageButton.setLongClickable(false);
        checkableImageButton.setImportantForAccessibility(hasOnClickListeners ? 1 : 2);
    }

    private void i0(boolean z11) {
        if (this.f58674s == z11) {
            return;
        }
        if (z11) {
            AppCompatTextView appCompatTextView = this.f58676t;
            if (appCompatTextView != null) {
                this.f58655a.addView(appCompatTextView);
                this.f58676t.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f58676t;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f58676t = null;
        }
        this.f58674s = z11;
    }

    private void j() {
        int i11;
        int i12;
        C10856g c10856g = this.f58620F;
        if (c10856g == null) {
            return;
        }
        y7.k r11 = c10856g.r();
        y7.k kVar = this.f58626I;
        if (r11 != kVar) {
            this.f58620F.setShapeAppearanceModel(kVar);
            if (this.f58683w0 == 3 && this.f58632L == 2) {
                ((h) this.f58685x0.get(3)).x((AutoCompleteTextView) this.f58659e);
            }
        }
        if (this.f58632L == 2 && (i11 = this.f58636N) > -1 && (i12 = this.f58642Q) != 0) {
            this.f58620F.I(i11, i12);
        }
        int i13 = this.f58644R;
        if (this.f58632L == 1) {
            i13 = androidx.core.graphics.c.d(this.f58644R, C8448a.a(R.attr.colorSurface, 0, getContext()));
        }
        this.f58644R = i13;
        this.f58620F.B(ColorStateList.valueOf(i13));
        if (this.f58683w0 == 3) {
            this.f58659e.getBackground().invalidateSelf();
        }
        C10856g c10856g2 = this.f58622G;
        if (c10856g2 != null && this.f58624H != null) {
            if (this.f58636N > -1 && this.f58642Q != 0) {
                c10856g2.B(this.f58659e.isFocused() ? ColorStateList.valueOf(this.f58631K0) : ColorStateList.valueOf(this.f58642Q));
                this.f58624H.B(ColorStateList.valueOf(this.f58642Q));
            }
            invalidate();
        }
        invalidate();
    }

    private int k() {
        float g10;
        if (!this.f58614C) {
            return 0;
        }
        int i11 = this.f58632L;
        C9608c c9608c = this.f58649U0;
        if (i11 == 0) {
            g10 = c9608c.g();
        } else {
            if (i11 != 2) {
                return 0;
            }
            g10 = c9608c.g() / 2.0f;
        }
        return (int) g10;
    }

    private boolean l() {
        return this.f58614C && !TextUtils.isEmpty(this.f58616D) && (this.f58620F instanceof com.google.android.material.textfield.g);
    }

    private void q0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f58669o;
        if (appCompatTextView != null) {
            o0(appCompatTextView, this.f58668n ? this.f58670p : this.f58671q);
            if (!this.f58668n && (colorStateList2 = this.f58686y) != null) {
                this.f58669o.setTextColor(colorStateList2);
            }
            if (!this.f58668n || (colorStateList = this.f58688z) == null) {
                return;
            }
            this.f58669o.setTextColor(colorStateList);
        }
    }

    private m t() {
        int i11 = this.f58683w0;
        SparseArray<m> sparseArray = this.f58685x0;
        m mVar = sparseArray.get(i11);
        return mVar != null ? mVar : sparseArray.get(0);
    }

    private void t0() {
        int visibility = this.f58687y0.getVisibility();
        CheckableImageButton checkableImageButton = this.f58621F0;
        this.f58658d.setVisibility((visibility != 0 || checkableImageButton.getVisibility() == 0) ? 8 : 0);
        this.f58657c.setVisibility((C() || checkableImageButton.getVisibility() == 0 || !((this.f58610A == null || this.f58648T0) ? 8 : false)) ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void u0() {
        int i11;
        CheckableImageButton checkableImageButton = this.f58621F0;
        if (checkableImageButton.getDrawable() != null) {
            o oVar = this.f58665k;
            if (oVar.q() && oVar.i()) {
                i11 = 0;
                checkableImageButton.setVisibility(i11);
                t0();
                A0();
                if (this.f58683w0 == 0) {
                    return;
                }
                r0();
                return;
            }
        }
        i11 = 8;
        checkableImageButton.setVisibility(i11);
        t0();
        A0();
        if (this.f58683w0 == 0) {
        }
    }

    private void v0() {
        if (this.f58632L != 1) {
            FrameLayout frameLayout = this.f58655a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int k11 = k();
            if (k11 != layoutParams.topMargin) {
                layoutParams.topMargin = k11;
                frameLayout.requestLayout();
            }
        }
    }

    private int x(int i11, boolean z11) {
        int compoundPaddingLeft = this.f58659e.getCompoundPaddingLeft() + i11;
        s sVar = this.f58656b;
        if (sVar.a() == null || z11) {
            return compoundPaddingLeft;
        }
        return sVar.b().getPaddingLeft() + (compoundPaddingLeft - sVar.b().getMeasuredWidth());
    }

    private void x0(boolean z11, boolean z12) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f58659e;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f58659e;
        boolean z14 = editText2 != null && editText2.hasFocus();
        o oVar = this.f58665k;
        boolean i11 = oVar.i();
        ColorStateList colorStateList2 = this.f58627I0;
        C9608c c9608c = this.f58649U0;
        if (colorStateList2 != null) {
            c9608c.v(colorStateList2);
            c9608c.D(this.f58627I0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f58627I0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f58647S0) : this.f58647S0;
            c9608c.v(ColorStateList.valueOf(colorForState));
            c9608c.D(ColorStateList.valueOf(colorForState));
        } else if (i11) {
            c9608c.v(oVar.m());
        } else if (this.f58668n && (appCompatTextView = this.f58669o) != null) {
            c9608c.v(appCompatTextView.getTextColors());
        } else if (z14 && (colorStateList = this.f58629J0) != null) {
            c9608c.v(colorStateList);
        }
        s sVar = this.f58656b;
        if (z13 || !this.f58650V0 || (isEnabled() && z14)) {
            if (z12 || this.f58648T0) {
                ValueAnimator valueAnimator = this.f58652X0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f58652X0.cancel();
                }
                if (z11 && this.f58651W0) {
                    i(1.0f);
                } else {
                    c9608c.I(1.0f);
                }
                this.f58648T0 = false;
                if (l()) {
                    H();
                }
                EditText editText3 = this.f58659e;
                y0(editText3 == null ? 0 : editText3.getText().length());
                sVar.d(false);
                B0();
                return;
            }
            return;
        }
        if (z12 || !this.f58648T0) {
            ValueAnimator valueAnimator2 = this.f58652X0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f58652X0.cancel();
            }
            if (z11 && this.f58651W0) {
                i(0.0f);
            } else {
                c9608c.I(0.0f);
            }
            if (l() && ((com.google.android.material.textfield.g) this.f58620F).O() && l()) {
                ((com.google.android.material.textfield.g) this.f58620F).P(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f58648T0 = true;
            AppCompatTextView appCompatTextView2 = this.f58676t;
            if (appCompatTextView2 != null && this.f58674s) {
                appCompatTextView2.setText((CharSequence) null);
                V4.n.a(this.f58655a, this.f58684x);
                this.f58676t.setVisibility(4);
            }
            sVar.d(true);
            B0();
        }
    }

    private int y(int i11, boolean z11) {
        int compoundPaddingRight = i11 - this.f58659e.getCompoundPaddingRight();
        s sVar = this.f58656b;
        return (sVar.a() == null || !z11) ? compoundPaddingRight : (sVar.b().getMeasuredWidth() - sVar.b().getPaddingRight()) + compoundPaddingRight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(int i11) {
        FrameLayout frameLayout = this.f58655a;
        if (i11 != 0 || this.f58648T0) {
            AppCompatTextView appCompatTextView = this.f58676t;
            if (appCompatTextView == null || !this.f58674s) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            V4.n.a(frameLayout, this.f58684x);
            this.f58676t.setVisibility(4);
            return;
        }
        if (this.f58676t == null || !this.f58674s || TextUtils.isEmpty(this.f58672r)) {
            return;
        }
        this.f58676t.setText(this.f58672r);
        V4.n.a(frameLayout, this.f58682w);
        this.f58676t.setVisibility(0);
        this.f58676t.bringToFront();
        announceForAccessibility(this.f58672r);
    }

    private void z0(boolean z11, boolean z12) {
        int defaultColor = this.f58637N0.getDefaultColor();
        int colorForState = this.f58637N0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f58637N0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z11) {
            this.f58642Q = colorForState2;
        } else if (z12) {
            this.f58642Q = colorForState;
        } else {
            this.f58642Q = defaultColor;
        }
    }

    @NonNull
    public final TextView A() {
        return this.f58656b.b();
    }

    public final CharSequence B() {
        return this.f58610A;
    }

    public final boolean C() {
        return this.f58658d.getVisibility() == 0 && this.f58687y0.getVisibility() == 0;
    }

    final void C0() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f58620F == null || this.f58632L == 0) {
            return;
        }
        boolean z11 = false;
        boolean z12 = isFocused() || ((editText2 = this.f58659e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f58659e) != null && editText.isHovered())) {
            z11 = true;
        }
        boolean isEnabled = isEnabled();
        o oVar = this.f58665k;
        if (!isEnabled) {
            this.f58642Q = this.f58647S0;
        } else if (oVar.i()) {
            if (this.f58637N0 != null) {
                z0(z12, z11);
            } else {
                this.f58642Q = oVar.l();
            }
        } else if (!this.f58668n || (appCompatTextView = this.f58669o) == null) {
            if (z12) {
                this.f58642Q = this.f58635M0;
            } else if (z11) {
                this.f58642Q = this.f58633L0;
            } else {
                this.f58642Q = this.f58631K0;
            }
        } else if (this.f58637N0 != null) {
            z0(z12, z11);
        } else {
            this.f58642Q = appCompatTextView.getCurrentTextColor();
        }
        u0();
        n.b(this, this.f58621F0, this.f58623G0);
        this.f58656b.e();
        J();
        m t2 = t();
        t2.getClass();
        if (t2 instanceof h) {
            boolean i11 = oVar.i();
            CheckableImageButton checkableImageButton = this.f58687y0;
            if (!i11 || checkableImageButton.getDrawable() == null) {
                n.a(this, checkableImageButton, this.f58611A0, this.f58613B0);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                androidx.core.graphics.drawable.a.i(mutate, oVar.l());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        if (this.f58632L == 2) {
            int i12 = this.f58636N;
            if (z12 && isEnabled()) {
                this.f58636N = this.f58640P;
            } else {
                this.f58636N = this.f58638O;
            }
            if (this.f58636N != i12 && l() && !this.f58648T0) {
                if (l()) {
                    ((com.google.android.material.textfield.g) this.f58620F).P(0.0f, 0.0f, 0.0f, 0.0f);
                }
                H();
            }
        }
        if (this.f58632L == 1) {
            if (!isEnabled()) {
                this.f58644R = this.f58641P0;
            } else if (z11 && !z12) {
                this.f58644R = this.f58645R0;
            } else if (z12) {
                this.f58644R = this.f58643Q0;
            } else {
                this.f58644R = this.f58639O0;
            }
        }
        j();
    }

    public final boolean D() {
        return this.f58665k.q();
    }

    final boolean E() {
        return this.f58648T0;
    }

    public final boolean F() {
        return this.f58618E;
    }

    public final void J() {
        n.b(this, this.f58687y0, this.f58611A0);
    }

    public final void K(int i11) {
        if (this.f58644R != i11) {
            this.f58644R = i11;
            this.f58639O0 = i11;
            this.f58643Q0 = i11;
            this.f58645R0 = i11;
            j();
        }
    }

    public final void L(int i11) {
        if (i11 == this.f58632L) {
            return;
        }
        this.f58632L = i11;
        if (this.f58659e != null) {
            G();
        }
    }

    public final void M(float f7, float f11, float f12, float f13) {
        boolean d11 = C9621p.d(this);
        this.f58628J = d11;
        float f14 = d11 ? f11 : f7;
        if (!d11) {
            f7 = f11;
        }
        float f15 = d11 ? f13 : f12;
        if (!d11) {
            f12 = f13;
        }
        C10856g c10856g = this.f58620F;
        if (c10856g != null && c10856g.s() == f14 && this.f58620F.t() == f7 && this.f58620F.m() == f15 && this.f58620F.n() == f12) {
            return;
        }
        y7.k kVar = this.f58626I;
        kVar.getClass();
        k.a aVar = new k.a(kVar);
        aVar.p(f14);
        aVar.t(f7);
        aVar.h(f15);
        aVar.l(f12);
        this.f58626I = aVar.a();
        j();
    }

    public final void N(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f58631K0 = colorStateList.getDefaultColor();
            this.f58647S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f58633L0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.f58635M0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.f58635M0 != colorStateList.getDefaultColor()) {
            this.f58635M0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public final void O(int i11) {
        this.f58638O = i11;
        C0();
    }

    public final void P(int i11) {
        this.f58640P = i11;
        C0();
    }

    public final void Q(boolean z11) {
        this.f58687y0.setActivated(z11);
    }

    public final void R(boolean z11) {
        this.f58687y0.b(z11);
    }

    public final void S(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f58687y0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public final void T(int i11) {
        U(i11 != 0 ? C7232a.a(getContext(), i11) : null);
    }

    public final void U(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f58687y0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            n.a(this, checkableImageButton, this.f58611A0, this.f58613B0);
            J();
        }
    }

    public final void V(int i11) {
        int i12 = this.f58683w0;
        if (i12 == i11) {
            return;
        }
        this.f58683w0 = i11;
        Iterator<f> it = this.f58689z0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i12);
        }
        Y(i11 != 0);
        if (t().b(this.f58632L)) {
            t().a();
            n.a(this, this.f58687y0, this.f58611A0, this.f58613B0);
        } else {
            throw new IllegalStateException("The current box background mode " + this.f58632L + " is not supported by the end icon mode " + i11);
        }
    }

    public final void W(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f58687y0;
        checkableImageButton.setOnClickListener(onClickListener);
        g0(checkableImageButton);
    }

    public final void X() {
        CheckableImageButton checkableImageButton = this.f58687y0;
        checkableImageButton.setOnLongClickListener(null);
        g0(checkableImageButton);
    }

    public final void Y(boolean z11) {
        if (C() != z11) {
            this.f58687y0.setVisibility(z11 ? 0 : 8);
            t0();
            A0();
            r0();
        }
    }

    public final void Z(CharSequence charSequence) {
        o oVar = this.f58665k;
        if (!oVar.q()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                a0(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            oVar.p();
        } else {
            oVar.B(charSequence);
        }
    }

    public final void a0(boolean z11) {
        this.f58665k.u(z11);
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i11, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i11, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f58655a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v0();
        EditText editText = (EditText) view;
        if (this.f58659e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f58683w0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f58659e = editText;
        int i12 = this.f58661g;
        if (i12 != -1) {
            this.f58661g = i12;
            if (editText != null && i12 != -1) {
                editText.setMinEms(i12);
            }
        } else {
            int i13 = this.f58663i;
            this.f58663i = i13;
            if (editText != null && i13 != -1) {
                editText.setMinWidth(i13);
            }
        }
        int i14 = this.f58662h;
        if (i14 != -1) {
            this.f58662h = i14;
            EditText editText2 = this.f58659e;
            if (editText2 != null && i14 != -1) {
                editText2.setMaxEms(i14);
            }
        } else {
            int i15 = this.f58664j;
            this.f58664j = i15;
            EditText editText3 = this.f58659e;
            if (editText3 != null && i15 != -1) {
                editText3.setMaxWidth(i15);
            }
        }
        G();
        d dVar = new d(this);
        EditText editText4 = this.f58659e;
        if (editText4 != null) {
            Y.C(editText4, dVar);
        }
        Typeface typeface = this.f58659e.getTypeface();
        C9608c c9608c = this.f58649U0;
        c9608c.S(typeface);
        c9608c.F(this.f58659e.getTextSize());
        c9608c.B(this.f58659e.getLetterSpacing());
        int gravity = this.f58659e.getGravity();
        c9608c.w((gravity & (-113)) | 48);
        c9608c.E(gravity);
        this.f58659e.addTextChangedListener(new t(this));
        if (this.f58627I0 == null) {
            this.f58627I0 = this.f58659e.getHintTextColors();
        }
        if (this.f58614C) {
            if (TextUtils.isEmpty(this.f58616D)) {
                CharSequence hint = this.f58659e.getHint();
                this.f58660f = hint;
                d0(hint);
                this.f58659e.setHint((CharSequence) null);
            }
            this.f58618E = true;
        }
        if (this.f58669o != null) {
            p0(this.f58659e.getText().length());
        }
        s0();
        this.f58665k.f();
        this.f58656b.bringToFront();
        this.f58657c.bringToFront();
        this.f58658d.bringToFront();
        this.f58621F0.bringToFront();
        Iterator<e> it = this.f58681v0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        A0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    public final void b0(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f58621F0;
        checkableImageButton.setImageDrawable(drawable);
        u0();
        n.a(this, checkableImageButton, this.f58623G0, this.f58625H0);
    }

    public final void c0(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        o oVar = this.f58665k;
        if (isEmpty) {
            if (oVar.r()) {
                oVar.y(false);
            }
        } else {
            if (!oVar.r()) {
                oVar.y(true);
            }
            oVar.C(charSequence);
        }
    }

    public final void d0(CharSequence charSequence) {
        if (this.f58614C) {
            if (!TextUtils.equals(charSequence, this.f58616D)) {
                this.f58616D = charSequence;
                this.f58649U0.Q(charSequence);
                if (!this.f58648T0) {
                    H();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i11) {
        EditText editText = this.f58659e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.f58660f != null) {
            boolean z11 = this.f58618E;
            this.f58618E = false;
            CharSequence hint = editText.getHint();
            this.f58659e.setHint(this.f58660f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i11);
                return;
            } finally {
                this.f58659e.setHint(hint);
                this.f58618E = z11;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i11);
        onProvideAutofillVirtualStructure(viewStructure, i11);
        FrameLayout frameLayout = this.f58655a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i12 = 0; i12 < frameLayout.getChildCount(); i12++) {
            View childAt = frameLayout.getChildAt(i12);
            ViewStructure newChild = viewStructure.newChild(i12);
            childAt.dispatchProvideAutofillStructure(newChild, i11);
            if (childAt == this.f58659e) {
                newChild.setHint(w());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f58654Z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f58654Z0 = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        C10856g c10856g;
        super.draw(canvas);
        boolean z11 = this.f58614C;
        C9608c c9608c = this.f58649U0;
        if (z11) {
            c9608c.d(canvas);
        }
        if (this.f58624H == null || (c10856g = this.f58622G) == null) {
            return;
        }
        c10856g.draw(canvas);
        if (this.f58659e.isFocused()) {
            Rect bounds = this.f58624H.getBounds();
            Rect bounds2 = this.f58622G.getBounds();
            float l11 = c9608c.l();
            int centerX = bounds2.centerX();
            bounds.left = C7292a.c(l11, centerX, bounds2.left);
            bounds.right = C7292a.c(l11, centerX, bounds2.right);
            this.f58624H.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.f58653Y0) {
            return;
        }
        this.f58653Y0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C9608c c9608c = this.f58649U0;
        boolean P11 = c9608c != null ? c9608c.P(drawableState) : false;
        if (this.f58659e != null) {
            int i11 = Y.f42258g;
            x0(isLaidOut() && isEnabled(), false);
        }
        s0();
        C0();
        if (P11) {
            invalidate();
        }
        this.f58653Y0 = false;
    }

    public final void e0() {
        this.f58651W0 = false;
    }

    public final void f0() {
        if (this.f58614C) {
            this.f58614C = false;
            this.f58618E = false;
            if (!TextUtils.isEmpty(this.f58616D) && TextUtils.isEmpty(this.f58659e.getHint())) {
                this.f58659e.setHint(this.f58616D);
            }
            if (!TextUtils.equals(null, this.f58616D)) {
                this.f58616D = null;
                this.f58649U0.Q(null);
                if (!this.f58648T0) {
                    H();
                }
            }
            if (this.f58659e != null) {
                v0();
            }
        }
    }

    public final void g(@NonNull e eVar) {
        this.f58681v0.add(eVar);
        if (this.f58659e != null) {
            eVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.f58659e;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + k();
    }

    public final void h(@NonNull f fVar) {
        this.f58689z0.add(fVar);
    }

    public final void h0(CharSequence charSequence) {
        if (this.f58676t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f58676t = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f58676t;
            int i11 = Y.f42258g;
            appCompatTextView2.setImportantForAccessibility(2);
            C4075d c4075d = new C4075d();
            c4075d.setDuration(87L);
            LinearInterpolator linearInterpolator = C7292a.f69463a;
            c4075d.setInterpolator(linearInterpolator);
            this.f58682w = c4075d;
            c4075d.setStartDelay(67L);
            C4075d c4075d2 = new C4075d();
            c4075d2.setDuration(87L);
            c4075d2.setInterpolator(linearInterpolator);
            this.f58684x = c4075d2;
            int i12 = this.f58680v;
            this.f58680v = i12;
            AppCompatTextView appCompatTextView3 = this.f58676t;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i12);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            i0(false);
        } else {
            if (!this.f58674s) {
                i0(true);
            }
            this.f58672r = charSequence;
        }
        EditText editText = this.f58659e;
        y0(editText != null ? editText.getText().length() : 0);
    }

    final void i(float f7) {
        C9608c c9608c = this.f58649U0;
        if (c9608c.l() == f7) {
            return;
        }
        if (this.f58652X0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f58652X0 = valueAnimator;
            valueAnimator.setInterpolator(C7292a.f69464b);
            this.f58652X0.setDuration(167L);
            this.f58652X0.addUpdateListener(new c());
        }
        this.f58652X0.setFloatValues(c9608c.l(), f7);
        this.f58652X0.start();
    }

    public final void j0(String str) {
        this.f58656b.f(str);
    }

    public final void k0(int i11) {
        this.f58656b.g(i11);
    }

    public final void l0(@NonNull ColorStateList colorStateList) {
        this.f58656b.h(colorStateList);
    }

    @NonNull
    final C10856g m() {
        int i11 = this.f58632L;
        if (i11 == 1 || i11 == 2) {
            return this.f58620F;
        }
        throw new IllegalStateException();
    }

    public final void m0(int i11) {
        this.f58612B.setTextAppearance(i11);
    }

    public final int n() {
        return this.f58644R;
    }

    public final void n0(@NonNull ColorStateList colorStateList) {
        this.f58612B.setTextColor(colorStateList);
    }

    public final int o() {
        return this.f58632L;
    }

    final void o0(@NonNull AppCompatTextView appCompatTextView, int i11) {
        try {
            appCompatTextView.setTextAppearance(i11);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(androidx.core.content.a.getColor(getContext(), R.color.design_error));
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f58649U0.q(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.f58659e;
        if (editText != null) {
            Rect rect = this.f58646S;
            C9609d.a(this, editText, rect);
            C10856g c10856g = this.f58622G;
            if (c10856g != null) {
                int i15 = rect.bottom;
                c10856g.setBounds(rect.left, i15 - this.f58638O, rect.right, i15);
            }
            C10856g c10856g2 = this.f58624H;
            if (c10856g2 != null) {
                int i16 = rect.bottom;
                c10856g2.setBounds(rect.left, i16 - this.f58640P, rect.right, i16);
            }
            if (this.f58614C) {
                float textSize = this.f58659e.getTextSize();
                C9608c c9608c = this.f58649U0;
                c9608c.F(textSize);
                int gravity = this.f58659e.getGravity();
                c9608c.w((gravity & (-113)) | 48);
                c9608c.E(gravity);
                if (this.f58659e == null) {
                    throw new IllegalStateException();
                }
                boolean d11 = C9621p.d(this);
                int i17 = rect.bottom;
                Rect rect2 = this.f58673r0;
                rect2.bottom = i17;
                int i18 = this.f58632L;
                if (i18 == 1) {
                    rect2.left = x(rect.left, d11);
                    rect2.top = rect.top + this.f58634M;
                    rect2.right = y(rect.right, d11);
                } else if (i18 != 2) {
                    rect2.left = x(rect.left, d11);
                    rect2.top = getPaddingTop();
                    rect2.right = y(rect.right, d11);
                } else {
                    rect2.left = this.f58659e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - k();
                    rect2.right = rect.right - this.f58659e.getPaddingRight();
                }
                c9608c.t(rect2.left, rect2.top, rect2.right, rect2.bottom);
                if (this.f58659e == null) {
                    throw new IllegalStateException();
                }
                float k11 = c9608c.k();
                rect2.left = this.f58659e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f58632L != 1 || this.f58659e.getMinLines() > 1) ? rect.top + this.f58659e.getCompoundPaddingTop() : (int) (rect.centerY() - (k11 / 2.0f));
                rect2.right = rect.right - this.f58659e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f58632L != 1 || this.f58659e.getMinLines() > 1) ? rect.bottom - this.f58659e.getCompoundPaddingBottom() : (int) (rect2.top + k11);
                rect2.bottom = compoundPaddingBottom;
                c9608c.A(rect2.left, rect2.top, rect2.right, compoundPaddingBottom);
                c9608c.s(false);
                if (!l() || this.f58648T0) {
                    return;
                }
                H();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        EditText editText;
        int max;
        super.onMeasure(i11, i12);
        boolean z11 = false;
        if (this.f58659e != null && this.f58659e.getMeasuredHeight() < (max = Math.max(this.f58657c.getMeasuredHeight(), this.f58656b.getMeasuredHeight()))) {
            this.f58659e.setMinimumHeight(max);
            z11 = true;
        }
        boolean r02 = r0();
        if (z11 || r02) {
            this.f58659e.post(new b());
        }
        if (this.f58676t != null && (editText = this.f58659e) != null) {
            this.f58676t.setGravity(editText.getGravity());
            this.f58676t.setPadding(this.f58659e.getCompoundPaddingLeft(), this.f58659e.getCompoundPaddingTop(), this.f58659e.getCompoundPaddingRight(), this.f58659e.getCompoundPaddingBottom());
        }
        A0();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        Z(gVar.f58694c);
        if (gVar.f58695d) {
            this.f58687y0.post(new a());
        }
        d0(gVar.f58696e);
        c0(gVar.f58697f);
        h0(gVar.f58698g);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        boolean z11 = false;
        boolean z12 = i11 == 1;
        boolean z13 = this.f58628J;
        if (z12 != z13) {
            if (z12 && !z13) {
                z11 = true;
            }
            InterfaceC10852c k11 = this.f58626I.k();
            RectF rectF = this.f58675s0;
            float a11 = k11.a(rectF);
            float a12 = this.f58626I.m().a(rectF);
            float a13 = this.f58626I.f().a(rectF);
            float a14 = this.f58626I.h().a(rectF);
            float f7 = z11 ? a11 : a12;
            if (z11) {
                a11 = a12;
            }
            float f11 = z11 ? a13 : a14;
            if (z11) {
                a13 = a14;
            }
            M(f7, a11, f11, a13);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        o oVar = this.f58665k;
        if (oVar.i()) {
            gVar.f58694c = v();
        }
        gVar.f58695d = this.f58683w0 != 0 && this.f58687y0.isChecked();
        gVar.f58696e = w();
        gVar.f58697f = oVar.r() ? oVar.n() : null;
        gVar.f58698g = z();
        return gVar;
    }

    public final int p() {
        return this.f58640P;
    }

    final void p0(int i11) {
        boolean z11 = this.f58668n;
        int i12 = this.f58667m;
        if (i12 == -1) {
            this.f58669o.setText(String.valueOf(i11));
            this.f58669o.setContentDescription(null);
            this.f58668n = false;
        } else {
            this.f58668n = i11 > i12;
            Context context = getContext();
            this.f58669o.setContentDescription(context.getString(this.f58668n ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i11), Integer.valueOf(this.f58667m)));
            if (z11 != this.f58668n) {
                q0();
            }
            int i13 = androidx.core.text.a.f42195i;
            this.f58669o.setText(new a.C0772a().a().a(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i11), Integer.valueOf(this.f58667m))));
        }
        if (this.f58659e == null || z11 == this.f58668n) {
            return;
        }
        x0(false, false);
        C0();
        s0();
    }

    public final int q() {
        return this.f58667m;
    }

    final CharSequence r() {
        AppCompatTextView appCompatTextView;
        if (this.f58666l && this.f58668n && (appCompatTextView = this.f58669o) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    final boolean r0() {
        boolean z11;
        if (this.f58659e == null) {
            return false;
        }
        s sVar = this.f58656b;
        CheckableImageButton checkableImageButton = null;
        boolean z12 = true;
        if ((sVar.c() != null || (sVar.a() != null && sVar.b().getVisibility() == 0)) && sVar.getMeasuredWidth() > 0) {
            int measuredWidth = sVar.getMeasuredWidth() - this.f58659e.getPaddingLeft();
            if (this.f58677t0 == null || this.f58679u0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f58677t0 = colorDrawable;
                this.f58679u0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f58659e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            ColorDrawable colorDrawable2 = this.f58677t0;
            if (drawable != colorDrawable2) {
                this.f58659e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z11 = true;
            }
            z11 = false;
        } else {
            if (this.f58677t0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f58659e.getCompoundDrawablesRelative();
                this.f58659e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f58677t0 = null;
                z11 = true;
            }
            z11 = false;
        }
        CheckableImageButton checkableImageButton2 = this.f58621F0;
        if ((checkableImageButton2.getVisibility() == 0 || ((this.f58683w0 != 0 && C()) || this.f58610A != null)) && this.f58657c.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f58612B.getMeasuredWidth() - this.f58659e.getPaddingRight();
            if (checkableImageButton2.getVisibility() == 0) {
                checkableImageButton = checkableImageButton2;
            } else if (this.f58683w0 != 0 && C()) {
                checkableImageButton = this.f58687y0;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f58659e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f58615C0;
            if (colorDrawable3 != null && this.f58617D0 != measuredWidth2) {
                this.f58617D0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f58659e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f58615C0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f58615C0 = colorDrawable4;
                this.f58617D0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.f58615C0;
            if (drawable2 != colorDrawable5) {
                this.f58619E0 = drawable2;
                this.f58659e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f58615C0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f58659e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f58615C0) {
                this.f58659e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f58619E0, compoundDrawablesRelative4[3]);
            } else {
                z12 = z11;
            }
            this.f58615C0 = null;
            return z12;
        }
        return z11;
    }

    public final EditText s() {
        return this.f58659e;
    }

    final void s0() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f58659e;
        if (editText == null || this.f58632L != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = H.f37629c;
        Drawable mutate = background.mutate();
        o oVar = this.f58665k;
        if (oVar.i()) {
            mutate.setColorFilter(C5064i.e(oVar.l(), PorterDuff.Mode.SRC_IN));
        } else if (this.f58668n && (appCompatTextView = this.f58669o) != null) {
            mutate.setColorFilter(C5064i.e(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f58659e.refreshDrawableState();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z11) {
        I(this, z11);
        super.setEnabled(z11);
    }

    @NonNull
    final CheckableImageButton u() {
        return this.f58687y0;
    }

    public final CharSequence v() {
        o oVar = this.f58665k;
        if (oVar.q()) {
            return oVar.k();
        }
        return null;
    }

    public final CharSequence w() {
        if (this.f58614C) {
            return this.f58616D;
        }
        return null;
    }

    final void w0(boolean z11) {
        x0(z11, false);
    }

    public final CharSequence z() {
        if (this.f58674s) {
            return this.f58672r;
        }
        return null;
    }
}
