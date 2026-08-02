package ru.ozon.app.android.composer.widgets.async.data;

import Q00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JN\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H¦@¢\u0006\u0004\b\f\u0010\rJb\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H¦@¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "", "T", "", "asyncData", "Ljava/lang/Class;", "responseType", "", "Lru/ozon/tracker/performance/MetricType;", "", "additionalMetrics", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "fetchWidget", "(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "params", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "composer-async-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ComposerAsyncWidgetRepository {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchWidget$default(ComposerAsyncWidgetRepository composerAsyncWidgetRepository, String str, Class cls, Map map, d dVar, int i11, Object obj) throws a {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchWidget");
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            return composerAsyncWidgetRepository.fetchWidget(str, cls, map, dVar);
        }

        public static /* synthetic */ Object fetchWidget$default(ComposerAsyncWidgetRepository composerAsyncWidgetRepository, String str, Map map, Class cls, Map map2, d dVar, int i11, Object obj) throws a {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchWidget");
            }
            if ((i11 & 8) != 0) {
                map2 = null;
            }
            return composerAsyncWidgetRepository.fetchWidget(str, map, cls, map2, dVar);
        }
    }

    <T> Object fetchWidget(@NotNull String str, @NotNull Class<T> cls, Map<MetricType, Long> map, @NotNull d<? super ComposerAsyncWidgetResponse<T>> dVar) throws a;

    <T> Object fetchWidget(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Class<T> cls, Map<MetricType, Long> map2, @NotNull d<? super ComposerAsyncWidgetResponse<T>> dVar) throws a;
}
