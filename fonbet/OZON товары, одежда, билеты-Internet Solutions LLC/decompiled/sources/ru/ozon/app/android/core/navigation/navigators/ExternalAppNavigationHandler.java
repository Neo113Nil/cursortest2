package ru.ozon.app.android.core.navigation.navigators;

import Sc.r;
import Sc.s;
import androidx.fragment.app.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.store.AppStoreRouter;
import ru.ozon.app.android.core.navigation.destinations.ExternalAppDestination;
import ru.ozon.app.android.navigation.OzonCrossNavigationApp;
import ru.ozon.app.android.select.feature.entry.SelectAppStoreAvailabilityChecker;
import ru.ozon.app.android.storage.environment.EnvironmentService;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/core/navigation/navigators/ExternalAppNavigationHandler;", "Lru/ozon/app/android/core/navigation/navigators/BaseExternalNavigationHandler;", "Lru/ozon/app/android/core/navigation/destinations/ExternalAppDestination;", "Lru/ozon/app/android/analytics/store/AppStoreRouter;", "appStoreRouter", "Lru/ozon/app/android/select/feature/entry/SelectAppStoreAvailabilityChecker;", "selectAppStoreAvailabilityChecker", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environment", "<init>", "(Lru/ozon/app/android/analytics/store/AppStoreRouter;Lru/ozon/app/android/select/feature/entry/SelectAppStoreAvailabilityChecker;Lru/ozon/app/android/storage/environment/EnvironmentService;)V", "", "", "allSelectPackages", "()Ljava/util/Set;", "Landroidx/fragment/app/r;", "context", "", "isPackageInstalled", "(Landroidx/fragment/app/r;)Z", "activity", "destination", "", "navigateInternal", "(Landroidx/fragment/app/r;Lru/ozon/app/android/core/navigation/destinations/ExternalAppDestination;)V", "Lru/ozon/app/android/analytics/store/AppStoreRouter;", "Lru/ozon/app/android/select/feature/entry/SelectAppStoreAvailabilityChecker;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "selectProdAppPackageName", "Ljava/lang/String;", "isProd", "()Z", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalAppNavigationHandler extends BaseExternalNavigationHandler<ExternalAppDestination> {

    @NotNull
    private final AppStoreRouter appStoreRouter;

    @NotNull
    private final EnvironmentService environment;

    @NotNull
    private final SelectAppStoreAvailabilityChecker selectAppStoreAvailabilityChecker;

    @NotNull
    private final String selectProdAppPackageName;

    public ExternalAppNavigationHandler(@NotNull AppStoreRouter appStoreRouter, @NotNull SelectAppStoreAvailabilityChecker selectAppStoreAvailabilityChecker, @NotNull EnvironmentService environment) {
        Intrinsics.checkNotNullParameter(appStoreRouter, "appStoreRouter");
        Intrinsics.checkNotNullParameter(selectAppStoreAvailabilityChecker, "selectAppStoreAvailabilityChecker");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.appStoreRouter = appStoreRouter;
        this.selectAppStoreAvailabilityChecker = selectAppStoreAvailabilityChecker;
        this.environment = environment;
        this.selectProdAppPackageName = OzonCrossNavigationApp.SELECT_APP.getProdPackage();
    }

    private final Set<String> allSelectPackages() {
        if (isProd()) {
            return e0.h(this.selectProdAppPackageName);
        }
        String[] elements = {this.selectProdAppPackageName, OzonCrossNavigationApp.SELECT_APP.getQaPackage()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    private final boolean isPackageInstalled(r context) {
        Set<String> allSelectPackages = allSelectPackages();
        if ((allSelectPackages instanceof Collection) && allSelectPackages.isEmpty()) {
            return false;
        }
        Iterator<T> it = allSelectPackages.iterator();
        while (it.hasNext()) {
            if (context.getPackageManager().getLaunchIntentForPackage((String) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean isProd() {
        return this.environment.isProd();
    }

    @Override // ru.ozon.app.android.core.navigation.navigators.BaseExternalNavigationHandler
    public void navigateInternal(@NotNull r activity, @NotNull ExternalAppDestination destination) {
        Object a11;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (canOpenInNonBrowserApp(activity, destination)) {
            openInAppOrBrowser(activity, destination);
            return;
        }
        if (!isPackageInstalled(activity) && this.selectAppStoreAvailabilityChecker.isAvailable(destination.getUri())) {
            this.appStoreRouter.openAppStore(this.selectProdAppPackageName);
            return;
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            openInAppOrBrowser(activity, destination);
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = s.a(th2);
        }
        if (Sc.r.b(a11) != null) {
            openInCustomTabs(activity, destination);
        }
    }
}
