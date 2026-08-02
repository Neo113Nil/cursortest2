package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import WZ.l;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.labelList.LabelListAtomViewHolderKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseTileBinding;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseOldTileVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uikit.view.atoms.labelList.LabelListView;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u000e*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010 J'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b\u001d\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseOldTileViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseOldTileVO;", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseTileBinding;", "binding", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "addToCartButtonBinder", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "productFavoriteDelegate", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticDataProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "customWidth", "<init>", "(Lru/ozon/app/android/fresh/main/databinding/ItemWiseTileBinding;Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LWZ/l;Ljava/lang/Integer;)V", "item", "setLocatorTagsWithValues", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseOldTileVO;)V", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "mediaModel", "bind", "(Lru/ozon/uni/android/atom/productMedia/ProductMediaView;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;)V", "onViewInOverlapBounds", "()V", "onViewOutOfOverlapBounds", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseOldTileVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseTileBinding;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonBinder;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Integer;", "Landroid/view/View;", "getPriceLeftContentView", "()Landroid/view/View;", "priceLeftContentView", "getDiscountView", "discountView", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseOldTileViewHolder extends BindableViewHolder<WiseOldTileVO> {

    @NotNull
    private final AddToCartButtonBinder addToCartButtonBinder;

    @NotNull
    private final Function0<AnalyticData> analyticDataProvider;

    @NotNull
    private final ItemWiseTileBinding binding;
    private final Integer customWidth;

    @NotNull
    private final FavoriteProductDelegate productFavoriteDelegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WiseOldTileViewHolder(@NotNull ItemWiseTileBinding binding, @NotNull AddToCartButtonBinder addToCartButtonBinder, @NotNull FavoriteProductDelegate productFavoriteDelegate, @NotNull Function0<AnalyticData> analyticDataProvider, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, Integer num) {
        super(r0, tokenizedAnalytics, actionHandler);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(addToCartButtonBinder, "addToCartButtonBinder");
        Intrinsics.checkNotNullParameter(productFavoriteDelegate, "productFavoriteDelegate");
        Intrinsics.checkNotNullParameter(analyticDataProvider, "analyticDataProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.addToCartButtonBinder = addToCartButtonBinder;
        this.productFavoriteDelegate = productFavoriteDelegate;
        this.analyticDataProvider = analyticDataProvider;
        this.customWidth = num;
        binding.mediaView.setLocatorTag("wiseSkuScrollTileImage");
        binding.cartButtonView.setContentDescription("wiseSkuScrollTileCartButton");
        binding.favoriteView.setContentDescription("wiseSkuScrollTileFavorite");
        addToCartButtonBinder.init(tokenizedAnalytics);
    }

    private final View getDiscountView() {
        return this.binding.discountView.findViewById(R$id.priceDiscount);
    }

    private final View getPriceLeftContentView() {
        return this.binding.discountView.findViewById(R$id.priceLeftContentView);
    }

    private final void setLocatorTagsWithValues(WiseOldTileVO item) {
        List<PriceDTO.Component> price;
        PriceDTO.Component component;
        PriceDTO.Component component2 = (PriceDTO.Component) C7714v.M(item.getPrice().getPrice());
        String text = component2 != null ? component2.getText() : null;
        if (text == null) {
            text = "";
        }
        PriceDTO priceWithDiscount = item.getPriceWithDiscount();
        String text2 = (priceWithDiscount == null || (price = priceWithDiscount.getPrice()) == null || (component = (PriceDTO.Component) C7714v.M(price)) == null) ? null : component.getText();
        if (text2 == null) {
            text2 = "";
        }
        PriceDTO priceWithDiscount2 = item.getPriceWithDiscount();
        String discount = priceWithDiscount2 != null ? priceWithDiscount2.getDiscount() : null;
        String str = discount != null ? discount : "";
        this.binding.priceView.setLocatorTag(text);
        this.binding.discountView.setLocatorTag("wiseSkuScrollTileOldPrice");
        View priceLeftContentView = getPriceLeftContentView();
        if (priceLeftContentView != null) {
            priceLeftContentView.setContentDescription(text2);
        }
        View discountView = getDiscountView();
        if (discountView != null) {
            discountView.setContentDescription(str);
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        super.onViewInOverlapBounds();
        this.addToCartButtonBinder.subscribe();
        FavoriteProductDelegate favoriteProductDelegate = this.productFavoriteDelegate;
        ProductFavoriteMoleculeButtonView favoriteView = this.binding.favoriteView;
        Intrinsics.checkNotNullExpressionValue(favoriteView, "favoriteView");
        favoriteProductDelegate.attachFavButtonView(favoriteView);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        this.addToCartButtonBinder.unsubscribe();
        this.productFavoriteDelegate.detachFavButtonView();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder
    public void bind(@NotNull WiseOldTileVO item, d widgetInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((WiseOldTileViewHolder) item, widgetInfo);
        this.binding.getConstraintLayout().setContentDescription("wiseSkuScrollTile");
        if (item.getFavoriteButton() == null) {
            ProductFavoriteMoleculeButtonView favoriteView = this.binding.favoriteView;
            Intrinsics.checkNotNullExpressionValue(favoriteView, "favoriteView");
            ViewExtKt.gone(favoriteView);
        } else {
            ProductFavoriteMoleculeButtonView favoriteView2 = this.binding.favoriteView;
            Intrinsics.checkNotNullExpressionValue(favoriteView2, "favoriteView");
            ViewExtKt.show(favoriteView2);
            FavoriteProductDelegate favoriteProductDelegate = this.productFavoriteDelegate;
            ProductFavoriteMoleculeButtonView favoriteView3 = this.binding.favoriteView;
            Intrinsics.checkNotNullExpressionValue(favoriteView3, "favoriteView");
            favoriteProductDelegate.bindFavoriteProductButton(favoriteView3, item.getFavoriteButton(), this.analyticDataProvider.invoke());
        }
        this.addToCartButtonBinder.bindButton(this.binding.cartButtonView, item.getAddToCartButton(), Long.valueOf(item.getId()), getActionHandler());
        ProductMediaView mediaView = this.binding.mediaView;
        Intrinsics.checkNotNullExpressionValue(mediaView, "mediaView");
        bind(mediaView, item.getMediaModel());
        PriceAtomView priceView = this.binding.priceView;
        Intrinsics.checkNotNullExpressionValue(priceView, "priceView");
        PriceAtomHolderKt.bindOrGone$default(priceView, item.getPrice(), null, 2, null);
        PriceAtomView discountView = this.binding.discountView;
        Intrinsics.checkNotNullExpressionValue(discountView, "discountView");
        PriceAtomHolderKt.bindOrGone$default(discountView, item.getPriceWithDiscount(), null, 2, null);
        TextAtomV2View titleView = this.binding.titleView;
        Intrinsics.checkNotNullExpressionValue(titleView, "titleView");
        TextHolderKt.bindOrGone$default(titleView, item.getTitle(), null, 2, null);
        this.binding.titleView.setTextIsSelectable(false);
        LabelListView labelListView = this.binding.labelListView;
        Intrinsics.checkNotNullExpressionValue(labelListView, "labelListView");
        LabelListAtomViewHolderKt.bindOrGone$default(labelListView, item.getLabels(), null, 2, null);
        setLocatorTagsWithValues(item);
        this.binding.titleView.setLocatorTag(item.getTitle().getText().toString());
    }

    private final void bind(ProductMediaView productMediaView, ProductMediaDTO productMediaDTO) {
        ProductMediaDTO copy;
        ImageView.ScaleType scaleType;
        if (this.customWidth == null) {
            ProductMediaHolderKt.bindOrGone$default(productMediaView, productMediaDTO, null, 2, null);
            return;
        }
        ProductMediaDTO.Image image = productMediaDTO.getImage();
        String url = image != null ? image.getUrl() : null;
        ProductMediaDTO.Image image2 = productMediaDTO.getImage();
        ProductMediaDTO.FitType fitType = image2 != null ? image2.getFitType() : null;
        String str = url;
        copy = productMediaDTO.copy((r34 & 1) != 0 ? productMediaDTO.context : null, (r34 & 2) != 0 ? productMediaDTO.image : null, (r34 & 4) != 0 ? productMediaDTO.width : null, (r34 & 8) != 0 ? productMediaDTO.ratio : null, (r34 & 16) != 0 ? productMediaDTO.radius : null, (r34 & 32) != 0 ? productMediaDTO.backgroundColor : null, (r34 & 64) != 0 ? productMediaDTO.border : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productMediaDTO.hasParanja : null, (r34 & 256) != 0 ? productMediaDTO.hasOverlay : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productMediaDTO.icon : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productMediaDTO.label : null, (r34 & 2048) != 0 ? productMediaDTO.smallIcon : null, (r34 & 4096) != 0 ? productMediaDTO.smallLabel : null, (r34 & 8192) != 0 ? productMediaDTO.common : null, (r34 & 16384) != 0 ? productMediaDTO.smallIconColor : null, (r34 & 32768) != 0 ? productMediaDTO.smallLabelColor : null);
        ProductMediaHolderKt.bindOrGone$default(productMediaView, copy, null, 2, null);
        productMediaView.setFixedWidth(this.customWidth.intValue());
        if (fitType == ProductMediaDTO.FitType.FILL_CENTER) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        productMediaView.setFitType(scaleType);
        ImageViewExtKt.load$default(productMediaView, str, null, null, null, null, false, null, 126, null);
    }
}
