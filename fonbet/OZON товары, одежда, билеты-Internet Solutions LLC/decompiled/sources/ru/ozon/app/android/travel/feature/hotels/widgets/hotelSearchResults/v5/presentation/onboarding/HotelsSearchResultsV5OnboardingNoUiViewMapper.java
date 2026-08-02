package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.onboarding;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di.HotelsSearchResultsV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00020\u0019j\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/onboarding/HotelsSearchResultsV5OnboardingNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/di/HotelsSearchResultsV5Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/onboarding/HotelsSearchResultsV5OnboardingVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/onboarding/HotelsSearchResultsV5OnboaringWidgetHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/onboarding/HotelsSearchResultsV5OnboaringWidgetHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsSearchResultsV5OnboardingNoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<HotelsSearchResultsV5Component, HotelsSearchResultsV5DTO, HotelsSearchResultsV5OnboardingVO> {
    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HotelsSearchResultsV5DTO) && ((HotelsSearchResultsV5DTO) state).getOnboardingApp() != null;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsSearchResultsV5Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsSearchResultsV5Component.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public HotelsSearchResultsV5OnboaringWidgetHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        v b02 = container.b0();
        final HotelsSearchResultsV5Component component = component();
        return new HotelsSearchResultsV5OnboaringWidgetHolder((HotelsSearchResultsV5CardViewModel) new z0(b02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.onboarding.HotelsSearchResultsV5OnboardingNoUiViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelsSearchResultsV5CardViewModel hotelsSearchResultsV5CardViewModel = HotelsSearchResultsV5Component.this.getHotelsSearchResultsV5CardViewModel();
                Intrinsics.g(hotelsSearchResultsV5CardViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return hotelsSearchResultsV5CardViewModel;
            }
        }).a(HotelsSearchResultsV5CardViewModel.class));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsSearchResultsV5OnboardingVO> map(@NotNull HotelsSearchResultsV5DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getHotelsSearchResultsV5OnboardingMapper().invoke(state, info);
    }
}
