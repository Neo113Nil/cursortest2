package ru.ozon.app.android.cart.cartSplitV2.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "nullableHeaderAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;", "listOfItemAtJsonCollectionDecodingAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "nullableSeparatorConfigAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Footer;", "nullableFooterAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2DTOJsonAdapter extends JsonAdapter<CartSplitV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<CartSplitV2DTO.Item>> listOfItemAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.Footer> nullableFooterAdapter;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.Header> nullableHeaderAdapter;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.SeparatorConfig> nullableSeparatorConfigAdapter;

    @NotNull
    private final n.a options;

    public CartSplitV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "items", "itemSeparatorConfig", CommentV3DTO.FOOTER_FIELD_NAME);
        M m11 = M.f71699a;
        this.nullableHeaderAdapter = moshi.f(CartSplitV2DTO.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfItemAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, CartSplitV2DTO.Item.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonCollectionDecoding.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonCollectionDecoding;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding()";
            }
        }), "items");
        this.nullableSeparatorConfigAdapter = moshi.f(CartSplitV2DTO.SeparatorConfig.class, m11, "itemSeparatorConfig");
        this.nullableFooterAdapter = moshi.f(CartSplitV2DTO.Footer.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(CartSplitV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartSplitV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CartSplitV2DTO.Header header = null;
        List<CartSplitV2DTO.Item> list = null;
        CartSplitV2DTO.SeparatorConfig separatorConfig = null;
        CartSplitV2DTO.Footer footer = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                header = this.nullableHeaderAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfItemAtJsonCollectionDecodingAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("items", "items", reader);
                }
            } else if (v11 == 2) {
                separatorConfig = this.nullableSeparatorConfigAdapter.fromJson(reader);
            } else if (v11 == 3) {
                footer = this.nullableFooterAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new CartSplitV2DTO(header, list, separatorConfig, footer);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartSplitV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("items");
        this.listOfItemAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("itemSeparatorConfig");
        this.nullableSeparatorConfigAdapter.mo44toJson(writer, (x) value.getItemSeparatorConfig());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableFooterAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.p();
    }
}
