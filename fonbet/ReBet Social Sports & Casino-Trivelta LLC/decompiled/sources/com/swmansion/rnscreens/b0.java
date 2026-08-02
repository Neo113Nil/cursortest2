package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.rnscreens.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class b0 extends AbstractC3814e implements ReactPointerEventsView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(b0.class, "consumeTopInset", "getConsumeTopInset()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(b0.class, "legacyTopInsetBehavior", "getLegacyTopInsetBehavior()Z", 0))};

    /* renamed from: G, reason: collision with root package name */
    public static final a f41710G = new a(null);

    /* renamed from: A, reason: collision with root package name */
    public boolean f41711A;

    /* renamed from: B, reason: collision with root package name */
    public final int f41712B;

    /* renamed from: C, reason: collision with root package name */
    public final int f41713C;

    /* renamed from: D, reason: collision with root package name */
    public final View.OnClickListener f41714D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f41715E;

    /* renamed from: F, reason: collision with root package name */
    public final c0 f41716F;

    /* renamed from: g, reason: collision with root package name */
    public final ReactPointerEventsView f41717g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f41718h;

    /* renamed from: i, reason: collision with root package name */
    public final C3813d f41719i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41720j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41721k;

    /* renamed from: l, reason: collision with root package name */
    public final ReadWriteProperty f41722l;

    /* renamed from: m, reason: collision with root package name */
    public final ReadWriteProperty f41723m;

    /* renamed from: n, reason: collision with root package name */
    public String f41724n;

    /* renamed from: o, reason: collision with root package name */
    public int f41725o;

    /* renamed from: p, reason: collision with root package name */
    public String f41726p;

    /* renamed from: q, reason: collision with root package name */
    public String f41727q;

    /* renamed from: r, reason: collision with root package name */
    public float f41728r;

    /* renamed from: s, reason: collision with root package name */
    public int f41729s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f41730t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41731u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41732v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41733w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC5479a f41734x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f41735y;

    /* renamed from: z, reason: collision with root package name */
    public int f41736z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView a(Toolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d0.a.values().length];
            try {
                iArr[d0.a.f41777a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.a.f41779c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.a.f41778b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f41737a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, b0 b0Var) {
            super(obj);
            this.f41737a = b0Var;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue() || !this.f41737a.f41711A) {
                return;
            }
            this.f41737a.getToolbar().requestApplyInsets();
        }
    }

    public static final class d extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f41738a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, b0 b0Var) {
            super(obj);
            this.f41738a = b0Var;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue() || !this.f41738a.f41711A) {
                return;
            }
            this.f41738a.getToolbar().requestApplyInsets();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, ReactPointerEventsView pointerEventsImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        this.f41717g = pointerEventsImpl;
        this.f41718h = new ArrayList(3);
        Delegates delegates = Delegates.INSTANCE;
        Boolean bool = Boolean.FALSE;
        this.f41722l = new c(bool, this);
        this.f41723m = new d(bool, this);
        this.f41714D = new View.OnClickListener() { // from class: com.swmansion.rnscreens.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.f(b0.this, view);
            }
        };
        this.f41716F = new c0();
        setVisibility(8);
        C3813d c3813d = new C3813d(context, this);
        this.f41719i = c3813d;
        this.f41712B = c3813d.getContentInsetStart();
        this.f41713C = c3813d.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            c3813d.setBackgroundColor(typedValue.data);
        }
        c3813d.setClipChildren(false);
    }

    public static final void f(b0 b0Var, View view) {
        Y screenFragment = b0Var.getScreenFragment();
        if (screenFragment != null) {
            T screenStack = b0Var.getScreenStack();
            if (screenStack == null || !Intrinsics.areEqual(screenStack.getRootScreen(), screenFragment.b())) {
                if (screenFragment.b().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.G0();
                    return;
                } else {
                    screenFragment.f0();
                    return;
                }
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof Y) {
                Y y10 = (Y) parentFragment;
                if (y10.b().getNativeBackButtonDismissalEnabled()) {
                    y10.G0();
                } else {
                    y10.f0();
                }
            }
        }
    }

    private final C3834z getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C3834z) {
            return (C3834z) parent;
        }
        return null;
    }

    private final T getScreenStack() {
        C3834z screen = getScreen();
        B container = screen != null ? screen.getContainer() : null;
        if (container instanceof T) {
            return (T) container;
        }
        return null;
    }

    public final void e(d0 child, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f41718h.add(i10, child);
        k();
    }

    public final void g(AbstractActivityC5481c abstractActivityC5481c) {
        AbstractC5479a abstractC5479a = this.f41734x;
        if (abstractC5479a != null && abstractActivityC5481c != null && abstractActivityC5481c.getSupportActionBar() == abstractC5479a) {
            abstractActivityC5481c.setSupportActionBar(null);
        }
        this.f41734x = null;
    }

    public final int getConfigSubviewsCount() {
        return this.f41718h.size();
    }

    public final boolean getConsumeTopInset() {
        return ((Boolean) this.f41722l.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @NotNull
    public final c0 getHeaderHeightUpdateProxy() {
        return this.f41716F;
    }

    public final boolean getLegacyTopInsetBehavior() {
        return ((Boolean) this.f41723m.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return this.f41717g.getPointerEvents();
    }

    public final int getPreferredContentInsetEnd() {
        return this.f41712B;
    }

    public final int getPreferredContentInsetStart() {
        return this.f41712B;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.f41715E) {
            return 0;
        }
        return this.f41713C;
    }

    @Nullable
    public final Y getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof C3834z)) {
            return null;
        }
        Fragment fragment = ((C3834z) parent).getFragment();
        if (fragment instanceof Y) {
            return (Y) fragment;
        }
        return null;
    }

    @NotNull
    public final C3813d getToolbar() {
        return this.f41719i;
    }

    public final void h() {
        this.f41733w = true;
    }

    public final d0 i(int i10) {
        Object obj = this.f41718h.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (d0) obj;
    }

    public final boolean j() {
        return this.f41720j;
    }

    public final void k() {
        C3834z screen;
        if (getParent() == null || this.f41733w || (screen = getScreen()) == null || screen.n()) {
            return;
        }
        m();
    }

    public final void l(Toolbar toolbar, boolean z10) {
        Object obj;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (z10) {
            int currentContentInsetStart = toolbar.getNavigationIcon() != null ? toolbar.getCurrentContentInsetStart() + toolbar.getPaddingStart() : Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            Iterator it = this.f41718h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((d0) obj).getType() == d0.a.f41777a) {
                        break;
                    }
                }
            }
            d0 d0Var = (d0) obj;
            if (d0Var != null) {
                currentContentInsetStart = d0Var.getLeft();
            }
            int currentContentInsetEnd = toolbar.getCurrentContentInsetEnd() + toolbar.getPaddingEnd();
            this.f41716F.a(this, getScreen());
            a(toolbar.getWidth(), toolbar.getHeight(), currentContentInsetStart, currentContentInsetEnd);
        }
    }

    public final void m() {
        Drawable navigationIcon;
        Y screenFragment;
        Y screenFragment2;
        ReactContext R10;
        T screenStack = getScreenStack();
        boolean z10 = screenStack == null || Intrinsics.areEqual(screenStack.getTopScreen(), getParent());
        if (this.f41711A && z10 && !this.f41733w) {
            Y screenFragment3 = getScreenFragment();
            AbstractActivityC5481c abstractActivityC5481c = (AbstractActivityC5481c) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (abstractActivityC5481c == null) {
                return;
            }
            String str = this.f41727q;
            if (str != null) {
                if (Intrinsics.areEqual(str, "rtl")) {
                    this.f41719i.setLayoutDirection(1);
                } else if (Intrinsics.areEqual(this.f41727q, "ltr")) {
                    this.f41719i.setLayoutDirection(0);
                }
            }
            C3834z screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    R10 = (ReactContext) context;
                } else {
                    H fragmentWrapper = screen.getFragmentWrapper();
                    R10 = fragmentWrapper != null ? fragmentWrapper.R() : null;
                }
                g0.f41803a.p(screen, abstractActivityC5481c, R10);
            }
            if (this.f41720j) {
                if (this.f41719i.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.P0();
                }
                this.f41716F.a(this, getScreen());
                return;
            }
            if (this.f41719i.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.W0(this.f41719i);
            }
            abstractActivityC5481c.setSupportActionBar(this.f41719i);
            AbstractC5479a supportActionBar = abstractActivityC5481c.getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.f41734x = supportActionBar;
            Y screenFragment4 = getScreenFragment();
            supportActionBar.t((screenFragment4 == null || !screenFragment4.C0() || this.f41731u) ? false : true);
            supportActionBar.D(this.f41724n);
            if (TextUtils.isEmpty(this.f41724n)) {
                this.f41715E = true;
            }
            this.f41719i.Y();
            this.f41719i.setNavigationOnClickListener(this.f41714D);
            Y screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.X0(this.f41732v);
            }
            Y screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.Y0(this.f41721k);
            }
            TextView a10 = f41710G.a(this.f41719i);
            int i10 = this.f41725o;
            if (i10 != 0) {
                this.f41719i.setTitleTextColor(i10);
            }
            if (a10 != null) {
                String str2 = this.f41726p;
                if (str2 != null || this.f41729s > 0) {
                    int i11 = this.f41729s;
                    AssetManager assets = getContext().getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    a10.setTypeface(ReactTypefaceUtils.applyStyles(null, 0, i11, str2, assets));
                }
                float f10 = this.f41728r;
                if (f10 > 0.0f) {
                    a10.setTextSize(f10);
                }
            }
            Integer num = this.f41730t;
            if (num != null) {
                this.f41719i.setBackgroundColor(num.intValue());
            }
            if (this.f41736z != 0 && (navigationIcon = this.f41719i.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f41736z, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.f41719i.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.f41719i.getChildAt(childCount) instanceof d0) {
                    this.f41719i.removeViewAt(childCount);
                }
            }
            int size = this.f41718h.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = this.f41718h.get(i12);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                d0 d0Var = (d0) obj;
                d0.a type = d0Var.getType();
                if (type == d0.a.f41780d) {
                    View childAt = d0Var.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    supportActionBar.x(imageView.getDrawable());
                } else {
                    Toolbar.g gVar = new Toolbar.g(-2, -1);
                    int i13 = b.$EnumSwitchMapping$0[type.ordinal()];
                    if (i13 == 1) {
                        if (!this.f41735y) {
                            this.f41719i.setNavigationIcon((Drawable) null);
                        }
                        this.f41719i.setTitle((CharSequence) null);
                        gVar.f55919a = 8388611;
                    } else if (i13 == 2) {
                        gVar.f55919a = 8388613;
                    } else if (i13 == 3) {
                        ((ViewGroup.MarginLayoutParams) gVar).width = -1;
                        gVar.f55919a = 1;
                        this.f41719i.setTitle((CharSequence) null);
                    }
                    d0Var.setLayoutParams(gVar);
                    this.f41719i.addView(d0Var);
                }
            }
            this.f41716F.a(this, getScreen());
        }
    }

    public final void n() {
        this.f41718h.clear();
        k();
    }

    public final void o(int i10) {
        this.f41718h.remove(i10);
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41711A = true;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new Mc.a(surfaceId, getId()));
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41711A = false;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new Mc.c(surfaceId, getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setBackButtonInCustomView(boolean z10) {
        this.f41735y = z10;
    }

    public final void setBackgroundColor(@Nullable Integer num) {
        this.f41730t = num;
    }

    public final void setConsumeTopInset(boolean z10) {
        this.f41722l.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z10));
    }

    public final void setDirection(@Nullable String str) {
        this.f41727q = str;
    }

    public final void setHeaderHidden(boolean z10) {
        this.f41720j = z10;
    }

    public final void setHeaderTranslucent(boolean z10) {
        this.f41721k = z10;
    }

    public final void setHidden(boolean z10) {
        this.f41720j = z10;
    }

    public final void setHideBackButton(boolean z10) {
        this.f41731u = z10;
    }

    public final void setHideShadow(boolean z10) {
        this.f41732v = z10;
    }

    public final void setLegacyTopInsetBehavior(boolean z10) {
        this.f41723m.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z10));
    }

    public final void setTintColor(int i10) {
        this.f41736z = i10;
    }

    public final void setTitle(@Nullable String str) {
        this.f41724n = str;
    }

    public final void setTitleColor(int i10) {
        this.f41725o = i10;
    }

    public final void setTitleEmpty(boolean z10) {
        this.f41715E = z10;
    }

    public final void setTitleFontFamily(@Nullable String str) {
        this.f41726p = str;
    }

    public final void setTitleFontSize(float f10) {
        this.f41728r = f10;
    }

    public final void setTitleFontWeight(@Nullable String str) {
        this.f41729s = ReactTypefaceUtils.parseFontWeight(str);
    }

    public final void setTranslucent(boolean z10) {
        this.f41721k = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(Context context) {
        this(context, new C3825p());
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
