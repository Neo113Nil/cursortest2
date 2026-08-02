package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.w0;
import He.b;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsGateway;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.Action;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$sendComment$1", f = "CommentsViewModelImpl.kt", l = {89, 91, 95, 96, 97, 102}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsViewModelImpl$sendComment$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $comment;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CommentsViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxe/M;", "Lkotlin/Pair;", "", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "<anonymous>", "(Lxe/M;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$sendComment$1$1", f = "CommentsViewModelImpl.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$sendComment$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Pair<? extends String, ? extends List<? extends CommentsAdapterVO>>>, Object> {
        final /* synthetic */ String $comment;
        int label;
        final /* synthetic */ CommentsViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CommentsViewModelImpl commentsViewModelImpl, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = commentsViewModelImpl;
            this.$comment = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$comment, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Pair<? extends String, ? extends List<? extends CommentsAdapterVO>>> dVar) {
            return invoke2(m11, (d<? super Pair<String, ? extends List<? extends CommentsAdapterVO>>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CommentsGateway commentsGateway;
            CommentsAdapterVO commentsAdapterVO;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            commentsGateway = this.this$0.gateway;
            String str = this.$comment;
            commentsAdapterVO = this.this$0.currentComment;
            String uuid = commentsAdapterVO != null ? commentsAdapterVO.getUuid() : null;
            this.label = 1;
            Object sendComment = commentsGateway.sendComment(str, uuid, this);
            return sendComment == aVar ? aVar : sendComment;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(M m11, d<? super Pair<String, ? extends List<? extends CommentsAdapterVO>>> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModelImpl$sendComment$1(CommentsViewModelImpl commentsViewModelImpl, String str, d<? super CommentsViewModelImpl$sendComment$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsViewModelImpl;
        this.$comment = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsViewModelImpl$sendComment$1(this.this$0, this.$comment, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (r1.emit(r3, r7) != r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:11:0x0019, B:12:0x00cf, B:15:0x0025, B:16:0x00bd, B:21:0x0036, B:22:0x00a3, B:26:0x003a, B:27:0x0079, B:29:0x007d, B:33:0x0061), top: B:2:0x0005 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        w0 w0Var2;
        CommentsAdapterVO commentsAdapterVO;
        Pair pair;
        CommentsViewModelImpl commentsViewModelImpl;
        String str;
        List list;
        w0 w0Var3;
        w0 w0Var4;
        Action.NewItems newItems;
        CommentsViewModelImpl commentsViewModelImpl2;
        w0 w0Var5;
        Boolean bool;
        a aVar = a.COROUTINE_SUSPENDED;
        try {
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            w0Var = this.this$0._actionFlow;
            Object error = g.c(e11) ? new Action.Error(e11) : Action.SendError.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 6;
        }
        switch (this.label) {
            case 0:
                s.b(obj);
                w0Var2 = this.this$0._actionFlow;
                commentsAdapterVO = this.this$0.currentComment;
                Action.SendingComment sendingComment = new Action.SendingComment(commentsAdapterVO);
                this.label = 1;
                break;
            case 1:
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$comment, null);
                this.label = 2;
                obj = C10727i.f(bVar, anonymousClass1, this);
                if (obj == aVar) {
                    return aVar;
                }
                pair = (Pair) obj;
                if (pair != null) {
                    commentsViewModelImpl = this.this$0;
                    str = (String) pair.a();
                    list = (List) pair.b();
                    w0Var3 = commentsViewModelImpl._actionFlow;
                    Action.IncrementCount incrementCount = Action.IncrementCount.INSTANCE;
                    this.L$0 = commentsViewModelImpl;
                    this.L$1 = str;
                    this.L$2 = list;
                    this.label = 3;
                    if (w0Var3.emit(incrementCount, this) == aVar) {
                        return aVar;
                    }
                    w0Var4 = commentsViewModelImpl._actionFlow;
                    newItems = new Action.NewItems(list, str);
                    this.L$0 = commentsViewModelImpl;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (w0Var4.emit(newItems, this) != aVar) {
                        return aVar;
                    }
                    commentsViewModelImpl2 = commentsViewModelImpl;
                    w0Var5 = commentsViewModelImpl2._keyboardVisibility;
                    bool = Boolean.FALSE;
                    this.L$0 = commentsViewModelImpl2;
                    this.label = 5;
                    if (w0Var5.emit(bool, this) == aVar) {
                        return aVar;
                    }
                    commentsViewModelImpl2.closeReplyTo();
                }
                return Unit.f71690a;
            case 2:
                s.b(obj);
                pair = (Pair) obj;
                if (pair != null) {
                }
                return Unit.f71690a;
            case 3:
                list = (List) this.L$2;
                str = (String) this.L$1;
                commentsViewModelImpl = (CommentsViewModelImpl) this.L$0;
                s.b(obj);
                w0Var4 = commentsViewModelImpl._actionFlow;
                newItems = new Action.NewItems(list, str);
                this.L$0 = commentsViewModelImpl;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (w0Var4.emit(newItems, this) != aVar) {
                }
                break;
            case 4:
                commentsViewModelImpl2 = (CommentsViewModelImpl) this.L$0;
                s.b(obj);
                w0Var5 = commentsViewModelImpl2._keyboardVisibility;
                bool = Boolean.FALSE;
                this.L$0 = commentsViewModelImpl2;
                this.label = 5;
                if (w0Var5.emit(bool, this) == aVar) {
                }
                commentsViewModelImpl2.closeReplyTo();
                return Unit.f71690a;
            case 5:
                commentsViewModelImpl2 = (CommentsViewModelImpl) this.L$0;
                s.b(obj);
                commentsViewModelImpl2.closeReplyTo();
                return Unit.f71690a;
            case 6:
                s.b(obj);
                return Unit.f71690a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommentsViewModelImpl$sendComment$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
