package ru.ozon.app.android.mediaupload.video;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore", f = "VideoNetworkDataStore.kt", l = {83, 93, 105, 121}, m = "getUploadingId")
/* loaded from: classes12.dex */
final class VideoNetworkDataStore$getUploadingId$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VideoNetworkDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoNetworkDataStore$getUploadingId$1(VideoNetworkDataStore videoNetworkDataStore, d<? super VideoNetworkDataStore$getUploadingId$1> dVar) {
        super(dVar);
        this.this$0 = videoNetworkDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getUploadingId(null, null, null, null, null, false, this);
    }
}
