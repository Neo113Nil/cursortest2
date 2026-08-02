package ru.ozon.app.android.orderdetails.modalConstructor.presentation.disclaimer;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.orderdetails.modalConstructor.data.ModalConstructorDTO;
import ru.ozon.app.android.orderdetails.modalConstructor.mappers.ModalConstructorMapperKt;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.models.ModalConstructorVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$DisclaimerWrapperDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$DisclaimerWrapperVO;", "invoke", "(Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$DisclaimerWrapperDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class DisclaimerViewMapper$mapper$1 extends AbstractC7737t implements Function2<ModalConstructorDTO.DisclaimerWrapperDTO, d, List<? extends ModalConstructorVO.DisclaimerWrapperVO>> {
    public static final DisclaimerViewMapper$mapper$1 INSTANCE = new DisclaimerViewMapper$mapper$1();

    DisclaimerViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ModalConstructorVO.DisclaimerWrapperVO> invoke(ModalConstructorDTO.DisclaimerWrapperDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(ModalConstructorMapperKt.toVO(dto, widgetInfo));
    }
}
