package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data;

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
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO_FinalPriceDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3DTO_FinalPriceDTOJsonAdapter extends JsonAdapter<HotelsBookTotalV3DTO.FinalPriceDTO> {

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotelsBookTotalV3DTO_FinalPriceDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "infoIcon", "price");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "infoIcon");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(HotelsBookTotalV3DTO.FinalPriceDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsBookTotalV3DTO.FinalPriceDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        PriceDTO priceDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
            } else if (v11 == 1) {
                iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
            } else if (v11 == 2 && (priceDTO = this.priceDTOAdapter.fromJson(reader)) == null) {
                throw c.q("price", "price", reader);
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (priceDTO != null) {
            return new HotelsBookTotalV3DTO.FinalPriceDTO(textDTO, iconDTO, priceDTO);
        }
        throw c.j("price", "price", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsBookTotalV3DTO.FinalPriceDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("infoIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getInfoIcon());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.p();
    }
}
