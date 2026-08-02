package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.ButtonWithInformationVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020'0+J\b\u0010-\u001a\u00020'H\u0002J\b\u0010.\u001a\u00020'H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b#\u0010$¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/presentation/view/VerticalButtonWithInformationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dimens", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "topBadgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getTopBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "topBadgeBV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "contentBgV", "Landroid/view/View;", "pricePV", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "getPricePV", "()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "pricePV$delegate", "priceLabelTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getPriceLabelTAV", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "priceLabelTAV$delegate", "infoIBV", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "getInfoIBV", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "infoIBV$delegate", "barrierB", "Landroidx/constraintlayout/widget/Barrier;", "actionSA", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getActionSA", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "actionSA$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setConstraints", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalButtonWithInformationView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(VerticalButtonWithInformationView.class, "topBadgeBV", "getTopBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(VerticalButtonWithInformationView.class, "pricePV", "getPricePV()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", 0), C2438a.c(VerticalButtonWithInformationView.class, "priceLabelTAV", "getPriceLabelTAV()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(VerticalButtonWithInformationView.class, "infoIBV", "getInfoIBV()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", 0), C2438a.c(VerticalButtonWithInformationView.class, "actionSA", "getActionSA()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", 0)};
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

    /* renamed from: infoIBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate infoIBV;

    /* renamed from: priceLabelTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceLabelTAV;

    /* renamed from: pricePV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePV;

    /* renamed from: topBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate topBadgeBV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalButtonWithInformationView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dimens = dimens$default;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.topBadgeBV = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$1(this), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$2());
        View view = new View(context);
        view.setId(R$id.verticalButtonWithInformationContentBgV);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        view.setBackground(RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), dimens$default.getRadius12(), dimens$default.getRadius12(), 0.0f, 0.0f, 24, null));
        this.contentBgV = view;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.pricePV = new PreCreationViewPoolDelegate(context3, N.b(PriceView.class), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$3(this), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.priceLabelTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomView.class), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$5(this), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.infoIBV = new PreCreationViewPoolDelegate(context5, N.b(SmallIconButtonView.class), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$7(this), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$8(this));
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.verticalButtonWithInformationBarrier);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{getPriceLabelTAV().getId(), getInfoIBV().getId(), getPricePV().getId()});
        this.barrierB = barrier;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.actionSA = new PreCreationViewPoolDelegate(context6, N.b(SingleAtom.class), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$9(this), new VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$10());
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(getTopBadgeBV());
        addView(this.contentBgV);
        addView(getPricePV());
        addView(getPriceLabelTAV());
        addView(getInfoIBV());
        addView(this.barrierB);
        addView(getActionSA());
    }

    private final SingleAtom getActionSA() {
        return (SingleAtom) this.actionSA.getValue(this, $$delegatedProperties[4]);
    }

    private final SmallIconButtonView getInfoIBV() {
        return (SmallIconButtonView) this.infoIBV.getValue(this, $$delegatedProperties[3]);
    }

    private final TextAtomView getPriceLabelTAV() {
        return (TextAtomView) this.priceLabelTAV.getValue(this, $$delegatedProperties[2]);
    }

    private final PriceView getPricePV() {
        return (PriceView) this.pricePV.getValue(this, $$delegatedProperties[1]);
    }

    private final BadgeView getTopBadgeBV() {
        return (BadgeView) this.topBadgeBV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getTopBadgeBV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTopBadgeBV(), this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getTopBadgeBV());
        dVar.c0(0.0f, getTopBadgeBV().getId());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.contentBgV, getTopBadgeBV(), this.dimens.getMargin4());
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.contentBgV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.contentBgV);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.contentBgV);
        dVar.Z(this.contentBgV.getId(), 3, 0);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getPricePV(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getPricePV(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getPriceLabelTAV(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getPriceLabelTAV(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getPriceLabelTAV(), getInfoIBV());
        dVar.c0(0.0f, getPriceLabelTAV().getId());
        dVar.d0(getPriceLabelTAV().getId(), 2);
        dVar.Z(getPriceLabelTAV().getId(), 7, this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getInfoIBV(), this.contentBgV, this.dimens.getMargin20());
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getInfoIBV(), getPriceLabelTAV(), this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getInfoIBV(), getPricePV(), this.dimens.getMargin8());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getActionSA(), this.barrierB, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getActionSA(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getActionSA(), this.contentBgV, this.dimens.getMargin16());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getActionSA(), this.contentBgV, this.dimens.getMargin16());
        dVar.f(this);
    }

    public final void bind(@NotNull ButtonWithInformationVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        BadgeHolderKt.bindOrGone(getTopBadgeBV(), item.getTopBadge(), actionHandler);
        TextAtomHolderKt.bindOrGone$default(getPriceLabelTAV(), item.getTitle(), null, 2, null);
        WrappedIconButtonHolderKt.bindOrGone(getInfoIBV(), item.getInfoButton(), actionHandler);
        PriceHolderKt.bindOrGone$default(getPricePV(), item.getPrice(), null, 2, null);
        SingleAtom.bind$default(getActionSA(), item.getButton(), false, 2, null);
        getActionSA().setOnAction(actionHandler);
    }
}
