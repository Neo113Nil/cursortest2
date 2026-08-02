package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.adapter;

import Ey.ViewOnClickListenerC2975b;
import WZ.l;
import WZ.t;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpGradientCouponView;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u001fBC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/adapter/PdpCouponListV2ItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpGradientCouponView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "", "onHighlightClick", "onCouponApplyClick", "<init>", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpGradientCouponView;LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;)V", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpGradientCouponView;", "getContainerView", "()Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpGradientCouponView;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "currentItem", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "", "isSmallScreen", "Z", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpCouponListV2ItemViewHolder extends j {

    @NotNull
    private final PdpGradientCouponView containerView;
    private PdpCouponItemListV2VO currentItem;
    private final boolean isSmallScreen;

    @NotNull
    private final Function1<PdpCouponItemListV2VO, Unit> onCouponApplyClick;

    @NotNull
    private final Function1<PdpCouponItemListV2VO, Unit> onHighlightClick;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdpCouponListV2ItemViewHolder(@NotNull PdpGradientCouponView containerView, @NotNull l tokenizedAnalytics, @NotNull Function1<? super PdpCouponItemListV2VO, Unit> onHighlightClick, @NotNull Function1<? super PdpCouponItemListV2VO, Unit> onCouponApplyClick) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onHighlightClick, "onHighlightClick");
        Intrinsics.checkNotNullParameter(onCouponApplyClick, "onCouponApplyClick");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onHighlightClick = onHighlightClick;
        this.onCouponApplyClick = onCouponApplyClick;
        this.isSmallScreen = getContainerView().getContext().getResources().getConfiguration().smallestScreenWidthDp < 375;
        PdpGradientCouponView containerView2 = getContainerView();
        containerView2.setOnClickListener(new ViewOnClickListenerC2975b(this, 3));
        containerView2.setCouponApplyClickListener(new PdpCouponListV2ItemViewHolder$1$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(PdpCouponListV2ItemViewHolder pdpCouponListV2ItemViewHolder, View view) {
        PdpCouponItemListV2VO pdpCouponItemListV2VO = pdpCouponListV2ItemViewHolder.currentItem;
        if (pdpCouponItemListV2VO != null) {
            t tokenizedEvent = pdpCouponItemListV2VO.getPromocode().getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(pdpCouponListV2ItemViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
            pdpCouponListV2ItemViewHolder.onHighlightClick.invoke(pdpCouponItemListV2VO);
        }
    }

    public final void bind(@NotNull PdpCouponItemListV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentItem = item;
        PdpGradientCouponView containerView = getContainerView();
        containerView.bindCodeText(item.getCouponText().getPrimaryText());
        containerView.bindSubtitleText(item.getCouponText().getSecondaryText());
        containerView.bindApplyText(item.getPromocode().getApplyText());
        containerView.bindAppliedColor(item.getPromocode().getAppliedColor());
        containerView.setGradient(item.getGradient().getStartColor(), item.getGradient().getEndColor());
        containerView.setApplied(item.getPromocode().getIsApplied());
        containerView.updateRightTextSize(this.isSmallScreen, containerView.getIsApplied());
        containerView.updateLeftTextMargins(this.isSmallScreen, containerView.getIsApplied());
    }

    @NotNull
    public PdpGradientCouponView getContainerView() {
        return this.containerView;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        PdpCouponItemListV2VO pdpCouponItemListV2VO = this.currentItem;
        if (pdpCouponItemListV2VO == null || (tokenizedEvent = pdpCouponItemListV2VO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
