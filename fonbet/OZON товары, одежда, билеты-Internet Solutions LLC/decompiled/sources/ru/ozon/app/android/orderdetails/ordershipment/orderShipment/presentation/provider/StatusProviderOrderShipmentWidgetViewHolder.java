package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.provider;

import Lm0.a;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutStatusProviderBinding;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/provider/StatusProviderOrderShipmentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$StatusProviderVO;", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutStatusProviderBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutStatusProviderBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$StatusProviderVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutStatusProviderBinding;", "getBinding", "()Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutStatusProviderBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StatusProviderOrderShipmentWidgetViewHolder extends k<OrderShipmentItemVO.StatusProviderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemOrderShipmentLayoutStatusProviderBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StatusProviderOrderShipmentWidgetViewHolder(@NotNull ItemOrderShipmentLayoutStatusProviderBinding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderShipmentItemVO.StatusProviderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        final ItemOrderShipmentLayoutStatusProviderBinding itemOrderShipmentLayoutStatusProviderBinding = this.binding;
        itemOrderShipmentLayoutStatusProviderBinding.statusProviderTv.setText(item.getTitle());
        itemOrderShipmentLayoutStatusProviderBinding.deliveryNameTv.setText(item.getDeliveryName());
        ImageView deliveryIconIv = itemOrderShipmentLayoutStatusProviderBinding.deliveryIconIv;
        Intrinsics.checkNotNullExpressionValue(deliveryIconIv, "deliveryIconIv");
        ImageViewExtKt.load$default(deliveryIconIv, item.getImage(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.provider.StatusProviderOrderShipmentWidgetViewHolder$bind$1$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                ImageView deliveryIconIv2 = ItemOrderShipmentLayoutStatusProviderBinding.this.deliveryIconIv;
                Intrinsics.checkNotNullExpressionValue(deliveryIconIv2, "deliveryIconIv");
                ViewExtKt.gone(deliveryIconIv2);
                a.f17149a.e(e11);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                if (resource == null) {
                    ImageView deliveryIconIv2 = ItemOrderShipmentLayoutStatusProviderBinding.this.deliveryIconIv;
                    Intrinsics.checkNotNullExpressionValue(deliveryIconIv2, "deliveryIconIv");
                    ViewExtKt.gone(deliveryIconIv2);
                } else {
                    ItemOrderShipmentLayoutStatusProviderBinding.this.deliveryIconIv.setImageDrawable(resource);
                    ImageView deliveryIconIv3 = ItemOrderShipmentLayoutStatusProviderBinding.this.deliveryIconIv;
                    Intrinsics.checkNotNullExpressionValue(deliveryIconIv3, "deliveryIconIv");
                    ViewExtKt.show(deliveryIconIv3);
                }
            }
        }, null, null, false, null, 122, null);
        BadgeView statusProviderBadge = itemOrderShipmentLayoutStatusProviderBinding.statusProviderBadge;
        Intrinsics.checkNotNullExpressionValue(statusProviderBadge, "statusProviderBadge");
        BadgeHolderKt.bindOrGone(statusProviderBadge, item.getStatus(), this.actionHandler);
    }
}
