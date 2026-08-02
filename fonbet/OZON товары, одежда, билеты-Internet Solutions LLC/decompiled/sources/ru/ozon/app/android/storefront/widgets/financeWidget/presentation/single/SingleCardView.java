package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.single;

import Nt.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple.ItemVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 R2\u00020\u0001:\u0001RB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010%\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0016\u0010,\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR0\u0010L\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u000e\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/single/SingleCardView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "backgroundColor", "widgetBackgroundColor", "spanIndex", "", "setBackground", "(Ljava/lang/String;Ljava/lang/String;I)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "item", "bindPromoState", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;)V", "bindBalanceState", "getBalanceIconSpace", "()I", "getImageLeft", "getChevronTop", "getImageTop", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/single/SingleCardVO;", "singleCardVO", "bind", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/single/SingleCardVO;)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "isPromo", "Z", "imageHeight", "I", "blockHeight", "margins", "leftMargin", "Landroid/graphics/drawable/ShapeDrawable;", "topDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "bottomDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "chevronIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "balanceTextView", "balanceIcon", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bottomButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleCardView extends ViewGroup {
    private static final int balancePadding;
    private static final int blockHeightCompact;
    private static final int blockHeightLarge;
    private static final float cornerRadius;
    private static final int dp12;
    private static final int dp4;
    private static final int dp8;
    private static final int imageHeightCompact;
    private static final int imageHeightLarge;
    private static final int imageMargin;

    @NotNull
    private final LayerDrawable backgroundDrawable;

    @NotNull
    private final IconView balanceIcon;

    @NotNull
    private final TextAtomV2View balanceTextView;
    private int blockHeight;

    @NotNull
    private final ButtonV3View bottomButtonView;

    @NotNull
    private final GradientDrawable bottomDrawable;

    @NotNull
    private final IconView chevronIcon;
    private int imageHeight;

    @NotNull
    private final Image imageView;
    private boolean isPromo;
    private ItemVO item;
    private int leftMargin;
    private final int margins;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private final ShapeDrawable topDrawable;
    public static final int $stable = 8;
    private static final int dp2 = ResourceExtKt.toPx(2);

    static {
        int px = ResourceExtKt.toPx(4);
        dp4 = px;
        imageMargin = px;
        balancePadding = px;
        dp12 = ResourceExtKt.toPx(12);
        dp8 = ResourceExtKt.toPx(8);
        imageHeightLarge = ResourceExtKt.toPx(60);
        imageHeightCompact = ResourceExtKt.toPx(50);
        cornerRadius = ResourceExtKt.toPxF(16);
        blockHeightLarge = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN);
        blockHeightCompact = ResourceExtKt.toPx(108);
    }

    public /* synthetic */ SingleCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(SingleCardView singleCardView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        ItemVO itemVO = singleCardView.item;
        if (itemVO == null || (action = itemVO.getAction()) == null || (function1 = singleCardView.onAction) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindBalanceState(ItemVO item) {
        FinanceWidgetDTO.ItemDTO.BalanceState balanceState;
        if (item == null || (balanceState = item.getBalanceState()) == null) {
            return;
        }
        int i11 = dp12;
        setPadding(i11, i11, i11, 0);
        setId(R$id.singleBalanceCard);
        ViewExtKt.gone(this.imageView);
        this.titleView.setId(R$id.singleBalanceTitle);
        TextHolderKt.bind$default(this.titleView, balanceState.getTitle(), null, 2, null);
        IconHolderKt.bind$default(this.chevronIcon, balanceState.getChevronIcon(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.balanceIcon, balanceState.getBalanceIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.balanceTextView, balanceState.getBalance(), null, 2, null);
        ButtonV3HolderKt.bindOrGone(this.bottomButtonView, balanceState.getBottomActionButton(), this.onAction);
    }

    private final void bindPromoState(ItemVO item) {
        FinanceWidgetDTO.ItemDTO.PromoState promoState;
        if (item == null || (promoState = item.getPromoState()) == null) {
            return;
        }
        int i11 = dp12;
        setPadding(i11, 0, i11, 0);
        setId(R$id.singlePromoCard);
        ViewExtKt.gone(this.balanceTextView);
        ViewExtKt.gone(this.balanceIcon);
        ViewExtKt.gone(this.chevronIcon);
        this.titleView.setId(R$id.singlePromoTitle);
        TextHolderKt.bind$default(this.titleView, promoState.getTitle(), null, 2, null);
        ImageHolderKt.bind$default(this.imageView, promoState.getImage(), null, 2, null);
        ViewExtKt.gone(this.bottomButtonView);
    }

    private final int getBalanceIconSpace() {
        if (this.balanceIcon.getVisibility() == 0) {
            return this.balanceIcon.getMeasuredWidth() + balancePadding;
        }
        return 0;
    }

    private final int getChevronTop() {
        return ((this.titleView.getMeasuredHeight() - this.chevronIcon.getMeasuredHeight()) / 2) + this.titleView.getTop();
    }

    private final int getImageLeft() {
        return (((getMeasuredWidth() - this.margins) - this.imageView.getMeasuredWidth()) / 2) + this.leftMargin;
    }

    private final int getImageTop() {
        return (getMeasuredHeight() - ((this.titleView.getMeasuredHeight() + this.imageView.getMeasuredHeight()) + imageMargin)) / 2;
    }

    private final void setBackground(String backgroundColor, String widgetBackgroundColor, int spanIndex) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, backgroundColor, UniColors.BG_PRIMARY.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context2, widgetBackgroundColor, UniColors.LAYER_FLOOR_1.getResId());
        if (spanIndex == 0) {
            this.backgroundDrawable.setLayerInset(1, dp8, 0, dp4, 0);
        } else {
            this.backgroundDrawable.setLayerInset(1, dp4, 0, dp8, 0);
        }
        this.bottomDrawable.setTint(parseColor2);
        this.topDrawable.setTint(parseColor);
        setBackground(this.backgroundDrawable);
    }

    public final void bind(@NotNull SingleCardVO singleCardVO) {
        Intrinsics.checkNotNullParameter(singleCardVO, "singleCardVO");
        this.item = singleCardVO.getItem();
        this.imageHeight = singleCardVO.getIsCompactSize() ? imageHeightCompact : imageHeightLarge;
        this.blockHeight = singleCardVO.getIsCompactSize() ? blockHeightCompact : blockHeightLarge;
        this.leftMargin = singleCardVO.getSpanIndex() == 0 ? dp8 : dp4;
        ItemVO itemVO = this.item;
        setBackground(itemVO != null ? itemVO.getBackgroundColor() : null, singleCardVO.getWidgetBackgroundColor(), singleCardVO.getSpanIndex());
        boolean z11 = singleCardVO.getItem().getPromoState() != null;
        this.isPromo = z11;
        if (z11) {
            bindPromoState(this.item);
            return;
        }
        ItemVO itemVO2 = this.item;
        if ((itemVO2 != null ? itemVO2.getBalanceState() : null) != null) {
            bindBalanceState(this.item);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.isPromo) {
            LayoutExtKt.layoutLeftTop(this.imageView, getImageLeft(), getImageTop());
            LayoutExtKt.layoutLeftTop(this.titleView, getPaddingStart() + this.leftMargin, this.imageView.getBottom() + imageMargin);
            return;
        }
        LayoutExtKt.layoutLeftTop(this.titleView, getPaddingStart() + this.leftMargin, getPaddingTop());
        IconView iconView = this.chevronIcon;
        int right2 = this.titleView.getRight();
        int i11 = dp2;
        LayoutExtKt.layoutLeftTop(iconView, right2 + i11, getChevronTop());
        View ifNotGone = ViewExtKt.getIfNotGone(this.balanceIcon);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, this.titleView.getLeft(), this.titleView.getBottom() + i11);
        }
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.balanceTextView);
        if (ifNotGone2 != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone2, this.titleView.getLeft() + getBalanceIconSpace(), this.titleView.getBottom() + i11);
        }
        View ifNotGone3 = ViewExtKt.getIfNotGone(this.bottomButtonView);
        if (ifNotGone3 != null) {
            LayoutExtKt.layoutLeftBottom(ifNotGone3, this.titleView.getLeft(), getMeasuredHeight() - dp12);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingEnd = getPaddingEnd() + getPaddingStart() + this.margins;
        if (this.isPromo) {
            MeasureExtKt.measure(this.titleView, size - paddingEnd, 1073741824, 0, 0);
            Image image = this.imageView;
            int i11 = this.imageHeight;
            MeasureExtKt.measureExactly(image, i11, i11);
        } else {
            MeasureExtKt.measureUnspecified(this.chevronIcon);
            MeasureExtKt.measureUnspecified(this.balanceIcon);
            int measuredWidth = (size - (this.chevronIcon.getMeasuredWidth() + dp2)) - paddingEnd;
            int balanceIconSpace = (size - getBalanceIconSpace()) - paddingEnd;
            MeasureExtKt.measure(this.titleView, measuredWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
            MeasureExtKt.measure(this.balanceTextView, balanceIconSpace, LinearLayoutManager.INVALID_OFFSET, 0, 0);
            MeasureExtKt.measure(this.bottomButtonView, size - paddingEnd, 1073741824, 0, 0);
        }
        setMeasuredDimension(size, this.blockHeight);
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.margins = dp8 + dp4;
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = cornerRadius;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.topDrawable = shapeDrawable;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.bottomDrawable = gradientDrawable;
        this.backgroundDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, shapeDrawable});
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        int i14 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i13, i14, defaultConstructorMarker);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setMovementMethod(null);
        this.titleView = textAtomV2View;
        IconView iconView = new IconView(context, attributeSet2, i13, i14, defaultConstructorMarker);
        iconView.setId(R$id.singleBalanceChevron);
        this.chevronIcon = iconView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i13, i14, defaultConstructorMarker);
        textAtomV2View2.setId(R$id.singleBalanceSubtitle);
        textAtomV2View2.setTextIsSelectable(false);
        textAtomV2View2.setMovementMethod(null);
        this.balanceTextView = textAtomV2View2;
        IconView iconView2 = new IconView(context, attributeSet2, i13, i14, defaultConstructorMarker);
        iconView2.setId(R$id.singleBalanceIcon);
        this.balanceIcon = iconView2;
        Image image = new Image(context, attributeSet2, i13, i14, defaultConstructorMarker);
        image.setId(R$id.singlePromoImage);
        this.imageView = image;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, i13, 0, 14, null);
        buttonV3View.setId(R$id.singleBalanceBottomButton);
        this.bottomButtonView = buttonV3View;
        setClipToOutline(true);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(image);
        addView(iconView);
        addView(iconView2);
        addView(buttonV3View);
        setOnClickListener(new a(this, 4));
    }
}
