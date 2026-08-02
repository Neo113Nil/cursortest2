package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsGateway;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.Action;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$deleteComment$1", f = "CommentsViewModelImpl.kt", l = {135, 137, 138, 141}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsViewModelImpl$deleteComment$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $commentUuid;
    final /* synthetic */ Map<String, String> $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CommentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModelImpl$deleteComment$1(CommentsViewModelImpl commentsViewModelImpl, String str, Map<String, String> map, d<? super CommentsViewModelImpl$deleteComment$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsViewModelImpl;
        this.$commentUuid = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsViewModelImpl$deleteComment$1(this.this$0, this.$commentUuid, this.$params, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r1.emit(r4, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r7.emit(r8, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CommentsGateway commentsGateway;
        Object m1478deleteComment0E7RQCE;
        CommentsViewModelImpl commentsViewModelImpl;
        w0 w0Var;
        w0 w0Var2;
        Object obj2;
        Throwable b11;
        w0 w0Var3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            commentsGateway = this.this$0.gateway;
            String str = this.$commentUuid;
            Map<String, String> map = this.$params;
            this.label = 1;
            m1478deleteComment0E7RQCE = commentsGateway.m1478deleteComment0E7RQCE(str, map, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    obj2 = this.L$0;
                    s.b(obj);
                    m1478deleteComment0E7RQCE = obj2;
                    CommentsViewModelImpl commentsViewModelImpl2 = this.this$0;
                    b11 = r.b(m1478deleteComment0E7RQCE);
                    if (b11 != null) {
                        w0Var3 = commentsViewModelImpl2._actionFlow;
                        Action.Error error = new Action.Error(b11);
                        this.L$0 = m1478deleteComment0E7RQCE;
                        this.label = 4;
                    }
                    return Unit.f71690a;
                }
                commentsViewModelImpl = (CommentsViewModelImpl) this.L$1;
                Object obj3 = this.L$0;
                s.b(obj);
                m1478deleteComment0E7RQCE = obj3;
                w0Var2 = commentsViewModelImpl._actionFlow;
                Action.DeleteComment deleteComment = Action.DeleteComment.INSTANCE;
                this.L$0 = m1478deleteComment0E7RQCE;
                this.L$1 = null;
                this.label = 3;
                if (w0Var2.emit(deleteComment, this) != aVar) {
                    obj2 = m1478deleteComment0E7RQCE;
                    m1478deleteComment0E7RQCE = obj2;
                    CommentsViewModelImpl commentsViewModelImpl22 = this.this$0;
                    b11 = r.b(m1478deleteComment0E7RQCE);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
            s.b(obj);
            m1478deleteComment0E7RQCE = ((r) obj).getF26106a();
        }
        commentsViewModelImpl = this.this$0;
        r.Companion companion = r.INSTANCE;
        if (!(m1478deleteComment0E7RQCE instanceof r.b)) {
            w0Var = commentsViewModelImpl._actionFlow;
            Action.NewItems newItems = new Action.NewItems((List) m1478deleteComment0E7RQCE, null, 2, null);
            this.L$0 = m1478deleteComment0E7RQCE;
            this.L$1 = commentsViewModelImpl;
            this.label = 2;
        }
        CommentsViewModelImpl commentsViewModelImpl222 = this.this$0;
        b11 = r.b(m1478deleteComment0E7RQCE);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommentsViewModelImpl$deleteComment$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
