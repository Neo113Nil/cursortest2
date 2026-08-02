package ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewHolder;

import FB.a;
import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orders.cml.deliveryOrderList.data.InputDTO;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewItem.DeliveryOrderVO;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.views.DeliveryOrderView;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.view.GroupButtonsView;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.viewItem.GroupButtonsVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00110%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewHolder/DeliveryOrderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewItem/DeliveryOrderVO;", "Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/views/DeliveryOrderView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/views/DeliveryOrderView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cityList", "", "bindCitiesView", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "resetPadding", "(Landroid/view/ViewGroup;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewItem/DeliveryOrderVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewItem/DeliveryOrderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/views/DeliveryOrderView;", "LWZ/l;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgeInRowAdapter$delegate", "LSc/j;", "getBadgeInRowAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgeInRowAdapter", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class DeliveryOrderViewHolder extends k<DeliveryOrderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: badgeInRowAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeInRowAdapter;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final View.OnTouchListener touchListener;

    @NotNull
    private final DeliveryOrderView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryOrderViewHolder(@NotNull DeliveryOrderView view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new DeliveryOrderViewHolder$actionHandler$1(this)).buildHandler();
        this.badgeInRowAdapter = Sc.k.b(new DeliveryOrderViewHolder$badgeInRowAdapter$2(this));
        a aVar = new a(this, 0);
        this.touchListener = aVar;
        view.setOnTouchListener(aVar);
    }

    private final void bindCitiesView(List<BadgeDTO> cityList) {
        DeliveryOrderView deliveryOrderView = this.view;
        ArrayList I11 = C7714v.I(cityList);
        if (I11.isEmpty()) {
            ViewExtKt.gone(deliveryOrderView.getBadgeInRowLayout());
            return;
        }
        ViewExtKt.show(deliveryOrderView.getBadgeInRowLayout());
        deliveryOrderView.getBadgeInRowLayout().setAdapter(getBadgeInRowAdapter());
        AtomsAdapter badgeInRowAdapter = getBadgeInRowAdapter();
        Context context = deliveryOrderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        badgeInRowAdapter.bind(context, I11);
    }

    private final AtomsAdapter getBadgeInRowAdapter() {
        return (AtomsAdapter) this.badgeInRowAdapter.getValue();
    }

    private final void resetPadding(ViewGroup viewGroup) {
        viewGroup.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(DeliveryOrderViewHolder deliveryOrderViewHolder, View view, MotionEvent motionEvent) {
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        DeliveryOrderVO boundData = deliveryOrderViewHolder.getBoundData();
        if (boundData != null && (common = boundData.getCommon()) != null && (action = common.getAction()) != null) {
            DeliveryOrderVO boundData2 = deliveryOrderViewHolder.getBoundData();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, (boundData2 == null || (common2 = boundData2.getCommon()) == null) ? null : common2.getTrackingInfo());
            if (atomAction != null) {
                deliveryOrderViewHolder.actionHandler.invoke(atomAction);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryOrderVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        DeliveryOrderView deliveryOrderView = this.view;
        TextHolderKt.bind$default(deliveryOrderView.getStatusTitleTextView(), item.getStatus().getText(), null, 2, null);
        deliveryOrderView.getStatusTitleTextView().setOnTouchListener(this.touchListener);
        SingleAtom statusTitleSingleAtomView = deliveryOrderView.getStatusTitleSingleAtomView();
        AtomDTO iconButton = item.getStatus().getIconButton();
        if (iconButton == null) {
            iconButton = item.getStatus().getBadge();
        }
        ContainerExtKt.bindOrGone$default(statusTitleSingleAtomView, iconButton, false, 2, null);
        deliveryOrderView.getStatusTitleSingleAtomView().setOnAction(this.actionHandler);
        TextHolderKt.bindOrGone$default(deliveryOrderView.getTitleTextView(), item.getTitle(), null, 2, null);
        deliveryOrderView.getTitleTextView().setOnTouchListener(this.touchListener);
        TextHolderKt.bindOrGone$default(deliveryOrderView.getSubtitleTextView(), item.getSubtitle(), null, 2, null);
        deliveryOrderView.getSubtitleTextView().setOnTouchListener(this.touchListener);
        bindCitiesView(item.getCities());
        CellView inputCellView = deliveryOrderView.getInputCellView();
        InputDTO input = item.getInput();
        CellHolderKt.bindOrGone(inputCellView, input != null ? input.getCell() : null, this.actionHandler);
        GroupButtonsView groupButtonsView = deliveryOrderView.getGroupButtonsView();
        GroupButtonsVO buttons = item.getButtons();
        groupButtonsView.bindView(buttons != null ? buttons.getButtons() : null, this.actionHandler);
        resetPadding(deliveryOrderView.getGroupButtonsView());
        deliveryOrderView.getDeliveryInfoView().bindView(item.getCellList(), this.actionHandler);
        deliveryOrderView.getDeliveryInfoView().resetAllPaddings();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryOrderVO item, @NotNull c trackingData, f viewedPond) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((DeliveryOrderViewHolder) item, trackingData, viewedPond);
        CommonControlSettings common = item.getCommon();
        if (common == null || (trackingInfo = common.getTrackingInfo()) == null) {
            return;
        }
        Long valueOf = Long.valueOf(item.getId());
        Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
        t b11 = x.b(trackingInfo, valueOf, null);
        if (b11 != null) {
            m.c(this.tokenizedAnalytics, b11, null);
        }
    }
}
