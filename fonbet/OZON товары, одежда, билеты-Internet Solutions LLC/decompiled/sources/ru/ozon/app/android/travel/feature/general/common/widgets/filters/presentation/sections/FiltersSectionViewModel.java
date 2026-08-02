package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleFilterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleSectionInTabVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u000fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u0018\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/viewModelDelegate/SliderWithLabelsSectionViewModel;", "tabsViewModelDelegate", "tagWithTitleSectionViewModelDelegate", "sliderWithLabelsSectionViewModelDelegate", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModel;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModel;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/viewModelDelegate/SliderWithLabelsSectionViewModel;)V", "", "tabIndex", "", "onTabSelect", "(I)V", "Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "onTabsBindLiveData", "()Landroidx/lifecycle/P;", DynamicElementDTO.TABS, "setTabsModel", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "onTagsBindLiveData", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;", "tagsWithTitle", "setTagsModel", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "onSliderLiveData", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;", "data", "setSlidersModel", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/viewModelDelegate/SliderWithLabelsSectionViewModel;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersSectionViewModel extends w0 implements TabsViewModel, TagWithTitleSectionViewModel, SliderWithLabelsSectionViewModel {

    @NotNull
    private final SliderWithLabelsSectionViewModel sliderWithLabelsSectionViewModelDelegate;

    @NotNull
    private final TabsViewModel tabsViewModelDelegate;

    @NotNull
    private final TagWithTitleSectionViewModel tagWithTitleSectionViewModelDelegate;

    public FiltersSectionViewModel(@NotNull TabsViewModel tabsViewModelDelegate, @NotNull TagWithTitleSectionViewModel tagWithTitleSectionViewModelDelegate, @NotNull SliderWithLabelsSectionViewModel sliderWithLabelsSectionViewModelDelegate) {
        Intrinsics.checkNotNullParameter(tabsViewModelDelegate, "tabsViewModelDelegate");
        Intrinsics.checkNotNullParameter(tagWithTitleSectionViewModelDelegate, "tagWithTitleSectionViewModelDelegate");
        Intrinsics.checkNotNullParameter(sliderWithLabelsSectionViewModelDelegate, "sliderWithLabelsSectionViewModelDelegate");
        this.tabsViewModelDelegate = tabsViewModelDelegate;
        this.tagWithTitleSectionViewModelDelegate = tagWithTitleSectionViewModelDelegate;
        this.sliderWithLabelsSectionViewModelDelegate = sliderWithLabelsSectionViewModelDelegate;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    @NotNull
    public P<List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO>> onSliderLiveData() {
        return this.sliderWithLabelsSectionViewModelDelegate.onSliderLiveData();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel, ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel, ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    public void onTabSelect(int tabIndex) {
        this.tabsViewModelDelegate.onTabSelect(tabIndex);
        this.tagWithTitleSectionViewModelDelegate.onTabSelect(tabIndex);
        this.sliderWithLabelsSectionViewModelDelegate.onTabSelect(tabIndex);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel
    @NotNull
    public P<TabsDTO> onTabsBindLiveData() {
        return this.tabsViewModelDelegate.onTabsBindLiveData();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel
    @NotNull
    public P<List<TagsWithTitleSectionInTabVO>> onTagsBindLiveData() {
        return this.tagWithTitleSectionViewModelDelegate.onTagsBindLiveData();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    public void setSlidersModel(@NotNull SliderWithLabelsSectionVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.sliderWithLabelsSectionViewModelDelegate.setSlidersModel(data);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel
    public void setTabsModel(TabsDTO tabs) {
        this.tabsViewModelDelegate.setTabsModel(tabs);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel
    public void setTagsModel(@NotNull TagsWithTitleFilterVO tagsWithTitle) {
        Intrinsics.checkNotNullParameter(tagsWithTitle, "tagsWithTitle");
        this.tagWithTitleSectionViewModelDelegate.setTagsModel(tagsWithTitle);
    }
}
