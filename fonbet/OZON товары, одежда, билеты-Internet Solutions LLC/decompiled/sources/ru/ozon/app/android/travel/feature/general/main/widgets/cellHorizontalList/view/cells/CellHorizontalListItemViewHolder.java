package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view.cells;

import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/cells/CellHorizontalListItemViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "<init>", "(Lru/ozon/uni/android/cell/CellView;)V", "", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onClick", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellVO;Lkotlin/jvm/functions/Function1;)V", "onAction", "setupOnView", "(Lkotlin/jvm/functions/Function1;)V", "clearOnView", "Lru/ozon/uni/android/cell/CellView;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Ljava/util/Map;", "onView", "Lkotlin/jvm/functions/Function1;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListItemViewHolder extends j {

    @NotNull
    private final CellView cellView;
    private Function1<? super AtomAction, Unit> onView;
    private Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellHorizontalListItemViewHolder(@NotNull CellView cellView) {
        super(cellView);
        Intrinsics.checkNotNullParameter(cellView, "cellView");
        this.cellView = cellView;
    }

    public final void bind(@NotNull CellHorizontalListVI.CellVO item, @NotNull Function1<? super AtomAction, Unit> onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        CellHolderKt.bind(this.cellView, item.getCell(), onClick);
        CommonControlSettings common = item.getCell().getCommon();
        this.trackingInfo = common != null ? common.getTrackingInfo() : null;
        item.setPosition(getAdapterPosition());
    }

    public final void clearOnView() {
        this.onView = null;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Function1<? super AtomAction, Unit> function1 = this.onView;
        if (function1 != null) {
            function1.invoke(new AtomAction.ViewAction(this.trackingInfo, null, 2, null));
        }
    }

    public final void setupOnView(@NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onView = onAction;
    }
}
