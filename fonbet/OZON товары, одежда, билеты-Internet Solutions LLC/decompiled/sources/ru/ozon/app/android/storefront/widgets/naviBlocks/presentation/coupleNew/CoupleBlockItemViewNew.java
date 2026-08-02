package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.coupleNew;

import Am.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.ItemPosition;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0004\u0018\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/coupleNew/CoupleBlockItemViewNew;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMaxTitleDisclosureHeight", "()I", "getTopBottomMargin", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "newItem", "bind", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;)V", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;", "itemPosition", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;", "getItemPosition", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;", "setItemPosition", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;)V", "defaultBackgroundColor", "I", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "titleDisclosure", "Lru/ozon/uni/android/atom/icon/IconView;", "subtitleView", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoupleBlockItemViewNew extends ViewGroup {
    private final Drawable backgroundDrawable;
    private final int defaultBackgroundColor;

    @NotNull
    private final ImageView imageView;
    private CoupleNaviBlockVO.NaviBlockItemVO item;

    @NotNull
    private ItemPosition itemPosition;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final IconView titleDisclosure;

    @NotNull
    private final TextAtomV2View titleView;
    public static final int $stable = 8;
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int blockHeight = ResourceExtKt.toPx(60);
    private static final float itemCornerRadius = ResourceExtKt.toPxF(16);

    public /* synthetic */ CoupleBlockItemViewNew(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(CoupleBlockItemViewNew coupleBlockItemViewNew, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        CoupleNaviBlockVO.NaviBlockItemVO naviBlockItemVO = coupleBlockItemViewNew.item;
        if (naviBlockItemVO == null || (action = naviBlockItemVO.getAction()) == null || (function1 = coupleBlockItemViewNew.onAction) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final int getMaxTitleDisclosureHeight() {
        return this.titleDisclosure.getVisibility() == 8 ? this.titleView.getMeasuredHeight() : Math.max(this.titleView.getMeasuredHeight(), this.titleDisclosure.getMeasuredHeight());
    }

    private final int getTopBottomMargin() {
        return (blockHeight - (this.subtitleView.getMeasuredHeight() + getMaxTitleDisclosureHeight())) / 2;
    }

    public final void bind(@NotNull CoupleNaviBlockVO.NaviBlockItemVO newItem) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        this.item = newItem;
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, newItem.getBackgroundColor());
            drawable.setTint(parseColor != null ? parseColor.intValue() : this.defaultBackgroundColor);
        }
        TextHolderKt.bind$default(this.titleView, newItem.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, newItem.getSubtitle(), null, 2, null);
        ImageView imageView = this.imageView;
        String image = newItem.getImage();
        imageView.setVisibility(image == null || image.length() == 0 ? 8 : 0);
        String image2 = newItem.getImage();
        if (image2 != null) {
            ImageViewExtKt.load$default(this.imageView, image2, null, null, null, null, false, null, 126, null);
        }
        IconHolderKt.bindOrGone$default(this.titleDisclosure, newItem.getTitleDisclosure(), null, 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredWidth = (int) (getMeasuredWidth() * 0.75d);
        int topBottomMargin = getTopBottomMargin();
        TextAtomV2View textAtomV2View = this.titleView;
        int i11 = dp16;
        LayoutExtKt.layoutLeftTop(textAtomV2View, i11, topBottomMargin);
        View ifNotGone = ViewExtKt.getIfNotGone(this.titleDisclosure);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, this.titleView.getRight(), topBottomMargin);
        }
        LayoutExtKt.layoutLeftTop(this.subtitleView, i11, topBottomMargin + getMaxTitleDisclosureHeight());
        LayoutExtKt.layoutLeftTop(this.imageView, measuredWidth, 0);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.titleDisclosure.getVisibility() == 0) {
            MeasureExtKt.measureUnspecified(this.titleDisclosure);
        }
        int i11 = (int) (size * 0.25d);
        int measuredWidth = this.imageView.getVisibility() == 0 ? i11 : this.titleDisclosure.getMeasuredWidth();
        int i12 = this.imageView.getVisibility() == 0 ? i11 : 0;
        int i13 = dp16;
        MeasureExtKt.measure(this.titleView, (size - measuredWidth) - i13, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.subtitleView, (size - i12) - i13, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        ImageView imageView = this.imageView;
        int i14 = blockHeight;
        MeasureExtKt.measureExactly(imageView, i11, i14);
        setMeasuredDimension(size, i14);
    }

    public final void setItemPosition(@NotNull ItemPosition itemPosition) {
        Intrinsics.checkNotNullParameter(itemPosition, "<set-?>");
        this.itemPosition = itemPosition;
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoupleBlockItemViewNew(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemPosition = ItemPosition.TOP;
        this.defaultBackgroundColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        Drawable drawable = a.getDrawable(context, R$drawable.couple_block_bg);
        this.backgroundDrawable = drawable;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.coupleBlockTitleView);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.coupleBlockTitleDisclosureView);
        this.titleDisclosure = iconView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.coupleBlockSubtitleView);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleView = textAtomV2View2;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.coupleBlockImageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(itemCornerRadius);
        gradientDrawable.setColor(-1);
        setForeground(new RippleDrawable(valueOf, null, gradientDrawable));
        setBackground(drawable);
        setClipToOutline(true);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(imageView);
        addView(iconView);
        setOnClickListener(new b(this, 14));
    }
}
