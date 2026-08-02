package ru.ozon.app.android.uploadPhotos.viewmodel;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl", f = "UploadPhotosViewModelComposeImpl.kt", l = {263}, m = "uploadAttachment")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelComposeImpl$uploadAttachment$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadPhotosViewModelComposeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosViewModelComposeImpl$uploadAttachment$1(UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl, d<? super UploadPhotosViewModelComposeImpl$uploadAttachment$1> dVar) {
        super(dVar);
        this.this$0 = uploadPhotosViewModelComposeImpl;
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
