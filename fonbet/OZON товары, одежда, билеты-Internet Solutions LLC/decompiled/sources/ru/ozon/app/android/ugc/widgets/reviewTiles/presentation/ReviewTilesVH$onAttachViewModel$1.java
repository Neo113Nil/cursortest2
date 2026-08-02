package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import A00.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewTilesVH$onAttachViewModel$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ ReviewTilesVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTilesVH$onAttachViewModel$1(ReviewTilesVH reviewTilesVH) {
        super(1);
        this.this$0 = reviewTilesVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a aVar) {
        ReviewTilesViewModel viewModel;
        RecyclerView recyclerView;
        ReviewTilesViewModel viewModel2;
        if (aVar instanceof a.u.c) {
            viewModel2 = this.this$0.getViewModel();
            if (viewModel2 != null) {
                viewModel2.setScrollState(null);
                return;
            }
            return;
        }
        if (aVar instanceof a.C2370k) {
            viewModel = this.this$0.getViewModel();
            if ((viewModel != null ? viewModel.getScrollState() : null) == null) {
                recyclerView = this.this$0.recyclerView;
                recyclerView.scrollToPosition(0);
            }
        }
    }
}
