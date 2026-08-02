package ru.ozon.app.android.cart.totalV3.presentation.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceCardDivider;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bind", "", "divider", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$DividerVO;", "bindOrGone", "setupBackground", "color", "", "radius", "createBackground", "Landroid/graphics/drawable/Drawable;", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalPriceCardDivider extends FrameLayout {
    public /* synthetic */ TotalPriceCardDivider(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Drawable createBackground(int color, float radius) {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = radius;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    private final void setupBackground(String color, int radius) {
        Drawable drawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            drawable = createBackground(intValue, ResourceExtKt.toPxF(radius, context2) / 2);
        } else {
            drawable = null;
        }
        setBackground(drawable);
    }

    public final void bind(@NotNull TotalVO.TotalItemVO.PriceBlockVO.DividerVO divider) {
        Intrinsics.checkNotNullParameter(divider, "divider");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.width = ResourceExtKt.toPx(divider.getWidth());
            marginLayoutParams2.height = ResourceExtKt.toPx(divider.getHeight());
            int marginLeft = divider.getMargins().getMarginLeft();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int px = ResourceExtKt.toPx(marginLeft, context);
            int marginRight = divider.getMargins().getMarginRight();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            marginLayoutParams2.setMargins(px, 0, ResourceExtKt.toPx(marginRight, context2), 0);
            marginLayoutParams = marginLayoutParams2;
        }
        setLayoutParams(marginLayoutParams);
        setupBackground(divider.getColor(), divider.getWidth());
    }

    public final void bindOrGone(TotalVO.TotalItemVO.PriceBlockVO.DividerVO divider) {
        if (divider == null) {
            ViewExtKt.gone(this);
        } else {
            bind(divider);
            ViewExtKt.show(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceCardDivider(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
