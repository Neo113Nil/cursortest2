package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di;

import EN.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3StickyMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3EventCollector;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEventEmitter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.payload.HotelsBookTotalV3PayloadManager;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3AsyncWidgetViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 .2\u00060\u0001j\u0002`\u0002:\u0001.R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3StickyMapper;", "getStickyMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3StickyMapper;", "stickyMapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3PayloadManager;", "getPayloadManager", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3PayloadManager;", "payloadManager", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventEmitter;", "getUiEventsEmitter", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventEmitter;", "uiEventsEmitter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "getUiEventsCollector", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "uiEventsCollector", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3AsyncWidgetViewModel;", "getAsyncViewModelProvider", "()LPc/a;", "asyncViewModelProvider", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "getStickyViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "stickyViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HotelsBookTotalV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;", "create", "(Lk20/g;)Lk20/e;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HotelsBookTotalV3Component create$lambda$0(C7475g c7475g) {
            return new HotelsBookTotalV3Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<HotelsBookTotalV3Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HotelsBookTotalV3Component.class), new a(storage, 0));
        }
    }

    @NotNull
    Pc.a<HotelsBookTotalV3AsyncWidgetViewModel> getAsyncViewModelProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HotelsBookTotalV3Mapper getMapper();

    @NotNull
    HotelsBookTotalV3PayloadManager getPayloadManager();

    @NotNull
    HotelsBookTotalV3StickyMapper getStickyMapper();

    @NotNull
    HotelsBookTotalV3StickyViewModel getStickyViewModel();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    HotelsBookTotalV3EventCollector getUiEventsCollector();

    @NotNull
    HotelsBookTotalV3UiEventEmitter getUiEventsEmitter();

    @NotNull
    HotelsBookTotalV3ViewModel getViewModel();
}
