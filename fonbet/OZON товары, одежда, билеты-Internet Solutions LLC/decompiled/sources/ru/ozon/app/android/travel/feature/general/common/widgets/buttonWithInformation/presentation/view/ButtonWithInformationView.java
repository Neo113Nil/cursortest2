package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.presentation.view;

import Am.C2438a;
import D40.a;
import Sc.o;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.ButtonWithInformationVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000f\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010 \u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/presentation/view/ButtonWithInformationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setConstraints", "Landroidx/constraintlayout/widget/d;", "Landroid/view/View;", "leftView", "", "constrainWidth", "setupButtonConstraints", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;I)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO$ButtonWidthVO;", "lastButtonWidth", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO$ButtonWidthVO;", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dimens", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "Lru/ozon/uni/android/cell/CellView;", "notificationCV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getNotificationCV", "()Lru/ozon/uni/android/cell/CellView;", "notificationCV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "topBadgeBV$delegate", "getTopBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "topBadgeBV", "contentBgV", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTAV$delegate", "getTitleTAV", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTAV", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "pricePV$delegate", "getPricePV", "()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "pricePV", "Landroidx/constraintlayout/widget/Guideline;", "guidelineG", "Landroidx/constraintlayout/widget/Guideline;", "Landroidx/constraintlayout/widget/Barrier;", "barrierB", "Landroidx/constraintlayout/widget/Barrier;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "actionSA$delegate", "getActionSA", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "actionSA", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWithInformationView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(ButtonWithInformationView.class, "notificationCV", "getNotificationCV()Lru/ozon/uni/android/cell/CellView;", 0), C2438a.c(ButtonWithInformationView.class, "topBadgeBV", "getTopBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(ButtonWithInformationView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(ButtonWithInformationView.class, "pricePV", "getPricePV()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", 0), C2438a.c(ButtonWithInformationView.class, "actionSA", "getActionSA()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", 0)};
    public static final int $stable = 8;

    /* renamed from: actionSA$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate actionSA;

    @NotNull
    private final Barrier barrierB;

    @NotNull
    private final View contentBgV;

    @NotNull
    private final DesignSystemDimensProvider dimens;

    @NotNull
    private final Guideline guidelineG;
    private ButtonWithInformationVO.ButtonWidthVO lastButtonWidth;

    /* renamed from: notificationCV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate notificationCV;

    /* renamed from: pricePV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* renamed from: topBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate topBadgeBV;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonWithInformationVO.ButtonWidthVO.values().length];
            try {
                iArr[ButtonWithInformationVO.ButtonWidthVO.MATCH_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonWithInformationVO.ButtonWidthVO.MATCH_PARENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonWithInformationVO.ButtonWidthVO.WRAP_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithInformationView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dimens = dimens$default;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.notificationCV = new PreCreationViewPoolDelegate(context2, N.b(CellView.class), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$1(this), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.topBadgeBV = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$3(this), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$4());
        View view = new View(context);
        view.setId(R$id.buttonWithInformationContentBackgroundView);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        view.setBackground(RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), dimens$default.getRadius12(), dimens$default.getRadius12(), 0.0f, 0.0f, 24, null));
        this.contentBgV = view;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$5(this), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.pricePV = new PreCreationViewPoolDelegate(context5, N.b(PriceView.class), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$7(this), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$8());
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.buttonWithInformationGuidelineGl, -2, 0);
        a11.f41615V = 1;
        a11.f41624c = 0.52f;
        guideline.setLayoutParams(a11);
        this.guidelineG = guideline;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.buttonWithInformationBarrier);
        barrier.f(1);
        barrier.setReferencedIds(new int[]{getTitleTAV().getId(), getPricePV().getId()});
        this.barrierB = barrier;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.actionSA = new PreCreationViewPoolDelegate(context6, N.b(SingleAtom.class), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$9(this), new ButtonWithInformationView$special$$inlined$preCreationViewPool$default$10());
        setElevation(ResourceExtKt.toPxF(16, context));
        setPadding(0, dimens$default.getMargin16(), 0, 0);
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(getNotificationCV());
        addView(getTopBadgeBV());
        addView(this.contentBgV);
        addView(this.guidelineG);
        addView(getTitleTAV());
        addView(getPricePV());
        addView(this.barrierB);
        addView(getActionSA());
    }

    private final SingleAtom getActionSA() {
        return (SingleAtom) this.actionSA.getValue(this, $$delegatedProperties[4]);
    }

    private final CellView getNotificationCV() {
        return (CellView) this.notificationCV.getValue(this, $$delegatedProperties[0]);
    }

    private final PriceView getPricePV() {
        return (PriceView) this.pricePV.getValue(this, $$delegatedProperties[3]);
    }

    private final TextAtomView getTitleTAV() {
        return (TextAtomView) this.titleTAV.getValue(this, $$delegatedProperties[2]);
    }

    private final BadgeView getTopBadgeBV() {
        return (BadgeView) this.topBadgeBV.getValue(this, $$delegatedProperties[1]);
    }

    private final void setConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getNotificationCV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getNotificationCV(), this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getNotificationCV(), this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getNotificationCV(), getTopBadgeBV(), this.dimens.getMargin2());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getTopBadgeBV(), getNotificationCV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTopBadgeBV(), this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getTopBadgeBV(), this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getTopBadgeBV(), this.contentBgV, this.dimens.getMargin2());
        dVar.c0(0.0f, getTopBadgeBV().getId());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.contentBgV, getTopBadgeBV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.contentBgV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.contentBgV);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.contentBgV);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getTitleTAV(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTitleTAV(), this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getTitleTAV(), this.barrierB, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getTitleTAV(), getPricePV(), this.dimens.getMargin4());
        dVar.g0(getTitleTAV().getId(), 2);
        dVar.c0(0.0f, getTitleTAV().getId());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getPricePV(), getTitleTAV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getPricePV(), this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getPricePV(), this.barrierB, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getPricePV(), this.dimens.getMargin8());
        dVar.c0(0.0f, getPricePV().getId());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getActionSA(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getActionSA(), this.barrierB, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getActionSA(), this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getActionSA(), this.dimens.getMargin8());
        dVar.c0(1.0f, getActionSA().getId());
        dVar.f(this);
    }

    private final void setupButtonConstraints(d dVar, View view, int i11) {
        dVar.A(getActionSA().getId(), i11);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getActionSA(), view, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getActionSA(), this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getActionSA(), this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getActionSA(), this.contentBgV, this.dimens.getMargin16());
    }

    public final void bind(@NotNull ButtonWithInformationVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getActionSA().setOnAction(actionHandler);
        CellHolderKt.bindOrGone(getNotificationCV(), item.getNotificationCell(), actionHandler);
        BadgeHolderKt.bindOrGone(getTopBadgeBV(), item.getTopBadge(), actionHandler);
        TextAtomHolderKt.bindOrGone$default(getTitleTAV(), item.getTitle(), null, 2, null);
        PriceHolderKt.bindOrGone$default(getPricePV(), item.getPrice(), null, 2, null);
        SingleAtom.bind$default(getActionSA(), item.getButton(), false, 2, null);
        if (this.lastButtonWidth != item.getButtonWidth()) {
            d dVar = new d();
            dVar.p(this);
            dVar.n(getActionSA().getId());
            int i11 = WhenMappings.$EnumSwitchMapping$0[item.getButtonWidth().ordinal()];
            if (i11 == 1) {
                setupButtonConstraints(dVar, this.guidelineG, 0);
            } else if (i11 == 2) {
                setupButtonConstraints(dVar, this.barrierB, 0);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                dVar.c0(1.0f, getActionSA().getId());
                setupButtonConstraints(dVar, this.barrierB, -2);
            }
            dVar.f(this);
            this.lastButtonWidth = item.getButtonWidth();
        }
    }
}
