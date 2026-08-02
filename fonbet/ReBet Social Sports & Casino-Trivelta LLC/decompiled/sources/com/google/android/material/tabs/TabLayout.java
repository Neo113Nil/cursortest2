package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
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
import androidx.appcompat.widget.f0;
import androidx.core.util.Pools$SimplePool;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.N;
import androidx.viewpager.widget.ViewPager;
import ia.k;
import ia.l;
import ia.m;
import io.agora.rtc2.internal.RtcEngineEvent;
import ja.AbstractC5104a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import x0.C6776e;
import x0.InterfaceC6775d;
import xa.o;
import y0.z;

@ViewPager.e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: T1, reason: collision with root package name */
    public static final int f36138T1 = l.f48578q;

    /* renamed from: V1, reason: collision with root package name */
    public static final InterfaceC6775d f36139V1 = new C6776e(16);

    /* renamed from: A, reason: collision with root package name */
    public int f36140A;

    /* renamed from: B, reason: collision with root package name */
    public int f36141B;

    /* renamed from: C, reason: collision with root package name */
    public int f36142C;

    /* renamed from: D, reason: collision with root package name */
    public int f36143D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f36144E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f36145F;

    /* renamed from: G, reason: collision with root package name */
    public int f36146G;

    /* renamed from: H, reason: collision with root package name */
    public int f36147H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f36148I;

    /* renamed from: J, reason: collision with root package name */
    public com.google.android.material.tabs.a f36149J;

    /* renamed from: K, reason: collision with root package name */
    public final TimeInterpolator f36150K;

    /* renamed from: L, reason: collision with root package name */
    public c f36151L;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f36152O;

    /* renamed from: P, reason: collision with root package name */
    public c f36153P;

    /* renamed from: R, reason: collision with root package name */
    public ValueAnimator f36154R;

    /* renamed from: T, reason: collision with root package name */
    public ViewPager f36155T;

    /* renamed from: V, reason: collision with root package name */
    public androidx.viewpager.widget.a f36156V;

    /* renamed from: W, reason: collision with root package name */
    public DataSetObserver f36157W;

    /* renamed from: a, reason: collision with root package name */
    public int f36158a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36159b;

    /* renamed from: b1, reason: collision with root package name */
    public h f36160b1;

    /* renamed from: c, reason: collision with root package name */
    public g f36161c;

    /* renamed from: d, reason: collision with root package name */
    public final f f36162d;

    /* renamed from: e, reason: collision with root package name */
    public int f36163e;

    /* renamed from: f, reason: collision with root package name */
    public int f36164f;

    /* renamed from: g, reason: collision with root package name */
    public int f36165g;

    /* renamed from: g1, reason: collision with root package name */
    public b f36166g1;

    /* renamed from: h, reason: collision with root package name */
    public int f36167h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36168i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36169j;

    /* renamed from: k, reason: collision with root package name */
    public int f36170k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f36171l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f36172m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f36173n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f36174o;

    /* renamed from: p, reason: collision with root package name */
    public int f36175p;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f36176p1;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f36177q;

    /* renamed from: r, reason: collision with root package name */
    public float f36178r;

    /* renamed from: s, reason: collision with root package name */
    public float f36179s;

    /* renamed from: t, reason: collision with root package name */
    public float f36180t;

    /* renamed from: u, reason: collision with root package name */
    public final int f36181u;

    /* renamed from: v, reason: collision with root package name */
    public int f36182v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36183w;

    /* renamed from: x, reason: collision with root package name */
    public final int f36184x;

    /* renamed from: x1, reason: collision with root package name */
    public int f36185x1;

    /* renamed from: y, reason: collision with root package name */
    public final int f36186y;

    /* renamed from: y1, reason: collision with root package name */
    public final InterfaceC6775d f36187y1;

    /* renamed from: z, reason: collision with root package name */
    public int f36188z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        public boolean f36190a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f36155T == viewPager) {
                tabLayout.K(aVar2, this.f36190a);
            }
        }

        public void b(boolean z10) {
            this.f36190a = z10;
        }
    }

    public interface c {
        void a(g gVar);

        void b(g gVar);

        void c(g gVar);
    }

    public interface d extends c {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.D();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.D();
        }
    }

    public class f extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public ValueAnimator f36193a;

        /* renamed from: b, reason: collision with root package name */
        public int f36194b;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f36196a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f36197b;

            public a(View view, View view2) {
                this.f36196a = view;
                this.f36197b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.j(this.f36196a, this.f36197b, valueAnimator.getAnimatedFraction());
            }
        }

        public f(Context context) {
            super(context);
            this.f36194b = -1;
            setWillNotDraw(false);
        }

        public void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f36193a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f36158a != i10) {
                this.f36193a.cancel();
            }
            k(true, i10, i11);
        }

        public boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f36174o.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f36174o.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f36142C;
            if (i10 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    height2 = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.f36174o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f36174o.getBounds();
                TabLayout.this.f36174o.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.f36174o.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f36158a == -1) {
                tabLayout.f36158a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f36158a);
        }

        public final void f(int i10) {
            if (TabLayout.this.f36185x1 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.a aVar = TabLayout.this.f36149J;
                TabLayout tabLayout = TabLayout.this;
                aVar.c(tabLayout, childAt, tabLayout.f36174o);
                TabLayout.this.f36158a = i10;
            }
        }

        public final void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        public void h(int i10, float f10) {
            TabLayout.this.f36158a = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f36193a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f36193a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        public void i(int i10) {
            Rect bounds = TabLayout.this.f36174o.getBounds();
            TabLayout.this.f36174o.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f36174o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f36174o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.a aVar = TabLayout.this.f36149J;
                TabLayout tabLayout = TabLayout.this;
                aVar.d(tabLayout, view, view2, f10, tabLayout.f36174o);
            }
            postInvalidateOnAnimation();
        }

        public final void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f36158a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f36158a = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f36193a.removeAllUpdateListeners();
                this.f36193a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36193a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f36150K);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f36193a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f36140A == 1 || tabLayout.f36143D == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) o.d(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f36140A = 0;
                    tabLayout2.S(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public Object f36199a;

        /* renamed from: b, reason: collision with root package name */
        public Drawable f36200b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f36201c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f36202d;

        /* renamed from: f, reason: collision with root package name */
        public View f36204f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f36206h;

        /* renamed from: i, reason: collision with root package name */
        public i f36207i;

        /* renamed from: e, reason: collision with root package name */
        public int f36203e = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f36205g = 1;

        /* renamed from: j, reason: collision with root package name */
        public int f36208j = -1;

        public View e() {
            return this.f36204f;
        }

        public Drawable f() {
            return this.f36200b;
        }

        public int g() {
            return this.f36203e;
        }

        public int h() {
            return this.f36205g;
        }

        public Object i() {
            return this.f36199a;
        }

        public CharSequence j() {
            return this.f36201c;
        }

        public boolean k() {
            TabLayout tabLayout = this.f36206h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f36203e;
        }

        public void l() {
            this.f36206h = null;
            this.f36207i = null;
            this.f36199a = null;
            this.f36200b = null;
            this.f36208j = -1;
            this.f36201c = null;
            this.f36202d = null;
            this.f36203e = -1;
            this.f36204f = null;
        }

        public void m() {
            TabLayout tabLayout = this.f36206h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.I(this);
        }

        public g n(int i10) {
            return o(LayoutInflater.from(this.f36207i.getContext()).inflate(i10, (ViewGroup) this.f36207i, false));
        }

        public g o(View view) {
            this.f36204f = view;
            s();
            return this;
        }

        public void p(int i10) {
            this.f36203e = i10;
        }

        public g q(Object obj) {
            this.f36199a = obj;
            return this;
        }

        public g r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f36202d) && !TextUtils.isEmpty(charSequence)) {
                this.f36207i.setContentDescription(charSequence);
            }
            this.f36201c = charSequence;
            s();
            return this;
        }

        public void s() {
            i iVar = this.f36207i;
            if (iVar != null) {
                iVar.p();
            }
        }
    }

    public static class h implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f36209a;

        /* renamed from: b, reason: collision with root package name */
        public int f36210b;

        /* renamed from: c, reason: collision with root package name */
        public int f36211c;

        public h(TabLayout tabLayout) {
            this.f36209a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = (TabLayout) this.f36209a.get();
            if (tabLayout != null) {
                int i12 = this.f36211c;
                boolean z11 = true;
                if (i12 != 2 || this.f36210b == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f36210b == 0) {
                    z10 = false;
                }
                tabLayout.N(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            this.f36210b = this.f36211c;
            this.f36211c = i10;
            TabLayout tabLayout = (TabLayout) this.f36209a.get();
            if (tabLayout != null) {
                tabLayout.T(this.f36211c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            TabLayout tabLayout = (TabLayout) this.f36209a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f36211c;
            tabLayout.J(tabLayout.z(i10), i11 == 0 || (i11 == 2 && this.f36210b == 0));
        }

        public void d() {
            this.f36211c = 0;
            this.f36210b = 0;
        }
    }

    public final class i extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public g f36212a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f36213b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f36214c;

        /* renamed from: d, reason: collision with root package name */
        public View f36215d;

        /* renamed from: e, reason: collision with root package name */
        public com.google.android.material.badge.a f36216e;

        /* renamed from: f, reason: collision with root package name */
        public View f36217f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f36218g;

        /* renamed from: h, reason: collision with root package name */
        public ImageView f36219h;

        /* renamed from: i, reason: collision with root package name */
        public Drawable f36220i;

        /* renamed from: j, reason: collision with root package name */
        public int f36221j;

        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f36223a;

            public a(View view) {
                this.f36223a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f36223a.getVisibility() == 0) {
                    i.this.o(this.f36223a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f36221j = 2;
            q(context);
            setPaddingRelative(TabLayout.this.f36163e, TabLayout.this.f36164f, TabLayout.this.f36165g, TabLayout.this.f36167h);
            setGravity(17);
            setOrientation(!TabLayout.this.f36144E ? 1 : 0);
            setClickable(true);
            AbstractC2082d0.y0(this, N.b(getContext(), RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS));
        }

        private com.google.android.material.badge.a getBadge() {
            return this.f36216e;
        }

        @NonNull
        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f36216e == null) {
                this.f36216e = com.google.android.material.badge.a.g(getContext());
            }
            n();
            com.google.android.material.badge.a aVar = this.f36216e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f36220i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f36220i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final float e(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        public final void f(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        public final void g(Canvas canvas) {
            Drawable drawable = this.f36220i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f36220i.draw(canvas);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f36213b, this.f36214c, this.f36217f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f36213b, this.f36214c, this.f36217f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f36212a;
        }

        public final boolean h() {
            return this.f36216e != null;
        }

        public final void i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(ia.i.f48472e, (ViewGroup) this, false);
            this.f36214c = imageView;
            addView(imageView, 0);
        }

        public final void j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(ia.i.f48473f, (ViewGroup) this, false);
            this.f36213b = textView;
            addView(textView);
        }

        public void k() {
            setTab(null);
            setSelected(false);
        }

        public final void l(View view) {
            if (h() && view != null) {
                f(false);
                com.google.android.material.badge.b.b(this.f36216e, view, null);
                this.f36215d = view;
            }
        }

        public final void m() {
            if (h()) {
                f(true);
                View view = this.f36215d;
                if (view != null) {
                    com.google.android.material.badge.b.e(this.f36216e, view);
                    this.f36215d = null;
                }
            }
        }

        public final void n() {
            g gVar;
            g gVar2;
            if (h()) {
                if (this.f36217f != null) {
                    m();
                    return;
                }
                if (this.f36214c != null && (gVar2 = this.f36212a) != null && gVar2.f() != null) {
                    View view = this.f36215d;
                    ImageView imageView = this.f36214c;
                    if (view == imageView) {
                        o(imageView);
                        return;
                    } else {
                        m();
                        l(this.f36214c);
                        return;
                    }
                }
                if (this.f36213b == null || (gVar = this.f36212a) == null || gVar.h() != 1) {
                    m();
                    return;
                }
                View view2 = this.f36215d;
                TextView textView = this.f36213b;
                if (view2 == textView) {
                    o(textView);
                } else {
                    m();
                    l(this.f36213b);
                }
            }
        }

        public final void o(View view) {
            if (h() && view == this.f36215d) {
                com.google.android.material.badge.b.f(this.f36216e, view, null);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            z f12 = z.f1(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f36216e;
            if (aVar != null && aVar.isVisible()) {
                f12.A0(this.f36216e.l());
            }
            f12.z0(z.g.b(0, 1, this.f36212a.g(), 1, false, isSelected()));
            if (isSelected()) {
                f12.x0(false);
                f12.o0(z.a.f68223i);
            }
            f12.R0(getResources().getString(k.f48530h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f36182v, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f36213b != null) {
                float f10 = TabLayout.this.f36178r;
                if (isSelected() && TabLayout.this.f36170k != -1) {
                    f10 = TabLayout.this.f36179s;
                }
                int i12 = this.f36221j;
                ImageView imageView = this.f36214c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f36213b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f36180t;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f36213b.getTextSize();
                int lineCount = this.f36213b.getLineCount();
                int maxLines = this.f36213b.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (TabLayout.this.f36143D != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f36213b.getLayout()) != null && e(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f36213b.setTextSize(0, f10);
                        this.f36213b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        public final void p() {
            s();
            g gVar = this.f36212a;
            setSelected(gVar != null && gVar.k());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f36212a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f36212a.m();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$i] */
        public final void q(Context context) {
            int i10 = TabLayout.this.f36181u;
            if (i10 != 0) {
                Drawable b10 = AbstractC5596a.b(context, i10);
                this.f36220i = b10;
                if (b10 != null && b10.isStateful()) {
                    this.f36220i.setState(getDrawableState());
                }
            } else {
                this.f36220i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f36173n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a10 = Da.a.a(TabLayout.this.f36173n);
                boolean z10 = TabLayout.this.f36148I;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a10, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            setBackground(gradientDrawable);
            TabLayout.this.invalidate();
        }

        public final void r() {
            setOrientation(!TabLayout.this.f36144E ? 1 : 0);
            TextView textView = this.f36218g;
            if (textView == null && this.f36219h == null) {
                t(this.f36213b, this.f36214c, true);
            } else {
                t(textView, this.f36219h, false);
            }
        }

        public final void s() {
            ViewParent parent;
            g gVar = this.f36212a;
            View e10 = gVar != null ? gVar.e() : null;
            if (e10 != null) {
                ViewParent parent2 = e10.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(e10);
                    }
                    View view = this.f36217f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f36217f);
                    }
                    addView(e10);
                }
                this.f36217f = e10;
                TextView textView = this.f36213b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f36214c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f36214c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e10.findViewById(R.id.text1);
                this.f36218g = textView2;
                if (textView2 != null) {
                    this.f36221j = textView2.getMaxLines();
                }
                this.f36219h = (ImageView) e10.findViewById(R.id.icon);
            } else {
                View view2 = this.f36217f;
                if (view2 != null) {
                    removeView(view2);
                    this.f36217f = null;
                }
                this.f36218g = null;
                this.f36219h = null;
            }
            if (this.f36217f == null) {
                if (this.f36214c == null) {
                    i();
                }
                if (this.f36213b == null) {
                    j();
                    this.f36221j = this.f36213b.getMaxLines();
                }
                C0.j.m(this.f36213b, TabLayout.this.f36168i);
                if (!isSelected() || TabLayout.this.f36170k == -1) {
                    C0.j.m(this.f36213b, TabLayout.this.f36169j);
                } else {
                    C0.j.m(this.f36213b, TabLayout.this.f36170k);
                }
                ColorStateList colorStateList = TabLayout.this.f36171l;
                if (colorStateList != null) {
                    this.f36213b.setTextColor(colorStateList);
                }
                t(this.f36213b, this.f36214c, true);
                n();
                d(this.f36214c);
                d(this.f36213b);
            } else {
                TextView textView3 = this.f36218g;
                if (textView3 != null || this.f36219h != null) {
                    t(textView3, this.f36219h, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.f36202d)) {
                return;
            }
            setContentDescription(gVar.f36202d);
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f36213b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f36214c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f36217f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f36212a) {
                this.f36212a = gVar;
                p();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (r7.f36212a.f36205g == 1) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void t(TextView textView, ImageView imageView, boolean z10) {
            boolean z11;
            g gVar = this.f36212a;
            Drawable mutate = (gVar == null || gVar.f() == null) ? null : AbstractC5597a.r(this.f36212a.f()).mutate();
            if (mutate != null) {
                mutate.setTintList(TabLayout.this.f36172m);
                PorterDuff.Mode mode = TabLayout.this.f36177q;
                if (mode != null) {
                    mutate.setTintMode(mode);
                }
            }
            g gVar2 = this.f36212a;
            CharSequence j10 = gVar2 != null ? gVar2.j() : null;
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
            boolean isEmpty = TextUtils.isEmpty(j10);
            if (textView != null) {
                if (!isEmpty) {
                    z11 = true;
                }
                z11 = false;
                textView.setText(!isEmpty ? j10 : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (!isEmpty) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int d10 = (z11 && imageView.getVisibility() == 0) ? (int) o.d(getContext(), 8) : 0;
                if (TabLayout.this.f36144E) {
                    if (d10 != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(d10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (d10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = d10;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f36212a;
            CharSequence charSequence = gVar3 != null ? gVar3.f36202d : null;
            if (isEmpty) {
                j10 = charSequence;
            }
            f0.a(this, j10);
        }
    }

    public static class j implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f36225a;

        public j(ViewPager viewPager) {
            this.f36225a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
            this.f36225a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48261t0);
    }

    private int getDefaultHeight() {
        int size = this.f36159b.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f36159b.get(i10);
            if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.j())) {
                return !this.f36144E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f36183w;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f36143D;
        if (i11 == 0 || i11 == 2) {
            return this.f36186y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f36162d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList r(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f36162d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f36162d.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof i) {
                        ((i) childAt).s();
                    }
                }
                i11++;
            }
        }
    }

    public final boolean A() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public boolean B() {
        return this.f36145F;
    }

    public g C() {
        g t10 = t();
        t10.f36206h = this;
        t10.f36207i = u(t10);
        if (t10.f36208j != -1) {
            t10.f36207i.setId(t10.f36208j);
        }
        return t10;
    }

    public void D() {
        int currentItem;
        F();
        androidx.viewpager.widget.a aVar = this.f36156V;
        if (aVar != null) {
            int d10 = aVar.d();
            for (int i10 = 0; i10 < d10; i10++) {
                j(C().r(this.f36156V.f(i10)), false);
            }
            ViewPager viewPager = this.f36155T;
            if (viewPager == null || d10 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            I(z(currentItem));
        }
    }

    public boolean E(g gVar) {
        return f36139V1.release(gVar);
    }

    public void F() {
        for (int childCount = this.f36162d.getChildCount() - 1; childCount >= 0; childCount--) {
            H(childCount);
        }
        Iterator it = this.f36159b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.l();
            E(gVar);
        }
        this.f36161c = null;
    }

    public void G(c cVar) {
        this.f36152O.remove(cVar);
    }

    public final void H(int i10) {
        i iVar = (i) this.f36162d.getChildAt(i10);
        this.f36162d.removeViewAt(i10);
        if (iVar != null) {
            iVar.k();
            this.f36187y1.release(iVar);
        }
        requestLayout();
    }

    public void I(g gVar) {
        J(gVar, true);
    }

    public void J(g gVar, boolean z10) {
        g gVar2 = this.f36161c;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                v(gVar);
                m(gVar.g());
                return;
            }
            return;
        }
        int g10 = gVar != null ? gVar.g() : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.g() == -1) && g10 != -1) {
                L(g10, 0.0f, true);
            } else {
                m(g10);
            }
            if (g10 != -1) {
                setSelectedTabView(g10);
            }
        }
        this.f36161c = gVar;
        if (gVar2 != null && gVar2.f36206h != null) {
            x(gVar2);
        }
        if (gVar != null) {
            w(gVar);
        }
    }

    public void K(androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f36156V;
        if (aVar2 != null && (dataSetObserver = this.f36157W) != null) {
            aVar2.r(dataSetObserver);
        }
        this.f36156V = aVar;
        if (z10 && aVar != null) {
            if (this.f36157W == null) {
                this.f36157W = new e();
            }
            aVar.k(this.f36157W);
        }
        D();
    }

    public void L(int i10, float f10, boolean z10) {
        M(i10, f10, z10, true);
    }

    public void M(int i10, float f10, boolean z10, boolean z11) {
        N(i10, f10, z10, z11, true);
    }

    public void N(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int round = Math.round(i10 + f10);
        if (round < 0 || round >= this.f36162d.getChildCount()) {
            return;
        }
        if (z11) {
            this.f36162d.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.f36154R;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f36154R.cancel();
        }
        int p10 = p(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && p10 >= scrollX) || (i10 > getSelectedTabPosition() && p10 <= scrollX) || i10 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z13 = (i10 < getSelectedTabPosition() && p10 <= scrollX) || (i10 > getSelectedTabPosition() && p10 >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.f36185x1 == 1 || z12) {
            if (i10 < 0) {
                p10 = 0;
            }
            scrollTo(p10, 0);
        }
        if (z10) {
            setSelectedTabView(round);
        }
    }

    public void O(ViewPager viewPager, boolean z10) {
        P(viewPager, z10, false);
    }

    public final void P(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f36155T;
        if (viewPager2 != null) {
            h hVar = this.f36160b1;
            if (hVar != null) {
                viewPager2.I(hVar);
            }
            b bVar = this.f36166g1;
            if (bVar != null) {
                this.f36155T.H(bVar);
            }
        }
        c cVar = this.f36153P;
        if (cVar != null) {
            G(cVar);
            this.f36153P = null;
        }
        if (viewPager != null) {
            this.f36155T = viewPager;
            if (this.f36160b1 == null) {
                this.f36160b1 = new h(this);
            }
            this.f36160b1.d();
            viewPager.c(this.f36160b1);
            j jVar = new j(viewPager);
            this.f36153P = jVar;
            g(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                K(adapter, z10);
            }
            if (this.f36166g1 == null) {
                this.f36166g1 = new b();
            }
            this.f36166g1.b(z10);
            viewPager.b(this.f36166g1);
            L(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f36155T = null;
            K(null, false);
        }
        this.f36176p1 = z11;
    }

    public final void Q() {
        int size = this.f36159b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.f36159b.get(i10)).s();
        }
    }

    public final void R(LinearLayout.LayoutParams layoutParams) {
        if (this.f36143D == 1 && this.f36140A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void S(boolean z10) {
        for (int i10 = 0; i10 < this.f36162d.getChildCount(); i10++) {
            View childAt = this.f36162d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            R((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    public void T(int i10) {
        this.f36185x1 = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        l(view);
    }

    public void g(c cVar) {
        if (this.f36152O.contains(cVar)) {
            return;
        }
        this.f36152O.add(cVar);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f36161c;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f36159b.size();
    }

    public int getTabGravity() {
        return this.f36140A;
    }

    public ColorStateList getTabIconTint() {
        return this.f36172m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f36147H;
    }

    public int getTabIndicatorGravity() {
        return this.f36142C;
    }

    public int getTabMaxWidth() {
        return this.f36182v;
    }

    public int getTabMode() {
        return this.f36143D;
    }

    public ColorStateList getTabRippleColor() {
        return this.f36173n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f36174o;
    }

    public ColorStateList getTabTextColors() {
        return this.f36171l;
    }

    public void h(g gVar) {
        j(gVar, this.f36159b.isEmpty());
    }

    public void i(g gVar, int i10, boolean z10) {
        if (gVar.f36206h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        q(gVar, i10);
        k(gVar);
        if (z10) {
            gVar.m();
        }
    }

    public void j(g gVar, boolean z10) {
        i(gVar, this.f36159b.size(), z10);
    }

    public final void k(g gVar) {
        i iVar = gVar.f36207i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f36162d.addView(iVar, gVar.g(), s());
    }

    public final void l(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void m(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f36162d.d()) {
            L(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int p10 = p(i10, 0.0f);
        if (scrollX != p10) {
            y();
            this.f36154R.setIntValues(scrollX, p10);
            this.f36154R.start();
        }
        this.f36162d.c(i10, this.f36141B);
    }

    public final void n(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f36162d.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f36162d.setGravity(8388611);
    }

    public final void o() {
        int i10 = this.f36143D;
        this.f36162d.setPaddingRelative((i10 == 0 || i10 == 2) ? Math.max(0, this.f36188z - this.f36163e) : 0, 0, 0, 0);
        int i11 = this.f36143D;
        if (i11 == 0) {
            n(this.f36140A);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f36140A == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f36162d.setGravity(1);
        }
        S(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.j.e(this);
        if (this.f36155T == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                P((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36176p1) {
            setupWithViewPager(null);
            this.f36176p1 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f36162d.getChildCount(); i10++) {
            View childAt = this.f36162d.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.f1(accessibilityNodeInfo).y0(z.f.b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return A() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int round = Math.round(o.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int i12 = this.f36184x;
            if (i12 <= 0) {
                i12 = (int) (size - o.d(getContext(), 56));
            }
            this.f36182v = i12;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i13 = this.f36143D;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
                if (i13 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || A()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final int p(int i10, float f10) {
        View childAt;
        int i11 = this.f36143D;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f36162d.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f36162d.getChildCount() ? this.f36162d.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    public final void q(g gVar, int i10) {
        gVar.p(i10);
        this.f36159b.add(i10, gVar);
        int size = this.f36159b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (((g) this.f36159b.get(i12)).g() == this.f36158a) {
                i11 = i12;
            }
            ((g) this.f36159b.get(i12)).p(i12);
        }
        this.f36158a = i11;
    }

    public final LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        R(layoutParams);
        return layoutParams;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.j.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f36144E != z10) {
            this.f36144E = z10;
            for (int i10 = 0; i10 < this.f36162d.getChildCount(); i10++) {
                View childAt = this.f36162d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).r();
                }
            }
            o();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        y();
        this.f36154R.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = AbstractC5597a.r(drawable).mutate();
        this.f36174o = mutate;
        ua.d.l(mutate, this.f36175p);
        int i10 = this.f36146G;
        if (i10 == -1) {
            i10 = this.f36174o.getIntrinsicHeight();
        }
        this.f36162d.i(i10);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f36175p = i10;
        ua.d.l(this.f36174o, i10);
        S(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f36142C != i10) {
            this.f36142C = i10;
            this.f36162d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f36146G = i10;
        this.f36162d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f36140A != i10) {
            this.f36140A = i10;
            o();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f36172m != colorStateList) {
            this.f36172m = colorStateList;
            Q();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(AbstractC5596a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f36147H = i10;
        if (i10 == 0) {
            this.f36149J = new com.google.android.material.tabs.a();
            return;
        }
        if (i10 == 1) {
            this.f36149J = new Ia.a();
        } else {
            if (i10 == 2) {
                this.f36149J = new Ia.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f36145F = z10;
        this.f36162d.g();
        this.f36162d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.f36143D) {
            this.f36143D = i10;
            o();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f36173n != colorStateList) {
            this.f36173n = colorStateList;
            for (int i10 = 0; i10 < this.f36162d.getChildCount(); i10++) {
                View childAt = this.f36162d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(AbstractC5596a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f36171l != colorStateList) {
            this.f36171l = colorStateList;
            Q();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        K(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f36148I != z10) {
            this.f36148I = z10;
            for (int i10 = 0; i10 < this.f36162d.getChildCount(); i10++) {
                View childAt = this.f36162d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        O(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public g t() {
        g gVar = (g) f36139V1.acquire();
        return gVar == null ? new g() : gVar;
    }

    public final i u(g gVar) {
        InterfaceC6775d interfaceC6775d = this.f36187y1;
        i iVar = interfaceC6775d != null ? (i) interfaceC6775d.acquire() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f36202d)) {
            iVar.setContentDescription(gVar.f36201c);
            return iVar;
        }
        iVar.setContentDescription(gVar.f36202d);
        return iVar;
    }

    public final void v(g gVar) {
        for (int size = this.f36152O.size() - 1; size >= 0; size--) {
            ((c) this.f36152O.get(size)).c(gVar);
        }
    }

    public final void w(g gVar) {
        for (int size = this.f36152O.size() - 1; size >= 0; size--) {
            ((c) this.f36152O.get(size)).a(gVar);
        }
    }

    public final void x(g gVar) {
        for (int size = this.f36152O.size() - 1; size >= 0; size--) {
            ((c) this.f36152O.get(size)).b(gVar);
        }
    }

    public final void y() {
        if (this.f36154R == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36154R = valueAnimator;
            valueAnimator.setInterpolator(this.f36150K);
            this.f36154R.setDuration(this.f36141B);
            this.f36154R.addUpdateListener(new a());
        }
    }

    public g z(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (g) this.f36159b.get(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f36138T1;
        this.f36158a = -1;
        this.f36159b = new ArrayList();
        this.f36170k = -1;
        this.f36175p = 0;
        this.f36182v = Integer.MAX_VALUE;
        this.f36146G = -1;
        this.f36152O = new ArrayList();
        this.f36187y1 = new Pools$SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f36162d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray i12 = xa.l.i(context2, attributeSet, m.TabLayout, i10, i11, m.f48918h7);
        ColorStateList f10 = ua.d.f(getBackground());
        if (f10 != null) {
            com.google.android.material.shape.i iVar = new com.google.android.material.shape.i();
            iVar.f0(f10);
            iVar.T(context2);
            iVar.e0(getElevation());
            setBackground(iVar);
        }
        setSelectedTabIndicator(Ca.c.e(context2, i12, m.f48735O6));
        setSelectedTabIndicatorColor(i12.getColor(m.f48765R6, 0));
        fVar.i(i12.getDimensionPixelSize(m.f48793U6, -1));
        setSelectedTabIndicatorGravity(i12.getInt(m.f48784T6, 0));
        setTabIndicatorAnimationMode(i12.getInt(m.f48755Q6, 0));
        setTabIndicatorFullWidth(i12.getBoolean(m.f48775S6, true));
        int dimensionPixelSize = i12.getDimensionPixelSize(m.f48838Z6, 0);
        this.f36167h = dimensionPixelSize;
        this.f36165g = dimensionPixelSize;
        this.f36164f = dimensionPixelSize;
        this.f36163e = dimensionPixelSize;
        this.f36163e = i12.getDimensionPixelSize(m.f48868c7, dimensionPixelSize);
        this.f36164f = i12.getDimensionPixelSize(m.f48878d7, this.f36164f);
        this.f36165g = i12.getDimensionPixelSize(m.f48858b7, this.f36165g);
        this.f36167h = i12.getDimensionPixelSize(m.f48848a7, this.f36167h);
        if (xa.l.g(context2)) {
            this.f36168i = ia.c.f48267w0;
        } else {
            this.f36168i = ia.c.f48263u0;
        }
        int resourceId = i12.getResourceId(m.f48918h7, l.f48566e);
        this.f36169j = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, l.j.TextAppearance);
        try {
            this.f36178r = obtainStyledAttributes.getDimensionPixelSize(l.j.f55348p2, 0);
            this.f36171l = Ca.c.a(context2, obtainStyledAttributes, l.j.f55361s2);
            obtainStyledAttributes.recycle();
            if (i12.hasValue(m.f48898f7)) {
                this.f36170k = i12.getResourceId(m.f48898f7, resourceId);
            }
            int i13 = this.f36170k;
            if (i13 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i13, l.j.TextAppearance);
                try {
                    this.f36179s = obtainStyledAttributes.getDimensionPixelSize(l.j.f55348p2, (int) this.f36178r);
                    ColorStateList a10 = Ca.c.a(context2, obtainStyledAttributes, l.j.f55361s2);
                    if (a10 != null) {
                        this.f36171l = r(this.f36171l.getDefaultColor(), a10.getColorForState(new int[]{R.attr.state_selected}, a10.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (i12.hasValue(m.f48928i7)) {
                this.f36171l = Ca.c.a(context2, i12, m.f48928i7);
            }
            if (i12.hasValue(m.f48908g7)) {
                this.f36171l = r(this.f36171l.getDefaultColor(), i12.getColor(m.f48908g7, 0));
            }
            this.f36172m = Ca.c.a(context2, i12, m.f48715M6);
            this.f36177q = o.k(i12.getInt(m.f48725N6, -1), null);
            this.f36173n = Ca.c.a(context2, i12, m.f48888e7);
            this.f36141B = i12.getInt(m.f48745P6, 300);
            this.f36150K = za.h.g(context2, ia.c.f48225b0, AbstractC5104a.f53859b);
            this.f36183w = i12.getDimensionPixelSize(m.f48820X6, -1);
            this.f36184x = i12.getDimensionPixelSize(m.f48811W6, -1);
            this.f36181u = i12.getResourceId(m.f48685J6, 0);
            this.f36188z = i12.getDimensionPixelSize(m.f48695K6, 0);
            this.f36143D = i12.getInt(m.f48829Y6, 1);
            this.f36140A = i12.getInt(m.f48705L6, 0);
            this.f36144E = i12.getBoolean(m.f48802V6, false);
            this.f36148I = i12.getBoolean(m.f48938j7, false);
            i12.recycle();
            Resources resources = getResources();
            this.f36180t = resources.getDimensionPixelSize(ia.e.f48362q);
            this.f36186y = resources.getDimensionPixelSize(ia.e.f48360p);
            o();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        l(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f36151L;
        if (cVar2 != null) {
            G(cVar2);
        }
        this.f36151L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        l(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        l(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(AbstractC5596a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
