package ru.ozon.app.android.travel.feature.general.common.widgets.bonusCellToggle.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconToggleCounterHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconToggleCounterView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusCellToggle/presentation/BonusCellToggleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusCellToggle/presentation/BonusCellToggleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusCellToggle/presentation/BonusCellToggleVO;Ll20/d;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconToggleCounterView;", "cellView", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconToggleCounterView;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BonusCellToggleWidgetViewHolder extends k<BonusCellToggleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final CellWithSubtitle24IconToggleCounterView cellView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusCellToggleWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.cellView = containerView instanceof CellWithSubtitle24IconToggleCounterView ? (CellWithSubtitle24IconToggleCounterView) containerView : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BonusCellToggleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellWithSubtitle24IconToggleCounterView cellWithSubtitle24IconToggleCounterView = this.cellView;
        if (cellWithSubtitle24IconToggleCounterView != null) {
            CellWithSubtitle24IconToggleCounterHolderKt.bind(cellWithSubtitle24IconToggleCounterView, item.getCell(), this.actionHandler);
        }
    }
}
