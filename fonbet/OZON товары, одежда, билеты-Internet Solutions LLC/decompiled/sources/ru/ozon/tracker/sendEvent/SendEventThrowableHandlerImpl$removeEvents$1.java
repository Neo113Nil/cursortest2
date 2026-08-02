package ru.ozon.tracker.sendEvent;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.SendEventThrowableHandlerImpl", f = "SendEventThrowableHandler.kt", l = {104}, m = "removeEvents")
/* loaded from: classes3.dex */
final class SendEventThrowableHandlerImpl$removeEvents$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendEventThrowableHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendEventThrowableHandlerImpl$removeEvents$1(SendEventThrowableHandlerImpl sendEventThrowableHandlerImpl, d<? super SendEventThrowableHandlerImpl$removeEvents$1> dVar) {
        super(dVar);
        this.this$0 = sendEventThrowableHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object removeEvents;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        removeEvents = this.this$0.removeEvents(null, this);
        return removeEvents;
    }
}
