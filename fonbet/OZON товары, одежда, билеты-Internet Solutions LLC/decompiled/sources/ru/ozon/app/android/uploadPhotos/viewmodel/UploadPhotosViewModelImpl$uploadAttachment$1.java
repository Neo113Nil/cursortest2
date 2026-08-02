package ru.ozon.app.android.uploadPhotos.viewmodel;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl", f = "UploadPhotosViewModelImpl.kt", l = {220}, m = "uploadAttachment")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelImpl$uploadAttachment$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadPhotosViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosViewModelImpl$uploadAttachment$1(UploadPhotosViewModelImpl uploadPhotosViewModelImpl, d<? super UploadPhotosViewModelImpl$uploadAttachment$1> dVar) {
        super(dVar);
        this.this$0 = uploadPhotosViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object uploadAttachment;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        uploadAttachment = this.this$0.uploadAttachment(null, this);
        return uploadAttachment;
    }
}
