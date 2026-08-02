package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentFooterViewHolder$bind$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ CommentFooterVO $item;
    final /* synthetic */ CommentFooterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentFooterViewHolder$bind$1(CommentFooterViewHolder commentFooterViewHolder, CommentFooterVO commentFooterVO) {
        super(1);
        this.this$0 = commentFooterViewHolder;
        this.$item = commentFooterVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        String link;
        l lVar;
        ComposerReferences composerReferences;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(action, "action");
        t tVar = null;
        AtomAction.Move move = action instanceof AtomAction.Move ? (AtomAction.Move) action : null;
        if (move == null || (link = move.getLink()) == null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
            return;
        }
        CommentFooterViewHolder commentFooterViewHolder = this.this$0;
        CommentFooterVO commentFooterVO = this.$item;
        lVar = commentFooterViewHolder.tokenizedAnalytics;
        CommonControlSettings common = commentFooterVO.getCommentsButton().getCommon();
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(commentFooterVO.getId()), null, 2, null);
        }
        TokenizedAnalyticsExtKt.processClickEvents(lVar, tVar);
        composerReferences = commentFooterViewHolder.references;
        composerReferences.getNavigator().openDeeplink(link, U.i(new Pair("withScrollToComment", Boolean.TRUE)));
    }
}
