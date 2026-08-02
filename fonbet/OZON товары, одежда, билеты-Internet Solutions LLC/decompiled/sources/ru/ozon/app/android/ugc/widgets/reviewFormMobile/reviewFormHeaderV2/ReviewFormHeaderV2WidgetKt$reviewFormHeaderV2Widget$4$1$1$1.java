package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import Sc.s;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.composer.compose.widget.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$1$1", f = "ReviewFormHeaderV2Widget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ReviewFormViewModel $formViewModel;
    final /* synthetic */ i<ReviewFormHeaderV2VO> $this_content;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$1$1(i<ReviewFormHeaderV2VO> iVar, ReviewFormViewModel reviewFormViewModel, d<? super ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$1$1> dVar) {
        super(2, dVar);
        this.$this_content = iVar;
        this.$formViewModel = reviewFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$1$1(this.$this_content, this.$formViewModel, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Float total = this.$this_content.b().getRating().getRating().getTotal();
        this.$formViewModel.onViewIntent(new ViewIntent.RatingUpdated(this.$this_content.b().getRating().getUploadKey(), String.valueOf(total != null ? new Integer(C6915b.c(total.floatValue())) : null), true));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
