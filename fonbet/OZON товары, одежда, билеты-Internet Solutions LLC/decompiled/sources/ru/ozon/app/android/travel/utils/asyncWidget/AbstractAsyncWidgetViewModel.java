package ru.ozon.app.android.travel.utils.asyncWidget;

import Ae.C2399j;
import Ae.C2408n0;
import androidx.lifecycle.C5429p;
import androidx.lifecycle.P;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.travel.utils.utils.AsyncWidgetPerformanceTrackerKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00060\u0004j\u0002`\u0005:\u0001BB7\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016¢\u0006\u0004\b#\u0010$J)\u0010\u001e\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0004¢\u0006\u0004\b\u001e\u0010%J=\u0010+\u001a\u00020\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010(\u001a\u00020 2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010)H\u0004¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010;0>8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "", "DTO", "VO", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "stateMapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "response", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "mapAsyncWidgetResponse", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "onCleared", "()V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "callbacksHolder", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "traceWidgetNameProvider", "observeEvents", "(Landroidx/lifecycle/J;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;)V", "", "widgetName", "fetchedModel", "trackPerformance", "(Ljava/lang/String;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;)V", "Ljava/lang/Class;", "stateType", "asyncData", "", "withParameters", "fetchWidget", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "scope", "Lxe/M;", "Lxe/B0;", "fetchJob", "Lxe/B0;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;", "eventsLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "events", "Event", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AbstractAsyncWidgetViewModel<DTO, VO> implements InterfaceC6786a {

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final SingleLiveEvent<Event<VO>> eventsLiveData;

    @NotNull
    private final J exceptionHandler;
    private B0 fetchJob;
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final M scope;

    @NotNull
    private final AsyncWidgetStateMapper<DTO, VO> stateMapper;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;", "VO", "", "<init>", "()V", "OnWidgetFetched", "OnWidgetFetchingFailed", "OnWidgetSkipped", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event$OnWidgetFetchingFailed;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event$OnWidgetSkipped;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Event<VO> {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event$OnWidgetFetched;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "getFetchedModel", "()Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetFetched<VO> extends Event<VO> {

            @NotNull
            private final AsyncWidgetFetchedModel<VO> fetchedModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetched(@NotNull AsyncWidgetFetchedModel<VO> fetchedModel) {
                super(null);
                Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
                this.fetchedModel = fetchedModel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnWidgetFetched) && Intrinsics.d(this.fetchedModel, ((OnWidgetFetched) other).fetchedModel);
            }

            @NotNull
            public final AsyncWidgetFetchedModel<VO> getFetchedModel() {
                return this.fetchedModel;
            }

            public int hashCode() {
                return this.fetchedModel.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnWidgetFetched(fetchedModel=" + this.fetchedModel + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event$OnWidgetFetchingFailed;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnWidgetFetchingFailed<VO> extends Event<VO> {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetchingFailed(@NotNull Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event$OnWidgetSkipped;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;", "<init>", "()V", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnWidgetSkipped<VO> extends Event<VO> {
            public OnWidgetSkipped() {
                super(null);
            }
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }
    }

    public AbstractAsyncWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull AsyncWidgetStateMapper<DTO, VO> stateMapper, @NotNull CoroutineDispatcherProvider dispatcherProvider, PerformanceTrackerDelegate performanceTrackerDelegate) {
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.stateMapper = stateMapper;
        this.dispatcherProvider = dispatcherProvider;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        AbstractAsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1 abstractAsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1 = new AbstractAsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.exceptionHandler = abstractAsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = N.a(CoroutineContext.Element.a.d(dispatcherProvider.getMainImmediate(), (H0) X0.b()).plus(abstractAsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1));
        this.eventsLiveData = new SingleLiveEvent<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchWidget$default(AbstractAsyncWidgetViewModel abstractAsyncWidgetViewModel, Class cls, String str, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchWidget");
        }
        if ((i11 & 4) != 0) {
            map = null;
        }
        abstractAsyncWidgetViewModel.fetchWidget(cls, str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mapAsyncWidgetResponse(ComposerAsyncWidgetResponse<DTO> composerAsyncWidgetResponse, d<? super AsyncWidgetFetchedModel<VO>> dVar) {
        return C10727i.f(this.dispatcherProvider.getIO(), new AbstractAsyncWidgetViewModel$mapAsyncWidgetResponse$2(this, composerAsyncWidgetResponse, null), dVar);
    }

    public static /* synthetic */ void observeEvents$default(AbstractAsyncWidgetViewModel abstractAsyncWidgetViewModel, androidx.lifecycle.J j11, AsyncWidgetCallbacks asyncWidgetCallbacks, AsyncWidgetTraceNameProvider asyncWidgetTraceNameProvider, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeEvents");
        }
        if ((i11 & 4) != 0) {
            asyncWidgetTraceNameProvider = null;
        }
        abstractAsyncWidgetViewModel.observeEvents(j11, asyncWidgetCallbacks, asyncWidgetTraceNameProvider);
    }

    protected final void fetchWidget(@NotNull Class<DTO> stateType, @NotNull String asyncData, Map<String, ? extends Object> withParameters) {
        Intrinsics.checkNotNullParameter(stateType, "stateType");
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        B0 b02 = this.fetchJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.fetchJob = C10727i.c(this.scope, null, null, new AbstractAsyncWidgetViewModel$fetchWidget$1(withParameters, this, asyncData, stateType, null), 3);
    }

    @NotNull
    public final P<Event<VO>> getEvents() {
        return this.eventsLiveData;
    }

    public final void observeEvents(@NotNull androidx.lifecycle.J lifecycleOwner, @NotNull AsyncWidgetCallbacks<VO> callbacksHolder, AsyncWidgetTraceNameProvider traceWidgetNameProvider) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(callbacksHolder, "callbacksHolder");
        getEvents().observe(lifecycleOwner, new AbstractAsyncWidgetViewModel$sam$androidx_lifecycle_Observer$0(new AbstractAsyncWidgetViewModel$observeEvents$1(callbacksHolder, traceWidgetNameProvider, this)));
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.scope, null);
    }

    public void trackPerformance(@NotNull String widgetName, @NotNull AsyncWidgetFetchedModel<VO> fetchedModel) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        PerformanceTrackerDelegate performanceTrackerDelegate = this.performanceTrackerDelegate;
        if (performanceTrackerDelegate != null) {
            AsyncWidgetPerformanceTrackerKt.trackAsyncWidgetEndTime(performanceTrackerDelegate, widgetName, fetchedModel.getMetrics());
        }
    }

    protected final void observeEvents(@NotNull AsyncWidgetCallbacks<VO> callbacksHolder, AsyncWidgetTraceNameProvider traceWidgetNameProvider) {
        Intrinsics.checkNotNullParameter(callbacksHolder, "callbacksHolder");
        C2399j.C(new C2408n0(C5429p.a(getEvents()), new AbstractAsyncWidgetViewModel$observeEvents$2(callbacksHolder, traceWidgetNameProvider, this, null)), this.scope);
    }

    public /* synthetic */ AbstractAsyncWidgetViewModel(ComposerAsyncWidgetRepository composerAsyncWidgetRepository, AsyncWidgetStateMapper asyncWidgetStateMapper, CoroutineDispatcherProvider coroutineDispatcherProvider, PerformanceTrackerDelegate performanceTrackerDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerAsyncWidgetRepository, asyncWidgetStateMapper, coroutineDispatcherProvider, (i11 & 8) != 0 ? null : performanceTrackerDelegate);
    }
}
