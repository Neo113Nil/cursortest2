package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeAsyncVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockVO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeItemsMapper;", "schemeItemsMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "passengersBlockMapper", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeItemsMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeItemsMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeMapper implements Function2<FlightSeatsSchemeDTO, d, List<? extends FlightSeatsSchemeVO>>, AsyncWidgetStateMapper<FlightSeatsSchemeDTO, FlightSeatsSchemeAsyncVO> {

    @NotNull
    private final FlightSeatsSchemePassengersBlockMapper passengersBlockMapper;

    @NotNull
    private final FlightSeatsSchemeItemsMapper schemeItemsMapper;

    public FlightSeatsSchemeMapper(@NotNull FlightSeatsSchemeItemsMapper schemeItemsMapper, @NotNull FlightSeatsSchemePassengersBlockMapper passengersBlockMapper) {
        Intrinsics.checkNotNullParameter(schemeItemsMapper, "schemeItemsMapper");
        Intrinsics.checkNotNullParameter(passengersBlockMapper, "passengersBlockMapper");
        this.schemeItemsMapper = schemeItemsMapper;
        this.passengersBlockMapper = passengersBlockMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightSeatsSchemeVO> invoke(@NotNull FlightSeatsSchemeDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        FlightSeatsSchemeBlockVO map = this.schemeItemsMapper.map(state);
        FlightSeatsSchemePassengersBlockVO map2 = this.passengersBlockMapper.map(state);
        boolean shouldFetchState = state.getShouldFetchState();
        EmptyStateDTO emptySchemeBlock = state.getEmptySchemeBlock();
        EmptyStateVO vo = emptySchemeBlock != null ? MapperExtKt.toVO(emptySchemeBlock) : null;
        String a11 = widgetInfo.c().a();
        if (a11 == null) {
            a11 = "";
        }
        return C7714v.a0(new FlightSeatsSchemeVO(hashCode, map, map2, shouldFetchState, vo, a11, false, 64, null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public FlightSeatsSchemeAsyncVO mapAsyncState(@NotNull FlightSeatsSchemeDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FlightSeatsSchemeBlockVO map = this.schemeItemsMapper.map(state);
        FlightSeatsSchemePassengersBlockVO map2 = this.passengersBlockMapper.map(state);
        EmptyStateDTO emptySchemeBlock = state.getEmptySchemeBlock();
        return new FlightSeatsSchemeAsyncVO(map, map2, emptySchemeBlock != null ? MapperExtKt.toVO(emptySchemeBlock) : null);
    }
}
