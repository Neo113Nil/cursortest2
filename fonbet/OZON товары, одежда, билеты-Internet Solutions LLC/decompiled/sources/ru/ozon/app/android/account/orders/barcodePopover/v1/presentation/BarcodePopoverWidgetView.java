package ru.ozon.app.android.account.orders.barcodePopover.v1.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverWidgetView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonMargin", "codeMarginVertical", "codeMarginStart", "barcodeMargin", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getIconButtonView", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "barcodeImageView", "Landroid/widget/ImageView;", "getBarcodeImageView", "()Landroid/widget/ImageView;", "topFrameLayout", "Landroid/widget/FrameLayout;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodePopoverWidgetView extends LinearLayout {

    @NotNull
    private final ImageView barcodeImageView;
    private final int barcodeMargin;
    private final int buttonMargin;
    private final int codeMarginStart;
    private final int codeMarginVertical;

    @NotNull
    private final IconButtonV3View iconButtonView;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private final FrameLayout topFrameLayout;

    public /* synthetic */ BarcodePopoverWidgetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final ImageView getBarcodeImageView() {
        return this.barcodeImageView;
    }

    @NotNull
    public final IconButtonV3View getIconButtonView() {
        return this.iconButtonView;
    }

    @NotNull
    public final TextAtomV2View getTitleTav() {
        return this.titleTav;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodePopoverWidgetView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(12, context);
        this.buttonMargin = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.codeMarginVertical = px2;
        int px3 = ResourceExtKt.toPx(20, context);
        this.codeMarginStart = px3;
        int px4 = ResourceExtKt.toPx(24, context);
        this.barcodeMargin = px4;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.codeTav);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(px3, px2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, px2);
        textAtomV2View.setLayoutParams(layoutParams);
        this.titleTav = textAtomV2View;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(R$id.closeButtonView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, px, px, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        layoutParams2.gravity = 5;
        iconButtonV3View.setLayoutParams(layoutParams2);
        this.iconButtonView = iconButtonV3View;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.barcodeImageView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.setMargins(px4, 0, px4, px4);
        imageView.setLayoutParams(layoutParams3);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.barcodeImageView = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        frameLayout.addView(textAtomV2View);
        frameLayout.addView(iconButtonV3View);
        this.topFrameLayout = frameLayout;
        setId(R$id.barcodeCl);
        setOrientation(1);
        setBackgroundColor(a.getColor(context, UniColors.WHITE.getResId()));
        setLayoutParams(new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) new LinearLayout.LayoutParams(-1, -1)));
        addView(frameLayout);
        addView(imageView);
    }
}
