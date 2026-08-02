package ru.ozon.app.android.analytics.plugins;

import Sc.InterfaceC3999a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BackwardCompatibleAnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¢\u0006\u0004\b\u000b\u0010\fJK\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¢\u0006\u0004\b\u000b\u0010\u0010J%\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/analytics/plugins/PluginsManager;", "", "Lru/ozon/app/android/analytics/Event;", "event", "Lkotlin/Function1;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "", "afterEvent", "Ljava/util/concurrent/Callable;", "Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "callable", "sendEventAsync", "(Lru/ozon/app/android/analytics/Event;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Callable;)V", "Lkotlin/Function0;", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "eventsContainerBuilder", "(Lru/ozon/app/android/analytics/Event;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Callable;)V", "Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "", "predicate", "findPlugin", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "getAnalyticsEventExecutor", "()Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "analyticsEventExecutor", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PluginsManager {
    AnalyticsPlugin findPlugin(@NotNull Function1<? super AnalyticsPlugin, Boolean> predicate);

    @NotNull
    AnalyticsEventExecutor getAnalyticsEventExecutor();

    void sendEventAsync(@NotNull Event event, @NotNull Function0<EventsContainer> eventsContainerBuilder, Function1<? super AnalyticsDataLayer, Unit> afterEvent, @NotNull Callable<AnalyticsDataLayer> callable);

    @InterfaceC3999a
    void sendEventAsync(@NotNull Event event, Function1<? super AnalyticsDataLayer, Unit> afterEvent, @NotNull Callable<BackwardCompatibleAnalyticsDataLayer> callable);
}
