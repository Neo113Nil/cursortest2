package ru.ozon.app.android.composer.widgets.async.data;

import L00.f;
import O00.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.tracker.performance.MetricType;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJb\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000b*\u00020\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J`\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepositoryImpl;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "LO00/b;", "composerWidgetAsyncWidgetsRepository", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetsAnalyticDelegate;", "asyncWidgetsAnalyticDelegate", "LL00/f;", "baseUrl", "<init>", "(LO00/b;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetsAnalyticDelegate;LL00/f;)V", "", "T", "", "", "params", "asyncData", "Ljava/lang/Class;", "responseType", "Lru/ozon/tracker/performance/MetricType;", "", "additionalMetrics", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "fetchWidgetInternal", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fetchWidget", "(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LO00/b;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetsAnalyticDelegate;", "LL00/f;", "composer-async-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerAsyncWidgetRepositoryImpl implements ComposerAsyncWidgetRepository {

    @NotNull
    private final ComposerAsyncWidgetsAnalyticDelegate asyncWidgetsAnalyticDelegate;

    @NotNull
    private final f baseUrl;

    @NotNull
    private final b composerWidgetAsyncWidgetsRepository;

    public ComposerAsyncWidgetRepositoryImpl(@NotNull b composerWidgetAsyncWidgetsRepository, @NotNull ComposerAsyncWidgetsAnalyticDelegate asyncWidgetsAnalyticDelegate, @NotNull f baseUrl) {
        Intrinsics.checkNotNullParameter(composerWidgetAsyncWidgetsRepository, "composerWidgetAsyncWidgetsRepository");
        Intrinsics.checkNotNullParameter(asyncWidgetsAnalyticDelegate, "asyncWidgetsAnalyticDelegate");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.composerWidgetAsyncWidgetsRepository = composerWidgetAsyncWidgetsRepository;
        this.asyncWidgetsAnalyticDelegate = asyncWidgetsAnalyticDelegate;
        this.baseUrl = baseUrl;
    }

    private final <T> Object fetchWidgetInternal(Map<String, ? extends Object> map, String str, Class<T> cls, Map<MetricType, Long> map2, d<? super ComposerAsyncWidgetResponse<T>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new ComposerAsyncWidgetRepositoryImpl$fetchWidgetInternal$2(this, str, map, cls, map2, null), dVar);
    }

    static /* synthetic */ Object fetchWidgetInternal$default(ComposerAsyncWidgetRepositoryImpl composerAsyncWidgetRepositoryImpl, Map map, String str, Class cls, Map map2, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = U.c();
        }
        return composerAsyncWidgetRepositoryImpl.fetchWidgetInternal(map, str, cls, map2, dVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository
    public <T> Object fetchWidget(@NotNull String str, @NotNull Class<T> cls, Map<MetricType, Long> map, @NotNull d<? super ComposerAsyncWidgetResponse<T>> dVar) {
        return fetchWidgetInternal$default(this, null, str, cls, map, dVar, 1, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository
    public <T> Object fetchWidget(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Class<T> cls, Map<MetricType, Long> map2, @NotNull d<? super ComposerAsyncWidgetResponse<T>> dVar) {
        return fetchWidgetInternal(map, str, cls, map2, dVar);
    }
}
