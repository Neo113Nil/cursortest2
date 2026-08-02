package ru.ozon.app.android.analytics.modules;

import Kl.b;
import Sg.a;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.analytics.HashUtils;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.datalayer.AnalyticsUser;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/analytics/modules/AuthAnalyticsImpl;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/modules/AuthAnalytics;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "areaRepository", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/location/ComposerLocationRepository;Lru/ozon/app/android/account/user/UserManager;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "Lru/ozon/app/android/storage/user/model/User;", "user", "", "setUser", "(Lru/ozon/app/android/storage/user/model/User;)V", "Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;", "analyticsUser", "", "areaId", "mapToAnalyticsUser", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;Lru/ozon/app/android/storage/user/model/User;J)Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;", "startObserveUser", "()V", "Lru/ozon/app/android/location/ComposerLocationRepository;", "Lru/ozon/app/android/account/user/UserManager;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes6.dex */
public final class AuthAnalyticsImpl extends BaseAnalyticsModule implements AuthAnalytics {

    @NotNull
    private final ComposerLocationRepository areaRepository;

    @NotNull
    private final UserManager userManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAnalyticsImpl(@NotNull ComposerLocationRepository areaRepository, @NotNull UserManager userManager, @NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(areaRepository, "areaRepository");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.areaRepository = areaRepository;
        this.userManager = userManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsUser mapToAnalyticsUser(AnalyticsUser analyticsUser, User user, long areaId) {
        return analyticsUser.updateUserInformation(String.valueOf(user.getUserId()), user.getSex(), user.getEmail(), HashUtils.INSTANCE.md5(user.getEmail()), (int) areaId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUser(User user) {
        modifyDataLayer(new AuthAnalyticsImpl$setUser$1(this, user));
    }

    @Override // ru.ozon.app.android.analytics.modules.AuthAnalytics
    public void startObserveUser() {
        this.userManager.observeUser().subscribe(new Kl.a(new AuthAnalyticsImpl$startObserveUser$1(this)), new b(new AuthAnalyticsImpl$startObserveUser$2(Lm0.a.f17149a)));
    }
}
