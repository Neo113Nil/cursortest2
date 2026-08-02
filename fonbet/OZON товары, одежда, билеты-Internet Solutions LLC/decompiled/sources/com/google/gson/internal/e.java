package com.google.gson.internal;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarKeyboardManager;
import ru.ozon.app.android.ui.start.AppHostActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements o, D, xZ.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f59958a;

    public /* synthetic */ e(Object obj) {
        this.f59958a = obj;
    }

    @Override // xZ.i
    public ComponentCallbacksC5392m create() {
        ComponentCallbacksC5392m onCreate$lambda$2;
        onCreate$lambda$2 = AppHostActivity.onCreate$lambda$2((String) this.f59958a);
        return onCreate$lambda$2;
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        Constructor constructor = (Constructor) this.f59958a;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e11) {
            int i11 = L8.a.f16593b;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + L8.a.b(constructor) + "' with no args", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + L8.a.b(constructor) + "' with no args", e13.getCause());
        }
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 addInsetsListener$lambda$0;
        addInsetsListener$lambda$0 = ShellNavBarKeyboardManager.addInsetsListener$lambda$0((ComponentCallbacksC5392m) this.f59958a, view, c5353y0);
        return addInsetsListener$lambda$0;
    }
}
