package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2VI;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "<init>", "()V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellV2Mapper implements Function2<AdditionalReturnServiceCellV2DTO, d, List<? extends AdditionalReturnServiceCellV2VI>>, AsyncWidgetStateMapper<AdditionalReturnServiceCellV2DTO, AdditionalReturnServiceCellV2VI.State> {
    private final AdditionalReturnServiceCellV2VI.State extractState(AdditionalReturnServiceCellV2DTO state) {
        if (state.getShouldFetchState()) {
            Map<String, TokenizedTrackingInfo> viewTracking = state.getViewTracking();
            Map<String, String> asyncParams = state.getAsyncParams();
            List<CellDTO> cells = state.getCells();
            boolean showBookingSkeleton = state.getShowBookingSkeleton();
            String backgroundColor = state.getBackgroundColor();
            if (backgroundColor == null) {
                backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
            }
            return new AdditionalReturnServiceCellV2VI.State.Loading(viewTracking, asyncParams, cells, showBookingSkeleton, backgroundColor, state.getBorderColor());
        }
        if (state.getShowBookingSkeleton()) {
            Map<String, TokenizedTrackingInfo> viewTracking2 = state.getViewTracking();
            List<CellDTO> cells2 = state.getCells();
            String backgroundColor2 = state.getBackgroundColor();
            if (backgroundColor2 == null) {
                backgroundColor2 = UniColors.LAYER_FLOOR_1.getToken();
            }
            return new AdditionalReturnServiceCellV2VI.State.BookingSkeletons(viewTracking2, cells2, backgroundColor2, state.getBorderColor());
        }
        if (state.getShouldShowSkeleton()) {
            return new AdditionalReturnServiceCellV2VI.State.Skeletons(state.getViewTracking());
        }
        List<CellDTO> cells3 = state.getCells();
        BadgeDTO badge = state.getBadge();
        String backgroundColor3 = state.getBackgroundColor();
        if (backgroundColor3 == null) {
            backgroundColor3 = UniColors.LAYER_FLOOR_1.getToken();
        }
        String borderColor = state.getBorderColor();
        return new AdditionalReturnServiceCellV2VI.State.Content(state.getViewTracking(), cells3, badge, backgroundColor3, borderColor);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalReturnServiceCellV2VI> invoke(@NotNull AdditionalReturnServiceCellV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new AdditionalReturnServiceCellV2VI(widgetInfo.d().hashCode(), widgetInfo.c().a(), extractState(state)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public AdditionalReturnServiceCellV2VI.State mapAsyncState(@NotNull AdditionalReturnServiceCellV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }
}
