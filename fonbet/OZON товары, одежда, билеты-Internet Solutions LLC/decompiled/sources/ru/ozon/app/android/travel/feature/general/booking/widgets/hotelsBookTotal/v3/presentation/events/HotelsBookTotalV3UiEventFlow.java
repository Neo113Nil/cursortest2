package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events;

import Ae.InterfaceC2395h;
import Ae.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventFlow;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventEmitter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;", "event", "", "sendEvent", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;)V", "LAe/w0;", "mutableFlow", "LAe/w0;", "LAe/h;", "getFlow", "()LAe/h;", "flow", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3UiEventFlow implements HotelsBookTotalV3UiEventEmitter, HotelsBookTotalV3EventCollector {

    @NotNull
    private final w0<HotelsBookTotalV3UiEvent> mutableFlow = FlowUtilsKt.SingleEventsFlow();

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3EventCollector
    @NotNull
    public InterfaceC2395h<HotelsBookTotalV3UiEvent> getFlow() {
        return this.mutableFlow;
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEventEmitter
    public void sendEvent(@NotNull HotelsBookTotalV3UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.mutableFlow.tryEmit(event);
    }
}
