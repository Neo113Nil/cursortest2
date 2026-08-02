package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.di;

import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5Mapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5ViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5WidgetAsyncViewModel;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0001\u001dR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/di/HotelsPageButtonV5Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5WidgetAsyncViewModel;", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "getScrollAnchorViewModel", "()Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "scrollAnchorViewModel", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5ViewModel;", "viewModel", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "getHotelMapInfoViewModel", "()Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "hotelMapInfoViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HotelsPageButtonV5Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/di/HotelsPageButtonV5Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/di/HotelsPageButtonV5Component;", "create", "(Lk20/g;)Lk20/e;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HotelsPageButtonV5Component create$lambda$0(C7475g c7475g) {
            return new HotelsPageButtonV5Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<HotelsPageButtonV5Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HotelsPageButtonV5Component.class), new AT.a(storage, 10));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HotelMapInfoViewModel getHotelMapInfoViewModel();

    @NotNull
    HotelsPageButtonV5Mapper getMapper();

    @NotNull
    ScrollAnchorViewModel getScrollAnchorViewModel();

    @NotNull
    HotelsPageButtonV5ViewModel getViewModel();

    @NotNull
    Pc.a<HotelsPageButtonV5WidgetAsyncViewModel> getWidgetViewModelProvider();
}
