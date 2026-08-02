package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.di;

import Bz.C2680a;
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
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.data.SearchResultsNavTitleV2Mapper;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/di/SearchResultsNavTitleV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/data/SearchResultsNavTitleV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/data/SearchResultsNavTitleV2Mapper;", "mapper", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchResultsNavTitleV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/di/SearchResultsNavTitleV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/di/SearchResultsNavTitleV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchResultsNavTitleV2Component create$lambda$0(final C7475g c7475g) {
            return new SearchResultsNavTitleV2Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.di.SearchResultsNavTitleV2Component$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(SearchResultsNavTitleV2Component$Companion$create$1$1$mapper$2.INSTANCE);
                private final OnBoardingComponentApi onBoardingComponentApi;
                private final RetainComposerComponentApi retainComponentApi;

                {
                    this.onBoardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.di.SearchResultsNavTitleV2Component
                public SearchResultsNavTitleV2Mapper getMapper() {
                    return (SearchResultsNavTitleV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.di.SearchResultsNavTitleV2Component
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.di.SearchResultsNavTitleV2Component
                public TravelOnboardingViewModel getOnBoardingViewModel() {
                    return new TravelOnboardingViewModel(this.onBoardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
                }
            };
        }

        @NotNull
        public final C7473e<SearchResultsNavTitleV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SearchResultsNavTitleV2Component.class), new C2680a(storage, 4));
        }
    }

    @NotNull
    SearchResultsNavTitleV2Mapper getMapper();

    @NotNull
    BaseOnBoardingViewModel getOnBoardingViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
