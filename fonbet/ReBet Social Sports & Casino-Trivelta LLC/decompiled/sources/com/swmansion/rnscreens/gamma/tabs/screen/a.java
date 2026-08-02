package com.swmansion.rnscreens.gamma.tabs.screen;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ThemedReactContext;
import dd.C4062i;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class a extends ViewGroup implements Oc.a {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "tabTitle", "getTabTitle()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "appearance", "getAppearance$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/appearance/TabsAppearance;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "badgeValue", "getBadgeValue()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "tabBarItemTestID", "getTabBarItemTestID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "tabBarItemAccessibilityLabel", "getTabBarItemAccessibilityLabel()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "drawableIconResourceName", "getDrawableIconResourceName()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "selectedDrawableIconResourceName", "getSelectedDrawableIconResourceName()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "selectedIcon", "getSelectedIcon()Landroid/graphics/drawable/Drawable;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final C0597a f41936q = new C0597a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f41937a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f41938b;

    /* renamed from: c, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.tabs.screen.c f41939c;

    /* renamed from: d, reason: collision with root package name */
    public String f41940d;

    /* renamed from: e, reason: collision with root package name */
    public final ReadWriteProperty f41941e;

    /* renamed from: f, reason: collision with root package name */
    public final ReadWriteProperty f41942f;

    /* renamed from: g, reason: collision with root package name */
    public final ReadWriteProperty f41943g;

    /* renamed from: h, reason: collision with root package name */
    public final ReadWriteProperty f41944h;

    /* renamed from: i, reason: collision with root package name */
    public final ReadWriteProperty f41945i;

    /* renamed from: j, reason: collision with root package name */
    public final ReadWriteProperty f41946j;

    /* renamed from: k, reason: collision with root package name */
    public final ReadWriteProperty f41947k;

    /* renamed from: l, reason: collision with root package name */
    public final ReadWriteProperty f41948l;

    /* renamed from: m, reason: collision with root package name */
    public final ReadWriteProperty f41949m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41950n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41951o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f41952p;

    /* renamed from: com.swmansion.rnscreens.gamma.tabs.screen.a$a, reason: collision with other inner class name */
    public static final class C0597a {
        public /* synthetic */ C0597a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0597a() {
        }
    }

    public static final class b extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41953a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, a aVar) {
            super(obj);
            this.f41953a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f41953a;
            aVar.f((String) obj, (String) obj2);
        }
    }

    public static final class c extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41954a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, a aVar) {
            super(obj);
            this.f41954a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            com.swmansion.rnscreens.gamma.tabs.screen.b bVar;
            Intrinsics.checkNotNullParameter(property, "property");
            if (Intrinsics.areEqual((Wc.b) obj, (Wc.b) obj2) || (bVar = (com.swmansion.rnscreens.gamma.tabs.screen.b) this.f41954a.f41938b.get()) == null) {
                return;
            }
            bVar.d(this.f41954a);
        }
    }

    public static final class d extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41955a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, a aVar) {
            super(obj);
            this.f41955a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f41955a;
            aVar.f((String) obj, (String) obj2);
        }
    }

    public static final class e extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41956a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, a aVar) {
            super(obj);
            this.f41956a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f41956a;
            aVar.f((String) obj, (String) obj2);
        }
    }

    public static final class f extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41957a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, a aVar) {
            super(obj);
            this.f41957a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f41957a;
            aVar.f((String) obj, (String) obj2);
        }
    }

    public static final class g extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41958a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, a aVar) {
            super(obj);
            this.f41958a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            String str = (String) obj2;
            if (Intrinsics.areEqual(str, (String) obj)) {
                return;
            }
            a aVar = this.f41958a;
            aVar.setIcon(Qc.j.a(aVar.getReactContext(), str));
        }
    }

    public static final class h extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41959a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, a aVar) {
            super(obj);
            this.f41959a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            String str = (String) obj2;
            if (Intrinsics.areEqual(str, (String) obj)) {
                return;
            }
            a aVar = this.f41959a;
            aVar.setSelectedIcon(Qc.j.a(aVar.getReactContext(), str));
        }
    }

    public static final class i extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, a aVar) {
            super(obj);
            this.f41960a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f41960a;
            aVar.f((Drawable) obj, (Drawable) obj2);
        }
    }

    public static final class j extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, a aVar) {
            super(obj);
            this.f41961a = aVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f41961a;
            aVar.f((Drawable) obj, (Drawable) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f41937a = reactContext;
        this.f41938b = new WeakReference(null);
        Delegates delegates = Delegates.INSTANCE;
        this.f41941e = new b(null, this);
        this.f41942f = new c(null, this);
        this.f41943g = new d(null, this);
        this.f41944h = new e(null, this);
        this.f41945i = new f(null, this);
        this.f41946j = new g(null, this);
        this.f41947k = new h(null, this);
        this.f41948l = new i(null, this);
        this.f41949m = new j(null, this);
        this.f41950n = true;
        this.f41951o = true;
    }

    public final void c(com.swmansion.rnscreens.gamma.tabs.screen.e fragment, Configuration config) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        com.swmansion.rnscreens.gamma.tabs.screen.b bVar = (com.swmansion.rnscreens.gamma.tabs.screen.b) this.f41938b.get();
        if (bVar != null) {
            bVar.c(this, config);
        }
    }

    public final void d() {
        com.swmansion.rnscreens.gamma.tabs.screen.b bVar = (com.swmansion.rnscreens.gamma.tabs.screen.b) this.f41938b.get();
        if (bVar != null) {
            bVar.f(this);
        }
    }

    public final void e() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsScreen must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new com.swmansion.rnscreens.gamma.tabs.screen.c(this.f41937a, getId()));
    }

    public final void f(Object obj, Object obj2) {
        if (Intrinsics.areEqual(obj2, obj)) {
            return;
        }
        d();
    }

    @Nullable
    public final Wc.b getAppearance$react_native_screens_release() {
        return (Wc.b) this.f41942f.getValue(this, $$delegatedProperties[1]);
    }

    @Override // Oc.a
    @Nullable
    public Fragment getAssociatedFragment() {
        com.swmansion.rnscreens.gamma.tabs.screen.b bVar = (com.swmansion.rnscreens.gamma.tabs.screen.b) this.f41938b.get();
        if (bVar != null) {
            return bVar.e(this);
        }
        return null;
    }

    @Nullable
    public final String getBadgeValue() {
        return (String) this.f41943g.getValue(this, $$delegatedProperties[2]);
    }

    @Nullable
    public final String getDrawableIconResourceName() {
        return (String) this.f41946j.getValue(this, $$delegatedProperties[5]);
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.tabs.screen.c getEventEmitter$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.tabs.screen.c cVar = this.f41939c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventEmitter");
        return null;
    }

    @Nullable
    public final Drawable getIcon() {
        return (Drawable) this.f41948l.getValue(this, $$delegatedProperties[7]);
    }

    public final boolean getPreventNativeSelection() {
        return this.f41952p;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.f41937a;
    }

    @NotNull
    public final String getRequireScreenKey$react_native_screens_release() {
        String str = this.f41940d;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("[RNScreens] screenKey MUST NOT be null");
    }

    @Nullable
    public final String getScreenKey() {
        return this.f41940d;
    }

    @Nullable
    public final String getSelectedDrawableIconResourceName() {
        return (String) this.f41947k.getValue(this, $$delegatedProperties[6]);
    }

    @Nullable
    public final Drawable getSelectedIcon() {
        return (Drawable) this.f41949m.getValue(this, $$delegatedProperties[8]);
    }

    public final boolean getShouldUseRepeatedTabSelectionPopToRootSpecialEffect() {
        return this.f41951o;
    }

    public final boolean getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect() {
        return this.f41950n;
    }

    @Nullable
    public final String getTabBarItemAccessibilityLabel() {
        return (String) this.f41945i.getValue(this, $$delegatedProperties[4]);
    }

    @Nullable
    public final String getTabBarItemTestID() {
        return (String) this.f41944h.getValue(this, $$delegatedProperties[3]);
    }

    @Nullable
    public final String getTabTitle() {
        return (String) this.f41941e.getValue(this, $$delegatedProperties[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C4062i.f45172a.a("TabsScreen", "TabsScreen [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setAppearance$react_native_screens_release(@Nullable Wc.b bVar) {
        this.f41942f.setValue(this, $$delegatedProperties[1], bVar);
    }

    public final void setBadgeValue(@Nullable String str) {
        this.f41943g.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setDrawableIconResourceName(@Nullable String str) {
        this.f41946j.setValue(this, $$delegatedProperties[5], str);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull com.swmansion.rnscreens.gamma.tabs.screen.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f41939c = cVar;
    }

    public final void setIcon(@Nullable Drawable drawable) {
        this.f41948l.setValue(this, $$delegatedProperties[7], drawable);
    }

    public final void setPreventNativeSelection(boolean z10) {
        this.f41952p = z10;
    }

    public final void setScreenKey(@Nullable String str) {
        if (str != null && StringsKt.isBlank(str)) {
            str = null;
        }
        this.f41940d = str;
    }

    public final void setSelectedDrawableIconResourceName(@Nullable String str) {
        this.f41947k.setValue(this, $$delegatedProperties[6], str);
    }

    public final void setSelectedIcon(@Nullable Drawable drawable) {
        this.f41949m.setValue(this, $$delegatedProperties[8], drawable);
    }

    public final void setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(boolean z10) {
        this.f41951o = z10;
    }

    public final void setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(boolean z10) {
        this.f41950n = z10;
    }

    public final void setTabBarItemAccessibilityLabel(@Nullable String str) {
        this.f41945i.setValue(this, $$delegatedProperties[4], str);
    }

    public final void setTabBarItemTestID(@Nullable String str) {
        this.f41944h.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setTabTitle(@Nullable String str) {
        this.f41941e.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setTabsScreenDelegate$react_native_screens_release(@Nullable com.swmansion.rnscreens.gamma.tabs.screen.b bVar) {
        this.f41938b = new WeakReference(bVar);
    }
}
