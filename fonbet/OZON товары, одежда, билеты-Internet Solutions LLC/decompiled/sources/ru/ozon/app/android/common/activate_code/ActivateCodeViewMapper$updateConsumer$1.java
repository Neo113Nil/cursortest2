package ru.ozon.app.android.common.activate_code;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.activate_code.presentation.ActivateCodeVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;", "vo", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;)Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ActivateCodeViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, ActivateCodeVO, ActivateCodeVO> {
    public static final ActivateCodeViewMapper$updateConsumer$1 INSTANCE = new ActivateCodeViewMapper$updateConsumer$1();

    ActivateCodeViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ActivateCodeVO invoke(a.J.InterfaceC0007a update, ActivateCodeVO vo) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(vo, "vo");
        return update instanceof ActivateCodeActivated ? ActivateCodeVO.copy$default(vo, 0L, null, null, null, null, null, null, true, 127, null) : vo;
    }
}
