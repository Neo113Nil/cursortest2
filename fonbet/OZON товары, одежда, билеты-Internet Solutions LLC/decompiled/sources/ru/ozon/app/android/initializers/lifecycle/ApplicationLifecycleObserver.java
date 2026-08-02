package ru.ozon.app.android.initializers.lifecycle;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/initializers/lifecycle/ApplicationLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lei0/b;", "ozonTracker", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lei0/b;Lru/ozon/app/android/storage/user/UserStatusStorage;)V", "Landroidx/lifecycle/J;", "owner", "", "onStop", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lei0/b;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplicationLifecycleObserver implements DefaultLifecycleObserver {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final UserStatusStorage userStatusStorage;

    public ApplicationLifecycleObserver(@NotNull FeatureChecker featureChecker, @NotNull InterfaceC6369b ozonTracker, @NotNull UserStatusStorage userStatusStorage) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        this.featureChecker = featureChecker;
        this.ozonTracker = ozonTracker;
        this.userStatusStorage = userStatusStorage;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.ozonTracker.c(new ApplicationLifecycleObserver$onStop$1(this));
    }
}
