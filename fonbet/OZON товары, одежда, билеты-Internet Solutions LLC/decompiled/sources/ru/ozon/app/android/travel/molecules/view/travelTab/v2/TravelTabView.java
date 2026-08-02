package ru.ozon.app.android.travel.molecules.view.travelTab.v2;

import Sc.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\"\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010%H\u0002J\u001c\u0010)\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010%H\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020'H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp4", "dp6", "dp8", "dp12", "itemCornerRadius", "", "defaultBackgroundColor", "selectedBackgroundColor", "defaultTextColor", "selectedTextColor", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "indicatorView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "unspecifiedHeightSpec", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bind", "data", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "setupText", "newText", "", "isSelected", "", "testInfo", "setupIndicator", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "accentColor", "setupBackgroundColor", "setupPaddings", "isIndicatorVisible", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelTabView extends LinearLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private final int defaultBackgroundColor;
    private final int defaultTextColor;
    private final int dp12;
    private final int dp4;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final IndicatorView indicatorView;
    private final float itemCornerRadius;
    private final int selectedBackgroundColor;
    private final int selectedTextColor;

    @NotNull
    private final AppCompatTextView textView;
    private final int unspecifiedHeightSpec;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorDTO.IndicatorContent.values().length];
            try {
                iArr[IndicatorDTO.IndicatorContent.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorDTO.IndicatorContent.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorDTO.IndicatorContent.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TravelTabView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void setupBackgroundColor(boolean isSelected) {
        this.backgroundDrawable.setColor(isSelected ? this.selectedBackgroundColor : this.defaultBackgroundColor);
    }

    private final void setupIndicator(IndicatorDTO indicator, String accentColor) {
        IndicatorHolderKt.bindOrGone$default(this.indicatorView, indicator, null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, accentColor);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            IndicatorDTO.IndicatorContent content = indicator != null ? indicator.getContent() : null;
            int i11 = content == null ? -1 : WhenMappings.$EnumSwitchMapping$0[content.ordinal()];
            if (i11 == -1 || i11 == 1) {
                return;
            }
            if (i11 == 2) {
                this.indicatorView.setIconColor(intValue);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                this.indicatorView.setBackColor(parseColor);
            }
        }
    }

    private final void setupPaddings(boolean isIndicatorVisible) {
        setPadding(getPaddingLeft(), getPaddingTop(), isIndicatorVisible ? this.dp8 : this.dp12, getPaddingBottom());
    }

    private final void setupText(String newText, boolean isSelected, String testInfo) {
        AppCompatTextView appCompatTextView = this.textView;
        appCompatTextView.setText(newText);
        appCompatTextView.setTextColor(isSelected ? this.selectedTextColor : this.defaultTextColor);
        appCompatTextView.setContentDescription(testInfo);
    }

    public final void bind(@NotNull TravelTabVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setupText(data.getText(), data.getIsSelected(), data.getTestInfo());
        setupIndicator(data.getIndicator(), data.getAccentColor());
        setupBackgroundColor(data.getIsSelected());
        setupPaddings(data.getIndicator() != null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                measureChild(childAt, widthMeasureSpec, this.unspecifiedHeightSpec);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                i11 = Math.max(i11, childAt.getMeasuredHeight() + (layoutParams2 != null ? layoutParams2.topMargin : 0) + (layoutParams2 != null ? layoutParams2.bottomMargin : 0));
            }
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + i11, 1073741824));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTabView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(6, context);
        this.dp6 = px2;
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px3 = ResourceExtKt.toPx(12, context);
        this.dp12 = px3;
        float pxF = ResourceExtKt.toPxF(8, context);
        this.itemCornerRadius = pxF;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        this.defaultBackgroundColor = themeColor;
        this.selectedBackgroundColor = ThemeExtKt.themeColor(context, R$attr.graphicPrimary);
        this.defaultTextColor = ThemeExtKt.themeColor(context, R$attr.textPrimary);
        this.selectedTextColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M);
        this.textView = appCompatTextView;
        IndicatorView indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(px);
        indicatorView.setLayoutParams(marginLayoutParams);
        this.indicatorView = indicatorView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(pxF);
        gradientDrawable.setColor(themeColor);
        this.backgroundDrawable = gradientDrawable;
        this.unspecifiedHeightSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        setOrientation(0);
        setGravity(16);
        setPadding(px3, px2, px3, px2);
        addView(appCompatTextView);
        addView(indicatorView);
        setClipToOutline(true);
        setBackground(gradientDrawable);
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        setForeground(new RippleDrawable(valueOf, null, new ColorDrawable(-1)));
    }
}
