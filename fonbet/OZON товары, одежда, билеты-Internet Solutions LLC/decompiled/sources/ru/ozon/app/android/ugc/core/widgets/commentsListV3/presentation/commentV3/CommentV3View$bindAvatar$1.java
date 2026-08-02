package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentV3View$bindAvatar$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ CommentV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommentV3View$bindAvatar$1(CommentV3View commentV3View, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.this$0 = commentV3View;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        CommentV3VO commentV3VO;
        CommentV3VO.AvatarVO avatar;
        AtomAction clickAction;
        Intrinsics.checkNotNullParameter(it, "it");
        commentV3VO = this.this$0.comment;
        if (commentV3VO == null || (avatar = commentV3VO.getAvatar()) == null || (clickAction = avatar.getClickAction()) == null) {
            return;
        }
        this.$actionHandler.invoke(clickAction);
    }
}
