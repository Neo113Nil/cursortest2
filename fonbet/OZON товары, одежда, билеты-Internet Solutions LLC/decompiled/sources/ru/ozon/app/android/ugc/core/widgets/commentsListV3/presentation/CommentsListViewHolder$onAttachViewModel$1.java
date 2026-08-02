package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Sc.s;
import WZ.l;
import WZ.m;
import WZ.t;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsCountDecremented;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsCountIncremented;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.Action;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewHolder$onAttachViewModel$1", f = "CommentsListViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsListViewHolder$onAttachViewModel$1 extends j implements Function2<Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommentsListViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListViewHolder$onAttachViewModel$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ CommentsListViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CommentsListViewHolder commentsListViewHolder) {
            super(0);
            this.this$0 = commentsListViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CommentsViewModel commentsViewModel;
            boolean z11;
            CommentsListVO boundData = this.this$0.getBoundData();
            if (boundData != null) {
                CommentsListViewHolder commentsListViewHolder = this.this$0;
                commentsViewModel = commentsListViewHolder.viewModel;
                z11 = commentsListViewHolder.activateCommentField;
                commentsViewModel.loadComments(boundData, z11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsListViewHolder$onAttachViewModel$1(CommentsListViewHolder commentsListViewHolder, d<? super CommentsListViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsListViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CommentsListViewHolder$onAttachViewModel$1 commentsListViewHolder$onAttachViewModel$1 = new CommentsListViewHolder$onAttachViewModel$1(this.this$0, dVar);
        commentsListViewHolder$onAttachViewModel$1.L$0 = obj;
        return commentsListViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        CommentsListView commentsListView;
        CommentsListView commentsListView2;
        CommentsListView commentsListView3;
        ComposerReferences composerReferences2;
        CommentsListView commentsListView4;
        t tokenizedEvent;
        l lVar;
        l lVar2;
        CommentsView commentsView;
        CommentsListView commentsListView5;
        CommentsListDTO.EmptyStateDTO emptyState;
        CommentsView commentsView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Action action = (Action) this.L$0;
        if (action instanceof Action.NewItems) {
            commentsListView5 = this.this$0.commentsListView;
            Action.NewItems newItems = (Action.NewItems) action;
            commentsListView5.loadItems(newItems.getItems(), newItems.getScrollCommentUuid());
            CommentsListVO boundData = this.this$0.getBoundData();
            if (boundData != null) {
                boundData.setCachedComments(newItems.getItems());
            }
            CommentsListVO boundData2 = this.this$0.getBoundData();
            if (boundData2 != null && (emptyState = boundData2.getEmptyState()) != null) {
                commentsView2 = this.this$0.commentsView;
                commentsView2.showOrGoneEmptyState(emptyState, newItems.getItems().isEmpty());
            }
        } else if (action instanceof Action.FetchError) {
            commentsView = this.this$0.commentsView;
            commentsView.bindAndShowErrorState(new AnonymousClass2(this.this$0));
        } else if (action instanceof Action.SendingComment) {
            CommentsListVO boundData3 = this.this$0.getBoundData();
            if (boundData3 != null) {
                CommentsListViewHolder commentsListViewHolder = this.this$0;
                t tokenizedEvent2 = boundData3.getTokenizedEvent();
                if (tokenizedEvent2 != null) {
                    lVar2 = commentsListViewHolder.tokenizedAnalytics;
                    m.a(lVar2, tokenizedEvent2, null);
                }
                CommentsAdapterVO replyOnComment = ((Action.SendingComment) action).getReplyOnComment();
                if (replyOnComment != null && (tokenizedEvent = replyOnComment.getTokenizedEvent()) != null) {
                    lVar = commentsListViewHolder.tokenizedAnalytics;
                    m.a(lVar, tokenizedEvent, null);
                }
            }
        } else if (action instanceof Action.ReplyToComment) {
            String commentUuid = ((Action.ReplyToComment) action).getCommentUuid();
            if (commentUuid != null) {
                commentsListView4 = this.this$0.commentsListView;
                commentsListView4.scrollToComment(commentUuid, true);
            }
        } else if (action instanceof Action.DeleteComment) {
            commentsListView3 = this.this$0.commentsListView;
            commentsListView3.deleteComment();
            composerReferences2 = this.this$0.ref;
            composerReferences2.getController().update(CommentsCountDecremented.INSTANCE);
        } else if (action instanceof Action.Error) {
            commentsListView2 = this.this$0.commentsListView;
            commentsListView2.showError(((Action.Error) action).getThrowable());
        } else if (action instanceof Action.SendError) {
            commentsListView = this.this$0.commentsListView;
            commentsListView.showSendError();
        } else if (action instanceof Action.IncrementCount) {
            composerReferences = this.this$0.ref;
            composerReferences.getController().update(CommentsCountIncremented.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Action action, d<? super Unit> dVar) {
        return ((CommentsListViewHolder$onAttachViewModel$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
