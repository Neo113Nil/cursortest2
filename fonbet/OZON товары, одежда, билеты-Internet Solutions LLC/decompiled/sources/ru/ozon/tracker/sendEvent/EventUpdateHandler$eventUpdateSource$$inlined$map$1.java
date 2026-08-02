package ru.ozon.tracker.sendEvent;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.EventUpdateHandler;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LAe/h;", "LAe/i;", "collector", "", "collect", "(LAe/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventUpdateHandler$eventUpdateSource$$inlined$map$1 implements InterfaceC2395h<EventUpdateHandler.UpdateState> {
    final /* synthetic */ InterfaceC2395h $this_unsafeTransform$inlined;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.tracker.sendEvent.EventUpdateHandler$eventUpdateSource$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements InterfaceC2397i {
        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "ru.ozon.tracker.sendEvent.EventUpdateHandler$eventUpdateSource$$inlined$map$1$2", f = "EventUpdateHandler.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.tracker.sendEvent.EventUpdateHandler$eventUpdateSource$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= LinearLayoutManager.INVALID_OFFSET;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
            this.$this_unsafeFlow = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull d dVar) {
            AnonymousClass1 anonymousClass1;
            int i11;
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
                        EventUpdateHandler.UpdateState updateState = EventUpdateHandler.UpdateState.IDLE;
                        anonymousClass1.label = 1;
                        if (interfaceC2397i.emit(updateState, anonymousClass1) == aVar) {
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

        public final Object emit$$forInline(Object obj, @NotNull d dVar) {
            new AnonymousClass1(dVar);
            this.$this_unsafeFlow.emit(EventUpdateHandler.UpdateState.IDLE, dVar);
            return Unit.f71690a;
        }
    }

    public EventUpdateHandler$eventUpdateSource$$inlined$map$1(InterfaceC2395h interfaceC2395h) {
        this.$this_unsafeTransform$inlined = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public Object collect(@NotNull InterfaceC2397i<? super EventUpdateHandler.UpdateState> interfaceC2397i, @NotNull d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(interfaceC2397i), dVar);
        return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }

    public Object collect$$forInline(@NotNull InterfaceC2397i interfaceC2397i, @NotNull d dVar) {
        new c(dVar) { // from class: ru.ozon.tracker.sendEvent.EventUpdateHandler$eventUpdateSource$$inlined$map$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= LinearLayoutManager.INVALID_OFFSET;
                return EventUpdateHandler$eventUpdateSource$$inlined$map$1.this.collect(null, this);
            }
        };
        this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(interfaceC2397i), dVar);
        return Unit.f71690a;
    }
}
