package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "comment", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentsListViewHolder$commentsListView$2 extends AbstractC7737t implements Function1<CommentsAdapterVO, Unit> {
    final /* synthetic */ CommentsListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsListViewHolder$commentsListView$2(CommentsListViewHolder commentsListViewHolder) {
        super(1);
        this.this$0 = commentsListViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CommentsAdapterVO commentsAdapterVO) {
        invoke2(commentsAdapterVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CommentsAdapterVO comment) {
        CommentsViewModel commentsViewModel;
        Intrinsics.checkNotNullParameter(comment, "comment");
        commentsViewModel = this.this$0.viewModel;
        commentsViewModel.replyToComment(comment);
    }
}
