package ru.ozon.app.android.travel.utils.asyncWidget;

import Ae.E0;
import Ae.w0;
import androidx.lifecycle.K;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.tracker.performance.MetricType;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00060\u0004j\u0002`\u0005:\u0001AB+\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b%\u0010&JU\u0010.\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u001d\u001a\u00020\u001c2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0001\u0018\u00010)2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0018\u00010)H\u0004¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010;\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel;", "", "DTO", "VO", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "stateMapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "response", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "mapAsyncWidgetResponse", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "onCleared", "()V", "cancelJobs", "", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;", "asyncConfigs", "getUnfetchedData", "(Ljava/util/List;)Ljava/util/List;", "", "asyncData", "", "jobIsActive", "(Ljava/lang/String;)Z", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncMultipleRequestsWidgetCallbacks;", "callbacksHolder", "observeEvents", "(Landroidx/lifecycle/J;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncMultipleRequestsWidgetCallbacks;)V", "Ljava/lang/Class;", "stateType", "", "withParameters", "Lru/ozon/tracker/performance/MetricType;", "", "additionalMetrics", "fetchWidget", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "scope", "Lxe/M;", "", "Lxe/B0;", "fetchJobs", "Ljava/util/Map;", "LAe/w0;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event;", "fetchingEvents", "LAe/w0;", "Event", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> implements InterfaceC6786a {

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final Map<String, B0> fetchJobs;

    @NotNull
    private final w0<Event<VO>> fetchingEvents;

    @NotNull
    private final M scope;

    @NotNull
    private final AsyncWidgetStateMapper<DTO, VO> stateMapper;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event;", "VO", "", "<init>", "()V", "OnWidgetFetched", "OnWidgetFetchingFailed", "OnWidgetSkipped", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event$OnWidgetFetchingFailed;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event$OnWidgetSkipped;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Event<VO> {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event$OnWidgetFetched;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "", "asyncData", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "getFetchedModel", "()Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "Ljava/lang/String;", "getAsyncData", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetFetched<VO> extends Event<VO> {

            @NotNull
            private final String asyncData;

            @NotNull
            private final AsyncWidgetFetchedModel<VO> fetchedModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetched(@NotNull AsyncWidgetFetchedModel<VO> fetchedModel, @NotNull String asyncData) {
                super(null);
                Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
                Intrinsics.checkNotNullParameter(asyncData, "asyncData");
                this.fetchedModel = fetchedModel;
                this.asyncData = asyncData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnWidgetFetched)) {
                    return false;
                }
                OnWidgetFetched onWidgetFetched = (OnWidgetFetched) other;
                return Intrinsics.d(this.fetchedModel, onWidgetFetched.fetchedModel) && Intrinsics.d(this.asyncData, onWidgetFetched.asyncData);
            }

            @NotNull
            public final String getAsyncData() {
                return this.asyncData;
            }

            @NotNull
            public final AsyncWidgetFetchedModel<VO> getFetchedModel() {
                return this.fetchedModel;
            }

            public int hashCode() {
                return this.asyncData.hashCode() + (this.fetchedModel.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "OnWidgetFetched(fetchedModel=" + this.fetchedModel + ", asyncData=" + this.asyncData + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event$OnWidgetFetchingFailed;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event;", "throwable", "", "asyncData", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getThrowable", "()Ljava/lang/Throwable;", "getAsyncData", "()Ljava/lang/String;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnWidgetFetchingFailed<VO> extends Event<VO> {

            @NotNull
            private final String asyncData;

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetchingFailed(@NotNull Throwable throwable, @NotNull String asyncData) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(asyncData, "asyncData");
                this.throwable = throwable;
                this.asyncData = asyncData;
            }

            @NotNull
            public final String getAsyncData() {
                return this.asyncData;
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event$OnWidgetSkipped;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel$Event;", "<init>", "()V", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public AbstractAsyncMultipleRequestsWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull AsyncWidgetStateMapper<DTO, VO> stateMapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.stateMapper = stateMapper;
        this.dispatcherProvider = dispatcherProvider;
        AbstractAsyncMultipleRequestsWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1 abstractAsyncMultipleRequestsWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1 = new AbstractAsyncMultipleRequestsWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.exceptionHandler = abstractAsyncMultipleRequestsWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = N.a(CoroutineContext.Element.a.d(dispatcherProvider.getMainImmediate(), (H0) X0.b()).plus(abstractAsyncMultipleRequestsWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1));
        this.fetchJobs = new LinkedHashMap();
        this.fetchingEvents = E0.b(10, 0, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mapAsyncWidgetResponse(ComposerAsyncWidgetResponse<DTO> composerAsyncWidgetResponse, d<? super AsyncWidgetFetchedModel<VO>> dVar) {
        return C10727i.f(this.dispatcherProvider.getIO(), new AbstractAsyncMultipleRequestsWidgetViewModel$mapAsyncWidgetResponse$2(this, composerAsyncWidgetResponse, null), dVar);
    }

    public final void cancelJobs() {
        Iterator<T> it = this.fetchJobs.values().iterator();
        while (it.hasNext()) {
            ((B0) it.next()).j(null);
        }
        this.fetchJobs.clear();
    }

    protected final void fetchWidget(@NotNull Class<DTO> stateType, @NotNull String asyncData, Map<String, ? extends Object> withParameters, Map<MetricType, Long> additionalMetrics) {
        Intrinsics.checkNotNullParameter(stateType, "stateType");
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        if (this.fetchJobs.containsKey(asyncData)) {
            B0 b02 = this.fetchJobs.get(asyncData);
            if (b02 != null) {
                b02.j(null);
            }
            this.fetchJobs.remove(asyncData);
        }
        this.fetchJobs.put(asyncData, C10727i.c(this.scope, null, null, new AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1(this, asyncData, withParameters, stateType, additionalMetrics, null), 3));
    }

    @NotNull
    public final List<AsyncConfig> getUnfetchedData(@NotNull List<AsyncConfig> asyncConfigs) {
        Intrinsics.checkNotNullParameter(asyncConfigs, "asyncConfigs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : asyncConfigs) {
            if (!this.fetchJobs.containsKey(((AsyncConfig) obj).getAsyncData())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean jobIsActive(String asyncData) {
        B0 b02 = this.fetchJobs.get(asyncData);
        return b02 != null && b02.isActive();
    }

    public final void observeEvents(@NotNull androidx.lifecycle.J lifecycleOwner, @NotNull AsyncMultipleRequestsWidgetCallbacks<VO> callbacksHolder) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(callbacksHolder, "callbacksHolder");
        C10727i.c(K.a(lifecycleOwner), null, null, new AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1(lifecycleOwner, this, callbacksHolder, null), 3);
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.scope, null);
    }
}
