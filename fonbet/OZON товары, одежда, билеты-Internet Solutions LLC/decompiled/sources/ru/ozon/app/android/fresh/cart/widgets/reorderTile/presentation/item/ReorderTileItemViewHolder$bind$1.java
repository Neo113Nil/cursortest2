package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "tile", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ReorderTileItemViewHolder$bind$1 extends AbstractC7737t implements Function2<AtomAction, ReorderTileVO.TileItem, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ Function1<t, Unit> $onClickEvent;
    final /* synthetic */ ReorderTileItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReorderTileItemViewHolder$bind$1(ReorderTileItemViewHolder reorderTileItemViewHolder, Function1<? super t, Unit> function1, Function1<? super AtomAction, Unit> function12) {
        super(2);
        this.this$0 = reorderTileItemViewHolder;
        this.$onClickEvent = function1;
        this.$actionHandler = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, ReorderTileVO.TileItem tileItem) {
        invoke2(atomAction, tileItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action, ReorderTileVO.TileItem tile) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.this$0.processReorderTileAction(tile, action, this.$onClickEvent, this.$actionHandler);
    }
}
