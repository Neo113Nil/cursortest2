package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import Sc.s;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1", f = "ReviewFormRatingComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ReviewFormRatingVO $item;
    final /* synthetic */ Function1<t, Unit> $onFullScreenAnalytics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1(ReviewFormRatingVO reviewFormRatingVO, Function1<? super t, Unit> function1, d<? super ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1> dVar) {
        super(2, dVar);
        this.$item = reviewFormRatingVO;
        this.$onFullScreenAnalytics = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1(this.$item, this.$onFullScreenAnalytics, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        t ratingFullScreenEvent;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.$item.getIsRatingFullScreen() && (ratingFullScreenEvent = this.$item.getRatingFullScreenEvent()) != null) {
            this.$onFullScreenAnalytics.invoke(ratingFullScreenEvent);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
