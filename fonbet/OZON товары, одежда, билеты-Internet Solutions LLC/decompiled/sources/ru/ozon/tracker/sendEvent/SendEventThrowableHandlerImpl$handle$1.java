package ru.ozon.tracker.sendEvent;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.DbEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.SendEventThrowableHandlerImpl", f = "SendEventThrowableHandler.kt", l = {58, 60, 63}, m = "handle")
/* loaded from: classes3.dex */
final class SendEventThrowableHandlerImpl$handle$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendEventThrowableHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendEventThrowableHandlerImpl$handle$1(SendEventThrowableHandlerImpl sendEventThrowableHandlerImpl, d<? super SendEventThrowableHandlerImpl$handle$1> dVar) {
        super(dVar);
        this.this$0 = sendEventThrowableHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handle;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        handle = this.this$0.handle((ResponseException) null, (List<DbEvent>) null, (d<? super Unit>) this);
        return handle;
    }
}
