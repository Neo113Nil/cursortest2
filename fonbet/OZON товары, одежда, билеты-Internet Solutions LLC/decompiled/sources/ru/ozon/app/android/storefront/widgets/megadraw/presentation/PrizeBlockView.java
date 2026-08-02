package ru.ozon.app.android.storefront.widgets.megadraw.presentation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J0\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014J\u000e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/presentation/PrizeBlockView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp12", "dp17", "dp16", "dp8", "dp6", "dp4", "defaultBgColor", "partialProgressRadius", "", "", "[Ljava/lang/Float;", "filledProgressRadius", "viewBackground", "Landroid/graphics/drawable/Drawable;", "firstTitle", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "secondTitle", "defaultProgress", "Landroid/view/View;", "actualProgress", "isProgressEnabled", "", "progress", "topBottomPadding", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "l", "t", "r", "b", "bind", "dto", "Lru/ozon/app/android/storefront/widgets/megadraw/presentation/PrizeBlockVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PrizeBlockView extends ViewGroup {

    @NotNull
    private View actualProgress;
    private final int defaultBgColor;

    @NotNull
    private View defaultProgress;
    private final int dp12;
    private final int dp16;
    private final int dp17;
    private final int dp4;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final Float[] filledProgressRadius;

    @NotNull
    private TextAtomV2View firstTitle;
    private boolean isProgressEnabled;

    @NotNull
    private final Float[] partialProgressRadius;
    private float progress;

    @NotNull
    private TextAtomV2View secondTitle;
    private int topBottomPadding;
    private final Drawable viewBackground;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrizeBlockView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull PrizeBlockVO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, dto.getBackgroundColor());
        int intValue = mapColor != null ? mapColor.intValue() : this.defaultBgColor;
        Drawable background = getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Drawable mutate = ((GradientDrawable) background).mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        ColorStateList colorStateList = a.getColorStateList(getContext(), intValue);
        Intrinsics.g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) mutate).setColor(colorStateList);
        TextAtomV2View textAtomV2View = this.firstTitle;
        TextHolderKt.bind$default(textAtomV2View, dto.getCountTitle(), null, 2, null);
        textAtomV2View.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textAtomV2View.setEllipsize(truncateAt);
        TextAtomV2View textAtomV2View2 = this.secondTitle;
        TextHolderKt.bind$default(textAtomV2View2, dto.getSubtitle(), null, 2, null);
        textAtomV2View2.setMaxLines(1);
        textAtomV2View2.setEllipsize(truncateAt);
        this.progress = dto.getProgress();
        boolean z11 = dto.getSafeColorArray() != null;
        this.isProgressEnabled = z11;
        if (!z11) {
            ViewExtKt.gone(this.actualProgress);
            ViewExtKt.gone(this.defaultProgress);
            return;
        }
        int[] safeColorArray = dto.getSafeColorArray();
        if (safeColorArray != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, safeColorArray);
            Float[] fArr = this.progress == 1.0f ? this.filledProgressRadius : this.partialProgressRadius;
            Intrinsics.checkNotNullParameter(fArr, "<this>");
            int length = fArr.length;
            float[] fArr2 = new float[length];
            for (int i11 = 0; i11 < length; i11++) {
                fArr2[i11] = fArr[i11].floatValue();
            }
            gradientDrawable.setCornerRadii(fArr2);
            this.actualProgress.setBackground(gradientDrawable);
        }
        ViewExtKt.show(this.actualProgress);
        ViewExtKt.show(this.defaultProgress);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        LayoutExtKt.layoutLeftTop(this.firstTitle, this.dp16, this.topBottomPadding);
        LayoutExtKt.layoutLeftTop(this.secondTitle, this.dp16, this.firstTitle.getBottom());
        this.defaultProgress.layout(this.dp16, this.secondTitle.getBottom() + this.dp6, this.defaultProgress.getMeasuredWidth(), this.secondTitle.getBottom() + this.dp6 + this.dp4);
        this.actualProgress.layout(this.dp16, this.secondTitle.getBottom() + this.dp6, ((int) (this.defaultProgress.getMeasuredWidth() * this.progress)) + (this.progress >= 0.75f ? 0 : this.dp8), this.secondTitle.getBottom() + this.dp6 + this.dp4);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredHeight;
        int measuredHeight2;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        MeasureExtKt.measure(this.firstTitle, widthMeasureSpec - this.dp16, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.secondTitle, widthMeasureSpec - this.dp16, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measureExactly(this.defaultProgress, size - this.dp16, this.dp4);
        View view = this.actualProgress;
        int measuredWidth = (int) (this.defaultProgress.getMeasuredWidth() * this.progress);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MeasureExtKt.measureExactly(view, UiExtKt.toPx(measuredWidth, context), this.dp4);
        if (this.isProgressEnabled) {
            int i11 = this.dp12;
            this.topBottomPadding = i11;
            measuredHeight2 = this.secondTitle.getMeasuredHeight() + this.firstTitle.getMeasuredHeight() + (i11 * 2) + this.dp4;
            measuredHeight = this.dp6;
        } else {
            int i12 = this.dp17;
            this.topBottomPadding = i12;
            measuredHeight = this.firstTitle.getMeasuredHeight() + (i12 * 2);
            measuredHeight2 = this.secondTitle.getMeasuredHeight();
        }
        setMeasuredDimension(size, measuredHeight2 + measuredHeight);
    }

    public /* synthetic */ PrizeBlockView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrizeBlockView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp12 = UiExtKt.toPx(12, context);
        this.dp17 = UiExtKt.toPx(17, context);
        this.dp16 = UiExtKt.toPx(16, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp6 = UiExtKt.toPx(6, context);
        this.dp4 = UiExtKt.toPx(4, context);
        this.defaultBgColor = context.getColor(R$color.layer_surface);
        Float valueOf = Float.valueOf(12.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        this.partialProgressRadius = new Float[]{valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf2, valueOf, valueOf};
        this.filledProgressRadius = new Float[]{valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf};
        Drawable a11 = C7232a.a(context, R$drawable.bg_megadraw_cell_block);
        this.viewBackground = a11;
        this.firstTitle = new TextAtomV2View(context, null, 0, 6, null);
        this.secondTitle = new TextAtomV2View(context, null, 0, 6, null);
        View view = new View(context);
        view.setBackground(C7232a.a(context, R$drawable.bg_megadraw_empty_progress));
        this.defaultProgress = view;
        this.actualProgress = new View(context);
        setBackground(a11);
        addView(this.firstTitle);
        addView(this.secondTitle);
        addView(this.defaultProgress);
        addView(this.actualProgress);
    }
}
