package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate;

import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleFilterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleSectionInTabVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModelDelegate;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModel;", "<init>", "()V", "", "applySelectedTabs", "Landroidx/lifecycle/P;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "onTagsBindLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;", "tagsWithTitle", "setTagsModel", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;)V", "", "tabIndex", "onTabSelect", "(I)V", "cachedModel", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;", "selectedTabIndex", "I", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagWithTitleSectionViewModelDelegate implements TagWithTitleSectionViewModel {
    private TagsWithTitleFilterVO cachedModel;
    private int selectedTabIndex = -1;

    @NotNull
    private final SingleLiveEvent<List<TagsWithTitleSectionInTabVO>> onTagsBindLiveData = new SingleLiveEvent<>();

    private final void applySelectedTabs() {
        List<TagsWithTitleSectionInTabVO> list;
        List<List<TagsWithTitleSectionInTabVO>> filtersInTab;
        SingleLiveEvent<List<TagsWithTitleSectionInTabVO>> singleLiveEvent = this.onTagsBindLiveData;
        TagsWithTitleFilterVO tagsWithTitleFilterVO = this.cachedModel;
        if (tagsWithTitleFilterVO == null || (filtersInTab = tagsWithTitleFilterVO.getFiltersInTab()) == null || (list = (List) C7714v.Q(this.selectedTabIndex, filtersInTab)) == null) {
            list = K.f71697a;
        }
        singleLiveEvent.setValue(list);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel, ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    public void onTabSelect(int tabIndex) {
        if (tabIndex == this.selectedTabIndex) {
            return;
        }
        this.selectedTabIndex = tabIndex;
        applySelectedTabs();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel
    @NotNull
    public P<List<TagsWithTitleSectionInTabVO>> onTagsBindLiveData() {
        return this.onTagsBindLiveData;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel
    public void setTagsModel(@NotNull TagsWithTitleFilterVO tagsWithTitle) {
        TabsDTO filterTabs;
        Intrinsics.checkNotNullParameter(tagsWithTitle, "tagsWithTitle");
        this.cachedModel = tagsWithTitle;
        Integer valueOf = (tagsWithTitle == null || (filterTabs = tagsWithTitle.getFilterTabs()) == null) ? null : Integer.valueOf(filterTabs.getSelectedTabIndex());
        if (this.selectedTabIndex == -1) {
            this.selectedTabIndex = valueOf != null ? valueOf.intValue() : 0;
        }
        applySelectedTabs();
    }
}
