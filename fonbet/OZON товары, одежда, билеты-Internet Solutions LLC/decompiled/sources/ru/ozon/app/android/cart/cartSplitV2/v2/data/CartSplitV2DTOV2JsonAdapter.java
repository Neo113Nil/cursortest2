package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Ak.b;
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
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2DTOV2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;", "nullableHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;", "nullableListOfItemAtJsonCollectionDecodingAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$CartItemWrapper;", "nullableListOfCartItemWrapperAtJsonCollectionDecodingAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "nullableSeparatorConfigAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Footer;", "nullableFooterAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2DTOV2JsonAdapter extends JsonAdapter<CartSplitV2DTOV2> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Footer> nullableFooterAdapter;

    @NotNull
    private final JsonAdapter<HeaderDTO> nullableHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<List<CartSplitV2DTOV2.CartItemWrapper>> nullableListOfCartItemWrapperAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<List<CartSplitV2DTOV2.Item>> nullableListOfItemAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<SeparatorConfig> nullableSeparatorConfigAdapter;

    @NotNull
    private final n.a options;

    public CartSplitV2DTOV2JsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "cartItems", "cartItemsOneOf", "cartItemsSeparator", CommentV3DTO.FOOTER_FIELD_NAME);
        M m11 = M.f71699a;
        this.nullableHeaderDTOAdapter = moshi.f(HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableListOfItemAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, CartSplitV2DTOV2.Item.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2DTOV2JsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        }), "cartItems");
        this.nullableListOfCartItemWrapperAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, CartSplitV2DTOV2.CartItemWrapper.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2DTOV2JsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        }), "cartItemsOneOf");
        this.nullableSeparatorConfigAdapter = moshi.f(SeparatorConfig.class, m11, "cartItemsSeparator");
        this.nullableFooterAdapter = moshi.f(Footer.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(CartSplitV2DTOV2)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartSplitV2DTOV2 fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HeaderDTO headerDTO = null;
        List<CartSplitV2DTOV2.Item> list = null;
        List<CartSplitV2DTOV2.CartItemWrapper> list2 = null;
        SeparatorConfig separatorConfig = null;
        Footer footer = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                headerDTO = this.nullableHeaderDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.nullableListOfItemAtJsonCollectionDecodingAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list2 = this.nullableListOfCartItemWrapperAtJsonCollectionDecodingAdapter.fromJson(reader);
            } else if (v11 == 3) {
                separatorConfig = this.nullableSeparatorConfigAdapter.fromJson(reader);
            } else if (v11 == 4) {
                footer = this.nullableFooterAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new CartSplitV2DTOV2(headerDTO, list, list2, separatorConfig, footer);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartSplitV2DTOV2 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("cartItems");
        this.nullableListOfItemAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getCartItems());
        writer.w("cartItemsOneOf");
        this.nullableListOfCartItemWrapperAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getCartItemsOneOf());
        writer.w("cartItemsSeparator");
        this.nullableSeparatorConfigAdapter.mo44toJson(writer, (x) value.getCartItemsSeparator());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableFooterAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.p();
    }
}
