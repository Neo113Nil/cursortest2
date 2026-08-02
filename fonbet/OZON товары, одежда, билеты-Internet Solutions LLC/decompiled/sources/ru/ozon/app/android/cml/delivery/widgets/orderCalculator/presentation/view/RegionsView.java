package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view;

import Bi.b;
import D40.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$drawable;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/RegionsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "sourceTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getSourceTv", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/view/View;", "separatorRegions", "Landroid/view/View;", "getSeparatorRegions", "()Landroid/view/View;", "destinationTv", "getDestinationTv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "swapButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getSwapButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RegionsView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int separatorHeight = ResourceExtKt.toPx(1);

    @NotNull
    private final TextAtomV2View destinationTv;

    @NotNull
    private final View separatorRegions;

    @NotNull
    private final TextAtomV2View sourceTv;

    @NotNull
    private final IconButtonV3View swapButton;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/RegionsView$Companion;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RegionsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final TextAtomV2View getDestinationTv() {
        return this.destinationTv;
    }

    @NotNull
    public final TextAtomV2View getSourceTv() {
        return this.sourceTv;
    }

    @NotNull
    public final IconButtonV3View getSwapButton() {
        return this.swapButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.calculator_sourceTv, 0, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41657u = R$id.calculator_swapButton;
        d11.f41640k = R$id.calculator_separatorRegions;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp18();
        d11.setMarginStart(dimens.getDp16());
        ((ViewGroup.MarginLayoutParams) d11).bottomMargin = dimens.getDp16();
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setGravity(16);
        textAtomV2View.setTextIsSelectable(false);
        this.sourceTv = textAtomV2View;
        View view = new View(context);
        view.setId(R$id.calculator_separatorRegions);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, separatorHeight);
        bVar.f41638j = R$id.calculator_sourceTv;
        bVar.f41656t = 0;
        bVar.f41657u = R$id.calculator_swapButton;
        bVar.f41640k = R$id.calculator_destinationTv;
        bVar.setMarginStart(dimens.getDp16());
        bVar.setMarginEnd(dimens.getDp8());
        view.setLayoutParams(bVar);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separatorRegions = view;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.calculator_destinationTv, 0, -2);
        d12.f41638j = R$id.calculator_separatorRegions;
        d12.f41656t = 0;
        d12.f41657u = R$id.calculator_swapButton;
        d12.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) d12).topMargin = dimens.getDp16();
        d12.setMarginStart(dimens.getDp16());
        ((ViewGroup.MarginLayoutParams) d12).bottomMargin = dimens.getDp18();
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setGravity(16);
        textAtomV2View2.setTextIsSelectable(false);
        this.destinationTv = textAtomV2View2;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.calculator_swapButton, -2, -2);
        int i12 = R$id.calculator_separatorRegions;
        c11.f41636i = i12;
        c11.f41642l = i12;
        c11.f41658v = 0;
        c11.setMarginEnd(dimens.getDp16());
        iconButtonV3View.setLayoutParams(c11);
        this.swapButton = iconButtonV3View;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(view);
        addView(iconButtonV3View);
        setBackgroundResource(R$drawable.bg_regions);
    }
}
