package ru.ozon.app.android.fresh.navigation;

import android.app.Activity;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshMapAppNameDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "<init>", "(Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/location/AreaLocalStore;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/location/AreaLocalStore;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshMapAppNameDelegate implements DefaultLifecycleObserver {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    public FreshMapAppNameDelegate(@NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull AreaLocalStore areaLocalStore) {
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.areaLocalStore = areaLocalStore;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.ozonGeoProxyClient.setAppName("ozon_fresh_android", this.areaLocalStore.getLocationUid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Activity activity = owner instanceof ComponentCallbacksC5392m ? ((ComponentCallbacksC5392m) owner).getActivity() : owner instanceof Activity ? (Activity) owner : null;
        if (activity == null || !activity.isChangingConfigurations()) {
            this.ozonGeoProxyClient.setAppName("ozonapp_android", this.areaLocalStore.getLocationUid());
        }
        owner.getLifecycle().e(this);
    }
}
