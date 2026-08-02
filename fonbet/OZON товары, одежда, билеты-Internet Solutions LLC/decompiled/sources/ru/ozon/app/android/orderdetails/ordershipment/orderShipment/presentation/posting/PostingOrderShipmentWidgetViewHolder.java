package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting;

import CG.b;
import Gt.a;
import Vg.c;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutPostingBinding;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/PostingOrderShipmentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingVO;", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutPostingBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutPostingBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;)V", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "progressiveText", "", "bindProgressiveText", "(Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutPostingBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostingOrderShipmentWidgetViewHolder extends k<OrderShipmentItemVO.PostingVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemOrderShipmentLayoutPostingBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PostingOrderShipmentWidgetViewHolder(@NotNull ItemOrderShipmentLayoutPostingBinding binding, @NotNull ComposerReferences refs, @NotNull c customActionHandlersStore) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new PostingOrderShipmentWidgetViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        binding.progressiveTextV.setOnClickListener(new b(this, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$4$lambda$2(PostingOrderShipmentWidgetViewHolder postingOrderShipmentWidgetViewHolder, AtomAction atomAction, View view) {
        postingOrderShipmentWidgetViewHolder.actionHandler.invoke(atomAction);
    }

    private final void bindProgressiveText(ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText) {
        ProgressiveTextView progressiveTextView = this.binding.progressiveTextV;
        if (progressiveText != null) {
            progressiveTextView.bind(progressiveText);
        }
        Intrinsics.f(progressiveTextView);
        ViewExtKt.showOrGoneByPresence(progressiveTextView, progressiveText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(PostingOrderShipmentWidgetViewHolder postingOrderShipmentWidgetViewHolder, View view) {
        ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText;
        AtomAction action;
        OrderShipmentItemVO.PostingVO boundedData = postingOrderShipmentWidgetViewHolder.getBoundedData();
        if (boundedData == null || (progressiveText = boundedData.getProgressiveText()) == null || (action = progressiveText.getAction()) == null) {
            return;
        }
        postingOrderShipmentWidgetViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderShipmentItemVO.PostingVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ItemOrderShipmentLayoutPostingBinding itemOrderShipmentLayoutPostingBinding = this.binding;
        TextView textTv = itemOrderShipmentLayoutPostingBinding.textTv;
        Intrinsics.checkNotNullExpressionValue(textTv, "textTv");
        TextViewExtKt.setTextOrGone(textTv, item.getTitle());
        TextView trackDeliveryTitleTv = itemOrderShipmentLayoutPostingBinding.trackDeliveryTitleTv;
        Intrinsics.checkNotNullExpressionValue(trackDeliveryTitleTv, "trackDeliveryTitleTv");
        TextViewExtKt.setTextOrGone(trackDeliveryTitleTv, item.getTrackDeliveryTitle());
        SmallBorderlessButtonView shareBtn = itemOrderShipmentLayoutPostingBinding.shareBtn;
        Intrinsics.checkNotNullExpressionValue(shareBtn, "shareBtn");
        WrappedBorderlessButtonHolderKt.bindOrGone(shareBtn, item.getShareButton(), this.actionHandler);
        itemOrderShipmentLayoutPostingBinding.productsPackageRv.setLayoutManager(new GridLayoutManager(getContext(), item.getColumnsCount()));
        itemOrderShipmentLayoutPostingBinding.productsPackageRv.setAdapter(new OrderShipmentProductAdapter(item.getProducts(), item.getItemPreviewSize()));
        bindProgressiveText(item.getProgressiveText());
        AtomAction action = item.getAction();
        if (action != null) {
            itemOrderShipmentLayoutPostingBinding.getConstraintLayout().setOnClickListener(new a(4, this, action));
            RecyclerView.g adapter = itemOrderShipmentLayoutPostingBinding.productsPackageRv.getAdapter();
            OrderShipmentProductAdapter orderShipmentProductAdapter = adapter instanceof OrderShipmentProductAdapter ? (OrderShipmentProductAdapter) adapter : null;
            if (orderShipmentProductAdapter != null) {
                orderShipmentProductAdapter.setOnItemClick(new PostingOrderShipmentWidgetViewHolder$bind$1$1$2$1(this, action));
            }
        }
    }
}
