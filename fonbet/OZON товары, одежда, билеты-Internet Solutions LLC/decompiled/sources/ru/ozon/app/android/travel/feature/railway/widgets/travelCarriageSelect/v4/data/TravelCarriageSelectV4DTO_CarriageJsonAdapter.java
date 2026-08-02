package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.data;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.data.TravelCarriageSelectV4DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO_CarriageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Carriage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Carriage;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Carriage;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Storey;", "nullableListOfStoreyAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Details;", "detailsAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$PriceBlock;", "priceBlockAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV4DTO_CarriageJsonAdapter extends JsonAdapter<TravelCarriageSelectV4DTO.Carriage> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<TravelCarriageSelectV4DTO.Details> detailsAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelCarriageSelectV4DTO.Storey>> nullableListOfStoreyAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TravelCarriageSelectV4DTO.PriceBlock> priceBlockAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public TravelCarriageSelectV4DTO_CarriageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "type", "typeBadge", "number", "seatsCount", "seatsDetails", "storeys", "details", "priceBlock", "bonusBadge", "common");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "type");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "typeBadge");
        this.nullableListOfStoreyAdapter = moshi.f(D.e(List.class, TravelCarriageSelectV4DTO.Storey.class), m11, "storeys");
        this.detailsAdapter = moshi.f(TravelCarriageSelectV4DTO.Details.class, m11, "details");
        this.priceBlockAdapter = moshi.f(TravelCarriageSelectV4DTO.PriceBlock.class, m11, "priceBlock");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(TravelCarriageSelectV4DTO.Carriage)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelCarriageSelectV4DTO.Carriage fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        TextDTO textDTO3 = null;
        TextDTO textDTO4 = null;
        TextDTO textDTO5 = null;
        List<TravelCarriageSelectV4DTO.Storey> list = null;
        TravelCarriageSelectV4DTO.Details details = null;
        TravelCarriageSelectV4DTO.PriceBlock priceBlock = null;
        BadgeDTO badgeDTO2 = null;
        CommonControlSettings commonControlSettings = null;
        while (true) {
            TextDTO textDTO6 = textDTO;
            TextDTO textDTO7 = textDTO2;
            BadgeDTO badgeDTO3 = badgeDTO;
            if (!reader.hasNext()) {
                TextDTO textDTO8 = textDTO3;
                reader.endObject();
                if (textDTO6 == null) {
                    throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
                if (textDTO8 == null) {
                    throw c.j("number", "number", reader);
                }
                if (textDTO4 == null) {
                    throw c.j("seatsCount", "seatsCount", reader);
                }
                if (details == null) {
                    throw c.j("details", "details", reader);
                }
                if (priceBlock == null) {
                    throw c.j("priceBlock", "priceBlock", reader);
                }
                if (commonControlSettings != null) {
                    return new TravelCarriageSelectV4DTO.Carriage(textDTO6, textDTO7, badgeDTO3, textDTO8, textDTO4, textDTO5, list, details, priceBlock, badgeDTO2, commonControlSettings);
                }
                throw c.j("common", "common", reader);
            }
            TextDTO textDTO9 = textDTO3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    textDTO3 = textDTO9;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    badgeDTO = badgeDTO3;
                case 2:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                case 3:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("number", "number", reader);
                    }
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 4:
                    textDTO4 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO4 == null) {
                        throw c.q("seatsCount", "seatsCount", reader);
                    }
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 5:
                    textDTO5 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 6:
                    list = this.nullableListOfStoreyAdapter.fromJson(reader);
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 7:
                    details = this.detailsAdapter.fromJson(reader);
                    if (details == null) {
                        throw c.q("details", "details", reader);
                    }
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 8:
                    priceBlock = this.priceBlockAdapter.fromJson(reader);
                    if (priceBlock == null) {
                        throw c.q("priceBlock", "priceBlock", reader);
                    }
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 9:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                case 10:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("common", "common", reader);
                    }
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                default:
                    textDTO3 = textDTO9;
                    textDTO = textDTO6;
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelCarriageSelectV4DTO.Carriage value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("type");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("typeBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getTypeBadge());
        writer.w("number");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getNumber());
        writer.w("seatsCount");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSeatsCount());
        writer.w("seatsDetails");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSeatsDetails());
        writer.w("storeys");
        this.nullableListOfStoreyAdapter.mo44toJson(writer, (x) value.getStoreys());
        writer.w("details");
        this.detailsAdapter.mo44toJson(writer, (x) value.getDetails());
        writer.w("priceBlock");
        this.priceBlockAdapter.mo44toJson(writer, (x) value.getPriceBlock());
        writer.w("bonusBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBonusBadge());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
