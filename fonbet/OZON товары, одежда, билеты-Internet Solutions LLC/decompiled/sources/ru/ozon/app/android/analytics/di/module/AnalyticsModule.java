package ru.ozon.app.android.analytics.di.module;

import Qj0.I;
import Qj0.InterfaceC3896p;
import Rj0.a;
import android.content.Context;
import ei0.InterfaceC6369b;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegateImpl;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutorImpl;
import ru.ozon.app.android.analytics.startup.FontScaleProvider;
import ru.ozon.app.android.analytics.startup.OpenGlVersionProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/analytics/di/module/AnalyticsModule;", "", "Companion", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AnalyticsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/analytics/di/module/AnalyticsModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "provideAnalyticsDataLayer", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "provideAnalyticsEventExecutor", "()Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "LQj0/p;", "performanceTracker", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "bindPerformanceTrackerDelegate", "(LQj0/p;)Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lei0/b;", "ozonTracker", "", "LQj0/I;", "interceptors", "provideInterceptedPerformanceTracker", "(Lei0/b;Ljava/util/List;)LQj0/p;", "Landroid/content/Context;", "applicationContext", "Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "provideFontScaleProvider", "(Landroid/content/Context;)Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "Lru/ozon/app/android/analytics/startup/OpenGlVersionProvider;", "provideOpenGlVersionProvider", "(Landroid/content/Context;)Lru/ozon/app/android/analytics/startup/OpenGlVersionProvider;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PerformanceTrackerDelegate bindPerformanceTrackerDelegate(@NotNull InterfaceC3896p performanceTracker) {
            Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
            return new PerformanceTrackerDelegateImpl(performanceTracker);
        }

        @NotNull
        public final AnalyticsDataLayer provideAnalyticsDataLayer() {
            return new AnalyticsDataLayer(null, null, 3, null);
        }

        @NotNull
        public final AnalyticsEventExecutor provideAnalyticsEventExecutor() {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            return new AnalyticsEventExecutorImpl(newSingleThreadExecutor);
        }

        @NotNull
        public final FontScaleProvider provideFontScaleProvider(@NotNull Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            return new FontScaleProvider(applicationContext);
        }

        @NotNull
        public final InterfaceC3896p provideInterceptedPerformanceTracker(@NotNull InterfaceC6369b ozonTracker, @NotNull List<I> interceptors) {
            Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            return new a(ozonTracker, interceptors);
        }

        @NotNull
        public final OpenGlVersionProvider provideOpenGlVersionProvider(@NotNull Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            return new OpenGlVersionProvider(applicationContext);
        }

        private Companion() {
        }
    }
}
