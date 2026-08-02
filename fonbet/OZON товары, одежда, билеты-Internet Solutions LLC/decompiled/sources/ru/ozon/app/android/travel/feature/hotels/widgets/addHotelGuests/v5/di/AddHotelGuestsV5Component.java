package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di;

import Du.C2881a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5Mapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5ScrollerMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModelImpl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/di/AddHotelGuestsV5Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5ScrollerMapper;", "getScrollerMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5ScrollerMapper;", "scrollerMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AddHotelGuestsV5Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/di/AddHotelGuestsV5Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/di/AddHotelGuestsV5Component;", "create", "(Lk20/g;)Lk20/e;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AddHotelGuestsV5Component create$lambda$0(final C7475g c7475g) {
            return new AddHotelGuestsV5Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component$Companion$create$1$1
                private final RetainComposerComponentApi retainComposerComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(AddHotelGuestsV5Component$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: scrollerMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j scrollerMapper = k.b(AddHotelGuestsV5Component$Companion$create$1$1$scrollerMapper$2.INSTANCE);

                {
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component
                public AddHotelGuestsV5Mapper getMapper() {
                    return (AddHotelGuestsV5Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component
                public AddHotelGuestsV5ScrollerMapper getScrollerMapper() {
                    return (AddHotelGuestsV5ScrollerMapper) this.scrollerMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component
                public AddHotelGuestsV5ViewModel getViewModel() {
                    return new AddHotelGuestsV5ViewModelImpl();
                }
            };
        }

        @NotNull
        public final C7473e<AddHotelGuestsV5Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AddHotelGuestsV5Component.class), new C2881a(storage, 4));
        }
    }

    @NotNull
    AddHotelGuestsV5Mapper getMapper();

    @NotNull
    AddHotelGuestsV5ScrollerMapper getScrollerMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    AddHotelGuestsV5ViewModel getViewModel();
}
