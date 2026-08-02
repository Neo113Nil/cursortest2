package ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewHolder;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.DeliveryInfoVO;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.views.DeliveryInfoCellListView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewHolder/DeliveryInfoViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryInfoViewHolder extends k<DeliveryInfoVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final DeliveryInfoCellListView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryInfoViewHolder(@NotNull DeliveryInfoCellListView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bindView(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryInfoVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((DeliveryInfoViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
