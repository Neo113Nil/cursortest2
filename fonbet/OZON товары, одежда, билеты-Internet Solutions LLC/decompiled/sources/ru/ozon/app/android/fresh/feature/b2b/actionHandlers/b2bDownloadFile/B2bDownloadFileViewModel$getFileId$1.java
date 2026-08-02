package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileViewModel", f = "B2bDownloadFileViewModel.kt", l = {101}, m = "getFileId")
/* loaded from: classes12.dex */
final class B2bDownloadFileViewModel$getFileId$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ B2bDownloadFileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bDownloadFileViewModel$getFileId$1(B2bDownloadFileViewModel b2bDownloadFileViewModel, d<? super B2bDownloadFileViewModel$getFileId$1> dVar) {
        super(dVar);
        this.this$0 = b2bDownloadFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fileId;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        fileId = this.this$0.getFileId(null, null, this);
        return fileId;
    }
}
