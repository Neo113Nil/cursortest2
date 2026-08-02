package ru.ozon.app.android.search.widgets.suggestions.ui.prefetch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsPrefetchModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsPrefetchModel;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/search/widgets/suggestions/ui/prefetch/SuggestionsPrefetchVO;", "toVO", "(Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsPrefetchModel;Ll20/d;)Lru/ozon/app/android/search/widgets/suggestions/ui/prefetch/SuggestionsPrefetchVO;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsPrefetchVOKt {
    @NotNull
    public static final SuggestionsPrefetchVO toVO(@NotNull SuggestionsPrefetchModel suggestionsPrefetchModel, @NotNull d info) {
        Intrinsics.checkNotNullParameter(suggestionsPrefetchModel, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        return new SuggestionsPrefetchVO(info.d().hashCode(), suggestionsPrefetchModel.getLinks());
    }
}
