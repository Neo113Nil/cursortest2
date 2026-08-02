package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsCommonModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTitleSubtitleModel;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsCommonVOKt;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsTextVOKt;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle.SuggestionsTitleSubtitleVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\"\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"toVO", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleVO;", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleModel;", "id", "", "size", "", "index", "islandColor", "", "defaultTopPadding", "defaultBottomPadding", "determineLayoutModel", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleVO$LayoutModel;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsTitleSubtitleVOKt {
    private static final int defaultTopPadding = ResourceExtKt.toPx(4);
    private static final int defaultBottomPadding = ResourceExtKt.toPx(4);

    @NotNull
    public static final SuggestionsTitleSubtitleVO.LayoutModel determineLayoutModel(int i11, int i12) {
        if (i11 == 1) {
            return new SuggestionsTitleSubtitleVO.LayoutModel(defaultTopPadding, defaultBottomPadding, false);
        }
        if (i12 == 0) {
            return new SuggestionsTitleSubtitleVO.LayoutModel(defaultTopPadding, 0, false, 4, null);
        }
        if (i12 == i11 - 1) {
            return new SuggestionsTitleSubtitleVO.LayoutModel(0, defaultBottomPadding, false);
        }
        return new SuggestionsTitleSubtitleVO.LayoutModel(0, 0, false, 4, null);
    }

    @NotNull
    public static final SuggestionsTitleSubtitleVO toVO(@NotNull SuggestionsTitleSubtitleModel suggestionsTitleSubtitleModel, long j11, int i11, int i12, String str) {
        Intrinsics.checkNotNullParameter(suggestionsTitleSubtitleModel, "<this>");
        SuggestionsCommonModel common = suggestionsTitleSubtitleModel.getCommon();
        return new SuggestionsTitleSubtitleVO(j11, common != null ? SuggestionsCommonVOKt.toVO(common, j11) : null, SuggestionsTextVOKt.toVO(suggestionsTitleSubtitleModel.getTitle()), suggestionsTitleSubtitleModel.getRemoveButton(), determineLayoutModel(i11, i12), str);
    }
}
