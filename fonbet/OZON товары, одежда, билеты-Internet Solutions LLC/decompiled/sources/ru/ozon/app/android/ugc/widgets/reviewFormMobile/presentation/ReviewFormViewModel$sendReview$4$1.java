package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SingleEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$sendReview$4$1", f = "ReviewFormViewModel.kt", l = {263, 264}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$sendReview$4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function2<Throwable, d<? super Unit>, Object> $onFailure;
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ ReviewFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormViewModel$sendReview$4$1(ReviewFormViewModel reviewFormViewModel, Function2<? super Throwable, ? super d<? super Unit>, ? extends Object> function2, Throwable th2, d<? super ReviewFormViewModel$sendReview$4$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormViewModel;
        this.$onFailure = function2;
        this.$throwable = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormViewModel$sendReview$4$1(this.this$0, this.$onFailure, this.$throwable, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r6.invoke(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0._singleEvent;
            SingleEvent.UpdateLoader updateLoader = new SingleEvent.UpdateLoader(false);
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
        Function2<Throwable, d<? super Unit>, Object> function2 = this.$onFailure;
        Throwable th2 = this.$throwable;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormViewModel$sendReview$4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
