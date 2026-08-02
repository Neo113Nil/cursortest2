package ru.ozon.tracker.sendEvent;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.EventMapper", f = "EventMapper.kt", l = {275}, m = "getUser")
/* loaded from: classes7.dex */
final class EventMapper$getUser$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMapper$getUser$1(EventMapper eventMapper, d<? super EventMapper$getUser$1> dVar) {
        super(dVar);
        this.this$0 = eventMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object user;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        user = this.this$0.getUser(null, null, this);
        return user;
    }
}
