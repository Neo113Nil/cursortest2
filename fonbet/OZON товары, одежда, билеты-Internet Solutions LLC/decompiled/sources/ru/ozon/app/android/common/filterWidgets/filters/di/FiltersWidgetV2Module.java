package ru.ozon.app.android.common.filterWidgets.filters.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.core.FiltersConfig;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.boolfilter.BoolFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.bottom.BrandBottomViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.cells.BrandCellViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.title.BrandTitleViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.footer.CategoryFooterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.item.CategoryItemViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.AspectsColorFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.CircleColorFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.SquareColorFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.commonseparator.CommonSeparatorViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.disclosure.DisclosureViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.header.HeaderViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator.FiltersIslandSeparatorViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter.MultipleRangesViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button.FilterButtonViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.FilterNavBarViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.openRangeFilter.OpenRangeFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.TextInputFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.timerangefilter.TimeRangeFilterViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÅ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4¨\u00065"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/di/FiltersWidgetV2Module;", "", "<init>", "()V", "provideFiltersWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/common/filterWidgets/filters/core/FiltersConfig;", "boolFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/boolfilter/BoolFilterViewMapper;", "filterButtonViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/FilterButtonViewMapper;", "brandBottomViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/bottom/BrandBottomViewMapper;", "brandCellViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellViewMapper;", "brandTitleViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/title/BrandTitleViewMapper;", "categoryFooterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/footer/CategoryFooterViewMapper;", "categoryItemViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/item/CategoryItemViewMapper;", "circleColorFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/CircleColorFilterViewMapper;", "squareColorFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/SquareColorFilterViewMapper;", "commonSeparatorViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/commonseparator/CommonSeparatorViewMapper;", "disclosureViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/disclosure/DisclosureViewMapper;", "headerViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/header/HeaderViewMapper;", "multipleRangeFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesViewMapper;", "filterNavBarViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/FilterNavBarViewMapper;", "openRangeFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterViewMapper;", "rangeFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterViewMapper;", "tagFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterViewMapper;", "textInputFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterViewMapper;", "timeRangeFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/timerangefilter/TimeRangeFilterViewMapper;", "aspectsColorFilterViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/AspectsColorFilterViewMapper;", "brandAspectsViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorViewMapper;", "provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FiltersWidgetV2Module {

    @NotNull
    public static final FiltersWidgetV2Module INSTANCE = new FiltersWidgetV2Module();

    private FiltersWidgetV2Module() {
    }

    @NotNull
    public final Widget2 provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease(@NotNull FiltersConfig config, @NotNull BoolFilterViewMapper boolFilterViewMapper, @NotNull FilterButtonViewMapper filterButtonViewMapper, @NotNull BrandBottomViewMapper brandBottomViewMapper, @NotNull BrandCellViewMapper brandCellViewMapper, @NotNull BrandTitleViewMapper brandTitleViewMapper, @NotNull CategoryFooterViewMapper categoryFooterViewMapper, @NotNull CategoryItemViewMapper categoryItemViewMapper, @NotNull CircleColorFilterViewMapper circleColorFilterViewMapper, @NotNull SquareColorFilterViewMapper squareColorFilterViewMapper, @NotNull CommonSeparatorViewMapper commonSeparatorViewMapper, @NotNull DisclosureViewMapper disclosureViewMapper, @NotNull HeaderViewMapper headerViewMapper, @NotNull MultipleRangesViewMapper multipleRangeFilterViewMapper, @NotNull FilterNavBarViewMapper filterNavBarViewMapper, @NotNull OpenRangeFilterViewMapper openRangeFilterViewMapper, @NotNull RangeFilterViewMapper rangeFilterViewMapper, @NotNull TagFilterViewMapper tagFilterViewMapper, @NotNull TextInputFilterViewMapper textInputFilterViewMapper, @NotNull TimeRangeFilterViewMapper timeRangeFilterViewMapper, @NotNull AspectsColorFilterViewMapper aspectsColorFilterViewMapper, @NotNull BrandAspectsViewMapper brandAspectsViewMapper, @NotNull FiltersIslandSeparatorViewMapper islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(boolFilterViewMapper, "boolFilterViewMapper");
        Intrinsics.checkNotNullParameter(filterButtonViewMapper, "filterButtonViewMapper");
        Intrinsics.checkNotNullParameter(brandBottomViewMapper, "brandBottomViewMapper");
        Intrinsics.checkNotNullParameter(brandCellViewMapper, "brandCellViewMapper");
        Intrinsics.checkNotNullParameter(brandTitleViewMapper, "brandTitleViewMapper");
        Intrinsics.checkNotNullParameter(categoryFooterViewMapper, "categoryFooterViewMapper");
        Intrinsics.checkNotNullParameter(categoryItemViewMapper, "categoryItemViewMapper");
        Intrinsics.checkNotNullParameter(circleColorFilterViewMapper, "circleColorFilterViewMapper");
        Intrinsics.checkNotNullParameter(squareColorFilterViewMapper, "squareColorFilterViewMapper");
        Intrinsics.checkNotNullParameter(commonSeparatorViewMapper, "commonSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(disclosureViewMapper, "disclosureViewMapper");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(multipleRangeFilterViewMapper, "multipleRangeFilterViewMapper");
        Intrinsics.checkNotNullParameter(filterNavBarViewMapper, "filterNavBarViewMapper");
        Intrinsics.checkNotNullParameter(openRangeFilterViewMapper, "openRangeFilterViewMapper");
        Intrinsics.checkNotNullParameter(rangeFilterViewMapper, "rangeFilterViewMapper");
        Intrinsics.checkNotNullParameter(tagFilterViewMapper, "tagFilterViewMapper");
        Intrinsics.checkNotNullParameter(textInputFilterViewMapper, "textInputFilterViewMapper");
        Intrinsics.checkNotNullParameter(timeRangeFilterViewMapper, "timeRangeFilterViewMapper");
        Intrinsics.checkNotNullParameter(aspectsColorFilterViewMapper, "aspectsColorFilterViewMapper");
        Intrinsics.checkNotNullParameter(brandAspectsViewMapper, "brandAspectsViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return new Widget2("common", "filters", config, new ViewMapper2[]{filterButtonViewMapper, boolFilterViewMapper, brandBottomViewMapper, brandCellViewMapper, brandTitleViewMapper, categoryFooterViewMapper, categoryItemViewMapper, circleColorFilterViewMapper, squareColorFilterViewMapper, commonSeparatorViewMapper, disclosureViewMapper, headerViewMapper, multipleRangeFilterViewMapper, filterNavBarViewMapper, openRangeFilterViewMapper, rangeFilterViewMapper, tagFilterViewMapper, textInputFilterViewMapper, timeRangeFilterViewMapper, aspectsColorFilterViewMapper, brandAspectsViewMapper, islandSeparatorViewMapper});
    }
}
