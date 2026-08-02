package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3Mapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3ViewModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/di/TravelHotelCardV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3Mapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3ViewModel;", "viewModel", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TravelHotelCardV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/di/TravelHotelCardV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/di/TravelHotelCardV3Component;", "create", "(Lk20/g;)Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/di/TravelHotelCardV3Component;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final TravelHotelCardV3Component create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new TravelHotelCardV3Component(storage) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.di.TravelHotelCardV3Component$Companion$create$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(TravelHotelCardV3Component$Companion$create$1$mapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComponent;

                {
                    this.retainComponent = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.di.TravelHotelCardV3Component
                public TravelHotelCardV3Mapper getMapper() {
                    return (TravelHotelCardV3Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.di.TravelHotelCardV3Component
                public l getTokenizedAnalytics() {
                    return this.retainComponent.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.di.TravelHotelCardV3Component
                public TravelHotelCardV3ViewModel getViewModel() {
                    return new TravelHotelCardV3ViewModel();
                }
            };
        }
    }

    @NotNull
    TravelHotelCardV3Mapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    TravelHotelCardV3ViewModel getViewModel();
}
