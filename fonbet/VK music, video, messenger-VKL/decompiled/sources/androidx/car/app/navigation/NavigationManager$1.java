package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.Lifecycle;
import xsna.rro0;

/* loaded from: classes11.dex */
class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ b this$0;
    final /* synthetic */ Lifecycle val$lifecycle;

    public NavigationManager$1(b bVar, Lifecycle lifecycle) {
        this.this$0 = bVar;
        this.val$lifecycle = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onStopNavigation$0() throws BundlerException {
        this.this$0.getClass();
        rro0.a();
        return null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.c(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new RemoteUtils.a() { // from class: androidx.car.app.navigation.a
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onStopNavigation$0;
                lambda$onStopNavigation$0 = NavigationManager$1.this.lambda$onStopNavigation$0();
                return lambda$onStopNavigation$0;
            }
        });
    }
}
