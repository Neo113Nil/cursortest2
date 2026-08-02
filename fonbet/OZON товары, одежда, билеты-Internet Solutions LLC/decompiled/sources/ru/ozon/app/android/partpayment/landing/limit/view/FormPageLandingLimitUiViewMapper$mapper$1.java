package ru.ozon.app.android.partpayment.landing.limit.view;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.partpayment.landing.limit.data.FormPageLandingLimitDTO;
import ru.ozon.app.android.partpayment.landing.limit.data.FormPageLandingLimitDTOKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "invoke", "(Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FormPageLandingLimitUiViewMapper$mapper$1 extends AbstractC7737t implements Function2<FormPageLandingLimitDTO, d, List<? extends FormPageLandingLimitVO>> {
    public static final FormPageLandingLimitUiViewMapper$mapper$1 INSTANCE = new FormPageLandingLimitUiViewMapper$mapper$1();

    FormPageLandingLimitUiViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<FormPageLandingLimitVO> invoke(FormPageLandingLimitDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(FormPageLandingLimitDTOKt.toVO(dto, widgetInfo.d().hashCode()));
    }
}
