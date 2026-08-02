package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate;

import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/viewModelDelegate/SliderWithLabelsSectionViewModelDelegate;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/viewModelDelegate/SliderWithLabelsSectionViewModel;", "<init>", "()V", "", "applySelectedSliders", "Landroidx/lifecycle/P;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "onSliderLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;", "data", "setSlidersModel", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;)V", "", "tabIndex", "onTabSelect", "(I)V", "selectedTabIndex", "I", "cachedModel", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SliderWithLabelsSectionViewModelDelegate implements SliderWithLabelsSectionViewModel {
    private SliderWithLabelsSectionVO cachedModel;
    private int selectedTabIndex = -1;

    @NotNull
    private final SingleLiveEvent<List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO>> onSliderLiveData = new SingleLiveEvent<>();

    private final void applySelectedSliders() {
        SliderWithLabelsSectionVO sliderWithLabelsSectionVO = this.cachedModel;
        if (sliderWithLabelsSectionVO != null) {
            this.onSliderLiveData.setValue(this.selectedTabIndex == 0 ? sliderWithLabelsSectionVO.getThereInputs() : sliderWithLabelsSectionVO.getBackInputs());
        }
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    @NotNull
    public P<List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO>> onSliderLiveData() {
        return this.onSliderLiveData;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    public void onTabSelect(int tabIndex) {
        if (tabIndex == this.selectedTabIndex) {
            return;
        }
        this.selectedTabIndex = tabIndex;
        applySelectedSliders();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.viewModelDelegate.SliderWithLabelsSectionViewModel
    public void setSlidersModel(@NotNull SliderWithLabelsSectionVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.cachedModel = data;
        TabsDTO tabs = data.getTabs();
        int selectedTabIndex = tabs != null ? tabs.getSelectedTabIndex() : 0;
        if (this.selectedTabIndex == -1) {
            this.selectedTabIndex = selectedTabIndex;
        }
        applySelectedSliders();
    }
}
