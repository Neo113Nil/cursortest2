package ru.ozon.app.android.search.widgets.suggestions.ui.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTextModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsTextVO;", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTextModel;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsTextVOKt {
    @NotNull
    public static final SuggestionsTextVO toVO(@NotNull SuggestionsTextModel suggestionsTextModel) {
        Intrinsics.checkNotNullParameter(suggestionsTextModel, "<this>");
        return new SuggestionsTextVO(suggestionsTextModel.getTestInfo(), suggestionsTextModel.getText());
    }
}
