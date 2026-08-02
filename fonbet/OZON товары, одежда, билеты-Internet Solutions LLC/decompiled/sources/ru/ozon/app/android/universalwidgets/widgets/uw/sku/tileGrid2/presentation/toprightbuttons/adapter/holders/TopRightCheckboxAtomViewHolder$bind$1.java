package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "status", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "fromTouch", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TopRightCheckboxAtomViewHolder$bind$1 extends AbstractC7737t implements InterfaceC6511n<CheckBoxView, CheckBoxDTO.CheckboxStatus, Boolean, Unit> {
    final /* synthetic */ TileGrid2CheckBoxVO $item;
    final /* synthetic */ Function1<TileGrid2CheckBoxVO, Unit> $onCheckboxClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TopRightCheckboxAtomViewHolder$bind$1(Function1<? super TileGrid2CheckBoxVO, Unit> function1, TileGrid2CheckBoxVO tileGrid2CheckBoxVO) {
        super(3);
        this.$onCheckboxClick = function1;
        this.$item = tileGrid2CheckBoxVO;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, Boolean bool) {
        invoke(checkBoxView, checkboxStatus, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus status, boolean z11) {
        Intrinsics.checkNotNullParameter(checkBoxView, "<unused var>");
        Intrinsics.checkNotNullParameter(status, "status");
        if (z11) {
            this.$onCheckboxClick.invoke(this.$item);
        }
    }
}
