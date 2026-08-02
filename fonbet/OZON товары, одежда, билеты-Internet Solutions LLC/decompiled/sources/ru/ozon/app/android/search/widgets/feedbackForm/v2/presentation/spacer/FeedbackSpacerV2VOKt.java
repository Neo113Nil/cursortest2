package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.spacer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.common.model.SpacerModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/spacer/FeedbackSpacerV2VO;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/model/SpacerModel;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackSpacerV2VOKt {
    @NotNull
    public static final FeedbackSpacerV2VO toVO(@NotNull SpacerModel spacerModel) {
        Intrinsics.checkNotNullParameter(spacerModel, "<this>");
        return new FeedbackSpacerV2VO(spacerModel.toString().hashCode(), spacerModel.getTopCornerRadius(), spacerModel.getBottomCornerRadius());
    }
}
