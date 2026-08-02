package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import Ae.C2399j;
import Ae.C2408n0;
import EX.c;
import Ge.n;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.repository.UniTheme;
import xe.B0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductViewHolder;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsItemViewHolder;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductView;", "view", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "adultListDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductView;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;", "item", "bindPriceBadgeOrGone", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductView;Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;)V", "onAttach", "()V", "onDetach", "bind", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;)V", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductView;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "job", "Lxe/B0;", "boundData", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;", "Companion", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductViewHolder extends ProductsItemViewHolder {

    @NotNull
    private final AdultListDelegate<ImageVO> adultListDelegate;
    private ProductListItem.Product boundData;
    private B0 job;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ProductView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PRICE_BADGE_START_PADDING = -UiExtKt.toPx(2);
    private static final int PRICE_BADGE_START_BEFORE_ICON_PADDING = -UiExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductViewHolder$Companion;", "", "<init>", "()V", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductViewHolder(@NotNull ProductView view, @NotNull AdultListDelegate<ImageVO> adultListDelegate, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.adultListDelegate = adultListDelegate;
        this.onAction = onAction;
        view.setAction(onAction);
        view.setOnClickListener(new c(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProductViewHolder productViewHolder, View view) {
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        ProductListItem.Product product = productViewHolder.boundData;
        if (product == null || (common = product.getCommon()) == null || (action = common.getAction()) == null) {
            return;
        }
        ProductListItem.Product product2 = productViewHolder.boundData;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, (product2 == null || (common2 = product2.getCommon()) == null) ? null : common2.getTrackingInfo());
        if (atomAction != null) {
            productViewHolder.onAction.invoke(atomAction);
        }
    }

    private final void bindPriceBadgeOrGone(ProductView productView, ProductListItem.Product product) {
        BadgeDTO.CustomStyle customBadgeStyle;
        BadgeDTO.CustomBackground backgroundColor;
        BadgeDTO priceBadge = product.getPriceBadge();
        boolean z11 = Intrinsics.d((priceBadge == null || (customBadgeStyle = priceBadge.getCustomBadgeStyle()) == null || (backgroundColor = customBadgeStyle.getBackgroundColor()) == null) ? null : backgroundColor.getColor(), UniTheme.INSTANCE.getColorTokens().getClearLightKey0().getId()) && product.getPriceBadge().getSize() == BadgeDTO.BadgeSize.SIZE_400;
        PriceDTO.Component component = (PriceDTO.Component) C7714v.Z(product.getPrice().getPrice());
        int i11 = z11 ? (component != null ? component.getIcon() : null) != null ? PRICE_BADGE_START_BEFORE_ICON_PADDING : PRICE_BADGE_START_PADDING : 0;
        BadgeHolderKt.bindOrGone$default(productView.getPriceBadgeView(), product.getPriceBadge(), (Function1) null, 2, (Object) null);
        productView.setPriceBadgeStartPadding(i11);
    }

    public final void bind(@NotNull ProductListItem.Product item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        ProductView productView = this.view;
        this.adultListDelegate.bindItems(C7714v.a0(item.getImage()));
        PriceAtomHolderKt.bind(productView.getPriceView(), item.getPrice(), this.onAction);
        bindPriceBadgeOrGone(productView, item);
        TextHolderKt.bind$default(productView.getTitleView(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(productView.getSubtitleView(), item.getSubtitle(), null, 2, null);
        ViewExtKt.showOrInvisible(productView.getSeparatorView(), item.getShouldShowSeparator());
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.job = C2399j.C(new C2408n0(C5427n.a(n.a(this.adultListDelegate.observeItems()), getLifecycle(), AbstractC5434v.b.STARTED), new ProductViewHolder$onAttach$1(this, null)), H.a(getLifecycle()));
    }

    @Override // jk0.j
    public void onDetach() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        super.onDetach();
    }
}
