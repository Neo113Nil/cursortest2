package ru.ozon.app.android.mediaupload.video;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore", f = "VideoNetworkDataStore.kt", l = {196, 199, 258, 260}, m = "validate")
/* loaded from: classes12.dex */
final class VideoNetworkDataStore$validate$3 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VideoNetworkDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoNetworkDataStore$validate$3(VideoNetworkDataStore videoNetworkDataStore, d<? super VideoNetworkDataStore$validate$3> dVar) {
        super(dVar);
        this.this$0 = videoNetworkDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object validate;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        validate = this.this$0.validate(null, null, null, null, this);
        return validate;
    }
}
