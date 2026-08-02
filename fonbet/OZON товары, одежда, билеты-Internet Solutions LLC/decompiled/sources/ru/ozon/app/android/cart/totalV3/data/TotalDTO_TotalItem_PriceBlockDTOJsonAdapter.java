package ru.ozon.app.android.cart.totalV3.data;

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
import ru.ozon.app.android.cart.totalV3.data.TotalDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO_TotalItem_PriceBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "priceCardDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullablePriceCardDTOAdapter", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;", "nullableDividerDTOAdapter", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "nullableHorizontalMarginsDTOAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalDTO_TotalItem_PriceBlockDTOJsonAdapter extends JsonAdapter<TotalDTO.TotalItem.PriceBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TotalDTO.TotalItem.PriceBlockDTO.DividerDTO> nullableDividerDTOAdapter;

    @NotNull
    private final JsonAdapter<TotalDTO.HorizontalMarginsDTO> nullableHorizontalMarginsDTOAdapter;

    @NotNull
    private final JsonAdapter<TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO> nullablePriceCardDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO> priceCardDTOAdapter;

    public TotalDTO_TotalItem_PriceBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftPriceCart", "rightPriceCart", "divider", "margins");
        M m11 = M.f71699a;
        this.priceCardDTOAdapter = moshi.f(TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO.class, m11, "leftPriceCart");
        this.nullablePriceCardDTOAdapter = moshi.f(TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO.class, m11, "rightPriceCart");
        this.nullableDividerDTOAdapter = moshi.f(TotalDTO.TotalItem.PriceBlockDTO.DividerDTO.class, m11, "divider");
        this.nullableHorizontalMarginsDTOAdapter = moshi.f(TotalDTO.HorizontalMarginsDTO.class, m11, "margins");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(TotalDTO.TotalItem.PriceBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalDTO.TotalItem.PriceBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO priceCardDTO = null;
        TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO priceCardDTO2 = null;
        TotalDTO.TotalItem.PriceBlockDTO.DividerDTO dividerDTO = null;
        TotalDTO.HorizontalMarginsDTO horizontalMarginsDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                priceCardDTO = this.priceCardDTOAdapter.fromJson(reader);
                if (priceCardDTO == null) {
                    throw c.q("leftPriceCart", "leftPriceCart", reader);
                }
            } else if (v11 == 1) {
                priceCardDTO2 = this.nullablePriceCardDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                dividerDTO = this.nullableDividerDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                horizontalMarginsDTO = this.nullableHorizontalMarginsDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (priceCardDTO != null) {
            return new TotalDTO.TotalItem.PriceBlockDTO(priceCardDTO, priceCardDTO2, dividerDTO, horizontalMarginsDTO);
        }
        throw c.j("leftPriceCart", "leftPriceCart", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalDTO.TotalItem.PriceBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftPriceCart");
        this.priceCardDTOAdapter.mo44toJson(writer, (x) value.getLeftPriceCart());
        writer.w("rightPriceCart");
        this.nullablePriceCardDTOAdapter.mo44toJson(writer, (x) value.getRightPriceCart());
        writer.w("divider");
        this.nullableDividerDTOAdapter.mo44toJson(writer, (x) value.getDivider());
        writer.w("margins");
        this.nullableHorizontalMarginsDTOAdapter.mo44toJson(writer, (x) value.getMargins());
        writer.p();
    }
}
