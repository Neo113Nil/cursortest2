package ru.ozon.app.android.orderdetails.productsToPay.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.orderdetails.modalConstructor.data.ModalConstructorDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductImageCarouselDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductsToPayCellDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductsToPayDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.SeparatorDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005B\u0015\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/core/ProductsToPayParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "state", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductsToPayCellDTO;", "map", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)Lru/ozon/app/android/orderdetails/productsToPay/data/ProductsToPayCellDTO;", "params", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductsToPayParser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public ProductsToPayParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final ProductsToPayCellDTO map(CellDTO cellDTO, String str) {
        return new ProductsToPayCellDTO(cellDTO, str);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        Intrinsics.f(state);
        ProductsToPayDTO productsToPayDTO = (ProductsToPayDTO) jsonParser.fromJson(state, ProductsToPayDTO.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : productsToPayDTO.getItems()) {
            Object map = obj instanceof CellDTO ? map((CellDTO) obj, productsToPayDTO.getState()) : obj instanceof ProductDTO ? ProductDTO.copy$default((ProductDTO) obj, null, null, null, null, null, null, null, null, null, false, productsToPayDTO.getState(), null, 3071, null) : obj instanceof ProductImageCarouselDTO ? ModalConstructorDTO.HorizontalScrollImagesDTO.copy$default(((ProductImageCarouselDTO) obj).getScrollImages(), null, null, null, true, 7, null) : null;
            if (map != null) {
                arrayList.add(map);
            }
            ProductImageCarouselDTO productImageCarouselDTO = obj instanceof ProductImageCarouselDTO ? (ProductImageCarouselDTO) obj : null;
            if (productImageCarouselDTO != null && !productImageCarouselDTO.getDisableSeparator()) {
                ModalConstructorDTO.PaddingDTO padding = ((ProductImageCarouselDTO) obj).getScrollImages().getPadding();
                arrayList.add(new SeparatorDTO(padding != null ? padding.getLeft() : null));
            }
        }
        return arrayList;
    }
}
