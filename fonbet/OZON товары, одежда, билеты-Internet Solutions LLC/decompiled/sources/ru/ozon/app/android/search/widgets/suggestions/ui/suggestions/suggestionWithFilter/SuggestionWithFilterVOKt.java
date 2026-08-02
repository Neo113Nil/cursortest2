package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.widgets.suggestions.data.SuggestionsDTO;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterVO;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a \u0010\u0000\u001a\u00020\t*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u000b"}, d2 = {"toVo", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionWithFilter;", "id", "", "layoutManagerState", "Landroid/os/Parcelable;", "islandColor", "", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;", "Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionFilterItems;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionWithFilterVOKt {
    @NotNull
    public static final SuggestionWithFilterVO toVo(@NotNull SuggestionsDTO.SuggestionWithFilter suggestionWithFilter, long j11, Parcelable parcelable, String str) {
        Intrinsics.checkNotNullParameter(suggestionWithFilter, "<this>");
        TitleSubtitleCellDTO suggestion = suggestionWithFilter.getSuggestion();
        suggestion.getTitle().setTagSupported(true);
        Unit unit = Unit.f71690a;
        return new SuggestionWithFilterVO(j11, suggestion, toVo(suggestionWithFilter.getFilter(), j11, parcelable), str);
    }

    public static /* synthetic */ SuggestionWithFilterVO toVo$default(SuggestionsDTO.SuggestionWithFilter suggestionWithFilter, long j11, Parcelable parcelable, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            parcelable = null;
        }
        return toVo(suggestionWithFilter, j11, parcelable, str);
    }

    @NotNull
    public static final SuggestionWithFilterVO.SuggestionFilterItemsVO toVo(@NotNull SuggestionsDTO.SuggestionFilterItems suggestionFilterItems, long j11, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(suggestionFilterItems, "<this>");
        TextDTO title = suggestionFilterItems.getTitle();
        List<BadgeDTO> values = suggestionFilterItems.getValues();
        Map<String, TokenizedTrackingInfo> trackingInfo = suggestionFilterItems.getTrackingInfo();
        return new SuggestionWithFilterVO.SuggestionFilterItemsVO(title, values, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, suggestionFilterItems.getTestInfo(), parcelable);
    }
}
