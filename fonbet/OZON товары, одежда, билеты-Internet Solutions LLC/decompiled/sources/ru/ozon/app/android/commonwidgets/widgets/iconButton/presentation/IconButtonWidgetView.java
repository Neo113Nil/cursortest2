package ru.ozon.app.android.commonwidgets.widgets.iconButton.presentation;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.PaddingOption;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0011\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010$\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0014\u0018\u00010!¢\u0006\u0004\b$\u0010%J=\u0010*\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\n2\b\u0010'\u001a\u0004\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100¨\u00064"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "startColor", "endColor", "", "alpha", "generateBGColor", "(Ljava/lang/String;Ljava/lang/String;F)I", "generateIconColor", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetVO;Lkotlin/jvm/functions/Function1;)V", "iconStartColor", "iconEndColor", "bgStartColor", "bgEndColor", "updateColorsByScroll", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "buttonTopMargin", "I", "buttonLeftMargin", "buttonBottomMargin", "buttonRightMargin", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IconButtonWidgetView extends ViewGroup {
    private int buttonBottomMargin;
    private int buttonLeftMargin;
    private int buttonRightMargin;
    private int buttonTopMargin;

    @NotNull
    private final IconButtonV3View iconButtonView;

    public /* synthetic */ IconButtonWidgetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int generateBGColor(String startColor, String endColor, float alpha) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, startColor);
        int i11 = R.color.transparent;
        int intValue = parseColor != null ? parseColor.intValue() : 17170445;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, endColor);
        if (parseColor2 != null) {
            i11 = parseColor2.intValue();
        }
        return c.b(alpha, i11, intValue);
    }

    private final int generateIconColor(String startColor, String endColor, float alpha) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, startColor);
        int intValue = parseColor != null ? parseColor.intValue() : UniColors.GRAPHIC_TERTIARY.getResId();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, endColor);
        return c.b(alpha, parseColor2 != null ? parseColor2.intValue() : UniColors.GRAPHIC_TERTIARY.getResId(), intValue);
    }

    public final void bind(@NotNull IconButtonWidgetVO item, Function1<? super AtomAction, Unit> onAction) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(item, "item");
        IconButtonV3HolderKt.bind(this.iconButtonView, item.getIconButton(), new IconButtonWidgetView$bind$1(onAction));
        PaddingOption options = item.getOptions();
        if (options != null) {
            Integer topMargin = options.getTopMargin();
            int i14 = 0;
            if (topMargin != null) {
                int intValue = topMargin.intValue();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                i11 = ResourceExtKt.toPx(intValue, context);
            } else {
                i11 = 0;
            }
            this.buttonTopMargin = i11;
            Integer leftMargin = options.getLeftMargin();
            if (leftMargin != null) {
                int intValue2 = leftMargin.intValue();
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                i12 = ResourceExtKt.toPx(intValue2, context2);
            } else {
                i12 = 0;
            }
            this.buttonLeftMargin = i12;
            Integer bottomMargin = options.getBottomMargin();
            if (bottomMargin != null) {
                int intValue3 = bottomMargin.intValue();
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                i13 = ResourceExtKt.toPx(intValue3, context3);
            } else {
                i13 = 0;
            }
            this.buttonBottomMargin = i13;
            Integer rightMargin = options.getRightMargin();
            if (rightMargin != null) {
                int intValue4 = rightMargin.intValue();
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                i14 = ResourceExtKt.toPx(intValue4, context4);
            }
            this.buttonRightMargin = i14;
            IconButtonV3View iconButtonV3View = this.iconButtonView;
            ViewGroup.LayoutParams layoutParams = iconButtonV3View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = this.buttonTopMargin;
            marginLayoutParams.leftMargin = this.buttonLeftMargin;
            marginLayoutParams.bottomMargin = this.buttonBottomMargin;
            marginLayoutParams.rightMargin = this.buttonRightMargin;
            iconButtonV3View.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        LayoutExtKt.layoutLeftTop(this.iconButtonView, this.buttonLeftMargin, this.buttonTopMargin);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measureUnspecified(this.iconButtonView);
        setMeasuredDimension(this.iconButtonView.getMeasuredWidth() + this.buttonLeftMargin + this.buttonRightMargin, this.iconButtonView.getMeasuredHeight() + this.buttonTopMargin + this.buttonBottomMargin);
    }

    public final void updateColorsByScroll(float alpha, String iconStartColor, String iconEndColor, String bgStartColor, String bgEndColor) {
        float f7 = alpha <= 0.6f ? 0.0f : alpha;
        this.iconButtonView.setBackColor(new Color.Solid(generateBGColor(bgStartColor, bgEndColor, alpha)));
        this.iconButtonView.setIconColor(generateIconColor(iconStartColor, iconEndColor, f7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonWidgetView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(iconButtonV3View);
        this.iconButtonView = iconButtonV3View;
    }
}
