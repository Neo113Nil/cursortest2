package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.item;

import Bi.b;
import De.C2860c;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.domain.DetailedCheckoutProductsVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.presentation.FreshTextPairView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001EB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\"\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010>\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "leftTitleMargin", "bindTitle", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;I)I", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "subtitle", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindSubtitle", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;Lkotlin/jvm/functions/Function1;)I", "radius", "", "colorToken", "bindBackground", "(ILjava/lang/String;)V", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;", "spacers", "titleId", "subtitleId", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$TextBoxType;", "textBoxType", "bindSpacers", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;ILjava/lang/Integer;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$TextBoxType;)V", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem;", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem;Lkotlin/jvm/functions/Function1;)V", "tileBackgroundColor", "I", "getTileBackgroundColor", "()I", "setTileBackgroundColor", "(I)V", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/presentation/FreshTextPairView;", "pairTitleView", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/presentation/FreshTextPairView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "subtitleView", "productQuantityView", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable$delegate", "LSc/j;", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailedCheckoutProductItemView extends ConstraintLayout {

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final Image imageView;

    @NotNull
    private final FreshTextPairView pairTitleView;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final TextAtomV2View productQuantityView;

    @NotNull
    private final TextAtomV2View subtitleView;
    private int tileBackgroundColor;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final CornerRadius imageCornerRadius = CornerRadius.RADIUS_400;

    @NotNull
    private static final UniColors defaultImageBackgroundColor = UniColors.BG_LIGHT_KEY;
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
    private static final int productQuantityWidth = UiExtKt.toPx(46);
    private static final int rightTextPadding = UiExtKt.toPx(8);
    private static final int leftBadgeMargin = UiExtKt.toPx(-8);
    private static final int imageSize = UiExtKt.toPx(60);
    private static final int betweenMargin = UiExtKt.toPx(2);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductItemView$Companion;", "", "<init>", "()V", "", "rightTextPadding", "I", "getRightTextPadding", "()I", "leftBadgeMargin", "getLeftBadgeMargin", "betweenMargin", "getBetweenMargin", "", "LEFT_BIAS", "F", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBetweenMargin() {
            return DetailedCheckoutProductItemView.betweenMargin;
        }

        public final int getLeftBadgeMargin() {
            return DetailedCheckoutProductItemView.leftBadgeMargin;
        }

        public final int getRightTextPadding() {
            return DetailedCheckoutProductItemView.rightTextPadding;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DetailedCheckoutProductItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(int radius, String colorToken) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.tileBackgroundColor = styleParser.parseColor(context, colorToken, defaultImageBackgroundColor.getResId());
        getBackgroundDrawable().setCornerRadius(UiExtKt.toPxF(radius));
        GradientDrawable backgroundDrawable = getBackgroundDrawable();
        int i11 = this.tileBackgroundColor;
        backgroundDrawable.setColors(new int[]{i11, i11});
        setBackground(getBackgroundDrawable());
    }

    private final void bindSpacers(DetailedCheckoutProductsVO.TileItem.Spacers spacers, int titleId, Integer subtitleId, DetailedCheckoutProductsVO.TileItem.TextBoxType textBoxType) {
        setPadding(spacers.getHorizontal(), spacers.getVertical(), spacers.getHorizontal(), spacers.getVertical());
        ConstraintLayoutExtKt.updateConstraints(this, new DetailedCheckoutProductItemView$bindSpacers$1(textBoxType, titleId, this, subtitleId));
    }

    private final int bindSubtitle(DetailedCheckoutProductsVO.SubtitleVO subtitle, Function1<? super AtomAction, Unit> actionHandler) {
        if (subtitle instanceof DetailedCheckoutProductsVO.SubtitleVO.TextAtom) {
            TextHolderKt.bindOrGone$default(this.subtitleView, ((DetailedCheckoutProductsVO.SubtitleVO.TextAtom) subtitle).getText(), null, 2, null);
            return this.subtitleView.getId();
        }
        if (!(subtitle instanceof DetailedCheckoutProductsVO.SubtitleVO.Badge)) {
            throw new o();
        }
        BadgeHolderKt.bindOrGone(this.badgeView, ((DetailedCheckoutProductsVO.SubtitleVO.Badge) subtitle).getBadge(), actionHandler);
        return this.badgeView.getId();
    }

    private final int bindTitle(DetailedCheckoutProductsVO.TitleVO title, int leftTitleMargin) {
        if (title instanceof DetailedCheckoutProductsVO.TitleVO.TextAtom) {
            TextHolderKt.bind$default(this.titleView, ((DetailedCheckoutProductsVO.TitleVO.TextAtom) title).getText(), null, 2, null);
            TextAtomV2View textAtomV2View = this.titleView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = leftTitleMargin;
            textAtomV2View.setLayoutParams(marginLayoutParams);
            return this.titleView.getId();
        }
        if (!(title instanceof DetailedCheckoutProductsVO.TitleVO.TextPair)) {
            throw new o();
        }
        this.pairTitleView.bindOrGone(((DetailedCheckoutProductsVO.TitleVO.TextPair) title).getTextPair());
        FreshTextPairView freshTextPairView = this.pairTitleView;
        ViewGroup.LayoutParams layoutParams2 = freshTextPairView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.leftMargin = leftTitleMargin;
        freshTextPairView.setLayoutParams(marginLayoutParams2);
        return this.pairTitleView.getId();
    }

    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.backgroundDrawable.getValue();
    }

    public final void bind(@NotNull DetailedCheckoutProductsVO.TileItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ImageHolderKt.bindOrGone$default(this.imageView, new ImageDTO(item.getImage(), defaultImageBackgroundColor.getToken(), null, true, null, null, null, null, imageCornerRadius, null, null, null, null, null, ImageDTO.FitType.FIT_CENTER, null, 48884, null), null, 2, null);
        TextDTO productQuantity = item.getProductQuantity();
        if (productQuantity != null) {
            TextHolderKt.bind$default(this.productQuantityView, productQuantity, null, 2, null);
            this.productQuantityView.setVisibility(0);
        } else {
            ViewExtKt.invisible(this.productQuantityView);
        }
        PriceAtomHolderKt.bindOrGone$default(this.priceView, item.getPrice(), null, 2, null);
        bindBackground(item.getRadius(), item.getBackgroundColor());
        int bindTitle = bindTitle(item.getTitle(), item.getSpacers().getBetween());
        DetailedCheckoutProductsVO.SubtitleVO subtitle = item.getSubtitle();
        bindSpacers(item.getSpacers(), bindTitle, subtitle != null ? Integer.valueOf(bindSubtitle(subtitle, actionHandler)) : null, item.getTextBoxType());
    }

    public final int getTileBackgroundColor() {
        return this.tileBackgroundColor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DetailedCheckoutProductItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tileBackgroundColor = a.getColor(context, defaultBackgroundColor);
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.checkoutDetailedImage);
        int i12 = imageSize;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i12, i12);
        bVar.f41636i = 0;
        bVar.f41628e = 0;
        image.setLayoutParams(bVar);
        addView(image);
        this.imageView = image;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.checkoutDetailedPrice, -2, -2);
        b11.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) b11).rightMargin = rightTextPadding;
        priceAtomView.setLayoutParams(b11);
        addView(priceAtomView);
        this.priceView = priceAtomView;
        FreshTextPairView freshTextPairView = new FreshTextPairView(context, null, 2, 0 == true ? 1 : 0);
        freshTextPairView.setId(R$id.checkoutDetailedTitlePair);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41658v = 0;
        bVar2.f41655s = image.getId();
        bVar2.f41598E = 0.0f;
        int i13 = betweenMargin;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = i13;
        freshTextPairView.setLayoutParams(bVar2);
        TextViewExtKt.setTextCopyable(freshTextPairView, false);
        addView(freshTextPairView);
        this.pairTitleView = freshTextPairView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.checkoutDetailedTitle, 0, -2);
        d11.f41655s = image.getId();
        d11.f41658v = 0;
        d11.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = i13;
        textAtomV2View.setLayoutParams(d11);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = com.google.android.gms.internal.mlkit_common.a.a(badgeView, R$id.checkoutDetailedBadge, -2, -2);
        ((ViewGroup.MarginLayoutParams) a11).topMargin = i13;
        a11.f41598E = 0.0f;
        badgeView.setLayoutParams(a11);
        addView(badgeView);
        this.badgeView = badgeView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.checkoutDetailedSubtitle, 0, -2);
        ((ViewGroup.MarginLayoutParams) d12).topMargin = i13;
        d12.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(d12);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d13 = b.d(textAtomV2View3, R$id.checkoutDetailedQuantity, -2, -2);
        d13.f41636i = 0;
        d13.f41658v = 0;
        d13.f41642l = 0;
        textAtomV2View3.setMinWidth(productQuantityWidth);
        textAtomV2View3.setLayoutParams(d13);
        TextViewExtKt.setTextCopyable(textAtomV2View3, false);
        addView(textAtomV2View3);
        this.productQuantityView = textAtomV2View3;
        this.backgroundDrawable = k.b(new DetailedCheckoutProductItemView$backgroundDrawable$2(this));
    }
}
