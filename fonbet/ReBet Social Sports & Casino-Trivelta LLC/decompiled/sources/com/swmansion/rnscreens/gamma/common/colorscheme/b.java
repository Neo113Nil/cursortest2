package com.swmansion.rnscreens.gamma.common.colorscheme;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class b implements d, c {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(b.class, "colorScheme", "getColorScheme$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/common/colorscheme/ColorScheme;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final ReadWriteProperty f41812a;

    /* renamed from: b, reason: collision with root package name */
    public d f41813b;

    /* renamed from: c, reason: collision with root package name */
    public int f41814c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41815d;

    /* renamed from: e, reason: collision with root package name */
    public final List f41816e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41817f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f41818g;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.swmansion.rnscreens.gamma.common.colorscheme.a.values().length];
            try {
                iArr[com.swmansion.rnscreens.gamma.common.colorscheme.a.f41809b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.swmansion.rnscreens.gamma.common.colorscheme.a.f41810c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.swmansion.rnscreens.gamma.common.colorscheme.a.f41808a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.swmansion.rnscreens.gamma.common.colorscheme.b$b, reason: collision with other inner class name */
    public static final class C0595b extends ObservableProperty {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f41819a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0595b(Object obj, b bVar) {
            super(obj);
            this.f41819a = bVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (((com.swmansion.rnscreens.gamma.common.colorscheme.a) obj) != ((com.swmansion.rnscreens.gamma.common.colorscheme.a) obj2)) {
                this.f41819a.d();
            }
        }
    }

    public b() {
        Delegates delegates = Delegates.INSTANCE;
        this.f41812a = new C0595b(com.swmansion.rnscreens.gamma.common.colorscheme.a.f41808a, this);
        this.f41814c = 16;
        this.f41816e = new ArrayList();
    }

    @Override // com.swmansion.rnscreens.gamma.common.colorscheme.c
    public void a() {
        if (f() == com.swmansion.rnscreens.gamma.common.colorscheme.a.f41808a) {
            d();
        }
    }

    @Override // com.swmansion.rnscreens.gamma.common.colorscheme.d
    public void b(c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f41816e.add(listener);
    }

    public final void d() {
        int resolvedUiNightMode = getResolvedUiNightMode();
        Integer num = this.f41815d;
        if (num != null && resolvedUiNightMode == num.intValue()) {
            return;
        }
        this.f41815d = Integer.valueOf(resolvedUiNightMode);
        Function1 function1 = this.f41818g;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(resolvedUiNightMode));
        }
        Iterator it = this.f41816e.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
    }

    public final d e(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof d) {
                return (d) parent;
            }
        }
        return null;
    }

    public final com.swmansion.rnscreens.gamma.common.colorscheme.a f() {
        return (com.swmansion.rnscreens.gamma.common.colorscheme.a) this.f41812a.getValue(this, $$delegatedProperties[0]);
    }

    public final void g(Configuration configuration) {
        this.f41814c = configuration != null ? configuration.uiMode & 48 : 0;
        d();
    }

    @Override // com.swmansion.rnscreens.gamma.common.colorscheme.d
    public int getResolvedUiNightMode() {
        int i10 = a.$EnumSwitchMapping$0[f().ordinal()];
        if (i10 == 1) {
            return 16;
        }
        if (i10 == 2) {
            return 32;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = this.f41813b;
        return dVar != null ? dVar.getResolvedUiNightMode() : this.f41814c;
    }

    public final void h(com.swmansion.rnscreens.gamma.common.colorscheme.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41812a.setValue(this, $$delegatedProperties[0], aVar);
    }

    public final void i(View hostView, Function1 function1) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        if (this.f41817f) {
            throw new IllegalStateException("[RNScreens] ColorSchemeCoordinator's setup method must not be called again without calling teardown() first.");
        }
        this.f41814c = hostView.getResources().getConfiguration().uiMode & 48;
        d e10 = e(hostView);
        this.f41813b = e10;
        if (e10 != null) {
            e10.b(this);
        }
        this.f41818g = function1;
        this.f41817f = true;
        this.f41815d = null;
        d();
    }
}
