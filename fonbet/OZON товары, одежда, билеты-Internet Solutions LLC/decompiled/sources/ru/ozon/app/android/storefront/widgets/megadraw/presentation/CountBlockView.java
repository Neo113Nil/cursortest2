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
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.app.android.storefront.widgets.megadraw.data.CountBlockDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J0\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/presentation/CountBlockView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp16", "dp12", "dp2", "dp4", "defaultBgColor", "viewBackground", "Landroid/graphics/drawable/Drawable;", "firstValue", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "firstTitle", "firstIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "secondValue", "secondTitle", "secondIcon", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "bind", "dto", "Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CountBlockView extends ViewGroup {
    private final int defaultBgColor;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp4;

    @NotNull
    private IconView firstIcon;

    @NotNull
    private TextAtomV2View firstTitle;

    @NotNull
    private TextAtomV2View firstValue;

    @NotNull
    private IconView secondIcon;

    @NotNull
    private TextAtomV2View secondTitle;

    @NotNull
    private TextAtomV2View secondValue;
    private final Drawable viewBackground;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountBlockView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull CountBlockDTO dto) {
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
        ImageViewExtKt.load$default(this.firstIcon, dto.getCoinsItem().getIcon(), null, null, null, null, false, null, 126, null);
        IconView iconView = this.firstIcon;
        IconDTO.IconShape iconShape = IconDTO.IconShape.SHAPE_NONE;
        iconView.setShape(iconShape);
        TextHolderKt.bind$default(this.firstValue, dto.getCoinsItem().getValue(), null, 2, null);
        TextAtomV2View textAtomV2View = this.firstTitle;
        TextHolderKt.bind$default(textAtomV2View, dto.getCoinsItem().getText(), null, 2, null);
        textAtomV2View.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textAtomV2View.setEllipsize(truncateAt);
        ImageViewExtKt.load$default(this.secondIcon, dto.getTicketsItem().getIcon(), null, null, null, null, false, null, 126, null);
        this.secondIcon.setShape(iconShape);
        TextHolderKt.bind$default(this.secondValue, dto.getTicketsItem().getValue(), null, 2, null);
        TextAtomV2View textAtomV2View2 = this.secondTitle;
        TextHolderKt.bind$default(textAtomV2View2, dto.getTicketsItem().getText(), null, 2, null);
        textAtomV2View2.setMaxLines(1);
        textAtomV2View2.setEllipsize(truncateAt);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        IconView iconView = this.firstIcon;
        int i11 = this.dp16;
        int top = this.firstValue.getTop();
        int i12 = this.dp16;
        iconView.layout(i11, top, i12 + i12, this.firstValue.getBottom());
        LayoutExtKt.layoutLeftTop(this.firstValue, this.firstIcon.getRight() + this.dp4, this.dp12);
        LayoutExtKt.layoutLeftTop(this.firstTitle, this.firstValue.getRight() + this.dp4, this.dp12);
        IconView iconView2 = this.secondIcon;
        int i13 = this.dp16;
        int top2 = this.secondValue.getTop();
        int i14 = this.dp16;
        iconView2.layout(i13, top2, i14 + i14, this.secondValue.getBottom());
        LayoutExtKt.layoutLeftTop(this.secondValue, this.secondIcon.getRight() + this.dp4, this.firstTitle.getBottom() + this.dp2);
        LayoutExtKt.layoutLeftTop(this.secondTitle, this.secondValue.getRight() + this.dp4, this.firstTitle.getBottom() + this.dp2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        IconView iconView = this.firstIcon;
        int i11 = this.dp16;
        MeasureExtKt.measureExactly(iconView, i11, i11);
        MeasureExtKt.measureUnspecified(this.firstTitle);
        MeasureExtKt.measure(this.firstValue, widthMeasureSpec - this.dp16, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        IconView iconView2 = this.secondIcon;
        int i12 = this.dp16;
        MeasureExtKt.measureExactly(iconView2, i12, i12);
        MeasureExtKt.measureUnspecified(this.secondTitle);
        MeasureExtKt.measure(this.secondValue, widthMeasureSpec - this.dp16, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        setMeasuredDimension(size, this.secondTitle.getMeasuredHeight() + this.firstTitle.getMeasuredHeight() + (this.dp12 * 2) + this.dp2);
    }

    public /* synthetic */ CountBlockView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountBlockView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp2 = ResourceExtKt.toPx(2);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.defaultBgColor = context.getColor(R$color.layer_surface);
        Drawable a11 = C7232a.a(context, R$drawable.bg_megadraw_cell_block);
        this.viewBackground = a11;
        this.firstValue = new TextAtomV2View(context, null, 0, 6, null);
        this.firstTitle = new TextAtomV2View(context, null, 0, 6, null);
        this.firstIcon = new IconView(context, null, 0, 6, null);
        this.secondValue = new TextAtomV2View(context, null, 0, 6, null);
        this.secondTitle = new TextAtomV2View(context, null, 0, 6, null);
        this.secondIcon = new IconView(context, null, 0, 6, null);
        setBackground(a11);
        addView(this.firstIcon);
        addView(this.firstValue);
        addView(this.firstTitle);
        addView(this.secondIcon);
        addView(this.secondValue);
        addView(this.secondTitle);
    }
}
