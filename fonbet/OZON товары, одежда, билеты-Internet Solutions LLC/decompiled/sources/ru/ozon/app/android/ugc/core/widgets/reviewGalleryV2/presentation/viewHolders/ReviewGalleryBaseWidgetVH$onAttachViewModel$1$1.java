package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryLikeUpdateKey;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.RightPanelButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import z00.g;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "actionResult", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryBaseWidgetVH$onAttachViewModel$1$1 extends AbstractC7737t implements Function1<ReviewGalleryV2ViewModel.ActionResult, Unit> {
    final /* synthetic */ ReviewGalleryBaseWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryBaseWidgetVH$onAttachViewModel$1$1(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        super(1);
        this.this$0 = reviewGalleryBaseWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReviewGalleryV2ViewModel.ActionResult actionResult) {
        invoke2(actionResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ReviewGalleryV2ViewModel.ActionResult actionResult) {
        ComposerReferences composerReferences;
        List<RightPanelButtonDTO> buttons;
        List updateStateForButtonWithAction;
        ComposerReferences composerReferences2;
        if (!(actionResult instanceof ReviewGalleryV2ViewModel.ActionResult.Success)) {
            if (!(actionResult instanceof ReviewGalleryV2ViewModel.ActionResult.Error)) {
                throw new o();
            }
            ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH = this.this$0;
            composerReferences = reviewGalleryBaseWidgetVH.refs;
            reviewGalleryBaseWidgetVH.showNotification(composerReferences.getContainer(), g.c(((ReviewGalleryV2ViewModel.ActionResult.Error) actionResult).getMessage()) ? NotificationBarHelperKt.createNetworkErrorNotificationDTO(AppTypeResolver.INSTANCE.isSelect(this.this$0.getContext())) : NotificationsKt.createFailedToSendNotification());
            return;
        }
        ReviewGalleryVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH2 = this.this$0;
            String reviewUuid = boundData.getReviewUuid();
            ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel = boundData.getRightPanel();
            if (rightPanel == null || (buttons = rightPanel.getButtons()) == null) {
                return;
            }
            ReviewGalleryV2ViewModel.ActionResult.Success success = (ReviewGalleryV2ViewModel.ActionResult.Success) actionResult;
            updateStateForButtonWithAction = reviewGalleryBaseWidgetVH2.updateStateForButtonWithAction(buttons, success.getAction().getId());
            if (updateStateForButtonWithAction == null) {
                return;
            }
            composerReferences2 = reviewGalleryBaseWidgetVH2.refs;
            composerReferences2.getController().update(new ReviewGalleryLikeUpdateKey(reviewUuid, updateStateForButtonWithAction));
            reviewGalleryBaseWidgetVH2.saveLikeState(reviewUuid, success.getAction().getId());
        }
    }
}
