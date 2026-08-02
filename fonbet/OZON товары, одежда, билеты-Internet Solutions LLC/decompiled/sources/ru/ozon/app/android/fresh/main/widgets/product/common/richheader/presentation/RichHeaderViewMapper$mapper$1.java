package ru.ozon.app.android.fresh.main.widgets.product.common.richheader.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.fresh.main.widgets.product.common.HasRichHeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.richheader.data.RichHeaderDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/HasRichHeaderDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "<unused var>", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderVO;", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/product/common/HasRichHeaderDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class RichHeaderViewMapper$mapper$1 extends AbstractC7737t implements Function2<HasRichHeaderDTO, d, List<? extends RichHeaderVO>> {
    public static final RichHeaderViewMapper$mapper$1 INSTANCE = new RichHeaderViewMapper$mapper$1();

    RichHeaderViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<RichHeaderVO> invoke(HasRichHeaderDTO dto, d dVar) {
        List<RichHeaderVO> a02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        RichHeaderDTO richHeader = dto.getRichHeader();
        return (richHeader == null || (a02 = C7714v.a0(MapperKt.toVO(richHeader))) == null) ? K.f71697a : a02;
    }
}
