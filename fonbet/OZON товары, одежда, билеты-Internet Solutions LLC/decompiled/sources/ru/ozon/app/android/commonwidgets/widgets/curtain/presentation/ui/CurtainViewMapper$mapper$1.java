package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.commonwidgets.widgets.curtain.data.CurtainDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO;", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CurtainViewMapper$mapper$1 extends AbstractC7737t implements Function2<CurtainDTO, d, List<? extends CurtainVO>> {
    final /* synthetic */ CurtainViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurtainViewMapper$mapper$1(CurtainViewMapper curtainViewMapper) {
        super(2);
        this.this$0 = curtainViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CurtainVO> invoke(CurtainDTO dto, d info) {
        CurtainVO vo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        vo = this.this$0.toVO(dto, info.d());
        List<CurtainVO> a02 = vo != null ? C7714v.a0(vo) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
