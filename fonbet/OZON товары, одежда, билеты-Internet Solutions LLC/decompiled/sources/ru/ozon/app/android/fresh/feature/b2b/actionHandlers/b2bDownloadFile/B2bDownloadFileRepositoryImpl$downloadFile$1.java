package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileRepositoryImpl", f = "B2bDownloadFileRepository.kt", l = {20}, m = "downloadFile")
/* loaded from: classes12.dex */
final class B2bDownloadFileRepositoryImpl$downloadFile$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ B2bDownloadFileRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bDownloadFileRepositoryImpl$downloadFile$1(B2bDownloadFileRepositoryImpl b2bDownloadFileRepositoryImpl, d<? super B2bDownloadFileRepositoryImpl$downloadFile$1> dVar) {
        super(dVar);
        this.this$0 = b2bDownloadFileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.downloadFile(null, null, this);
    }
}
