package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget;

import androidx.activity.C;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2$1", "invoke", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ ReviewFormNoUiWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2(ReviewFormNoUiWidgetViewHolder reviewFormNoUiWidgetViewHolder) {
        super(0);
        this.this$0 = reviewFormNoUiWidgetViewHolder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final ReviewFormNoUiWidgetViewHolder reviewFormNoUiWidgetViewHolder = this.this$0;
        return new C() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiWidgetViewHolder$onBackPressedCallback$2.1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                ReviewFormViewModel reviewFormViewModel;
                ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfig;
                int minRating;
                ReviewFormNoUiParamsVO boundData = ReviewFormNoUiWidgetViewHolder.this.getBoundData();
                Integer num = null;
                ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig = boundData != null ? boundData.getSubmitOnBackConfig() : null;
                if (submitOnBackConfig != null) {
                    setEnabled(false);
                }
                reviewFormViewModel = ReviewFormNoUiWidgetViewHolder.this.formViewModel;
                if (submitOnBackConfig == null) {
                    ReviewFormNoUiParamsVO boundData2 = ReviewFormNoUiWidgetViewHolder.this.getBoundData();
                    if (boundData2 != null && (placeholdersSheetConfig = boundData2.getPlaceholdersSheetConfig()) != null) {
                        minRating = placeholdersSheetConfig.getMinRating();
                    }
                    reviewFormViewModel.onViewIntent(new ViewIntent.OnBackPressed(null, num, submitOnBackConfig, 1, null));
                }
                minRating = submitOnBackConfig.getMinRating();
                num = Integer.valueOf(minRating);
                reviewFormViewModel.onViewIntent(new ViewIntent.OnBackPressed(null, num, submitOnBackConfig, 1, null));
            }
        };
    }
}
