package ru.ozon.app.android.mediaupload.video.chunks;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingApi;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkUploadingResponseDTO;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkUploadingResponseDTO;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.chunks.ChunksUploader$uploadChunksAsync$2", f = "ChunksUploader.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChunksUploader$uploadChunksAsync$2 extends j implements Function2<M, d<? super List<? extends ChunkUploadingResponseDTO>>, Object> {
    final /* synthetic */ List<ChunkInfo> $chuncks;
    final /* synthetic */ VideoUploadingApi $uploadingApi;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChunksUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChunksUploader$uploadChunksAsync$2(List<ChunkInfo> list, ChunksUploader chunksUploader, VideoUploadingApi videoUploadingApi, d<? super ChunksUploader$uploadChunksAsync$2> dVar) {
        super(2, dVar);
        this.$chuncks = list;
        this.this$0 = chunksUploader;
        this.$uploadingApi = videoUploadingApi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChunksUploader$uploadChunksAsync$2 chunksUploader$uploadChunksAsync$2 = new ChunksUploader$uploadChunksAsync$2(this.$chuncks, this.this$0, this.$uploadingApi, dVar);
        chunksUploader$uploadChunksAsync$2.L$0 = obj;
        return chunksUploader$uploadChunksAsync$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends ChunkUploadingResponseDTO>> dVar) {
        return invoke2(m11, (d<? super List<ChunkUploadingResponseDTO>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        List<ChunkInfo> list = this.$chuncks;
        ChunksUploader chunksUploader = this.this$0;
        VideoUploadingApi videoUploadingApi = this.$uploadingApi;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C10727i.a(m11, null, null, new ChunksUploader$uploadChunksAsync$2$1$1(chunksUploader, videoUploadingApi, (ChunkInfo) it.next(), null), 3));
        }
        this.label = 1;
        Object a11 = C10721f.a(arrayList, this);
        return a11 == aVar ? aVar : a11;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<ChunkUploadingResponseDTO>> dVar) {
        return ((ChunksUploader$uploadChunksAsync$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
