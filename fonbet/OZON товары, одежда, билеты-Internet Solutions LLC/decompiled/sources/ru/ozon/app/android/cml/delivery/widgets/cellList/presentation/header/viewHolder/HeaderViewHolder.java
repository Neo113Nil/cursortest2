package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.header.viewHolder;

import Vg.d;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CmlCellListMoleculeView;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.header.viewItem.HeaderVI;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/header/viewHolder/HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/header/viewItem/HeaderVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/widget/FrameLayout;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/widget/FrameLayout;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/header/viewItem/HeaderVI;Ll20/d;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListMoleculeView;", "cellListView", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListMoleculeView;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderViewHolder extends k<HeaderVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CmlCellListMoleculeView cellListView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewHolder(@NotNull FrameLayout containerView, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).customActionHandlers(new HeaderViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        CmlCellListMoleculeView cmlCellListMoleculeView = new CmlCellListMoleculeView(getContext(), null, 0, 6, null);
        cmlCellListMoleculeView.setId(View.generateViewId());
        cmlCellListMoleculeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        cmlCellListMoleculeView.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
        containerView.addView(cmlCellListMoleculeView);
        this.cellListView = cmlCellListMoleculeView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.cellListView.bind(item.getCellList(), this.actionHandler);
    }
}
