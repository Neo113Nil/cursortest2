package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import Am.b;
import Sc.o;
import W10.c;
import WZ.l;
import X4.a;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselEmptyItemBinding;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselItemBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model.ComparisonCarouselVO;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 v2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001vBU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b(\u0010\u0017J*\u0010.\u001a\u00020\t2\u0006\u0010%\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\u00020\t*\u0002002\u0006\u0010\u001a\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\t*\u0002002\b\u0010%\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\t*\u0002002\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J%\u0010>\u001a\u00020\t*\u0002002\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010=\u001a\u00020*H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010B\u001a\u00020\t*\u00020@2\u0006\u0010\u001a\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010FJ;\u0010J\u001a\u00020\t*\u0002002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\bJ\u0010KJ#\u0010M\u001a\u00020\t*\u00020L2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u001bH\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u00020\t*\u00020@2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020\t*\u0002002\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bQ\u0010RJ\u001b\u0010U\u001a\u00020\t*\u0002002\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u001b\u0010W\u001a\u00020\t*\u0002002\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bW\u0010VJ\u000f\u0010X\u001a\u00020\tH\u0002¢\u0006\u0004\bX\u0010\u0017J#\u0010Z\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001d2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bZ\u0010[J\u001b\u0010Z\u001a\u00020\t*\u00020L2\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\bZ\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010]R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010^R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010_R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010`R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010aR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010bR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010cR\u0014\u0010d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010g\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010eR\u0014\u0010h\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010eR\u0014\u0010i\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010eR\u0016\u0010l\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010mR\u0016\u0010n\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0016\u0010o\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010jR*\u0010u\u001a\u0010\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010t¨\u0006w"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselProductViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "LX4/a;", "binding", "productFavDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "LW10/c;", "trackingData", "Lkotlin/Function0;", "Lru/ozon/composer/ui/widget/l;", "widgetViewItemProvider", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "LWZ/l;", "tokenizedAnalytics", "<init>", "(LX4/a;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;Lkotlin/jvm/functions/Function1;LW10/c;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/cart/ui/CartAtomBinder;LWZ/l;)V", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType;", "item", "", "scalingPercent", "", "calculatedContainerHeight", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType;FI)V", "height", "applyTransformationsToViewHolder", "(FI)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$ComparedProduct;", "bindProduct", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$ComparedProduct;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$AddToCartButton;", "bindAddToCartButton", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$AddToCartButton;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButton", "bindSmallButton", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons$NotifyButton;", "notifyButton", "favoriteButton", "bindNotifyButton", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons$NotifyButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselEmptyItemBinding;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;", "bindEmptyState", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselEmptyItemBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;)V", "data", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "imageScale", "textScale", "translation", "applyTransformationsToComparedProductViewHolder", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;FFFFI)V", "Landroid/view/View;", "applyTransformation", "(Landroid/view/View;FF)V", "applyTransformationsToEmptyProductViewHolder", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselEmptyItemBinding;FFFFI)V", "swapTitleMaxLines", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;F)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleAtom", "setupTitleTextAtom", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetComparisonCarouselItemBinding;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "calculateTitleTextHeight", "navigateToProductPage", "view", "applyHeight", "(ILandroid/view/View;)V", "(Landroid/view/View;I)V", "LX4/a;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lkotlin/jvm/functions/Function1;", "LW10/c;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "LWZ/l;", "maxTranslation", "F", "maxEmptyTranslation", "translationScalingConst", "emptyTranslationScalingConst", "darkThemeRadius", "I", "currentScalingPercent", "currentContainerHeight", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType;", "titleMaxLines", "collapsedTitleMaxLinesDefault", "", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonCarouselProductViewHolder extends j implements FavoriteProductDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final a binding;

    @NotNull
    private final CartAtomBinder cartAtomBinder;
    private int collapsedTitleMaxLinesDefault;
    private int currentContainerHeight;
    private float currentScalingPercent;
    private final int darkThemeRadius;
    private final float emptyTranslationScalingConst;
    private ComparisonCarouselVO.CarouselVO.ProductViewType item;
    private final float maxEmptyTranslation;
    private final float maxTranslation;

    @NotNull
    private final Function1<AtomAction, Unit> onAtomAction;

    @NotNull
    private final FavoriteProductDelegate productFavDelegate;
    private int titleMaxLines;

    @NotNull
    private final l tokenizedAnalytics;
    private final c trackingData;
    private final float translationScalingConst;

    @NotNull
    private final Function0<ru.ozon.composer.ui.widget.l> widgetViewItemProvider;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselProductViewHolder$Companion;", "", "<init>", "()V", "IMAGE_TRANSLATION_COEFFICIENT", "", "TITLE_MAX_LINES_DEFAULT", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ComparisonCarouselProductViewHolder(@NotNull a binding, @NotNull FavoriteProductDelegate productFavDelegate, @NotNull Function1<? super AtomAction, Unit> onAtomAction, c cVar, @NotNull Function0<ru.ozon.composer.ui.widget.l> widgetViewItemProvider, @NotNull CartAtomBinder cartAtomBinder, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(productFavDelegate, "productFavDelegate");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        View constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.productFavDelegate = productFavDelegate;
        this.onAtomAction = onAtomAction;
        this.trackingData = cVar;
        this.widgetViewItemProvider = widgetViewItemProvider;
        this.cartAtomBinder = cartAtomBinder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.maxTranslation = ResourceExtKt.toPxF(78);
        this.maxEmptyTranslation = ResourceExtKt.toPxF(59);
        this.translationScalingConst = ResourceExtKt.toPxF(85);
        this.emptyTranslationScalingConst = ResourceExtKt.toPxF(63);
        this.darkThemeRadius = ResourceExtKt.toPx(10);
        this.currentScalingPercent = 1.0f;
        this.collapsedTitleMaxLinesDefault = 2;
    }

    private final void applyHeight(int height, View view) {
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        applyHeight(itemView, height);
        View constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        applyHeight(constraintLayout, height);
        if (view != null) {
            applyHeight(view, height);
        }
    }

    static /* synthetic */ void applyHeight$default(ComparisonCarouselProductViewHolder comparisonCarouselProductViewHolder, int i11, View view, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            view = null;
        }
        comparisonCarouselProductViewHolder.applyHeight(i11, view);
    }

    private final void applyTransformation(View view, float f7, float f11) {
        view.setAlpha(f7);
        view.setTranslationY(f11);
    }

    private final void applyTransformationsToComparedProductViewHolder(PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, float f7, float f11, float f12, float f13, int i11) {
        applyHeight(i11, pdpWidgetComparisonCarouselItemBinding.compareProductsCL);
        swapTitleMaxLines(pdpWidgetComparisonCarouselItemBinding, f7);
        ImageView imageView = pdpWidgetComparisonCarouselItemBinding.productImageIV;
        if (imageView.getPivotX() != imageView.getX()) {
            imageView.setPivotX(imageView.getX());
        }
        if (imageView.getPivotY() != imageView.getY()) {
            imageView.setPivotY(imageView.getY());
        }
        imageView.setTranslationY(0.12f * f13);
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        PriceView pricePv = pdpWidgetComparisonCarouselItemBinding.pricePv;
        Intrinsics.checkNotNullExpressionValue(pricePv, "pricePv");
        applyTransformation(pricePv, f7, f13);
        SingleAtom buttonSa = pdpWidgetComparisonCarouselItemBinding.buttonSa;
        Intrinsics.checkNotNullExpressionValue(buttonSa, "buttonSa");
        applyTransformation(buttonSa, f7, f13);
        SmallIconButtonView subscribeButtonSibv = pdpWidgetComparisonCarouselItemBinding.subscribeButtonSibv;
        Intrinsics.checkNotNullExpressionValue(subscribeButtonSibv, "subscribeButtonSibv");
        applyTransformation(subscribeButtonSibv, f7, f13);
        pdpWidgetComparisonCarouselItemBinding.favouriteButtonPFMBV.setAlpha(f7);
        pdpWidgetComparisonCarouselItemBinding.secondSmallButtonSIBV.setAlpha(f7);
        pdpWidgetComparisonCarouselItemBinding.collapsedStateIndexTV.setAlpha(Math.abs(f7 - 1));
        TextAtomV2View textAtomV2View = pdpWidgetComparisonCarouselItemBinding.productTitleTav;
        if (textAtomV2View.getPivotX() != textAtomV2View.getX()) {
            textAtomV2View.setPivotX(textAtomV2View.getX());
        }
        if (textAtomV2View.getPivotY() != textAtomV2View.getY()) {
            textAtomV2View.setPivotY(textAtomV2View.getY());
        }
        textAtomV2View.setScaleX(f12);
        textAtomV2View.setScaleY(f12);
        textAtomV2View.setTranslationY(f13);
    }

    private final void applyTransformationsToEmptyProductViewHolder(PdpWidgetComparisonCarouselEmptyItemBinding pdpWidgetComparisonCarouselEmptyItemBinding, float f7, float f11, float f12, float f13, int i11) {
        applyHeight(i11, pdpWidgetComparisonCarouselEmptyItemBinding.compareProductsEmptyStateCL);
        double d11 = f7;
        float f14 = (0.95d > d11 || d11 > 1.0d) ? (0.1d > d11 || d11 > 0.95d) ? -this.maxEmptyTranslation : (f7 - 1) * this.emptyTranslationScalingConst : 0.0f;
        ImageView imageView = pdpWidgetComparisonCarouselEmptyItemBinding.emptyStateImageIV;
        if (imageView.getPivotX() != imageView.getX()) {
            imageView.setPivotX(imageView.getX());
        }
        if (imageView.getPivotY() != imageView.getY()) {
            imageView.setPivotY(imageView.getY());
        }
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setTranslationY(f12 * 0.12f);
        SingleAtom singleAtom = pdpWidgetComparisonCarouselEmptyItemBinding.emptyStateButtonSA;
        if (singleAtom.getPivotX() != singleAtom.getX()) {
            singleAtom.setPivotX(singleAtom.getX());
        }
        if (singleAtom.getPivotY() != singleAtom.getY()) {
            singleAtom.setPivotY(singleAtom.getY());
        }
        singleAtom.setScaleX(f13);
        singleAtom.setScaleY(f13);
        singleAtom.setTranslationY(f14);
    }

    private final void bindAddToCartButton(PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, ComparisonCarouselVO.CarouselVO.Button.AddToCartButton addToCartButton) {
        if (addToCartButton == null) {
            SingleAtom buttonSa = pdpWidgetComparisonCarouselItemBinding.buttonSa;
            Intrinsics.checkNotNullExpressionValue(buttonSa, "buttonSa");
            ViewExtKt.gone(buttonSa);
            return;
        }
        pdpWidgetComparisonCarouselItemBinding.buttonSa.setContentDescription(addToCartButton.getPrimaryButton().getActiveText());
        CartAtomBinder cartAtomBinder = this.cartAtomBinder;
        SingleAtom buttonSa2 = pdpWidgetComparisonCarouselItemBinding.buttonSa;
        Intrinsics.checkNotNullExpressionValue(buttonSa2, "buttonSa");
        cartAtomBinder.init(buttonSa2, this.tokenizedAnalytics);
        CartAtomBinder cartAtomBinder2 = this.cartAtomBinder;
        SingleAtom buttonSa3 = pdpWidgetComparisonCarouselItemBinding.buttonSa;
        Intrinsics.checkNotNullExpressionValue(buttonSa3, "buttonSa");
        cartAtomBinder2.bind(buttonSa3, addToCartButton.getPrimaryButton(), this.onAtomAction, this.tokenizedAnalytics, null);
        SingleAtom buttonSa4 = pdpWidgetComparisonCarouselItemBinding.buttonSa;
        Intrinsics.checkNotNullExpressionValue(buttonSa4, "buttonSa");
        ViewExtKt.show(buttonSa4);
    }

    private final void bindEmptyState(PdpWidgetComparisonCarouselEmptyItemBinding pdpWidgetComparisonCarouselEmptyItemBinding, ComparisonCarouselVO.CarouselVO.ProductViewType.EmptyProductVO emptyProductVO) {
        ImageView imageView = pdpWidgetComparisonCarouselEmptyItemBinding.emptyStateImageIV;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            ImageViewExtKt.setBackgroundVectorDrawable(imageView, R$drawable.bg_all_corners_rounded_white_overlay);
            ThemeExtKt.setParandjaForDarkTheme(imageView);
            ThemeExtKt.setBackgroundParanjaForDarkTheme(imageView);
            ru.ozon.app.android.pikazon.extensions.ImageViewExtKt.load$default(imageView, emptyProductVO.getImage(), C7714v.a0(new ImageTransformation.Blur(20, 1)), null, null, null, false, null, 124, null);
        } else {
            imageView.setColorFilter((ColorFilter) null);
            imageView.setBackground(null);
            imageView.setBackgroundColor(0);
            ru.ozon.app.android.pikazon.extensions.ImageViewExtKt.load$default(imageView, emptyProductVO.getImage(), C7714v.b0(new ImageTransformation.Blur(20, 1), new ImageTransformation.RoundedCorners(0, null, 3, null)), null, null, null, false, null, 124, null);
        }
        SingleAtom singleAtom = pdpWidgetComparisonCarouselEmptyItemBinding.emptyStateButtonSA;
        SingleAtom.bind$default(singleAtom, emptyProductVO.getButton(), false, 2, null);
        View childAt = singleAtom.getChildAt(0);
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setTextAlignment(2);
        }
        singleAtom.setOnAction(this.onAtomAction);
        float f7 = this.currentScalingPercent;
        if (f7 == 1.0f) {
            return;
        }
        applyTransformationsToViewHolder(f7, this.currentContainerHeight);
    }

    private final void bindNotifyButton(PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, ComparisonCarouselVO.CarouselVO.Button.SmallButtons.NotifyButton notifyButton, FavoriteProductMolecule favoriteProductMolecule) {
        if (notifyButton == null) {
            SmallIconButtonView subscribeButtonSibv = pdpWidgetComparisonCarouselItemBinding.subscribeButtonSibv;
            Intrinsics.checkNotNullExpressionValue(subscribeButtonSibv, "subscribeButtonSibv");
            ViewExtKt.gone(subscribeButtonSibv);
        } else {
            SmallIconButtonView subscribeButtonSibv2 = pdpWidgetComparisonCarouselItemBinding.subscribeButtonSibv;
            Intrinsics.checkNotNullExpressionValue(subscribeButtonSibv2, "subscribeButtonSibv");
            WrappedIconButtonHolderKt.bind(subscribeButtonSibv2, notifyButton.getIsSubscribed() ? notifyButton.getUnsubscribeButton() : notifyButton.getSubscribeButton(), new ComparisonCarouselProductViewHolder$bindNotifyButton$1$1(favoriteProductMolecule, pdpWidgetComparisonCarouselItemBinding, this));
            SmallIconButtonView subscribeButtonSibv3 = pdpWidgetComparisonCarouselItemBinding.subscribeButtonSibv;
            Intrinsics.checkNotNullExpressionValue(subscribeButtonSibv3, "subscribeButtonSibv");
            ViewExtKt.show(subscribeButtonSibv3);
        }
    }

    private final void bindProduct(PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct comparedProduct) {
        BadgeView badgeContainerBv = pdpWidgetComparisonCarouselItemBinding.badgeContainerBv;
        Intrinsics.checkNotNullExpressionValue(badgeContainerBv, "badgeContainerBv");
        BadgeHolderKt.bindOrGone$default(badgeContainerBv, comparedProduct.getBadge(), (Function1) null, 2, (Object) null);
        ImageView imageView = pdpWidgetComparisonCarouselItemBinding.productImageIV;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            ru.ozon.app.android.pikazon.extensions.ImageViewExtKt.load$default(imageView, comparedProduct.getImage(), C7714v.a0(new ImageTransformation.RoundedCorners(this.darkThemeRadius, null, 2, null)), null, null, null, false, null, 124, null);
            ImageViewExtKt.setBackgroundVectorDrawable(imageView, R$drawable.bg_all_corners_rounded_white_overlay);
            ThemeExtKt.setParandjaForDarkTheme(imageView);
            ThemeExtKt.setBackgroundParanjaForDarkTheme(imageView);
        } else {
            imageView.setColorFilter((ColorFilter) null);
            imageView.setBackground(null);
            imageView.setBackgroundColor(0);
            ru.ozon.app.android.pikazon.extensions.ImageViewExtKt.load$default(imageView, comparedProduct.getImage(), null, null, null, null, false, null, 126, null);
        }
        imageView.setOnClickListener(new b(this, 12));
        PriceView priceView = pdpWidgetComparisonCarouselItemBinding.pricePv;
        Intrinsics.f(priceView);
        PriceHolderKt.bind$default(priceView, comparedProduct.getPrice(), null, 2, null);
        priceView.setContentDescription(String.valueOf(comparedProduct.getPrice().getPrice()));
        priceView.setOnClickListener(new FK.a(this, 11));
        IconButtonV3View secondSmallButtonSIBV = pdpWidgetComparisonCarouselItemBinding.secondSmallButtonSIBV;
        Intrinsics.checkNotNullExpressionValue(secondSmallButtonSIBV, "secondSmallButtonSIBV");
        IconButtonV3HolderKt.bind(secondSmallButtonSIBV, comparedProduct.getRemoveButton(), new ComparisonCarouselProductViewHolder$bindProduct$1$3(this));
        IconButtonV3View secondSmallButtonSIBV2 = pdpWidgetComparisonCarouselItemBinding.secondSmallButtonSIBV;
        Intrinsics.checkNotNullExpressionValue(secondSmallButtonSIBV2, "secondSmallButtonSIBV");
        secondSmallButtonSIBV2.setPadding(0, 0, 0, 0);
        FavoriteProductDelegate favoriteProductDelegate = this.productFavDelegate;
        ProductFavoriteMoleculeButtonView favouriteButtonPFMBV = pdpWidgetComparisonCarouselItemBinding.favouriteButtonPFMBV;
        Intrinsics.checkNotNullExpressionValue(favouriteButtonPFMBV, "favouriteButtonPFMBV");
        favoriteProductDelegate.bindFavoriteProductButton(favouriteButtonPFMBV, FavoriteProductMolecule.copy$default(comparedProduct.getFavoriteButton(), null, 0L, false, null, null, null, null, 127, null), new AnalyticData(this.trackingData, this.widgetViewItemProvider.invoke()));
        ComparisonCarouselVO.CarouselVO.Button button = comparedProduct.getButton();
        if (button instanceof ComparisonCarouselVO.CarouselVO.Button.AddToCartButton) {
            ComparisonCarouselVO.CarouselVO.Button button2 = comparedProduct.getButton();
            bindAddToCartButton(pdpWidgetComparisonCarouselItemBinding, button2 instanceof ComparisonCarouselVO.CarouselVO.Button.AddToCartButton ? (ComparisonCarouselVO.CarouselVO.Button.AddToCartButton) button2 : null);
        } else if (button instanceof ComparisonCarouselVO.CarouselVO.Button.SmallButtons) {
            ComparisonCarouselVO.CarouselVO.Button button3 = comparedProduct.getButton();
            ComparisonCarouselVO.CarouselVO.Button.SmallButtons smallButtons = button3 instanceof ComparisonCarouselVO.CarouselVO.Button.SmallButtons ? (ComparisonCarouselVO.CarouselVO.Button.SmallButtons) button3 : null;
            bindSmallButton(pdpWidgetComparisonCarouselItemBinding, smallButtons != null ? smallButtons.getSmallButton() : null);
        } else {
            SingleAtom buttonSa = pdpWidgetComparisonCarouselItemBinding.buttonSa;
            Intrinsics.checkNotNullExpressionValue(buttonSa, "buttonSa");
            ViewExtKt.gone(buttonSa);
        }
        ExtensionsKt.getExhaustive(Unit.f71690a);
        ComparisonCarouselVO.CarouselVO.Button button4 = comparedProduct.getButton();
        ComparisonCarouselVO.CarouselVO.Button.SmallButtons smallButtons2 = button4 instanceof ComparisonCarouselVO.CarouselVO.Button.SmallButtons ? (ComparisonCarouselVO.CarouselVO.Button.SmallButtons) button4 : null;
        bindNotifyButton(pdpWidgetComparisonCarouselItemBinding, smallButtons2 != null ? smallButtons2.getNotifyButton() : null, comparedProduct.getFavoriteButton());
        pdpWidgetComparisonCarouselItemBinding.indexTV.setText(comparedProduct.getPageInfo());
        pdpWidgetComparisonCarouselItemBinding.collapsedStateIndexTV.setText(comparedProduct.getPageInfo());
        if (this.currentScalingPercent != 1.0f) {
            ConstraintLayout compareProductsCL = pdpWidgetComparisonCarouselItemBinding.compareProductsCL;
            Intrinsics.checkNotNullExpressionValue(compareProductsCL, "compareProductsCL");
            if (!compareProductsCL.isLaidOut() || compareProductsCL.isLayoutRequested()) {
                compareProductsCL.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselProductViewHolder$bindProduct$lambda$6$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        ComparisonCarouselProductViewHolder comparisonCarouselProductViewHolder = ComparisonCarouselProductViewHolder.this;
                        comparisonCarouselProductViewHolder.applyTransformationsToViewHolder(comparisonCarouselProductViewHolder.currentScalingPercent, ComparisonCarouselProductViewHolder.this.currentContainerHeight);
                    }
                });
            } else {
                applyTransformationsToViewHolder(this.currentScalingPercent, this.currentContainerHeight);
            }
        }
        TextAtomV2View productTitleTav = pdpWidgetComparisonCarouselItemBinding.productTitleTav;
        Intrinsics.checkNotNullExpressionValue(productTitleTav, "productTitleTav");
        TextHolderKt.bind$default(productTitleTav, comparedProduct.getTitle(), null, 2, null);
        setupTitleTextAtom(pdpWidgetComparisonCarouselItemBinding, comparedProduct.getTitle());
    }

    private final void bindSmallButton(PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, ButtonV3Atom.SmallButton smallButton) {
        if (smallButton != null) {
            SingleAtom singleAtom = pdpWidgetComparisonCarouselItemBinding.buttonSa;
            SingleAtom.bind$default(singleAtom, smallButton, false, 2, null);
            singleAtom.setOnAction(this.onAtomAction);
            ViewExtKt.show(singleAtom);
            return;
        }
        SingleAtom buttonSa = pdpWidgetComparisonCarouselItemBinding.buttonSa;
        Intrinsics.checkNotNullExpressionValue(buttonSa, "buttonSa");
        ViewExtKt.gone(buttonSa);
        Unit unit = Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateTitleTextHeight(PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, TextDTO textDTO) {
        if (pdpWidgetComparisonCarouselItemBinding.productTitleTav.getLineHeight() * pdpWidgetComparisonCarouselItemBinding.productTitleTav.getLineCount() <= pdpWidgetComparisonCarouselItemBinding.productTitleTav.getHeight()) {
            Integer maxLines = textDTO.getMaxLines();
            this.titleMaxLines = maxLines != null ? maxLines.intValue() : 3;
        } else {
            this.titleMaxLines = 3;
            TextAtomV2View productTitleTav = pdpWidgetComparisonCarouselItemBinding.productTitleTav;
            Intrinsics.checkNotNullExpressionValue(productTitleTav, "productTitleTav");
            TextHolderKt.bind$default(productTitleTav, TextDTO.copy$default(textDTO, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, Integer.valueOf(this.titleMaxLines), 262143, null), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction data) {
        this.onAtomAction.invoke(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToProductPage() {
        ComparisonCarouselVO.CarouselVO.ProductViewType productViewType = this.item;
        ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct comparedProduct = productViewType instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct ? (ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct) productViewType : null;
        if (comparedProduct != null) {
            this.onAtomAction.invoke(new AtomAction.Click("goToProduct", comparedProduct.getDeeplink(), null, null, null, 12, null));
        }
    }

    private final void setupTitleTextAtom(final PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, final TextDTO textDTO) {
        final TextAtomV2View textAtomV2View = pdpWidgetComparisonCarouselItemBinding.productTitleTav;
        Intrinsics.f(textAtomV2View);
        G.a(textAtomV2View, new Runnable() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselProductViewHolder$setupTitleTextAtom$lambda$20$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.calculateTitleTextHeight(pdpWidgetComparisonCarouselItemBinding, textDTO);
                ComparisonCarouselProductViewHolder comparisonCarouselProductViewHolder = this;
                comparisonCarouselProductViewHolder.swapTitleMaxLines(pdpWidgetComparisonCarouselItemBinding, comparisonCarouselProductViewHolder.currentScalingPercent);
            }
        });
        textAtomV2View.setOnClickListener(new AS.a(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swapTitleMaxLines(PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, float f7) {
        Integer maxLines;
        ComparisonCarouselVO.CarouselVO.ProductViewType productViewType = this.item;
        ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct comparedProduct = productViewType instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct ? (ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct) productViewType : null;
        if (comparedProduct == null || (maxLines = comparedProduct.getTitle().getMaxLines()) == null || maxLines.intValue() < 3) {
            return;
        }
        if (f7 < 0.9f && pdpWidgetComparisonCarouselItemBinding.productTitleTav.getMaxLines() >= 3) {
            TextAtomV2View productTitleTav = pdpWidgetComparisonCarouselItemBinding.productTitleTav;
            Intrinsics.checkNotNullExpressionValue(productTitleTav, "productTitleTav");
            TextHolderKt.bind$default(productTitleTav, TextDTO.copy$default(comparedProduct.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, Integer.valueOf(this.collapsedTitleMaxLinesDefault), 262143, null), null, 2, null);
        } else {
            if (f7 <= 0.9f || pdpWidgetComparisonCarouselItemBinding.productTitleTav.getMaxLines() != 2) {
                return;
            }
            TextAtomV2View productTitleTav2 = pdpWidgetComparisonCarouselItemBinding.productTitleTav;
            Intrinsics.checkNotNullExpressionValue(productTitleTav2, "productTitleTav");
            TextHolderKt.bind$default(productTitleTav2, TextDTO.copy$default(comparedProduct.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, Integer.valueOf(this.titleMaxLines), 262143, null), null, 2, null);
        }
    }

    public final void applyTransformationsToViewHolder(float scalingPercent, int height) {
        ComparisonCarouselProductViewHolder comparisonCarouselProductViewHolder;
        float f7;
        int i11;
        float f11 = scalingPercent < 0.62f ? 0.62f : scalingPercent;
        float f12 = scalingPercent < 0.85f ? 0.85f : scalingPercent;
        double d11 = scalingPercent;
        float f13 = (0.1d > d11 || d11 > 1.0d) ? -this.maxTranslation : (scalingPercent - 1) * this.translationScalingConst;
        ComparisonCarouselVO.CarouselVO.ProductViewType productViewType = this.item;
        if (productViewType instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct) {
            a aVar = this.binding;
            Intrinsics.g(aVar, "null cannot be cast to non-null type ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselItemBinding");
            comparisonCarouselProductViewHolder = this;
            f7 = scalingPercent;
            i11 = height;
            comparisonCarouselProductViewHolder.applyTransformationsToComparedProductViewHolder((PdpWidgetComparisonCarouselItemBinding) aVar, f7, f11, f12, f13, i11);
        } else {
            comparisonCarouselProductViewHolder = this;
            f7 = scalingPercent;
            i11 = height;
            if (productViewType instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.EmptyProductVO) {
                a aVar2 = comparisonCarouselProductViewHolder.binding;
                Intrinsics.g(aVar2, "null cannot be cast to non-null type ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselEmptyItemBinding");
                comparisonCarouselProductViewHolder.applyTransformationsToEmptyProductViewHolder((PdpWidgetComparisonCarouselEmptyItemBinding) aVar2, f7, f11, f13, f12, i11);
            }
        }
        comparisonCarouselProductViewHolder.currentScalingPercent = f7;
        comparisonCarouselProductViewHolder.currentContainerHeight = i11;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.productFavDelegate.attachFavButtonView(button);
    }

    public final void bind(@NotNull ComparisonCarouselVO.CarouselVO.ProductViewType item, float scalingPercent, int calculatedContainerHeight) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.currentScalingPercent = scalingPercent;
        this.currentContainerHeight = calculatedContainerHeight;
        if (this.binding.getConstraintLayout().getHeight() != calculatedContainerHeight) {
            applyHeight$default(this, calculatedContainerHeight, null, 2, null);
        }
        if (item instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct) {
            a aVar = this.binding;
            Intrinsics.g(aVar, "null cannot be cast to non-null type ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselItemBinding");
            bindProduct((PdpWidgetComparisonCarouselItemBinding) aVar, (ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct) item);
        } else {
            if (!(item instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.EmptyProductVO)) {
                throw new o();
            }
            a aVar2 = this.binding;
            Intrinsics.g(aVar2, "null cannot be cast to non-null type ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselEmptyItemBinding");
            bindEmptyState((PdpWidgetComparisonCarouselEmptyItemBinding) aVar2, (ComparisonCarouselVO.CarouselVO.ProductViewType.EmptyProductVO) item);
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.productFavDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.productFavDelegate.detachFavButtonView();
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        int i11 = this.currentContainerHeight;
        if (i11 != 0) {
            applyTransformationsToViewHolder(this.currentScalingPercent, i11);
            if (this.item instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct) {
                a aVar = this.binding;
                Intrinsics.g(aVar, "null cannot be cast to non-null type ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselItemBinding");
                PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding = (PdpWidgetComparisonCarouselItemBinding) aVar;
                CartAtomBinder cartAtomBinder = this.cartAtomBinder;
                SingleAtom buttonSa = pdpWidgetComparisonCarouselItemBinding.buttonSa;
                Intrinsics.checkNotNullExpressionValue(buttonSa, "buttonSa");
                cartAtomBinder.init(buttonSa, this.tokenizedAnalytics);
                FavoriteProductDelegate favoriteProductDelegate = this.productFavDelegate;
                ProductFavoriteMoleculeButtonView favouriteButtonPFMBV = pdpWidgetComparisonCarouselItemBinding.favouriteButtonPFMBV;
                Intrinsics.checkNotNullExpressionValue(favouriteButtonPFMBV, "favouriteButtonPFMBV");
                favoriteProductDelegate.attachFavButtonView(favouriteButtonPFMBV);
            }
        }
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        if (this.item instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct) {
            this.cartAtomBinder.unbind();
            this.productFavDelegate.detachFavButtonView();
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.productFavDelegate.setOnFavoriteClick(function1);
    }

    private final void applyHeight(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }
}
