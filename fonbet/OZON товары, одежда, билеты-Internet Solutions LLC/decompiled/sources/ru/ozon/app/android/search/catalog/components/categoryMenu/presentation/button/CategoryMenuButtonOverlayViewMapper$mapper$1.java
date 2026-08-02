package ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.catalog.components.categoryMenu.data.CategoryMenuDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/button/CategoryMenuButtonVO;", "invoke", "(Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class CategoryMenuButtonOverlayViewMapper$mapper$1 extends AbstractC7737t implements Function2<CategoryMenuDTO, d, List<? extends CategoryMenuButtonVO>> {
    public static final CategoryMenuButtonOverlayViewMapper$mapper$1 INSTANCE = new CategoryMenuButtonOverlayViewMapper$mapper$1();

    CategoryMenuButtonOverlayViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CategoryMenuButtonVO> invoke(CategoryMenuDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new CategoryMenuButtonVO(hashCode, null, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, 2, null));
    }
}
