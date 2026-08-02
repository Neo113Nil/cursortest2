package ru.ozon.app.android.search.widgets.suggestions.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsBadgeTitleSubtitleList;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsBadgeTitleSubtitleModel;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle.SuggestionsBadgeTitleSubtitleVO;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle.SuggestionsBadgeTitleSubtitleVOKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/core/BadgeTitleSubtitleCellMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleList;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleList;Ll20/d;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeTitleSubtitleCellMapper implements Function2<SuggestionsBadgeTitleSubtitleList, d, List<? extends SuggestionsBadgeTitleSubtitleVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SuggestionsBadgeTitleSubtitleVO> invoke(@NotNull SuggestionsBadgeTitleSubtitleList state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<SuggestionsBadgeTitleSubtitleModel> cells = state.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        int i11 = 0;
        for (Object obj : cells) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(SuggestionsBadgeTitleSubtitleVOKt.toVO((SuggestionsBadgeTitleSubtitleModel) obj, widgetInfo.d().hashCode(), state.getCells().size(), i11, state.getIslandColor(), state.getBackgroundColor()));
            i11 = i12;
        }
        return arrayList;
    }
}
