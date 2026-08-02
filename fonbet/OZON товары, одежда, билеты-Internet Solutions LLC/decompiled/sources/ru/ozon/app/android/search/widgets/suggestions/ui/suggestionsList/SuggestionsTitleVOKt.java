package ru.ozon.app.android.search.widgets.suggestions.ui.suggestionsList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTitleModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleModel;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "backgroundColor", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestionsList/SuggestionsTitleVO;", "toVO", "(Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleModel;Ll20/d;Ljava/lang/String;)Lru/ozon/app/android/search/widgets/suggestions/ui/suggestionsList/SuggestionsTitleVO;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsTitleVOKt {
    @NotNull
    public static final SuggestionsTitleVO toVO(@NotNull SuggestionsTitleModel suggestionsTitleModel, @NotNull d info, String str) {
        Intrinsics.checkNotNullParameter(suggestionsTitleModel, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        return new SuggestionsTitleVO(info.d().hashCode(), suggestionsTitleModel.getTitle(), str);
    }
}
