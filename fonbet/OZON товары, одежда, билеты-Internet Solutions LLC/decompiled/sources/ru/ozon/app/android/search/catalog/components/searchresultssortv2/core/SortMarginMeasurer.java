package ru.ozon.app.android.search.catalog.components.searchresultssortv2.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.data.SearchResultsSortV2DTO;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.FilterButtonView;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SortMarginMeasurer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "viewButtonWidth", "", "filterButtonView", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/FilterButtonView;", "measure", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;", "viewButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "filterButton", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "measureFilterButton", "button", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SortMarginMeasurer {

    @NotNull
    private final FilterButtonView filterButtonView;
    private final int viewButtonWidth;

    public SortMarginMeasurer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewButtonWidth = ResourceExtKt.toPx(56);
        this.filterButtonView = new FilterButtonView(context, null, 0, 6, null);
    }

    private final int measureFilterButton(SearchResultsSortV2DTO.FilterButton button) {
        if (button == null) {
            return 0;
        }
        FilterButtonView filterButtonView = this.filterButtonView;
        SearchResultsSortV2DTO.FilterButton.FilterBadge badge = button.getBadge();
        filterButtonView.setBadge(badge != null ? badge.getText() : null, 0);
        this.filterButtonView.measure(0, 0);
        return this.filterButtonView.getMeasuredWidth();
    }

    @NotNull
    public final SearchResultsSortV2VO.SortButtonMargins measure(ButtonV3Atom.SmallIconButton viewButton, SearchResultsSortV2DTO.FilterButton filterButton) {
        if (viewButton == null) {
            return new SearchResultsSortV2VO.SortButtonMargins(0, 0);
        }
        int measureFilterButton = measureFilterButton(filterButton);
        int max = Math.max(this.viewButtonWidth, measureFilterButton);
        return new SearchResultsSortV2VO.SortButtonMargins(max - this.viewButtonWidth, max - measureFilterButton);
    }
}
