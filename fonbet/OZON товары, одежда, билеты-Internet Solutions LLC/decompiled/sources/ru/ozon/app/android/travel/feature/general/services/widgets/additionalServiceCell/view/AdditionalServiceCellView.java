package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.view;

import Bi.b;
import Lc.a;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.presentation.AdditionalServiceCellVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u00100\u001a\u00020-2\u0006\u00101\u001a\u0002022\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+J\u0012\u00103\u001a\u00020-2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u00020-H\u0002J\b\u00107\u001a\u00020-H\u0002J$\u00108\u001a\u00020-*\u00020&2\b\b\u0002\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020-0<H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/view/AdditionalServiceCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp1", "dp2", "dp4", "dpf6", "", "dp8", "dp10", "dp12", "dp16", "dp20", "dp60", "dp72", "iconIV", "Lru/ozon/uni/android/atom/icon/IconView;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTAV", "discountBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "subtitlePriceAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "shimmerRSV", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "separatorV", "Landroid/view/View;", "cellButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "cellToggle", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "cellControlBarrier", "Landroidx/constraintlayout/widget/Barrier;", "separatorBarrier", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "cellToggleAction", "cardClickAction", "bind", "content", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;", "bindButton", "control", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "setConstraints", "setupViews", "interceptOnCheckedChange", "throttleTime", "", "onAction", "Lkotlin/Function0;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class AdditionalServiceCellView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private AtomAction cardClickAction;

    @NotNull
    private final ButtonV3View cellButton;

    @NotNull
    private final Barrier cellControlBarrier;

    @NotNull
    private final ToggleView cellToggle;
    private AtomAction cellToggleAction;

    @NotNull
    private final BadgeView discountBadgeView;
    private final int dp1;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp20;
    private final int dp4;
    private final int dp60;
    private final int dp72;
    private final int dp8;
    private final float dpf6;

    @NotNull
    private final IconView iconIV;

    @NotNull
    private final Barrier separatorBarrier;

    @NotNull
    private final View separatorV;

    @NotNull
    private final RoundedShimmerView shimmerRSV;

    @NotNull
    private final PriceAtomView subtitlePriceAV;

    @NotNull
    private final TextAtomV2View subtitleTAV;

    @NotNull
    private final TextAtomV2View titleTAV;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.view.AdditionalServiceCellView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function1 function1;
            AtomAction atomAction = AdditionalServiceCellView.this.cellToggleAction;
            if (atomAction == null || (function1 = AdditionalServiceCellView.this.actionHandler) == null) {
                return;
            }
            function1.invoke(atomAction);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.view.AdditionalServiceCellView$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Function1 function1;
            Intrinsics.checkNotNullParameter(it, "it");
            AtomAction atomAction = AdditionalServiceCellView.this.cardClickAction;
            if (atomAction == null || (function1 = AdditionalServiceCellView.this.actionHandler) == null) {
                return;
            }
            function1.invoke(atomAction);
        }
    }

    public /* synthetic */ AdditionalServiceCellView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindButton(AdditionalServiceCellVO.CellControlVO control) {
        if (control instanceof AdditionalServiceCellVO.CellButtonVO) {
            ButtonV3HolderKt.bind(this.cellButton, ((AdditionalServiceCellVO.CellButtonVO) control).getButton(), this.actionHandler);
            ViewExtKt.gone(this.cellToggle);
            this.cellToggleAction = null;
        } else {
            if (control instanceof AdditionalServiceCellVO.CellToggleVO) {
                ViewExtKt.gone(this.cellButton);
                AdditionalServiceCellVO.CellToggleVO cellToggleVO = (AdditionalServiceCellVO.CellToggleVO) control;
                ToggleHolderKt.bind(this.cellToggle, cellToggleVO.getToggle(), this.actionHandler);
                this.cellToggleAction = cellToggleVO.getSwitchAction();
                return;
            }
            if (control != null) {
                throw new o();
            }
            ViewExtKt.gone(this.cellButton);
            ViewExtKt.gone(this.cellToggle);
        }
    }

    private final void interceptOnCheckedChange(ToggleView toggleView, final long j11, final Function0<Unit> function0) {
        toggleView.setOnTouchListener(new View.OnTouchListener() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.view.AdditionalServiceCellView$interceptOnCheckedChange$1
            private long lastClickTime;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent event) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(event, "event");
                if (SystemClock.elapsedRealtime() - this.lastClickTime < j11) {
                    return true;
                }
                if (event.getAction() != 1) {
                    return false;
                }
                this.lastClickTime = SystemClock.elapsedRealtime();
                function0.invoke();
                return true;
            }
        });
    }

    static /* synthetic */ void interceptOnCheckedChange$default(AdditionalServiceCellView additionalServiceCellView, ToggleView toggleView, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 600;
        }
        additionalServiceCellView.interceptOnCheckedChange(toggleView, j11, function0);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AdditionalServiceCellView$setConstraints$1(this));
    }

    private final void setupViews() {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setBackground(shapeDrawable);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context2, R$attr.bgActionSecondary), this.dp8));
    }

    public final void bind(@NotNull AdditionalServiceCellVO.Content content, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        IconHolderKt.bind$default(this.iconIV, content.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleTAV, content.getTitle(), null, 2, null);
        if (content.getShowSkeleton()) {
            ViewExtKt.gone(this.subtitleTAV);
        } else {
            TextHolderKt.bindOrGone$default(this.subtitleTAV, content.getSubtitle(), null, 2, null);
        }
        PriceAtomHolderKt.bindOrGone$default(this.subtitlePriceAV, content.getSubtitlePrice(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.discountBadgeView, content.getDiscountBadge(), (Function1) null, 2, (Object) null);
        this.shimmerRSV.setVisibility(content.getFetchState() || content.getShowSkeleton() ? 0 : 8);
        this.separatorV.setVisibility(content.getIsSeparatorVisible() ? 0 : 8);
        if (content.getIsSeparatorVisible()) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.dp10);
        }
        bindButton(content.getCellControl());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServiceCellView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TextAtomV2View textAtomV2View;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        float pxF = ResourceExtKt.toPxF(6, context);
        this.dpf6 = pxF;
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        int px2 = ResourceExtKt.toPx(20, context);
        this.dp20 = px2;
        int px3 = ResourceExtKt.toPx(60, context);
        this.dp60 = px3;
        this.dp72 = ResourceExtKt.toPx(72, context);
        q qVar = q.f64554a;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        IconView iconView2 = iconView == null ? new IconView(context, null, 0, 6, null) : iconView;
        iconView2.setId(R$id.additionalServiceCellIcon);
        iconView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconView2);
        this.iconIV = iconView2;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g10;
        a.d(textAtomV2View2, R$id.additionalServiceCellTitle, 0, -2, false);
        addView(g10);
        this.titleTAV = textAtomV2View2;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) g11;
        ConstraintLayout.b d11 = b.d(textAtomV2View3, R$id.additionalServiceCellSubtitle, -2, -2);
        d11.f41616W = true;
        textAtomV2View3.setLayoutParams(d11);
        textAtomV2View3.setTextIsSelectable(false);
        addView(g11);
        this.subtitleTAV = textAtomV2View3;
        View g12 = qVar.g(N.b(BadgeView.class), context);
        BadgeView badgeView = (BadgeView) g12;
        Im.a.c(badgeView, R$id.additionalServiceCellBadge, -2, -2);
        addView(g12);
        this.discountBadgeView = badgeView;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        if (priceAtomView == null) {
            textAtomV2View = textAtomV2View3;
            priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        } else {
            textAtomV2View = textAtomV2View3;
        }
        priceAtomView.setId(R$id.additionalServiceCellSubtitlePrice);
        priceAtomView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(priceAtomView);
        this.subtitlePriceAV = priceAtomView;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(R$id.additionalServiceCellShimmer);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px3, px2));
        roundedShimmerView.setCornerRadius(pxF);
        addView(roundedShimmerView);
        this.shimmerRSV = roundedShimmerView;
        View view = new View(context);
        view.setId(R$id.additionalServiceCellSeparator);
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        view.setBackground(shapeDrawable);
        addView(view);
        this.separatorV = view;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        ButtonV3View buttonV3View2 = buttonV3View == null ? new ButtonV3View(context, null, 0, 0, 14, null) : buttonV3View;
        buttonV3View2.setId(R$id.additionalServiceCellButton);
        buttonV3View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(buttonV3View2);
        this.cellButton = buttonV3View2;
        ToggleView toggleView = (ToggleView) qVar.i(N.b(ToggleView.class), context);
        toggleView = toggleView == null ? new ToggleView(context, null, 0, 6, null) : toggleView;
        toggleView.setId(R$id.additionalServiceCellToggle);
        toggleView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(toggleView);
        this.cellToggle = toggleView;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.additionalServiceCellControlBarrier);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.f(0);
        barrier.setReferencedIds(new int[]{buttonV3View2.getId(), toggleView.getId()});
        addView(barrier);
        this.cellControlBarrier = barrier;
        Barrier barrier2 = new Barrier(context);
        barrier2.setId(R$id.additionalServiceCellSeparatorBarrier);
        barrier2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier2.f(3);
        barrier2.setReferencedIds(new int[]{iconView2.getId(), textAtomV2View.getId()});
        addView(barrier2);
        this.separatorBarrier = barrier2;
        setConstraints();
        setupViews();
        interceptOnCheckedChange$default(this, toggleView, 0L, new AnonymousClass1(), 1, null);
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setOnClickListenerThrottle$default(this, 0L, new AnonymousClass2(), 1, null);
    }
}
