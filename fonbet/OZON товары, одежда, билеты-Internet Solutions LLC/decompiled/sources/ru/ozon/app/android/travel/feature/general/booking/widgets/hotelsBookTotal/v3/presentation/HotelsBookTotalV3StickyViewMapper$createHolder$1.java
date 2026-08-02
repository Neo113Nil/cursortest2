package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HotelsBookTotalV3StickyViewMapper$createHolder$1 extends AbstractC7737t implements Function0<HotelsBookTotalV3StickyContainerView> {
    final /* synthetic */ i $container;
    final /* synthetic */ HotelsBookTotalV3StickyViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV3StickyViewMapper$createHolder$1(HotelsBookTotalV3StickyViewMapper hotelsBookTotalV3StickyViewMapper, i iVar) {
        super(0);
        this.this$0 = hotelsBookTotalV3StickyViewMapper;
        this.$container = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HotelsBookTotalV3StickyContainerView invoke() {
        HotelsBookTotalV3StickyContainerView createView;
        HotelsBookTotalV3StickyViewMapper hotelsBookTotalV3StickyViewMapper = this.this$0;
        Context L11 = this.$container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        createView = hotelsBookTotalV3StickyViewMapper.createView(L11);
        return createView;
    }
}
