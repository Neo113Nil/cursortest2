package ru.ozon.tracker.sendEvent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import ru.ozon.tracker.sendEvent.runner.EventDelayedTaskLauncher;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EventManagerImpl$sendTrinityEventInternal$1 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ boolean $isFastEventConfirmed;
    final /* synthetic */ EventManagerImpl this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.tracker.sendEvent.EventManagerImpl$sendTrinityEventInternal$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<d<? super Unit>, Object> {
        AnonymousClass1(Object obj) {
            super(1, obj, EventManagerImpl.class, "syncForceSendEvents", "syncForceSendEvents(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d<? super Unit> dVar) {
            return ((EventManagerImpl) this.receiver).syncForceSendEvents(dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$sendTrinityEventInternal$1(boolean z11, EventManagerImpl eventManagerImpl) {
        super(1);
        this.$isFastEventConfirmed = z11;
        this.this$0 = eventManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        EventDelayedTaskLauncher eventDelayedTaskLauncher;
        if (this.$isFastEventConfirmed) {
            eventDelayedTaskLauncher = this.this$0.getEventDelayedTaskLauncher();
            eventDelayedTaskLauncher.launch(new AnonymousClass1(this.this$0));
        }
    }
}
