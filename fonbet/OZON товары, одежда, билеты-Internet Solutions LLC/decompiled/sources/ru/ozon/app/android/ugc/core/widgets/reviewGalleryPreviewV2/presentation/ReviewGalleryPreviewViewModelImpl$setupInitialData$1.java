package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Ae.x0;
import Sc.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl$setupInitialData$1", f = "ReviewGalleryPreviewViewModel.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewViewModelImpl$setupInitialData$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<ReviewGalleryPreviewV2VO.ItemVO> $initialItems;
    int label;
    final /* synthetic */ ReviewGalleryPreviewViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewViewModelImpl$setupInitialData$1(ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl, List<ReviewGalleryPreviewV2VO.ItemVO> list, d<? super ReviewGalleryPreviewViewModelImpl$setupInitialData$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryPreviewViewModelImpl;
        this.$initialItems = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryPreviewViewModelImpl$setupInitialData$1(this.this$0, this.$initialItems, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.items = this.$initialItems;
            this.this$0.setInitialized(true);
            x0<ReviewGalleryPreviewViewModel.Previews> previews = this.this$0.getPreviews();
            list = this.this$0.items;
            ReviewGalleryPreviewViewModel.Previews previews2 = new ReviewGalleryPreviewViewModel.Previews(list, true);
            this.label = 1;
            if (previews.emit(previews2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryPreviewViewModelImpl$setupInitialData$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
