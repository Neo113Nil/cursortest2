package ru.ozon.tracker.sendEvent;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl", f = "EventManager.kt", l = {586}, m = "clearObsoleteEvents")
/* loaded from: classes7.dex */
final class EventManagerImpl$clearObsoleteEvents$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$clearObsoleteEvents$1(EventManagerImpl eventManagerImpl, d<? super EventManagerImpl$clearObsoleteEvents$1> dVar) {
        super(dVar);
        this.this$0 = eventManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object clearObsoleteEvents;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        clearObsoleteEvents = this.this$0.clearObsoleteEvents(this);
        return clearObsoleteEvents;
    }
}
