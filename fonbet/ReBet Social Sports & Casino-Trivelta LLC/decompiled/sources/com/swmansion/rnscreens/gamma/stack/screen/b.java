package com.swmansion.rnscreens.gamma.stack.screen;

import Uc.n;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC2193s;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import java.lang.ref.WeakReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
public final class b extends ViewGroup implements Oc.a {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(b.class, "isPreventNativeDismissEnabled", "isPreventNativeDismissEnabled$react_native_screens_release()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(b.class, "activityMode", "getActivityMode()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f41841a;

    /* renamed from: b, reason: collision with root package name */
    public final ReadWriteProperty f41842b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41843c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f41844d;

    /* renamed from: e, reason: collision with root package name */
    public final ReadWriteProperty f41845e;

    /* renamed from: f, reason: collision with root package name */
    public String f41846f;

    /* renamed from: g, reason: collision with root package name */
    public final Oc.b f41847g;

    /* renamed from: h, reason: collision with root package name */
    public Tc.d f41848h;

    /* renamed from: i, reason: collision with root package name */
    public WeakReference f41849i;

    /* renamed from: j, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.screen.c f41850j;

    /* renamed from: k, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.stack.screen.a f41851k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f41852a = new a("DETACHED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f41853b = new a("ATTACHED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f41854c;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f41854c = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f41852a, f41853b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: com.swmansion.rnscreens.gamma.stack.screen.b$b, reason: collision with other inner class name */
    public static final class C0596b extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f41855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0596b(Object obj, b bVar) {
            super(obj);
            this.f41855a = bVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            com.swmansion.rnscreens.gamma.stack.screen.a preventNativeDismissChangeObserver$react_native_screens_release;
            Intrinsics.checkNotNullParameter(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() == booleanValue || (preventNativeDismissChangeObserver$react_native_screens_release = this.f41855a.getPreventNativeDismissChangeObserver$react_native_screens_release()) == null) {
                return;
            }
            preventNativeDismissChangeObserver$react_native_screens_release.a(booleanValue);
        }
    }

    public static final class c extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f41856a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, b bVar) {
            super(obj);
            this.f41856a = bVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            n nVar;
            Intrinsics.checkNotNullParameter(property, "property");
            if (((a) obj) == ((a) obj2) || (nVar = this.f41856a.getStackHost$react_native_screens_release().get()) == null) {
                return;
            }
            nVar.j(this.f41856a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f41841a = reactContext;
        Delegates delegates = Delegates.INSTANCE;
        this.f41842b = new C0596b(Boolean.FALSE, this);
        this.f41844d = new WeakReference(null);
        this.f41845e = new c(a.f41852a, this);
        this.f41847g = new Oc.b(false, 1, null);
    }

    public static /* synthetic */ void j(b bVar, Integer num, Integer num2, Integer num3, Integer num4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        if ((i10 & 8) != 0) {
            num4 = null;
        }
        bVar.i(num, num2, num3, num4);
    }

    public final void a(Tc.d header) {
        Tc.a aVar;
        Intrinsics.checkNotNullParameter(header, "header");
        this.f41848h = header;
        WeakReference weakReference = this.f41849i;
        if (weakReference == null || (aVar = (Tc.a) weakReference.get()) == null) {
            return;
        }
        aVar.a(header);
    }

    public final StackScreenAppearanceEventsEmitter b(InterfaceC2193s viewLifecycleOwner) {
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        return new StackScreenAppearanceEventsEmitter(viewLifecycleOwner.getLifecycle(), getEventEmitter$react_native_screens_release());
    }

    public final void c(Tc.d header) {
        Tc.a aVar;
        Intrinsics.checkNotNullParameter(header, "header");
        if (this.f41848h == header) {
            this.f41848h = null;
            WeakReference weakReference = this.f41849i;
            if (weakReference == null || (aVar = (Tc.a) weakReference.get()) == null) {
                return;
            }
            aVar.a(null);
        }
    }

    public final boolean d() {
        return this.f41843c;
    }

    public final boolean e() {
        return ((Boolean) this.f41842b.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void f() {
        if (getActivityMode() == a.f41853b) {
            setNativelyDismissed$react_native_screens_release(true);
        }
        getEventEmitter$react_native_screens_release().h(this.f41843c);
    }

    public final void g() {
        getEventEmitter$react_native_screens_release().i();
    }

    @NotNull
    public final a getActivityMode() {
        return (a) this.f41845e.getValue(this, $$delegatedProperties[1]);
    }

    @Override // Oc.a
    @Nullable
    public Fragment getAssociatedFragment() {
        Fragment b10 = Nc.c.b(this);
        if (b10 == null) {
            return null;
        }
        if (b10 instanceof d) {
            return b10;
        }
        throw new IllegalStateException(("[RNScreens] Unexpected fragment type: " + b10.getClass().getSimpleName()).toString());
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.stack.screen.c getEventEmitter$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.stack.screen.c cVar = this.f41850j;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventEmitter");
        return null;
    }

    @Nullable
    public final Tc.d getHeaderConfig$react_native_screens_release() {
        return this.f41848h;
    }

    @Nullable
    public final WeakReference<Tc.a> getOnHeaderConfigAttachListener$react_native_screens_release() {
        return this.f41849i;
    }

    @Nullable
    public final com.swmansion.rnscreens.gamma.stack.screen.a getPreventNativeDismissChangeObserver$react_native_screens_release() {
        return this.f41851k;
    }

    @Nullable
    public final String getScreenKey() {
        return this.f41846f;
    }

    @NotNull
    public final WeakReference<n> getStackHost$react_native_screens_release() {
        return this.f41844d;
    }

    @Nullable
    public final StateWrapper getStateWrapper$react_native_screens_release() {
        return this.f41847g.a();
    }

    public final void h() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] StackScreen must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new com.swmansion.rnscreens.gamma.stack.screen.c(this.f41841a, getId()));
    }

    public final void i(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f41847g.c(num3, num4, num, num2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Oc.b.d(this.f41847g, Integer.valueOf(i12 - i10), Integer.valueOf(i13 - i11), null, null, 12, null);
    }

    public final void setActivityMode(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41845e.setValue(this, $$delegatedProperties[1], aVar);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull com.swmansion.rnscreens.gamma.stack.screen.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f41850j = cVar;
    }

    public final void setNativelyDismissed$react_native_screens_release(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("[RNScreens] Natively dismissed StackScreen must remain dismissed.");
        }
        this.f41843c = true;
    }

    public final void setOnHeaderConfigAttachListener$react_native_screens_release(@Nullable WeakReference<Tc.a> weakReference) {
        this.f41849i = weakReference;
    }

    public final void setPreventNativeDismissChangeObserver$react_native_screens_release(@Nullable com.swmansion.rnscreens.gamma.stack.screen.a aVar) {
        this.f41851k = aVar;
    }

    public final void setPreventNativeDismissEnabled$react_native_screens_release(boolean z10) {
        this.f41842b.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z10));
    }

    public final void setScreenKey(@Nullable String str) {
        if (this.f41846f != null) {
            throw new IllegalArgumentException("[RNScreens] StackScreen can't change its screenKey.");
        }
        this.f41846f = str;
    }

    public final void setStackHost$react_native_screens_release(@NotNull WeakReference<n> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f41844d = weakReference;
    }

    public final void setStateWrapper$react_native_screens_release(@Nullable StateWrapper stateWrapper) {
        this.f41847g.b(stateWrapper);
    }
}
