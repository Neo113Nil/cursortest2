package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder;

import GD.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view.DeliveryV6SectionCellDefaultView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionCellDefaultViewHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/viewHolder/DeliveryV6SectionViewHolder;", "deliveryV6SectionCellDefaultView", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6SectionCellDefaultView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6SectionCellDefaultView;Lkotlin/jvm/functions/Function1;)V", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "bind", "item", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellDefault;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionCellDefaultViewHolder extends DeliveryV6SectionViewHolder {
    private CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell;

    @NotNull
    private final DeliveryV6SectionCellDefaultView deliveryV6SectionCellDefaultView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6SectionCellDefaultViewHolder(@NotNull DeliveryV6SectionCellDefaultView deliveryV6SectionCellDefaultView, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(deliveryV6SectionCellDefaultView);
        Intrinsics.checkNotNullParameter(deliveryV6SectionCellDefaultView, "deliveryV6SectionCellDefaultView");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.deliveryV6SectionCellDefaultView = deliveryV6SectionCellDefaultView;
        deliveryV6SectionCellDefaultView.setOnClickListener(new a(0, this, onAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DeliveryV6SectionCellDefaultViewHolder deliveryV6SectionCellDefaultViewHolder, Function1 function1, View view) {
        AtomActionDTO action;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cellWithSubtitleDefault = deliveryV6SectionCellDefaultViewHolder.cell;
        if (cellWithSubtitleDefault == null || (action = cellWithSubtitleDefault.getAction()) == null) {
            return;
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cellWithSubtitleDefault2 = deliveryV6SectionCellDefaultViewHolder.cell;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, cellWithSubtitleDefault2 != null ? cellWithSubtitleDefault2.getTrackingInfo() : null);
        if (atomAction != null) {
            function1.invoke(atomAction);
        }
    }

    public final void bind(@NotNull DeliveryV6SectionItem.CellDefault item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.cell = item.getCell();
        this.deliveryV6SectionCellDefaultView.bind(item);
    }
}
