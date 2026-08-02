package ru.ozon.app.android.ordertracking.v4.presentation.rv;

import LB.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4AllOrdersBinding;
import ru.ozon.app.android.ordertracking.v4.presentation.model.AllOrdersVO;
import ru.ozon.app.android.ordertracking.v4.presentation.util.OrderTrackingV4OutlineProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4AllOrdersViewHolder;", "Ljk0/j;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4AllOrdersBinding;", "binding", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4AllOrdersBinding;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;", "item", "bind", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;)V", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4AllOrdersBinding;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingV4AllOrdersViewHolder extends j {

    @NotNull
    private final ItemOrderTrackingV4AllOrdersBinding binding;
    private AllOrdersVO item;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderTrackingV4AllOrdersViewHolder(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ItemOrderTrackingV4AllOrdersBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        LinearLayout constraintLayout2 = binding.getConstraintLayout();
        constraintLayout2.setOnClickListener(new a(0, this, actionHandler));
        constraintLayout2.setOutlineProvider(new OrderTrackingV4OutlineProvider());
        constraintLayout2.setClipToOutline(true);
        LinearLayout constraintLayout3 = binding.getConstraintLayout();
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout3.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        binding.allOrdersTav.setTextIsSelectable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(OrderTrackingV4AllOrdersViewHolder orderTrackingV4AllOrdersViewHolder, Function1 function1, View view) {
        AtomAction action;
        AllOrdersVO allOrdersVO = orderTrackingV4AllOrdersViewHolder.item;
        if (allOrdersVO == null || (action = allOrdersVO.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    public final void bind(@NotNull AllOrdersVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ItemOrderTrackingV4AllOrdersBinding itemOrderTrackingV4AllOrdersBinding = this.binding;
        IconView allOrdersIv = itemOrderTrackingV4AllOrdersBinding.allOrdersIv;
        Intrinsics.checkNotNullExpressionValue(allOrdersIv, "allOrdersIv");
        IconHolderKt.bindOrGone$default(allOrdersIv, item.getIcon(), null, 2, null);
        TextAtomV2View allOrdersTav = itemOrderTrackingV4AllOrdersBinding.allOrdersTav;
        Intrinsics.checkNotNullExpressionValue(allOrdersTav, "allOrdersTav");
        TextHolderKt.bindOrGone$default(allOrdersTav, item.getText(), null, 2, null);
    }
}
