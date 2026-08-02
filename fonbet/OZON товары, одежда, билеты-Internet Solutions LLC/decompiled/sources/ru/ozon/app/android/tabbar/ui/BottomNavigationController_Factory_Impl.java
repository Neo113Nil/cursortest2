package ru.ozon.app.android.tabbar.ui;

import Jb.f;
import Pc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes2.dex */
public final class BottomNavigationController_Factory_Impl implements BottomNavigationController.Factory {
    private final C9535BottomNavigationController_Factory delegateFactory;

    BottomNavigationController_Factory_Impl(C9535BottomNavigationController_Factory c9535BottomNavigationController_Factory) {
        this.delegateFactory = c9535BottomNavigationController_Factory;
    }

    @Override // ru.ozon.app.android.tabbar.ui.BottomNavigationController.Factory
    public BottomNavigationController create(ComponentCallbacksC5392m componentCallbacksC5392m) {
        return this.delegateFactory.get(componentCallbacksC5392m);
    }

    public static a<BottomNavigationController.Factory> create(C9535BottomNavigationController_Factory c9535BottomNavigationController_Factory) {
        return f.a(new BottomNavigationController_Factory_Impl(c9535BottomNavigationController_Factory));
    }
}
