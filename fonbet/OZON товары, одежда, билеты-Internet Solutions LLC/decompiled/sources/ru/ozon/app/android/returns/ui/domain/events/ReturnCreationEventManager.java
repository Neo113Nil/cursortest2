package ru.ozon.app.android.returns.ui.domain.events;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Ae.w0;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEvent;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "", "<init>", "()V", "", "onPhotoUpdated", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "onItemRemoved", "LAe/w0;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent;", "mutableEvents", "LAe/w0;", "LAe/B0;", "events", "LAe/B0;", "getEvents", "()LAe/B0;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationEventManager {

    @NotNull
    private final B0<ReturnCreationEvent> events;

    @NotNull
    private final w0<ReturnCreationEvent> mutableEvents;

    public ReturnCreationEventManager() {
        C0 b11 = E0.b(0, 0, null, 7);
        this.mutableEvents = b11;
        this.events = b11;
    }

    @NotNull
    public final B0<ReturnCreationEvent> getEvents() {
        return this.events;
    }

    public final Object onItemRemoved(@NotNull d<? super Unit> dVar) {
        Object emit = this.mutableEvents.emit(ReturnCreationEvent.ItemRemoved.INSTANCE, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    public final Object onPhotoUpdated(@NotNull d<? super Unit> dVar) {
        Object emit = this.mutableEvents.emit(ReturnCreationEvent.PhotoUpdated.INSTANCE, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }
}
