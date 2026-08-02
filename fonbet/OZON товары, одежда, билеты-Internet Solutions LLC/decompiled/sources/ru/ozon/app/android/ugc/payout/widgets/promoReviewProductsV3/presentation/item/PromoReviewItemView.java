package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import B90.C2618u;
import Bi.b;
import Kk.C3531a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.payout.R$id;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c0 J\u0010\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u00020\u001c2\b\b\u0002\u0010)\u001a\u00020*H\u0002J$\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c0 H\u0002J5\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c0 H\u0002¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020\u001c2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u0016H\u0002J&\u00107\u001a\u00020\u001c2\b\u00108\u001a\u0004\u0018\u0001092\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c0 H\u0002J \u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "containerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "productImageView", "Lru/ozon/uni/android/atom/image/Image;", "timerTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextView", "pointsContainer", "Landroid/widget/LinearLayout;", "reviewButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "rightBottomIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "bottomViews", "", "Landroid/view/View;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "timerBackgroundDrawable", "bind", "", "item", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindTimer", DynamicElementDTO.TIMER, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "setBackground", "backgroundColor", "", "setBottomPadding", "hasTopPaddingCell", "", "bindProduct", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;", "bindPointsCell", "pointsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "topPadding", "", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "bindPoints", "points", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$PointVO;", "bindReviewButton", "reviewButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "createBackgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "colorToken", "defaultColorResId", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "Companion", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoReviewItemView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int itemDefaultPadding;
    private static final int widgetHorizontalPadding;
    private Drawable backgroundDrawable;

    @NotNull
    private final List<View> bottomViews;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final ConstraintLayout containerView;

    @NotNull
    private final LinearLayout pointsContainer;

    @NotNull
    private final Image productImageView;

    @NotNull
    private final ButtonV3View reviewButtonView;

    @NotNull
    private final IconView rightBottomIconView;
    private Drawable timerBackgroundDrawable;

    @NotNull
    private final TextAtomV2View timerTextView;

    @NotNull
    private final TextAtomV2View titleTextView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemView$Companion;", "", "<init>", "()V", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        widgetHorizontalPadding = dimens.getDP_16();
        itemDefaultPadding = dimens.getDP_12();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoReviewItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        constraintLayout.setPadding(0, itemDefaultPadding, 0, 0);
        addView(constraintLayout);
        this.containerView = constraintLayout;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.promoReviewProductImage);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        Dimens dimens = Dimens.INSTANCE;
        bVar.setMarginStart(dimens.getDP_12());
        image.setLayoutParams(bVar);
        constraintLayout.addView(image);
        this.productImageView = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.promoReviewProductTimer, -2, -2);
        d11.f41636i = 0;
        d11.f41658v = 0;
        d11.setMarginEnd(dimens.getDP_12());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        constraintLayout.addView(textAtomV2View);
        this.timerTextView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.promoReviewProductTitle, 0, -2);
        d12.f41636i = image.getId();
        d12.f41642l = image.getId();
        d12.f41655s = image.getId();
        d12.f41657u = textAtomV2View.getId();
        d12.setMarginStart(dimens.getDP_10());
        d12.setMarginEnd(dimens.getDP_12());
        d12.f41595B = dimens.getDP_12();
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        constraintLayout.addView(textAtomV2View2);
        this.titleTextView = textAtomV2View2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.promoReviewProductPoints);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41638j = image.getId();
        bVar2.setMargins(dimens.getDP_12(), dimens.getDP_12(), dimens.getDP_12(), 0);
        linearLayout.setLayoutParams(bVar2);
        constraintLayout.addView(linearLayout);
        this.pointsContainer = linearLayout;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.promoReviewProductReviewButton, 0, -2);
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41642l = 0;
        e11.f41638j = linearLayout.getId();
        e11.setMargins(dimens.getDP_12(), dimens.getDP_12(), dimens.getDP_12(), 0);
        buttonV3View.setLayoutParams(e11);
        constraintLayout.addView(buttonV3View);
        this.reviewButtonView = buttonV3View;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.promoReviewProductCell);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        bVar3.f41638j = linearLayout.getId();
        bVar3.setMargins(dimens.getDP_12(), 0, dimens.getDP_12(), 0);
        cellView.setLayoutParams(bVar3);
        constraintLayout.addView(cellView);
        this.cellView = cellView;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.promoReviewProductReviewIcon, -2, -2);
        a11.f41658v = 0;
        a11.f41642l = 0;
        a11.setMargins(0, 0, dimens.getDP_6(), dimens.getDP_6());
        iconView.setLayoutParams(a11);
        constraintLayout.addView(iconView);
        this.rightBottomIconView = iconView;
        this.bottomViews = C7714v.b0(iconView, cellView, buttonV3View, linearLayout);
        int i11 = widgetHorizontalPadding;
        setPadding(i11, 0, i11, 0);
        setBackgroundColor(a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
    }

    private final void bindPoints(List<PromoReviewItemVO.PointVO> points) {
        boolean z11 = points != null && points.size() > 1;
        ViewExtKt.showOrGone(this.pointsContainer, Boolean.valueOf(z11));
        if (z11 && points != null) {
            int size = ((getResources().getDisplayMetrics().widthPixels - (widgetHorizontalPadding * 2)) - (itemDefaultPadding * 2)) / points.size();
            LinearLayout linearLayout = this.pointsContainer;
            linearLayout.removeAllViews();
            int i11 = 0;
            for (Object obj : points) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                PromoReviewItemVO.PointVO pointVO = (PromoReviewItemVO.PointVO) obj;
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                PromoReviewPointView promoReviewPointView = new PromoReviewPointView(context);
                promoReviewPointView.setLayoutParams(new LinearLayout.LayoutParams(size, -2));
                promoReviewPointView.bindPoint(pointVO, i11 != C7714v.P(points));
                linearLayout.addView(promoReviewPointView);
                i11 = i12;
            }
        }
    }

    private final void bindPointsCell(CellDTO pointsCell, Integer topPadding, Function1<? super AtomAction, Unit> actionHandler) {
        CellView cellView = this.cellView;
        if (pointsCell != null) {
            pointsCell.setTagSupported(true);
        } else {
            pointsCell = null;
        }
        CellHolderKt.bindOrGone(cellView, pointsCell, actionHandler);
        if (topPadding != null) {
            int intValue = topPadding.intValue();
            CellView cellView2 = this.cellView;
            ViewGroup.LayoutParams layoutParams = cellView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = intValue;
            cellView2.setLayoutParams(bVar);
        }
    }

    private final void bindProduct(PromoReviewItemVO.ProductVO product, Function1<? super AtomAction, Unit> actionHandler) {
        ImageHolderKt.bind$default(this.productImageView, product.getImage(), null, 2, null);
        ru.ozon.app.android.pdp.utils.ViewExtKt.bindClickAction(this.productImageView, product.getAction(), actionHandler);
        TextHolderKt.bind$default(this.titleTextView, product.getTitle(), null, 2, null);
        ru.ozon.app.android.pdp.utils.ViewExtKt.bindClickAction(this.titleTextView, product.getAction(), actionHandler);
    }

    private final void bindReviewButton(ButtonV3DTO reviewButton, Function1<? super AtomAction, Unit> actionHandler) {
        ButtonV3HolderKt.bindOrGone(this.reviewButtonView, reviewButton, actionHandler);
        if (this.rightBottomIconView.getVisibility() == 0) {
            ButtonV3View buttonV3View = this.reviewButtonView;
            ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = Dimens.INSTANCE.getDP_12();
            buttonV3View.setLayoutParams(bVar);
        }
    }

    private final ShapeDrawable createBackgroundDrawable(String colorToken, int defaultColorResId, CornerRadius cornerRadius) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(cornerRadius.getPx());
        CornersConfig cornersConfig = CornersConfig.ALL;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return ContextExtKt.createRoundRectShape$default(context, pxF, cornersConfig, 0, styleParser.parseColor(context2, colorToken, defaultColorResId), null, 20, null);
    }

    private final void setBackground(String backgroundColor) {
        if (this.backgroundDrawable == null) {
            this.backgroundDrawable = createBackgroundDrawable(backgroundColor, UniColors.GREEN_400.getResId(), CornerRadius.RADIUS_550);
        }
        this.containerView.setBackground(this.backgroundDrawable);
    }

    private final void setBottomPadding(boolean hasTopPaddingCell) {
        Object obj;
        int dp_12;
        Iterator<T> it = this.bottomViews.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (ViewExtKt.isVisible((View) obj)) {
                    break;
                }
            }
        }
        View view = (View) obj;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (hasTopPaddingCell) {
            dp_12 = Dimens.INSTANCE.getDP_12();
        } else {
            int i11 = R$id.promoReviewProductCell;
            if (valueOf != null && valueOf.intValue() == i11) {
                dp_12 = Dimens.INSTANCE.getDP_4();
            } else {
                int i12 = R$id.promoReviewProductPoints;
                if (valueOf != null && valueOf.intValue() == i12) {
                    dp_12 = Dimens.INSTANCE.getDP_16();
                } else {
                    dp_12 = (valueOf != null && valueOf.intValue() == R$id.promoReviewProductReviewIcon) ? 0 : Dimens.INSTANCE.getDP_12();
                }
            }
        }
        ViewExtKt.updatePadding$default(this.containerView, 0, 0, 0, dp_12, 7, null);
    }

    public final void bind(@NotNull PromoReviewItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (item.getAction() != null) {
            ru.ozon.app.android.pdp.utils.ViewExtKt.bindClickAction(this.containerView, item.getAction(), actionHandler);
        } else {
            this.containerView.setOnClickListener(null);
        }
        setBackground(item.getBackgroundColor());
        bindProduct(item.getProduct(), actionHandler);
        bindTimer(item.getTimer());
        bindPointsCell(item.getPointsCell(), item.getTopPaddingCell(), actionHandler);
        bindPoints(item.getPoints());
        IconHolderKt.bindOrGone$default(this.rightBottomIconView, item.getRightBottomIcon(), null, 2, null);
        bindReviewButton(item.getReviewButton(), actionHandler);
        setBottomPadding(item.getTopPaddingCell() != null);
    }

    public final void bindTimer(PromoReviewItemVO.TimerVO timer) {
        if (timer == null) {
            ViewExtKt.gone(this.timerTextView);
            return;
        }
        ViewExtKt.show(this.timerTextView);
        if (this.timerBackgroundDrawable == null) {
            this.timerBackgroundDrawable = createBackgroundDrawable(timer.getBackgroundColor(), UniColors.BG_MARKETING_PRIMARY.getResId(), timer.getCornerRadius());
        }
        this.timerTextView.setBackground(this.timerBackgroundDrawable);
        TextHolderKt.bind$default(this.timerTextView, timer.getTimer(), null, 2, null);
    }
}
