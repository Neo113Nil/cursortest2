package ru.ozon.app.android.analytics.modules;

import Kl.c;
import Sc.InterfaceC3999a;
import Sg.a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BackwardCompatibleAnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJC\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010H\u0005¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0004¢\u0006\u0004\b\u0014\u0010\u0019J#\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010H\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "createDataLayerWrapper", "()Lru/ozon/app/android/analytics/modules/BackwardCompatibleAnalyticsDataLayer;", "Lru/ozon/app/android/analytics/Event;", "event", "Lkotlin/Function1;", "", "afterEvent", "builder", "sendEventAsync", "(Lru/ozon/app/android/analytics/Event;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "eventsContainerBuilder", "(Lru/ozon/app/android/analytics/Event;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "modifyDataLayer", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "getDataLayer", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "getPluginsManager", "()Lru/ozon/app/android/analytics/plugins/PluginsManager;", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BaseAnalyticsModule {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final AnalyticsDataLayer dataLayer;

    @NotNull
    private final PluginsManager pluginsManager;

    public BaseAnalyticsModule(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.dataLayer = dataLayer;
        this.pluginsManager = pluginsManager;
        this.analyticsScreenStorage = analyticsScreenStorage;
    }

    private final BackwardCompatibleAnalyticsDataLayer createDataLayerWrapper() {
        return new BackwardCompatibleAnalyticsDataLayer(this.dataLayer, this.analyticsScreenStorage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyDataLayer$lambda$4(Function1 function1, BaseAnalyticsModule baseAnalyticsModule) {
        function1.invoke(baseAnalyticsModule.dataLayer);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendEventAsync$default(BaseAnalyticsModule baseAnalyticsModule, Event event, Function1 function1, Function1 function12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEventAsync");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        baseAnalyticsModule.sendEventAsync(event, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackwardCompatibleAnalyticsDataLayer sendEventAsync$lambda$1(BaseAnalyticsModule baseAnalyticsModule, Function1 function1) {
        BackwardCompatibleAnalyticsDataLayer createDataLayerWrapper = baseAnalyticsModule.createDataLayerWrapper();
        function1.invoke(createDataLayerWrapper);
        return createDataLayerWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalyticsDataLayer sendEventAsync$lambda$3(Function1 function1, BaseAnalyticsModule baseAnalyticsModule) {
        if (function1 != null) {
            AnalyticsDataLayer analyticsDataLayer = baseAnalyticsModule.dataLayer;
            function1.invoke(analyticsDataLayer);
            if (analyticsDataLayer != null) {
                return analyticsDataLayer;
            }
        }
        return baseAnalyticsModule.dataLayer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final a getAnalyticsScreenStorage() {
        return this.analyticsScreenStorage;
    }

    protected final void modifyDataLayer(@NotNull final Function1<? super AnalyticsDataLayer, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.pluginsManager.getAnalyticsEventExecutor().execute(new Callable() { // from class: Kl.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit modifyDataLayer$lambda$4;
                modifyDataLayer$lambda$4 = BaseAnalyticsModule.modifyDataLayer$lambda$4(Function1.this, this);
                return modifyDataLayer$lambda$4;
            }
        });
    }

    @InterfaceC3999a
    protected final void sendEventAsync(@NotNull Event event, Function1<? super AnalyticsDataLayer, Unit> afterEvent, @NotNull final Function1<? super BackwardCompatibleAnalyticsDataLayer, Unit> builder) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.pluginsManager.sendEventAsync(event, afterEvent, new Callable() { // from class: Kl.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BackwardCompatibleAnalyticsDataLayer sendEventAsync$lambda$1;
                sendEventAsync$lambda$1 = BaseAnalyticsModule.sendEventAsync$lambda$1(this, builder);
                return sendEventAsync$lambda$1;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendEventAsync$default(BaseAnalyticsModule baseAnalyticsModule, Event event, Function0 function0, Function1 function1, Function1 function12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEventAsync");
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        if ((i11 & 8) != 0) {
            function12 = null;
        }
        baseAnalyticsModule.sendEventAsync(event, function0, function1, function12);
    }

    protected final void sendEventAsync(@NotNull Event event, @NotNull Function0<EventsContainer> eventsContainerBuilder, Function1<? super AnalyticsDataLayer, Unit> afterEvent, Function1<? super AnalyticsDataLayer, Unit> builder) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(eventsContainerBuilder, "eventsContainerBuilder");
        this.pluginsManager.sendEventAsync(event, eventsContainerBuilder, afterEvent, new c(0, builder, this));
    }
}
