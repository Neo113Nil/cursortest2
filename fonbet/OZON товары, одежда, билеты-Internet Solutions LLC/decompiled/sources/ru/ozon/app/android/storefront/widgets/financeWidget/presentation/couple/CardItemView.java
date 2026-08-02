package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple;

import CG.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001EB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0004\u0018\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/CardItemView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "color", "", "setBackground", "(Ljava/lang/String;)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "item", "bindPromoState", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;)V", "bindBalanceState", "getBalanceIconSpace", "()I", "getSubtitleSpace", "getTitleTopMargin", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "isCompactSize", "bind", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;Z)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "imageHeight", "I", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "chevronIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "balanceTextView", "balanceIcon", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonPlusView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "isPromo", "Z", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardItemView extends ViewGroup {
    private final Drawable backgroundDrawable;

    @NotNull
    private final IconView balanceIcon;

    @NotNull
    private final TextAtomV2View balanceTextView;

    @NotNull
    private final IconView chevronIcon;

    @NotNull
    private final IconButtonV3View iconButtonPlusView;
    private int imageHeight;

    @NotNull
    private final Image imageView;
    private boolean isPromo;
    private ItemVO item;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final TextAtomV2View titleView;
    public static final int $stable = 8;
    private static final int balancePadding = ResourceExtKt.toPx(4);
    private static final int dp2 = ResourceExtKt.toPx(2);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int imageHeightLarge = ResourceExtKt.toPx(60);
    private static final int imageHeightCompact = ResourceExtKt.toPx(50);

    public /* synthetic */ CardItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(CardItemView cardItemView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        ItemVO itemVO = cardItemView.item;
        if (itemVO == null || (action = itemVO.getAction()) == null || (function1 = cardItemView.onAction) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindBalanceState(ItemVO item) {
        FinanceWidgetDTO.ItemDTO.BalanceState balanceState = item.getBalanceState();
        if (balanceState == null) {
            return;
        }
        setId(R$id.coupleBalanceCard);
        setPadding(dp12, 0, dp8, 0);
        ViewExtKt.gone(this.imageView);
        IconButtonV3HolderKt.bindOrGone(this.iconButtonPlusView, balanceState.getRightActionButton(), this.onAction);
        this.titleView.setId(R$id.f108oupleBalanceTitle);
        TextHolderKt.bind$default(this.titleView, balanceState.getTitle(), null, 2, null);
        IconHolderKt.bind$default(this.chevronIcon, balanceState.getChevronIcon(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.balanceIcon, balanceState.getBalanceIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.balanceTextView, balanceState.getBalance(), null, 2, null);
    }

    private final void bindPromoState(ItemVO item) {
        FinanceWidgetDTO.ItemDTO.PromoState promoState = item.getPromoState();
        if (promoState == null) {
            return;
        }
        setId(R$id.couplePromoCard);
        setPadding(dp12, 0, 0, 0);
        ViewExtKt.gone(this.balanceTextView);
        ViewExtKt.gone(this.balanceIcon);
        ViewExtKt.gone(this.chevronIcon);
        ViewExtKt.gone(this.iconButtonPlusView);
        this.titleView.setId(R$id.f110ouplePromoTitle);
        TextHolderKt.bind$default(this.titleView, promoState.getTitle(), null, 2, null);
        ImageHolderKt.bindOrGone$default(this.imageView, promoState.getImage(), null, 2, null);
    }

    private final int getBalanceIconSpace() {
        if (this.balanceIcon.getVisibility() == 0) {
            return this.balanceIcon.getMeasuredWidth() + balancePadding;
        }
        return 0;
    }

    private final int getSubtitleSpace() {
        if (this.balanceTextView.getVisibility() == 8) {
            return 0;
        }
        return this.balanceTextView.getMeasuredHeight() + dp2;
    }

    private final int getTitleTopMargin() {
        return (this.imageHeight - (this.titleView.getMeasuredHeight() + getSubtitleSpace())) / 2;
    }

    private final void setBackground(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, color, UniColors.BG_PRIMARY.getResId());
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            drawable.setTint(parseColor);
        }
    }

    public final void bind(@NotNull ItemVO item, boolean isCompactSize) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        setBackground(item.getBackgroundColor());
        this.imageHeight = isCompactSize ? imageHeightCompact : imageHeightLarge;
        boolean z11 = item.getPromoState() != null;
        this.isPromo = z11;
        if (z11) {
            bindPromoState(item);
        } else if (item.getBalanceState() != null) {
            bindBalanceState(item);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        LayoutExtKt.layoutLeftTop(this.titleView, getPaddingLeft(), getTitleTopMargin());
        int measuredHeight = ((this.titleView.getMeasuredHeight() - this.chevronIcon.getMeasuredHeight()) / 2) + this.titleView.getTop();
        View ifNotGone = ViewExtKt.getIfNotGone(this.chevronIcon);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, this.titleView.getRight() + dp2, measuredHeight);
        }
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.balanceIcon);
        if (ifNotGone2 != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone2, getPaddingLeft(), this.titleView.getBottom() + dp2);
        }
        View ifNotGone3 = ViewExtKt.getIfNotGone(this.balanceTextView);
        if (ifNotGone3 != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone3, getPaddingLeft() + getBalanceIconSpace(), this.titleView.getBottom() + dp2);
        }
        int measuredHeight2 = (getMeasuredHeight() - this.iconButtonPlusView.getMeasuredHeight()) / 2;
        View ifNotGone4 = ViewExtKt.getIfNotGone(this.iconButtonPlusView);
        if (ifNotGone4 != null) {
            LayoutExtKt.layoutRightTop(ifNotGone4, getMeasuredWidth() - getPaddingEnd(), measuredHeight2);
        }
        View ifNotGone5 = ViewExtKt.getIfNotGone(this.imageView);
        if (ifNotGone5 != null) {
            LayoutExtKt.layoutRightTop(ifNotGone5, getMeasuredWidth(), 0);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.isPromo) {
            MeasureExtKt.measure(this.titleView, (size - getPaddingStart()) - this.imageHeight, LinearLayoutManager.INVALID_OFFSET, 0, 0);
            Image image = this.imageView;
            int i11 = this.imageHeight;
            MeasureExtKt.measureExactly(image, i11, i11);
        } else {
            MeasureExtKt.measureUnspecified(this.chevronIcon);
            MeasureExtKt.measureUnspecified(this.iconButtonPlusView);
            int measuredWidth = this.iconButtonPlusView.getVisibility() == 0 ? this.iconButtonPlusView.getMeasuredWidth() : 0;
            int paddingStart = (((size - getPaddingStart()) - getPaddingEnd()) - measuredWidth) - (this.chevronIcon.getMeasuredWidth() + dp2);
            MeasureExtKt.measureUnspecified(this.balanceIcon);
            int paddingStart2 = (((size - getPaddingStart()) - getPaddingEnd()) - measuredWidth) - getBalanceIconSpace();
            MeasureExtKt.measure(this.titleView, paddingStart, LinearLayoutManager.INVALID_OFFSET, 0, 0);
            MeasureExtKt.measure(this.balanceTextView, paddingStart2, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        }
        setMeasuredDimension(size, this.imageHeight);
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = a.getDrawable(context, R$drawable.finance_rounded_block_16dp);
        this.backgroundDrawable = drawable;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setMovementMethod(null);
        this.titleView = textAtomV2View;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        IconView iconView = new IconView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        iconView.setId(R$id.f104oupleBalanceChevron);
        this.chevronIcon = iconView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        textAtomV2View2.setId(R$id.f107oupleBalanceSubtitle);
        textAtomV2View2.setTextIsSelectable(false);
        textAtomV2View2.setMovementMethod(null);
        this.balanceTextView = textAtomV2View2;
        IconView iconView2 = new IconView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        iconView2.setId(R$id.f105oupleBalanceIcon);
        this.balanceIcon = iconView2;
        Image image = new Image(context, attributeSet2, i12, i13, defaultConstructorMarker);
        image.setId(R$id.f109ouplePromoImage);
        this.imageView = image;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, attributeSet2, i12, 0, 14, null);
        iconButtonV3View.setId(R$id.f106oupleBalanceRightPlusButton);
        this.iconButtonPlusView = iconButtonV3View;
        setBackground(drawable);
        setClipToOutline(true);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(image);
        addView(iconView);
        addView(iconView2);
        addView(iconButtonV3View);
        setOnClickListener(new b(this, 8));
    }
}
