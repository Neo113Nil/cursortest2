package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.view.OverlayButtonsHorizontalAtomsLayout;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/presentation/OverlayButtonsWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/presentation/OverlayButtonsVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/presentation/OverlayButtonsVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/presentation/OverlayButtonsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/view/OverlayButtonsHorizontalAtomsLayout;", "getOverlayButtonsView", "()Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/view/OverlayButtonsHorizontalAtomsLayout;", "overlayButtonsView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsWidgetViewHolder extends AbstractC6064a<OverlayButtonsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final i container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayButtonsWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.actionHandler = buildHandler;
        OverlayButtonsHorizontalAtomsLayout overlayButtonsView = getOverlayButtonsView();
        if (overlayButtonsView != null) {
            overlayButtonsView.setAdapter(atomsAdapter);
        }
        atomsAdapter.setOnAction(buildHandler);
    }

    private final OverlayButtonsHorizontalAtomsLayout getOverlayButtonsView() {
        View view = getView();
        if (view instanceof OverlayButtonsHorizontalAtomsLayout) {
            return (OverlayButtonsHorizontalAtomsLayout) view;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OverlayButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        OverlayButtonsHorizontalAtomsLayout overlayButtonsView = getOverlayButtonsView();
        if (overlayButtonsView != null) {
            overlayButtonsView.setBackgroundColor(item.getBackgroundColor());
        }
        OverlayButtonsHorizontalAtomsLayout overlayButtonsView2 = getOverlayButtonsView();
        if (overlayButtonsView2 != null) {
            overlayButtonsView2.setDividerColor(item.getDividerColor());
        }
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        atomsAdapter.bind(L11, item.getButtons());
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull OverlayButtonsVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((OverlayButtonsWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}
