package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<no name provided>", "", "uploadKey", "", "rating", "", "invoke", "(Ljava/lang/String;Ljava/lang/Float;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormRatingContentKt$reviewFormRatingContent$4$1$updateRating$1$1 extends AbstractC7737t implements Function2<String, Float, Unit> {
    final /* synthetic */ ReviewFormViewModel $formViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormRatingContentKt$reviewFormRatingContent$4$1$updateRating$1$1(ReviewFormViewModel reviewFormViewModel) {
        super(2);
        this.$formViewModel = reviewFormViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Float f7) {
        invoke2(str, f7);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String uploadKey, Float f7) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        this.$formViewModel.onViewIntent(new ViewIntent.RatingUpdated(uploadKey, String.valueOf(f7 != null ? Integer.valueOf(C6915b.c(f7.floatValue())) : null), false, 4, null));
    }
}
