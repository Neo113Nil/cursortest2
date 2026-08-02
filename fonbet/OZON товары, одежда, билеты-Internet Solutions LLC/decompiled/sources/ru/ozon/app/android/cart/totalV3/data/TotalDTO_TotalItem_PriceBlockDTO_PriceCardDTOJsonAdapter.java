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
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO_TotalItem_PriceBlockDTO_PriceCardDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$TextWithIconDTO;", "textWithIconDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalDTO_TotalItem_PriceBlockDTO_PriceCardDTOJsonAdapter extends JsonAdapter<TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TotalDTO.TotalItem.PriceBlockDTO.TextWithIconDTO> textWithIconDTOAdapter;

    public TotalDTO_TotalItem_PriceBlockDTO_PriceCardDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("price", "textWithIcon", "common", "backgroundColor", "topPadding", "bottomPadding", "leftPadding", "rightPadding");
        M m11 = M.f71699a;
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.textWithIconDTOAdapter = moshi.f(TotalDTO.TotalItem.PriceBlockDTO.TextWithIconDTO.class, m11, "textWithIcon");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "topPadding");
    }

    @NotNull
    public String toString() {
        return b.c(67, "GeneratedJsonAdapter(TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PriceDTO priceDTO = null;
        TotalDTO.TotalItem.PriceBlockDTO.TextWithIconDTO textWithIconDTO = null;
        CommonControlSettings commonControlSettings = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 1:
                    textWithIconDTO = this.textWithIconDTOAdapter.fromJson(reader);
                    if (textWithIconDTO == null) {
                        throw c.q("textWithIcon", "textWithIcon", reader);
                    }
                    break;
                case 2:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 7:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (priceDTO == null) {
            throw c.j("price", "price", reader);
        }
        if (textWithIconDTO != null) {
            return new TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO(priceDTO, textWithIconDTO, commonControlSettings, str, num, num2, num3, num4);
        }
        throw c.j("textWithIcon", "textWithIcon", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("textWithIcon");
        this.textWithIconDTOAdapter.mo44toJson(writer, (x) value.getTextWithIcon());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("topPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getTopPadding());
        writer.w("bottomPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.w("leftPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("rightPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.p();
    }
}
