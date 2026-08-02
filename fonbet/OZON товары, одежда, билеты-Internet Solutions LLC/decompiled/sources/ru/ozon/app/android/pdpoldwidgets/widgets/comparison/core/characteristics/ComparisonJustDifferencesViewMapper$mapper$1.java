package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import Kk.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.justDifferences.JustDifferencesVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/justDifferences/JustDifferencesVO;", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ComparisonJustDifferencesViewMapper$mapper$1 extends AbstractC7737t implements Function2<ComparisonDTO, d, List<? extends JustDifferencesVO>> {
    final /* synthetic */ ComparisonJustDifferencesViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonJustDifferencesViewMapper$mapper$1(ComparisonJustDifferencesViewMapper comparisonJustDifferencesViewMapper) {
        super(2);
        this.this$0 = comparisonJustDifferencesViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<JustDifferencesVO> invoke(ComparisonDTO dto, d info) {
        String link;
        List<ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO> products;
        ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO comparedProductDTO;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        List<ComparisonDTO.ComparisonProductsDTO.CarouselDTO> carousels = dto.getProducts().getCarousels();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = carousels.iterator();
        while (true) {
            r5 = null;
            r5 = null;
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            ComparisonDTO.ComparisonProductsDTO.CarouselDTO carouselDTO = (ComparisonDTO.ComparisonProductsDTO.CarouselDTO) it.next();
            if (carouselDTO.getSelectedIndex() >= 0 && (products = dto.getProducts().getProducts()) != null && (comparedProductDTO = products.get(carouselDTO.getSelectedIndex())) != null) {
                str = comparedProductDTO.getSkuString();
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        String V11 = arrayList2 != null ? C7714v.V(arrayList2, ",", "&skus=", null, null, 60) : null;
        AtomActionDTO action = dto.getDifferencesCell().getAction();
        String e11 = (action == null || (link = action.getLink()) == null) ? null : U7.d.e(link, V11);
        AtomActionDTO action2 = dto.getDifferencesCell().getAction();
        return C7714v.a0(new JustDifferencesVO(c.a(this.this$0.getClass().getSimpleName(), info.d()), CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.copy$default(dto.getDifferencesCell(), false, null, null, null, null, null, null, action2 != null ? AtomActionDTO.copy$default(action2, null, e11, null, null, null, 29, null) : null, false, false, null, null, null, 8063, null)));
    }
}
