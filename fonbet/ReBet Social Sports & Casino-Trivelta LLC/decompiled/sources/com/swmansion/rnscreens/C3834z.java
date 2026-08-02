package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2094j0;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.n;
import com.orkestapay.orkestapay.core.clicktopay.WebviewActivity;
import com.swmansion.rnscreens.C;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.swmansion.rnscreens.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3834z extends AbstractC3816g implements C.a, Oc.a {

    /* renamed from: I, reason: collision with root package name */
    public static final b f42073I = new b(null);

    /* renamed from: A, reason: collision with root package name */
    public boolean f42074A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f42075B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f42076C;

    /* renamed from: D, reason: collision with root package name */
    public E f42077D;

    /* renamed from: E, reason: collision with root package name */
    public String f42078E;

    /* renamed from: F, reason: collision with root package name */
    public Boolean f42079F;

    /* renamed from: G, reason: collision with root package name */
    public Boolean f42080G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f42081H;

    /* renamed from: e, reason: collision with root package name */
    public final ThemedReactContext f42082e;

    /* renamed from: f, reason: collision with root package name */
    public H f42083f;

    /* renamed from: g, reason: collision with root package name */
    public B f42084g;

    /* renamed from: h, reason: collision with root package name */
    public a f42085h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f42086i;

    /* renamed from: j, reason: collision with root package name */
    public e f42087j;

    /* renamed from: k, reason: collision with root package name */
    public c f42088k;

    /* renamed from: l, reason: collision with root package name */
    public d f42089l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42090m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f42091n;

    /* renamed from: o, reason: collision with root package name */
    public String f42092o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f42093p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f42094q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f42095r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f42096s;

    /* renamed from: t, reason: collision with root package name */
    public float f42097t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f42098u;

    /* renamed from: v, reason: collision with root package name */
    public Lc.o f42099v;

    /* renamed from: w, reason: collision with root package name */
    public int f42100w;

    /* renamed from: x, reason: collision with root package name */
    public int f42101x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f42102y;

    /* renamed from: z, reason: collision with root package name */
    public float f42103z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.swmansion.rnscreens.z$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f42104a = new a("INACTIVE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f42105b = new a("TRANSITIONING_OR_BELOW_TOP", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f42106c = new a("ON_TOP", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f42107d;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f42107d = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f42104a, f42105b, f42106c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: com.swmansion.rnscreens.z$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.swmansion.rnscreens.z$c */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final c f42108a = new c("PUSH", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f42109b = new c("POP", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f42110c;

        static {
            c[] a10 = a();
            $VALUES = a10;
            f42110c = EnumEntriesKt.enumEntries(a10);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f42108a, f42109b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.swmansion.rnscreens.z$d */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final d f42111a = new d("DEFAULT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f42112b = new d("NONE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f42113c = new d("FADE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f42114d = new d("SLIDE_FROM_BOTTOM", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final d f42115e = new d("SLIDE_FROM_RIGHT", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final d f42116f = new d("SLIDE_FROM_LEFT", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final d f42117g = new d("FADE_FROM_BOTTOM", 6);

        /* renamed from: h, reason: collision with root package name */
        public static final d f42118h = new d("IOS_FROM_RIGHT", 7);

        /* renamed from: i, reason: collision with root package name */
        public static final d f42119i = new d("IOS_FROM_LEFT", 8);

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f42120j;

        static {
            d[] a10 = a();
            $VALUES = a10;
            f42120j = EnumEntriesKt.enumEntries(a10);
        }

        public d(String str, int i10) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{f42111a, f42112b, f42113c, f42114d, f42115e, f42116f, f42117g, f42118h, f42119i};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.swmansion.rnscreens.z$e */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final e f42121a = new e("PUSH", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f42122b = new e("MODAL", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f42123c = new e("TRANSPARENT_MODAL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final e f42124d = new e("FORM_SHEET", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f42125e;

        static {
            e[] a10 = a();
            $VALUES = a10;
            f42125e = EnumEntriesKt.enumEntries(a10);
        }

        public e(String str, int i10) {
        }

        public static final /* synthetic */ e[] a() {
            return new e[]{f42121a, f42122b, f42123c, f42124d};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* renamed from: com.swmansion.rnscreens.z$f */
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f42123c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f42124d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.swmansion.rnscreens.z$g */
    public static final class g {
        private static final /* synthetic */ g[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final g f42126a = new g("ORIENTATION", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final g f42127b = new g(WebviewActivity.STYLE, 1);

        /* renamed from: c, reason: collision with root package name */
        public static final g f42128c = new g("HIDDEN", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final g f42129d = new g("ANIMATED", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final g f42130e = new g("NAVIGATION_BAR_HIDDEN", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f42131f;

        static {
            g[] a10 = a();
            $VALUES = a10;
            f42131f = EnumEntriesKt.enumEntries(a10);
        }

        public g(String str, int i10) {
        }

        public static final /* synthetic */ g[] a() {
            return new g[]{f42126a, f42127b, f42128c, f42129d, f42130e};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3834z(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f42082e = reactContext;
        this.f42087j = e.f42121a;
        this.f42088k = c.f42109b;
        this.f42089l = d.f42111a;
        this.f42090m = true;
        this.f42098u = true;
        this.f42099v = new Lc.o(CollectionsKt.listOf(Double.valueOf(1.0d)));
        this.f42100w = -1;
        this.f42102y = true;
        this.f42103z = 24.0f;
        this.f42075B = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f42081H = true;
    }

    public static final void I(BottomSheetBehavior bottomSheetBehavior, int i10, C3834z c3834z) {
        Lc.a.d(bottomSheetBehavior, Integer.valueOf(i10), null, 2, null);
        c3834z.layout(c3834z.getLeft(), c3834z.getBottom() - i10, c3834z.getRight(), c3834z.getBottom());
    }

    public static final void J(C3834z c3834z) {
        c3834z.getParent().requestLayout();
        c3834z.y();
    }

    public static final void K(BottomSheetBehavior bottomSheetBehavior, int i10) {
        Lc.a.d(bottomSheetBehavior, Integer.valueOf(i10), null, 2, null);
    }

    public static final void L(C3834z c3834z, int i10, float f10) {
        c3834z.layout(c3834z.getLeft(), c3834z.getBottom() - i10, c3834z.getRight(), c3834z.getBottom());
        c3834z.setTranslationY(f10);
        c3834z.getParent().requestLayout();
        c3834z.y();
    }

    public final void A() {
        if (this.f42074A) {
            return;
        }
        this.f42076C = true;
    }

    public final int B(int i10, float f10) {
        Y a10;
        SheetDelegate sheetDelegate;
        Integer P10;
        Fragment fragment = getFragment();
        return (fragment == null || (a10 = Nc.a.a(fragment)) == null || (sheetDelegate = a10.getSheetDelegate()) == null || (P10 = sheetDelegate.P()) == null) ? i10 : RangesKt.coerceAtMost(i10, (int) (P10.intValue() + f10));
    }

    public final void C(BottomSheetBehavior bottomSheetBehavior, int i10) {
        Lc.a.f(bottomSheetBehavior, Integer.valueOf(i10), false, null, 6, null);
        requestLayout();
    }

    public final void D() {
        if (this.f42094q) {
            return;
        }
        this.f42094q = true;
        E(this);
    }

    public final void E(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((viewGroup instanceof SwipeRefreshLayout) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i10);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof b0) {
                    E(((b0) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    E((ViewGroup) childAt);
                }
            }
        }
    }

    public final void F() {
        if (this.f42076C) {
            this.f42076C = false;
            Fragment fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }

    public final void G(int i10, int i11, int i12) {
        b(i10, i11, i12);
    }

    public final void H(final BottomSheetBehavior bottomSheetBehavior, int i10, int i11) {
        final float translationY = getTranslationY();
        int B10 = B(i10, translationY);
        final int B11 = B(i11, translationY);
        float f10 = B11 - B10;
        if (f10 == 0.0f) {
            return;
        }
        if (f10 > 0.0f) {
            setTranslationY(getTranslationY() + f10);
            animate().translationY(translationY).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.v
                @Override // java.lang.Runnable
                public final void run() {
                    C3834z.I(BottomSheetBehavior.this, B11, this);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.w
                @Override // java.lang.Runnable
                public final void run() {
                    C3834z.J(C3834z.this);
                }
            }).start();
        } else {
            animate().translationY(translationY - f10).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.x
                @Override // java.lang.Runnable
                public final void run() {
                    C3834z.K(BottomSheetBehavior.this, B11);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.y
                @Override // java.lang.Runnable
                public final void run() {
                    C3834z.L(C3834z.this, B11, translationY);
                }
            }).start();
        }
    }

    public final void M(BottomSheetBehavior bottomSheetBehavior, int i10) {
        int B10 = B(i10, getTranslationY());
        Lc.a.d(bottomSheetBehavior, Integer.valueOf(B10), null, 2, null);
        layout(getLeft(), getBottom() - B10, getRight(), getBottom());
        getParent().requestLayout();
        G(getWidth(), B10, getTop() + ((int) getTranslationY()));
    }

    @Override // com.swmansion.rnscreens.C.a
    public void a(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        BottomSheetBehavior<C3834z> sheetBehavior = getSheetBehavior();
        if (Lc.q.e(this) && Lc.q.b(this) && sheetBehavior != null) {
            int a10 = Lc.a.a(sheetBehavior);
            boolean z11 = a10 == 0;
            if (a10 != i14) {
                if (z11) {
                    C(sheetBehavior, i14);
                } else if (this.f42075B) {
                    H(sheetBehavior, a10, i14);
                } else {
                    M(sheetBehavior, i14);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public final void g(int i10) {
        C3813d toolbar;
        setImportantForAccessibility(i10);
        b0 headerConfig = getHeaderConfig();
        if (headerConfig == null || (toolbar = headerConfig.getToolbar()) == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i10);
    }

    @Nullable
    public final a getActivityState() {
        return this.f42085h;
    }

    @Override // Oc.a
    @Nullable
    public Fragment getAssociatedFragment() {
        return getFragment();
    }

    @Nullable
    public final B getContainer() {
        return this.f42084g;
    }

    @Nullable
    public final C getContentWrapper() {
        Object obj;
        Iterator it = AbstractC2094j0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj) instanceof C) {
                break;
            }
        }
        if (obj instanceof C) {
            return (C) obj;
        }
        return null;
    }

    @Nullable
    public final E getFooter() {
        return this.f42077D;
    }

    @Nullable
    public final Fragment getFragment() {
        H h10 = this.f42083f;
        if (h10 != null) {
            return h10.o();
        }
        return null;
    }

    @Nullable
    public final H getFragmentWrapper() {
        return this.f42083f;
    }

    @Nullable
    public final b0 getHeaderConfig() {
        Object obj;
        Iterator it = AbstractC2094j0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj) instanceof b0) {
                break;
            }
        }
        if (obj instanceof b0) {
            return (b0) obj;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f42081H;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.f42082e;
    }

    @Nullable
    public final EventDispatcher getReactEventDispatcher() {
        return UIManagerHelper.getEventDispatcherForReactTag(this.f42082e, getId());
    }

    @NotNull
    public final c getReplaceAnimation() {
        return this.f42088k;
    }

    @Nullable
    public final String getScreenId() {
        return this.f42092o;
    }

    @Nullable
    public final Integer getScreenOrientation() {
        return this.f42091n;
    }

    @Nullable
    public final BottomSheetBehavior<C3834z> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c f10 = fVar != null ? fVar.f() : null;
        if (f10 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f10;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.f42102y;
    }

    public final float getSheetCornerRadius() {
        return this.f42097t;
    }

    public final boolean getSheetDefaultResizeAnimationEnabled() {
        return this.f42075B;
    }

    @NotNull
    public final Lc.o getSheetDetents() {
        return this.f42099v;
    }

    public final float getSheetElevation() {
        return this.f42103z;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.f42098u;
    }

    public final int getSheetInitialDetentIndex() {
        return this.f42101x;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.f42100w;
    }

    public final boolean getSheetShouldOverflowTopInset() {
        return this.f42074A;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.f42076C;
    }

    @NotNull
    public final d getStackAnimation() {
        return this.f42089l;
    }

    @NotNull
    public final e getStackPresentation() {
        return this.f42087j;
    }

    @Nullable
    public final String getStatusBarStyle() {
        return this.f42078E;
    }

    public final void h(int i10, int i11) {
        C3813d toolbar;
        C3813d toolbar2;
        setFocusable(i10);
        b0 headerConfig = getHeaderConfig();
        if (headerConfig != null && (toolbar2 = headerConfig.getToolbar()) != null) {
            toolbar2.setFocusable(i10);
        }
        setDescendantFocusability(i11);
        b0 headerConfig2 = getHeaderConfig();
        if (headerConfig2 == null || (toolbar = headerConfig2.getToolbar()) == null) {
            return;
        }
        toolbar.setDescendantFocusability(i11);
    }

    public final void i(boolean z10, int i10) {
        C3813d toolbar;
        C3813d toolbar2;
        setFocusable(z10);
        b0 headerConfig = getHeaderConfig();
        if (headerConfig != null && (toolbar2 = headerConfig.getToolbar()) != null) {
            toolbar2.setFocusable(z10);
        }
        setDescendantFocusability(i10);
        b0 headerConfig2 = getHeaderConfig();
        if (headerConfig2 == null || (toolbar = headerConfig2.getToolbar()) == null) {
            return;
        }
        toolbar.setDescendantFocusability(i10);
    }

    public final void j(int i10, boolean z10) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.f42082e);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new Mc.s(surfaceId, getId(), i10, z10));
        }
    }

    public final void k() {
        if (this.f42094q) {
            this.f42094q = false;
            l(this);
        }
    }

    public final void l(ViewGroup viewGroup) {
        for (View view : AbstractC2094j0.a(viewGroup)) {
            viewGroup.endViewTransition(view);
            if (view instanceof b0) {
                l(((b0) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                l((ViewGroup) view);
            }
        }
    }

    public final boolean m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return this.f42094q;
    }

    public final boolean o() {
        return this.f42084g instanceof T;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Fragment fragment;
        Y a10;
        SheetDelegate sheetDelegate;
        super.onAttachedToWindow();
        if (!Lc.q.e(this) || (fragment = getFragment()) == null || (a10 = Nc.a.a(fragment)) == null || (sheetDelegate = a10.getSheetDelegate()) == null) {
            return;
        }
        C3819j.f41972a.a(sheetDelegate);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10 && o() && !Lc.q.e(this)) {
            G(i12 - i10, i13 - i11, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (Lc.q.e(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final Boolean p() {
        return this.f42080G;
    }

    public final Boolean q() {
        return this.f42093p;
    }

    public final Boolean r() {
        return this.f42079F;
    }

    public final boolean s() {
        int i10 = f.$EnumSwitchMapping$0[this.f42087j.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public final void setActivityState(@NotNull a activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        a aVar = this.f42085h;
        if (activityState == aVar) {
            return;
        }
        if ((this.f42084g instanceof T) && aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (activityState.compareTo(aVar) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.f42085h = activityState;
        B b10 = this.f42084g;
        if (b10 != null) {
            b10.r();
        }
    }

    public final void setBeingRemoved(boolean z10) {
        this.f42094q = z10;
    }

    public final void setContainer(@Nullable B b10) {
        this.f42084g = b10;
    }

    public final void setFooter(@Nullable E e10) {
        BottomSheetBehavior<C3834z> sheetBehavior;
        if (e10 == null && this.f42077D != null) {
            BottomSheetBehavior<C3834z> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                E e11 = this.f42077D;
                Intrinsics.checkNotNull(e11);
                e11.H(sheetBehavior2);
            }
        } else if (e10 != null && (sheetBehavior = getSheetBehavior()) != null) {
            e10.C(sheetBehavior);
        }
        this.f42077D = e10;
    }

    public final void setFragmentWrapper(@Nullable H h10) {
        this.f42083f = h10;
    }

    public final void setGestureEnabled(boolean z10) {
        this.f42090m = z10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z10) {
        this.f42081H = z10;
    }

    public final void setNavigationBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            g0.f41803a.c();
        }
        this.f42080G = bool;
        H h10 = this.f42083f;
        if (h10 != null) {
            g0.f41803a.l(this, h10.m());
        }
    }

    public final void setReplaceAnimation(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f42088k = cVar;
    }

    public final void setScreenId(@Nullable String str) {
        this.f42092o = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setScreenOrientation(@Nullable String str) {
        int i10;
        if (str == null) {
            this.f42091n = null;
            return;
        }
        g0 g0Var = g0.f41803a;
        g0Var.d();
        switch (str.hashCode()) {
            case -1894896954:
                if (str.equals("portrait_down")) {
                    i10 = 9;
                    break;
                }
                i10 = -1;
                break;
            case 96673:
                if (str.equals("all")) {
                    i10 = 10;
                    break;
                }
                i10 = -1;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    i10 = 7;
                    break;
                }
                i10 = -1;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    i10 = 6;
                    break;
                }
                i10 = -1;
                break;
            case 1651658175:
                if (str.equals("portrait_up")) {
                    i10 = 1;
                    break;
                }
                i10 = -1;
                break;
            case 1730732811:
                if (str.equals("landscape_left")) {
                    i10 = 8;
                    break;
                }
                i10 = -1;
                break;
            case 2118770584:
                if (str.equals("landscape_right")) {
                    i10 = 0;
                    break;
                }
                i10 = -1;
                break;
            default:
                i10 = -1;
                break;
        }
        this.f42091n = Integer.valueOf(i10);
        H h10 = this.f42083f;
        if (h10 != null) {
            g0Var.m(this, h10.m());
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z10) {
        this.f42102y = z10;
    }

    public final void setSheetCornerRadius(float f10) {
        if (this.f42097t == f10) {
            return;
        }
        this.f42097t = f10;
        this.f42096s = true;
    }

    public final void setSheetDefaultResizeAnimationEnabled(boolean z10) {
        this.f42075B = z10;
    }

    public final void setSheetDetents(@NotNull Lc.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        this.f42099v = oVar;
    }

    public final void setSheetElevation(float f10) {
        this.f42103z = f10;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z10) {
        this.f42098u = z10;
    }

    public final void setSheetGrabberVisible(boolean z10) {
        this.f42095r = z10;
    }

    public final void setSheetInitialDetentIndex(int i10) {
        this.f42101x = i10;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i10) {
        this.f42100w = i10;
    }

    public final void setSheetShouldOverflowTopInset(boolean z10) {
        this.f42074A = z10;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z10) {
        this.f42076C = z10;
    }

    public final void setStackAnimation(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f42089l = dVar;
    }

    public final void setStackPresentation(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f42087j = eVar;
    }

    public final void setStatusBarAnimated(@Nullable Boolean bool) {
        this.f42093p = bool;
    }

    public final void setStatusBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            g0.f41803a.e();
        }
        this.f42079F = bool;
        H h10 = this.f42083f;
        if (h10 != null) {
            g0.f41803a.k(this, h10.m());
        }
    }

    public final void setStatusBarStyle(@Nullable String str) {
        if (str != null) {
            g0.f41803a.e();
        }
        this.f42078E = str;
        H h10 = this.f42083f;
        if (h10 != null) {
            g0.f41803a.o(this, h10.m(), h10.R());
        }
    }

    public final void setTransitioning(boolean z10) {
        if (this.f42086i == z10) {
            return;
        }
        this.f42086i = z10;
        boolean m10 = m(this);
        if (!m10 || getLayerType() == 2) {
            super.setLayerType((!z10 || m10) ? 0 : 2, null);
        }
    }

    public final void t(int i10) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new Mc.d(surfaceId, getId(), PixelUtil.toDIPFromPixel(i10)));
        }
    }

    public final void u(boolean z10) {
        if (Lc.q.e(this) && o()) {
            if (Lc.q.b(this)) {
                requestLayout();
            }
            if (z10) {
                G(getWidth(), getHeight(), getTop());
            }
            E e10 = this.f42077D;
            if (e10 != null) {
                int left = getLeft();
                int top = getTop();
                int right = getRight();
                int bottom = getBottom();
                B b10 = this.f42084g;
                Intrinsics.checkNotNull(b10);
                e10.B(z10, left, top, right, bottom, b10.getHeight());
            }
        }
    }

    public final void v() {
        if (this.f42096s) {
            this.f42096s = false;
            w();
        }
    }

    public final void w() {
        if (this.f42087j != e.f42124d || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        com.google.android.material.shape.i iVar = background instanceof com.google.android.material.shape.i ? (com.google.android.material.shape.i) background : null;
        if (iVar != null) {
            float max = Math.max(PixelUtil.toDIPFromPixel(this.f42097t), 0.0f);
            n.b bVar = new n.b();
            bVar.B(0, max);
            bVar.G(0, max);
            iVar.setShapeAppearanceModel(bVar.m());
        }
    }

    public final void x(int i10, boolean z10) {
        j(i10, z10);
        if (z10) {
            y();
        }
        B b10 = this.f42084g;
        if (!(b10 == null ? true : b10 instanceof T)) {
            throw new IllegalStateException("[RNScreens] Expected native stack screen.");
        }
        T t10 = (T) b10;
        if (t10 != null) {
            t10.g0();
        }
    }

    public final void y() {
        G(getWidth(), getHeight(), getTop() + ((int) getTranslationY()));
    }

    public final void z(C wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }
}
