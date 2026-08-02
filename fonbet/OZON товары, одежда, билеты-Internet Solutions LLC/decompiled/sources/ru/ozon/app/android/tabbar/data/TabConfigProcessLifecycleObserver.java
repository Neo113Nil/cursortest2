package ru.ozon.app.android.tabbar.data;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigProcessLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "updateDelegate", "<init>", "(Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;)V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "", "lastFetchMillis", "J", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigProcessLifecycleObserver implements DefaultLifecycleObserver {
    private long lastFetchMillis;

    @NotNull
    private final TabConfigUpdateDelegate updateDelegate;

    public TabConfigProcessLifecycleObserver(@NotNull TabConfigUpdateDelegate updateDelegate) {
        Intrinsics.checkNotNullParameter(updateDelegate, "updateDelegate");
        this.updateDelegate = updateDelegate;
        this.lastFetchMillis = -1L;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.lastFetchMillis;
        if (j11 == -1) {
            this.lastFetchMillis = currentTimeMillis;
        } else {
            if (currentTimeMillis - j11 < TimeUnit.MINUTES.toMillis(5L)) {
                return;
            }
            this.lastFetchMillis = currentTimeMillis;
            this.updateDelegate.updateMainTabBarConfig();
        }
    }
}
