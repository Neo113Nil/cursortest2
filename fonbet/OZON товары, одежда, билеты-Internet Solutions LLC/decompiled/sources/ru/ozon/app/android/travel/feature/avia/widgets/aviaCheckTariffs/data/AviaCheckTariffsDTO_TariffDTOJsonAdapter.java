package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO_TariffDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;", "nullableBackgroundWrapperAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "booleanAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$PriceBlockDTO;", "nullablePriceBlockDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BenefitsListExpansion;", "nullableBenefitsListExpansionAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsDTO_TariffDTOJsonAdapter extends JsonAdapter<AviaCheckTariffsDTO.TariffDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<AviaCheckTariffsDTO.BackgroundWrapper> nullableBackgroundWrapperAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<AviaCheckTariffsDTO.BenefitsListExpansion> nullableBenefitsListExpansionAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<AviaCheckTariffsDTO.PriceBlockDTO> nullablePriceBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AviaCheckTariffsDTO_TariffDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "price", "route", "milesBadge", "benefits", "borderColor", "backgroundColor", "marketingImage", "clickAction", "clickTrackingInfo", "viewTrackingInfo", "isSelected", "priceBlock", "benefitsListExpansion");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "route");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "milesBadge");
        this.listOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "benefits");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullableBackgroundWrapperAdapter = moshi.f(AviaCheckTariffsDTO.BackgroundWrapper.class, m11, "backgroundColor");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "marketingImage");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "clickAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "clickTrackingInfo");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.nullablePriceBlockDTOAdapter = moshi.f(AviaCheckTariffsDTO.PriceBlockDTO.class, m11, "priceBlock");
        this.nullableBenefitsListExpansionAdapter = moshi.f(AviaCheckTariffsDTO.BenefitsListExpansion.class, m11, "benefitsListExpansion");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(AviaCheckTariffsDTO.TariffDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AviaCheckTariffsDTO.TariffDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        TextDTO textDTO = null;
        PriceDTO priceDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        List<CellDTO> list = null;
        String str = null;
        AviaCheckTariffsDTO.BackgroundWrapper backgroundWrapper = null;
        ImageDTO imageDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        AviaCheckTariffsDTO.PriceBlockDTO priceBlockDTO = null;
        AviaCheckTariffsDTO.BenefitsListExpansion benefitsListExpansion = null;
        while (true) {
            Boolean bool2 = bool;
            if (!reader.hasNext()) {
                TextDTO textDTO3 = textDTO;
                reader.endObject();
                if (textDTO3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (list == null) {
                    throw c.j("benefits", "benefits", reader);
                }
                if (bool2 != null) {
                    return new AviaCheckTariffsDTO.TariffDTO(textDTO3, priceDTO, textDTO2, badgeDTO, list, str, backgroundWrapper, imageDTO, atomActionDTO, map, map2, bool2.booleanValue(), priceBlockDTO, benefitsListExpansion);
                }
                throw c.j("isSelected", "isSelected", reader);
            }
            TextDTO textDTO4 = textDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    textDTO = textDTO4;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool = bool2;
                case 1:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 3:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 4:
                    list = this.listOfCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("benefits", "benefits", reader);
                    }
                    bool = bool2;
                    textDTO = textDTO4;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 6:
                    backgroundWrapper = this.nullableBackgroundWrapperAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 7:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 8:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 10:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 11:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    textDTO = textDTO4;
                case 12:
                    priceBlockDTO = this.nullablePriceBlockDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                case 13:
                    benefitsListExpansion = this.nullableBenefitsListExpansionAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO4;
                default:
                    bool = bool2;
                    textDTO = textDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AviaCheckTariffsDTO.TariffDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("price");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("route");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getRoute());
        writer.w("milesBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getMilesBadge());
        writer.w("benefits");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getBenefits());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("backgroundColor");
        this.nullableBackgroundWrapperAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("marketingImage");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getMarketingImage());
        writer.w("clickAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getClickAction());
        writer.w("clickTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getClickTrackingInfo());
        writer.w("viewTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTrackingInfo());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("priceBlock");
        this.nullablePriceBlockDTOAdapter.mo44toJson(writer, (x) value.getPriceBlock());
        writer.w("benefitsListExpansion");
        this.nullableBenefitsListExpansionAdapter.mo44toJson(writer, (x) value.getBenefitsListExpansion());
        writer.p();
    }
}
