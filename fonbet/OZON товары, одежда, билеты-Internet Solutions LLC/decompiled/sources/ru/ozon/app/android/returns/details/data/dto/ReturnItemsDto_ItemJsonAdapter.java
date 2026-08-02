package ru.ozon.app.android.returns.details.data.dto;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.details.data.dto.ReturnItemsDto;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto_ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Item;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Item;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;", "productInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "returnReasonAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnItemsDto_ItemJsonAdapter extends JsonAdapter<ReturnItemsDto.Item> {
    public static final int $stable = 8;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ReturnItemsDto.ProductInfo> productInfoAdapter;

    @NotNull
    private final JsonAdapter<ReturnItemsDto.ReturnReason> returnReasonAdapter;

    public ReturnItemsDto_ItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "returnReason");
        M m11 = M.f71699a;
        this.productInfoAdapter = moshi.f(ReturnItemsDto.ProductInfo.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME);
        this.returnReasonAdapter = moshi.f(ReturnItemsDto.ReturnReason.class, m11, "returnReason");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(ReturnItemsDto.Item)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnItemsDto.Item fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ReturnItemsDto.ProductInfo productInfo = null;
        ReturnItemsDto.ReturnReason returnReason = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                productInfo = this.productInfoAdapter.fromJson(reader);
                if (productInfo == null) {
                    throw c.q(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, reader);
                }
            } else if (v11 == 1 && (returnReason = this.returnReasonAdapter.fromJson(reader)) == null) {
                throw c.q("returnReason", "returnReason", reader);
            }
        }
        reader.endObject();
        if (productInfo == null) {
            throw c.j(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, reader);
        }
        if (returnReason != null) {
            return new ReturnItemsDto.Item(productInfo, returnReason);
        }
        throw c.j("returnReason", "returnReason", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnItemsDto.Item value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME);
        this.productInfoAdapter.mo44toJson(writer, (x) value.getProductInfo());
        writer.w("returnReason");
        this.returnReasonAdapter.mo44toJson(writer, (x) value.getReturnReason());
        writer.p();
    }
}
