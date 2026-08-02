package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5Mapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5WidgetAsyncViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5Mapper;", "mapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5Mapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "asyncData", "", "", "params", "", "fetchWidgetWithParams", "(Ljava/lang/String;Ljava/util/Map;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5WidgetAsyncViewModel extends AbstractAsyncWidgetViewModel<HotelsPageButtonV5DTO, HotelsPageButtonV5VO.State> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPageButtonV5WidgetAsyncViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull HotelsPageButtonV5Mapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        super(asyncWidgetRepository, mapper, dispatcherProvider, null, 8, null);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
    }

    public final void fetchWidgetWithParams(@NotNull String asyncData, Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        fetchWidget(HotelsPageButtonV5DTO.class, asyncData, params);
    }
}
