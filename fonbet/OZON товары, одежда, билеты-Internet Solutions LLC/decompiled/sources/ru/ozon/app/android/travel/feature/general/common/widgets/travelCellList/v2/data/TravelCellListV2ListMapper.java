package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.data;

import Lh.b;
import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.data.TravelCellListV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.presentation.list.TravelCellListV2ListVO;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v2.TravelCellListV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJg\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2ListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/presentation/list/TravelCellListV2ListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2DTO$CellBlockDTO;", "cellBlock", "", "widgetId", "", "topRadius", "bottomRadius", "", "backgroundColor", "cellTopMargin", "blockBottomMargin", "blockTitleBottomMargin", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "mapCellBlock", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2DTO$CellBlockDTO;JIILjava/lang/String;IIILWZ/t;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/presentation/list/TravelCellListV2ListVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCellListV2ListMapper implements Function2<TravelCellListV2DTO, d, List<? extends TravelCellListV2ListVO>> {

    @NotNull
    private final Context context;

    public TravelCellListV2ListMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final TravelCellListV2ListVO mapCellBlock(TravelCellListV2DTO.CellBlockDTO cellBlock, long widgetId, int topRadius, int bottomRadius, String backgroundColor, int cellTopMargin, int blockBottomMargin, int blockTitleBottomMargin, t viewEvent) {
        OzonSpannableString text;
        TextAtom title = cellBlock.getTitle();
        String obj = (title == null || (text = title.getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        return new TravelCellListV2ListVO(widgetId, new TravelCellListV2VO((obj + "-" + topRadius + "-" + bottomRadius + "-" + backgroundColor).hashCode(), cellBlock.getTitle(), cellBlock.getSubtitle(), backgroundColor, topRadius, bottomRadius, cellTopMargin, blockBottomMargin, blockTitleBottomMargin, cellBlock.getCells()), viewEvent);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelCellListV2ListVO> invoke(@NotNull TravelCellListV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        int px = ResourceExtKt.toPx(state.getCellsTopMargin(), this.context);
        int px2 = ResourceExtKt.toPx(state.getBlockBottomMargin(), this.context);
        int px3 = ResourceExtKt.toPx(state.getBlockTitleBottomMargin(), this.context);
        List<TravelCellListV2DTO.CellBlockDTO> cellBlocks = state.getCellBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(cellBlocks, 10));
        int i11 = 0;
        for (Object obj : cellBlocks) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TravelCellListV2DTO.CellBlockDTO cellBlockDTO = (TravelCellListV2DTO.CellBlockDTO) obj;
            long a11 = b.a(i11, d11, "-");
            int topRadius = state.getTopRadius();
            int bottomRadius = state.getBottomRadius();
            String backgroundColor = state.getBackgroundColor();
            int i13 = i11 == 0 ? px : 0;
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null);
            }
            arrayList.add(mapCellBlock(cellBlockDTO, a11, topRadius, bottomRadius, backgroundColor, i13, px2, px3, tVar));
            i11 = i12;
        }
        return arrayList;
    }
}
