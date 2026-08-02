package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModelDelegate;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModel;", "<init>", "()V", "", "applySelectedTab", "Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "onTabsBindLiveData", "()Landroidx/lifecycle/P;", DynamicElementDTO.TABS, "setTabsModel", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "", "tabIndex", "onTabSelect", "(I)V", "cachedTabs", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "selectedTabIndex", "I", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class TabsViewModelDelegate implements TabsViewModel {
    private TabsDTO cachedTabs;
    private int selectedTabIndex = -1;

    @NotNull
    private final SingleLiveEvent<TabsDTO> onTabsBindLiveData = new SingleLiveEvent<>();

    private final void applySelectedTab() {
        TabsDTO tabsDTO = this.cachedTabs;
        this.onTabsBindLiveData.setValue(tabsDTO != null ? TabsDTO.copy$default(tabsDTO, null, this.selectedTabIndex, null, null, null, null, null, null, null, 509, null) : null);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel, ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate.TagWithTitleSectionViewModel, ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    public void onTabSelect(int tabIndex) {
        if (tabIndex == this.selectedTabIndex) {
            return;
        }
        this.selectedTabIndex = tabIndex;
        applySelectedTab();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel
    @NotNull
    public P<TabsDTO> onTabsBindLiveData() {
        return this.onTabsBindLiveData;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate.TabsViewModel
    public void setTabsModel(TabsDTO tabs) {
        this.cachedTabs = tabs;
        int selectedTabIndex = tabs != null ? tabs.getSelectedTabIndex() : 0;
        if (this.selectedTabIndex == -1) {
            this.selectedTabIndex = selectedTabIndex;
        }
        applySelectedTab();
    }
}
