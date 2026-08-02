package ru.ozon.app.android.common.roundedcells.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsDTO;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsVO;
import ru.ozon.app.android.common.domain.roundcellsutils.RounderCellsUtilsKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/roundedcells/core/RoundedCellsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsDTO;Ll20/d;)Ljava/util/List;", "rounded-cells_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoundedCellsMapper implements Function2<RoundedCellsDTO, d, List<? extends RoundedCellsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RoundedCellsVO> invoke(@NotNull RoundedCellsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<AtomDTO> cells = state.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        int i11 = 0;
        for (Object obj : cells) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String d11 = widgetInfo.d();
            arrayList.add(new RoundedCellsVO((i11 + d11).hashCode(), (AtomDTO) obj, RounderCellsUtilsKt.determineLayoutModel$default(state.getCells(), i11, null, null, null, null, null, null, null, null, 1020, null), state.getWidgetBackgroundColor(), state.getCellsBackgroundColor()));
            i11 = i12;
        }
        return arrayList;
    }
}
