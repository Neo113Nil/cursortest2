package ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2DTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"createDefaultInput", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputV2ModelKt {
    @NotNull
    public static final InputV2Model createDefaultInput() {
        return new InputV2Model(null, null, null, null, null, FeedbackFormV2DTO.OptionDTO.OptionType.INVALID);
    }
}
