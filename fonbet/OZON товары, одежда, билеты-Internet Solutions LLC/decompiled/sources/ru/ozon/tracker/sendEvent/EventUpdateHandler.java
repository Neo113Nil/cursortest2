package ru.ozon.tracker.sendEvent;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Xc.a;
import fi0.q;
import hi0.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import ve.EnumC10311b;
import xe.I;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102$\b\u0004\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102$\b\u0002\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/tracker/sendEvent/EventUpdateHandler;", "", "Lru/ozon/tracker/sendEvent/repository/EventRepository;", "eventRepository", "Lxe/I;", "ioDispatcher", "Lfi0/q;", "Lkotlin/time/b;", "productSendingPeriodProvider", "<init>", "(Lru/ozon/tracker/sendEvent/repository/EventRepository;Lxe/I;Lfi0/q;)V", "Lkotlin/Function2;", "", "Lkotlin/coroutines/d;", "", "onPreHandledError", "LAe/h;", "Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;", "eventUpdateSource", "(Lkotlin/jvm/functions/Function2;)LAe/h;", "timerUpdateSource", "()LAe/h;", "getUpdateObservable", "Lru/ozon/tracker/sendEvent/repository/EventRepository;", "Lxe/I;", "Lfi0/q;", "UpdateState", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventUpdateHandler {

    @NotNull
    private final EventRepository eventRepository;

    @NotNull
    private final I ioDispatcher;

    @NotNull
    private final q<b> productSendingPeriodProvider;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "FORCE", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ UpdateState[] $VALUES;
        public static final UpdateState IDLE = new UpdateState("IDLE", 0);
        public static final UpdateState FORCE = new UpdateState("FORCE", 1);

        private static final /* synthetic */ UpdateState[] $values() {
            return new UpdateState[]{IDLE, FORCE};
        }

        static {
            UpdateState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private UpdateState(String str, int i11) {
        }

        @NotNull
        public static a<UpdateState> getEntries() {
            return $ENTRIES;
        }

        public static UpdateState valueOf(String str) {
            return (UpdateState) Enum.valueOf(UpdateState.class, str);
        }

        public static UpdateState[] values() {
            return (UpdateState[]) $VALUES.clone();
        }
    }

    public EventUpdateHandler(@NotNull EventRepository eventRepository, @NotNull I ioDispatcher, @NotNull q<b> productSendingPeriodProvider) {
        Intrinsics.checkNotNullParameter(eventRepository, "eventRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(productSendingPeriodProvider, "productSendingPeriodProvider");
        this.eventRepository = eventRepository;
        this.ioDispatcher = ioDispatcher;
        this.productSendingPeriodProvider = productSendingPeriodProvider;
    }

    private final InterfaceC2395h<UpdateState> eventUpdateSource(Function2<? super Throwable, ? super d<? super Unit>, ? extends Object> onPreHandledError) {
        InterfaceC2395h o11 = C2399j.o(this.eventRepository.onChangedEvents());
        b.Companion companion = b.INSTANCE;
        return ExtensionKt.m1669asSafeFlowdWUq8MI$default(new EventUpdateHandler$eventUpdateSource$$inlined$map$1(C2399j.n(o11, c.g(300, EnumC10311b.MILLISECONDS))), 0L, 0, new EventUpdateHandler$eventUpdateSource$2(onPreHandledError, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC2395h getUpdateObservable$default(EventUpdateHandler eventUpdateHandler, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function2 = new EventUpdateHandler$getUpdateObservable$1(null);
        }
        return eventUpdateHandler.getUpdateObservable(function2);
    }

    private final InterfaceC2395h<UpdateState> timerUpdateSource() {
        return ExtensionKt.m1669asSafeFlowdWUq8MI$default(g.a(this.productSendingPeriodProvider, new EventUpdateHandler$timerUpdateSource$1(null)), 0L, 0, null, 7, null);
    }

    @NotNull
    public final InterfaceC2395h<UpdateState> getUpdateObservable(@NotNull Function2<? super Throwable, ? super d<? super Unit>, ? extends Object> onPreHandledError) {
        Intrinsics.checkNotNullParameter(onPreHandledError, "onPreHandledError");
        InterfaceC2395h o11 = C2399j.o(this.eventRepository.onChangedEvents());
        b.Companion companion = b.INSTANCE;
        return C2399j.B(C2399j.F(ExtensionKt.m1669asSafeFlowdWUq8MI$default(new EventUpdateHandler$eventUpdateSource$$inlined$map$1(C2399j.n(o11, c.g(300, EnumC10311b.MILLISECONDS))), 0L, 0, new EventUpdateHandler$getUpdateObservable$$inlined$eventUpdateSource$1(onPreHandledError, null), 3, null), timerUpdateSource()), this.ioDispatcher);
    }
}
