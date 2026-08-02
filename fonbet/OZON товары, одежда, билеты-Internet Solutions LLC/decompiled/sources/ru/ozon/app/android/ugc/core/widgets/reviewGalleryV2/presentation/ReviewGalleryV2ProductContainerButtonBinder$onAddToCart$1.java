package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder", f = "ReviewGalleryV2ProductContainerButtonBinder.kt", l = {124}, m = "onAddToCart")
/* loaded from: classes2.dex */
final class ReviewGalleryV2ProductContainerButtonBinder$onAddToCart$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReviewGalleryV2ProductContainerButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryV2ProductContainerButtonBinder$onAddToCart$1(ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder, d<? super ReviewGalleryV2ProductContainerButtonBinder$onAddToCart$1> dVar) {
        super(dVar);
        this.this$0 = reviewGalleryV2ProductContainerButtonBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object onAddToCart;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        onAddToCart = this.this$0.onAddToCart(null, null, false, null, this);
        return onAddToCart;
    }
}
