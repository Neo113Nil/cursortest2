package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploaderImpl", f = "MediaFilesUploaderImpl.kt", l = {41, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "uploadMediaFile-0E7RQCE")
/* loaded from: classes13.dex */
final class MediaFilesUploaderImpl$uploadMediaFile$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaFilesUploaderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFilesUploaderImpl$uploadMediaFile$1(MediaFilesUploaderImpl mediaFilesUploaderImpl, d<? super MediaFilesUploaderImpl$uploadMediaFile$1> dVar) {
        super(dVar);
        this.this$0 = mediaFilesUploaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo945uploadMediaFile0E7RQCE = this.this$0.mo945uploadMediaFile0E7RQCE(null, null, this);
        return mo945uploadMediaFile0E7RQCE == Wc.a.COROUTINE_SUSPENDED ? mo945uploadMediaFile0E7RQCE : r.a(mo945uploadMediaFile0E7RQCE);
    }
}
