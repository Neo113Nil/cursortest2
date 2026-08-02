package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewModel", f = "ReconciliationActsDeclinerViewModel.kt", l = {148}, m = "getDocumentId")
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewModel$getDocumentId$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReconciliationActsDeclinerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewModel$getDocumentId$1(ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel, d<? super ReconciliationActsDeclinerViewModel$getDocumentId$1> dVar) {
        super(dVar);
        this.this$0 = reconciliationActsDeclinerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object documentId;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        documentId = this.this$0.getDocumentId(null, null, this);
        return documentId;
    }
}
