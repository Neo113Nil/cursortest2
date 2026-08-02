package ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewHolder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewHolder/ReturnTotalMobileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp14", "dp16", "totalPv", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "getTotalPv", "()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "quantityTv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getQuantityTv", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "buttonSbv", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "getButtonSbv", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "setupConstraints", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTotalMobileView extends ConstraintLayout {
    public static final int $stable = (SmallButtonView.$stable | TextAtomView.$stable) | PriceView.$stable;

    @NotNull
    private final SmallButtonView buttonSbv;
    private final int dp14;
    private final int dp16;

    @NotNull
    private final TextAtomView quantityTv;

    @NotNull
    private final PriceView totalPv;

    public /* synthetic */ ReturnTotalMobileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.totalPv);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.totalPv);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(dVar, this.totalPv, this.quantityTv);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.quantityTv);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, this.quantityTv);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.quantityTv, this.totalPv);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, this.buttonSbv);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.buttonSbv);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.buttonSbv);
        dVar.f(this);
    }

    @NotNull
    public final SmallButtonView getButtonSbv() {
        return this.buttonSbv;
    }

    @NotNull
    public final TextAtomView getQuantityTv() {
        return this.quantityTv;
    }

    @NotNull
    public final PriceView getTotalPv() {
        return this.totalPv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnTotalMobileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(14, context);
        this.dp14 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        PriceView priceView = new PriceView(context, null, 0, 6, null);
        priceView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int marginEnd = bVar.getMarginEnd();
        int i12 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        bVar.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px;
        bVar.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i12;
        bVar.f41604K = 2;
        priceView.setLayoutParams(bVar);
        this.totalPv = priceView;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        int i13 = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
        int marginEnd2 = bVar2.getMarginEnd();
        bVar2.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = i13;
        bVar2.setMarginEnd(marginEnd2);
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = px;
        textAtomView.setLayoutParams(bVar2);
        this.quantityTv = textAtomView;
        SmallButtonView smallButtonView = new SmallButtonView(context, null, 0, 6, null);
        smallButtonView.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.setMargins(px2, px2, px2, px2);
        smallButtonView.setLayoutParams(bVar3);
        this.buttonSbv = smallButtonView;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(priceView);
        addView(textAtomView);
        addView(smallButtonView);
        setupConstraints();
    }
}
