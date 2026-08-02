package ru.ozon.app.android.mediaupload.image.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.mediaupload.image.data.UploadImageRepositoryImpl", f = "UploadImageRepositoryImpl.kt", l = {50}, m = "parsingUploadedImageDTO")
/* loaded from: classes12.dex */
final class UploadImageRepositoryImpl$parsingUploadedImageDTO$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadImageRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadImageRepositoryImpl$parsingUploadedImageDTO$1(UploadImageRepositoryImpl uploadImageRepositoryImpl, d<? super UploadImageRepositoryImpl$parsingUploadedImageDTO$1> dVar) {
        super(dVar);
        this.this$0 = uploadImageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object parsingUploadedImageDTO;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        parsingUploadedImageDTO = this.this$0.parsingUploadedImageDTO(null, null, this);
        return parsingUploadedImageDTO;
    }
}
