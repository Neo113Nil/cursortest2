package ru.ozon.app.android.commonwidgets.widgets.restrictions.core;

import A00.a;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsNoUIViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation.RestrictionsVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;)Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class RestrictionsNoUIViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, RestrictionsVO, RestrictionsVO> {
    public static final RestrictionsNoUIViewMapper$updateConsumer$1 INSTANCE = new RestrictionsNoUIViewMapper$updateConsumer$1();

    RestrictionsNoUIViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final RestrictionsVO invoke(a.J.InterfaceC0007a update, RestrictionsVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        return update instanceof RestrictionsNoUIViewMapper.ShowedRestriction ? oldVO.getRestrictions().size() == 1 ? RestrictionsVO.copy$default(oldVO, 0L, K.f71697a, null, 5, null) : RestrictionsVO.copy$default(oldVO, 0L, oldVO.getRestrictions().subList(1, oldVO.getRestrictions().size()), null, 5, null) : oldVO;
    }
}
