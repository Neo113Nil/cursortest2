package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder;

import Vg.c;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.OrderListItemDecoration;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.SectionsAdapter;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.OrderProgressVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.OrderVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.ProgressiveDiscountVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.SectionVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.v3.holders.progressbar.ProgressBarHolderKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.ItemOrderListAtomBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.uikit.view.atoms.progressbar.ProgressBarView;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountItemVO;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00160\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/OrderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderVO;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/cs_orders/databinding/ItemOrderListAtomBinding;", "binding", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;", "decoration", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "viewModel", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemOrderListAtomBinding;Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;LVg/c;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderVO;Ll20/d;)V", "Lru/ozon/app/android/cs_orders/databinding/ItemOrderListAtomBinding;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "LVg/c;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/SectionsAdapter;", "adapter", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/SectionsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderViewHolder extends k<OrderVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {
    private SectionsAdapter adapter;

    @NotNull
    private final ItemOrderListAtomBinding binding;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final OrderListItemDecoration decoration;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final CreateAndPayViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderViewHolder(@NotNull ItemOrderListAtomBinding binding, @NotNull OrderListItemDecoration decoration, @NotNull ComposerReferences ref, @NotNull CreateAndPayViewModel viewModel, @NotNull c customActionHandlersStore, @NotNull StartupArgsService startupArgsService) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.decoration = decoration;
        this.ref = ref;
        this.viewModel = viewModel;
        this.customActionHandlersStore = customActionHandlersStore;
        this.startupArgsService = startupArgsService;
        this.onAction = new ActionHandler.Builder(ref, this).buildHandler();
        binding.orderItems.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        binding.cardContainer.setOnClickListener(new D90.c(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(OrderViewHolder orderViewHolder, View view) {
        OrderVO boundedData = orderViewHolder.getBoundedData();
        if (boundedData != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(orderViewHolder.ref.getNavigator(), boundedData.getDeeplink(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderVO item, @NotNull d info) {
        SectionsAdapter sectionsAdapter;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ItemOrderListAtomBinding itemOrderListAtomBinding = this.binding;
        itemOrderListAtomBinding.orderTitleTv.setText(item.getDate());
        itemOrderListAtomBinding.orderNumberTv.setText(item.getNumber());
        ImageView iconIv = itemOrderListAtomBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.loadImageOrGone(iconIv, item.getIcon());
        ImageView iconIv2 = itemOrderListAtomBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        ThemeExtKt.semanticTint$default(iconIv2, 0, 1, null);
        Badge status = item.getStatus();
        if (status != null) {
            BadgeView statusTv = itemOrderListAtomBinding.statusTv;
            Intrinsics.checkNotNullExpressionValue(statusTv, "statusTv");
            ViewExtKt.show(statusTv);
            BadgeView statusTv2 = itemOrderListAtomBinding.statusTv;
            Intrinsics.checkNotNullExpressionValue(statusTv2, "statusTv");
            BadgeHolderKt.bind(statusTv2, status, this.onAction);
        } else {
            BadgeView statusTv3 = itemOrderListAtomBinding.statusTv;
            Intrinsics.checkNotNullExpressionValue(statusTv3, "statusTv");
            ViewExtKt.gone(statusTv3);
        }
        CommonText.TextMedium subtitle = item.getSubtitle();
        if (subtitle != null) {
            itemOrderListAtomBinding.subtitleTa.bind(subtitle);
            TextAtom subtitleTa = itemOrderListAtomBinding.subtitleTa;
            Intrinsics.checkNotNullExpressionValue(subtitleTa, "subtitleTa");
            ViewExtKt.show(subtitleTa);
        } else {
            TextAtom subtitleTa2 = itemOrderListAtomBinding.subtitleTa;
            Intrinsics.checkNotNullExpressionValue(subtitleTa2, "subtitleTa");
            ViewExtKt.gone(subtitleTa2);
        }
        SectionsAdapter sectionsAdapter2 = new SectionsAdapter(this.decoration, this.viewModel, this.ref, this, this.customActionHandlersStore, this.startupArgsService);
        this.adapter = sectionsAdapter2;
        itemOrderListAtomBinding.orderItems.setAdapter(sectionsAdapter2);
        List<SectionVO> sections = item.getSections();
        if (sections != null && (sectionsAdapter = this.adapter) != null) {
            sectionsAdapter.setItems(sections);
        }
        ProgressiveDiscountVO progressiveDiscount = item.getProgressiveDiscount();
        if (progressiveDiscount != null) {
            PriceView progressiveDiscountPa = itemOrderListAtomBinding.progressiveDiscountPa;
            Intrinsics.checkNotNullExpressionValue(progressiveDiscountPa, "progressiveDiscountPa");
            ViewExtKt.show(progressiveDiscountPa);
            PriceView progressiveDiscountPa2 = itemOrderListAtomBinding.progressiveDiscountPa;
            Intrinsics.checkNotNullExpressionValue(progressiveDiscountPa2, "progressiveDiscountPa");
            PriceHolderKt.bind$default(progressiveDiscountPa2, progressiveDiscount.getPrice(), null, 2, null);
            List<ProgressiveDiscountItemVO> progressiveDiscountItems = progressiveDiscount.getProgressiveDiscountItems();
            if (progressiveDiscountItems != null) {
                itemOrderListAtomBinding.progressiveDiscountRv.setItems(progressiveDiscountItems);
                ProgressiveDiscountView progressiveDiscountRv = itemOrderListAtomBinding.progressiveDiscountRv;
                Intrinsics.checkNotNullExpressionValue(progressiveDiscountRv, "progressiveDiscountRv");
                ViewExtKt.show(progressiveDiscountRv);
            } else {
                ProgressiveDiscountView progressiveDiscountRv2 = itemOrderListAtomBinding.progressiveDiscountRv;
                Intrinsics.checkNotNullExpressionValue(progressiveDiscountRv2, "progressiveDiscountRv");
                ViewExtKt.gone(progressiveDiscountRv2);
            }
        } else {
            PriceView progressiveDiscountPa3 = itemOrderListAtomBinding.progressiveDiscountPa;
            Intrinsics.checkNotNullExpressionValue(progressiveDiscountPa3, "progressiveDiscountPa");
            ViewExtKt.gone(progressiveDiscountPa3);
            ProgressiveDiscountView progressiveDiscountRv3 = itemOrderListAtomBinding.progressiveDiscountRv;
            Intrinsics.checkNotNullExpressionValue(progressiveDiscountRv3, "progressiveDiscountRv");
            ViewExtKt.gone(progressiveDiscountRv3);
        }
        OrderProgressVO orderProgress = item.getOrderProgress();
        if (orderProgress == null) {
            LinearLayout progressRootLl = itemOrderListAtomBinding.progressRootLl;
            Intrinsics.checkNotNullExpressionValue(progressRootLl, "progressRootLl");
            ViewExtKt.gone(progressRootLl);
            return;
        }
        LinearLayout progressRootLl2 = itemOrderListAtomBinding.progressRootLl;
        Intrinsics.checkNotNullExpressionValue(progressRootLl2, "progressRootLl");
        ViewExtKt.show(progressRootLl2);
        TextAtomView progressTitleTv = itemOrderListAtomBinding.progressTitleTv;
        Intrinsics.checkNotNullExpressionValue(progressTitleTv, "progressTitleTv");
        TextAtomHolderKt.bind$default(progressTitleTv, orderProgress.getText(), null, 2, null);
        ProgressBarView progressPBV = itemOrderListAtomBinding.progressPBV;
        Intrinsics.checkNotNullExpressionValue(progressPBV, "progressPBV");
        ProgressBarHolderKt.bind$default(progressPBV, orderProgress.getProgressBar(), null, 2, null);
    }
}
