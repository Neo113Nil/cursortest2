package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonV4Binding;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantAppearance;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuant;", "titleStyle", "", "<init>", "(I)V", "styleableId", "", "getStyleableId", "()[I", "textColor", "Landroid/content/res/ColorStateList;", "subtextColor", "readAttribute", "", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "reset", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantAppearance extends AttributesAppearance<CartButtonQuant> {

    @NotNull
    private final int[] styleableId;
    private ColorStateList subtextColor;
    private ColorStateList textColor;
    private final int titleStyle;

    public CartButtonQuantAppearance(int i11) {
        this.titleStyle = i11;
        int[] LargeButtonView = R$styleable.LargeButtonView;
        Intrinsics.checkNotNullExpressionValue(LargeButtonView, "LargeButtonView");
        this.styleableId = LargeButtonView;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        return this.styleableId;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.LargeButtonView_textColor) {
            this.textColor = typedAttributes.getColorStateList(attr);
        } else if (attr == R$styleable.LargeButtonView_subtextColor) {
            this.subtextColor = typedAttributes.getColorStateList(attr);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.textColor = null;
        this.subtextColor = null;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull CartButtonQuant view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WidgetCartbuttonV4Binding bind = WidgetCartbuttonV4Binding.bind(view);
        bind.btnTitleTv.setTextAppearance(this.titleStyle);
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            bind.btnTitleTv.setTextColor(colorStateList);
        }
        ColorStateList colorStateList2 = this.subtextColor;
        if (colorStateList2 != null) {
            bind.btnSubtitleTv.setTextColor(colorStateList2);
        }
    }
}
