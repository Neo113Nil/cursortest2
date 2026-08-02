package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.async.SellerActionsPreviewUpdateKey$Success;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async.SellerActionsPreviewAsyncViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel$NewState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel$NewState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerActionsPreviewAsyncViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<SellerActionsPreviewAsyncViewModel.NewState, Unit> {
    final /* synthetic */ SellerActionsPreviewAsyncViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerActionsPreviewAsyncViewHolder$onAttachViewModel$1(SellerActionsPreviewAsyncViewHolder sellerActionsPreviewAsyncViewHolder) {
        super(1);
        this.this$0 = sellerActionsPreviewAsyncViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SellerActionsPreviewAsyncViewModel.NewState newState) {
        invoke2(newState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SellerActionsPreviewAsyncViewModel.NewState newState) {
        InterfaceC7851b interfaceC7851b;
        if (newState != null) {
            List<SellerActionsPreviewVO> list = newState.getList();
            SellerActionsPreviewAsyncViewHolder sellerActionsPreviewAsyncViewHolder = this.this$0;
            for (SellerActionsPreviewVO sellerActionsPreviewVO : list) {
                interfaceC7851b = sellerActionsPreviewAsyncViewHolder.controller;
                interfaceC7851b.update(new SellerActionsPreviewUpdateKey$Success(sellerActionsPreviewVO));
            }
        }
    }
}
