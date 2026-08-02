package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder;

import W10.c;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadder;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderView;", "progressLadderView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "sellerActionPreviewProgressLadderViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderView;LWZ/l;Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadder;Ll20/d;)V", "onViewOutOfVisibleBounds", "()V", "onViewInVisibleBounds", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadder;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderView;", "LWZ/l;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerActionPreviewProgressLadderViewHolder extends k<SellerActionsPreviewVO.ProgressLadder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SellerActionPreviewProgressLadderView progressLadderView;

    @NotNull
    private final SellerActionPreviewProgressLadderViewModel sellerActionPreviewProgressLadderViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionPreviewProgressLadderViewHolder(@NotNull SellerActionPreviewProgressLadderView progressLadderView, @NotNull l tokenizedAnalytics, @NotNull SellerActionPreviewProgressLadderViewModel sellerActionPreviewProgressLadderViewModel, @NotNull ComposerReferences composerReferences) {
        super(progressLadderView);
        Intrinsics.checkNotNullParameter(progressLadderView, "progressLadderView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(sellerActionPreviewProgressLadderViewModel, "sellerActionPreviewProgressLadderViewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.progressLadderView = progressLadderView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.sellerActionPreviewProgressLadderViewModel = sellerActionPreviewProgressLadderViewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.sellerActionPreviewProgressLadderViewModel.setVisibilityOnScreen(SellerActionPreviewProgressLadderViewModel.State.Shown.INSTANCE);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.sellerActionPreviewProgressLadderViewModel.setVisibilityOnScreen(SellerActionPreviewProgressLadderViewModel.State.Hidden.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerActionsPreviewVO.ProgressLadder item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.progressLadderView.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SellerActionsPreviewVO.ProgressLadder item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
