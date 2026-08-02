package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.configurator;

import Pc.a;
import a00.h;
import android.content.Intent;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.di.HotelsMapInfoV2Component;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/configurator/HotelsMapInfoConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "viewModel", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "onComposerInitialized", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsMapInfoConfigurator extends ComposerScreenConfig.PageConfigurator {
    private HotelMapInfoViewModel viewModel;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        HotelMapInfoViewModel hotelMapInfoViewModel;
        if (requestCode != 876) {
            super.onActivityResult(requestCode, resultCode, data);
        } else {
            if (resultCode != -1 || (hotelMapInfoViewModel = this.viewModel) == null) {
                return;
            }
            hotelMapInfoViewModel.onDefineCurrentLocationAction();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        h viewModelOwnerProvider;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        HotelMapInfoViewModel hotelMapInfoViewModel = null;
        HotelsMapInfoV2Component hotelsMapInfoV2Component = (HotelsMapInfoV2Component) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(HotelsMapInfoV2Component.class));
        if (hotelsMapInfoV2Component == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 != null && (viewModelOwnerProvider = references2.getViewModelOwnerProvider()) != null) {
            final a<HotelMapInfoViewModel> viewModelProvider = hotelsMapInfoV2Component.getViewModelProvider();
            hotelMapInfoViewModel = (HotelMapInfoViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.configurator.HotelsMapInfoConfigurator$onComposerInitialized$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    HotelMapInfoViewModel hotelMapInfoViewModel2 = (HotelMapInfoViewModel) a.this.get();
                    Intrinsics.g(hotelMapInfoViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return hotelMapInfoViewModel2;
                }
            }).a(HotelMapInfoViewModel.class);
        }
        this.viewModel = hotelMapInfoViewModel;
    }
}
