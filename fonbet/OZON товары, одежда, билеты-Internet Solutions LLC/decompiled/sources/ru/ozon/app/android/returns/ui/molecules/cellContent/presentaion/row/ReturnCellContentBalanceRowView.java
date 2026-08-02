package ru.ozon.app.android.returns.ui.molecules.cellContent.presentaion.row;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/row/ReturnCellContentBalanceRowView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "marginHorizontal", "marginBetween", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTextAtomView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "priceAtomView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPriceAtomView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCellContentBalanceRowView extends LinearLayout {
    private final int marginBetween;
    private final int marginHorizontal;

    @NotNull
    private final PriceAtomView priceAtomView;

    @NotNull
    private final TextAtomV2View textAtomView;

    public /* synthetic */ ReturnCellContentBalanceRowView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final PriceAtomView getPriceAtomView() {
        return this.priceAtomView;
    }

    @NotNull
    public final TextAtomV2View getTextAtomView() {
        return this.textAtomView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCellContentBalanceRowView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.marginHorizontal = px;
        int px2 = UiExtKt.toPx(8, context);
        this.marginBetween = px2;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int marginEnd = layoutParams.getMarginEnd();
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        layoutParams.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i12;
        layoutParams.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i13;
        layoutParams.weight = 1.0f;
        textAtomV2View.setLayoutParams(layoutParams);
        this.textAtomView = textAtomV2View;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        layoutParams2.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i14;
        layoutParams2.setMarginEnd(px);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i15;
        priceAtomView.setLayoutParams(layoutParams2);
        this.priceAtomView = priceAtomView;
        setId(View.generateViewId());
        setOrientation(0);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        addView(textAtomV2View);
        addView(priceAtomView);
    }
}
