package ru.ozon.app.android.search.widgets.expandableCells.core;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.widgets.expandableCells.data.ExpandableCellsDTO;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.CellState;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellVO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO;Ll20/d;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExpandableCellsMapper implements Function2<ExpandableCellsDTO, d, List<? extends ExpandableCellVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ExpandableCellVO> invoke(@NotNull ExpandableCellsDTO dto, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String backgroundColor = dto.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        List<ExpandableCellsDTO.ExpandableCell> cells = dto.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        int i11 = 0;
        for (Iterator it = cells.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ExpandableCellsDTO.ExpandableCell expandableCell = (ExpandableCellsDTO.ExpandableCell) next;
            long hashCode = (widgetInfo.d() + i11).hashCode();
            ArrayList arrayList2 = arrayList;
            int i13 = i11;
            NotificationDTO errorNotification = dto.getErrorNotification();
            String baseLink = dto.getBaseLink();
            CellState cellState = CellState.COLLAPSED;
            if (i13 == 0 && (trackingInfo = dto.getTrackingInfo()) != null) {
                tVar = x.b(trackingInfo, Long.valueOf(hashCode), null);
            }
            t tVar2 = tVar;
            Boolean isExpanded = expandableCell.isExpanded();
            arrayList2.add(new ExpandableCellVO(hashCode, expandableCell, str, errorNotification, baseLink, cellState, null, null, null, null, tVar2, isExpanded != null ? isExpanded.booleanValue() : false, null, 5056, null));
            arrayList = arrayList2;
            i11 = i12;
        }
        return arrayList;
    }
}
