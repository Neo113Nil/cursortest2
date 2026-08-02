package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data.HotelsPageHeaderDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data.HotelsPageHeaderMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation.HotelsPageHeaderVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderWidgetViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "asyncWidgetRepository", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "mapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderMapper;", "dispatcherProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "fetchWidget", "", "asyncData", "", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageHeaderWidgetViewModel extends AbstractAsyncWidgetViewModel<HotelsPageHeaderDTO, HotelsPageHeaderVO.StateWrapper> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderWidgetViewModel$Companion;", "", "<init>", "()V", "KEY_RELOAD", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPageHeaderWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull HotelsPageHeaderMapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        super(asyncWidgetRepository, mapper, dispatcherProvider, null, 8, null);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
    }

    public void fetchWidget(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        fetchWidget(HotelsPageHeaderDTO.class, asyncData, U.i(new Pair(DeleteAccountApiResponse.Error.TYPE_RELOAD, Boolean.TRUE)));
    }
}
