package ru.ozon.app.android.marketing.widgets.stickyLadder.presentation;

import AI.a;
import Ae.C2399j;
import Ae.C2408n0;
import W10.c;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderViewHolder;", "Ld20/a;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "Ll10/i;", "container", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel;", "stickyLadderAsyncViewModel", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "sellerActionPreviewProgressLadderViewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel;Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderView;", "stickyLadderView", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyLadderViewHolder extends AbstractC6064a<StickyLadderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final SellerActionPreviewProgressLadderViewModel sellerActionPreviewProgressLadderViewModel;

    @NotNull
    private final StickyLadderAsyncViewModel stickyLadderAsyncViewModel;

    @NotNull
    private final StickyLadderView stickyLadderView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyLadderViewHolder(@NotNull i container, @NotNull StickyLadderAsyncViewModel stickyLadderAsyncViewModel, @NotNull SellerActionPreviewProgressLadderViewModel sellerActionPreviewProgressLadderViewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(stickyLadderAsyncViewModel, "stickyLadderAsyncViewModel");
        Intrinsics.checkNotNullParameter(sellerActionPreviewProgressLadderViewModel, "sellerActionPreviewProgressLadderViewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.stickyLadderAsyncViewModel = stickyLadderAsyncViewModel;
        this.sellerActionPreviewProgressLadderViewModel = sellerActionPreviewProgressLadderViewModel;
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderView");
        StickyLadderView stickyLadderView = (StickyLadderView) view;
        this.stickyLadderView = stickyLadderView;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        stickyLadderView.setOnTitleClickListener(new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$0(StickyLadderViewHolder stickyLadderViewHolder, View view) {
        CommonControlSettings common;
        AtomAction atomAction;
        StickyLadderVO stickyLadderVO = (StickyLadderVO) stickyLadderViewHolder.getBoundData();
        if (stickyLadderVO == null || (common = stickyLadderVO.getCommon()) == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        stickyLadderViewHolder.actionHandler.invoke(atomAction);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        C2399j.C(new C2408n0(this.sellerActionPreviewProgressLadderViewModel.getLaddersOnScreenVisibilityState(), new StickyLadderViewHolder$onWidgetCreated$1(this, null)), K.a(this));
        this.stickyLadderAsyncViewModel.getWidgetState().observe(this, new StickyLadderViewHolder$sam$androidx_lifecycle_Observer$0(new StickyLadderViewHolder$onWidgetCreated$2(this)));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyLadderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.stickyLadderAsyncViewModel.setData(item.getAsyncData(), item.getId());
        this.stickyLadderView.bind(item);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull StickyLadderVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getCommon().getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), mapToTokenizedEvent$default, null, 2, null);
    }
}
