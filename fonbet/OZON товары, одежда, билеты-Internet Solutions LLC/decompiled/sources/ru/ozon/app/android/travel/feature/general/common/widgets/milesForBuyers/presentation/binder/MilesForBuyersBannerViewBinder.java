package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder;

import android.content.Context;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.util.MilesForBuyersViewUtilsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view.MilesForBuyersView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014j\u0002`\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/MilesForBuyersBannerViewBinder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "view", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;)V", "dp14", "", "dp16", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "prepareViewLayout", "", "bind", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "hideViews", "updateConstraints", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersBannerViewBinder implements BaseMilesForBuyersViewBinder {
    private final int dp14;
    private final int dp16;

    @NotNull
    private final MilesForBuyersView view;

    public MilesForBuyersBannerViewBinder(@NotNull MilesForBuyersView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
        this.dp14 = ResourceExtKt.toPx(14, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "<get-context>(...)");
        this.dp16 = ResourceExtKt.toPx(16, context2);
    }

    private final Context getContext() {
        return this.view.getContext();
    }

    private final void hideViews() {
        MilesForBuyersView milesForBuyersView = this.view;
        ViewExtKt.gone(milesForBuyersView.getSubtitleTav());
        ViewExtKt.gone(milesForBuyersView.getSubtitleBadgeBv());
        ViewExtKt.gone(milesForBuyersView.getProgressView());
        ViewExtKt.gone(milesForBuyersView.getDescriptionTav());
        ViewExtKt.gone(milesForBuyersView.getBackgroundView());
    }

    private final void updateConstraints() {
        MilesForBuyersView milesForBuyersView = this.view;
        ConstraintLayoutExtensionsKt.clearConstraints(milesForBuyersView);
        d dVar = new d();
        dVar.p(milesForBuyersView);
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getBackgroundImageIv());
        ConstraintLayoutExtensionsKt.topToParent(dVar, milesForBuyersView.getBackgroundImageIv());
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getBackgroundImageIv());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, milesForBuyersView.getBackgroundImageIv());
        ConstraintLayoutExtensionsKt.topToParent(dVar, milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getTitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.topToParent(dVar, milesForBuyersView.getTitleTav(), this.dp14);
        ConstraintLayoutExtensionsKt.endToStart(dVar, milesForBuyersView.getTitleTav(), milesForBuyersView.getImageIv());
        dVar.Z(milesForBuyersView.getTitleTav().getId(), 7, this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getButtonBv(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getButtonBv(), milesForBuyersView.getTitleTav(), this.dp14);
        ConstraintLayoutExtensionsKt.endToStart(dVar, milesForBuyersView.getButtonBv(), milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, milesForBuyersView.getButtonBv(), this.dp16);
        dVar.f0(1.0f, milesForBuyersView.getButtonBv().getId());
        dVar.Z(milesForBuyersView.getButtonBv().getId(), 7, this.dp16);
        dVar.f(milesForBuyersView);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void bind(@NotNull MilesForBuyersVO.State state, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        MilesForBuyersView milesForBuyersView = this.view;
        if (state instanceof MilesForBuyersVO.State.BannerState) {
            milesForBuyersView.setBackground(null);
            milesForBuyersView.setForeground(null);
            MilesForBuyersVO.State.BannerState bannerState = (MilesForBuyersVO.State.BannerState) state;
            ImageHolderKt.bindOrGone$default(milesForBuyersView.getBackgroundImageIv(), bannerState.getBackgroundImage(), null, 2, null);
            TextHolderKt.bindOrGone$default(milesForBuyersView.getTitleTav(), bannerState.getTitle(), null, 2, null);
            MilesForBuyersViewUtilsKt.undoMovementMethod(milesForBuyersView.getTitleTav());
            ButtonV3HolderKt.bindOrGone(milesForBuyersView.getButtonBv(), bannerState.getActionButton(), onAction);
            MilesForBuyersViewUtilsKt.bindOrGoneAccordingToFontScale(milesForBuyersView.getImageIv(), bannerState.getRightImage(), milesForBuyersView.getFontScale());
        }
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void onViewCompletelyVisible() {
        BaseMilesForBuyersViewBinder.DefaultImpls.onViewCompletelyVisible(this);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void onViewDetached() {
        BaseMilesForBuyersViewBinder.DefaultImpls.onViewDetached(this);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void prepareViewLayout() {
        updateConstraints();
        hideViews();
    }
}
