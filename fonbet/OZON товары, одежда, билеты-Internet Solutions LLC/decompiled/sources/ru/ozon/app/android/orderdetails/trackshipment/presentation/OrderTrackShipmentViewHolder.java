package ru.ozon.app.android.orderdetails.trackshipment.presentation;

import AB.a;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.WidgetOrderTrackShipmentBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/trackshipment/presentation/OrderTrackShipmentViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/trackshipment/presentation/OrderTrackShipmentVO;", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTrackShipmentBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTrackShipmentBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/trackshipment/presentation/OrderTrackShipmentVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTrackShipmentBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/jvm/functions/Function1;", "getAction", "()Lkotlin/jvm/functions/Function1;", "currentItem", "Lru/ozon/app/android/orderdetails/trackshipment/presentation/OrderTrackShipmentVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackShipmentViewHolder extends k<OrderTrackShipmentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> action;

    @NotNull
    private final WidgetOrderTrackShipmentBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;
    private OrderTrackShipmentVO currentItem;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.orderdetails.trackshipment.presentation.OrderTrackShipmentViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OrderTrackShipmentVO orderTrackShipmentVO = OrderTrackShipmentViewHolder.this.currentItem;
            if (orderTrackShipmentVO != null) {
                RestrictionsUtilsKt.showRestrictionAndCopy(OrderTrackShipmentViewHolder.this.composerReferences, orderTrackShipmentVO.getTrackNumber(), orderTrackShipmentVO.getNotificationText());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderTrackShipmentViewHolder(@NotNull WidgetOrderTrackShipmentBinding binding, @NotNull ComposerReferences composerReferences) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerReferences = composerReferences;
        this.action = new ActionHandler.Builder(composerReferences, this).buildHandler();
        ConstraintLayout orderTrackNumberContainer = binding.orderTrackNumberContainer;
        Intrinsics.checkNotNullExpressionValue(orderTrackNumberContainer, "orderTrackNumberContainer");
        ViewExtKt.setOnClickListenerThrottle$default(orderTrackNumberContainer, 0L, new AnonymousClass1(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$0(WidgetOrderTrackShipmentBinding widgetOrderTrackShipmentBinding, OrderTrackShipmentVO orderTrackShipmentVO) {
        widgetOrderTrackShipmentBinding.copyIcon.setColorFilter(orderTrackShipmentVO.getIconColor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderTrackShipmentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetOrderTrackShipmentBinding widgetOrderTrackShipmentBinding = this.binding;
        this.currentItem = item;
        widgetOrderTrackShipmentBinding.trackNumberLabel.setText(item.getPrefix());
        widgetOrderTrackShipmentBinding.orderTrackNumber.setText(item.getTrackNumber());
        widgetOrderTrackShipmentBinding.orderTrackNumber.setHorizontalFadingEdgeEnabled(true);
        ImageView copyIcon = widgetOrderTrackShipmentBinding.copyIcon;
        Intrinsics.checkNotNullExpressionValue(copyIcon, "copyIcon");
        ImageViewExtKt.loadImageOrGone(copyIcon, item.getIcon());
        widgetOrderTrackShipmentBinding.copyIcon.post(new a(0, widgetOrderTrackShipmentBinding, item));
        ButtonV3Atom.SmallBorderlessButton button = item.getButton();
        if (button == null) {
            SmallBorderlessButtonView trackButton = widgetOrderTrackShipmentBinding.trackButton;
            Intrinsics.checkNotNullExpressionValue(trackButton, "trackButton");
            ViewExtKt.gone(trackButton);
        } else {
            SmallBorderlessButtonView trackButton2 = widgetOrderTrackShipmentBinding.trackButton;
            Intrinsics.checkNotNullExpressionValue(trackButton2, "trackButton");
            ViewExtKt.show(trackButton2);
            SmallBorderlessButtonView trackButton3 = widgetOrderTrackShipmentBinding.trackButton;
            Intrinsics.checkNotNullExpressionValue(trackButton3, "trackButton");
            WrappedBorderlessButtonHolderKt.bind(trackButton3, button, this.action);
        }
    }
}
