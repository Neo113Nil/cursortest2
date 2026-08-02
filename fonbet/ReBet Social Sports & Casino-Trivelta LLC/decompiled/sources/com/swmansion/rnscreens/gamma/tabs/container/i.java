package com.swmansion.rnscreens.gamma.tabs.container;

import android.content.Context;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.view.AbstractC2094j0;
import androidx.core.view.F0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import com.google.android.material.navigation.NavigationBarView;
import com.swmansion.rnscreens.T;
import com.swmansion.rnscreens.gamma.tabs.container.k;
import dd.C4062i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class i extends FrameLayout implements com.swmansion.rnscreens.gamma.common.colorscheme.d, com.swmansion.rnscreens.gamma.tabs.screen.b, Zc.c, View.OnLayoutChangeListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(i.class, "tabBarHidden", "getTabBarHidden$react_native_screens_release()Z", 0))};

    /* renamed from: u, reason: collision with root package name */
    public static final a f41873u = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f41874a;

    /* renamed from: b, reason: collision with root package name */
    public k f41875b;

    /* renamed from: c, reason: collision with root package name */
    public k f41876c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41877d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41878e;

    /* renamed from: f, reason: collision with root package name */
    public final j f41879f;

    /* renamed from: g, reason: collision with root package name */
    public r f41880g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41881h;

    /* renamed from: i, reason: collision with root package name */
    public FragmentManager f41882i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.appcompat.view.d f41883j;

    /* renamed from: k, reason: collision with root package name */
    public final ma.c f41884k;

    /* renamed from: l, reason: collision with root package name */
    public final b f41885l;

    /* renamed from: m, reason: collision with root package name */
    public final com.swmansion.rnscreens.gamma.common.colorscheme.b f41886m;

    /* renamed from: n, reason: collision with root package name */
    public final p f41887n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41888o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout f41889p;

    /* renamed from: q, reason: collision with root package name */
    public final Wc.d f41890q;

    /* renamed from: r, reason: collision with root package name */
    public final com.swmansion.rnscreens.gamma.tabs.host.f f41891r;

    /* renamed from: s, reason: collision with root package name */
    public Zc.d f41892s;

    /* renamed from: t, reason: collision with root package name */
    public final ReadWriteProperty f41893t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public final class b {
        public b() {
        }

        public final boolean a() {
            ScrollView b10;
            T a10;
            FrameLayout frameLayout = i.this.f41889p;
            com.swmansion.rnscreens.gamma.tabs.screen.e selectedTab$react_native_screens_release = i.this.getSelectedTab$react_native_screens_release();
            if (selectedTab$react_native_screens_release.e0().getShouldUseRepeatedTabSelectionPopToRootSpecialEffect() && (a10 = Qc.l.f9633a.a(frameLayout)) != null && a10.e0()) {
                return true;
            }
            if (!selectedTab$react_native_screens_release.e0().getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect() || (b10 = Qc.l.f9633a.b(frameLayout)) == null || b10.getScrollY() <= 0) {
                return false;
            }
            b10.smoothScrollTo(b10.getScrollX(), 0);
            return true;
        }
    }

    public static final class c extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f41895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, i iVar) {
            super(obj);
            this.f41895a = iVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (((Boolean) obj2).booleanValue() != ((Boolean) obj).booleanValue()) {
                i.S(this.f41895a, null, 1, null);
                this.f41895a.getInvalidationFlags$react_native_screens_release().f(true);
                i iVar = this.f41895a;
                iVar.post(iVar.new d());
            }
        }
    }

    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41874a = context;
        Qc.m mVar = Qc.m.f9634a;
        setId(mVar.a());
        k.a aVar = k.f41900c;
        this.f41875b = aVar.a();
        this.f41876c = aVar.a();
        ArrayList arrayList = new ArrayList();
        this.f41877d = arrayList;
        j jVar = new j(false, false, false, 7, null);
        this.f41879f = jVar;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ia.l.f48571j);
        this.f41883j = dVar;
        ma.c cVar = new ma.c(dVar);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.f41884k = cVar;
        this.f41885l = new b();
        this.f41886m = new com.swmansion.rnscreens.gamma.common.colorscheme.b();
        this.f41887n = new p();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(mVar.a());
        this.f41889p = frameLayout;
        this.f41890q = new Wc.d(cVar, arrayList);
        this.f41891r = new com.swmansion.rnscreens.gamma.tabs.host.f(cVar, arrayList);
        Delegates delegates = Delegates.INSTANCE;
        this.f41893t = new c(Boolean.FALSE, this);
        addView(frameLayout);
        addView(cVar);
        cVar.setOnItemSelectedListener(new NavigationBarView.c() { // from class: com.swmansion.rnscreens.gamma.tabs.container.f
            @Override // com.google.android.material.navigation.NavigationBarView.c
            public final boolean a(MenuItem menuItem) {
                boolean A10;
                A10 = i.this.A(menuItem);
                return A10;
            }
        });
        jVar.b();
    }

    public static final boolean G(com.swmansion.rnscreens.gamma.tabs.screen.a aVar, com.swmansion.rnscreens.gamma.tabs.screen.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.e0() == aVar;
    }

    public static final boolean H(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void Q(i iVar) {
        iVar.requestLayout();
    }

    public static /* synthetic */ void S(i iVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        iVar.R(num);
    }

    private final FragmentManager getRequireFragmentManager() {
        FragmentManager fragmentManager = this.f41882i;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
    }

    private final Integer getSelectedTabsScreenFragmentId() {
        Iterator it = this.f41877d.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(((com.swmansion.rnscreens.gamma.tabs.screen.e) it.next()).d0(), this.f41875b.c())) {
                break;
            }
            i10++;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public static final void y(i iVar) {
        iVar.q();
    }

    public static final Unit z(i iVar, int i10) {
        iVar.p(i10);
        return Unit.INSTANCE;
    }

    public final boolean A(MenuItem menuItem) {
        C4062i.f45172a.a("TabsHost", "Item selected " + menuItem);
        com.swmansion.rnscreens.gamma.tabs.screen.e selectedTab$react_native_screens_release = this.f41875b.e() ? getSelectedTab$react_native_screens_release() : null;
        com.swmansion.rnscreens.gamma.tabs.screen.e r10 = r(menuItem.getItemId());
        if (r10 == null) {
            throw new IllegalStateException(("[RNScreens] Can not select item with id: " + menuItem.getItemId() + " - associated fragment does not exist").toString());
        }
        boolean z10 = r10 == selectedTab$react_native_screens_release;
        com.swmansion.rnscreens.gamma.tabs.container.b c10 = this.f41881h ? L().c() : com.swmansion.rnscreens.gamma.tabs.container.b.f41863a;
        if (!z10 && c10 == com.swmansion.rnscreens.gamma.tabs.container.b.f41863a && r10.f0()) {
            this.f41887n.h(this.f41875b, r10.d0());
            return false;
        }
        boolean U10 = U(r10, c10);
        boolean a10 = z10 ? this.f41885l.a() : false;
        if (U10) {
            this.f41887n.f(this.f41875b, z10, a10, c10);
        }
        return true;
    }

    public final void B() {
        if (this.f41879f.d()) {
            this.f41879f.g(false);
            T();
        }
        if (this.f41879f.e()) {
            this.f41879f.h(false);
            C();
        }
        if (this.f41879f.c()) {
            this.f41879f.f(false);
            P();
            this.f41891r.a();
        }
    }

    public final void C() {
        if (this.f41880g == null) {
            C4062i.f45172a.c("TabsContainer", "TabsContainer::performOperation called w/o pending operation; skipping update");
            return;
        }
        r L10 = L();
        Integer w10 = w(K(L10.e()));
        if (w10 == null) {
            throw new IllegalStateException(("[RNScreens] Failed to find Menu Item for screenKey: " + L10.e()).toString());
        }
        int intValue = w10.intValue();
        if (this.f41878e && x(L10)) {
            this.f41887n.j(this.f41875b, L10, q.f41915a);
            this.f41880g = null;
            return;
        }
        if (this.f41884k.getSelectedItemId() != intValue || this.f41875b.d()) {
            this.f41881h = true;
            this.f41884k.setSelectedItemId(intValue);
            this.f41881h = false;
        } else {
            this.f41887n.j(this.f41875b, L10, q.f41916b);
        }
        this.f41880g = null;
    }

    public final void D(String str, com.swmansion.rnscreens.gamma.tabs.container.b bVar) {
        k kVar = new k(str, this.f41875b.b() + 1);
        this.f41875b = kVar;
        if (bVar != com.swmansion.rnscreens.gamma.tabs.container.b.f41864b) {
            this.f41876c = kVar;
        }
    }

    public final void E() {
        this.f41877d.clear();
        this.f41879f.b();
    }

    public final boolean F(l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return this.f41887n.m(observer);
    }

    public final boolean I(final com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        List list = this.f41877d;
        final Function1 function1 = new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.container.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean G10;
                G10 = i.G(com.swmansion.rnscreens.gamma.tabs.screen.a.this, (com.swmansion.rnscreens.gamma.tabs.screen.e) obj);
                return Boolean.valueOf(G10);
            }
        };
        boolean removeIf = list.removeIf(new Predicate() { // from class: com.swmansion.rnscreens.gamma.tabs.container.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean H10;
                H10 = i.H(Function1.this, obj);
                return H10;
            }
        });
        if (removeIf) {
            this.f41879f.b();
        }
        return removeIf;
    }

    public final com.swmansion.rnscreens.gamma.tabs.screen.a J(int i10) {
        com.swmansion.rnscreens.gamma.tabs.screen.a e02 = ((com.swmansion.rnscreens.gamma.tabs.screen.e) this.f41877d.remove(i10)).e0();
        this.f41879f.b();
        return e02;
    }

    public final com.swmansion.rnscreens.gamma.tabs.screen.e K(String str) {
        com.swmansion.rnscreens.gamma.tabs.screen.e s10 = s(str);
        if (s10 != null) {
            return s10;
        }
        throw new IllegalStateException(("[RNScreens] Requested fragment for key: " + str + " does not exist").toString());
    }

    public final r L() {
        r rVar = this.f41880g;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("[RNScreens] Attempt to require nullish pendingStateUpdateRequest");
    }

    public final void M() {
        FragmentManager a10 = Qc.b.f9621a.a(this);
        if (a10 == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        this.f41882i = a10;
    }

    public final void N() {
        this.f41887n.e();
        setPendingNavigationStateUpdate$react_native_screens_release(null);
    }

    public final void O() {
        this.f41882i = null;
    }

    public final void P() {
        C4062i.f45172a.a("TabsContainer", "updateBottomNavigationViewAppearance");
        this.f41890q.c(this.f41883j, this);
        post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.container.h
            @Override // java.lang.Runnable
            public final void run() {
                i.Q(i.this);
            }
        });
    }

    public final void R(Integer num) {
        int intValue = getTabBarHidden$react_native_screens_release() ? 0 : num != null ? num.intValue() : this.f41884k.getHeight();
        Zc.d dVar = this.f41892s;
        if (dVar != null) {
            dVar.q(new Zc.a(0.0f, 0.0f, 0.0f, intValue));
        }
    }

    public final void T() {
        Menu menu = this.f41884k.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        if (menu.size() != this.f41877d.size()) {
            this.f41884k.getMenu().clear();
        }
        int i10 = 0;
        for (Object obj : this.f41877d) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Menu menu2 = this.f41884k.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu2, "getMenu(...)");
            if (com.swmansion.rnscreens.gamma.tabs.container.a.a(com.swmansion.rnscreens.gamma.tabs.container.a.b(menu2, i10, ((com.swmansion.rnscreens.gamma.tabs.screen.e) obj).e0()).getItemId()) != i10) {
                throw new IllegalStateException("[RNScreens] Illegal state: menu items are shuffled");
            }
            i10 = i11;
        }
    }

    public final boolean U(com.swmansion.rnscreens.gamma.tabs.screen.e eVar, com.swmansion.rnscreens.gamma.tabs.container.b bVar) {
        if (this.f41875b.d()) {
            if (!this.f41881h || this.f41880g == null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f41875b = new k(eVar.d0(), 0);
            Qc.c.a(getRequireFragmentManager()).b(this.f41889p.getId(), eVar).k();
            return true;
        }
        com.swmansion.rnscreens.gamma.tabs.screen.e selectedTab$react_native_screens_release = getSelectedTab$react_native_screens_release();
        if (eVar == selectedTab$react_native_screens_release) {
            D(this.f41875b.c(), bVar);
            return true;
        }
        D(eVar.d0(), bVar);
        N a10 = Qc.c.a(getRequireFragmentManager());
        a10.n(selectedTab$react_native_screens_release);
        a10.b(this.f41889p.getId(), eVar).k();
        return true;
    }

    @Override // Zc.c
    public void a(Zc.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Intrinsics.areEqual(this.f41892s, listener)) {
            this.f41892s = null;
            this.f41884k.removeOnLayoutChangeListener(this);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.common.colorscheme.d
    public void b(com.swmansion.rnscreens.gamma.common.colorscheme.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f41886m.b(listener);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.screen.b
    public void c(com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen, Configuration config) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        Intrinsics.checkNotNullParameter(config, "config");
        onConfigurationChanged(config);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.screen.b
    public void d(com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        if (getSelectedTab$react_native_screens_release().e0() == tabsScreen) {
            this.f41879f.f(true);
            post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.container.g
                @Override // java.lang.Runnable
                public final void run() {
                    i.y(i.this);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if (!(windowInsets != null ? windowInsets.isConsumed() : true)) {
            for (View view : AbstractC2094j0.a(this)) {
                if (view == this.f41884k) {
                    ((ma.c) view).dispatchApplyWindowInsets(u(windowInsets));
                } else {
                    view.dispatchApplyWindowInsets(windowInsets);
                }
            }
        }
        return windowInsets;
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.screen.b
    public void f(com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        MenuItem v10 = v(tabsScreen);
        if (v10 != null) {
            this.f41890q.a(this.f41883j, v10, tabsScreen, getSelectedTab$react_native_screens_release().e0().getAppearance$react_native_screens_release());
            this.f41891r.b(v10, tabsScreen);
        }
    }

    @NotNull
    public final ma.c getBottomNavigationView$react_native_screens_release() {
        return this.f41884k;
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.common.colorscheme.a getColorScheme$react_native_screens_release() {
        return this.f41886m.f();
    }

    @Override // Zc.c
    @NotNull
    public Zc.a getInterfaceInsets() {
        return new Zc.a(0.0f, 0.0f, 0.0f, this.f41884k.getHeight());
    }

    @NotNull
    public final j getInvalidationFlags$react_native_screens_release() {
        return this.f41879f;
    }

    @NotNull
    public final k getNavigationState() {
        return this.f41875b;
    }

    public final boolean getRejectStaleNavigationStateUpdates$react_native_screens_release() {
        return this.f41878e;
    }

    @Override // com.swmansion.rnscreens.gamma.common.colorscheme.d
    public int getResolvedUiNightMode() {
        return this.f41886m.getResolvedUiNightMode();
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.tabs.screen.e getSelectedTab$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.tabs.screen.e s10 = s(this.f41875b.c());
        if (s10 != null) {
            return s10;
        }
        throw new IllegalStateException("[RNScreens] No selected tab present");
    }

    public final boolean getTabBarHidden$react_native_screens_release() {
        return ((Boolean) this.f41893t.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getTabBarRespectsIMEInsets$react_native_screens_release() {
        return this.f41888o;
    }

    public final boolean n(l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return this.f41887n.d(observer);
    }

    public final void o(int i10, com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        this.f41877d.add(i10, new com.swmansion.rnscreens.gamma.tabs.screen.e(tabsScreen));
        this.f41879f.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C4062i.f45172a.a("TabsContainer", "TabsContainer [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        M();
        q();
        this.f41886m.i(this, new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.container.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit z10;
                z10 = i.z(i.this, ((Integer) obj).intValue());
                return z10;
            }
        });
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f41886m.g(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (view instanceof ma.c) {
            int i18 = i13 - i11;
            if (i18 != i17 - i15) {
                R(Integer.valueOf(i18));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] TabsContainer's onLayoutChange expects BottomNavigationView, received " + view + " instead").toString());
    }

    public final void p(int i10) {
        if (i10 == 16) {
            this.f41883j.setTheme(ia.l.f48572k);
        } else if (i10 != 32) {
            this.f41883j.setTheme(ia.l.f48571j);
        } else {
            this.f41883j.setTheme(ia.l.f48570i);
        }
        this.f41890q.c(this.f41883j, this);
    }

    public final void q() {
        if (this.f41879f.a() && isAttachedToWindow()) {
            B();
        }
    }

    public final com.swmansion.rnscreens.gamma.tabs.screen.e r(int i10) {
        return (com.swmansion.rnscreens.gamma.tabs.screen.e) CollectionsKt.getOrNull(this.f41877d, com.swmansion.rnscreens.gamma.tabs.container.a.a(i10));
    }

    public final com.swmansion.rnscreens.gamma.tabs.screen.e s(String str) {
        Object obj;
        Iterator it = this.f41877d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((com.swmansion.rnscreens.gamma.tabs.screen.e) obj).d0(), str)) {
                break;
            }
        }
        return (com.swmansion.rnscreens.gamma.tabs.screen.e) obj;
    }

    public final void setColorScheme$react_native_screens_release(@NotNull com.swmansion.rnscreens.gamma.common.colorscheme.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41886m.h(aVar);
    }

    @Override // Zc.c
    public void setOnInterfaceInsetsChangeListener(@NotNull Zc.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f41892s == null) {
            this.f41884k.addOnLayoutChangeListener(this);
        }
        this.f41892s = listener;
    }

    public final void setPendingNavigationStateUpdate$react_native_screens_release(@Nullable r rVar) {
        this.f41880g = rVar;
        this.f41879f.h(rVar != null);
    }

    public final void setRejectStaleNavigationStateUpdates$react_native_screens_release(boolean z10) {
        this.f41878e = z10;
    }

    public final void setTabBarHidden$react_native_screens_release(boolean z10) {
        this.f41893t.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z10));
    }

    public final void setTabBarRespectsIMEInsets$react_native_screens_release(boolean z10) {
        this.f41888o = z10;
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.screen.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.swmansion.rnscreens.gamma.tabs.screen.e e(com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Object obj;
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        Iterator it = this.f41877d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.swmansion.rnscreens.gamma.tabs.screen.e) obj).e0() == tabsScreen) {
                break;
            }
        }
        return (com.swmansion.rnscreens.gamma.tabs.screen.e) obj;
    }

    public final WindowInsets u(WindowInsets windowInsets) {
        if (this.f41888o) {
            return windowInsets;
        }
        F0 z10 = F0.z(windowInsets, this);
        Intrinsics.checkNotNullExpressionValue(z10, "toWindowInsetsCompat(...)");
        return new F0.a(z10).b(F0.p.b(), androidx.core.graphics.e.f19097e).a().x();
    }

    public final MenuItem v(com.swmansion.rnscreens.gamma.tabs.screen.a aVar) {
        Iterator it = this.f41877d.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.swmansion.rnscreens.gamma.tabs.screen.e) it.next()).e0() == aVar) {
                break;
            }
            i10++;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return this.f41884k.getMenu().findItem(com.swmansion.rnscreens.gamma.tabs.container.a.c(valueOf.intValue()));
    }

    public final Integer w(com.swmansion.rnscreens.gamma.tabs.screen.e eVar) {
        Iterator it = this.f41877d.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.swmansion.rnscreens.gamma.tabs.screen.e) it.next()) == eVar) {
                break;
            }
            i10++;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Integer.valueOf(com.swmansion.rnscreens.gamma.tabs.container.a.c(valueOf.intValue()));
        }
        return null;
    }

    public final boolean x(r rVar) {
        return (this.f41875b.d() || this.f41876c.d() || rVar.d() >= this.f41876c.b()) ? false : true;
    }
}
