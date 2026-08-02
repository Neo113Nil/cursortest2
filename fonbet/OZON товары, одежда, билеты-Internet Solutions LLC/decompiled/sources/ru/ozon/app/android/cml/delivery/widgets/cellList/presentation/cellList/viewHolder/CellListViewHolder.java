package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewHolder;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CmlCellListMoleculeView;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewItem.CellListVI;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewHolder/CellListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Landroid/widget/FrameLayout;", "containerView", "<init>", "(LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Landroid/widget/FrameLayout;)V", "", "scrollToHeader", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListMoleculeView;", "cellListView", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListMoleculeView;", "", "getAppBarHeight", "()I", "appBarHeight", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellListViewHolder extends k<CellListVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CmlCellListMoleculeView cellListView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellListViewHolder(@NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor, @NotNull FrameLayout containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).customActionHandlers(new CellListViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        CmlCellListMoleculeView cmlCellListMoleculeView = new CmlCellListMoleculeView(getContext(), null, 0, 6, null);
        cmlCellListMoleculeView.setId(View.generateViewId());
        cmlCellListMoleculeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        cmlCellListMoleculeView.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
        cmlCellListMoleculeView.setItemAnimator(null);
        containerView.addView(cmlCellListMoleculeView);
        this.cellListView = cmlCellListMoleculeView;
    }

    private final int getAppBarHeight() {
        View view;
        AppBarLayout composerAppbar;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(view)) == null) {
            return 0;
        }
        return composerAppbar.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToHeader() {
        CellListVI boundData = getBoundData();
        if (boundData != null) {
            this.refs.getController().o(boundData.getHeaderWidgetKey(), getAppBarHeight(), true, false);
            this.refs.getController().update(CellListDisableScrollUpdateKey.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CellListVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getNeedScroll()) {
            this.cellListView.bindWithCallback(item.getMappedList(), new CellListViewHolder$bind$1(this), this.actionHandler);
        } else {
            this.cellListView.bind(item.getMappedList(), this.actionHandler);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CellListVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
