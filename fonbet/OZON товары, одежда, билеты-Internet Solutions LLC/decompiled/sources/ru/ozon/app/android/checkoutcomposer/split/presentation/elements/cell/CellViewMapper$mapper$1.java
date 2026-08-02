package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitCellDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/cell/CellVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitCellDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CellViewMapper$mapper$1 extends AbstractC7737t implements Function2<SplitElementDTO.SplitCellDTO, d, List<? extends CellVO>> {
    public static final CellViewMapper$mapper$1 INSTANCE = new CellViewMapper$mapper$1();

    CellViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CellVO> invoke(SplitElementDTO.SplitCellDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        Long index = dto.getIndex();
        return C7714v.a0(new CellVO((d11 + index).hashCode(), dto.getContent(), dto.getPaddings()));
    }
}
