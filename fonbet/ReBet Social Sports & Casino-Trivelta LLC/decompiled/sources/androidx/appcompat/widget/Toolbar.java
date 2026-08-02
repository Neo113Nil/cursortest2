package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2112t;
import androidx.core.view.InterfaceC2120x;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.time.DurationKt;
import l.AbstractC5335a;
import m.AbstractC5479a;
import n.AbstractC5596a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC2120x {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f17154A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17155B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17156C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f17157D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f17158E;

    /* renamed from: F, reason: collision with root package name */
    public final androidx.core.view.A f17159F;

    /* renamed from: G, reason: collision with root package name */
    public ArrayList f17160G;

    /* renamed from: H, reason: collision with root package name */
    public h f17161H;

    /* renamed from: I, reason: collision with root package name */
    public final ActionMenuView.e f17162I;

    /* renamed from: J, reason: collision with root package name */
    public e0 f17163J;

    /* renamed from: K, reason: collision with root package name */
    public ActionMenuPresenter f17164K;

    /* renamed from: L, reason: collision with root package name */
    public f f17165L;

    /* renamed from: O, reason: collision with root package name */
    public i.a f17166O;

    /* renamed from: P, reason: collision with root package name */
    public e.a f17167P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f17168R;

    /* renamed from: T, reason: collision with root package name */
    public OnBackInvokedCallback f17169T;

    /* renamed from: V, reason: collision with root package name */
    public OnBackInvokedDispatcher f17170V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f17171W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f17172a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f17173b;

    /* renamed from: b1, reason: collision with root package name */
    public final Runnable f17174b1;

    /* renamed from: c, reason: collision with root package name */
    public TextView f17175c;

    /* renamed from: d, reason: collision with root package name */
    public ImageButton f17176d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f17177e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f17178f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f17179g;

    /* renamed from: h, reason: collision with root package name */
    public ImageButton f17180h;

    /* renamed from: i, reason: collision with root package name */
    public View f17181i;

    /* renamed from: j, reason: collision with root package name */
    public Context f17182j;

    /* renamed from: k, reason: collision with root package name */
    public int f17183k;

    /* renamed from: l, reason: collision with root package name */
    public int f17184l;

    /* renamed from: m, reason: collision with root package name */
    public int f17185m;
    private final int[] mTempMargins;

    /* renamed from: n, reason: collision with root package name */
    public int f17186n;

    /* renamed from: o, reason: collision with root package name */
    public int f17187o;

    /* renamed from: p, reason: collision with root package name */
    public int f17188p;

    /* renamed from: q, reason: collision with root package name */
    public int f17189q;

    /* renamed from: r, reason: collision with root package name */
    public int f17190r;

    /* renamed from: s, reason: collision with root package name */
    public int f17191s;

    /* renamed from: t, reason: collision with root package name */
    public S f17192t;

    /* renamed from: u, reason: collision with root package name */
    public int f17193u;

    /* renamed from: v, reason: collision with root package name */
    public int f17194v;

    /* renamed from: w, reason: collision with root package name */
    public int f17195w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f17196x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f17197y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f17198z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f17159F.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f17161H;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f17167P;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f17172a.H()) {
                Toolbar.this.f17159F.i(eVar);
            }
            e.a aVar = Toolbar.this.f17167P;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.d0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) obj2);
        }

        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.i {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f17205a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.g f17206b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean b(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f17180h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f17180h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f17180h);
            }
            Toolbar.this.f17181i = gVar.getActionView();
            this.f17206b = gVar;
            ViewParent parent2 = Toolbar.this.f17181i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f17181i);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f55919a = (toolbar4.f17186n & 112) | 8388611;
                generateDefaultLayoutParams.f17208b = 2;
                toolbar4.f17181i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f17181i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f17181i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void d(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(androidx.appcompat.view.menu.l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public Parcelable f() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.i
        public void g(boolean z10) {
            if (this.f17206b != null) {
                androidx.appcompat.view.menu.e eVar = this.f17205a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f17205a.getItem(i10) == this.f17206b) {
                            return;
                        }
                    }
                }
                i(this.f17205a, this.f17206b);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean h() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f17181i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f17181i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f17180h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f17181i = null;
            toolbar3.a();
            this.f17206b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f17205a;
            if (eVar2 != null && (gVar = this.f17206b) != null) {
                eVar2.f(gVar);
            }
            this.f17205a = eVar;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f17172a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f17172a;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f17159F.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f17160G = currentMenuItems2;
    }

    public final void H() {
        removeCallbacks(this.f17174b1);
        post(this.f17174b1);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f17208b != 2 && childAt != this.f17172a) {
                removeViewAt(childCount);
                this.f17158E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f17192t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar == null && this.f17172a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e L10 = this.f17172a.L();
        if (L10 == eVar) {
            return;
        }
        if (L10 != null) {
            L10.R(this.f17164K);
            L10.R(this.f17165L);
        }
        if (this.f17165L == null) {
            this.f17165L = new f();
        }
        actionMenuPresenter.I(true);
        if (eVar != null) {
            eVar.c(actionMenuPresenter, this.f17182j);
            eVar.c(this.f17165L, this.f17182j);
        } else {
            actionMenuPresenter.j(this.f17182j, null);
            this.f17165L.j(this.f17182j, null);
            actionMenuPresenter.g(true);
            this.f17165L.g(true);
        }
        this.f17172a.setPopupTheme(this.f17183k);
        this.f17172a.setPresenter(actionMenuPresenter);
        this.f17164K = actionMenuPresenter;
        R();
    }

    public void L(i.a aVar, e.a aVar2) {
        this.f17166O = aVar;
        this.f17167P = aVar2;
        ActionMenuView actionMenuView = this.f17172a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f17185m = i10;
        TextView textView = this.f17175c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f17184l = i10;
        TextView textView = this.f17173b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public final boolean O() {
        if (!this.f17168R) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f17172a;
        return actionMenuView != null && actionMenuView.N();
    }

    public void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = v() && a10 != null && isAttachedToWindow() && this.f17171W;
            if (z10 && this.f17170V == null) {
                if (this.f17169T == null) {
                    this.f17169T = e.b(new Runnable() { // from class: androidx.appcompat.widget.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a10, this.f17169T);
                this.f17170V = a10;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f17170V) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f17169T);
            this.f17170V = null;
        }
    }

    public void a() {
        for (int size = this.f17158E.size() - 1; size >= 0; size--) {
            addView((View) this.f17158E.get(size));
        }
        this.f17158E.clear();
    }

    @Override // androidx.core.view.InterfaceC2120x
    public void addMenuProvider(androidx.core.view.C c10) {
        this.f17159F.c(c10);
    }

    public final void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int b10 = AbstractC2112t.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f17208b == 0 && P(childAt) && p(gVar.f55919a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f17208b == 0 && P(childAt2) && p(gVar2.f55919a) == b10) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f17208b = 1;
        if (!z10 || this.f17181i == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f17158E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f17172a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.f17165L;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f17206b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f17172a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public void g() {
        if (this.f17180h == null) {
            C2057l c2057l = new C2057l(getContext(), null, AbstractC5335a.f54984Q);
            this.f17180h = c2057l;
            c2057l.setImageDrawable(this.f17178f);
            this.f17180h.setContentDescription(this.f17179g);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f55919a = (this.f17186n & 112) | 8388611;
            generateDefaultLayoutParams.f17208b = 2;
            this.f17180h.setLayoutParams(generateDefaultLayoutParams);
            this.f17180h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f17180h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f17180h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        S s10 = this.f17192t;
        if (s10 != null) {
            return s10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f17194v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        S s10 = this.f17192t;
        if (s10 != null) {
            return s10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        S s10 = this.f17192t;
        if (s10 != null) {
            return s10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        S s10 = this.f17192t;
        if (s10 != null) {
            return s10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f17193u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e L10;
        ActionMenuView actionMenuView = this.f17172a;
        return (actionMenuView == null || (L10 = actionMenuView.L()) == null || !L10.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f17194v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f17193u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f17177e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f17177e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f17172a.getMenu();
    }

    public View getNavButtonView() {
        return this.f17176d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f17176d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f17176d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f17164K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f17172a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f17182j;
    }

    public int getPopupTheme() {
        return this.f17183k;
    }

    public CharSequence getSubtitle() {
        return this.f17197y;
    }

    public final TextView getSubtitleTextView() {
        return this.f17175c;
    }

    public CharSequence getTitle() {
        return this.f17196x;
    }

    public int getTitleMarginBottom() {
        return this.f17191s;
    }

    public int getTitleMarginEnd() {
        return this.f17189q;
    }

    public int getTitleMarginStart() {
        return this.f17188p;
    }

    public int getTitleMarginTop() {
        return this.f17190r;
    }

    public final TextView getTitleTextView() {
        return this.f17173b;
    }

    public D getWrapper() {
        if (this.f17163J == null) {
            this.f17163J = new e0(this, true);
        }
        return this.f17163J;
    }

    public final void h() {
        if (this.f17192t == null) {
            this.f17192t = new S();
        }
    }

    public final void i() {
        if (this.f17177e == null) {
            this.f17177e = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f17172a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f17172a.getMenu();
            if (this.f17165L == null) {
                this.f17165L = new f();
            }
            this.f17172a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f17165L, this.f17182j);
            R();
        }
    }

    public final void k() {
        if (this.f17172a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f17172a = actionMenuView;
            actionMenuView.setPopupTheme(this.f17183k);
            this.f17172a.setOnMenuItemClickListener(this.f17162I);
            this.f17172a.M(this.f17166O, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f55919a = (this.f17186n & 112) | 8388613;
            this.f17172a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f17172a, false);
        }
    }

    public final void l() {
        if (this.f17176d == null) {
            this.f17176d = new C2057l(getContext(), null, AbstractC5335a.f54984Q);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f55919a = (this.f17186n & 112) | 8388611;
            this.f17176d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC5479a.C0806a ? new g((AbstractC5479a.C0806a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f17174b1);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f17156C = false;
        }
        if (!this.f17156C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f17156C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f17156C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0297 A[LOOP:0: B:40:0x0295->B:41:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ec A[LOOP:2: B:53:0x02ea->B:54:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int max;
        boolean P10;
        boolean P11;
        boolean z11;
        int i16;
        int i17;
        int paddingTop;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int size;
        int i23;
        int i24;
        int size2;
        int i25;
        int i26;
        int size3;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int A10 = AbstractC2082d0.A(this);
        int min = A10 >= 0 ? Math.min(A10, i13 - i11) : 0;
        if (!P(this.f17176d)) {
            i14 = paddingLeft;
        } else {
            if (z12) {
                i15 = D(this.f17176d, i27, iArr, min);
                i14 = paddingLeft;
                if (P(this.f17180h)) {
                    if (z12) {
                        i15 = D(this.f17180h, i15, iArr, min);
                    } else {
                        i14 = C(this.f17180h, i14, iArr, min);
                    }
                }
                if (P(this.f17172a)) {
                    if (z12) {
                        i14 = C(this.f17172a, i14, iArr, min);
                    } else {
                        i15 = D(this.f17172a, i15, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i14);
                iArr[1] = Math.max(0, currentContentInsetRight - (i27 - i15));
                max = Math.max(i14, currentContentInsetLeft);
                int min2 = Math.min(i15, i27 - currentContentInsetRight);
                if (P(this.f17181i)) {
                    if (z12) {
                        min2 = D(this.f17181i, min2, iArr, min);
                    } else {
                        max = C(this.f17181i, max, iArr, min);
                    }
                }
                if (P(this.f17177e)) {
                    if (z12) {
                        min2 = D(this.f17177e, min2, iArr, min);
                    } else {
                        max = C(this.f17177e, max, iArr, min);
                    }
                }
                P10 = P(this.f17173b);
                P11 = P(this.f17175c);
                if (P10) {
                    z11 = z12;
                    i16 = 0;
                } else {
                    g gVar = (g) this.f17173b.getLayoutParams();
                    z11 = z12;
                    i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f17173b.getMeasuredHeight();
                }
                if (!P11) {
                    g gVar2 = (g) this.f17175c.getLayoutParams();
                    i16 += ((ViewGroup.MarginLayoutParams) gVar2).topMargin + this.f17175c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                }
                if (!P10 || P11) {
                    TextView textView = !P10 ? this.f17173b : this.f17175c;
                    TextView textView2 = !P11 ? this.f17175c : this.f17173b;
                    g gVar3 = (g) textView.getLayoutParams();
                    g gVar4 = (g) textView2.getLayoutParams();
                    int i28 = i16;
                    boolean z13 = (!P10 && this.f17173b.getMeasuredWidth() > 0) || (P11 && this.f17175c.getMeasuredWidth() > 0);
                    i17 = this.f17195w & 112;
                    int i29 = max;
                    if (i17 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f17190r;
                    } else if (i17 != 80) {
                        int i30 = (((height - paddingTop2) - paddingBottom) - i28) / 2;
                        int i31 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin;
                        int i32 = this.f17190r;
                        if (i30 < i31 + i32) {
                            i30 = i31 + i32;
                        } else {
                            int i33 = (((height - paddingBottom) - i28) - i30) - paddingTop2;
                            int i34 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i35 = this.f17191s;
                            if (i33 < i34 + i35) {
                                i30 = Math.max(0, i30 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i35) - i33));
                            }
                        }
                        paddingTop = paddingTop2 + i30;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.f17191s) - i28;
                    }
                    if (z11) {
                        i18 = 0;
                        int i36 = (z13 ? this.f17188p : 0) - iArr[0];
                        max = i29 + Math.max(0, i36);
                        iArr[0] = Math.max(0, -i36);
                        if (P10) {
                            g gVar5 = (g) this.f17173b.getLayoutParams();
                            int measuredWidth = this.f17173b.getMeasuredWidth() + max;
                            int measuredHeight = this.f17173b.getMeasuredHeight() + paddingTop;
                            this.f17173b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i19 = measuredWidth + this.f17189q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i19 = max;
                        }
                        if (P11) {
                            int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f17175c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f17175c.getMeasuredWidth() + max;
                            this.f17175c.layout(max, i37, measuredWidth2, this.f17175c.getMeasuredHeight() + i37);
                            i20 = measuredWidth2 + this.f17189q;
                        } else {
                            i20 = max;
                        }
                        if (z13) {
                            max = Math.max(i19, i20);
                        }
                        b(this.f17157D, 3);
                        size = this.f17157D.size();
                        i23 = max;
                        for (i24 = i18; i24 < size; i24++) {
                            i23 = C((View) this.f17157D.get(i24), i23, iArr, min);
                        }
                        b(this.f17157D, 5);
                        size2 = this.f17157D.size();
                        for (i25 = i18; i25 < size2; i25++) {
                            min2 = D((View) this.f17157D.get(i25), min2, iArr, min);
                        }
                        b(this.f17157D, 1);
                        int u10 = u(this.f17157D, iArr);
                        i26 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (u10 / 2);
                        int i38 = u10 + i26;
                        if (i26 >= i23) {
                            i23 = i38 > min2 ? i26 - (i38 - min2) : i26;
                        }
                        size3 = this.f17157D.size();
                        while (i18 < size3) {
                            i23 = C((View) this.f17157D.get(i18), i23, iArr, min);
                            i18++;
                        }
                        this.f17157D.clear();
                        return;
                    }
                    int i39 = (z13 ? this.f17188p : 0) - iArr[1];
                    min2 -= Math.max(0, i39);
                    iArr[1] = Math.max(0, -i39);
                    if (P10) {
                        g gVar6 = (g) this.f17173b.getLayoutParams();
                        int measuredWidth3 = min2 - this.f17173b.getMeasuredWidth();
                        int measuredHeight2 = this.f17173b.getMeasuredHeight() + paddingTop;
                        this.f17173b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i21 = measuredWidth3 - this.f17189q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i21 = min2;
                    }
                    if (P11) {
                        int i40 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f17175c.getLayoutParams())).topMargin;
                        this.f17175c.layout(min2 - this.f17175c.getMeasuredWidth(), i40, min2, this.f17175c.getMeasuredHeight() + i40);
                        i22 = min2 - this.f17189q;
                    } else {
                        i22 = min2;
                    }
                    if (z13) {
                        min2 = Math.min(i21, i22);
                    }
                    max = i29;
                }
                i18 = 0;
                b(this.f17157D, 3);
                size = this.f17157D.size();
                i23 = max;
                while (i24 < size) {
                }
                b(this.f17157D, 5);
                size2 = this.f17157D.size();
                while (i25 < size2) {
                }
                b(this.f17157D, 1);
                int u102 = u(this.f17157D, iArr);
                i26 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (u102 / 2);
                int i382 = u102 + i26;
                if (i26 >= i23) {
                }
                size3 = this.f17157D.size();
                while (i18 < size3) {
                }
                this.f17157D.clear();
                return;
            }
            i14 = C(this.f17176d, paddingLeft, iArr, min);
        }
        i15 = i27;
        if (P(this.f17180h)) {
        }
        if (P(this.f17172a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i14);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - i15));
        max = Math.max(i14, currentContentInsetLeft2);
        int min22 = Math.min(i15, i27 - currentContentInsetRight2);
        if (P(this.f17181i)) {
        }
        if (P(this.f17177e)) {
        }
        P10 = P(this.f17173b);
        P11 = P(this.f17175c);
        if (P10) {
        }
        if (!P11) {
        }
        if (!P10) {
        }
        if (!P10) {
        }
        if (!P11) {
        }
        g gVar32 = (g) textView.getLayoutParams();
        g gVar42 = (g) textView2.getLayoutParams();
        int i282 = i16;
        if (P10) {
        }
        i17 = this.f17195w & 112;
        int i292 = max;
        if (i17 != 48) {
        }
        if (z11) {
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        int[] iArr2 = this.mTempMargins;
        boolean b10 = l0.b(this);
        int i19 = !b10 ? 1 : 0;
        if (P(this.f17176d)) {
            F(this.f17176d, i10, 0, i11, 0, this.f17187o);
            i12 = this.f17176d.getMeasuredWidth() + s(this.f17176d);
            i13 = Math.max(0, this.f17176d.getMeasuredHeight() + t(this.f17176d));
            i14 = View.combineMeasuredStates(0, this.f17176d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (P(this.f17180h)) {
            F(this.f17180h, i10, 0, i11, 0, this.f17187o);
            i12 = this.f17180h.getMeasuredWidth() + s(this.f17180h);
            i13 = Math.max(i13, this.f17180h.getMeasuredHeight() + t(this.f17180h));
            i14 = View.combineMeasuredStates(i14, this.f17180h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12);
        iArr2[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (P(this.f17172a)) {
            F(this.f17172a, i10, max, i11, 0, this.f17187o);
            i15 = this.f17172a.getMeasuredWidth() + s(this.f17172a);
            i13 = Math.max(i13, this.f17172a.getMeasuredHeight() + t(this.f17172a));
            i14 = View.combineMeasuredStates(i14, this.f17172a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr2[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f17181i)) {
            iArr = iArr2;
            max2 += E(this.f17181i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f17181i.getMeasuredHeight() + t(this.f17181i));
            i14 = View.combineMeasuredStates(i14, this.f17181i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f17177e)) {
            max2 += E(this.f17177e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f17177e.getMeasuredHeight() + t(this.f17177e));
            i14 = View.combineMeasuredStates(i14, this.f17177e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f17208b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                int max3 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
                i13 = max3;
            } else {
                max2 = max2;
            }
        }
        int i21 = max2;
        int i22 = this.f17190r + this.f17191s;
        int i23 = this.f17188p + this.f17189q;
        if (P(this.f17173b)) {
            E(this.f17173b, i10, i21 + i23, i11, i22, iArr);
            int measuredWidth = this.f17173b.getMeasuredWidth() + s(this.f17173b);
            int measuredHeight = this.f17173b.getMeasuredHeight() + t(this.f17173b);
            i16 = measuredWidth;
            i17 = View.combineMeasuredStates(i14, this.f17173b.getMeasuredState());
            i18 = measuredHeight;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (P(this.f17175c)) {
            i16 = Math.max(i16, E(this.f17175c, i10, i21 + i23, i11, i22 + i18, iArr));
            i18 += this.f17175c.getMeasuredHeight() + t(this.f17175c);
            i17 = View.combineMeasuredStates(i17, this.f17175c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i21 + i16 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i17), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i13, i18) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f17172a;
        androidx.appcompat.view.menu.e L10 = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = savedState.f17199c;
        if (i10 != 0 && this.f17165L != null && L10 != null && (findItem = L10.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f17200d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f17192t.f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f17165L;
        if (fVar != null && (gVar = fVar.f17206b) != null) {
            savedState.f17199c = gVar.getItemId();
        }
        savedState.f17200d = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17155B = false;
        }
        if (!this.f17155B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f17155B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f17155B = false;
        }
        return true;
    }

    public final int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int b10 = AbstractC2112t.b(i10, layoutDirection) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : layoutDirection == 1 ? 5 : 3;
    }

    public final int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(gVar.f55919a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f17195w & 112;
    }

    @Override // androidx.core.view.InterfaceC2120x
    public void removeMenuProvider(androidx.core.view.C c10) {
        this.f17159F.j(c10);
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f17171W != z10) {
            this.f17171W = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC5596a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f17168R = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f17194v) {
            this.f17194v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f17193u) {
            this.f17193u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC5596a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC5596a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f17176d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f17161H = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f17172a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f17183k != i10) {
            this.f17183k = i10;
            if (i10 == 0) {
                this.f17182j = getContext();
            } else {
                this.f17182j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f17191s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f17189q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f17188p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f17190r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    public boolean v() {
        f fVar = this.f17165L;
        return (fVar == null || fVar.f17206b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f17172a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator it = this.f17160G.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.f17158E.contains(view);
    }

    public static class g extends AbstractC5479a.C0806a {

        /* renamed from: b, reason: collision with root package name */
        public int f17208b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17208b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f17208b = 0;
            this.f55919a = 8388627;
        }

        public g(int i10, int i11, int i12) {
            super(i10, i11);
            this.f17208b = 0;
            this.f55919a = i12;
        }

        public g(g gVar) {
            super((AbstractC5479a.C0806a) gVar);
            this.f17208b = 0;
            this.f17208b = gVar.f17208b;
        }

        public g(AbstractC5479a.C0806a c0806a) {
            super(c0806a);
            this.f17208b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17208b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17208b = 0;
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54985R);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f17180h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f17180h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f17180h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f17178f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f17177e)) {
                c(this.f17177e, true);
            }
        } else {
            ImageView imageView = this.f17177e;
            if (imageView != null && z(imageView)) {
                removeView(this.f17177e);
                this.f17158E.remove(this.f17177e);
            }
        }
        ImageView imageView2 = this.f17177e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f17177e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f17176d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            f0.a(this.f17176d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f17176d)) {
                c(this.f17176d, true);
            }
        } else {
            ImageButton imageButton = this.f17176d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f17176d);
                this.f17158E.remove(this.f17176d);
            }
        }
        ImageButton imageButton2 = this.f17176d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f17175c;
            if (textView != null && z(textView)) {
                removeView(this.f17175c);
                this.f17158E.remove(this.f17175c);
            }
        } else {
            if (this.f17175c == null) {
                Context context = getContext();
                C2068x c2068x = new C2068x(context);
                this.f17175c = c2068x;
                c2068x.setSingleLine();
                this.f17175c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f17185m;
                if (i10 != 0) {
                    this.f17175c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f17154A;
                if (colorStateList != null) {
                    this.f17175c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f17175c)) {
                c(this.f17175c, true);
            }
        }
        TextView textView2 = this.f17175c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f17197y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f17154A = colorStateList;
        TextView textView = this.f17175c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f17173b;
            if (textView != null && z(textView)) {
                removeView(this.f17173b);
                this.f17158E.remove(this.f17173b);
            }
        } else {
            if (this.f17173b == null) {
                Context context = getContext();
                C2068x c2068x = new C2068x(context);
                this.f17173b = c2068x;
                c2068x.setSingleLine();
                this.f17173b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f17184l;
                if (i10 != 0) {
                    this.f17173b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f17198z;
                if (colorStateList != null) {
                    this.f17173b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f17173b)) {
                c(this.f17173b, true);
            }
        }
        TextView textView2 = this.f17173b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f17196x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f17198z = colorStateList;
        TextView textView = this.f17173b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f17199c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17200d;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17199c = parcel.readInt();
            this.f17200d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f17199c);
            parcel.writeInt(this.f17200d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17195w = 8388627;
        this.f17157D = new ArrayList();
        this.f17158E = new ArrayList();
        this.mTempMargins = new int[2];
        this.f17159F = new androidx.core.view.A(new Runnable() { // from class: androidx.appcompat.widget.c0
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.f17160G = new ArrayList();
        this.f17162I = new a();
        this.f17174b1 = new b();
        a0 v10 = a0.v(getContext(), attributeSet, l.j.Toolbar, i10, 0);
        AbstractC2082d0.j0(this, context, l.j.Toolbar, attributeSet, v10.r(), i10, 0);
        this.f17184l = v10.n(l.j.f55304g3, 0);
        this.f17185m = v10.n(l.j.f55261X2, 0);
        this.f17195w = v10.l(l.j.f55189F2, this.f17195w);
        this.f17186n = v10.l(l.j.f55193G2, 48);
        int e10 = v10.e(l.j.f55274a3, 0);
        e10 = v10.s(l.j.f55299f3) ? v10.e(l.j.f55299f3, e10) : e10;
        this.f17191s = e10;
        this.f17190r = e10;
        this.f17189q = e10;
        this.f17188p = e10;
        int e11 = v10.e(l.j.f55289d3, -1);
        if (e11 >= 0) {
            this.f17188p = e11;
        }
        int e12 = v10.e(l.j.f55284c3, -1);
        if (e12 >= 0) {
            this.f17189q = e12;
        }
        int e13 = v10.e(l.j.f55294e3, -1);
        if (e13 >= 0) {
            this.f17190r = e13;
        }
        int e14 = v10.e(l.j.f55279b3, -1);
        if (e14 >= 0) {
            this.f17191s = e14;
        }
        this.f17187o = v10.f(l.j.f55237R2, -1);
        int e15 = v10.e(l.j.f55221N2, Integer.MIN_VALUE);
        int e16 = v10.e(l.j.f55205J2, Integer.MIN_VALUE);
        int f10 = v10.f(l.j.f55213L2, 0);
        int f11 = v10.f(l.j.f55217M2, 0);
        h();
        this.f17192t.e(f10, f11);
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            this.f17192t.g(e15, e16);
        }
        this.f17193u = v10.e(l.j.f55225O2, Integer.MIN_VALUE);
        this.f17194v = v10.e(l.j.f55209K2, Integer.MIN_VALUE);
        this.f17178f = v10.g(l.j.f55201I2);
        this.f17179g = v10.p(l.j.f55197H2);
        CharSequence p10 = v10.p(l.j.f55269Z2);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(l.j.f55257W2);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f17182j = getContext();
        setPopupTheme(v10.n(l.j.f55253V2, 0));
        Drawable g10 = v10.g(l.j.f55249U2);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(l.j.f55245T2);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(l.j.f55229P2);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(l.j.f55233Q2);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        if (v10.s(l.j.f55309h3)) {
            setTitleTextColor(v10.c(l.j.f55309h3));
        }
        if (v10.s(l.j.f55265Y2)) {
            setSubtitleTextColor(v10.c(l.j.f55265Y2));
        }
        if (v10.s(l.j.f55241S2)) {
            x(v10.n(l.j.f55241S2, 0));
        }
        v10.x();
    }
}
