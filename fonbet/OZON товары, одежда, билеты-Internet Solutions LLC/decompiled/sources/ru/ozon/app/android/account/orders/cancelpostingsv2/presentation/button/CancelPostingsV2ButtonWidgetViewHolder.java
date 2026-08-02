package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import android.content.Context;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingsV2ButtonWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/ButtonVO;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;", "cancelPostingStickyView", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;Ll10/i;Ld20/e;LWZ/l;LVg/d;)V", "item", "", "bind", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/ButtonVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/ButtonVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;", "Ll10/i;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelPostingsV2ButtonWidgetViewHolder extends AbstractC6064a<ButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CancelPostingV2StickyButtonBaseView cancelPostingStickyView;

    @NotNull
    private final i container;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelPostingsV2ButtonWidgetViewHolder(@NotNull CancelPostingV2StickyButtonBaseView cancelPostingStickyView, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(cancelPostingStickyView, "cancelPostingStickyView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.cancelPostingStickyView = cancelPostingStickyView;
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new CancelPostingsV2ButtonWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CancelPostingV2StickyButtonBaseView cancelPostingV2StickyButtonBaseView = this.cancelPostingStickyView;
        LargeButtonHolderKt.bind(cancelPostingV2StickyButtonBaseView.getButtonView(), ButtonV3Atom.LargeButton.copy$default(item.getButton(), null, null, null, null, null, item.getButton().getAction(), null, null, null, 479, null), this.actionHandler);
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        cancelPostingV2StickyButtonBaseView.bindBadge(L11, item.getBadge(), this.actionHandler);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ButtonVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((CancelPostingsV2ButtonWidgetViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getButton().getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(item.getId());
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            t b11 = x.b(trackingInfo, valueOf, null);
            if (b11 != null) {
                m.c(this.tokenizedAnalytics, b11, null);
            }
        }
    }
}
