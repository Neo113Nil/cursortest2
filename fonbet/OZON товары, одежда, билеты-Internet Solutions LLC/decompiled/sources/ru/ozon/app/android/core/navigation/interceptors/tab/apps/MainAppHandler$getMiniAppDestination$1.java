package ru.ozon.app.android.core.navigation.interceptors.tab.apps;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.tabbar.ui.MainTabNavigationFragment;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/fragment/app/m;", "invoke", "()Landroidx/fragment/app/m;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class MainAppHandler$getMiniAppDestination$1 extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
    public static final MainAppHandler$getMiniAppDestination$1 INSTANCE = new MainAppHandler$getMiniAppDestination$1();

    MainAppHandler$getMiniAppDestination$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ComponentCallbacksC5392m invoke() {
        return MainTabNavigationFragment.INSTANCE.newInstance(null);
    }
}
