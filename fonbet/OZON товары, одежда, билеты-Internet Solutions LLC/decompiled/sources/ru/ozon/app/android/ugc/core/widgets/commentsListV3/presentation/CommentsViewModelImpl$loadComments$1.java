package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.w0;
import Ae.x0;
import He.b;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$loadComments$1", f = "CommentsViewModelImpl.kt", l = {43, 46, 48, 51, 52}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsViewModelImpl$loadComments$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $activateCommentField;
    final /* synthetic */ CommentsListVO $commentsListVO;
    Object L$0;
    int label;
    final /* synthetic */ CommentsViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxe/M;", "Lkotlin/Pair;", "", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "<anonymous>", "(Lxe/M;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$loadComments$1$1", f = "CommentsViewModelImpl.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl$loadComments$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Pair<? extends String, ? extends List<? extends CommentsAdapterVO>>>, Object> {
        final /* synthetic */ CommentsListVO $commentsListVO;
        int label;
        final /* synthetic */ CommentsViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CommentsViewModelImpl commentsViewModelImpl, CommentsListVO commentsListVO, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = commentsViewModelImpl;
            this.$commentsListVO = commentsListVO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$commentsListVO, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Pair<? extends String, ? extends List<? extends CommentsAdapterVO>>> dVar) {
            return invoke2(m11, (d<? super Pair<String, ? extends List<? extends CommentsAdapterVO>>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CommentsGateway commentsGateway;
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
            CommentsListVO commentsListVO = this.$commentsListVO;
            this.label = 1;
            Object loadComments = commentsGateway.loadComments(commentsListVO, this);
            return loadComments == aVar ? aVar : loadComments;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(M m11, d<? super Pair<String, ? extends List<? extends CommentsAdapterVO>>> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsViewModelImpl$loadComments$1(CommentsViewModelImpl commentsViewModelImpl, boolean z11, CommentsListVO commentsListVO, d<? super CommentsViewModelImpl$loadComments$1> dVar) {
        super(2, dVar);
        this.this$0 = commentsViewModelImpl;
        this.$activateCommentField = z11;
        this.$commentsListVO = commentsListVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommentsViewModelImpl$loadComments$1(this.this$0, this.$activateCommentField, this.$commentsListVO, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f4, code lost:
    
        if (r11.emit(r4, r10) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (((java.lang.Boolean) kotlin.collections.C7714v.X(r11.getReplayCache())).booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r11.emit(r1, r10) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[Catch: all -> 0x001b, Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:22:0x002f, B:24:0x0038, B:25:0x0087, B:27:0x0097, B:29:0x00ad, B:31:0x003c, B:32:0x0065, B:36:0x004e), top: B:2:0x000a, outer: #0 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        w0 w0Var;
        x0 x0Var;
        w0 w0Var2;
        x0 x0Var2;
        x0 x0Var3;
        w0 w0Var3;
        w0 w0Var4;
        w0 w0Var5;
        w0 w0Var6;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
            } catch (Exception e11) {
                exc = e11;
                w0Var = this.this$0._actionFlow;
                Action.FetchError fetchError = Action.FetchError.INSTANCE;
                this.L$0 = exc;
                this.label = 4;
                if (w0Var.emit(fetchError, this) == aVar) {
                }
            }
            if (i11 == 0) {
                s.b(obj);
                x0Var3 = this.this$0._showLoading;
                x0Var3.setValue(Boolean.TRUE);
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$commentsListVO, null);
                this.label = 1;
                obj = C10727i.f(bVar, anonymousClass1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i11 == 1) {
                s.b(obj);
            } else if (i11 == 2) {
                s.b(obj);
                w0Var4 = this.this$0._keyboardVisibility;
                if (!w0Var4.getReplayCache().isEmpty()) {
                    w0Var6 = this.this$0._keyboardVisibility;
                }
                w0Var5 = this.this$0._keyboardVisibility;
                Boolean valueOf = Boolean.valueOf(this.$activateCommentField);
                this.label = 3;
            } else {
                if (i11 == 3) {
                    s.b(obj);
                    x0Var2 = this.this$0._showLoading;
                    x0Var2.setValue(Boolean.FALSE);
                    return Unit.f71690a;
                }
                if (i11 != 4) {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    x0Var2 = this.this$0._showLoading;
                    x0Var2.setValue(Boolean.FALSE);
                    return Unit.f71690a;
                }
                exc = (Exception) this.L$0;
                s.b(obj);
                w0Var2 = this.this$0._actionFlow;
                Action.Error error = new Action.Error(exc);
                this.L$0 = null;
                this.label = 5;
            }
            Pair pair = (Pair) obj;
            String str = (String) pair.a();
            List list = (List) pair.b();
            w0Var3 = this.this$0._actionFlow;
            Action.NewItems newItems = new Action.NewItems(list, str);
            this.label = 2;
            if (w0Var3.emit(newItems, this) == aVar) {
                return aVar;
            }
            w0Var4 = this.this$0._keyboardVisibility;
            if (!w0Var4.getReplayCache().isEmpty()) {
            }
            w0Var5 = this.this$0._keyboardVisibility;
            Boolean valueOf2 = Boolean.valueOf(this.$activateCommentField);
            this.label = 3;
        } catch (Throwable th2) {
            x0Var = this.this$0._showLoading;
            x0Var.setValue(Boolean.FALSE);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommentsViewModelImpl$loadComments$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
