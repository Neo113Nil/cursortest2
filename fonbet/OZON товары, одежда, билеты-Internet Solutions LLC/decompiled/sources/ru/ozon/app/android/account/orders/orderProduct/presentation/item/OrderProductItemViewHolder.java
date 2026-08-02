package ru.ozon.app.android.account.orders.orderProduct.presentation.item;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import Sk.a;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.orders.orderProduct.viewObject.OrderProductItemVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImagesAdapter;
import ru.ozon.app.android.cscore.padding.PaddingExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u001b\u0010%\u001a\u00020$*\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/presentation/item/OrderProductItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductItemVO;", "Lru/ozon/app/android/account/orders/orderProduct/presentation/item/OrderProductItemView;", "orderProductItemView", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "adultDelegate", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/account/orders/orderProduct/presentation/item/OrderProductItemView;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "", "updateItemDecorationIfNeed", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductItemVO;Ll20/d;)V", "Landroid/content/res/Resources;", "layoutPadding", "", "getPadding", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "Lru/ozon/app/android/account/orders/orderProduct/presentation/item/OrderProductItemView;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "Lru/ozon/app/android/account/orders/orderProduct/presentation/item/OrderProductImageItemDecoration;", "itemDecoration", "Lru/ozon/app/android/account/orders/orderProduct/presentation/item/OrderProductImageItemDecoration;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderProductItemViewHolder extends k<OrderProductItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultListDelegate<ImageVO> adultDelegate;

    @NotNull
    private final ImagesAdapter imagesAdapter;
    private OrderProductImageItemDecoration itemDecoration;

    @NotNull
    private final OrderProductItemView orderProductItemView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderProductItemViewHolder(@NotNull OrderProductItemView orderProductItemView, @NotNull AdultListDelegate<ImageVO> adultDelegate, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(orderProductItemView);
        Intrinsics.checkNotNullParameter(orderProductItemView, "orderProductItemView");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.orderProductItemView = orderProductItemView;
        this.adultDelegate = adultDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        ImagesAdapter imagesAdapter = new ImagesAdapter(refs.getContainer().f(), buildHandler);
        this.imagesAdapter = imagesAdapter;
        final RecyclerView recyclerView = orderProductItemView.getRecyclerView();
        recyclerView.setAdapter(imagesAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.account.orders.orderProduct.presentation.item.OrderProductItemViewHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView recyclerView2, MotionEvent event) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                Intrinsics.checkNotNullParameter(event, "event");
                if (recyclerView2.getScrollState() != 0 || event.getActionMasked() != 1 || recyclerView2.findChildViewUnder(event.getX(), event.getY()) != null) {
                    return false;
                }
                RecyclerView.this.performClick();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$1(OrderProductItemVO orderProductItemVO, OrderProductItemViewHolder orderProductItemViewHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CommonControlSettings common = orderProductItemVO.getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, orderProductItemVO.getCommon().getTrackingInfo())) == null) {
            return;
        }
        orderProductItemViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$submitList(ImagesAdapter imagesAdapter, List list, d dVar) {
        imagesAdapter.submitList(list);
        return Unit.f71690a;
    }

    private final void updateItemDecorationIfNeed(CommonCellSettings.LayoutPadding padding) {
        Resources resources = this.itemView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int padding2 = getPadding(resources, padding);
        OrderProductImageItemDecoration orderProductImageItemDecoration = this.itemDecoration;
        if (orderProductImageItemDecoration == null || orderProductImageItemDecoration.getPaddingBetween() != padding2) {
            OrderProductImageItemDecoration orderProductImageItemDecoration2 = this.itemDecoration;
            if (orderProductImageItemDecoration2 != null) {
                this.orderProductItemView.getRecyclerView().removeItemDecoration(orderProductImageItemDecoration2);
            }
            OrderProductImageItemDecoration orderProductImageItemDecoration3 = new OrderProductImageItemDecoration(padding2);
            this.orderProductItemView.getRecyclerView().addItemDecoration(orderProductImageItemDecoration3);
            this.itemDecoration = orderProductImageItemDecoration3;
        }
    }

    public final int getPadding(@NotNull Resources resources, CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (int) resources.getDimension(layoutPadding != null ? layoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(n.a(this.adultDelegate.observeItems()), new OrderProductItemViewHolder$onAttachViewModel$1(this.imagesAdapter)), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderProductItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        OrderProductItemView orderProductItemView = this.orderProductItemView;
        orderProductItemView.getRecyclerView().setOnClickListener(new a(0, item, this));
        CellHolderKt.bindOrGone(orderProductItemView.getCell(), item.getCell(), this.actionHandler);
        PaddingExtKt.applyPaddings(this.orderProductItemView.getRecyclerView(), item.getImagePaddings());
        updateItemDecorationIfNeed(item.getSpaceBetween());
        this.adultDelegate.bindItems(item.getImages());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = orderProductItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            orderProductItemView.setBackgroundColor(parseColor.intValue());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderProductItemVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
