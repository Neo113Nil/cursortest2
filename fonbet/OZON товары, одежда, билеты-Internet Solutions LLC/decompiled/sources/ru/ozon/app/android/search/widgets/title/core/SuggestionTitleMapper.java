package ru.ozon.app.android.search.widgets.title.core;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.search.widgets.title.presentation.SearchTitleVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/title/core/SuggestionTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO;Ll20/d;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionTitleMapper implements Function2<SuggestionDTO, d, List<? extends SearchTitleVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchTitleVO> invoke(@NotNull SuggestionDTO state, @NotNull d widgetInfo) {
        List<SuggestionDTO.SuggestionItemDTO> items;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String title = state.getTitle();
        return (title == null || title.length() == 0 || (items = state.getItems()) == null || items.isEmpty()) ? K.f71697a : C7714v.a0(new SearchTitleVO(a.a("SuggestionTitleMapper", state.getTitle()), state.getTitle(), null, null, 4, null));
    }
}
