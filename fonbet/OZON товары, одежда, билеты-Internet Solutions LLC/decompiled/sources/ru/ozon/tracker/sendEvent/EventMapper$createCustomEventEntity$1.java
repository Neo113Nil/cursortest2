package ru.ozon.tracker.sendEvent;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.EventMapper", f = "EventMapper.kt", l = {186}, m = "createCustomEventEntity")
/* loaded from: classes7.dex */
final class EventMapper$createCustomEventEntity$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMapper$createCustomEventEntity$1(EventMapper eventMapper, d<? super EventMapper$createCustomEventEntity$1> dVar) {
        super(dVar);
        this.this$0 = eventMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.createCustomEventEntity(null, null, this);
    }
}
