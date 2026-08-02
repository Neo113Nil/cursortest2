package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.w0;
import Ae.x0;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsGateway;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.Action;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$updateCommentsSocialHeader$1", f = "CommentsViewModelImpl.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsViewModelImpl$updateCommentsSocialHeader$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $authorId;
    final /* synthetic */ Boolean $isSubscribe;
    final /* synthetic */ String $sellerId;
    int label;
    final /* synthetic */ CommentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModelImpl$updateCommentsSocialHeader$1(CommentsViewModelImpl commentsViewModelImpl, String str, Boolean bool, String str2, d<? super CommentsViewModelImpl$updateCommentsSocialHeader$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsViewModelImpl;
        this.$authorId = str;
        this.$isSubscribe = bool;
        this.$sellerId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsViewModelImpl$updateCommentsSocialHeader$1(this.this$0, this.$authorId, this.$isSubscribe, this.$sellerId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r1.emit(r4, r6) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r1.emit(r2, r6) != r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        w0 w0Var;
        x0 x0Var2;
        x0 x0Var3;
        Boolean bool;
        CommentsGateway commentsGateway;
        w0 w0Var2;
        SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
            } catch (Exception e11) {
                w0Var = this.this$0._actionFlow;
                Action.Error error = new Action.Error(e11);
                this.label = 2;
            }
            if (i11 == 0) {
                s.b(obj);
                x0Var3 = this.this$0._showLoading;
                x0Var3.setValue(Boolean.TRUE);
                String str = this.$authorId;
                if (str != null) {
                    subscribeAuthorsIdStorage = this.this$0.subscribeAuthorsIdStorage;
                    bool = subscribeAuthorsIdStorage.isAuthorSubscribed(str);
                }
                bool = this.$isSubscribe;
                commentsGateway = this.this$0.gateway;
                List<CommentsAdapterVO> updateCommentsSocialHeader = commentsGateway.updateCommentsSocialHeader(this.$authorId, this.$sellerId, bool);
                if (updateCommentsSocialHeader != null) {
                    w0Var2 = this.this$0._actionFlow;
                    Action.NewItems newItems = new Action.NewItems(updateCommentsSocialHeader, null, 2, null);
                    this.label = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    x0Var2 = this.this$0._showLoading;
                    x0Var2.setValue(Boolean.FALSE);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            x0Var2 = this.this$0._showLoading;
            x0Var2.setValue(Boolean.FALSE);
            return Unit.f71690a;
        } catch (Throwable th2) {
            x0Var = this.this$0._showLoading;
            x0Var.setValue(Boolean.FALSE);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommentsViewModelImpl$updateCommentsSocialHeader$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
