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
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.Action;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$checkAuthorise$1", f = "CommentsViewModelImpl.kt", l = {149, 150}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsViewModelImpl$checkAuthorise$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ CommentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModelImpl$checkAuthorise$1(CommentsViewModelImpl commentsViewModelImpl, d<? super CommentsViewModelImpl$checkAuthorise$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsViewModelImpl$checkAuthorise$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AuthStateStorage authStateStorage;
        w0 w0Var;
        w0 w0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            authStateStorage = this.this$0.authManager;
            if (!authStateStorage.isAuthenticated()) {
                w0Var = this.this$0._actionFlow;
                Action.CallAuth callAuth = Action.CallAuth.INSTANCE;
                this.label = 1;
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
        s.b(obj);
        w0Var2 = this.this$0._keyboardVisibility;
        Boolean bool = Boolean.FALSE;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommentsViewModelImpl$checkAuthorise$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
