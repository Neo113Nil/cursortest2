package ru.ozon.app.android.search.widgets.insight.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightCustomActionHandlerImpl", f = "DeleteSearchInsightCustomActionHandlerImpl.kt", l = {97}, m = "dismissDelayed")
/* loaded from: classes13.dex */
final class DeleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeleteSearchInsightCustomActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1(DeleteSearchInsightCustomActionHandlerImpl deleteSearchInsightCustomActionHandlerImpl, d<? super DeleteSearchInsightCustomActionHandlerImpl$dismissDelayed$1> dVar) {
        super(dVar);
        this.this$0 = deleteSearchInsightCustomActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object dismissDelayed;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        dismissDelayed = this.this$0.dismissDelayed(null, null, this);
        return dismissDelayed;
    }
}
