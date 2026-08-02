package ru.ozon.app.android.account.orders.productsPackage.presentation;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.productsPackage.data.GiftDTO;
import ru.ozon.app.android.account.orders.productsPackage.data.PackageProductDTO;
import ru.ozon.app.android.account.orders.productsPackage.data.PaidItemDTO;
import ru.ozon.app.android.account.orders.productsPackage.data.ProductsPackageDTO;
import ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageItemVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\t\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\t\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R2\u0010+\u001a\u001a\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040*0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"¨\u0006-"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/account/orders/productsPackage/data/ProductsPackageDTO;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/account/orders/productsPackage/data/ProductsPackageDTO;Ljava/lang/String;)Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageVO;", "state", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO$TitleVO;", "getTitle", "(Lru/ozon/app/android/account/orders/productsPackage/data/ProductsPackageDTO;)Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO$TitleVO;", "", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO;", "getSellersAndProducts", "(Lru/ozon/app/android/account/orders/productsPackage/data/ProductsPackageDTO;)Ljava/util/List;", "getGifts", "Lru/ozon/app/android/account/orders/productsPackage/data/PackageProductDTO;", "Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO$ProductVO;", "(Lru/ozon/app/android/account/orders/productsPackage/data/PackageProductDTO;)Lru/ozon/app/android/account/orders/productsPackage/presentation/ProductsPackageItemVO$ProductVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductsPackageViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final Function2<ProductsPackageDTO, d, List<ProductsPackageVO>> mapper = new ProductsPackageViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_products_package;

    @NotNull
    private final Function2<View, ComposerReferences, k<ProductsPackageVO>> holderProducer = ProductsPackageViewMapper$holderProducer$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    private final List<ProductsPackageItemVO> getGifts(ProductsPackageDTO state) {
        ?? r12;
        ArrayList arrayList = new ArrayList();
        GiftDTO gifts = state.getGifts();
        if (gifts != null) {
            arrayList.add(new ProductsPackageItemVO.GiftTitleVO(gifts.getIcon(), gifts.getTitle()));
            List<PackageProductDTO> items = gifts.getItems();
            if (items != null) {
                List<PackageProductDTO> list = items;
                r12 = new ArrayList(C7714v.z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r12.add(toVO((PackageProductDTO) it.next()));
                }
            } else {
                r12 = K.f71697a;
            }
            arrayList.addAll((Collection) r12);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    private final List<ProductsPackageItemVO> getSellersAndProducts(ProductsPackageDTO state) {
        ?? r42;
        ArrayList arrayList = new ArrayList();
        List<PaidItemDTO> paidItems = state.getPaidItems();
        if (paidItems != null) {
            List<PaidItemDTO> list = paidItems;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                PaidItemDTO paidItemDTO = (PaidItemDTO) obj;
                if (i11 > 0) {
                    arrayList.add(new ProductsPackageItemVO.SellerTitleVO(paidItemDTO.getSellerName()));
                }
                List<PackageProductDTO> items = paidItemDTO.getItems();
                if (items != null) {
                    List<PackageProductDTO> list2 = items;
                    r42 = new ArrayList(C7714v.z(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r42.add(toVO((PackageProductDTO) it.next()));
                    }
                } else {
                    r42 = K.f71697a;
                }
                arrayList2.add(Boolean.valueOf(arrayList.addAll((Collection) r42)));
                i11 = i12;
            }
        }
        return arrayList;
    }

    private final ProductsPackageItemVO.TitleVO getTitle(ProductsPackageDTO state) {
        PaidItemDTO paidItemDTO;
        String title = state.getTitle();
        List<PaidItemDTO> paidItems = state.getPaidItems();
        return new ProductsPackageItemVO.TitleVO(title, (paidItems == null || (paidItemDTO = paidItems.get(0)) == null) ? null : paidItemDTO.getSellerName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductsPackageVO toVO(ProductsPackageDTO productsPackageDTO, String str) {
        ArrayList arrayList = new ArrayList();
        ProductsPackageItemVO.TitleVO title = getTitle(productsPackageDTO);
        List<ProductsPackageItemVO> sellersAndProducts = getSellersAndProducts(productsPackageDTO);
        List<ProductsPackageItemVO> gifts = getGifts(productsPackageDTO);
        arrayList.add(title);
        arrayList.addAll(sellersAndProducts);
        arrayList.addAll(gifts);
        return new ProductsPackageVO(str.hashCode(), arrayList);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ProductsPackageVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ProductsPackageDTO, d, List<ProductsPackageVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }

    private final ProductsPackageItemVO.ProductVO toVO(PackageProductDTO packageProductDTO) {
        String quantity = packageProductDTO.getQuantity();
        String deeplink = packageProductDTO.getDeeplink();
        return new ProductsPackageItemVO.ProductVO(quantity, packageProductDTO.getImage(), packageProductDTO.getPricePerItem(), packageProductDTO.getPrice(), packageProductDTO.getTitle(), deeplink);
    }
}
