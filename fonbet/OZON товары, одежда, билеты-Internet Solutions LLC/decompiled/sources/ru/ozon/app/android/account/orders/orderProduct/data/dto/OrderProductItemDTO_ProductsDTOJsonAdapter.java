package ru.ozon.app.android.account.orders.orderProduct.data.dto;

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
import ru.ozon.app.android.account.orders.orderProduct.data.dto.OrderProductItemDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.app.android.cscore.padding.Padding;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO_ProductsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$ProductsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$ProductsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$ProductsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "imagesDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cscore/padding/Padding;", "nullablePaddingAdapter", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderProductItemDTO_ProductsDTOJsonAdapter extends JsonAdapter<OrderProductItemDTO.ProductsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ImagesDTO> imagesDTOAdapter;

    @NotNull
    private final JsonAdapter<Padding> nullablePaddingAdapter;

    @NotNull
    private final n.a options;

    public OrderProductItemDTO_ProductsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("images", "paddings");
        M m11 = M.f71699a;
        this.imagesDTOAdapter = moshi.f(ImagesDTO.class, m11, "images");
        this.nullablePaddingAdapter = moshi.f(Padding.class, m11, "paddings");
    }

    @NotNull
    public String toString() {
        return b.c(53, "GeneratedJsonAdapter(OrderProductItemDTO.ProductsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderProductItemDTO.ProductsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ImagesDTO imagesDTO = null;
        Padding padding = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                imagesDTO = this.imagesDTOAdapter.fromJson(reader);
                if (imagesDTO == null) {
                    throw c.q("images", "images", reader);
                }
            } else if (v11 == 1) {
                padding = this.nullablePaddingAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (imagesDTO != null) {
            return new OrderProductItemDTO.ProductsDTO(imagesDTO, padding);
        }
        throw c.j("images", "images", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderProductItemDTO.ProductsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("images");
        this.imagesDTOAdapter.mo44toJson(writer, (x) value.getImages());
        writer.w("paddings");
        this.nullablePaddingAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.p();
    }
}
