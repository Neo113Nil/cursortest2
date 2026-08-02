package ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"createDefaultInput", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputModelKt {
    @NotNull
    public static final InputModel createDefaultInput() {
        return new InputModel(null, null, null, null, null, FeedbackFormDTO.OptionDTO.OptionType.INVALID);
    }
}
