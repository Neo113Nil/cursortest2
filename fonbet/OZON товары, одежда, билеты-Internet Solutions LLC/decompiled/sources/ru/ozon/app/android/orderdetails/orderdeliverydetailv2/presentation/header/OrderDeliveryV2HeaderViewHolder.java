package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.header;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.listelements.ListElementHolderKt;
import ru.ozon.app.android.atoms.v3.holders.listelements.ListElementView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.OrderDiliveryDetailHeaderV2Binding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/header/OrderDeliveryV2HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/header/OrderDeliveryDetailV2HeaderVO;", "Lru/ozon/app/android/orderdetails/databinding/OrderDiliveryDetailHeaderV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/OrderDiliveryDetailHeaderV2Binding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/header/OrderDeliveryDetailV2HeaderVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/OrderDiliveryDetailHeaderV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryV2HeaderViewHolder extends k<OrderDeliveryDetailV2HeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final OrderDiliveryDetailHeaderV2Binding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDeliveryV2HeaderViewHolder(@NotNull OrderDiliveryDetailHeaderV2Binding binding, @NotNull ComposerReferences composerReferences) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        ListElementView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDeliveryDetailV2HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        OrderDiliveryDetailHeaderV2Binding orderDiliveryDetailHeaderV2Binding = this.binding;
        ListElementView iconWithTitleItem = orderDiliveryDetailHeaderV2Binding.iconWithTitleItem;
        Intrinsics.checkNotNullExpressionValue(iconWithTitleItem, "iconWithTitleItem");
        ListElementHolderKt.bind(iconWithTitleItem, item.getHeader(), this.actionHandler);
        orderDiliveryDetailHeaderV2Binding.iconWithTitleItem.setImageTint(ThemeExtKt.themeColor(getContext(), R$attr.graphicPrimary));
        orderDiliveryDetailHeaderV2Binding.iconWithTitleItem.bindAtomsOrGone(item.getHeader().getAtoms());
        orderDiliveryDetailHeaderV2Binding.iconWithTitleItem.addItemDecoration(new OrderDeliveryDetailV2AtomsDecoration(getContext()));
    }
}
