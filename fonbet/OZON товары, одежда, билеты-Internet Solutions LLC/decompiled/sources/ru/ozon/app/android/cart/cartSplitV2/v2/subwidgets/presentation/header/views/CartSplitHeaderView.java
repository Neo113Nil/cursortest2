package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.views;

import Bi.b;
import D40.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.ui.thermometer.presentation.view.ThermometerMoleculeView;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010 \u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/views/CartSplitHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleSA", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleSA", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "removeSplitIconBtn", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getRemoveSplitIconBtn", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "rightBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getRightBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/constraintlayout/widget/Barrier;", "rightAreaBarrier", "Landroidx/constraintlayout/widget/Barrier;", "getRightAreaBarrier", "()Landroidx/constraintlayout/widget/Barrier;", "subtitleSA", "getSubtitleSA", "titleBarrier", "getTitleBarrier", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "additionalActionBtn", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "getAdditionalActionBtn", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "Lru/ozon/app/android/cart/ui/thermometer/presentation/view/ThermometerMoleculeView;", "thermometerMoleculeView", "Lru/ozon/app/android/cart/ui/thermometer/presentation/view/ThermometerMoleculeView;", "getThermometerMoleculeView", "()Lru/ozon/app/android/cart/ui/thermometer/presentation/view/ThermometerMoleculeView;", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileView;", "deliveryClickMoleculeView", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileView;", "getDeliveryClickMoleculeView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileView;", "Landroid/view/View;", "deliveryClickLockerView", "Landroid/view/View;", "getDeliveryClickLockerView", "()Landroid/view/View;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitHeaderView extends ConstraintLayout {

    @NotNull
    private final SmallBorderlessButtonView additionalActionBtn;

    @NotNull
    private final View deliveryClickLockerView;

    @NotNull
    private final CartClickTileView deliveryClickMoleculeView;

    @NotNull
    private final IconButtonV3View removeSplitIconBtn;

    @NotNull
    private final Barrier rightAreaBarrier;

    @NotNull
    private final BadgeView rightBadge;

    @NotNull
    private final TextAtomV2View subtitleSA;

    @NotNull
    private final ThermometerMoleculeView thermometerMoleculeView;

    @NotNull
    private final Barrier titleBarrier;

    @NotNull
    private final TextAtomV2View titleSA;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_2 = ResourceExtKt.toPx(2);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/views/CartSplitHeaderView$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartSplitHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final SmallBorderlessButtonView getAdditionalActionBtn() {
        return this.additionalActionBtn;
    }

    @NotNull
    public final View getDeliveryClickLockerView() {
        return this.deliveryClickLockerView;
    }

    @NotNull
    public final CartClickTileView getDeliveryClickMoleculeView() {
        return this.deliveryClickMoleculeView;
    }

    @NotNull
    public final IconButtonV3View getRemoveSplitIconBtn() {
        return this.removeSplitIconBtn;
    }

    @NotNull
    public final BadgeView getRightBadge() {
        return this.rightBadge;
    }

    @NotNull
    public final TextAtomV2View getSubtitleSA() {
        return this.subtitleSA;
    }

    @NotNull
    public final ThermometerMoleculeView getThermometerMoleculeView() {
        return this.thermometerMoleculeView;
    }

    @NotNull
    public final TextAtomV2View getTitleSA() {
        return this.titleSA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartSplitHeaderView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        View i12 = qVar.i(N.b(TextAtomV2View.class), context);
        if (i12 == null) {
            context2 = context;
            i12 = new TextAtomV2View(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        TextAtomV2View textAtomV2View = (TextAtomV2View) i12;
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.titleSA, 0, -2);
        d11.f41656t = 0;
        d11.f41657u = R$id.rightBarrier;
        d11.f41636i = 0;
        d11.f41598E = 0.0f;
        int i13 = DP_16;
        d11.setMarginStart(i13);
        d11.setMarginEnd(i13);
        ((ViewGroup.MarginLayoutParams) d11).topMargin = i13;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.titleSA = textAtomV2View;
        View i14 = qVar.i(N.b(IconButtonV3View.class), context2);
        IconButtonV3View iconButtonV3View = (IconButtonV3View) (i14 == null ? new IconButtonV3View(context2, null, 0, 0, 14, null) : i14);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.removeSplitIconBtn, -2, -2);
        c11.f41658v = 0;
        int i15 = R$id.titleSA;
        c11.f41636i = i15;
        c11.f41642l = i15;
        c11.setMarginEnd(i13);
        iconButtonV3View.setLayoutParams(c11);
        addView(iconButtonV3View);
        this.removeSplitIconBtn = iconButtonV3View;
        View i16 = qVar.i(N.b(BadgeView.class), context2);
        BadgeView badgeView = (BadgeView) (i16 == null ? new BadgeView(context2, null, 0, 0, 14, null) : i16);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.rightBadge, -2, -2);
        a11.f41658v = 0;
        a11.f41636i = R$id.titleSA;
        a11.setMarginEnd(i13);
        badgeView.setLayoutParams(a11);
        addView(badgeView);
        this.rightBadge = badgeView;
        Barrier barrier = new Barrier(context2);
        barrier.setId(R$id.rightBarrier);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.f(0);
        barrier.setReferencedIds(new int[]{R$id.removeSplitIconBtn, R$id.rightBadge});
        addView(barrier);
        this.rightAreaBarrier = barrier;
        View i17 = qVar.i(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) (i17 == null ? new TextAtomV2View(context2, null, 0, 6, null) : i17);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.subtitleSA, 0, -2);
        d12.f41656t = 0;
        d12.f41657u = R$id.removeSplitIconBtn;
        d12.f41638j = R$id.titleSA;
        d12.f41598E = 0.0f;
        d12.setMarginStart(i13);
        d12.setMarginEnd(i13);
        ((ViewGroup.MarginLayoutParams) d12).topMargin = DP_2;
        textAtomV2View2.setLayoutParams(d12);
        addView(textAtomV2View2);
        this.subtitleSA = textAtomV2View2;
        Barrier barrier2 = new Barrier(context2);
        barrier2.setId(R$id.titleBarrier);
        barrier2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier2.f(3);
        barrier2.setReferencedIds(new int[]{R$id.titleSA, R$id.removeSplitIconBtn, R$id.subtitleSA});
        addView(barrier2);
        this.titleBarrier = barrier2;
        SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(context2, null, 0, 6, null);
        smallBorderlessButtonView.setId(R$id.additionalActionBtn);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, 0);
        bVar.f41658v = 0;
        int i18 = R$id.titleSA;
        bVar.f41636i = i18;
        bVar.f41642l = i18;
        bVar.setMarginEnd(i13);
        bVar.f41616W = true;
        smallBorderlessButtonView.setLayoutParams(bVar);
        addView(smallBorderlessButtonView);
        this.additionalActionBtn = smallBorderlessButtonView;
        KeyEvent.Callback i19 = qVar.i(N.b(ThermometerMoleculeView.class), context2);
        ThermometerMoleculeView thermometerMoleculeView = (ThermometerMoleculeView) (i19 == null ? new ThermometerMoleculeView(context2, null, 0, 6, null) : i19);
        thermometerMoleculeView.setId(R$id.thermometerMoleculeView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41638j = R$id.titleBarrier;
        bVar2.setMarginStart(i13);
        bVar2.setMarginEnd(i13);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = DP_8;
        thermometerMoleculeView.setLayoutParams(bVar2);
        thermometerMoleculeView.setVisibility(8);
        addView(thermometerMoleculeView);
        this.thermometerMoleculeView = thermometerMoleculeView;
        View i21 = qVar.i(N.b(CartClickTileView.class), context2);
        CartClickTileView cartClickTileView = (CartClickTileView) (i21 == null ? new CartClickTileView(context2, null, 0, null, 14, null) : i21);
        cartClickTileView.setId(R$id.deliveryClickMoleculeView);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        bVar3.f41638j = R$id.thermometerMoleculeView;
        cartClickTileView.setLayoutParams(bVar3);
        cartClickTileView.setVisibility(8);
        addView(cartClickTileView);
        this.deliveryClickMoleculeView = cartClickTileView;
        View view = new View(context2);
        view.setId(R$id.deliveryClickLockerView);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, 0);
        bVar4.f41656t = cartClickTileView.getId();
        bVar4.f41658v = cartClickTileView.getId();
        bVar4.f41636i = cartClickTileView.getId();
        bVar4.f41642l = cartClickTileView.getId();
        view.setLayoutParams(bVar4);
        view.setClickable(true);
        view.setVisibility(8);
        addView(view);
        this.deliveryClickLockerView = view;
        setId(R$id.splitV2TitleRootCl);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setBackgroundColor(androidx.core.content.a.getColor(context2, R$color.layer_floor_1));
        new HeaderTouchDelegate(this, textAtomV2View, textAtomV2View2, badgeView);
    }
}
