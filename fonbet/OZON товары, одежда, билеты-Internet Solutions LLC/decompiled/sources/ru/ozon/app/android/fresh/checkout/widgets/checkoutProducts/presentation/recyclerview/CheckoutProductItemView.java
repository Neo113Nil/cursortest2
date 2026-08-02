package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.recyclerview;

import Bi.b;
import Kk.C3531a;
import Sc.o;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import au.ViewOnClickListenerC5489a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.domain.CheckoutProductsVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d2\n\u0010\"\u001a\u00060 j\u0002`!¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO;", "images", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;", "imagesPlacementType", "", "setupImages", "(Ljava/util/List;Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;)V", "iconIndex", "Lru/ozon/uni/android/atom/icon/IconView;", "view", "tryBindIcon", "(Ljava/util/List;ILru/ozon/uni/android/atom/icon/IconView;)V", "productMediaIndex", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "tryBindProductMedia", "(Ljava/util/List;ILru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;)V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "firstProductMediaView", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "secondProductMediaView", "thirdProductMediaView", "thirdIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Landroid/view/View;", "clickView", "Landroid/view/View;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutProductItemView extends ConstraintLayout {

    @NotNull
    private final View clickView;

    @NotNull
    private final ProductMediaView firstProductMediaView;

    @NotNull
    private final ProductMediaView secondProductMediaView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final IconView thirdIconView;

    @NotNull
    private final ProductMediaView thirdProductMediaView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int IMAGE_SIZE = UiExtKt.toPx(44);
    private static final int VERTICAL_PADDING = UiExtKt.toPx(12);
    private static final int HORIZONTAL_PADDING = UiExtKt.toPx(16);
    private static final int IMAGES_MARGIN = UiExtKt.toPx(4);
    private static final int END_TEXT_MARGIN = UiExtKt.toPx(8);
    private static final int TOP_SUBTITLE_MARGIN = UiExtKt.toPx(2);
    private static final int HORIZONTAL_DOT_MARGIN = UiExtKt.toPx(6);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemView$Companion;", "", "<init>", "()V", "", "END_TEXT_MARGIN", "I", "getEND_TEXT_MARGIN", "()I", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getEND_TEXT_MARGIN() {
            return CheckoutProductItemView.END_TEXT_MARGIN;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutProductsVO.ImagesPlacementType.values().length];
            try {
                iArr[CheckoutProductsVO.ImagesPlacementType.SINGLE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutProductsVO.ImagesPlacementType.TWO_IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutProductsVO.ImagesPlacementType.THREE_IMAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutProductsVO.ImagesPlacementType.THREE_IMAGES_ICON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CheckoutProductItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$22(CheckoutProductsVO.ProductSplitVO productSplitVO, Function1 function1, l lVar, View view) {
        AtomAction clickAction = productSplitVO.getClickAction();
        if (clickAction != null) {
            function1.invoke(clickAction);
        }
        t trackingInfo = productSplitVO.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, trackingInfo, null, 2, null);
        }
    }

    private final void setupImages(List<? extends CheckoutProductsVO.ImageVO> images, CheckoutProductsVO.ImagesPlacementType imagesPlacementType) {
        int id2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[imagesPlacementType.ordinal()];
        if (i11 == 1) {
            tryBindProductMedia(images, 0, this.thirdProductMediaView);
            ViewExtKt.gone(this.secondProductMediaView);
            ViewExtKt.gone(this.firstProductMediaView);
            id2 = this.thirdProductMediaView.getId();
        } else if (i11 == 2) {
            tryBindProductMedia(images, 0, this.thirdProductMediaView);
            tryBindProductMedia(images, 1, this.secondProductMediaView);
            ViewExtKt.gone(this.firstProductMediaView);
            id2 = this.secondProductMediaView.getId();
        } else if (i11 == 3) {
            tryBindProductMedia(images, 0, this.thirdProductMediaView);
            tryBindProductMedia(images, 1, this.secondProductMediaView);
            tryBindProductMedia(images, 2, this.firstProductMediaView);
            id2 = this.firstProductMediaView.getId();
        } else {
            if (i11 != 4) {
                throw new o();
            }
            tryBindIcon(images, 2, this.thirdIconView);
            tryBindProductMedia(images, 1, this.secondProductMediaView);
            tryBindProductMedia(images, 0, this.firstProductMediaView);
            id2 = this.firstProductMediaView.getId();
        }
        ConstraintLayoutExtKt.updateConstraints(this, new CheckoutProductItemView$setupImages$1(this, id2));
    }

    private final void tryBindIcon(List<? extends CheckoutProductsVO.ImageVO> list, int i11, IconView iconView) {
        Object Q11 = C7714v.Q(i11, list);
        CheckoutProductsVO.ImageVO.CheckoutIconVO checkoutIconVO = Q11 instanceof CheckoutProductsVO.ImageVO.CheckoutIconVO ? (CheckoutProductsVO.ImageVO.CheckoutIconVO) Q11 : null;
        if (checkoutIconVO == null) {
            return;
        }
        IconHolderKt.bind$default(iconView, checkoutIconVO.getIcon(), null, 2, null);
    }

    private final void tryBindProductMedia(List<? extends CheckoutProductsVO.ImageVO> list, int i11, ProductMediaView productMediaView) {
        Object Q11 = C7714v.Q(i11, list);
        CheckoutProductsVO.ImageVO.CheckoutProductMediaVO checkoutProductMediaVO = Q11 instanceof CheckoutProductsVO.ImageVO.CheckoutProductMediaVO ? (CheckoutProductsVO.ImageVO.CheckoutProductMediaVO) Q11 : null;
        if (checkoutProductMediaVO == null) {
            return;
        }
        productMediaView.bind(checkoutProductMediaVO.getProductMedia());
    }

    public final void bind(@NotNull CheckoutProductsVO.ProductSplitVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        setupImages(item.getImages(), item.getImagesPlacementType());
        this.clickView.setOnClickListener(new ViewOnClickListenerC5489a(item, actionHandler, tokenizedAnalytics, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutProductItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i13 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.titleView, 0, -2);
        d11.f41656t = 0;
        d11.f41636i = R$id.firstImageView;
        d11.f41640k = R$id.subtitleView;
        d11.f41599F = 1.0f;
        d11.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.subtitleView, 0, -2);
        d12.f41656t = 0;
        d12.f41638j = R$id.titleView;
        d12.f41642l = R$id.firstImageView;
        ((ViewGroup.MarginLayoutParams) d12).topMargin = TOP_SUBTITLE_MARGIN;
        ((ViewGroup.MarginLayoutParams) d12).rightMargin = HORIZONTAL_DOT_MARGIN;
        d12.f41599F = 0.0f;
        d12.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        ProductMediaView productMediaView = new ProductMediaView(context, null, i13, i12, defaultConstructorMarker);
        productMediaView.setId(R$id.firstImageView);
        int i14 = IMAGE_SIZE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i14, i14);
        int i15 = R$id.secondImageView;
        bVar.f41636i = i15;
        bVar.f41642l = i15;
        bVar.f41657u = i15;
        int i16 = IMAGES_MARGIN;
        bVar.setMarginEnd(i16);
        productMediaView.setLayoutParams(bVar);
        addView(productMediaView);
        this.firstProductMediaView = productMediaView;
        ProductMediaView productMediaView2 = new ProductMediaView(context, null, i13, i12, defaultConstructorMarker);
        productMediaView2.setId(R$id.secondImageView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(i14, i14);
        int i17 = R$id.thirdProductMediaView;
        bVar2.f41636i = i17;
        bVar2.f41642l = i17;
        bVar2.f41657u = i17;
        bVar2.setMarginEnd(i16);
        productMediaView2.setLayoutParams(bVar2);
        addView(productMediaView2);
        this.secondProductMediaView = productMediaView2;
        AttributeSet attributeSet2 = null;
        ProductMediaView productMediaView3 = new ProductMediaView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        productMediaView3.setId(R$id.thirdProductMediaView);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(i14, i14);
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        bVar3.f41658v = 0;
        productMediaView3.setLayoutParams(bVar3);
        addView(productMediaView3);
        this.thirdProductMediaView = productMediaView3;
        IconView iconView = new IconView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.thirdIconView, i14, i14);
        a11.f41636i = 0;
        a11.f41642l = 0;
        a11.f41658v = 0;
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.thirdIconView = iconView;
        View view = new View(context);
        view.setId(R$id.clickView);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, 0);
        bVar4.f41636i = 0;
        bVar4.f41658v = 0;
        bVar4.f41642l = 0;
        bVar4.f41656t = 0;
        view.setLayoutParams(bVar4);
        addView(view);
        this.clickView = view;
        setId(R$id.checkoutProductItemView);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i18 = HORIZONTAL_PADDING;
        int i19 = VERTICAL_PADDING;
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding(this, i18, i19, i18, i19);
    }
}
