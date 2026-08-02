package ru.ozon.app.android.product.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.header.model.HeaderDTO;
import ru.ozon.app.android.product.common.product.ProductContainerDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/product/common/ProductWidgetDTO;", "Lru/ozon/app/android/product/common/HasHeaderDTO;", "Lru/ozon/app/android/product/common/HasFooterDTO;", "Lru/ozon/app/android/product/common/HasRichHeaderDTO;", "Lru/ozon/app/android/product/common/header/model/HeaderDTO;", "getHeader", "()Lru/ozon/app/android/product/common/header/model/HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/product/common/product/ProductContainerDTO;", "getProductContainer", "()Lru/ozon/app/android/product/common/product/ProductContainerDTO;", "productContainer", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ProductWidgetDTO extends HasHeaderDTO, HasFooterDTO, HasRichHeaderDTO {
    HeaderDTO getHeader();

    @NotNull
    ProductContainerDTO getProductContainer();

    TestInfo getTestInfo();
}
