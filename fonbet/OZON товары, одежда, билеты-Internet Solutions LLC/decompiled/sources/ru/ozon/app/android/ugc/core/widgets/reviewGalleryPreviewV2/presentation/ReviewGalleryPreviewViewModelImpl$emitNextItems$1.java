package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl", f = "ReviewGalleryPreviewViewModel.kt", l = {145}, m = "emitNextItems")
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewViewModelImpl$emitNextItems$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReviewGalleryPreviewViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewViewModelImpl$emitNextItems$1(ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl, d<? super ReviewGalleryPreviewViewModelImpl$emitNextItems$1> dVar) {
        super(dVar);
        this.this$0 = reviewGalleryPreviewViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object emitNextItems;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        emitNextItems = this.this$0.emitNextItems(null, this);
        return emitNextItems;
    }
}
