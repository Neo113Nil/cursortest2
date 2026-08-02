package ru.ozon.app.android.fresh.main.widgets.product.common.header;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.fresh.main.widgets.product.common.HasHeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.model.HeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.model.HeaderVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/HasHeaderDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/product/common/HasHeaderDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class HeaderWidgetViewMapper$mapper$1 extends AbstractC7737t implements Function2<HasHeaderDTO, d, List<? extends HeaderVO>> {
    final /* synthetic */ HeaderWidgetViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeaderWidgetViewMapper$mapper$1(HeaderWidgetViewMapper headerWidgetViewMapper) {
        super(2);
        this.this$0 = headerWidgetViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<HeaderVO> invoke(HasHeaderDTO dto, d info) {
        List<HeaderVO> a02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        HeaderDTO header = dto.getHeader();
        return (header == null || (a02 = C7714v.a0(this.this$0.toVO(header, info.d()))) == null) ? K.f71697a : a02;
    }
}
