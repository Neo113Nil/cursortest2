package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import A00.a;
import Sc.s;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2", f = "ReviewGalleryPreviewV2WidgetVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2 extends j implements Function2<A00.a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReviewGalleryPreviewV2WidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2(ReviewGalleryPreviewV2WidgetVH reviewGalleryPreviewV2WidgetVH, d<? super ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryPreviewV2WidgetVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2 reviewGalleryPreviewV2WidgetVH$onAttachViewModel$2 = new ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2(this.this$0, dVar);
        reviewGalleryPreviewV2WidgetVH$onAttachViewModel$2.L$0 = obj;
        return reviewGalleryPreviewV2WidgetVH$onAttachViewModel$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(A00.a aVar, d<? super Unit> dVar) {
        return ((ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((A00.a) this.L$0) instanceof a.u.c) {
            recyclerView = this.this$0.itemsRecycler;
            recyclerView.scrollToPosition(0);
        }
        return Unit.f71690a;
    }
}
