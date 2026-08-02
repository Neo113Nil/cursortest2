package ru.ozon.tracker.sendEvent.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.repository.EventRepositoryImpl", f = "EventRepositoryImpl.kt", l = {90}, m = "saveEvents")
/* loaded from: classes3.dex */
final class EventRepositoryImpl$saveEvents$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventRepositoryImpl$saveEvents$1(EventRepositoryImpl eventRepositoryImpl, d<? super EventRepositoryImpl$saveEvents$1> dVar) {
        super(dVar);
        this.this$0 = eventRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.saveEvents(null, this);
    }
}
