package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.tabs.viewModelDelegate;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/tabs/viewModelDelegate/TabsViewModel;", "", "Landroidx/lifecycle/P;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "onTabsBindLiveData", "()Landroidx/lifecycle/P;", DynamicElementDTO.TABS, "", "setTabsModel", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "", "tabIndex", "onTabSelect", "(I)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TabsViewModel {
    void onTabSelect(int tabIndex);

    @NotNull
    P<TabsDTO> onTabsBindLiveData();

    void setTabsModel(TabsDTO tabs);
}
