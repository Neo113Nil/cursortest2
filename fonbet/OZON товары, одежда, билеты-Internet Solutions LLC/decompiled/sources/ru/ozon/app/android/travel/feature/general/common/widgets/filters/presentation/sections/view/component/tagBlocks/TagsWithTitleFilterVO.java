package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;", "", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "filtersInTab", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "filterTabs", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFiltersInTab", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getFilterTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagsWithTitleFilterVO {
    private final TabsDTO filterTabs;

    @NotNull
    private final List<List<TagsWithTitleSectionInTabVO>> filtersInTab;

    /* JADX WARN: Multi-variable type inference failed */
    public TagsWithTitleFilterVO(@NotNull List<? extends List<TagsWithTitleSectionInTabVO>> filtersInTab, TabsDTO tabsDTO) {
        Intrinsics.checkNotNullParameter(filtersInTab, "filtersInTab");
        this.filtersInTab = filtersInTab;
        this.filterTabs = tabsDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagsWithTitleFilterVO)) {
            return false;
        }
        TagsWithTitleFilterVO tagsWithTitleFilterVO = (TagsWithTitleFilterVO) other;
        return Intrinsics.d(this.filtersInTab, tagsWithTitleFilterVO.filtersInTab) && Intrinsics.d(this.filterTabs, tagsWithTitleFilterVO.filterTabs);
    }

    public final TabsDTO getFilterTabs() {
        return this.filterTabs;
    }

    @NotNull
    public final List<List<TagsWithTitleSectionInTabVO>> getFiltersInTab() {
        return this.filtersInTab;
    }

    public int hashCode() {
        int hashCode = this.filtersInTab.hashCode() * 31;
        TabsDTO tabsDTO = this.filterTabs;
        return hashCode + (tabsDTO == null ? 0 : tabsDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TagsWithTitleFilterVO(filtersInTab=" + this.filtersInTab + ", filterTabs=" + this.filterTabs + ")";
    }
}
