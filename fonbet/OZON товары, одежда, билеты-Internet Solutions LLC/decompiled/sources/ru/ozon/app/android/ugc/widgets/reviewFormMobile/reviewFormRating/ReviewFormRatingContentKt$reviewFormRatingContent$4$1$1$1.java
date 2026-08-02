package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.composer.compose.widget.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingContentKt$reviewFormRatingContent$4$1$1$1", f = "ReviewFormRatingContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormRatingContentKt$reviewFormRatingContent$4$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ i<ReviewFormRatingVO> $this_content;
    final /* synthetic */ Function2<String, Float, Unit> $updateRating;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormRatingContentKt$reviewFormRatingContent$4$1$1$1(Function2<? super String, ? super Float, Unit> function2, i<ReviewFormRatingVO> iVar, d<? super ReviewFormRatingContentKt$reviewFormRatingContent$4$1$1$1> dVar) {
        super(2, dVar);
        this.$updateRating = function2;
        this.$this_content = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormRatingContentKt$reviewFormRatingContent$4$1$1$1(this.$updateRating, this.$this_content, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$updateRating.invoke(this.$this_content.b().getUploadKey(), this.$this_content.b().getRating().getTotal());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormRatingContentKt$reviewFormRatingContent$4$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
