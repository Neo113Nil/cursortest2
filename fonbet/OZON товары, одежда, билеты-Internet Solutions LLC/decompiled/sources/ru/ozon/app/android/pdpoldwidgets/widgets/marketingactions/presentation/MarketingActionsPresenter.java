package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation;

import GZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;", "", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsView;", "view", "", "initView", "(Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsView;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO;", "item", "onBind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO;)V", "", "deeplink", "onActionLinkClick", "(Ljava/lang/String;)V", "LGZ/g;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsView;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarketingActionsPresenter {

    @NotNull
    private final g ozonRouter;
    private MarketingActionsView view;

    public MarketingActionsPresenter(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    public final void initView(@NotNull MarketingActionsView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void onActionLinkClick(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        g.a.a(this.ozonRouter, deeplink, null, null, 6);
    }

    public final void onBind(@NotNull MarketingActionsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        MarketingActionsView marketingActionsView = this.view;
        if (marketingActionsView != null) {
            marketingActionsView.showItems(item.getActions());
        } else {
            Intrinsics.n("view");
            throw null;
        }
    }
}
