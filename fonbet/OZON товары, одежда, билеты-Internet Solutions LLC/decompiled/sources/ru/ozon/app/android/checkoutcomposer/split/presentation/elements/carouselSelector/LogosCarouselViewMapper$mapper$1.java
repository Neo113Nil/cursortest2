package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class LogosCarouselViewMapper$mapper$1 extends AbstractC7737t implements Function2<SplitElementDTO.SplitLogosCarouselDTO, d, List<? extends LogosCarouselVO>> {
    public static final LogosCarouselViewMapper$mapper$1 INSTANCE = new LogosCarouselViewMapper$mapper$1();

    LogosCarouselViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<LogosCarouselVO> invoke(SplitElementDTO.SplitLogosCarouselDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d() + dto.getIndex()).hashCode();
        List<SplitElementDTO.SplitLogosCarouselDTO.LogosElement> elements = dto.getElements();
        ArrayList arrayList = new ArrayList(C7714v.z(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(((SplitElementDTO.SplitLogosCarouselDTO.LogosElement) it.next()).toVO());
        }
        return C7714v.a0(new LogosCarouselVO(hashCode, arrayList, dto.getScrollPosition(), dto.getPaddings()));
    }
}
