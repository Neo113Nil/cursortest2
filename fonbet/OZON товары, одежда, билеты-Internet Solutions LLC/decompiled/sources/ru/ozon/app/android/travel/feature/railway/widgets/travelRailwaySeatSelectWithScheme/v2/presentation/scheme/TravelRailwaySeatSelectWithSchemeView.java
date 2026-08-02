package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import Am.C2438a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeController;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeTooltipController;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeView;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tooltip.TooltipWrapper;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.tabs.TabHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004*\u0001@\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;", "controller", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;)V", "", "scrollXValue", "Landroid/graphics/RectF;", "anchorBounds", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;", "tooltip", "", "showTooltip", "(FLandroid/graphics/RectF;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;)V", "addViews", "()V", "setupConstraints", "Landroidx/lifecycle/J;", "lifecycleOwner", "onAttach", "(Landroidx/lifecycle/J;)V", "onDetach", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;Lkotlin/jvm/functions/Function1;)V", "", "dp4", "I", "dp8", "dp16", "Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;", "storeyTabSelector", "Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipWrapper;", "tooltipWrapper", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipWrapper;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeView;", "schemeView", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeView;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "scrollDescriptionTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getScrollDescriptionTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "scrollDescriptionTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "trainDirectionTav$delegate", "getTrainDirectionTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "trainDirectionTav", "Lru/ozon/uni/android/atom/icon/IconView;", "trainDirectionIconIV$delegate", "getTrainDirectionIconIV", "()Lru/ozon/uni/android/atom/icon/IconView;", "trainDirectionIconIV", "cachedActionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeView$tooltipController$1", "tooltipController", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeView$tooltipController$1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectWithSchemeView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelRailwaySeatSelectWithSchemeView.class, "scrollDescriptionTav", "getScrollDescriptionTav()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(TravelRailwaySeatSelectWithSchemeView.class, "trainDirectionTav", "getTrainDirectionTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelRailwaySeatSelectWithSchemeView.class, "trainDirectionIconIV", "getTrainDirectionIconIV()Lru/ozon/uni/android/atom/icon/IconView;", 0)};
    public static final int $stable = 8;
    private Function1<? super AtomAction, Unit> cachedActionHandler;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final TravelRailwaySchemeView schemeView;

    /* renamed from: scrollDescriptionTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate scrollDescriptionTav;

    @NotNull
    private final TabAtomView storeyTabSelector;

    @NotNull
    private final TravelRailwaySeatSelectWithSchemeView$tooltipController$1 tooltipController;

    @NotNull
    private final TooltipWrapper tooltipWrapper;

    /* renamed from: trainDirectionIconIV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate trainDirectionIconIV;

    /* renamed from: trainDirectionTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate trainDirectionTav;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<SeatItemVO, Boolean> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SeatItemVO item) {
            Function1 function1;
            Intrinsics.checkNotNullParameter(item, "item");
            AtomAction action = item.getSeat().getAction();
            if (action != null && (function1 = TravelRailwaySeatSelectWithSchemeView.this.cachedActionHandler) != null) {
                function1.invoke(action);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeView$tooltipController$1, ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeTooltipController] */
    public TravelRailwaySeatSelectWithSchemeView(@NotNull Context context, @NotNull TravelRailwaySchemeController controller) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        TabAtomView tabAtomView = new TabAtomView(context, null, 0, 0, 14, null);
        tabAtomView.setId(R$id.travelRailwaySeatSelectSchemeStoreyTabSelector);
        tabAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.storeyTabSelector = tabAtomView;
        this.tooltipWrapper = new TooltipWrapper(context);
        TravelRailwaySchemeView travelRailwaySchemeView = new TravelRailwaySchemeView(context, controller);
        travelRailwaySchemeView.setId(R$id.travelRailwaySeatSelectSchemeSchemeView);
        travelRailwaySchemeView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.schemeView = travelRailwaySchemeView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.scrollDescriptionTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new TravelRailwaySeatSelectWithSchemeView$special$$inlined$preCreationViewPool$default$1(this), new TravelRailwaySeatSelectWithSchemeView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.trainDirectionTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new TravelRailwaySeatSelectWithSchemeView$special$$inlined$preCreationViewPool$default$3(this), new TravelRailwaySeatSelectWithSchemeView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.trainDirectionIconIV = new PreCreationViewPoolDelegate(context4, N.b(IconView.class), new TravelRailwaySeatSelectWithSchemeView$special$$inlined$preCreationViewPool$default$5(this), new TravelRailwaySeatSelectWithSchemeView$special$$inlined$preCreationViewPool$default$6());
        ?? r102 = new TravelRailwaySchemeTooltipController() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeView$tooltipController$1
            @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeTooltipController
            public void hideTooltip() {
                TooltipWrapper tooltipWrapper;
                tooltipWrapper = TravelRailwaySeatSelectWithSchemeView.this.tooltipWrapper;
                tooltipWrapper.dismiss();
            }

            @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeTooltipController
            public void showTooltip(float scrollX, RectF anchorBounds, TravelRailwaySeatSelectWithSchemeVO.TooltipVO tooltip) {
                Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                TravelRailwaySeatSelectWithSchemeView.this.showTooltip(scrollX, anchorBounds, tooltip);
            }
        };
        this.tooltipController = r102;
        addViews();
        setupConstraints();
        travelRailwaySchemeView.setTooltipController(r102);
        travelRailwaySchemeView.setOnItemClickListener(new AnonymousClass1());
    }

    private final void addViews() {
        addView(this.storeyTabSelector);
        addView(this.schemeView);
        addView(getScrollDescriptionTav());
        addView(getTrainDirectionTav());
        addView(getTrainDirectionIconIV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getScrollDescriptionTav() {
        return (TextAtomView) this.scrollDescriptionTav.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getTrainDirectionIconIV() {
        return (IconView) this.trainDirectionIconIV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTrainDirectionTav() {
        return (TextAtomV2View) this.trainDirectionTav.getValue(this, $$delegatedProperties[1]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new TravelRailwaySeatSelectWithSchemeView$setupConstraints$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTooltip(float scrollXValue, RectF anchorBounds, TravelRailwaySeatSelectWithSchemeVO.TooltipVO tooltip) {
        this.tooltipWrapper.showByCoordinates(tooltip, this.schemeView, (int) (anchorBounds.left - scrollXValue), (int) anchorBounds.top, (int) anchorBounds.width(), (int) anchorBounds.height());
    }

    public final void bind(@NotNull TravelRailwaySeatSelectWithSchemeVO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.cachedActionHandler = actionHandler;
        TabAtomView tabAtomView = this.storeyTabSelector;
        tabAtomView.setVisibility(data.getIsTabSelectorVisible() ? 0 : 8);
        Tabs tabSelector = data.getTabSelector();
        if (tabSelector != null) {
            TabHolderKt.bind(tabAtomView, tabSelector, actionHandler);
        }
        this.schemeView.bind(data.getSchemeVO());
        TextAtomHolderKt.bindOrGone$default(getScrollDescriptionTav(), data.getSchemeScrollDescription(), null, 2, null);
        TextAtomV2View trainDirectionTav = getTrainDirectionTav();
        TravelRailwaySeatSelectWithSchemeVO.TrainDirectionVO trainDirection = data.getTrainDirection();
        TextHolderKt.bindOrGone$default(trainDirectionTav, trainDirection != null ? trainDirection.getDescription() : null, null, 2, null);
        IconView trainDirectionIconIV = getTrainDirectionIconIV();
        TravelRailwaySeatSelectWithSchemeVO.TrainDirectionVO trainDirection2 = data.getTrainDirection();
        IconHolderKt.bindOrGone$default(trainDirectionIconIV, trainDirection2 != null ? trainDirection2.getIcon() : null, null, 2, null);
    }

    public final void onAttach(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        lifecycleOwner.getLifecycle().a(this.tooltipWrapper);
    }

    public final void onDetach(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        lifecycleOwner.getLifecycle().e(this.tooltipWrapper);
    }
}
