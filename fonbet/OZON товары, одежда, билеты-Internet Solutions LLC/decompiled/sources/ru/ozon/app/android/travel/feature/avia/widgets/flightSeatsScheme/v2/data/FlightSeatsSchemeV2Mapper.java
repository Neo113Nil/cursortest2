package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FlightSeatsSchemeV2FooterMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.header.FlightSeatsSchemeV2HeaderBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.header.FlightSeatsSchemeV2HeaderBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.FlightSeatsSchemeV2HeaderBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2BlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2ItemsMapper;", "schemeItemsMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockMapper;", "headerMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "footerMapper", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2ItemsMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;)V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2ItemsMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2Mapper implements Function2<FlightSeatsSchemeV2DTO, d, List<? extends FlightSeatsSchemeV2VI>>, AsyncWidgetStateMapper<FlightSeatsSchemeV2DTO, FlightSeatsSchemeV2VI.State> {

    @NotNull
    private final FlightSeatsSchemeV2FooterMapper footerMapper;

    @NotNull
    private final FlightSeatsSchemeV2HeaderBlockMapper headerMapper;

    @NotNull
    private final FlightSeatsSchemeV2ItemsMapper schemeItemsMapper;

    public FlightSeatsSchemeV2Mapper(@NotNull FlightSeatsSchemeV2ItemsMapper schemeItemsMapper, @NotNull FlightSeatsSchemeV2HeaderBlockMapper headerMapper, @NotNull FlightSeatsSchemeV2FooterMapper footerMapper) {
        Intrinsics.checkNotNullParameter(schemeItemsMapper, "schemeItemsMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.schemeItemsMapper = schemeItemsMapper;
        this.headerMapper = headerMapper;
        this.footerMapper = footerMapper;
    }

    private final FlightSeatsSchemeV2VI.State extractState(FlightSeatsSchemeV2DTO state) {
        FlightSeatsSchemeV2Item flightSeatsSchemeV2Item;
        Object obj;
        if (state.getShouldFetchState()) {
            FlightSeatsSchemeV2FooterBlockVI map = this.footerMapper.map(state);
            FlightSeatsSchemeV2HeaderBlockDTO headerBlock = state.getHeaderBlock();
            return new FlightSeatsSchemeV2VI.State.Loading(map, headerBlock != null ? headerBlock.getTitle() : null);
        }
        FlightSeatsSchemeV2BlockVI map2 = this.schemeItemsMapper.map(state);
        List<FlightSeatsSchemeV2Item> schemeItems = map2.getSchemeItems();
        if (schemeItems != null) {
            Iterator<T> it = schemeItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                FlightSeatsSchemeV2Item flightSeatsSchemeV2Item2 = (FlightSeatsSchemeV2Item) obj;
                if ((flightSeatsSchemeV2Item2 instanceof FlightSchemeContentRowV2) && ((FlightSchemeContentRowV2) flightSeatsSchemeV2Item2).getIsSticky()) {
                    break;
                }
            }
            flightSeatsSchemeV2Item = (FlightSeatsSchemeV2Item) obj;
        } else {
            flightSeatsSchemeV2Item = null;
        }
        FlightSeatsSchemeV2HeaderBlockVI map3 = this.headerMapper.map(state, flightSeatsSchemeV2Item instanceof FlightSchemeContentRowV2 ? (FlightSchemeContentRowV2) flightSeatsSchemeV2Item : null);
        FlightSeatsSchemeV2FooterBlockVI map4 = this.footerMapper.map(state);
        EmptyStateV2DTO emptySchemeBlock = state.getEmptySchemeBlock();
        return new FlightSeatsSchemeV2VI.State.Content(map2, map3, map4, emptySchemeBlock != null ? MapperExtKt.toVO(emptySchemeBlock) : null, false, 16, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightSeatsSchemeV2VI> invoke(@NotNull FlightSeatsSchemeV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String a11 = widgetInfo.c().a();
        if (a11 == null) {
            a11 = "";
        }
        String str = a11;
        EmptyStateV2DTO emptySchemeBlock = state.getEmptySchemeBlock();
        return C7714v.a0(new FlightSeatsSchemeV2VI(hashCode, str, emptySchemeBlock != null ? MapperExtKt.toVO(emptySchemeBlock) : null, state.getEmptySchemeBlock() != null && state.getSchemeBlock() == null, extractState(state)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public FlightSeatsSchemeV2VI.State mapAsyncState(@NotNull FlightSeatsSchemeV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }
}
