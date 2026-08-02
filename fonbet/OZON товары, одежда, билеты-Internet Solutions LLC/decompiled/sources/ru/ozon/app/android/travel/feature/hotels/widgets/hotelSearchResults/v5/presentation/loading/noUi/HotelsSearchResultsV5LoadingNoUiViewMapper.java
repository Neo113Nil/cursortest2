package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi;

import A00.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5LoadingNoUiMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di.HotelsSearchResultsV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\f\u0012\u0004\u0012\u00020\u00020\u001ej\u0002`\u001f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070'0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/di/HotelsSearchResultsV5Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiWidgetViewHolder;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5LoadingNoUiMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5LoadingNoUiMapper;", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsSearchResultsV5LoadingNoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<HotelsSearchResultsV5Component, HotelsSearchResultsV5DTO, HotelsSearchResultsV5LoadingNoUiVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(HotelsSearchResultsV5LoadingNoUiUpdate.class, HotelsSearchResultsV5LoadingNoUiNewPageUpdate.class);

    private final HotelsSearchResultsV5LoadingNoUiMapper getMapper() {
        return component().getHotelsSearchResultsV5LoadingNoUiMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HotelsSearchResultsV5DTO) && ((HotelsSearchResultsV5DTO) state).getAsyncBehaviorType() != HotelsSearchResultsV5DTO.AsyncBehaviorType.NO_ACTION;
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsSearchResultsV5Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsSearchResultsV5Component.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public HotelsSearchResultsV5LoadingNoUiWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new HotelsSearchResultsV5LoadingNoUiWidgetViewHolder(container, (HotelsSearchResultsV5CardViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelsSearchResultsV5CardViewModel hotelsSearchResultsV5CardViewModel = HotelsSearchResultsV5LoadingNoUiViewMapper.this.component().getHotelsSearchResultsV5CardViewModel();
                Intrinsics.g(hotelsSearchResultsV5CardViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return hotelsSearchResultsV5CardViewModel;
            }
        }).a(HotelsSearchResultsV5CardViewModel.class), component().getHotelsSearchResultsV5LoadingWidgetViewModel(), component().getPerformanceTrackerDelegate(), component().getWidgetLayoutTimeMetricsStorage(), component().getCustomActionHandlersStoreFactory());
    }

    @Override // c20.r, I00.d
    public HotelsSearchResultsV5LoadingNoUiVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsSearchResultsV5LoadingNoUiVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotelsSearchResultsV5LoadingNoUiUpdate) {
            HotelsSearchResultsV5LoadingNoUiUpdate hotelsSearchResultsV5LoadingNoUiUpdate = (HotelsSearchResultsV5LoadingNoUiUpdate) update;
            return HotelsSearchResultsV5LoadingNoUiVO.copy$default(oldItem, 0L, U.n(oldItem.getStates(), new Pair(hotelsSearchResultsV5LoadingNoUiUpdate.getAsyncData(), hotelsSearchResultsV5LoadingNoUiUpdate.getNewState())), oldItem.getUpdateIteration() + 1, 1, null);
        }
        if (!(update instanceof HotelsSearchResultsV5LoadingNoUiNewPageUpdate)) {
            return null;
        }
        HotelsSearchResultsV5LoadingNoUiNewPageUpdate hotelsSearchResultsV5LoadingNoUiNewPageUpdate = (HotelsSearchResultsV5LoadingNoUiNewPageUpdate) update;
        if (oldItem.getStates().containsKey(hotelsSearchResultsV5LoadingNoUiNewPageUpdate.getAsyncConfig().getAsyncData())) {
            return null;
        }
        return HotelsSearchResultsV5LoadingNoUiVO.copy$default(oldItem, 0L, U.n(oldItem.getStates(), new Pair(hotelsSearchResultsV5LoadingNoUiNewPageUpdate.getAsyncConfig().getAsyncData(), HotelsSearchResultsV5LoadingNoUiVO.State.NewPage.m1338boximpl(HotelsSearchResultsV5LoadingNoUiVO.State.NewPage.m1339constructorimpl(hotelsSearchResultsV5LoadingNoUiNewPageUpdate.getAsyncConfig().getAsyncParams())))), oldItem.getUpdateIteration() + 1, 1, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsSearchResultsV5LoadingNoUiVO> map(@NotNull HotelsSearchResultsV5DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
