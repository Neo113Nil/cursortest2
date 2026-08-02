package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di;

import Fo.C3057a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultLoadingMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.utils.ToursSearchResultRefreshObserver;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001e2\u00060\u0001j\u0002`\u0002:\u0001\u001eR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001d\u001a\u00060\u0019j\u0002`\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/di/ToursSearchResultComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;", "getToursSearchResultMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;", "toursSearchResultMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultLoadingMapper;", "getToursSearchResultLoadingMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultLoadingMapper;", "toursSearchResultLoadingMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "getToursSearchResultViewModel", "()LPc/a;", "toursSearchResultViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/utils/ToursSearchResultRefreshObserver;", "getToursSearchResultRefreshObserver", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/utils/ToursSearchResultRefreshObserver;", "toursSearchResultRefreshObserver", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ToursSearchResultComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/di/ToursSearchResultComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/di/ToursSearchResultComponent;", "create", "(Lk20/g;)Lk20/e;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ToursSearchResultComponent create$lambda$0(C7475g c7475g) {
            return new ToursSearchResultComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<ToursSearchResultComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ToursSearchResultComponent.class), new C3057a(storage, 5));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    ToursSearchResultLoadingMapper getToursSearchResultLoadingMapper();

    @NotNull
    ToursSearchResultMapper getToursSearchResultMapper();

    @NotNull
    ToursSearchResultRefreshObserver getToursSearchResultRefreshObserver();

    @NotNull
    Pc.a<ToursSearchResultViewModel> getToursSearchResultViewModel();
}
