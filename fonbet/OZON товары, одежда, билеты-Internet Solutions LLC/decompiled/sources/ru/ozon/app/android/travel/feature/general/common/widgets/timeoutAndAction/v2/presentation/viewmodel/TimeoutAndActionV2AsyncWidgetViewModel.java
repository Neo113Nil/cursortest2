package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Ae.C;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.G;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Bl.C2639a;
import De.C2862e;
import E0.C2942q;
import Pk0.c;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.recyclerview.widget.LinearLayoutManager;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2Mapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2VO;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 82\u00060\u0001j\u0002`\u0002:\u000389:B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ+\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ+\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\b\u0011\u0010#J#\u0010(\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130&¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2Mapper;", "mapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchers", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2Mapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "LAe/h;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$FetchingModel;", "delayOnEach", "(LAe/h;)LAe/h;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "fetchWidget", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "mapResponse", "T", "retryOnErrorWithDelay", "sendSuccessEvent", "sendErrorEvent", "", "onCleared", "()V", "", "pollingDelayMs", "", "asyncData", "", "", "params", "(JLjava/lang/String;Ljava/util/Map;)V", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "callbacksHolder", "collectEvents", "(Landroidx/lifecycle/v;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2Mapper;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event;", "eventsFlow", "LAe/w0;", "fetchingFlow", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "scope", "Lxe/M;", "Companion", "FetchingModel", "Event", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutAndActionV2AsyncWidgetViewModel implements InterfaceC6786a {

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;

    @NotNull
    private final CoroutineDispatcherProvider dispatchers;

    @NotNull
    private final w0<Event> eventsFlow;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final w0<FetchingModel> fetchingFlow;

    @NotNull
    private final TimeoutAndActionV2Mapper mapper;

    @NotNull
    private final M scope;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event;", "", "<init>", "()V", "OnWidgetFetched", "OnWidgetFetchingFailed", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event$OnWidgetFetchingFailed;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Event {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "fetchedModel", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "getFetchedModel", "()Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetFetched extends Event {
            public static final int $stable = AsyncWidgetFetchedModel.$stable;

            @NotNull
            private final AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State> fetchedModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetched(@NotNull AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State> fetchedModel) {
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
            public final AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State> getFetchedModel() {
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

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event$OnWidgetFetchingFailed;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$Event;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnWidgetFetchingFailed extends Event {

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

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel$FetchingModel;", "", "", "asyncData", "", "pollingDelayMs", "", "params", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "J", "getPollingDelayMs", "()J", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchingModel {
        private final String asyncData;
        private final Map<String, Object> params;
        private final long pollingDelayMs;

        public FetchingModel(String str, long j11, Map<String, ? extends Object> map) {
            this.asyncData = str;
            this.pollingDelayMs = j11;
            this.params = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchingModel)) {
                return false;
            }
            FetchingModel fetchingModel = (FetchingModel) other;
            return Intrinsics.d(this.asyncData, fetchingModel.asyncData) && this.pollingDelayMs == fetchingModel.pollingDelayMs && Intrinsics.d(this.params, fetchingModel.params);
        }

        public final String getAsyncData() {
            return this.asyncData;
        }

        public final Map<String, Object> getParams() {
            return this.params;
        }

        public final long getPollingDelayMs() {
            return this.pollingDelayMs;
        }

        public int hashCode() {
            String str = this.asyncData;
            int a11 = c.a((str == null ? 0 : str.hashCode()) * 31, 31, this.pollingDelayMs);
            Map<String, Object> map = this.params;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.asyncData;
            long j11 = this.pollingDelayMs;
            return C2639a.b(C2942q.d(j11, "FetchingModel(asyncData=", str, ", pollingDelayMs="), ", params=", this.params, ")");
        }
    }

    public TimeoutAndActionV2AsyncWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull TimeoutAndActionV2Mapper mapper, @NotNull CoroutineDispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.mapper = mapper;
        this.dispatchers = dispatchers;
        this.eventsFlow = FlowUtilsKt.SingleEventsFlow();
        C0 b11 = E0.b(1, 0, null, 6);
        this.fetchingFlow = b11;
        TimeoutAndActionV2AsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1 timeoutAndActionV2AsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1 = new TimeoutAndActionV2AsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.exceptionHandler = timeoutAndActionV2AsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1;
        C2862e a11 = N.a(CoroutineContext.Element.a.d(dispatchers.getDefault(), (H0) X0.b()).plus(timeoutAndActionV2AsyncWidgetViewModel$special$$inlined$CoroutineExceptionHandler$1));
        this.scope = a11;
        C2399j.C(sendErrorEvent(sendSuccessEvent(retryOnErrorWithDelay(mapResponse(fetchWidget(delayOnEach(b11)))))), a11);
    }

    private final InterfaceC2395h<FetchingModel> delayOnEach(InterfaceC2395h<FetchingModel> interfaceC2395h) {
        return new C2408n0(interfaceC2395h, new TimeoutAndActionV2AsyncWidgetViewModel$delayOnEach$1(null));
    }

    private final InterfaceC2395h<AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>> mapResponse(final InterfaceC2395h<ComposerAsyncWidgetResponse<TimeoutAndActionV2DTO>> interfaceC2395h) {
        return new InterfaceC2395h<AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$mapResponse$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$mapResponse$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ TimeoutAndActionV2AsyncWidgetViewModel this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$mapResponse$$inlined$map$1$2", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$mapResponse$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, TimeoutAndActionV2AsyncWidgetViewModel timeoutAndActionV2AsyncWidgetViewModel) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = timeoutAndActionV2AsyncWidgetViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    TimeoutAndActionV2Mapper timeoutAndActionV2Mapper;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                                timeoutAndActionV2Mapper = this.this$0.mapper;
                                AsyncWidgetFetchedModel asyncWidgetFetchedModel = new AsyncWidgetFetchedModel(timeoutAndActionV2Mapper.mapAsyncState((TimeoutAndActionV2DTO) composerAsyncWidgetResponse.getState()), composerAsyncWidgetResponse.getTrackingPayloads(), composerAsyncWidgetResponse.getMetrics());
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(asyncWidgetFetchedModel, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    private final <T> InterfaceC2395h<T> retryOnErrorWithDelay(InterfaceC2395h<? extends T> interfaceC2395h) {
        return new G(interfaceC2395h, new TimeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1(null));
    }

    private final InterfaceC2395h<AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>> sendErrorEvent(InterfaceC2395h<AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>> interfaceC2395h) {
        return new C(interfaceC2395h, new TimeoutAndActionV2AsyncWidgetViewModel$sendErrorEvent$1(this, null));
    }

    private final InterfaceC2395h<AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>> sendSuccessEvent(InterfaceC2395h<AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State>> interfaceC2395h) {
        return new C2408n0(interfaceC2395h, new TimeoutAndActionV2AsyncWidgetViewModel$sendSuccessEvent$1(this, null));
    }

    public final void collectEvents(@NotNull AbstractC5434v lifecycle, @NotNull AsyncWidgetCallbacks<TimeoutAndActionV2VO.State> callbacksHolder) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(callbacksHolder, "callbacksHolder");
        C2399j.C(C2399j.B(new C2408n0(C5427n.a(this.eventsFlow, lifecycle, AbstractC5434v.b.STARTED), new TimeoutAndActionV2AsyncWidgetViewModel$collectEvents$1(callbacksHolder, null)), this.dispatchers.getMainImmediate()), this.scope);
    }

    public final void fetchWidget(long pollingDelayMs, String asyncData, Map<String, ? extends Object> params) {
        C10727i.c(this.scope, null, null, new TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$1(this, asyncData, pollingDelayMs, params, null), 3);
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.scope, null);
    }

    private final InterfaceC2395h<ComposerAsyncWidgetResponse<TimeoutAndActionV2DTO>> fetchWidget(InterfaceC2395h<FetchingModel> interfaceC2395h) {
        return C2399j.Q(interfaceC2395h, new TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$$inlined$flatMapLatest$1(null, this));
    }
}
