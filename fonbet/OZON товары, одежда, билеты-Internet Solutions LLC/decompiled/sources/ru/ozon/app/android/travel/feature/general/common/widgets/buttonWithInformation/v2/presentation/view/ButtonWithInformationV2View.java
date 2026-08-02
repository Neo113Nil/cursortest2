package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.view;

import Am.C2438a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import iF.RunnableC7028a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010*\u001a\u0004\bD\u0010ER\u001b\u0010I\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010*\u001a\u0004\bH\u0010E¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/presentation/view/ButtonWithInformationV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "placeViews", "()V", "onDetachedFromWindow", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/presentation/ButtonWithInformationV2VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/presentation/ButtonWithInformationV2VO;Lkotlin/jvm/functions/Function1;)V", "", "showLargeButton", "", "duration", "animateState", "(ZLjava/lang/Long;)V", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "", "Landroid/view/View;", "smallViews$delegate", "LSc/j;", "getSmallViews", "()Ljava/util/List;", "smallViews", "largeViews$delegate", "getLargeViews", "largeViews", "Landroid/graphics/drawable/Drawable;", "containerBackground", "Landroid/graphics/drawable/Drawable;", "Lru/ozon/uni/android/cell/CellView;", "cellView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView$delegate", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "contentBackgroundView", "Landroid/view/View;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView$delegate", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView$delegate", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Landroidx/constraintlayout/widget/Guideline;", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "smallButtonView$delegate", "getSmallButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "smallButtonView", "largeButtonView$delegate", "getLargeButtonView", "largeButtonView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWithInformationV2View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(ButtonWithInformationV2View.class, "cellView", "getCellView()Lru/ozon/uni/android/cell/CellView;", 0), C2438a.c(ButtonWithInformationV2View.class, "badgeView", "getBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(ButtonWithInformationV2View.class, "titleView", "getTitleView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ButtonWithInformationV2View.class, "priceView", "getPriceView()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(ButtonWithInformationV2View.class, "smallButtonView", "getSmallButtonView()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0), C2438a.c(ButtonWithInformationV2View.class, "largeButtonView", "getLargeButtonView()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable = 8;

    /* renamed from: badgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badgeView;

    /* renamed from: cellView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate cellView;

    @NotNull
    private final Drawable containerBackground;

    @NotNull
    private final View contentBackgroundView;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final Guideline guideline;

    /* renamed from: largeButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate largeButtonView;

    /* renamed from: largeViews$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j largeViews;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceView;

    /* renamed from: smallButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate smallButtonView;

    /* renamed from: smallViews$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j smallViews;

    /* renamed from: titleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithInformationV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.smallViews = LazyUtilsKt.unsafeLazy(new ButtonWithInformationV2View$smallViews$2(this));
        this.largeViews = LazyUtilsKt.unsafeLazy(new ButtonWithInformationV2View$largeViews$2(this));
        Drawable produceBottomContainerBackground = new RoundedBackgroundProducer().produceBottomContainerBackground(dimens$default.getRadius20(), -dimens$default.getMargin2(), UiExtKt.toPx(1, context), ThemeExtKt.themeColor(context, R$attr.layerFloor1), context.getColor(R$color.graphic_stroke_sticky));
        this.containerBackground = produceBottomContainerBackground;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.cellView = new PreCreationViewPoolDelegate(context2, N.b(CellView.class), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$1(this), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.badgeView = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$3(this), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$4());
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        view.setBackground(produceBottomContainerBackground);
        this.contentBackgroundView = view;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.titleView = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$5(this), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.priceView = new PreCreationViewPoolDelegate(context5, N.b(PriceAtomView.class), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$7(this), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$8());
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, 0);
        bVar.f41615V = 1;
        bVar.f41624c = 0.4f;
        guideline.setLayoutParams(bVar);
        this.guideline = guideline;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.smallButtonView = new PreCreationViewPoolDelegate(context6, N.b(ButtonV3View.class), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$9(this), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$10());
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.largeButtonView = new PreCreationViewPoolDelegate(context7, N.b(ButtonV3View.class), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$11(this), new ButtonWithInformationV2View$special$$inlined$preCreationViewPool$default$12());
        placeViews();
    }

    private final BadgeView getBadgeView() {
        return (BadgeView) this.badgeView.getValue(this, $$delegatedProperties[1]);
    }

    private final CellView getCellView() {
        return (CellView) this.cellView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getLargeButtonView() {
        return (ButtonV3View) this.largeButtonView.getValue(this, $$delegatedProperties[5]);
    }

    private final List<View> getLargeViews() {
        return (List) this.largeViews.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getPriceView() {
        return (PriceAtomView) this.priceView.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getSmallButtonView() {
        return (ButtonV3View) this.smallButtonView.getValue(this, $$delegatedProperties[4]);
    }

    private final List<View> getSmallViews() {
        return (List) this.smallViews.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleView() {
        return (TextAtomV2View) this.titleView.getValue(this, $$delegatedProperties[2]);
    }

    private final void placeViews() {
        addView(this.contentBackgroundView);
        addView(getCellView());
        addView(getBadgeView());
        addView(getTitleView());
        addView(getPriceView());
        addView(this.guideline);
        addView(getSmallButtonView());
        addView(getLargeButtonView());
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getCellView());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getCellView(), this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getCellView(), this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getCellView(), getBadgeView(), this.dsProvider.getMargin2());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getBadgeView(), getCellView());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getBadgeView(), this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getBadgeView(), this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getBadgeView(), this.contentBackgroundView, this.dsProvider.getMargin2());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.contentBackgroundView, getBadgeView());
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.contentBackgroundView);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.contentBackgroundView);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.contentBackgroundView);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getTitleView(), this.contentBackgroundView, this.dsProvider.getMargin16());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTitleView(), this.dsProvider.getMargin16());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getTitleView(), getSmallButtonView(), this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getTitleView(), getPriceView(), this.dsProvider.getMargin4());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getPriceView(), getTitleView());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getPriceView(), this.dsProvider.getMargin16());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getPriceView(), getSmallButtonView(), this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getPriceView(), this.contentBackgroundView, this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getSmallButtonView(), this.contentBackgroundView);
        ConstraintLayoutExtensionsKt.startToStart(dVar, getSmallButtonView(), this.guideline);
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getSmallButtonView(), this.contentBackgroundView, this.dsProvider.getMargin16());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getSmallButtonView(), this.contentBackgroundView);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getLargeButtonView(), this.contentBackgroundView, this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getLargeButtonView(), this.contentBackgroundView, this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getLargeButtonView(), this.contentBackgroundView, this.dsProvider.getMargin8());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getLargeButtonView(), this.contentBackgroundView, this.dsProvider.getMargin8());
        dVar.f(this);
    }

    public final void animateState(boolean showLargeButton, Long duration) {
        List<View> smallViews;
        List<View> largeViews;
        if (showLargeButton) {
            smallViews = getLargeViews();
            largeViews = getSmallViews();
        } else {
            smallViews = getSmallViews();
            largeViews = getLargeViews();
        }
        Iterator<T> it = largeViews.iterator();
        while (true) {
            long j11 = 500;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            view.animate().cancel();
            ViewPropertyAnimator alpha = view.animate().alpha(0.0f);
            if (duration != null) {
                j11 = duration.longValue();
            }
            alpha.setDuration(j11).withEndAction(new RunnableC7028a(view, 1)).start();
        }
        for (View view2 : smallViews) {
            view2.animate().cancel();
            if (view2.getVisibility() != 0) {
                view2.setAlpha(0.0f);
                view2.setVisibility(0);
            }
            view2.animate().alpha(1.0f).setDuration(duration != null ? duration.longValue() : 500L).start();
        }
    }

    public final void bind(@NotNull ButtonWithInformationV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellHolderKt.bindOrGone(getCellView(), item.getCell(), actionHandler);
        BadgeHolderKt.bindOrGone(getBadgeView(), item.getBadge(), actionHandler);
        TextHolderKt.bind$default(getTitleView(), item.getTitle(), null, 2, null);
        PriceAtomHolderKt.bind$default(getPriceView(), item.getPrice(), null, 2, null);
        ButtonV3HolderKt.bind(getSmallButtonView(), item.getSmallButton(), actionHandler);
        ButtonV3HolderKt.bind(getLargeButtonView(), item.getLargeButton(), actionHandler);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Iterator<T> it = getSmallViews().iterator();
        while (it.hasNext()) {
            ((View) it.next()).animate().cancel();
        }
        Iterator<T> it2 = getLargeViews().iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).animate().cancel();
        }
        super.onDetachedFromWindow();
    }
}
