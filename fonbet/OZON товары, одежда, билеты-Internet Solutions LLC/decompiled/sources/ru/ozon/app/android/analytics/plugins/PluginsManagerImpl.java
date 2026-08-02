package ru.ozon.app.android.analytics.plugins;

import Lm0.a;
import Sc.InterfaceC3999a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.AnalyticsCache;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentConfig;
import ru.ozon.app.android.analytics.modules.BackwardCompatibleAnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;
import ru.ozon.app.android.analytics.plugins.PluginsManagerImpl;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J;\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJI\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\"J%\u0010%\u001a\u0004\u0018\u00010\t2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\u001aH\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/analytics/plugins/PluginsManagerImpl;", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "analyticsEventExecutor", "Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;", "analyticsComponentConfig", "Lru/ozon/app/android/analytics/AnalyticsCache;", "analyticsCache", "", "Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "plugins", "<init>", "(Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;Lru/ozon/app/android/analytics/AnalyticsCache;Ljava/util/Set;)V", "Lru/ozon/app/android/analytics/Event;", "event", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "eventsContainer", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "", "fetchEvent", "(Lru/ozon/app/android/analytics/Event;Lru/ozon/app/android/analytics/modules/EventsContainer;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;)V", "Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "backwardCompatibleAnalyticsDataLayer", "sendEvent", "(Lru/ozon/app/android/analytics/Event;Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;)V", "Lkotlin/Function1;", "afterEvent", "Ljava/util/concurrent/Callable;", "callable", "sendEventAsync", "(Lru/ozon/app/android/analytics/Event;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Callable;)V", "Lkotlin/Function0;", "eventsContainerBuilder", "(Lru/ozon/app/android/analytics/Event;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Callable;)V", "", "predicate", "findPlugin", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "getAnalyticsEventExecutor", "()Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;", "Lru/ozon/app/android/analytics/AnalyticsCache;", "Ljava/util/Set;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PluginsManagerImpl implements PluginsManager {

    @NotNull
    private final AnalyticsCache analyticsCache;

    @NotNull
    private final AnalyticsComponentConfig analyticsComponentConfig;

    @NotNull
    private final AnalyticsEventExecutor analyticsEventExecutor;

    @NotNull
    private final Set<AnalyticsPlugin> plugins;

    public PluginsManagerImpl(@NotNull AnalyticsEventExecutor analyticsEventExecutor, @NotNull AnalyticsComponentConfig analyticsComponentConfig, @NotNull AnalyticsCache analyticsCache, @NotNull Set<AnalyticsPlugin> plugins) {
        Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
        Intrinsics.checkNotNullParameter(analyticsComponentConfig, "analyticsComponentConfig");
        Intrinsics.checkNotNullParameter(analyticsCache, "analyticsCache");
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        this.analyticsEventExecutor = analyticsEventExecutor;
        this.analyticsComponentConfig = analyticsComponentConfig;
        this.analyticsCache = analyticsCache;
        this.plugins = plugins;
    }

    private final void fetchEvent(Event event, EventsContainer eventsContainer, AnalyticsDataLayer dataLayer) {
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            try {
                ((AnalyticsPlugin) it.next()).send(event, eventsContainer, dataLayer);
            } catch (NullPointerException e11) {
                a.f17149a.e(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEventAsync$lambda$0(Callable callable, PluginsManagerImpl pluginsManagerImpl, Event event, Function1 function1) {
        BackwardCompatibleAnalyticsDataLayer backwardCompatibleAnalyticsDataLayer = (BackwardCompatibleAnalyticsDataLayer) callable.call();
        Intrinsics.f(backwardCompatibleAnalyticsDataLayer);
        pluginsManagerImpl.sendEvent(event, backwardCompatibleAnalyticsDataLayer);
        if (function1 == null) {
            return null;
        }
        function1.invoke(backwardCompatibleAnalyticsDataLayer.getAnalyticsDataLayer());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEventAsync$lambda$1(Callable callable, Function0 function0, PluginsManagerImpl pluginsManagerImpl, Event event, Function1 function1) {
        AnalyticsDataLayer analyticsDataLayer = (AnalyticsDataLayer) callable.call();
        EventsContainer eventsContainer = (EventsContainer) function0.invoke();
        Intrinsics.f(analyticsDataLayer);
        pluginsManagerImpl.sendEvent(event, eventsContainer, analyticsDataLayer);
        if (function1 == null) {
            return null;
        }
        function1.invoke(analyticsDataLayer);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.analytics.plugins.PluginsManager
    public AnalyticsPlugin findPlugin(@NotNull Function1<? super AnalyticsPlugin, Boolean> predicate) {
        Object obj;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<T> it = this.plugins.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (predicate.invoke(obj).booleanValue()) {
                break;
            }
        }
        return (AnalyticsPlugin) obj;
    }

    @Override // ru.ozon.app.android.analytics.plugins.PluginsManager
    @NotNull
    public AnalyticsEventExecutor getAnalyticsEventExecutor() {
        return this.analyticsEventExecutor;
    }

    @InterfaceC3999a
    public void sendEvent(@NotNull Event event, @NotNull BackwardCompatibleAnalyticsDataLayer backwardCompatibleAnalyticsDataLayer) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(backwardCompatibleAnalyticsDataLayer, "backwardCompatibleAnalyticsDataLayer");
        AnalyticsDataLayer copy$default = AnalyticsDataLayer.copy$default(backwardCompatibleAnalyticsDataLayer.getAnalyticsDataLayer(), null, null, 3, null);
        if (this.analyticsComponentConfig.getIsShakerEnabled()) {
            this.analyticsCache.addEvent(event, copy$default);
        }
        fetchEvent(event, backwardCompatibleAnalyticsDataLayer.getEventsContainer(), copy$default);
    }

    @Override // ru.ozon.app.android.analytics.plugins.PluginsManager
    @InterfaceC3999a
    public void sendEventAsync(@NotNull final Event event, final Function1<? super AnalyticsDataLayer, Unit> afterEvent, @NotNull final Callable<BackwardCompatibleAnalyticsDataLayer> callable) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(callable, "callable");
        getAnalyticsEventExecutor().execute(new Callable() { // from class: Ll.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit sendEventAsync$lambda$0;
                sendEventAsync$lambda$0 = PluginsManagerImpl.sendEventAsync$lambda$0(callable, this, event, afterEvent);
                return sendEventAsync$lambda$0;
            }
        });
    }

    @Override // ru.ozon.app.android.analytics.plugins.PluginsManager
    public void sendEventAsync(@NotNull final Event event, @NotNull final Function0<EventsContainer> eventsContainerBuilder, final Function1<? super AnalyticsDataLayer, Unit> afterEvent, @NotNull final Callable<AnalyticsDataLayer> callable) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(eventsContainerBuilder, "eventsContainerBuilder");
        Intrinsics.checkNotNullParameter(callable, "callable");
        getAnalyticsEventExecutor().execute(new Callable() { // from class: Ll.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit sendEventAsync$lambda$1;
                sendEventAsync$lambda$1 = PluginsManagerImpl.sendEventAsync$lambda$1(callable, eventsContainerBuilder, this, event, afterEvent);
                return sendEventAsync$lambda$1;
            }
        });
    }

    public void sendEvent(@NotNull Event event, @NotNull EventsContainer eventsContainer, @NotNull AnalyticsDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(eventsContainer, "eventsContainer");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        AnalyticsDataLayer copy$default = AnalyticsDataLayer.copy$default(dataLayer, null, null, 3, null);
        if (this.analyticsComponentConfig.getIsShakerEnabled()) {
            this.analyticsCache.addEvent(event, copy$default);
        }
        fetchEvent(event, eventsContainer, copy$default);
    }
}
