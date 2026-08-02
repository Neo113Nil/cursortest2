package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.data.HotelsGalleryFiltersMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersViewModel;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/di/HotelsGalleryFiltersComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersMapper;", "mapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryFiltersComponent implements InterfaceC6958a {

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlersInhibitor;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    public HotelsGalleryFiltersComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.mapper = k.b(HotelsGalleryFiltersComponent$mapper$2.INSTANCE);
        this.viewModel = k.b(HotelsGalleryFiltersComponent$viewModel$2.INSTANCE);
        this.handlersInhibitor = k.b(HotelsGalleryFiltersComponent$handlersInhibitor$2.INSTANCE);
    }

    @NotNull
    public final HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @NotNull
    public final HotelsGalleryFiltersMapper getMapper() {
        return (HotelsGalleryFiltersMapper) this.mapper.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @NotNull
    public final HotelsGalleryFiltersViewModel getViewModel() {
        return (HotelsGalleryFiltersViewModel) this.viewModel.getValue();
    }
}
