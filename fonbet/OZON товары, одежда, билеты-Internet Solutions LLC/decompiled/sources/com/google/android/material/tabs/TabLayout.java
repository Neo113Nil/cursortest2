package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import androidx.core.view.H;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import i.C6977a;
import i7.C7017a;
import j.C7232a;
import j7.C7292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s7.C9619n;
import s7.C9621p;
import w7.C10444a;
import y2.q;
import y7.C10856g;
import y7.C10857h;

@ViewPager.e
/* loaded from: classes9.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: N, reason: collision with root package name */
    private static final x2.h f58522N = new x2.h(16);

    /* renamed from: A, reason: collision with root package name */
    int f58523A;

    /* renamed from: B, reason: collision with root package name */
    boolean f58524B;

    /* renamed from: C, reason: collision with root package name */
    private com.google.android.material.tabs.c f58525C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayList<b> f58526D;

    /* renamed from: E, reason: collision with root package name */
    private h f58527E;

    /* renamed from: F, reason: collision with root package name */
    private ValueAnimator f58528F;

    /* renamed from: G, reason: collision with root package name */
    ViewPager f58529G;

    /* renamed from: H, reason: collision with root package name */
    private androidx.viewpager.widget.a f58530H;

    /* renamed from: I, reason: collision with root package name */
    private DataSetObserver f58531I;

    /* renamed from: J, reason: collision with root package name */
    private f f58532J;

    /* renamed from: K, reason: collision with root package name */
    private a f58533K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f58534L;

    /* renamed from: M, reason: collision with root package name */
    private final x2.g f58535M;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<e> f58536a;

    /* renamed from: b, reason: collision with root package name */
    private e f58537b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final d f58538c;

    /* renamed from: d, reason: collision with root package name */
    int f58539d;

    /* renamed from: e, reason: collision with root package name */
    int f58540e;

    /* renamed from: f, reason: collision with root package name */
    int f58541f;

    /* renamed from: g, reason: collision with root package name */
    int f58542g;

    /* renamed from: h, reason: collision with root package name */
    int f58543h;

    /* renamed from: i, reason: collision with root package name */
    ColorStateList f58544i;

    /* renamed from: j, reason: collision with root package name */
    ColorStateList f58545j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    Drawable f58546k;

    /* renamed from: l, reason: collision with root package name */
    private int f58547l;

    /* renamed from: m, reason: collision with root package name */
    float f58548m;

    /* renamed from: n, reason: collision with root package name */
    float f58549n;

    /* renamed from: o, reason: collision with root package name */
    final int f58550o;

    /* renamed from: p, reason: collision with root package name */
    int f58551p;

    /* renamed from: q, reason: collision with root package name */
    private final int f58552q;

    /* renamed from: r, reason: collision with root package name */
    private final int f58553r;

    /* renamed from: s, reason: collision with root package name */
    private final int f58554s;

    /* renamed from: t, reason: collision with root package name */
    private int f58555t;

    /* renamed from: u, reason: collision with root package name */
    int f58556u;

    /* renamed from: v, reason: collision with root package name */
    int f58557v;

    /* renamed from: w, reason: collision with root package name */
    int f58558w;

    /* renamed from: x, reason: collision with root package name */
    int f58559x;

    /* renamed from: y, reason: collision with root package name */
    boolean f58560y;

    /* renamed from: z, reason: collision with root package name */
    boolean f58561z;

    private class a implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        private boolean f58562a;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(@NonNull ViewPager viewPager, androidx.viewpager.widget.a aVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f58529G == viewPager) {
                tabLayout.t(aVar, this.f58562a);
            }
        }

        final void b() {
            this.f58562a = true;
        }
    }

    @Deprecated
    public interface b<T extends e> {
        void onTabReselected(T t2);

        void onTabSelected(T t2);

        void onTabUnselected(T t2);
    }

    private class c extends DataSetObserver {
        c() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.n();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.n();
        }
    }

    class d extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        ValueAnimator f58565a;

        /* renamed from: b, reason: collision with root package name */
        int f58566b;

        /* renamed from: c, reason: collision with root package name */
        float f58567c;

        final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f58569a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f58570b;

            a(View view, View view2) {
                this.f58569a = view;
                this.f58570b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                d.this.f(this.f58569a, this.f58570b, valueAnimator.getAnimatedFraction());
            }
        }

        final class b extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f58572a;

            b(int i11) {
                this.f58572a = i11;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                d.this.f58566b = this.f58572a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                d.this.f58566b = this.f58572a;
            }
        }

        d(Context context) {
            super(context);
            this.f58566b = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            View childAt = getChildAt(this.f58566b);
            TabLayout tabLayout = TabLayout.this;
            com.google.android.material.tabs.c cVar = tabLayout.f58525C;
            Drawable drawable = tabLayout.f58546k;
            cVar.getClass();
            RectF a11 = com.google.android.material.tabs.c.a(tabLayout, childAt);
            drawable.setBounds((int) a11.left, drawable.getBounds().top, (int) a11.right, drawable.getBounds().bottom);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(View view, View view2, float f7) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.f58546k;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f58546k.getBounds().bottom);
            } else {
                tabLayout.f58525C.b(tabLayout, view, view2, f7, tabLayout.f58546k);
            }
            int i11 = Y.f42258g;
            postInvalidateOnAnimation();
        }

        private void g(int i11, int i12, boolean z11) {
            View childAt = getChildAt(this.f58566b);
            View childAt2 = getChildAt(i11);
            if (childAt2 == null) {
                d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z11) {
                this.f58565a.removeAllUpdateListeners();
                this.f58565a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f58565a = valueAnimator;
            valueAnimator.setInterpolator(C7292a.f69464b);
            valueAnimator.setDuration(i12);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i11));
            valueAnimator.start();
        }

        final void c(int i11, int i12) {
            ValueAnimator valueAnimator = this.f58565a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f58565a.cancel();
            }
            g(i11, i12, true);
        }

        @Override // android.view.View
        public final void draw(@NonNull Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.f58546k.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.f58546k.getIntrinsicHeight();
            }
            int i11 = tabLayout.f58558w;
            if (i11 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i11 != 1) {
                height = 0;
                if (i11 != 2) {
                    height2 = i11 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (tabLayout.f58546k.getBounds().width() > 0) {
                Rect bounds = tabLayout.f58546k.getBounds();
                tabLayout.f58546k.setBounds(bounds.left, height, bounds.right, height2);
                Drawable drawable = tabLayout.f58546k;
                if (tabLayout.f58547l != 0) {
                    androidx.core.graphics.drawable.a.i(drawable, tabLayout.f58547l);
                } else {
                    androidx.core.graphics.drawable.a.j(drawable, null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        final void e(float f7, int i11) {
            ValueAnimator valueAnimator = this.f58565a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f58565a.cancel();
            }
            this.f58566b = i11;
            this.f58567c = f7;
            f(getChildAt(i11), getChildAt(this.f58566b + 1), this.f58567c);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            ValueAnimator valueAnimator = this.f58565a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                d();
            } else {
                g(this.f58566b, -1, false);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected final void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (View.MeasureSpec.getMode(i11) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z11 = true;
            if (tabLayout.f58556u == 1 || tabLayout.f58559x == 2) {
                int childCount = getChildCount();
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() == 0) {
                        i13 = Math.max(i13, childAt.getMeasuredWidth());
                    }
                }
                if (i13 <= 0) {
                    return;
                }
                if (i13 * childCount <= getMeasuredWidth() - (((int) C9621p.b(16, getContext())) * 2)) {
                    boolean z12 = false;
                    for (int i15 = 0; i15 < childCount; i15++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i15).getLayoutParams();
                        if (layoutParams.width != i13 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i13;
                            layoutParams.weight = 0.0f;
                            z12 = true;
                        }
                    }
                    z11 = z12;
                } else {
                    tabLayout.f58556u = 0;
                    tabLayout.z(false);
                }
                if (z11) {
                    super.onMeasure(i11, i12);
                }
            }
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private Object f58574a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f58575b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f58576c;

        /* renamed from: d, reason: collision with root package name */
        private int f58577d = -1;

        /* renamed from: e, reason: collision with root package name */
        private View f58578e;

        /* renamed from: f, reason: collision with root package name */
        public TabLayout f58579f;

        /* renamed from: g, reason: collision with root package name */
        @NonNull
        public g f58580g;

        public final View c() {
            return this.f58578e;
        }

        public final int d() {
            return this.f58577d;
        }

        public final Object e() {
            return this.f58574a;
        }

        public final CharSequence f() {
            return this.f58575b;
        }

        public final boolean g() {
            TabLayout tabLayout = this.f58579f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int j11 = tabLayout.j();
            return j11 != -1 && j11 == this.f58577d;
        }

        final void h() {
            this.f58579f = null;
            this.f58580g = null;
            this.f58574a = null;
            this.f58575b = null;
            this.f58576c = null;
            this.f58577d = -1;
            this.f58578e = null;
        }

        public final void i() {
            TabLayout tabLayout = this.f58579f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.s(this, true);
        }

        @NonNull
        public final void j(CharSequence charSequence) {
            this.f58576c = charSequence;
            g gVar = this.f58580g;
            if (gVar != null) {
                gVar.e();
            }
        }

        @NonNull
        public final void k(View view) {
            this.f58578e = view;
            g gVar = this.f58580g;
            if (gVar != null) {
                gVar.e();
            }
        }

        final void l(int i11) {
            this.f58577d = i11;
        }

        @NonNull
        public final void m(Object obj) {
            this.f58574a = obj;
        }

        @NonNull
        public final void n(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f58576c) && !TextUtils.isEmpty(charSequence)) {
                this.f58580g.setContentDescription(charSequence);
            }
            this.f58575b = charSequence;
            g gVar = this.f58580g;
            if (gVar != null) {
                gVar.e();
            }
        }
    }

    public static class f implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<TabLayout> f58581a;

        /* renamed from: b, reason: collision with root package name */
        private int f58582b;

        /* renamed from: c, reason: collision with root package name */
        private int f58583c;

        public f(TabLayout tabLayout) {
            this.f58581a = new WeakReference<>(tabLayout);
        }

        final void a() {
            this.f58583c = 0;
            this.f58582b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i11) {
            this.f58582b = this.f58583c;
            this.f58583c = i11;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i11, float f7, int i12) {
            TabLayout tabLayout = this.f58581a.get();
            if (tabLayout != null) {
                int i13 = this.f58583c;
                tabLayout.u(i11, f7, i13 != 2 || this.f58582b == 1, (i13 == 2 && this.f58582b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i11) {
            TabLayout tabLayout = this.f58581a.get();
            if (tabLayout == null || tabLayout.j() == i11 || i11 >= tabLayout.l()) {
                return;
            }
            int i12 = this.f58583c;
            tabLayout.s(tabLayout.k(i11), i12 == 0 || (i12 == 2 && this.f58582b == 0));
        }
    }

    public final class g extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        private e f58584a;

        /* renamed from: b, reason: collision with root package name */
        private TextView f58585b;

        /* renamed from: c, reason: collision with root package name */
        private ImageView f58586c;

        /* renamed from: d, reason: collision with root package name */
        private View f58587d;

        /* renamed from: e, reason: collision with root package name */
        private TextView f58588e;

        /* renamed from: f, reason: collision with root package name */
        private ImageView f58589f;

        /* renamed from: g, reason: collision with root package name */
        private Drawable f58590g;

        /* renamed from: h, reason: collision with root package name */
        private int f58591h;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, com.google.android.material.tabs.TabLayout$g] */
        public g(@NonNull Context context) {
            super(context);
            this.f58591h = 2;
            int i11 = TabLayout.this.f58550o;
            if (i11 != 0) {
                Drawable a11 = C7232a.a(context, i11);
                this.f58590g = a11;
                if (a11 != null && a11.isStateful()) {
                    this.f58590g.setState(getDrawableState());
                }
            } else {
                this.f58590g = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            ColorStateList colorStateList = TabLayout.this.f58545j;
            if (colorStateList != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a12 = C10444a.a(colorStateList);
                boolean z11 = TabLayout.this.f58524B;
                gradientDrawable = new RippleDrawable(a12, z11 ? null : gradientDrawable, z11 ? null : gradientDrawable2);
            }
            int i12 = Y.f42258g;
            setBackground(gradientDrawable);
            TabLayout.this.invalidate();
            setPaddingRelative(TabLayout.this.f58539d, TabLayout.this.f58540e, TabLayout.this.f58541f, TabLayout.this.f58542g);
            setGravity(17);
            setOrientation(!TabLayout.this.f58560y ? 1 : 0);
            setClickable(true);
            Y.K(this, H.b(getContext()));
        }

        static void a(g gVar, Canvas canvas) {
            Drawable drawable = gVar.f58590g;
            if (drawable != null) {
                drawable.setBounds(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom());
                gVar.f58590g.draw(canvas);
            }
        }

        private void f(TextView textView, ImageView imageView) {
            e eVar = this.f58584a;
            CharSequence f7 = eVar != null ? eVar.f() : null;
            if (imageView != null) {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            boolean isEmpty = TextUtils.isEmpty(f7);
            if (textView != null) {
                if (isEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(f7);
                    this.f58584a.getClass();
                    textView.setVisibility(0);
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b11 = (isEmpty || imageView.getVisibility() != 0) ? 0 : (int) C9621p.b(8, getContext());
                if (TabLayout.this.f58560y) {
                    if (b11 != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(b11);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b11 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b11;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            e eVar2 = this.f58584a;
            CharSequence charSequence = eVar2 != null ? eVar2.f58576c : null;
            if (isEmpty) {
                f7 = charSequence;
            }
            g0.a(this, f7);
        }

        final int b() {
            View[] viewArr = {this.f58585b, this.f58586c, this.f58587d};
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    i12 = z11 ? Math.min(i12, view.getTop()) : view.getTop();
                    i11 = z11 ? Math.max(i11, view.getBottom()) : view.getBottom();
                    z11 = true;
                }
            }
            return i11 - i12;
        }

        final int c() {
            View[] viewArr = {this.f58585b, this.f58586c, this.f58587d};
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    i12 = z11 ? Math.min(i12, view.getLeft()) : view.getLeft();
                    i11 = z11 ? Math.max(i11, view.getRight()) : view.getRight();
                    z11 = true;
                }
            }
            return i11 - i12;
        }

        final void d(e eVar) {
            if (eVar != this.f58584a) {
                this.f58584a = eVar;
                e();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f58590g;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f58590g.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        final void e() {
            e eVar = this.f58584a;
            View c11 = eVar != null ? eVar.c() : null;
            if (c11 != null) {
                ViewParent parent = c11.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c11);
                    }
                    addView(c11);
                }
                this.f58587d = c11;
                TextView textView = this.f58585b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f58586c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f58586c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) c11.findViewById(R.id.text1);
                this.f58588e = textView2;
                if (textView2 != null) {
                    this.f58591h = textView2.getMaxLines();
                }
                this.f58589f = (ImageView) c11.findViewById(R.id.icon);
            } else {
                View view = this.f58587d;
                if (view != null) {
                    removeView(view);
                    this.f58587d = null;
                }
                this.f58588e = null;
                this.f58589f = null;
            }
            boolean z11 = false;
            if (this.f58587d == null) {
                if (this.f58586c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ru.ozon.app.android.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f58586c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f58585b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ru.ozon.app.android.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f58585b = textView3;
                    addView(textView3);
                    this.f58591h = this.f58585b.getMaxLines();
                }
                TextView textView4 = this.f58585b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.f58543h);
                ColorStateList colorStateList = tabLayout.f58544i;
                if (colorStateList != null) {
                    this.f58585b.setTextColor(colorStateList);
                }
                f(this.f58585b, this.f58586c);
                ImageView imageView3 = this.f58586c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.e(this, imageView3));
                }
                TextView textView5 = this.f58585b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.e(this, textView5));
                }
            } else {
                TextView textView6 = this.f58588e;
                if (textView6 != null || this.f58589f != null) {
                    f(textView6, this.f58589f);
                }
            }
            if (eVar != null && !TextUtils.isEmpty(eVar.f58576c)) {
                setContentDescription(eVar.f58576c);
            }
            if (eVar != null && eVar.g()) {
                z11 = true;
            }
            setSelected(z11);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            q A02 = q.A0(accessibilityNodeInfo);
            A02.N(q.f.f(0, 1, this.f58584a.d(), 1, false, isSelected()));
            if (isSelected()) {
                A02.L(false);
                A02.D(q.a.f105942e);
            }
            A02.k0(getResources().getString(ru.ozon.app.android.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i11, int i12) {
            int size = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            TabLayout tabLayout = TabLayout.this;
            int i13 = tabLayout.f58551p;
            if (i13 > 0 && (mode == 0 || size > i13)) {
                i11 = View.MeasureSpec.makeMeasureSpec(i13, LinearLayoutManager.INVALID_OFFSET);
            }
            super.onMeasure(i11, i12);
            if (this.f58585b != null) {
                float f7 = tabLayout.f58548m;
                int i14 = this.f58591h;
                ImageView imageView = this.f58586c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f58585b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f7 = tabLayout.f58549n;
                    }
                } else {
                    i14 = 1;
                }
                float textSize = this.f58585b.getTextSize();
                int lineCount = this.f58585b.getLineCount();
                int maxLines = this.f58585b.getMaxLines();
                if (f7 != textSize || (maxLines >= 0 && i14 != maxLines)) {
                    if (tabLayout.f58559x == 1 && f7 > textSize && lineCount == 1) {
                        Layout layout = this.f58585b.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f7 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f58585b.setTextSize(0, f7);
                    this.f58585b.setMaxLines(i14);
                    super.onMeasure(i11, i12);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f58584a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f58584a.i();
            return true;
        }

        @Override // android.view.View
        public final void setSelected(boolean z11) {
            isSelected();
            super.setSelected(z11);
            TextView textView = this.f58585b;
            if (textView != null) {
                textView.setSelected(z11);
            }
            ImageView imageView = this.f58586c;
            if (imageView != null) {
                imageView.setSelected(z11);
            }
            View view = this.f58587d;
            if (view != null) {
                view.setSelected(z11);
            }
        }
    }

    public static class h implements b {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager f58593a;

        public h(ViewPager viewPager) {
            this.f58593a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void onTabReselected(e eVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void onTabSelected(@NonNull e eVar) {
            this.f58593a.setCurrentItem(eVar.d());
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void onTabUnselected(e eVar) {
        }
    }

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, ru.ozon.app.android.R.attr.tabStyle, ru.ozon.app.android.R.style.Widget_Design_TabLayout), attributeSet, ru.ozon.app.android.R.attr.tabStyle);
        this.f58536a = new ArrayList<>();
        this.f58546k = new GradientDrawable();
        this.f58547l = 0;
        this.f58551p = Integer.MAX_VALUE;
        this.f58523A = -1;
        this.f58526D = new ArrayList<>();
        this.f58535M = new x2.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        d dVar = new d(context2);
        this.f58538c = dVar;
        super.addView(dVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65930N, ru.ozon.app.android.R.attr.tabStyle, ru.ozon.app.android.R.style.Widget_Design_TabLayout, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C10856g c10856g = new C10856g();
            c10856g.B(ColorStateList.valueOf(colorDrawable.getColor()));
            c10856g.v(context2);
            c10856g.A(Y.k(this));
            setBackground(c10856g);
        }
        v(v7.c.c(context2, e11, 5));
        this.f58547l = e11.getColor(8, 0);
        z(false);
        int dimensionPixelSize = e11.getDimensionPixelSize(11, -1);
        Rect bounds = this.f58546k.getBounds();
        this.f58546k.setBounds(bounds.left, 0, bounds.right, dimensionPixelSize);
        dVar.requestLayout();
        int i11 = e11.getInt(10, 0);
        if (this.f58558w != i11) {
            this.f58558w = i11;
            int i12 = Y.f42258g;
            dVar.postInvalidateOnAnimation();
        }
        int i13 = e11.getInt(7, 0);
        if (i13 == 0) {
            this.f58525C = new com.google.android.material.tabs.c();
        } else if (i13 == 1) {
            this.f58525C = new com.google.android.material.tabs.a();
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException(i13 + " is not a valid TabIndicatorAnimationMode");
            }
            this.f58525C = new com.google.android.material.tabs.b();
        }
        this.f58561z = e11.getBoolean(9, true);
        dVar.d();
        int i14 = Y.f42258g;
        dVar.postInvalidateOnAnimation();
        int dimensionPixelSize2 = e11.getDimensionPixelSize(16, 0);
        this.f58542g = dimensionPixelSize2;
        this.f58541f = dimensionPixelSize2;
        this.f58540e = dimensionPixelSize2;
        this.f58539d = dimensionPixelSize2;
        this.f58539d = e11.getDimensionPixelSize(19, dimensionPixelSize2);
        this.f58540e = e11.getDimensionPixelSize(20, dimensionPixelSize2);
        this.f58541f = e11.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f58542g = e11.getDimensionPixelSize(17, dimensionPixelSize2);
        int resourceId = e11.getResourceId(23, ru.ozon.app.android.R.style.TextAppearance_Design_Tab);
        this.f58543h = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C6977a.f65670x);
        try {
            this.f58548m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f58544i = v7.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (e11.hasValue(24)) {
                this.f58544i = v7.c.a(context2, e11, 24);
            }
            if (e11.hasValue(22)) {
                this.f58544i = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{e11.getColor(22, 0), this.f58544i.getDefaultColor()});
            }
            v7.c.a(context2, e11, 3);
            C9621p.e(e11.getInt(4, -1), null);
            this.f58545j = v7.c.a(context2, e11, 21);
            this.f58557v = e11.getInt(6, 300);
            this.f58552q = e11.getDimensionPixelSize(14, -1);
            this.f58553r = e11.getDimensionPixelSize(13, -1);
            this.f58550o = e11.getResourceId(0, 0);
            this.f58555t = e11.getDimensionPixelSize(1, 0);
            this.f58559x = e11.getInt(15, 1);
            this.f58556u = e11.getInt(2, 0);
            this.f58560y = e11.getBoolean(12, false);
            this.f58524B = e11.getBoolean(25, false);
            e11.recycle();
            Resources resources = getResources();
            this.f58549n = resources.getDimensionPixelSize(ru.ozon.app.android.R.dimen.design_tab_text_size_2line);
            this.f58554s = resources.getDimensionPixelSize(ru.ozon.app.android.R.dimen.design_tab_scrollable_min_width);
            h();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void f(View view) {
        if (!(view instanceof A7.a)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        A7.a aVar = (A7.a) view;
        e m11 = m();
        aVar.getClass();
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            m11.j(aVar.getContentDescription());
        }
        d(m11);
    }

    private void g(int i11) {
        if (i11 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            int i12 = Y.f42258g;
            if (isLaidOut()) {
                d dVar = this.f58538c;
                int childCount = dVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (dVar.getChildAt(i13).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int i14 = i(0.0f, i11);
                int i15 = this.f58557v;
                if (scrollX != i14) {
                    if (this.f58528F == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.f58528F = valueAnimator;
                        valueAnimator.setInterpolator(C7292a.f69464b);
                        this.f58528F.setDuration(i15);
                        this.f58528F.addUpdateListener(new com.google.android.material.tabs.d(this));
                    }
                    this.f58528F.setIntValues(scrollX, i14);
                    this.f58528F.start();
                }
                dVar.c(i11, i15);
                return;
            }
        }
        u(i11, 0.0f, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        int i11 = this.f58559x;
        int max = (i11 == 0 || i11 == 2) ? Math.max(0, this.f58555t - this.f58539d) : 0;
        int i12 = Y.f42258g;
        d dVar = this.f58538c;
        dVar.setPaddingRelative(max, 0, 0, 0);
        int i13 = this.f58559x;
        if (i13 == 0) {
            int i14 = this.f58556u;
            if (i14 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i14 == 1) {
                dVar.setGravity(1);
            }
            dVar.setGravity(8388611);
        } else if (i13 == 1 || i13 == 2) {
            if (this.f58556u == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            dVar.setGravity(1);
        }
        z(true);
    }

    private int i(float f7, int i11) {
        d dVar;
        View childAt;
        int i12 = this.f58559x;
        if ((i12 != 0 && i12 != 2) || (childAt = (dVar = this.f58538c).getChildAt(i11)) == null) {
            return 0;
        }
        int i13 = i11 + 1;
        View childAt2 = i13 < dVar.getChildCount() ? dVar.getChildAt(i13) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + width2) * 0.5f * f7);
        int i15 = Y.f42258g;
        return getLayoutDirection() == 0 ? left + i14 : left - i14;
    }

    private void r(int i11) {
        d dVar = this.f58538c;
        g gVar = (g) dVar.getChildAt(i11);
        dVar.removeViewAt(i11);
        if (gVar != null) {
            gVar.d(null);
            gVar.setSelected(false);
            this.f58535M.b(gVar);
        }
        requestLayout();
    }

    private void w(int i11) {
        d dVar = this.f58538c;
        int childCount = dVar.getChildCount();
        if (i11 < childCount) {
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = dVar.getChildAt(i12);
                boolean z11 = true;
                childAt.setSelected(i12 == i11);
                if (i12 != i11) {
                    z11 = false;
                }
                childAt.setActivated(z11);
                i12++;
            }
        }
    }

    private void y(ViewPager viewPager, boolean z11) {
        ViewPager viewPager2 = this.f58529G;
        if (viewPager2 != null) {
            f fVar = this.f58532J;
            if (fVar != null) {
                viewPager2.removeOnPageChangeListener(fVar);
            }
            a aVar = this.f58533K;
            if (aVar != null) {
                this.f58529G.removeOnAdapterChangeListener(aVar);
            }
        }
        b bVar = this.f58527E;
        if (bVar != null) {
            p(bVar);
            this.f58527E = null;
        }
        if (viewPager != null) {
            this.f58529G = viewPager;
            if (this.f58532J == null) {
                this.f58532J = new f(this);
            }
            this.f58532J.a();
            viewPager.addOnPageChangeListener(this.f58532J);
            h hVar = new h(viewPager);
            this.f58527E = hVar;
            c(hVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                t(adapter, true);
            }
            if (this.f58533K == null) {
                this.f58533K = new a();
            }
            this.f58533K.b();
            viewPager.addOnAdapterChangeListener(this.f58533K);
            u(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f58529G = null;
            t(null, false);
        }
        this.f58534L = z11;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        f(view);
    }

    @Deprecated
    public final void c(b bVar) {
        ArrayList<b> arrayList = this.f58526D;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public final void d(@NonNull e eVar) {
        e(eVar, this.f58536a.isEmpty());
    }

    public final void e(@NonNull e eVar, boolean z11) {
        ArrayList<e> arrayList = this.f58536a;
        int size = arrayList.size();
        if (eVar.f58579f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        eVar.l(size);
        arrayList.add(size, eVar);
        int size2 = arrayList.size();
        for (int i11 = size + 1; i11 < size2; i11++) {
            arrayList.get(i11).l(i11);
        }
        g gVar = eVar.f58580g;
        gVar.setSelected(false);
        gVar.setActivated(false);
        int d11 = eVar.d();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f58559x == 1 && this.f58556u == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f58538c.addView(gVar, d11, layoutParams);
        if (z11) {
            eVar.i();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final int j() {
        e eVar = this.f58537b;
        if (eVar != null) {
            return eVar.d();
        }
        return -1;
    }

    public final e k(int i11) {
        if (i11 < 0) {
            return null;
        }
        ArrayList<e> arrayList = this.f58536a;
        if (i11 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i11);
    }

    public final int l() {
        return this.f58536a.size();
    }

    @NonNull
    public final e m() {
        e eVar = (e) f58522N.a();
        if (eVar == null) {
            eVar = new e();
        }
        eVar.f58579f = this;
        x2.g gVar = this.f58535M;
        g gVar2 = gVar != null ? (g) gVar.a() : null;
        if (gVar2 == null) {
            gVar2 = new g(getContext());
        }
        gVar2.d(eVar);
        gVar2.setFocusable(true);
        int i11 = this.f58552q;
        if (i11 == -1) {
            int i12 = this.f58559x;
            i11 = (i12 == 0 || i12 == 2) ? this.f58554s : 0;
        }
        gVar2.setMinimumWidth(i11);
        if (TextUtils.isEmpty(eVar.f58576c)) {
            gVar2.setContentDescription(eVar.f58575b);
        } else {
            gVar2.setContentDescription(eVar.f58576c);
        }
        eVar.f58580g = gVar2;
        return eVar;
    }

    final void n() {
        int currentItem;
        o();
        androidx.viewpager.widget.a aVar = this.f58530H;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i11 = 0; i11 < count; i11++) {
                e m11 = m();
                m11.n(this.f58530H.getPageTitle(i11));
                e(m11, false);
            }
            ViewPager viewPager = this.f58529G;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == j() || currentItem >= this.f58536a.size()) {
                return;
            }
            s(k(currentItem), true);
        }
    }

    public final void o() {
        for (int childCount = this.f58538c.getChildCount() - 1; childCount >= 0; childCount--) {
            r(childCount);
        }
        Iterator<e> it = this.f58536a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            it.remove();
            next.h();
            f58522N.b(next);
        }
        this.f58537b = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10857h.d(this);
        if (this.f58529G == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                y((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f58534L) {
            y(null, false);
            this.f58534L = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(@NonNull Canvas canvas) {
        int i11 = 0;
        while (true) {
            d dVar = this.f58538c;
            if (i11 >= dVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = dVar.getChildAt(i11);
            if (childAt instanceof g) {
                g.a((g) childAt, canvas);
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q.A0(accessibilityNodeInfo).M(q.e.a(1, this.f58536a.size(), 1, false));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i11 = this.f58559x;
        return (i11 == 0 || i11 == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        Context context = getContext();
        ArrayList<e> arrayList = this.f58536a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.get(i13);
        }
        int round = Math.round(C9621p.b(48, context));
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i12 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i12) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i11);
        if (View.MeasureSpec.getMode(i11) != 0) {
            int i14 = this.f58553r;
            if (i14 <= 0) {
                i14 = (int) (size2 - C9621p.b(56, getContext()));
            }
            this.f58551p = i14;
        }
        super.onMeasure(i11, i12);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i15 = this.f58559x;
            if (i15 != 0) {
                if (i15 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i15 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i11;
        if (motionEvent.getActionMasked() != 8 || (i11 = this.f58559x) == 0 || i11 == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Deprecated
    public final void p(b bVar) {
        this.f58526D.remove(bVar);
    }

    public final void q(int i11) {
        e eVar = this.f58537b;
        int d11 = eVar != null ? eVar.d() : 0;
        r(i11);
        ArrayList<e> arrayList = this.f58536a;
        e remove = arrayList.remove(i11);
        if (remove != null) {
            remove.h();
            f58522N.b(remove);
        }
        int size = arrayList.size();
        for (int i12 = i11; i12 < size; i12++) {
            arrayList.get(i12).l(i12);
        }
        if (d11 == i11) {
            s(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, i11 - 1)), true);
        }
    }

    public final void s(e eVar, boolean z11) {
        e eVar2 = this.f58537b;
        ArrayList<b> arrayList = this.f58526D;
        if (eVar2 == eVar) {
            if (eVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).onTabReselected(eVar);
                }
                g(eVar.d());
                return;
            }
            return;
        }
        int d11 = eVar != null ? eVar.d() : -1;
        if (z11) {
            if ((eVar2 == null || eVar2.d() == -1) && d11 != -1) {
                u(d11, 0.0f, true, true);
            } else {
                g(d11);
            }
            if (d11 != -1) {
                w(d11);
            }
        }
        this.f58537b = eVar;
        if (eVar2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).onTabUnselected(eVar2);
            }
        }
        if (eVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).onTabSelected(eVar);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f7) {
        super.setElevation(f7);
        C10857h.b(f7, this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.f58538c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    final void t(androidx.viewpager.widget.a aVar, boolean z11) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f58530H;
        if (aVar2 != null && (dataSetObserver = this.f58531I) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f58530H = aVar;
        if (z11 && aVar != null) {
            if (this.f58531I == null) {
                this.f58531I = new c();
            }
            aVar.registerDataSetObserver(this.f58531I);
        }
        n();
    }

    public final void u(int i11, float f7, boolean z11, boolean z12) {
        int round = Math.round(i11 + f7);
        if (round >= 0) {
            d dVar = this.f58538c;
            if (round >= dVar.getChildCount()) {
                return;
            }
            if (z12) {
                dVar.e(f7, i11);
            }
            ValueAnimator valueAnimator = this.f58528F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f58528F.cancel();
            }
            scrollTo(i11 < 0 ? 0 : i(f7, i11), 0);
            if (z11) {
                w(round);
            }
        }
    }

    public final void v(Drawable drawable) {
        if (this.f58546k != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f58546k = drawable;
            int i11 = this.f58523A;
            if (i11 == -1) {
                i11 = drawable.getIntrinsicHeight();
            }
            d dVar = this.f58538c;
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f58546k.getBounds();
            tabLayout.f58546k.setBounds(bounds.left, 0, bounds.right, i11);
            dVar.requestLayout();
        }
    }

    public final void x(int i11) {
        if (i11 != this.f58559x) {
            this.f58559x = i11;
            h();
        }
    }

    final void z(boolean z11) {
        int i11 = 0;
        while (true) {
            d dVar = this.f58538c;
            if (i11 >= dVar.getChildCount()) {
                return;
            }
            View childAt = dVar.getChildAt(i11);
            int i12 = this.f58552q;
            if (i12 == -1) {
                int i13 = this.f58559x;
                i12 = (i13 == 0 || i13 == 2) ? this.f58554s : 0;
            }
            childAt.setMinimumWidth(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f58559x == 1 && this.f58556u == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z11) {
                childAt.requestLayout();
            }
            i11++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i11) {
        f(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        f(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        f(view);
    }
}
