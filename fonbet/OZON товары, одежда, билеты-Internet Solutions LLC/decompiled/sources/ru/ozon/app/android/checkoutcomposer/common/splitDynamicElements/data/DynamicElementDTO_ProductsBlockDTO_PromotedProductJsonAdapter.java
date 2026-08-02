package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data;

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
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO_ProductsBlockDTO_PromotedProductJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableIconDTOAdapter", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "nullablePromoIconPositionAdapter", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "nullableProductTooltipAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementDTO_ProductsBlockDTO_PromotedProductJsonAdapter extends JsonAdapter<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip> nullableProductTooltipAdapter;

    @NotNull
    private final JsonAdapter<PromoIconPosition> nullablePromoIconPositionAdapter;

    @NotNull
    private final n.a options;

    public DynamicElementDTO_ProductsBlockDTO_PromotedProductJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "promoIcon", "promoIconPosition", "tooltip");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "image");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "promoIcon");
        this.nullablePromoIconPositionAdapter = moshi.f(PromoIconPosition.class, m11, "promoIconPosition");
        this.nullableProductTooltipAdapter = moshi.f(DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip.class, m11, "tooltip");
    }

    @NotNull
    public String toString() {
        return b.c(72, "GeneratedJsonAdapter(DynamicElementDTO.ProductsBlockDTO.PromotedProduct)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DynamicElementDTO.ProductsBlockDTO.PromotedProduct fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconDTO iconDTO = null;
        IconDTO iconDTO2 = null;
        PromoIconPosition promoIconPosition = null;
        DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip productTooltip = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                iconDTO = this.iconDTOAdapter.fromJson(reader);
                if (iconDTO == null) {
                    throw c.q("image", "image", reader);
                }
            } else if (v11 == 1) {
                iconDTO2 = this.nullableIconDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                promoIconPosition = this.nullablePromoIconPositionAdapter.fromJson(reader);
            } else if (v11 == 3) {
                productTooltip = this.nullableProductTooltipAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (iconDTO != null) {
            return new DynamicElementDTO.ProductsBlockDTO.PromotedProduct(iconDTO, iconDTO2, promoIconPosition, productTooltip);
        }
        throw c.j("image", "image", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DynamicElementDTO.ProductsBlockDTO.PromotedProduct value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("promoIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getPromoIcon());
        writer.w("promoIconPosition");
        this.nullablePromoIconPositionAdapter.mo44toJson(writer, (x) value.getPromoIconPosition());
        writer.w("tooltip");
        this.nullableProductTooltipAdapter.mo44toJson(writer, (x) value.getTooltip());
        writer.p();
    }
}
