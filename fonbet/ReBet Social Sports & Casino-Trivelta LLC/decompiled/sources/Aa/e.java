package Aa;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.f0;
import com.google.android.material.internal.BaselineLayout;
import com.reactnativesystemnavigationbar.SystemNavigationBarModule;
import ja.AbstractC5104a;
import n0.AbstractC5597a;
import y0.z;

/* loaded from: classes3.dex */
public abstract class e extends FrameLayout implements h {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* renamed from: R4, reason: collision with root package name */
    public static final c f291R4;

    /* renamed from: S4, reason: collision with root package name */
    public static final c f292S4;

    /* renamed from: A, reason: collision with root package name */
    public BaselineLayout f293A;

    /* renamed from: B, reason: collision with root package name */
    public int f294B;

    /* renamed from: C, reason: collision with root package name */
    public int f295C;

    /* renamed from: D, reason: collision with root package name */
    public int f296D;

    /* renamed from: E, reason: collision with root package name */
    public int f297E;

    /* renamed from: F, reason: collision with root package name */
    public int f298F;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f299G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f300H;

    /* renamed from: I, reason: collision with root package name */
    public androidx.appcompat.view.menu.g f301I;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f302J;

    /* renamed from: K, reason: collision with root package name */
    public Drawable f303K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f304L;

    /* renamed from: O, reason: collision with root package name */
    public ValueAnimator f305O;

    /* renamed from: P, reason: collision with root package name */
    public c f306P;

    /* renamed from: P4, reason: collision with root package name */
    public boolean f307P4;

    /* renamed from: Q4, reason: collision with root package name */
    public Rect f308Q4;

    /* renamed from: R, reason: collision with root package name */
    public float f309R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f310T;

    /* renamed from: T1, reason: collision with root package name */
    public com.google.android.material.badge.a f311T1;

    /* renamed from: V, reason: collision with root package name */
    public int f312V;

    /* renamed from: V1, reason: collision with root package name */
    public int f313V1;

    /* renamed from: W, reason: collision with root package name */
    public int f314W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f315a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f316b;

    /* renamed from: b1, reason: collision with root package name */
    public int f317b1;

    /* renamed from: b2, reason: collision with root package name */
    public int f318b2;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f319c;

    /* renamed from: d, reason: collision with root package name */
    public int f320d;

    /* renamed from: e, reason: collision with root package name */
    public int f321e;

    /* renamed from: f, reason: collision with root package name */
    public int f322f;

    /* renamed from: g, reason: collision with root package name */
    public int f323g;

    /* renamed from: g1, reason: collision with root package name */
    public int f324g1;

    /* renamed from: g2, reason: collision with root package name */
    public int f325g2;

    /* renamed from: h, reason: collision with root package name */
    public float f326h;

    /* renamed from: i, reason: collision with root package name */
    public float f327i;

    /* renamed from: j, reason: collision with root package name */
    public float f328j;

    /* renamed from: k, reason: collision with root package name */
    public float f329k;

    /* renamed from: l, reason: collision with root package name */
    public float f330l;

    /* renamed from: m, reason: collision with root package name */
    public float f331m;

    /* renamed from: n, reason: collision with root package name */
    public int f332n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f333o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f334p;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f335p1;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f336p2;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f337q;

    /* renamed from: r, reason: collision with root package name */
    public final View f338r;

    /* renamed from: s, reason: collision with root package name */
    public final FrameLayout f339s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f340t;

    /* renamed from: u, reason: collision with root package name */
    public final BaselineLayout f341u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f342v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f343w;

    /* renamed from: x, reason: collision with root package name */
    public BaselineLayout f344x;

    /* renamed from: x1, reason: collision with root package name */
    public int f345x1;

    /* renamed from: x2, reason: collision with root package name */
    public boolean f346x2;

    /* renamed from: y, reason: collision with root package name */
    public TextView f347y;

    /* renamed from: y1, reason: collision with root package name */
    public int f348y1;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f349y2;

    /* renamed from: z, reason: collision with root package name */
    public TextView f350z;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f351a;

        public a(int i10) {
            this.f351a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.A(this.f351a);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f353a;

        public b(float f10) {
            this.f353a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f353a);
        }
    }

    public static class c {
        public c() {
        }

        public float a(float f10, float f11) {
            return AbstractC5104a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        public float b(float f10) {
            return AbstractC5104a.a(0.4f, 1.0f, f10);
        }

        public float c(float f10) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10));
            view.setScaleY(c(f10));
            view.setAlpha(a(f10, f11));
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static class d extends c {
        public d() {
            super(null);
        }

        @Override // Aa.e.c
        public float c(float f10) {
            return b(f10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f291R4 = new c(aVar);
        f292S4 = new d(aVar);
    }

    public e(Context context) {
        super(context);
        this.f315a = false;
        this.f294B = -1;
        this.f295C = 0;
        this.f296D = 0;
        this.f297E = 0;
        this.f298F = 0;
        this.f300H = false;
        this.f306P = f291R4;
        this.f309R = 0.0f;
        this.f310T = false;
        this.f312V = 0;
        this.f314W = 0;
        this.f317b1 = -2;
        this.f324g1 = 0;
        this.f335p1 = false;
        this.f345x1 = 0;
        this.f348y1 = 0;
        this.f318b2 = 0;
        this.f325g2 = 49;
        this.f336p2 = false;
        this.f346x2 = false;
        this.f349y2 = false;
        this.f307P4 = false;
        this.f308Q4 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f334p = (LinearLayout) findViewById(ia.g.f48413U);
        LinearLayout linearLayout = (LinearLayout) findViewById(ia.g.f48416X);
        this.f337q = linearLayout;
        this.f338r = findViewById(ia.g.f48412T);
        this.f339s = (FrameLayout) findViewById(ia.g.f48414V);
        this.f340t = (ImageView) findViewById(ia.g.f48415W);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(ia.g.f48417Y);
        this.f341u = baselineLayout;
        TextView textView = (TextView) findViewById(ia.g.f48420a0);
        this.f342v = textView;
        TextView textView2 = (TextView) findViewById(ia.g.f48418Z);
        this.f343w = textView2;
        j();
        this.f293A = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f320d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f321e = baselineLayout.getPaddingBottom();
        this.f322f = 0;
        this.f323g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f347y.setImportantForAccessibility(2);
        this.f350z.setImportantForAccessibility(2);
        setFocusable(true);
        f();
        this.f324g1 = getResources().getDimensionPixelSize(ia.e.f48301G);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Aa.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                e.a(e.this, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    public static void G(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private void H() {
        androidx.appcompat.view.menu.g gVar = this.f301I;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f336p2 && this.f346x2)) ? 8 : 0);
        }
    }

    public static /* synthetic */ void a(e eVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (eVar.f340t.getVisibility() == 0) {
            eVar.z(eVar.f340t);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eVar.f337q.getLayoutParams();
        int i18 = (i12 - i10) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i19 = (i13 - i11) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z11 = true;
        if (eVar.f313V1 == 1 && eVar.f317b1 == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) eVar.f338r.getLayoutParams();
            if (eVar.f317b1 != -2 || eVar.f338r.getMeasuredWidth() == i18) {
                z10 = false;
            } else {
                layoutParams2.width = Math.max(i18, Math.min(eVar.f312V, eVar.getMeasuredWidth() - (eVar.f345x1 * 2)));
                z10 = true;
            }
            if (eVar.f338r.getMeasuredHeight() < i19) {
                layoutParams2.height = i19;
            } else {
                z11 = z10;
            }
            if (z11) {
                eVar.f338r.setLayoutParams(layoutParams2);
            }
        }
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof e) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.f311T1;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f311T1.o();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f339s.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f340t.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    public static Drawable h(ColorStateList colorStateList) {
        return new RippleDrawable(Da.a.a(colorStateList), null, null);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public static void u(TextView textView, int i10) {
        C0.j.m(textView, i10);
        int j10 = Ca.c.j(textView.getContext(), i10, 0);
        if (j10 != 0) {
            textView.setTextSize(0, j10);
        }
    }

    public static void v(View view, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    public static void w(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    public void A(int i10) {
        if (i10 > 0 || getVisibility() != 0) {
            int min = Math.min(this.f312V, i10 - (this.f345x1 * 2));
            int i11 = this.f314W;
            if (this.f313V1 == 1) {
                int i12 = i10 - (this.f348y1 * 2);
                int i13 = this.f317b1;
                if (i13 != -1) {
                    i12 = i13 == -2 ? this.f334p.getMeasuredWidth() : Math.min(i13, i12);
                }
                min = i12;
                i11 = Math.max(this.f324g1, this.f337q.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f338r.getLayoutParams();
            if (k()) {
                i11 = min;
            }
            layoutParams.height = i11;
            layoutParams.width = Math.max(0, min);
            this.f338r.setLayoutParams(layoutParams);
        }
    }

    public final void B() {
        if (k()) {
            this.f306P = f292S4;
        } else {
            this.f306P = f291R4;
        }
    }

    public final void C() {
        TextView textView = this.f343w;
        textView.setTypeface(textView.getTypeface(), this.f300H ? 1 : 0);
        TextView textView2 = this.f350z;
        textView2.setTypeface(textView2.getTypeface(), this.f300H ? 1 : 0);
    }

    public final void D(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(Ca.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.f299G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        C();
    }

    public final void E(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(Ca.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.f299G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void F() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f318b2 = 0;
        this.f293A = this.f341u;
        int i16 = 8;
        if (this.f313V1 == 1) {
            if (this.f344x.getParent() == null) {
                e();
            }
            Rect rect = this.f308Q4;
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = rect.top;
            i10 = rect.bottom;
            this.f318b2 = 1;
            int i20 = this.f348y1;
            this.f293A = this.f344x;
            i14 = i19;
            i13 = i18;
            i12 = i17;
            i11 = i20;
            i15 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 8;
            i16 = 0;
        }
        this.f341u.setVisibility(i16);
        this.f344x.setVisibility(i15);
        ((FrameLayout.LayoutParams) this.f334p.getLayoutParams()).gravity = this.f325g2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f337q.getLayoutParams();
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i13;
        layoutParams.topMargin = i14;
        layoutParams.bottomMargin = i10;
        setPadding(i11, 0, i11, 0);
        A(getWidth());
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f301I = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        f0.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        H();
        this.f315a = true;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f310T) {
            this.f339s.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f337q.addView(this.f344x, layoutParams);
        q();
    }

    public final void f() {
        float textSize = this.f342v.getTextSize();
        float textSize2 = this.f343w.getTextSize();
        this.f326h = textSize - textSize2;
        this.f327i = (textSize2 * 1.0f) / textSize;
        this.f328j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f347y.getTextSize();
        float textSize4 = this.f350z.getTextSize();
        this.f329k = textSize3 - textSize4;
        this.f330l = (textSize4 * 1.0f) / textSize3;
        this.f331m = (textSize3 * 1.0f) / textSize4;
    }

    public void g() {
        o();
        this.f301I = null;
        this.f309R = 0.0f;
        this.f315a = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f338r.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.f311T1;
    }

    @NonNull
    public BaselineLayout getExpandedLabelGroup() {
        return this.f344x;
    }

    public int getItemBackgroundResId() {
        return ia.f.f48391j;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f301I;
    }

    public int getItemDefaultMarginResId() {
        return ia.e.f48377x0;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f294B;
    }

    @NonNull
    public BaselineLayout getLabelGroup() {
        return this.f341u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f334p.getLayoutParams();
        return this.f334p.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.f313V1 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f337q.getLayoutParams();
            return this.f337q.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f341u.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.f341u.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    public final boolean i() {
        return this.f311T1 != null;
    }

    public final void j() {
        float dimension = getResources().getDimension(ia.e.f48332b);
        float dimension2 = getResources().getDimension(ia.e.f48330a);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.f344x = baselineLayout;
        baselineLayout.setVisibility(8);
        this.f344x.setDuplicateParentStateEnabled(true);
        this.f344x.setMeasurePaddingFromBaseline(this.f349y2);
        TextView textView = new TextView(getContext());
        this.f347y = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.f347y;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f347y.setDuplicateParentStateEnabled(true);
        this.f347y.setIncludeFontPadding(false);
        this.f347y.setGravity(16);
        this.f347y.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.f350z = textView3;
        textView3.setMaxLines(1);
        this.f350z.setEllipsize(truncateAt);
        this.f350z.setDuplicateParentStateEnabled(true);
        this.f350z.setVisibility(4);
        this.f350z.setIncludeFontPadding(false);
        this.f350z.setGravity(16);
        this.f350z.setTextSize(dimension2);
        this.f344x.addView(this.f347y);
        this.f344x.addView(this.f350z);
    }

    public final boolean k() {
        return this.f335p1 && this.f332n == 2;
    }

    public final void l(float f10) {
        if (!this.f310T || !this.f315a || !isAttachedToWindow()) {
            p(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f305O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f305O = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f309R, f10);
        this.f305O = ofFloat;
        ofFloat.addUpdateListener(new b(f10));
        this.f305O.setInterpolator(za.h.g(getContext(), ia.c.f48225b0, AbstractC5104a.f53859b));
        this.f305O.setDuration(za.h.f(getContext(), ia.c.f48214S, getResources().getInteger(ia.h.f48462b)));
        this.f305O.start();
    }

    public final void m() {
        androidx.appcompat.view.menu.g gVar = this.f301I;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    public final void n() {
        Drawable drawable = this.f319c;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f316b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f310T && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(Da.a.d(this.f316b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = h(this.f316b);
            }
        }
        this.f339s.setPadding(0, 0, 0, 0);
        this.f339s.setForeground(rippleDrawable);
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    public void o() {
        y(this.f340t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f301I;
        if (gVar != null && gVar.isCheckable() && this.f301I.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.f311T1;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f301I.getTitle();
            if (!TextUtils.isEmpty(this.f301I.getContentDescription())) {
                title = this.f301I.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f311T1.l()));
        }
        z f12 = z.f1(accessibilityNodeInfo);
        f12.z0(z.g.b(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            f12.x0(false);
            f12.o0(z.a.f68223i);
        }
        f12.R0(getResources().getString(ia.k.f48530h));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a(i10));
    }

    public final void p(float f10, float f11) {
        this.f306P.d(f10, f11, this.f338r);
        this.f309R = f10;
    }

    public final void q() {
        int i10 = this.f340t.getLayoutParams().width > 0 ? this.f323g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f344x.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i10 : 0;
        }
    }

    public final void r(View view, View view2, float f10, float f11) {
        v(this.f334p, this.f313V1 == 0 ? (int) (this.f320d + f11) : 0, 0, this.f325g2);
        LinearLayout linearLayout = this.f337q;
        int i10 = this.f313V1;
        v(linearLayout, i10 == 0 ? 0 : this.f308Q4.top, i10 == 0 ? 0 : this.f308Q4.bottom, i10 == 0 ? 17 : 8388627);
        G(this.f341u, this.f321e);
        this.f293A.setVisibility(0);
        w(view, 1.0f, 1.0f, 0);
        w(view2, f10, f10, 4);
    }

    public final void s() {
        LinearLayout linearLayout = this.f334p;
        int i10 = this.f320d;
        v(linearLayout, i10, i10, this.f313V1 == 0 ? 17 : this.f325g2);
        v(this.f337q, 0, 0, 17);
        G(this.f341u, 0);
        this.f293A.setVisibility(8);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f338r.setBackground(drawable);
        n();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f310T = z10;
        n();
        this.f338r.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i10) {
        this.f324g1 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f348y1 = i10;
        if (this.f313V1 == 1) {
            setPadding(i10, 0, i10, 0);
        }
        A(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(@NonNull Rect rect) {
        this.f308Q4 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i10) {
        this.f317b1 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f314W = i10;
        A(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f322f != i10) {
            this.f322f = i10;
            ((LinearLayout.LayoutParams) this.f341u.getLayoutParams()).topMargin = i10;
            if (this.f344x.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f344x.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
                if (getLayoutDirection() == 1) {
                    i10 = 0;
                }
                layoutParams.leftMargin = i10;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f345x1 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f335p1 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f312V = i10;
        A(getWidth());
    }

    public void setBadge(@NonNull com.google.android.material.badge.a aVar) {
        if (this.f311T1 == aVar) {
            return;
        }
        if (i() && this.f340t != null) {
            Log.w(SystemNavigationBarModule.NAME, "Multiple badges shouldn't be attached to one item.");
            y(this.f340t);
        }
        this.f311T1 = aVar;
        aVar.T(this.f318b2);
        ImageView imageView = this.f340t;
        if (imageView != null) {
            x(imageView);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        setLabelPivots(this.f343w);
        setLabelPivots(this.f342v);
        setLabelPivots(this.f350z);
        setLabelPivots(this.f347y);
        l(z10 ? 1.0f : 0.0f);
        TextView textView = this.f343w;
        TextView textView2 = this.f342v;
        float f10 = this.f326h;
        float f11 = this.f327i;
        float f12 = this.f328j;
        if (this.f313V1 == 1) {
            textView = this.f350z;
            textView2 = this.f347y;
            f10 = this.f329k;
            f11 = this.f330l;
            f12 = this.f331m;
        }
        int i10 = this.f332n;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        s();
                    }
                } else if (z10) {
                    r(textView, textView2, f11, f10);
                } else {
                    r(textView2, textView, f12, 0.0f);
                }
            } else if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (this.f333o) {
            if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (z10) {
            r(textView, textView2, f11, f10);
        } else {
            r(textView2, textView, f12, 0.0f);
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f342v.setEnabled(z10);
        this.f343w.setEnabled(z10);
        this.f347y.setEnabled(z10);
        this.f350z.setEnabled(z10);
        this.f340t.setEnabled(z10);
    }

    @Override // Aa.h
    public void setExpanded(boolean z10) {
        this.f336p2 = z10;
        H();
    }

    public void setHorizontalTextAppearanceActive(int i10) {
        this.f297E = i10;
        TextView textView = this.f350z;
        if (i10 == 0) {
            i10 = this.f295C;
        }
        D(textView, i10);
    }

    public void setHorizontalTextAppearanceInactive(int i10) {
        this.f298F = i10;
        TextView textView = this.f347y;
        if (i10 == 0) {
            i10 = this.f296D;
        }
        E(textView, i10);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f303K) {
            return;
        }
        this.f303K = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = AbstractC5597a.r(drawable).mutate();
            this.f304L = drawable;
            ColorStateList colorStateList = this.f302J;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f340t.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        if (this.f323g != i10) {
            this.f323g = i10;
            q();
            requestLayout();
        }
    }

    public void setIconSize(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f340t.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f340t.setLayoutParams(layoutParams);
        q();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f302J = colorStateList;
        if (this.f301I == null || (drawable = this.f304L) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f304L.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemGravity(int i10) {
        this.f325g2 = i10;
        requestLayout();
    }

    public void setItemIconGravity(int i10) {
        if (this.f313V1 != i10) {
            this.f313V1 = i10;
            F();
            n();
        }
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f321e != i10) {
            this.f321e = i10;
            m();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f320d != i10) {
            this.f320d = i10;
            m();
        }
    }

    public void setItemPosition(int i10) {
        this.f294B = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f316b = colorStateList;
        n();
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f307P4 = z10;
        setTextAppearanceActive(this.f295C);
        setTextAppearanceInactive(this.f296D);
        setHorizontalTextAppearanceActive(this.f297E);
        setHorizontalTextAppearanceInactive(this.f298F);
    }

    public void setLabelMaxLines(int i10) {
        this.f342v.setMaxLines(i10);
        this.f343w.setMaxLines(i10);
        this.f347y.setMaxLines(i10);
        this.f350z.setMaxLines(i10);
        if (Build.VERSION.SDK_INT > 34) {
            this.f342v.setGravity(17);
            this.f343w.setGravity(17);
        } else if (i10 > 1) {
            this.f342v.setEllipsize(null);
            this.f343w.setEllipsize(null);
            this.f342v.setGravity(17);
            this.f343w.setGravity(17);
        } else {
            this.f342v.setGravity(16);
            this.f343w.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f332n != i10) {
            this.f332n = i10;
            B();
            A(getWidth());
            m();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f349y2 = z10;
        this.f341u.setMeasurePaddingFromBaseline(z10);
        this.f342v.setIncludeFontPadding(z10);
        this.f343w.setIncludeFontPadding(z10);
        this.f344x.setMeasurePaddingFromBaseline(z10);
        this.f347y.setIncludeFontPadding(z10);
        this.f350z.setIncludeFontPadding(z10);
        requestLayout();
    }

    @Override // Aa.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f346x2 = z10;
        H();
    }

    public void setShifting(boolean z10) {
        if (this.f333o != z10) {
            this.f333o = z10;
            m();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.f295C = i10;
        D(this.f343w, i10);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f300H = z10;
        setTextAppearanceActive(this.f295C);
        setHorizontalTextAppearanceActive(this.f297E);
        C();
    }

    public void setTextAppearanceInactive(int i10) {
        this.f296D = i10;
        E(this.f342v, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f299G = colorStateList;
        if (colorStateList != null) {
            this.f342v.setTextColor(colorStateList);
            this.f343w.setTextColor(colorStateList);
            this.f347y.setTextColor(colorStateList);
            this.f350z.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f342v.setText(charSequence);
        this.f343w.setText(charSequence);
        this.f347y.setText(charSequence);
        this.f350z.setText(charSequence);
        androidx.appcompat.view.menu.g gVar = this.f301I;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.g gVar2 = this.f301I;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f301I.getTooltipText();
        }
        f0.a(this, charSequence);
    }

    public final void t(TextView textView, int i10) {
        if (this.f307P4) {
            C0.j.m(textView, i10);
        } else {
            u(textView, i10);
        }
    }

    public final void x(View view) {
        if (i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.b.a(this.f311T1, view);
        }
    }

    public final void y(View view) {
        if (i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.b.e(this.f311T1, view);
            }
            this.f311T1 = null;
        }
    }

    public final void z(View view) {
        if (i()) {
            com.google.android.material.badge.b.f(this.f311T1, view, null);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f319c = drawable;
        n();
    }
}
