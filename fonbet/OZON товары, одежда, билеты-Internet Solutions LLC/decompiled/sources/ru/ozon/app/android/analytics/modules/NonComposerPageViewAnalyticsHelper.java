package ru.ozon.app.android.analytics.modules;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\b\u0001\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\f\b\u0001\u0010\t\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u0012*\u00020\f2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001e\u0010\u0018\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/analytics/modules/NonComposerPageViewAnalyticsHelper;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "applicationAnalyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;LSg/a;)V", "Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "page", "", "isRefresh", "", "buildPage", "(Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;LRg/a;Z)V", "pageView", "(LRg/a;Z)V", "LSg/a;", "currentPage", "LRg/a;", "previousPageRefresh", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NonComposerPageViewAnalyticsHelper extends BaseAnalyticsModule {

    @NotNull
    private final a applicationAnalyticsScreenStorage;
    private volatile Rg.a currentPage;
    private volatile Rg.a previousPageRefresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonComposerPageViewAnalyticsHelper(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage, @NotNull a applicationAnalyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildPage(BackwardCompatibleAnalyticsDataLayer backwardCompatibleAnalyticsDataLayer, Rg.a aVar, boolean z11) {
        Rg.a a11;
        this.currentPage = aVar;
        if (z11) {
            a11 = this.previousPageRefresh;
        } else {
            a11 = this.applicationAnalyticsScreenStorage.a();
            this.previousPageRefresh = a11;
        }
        Rg.a aVar2 = this.currentPage;
        Rg.a aVar3 = null;
        if (aVar2 != null) {
            aVar3 = Rg.a.a(aVar2, a11 != null ? Rg.a.a(a11, null, null, 3583) : null, null, 3583);
        }
        this.currentPage = aVar3;
        getAnalyticsScreenStorage().e(this.currentPage);
        backwardCompatibleAnalyticsDataLayer.setScreen(this.currentPage);
    }

    public final void pageView(@NotNull Rg.a page, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(page, "page");
        BaseAnalyticsModule.sendEventAsync$default(this, Event.SCREEN_VIEW, null, new NonComposerPageViewAnalyticsHelper$pageView$1(this, page, isRefresh), 2, null);
    }
}
