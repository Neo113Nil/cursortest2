package ru.ozon.app.android.ugc.widgets.reviewSort.core;

import WZ.l;
import WZ.t;
import a00.C4911f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.reviewSort.di.ReviewSortButtonComponent;
import ru.ozon.app.android.ugc.widgets.reviewSort.presentation.ReviewSortVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4$1$buttonAction$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ReviewSortButtonComponent $component;
    final /* synthetic */ C4911f $ownerContainer;
    final /* synthetic */ ReviewSortVO $reviewSortVO;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4$1$buttonAction$1$1(ReviewSortButtonComponent reviewSortButtonComponent, ReviewSortVO reviewSortVO, C4911f c4911f, l lVar) {
        super(1);
        this.$component = reviewSortButtonComponent;
        this.$reviewSortVO = reviewSortVO;
        this.$ownerContainer = c4911f;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        CommonControlSettings common;
        t mapToTokenizedEvent$default;
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.DismissRefresh) {
            this.$component.getComposerNavigator().popBackStack();
            ReviewSortVO reviewSortVO = this.$reviewSortVO;
            C4911f c4911f = this.$ownerContainer;
            l lVar = this.$tokenizedAnalytics;
            if (Intrinsics.d(((AtomAction.DismissRefresh) action).getId(), reviewSortVO.getInitialFilterId()) || (common = reviewSortVO.getCells().get(reviewSortVO.getSelectItemIndex()).getCommon()) == null) {
                return;
            }
            AtomActionDTO action2 = common.getAction();
            if (action2 != null && (link = action2.getLink()) != null) {
                ComposerExtKt.sendRefreshToTargetFragment$default(c4911f, link, null, null, null, 14, null);
            }
            Map<String, TokenizedTrackingInfo> trackingInfo = common.getTrackingInfo();
            if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(reviewSortVO.getId()), null, 2, null)) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
        }
    }
}
