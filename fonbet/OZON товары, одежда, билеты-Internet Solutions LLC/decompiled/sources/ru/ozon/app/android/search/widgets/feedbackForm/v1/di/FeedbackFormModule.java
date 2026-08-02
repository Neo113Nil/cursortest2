package ru.ozon.app.android.search.widgets.feedbackForm.v1.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormConfig;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.cell.FeedbackCellViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.input.FeedbackInputViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton.FeedbackSendButtonViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.spacer.FeedbackSpacerViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/di/FeedbackFormModule;", "", "<init>", "()V", "provideFeedbackFormWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "feedbackForm", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormConfig;", "feedbackCellViewMapper", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellViewMapper;", "feedbackInputViewMapper", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/input/FeedbackInputViewMapper;", "feedbackSpacerViewMapper", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/spacer/FeedbackSpacerViewMapper;", "feedbackSendButtonViewMapper", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/sendButton/FeedbackSendButtonViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeedbackFormModule {

    @NotNull
    public static final FeedbackFormModule INSTANCE = new FeedbackFormModule();

    private FeedbackFormModule() {
    }

    @NotNull
    public final Widget2 provideFeedbackFormWidget(@NotNull FeedbackFormConfig feedbackForm, @NotNull FeedbackCellViewMapper feedbackCellViewMapper, @NotNull FeedbackInputViewMapper feedbackInputViewMapper, @NotNull FeedbackSpacerViewMapper feedbackSpacerViewMapper, @NotNull FeedbackSendButtonViewMapper feedbackSendButtonViewMapper) {
        Intrinsics.checkNotNullParameter(feedbackForm, "feedbackForm");
        Intrinsics.checkNotNullParameter(feedbackCellViewMapper, "feedbackCellViewMapper");
        Intrinsics.checkNotNullParameter(feedbackInputViewMapper, "feedbackInputViewMapper");
        Intrinsics.checkNotNullParameter(feedbackSpacerViewMapper, "feedbackSpacerViewMapper");
        Intrinsics.checkNotNullParameter(feedbackSendButtonViewMapper, "feedbackSendButtonViewMapper");
        return new Widget2("catalog", "feedbackForm", feedbackForm, new ViewMapper2[]{feedbackCellViewMapper, feedbackInputViewMapper, feedbackSpacerViewMapper, feedbackSendButtonViewMapper});
    }
}
