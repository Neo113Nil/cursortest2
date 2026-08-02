package ru.ozon.app.android.platform.bundle.state;

import P4.f;
import Sc.InterfaceC4008j;
import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegateProvider;", "delegateProvider", "<init>", "(Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegateProvider;)V", "", "getScreenUUID", "()Ljava/lang/String;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "outState", "onActivityPostSaveInstanceState", "(Landroid/os/Bundle;)V", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegateProvider;", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegate;", "manualStateDelegate$delegate", "LSc/j;", "getManualStateDelegate", "()Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegate;", "manualStateDelegate", "screenGuid", "Ljava/lang/String;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManualStateBundleActivityCallback {

    @NotNull
    private final ManualStateBundleDelegateProvider delegateProvider;

    /* renamed from: manualStateDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j manualStateDelegate;
    private String screenGuid;

    public ManualStateBundleActivityCallback(@NotNull ManualStateBundleDelegateProvider delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.delegateProvider = delegateProvider;
        this.manualStateDelegate = LazyUtilsKt.unsafeLazy(new ManualStateBundleActivityCallback$manualStateDelegate$2(this));
    }

    private final ManualStateBundleDelegate getManualStateDelegate() {
        return (ManualStateBundleDelegate) this.manualStateDelegate.getValue();
    }

    private final String getScreenUUID() {
        String str = this.screenGuid;
        if (str != null) {
            return str;
        }
        String b11 = f.b("toString(...)");
        this.screenGuid = b11;
        return b11;
    }

    public final void onActivityPostSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Bundle cloneAndFlush = getManualStateDelegate().cloneAndFlush(outState);
        if (cloneAndFlush != null) {
            getManualStateDelegate().saveState(cloneAndFlush, getScreenUUID());
        }
    }

    public final void onActivityPreCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ManualStateBundleDelegate manualStateDelegate = getManualStateDelegate();
        ClassLoader classLoader = activity.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        Bundle restoreState = manualStateDelegate.restoreState(savedInstanceState, classLoader);
        if (restoreState == null || savedInstanceState == null) {
            return;
        }
        savedInstanceState.putAll(restoreState);
    }
}
