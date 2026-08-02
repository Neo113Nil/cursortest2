package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.comments;

import WZ.l;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentViewHolder$setActions$1$3 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ CommentVO $comment;
    final /* synthetic */ CommentViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentViewHolder$setActions$1$3(CommentVO commentVO, CommentViewHolder commentViewHolder) {
        super(1);
        this.$comment = commentVO;
        this.this$0 = commentViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        l lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        t deleteTokenizedEvent = this.$comment.getDeleteTokenizedEvent();
        if (deleteTokenizedEvent != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtKt.processClickEvents(lVar, deleteTokenizedEvent);
        }
        function1 = this.this$0.deleteComment;
        function1.invoke(this.$comment.getUuid());
    }
}
