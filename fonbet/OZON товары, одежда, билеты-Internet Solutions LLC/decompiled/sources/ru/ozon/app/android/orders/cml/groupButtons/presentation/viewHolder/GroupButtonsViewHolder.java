package ru.ozon.app.android.orders.cml.groupButtons.presentation.viewHolder;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.view.GroupButtonsView;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.viewItem.GroupButtonsVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewHolder/GroupButtonsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/view/GroupButtonsView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/orders/cml/groupButtons/presentation/view/GroupButtonsView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "paddings", "", "setVerticalPaddings", "(Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/view/GroupButtonsView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GroupButtonsViewHolder extends k<GroupButtonsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final GroupButtonsView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupButtonsViewHolder(@NotNull GroupButtonsView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new GroupButtonsViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final void setVerticalPaddings(VerticalPadding paddings) {
        CommonCellSettings.LayoutPadding bottom;
        CommonCellSettings.LayoutPadding top;
        GroupButtonsView groupButtonsView = this.view;
        groupButtonsView.setPadding(groupButtonsView.getPaddingStart(), (paddings == null || (top = paddings.getTop()) == null) ? groupButtonsView.getPaddingTop() : (int) groupButtonsView.getContext().getResources().getDimension(top.getCellLayoutPadding()), groupButtonsView.getPaddingEnd(), (paddings == null || (bottom = paddings.getBottom()) == null) ? groupButtonsView.getPaddingBottom() : (int) groupButtonsView.getContext().getResources().getDimension(bottom.getCellLayoutPadding()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull GroupButtonsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        GroupButtonsView groupButtonsView = this.view;
        setVerticalPaddings(item.getVerticalPadding());
        groupButtonsView.bindView(item.getButtons(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull GroupButtonsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((GroupButtonsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
