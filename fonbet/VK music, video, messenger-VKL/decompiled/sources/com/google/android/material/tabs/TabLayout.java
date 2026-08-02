package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
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
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.a5p0;
import xsna.am;
import xsna.anj;
import xsna.b0u0;
import xsna.bdl;
import xsna.fpo0;
import xsna.iut0;
import xsna.jl10;
import xsna.l6g;
import xsna.m33;
import xsna.olg0;
import xsna.qm10;
import xsna.rap;
import xsna.rq2;
import xsna.t1u0;
import xsna.tb30;
import xsna.tko;
import xsna.tsn0;
import xsna.tvb0;
import xsna.vvb0;
import xsna.xiq;
import xsna.zm10;

@ViewPager.e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int a0 = R$style.Widget_Design_TabLayout;
    public static final vvb0 b0 = new vvb0(16);
    public int A;
    public final int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public com.google.android.material.tabs.a J;
    public final TimeInterpolator K;

    @Nullable
    public c L;
    public final ArrayList<c> M;

    @Nullable
    public j N;
    public ValueAnimator O;

    @Nullable
    public ViewPager P;

    @Nullable
    public PagerAdapter Q;
    public e R;
    public h S;
    public b T;
    public boolean U;
    public int V;
    public final tvb0 W;
    public int b;
    public final ArrayList<g> c;

    @Nullable
    public g d;

    @NonNull
    public final f e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;

    @NonNull
    public Drawable p;
    public int q;
    public final PorterDuff.Mode r;
    public final float s;
    public final float t;
    public final int u;
    public int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* loaded from: classes13.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes13.dex */
    public class b implements ViewPager.i {
        public boolean a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == viewPager) {
                tabLayout.u(pagerAdapter2, this.a);
            }
        }

        public final void b(boolean z) {
            this.a = z;
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void Wd(T t);

        void hl(T t);

        void za(T t);
    }

    public interface d extends c<g> {
    }

    /* loaded from: classes13.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.q();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.q();
        }
    }

    public class f extends LinearLayout {
        public static final /* synthetic */ int d = 0;
        public ValueAnimator b;

        /* loaded from: classes13.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View b;
            public final /* synthetic */ View c;

            public a(View view, View view2) {
                this.b = view;
                this.c = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                f.this.c(this.b, this.c, valueAnimator.getAnimatedFraction());
            }
        }

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.V == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.a aVar = tabLayout.J;
                Drawable drawable = tabLayout.p;
                aVar.getClass();
                RectF a2 = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) a2.left, drawable.getBounds().top, (int) a2.right, drawable.getBounds().bottom);
                tabLayout.b = i;
            }
        }

        public final void b(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.p.getBounds();
            tabLayout.p.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.p;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.p.getBounds().bottom);
            } else {
                tabLayout.J.b(tabLayout, view, view2, f, tabLayout.p);
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }

        public final void d(int i, int i2, boolean z) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.b == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.b = i;
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.b.removeAllUpdateListeners();
                this.b.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.b = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.K);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(@NonNull Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.p.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.p.getIntrinsicHeight();
            }
            int i = tabLayout.C;
            if (i == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    height2 = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (tabLayout.p.getBounds().width() > 0) {
                Rect bounds = tabLayout.p.getBounds();
                tabLayout.p.setBounds(bounds.left, height, bounds.right, height2);
                tabLayout.p.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.b;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.b == -1) {
                tabLayout.b = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.b);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) t1u0.b(16, getContext())) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            layoutParams.width = i3;
                            layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.A = 0;
                    tabLayout.x(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class g {

        @Nullable
        public Object a;

        @Nullable
        public Drawable b;

        @Nullable
        public CharSequence c;

        @Nullable
        public CharSequence d;

        @Nullable
        public View f;

        @Nullable
        public TabLayout g;

        @NonNull
        public i h;
        public int e = -1;
        public int i = -1;

        @Nullable
        public final View d() {
            return this.f;
        }

        @Nullable
        public final Drawable e() {
            return this.b;
        }

        public final int f() {
            return this.e;
        }

        @Nullable
        public final CharSequence g() {
            return this.c;
        }

        public final boolean h() {
            TabLayout tabLayout = this.g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.e;
        }

        public final void i() {
            this.g = null;
            this.h = null;
            this.a = null;
            this.b = null;
            this.i = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public final void j() {
            TabLayout tabLayout = this.g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.c(this, true);
        }

        @NonNull
        public final void k(@Nullable CharSequence charSequence) {
            this.d = charSequence;
            r();
        }

        @NonNull
        public final void l(@Nullable View view) {
            this.f = view;
            r();
        }

        @NonNull
        public final void m(@Nullable Drawable drawable) {
            this.b = drawable;
            TabLayout tabLayout = this.g;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.x(true);
            }
            r();
        }

        @NonNull
        public final void n(int i) {
            this.i = i;
            i iVar = this.h;
            if (iVar != null) {
                iVar.setId(i);
            }
        }

        public final void o(int i) {
            this.e = i;
        }

        @NonNull
        public final void p(int i) {
            TabLayout tabLayout = this.g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            q(tabLayout.getResources().getText(i));
        }

        @NonNull
        public final void q(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.h.setContentDescription(charSequence);
            }
            this.c = charSequence;
            r();
        }

        public final void r() {
            i iVar = this.h;
            if (iVar != null) {
                iVar.i();
                g gVar = iVar.b;
                iVar.setSelected(gVar != null && gVar.h());
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class h implements ViewPager.j {

        @NonNull
        public final WeakReference<TabLayout> b;
        public int c;
        public int d;

        public h(TabLayout tabLayout) {
            this.b = new WeakReference<>(tabLayout);
        }

        public final void a() {
            this.d = 0;
            this.c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            this.c = this.d;
            this.d = i;
            TabLayout tabLayout = this.b.get();
            if (tabLayout != null) {
                tabLayout.V = this.d;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.b.get();
            if (tabLayout != null) {
                int i3 = this.d;
                boolean z2 = true;
                if (i3 != 2 || this.c == 1) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (i3 == 2 && this.c == 0) {
                    z = false;
                }
                tabLayout.v(i, f, z2, z, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            TabLayout tabLayout = this.b.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.d;
            tabLayout.c(tabLayout.b(i), i2 == 0 || (i2 == 2 && this.c == 0));
        }
    }

    /* loaded from: classes13.dex */
    public final class i extends LinearLayout {
        public g b;
        public TextView c;
        public ImageView d;

        @Nullable
        public View e;

        @Nullable
        public com.google.android.material.badge.a f;

        @Nullable
        public View g;

        @Nullable
        public TextView h;

        @Nullable
        public ImageView i;

        @Nullable
        public Drawable j;
        public int k;

        public i(@NonNull Context context) {
            super(context);
            this.k = 2;
            g(context);
            int i = TabLayout.this.f;
            int i2 = TabLayout.this.g;
            int i3 = TabLayout.this.h;
            int i4 = TabLayout.this.i;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            setPaddingRelative(i, i2, i3, i4);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            iut0.f.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
        }

        public static void b(i iVar, Canvas canvas) {
            Drawable drawable = iVar.j;
            if (drawable != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.j.draw(canvas);
            }
        }

        @Nullable
        private com.google.android.material.badge.a getBadge() {
            return this.f;
        }

        @NonNull
        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f == null) {
                this.f = new com.google.android.material.badge.a(getContext(), null);
            }
            e();
            com.google.android.material.badge.a aVar = this.f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void c() {
            setTab(null);
            setSelected(false);
        }

        public final void d() {
            if (this.f != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.e;
                if (view != null) {
                    com.google.android.material.badge.a aVar = this.f;
                    if (aVar != null) {
                        if (aVar.d() != null) {
                            aVar.d().setForeground(null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.e = null;
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.j.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            g gVar;
            if (this.f != null) {
                if (this.g != null) {
                    d();
                    return;
                }
                ImageView imageView = this.d;
                if (imageView != null && (gVar = this.b) != null && gVar.b != null) {
                    if (this.e == imageView) {
                        f(imageView);
                        return;
                    }
                    d();
                    ImageView imageView2 = this.d;
                    if (this.f == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    com.google.android.material.badge.a aVar = this.f;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.i(imageView2, null);
                    if (aVar.d() != null) {
                        aVar.d().setForeground(aVar);
                    } else {
                        imageView2.getOverlay().add(aVar);
                    }
                    this.e = imageView2;
                    return;
                }
                TextView textView = this.c;
                if (textView == null || this.b == null) {
                    d();
                    return;
                }
                if (this.e == textView) {
                    f(textView);
                    return;
                }
                d();
                TextView textView2 = this.c;
                if (this.f == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                com.google.android.material.badge.a aVar2 = this.f;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                aVar2.setBounds(rect2);
                aVar2.i(textView2, null);
                if (aVar2.d() != null) {
                    aVar2.d().setForeground(aVar2);
                } else {
                    textView2.getOverlay().add(aVar2);
                }
                this.e = textView2;
            }
        }

        public final void f(@NonNull View view) {
            com.google.android.material.badge.a aVar = this.f;
            if (aVar == null || view != this.e) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(view, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$i] */
        public final void g(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.u;
            if (i != 0) {
                Drawable a = m33.a(i, context);
                this.j = a;
                if (a != null && a.isStateful()) {
                    this.j.setState(getDrawableState());
                }
            } else {
                this.j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (tabLayout.o != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a2 = olg0.a(tabLayout.o);
                boolean z = tabLayout.I;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a2, gradientDrawable, z ? null : gradientDrawable2);
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            setBackground(gradientDrawable);
            tabLayout.invalidate();
        }

        public int getContentHeight() {
            View[] viewArr = {this.c, this.d, this.g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.c, this.d, this.g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        @Nullable
        public g getTab() {
            return this.b;
        }

        public final void h() {
            setOrientation(!TabLayout.this.E ? 1 : 0);
            TextView textView = this.h;
            if (textView == null && this.i == null) {
                j(this.c, this.d, true);
            } else {
                j(textView, this.i, false);
            }
        }

        public final void i() {
            int i;
            ViewParent parent;
            g gVar = this.b;
            View view = gVar != null ? gVar.f : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.g;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.g);
                    }
                    addView(view);
                }
                this.g = view;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.h = textView2;
                if (textView2 != null) {
                    this.k = textView2.getMaxLines();
                }
                this.i = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.g;
                if (view3 != null) {
                    removeView(view3);
                    this.g = null;
                }
                this.h = null;
                this.i = null;
            }
            if (this.g == null) {
                if (this.d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.d = imageView2;
                    addView(imageView2, 0);
                }
                if (this.c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.c = textView3;
                    addView(textView3);
                    this.k = this.c.getMaxLines();
                }
                TextView textView4 = this.c;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.j);
                if (!isSelected() || (i = tabLayout.l) == -1) {
                    this.c.setTextAppearance(tabLayout.k);
                } else {
                    this.c.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.m;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
                j(this.c, this.d, true);
                e();
                ImageView imageView3 = this.d;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, imageView3));
                }
                TextView textView5 = this.c;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, textView5));
                }
            } else {
                TextView textView6 = this.h;
                if (textView6 != null || this.i != null) {
                    j(textView6, this.i, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.d)) {
                return;
            }
            setContentDescription(gVar.d);
        }

        public final void j(@Nullable TextView textView, @Nullable ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            g gVar = this.b;
            Drawable mutate = (gVar == null || (drawable = gVar.b) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (mutate != null) {
                mutate.setTintList(tabLayout.n);
                PorterDuff.Mode mode = tabLayout.r;
                if (mode != null) {
                    mutate.setTintMode(mode);
                }
            }
            g gVar2 = this.b;
            CharSequence charSequence = gVar2 != null ? gVar2.c : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (isEmpty) {
                    z2 = false;
                } else {
                    this.b.getClass();
                    z2 = true;
                }
                textView.setText(!isEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!isEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b = (z2 && imageView.getVisibility() == 0) ? (int) t1u0.b(8, getContext()) : 0;
                if (tabLayout.E) {
                    if (b != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(b);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.b;
            CharSequence charSequence2 = gVar3 != null ? gVar3.d : null;
            if (isEmpty) {
                charSequence = charSequence2;
            }
            a5p0.a.a(this, charSequence);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.f.c());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) am.h.a(0, 1, this.b.e, 1, isSelected()).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) am.a.e.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R$string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.v, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.c != null) {
                float f = tabLayout.s;
                int i3 = this.k;
                ImageView imageView = this.d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.t;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.c.getTextSize();
                int lineCount = this.c.getLineCount();
                int maxLines = this.c.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.D == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.c.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.c.setTextSize(0, f);
                    this.c.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.b.j();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable g gVar) {
            if (gVar != this.b) {
                this.b = gVar;
                i();
                g gVar2 = this.b;
                setSelected(gVar2 != null && gVar2.h());
            }
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.tabStyle);
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = arrayList.get(i2);
            if (gVar != null && gVar.e() != null && !TextUtils.isEmpty(gVar.g())) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.w;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.D;
        if (i3 == 0 || i3 == 2) {
            return this.y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @NonNull
    public static ColorStateList n(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private void setSelectedTabView(int i2) {
        f fVar = this.e;
        int childCount = fVar.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = fVar.getChildAt(i3);
                if ((i3 != i2 || childAt.isSelected()) && (i3 == i2 || !childAt.isSelected())) {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                } else {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                    if (childAt instanceof i) {
                        ((i) childAt).i();
                    }
                }
                i3++;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        j(view);
    }

    @Nullable
    public g b(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.c.get(i2);
    }

    public void c(@Nullable g gVar, boolean z) {
        g gVar2 = this.d;
        ArrayList<c> arrayList = this.M;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).hl(gVar);
                }
                k(gVar.f());
                return;
            }
            return;
        }
        int f2 = gVar != null ? gVar.f() : -1;
        if (z) {
            if ((gVar2 == null || gVar2.f() == -1) && f2 != -1) {
                d(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
            } else {
                k(f2);
            }
            if (f2 != -1) {
                setSelectedTabView(f2);
            }
        }
        this.d = gVar;
        if (gVar2 != null && gVar2.g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).za(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).Wd(gVar);
            }
        }
    }

    public void d(int i2, float f2, boolean z, boolean z2) {
        v(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, true, true);
    }

    @Deprecated
    public final void f(@Nullable c cVar) {
        ArrayList<c> arrayList = this.M;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    public void g(@NonNull d dVar) {
        f(dVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.d;
        if (gVar != null) {
            return gVar.f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.c.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    public int getTabMaxWidth() {
        return this.v;
    }

    public int getTabMode() {
        return this.D;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.o;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.p;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.m;
    }

    public final void h(@NonNull g gVar) {
        i(gVar, this.c.isEmpty());
    }

    public void i(@NonNull g gVar, boolean z) {
        ArrayList<g> arrayList = this.c;
        int size = arrayList.size();
        if (gVar.g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        gVar.o(size);
        arrayList.add(size, gVar);
        int size2 = arrayList.size();
        int i2 = -1;
        for (int i3 = size + 1; i3 < size2; i3++) {
            if (arrayList.get(i3).f() == this.b) {
                i2 = i3;
            }
            arrayList.get(i3).o(i3);
        }
        this.b = i2;
        i iVar = gVar.h;
        iVar.setSelected(false);
        iVar.setActivated(false);
        int f2 = gVar.f();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.e.addView(iVar, f2, layoutParams);
        if (z) {
            gVar.j();
        }
    }

    public final void j(View view) {
        if (!(view instanceof tsn0)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        tsn0 tsn0Var = (tsn0) view;
        g p = p();
        tsn0Var.getClass();
        if (!TextUtils.isEmpty(tsn0Var.getContentDescription())) {
            p.k(tsn0Var.getContentDescription());
        }
        h(p);
    }

    public final void k(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (isLaidOut()) {
                f fVar = this.e;
                int childCount = fVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (fVar.getChildAt(i3).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int m = m(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (scrollX != m) {
                    o();
                    this.O.setIntValues(scrollX, m);
                    this.O.start();
                }
                ValueAnimator valueAnimator = fVar.b;
                if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.b != i2) {
                    fVar.b.cancel();
                }
                fVar.d(i2, this.B, true);
                return;
            }
        }
        d(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 != 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        int i2 = this.D;
        int max = (i2 == 0 || i2 == 2) ? Math.max(0, this.z - this.f) : 0;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        f fVar = this.e;
        fVar.setPaddingRelative(max, 0, 0, 0);
        int i3 = this.D;
        if (i3 == 0) {
            int i4 = this.A;
            if (i4 != 0) {
                if (i4 == 1) {
                    fVar.setGravity(1);
                }
            }
            fVar.setGravity(8388611);
        } else if (i3 == 1 || i3 == 2) {
            fVar.setGravity(1);
        }
        x(true);
    }

    public final int m(int i2, float f2) {
        f fVar;
        View childAt;
        int i3 = this.D;
        if ((i3 != 0 && i3 != 2) || (childAt = (fVar = this.e).getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < fVar.getChildCount() ? fVar.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void o() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new a());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bdl.f(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                w((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int i2 = 0;
        while (true) {
            f fVar = this.e;
            if (i2 >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof i) {
                i.b((i) childAt, canvas);
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        am.E(accessibilityNodeInfo).p(am.g.a(1, getTabCount(), 1, false));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int round = Math.round(t1u0.b(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.x;
            if (i4 <= 0) {
                i4 = (int) (size - t1u0.b(56, getContext()));
            }
            this.v = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.D;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i5 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @NonNull
    public final g p() {
        g gVar = (g) b0.c();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.g = this;
        tvb0 tvb0Var = this.W;
        i iVar = tvb0Var != null ? (i) tvb0Var.c() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.d)) {
            iVar.setContentDescription(gVar.c);
        } else {
            iVar.setContentDescription(gVar.d);
        }
        gVar.h = iVar;
        if (gVar.i != -1) {
            gVar.h.setId(gVar.i);
        }
        return gVar;
    }

    public final void q() {
        int currentItem;
        r();
        PagerAdapter pagerAdapter = this.Q;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                g p = p();
                p.q(this.Q.getPageTitle(i2));
                i(p, false);
            }
            ViewPager viewPager = this.P;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            c(b(currentItem), true);
        }
    }

    public void r() {
        f fVar = this.e;
        for (int childCount = fVar.getChildCount() - 1; childCount >= 0; childCount--) {
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.c();
                this.W.a(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.i();
            b0.a(next);
        }
        this.d = null;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        bdl.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        int i2 = 0;
        while (true) {
            f fVar = this.e;
            if (i2 >= fVar.getChildCount()) {
                l();
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).h();
            }
            i2++;
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        o();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.p = mutate;
        int i2 = this.q;
        if (i2 != 0) {
            mutate.setTint(i2);
        } else {
            mutate.setTintList(null);
        }
        int i3 = this.G;
        if (i3 == -1) {
            i3 = this.p.getIntrinsicHeight();
        }
        this.e.b(i3);
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.q = i2;
        Drawable drawable = this.p;
        if (i2 != 0) {
            drawable.setTint(i2);
        } else {
            drawable.setTintList(null);
        }
        x(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.C != i2) {
            this.C = i2;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            this.e.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.G = i2;
        this.e.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.A != i2) {
            this.A = i2;
            l();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            ArrayList<g> arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).r();
            }
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(anj.b(i2, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.H = i2;
        if (i2 == 0) {
            this.J = new com.google.android.material.tabs.a();
        } else if (i2 == 1) {
            this.J = new rap();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(l6g.a(i2, " is not a valid TabIndicatorAnimationMode"));
            }
            this.J = new xiq();
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.F = z;
        int i2 = f.d;
        f fVar = this.e;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.D) {
            this.D = i2;
            l();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        int i2 = 0;
        while (true) {
            f fVar = this.e;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).g(getContext());
            }
            i2++;
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(anj.b(i2, getContext()));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList<g> arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).r();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        u(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        int i2 = 0;
        while (true) {
            f fVar = this.e;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).g(getContext());
            }
            i2++;
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        w(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void t(@NonNull d dVar) {
        this.M.remove(dVar);
    }

    public final void u(@Nullable PagerAdapter pagerAdapter, boolean z) {
        e eVar;
        PagerAdapter pagerAdapter2 = this.Q;
        if (pagerAdapter2 != null && (eVar = this.R) != null) {
            pagerAdapter2.unregisterDataSetObserver(eVar);
        }
        this.Q = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.R == null) {
                this.R = new e();
            }
            pagerAdapter.registerDataSetObserver(this.R);
        }
        q();
    }

    public final void v(int i2, float f2, boolean z, boolean z2, boolean z3) {
        float f3 = i2 + f2;
        int round = Math.round(f3);
        if (round >= 0) {
            f fVar = this.e;
            if (round >= fVar.getChildCount()) {
                return;
            }
            if (z2) {
                TabLayout.this.b = Math.round(f3);
                ValueAnimator valueAnimator = fVar.b;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.b.cancel();
                }
                fVar.c(fVar.getChildAt(i2), fVar.getChildAt(i2 + 1), f2);
            }
            ValueAnimator valueAnimator2 = this.O;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.O.cancel();
            }
            int m = m(i2, f2);
            int scrollX = getScrollX();
            boolean z4 = (i2 < getSelectedTabPosition() && m >= scrollX) || (i2 > getSelectedTabPosition() && m <= scrollX) || i2 == getSelectedTabPosition();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (getLayoutDirection() == 1) {
                z4 = (i2 < getSelectedTabPosition() && m <= scrollX) || (i2 > getSelectedTabPosition() && m >= scrollX) || i2 == getSelectedTabPosition();
            }
            if (z4 || this.V == 1 || z3) {
                if (i2 < 0) {
                    m = 0;
                }
                scrollTo(m, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void w(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            h hVar = this.S;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.T;
            if (bVar != null) {
                this.P.removeOnAdapterChangeListener(bVar);
            }
        }
        j jVar = this.N;
        if (jVar != null) {
            this.M.remove(jVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new h(this);
            }
            this.S.a();
            viewPager.addOnPageChangeListener(this.S);
            j jVar2 = new j(viewPager);
            this.N = jVar2;
            f(jVar2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                u(adapter, z);
            }
            if (this.T == null) {
                this.T = new b();
            }
            this.T.b(z);
            viewPager.addOnAdapterChangeListener(this.T);
            d(viewPager.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
        } else {
            this.P = null;
            u(null, false);
        }
        this.U = z2;
    }

    public final void x(boolean z) {
        int i2 = 0;
        while (true) {
            f fVar = this.e;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.D == 1 && this.A == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (z) {
                childAt.requestLayout();
            }
            i2++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(zm10.a(context, attributeSet, i2, r4), attributeSet, i2);
        int i3 = a0;
        this.b = -1;
        this.c = new ArrayList<>();
        this.l = -1;
        this.q = 0;
        this.v = Integer.MAX_VALUE;
        this.G = -1;
        this.M = new ArrayList<>();
        this.W = new tvb0(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.e = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d2 = fpo0.d(context2, attributeSet, R$styleable.TabLayout, i2, i3, R$styleable.TabLayout_tabTextAppearance);
        ColorStateList d3 = tko.d(getBackground());
        if (d3 != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(d3);
            materialShapeDrawable.initializeElevationOverlay(context2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(qm10.d(context2, d2, R$styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(d2.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        fVar.b(d2.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(d2.getInt(R$styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(d2.getInt(R$styleable.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(d2.getBoolean(R$styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = d2.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.f = d2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.g = d2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.h = d2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.i = d2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (jl10.b(R$attr.isMaterial3Theme, context2, false)) {
            this.j = R$attr.textAppearanceTitleSmall;
        } else {
            this.j = R$attr.textAppearanceButton;
        }
        int resourceId = d2.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.TextAppearance_Design_Tab);
        this.k = resourceId;
        int[] iArr = androidx.appcompat.R$styleable.w;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.s = dimensionPixelSize2;
            this.m = qm10.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d2.hasValue(R$styleable.TabLayout_tabSelectedTextAppearance)) {
                this.l = d2.getResourceId(R$styleable.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i4 = this.l;
            if (i4 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i4, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList a2 = qm10.a(context2, obtainStyledAttributes, 3);
                    if (a2 != null) {
                        this.m = n(this.m.getDefaultColor(), a2.getColorForState(new int[]{R.attr.state_selected}, a2.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (d2.hasValue(R$styleable.TabLayout_tabTextColor)) {
                this.m = qm10.a(context2, d2, R$styleable.TabLayout_tabTextColor);
            }
            if (d2.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                this.m = n(this.m.getDefaultColor(), d2.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.n = qm10.a(context2, d2, R$styleable.TabLayout_tabIconTint);
            this.r = t1u0.e(d2.getInt(R$styleable.TabLayout_tabIconTintMode, -1), null);
            this.o = qm10.a(context2, d2, R$styleable.TabLayout_tabRippleColor);
            this.B = d2.getInt(R$styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.K = tb30.d(context2, R$attr.motionEasingEmphasizedInterpolator, rq2.b);
            this.w = d2.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.x = d2.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.u = d2.getResourceId(R$styleable.TabLayout_tabBackground, 0);
            this.z = d2.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.D = d2.getInt(R$styleable.TabLayout_tabMode, 1);
            this.A = d2.getInt(R$styleable.TabLayout_tabGravity, 0);
            this.E = d2.getBoolean(R$styleable.TabLayout_tabInlineLabel, false);
            this.I = d2.getBoolean(R$styleable.TabLayout_tabUnboundedRipple, false);
            d2.recycle();
            Resources resources = getResources();
            this.t = resources.getDimensionPixelSize(R$dimen.design_tab_text_size_2line);
            this.y = resources.getDimensionPixelSize(R$dimen.design_tab_scrollable_min_width);
            l();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        j(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable c cVar) {
        c cVar2 = this.L;
        if (cVar2 != null) {
            this.M.remove(cVar2);
        }
        this.L = cVar;
        if (cVar != null) {
            f(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(m33.a(i2, getContext()));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* loaded from: classes13.dex */
    public static class j implements d {
        public final ViewPager b;

        public j(ViewPager viewPager) {
            this.b = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void Wd(@NonNull g gVar) {
            this.b.setCurrentItem(gVar.e);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void hl(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void za(g gVar) {
        }
    }
}
