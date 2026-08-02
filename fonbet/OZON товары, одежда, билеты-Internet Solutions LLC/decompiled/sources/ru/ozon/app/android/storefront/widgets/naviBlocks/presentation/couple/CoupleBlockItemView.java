package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple;

import Ar.c;
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
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u001aR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00100R\u0016\u00107\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleBlockItemView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "newItem", "bind", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;)V", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "getItem", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "setItem", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;", "itemPosition", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;", "getItemPosition", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;", "setItemPosition", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/ItemPosition;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "dp8", "I", "dp16", "", "itemCornerRadius", "F", "defaultBackgroundColor", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "titleDisclosure", "Lru/ozon/uni/android/atom/icon/IconView;", "subtitleView", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoupleBlockItemView extends ViewGroup {
    private final Drawable backgroundDrawable;
    private final int defaultBackgroundColor;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final ImageView imageView;
    private CoupleNaviBlockVO.NaviBlockItemVO item;
    private final float itemCornerRadius;

    @NotNull
    private ItemPosition itemPosition;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final IconView titleDisclosure;

    @NotNull
    private final TextAtomV2View titleView;

    public /* synthetic */ CoupleBlockItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(CoupleBlockItemView coupleBlockItemView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        CoupleNaviBlockVO.NaviBlockItemVO naviBlockItemVO = coupleBlockItemView.item;
        if (naviBlockItemVO == null || (action = naviBlockItemVO.getAction()) == null || (function1 = coupleBlockItemView.onAction) == null) {
            return;
        }
        function1.invoke(action);
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
        ViewGroup.LayoutParams layoutParams = this.titleView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int measuredHeight = this.titleView.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = this.subtitleView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i11 = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + measuredHeight;
        int i12 = right - left;
        int measuredWidth = i12 - this.imageView.getMeasuredWidth();
        TextAtomV2View textAtomV2View = this.titleView;
        ViewGroup.LayoutParams layoutParams3 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i13 = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i14 = marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0;
        ViewGroup.LayoutParams layoutParams5 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        textAtomV2View.layout(i13, i14, textAtomV2View.getMeasuredWidth() + (marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0), measuredHeight);
        int bottom2 = this.titleView.getBottom() - (this.titleView.getMeasuredHeight() / 2);
        this.titleDisclosure.layout(this.titleView.getRight(), bottom2 - (this.titleDisclosure.getMeasuredHeight() / 2), this.titleDisclosure.getMeasuredWidth() + this.titleView.getRight(), (this.titleDisclosure.getMeasuredHeight() / 2) + bottom2);
        TextAtomV2View textAtomV2View2 = this.subtitleView;
        ViewGroup.LayoutParams layoutParams6 = textAtomV2View2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        int i15 = marginLayoutParams6 != null ? marginLayoutParams6.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams7 = textAtomV2View2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
        textAtomV2View2.layout(i15, i11, textAtomV2View2.getMeasuredWidth() + (marginLayoutParams7 != null ? marginLayoutParams7.leftMargin : 0), textAtomV2View2.getMeasuredHeight() + i11);
        this.imageView.layout(measuredWidth, 0, i12, bottom - top);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        int i11 = (int) (defaultSize / 2.1d);
        if (this.titleDisclosure.getVisibility() == 0) {
            MeasureExtKt.measureUnspecified(this.titleDisclosure);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize / 3, 1073741824);
        int measuredWidth = this.imageView.getVisibility() == 0 ? makeMeasureSpec : this.titleDisclosure.getMeasuredWidth();
        int i12 = this.imageView.getVisibility() == 0 ? makeMeasureSpec : 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(defaultSize - measuredWidth, LinearLayoutManager.INVALID_OFFSET);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(defaultSize - i12, LinearLayoutManager.INVALID_OFFSET);
        measureChildWithMargins(this.titleView, makeMeasureSpec2, 0, heightMeasureSpec, 0);
        measureChildWithMargins(this.subtitleView, makeMeasureSpec3, 0, heightMeasureSpec, 0);
        this.imageView.measure(makeMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(defaultSize, i11);
    }

    public final void setItemPosition(@NotNull ItemPosition itemPosition) {
        Intrinsics.checkNotNullParameter(itemPosition, "<set-?>");
        this.itemPosition = itemPosition;
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoupleBlockItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemPosition = ItemPosition.TOP;
        int px = ResourceExtKt.toPx(2);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(16);
        this.itemCornerRadius = pxF;
        this.defaultBackgroundColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        Drawable drawable = a.getDrawable(context, R$drawable.couple_block_bg);
        this.backgroundDrawable = drawable;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        textAtomV2View.setId(R$id.coupleBlockTitleView);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(px2, px2, 0, 0);
        textAtomV2View.setLayoutParams(marginLayoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        IconView iconView = new IconView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        iconView.setId(R$id.coupleBlockTitleDisclosureView);
        iconView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        this.titleDisclosure = iconView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        textAtomV2View2.setId(R$id.coupleBlockSubtitleView);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(px2, px, 0, 0);
        textAtomV2View2.setLayoutParams(marginLayoutParams2);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleView = textAtomV2View2;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.coupleBlockImageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(pxF);
        gradientDrawable.setColor(-1);
        setForeground(new RippleDrawable(valueOf, null, gradientDrawable));
        setBackground(drawable);
        setClipToOutline(true);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(imageView);
        addView(iconView);
        setOnClickListener(new c(this, 10));
    }
}
