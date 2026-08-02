package ru.ozon.tracker.sendEvent;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl", f = "EventManager.kt", l = {611}, m = "mapToHandled-1vKEnOE")
/* loaded from: classes7.dex */
final class EventManagerImpl$mapToHandled$1<T> extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$mapToHandled$1(EventManagerImpl eventManagerImpl, d<? super EventManagerImpl$mapToHandled$1> dVar) {
        super(dVar);
        this.this$0 = eventManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m1666mapToHandled1vKEnOE;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        m1666mapToHandled1vKEnOE = this.this$0.m1666mapToHandled1vKEnOE(null, null, this);
        return m1666mapToHandled1vKEnOE == a.COROUTINE_SUSPENDED ? m1666mapToHandled1vKEnOE : r.a(m1666mapToHandled1vKEnOE);
    }
}
