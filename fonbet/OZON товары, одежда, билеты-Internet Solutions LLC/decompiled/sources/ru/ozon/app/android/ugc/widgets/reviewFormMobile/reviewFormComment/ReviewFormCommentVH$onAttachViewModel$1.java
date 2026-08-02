package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.RequestInputFocusKey;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH$onAttachViewModel$1", f = "ReviewFormCommentVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormCommentVH$onAttachViewModel$1 extends j implements Function2<a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReviewFormCommentVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormCommentVH$onAttachViewModel$1(ReviewFormCommentVH reviewFormCommentVH, d<? super ReviewFormCommentVH$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormCommentVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewFormCommentVH$onAttachViewModel$1 reviewFormCommentVH$onAttachViewModel$1 = new ReviewFormCommentVH$onAttachViewModel$1(this.this$0, dVar);
        reviewFormCommentVH$onAttachViewModel$1.L$0 = obj;
        return reviewFormCommentVH$onAttachViewModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((ReviewFormCommentVH$onAttachViewModel$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if ((aVar2 instanceof a.J) && (((a.J) aVar2).d() instanceof RequestInputFocusKey)) {
            this.this$0.containerView.requestFocusAndShowKeyboard();
        }
        return Unit.f71690a;
    }
}
