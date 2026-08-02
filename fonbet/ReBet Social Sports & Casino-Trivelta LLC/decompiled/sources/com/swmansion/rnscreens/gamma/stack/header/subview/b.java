package com.swmansion.rnscreens.gamma.stack.header.subview;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
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
public final class b extends ReactViewGroup implements d {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(b.class, "collapseMode", "getCollapseMode()Lcom/swmansion/rnscreens/gamma/stack/header/subview/StackHeaderSubviewCollapseMode;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final ReactContext f41821a;

    /* renamed from: b, reason: collision with root package name */
    public e f41822b;

    /* renamed from: c, reason: collision with root package name */
    public final ReadWriteProperty f41823c;

    /* renamed from: d, reason: collision with root package name */
    public final b f41824d;

    /* renamed from: e, reason: collision with root package name */
    public final Oc.b f41825e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f41826f;

    /* renamed from: g, reason: collision with root package name */
    public int f41827g;

    /* renamed from: h, reason: collision with root package name */
    public int f41828h;

    public static final class a extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f41829a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, b bVar) {
            super(obj);
            this.f41829a = bVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            WeakReference<com.swmansion.rnscreens.gamma.stack.header.subview.a> onStackHeaderSubviewChangeListener$react_native_screens_release;
            com.swmansion.rnscreens.gamma.stack.header.subview.a aVar;
            Intrinsics.checkNotNullParameter(property, "property");
            if (((c) obj) == ((c) obj2) || (onStackHeaderSubviewChangeListener$react_native_screens_release = this.f41829a.getOnStackHeaderSubviewChangeListener$react_native_screens_release()) == null || (aVar = onStackHeaderSubviewChangeListener$react_native_screens_release.get()) == null) {
                return;
            }
            aVar.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f41821a = reactContext;
        this.f41822b = e.f41835c;
        Delegates delegates = Delegates.INSTANCE;
        this.f41823c = new a(c.f41830a, this);
        this.f41824d = this;
        this.f41825e = new Oc.b(false);
    }

    @Override // com.swmansion.rnscreens.gamma.stack.header.subview.d
    @NotNull
    public c getCollapseMode() {
        return (c) this.f41823c.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final WeakReference<com.swmansion.rnscreens.gamma.stack.header.subview.a> getOnStackHeaderSubviewChangeListener$react_native_screens_release() {
        return this.f41826f;
    }

    @NotNull
    public final ReactContext getReactContext() {
        return this.f41821a;
    }

    @Nullable
    public final StateWrapper getStateWrapper$react_native_screens_release() {
        return this.f41825e.a();
    }

    @NotNull
    public e getType() {
        return this.f41822b;
    }

    @Override // com.swmansion.rnscreens.gamma.stack.header.subview.d
    public void l(int i10, int i11) {
        Oc.b.d(this.f41825e, null, null, Integer.valueOf(i10), Integer.valueOf(i11), 3, null);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int size;
        int size2;
        boolean z11 = true;
        if (View.MeasureSpec.getMode(i10) != 1073741824 || (size2 = View.MeasureSpec.getSize(i10)) == this.f41827g) {
            z10 = false;
        } else {
            this.f41827g = size2;
            z10 = true;
        }
        if (View.MeasureSpec.getMode(i11) != 1073741824 || (size = View.MeasureSpec.getSize(i11)) == this.f41828h) {
            z11 = z10;
        } else {
            this.f41828h = size;
        }
        setMeasuredDimension(this.f41827g, this.f41828h);
        if (!z11 || isInLayout()) {
            return;
        }
        requestLayout();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        forceLayout();
        View d10 = Nc.c.d(this);
        if (d10 != null) {
            d10.requestLayout();
        }
    }

    public void setCollapseMode$react_native_screens_release(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f41823c.setValue(this, $$delegatedProperties[0], cVar);
    }

    public final void setOnStackHeaderSubviewChangeListener$react_native_screens_release(@Nullable WeakReference<com.swmansion.rnscreens.gamma.stack.header.subview.a> weakReference) {
        this.f41826f = weakReference;
    }

    public final void setStateWrapper$react_native_screens_release(@Nullable StateWrapper stateWrapper) {
        this.f41825e.b(stateWrapper);
    }

    public void setType$react_native_screens_release(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f41822b = eVar;
    }

    @Override // com.swmansion.rnscreens.gamma.stack.header.subview.d
    @NotNull
    public b getView() {
        return this.f41824d;
    }
}
