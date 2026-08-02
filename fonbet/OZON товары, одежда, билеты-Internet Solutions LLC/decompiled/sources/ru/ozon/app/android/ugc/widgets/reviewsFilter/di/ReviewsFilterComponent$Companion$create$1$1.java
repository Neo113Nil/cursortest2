package ru.ozon.app.android.ugc.widgets.reviewsFilter.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.core.ReviewsFilterMapper;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.data.ReviewsFilterOnBoardingDisplayRepository;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.onboarding.ReviewsFilterOnboardingViewModel;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"ru/ozon/app/android/ugc/widgets/reviewsFilter/di/ReviewsFilterComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/di/ReviewsFilterComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterOnBoardingDisplayRepository;", "onBoardingRepository$delegate", "LSc/j;", "getOnBoardingRepository", "()Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterOnBoardingDisplayRepository;", "onBoardingRepository", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/core/ReviewsFilterMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/ugc/widgets/reviewsFilter/core/ReviewsFilterMapper;", "mapper", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "getOnBoardingComponentApi", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/onboarding/ReviewsFilterOnboardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/onboarding/ReviewsFilterOnboardingViewModel;", "onBoardingViewModel", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterComponent$Companion$create$1$1 implements ReviewsFilterComponent {
    final /* synthetic */ C7475g $storage;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: onBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingRepository = k.b(new ReviewsFilterComponent$Companion$create$1$1$onBoardingRepository$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ReviewsFilterComponent$Companion$create$1$1$mapper$2.INSTANCE);

    ReviewsFilterComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    private final OnBoardingComponentApi getOnBoardingComponentApi() {
        return (OnBoardingComponentApi) this.$storage.getComponent(OnBoardingComponentApi.class);
    }

    private final ReviewsFilterOnBoardingDisplayRepository getOnBoardingRepository() {
        return (ReviewsFilterOnBoardingDisplayRepository) this.onBoardingRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageComponentApi getStorageComponentApi() {
        return (StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.di.ReviewsFilterComponent
    public ReviewsFilterMapper getMapper() {
        return (ReviewsFilterMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.di.ReviewsFilterComponent
    public ReviewsFilterOnboardingViewModel getOnBoardingViewModel() {
        return new ReviewsFilterOnboardingViewModel(getOnBoardingRepository(), getOnBoardingComponentApi().getDefaultOnBoardingDisplayOnPageRepository(), getOnBoardingComponentApi().getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.di.ReviewsFilterComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }
}
