package ru.ozon.app.android.initializers.user;

import Ob0.a;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostNotificationUiReadyNotifier;
import ru.ozon.app.android.navigation.newrouter.navigators.host.AppHostUiReadyNotifier;
import ru.ozon.app.android.utils.lifecycle.ActivityLifecycleCallbacksAdapter;
import xZ.InterfaceC10682a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/initializers/user/OzonIdActivityCallback;", "Lru/ozon/app/android/utils/lifecycle/ActivityLifecycleCallbacksAdapter;", "LOb0/a;", "ozonIdAppApi", "<init>", "(LOb0/a;)V", "Landroid/app/Activity;", "activity", "", "setNotificationRootViewIfReady", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityStopped", "onActivityDestroyed", "LOb0/a;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "ozonIdActivityOnScreen", "Z", "getOzonIdActivityOnScreen", "()Z", "Ljava/lang/ref/WeakReference;", "startedAppHost", "Ljava/lang/ref/WeakReference;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonIdActivityCallback implements ActivityLifecycleCallbacksAdapter {
    private boolean ozonIdActivityOnScreen;

    @NotNull
    private final a ozonIdAppApi;
    private WeakReference<Activity> startedAppHost;

    public OzonIdActivityCallback(@NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.ozonIdAppApi = ozonIdAppApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setNotificationRootViewIfReady(Activity activity) {
        WeakReference<Activity> weakReference = this.startedAppHost;
        if ((weakReference != null ? weakReference.get() : null) != activity) {
            return;
        }
        if (!(activity instanceof AppHostUiReadyNotifier) || ((AppHostUiReadyNotifier) activity).getIsAppHostUiReady()) {
            if (!(activity instanceof AppHostNotificationUiReadyNotifier) || ((AppHostNotificationUiReadyNotifier) activity).getIsAppHostNotificationUiReady()) {
                View decorView = activity.getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup == null) {
                    return;
                }
                this.ozonIdAppApi.F(viewGroup);
            }
        }
    }

    public final boolean getOzonIdActivityOnScreen() {
        return this.ozonIdActivityOnScreen;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.ozonIdAppApi.p(activity)) {
            this.ozonIdActivityOnScreen = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof AppHostUiReadyNotifier) {
            ((AppHostUiReadyNotifier) activity).setOnAppHostUiReady(null);
        }
        if (activity instanceof AppHostNotificationUiReadyNotifier) {
            ((AppHostNotificationUiReadyNotifier) activity).setOnAppHostNotificationUiReady(null);
        }
        if (this.ozonIdAppApi.p(activity)) {
            this.ozonIdActivityOnScreen = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof InterfaceC10682a) {
            this.startedAppHost = new WeakReference<>(activity);
            if (activity instanceof AppHostUiReadyNotifier) {
                ((AppHostUiReadyNotifier) activity).setOnAppHostUiReady(new OzonIdActivityCallback$onActivityStarted$1(this, activity));
            }
            if (activity instanceof AppHostNotificationUiReadyNotifier) {
                ((AppHostNotificationUiReadyNotifier) activity).setOnAppHostNotificationUiReady(new OzonIdActivityCallback$onActivityStarted$2(this, activity));
            }
            setNotificationRootViewIfReady(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference<Activity> weakReference = this.startedAppHost;
        if ((weakReference != null ? weakReference.get() : null) != activity) {
            return;
        }
        WeakReference<Activity> weakReference2 = this.startedAppHost;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.startedAppHost = null;
        this.ozonIdAppApi.z();
    }
}
