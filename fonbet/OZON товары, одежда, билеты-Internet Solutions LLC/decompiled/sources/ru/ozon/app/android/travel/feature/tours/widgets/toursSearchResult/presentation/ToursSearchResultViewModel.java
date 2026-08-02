package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import Qj0.A0;
import Qj0.B;
import Qj0.U;
import Xc.b;
import android.os.Parcelable;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.squareup.moshi.D;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.metrics.client.MetricsClient;
import ru.ozon.app.android.metrics.client.MetricsRequestData;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.animator.SearchPreloaderAnimator;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002yzB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0004\b\u001a\u0010\u0016J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014¢\u0006\u0004\b\u001c\u0010\u0016J\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0014¢\u0006\u0004\b \u0010\u0016J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0014¢\u0006\u0004\b\"\u0010\u0016J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0014¢\u0006\u0004\b$\u0010\u0016J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0014¢\u0006\u0004\b&\u0010\u0016J\u001d\u0010*\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0013J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00112\u0006\u00105\u001a\u00020-¢\u0006\u0004\b6\u00100J\u000f\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b7\u0010\u0013J\u000f\u00108\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u0010\u0013J%\u0010<\u001a\b\u0012\u0004\u0012\u00020:092\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010\u0013J\u0017\u0010C\u001a\u00020B2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0011H\u0002¢\u0006\u0004\bG\u0010\u0013J\u0017\u0010I\u001a\u00020\u00112\u0006\u00102\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJB\u0010R\u001a\u00020Q2\u0006\u0010K\u001a\u00020#2\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f\u0018\u00010L2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00110NH\u0082@¢\u0006\u0004\bR\u0010SJ-\u0010U\u001a\u00020T2\u0006\u0010K\u001a\u00020#2\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f\u0018\u00010LH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00112\u0006\u0010W\u001a\u00020OH\u0002¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010]R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010^R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010_R\u0018\u0010`\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010cR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010eR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010eR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010eR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010gR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010)\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010tR\u001c\u0010w\u001a\n v*\u0004\u0018\u00010u0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006{"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultApi;", "api", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;", "mapper", "Lru/ozon/app/android/metrics/client/MetricsClient;", "metricsClient", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultApi;Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;Lru/ozon/app/android/metrics/client/MetricsClient;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "", "onCleared", "()V", "Landroidx/lifecycle/P;", "showFlashBar", "()Landroidx/lifecycle/P;", "", "sendRefreshLiveData", "Lru/ozon/uni/atoms/af/AtomAction;", "handleTimeoutActionLiveData", "", "timerLiveData", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$LoaderState;", "showLoadingLiveData", "", "showEmptyStateLiveData", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$ToursState;", "resultLiveData", "", "preloaderTitleLiveData", "", "preloaderProgressLiveData", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "vo", "widgetName", "initialize", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;Ljava/lang/String;)V", "onTimerWentOff", "", "lastVisibleItemPosition", "loadNextPage", "(I)V", "Landroid/os/Parcelable;", "state", "saveLayoutManagerState", "(Landroid/os/Parcelable;)V", "width", "startPreloaderAnimation", "pollHotels", "onNextPageError", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "hotels", "prepareHotelsList", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelPlaceholder;", "getNewHotelPlaceholder", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelPlaceholder;", "stopAllJobs", "", "isUrlChanged", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;)Z", "saveInitialViewObject", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;Z)V", "showTimeoutError", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "showEmptyState", "(Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;)V", "actionName", "", "params", "Lkotlin/Function1;", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "metricsTracker", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;", "processHotelRequest", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/metrics/client/MetricsRequestData;", "createRequestData", "(Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/metrics/client/MetricsRequestData;", "metrics", "trackPerformance", "(Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultApi;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;", "Lru/ozon/app/android/metrics/client/MetricsClient;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "savedState", "Landroid/os/Parcelable;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/T;", "Landroidx/lifecycle/T;", "lastVo", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "isPaginationCompleted", "Z", "isLoadingNextPage", "Lxe/B0;", "loadNextPageJob", "Lxe/B0;", "pollHotelsJob", "Lru/ozon/app/android/travel/molecules/view/searchPreloader/animator/SearchPreloaderAnimator;", "preloaderAnimator", "Lru/ozon/app/android/travel/molecules/view/searchPreloader/animator/SearchPreloaderAnimator;", "Ljava/lang/String;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "mapType", "Ljava/lang/reflect/Type;", "LoaderState", "ToursState", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultViewModel extends w0 {

    @NotNull
    private final ToursSearchResultApi api;

    @NotNull
    private final SingleLiveEvent<AtomAction> handleTimeoutActionLiveData;
    private boolean isLoadingNextPage;
    private boolean isPaginationCompleted;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;
    private ToursSearchResultVO lastVo;
    private B0 loadNextPageJob;
    private final Type mapType;

    @NotNull
    private final ToursSearchResultMapper mapper;

    @NotNull
    private final MetricsClient metricsClient;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;
    private B0 pollHotelsJob;
    private SearchPreloaderAnimator preloaderAnimator;

    @NotNull
    private final T<Float> preloaderProgressLiveData;

    @NotNull
    private final T<String> preloaderTitleLiveData;

    @NotNull
    private final SingleLiveEvent<ToursState> resultLiveData;
    private Parcelable savedState;

    @NotNull
    private final SingleLiveEvent sendRefreshLiveData;

    @NotNull
    private final SingleLiveEvent<Object> showEmptyStateLiveData;

    @NotNull
    private final SingleLiveEvent<Unit> showFlashBar;

    @NotNull
    private final V<LoaderState> showLoadingLiveData;

    @NotNull
    private final SingleLiveEvent<Long> timerLiveData;
    private String widgetName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$LoaderState;", "", "<init>", "(Ljava/lang/String;I)V", "GONE", "VISIBLE", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoaderState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ LoaderState[] $VALUES;
        public static final LoaderState GONE = new LoaderState("GONE", 0);
        public static final LoaderState VISIBLE = new LoaderState("VISIBLE", 1);

        private static final /* synthetic */ LoaderState[] $values() {
            return new LoaderState[]{GONE, VISIBLE};
        }

        static {
            LoaderState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LoaderState(String str, int i11) {
        }

        public static LoaderState valueOf(String str) {
            return (LoaderState) Enum.valueOf(LoaderState.class, str);
        }

        public static LoaderState[] values() {
            return (LoaderState[]) $VALUES.clone();
        }
    }

    public ToursSearchResultViewModel(@NotNull ToursSearchResultApi api, @NotNull ToursSearchResultMapper mapper, @NotNull MetricsClient metricsClient, @NotNull JsonSerializer jsonSerializer, @NotNull JsonParser jsonDeserializer, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(metricsClient, "metricsClient");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        this.api = api;
        this.mapper = mapper;
        this.metricsClient = metricsClient;
        this.jsonSerializer = jsonSerializer;
        this.jsonDeserializer = jsonDeserializer;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.showLoadingLiveData = new V<>();
        this.showEmptyStateLiveData = new SingleLiveEvent<>();
        this.handleTimeoutActionLiveData = new SingleLiveEvent<>();
        this.resultLiveData = new SingleLiveEvent<>();
        this.timerLiveData = new SingleLiveEvent<>();
        this.sendRefreshLiveData = new SingleLiveEvent();
        this.showFlashBar = new SingleLiveEvent<>();
        this.preloaderTitleLiveData = new T<>();
        this.preloaderProgressLiveData = new T<>();
        this.mapType = D.e(Map.class, String.class, Object.class).getRawType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MetricsRequestData createRequestData(String actionName, Map<String, ? extends Object> params) {
        String str;
        String b11 = Nk.a.b("composer-api.bx/_action/", actionName);
        MetricsRequestData.RequestType requestType = MetricsRequestData.RequestType.POST;
        if (params != null) {
            JsonSerializer jsonSerializer = this.jsonSerializer;
            Type mapType = this.mapType;
            Intrinsics.checkNotNullExpressionValue(mapType, "mapType");
            str = jsonSerializer.toJson((JsonSerializer) params, mapType);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new MetricsRequestData(b11, requestType, null, str, 4, null);
    }

    private final ToursSearchResultVO.HotelPlaceholder getNewHotelPlaceholder() {
        return new ToursSearchResultVO.HotelPlaceholder(UUID.randomUUID().hashCode());
    }

    private final boolean isUrlChanged(ToursSearchResultVO vo) {
        return !Intrinsics.d(this.lastVo != null ? r0.getUrl() : null, vo.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextPageError() {
        List<ToursSearchResultVO.SearchResultItem> hotels;
        this.isPaginationCompleted = true;
        this.isLoadingNextPage = false;
        ToursSearchResultVO toursSearchResultVO = this.lastVo;
        if (toursSearchResultVO != null && (hotels = toursSearchResultVO.getHotels()) != null) {
            this.resultLiveData.setValue(new ToursState(hotels, null, false, 6, null));
        }
        this.showFlashBar.call();
    }

    private final void pollHotels() {
        ToursSearchResultVO.LoaderStateVO loaderState;
        this.showEmptyStateLiveData.setValue(null);
        ToursSearchResultVO toursSearchResultVO = this.lastVo;
        if (toursSearchResultVO != null && (loaderState = toursSearchResultVO.getLoaderState()) != null) {
            SearchPreloaderAnimator searchPreloaderAnimator = this.preloaderAnimator;
            if (searchPreloaderAnimator != null) {
                this.preloaderTitleLiveData.b(searchPreloaderAnimator.getTitleProgress());
                this.preloaderProgressLiveData.b(searchPreloaderAnimator.getAnimationProgress());
            }
            SearchPreloaderAnimator searchPreloaderAnimator2 = new SearchPreloaderAnimator(loaderState.getLoaderStatesText(), loaderState.getLoaderStatesPercent());
            this.preloaderTitleLiveData.a(searchPreloaderAnimator2.getTitleProgress(), new ToursSearchResultViewModelKt$sam$androidx_lifecycle_Observer$0(new ToursSearchResultViewModel$pollHotels$1$2$1(this.preloaderTitleLiveData)));
            this.preloaderProgressLiveData.a(searchPreloaderAnimator2.getAnimationProgress(), new ToursSearchResultViewModelKt$sam$androidx_lifecycle_Observer$0(new ToursSearchResultViewModel$pollHotels$1$2$2(this.preloaderProgressLiveData)));
            this.preloaderAnimator = searchPreloaderAnimator2;
            this.showLoadingLiveData.setValue(LoaderState.VISIBLE);
        }
        SingleLiveEvent<ToursState> singleLiveEvent = this.resultLiveData;
        ToursSearchResultVO toursSearchResultVO2 = this.lastVo;
        singleLiveEvent.setValue(new ToursState(prepareHotelsList(toursSearchResultVO2 != null ? toursSearchResultVO2.getHotels() : null), null, false, 6, null));
        this.pollHotelsJob = C10727i.c(x0.a(this), null, null, new ToursSearchResultViewModel$pollHotels$2(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ToursSearchResultVO.SearchResultItem> prepareHotelsList(List<? extends ToursSearchResultVO.SearchResultItem> hotels) {
        ToursSearchResultVO toursSearchResultVO = this.lastVo;
        boolean z11 = false;
        if (toursSearchResultVO != null && toursSearchResultVO.getIsAllDone()) {
            z11 = true;
        }
        if (z11 && this.isPaginationCompleted && hotels != 0) {
            return hotels;
        }
        List<? extends ToursSearchResultVO.SearchResultItem> list = hotels;
        return (list == null || list.isEmpty()) ? C7714v.b0(getNewHotelPlaceholder(), getNewHotelPlaceholder()) : z11 ? C7714v.q0(ToursSearchResultVO.NextPageLoader.INSTANCE, list) : C7714v.q0(getNewHotelPlaceholder(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processHotelRequest(String str, Map<String, ? extends Object> map, Function1<? super MetricsResponse.Metrics, Unit> function1, d<? super ToursSearchResultDTO> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new ToursSearchResultViewModel$processHotelRequest$2(this, str, map, function1, null), dVar);
    }

    private final void saveInitialViewObject(ToursSearchResultVO vo, boolean isUrlChanged) {
        stopAllJobs();
        if (this.lastVo == null || isUrlChanged) {
            this.lastVo = vo;
        }
        ToursSearchResultVO toursSearchResultVO = this.lastVo;
        this.isPaginationCompleted = (toursSearchResultVO != null ? toursSearchResultVO.getLazyLoadAction() : null) == null;
        this.isLoadingNextPage = false;
    }

    private final void showEmptyState(EmptyStateVO state) {
        this.lastVo = null;
        this.showEmptyStateLiveData.setValue(state);
    }

    private final void showTimeoutError() {
        AtomAction timeoutAction;
        ToursSearchResultVO toursSearchResultVO = this.lastVo;
        if (toursSearchResultVO == null || (timeoutAction = toursSearchResultVO.getTimeoutAction()) == null) {
            return;
        }
        this.handleTimeoutActionLiveData.setValue(timeoutAction);
    }

    private final void stopAllJobs() {
        B0 b02 = this.pollHotelsJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.loadNextPageJob;
        if (b03 != null) {
            b03.j(null);
        }
        this.pollHotelsJob = null;
        this.loadNextPageJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPerformance(MetricsResponse.Metrics metrics) {
        U trace = metrics.getTrace();
        if (trace == null) {
            return;
        }
        U.p(trace, MetricType.TOTAL_TIME_END, 0L, false, 6);
        String str = this.widgetName;
        if (str != null) {
            trace.n(new A0(str), true);
        }
        trace.n(new B(ObjectTypes.ACTION), true);
        this.performanceTrackerDelegate.beginTrace(trace);
        this.performanceTrackerDelegate.endTrace(metrics.getUuid(), kotlin.collections.U.c());
    }

    @NotNull
    public final P<AtomAction> handleTimeoutActionLiveData() {
        return this.handleTimeoutActionLiveData;
    }

    public final void initialize(@NotNull ToursSearchResultVO vo, @NotNull String widgetName) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        this.widgetName = widgetName;
        if (this.savedState != null && this.lastVo != null && !vo.getIsAllDone()) {
            SingleLiveEvent<ToursState> singleLiveEvent = this.resultLiveData;
            ToursSearchResultVO toursSearchResultVO = this.lastVo;
            singleLiveEvent.setValue(new ToursState(prepareHotelsList(toursSearchResultVO != null ? toursSearchResultVO.getHotels() : null), this.savedState, false, 4, null));
            this.savedState = null;
            return;
        }
        B0 b02 = this.pollHotelsJob;
        if (b02 == null || !b02.isActive()) {
            boolean isUrlChanged = isUrlChanged(vo);
            saveInitialViewObject(vo, isUrlChanged);
            ToursSearchResultVO toursSearchResultVO2 = this.lastVo;
            if (toursSearchResultVO2 == null || !toursSearchResultVO2.getIsAllDone()) {
                pollHotels();
                return;
            }
            this.showLoadingLiveData.setValue(LoaderState.GONE);
            SearchPreloaderAnimator searchPreloaderAnimator = this.preloaderAnimator;
            if (searchPreloaderAnimator != null) {
                searchPreloaderAnimator.stopAnimation();
            }
            if (toursSearchResultVO2.isErrorOccurred()) {
                showEmptyState(toursSearchResultVO2.getErrorMessage());
                return;
            }
            this.showEmptyStateLiveData.setValue(null);
            this.timerLiveData.setValue(toursSearchResultVO2.getTimeout());
            this.resultLiveData.setValue(new ToursState(prepareHotelsList(toursSearchResultVO2.getHotels()), this.savedState, isUrlChanged));
            this.savedState = null;
        }
    }

    public final void loadNextPage(int lastVisibleItemPosition) {
        ToursSearchResultVO toursSearchResultVO = this.lastVo;
        if (toursSearchResultVO == null || !toursSearchResultVO.getIsAllDone() || toursSearchResultVO.getHotels() == null || this.isPaginationCompleted || this.isLoadingNextPage || toursSearchResultVO.getHotels().size() - lastVisibleItemPosition > 7) {
            return;
        }
        this.isLoadingNextPage = true;
        this.loadNextPageJob = C10727i.c(x0.a(this), null, null, new ToursSearchResultViewModel$loadNextPage$1$1(toursSearchResultVO, this, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        SearchPreloaderAnimator searchPreloaderAnimator = this.preloaderAnimator;
        if (searchPreloaderAnimator != null) {
            searchPreloaderAnimator.stopAnimation();
        }
        super.onCleared();
    }

    public final void onTimerWentOff() {
        stopAllJobs();
        this.savedState = null;
        showTimeoutError();
        this.lastVo = null;
    }

    @NotNull
    public final P<Float> preloaderProgressLiveData() {
        return this.preloaderProgressLiveData;
    }

    @NotNull
    public final P<String> preloaderTitleLiveData() {
        return this.preloaderTitleLiveData;
    }

    @NotNull
    public final P<ToursState> resultLiveData() {
        return this.resultLiveData;
    }

    public final void saveLayoutManagerState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.savedState = state;
    }

    @NotNull
    public final P sendRefreshLiveData() {
        return this.sendRefreshLiveData;
    }

    @NotNull
    public final P<Object> showEmptyStateLiveData() {
        return this.showEmptyStateLiveData;
    }

    @NotNull
    public final P<Unit> showFlashBar() {
        return this.showFlashBar;
    }

    @NotNull
    public final P<LoaderState> showLoadingLiveData() {
        return this.showLoadingLiveData;
    }

    public final void startPreloaderAnimation(int width) {
        SearchPreloaderAnimator searchPreloaderAnimator = this.preloaderAnimator;
        if (searchPreloaderAnimator != null) {
            searchPreloaderAnimator.startAnimation(x0.a(this), width);
        }
    }

    @NotNull
    public final P<Long> timerLiveData() {
        return this.timerLiveData;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$ToursState;", "", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "items", "Landroid/os/Parcelable;", "layoutManagerState", "", "isUrlChanged", "<init>", "(Ljava/util/List;Landroid/os/Parcelable;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "Z", "()Z", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToursState {
        private final boolean isUrlChanged;

        @NotNull
        private final List<ToursSearchResultVO.SearchResultItem> items;
        private final Parcelable layoutManagerState;

        /* JADX WARN: Multi-variable type inference failed */
        public ToursState(@NotNull List<? extends ToursSearchResultVO.SearchResultItem> items, Parcelable parcelable, boolean z11) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.layoutManagerState = parcelable;
            this.isUrlChanged = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToursState)) {
                return false;
            }
            ToursState toursState = (ToursState) other;
            return Intrinsics.d(this.items, toursState.items) && Intrinsics.d(this.layoutManagerState, toursState.layoutManagerState) && this.isUrlChanged == toursState.isUrlChanged;
        }

        @NotNull
        public final List<ToursSearchResultVO.SearchResultItem> getItems() {
            return this.items;
        }

        public final Parcelable getLayoutManagerState() {
            return this.layoutManagerState;
        }

        public int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            Parcelable parcelable = this.layoutManagerState;
            return Boolean.hashCode(this.isUrlChanged) + ((hashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        /* renamed from: isUrlChanged, reason: from getter */
        public final boolean getIsUrlChanged() {
            return this.isUrlChanged;
        }

        @NotNull
        public String toString() {
            List<ToursSearchResultVO.SearchResultItem> list = this.items;
            Parcelable parcelable = this.layoutManagerState;
            boolean z11 = this.isUrlChanged;
            StringBuilder sb2 = new StringBuilder("ToursState(items=");
            sb2.append(list);
            sb2.append(", layoutManagerState=");
            sb2.append(parcelable);
            sb2.append(", isUrlChanged=");
            return Pk0.a.a(")", sb2, z11);
        }

        public /* synthetic */ ToursState(List list, Parcelable parcelable, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? null : parcelable, (i11 & 4) != 0 ? false : z11);
        }
    }
}
