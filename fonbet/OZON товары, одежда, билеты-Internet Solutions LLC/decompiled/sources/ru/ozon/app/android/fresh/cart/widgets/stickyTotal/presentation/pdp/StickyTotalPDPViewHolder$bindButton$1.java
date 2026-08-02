package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.StickyTotalPDPCountPickerBinder;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyTotalPDPViewHolder$bindButton$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ StickyTotalVO $item;
    final /* synthetic */ StickyTotalPDPViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewHolder$bindButton$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function2<Integer, StickyTotalPDPCountPickerBinder.PickerActionType, Unit> {
        AnonymousClass1(Object obj) {
            super(2, obj, StickyTotalPDPViewHolder.class, "countPickerUpdate", "countPickerUpdate(ILru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$PickerActionType;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, StickyTotalPDPCountPickerBinder.PickerActionType pickerActionType) {
            invoke(num.intValue(), pickerActionType);
            return Unit.f71690a;
        }

        public final void invoke(int i11, StickyTotalPDPCountPickerBinder.PickerActionType p12) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((StickyTotalPDPViewHolder) this.receiver).countPickerUpdate(i11, p12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalPDPViewHolder$bindButton$1(StickyTotalVO stickyTotalVO, StickyTotalPDPViewHolder stickyTotalPDPViewHolder) {
        super(1);
        this.$item = stickyTotalVO;
        this.this$0 = stickyTotalPDPViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        CartPickerVO countPicker;
        StickyTotalPDPCountPickerBinder countPickerBinder;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        if (atomAction instanceof AtomAction.Click) {
            StickyTotalVO.State state = this.$item.getState();
            StickyTotalVO.State.Pdp pdp = state instanceof StickyTotalVO.State.Pdp ? (StickyTotalVO.State.Pdp) state : null;
            if (pdp == null || (countPicker = pdp.getCountPicker()) == null) {
                return;
            }
            countPickerBinder = this.this$0.getCountPickerBinder();
            countPickerBinder.onIncrement(countPicker, StickyTotalPDPCountPickerBinder.PickerActionType.ADD, new AnonymousClass1(this.this$0));
        }
    }
}
