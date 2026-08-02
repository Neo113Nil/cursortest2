package ru.ozon.app.android.marketing.widgets.stickyLadder.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderViewHolder$onWidgetCreated$1", f = "StickyLadderViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyLadderViewHolder$onWidgetCreated$1 extends j implements Function2<SellerActionPreviewProgressLadderViewModel.State, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickyLadderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyLadderViewHolder$onWidgetCreated$1(StickyLadderViewHolder stickyLadderViewHolder, d<? super StickyLadderViewHolder$onWidgetCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = stickyLadderViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StickyLadderViewHolder$onWidgetCreated$1 stickyLadderViewHolder$onWidgetCreated$1 = new StickyLadderViewHolder$onWidgetCreated$1(this.this$0, dVar);
        stickyLadderViewHolder$onWidgetCreated$1.L$0 = obj;
        return stickyLadderViewHolder$onWidgetCreated$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        StickyLadderView stickyLadderView;
        StickyLadderView stickyLadderView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SellerActionPreviewProgressLadderViewModel.State state = (SellerActionPreviewProgressLadderViewModel.State) this.L$0;
        if (state instanceof SellerActionPreviewProgressLadderViewModel.State.Shown) {
            stickyLadderView2 = this.this$0.stickyLadderView;
            stickyLadderView2.hideWithAnim();
        } else if (state instanceof SellerActionPreviewProgressLadderViewModel.State.Hidden) {
            stickyLadderView = this.this$0.stickyLadderView;
            stickyLadderView.showWithAnim();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SellerActionPreviewProgressLadderViewModel.State state, d<? super Unit> dVar) {
        return ((StickyLadderViewHolder$onWidgetCreated$1) create(state, dVar)).invokeSuspend(Unit.f71690a);
    }
}
