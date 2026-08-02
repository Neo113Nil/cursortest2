package ru.ozon.tracker.sendEvent;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.EventMapper", f = "EventMapper.kt", l = {157}, m = "createEventBody")
/* loaded from: classes7.dex */
final class EventMapper$createEventBody$1 extends c {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$20;
    Object L$21;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMapper$createEventBody$1(EventMapper eventMapper, d<? super EventMapper$createEventBody$1> dVar) {
        super(dVar);
        this.this$0 = eventMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object createEventBody;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        createEventBody = this.this$0.createEventBody(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this);
        return createEventBody;
    }
}
