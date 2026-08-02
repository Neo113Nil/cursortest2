package ru.ozon.app.android.mediaupload.video.chunks;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.mediaupload.video.chunks.ChunksUploader", f = "ChunksUploader.kt", l = {91, 105}, m = "reuploadIfNeeded")
/* loaded from: classes12.dex */
final class ChunksUploader$reuploadIfNeeded$1 extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChunksUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChunksUploader$reuploadIfNeeded$1(ChunksUploader chunksUploader, d<? super ChunksUploader$reuploadIfNeeded$1> dVar) {
        super(dVar);
        this.this$0 = chunksUploader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object reuploadIfNeeded;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        reuploadIfNeeded = this.this$0.reuploadIfNeeded(0, this);
        return reuploadIfNeeded;
    }
}
