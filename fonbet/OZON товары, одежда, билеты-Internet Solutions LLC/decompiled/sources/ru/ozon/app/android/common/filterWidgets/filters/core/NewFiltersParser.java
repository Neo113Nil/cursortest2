package ru.ozon.app.android.common.filterWidgets.filters.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.filterWidgets.filters.data.BoolFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.BrandAspectsModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.BrandFilterBottomModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.BrandFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.BrandFilterTitleModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.ColorFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.CommonSeparatorModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.DisclosureFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.FilterButtonFilter;
import ru.ozon.app.android.common.filterWidgets.filters.data.FilterCategoryItemModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.FilterNavBarModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filters.data.HeaderModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.MultipleRangesModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.OpenRangeFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.RangeFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.TagFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.TextInputFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.TimeRangeFilterModel;
import ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.TimeRangeFilter;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 f22\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005:\u0001fB\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001a\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001d\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u000bH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J)\u0010'\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J+\u0010,\u001a\u00020+*\u00020)2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010-J+\u00100\u001a\u00020/*\u00020.2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u000203*\u0002022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00108\u001a\u000207*\u0002062\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b8\u00109J+\u0010<\u001a\u00020;*\u00020:2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b<\u0010=J+\u0010@\u001a\u00020?*\u00020>2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u00020C*\u00020B2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\bD\u0010EJ+\u0010H\u001a\u00020G*\u00020F2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\bH\u0010IJ\u001b\u0010L\u001a\u00020K*\u00020J2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010MJ9\u0010P\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010O\u001a\u00020N2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\bP\u0010QJ)\u0010V\u001a\u00020U*\u00020\u00022\u0014\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0002¢\u0006\u0004\bV\u0010WJA\u0010\\\u001a\u00020[*\u00020X2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020\u00182\u0014\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0002¢\u0006\u0004\b\\\u0010]J)\u0010_\u001a\u00020^*\u0002062\u0014\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020S\u0018\u00010RH\u0002¢\u0006\u0004\b_\u0010`J*\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010a\u001a\u0004\u0018\u00010\u00022\b\u0010b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\bc\u0010dR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010e¨\u0006g"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/core/NewFiltersParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO;", "dto", "", "isNavBarNotEmpty", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO;)Z", "", "filters", "originalUrl", "", "appendFilters", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$MultipleRangesFilter;", "item", "", "index", "appendMultipleRangesFilter", "(Ljava/util/List;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$MultipleRangesFilter;Ljava/lang/String;Ljava/util/List;I)V", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter;", "appendAspectBrandFilter", "(Ljava/util/List;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter;Ljava/lang/String;I)V", "Lru/ozon/app/android/common/filterWidgets/filters/data/FilterButtonFilter;", "extractButton", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO;)Lru/ozon/app/android/common/filterWidgets/filters/data/FilterButtonFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FilterNavBarModel;", "extractNavBar", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO;)Lru/ozon/app/android/common/filterWidgets/filters/data/FilterNavBarModel;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter;", "category", "appendCategory", "(Ljava/util/List;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter;Ljava/lang/String;)V", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;", "lastIndex", "Lru/ozon/app/android/common/filterWidgets/filters/data/ColorFilterModel;", "mapColorFilter", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;Ljava/lang/String;II)Lru/ozon/app/android/common/filterWidgets/filters/data/ColorFilterModel;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/TagFilterModel;", "mapTagFilter", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;Ljava/lang/String;II)Lru/ozon/app/android/common/filterWidgets/filters/data/TagFilterModel;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/BoolFilterModel;", "mapBoolFilter", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;Ljava/lang/String;)Lru/ozon/app/android/common/filterWidgets/filters/data/BoolFilterModel;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/DisclosureFilterModel;", "mapDisclosureFilter", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;Ljava/lang/String;)Lru/ozon/app/android/common/filterWidgets/filters/data/DisclosureFilterModel;", "Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;", "mapRangeFilter", "(Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;Ljava/lang/String;II)Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;", "Lru/ozon/app/android/storefront/core/atoms/data/TimeRangeFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/TimeRangeFilterModel;", "mapTimeRangeFilter", "(Lru/ozon/app/android/storefront/core/atoms/data/TimeRangeFilter;Ljava/lang/String;II)Lru/ozon/app/android/common/filterWidgets/filters/data/TimeRangeFilterModel;", "Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/OpenRangeFilterModel;", "mapOpenRangeFilter", "(Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;Ljava/lang/String;)Lru/ozon/app/android/common/filterWidgets/filters/data/OpenRangeFilterModel;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/TextInputFilterModel;", "mapTextInputFilter", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter;Ljava/lang/String;II)Lru/ozon/app/android/common/filterWidgets/filters/data/TextInputFilterModel;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FilterCategoryItemModel;", "mapToModel", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;Ljava/lang/String;)Lru/ozon/app/android/common/filterWidgets/filters/data/FilterCategoryItemModel;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$BrandFilter;", "brand", "appendBrandFilter", "(Ljava/util/List;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$BrandFilter;Ljava/lang/String;II)V", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterTitleModel;", "toBrandTitleModel", "(Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterTitleModel;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "brandIndex", "brandsCount", "Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterModel;", "mapToBrandModel", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;Ljava/lang/String;IILjava/util/Map;)Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterModel;", "Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterBottomModel;", "toBottomModel", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;Ljava/util/Map;)Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterBottomModel;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NewFiltersParser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/core/NewFiltersParser$Companion;", "", "<init>", "()V", "SEPARATOR_HEIGHT", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NewFiltersParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final void appendAspectBrandFilter(List<Object> list, FiltersDTO.Section.Filter.AspectBrandFilter aspectBrandFilter, String str, int i11) {
        String title = aspectBrandFilter.getTitle();
        List<FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand> items = aspectBrandFilter.getItems();
        Boolean scrollEnabled = aspectBrandFilter.getScrollEnabled();
        boolean booleanValue = scrollEnabled != null ? scrollEnabled.booleanValue() : false;
        Integer maxRowsCount = aspectBrandFilter.getMaxRowsCount();
        Integer totalValuesCount = aspectBrandFilter.getTotalValuesCount();
        Map<String, TokenizedTrackingInfo> trackingInfo = aspectBrandFilter.getTrackingInfo();
        IconDTO rightIcon = aspectBrandFilter.getRightIcon();
        list.add(new BrandAspectsModel(title, aspectBrandFilter.getAction(), aspectBrandFilter.getRightButton(), rightIcon, booleanValue, items, str, i11 != C7714v.P(list), maxRowsCount, totalValuesCount, trackingInfo));
    }

    private final void appendBrandFilter(List<Object> list, FiltersDTO.Section.Filter.BrandFilter brandFilter, String str, int i11, int i12) {
        list.add(toBrandTitleModel(brandFilter.getTitle(), brandFilter.getTrackingInfo()));
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> roundedCells = brandFilter.getRoundedCells();
        ArrayList arrayList = new ArrayList(C7714v.z(roundedCells, 10));
        int i13 = 0;
        for (Object obj : roundedCells) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapToBrandModel(CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) obj, null, null, false, false, false, null, true, null, null, null, null, null, null, null, false, false, null, null, null, 524223, null), str, i13, brandFilter.getRoundedCells().size(), brandFilter.getTrackingInfo()));
            i13 = i14;
        }
        list.addAll(arrayList);
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter bottomCell = brandFilter.getBottomCell();
        if (bottomCell != null) {
            list.add(toBottomModel(bottomCell, brandFilter.getTrackingInfo()));
        }
        if (i11 != i12) {
            list.add(CommonSeparatorModel.INSTANCE);
        }
    }

    private final void appendCategory(List<Object> list, FiltersDTO.Section.Filter.CategoryFilter categoryFilter, String str) {
        List<FiltersDTO.Section.Filter.CategoryFilter.Category> categories = categoryFilter.getCategories();
        ArrayList arrayList = new ArrayList(C7714v.z(categories, 10));
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToModel((FiltersDTO.Section.Filter.CategoryFilter.Category) it.next(), str));
        }
        list.addAll(arrayList);
        FiltersDTO.Section.Filter.CategoryFilter.Footer footer = categoryFilter.getFooter();
        if (footer != null) {
            list.add(footer);
        }
    }

    private final void appendFilters(List<Object> list, List<? extends Object> list2, String str) {
        List<Object> list3;
        String str2;
        List<? extends Object> list4;
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (obj instanceof FiltersDTO.Section.Filter.CategoryFilter) {
                appendCategory(list, (FiltersDTO.Section.Filter.CategoryFilter) obj, str);
            } else if (obj instanceof FiltersDTO.Section.Filter.ColorFilter) {
                list.add(mapColorFilter((FiltersDTO.Section.Filter.ColorFilter) obj, str, i11, C7714v.P(list2)));
            } else if (obj instanceof FiltersDTO.Section.Filter.TagFilter) {
                list.add(mapTagFilter((FiltersDTO.Section.Filter.TagFilter) obj, str, i11, C7714v.P(list2)));
            } else if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter) {
                list.add(mapBoolFilter((CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter) obj, str));
            } else if (obj instanceof RangeFilter) {
                list.add(mapRangeFilter((RangeFilter) obj, str, i11, C7714v.P(list2)));
            } else if (obj instanceof TimeRangeFilter) {
                list.add(mapTimeRangeFilter((TimeRangeFilter) obj, str, i11, C7714v.P(list2)));
            } else if (obj instanceof OpenRangeFilter) {
                list.add(mapOpenRangeFilter((OpenRangeFilter) obj, str));
            } else if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter) {
                list.add(mapDisclosureFilter((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter) obj, str));
            } else if (obj instanceof FiltersDTO.Section.Filter.TextInputFilter) {
                list.add(mapTextInputFilter((FiltersDTO.Section.Filter.TextInputFilter) obj, str, i11, C7714v.P(list2)));
            } else {
                if (obj instanceof FiltersDTO.Section.Filter.BrandFilter) {
                    list3 = list;
                    str2 = str;
                    appendBrandFilter(list3, (FiltersDTO.Section.Filter.BrandFilter) obj, str2, i11, C7714v.P(list2));
                    list4 = list2;
                } else {
                    list3 = list;
                    str2 = str;
                    if (obj instanceof FiltersDTO.Section.Filter.MultipleRangesFilter) {
                        int i13 = i11;
                        list4 = list2;
                        appendMultipleRangesFilter(list3, (FiltersDTO.Section.Filter.MultipleRangesFilter) obj, str2, list4, i13);
                    } else {
                        int i14 = i11;
                        list4 = list2;
                        if (obj instanceof FiltersDTO.Section.Filter.AspectBrandFilter) {
                            appendAspectBrandFilter(list3, (FiltersDTO.Section.Filter.AspectBrandFilter) obj, str2, i14);
                        } else {
                            list3.add(obj);
                        }
                    }
                }
                list = list3;
                str = str2;
                list2 = list4;
                i11 = i12;
            }
            list3 = list;
            list4 = list2;
            str2 = str;
            list = list3;
            str = str2;
            list2 = list4;
            i11 = i12;
        }
    }

    private final void appendMultipleRangesFilter(List<Object> list, FiltersDTO.Section.Filter.MultipleRangesFilter multipleRangesFilter, String str, List<? extends Object> list2, int i11) {
        RangeFilter rangeFilter = multipleRangesFilter.getRangeFilter();
        RangeFilterModel mapRangeFilter = rangeFilter != null ? mapRangeFilter(rangeFilter, str, i11, C7714v.P(list2)) : null;
        FiltersDTO.Section.Filter.TagFilter tagFilter = multipleRangesFilter.getTagFilter();
        list.add(new MultipleRangesModel(mapRangeFilter, tagFilter != null ? mapTagFilter(tagFilter, str, i11, C7714v.P(list2)) : null));
    }

    private final FilterButtonFilter extractButton(FiltersDTO filtersDTO) {
        return new FilterButtonFilter(filtersDTO.getCloseApplyButton(), filtersDTO.getOriginalUrl());
    }

    private final FilterNavBarModel extractNavBar(FiltersDTO filtersDTO) {
        return new FilterNavBarModel(filtersDTO.getNavBar(), null, null, 0, null, 24, null);
    }

    private final boolean isNavBarNotEmpty(FiltersDTO dto) {
        return (h.K(dto.getNavBar().getTitle()) && dto.getNavBar().getRightButton() == null && dto.getNavBar().getBackButton() == null) ? false : true;
    }

    private final BoolFilterModel mapBoolFilter(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter cellWithSubtitleToggleCounter, String str) {
        return new BoolFilterModel(cellWithSubtitleToggleCounter, str);
    }

    private final ColorFilterModel mapColorFilter(FiltersDTO.Section.Filter.ColorFilter colorFilter, String str, int i11, int i12) {
        return new ColorFilterModel(colorFilter, str, i11 != i12);
    }

    private final DisclosureFilterModel mapDisclosureFilter(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, String str) {
        return new DisclosureFilterModel(cellWithSubtitleCounter, str);
    }

    private final OpenRangeFilterModel mapOpenRangeFilter(OpenRangeFilter openRangeFilter, String str) {
        return new OpenRangeFilterModel(openRangeFilter, str);
    }

    private final RangeFilterModel mapRangeFilter(RangeFilter rangeFilter, String str, int i11, int i12) {
        return new RangeFilterModel(rangeFilter, str, i11 != i12);
    }

    private final TagFilterModel mapTagFilter(FiltersDTO.Section.Filter.TagFilter tagFilter, String str, int i11, int i12) {
        Boolean hideSeparator = tagFilter.getHideSeparator();
        return new TagFilterModel(tagFilter, str, (hideSeparator != null ? hideSeparator.booleanValue() : false) || i11 == i12);
    }

    private final TextInputFilterModel mapTextInputFilter(FiltersDTO.Section.Filter.TextInputFilter textInputFilter, String str, int i11, int i12) {
        return new TextInputFilterModel(textInputFilter, str, i11 != i12);
    }

    private final TimeRangeFilterModel mapTimeRangeFilter(TimeRangeFilter timeRangeFilter, String str, int i11, int i12) {
        return new TimeRangeFilterModel(timeRangeFilter, str, i11 != i12);
    }

    private final BrandFilterModel mapToBrandModel(CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio, String str, int i11, int i12, Map<String, TokenizedTrackingInfo> map) {
        return new BrandFilterModel(cellWithSubtitle40IconCheckboxRadio, str, i11, i12, map);
    }

    private final FilterCategoryItemModel mapToModel(FiltersDTO.Section.Filter.CategoryFilter.Category category, String str) {
        return new FilterCategoryItemModel(str, category);
    }

    private final BrandFilterBottomModel toBottomModel(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, Map<String, TokenizedTrackingInfo> map) {
        return new BrandFilterBottomModel(cellWithSubtitleCounter, map);
    }

    private final BrandFilterTitleModel toBrandTitleModel(String str, Map<String, TokenizedTrackingInfo> map) {
        return new BrandFilterTitleModel(str, map);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        Intrinsics.f(state);
        FiltersDTO filtersDTO = (FiltersDTO) jsonParser.fromJson(state, FiltersDTO.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(extractButton(filtersDTO));
        if (isNavBarNotEmpty(filtersDTO)) {
            arrayList.add(extractNavBar(filtersDTO));
        }
        int i11 = 0;
        for (Object obj : filtersDTO.getSections()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FiltersDTO.Section section = (FiltersDTO.Section) obj;
            FiltersDTO.Section.Header header = section.getHeader();
            if (header != null) {
                arrayList.add(new HeaderModel(header, filtersDTO.getOriginalUrl()));
            }
            List<Object> filters = section.getFilters();
            if (filters != null) {
                appendFilters(arrayList, filters, filtersDTO.getOriginalUrl());
            }
            if (i11 != C7714v.P(filtersDTO.getSections())) {
                arrayList.add(new IslandSeparatorDTO(4, UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null));
            }
            i11 = i12;
        }
        return arrayList;
    }
}
