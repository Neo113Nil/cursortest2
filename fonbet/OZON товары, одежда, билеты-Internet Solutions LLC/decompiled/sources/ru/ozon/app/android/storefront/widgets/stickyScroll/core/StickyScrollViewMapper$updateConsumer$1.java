package ru.ozon.app.android.storefront.widgets.stickyScroll.core;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.events.AnchorVisibleEvent;
import ru.ozon.app.android.storefront.widgets.stickyScroll.data.ScrollEvent;
import ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "updateKey", "Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;", "vo", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;)Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class StickyScrollViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, StickyScrollVO, StickyScrollVO> {
    final /* synthetic */ StickyScrollViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyScrollViewMapper$updateConsumer$1(StickyScrollViewMapper stickyScrollViewMapper) {
        super(2);
        this.this$0 = stickyScrollViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final StickyScrollVO invoke(a.J.InterfaceC0007a updateKey, StickyScrollVO vo) {
        Intrinsics.checkNotNullParameter(updateKey, "updateKey");
        Intrinsics.checkNotNullParameter(vo, "vo");
        if (updateKey instanceof AnchorVisibleEvent) {
            return StickyScrollVO.copy$default(vo, 0L, null, null, null, null, null, null, false, true, false, false, 1791, null);
        }
        if (!(updateKey instanceof ScrollEvent) || vo.getShouldShrink()) {
            return vo;
        }
        this.this$0.shouldSendEvents = false;
        return StickyScrollVO.copy$default(vo, 0L, null, null, null, null, null, null, true, false, false, false, 1919, null);
    }
}
