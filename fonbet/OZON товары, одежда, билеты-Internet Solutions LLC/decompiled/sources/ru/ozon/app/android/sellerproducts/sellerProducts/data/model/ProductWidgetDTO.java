package ru.ozon.app.android.sellerproducts.sellerProducts.data.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.header.model.HeaderDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.CommonProductWidgetDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductWidgetDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/HasHeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/sellerproducts/header/model/HeaderDTO;", "getHeader", "()Lru/ozon/app/android/sellerproducts/header/model/HeaderDTO;", "productContainer", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;", "getProductContainer", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;", "widgetOptions", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;", "getWidgetOptions", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ProductWidgetDTO extends HasHeaderDTO {
    HeaderDTO getHeader();

    @NotNull
    ProductContainerDTO getProductContainer();

    CommonProductWidgetDTO.WidgetOptions getWidgetOptions();
}
