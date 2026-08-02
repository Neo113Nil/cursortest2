package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyTotalOverlayViewHolder$bindButton$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ AtomAction $additionalAction;
    final /* synthetic */ ButtonV3DTO $button;
    final /* synthetic */ long $delay;
    final /* synthetic */ StickyTotalVO $item;
    final /* synthetic */ StickyTotalOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalOverlayViewHolder$bindButton$1(ButtonV3DTO buttonV3DTO, StickyTotalVO stickyTotalVO, StickyTotalOverlayViewHolder stickyTotalOverlayViewHolder, AtomAction atomAction, long j11) {
        super(1);
        this.$button = buttonV3DTO;
        this.$item = stickyTotalVO;
        this.this$0 = stickyTotalOverlayViewHolder;
        this.$additionalAction = atomAction;
        this.$delay = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        StickyTotalOverlayViewHolder.processAction$default(this.this$0, atomAction, this.$item, this.$button.getTrackingInfo(), this.$item.getEnableAsync(), false, null, this.$additionalAction, this.$delay, 48, null);
    }
}
