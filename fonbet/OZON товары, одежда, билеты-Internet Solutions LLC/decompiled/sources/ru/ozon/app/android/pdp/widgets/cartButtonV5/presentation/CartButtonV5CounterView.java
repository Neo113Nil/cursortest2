package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5CounterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "incrementIcon", "Landroid/widget/ImageView;", "getIncrementIcon", "()Landroid/widget/ImageView;", "decrementIcon", "getDecrementIcon", "counterText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCounterText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5CounterView extends LinearLayout {
    private static final int buttonWidth;
    private static final int horizontalPadding;

    @NotNull
    private final TextAtomV2View counterText;

    @NotNull
    private final ImageView decrementIcon;

    @NotNull
    private final ImageView incrementIcon;
    public static final int $stable = 8;

    static {
        Dimens dimens = Dimens.INSTANCE;
        int dp_16 = dimens.getDP_16();
        horizontalPadding = dp_16;
        buttonWidth = (dp_16 * 2) + dimens.getDP_24();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonV5CounterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.cartBtnV5Plus);
        int i11 = buttonWidth;
        Dimens dimens = Dimens.INSTANCE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, dimens.getDP_56());
        layoutParams.gravity = 16;
        int i12 = horizontalPadding;
        ViewExtKt.updatePadding$default(imageView, i12, 0, i12, 0, 10, null);
        imageView.setLayoutParams(layoutParams);
        this.incrementIcon = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R$id.cartBtnV5Minus);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, dimens.getDP_56());
        layoutParams2.gravity = 16;
        ViewExtKt.updatePadding$default(imageView2, i12, 0, i12, 0, 10, null);
        imageView2.setLayoutParams(layoutParams2);
        this.decrementIcon = imageView2;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.cartBtnV5Counter);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dimens.getDP_44(), -2);
        layoutParams3.gravity = 16;
        textAtomV2View.setLayoutParams(layoutParams3);
        this.counterText = textAtomV2View;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, dimens.getDP_56());
        layoutParams4.leftMargin = dimens.getDP_8();
        layoutParams4.gravity = 8388693;
        setClickable(true);
        setLayoutParams(layoutParams4);
        addView(imageView2);
        addView(textAtomV2View);
        addView(imageView);
    }

    @NotNull
    public final TextAtomV2View getCounterText() {
        return this.counterText;
    }

    @NotNull
    public final ImageView getDecrementIcon() {
        return this.decrementIcon;
    }

    @NotNull
    public final ImageView getIncrementIcon() {
        return this.incrementIcon;
    }
}
