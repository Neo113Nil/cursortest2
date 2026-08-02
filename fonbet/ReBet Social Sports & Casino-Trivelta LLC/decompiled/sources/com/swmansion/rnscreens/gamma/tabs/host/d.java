package com.swmansion.rnscreens.gamma.tabs.host;

import Qc.k;
import android.graphics.drawable.ColorDrawable;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.rnscreens.gamma.tabs.container.i;
import com.swmansion.rnscreens.gamma.tabs.container.l;
import com.swmansion.rnscreens.gamma.tabs.container.q;
import com.swmansion.rnscreens.gamma.tabs.container.r;
import dd.C4062i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
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
public final class d extends FrameLayout implements l, UIManagerListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(d.class, "nativeContainerBackgroundColor", "getNativeContainerBackgroundColor()Ljava/lang/Integer;", 0))};

    /* renamed from: i, reason: collision with root package name */
    public static final a f41924i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f41925a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41926b;

    /* renamed from: c, reason: collision with root package name */
    public r f41927c;

    /* renamed from: d, reason: collision with root package name */
    public final i f41928d;

    /* renamed from: e, reason: collision with root package name */
    public g f41929e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41930f;

    /* renamed from: g, reason: collision with root package name */
    public final ReadWriteProperty f41931g;

    /* renamed from: h, reason: collision with root package name */
    public final Choreographer.FrameCallback f41932h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f41933a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, d dVar) {
            super(obj);
            this.f41933a = dVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Integer num = (Integer) obj2;
            if (Intrinsics.areEqual(num, (Integer) obj)) {
                return;
            }
            this.f41933a.f41928d.setBackground(num != null ? new ColorDrawable(num.intValue()) : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f41925a = reactContext;
        this.f41926b = new ArrayList();
        i iVar = new i(reactContext);
        iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f41928d = iVar;
        Delegates delegates = Delegates.INSTANCE;
        this.f41931g = new b(null, this);
        addView(iVar);
        if (!iVar.n(this)) {
            throw new IllegalStateException("[RNScreens] Failed to register TabsHost as navigation state observer");
        }
        k.a(UIManagerHelper.INSTANCE, reactContext).addUIManagerEventListener(this);
        this.f41932h = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.gamma.tabs.host.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                d.i(d.this, j10);
            }
        };
    }

    private final void h() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    public static final void i(d dVar, long j10) {
        dVar.f41930f = false;
        dVar.h();
    }

    private final void l() {
        if (this.f41930f || this.f41932h == null) {
            return;
        }
        this.f41930f = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f41932h);
    }

    public static final boolean o(com.swmansion.rnscreens.gamma.tabs.screen.a aVar, com.swmansion.rnscreens.gamma.tabs.screen.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it == aVar;
    }

    public static final boolean p(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.container.l
    public void a(com.swmansion.rnscreens.gamma.tabs.container.k currentNavState, r rejectedRequest, q reason) {
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(rejectedRequest, "rejectedRequest");
        Intrinsics.checkNotNullParameter(reason, "reason");
        getEventEmitter$react_native_screens_release().j(currentNavState, rejectedRequest, reason);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.container.l
    public void b(com.swmansion.rnscreens.gamma.tabs.container.k navState, boolean z10, boolean z11, com.swmansion.rnscreens.gamma.tabs.container.b actionOrigin) {
        Intrinsics.checkNotNullParameter(navState, "navState");
        Intrinsics.checkNotNullParameter(actionOrigin, "actionOrigin");
        getEventEmitter$react_native_screens_release().h(navState.c(), navState.b(), z10, z11, actionOrigin);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.container.l
    public void c(com.swmansion.rnscreens.gamma.tabs.container.k currentNavState, String preventedScreenKey) {
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(preventedScreenKey, "preventedScreenKey");
        getEventEmitter$react_native_screens_release().i(currentNavState, preventedScreenKey);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        this.f41928d.q();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.common.colorscheme.a getColorScheme$react_native_screens_release() {
        return this.f41928d.getColorScheme$react_native_screens_release();
    }

    @NotNull
    public final g getEventEmitter$react_native_screens_release() {
        g gVar = this.f41929e;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventEmitter");
        return null;
    }

    @Nullable
    public final Integer getNativeContainerBackgroundColor() {
        return (Integer) this.f41931g.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.f41925a;
    }

    public final boolean getRejectStaleNavigationStateUpdates$react_native_screens_release() {
        return this.f41928d.getRejectStaleNavigationStateUpdates$react_native_screens_release();
    }

    public final boolean getTabBarHidden() {
        return this.f41928d.getTabBarHidden$react_native_screens_release();
    }

    public final boolean getTabBarRespectsIMEInsets() {
        return this.f41928d.getTabBarRespectsIMEInsets$react_native_screens_release();
    }

    public final void j(com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen, int i10) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        int maxItemCount = this.f41928d.getBottomNavigationView$react_native_screens_release().getMaxItemCount();
        if (i10 < maxItemCount) {
            this.f41926b.add(i10, tabsScreen);
            tabsScreen.setTabsScreenDelegate$react_native_screens_release(this.f41928d);
            this.f41928d.o(i10, tabsScreen);
        } else {
            throw new IllegalArgumentException(("[RNScreens] Attempt to insert TabsScreen at index " + i10 + "; BottomNavigationView supports at most " + maxItemCount + " items").toString());
        }
    }

    public final void k() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsHost must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new g(this.f41925a, getId()));
    }

    public final void m() {
        this.f41928d.F(this);
        this.f41928d.N();
        k.a(UIManagerHelper.INSTANCE, this.f41925a).removeUIManagerEventListener(this);
    }

    public final void n() {
        Iterator it = this.f41926b.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.tabs.screen.a) it.next()).setTabsScreenDelegate$react_native_screens_release(null);
        }
        this.f41926b.clear();
        this.f41928d.E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C4062i.f45172a.b("TabsHost", "TabsHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void q(final com.swmansion.rnscreens.gamma.tabs.screen.a reactSubview) {
        Intrinsics.checkNotNullParameter(reactSubview, "reactSubview");
        ArrayList arrayList = this.f41926b;
        final Function1 function1 = new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.host.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean o10;
                o10 = d.o(com.swmansion.rnscreens.gamma.tabs.screen.a.this, (com.swmansion.rnscreens.gamma.tabs.screen.a) obj);
                return Boolean.valueOf(o10);
            }
        };
        if (arrayList.removeIf(new Predicate() { // from class: com.swmansion.rnscreens.gamma.tabs.host.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean p10;
                p10 = d.p(Function1.this, obj);
                return p10;
            }
        })) {
            this.f41928d.I(reactSubview);
            reactSubview.setTabsScreenDelegate$react_native_screens_release(null);
        }
    }

    public final void r(int i10) {
        com.swmansion.rnscreens.gamma.tabs.screen.a aVar = (com.swmansion.rnscreens.gamma.tabs.screen.a) this.f41926b.remove(i10);
        this.f41928d.J(i10);
        aVar.setTabsScreenDelegate$react_native_screens_release(null);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        l();
    }

    public final void s(r navStateRequest) {
        Intrinsics.checkNotNullParameter(navStateRequest, "navStateRequest");
        this.f41927c = navStateRequest;
        this.f41928d.setPendingNavigationStateUpdate$react_native_screens_release(r.b(navStateRequest, null, 0, null, 7, null));
    }

    public final void setColorScheme$react_native_screens_release(@NotNull com.swmansion.rnscreens.gamma.common.colorscheme.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41928d.setColorScheme$react_native_screens_release(aVar);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f41929e = gVar;
    }

    public final void setNativeContainerBackgroundColor(@Nullable Integer num) {
        this.f41931g.setValue(this, $$delegatedProperties[0], num);
    }

    public final void setRejectStaleNavigationStateUpdates$react_native_screens_release(boolean z10) {
        this.f41928d.setRejectStaleNavigationStateUpdates$react_native_screens_release(z10);
    }

    public final void setTabBarHidden(boolean z10) {
        this.f41928d.setTabBarHidden$react_native_screens_release(z10);
    }

    public final void setTabBarRespectsIMEInsets(boolean z10) {
        this.f41928d.setTabBarRespectsIMEInsets$react_native_screens_release(z10);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}
