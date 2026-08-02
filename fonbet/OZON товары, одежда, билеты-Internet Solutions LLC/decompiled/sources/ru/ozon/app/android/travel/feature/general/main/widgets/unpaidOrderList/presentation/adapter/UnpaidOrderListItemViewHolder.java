package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.view.UnpaidOrderListView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012.\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u0004\u0012(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R<\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R6\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/view/UnpaidOrderListView;", "containerView", "Lkotlin/Function3;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "cardClickCallback", "Lkotlin/Function2;", "trackView", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/view/UnpaidOrderListView;Lfd/n;Lkotlin/jvm/functions/Function2;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "item", "", "bindOnlyBadge", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;Z)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/view/UnpaidOrderListView;", "Lfd/n;", "Lkotlin/jvm/functions/Function2;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "", "dp320", "I", "boundedData", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnpaidOrderListItemViewHolder extends j {
    private UnpaidOrderListVO.OrderVO boundedData;

    @NotNull
    private final InterfaceC6511n<AtomAction, Map<String, TokenizedTrackingInfo>, String, Unit> cardClickCallback;

    @NotNull
    private final UnpaidOrderListView containerView;
    private final Context context;
    private final int dp320;

    @NotNull
    private final Function2<Map<String, TokenizedTrackingInfo>, String, Unit> trackView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnpaidOrderListItemViewHolder(@NotNull UnpaidOrderListView containerView, @NotNull InterfaceC6511n<? super AtomAction, ? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> cardClickCallback, @NotNull Function2<? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> trackView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(cardClickCallback, "cardClickCallback");
        Intrinsics.checkNotNullParameter(trackView, "trackView");
        this.containerView = containerView;
        this.cardClickCallback = cardClickCallback;
        this.trackView = trackView;
        Context context = containerView.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.dp320 = ResourceExtKt.toPx(320, context);
    }

    public static /* synthetic */ void bind$default(UnpaidOrderListItemViewHolder unpaidOrderListItemViewHolder, UnpaidOrderListVO.OrderVO orderVO, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        unpaidOrderListItemViewHolder.bind(orderVO, z11);
    }

    public final void bind(@NotNull UnpaidOrderListVO.OrderVO item, boolean bindOnlyBadge) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        if (bindOnlyBadge) {
            this.containerView.bindBadge(item.getBadge());
            return;
        }
        this.containerView.bind(item, this.cardClickCallback);
        int i11 = item.getIsWide() ? -1 : this.dp320;
        if (this.containerView.getLayoutParams().width != i11) {
            UnpaidOrderListView unpaidOrderListView = this.containerView;
            ViewGroup.LayoutParams layoutParams = unpaidOrderListView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i11;
            unpaidOrderListView.setLayoutParams(layoutParams);
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        Map<String, TokenizedTrackingInfo> viewTracking;
        super.onViewInVisibleBounds();
        UnpaidOrderListVO.OrderVO orderVO = this.boundedData;
        if (orderVO == null || (viewTracking = orderVO.getViewTracking()) == null) {
            return;
        }
        Function2<Map<String, TokenizedTrackingInfo>, String, Unit> function2 = this.trackView;
        UnpaidOrderListVO.OrderVO orderVO2 = this.boundedData;
        function2.invoke(viewTracking, orderVO2 != null ? orderVO2.getFormattedRemainTime() : null);
    }
}
