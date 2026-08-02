package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsGateway;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.Action;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$replyToComment$1", f = "CommentsViewModelImpl.kt", l = {116, 122}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsViewModelImpl$replyToComment$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CommentsAdapterVO $comment;
    int label;
    final /* synthetic */ CommentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModelImpl$replyToComment$1(CommentsViewModelImpl commentsViewModelImpl, CommentsAdapterVO commentsAdapterVO, d<? super CommentsViewModelImpl$replyToComment$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsViewModelImpl;
        this.$comment = commentsAdapterVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsViewModelImpl$replyToComment$1(this.this$0, this.$comment, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        CommentsGateway commentsGateway;
        w0 w0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.currentComment = this.$comment;
            w0Var = this.this$0._actionFlow;
            commentsGateway = this.this$0.gateway;
            Action.ReplyToComment replyToComment = new Action.ReplyToComment(commentsGateway.getReplyTo(this.$comment.getUuid()), this.$comment.getUuid());
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        w0Var2 = this.this$0._keyboardVisibility;
        Boolean bool = Boolean.TRUE;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommentsViewModelImpl$replyToComment$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
