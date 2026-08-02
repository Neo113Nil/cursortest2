package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO_CarriageDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$CarriageDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$CarriageDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$CarriageDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$PriceBlockDTO;", "nullablePriceBlockDTOAdapter", "nullableTextDTOAdapter", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "listOfIconButtonV3DTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$StoreyDTO;", "listOfStoreyDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3DTO_CarriageDTOJsonAdapter extends JsonAdapter<TravelCarriageSelectV3DTO.CarriageDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelCarriageSelectV3DTO.CarriageDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<IconButtonV3DTO>> listOfIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelCarriageSelectV3DTO.StoreyDTO>> listOfStoreyDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<TravelCarriageSelectV3DTO.PriceBlockDTO> nullablePriceBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public TravelCarriageSelectV3DTO_CarriageDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("number", "type", "serviceType", "priceBlock", "seatsCount", "seatsDetails", ResultDTO.CONTENT_TYPE_SERVICES, "storeys", "additionalInfo", "premiumBadge", "common", "originalPrice");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "number");
        this.nullablePriceBlockDTOAdapter = moshi.f(TravelCarriageSelectV3DTO.PriceBlockDTO.class, m11, "priceBlock");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "seatsDetails");
        this.listOfIconButtonV3DTOAdapter = moshi.f(D.e(List.class, IconButtonV3DTO.class), m11, ResultDTO.CONTENT_TYPE_SERVICES);
        this.listOfStoreyDTOAdapter = moshi.f(D.e(List.class, TravelCarriageSelectV3DTO.StoreyDTO.class), m11, "storeys");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "premiumBadge");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "originalPrice");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(TravelCarriageSelectV3DTO.CarriageDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelCarriageSelectV3DTO.CarriageDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        TravelCarriageSelectV3DTO.PriceBlockDTO priceBlockDTO = null;
        TextDTO textDTO4 = null;
        TextDTO textDTO5 = null;
        List<IconButtonV3DTO> list = null;
        List<TravelCarriageSelectV3DTO.StoreyDTO> list2 = null;
        TextDTO textDTO6 = null;
        BadgeDTO badgeDTO = null;
        CommonControlSettings commonControlSettings = null;
        PriceDTO priceDTO = null;
        while (true) {
            TextDTO textDTO7 = textDTO;
            TextDTO textDTO8 = textDTO2;
            if (!reader.hasNext()) {
                TextDTO textDTO9 = textDTO3;
                reader.endObject();
                if (i12 == -193) {
                    if (textDTO7 == null) {
                        throw c.j("number", "number", reader);
                    }
                    if (textDTO8 == null) {
                        throw c.j("type", "type", reader);
                    }
                    if (textDTO9 == null) {
                        throw c.j("serviceType", "serviceType", reader);
                    }
                    if (textDTO4 == null) {
                        throw c.j("seatsCount", "seatsCount", reader);
                    }
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO>");
                    Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3DTO.StoreyDTO>");
                    TextDTO textDTO10 = textDTO6;
                    List<TravelCarriageSelectV3DTO.StoreyDTO> list3 = list2;
                    List<IconButtonV3DTO> list4 = list;
                    return new TravelCarriageSelectV3DTO.CarriageDTO(textDTO7, textDTO8, textDTO9, priceBlockDTO, textDTO4, textDTO5, list4, list3, textDTO10, badgeDTO, commonControlSettings, priceDTO);
                }
                Constructor<TravelCarriageSelectV3DTO.CarriageDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = TravelCarriageSelectV3DTO.CarriageDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, TextDTO.class, TravelCarriageSelectV3DTO.PriceBlockDTO.class, TextDTO.class, TextDTO.class, List.class, List.class, TextDTO.class, BadgeDTO.class, CommonControlSettings.class, PriceDTO.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<TravelCarriageSelectV3DTO.CarriageDTO> constructor2 = constructor;
                if (textDTO7 == null) {
                    throw c.j("number", "number", reader);
                }
                if (textDTO8 == null) {
                    throw c.j("type", "type", reader);
                }
                if (textDTO9 == null) {
                    throw c.j("serviceType", "serviceType", reader);
                }
                if (textDTO4 == null) {
                    throw c.j("seatsCount", "seatsCount", reader);
                }
                TravelCarriageSelectV3DTO.CarriageDTO newInstance = constructor2.newInstance(textDTO7, textDTO8, textDTO9, priceBlockDTO, textDTO4, textDTO5, list, list2, textDTO6, badgeDTO, commonControlSettings, priceDTO, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            TextDTO textDTO11 = textDTO3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("number", "number", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO2 = textDTO8;
                case 1:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("type", "type", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                case 2:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("serviceType", "serviceType", reader);
                    }
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 3:
                    priceBlockDTO = this.nullablePriceBlockDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 4:
                    textDTO4 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO4 == null) {
                        throw c.q("seatsCount", "seatsCount", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 5:
                    textDTO5 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 6:
                    list = this.listOfIconButtonV3DTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q(ResultDTO.CONTENT_TYPE_SERVICES, ResultDTO.CONTENT_TYPE_SERVICES, reader);
                    }
                    i12 &= -65;
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 7:
                    list2 = this.listOfStoreyDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("storeys", "storeys", reader);
                    }
                    i12 &= -129;
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 8:
                    textDTO6 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 9:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 10:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 11:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                default:
                    textDTO3 = textDTO11;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelCarriageSelectV3DTO.CarriageDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("number");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getNumber());
        writer.w("type");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("serviceType");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getServiceType());
        writer.w("priceBlock");
        this.nullablePriceBlockDTOAdapter.mo44toJson(writer, (x) value.getPriceBlock());
        writer.w("seatsCount");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSeatsCount());
        writer.w("seatsDetails");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSeatsDetails());
        writer.w(ResultDTO.CONTENT_TYPE_SERVICES);
        this.listOfIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getServices());
        writer.w("storeys");
        this.listOfStoreyDTOAdapter.mo44toJson(writer, (x) value.getStoreys());
        writer.w("additionalInfo");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAdditionalInfo());
        writer.w("premiumBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getPremiumBadge());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("originalPrice");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getOriginalPrice());
        writer.p();
    }
}
