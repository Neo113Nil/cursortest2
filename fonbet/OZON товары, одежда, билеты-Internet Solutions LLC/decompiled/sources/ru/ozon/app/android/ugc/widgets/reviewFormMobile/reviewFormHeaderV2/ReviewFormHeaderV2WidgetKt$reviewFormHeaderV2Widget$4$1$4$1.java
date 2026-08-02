package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "intent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$OnBackPressed;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$4$1 extends AbstractC7737t implements Function1<ViewIntent.OnBackPressed, Unit> {
    final /* synthetic */ ReviewFormViewModel $formViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$4$1(ReviewFormViewModel reviewFormViewModel) {
        super(1);
        this.$formViewModel = reviewFormViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewIntent.OnBackPressed onBackPressed) {
        invoke2(onBackPressed);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewIntent.OnBackPressed intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.$formViewModel.onViewIntent(intent);
    }
}
