package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import com.vkontakte.android.R;
import defpackage.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.a5p0;
import xsna.b0u0;
import xsna.c820;
import xsna.dgn;
import xsna.eu;
import xsna.iut0;
import xsna.j620;
import xsna.l620;
import xsna.lin0;
import xsna.m33;
import xsna.s101;
import xsna.sm9;
import xsna.t8l;
import xsna.tw3;
import xsna.x2p0;
import xsna.y3g;
import xsna.ypg0;
import xsna.yyo0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements j620 {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public final l620 H;
    public ArrayList<MenuItem> I;
    public h J;
    public final a K;
    public androidx.appcompat.widget.d L;
    public ActionMenuPresenter M;
    public f N;
    public x2p0.c O;
    public x2p0.d P;
    public boolean Q;
    public OnBackInvokedCallback R;
    public OnBackInvokedDispatcher S;
    public boolean T;
    public final b U;
    public ActionMenuView b;
    public AppCompatTextView c;
    public AppCompatTextView d;
    public AppCompatImageButton e;
    public AppCompatImageView f;
    public final Drawable g;
    public final CharSequence h;
    public AppCompatImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public final int o;
    public final int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public ypg0 u;
    public int v;
    public int w;
    public final int x;
    public CharSequence y;
    public CharSequence z;

    /* loaded from: classes11.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes11.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuView actionMenuView = Toolbar.this.b;
            if (actionMenuView != null) {
                actionMenuView.r();
            }
        }
    }

    /* loaded from: classes11.dex */
    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void a(@NonNull androidx.appcompat.view.menu.f fVar) {
            Toolbar toolbar = Toolbar.this;
            if (!toolbar.b.o()) {
                Iterator<c820> it = toolbar.H.b.iterator();
                while (it.hasNext()) {
                    it.next().onPrepareMenu(fVar);
                }
            }
            x2p0.d dVar = toolbar.P;
            if (dVar != null) {
                dVar.a(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
            return false;
        }
    }

    /* loaded from: classes11.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = Toolbar.this.N;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.c;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes11.dex */
    public static class e {
        @Nullable
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: xsna.v2p0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes11.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public static g g() {
        return new g(-2);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new lin0(getContext());
    }

    public static g h(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof eu.a ? new g((eu.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int n = s101.n(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && u(childAt)) {
                    int i3 = gVar.a;
                    int layoutDirection = getLayoutDirection();
                    int n2 = s101.n(i3, layoutDirection) & 7;
                    if (n2 != 1 && n2 != 3 && n2 != 5) {
                        n2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (n2 == n) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && u(childAt2)) {
                int i5 = gVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int n3 = s101.n(i5, layoutDirection2) & 7;
                if (n3 != 1 && n3 != 3 && n3 != 5) {
                    n3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (n3 == n) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // xsna.j620
    public final void addMenuProvider(@NonNull c820 c820Var) {
        l620 l620Var = this.H;
        l620Var.b.add(c820Var);
        l620Var.a.run();
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g g2 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (g) layoutParams;
        g2.b = 1;
        if (!z || this.j == null) {
            addView(view, g2);
        } else {
            view.setLayoutParams(g2);
            this.F.add(view);
        }
    }

    public final void c() {
        if (this.i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            g g2 = g();
            g2.a = (this.o & 112) | 8388611;
            g2.b = 2;
            this.i.setLayoutParams(g2);
            this.i.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        e();
        if (this.b.p() == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) this.b.getMenu();
            if (this.N == null) {
                this.N = new f();
            }
            this.b.setExpandedActionViewsExclusive(true);
            fVar.b(this.N, this.k);
            v();
        }
    }

    public final void e() {
        if (this.b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.b.setOnMenuItemClickListener(this.K);
            this.b.q(this.O, new c());
            g g2 = g();
            g2.a = (this.o & 112) | 8388613;
            this.b.setLayoutParams(g2);
            b(this.b, false);
        }
    }

    public final void f() {
        if (this.e == null) {
            this.e = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g g2 = g();
            g2.a = (this.o & 112) | 8388611;
            this.e.setLayoutParams(g2);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.i;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.i;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ypg0 ypg0Var = this.u;
        if (ypg0Var != null) {
            return ypg0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ypg0 ypg0Var = this.u;
        if (ypg0Var != null) {
            return ypg0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        ypg0 ypg0Var = this.u;
        if (ypg0Var != null) {
            return ypg0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        ypg0 ypg0Var = this.u;
        if (ypg0Var != null) {
            return ypg0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f p;
        ActionMenuView actionMenuView = this.b;
        return (actionMenuView == null || (p = actionMenuView.p()) == null || !p.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.w, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.b.getMenu();
    }

    @Nullable
    public View getNavButtonView() {
        return this.e;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.e;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.e;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.M;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        d();
        return this.b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    @Nullable
    public final TextView getSubtitleTextView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    @Nullable
    public final TextView getTitleTextView() {
        return this.c;
    }

    public t8l getWrapper() {
        if (this.L == null) {
            this.L = new androidx.appcompat.widget.d(this, true);
        }
        return this.L;
    }

    public final int i(int i, View view) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = gVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public void l(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void m() {
        Iterator<MenuItem> it = this.I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<c820> it2 = this.H.b.iterator();
        while (it2.hasNext()) {
            it2.next().onCreateMenu(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.I = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int i4 = i(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        dgn.b(view, i4, max, i4, max + measuredWidth);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.U);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0296 A[LOOP:0: B:40:0x0294->B:41:0x0296, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ae A[LOOP:1: B:44:0x02ac->B:45:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ce A[LOOP:2: B:48:0x02cc->B:49:0x02ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0322 A[LOOP:3: B:57:0x0320->B:58:0x0322, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean u;
        boolean u2;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13;
        int size;
        int i14;
        int i15;
        int size2;
        int i16;
        int size3;
        int i17;
        int i18;
        int a2;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!u(this.e)) {
            i5 = paddingLeft;
        } else {
            if (z3) {
                i6 = p(this.e, i19, min, iArr);
                i5 = paddingLeft;
                if (u(this.i)) {
                    if (z3) {
                        i6 = p(this.i, i6, min, iArr);
                    } else {
                        i5 = o(this.i, i5, min, iArr);
                    }
                }
                if (u(this.b)) {
                    if (z3) {
                        i5 = o(this.b, i5, min, iArr);
                    } else {
                        i6 = p(this.b, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (u(this.j)) {
                    if (z3) {
                        min2 = p(this.j, min2, min, iArr);
                    } else {
                        max = o(this.j, max, min, iArr);
                    }
                }
                if (u(this.f)) {
                    if (z3) {
                        min2 = p(this.f, min2, min, iArr);
                    } else {
                        max = o(this.f, max, min, iArr);
                    }
                }
                u = u(this.c);
                u2 = u(this.d);
                if (u) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    g gVar = (g) this.c.getLayoutParams();
                    z2 = z3;
                    i7 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                }
                if (!u2) {
                    g gVar2 = (g) this.d.getLayoutParams();
                    i7 = this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i7;
                }
                if (!u || u2) {
                    AppCompatTextView appCompatTextView = !u ? this.c : this.d;
                    i8 = 2;
                    AppCompatTextView appCompatTextView2 = !u2 ? this.d : this.c;
                    g gVar3 = (g) appCompatTextView.getLayoutParams();
                    g gVar4 = (g) appCompatTextView2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!u && this.c.getMeasuredWidth() > 0) || (u2 && this.d.getMeasuredWidth() > 0);
                    i9 = this.x & 112;
                    int i21 = max;
                    if (i9 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.s;
                    } else if (i9 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.s;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i26 = this.t;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.t) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.q : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (u) {
                            g gVar5 = (g) this.c.getLayoutParams();
                            int measuredWidth = this.c.getMeasuredWidth() + max;
                            int measuredHeight = this.c.getMeasuredHeight() + paddingTop;
                            this.c.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i10 = measuredWidth + this.r;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i10 = max;
                        }
                        if (u2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.d.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.d.getMeasuredWidth() + max;
                            this.d.layout(max, i28, measuredWidth2, this.d.getMeasuredHeight() + i28);
                            i11 = measuredWidth2 + this.r;
                        } else {
                            i11 = max;
                        }
                        if (z4) {
                            max = Math.max(i10, i11);
                        }
                    } else {
                        int i29 = (z4 ? this.q : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (u) {
                            g gVar6 = (g) this.c.getLayoutParams();
                            int measuredWidth3 = min2 - this.c.getMeasuredWidth();
                            int measuredHeight2 = this.c.getMeasuredHeight() + paddingTop;
                            this.c.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i12 = measuredWidth3 - this.r;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                        } else {
                            i12 = min2;
                        }
                        if (u2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.d.getLayoutParams())).topMargin;
                            this.d.layout(min2 - this.d.getMeasuredWidth(), i30, min2, this.d.getMeasuredHeight() + i30);
                            i13 = min2 - this.r;
                        } else {
                            i13 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i12, i13);
                        }
                        max = i21;
                    }
                } else {
                    i8 = 2;
                }
                ArrayList<View> arrayList = this.E;
                a(3, arrayList);
                size = arrayList.size();
                i14 = max;
                for (i15 = 0; i15 < size; i15++) {
                    i14 = o(arrayList.get(i15), i14, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i16 = 0; i16 < size2; i16++) {
                    min2 = p(arrayList.get(i16), min2, min, iArr);
                }
                a(1, arrayList);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i17 = 0;
                int i34 = 0;
                while (i17 < size3) {
                    View view = arrayList.get(i17);
                    g gVar7 = (g) view.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) gVar7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) gVar7).rightMargin - i35;
                    int max2 = Math.max(0, i36);
                    int max3 = Math.max(0, i37);
                    int max4 = Math.max(0, -i36);
                    int max5 = Math.max(0, -i37);
                    i34 += view.getMeasuredWidth() + max2 + max3;
                    i17++;
                    i33 = max4;
                    i32 = max5;
                }
                a2 = j0.a(width, paddingLeft, paddingRight, i8, paddingLeft) - (i34 / 2);
                int i38 = i34 + a2;
                if (a2 >= i14) {
                    i14 = i38 > min2 ? a2 - (i38 - min2) : a2;
                }
                size4 = arrayList.size();
                for (i18 = 0; i18 < size4; i18++) {
                    i14 = o(arrayList.get(i18), i14, min, iArr);
                }
                arrayList.clear();
            }
            i5 = o(this.e, paddingLeft, min, iArr);
        }
        i6 = i19;
        if (u(this.i)) {
        }
        if (u(this.b)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (u(this.j)) {
        }
        if (u(this.f)) {
        }
        u = u(this.c);
        u2 = u(this.d);
        if (u) {
        }
        if (!u2) {
        }
        if (u) {
        }
        if (!u) {
        }
        i8 = 2;
        if (!u2) {
        }
        g gVar32 = (g) appCompatTextView.getLayoutParams();
        g gVar42 = (g) appCompatTextView2.getLayoutParams();
        int i202 = i7;
        if (u) {
        }
        i9 = this.x & 112;
        int i212 = max;
        if (i9 != 48) {
        }
        if (z2) {
        }
        ArrayList<View> arrayList2 = this.E;
        a(3, arrayList2);
        size = arrayList2.size();
        i14 = max;
        while (i15 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i16 < size2) {
        }
        a(1, arrayList2);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i17 = 0;
        int i342 = 0;
        while (i17 < size3) {
        }
        a2 = j0.a(width, paddingLeft, paddingRight, i8, paddingLeft) - (i342 / 2);
        int i382 = i342 + a2;
        if (a2 >= i14) {
        }
        size4 = arrayList2.size();
        while (i18 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c2 = 0;
        } else {
            c2 = 1;
            objArr = false;
        }
        if (u(this.e)) {
            r(this.e, i, 0, i2, this.p);
            i3 = j(this.e) + this.e.getMeasuredWidth();
            i4 = Math.max(0, k(this.e) + this.e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (u(this.i)) {
            r(this.i, i, 0, i2, this.p);
            i3 = j(this.i) + this.i.getMeasuredWidth();
            i4 = Math.max(i4, k(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.G;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (u(this.b)) {
            r(this.b, i, max, i2, this.p);
            i6 = j(this.b) + this.b.getMeasuredWidth();
            i4 = Math.max(i4, k(this.b) + this.b.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (u(this.j)) {
            max3 += q(this.j, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, k(this.j) + this.j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        if (u(this.f)) {
            max3 += q(this.f, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, k(this.f) + this.f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((g) childAt.getLayoutParams()).b == 0 && u(childAt)) {
                max3 += q(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, k(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (u(this.c)) {
            q(this.c, i, i12 + i14, i2, i13, iArr);
            int j = j(this.c) + this.c.getMeasuredWidth();
            i7 = k(this.c) + this.c.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.c.getMeasuredState());
            i9 = j;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (u(this.d)) {
            i9 = Math.max(i9, q(this.d, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += k(this.d) + this.d.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.d.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.Q) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d());
        ActionMenuView actionMenuView = this.b;
        androidx.appcompat.view.menu.f p = actionMenuView != null ? actionMenuView.p() : null;
        int i = savedState.d;
        if (i != 0 && this.N != null && p != null && (findItem = p.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.e) {
            b bVar = this.U;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.u == null) {
            this.u = new ypg0();
        }
        this.u.f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.N;
        if (fVar != null && (hVar = fVar.c) != null) {
            savedState.d = hVar.a;
        }
        ActionMenuView actionMenuView = this.b;
        savedState.e = actionMenuView != null && actionMenuView.o();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int i4 = i(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        dgn.b(view, i4, max - measuredWidth, i4, max);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // xsna.j620
    public final void removeMenuProvider(@NonNull c820 c820Var) {
        this.H.a(c820Var);
    }

    public void s(int i, Context context) {
        this.n = i;
        AppCompatTextView appCompatTextView = this.d;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i);
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.T != z) {
            this.T = z;
            v();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(m33.a(i, getContext()));
    }

    public void setCollapsible(boolean z) {
        this.Q = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(m33.a(i, getContext()));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(m33.a(i, getContext()));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.J = hVar;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        d();
        this.b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void t(int i, Context context) {
        this.m = i;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i);
        }
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = e.a(this);
            f fVar = this.N;
            boolean z = (fVar == null || fVar.c == null || a2 == null || !isAttachedToWindow() || !this.T) ? false : true;
            if (z && this.S == null) {
                if (this.R == null) {
                    this.R = e.b(new sm9(this, 15));
                }
                e.c(a2, this.R);
                this.S = a2;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.S) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.R);
            this.S = null;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new l620(new tw3(this, 25));
        this.I = new ArrayList<>();
        this.K = new a();
        this.U = new b();
        Context context2 = getContext();
        int[] iArr = R$styleable.x;
        yyo0 e2 = yyo0.e(context2, attributeSet, iArr, i, 0);
        iut0.p(this, context, iArr, attributeSet, e2.b, i);
        TypedArray typedArray = e2.b;
        this.m = typedArray.getResourceId(28, 0);
        this.n = typedArray.getResourceId(19, 0);
        this.x = typedArray.getInteger(0, 8388627);
        this.o = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.q = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.q = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.r = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.s = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.t = dimensionPixelOffset5;
        }
        this.p = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        if (this.u == null) {
            this.u = new ypg0();
        }
        this.u.e(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.u.g(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.v = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.w = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.g = e2.b(4);
        this.h = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.k = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable b2 = e2.b(16);
        if (b2 != null) {
            setNavigationIcon(b2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable b3 = e2.b(11);
        if (b3 != null) {
            setLogo(b3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(e2.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(e2.a(20));
        }
        if (typedArray.hasValue(14)) {
            l(typedArray.getResourceId(14, 0));
        }
        e2.f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.i;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            c();
            this.i.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.i;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f == null) {
                this.f = new AppCompatImageView(getContext());
            }
            if (!n(this.f)) {
                b(this.f, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f;
            if (appCompatImageView != null && n(appCompatImageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f == null) {
            this.f = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        AppCompatImageButton appCompatImageButton = this.e;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            a5p0.a(this.e, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            f();
            if (!n(this.e)) {
                b(this.e, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.e;
            if (appCompatImageButton != null && n(appCompatImageButton)) {
                removeView(this.e);
                this.F.remove(this.e);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.e;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.d;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.d);
                this.F.remove(this.d);
            }
        } else {
            if (this.d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.d = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!n(this.d)) {
                b(this.d, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.d;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.B = colorStateList;
        AppCompatTextView appCompatTextView = this.d;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.c;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.c);
                this.F.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes11.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int d;
        public boolean e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes11.dex */
    public static class g extends eu.a {
        public int b;

        public g(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
            this.b = 0;
        }

        public g(int i) {
            super(-2, i);
            this.b = 0;
            this.a = 8388627;
        }

        public g(g gVar) {
            super((eu.a) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(eu.a aVar) {
            super(aVar);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    /* loaded from: classes11.dex */
    public class f implements j {
        public androidx.appcompat.view.menu.f b;
        public androidx.appcompat.view.menu.h c;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable b() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void c(boolean z) {
            if (this.c != null) {
                androidx.appcompat.view.menu.f fVar = this.b;
                if (fVar != null) {
                    int size = fVar.f.size();
                    for (int i = 0; i < size; i++) {
                        if (this.b.getItem(i) == this.c) {
                            return;
                        }
                    }
                }
                d(this.c);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean d(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.j;
            if (callback instanceof y3g) {
                ((y3g) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.j);
            toolbar.removeView(toolbar.i);
            toolbar.j = null;
            ArrayList<View> arrayList = toolbar.F;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.c = null;
            toolbar.requestLayout();
            hVar.C = false;
            hVar.n.p(false);
            toolbar.v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e(m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean f(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.i.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                toolbar.addView(toolbar.i);
            }
            View actionView = hVar.getActionView();
            toolbar.j = actionView;
            this.c = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.j);
                }
                g g = Toolbar.g();
                g.a = (toolbar.o & 112) | 8388611;
                g.b = 2;
                toolbar.j.setLayoutParams(g);
                toolbar.addView(toolbar.j);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).b != 2 && childAt != toolbar.b) {
                    toolbar.removeViewAt(childCount);
                    toolbar.F.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.n.p(false);
            KeyEvent.Callback callback = toolbar.j;
            if (callback instanceof y3g) {
                ((y3g) callback).onActionViewExpanded();
            }
            toolbar.v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.b;
            if (fVar2 != null && (hVar = this.c) != null) {
                fVar2.d(hVar);
            }
            this.b = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void a(androidx.appcompat.view.menu.f fVar, boolean z) {
        }
    }
}
