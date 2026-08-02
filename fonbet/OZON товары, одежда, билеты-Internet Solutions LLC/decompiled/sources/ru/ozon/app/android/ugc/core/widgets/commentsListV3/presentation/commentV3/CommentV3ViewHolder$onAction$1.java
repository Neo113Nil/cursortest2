package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import WZ.l;
import WZ.m;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ActionName;
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentV3ViewHolder$onAction$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ CommentV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentV3ViewHolder$onAction$1(CommentV3ViewHolder commentV3ViewHolder) {
        super(1);
        this.this$0 = commentV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        CommentV3VO commentV3VO;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CommentV3VO commentV3VO2;
        l lVar;
        Function1 function12;
        CommentV3VO commentV3VO3;
        Function1 function13;
        String uuid;
        CommentV3VO commentV3VO4;
        CommentV3VO commentV3VO5;
        l lVar2;
        String uuid2;
        Function2 function2;
        Intrinsics.checkNotNullParameter(action, "action");
        AtomAction.Click click = null;
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            if (Intrinsics.d(composerAction.getActionName(), ActionName.REMOVE_COMMENT_V2.getAction()) || Intrinsics.d(composerAction.getId(), ActionName.DELETE_COMMENT.getAction())) {
                commentV3VO4 = this.this$0.item;
                if (commentV3VO4 != null && (uuid2 = commentV3VO4.getUuid()) != null) {
                    function2 = this.this$0.deleteComment;
                    Map<String, String> params = composerAction.getParams();
                    if (params == null) {
                        params = U.c();
                    }
                    function2.invoke(uuid2, params);
                }
                Map<String, TokenizedTrackingInfo> trackingInfo2 = composerAction.getTrackingInfo();
                if (trackingInfo2 != null) {
                    commentV3VO5 = this.this$0.item;
                    t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, commentV3VO5 != null ? Long.valueOf(commentV3VO5.getWidgetId()) : null, null, 2, null);
                    if (mapToTokenizedEvent$default != null) {
                        lVar2 = this.this$0.tokenizedAnalytics;
                        m.a(lVar2, mapToTokenizedEvent$default, null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click2 = (AtomAction.Click) action;
            if (Intrinsics.d(click2.getId(), "like")) {
                commentV3VO3 = this.this$0.item;
                if (commentV3VO3 != null && (uuid = commentV3VO3.getUuid()) != null) {
                    click = ComposerExtKt.addAdditionalParams(click2, (Map<String, String>) U.i(new Pair("commentUuid", uuid)));
                }
                function13 = this.this$0.actionHandler;
                if (click != null) {
                    click2 = click;
                }
                function13.invoke(click2);
                return;
            }
        }
        if (!Intrinsics.d(action.getId(), ActionName.COMMENT_ANSWER.getAction())) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
            return;
        }
        commentV3VO = this.this$0.item;
        if (commentV3VO != null) {
            function12 = this.this$0.replyTo;
            function12.invoke(commentV3VO);
        }
        AtomAction.SendAnalytics sendAnalytics = action instanceof AtomAction.SendAnalytics ? (AtomAction.SendAnalytics) action : null;
        if (sendAnalytics == null || (trackingInfo = sendAnalytics.getTrackingInfo()) == null) {
            return;
        }
        commentV3VO2 = this.this$0.item;
        t mapToTokenizedEvent$default2 = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, commentV3VO2 != null ? Long.valueOf(commentV3VO2.getWidgetId()) : null, null, 2, null);
        if (mapToTokenizedEvent$default2 != null) {
            lVar = this.this$0.tokenizedAnalytics;
            m.a(lVar, mapToTokenizedEvent$default2, null);
        }
    }
}
