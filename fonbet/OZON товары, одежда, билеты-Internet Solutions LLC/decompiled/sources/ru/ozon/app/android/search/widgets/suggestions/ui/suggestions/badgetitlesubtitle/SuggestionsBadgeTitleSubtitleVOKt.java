package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsBadgeTitleSubtitleModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsCommonModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTextModel;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsCommonVO;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsCommonVOKt;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsTextVO;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsTextVOKt;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle.SuggestionsBadgeTitleSubtitleVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.CornerRadius;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"toVO", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO;", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleModel;", "id", "", "size", "", "index", "islandColor", "", "backgroundColor", "cornerRadius", "", "determineLayoutModel", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO$LayoutModel;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsBadgeTitleSubtitleVOKt {
    private static final float cornerRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_500.getPx());

    @NotNull
    public static final SuggestionsBadgeTitleSubtitleVO.LayoutModel determineLayoutModel(int i11, int i12) {
        if (i11 == 1) {
            float f7 = cornerRadius;
            return new SuggestionsBadgeTitleSubtitleVO.LayoutModel(false, f7, f7);
        }
        if (i12 == 0) {
            return new SuggestionsBadgeTitleSubtitleVO.LayoutModel(false, cornerRadius, 0.0f, 5, null);
        }
        if (i12 == i11 - 1) {
            return new SuggestionsBadgeTitleSubtitleVO.LayoutModel(false, 0.0f, cornerRadius, 2, null);
        }
        return new SuggestionsBadgeTitleSubtitleVO.LayoutModel(false, 0.0f, 0.0f, 7, null);
    }

    @NotNull
    public static final SuggestionsBadgeTitleSubtitleVO toVO(@NotNull SuggestionsBadgeTitleSubtitleModel suggestionsBadgeTitleSubtitleModel, long j11, int i11, int i12, String str, String str2) {
        Intrinsics.checkNotNullParameter(suggestionsBadgeTitleSubtitleModel, "<this>");
        SuggestionsCommonModel common = suggestionsBadgeTitleSubtitleModel.getCommon();
        SuggestionsCommonVO vo = common != null ? SuggestionsCommonVOKt.toVO(common, j11) : null;
        SuggestionsTextVO vo2 = SuggestionsTextVOKt.toVO(suggestionsBadgeTitleSubtitleModel.getTitle());
        SuggestionsTextModel subtitle = suggestionsBadgeTitleSubtitleModel.getSubtitle();
        return new SuggestionsBadgeTitleSubtitleVO(j11, vo, vo2, subtitle != null ? SuggestionsTextVOKt.toVO(subtitle) : null, suggestionsBadgeTitleSubtitleModel.getBadge(), suggestionsBadgeTitleSubtitleModel.getIcon(), determineLayoutModel(i11, i12), str, str2);
    }
}
