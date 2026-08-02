package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActViewModel", f = "B2bAcceptActViewModel.kt", l = {59}, m = "getDocumentId")
/* loaded from: classes12.dex */
final class B2bAcceptActViewModel$getDocumentId$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ B2bAcceptActViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bAcceptActViewModel$getDocumentId$1(B2bAcceptActViewModel b2bAcceptActViewModel, d<? super B2bAcceptActViewModel$getDocumentId$1> dVar) {
        super(dVar);
        this.this$0 = b2bAcceptActViewModel;
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
