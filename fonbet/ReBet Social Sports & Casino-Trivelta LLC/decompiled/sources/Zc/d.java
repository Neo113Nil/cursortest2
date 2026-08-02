package Zc;

import Zc.a;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.graphics.e;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class d extends ReactViewGroup implements J, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: i, reason: collision with root package name */
    public static final a f14765i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f14766a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f14767b;

    /* renamed from: c, reason: collision with root package name */
    public Zc.a f14768c;

    /* renamed from: d, reason: collision with root package name */
    public Zc.a f14769d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14770e;

    /* renamed from: f, reason: collision with root package name */
    public StateWrapper f14771f;

    /* renamed from: g, reason: collision with root package name */
    public com.swmansion.rnscreens.safearea.a f14772g;

    /* renamed from: h, reason: collision with root package name */
    public b f14773h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f14766a = reactContext;
        this.f14767b = new WeakReference(null);
        a.C0308a c0308a = Zc.a.f14755e;
        this.f14768c = c0308a.b();
        this.f14769d = c0308a.b();
        this.f14773h = b.f14761a;
        AbstractC2082d0.x0(this, this);
    }

    @Override // androidx.core.view.J
    public F0 f(View view, F0 insets) {
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        e f10 = insets.f(F0.p.g() | F0.p.a());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        if (!Intrinsics.areEqual(f10, this.f14769d)) {
            this.f14769d = Zc.a.f14755e.a(f10);
            if (this.f14773h.c()) {
                this.f14770e = true;
            }
        }
        F0.a aVar = new F0.a(insets);
        if (this.f14773h.c()) {
            e f11 = insets.f(F0.p.g());
            Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
            e p10 = p(f11);
            e f12 = insets.f(F0.p.a());
            Intrinsics.checkNotNullExpressionValue(f12, "getInsets(...)");
            e p11 = p(f12);
            z10 = Intrinsics.areEqual(p11, e.f19097e);
            aVar.b(F0.p.g(), p10);
            aVar.b(F0.p.a(), p11);
        } else {
            z10 = false;
        }
        F0 a10 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        if (Build.VERSION.SDK_INT >= 30 || !z10) {
            return a10;
        }
        F0 a11 = a10.a();
        Intrinsics.checkNotNullExpressionValue(a11, "consumeDisplayCutout(...)");
        return a11;
    }

    @Nullable
    public final StateWrapper getStateWrapper() {
        return this.f14771f;
    }

    public final c o() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof c)) {
            parent = parent.getParent();
        }
        if (parent instanceof c) {
            return (c) parent;
        }
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this);
        c o10 = o();
        if (o10 == null) {
            super.onAttachedToWindow();
            return;
        }
        o10.setOnInterfaceInsetsChangeListener(this);
        this.f14767b = new WeakReference(o10);
        this.f14768c = o10.getInterfaceInsets();
        r();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        c cVar = (c) this.f14767b.get();
        if (cVar != null) {
            cVar.a(this);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean s10 = s();
        if (s10) {
            requestLayout();
        }
        return !s10;
    }

    public final e p(e eVar) {
        com.swmansion.rnscreens.safearea.a aVar = this.f14772g;
        int i10 = aVar != null ? aVar.b() : false ? 0 : eVar.f19098a;
        com.swmansion.rnscreens.safearea.a aVar2 = this.f14772g;
        int i11 = aVar2 != null ? aVar2.d() : false ? 0 : eVar.f19099b;
        com.swmansion.rnscreens.safearea.a aVar3 = this.f14772g;
        int i12 = aVar3 != null ? aVar3.c() : false ? 0 : eVar.f19100c;
        com.swmansion.rnscreens.safearea.a aVar4 = this.f14772g;
        e c10 = e.c(i10, i11, i12, aVar4 != null ? aVar4.a() : false ? 0 : eVar.f19101d);
        Intrinsics.checkNotNullExpressionValue(c10, "of(...)");
        return c10;
    }

    public final void q(Zc.a newInterfaceInsets) {
        Intrinsics.checkNotNullParameter(newInterfaceInsets, "newInterfaceInsets");
        if (Intrinsics.areEqual(newInterfaceInsets, this.f14768c)) {
            return;
        }
        this.f14768c = newInterfaceInsets;
        if (this.f14773h.b()) {
            this.f14770e = true;
        }
    }

    public final void r() {
        a.C0308a c0308a = Zc.a.f14755e;
        Zc.a c10 = c0308a.c(this.f14773h.b() ? this.f14768c : c0308a.b(), this.f14773h.c() ? this.f14769d : c0308a.b());
        StateWrapper stateWrapper = getStateWrapper();
        if (stateWrapper != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(c10.c()));
            createMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(c10.e()));
            createMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(c10.d()));
            createMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(c10.b()));
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putMap("insets", createMap);
            stateWrapper.updateState(createMap2);
        }
    }

    public final boolean s() {
        if (!this.f14770e) {
            return false;
        }
        this.f14770e = false;
        r();
        return true;
    }

    public final void setEdges(@NotNull com.swmansion.rnscreens.safearea.a edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f14772g = edges;
        requestApplyInsets();
        this.f14770e = true;
    }

    public final void setInsetType(@NotNull b insetType) {
        Intrinsics.checkNotNullParameter(insetType, "insetType");
        this.f14773h = insetType;
        requestApplyInsets();
        this.f14770e = true;
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.f14771f = stateWrapper;
    }
}
