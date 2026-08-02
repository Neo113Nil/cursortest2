package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.R$id;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001eH\u0002R\u0014\u0010\n\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/StatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalMargin", "getHorizontalMargin", "()I", "verticalMargin", "getVerticalMargin", "verticalPriceMargin", "getVerticalPriceMargin", "countStartMargin", "getCountStartMargin", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "countView", "getCountView", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "updateConstraints", "", "setupLayoutParams", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class StatusView extends ConstraintLayout {
    private final int countStartMargin;

    @NotNull
    private final TextAtomV2View countView;
    private final int horizontalMargin;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final TextAtomV2View titleView;
    private final int verticalMargin;
    private final int verticalPriceMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.horizontalMargin = ResourceExtKt.toPx(16);
        this.verticalMargin = ResourceExtKt.toPx(14);
        this.verticalPriceMargin = ResourceExtKt.toPx(12);
        this.countStartMargin = ResourceExtKt.toPx(4);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.statusTitle);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.statusCount);
        this.countView = textAtomV2View2;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setId(R$id.statusPrice);
        this.priceView = priceAtomView;
        setupLayoutParams();
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(priceAtomView);
        updateConstraints();
    }

    private final void setupLayoutParams() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    protected final int getCountStartMargin() {
        return this.countStartMargin;
    }

    @NotNull
    public final TextAtomV2View getCountView() {
        return this.countView;
    }

    protected final int getHorizontalMargin() {
        return this.horizontalMargin;
    }

    @NotNull
    public final PriceAtomView getPriceView() {
        return this.priceView;
    }

    @NotNull
    public final TextAtomV2View getTitleView() {
        return this.titleView;
    }

    protected final int getVerticalMargin() {
        return this.verticalMargin;
    }

    protected final int getVerticalPriceMargin() {
        return this.verticalPriceMargin;
    }

    public abstract void updateConstraints();
}
