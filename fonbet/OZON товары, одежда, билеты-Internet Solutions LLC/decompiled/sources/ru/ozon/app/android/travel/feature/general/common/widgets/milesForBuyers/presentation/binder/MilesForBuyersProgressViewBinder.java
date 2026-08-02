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
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.travel.molecules.view.progressView.TravelHorizontalProgressView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017j\u0002`\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\u0016\u0010 \u001a\u00020!*\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/MilesForBuyersProgressViewBinder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "view", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;)V", "dp2", "", "dp4", "dp8", "dp16", "backgroundColor", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "prepareViewLayout", "", "bind", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "hideViews", "bindProgressBar", "Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;", "progress", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;", "updateConstraints", "applyColors", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "borderColorToken", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersProgressViewBinder implements BaseMilesForBuyersViewBinder {
    private final int backgroundColor;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final MilesForBuyersView view;

    public MilesForBuyersProgressViewBinder(@NotNull MilesForBuyersView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
        this.dp2 = ResourceExtKt.toPx(2, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "<get-context>(...)");
        this.dp4 = ResourceExtKt.toPx(4, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "<get-context>(...)");
        this.dp8 = ResourceExtKt.toPx(8, context3);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "<get-context>(...)");
        this.dp16 = ResourceExtKt.toPx(16, context4);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "<get-context>(...)");
        this.backgroundColor = ThemeExtKt.themeColor(context5, R$attr.layerFloor1);
    }

    private final ShapeDrawableWithBorder applyColors(ShapeDrawableWithBorder shapeDrawableWithBorder, String str) {
        ShapeDrawableWithBorder.setBorderColor$default(shapeDrawableWithBorder, str, 0, 2, null);
        shapeDrawableWithBorder.invalidateSelf();
        return shapeDrawableWithBorder;
    }

    private final TravelHorizontalProgressView bindProgressBar(MilesForBuyersVO.State.ProgressState.Progress progress) {
        String backgroundColor;
        TravelHorizontalProgressView progressView = this.view.getProgressView();
        ViewExtKt.show(progressView);
        progressView.setText(progress.getProgressBar().getText());
        progressView.setProgress(progress.getProgressBar().getPercent());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = progressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressView.setFillColor(styleParser.parseColor(context, progress.getProgressBar().getProgressBarColor()));
        Context context2 = progressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!ThemeExtKt.isDarkThemeActive(context2) || (backgroundColor = progress.getDarkBackgroundColor()) == null) {
            backgroundColor = progress.getBackgroundColor();
        }
        Context context3 = progressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        progressView.setBarColor(styleParser.parseColor(context3, backgroundColor));
        return progressView;
    }

    private final Context getContext() {
        return this.view.getContext();
    }

    private final void hideViews() {
        MilesForBuyersView milesForBuyersView = this.view;
        ViewExtKt.gone(milesForBuyersView.getBackgroundImageIv());
        ViewExtKt.gone(milesForBuyersView.getBackgroundView());
        ViewExtKt.gone(milesForBuyersView.getButtonBv());
    }

    private final void updateConstraints() {
        MilesForBuyersView milesForBuyersView = this.view;
        ConstraintLayoutExtensionsKt.clearConstraints(milesForBuyersView);
        d dVar = new d();
        dVar.p(milesForBuyersView);
        ConstraintLayoutExtensionsKt.topToParent(dVar, milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getTitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.topToParent(dVar, milesForBuyersView.getTitleTav(), this.dp8);
        ConstraintLayoutExtensionsKt.endToStart(dVar, milesForBuyersView.getTitleTav(), milesForBuyersView.getImageIv());
        dVar.Z(milesForBuyersView.getTitleTav().getId(), 7, this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getSubtitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getSubtitleTav(), milesForBuyersView.getTitleTav(), this.dp2);
        ConstraintLayoutExtensionsKt.endToStart(dVar, milesForBuyersView.getSubtitleTav(), milesForBuyersView.getSubtitleBadgeBv());
        dVar.Z(milesForBuyersView.getSubtitleTav().getId(), 7, this.dp16);
        dVar.c0(0.0f, milesForBuyersView.getSubtitleTav().getId());
        dVar.d0(milesForBuyersView.getSubtitleTav().getId(), 2);
        dVar.C(milesForBuyersView.getSubtitleTav().getId(), true);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, milesForBuyersView.getSubtitleBadgeBv(), milesForBuyersView.getSubtitleTav());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getSubtitleBadgeBv(), milesForBuyersView.getTitleTav(), this.dp2);
        ConstraintLayoutExtensionsKt.endToStart(dVar, milesForBuyersView.getSubtitleBadgeBv(), milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.startToEnd(dVar, milesForBuyersView.getSubtitleBadgeBv(), milesForBuyersView.getSubtitleTav());
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getProgressView(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getProgressView(), milesForBuyersView.getSubtitleTav(), this.dp8);
        ConstraintLayoutExtensionsKt.endToStart(dVar, milesForBuyersView.getProgressView(), milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, milesForBuyersView.getProgressView(), milesForBuyersView.getDescriptionTav(), this.dp2);
        dVar.f0(1.0f, milesForBuyersView.getProgressView().getId());
        dVar.Z(milesForBuyersView.getProgressView().getId(), 4, this.dp8);
        dVar.Z(milesForBuyersView.getProgressView().getId(), 7, this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getDescriptionTav(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getDescriptionTav(), milesForBuyersView.getProgressView(), this.dp2);
        ConstraintLayoutExtensionsKt.endToStart(dVar, milesForBuyersView.getDescriptionTav(), milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, milesForBuyersView.getDescriptionTav(), this.dp4);
        dVar.f0(1.0f, milesForBuyersView.getDescriptionTav().getId());
        dVar.Z(milesForBuyersView.getDescriptionTav().getId(), 7, this.dp16);
        dVar.f(milesForBuyersView);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void bind(@NotNull MilesForBuyersVO.State state, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        MilesForBuyersView milesForBuyersView = this.view;
        if (state instanceof MilesForBuyersVO.State.ProgressState) {
            milesForBuyersView.setBackgroundColor(this.backgroundColor);
            MilesForBuyersVO.State.ProgressState progressState = (MilesForBuyersVO.State.ProgressState) state;
            milesForBuyersView.setForeground(applyColors(milesForBuyersView.getForegroundDrawable(), progressState.getBorderColor()));
            TextHolderKt.bindOrGone$default(milesForBuyersView.getTitleTav(), progressState.getTitle(), null, 2, null);
            MilesForBuyersViewUtilsKt.undoMovementMethod(milesForBuyersView.getTitleTav());
            TextHolderKt.bindOrGone$default(milesForBuyersView.getSubtitleTav(), progressState.getSubtitle(), null, 2, null);
            MilesForBuyersViewUtilsKt.undoMovementMethod(milesForBuyersView.getSubtitleTav());
            BadgeHolderKt.bindOrGone$default(milesForBuyersView.getSubtitleBadgeBv(), progressState.getSubtitleBadge(), (Function1) null, 2, (Object) null);
            MilesForBuyersViewUtilsKt.bindOrGoneAccordingToFontScale(milesForBuyersView.getImageIv(), progressState.getRightImage(), milesForBuyersView.getFontScale());
            bindProgressBar(progressState.getProgress());
            TextHolderKt.bindOrGone$default(milesForBuyersView.getDescriptionTav(), progressState.getProgressBarDescription(), null, 2, null);
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
