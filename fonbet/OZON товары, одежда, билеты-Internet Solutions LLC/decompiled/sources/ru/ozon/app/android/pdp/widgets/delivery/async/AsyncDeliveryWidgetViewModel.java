package ru.ozon.app.android.pdp.widgets.delivery.async;

import He.b;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "asyncData", "", "fetchWidget", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;", "_events", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "events", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "Event", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AsyncDeliveryWidgetViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Event> _events;

    @NotNull
    private final P<Event> events;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;", "", "<init>", "()V", "OnWidgetFetched", "OnWidgetFetchingFailed", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event$OnWidgetFetchingFailed;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Event {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;", "widgetDto", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;)V", "getWidgetDto", "()Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnWidgetFetched extends Event {

            @NotNull
            private final ComposerAsyncWidgetResponse<DeliveryDTO> widgetDto;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetched(@NotNull ComposerAsyncWidgetResponse<DeliveryDTO> widgetDto) {
                super(null);
                Intrinsics.checkNotNullParameter(widgetDto, "widgetDto");
                this.widgetDto = widgetDto;
            }

            @NotNull
            public final ComposerAsyncWidgetResponse<DeliveryDTO> getWidgetDto() {
                return this.widgetDto;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event$OnWidgetFetchingFailed;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnWidgetFetchingFailed extends Event {

            @NotNull
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetchingFailed(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            @NotNull
            public final Throwable getError() {
                return this.error;
            }
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }
    }

    public AsyncDeliveryWidgetViewModel(@NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        SingleLiveEvent<Event> singleLiveEvent = new SingleLiveEvent<>();
        this._events = singleLiveEvent;
        this.events = singleLiveEvent;
    }

    public final void fetchWidget(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new AsyncDeliveryWidgetViewModel$fetchWidget$1(this, asyncData, null), 2);
    }

    @NotNull
    public final P<Event> getEvents() {
        return this.events;
    }
}
