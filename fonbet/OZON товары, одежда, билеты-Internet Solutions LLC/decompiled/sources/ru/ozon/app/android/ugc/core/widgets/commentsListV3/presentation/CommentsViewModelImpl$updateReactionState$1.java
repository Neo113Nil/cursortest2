package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.List;
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
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$updateReactionState$1", f = "CommentsViewModelImpl.kt", l = {159, 162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsViewModelImpl$updateReactionState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $uuid;
    int label;
    final /* synthetic */ CommentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModelImpl$updateReactionState$1(CommentsViewModelImpl commentsViewModelImpl, String str, boolean z11, String str2, d<? super CommentsViewModelImpl$updateReactionState$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsViewModelImpl;
        this.$uuid = str;
        this.$isSelected = z11;
        this.$actionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsViewModelImpl$updateReactionState$1(this.this$0, this.$uuid, this.$isSelected, this.$actionId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.emit(r4, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r1.emit(r2, r6) != r0) goto L22;
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
        try {
        } catch (Exception e11) {
            w0Var = this.this$0._actionFlow;
            Action.Error error = new Action.Error(e11);
            this.label = 2;
        }
        if (i11 == 0) {
            s.b(obj);
            commentsGateway = this.this$0.gateway;
            List<CommentsAdapterVO> updateReactionState = commentsGateway.updateReactionState(this.$uuid, this.$isSelected, this.$actionId);
            if (updateReactionState != null) {
                w0Var2 = this.this$0._actionFlow;
                Action.NewItems newItems = new Action.NewItems(updateReactionState, null, 2, null);
                this.label = 1;
            }
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
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommentsViewModelImpl$updateReactionState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
