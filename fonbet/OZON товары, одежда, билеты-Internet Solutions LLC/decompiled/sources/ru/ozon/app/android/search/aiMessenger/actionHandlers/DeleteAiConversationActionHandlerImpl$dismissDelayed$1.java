package ru.ozon.app.android.search.aiMessenger.actionHandlers;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.aiMessenger.actionHandlers.DeleteAiConversationActionHandlerImpl", f = "DeleteAiConversationActionHandlerImpl.kt", l = {110}, m = "dismissDelayed")
/* loaded from: classes13.dex */
final class DeleteAiConversationActionHandlerImpl$dismissDelayed$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeleteAiConversationActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteAiConversationActionHandlerImpl$dismissDelayed$1(DeleteAiConversationActionHandlerImpl deleteAiConversationActionHandlerImpl, d<? super DeleteAiConversationActionHandlerImpl$dismissDelayed$1> dVar) {
        super(dVar);
        this.this$0 = deleteAiConversationActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object dismissDelayed;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        dismissDelayed = this.this$0.dismissDelayed(null, this);
        return dismissDelayed;
    }
}
