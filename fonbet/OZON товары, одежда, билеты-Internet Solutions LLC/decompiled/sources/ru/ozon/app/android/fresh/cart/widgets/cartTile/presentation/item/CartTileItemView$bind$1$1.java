package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import WZ.t;
import android.view.View;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "<unused var>", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "fromTouch", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemView$bind$1$1 extends AbstractC7737t implements InterfaceC6511n<CheckBoxView, CheckBoxDTO.CheckboxStatus, Boolean, Unit> {
    final /* synthetic */ Function2<AtomAction, CartTileVO.TileItem, Unit> $actionHandler;
    final /* synthetic */ CartTileVO.TileItem $item;
    final /* synthetic */ Function1<t, Unit> $onClickEvent;
    final /* synthetic */ CartTileVO.TileItem $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTileItemView$bind$1$1(CartTileVO.TileItem tileItem, Function1<? super t, Unit> function1, Function2<? super AtomAction, ? super CartTileVO.TileItem, Unit> function2, CartTileVO.TileItem tileItem2) {
        super(3);
        this.$this_with = tileItem;
        this.$onClickEvent = function1;
        this.$actionHandler = function2;
        this.$item = tileItem2;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, Boolean bool) {
        invoke(checkBoxView, checkboxStatus, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(CheckBoxView view, CheckBoxDTO.CheckboxStatus checkboxStatus, final boolean z11) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(checkboxStatus, "<unused var>");
        final CartTileVO.TileItem tileItem = this.$this_with;
        final Function1<t, Unit> function1 = this.$onClickEvent;
        final Function2<AtomAction, CartTileVO.TileItem, Unit> function2 = this.$actionHandler;
        final CartTileVO.TileItem tileItem2 = this.$item;
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.CartTileItemView$bind$1$1$invoke$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                AtomAction action;
                t trackingEvent;
                view2.removeOnLayoutChangeListener(this);
                if (z11) {
                    CartTileVO.TileItem.CheckboxWrapper checkboxWrapper = tileItem.getCheckboxWrapper();
                    if (checkboxWrapper != null && (trackingEvent = checkboxWrapper.getTrackingEvent()) != null) {
                        function1.invoke(trackingEvent);
                    }
                    CartTileVO.TileItem.CheckboxWrapper checkboxWrapper2 = tileItem.getCheckboxWrapper();
                    if (checkboxWrapper2 == null || (action = checkboxWrapper2.getAction()) == null) {
                        return;
                    }
                    function2.invoke(action, tileItem2);
                }
            }
        });
        view.requestLayout();
    }
}
