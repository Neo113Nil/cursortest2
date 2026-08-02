package ru.ozon.app.android.mediaupload.video.chunks;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.mediaupload.video.chunks.ChunksUploader", f = "ChunksUploader.kt", l = {82, 85, 86}, m = "uploadChunksPortionsAsync")
/* loaded from: classes12.dex */
final class ChunksUploader$uploadChunksPortionsAsync$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChunksUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChunksUploader$uploadChunksPortionsAsync$1(ChunksUploader chunksUploader, d<? super ChunksUploader$uploadChunksPortionsAsync$1> dVar) {
        super(dVar);
        this.this$0 = chunksUploader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object uploadChunksPortionsAsync;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        uploadChunksPortionsAsync = this.this$0.uploadChunksPortionsAsync(0, null, this);
        return uploadChunksPortionsAsync;
    }
}
