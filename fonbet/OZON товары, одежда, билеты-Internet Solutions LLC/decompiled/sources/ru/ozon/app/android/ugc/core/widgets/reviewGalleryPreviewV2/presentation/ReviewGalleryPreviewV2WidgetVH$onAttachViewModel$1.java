package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.s;
import WZ.l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1", f = "ReviewGalleryPreviewV2WidgetVH.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReviewGalleryPreviewV2WidgetVH this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel$Previews;", "<destruct>", "", "emit", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel$Previews;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ ReviewGalleryPreviewV2WidgetVH this$0;

        AnonymousClass1(ReviewGalleryPreviewV2WidgetVH reviewGalleryPreviewV2WidgetVH) {
            this.this$0 = reviewGalleryPreviewV2WidgetVH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$0(ReviewGalleryPreviewV2WidgetVH reviewGalleryPreviewV2WidgetVH, boolean z11) {
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            recyclerView = reviewGalleryPreviewV2WidgetVH.itemsRecycler;
            recyclerView.invalidateItemDecorations();
            if (z11) {
                recyclerView2 = reviewGalleryPreviewV2WidgetVH.itemsRecycler;
                recyclerView2.scrollToPosition(0);
            }
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((ReviewGalleryPreviewViewModel.Previews) obj, (d<? super Unit>) dVar);
        }

        public final Object emit(ReviewGalleryPreviewViewModel.Previews previews, d<? super Unit> dVar) {
            PreviewItemListAdapter previewItemListAdapter;
            Function1<? super AtomAction, Unit> function1;
            l lVar;
            List<ReviewGalleryPreviewV2VO.ItemVO> component1 = previews.component1();
            final boolean clearScrollState = previews.getClearScrollState();
            previewItemListAdapter = this.this$0.itemsAdapter;
            function1 = this.this$0.actionHandler;
            lVar = this.this$0.tokenizedAnalytics;
            final ReviewGalleryPreviewV2WidgetVH reviewGalleryPreviewV2WidgetVH = this.this$0;
            previewItemListAdapter.submitList(component1, function1, lVar, new Runnable() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.a
                @Override // java.lang.Runnable
                public final void run() {
                    ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1.AnonymousClass1.emit$lambda$0(ReviewGalleryPreviewV2WidgetVH.this, clearScrollState);
                }
            });
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1(ReviewGalleryPreviewV2WidgetVH reviewGalleryPreviewV2WidgetVH, d<? super ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryPreviewV2WidgetVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReviewGalleryPreviewViewModel viewModel;
        M0<ReviewGalleryPreviewViewModel.Previews> previews;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            viewModel = this.this$0.getViewModel();
            if (viewModel == null || (previews = viewModel.getPreviews()) == null) {
                return Unit.f71690a;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (previews.collect(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
