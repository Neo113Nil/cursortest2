package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons;

import Bl.b;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.animations.ShowDirection;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.animations.SlideAnimationController;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.onboarding.HotelsMapInfoOnboardingBinder;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/ControlPanelBinder;", "", "Landroid/view/ViewGroup;", "container", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/onboarding/HotelsMapInfoOnboardingBinder;", "onboardingBinder", "<init>", "(Landroid/view/ViewGroup;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/onboarding/HotelsMapInfoOnboardingBinder;)V", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "provideConstraintLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "Landroid/widget/FrameLayout$LayoutParams;", "provideFrameLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "panel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bindOrGone", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;Lkotlin/jvm/functions/Function1;)V", "", "offset", "updateTopMargin", "(I)V", "", "isVisible", "togglePanel", "(Z)V", "onStop", "()V", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/onboarding/HotelsMapInfoOnboardingBinder;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/SlideAnimationController;", "panelController", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/SlideAnimationController;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ControlPanelBinder {

    @NotNull
    private final CellView cellView;

    @NotNull
    private final ViewGroup container;
    private final Context context;
    private OnBoardingDTO onboarding;

    @NotNull
    private final HotelsMapInfoOnboardingBinder onboardingBinder;

    @NotNull
    private final SlideAnimationController panelController;

    public ControlPanelBinder(@NotNull ViewGroup container, @NotNull HotelsMapInfoOnboardingBinder onboardingBinder) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onboardingBinder, "onboardingBinder");
        this.container = container;
        this.onboardingBinder = onboardingBinder;
        Context context = container.getContext();
        this.context = context;
        CellView cellView = (CellView) b.a(CellView.class, "type", q.f64554a, null);
        if (cellView == null) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        }
        cellView.setLayoutParams(container instanceof ConstraintLayout ? provideConstraintLayoutParams() : provideFrameLayoutParams());
        cellView.setVisibility(8);
        Context context2 = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        cellView.setElevation(ResourceExtKt.toPxF(16, context2));
        container.addView(cellView);
        this.cellView = cellView;
        this.panelController = new SlideAnimationController(cellView, ShowDirection.DOWN);
    }

    private final ConstraintLayout.b provideConstraintLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = UiExtKt.toPx(8, context);
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        bVar.setMarginStart(UiExtKt.toPx(16, context2));
        return bVar;
    }

    private final FrameLayout.LayoutParams provideFrameLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        layoutParams.topMargin = UiExtKt.toPx(8, context);
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        layoutParams.setMarginStart(UiExtKt.toPx(16, context2));
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public final void bindOrGone(DistrictsVO.PolygonControlPanel panel, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onboarding = panel != null ? panel.getOnboardingApp() : null;
        if ((panel != null ? panel.getPanel() : null) == null) {
            this.cellView.setVisibility(8);
        } else {
            CellHolderKt.bind(this.cellView, panel.getPanel(), onAction);
        }
    }

    public final void onStop() {
        this.panelController.cancelAnimation();
        this.onboardingBinder.onStop();
    }

    public final void togglePanel(boolean isVisible) {
        this.panelController.toggleView(isVisible, new ControlPanelBinder$togglePanel$1(isVisible, this));
    }

    public final void updateTopMargin(int offset) {
        CellView cellView = this.cellView;
        ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = offset;
        cellView.setLayoutParams(marginLayoutParams);
    }
}
