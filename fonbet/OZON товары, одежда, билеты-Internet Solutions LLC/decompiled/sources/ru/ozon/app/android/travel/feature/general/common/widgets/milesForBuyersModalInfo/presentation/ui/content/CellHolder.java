package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoVO;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/CellHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/BaseContentItemHolder;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHolder extends BaseContentItemHolder {
    public static final int $stable = CellView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CellView cellView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellHolder(@NotNull CellView cellView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(cellView);
        Intrinsics.checkNotNullParameter(cellView, "cellView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.cellView = cellView;
        this.actionHandler = actionHandler;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content.BaseContentItemHolder
    public void bind(@NotNull MilesForBuyersModalInfoVO.ContentItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellHolderKt.bind(this.cellView, ((MilesForBuyersModalInfoVO.ContentItem.CellItem) item).getCell(), this.actionHandler);
    }
}
