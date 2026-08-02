package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.FlightV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO_LuggageTabDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/Icon;", "iconAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightV3DTO_LuggageTabDTOJsonAdapter extends JsonAdapter<FlightV3DTO.LuggageTabDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Icon> iconAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public FlightV3DTO_LuggageTabDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("handCarryIcon", "luggageIcon", "handCarryWeight", "luggageWeight", "handCarryCount", "luggageCount", "price", "action", "isSelected", "trackingInfo", "totalPrice");
        M m11 = M.f71699a;
        this.iconAdapter = moshi.f(Icon.class, m11, "handCarryIcon");
        this.stringAdapter = moshi.f(String.class, m11, "handCarryWeight");
        this.nullableStringAdapter = moshi.f(String.class, m11, "handCarryCount");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "price");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(FlightV3DTO.LuggageTabDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightV3DTO.LuggageTabDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Icon icon = null;
        Icon icon2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        TextAtom textAtom = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str5 = null;
        while (true) {
            Boolean bool2 = bool;
            Icon icon3 = icon;
            Icon icon4 = icon2;
            if (!reader.hasNext()) {
                String str6 = str;
                reader.endObject();
                if (icon3 == null) {
                    throw c.j("handCarryIcon", "handCarryIcon", reader);
                }
                if (icon4 == null) {
                    throw c.j("luggageIcon", "luggageIcon", reader);
                }
                if (str6 == null) {
                    throw c.j("handCarryWeight", "handCarryWeight", reader);
                }
                if (str2 == null) {
                    throw c.j("luggageWeight", "luggageWeight", reader);
                }
                if (textAtom == null) {
                    throw c.j("price", "price", reader);
                }
                if (bool2 != null) {
                    return new FlightV3DTO.LuggageTabDTO(icon3, icon4, str6, str2, str3, str4, textAtom, atomActionDTO, bool2.booleanValue(), map, str5);
                }
                throw c.j("isSelected", "isSelected", reader);
            }
            String str7 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 0:
                    icon = this.iconAdapter.fromJson(reader);
                    if (icon == null) {
                        throw c.q("handCarryIcon", "handCarryIcon", reader);
                    }
                    bool = bool2;
                    str = str7;
                    icon2 = icon4;
                case 1:
                    icon2 = this.iconAdapter.fromJson(reader);
                    if (icon2 == null) {
                        throw c.q("luggageIcon", "luggageIcon", reader);
                    }
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("handCarryWeight", "handCarryWeight", reader);
                    }
                    bool = bool2;
                    icon = icon3;
                    icon2 = icon4;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("luggageWeight", "luggageWeight", reader);
                    }
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 6:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("price", "price", reader);
                    }
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 7:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 8:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                case 10:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
                default:
                    bool = bool2;
                    str = str7;
                    icon = icon3;
                    icon2 = icon4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightV3DTO.LuggageTabDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("handCarryIcon");
        this.iconAdapter.mo44toJson(writer, (x) value.getHandCarryIcon());
        writer.w("luggageIcon");
        this.iconAdapter.mo44toJson(writer, (x) value.getLuggageIcon());
        writer.w("handCarryWeight");
        this.stringAdapter.mo44toJson(writer, (x) value.getHandCarryWeight());
        writer.w("luggageWeight");
        this.stringAdapter.mo44toJson(writer, (x) value.getLuggageWeight());
        writer.w("handCarryCount");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getHandCarryCount());
        writer.w("luggageCount");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLuggageCount());
        writer.w("price");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("totalPrice");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTotalPrice());
        writer.p();
    }
}
