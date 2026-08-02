package ru.ozon.app.android.select.feature.entry;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.flags.SelectDeeplinkRouteToAppStoreEnabled;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/select/feature/entry/SelectAppStoreAvailabilityChecker;", "", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "nativePageDomainsInteractor", "Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/navigation/NativePageDomainsInteractor;)V", "selectDeeplinkRouteToAppStoreEnabled", "", "getSelectDeeplinkRouteToAppStoreEnabled", "()Z", "isAvailable", ImagesContract.URL, "Landroid/net/Uri;", "isSelectUrl", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectAppStoreAvailabilityChecker {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final NativePageDomainsInteractor nativePageDomainsInteractor;

    public SelectAppStoreAvailabilityChecker(@NotNull FeatureChecker featureChecker, @NotNull NativePageDomainsInteractor nativePageDomainsInteractor) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(nativePageDomainsInteractor, "nativePageDomainsInteractor");
        this.featureChecker = featureChecker;
        this.nativePageDomainsInteractor = nativePageDomainsInteractor;
    }

    private final boolean getSelectDeeplinkRouteToAppStoreEnabled() {
        return this.featureChecker.isEnabled(SelectDeeplinkRouteToAppStoreEnabled.INSTANCE);
    }

    private final boolean isSelectUrl(Uri url) {
        String host = url.getHost();
        if (host != null) {
            return this.nativePageDomainsInteractor.isHostContainsInNativePageDomainsByApps(host, AppType.SELECT);
        }
        return false;
    }

    public final boolean isAvailable(@NotNull Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return getSelectDeeplinkRouteToAppStoreEnabled() && isSelectUrl(url);
    }
}
