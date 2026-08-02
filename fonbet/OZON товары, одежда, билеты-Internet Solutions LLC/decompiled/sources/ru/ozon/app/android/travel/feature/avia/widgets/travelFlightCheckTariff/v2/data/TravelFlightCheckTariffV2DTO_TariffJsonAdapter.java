package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data;

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
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data.TravelFlightCheckTariffV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO_TariffJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "nullableStringAdapter", "", "booleanAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff$Direction;", "listOfDirectionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffV2DTO_TariffJsonAdapter extends JsonAdapter<TravelFlightCheckTariffV2DTO.Tariff> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TravelFlightCheckTariffV2DTO.Tariff> constructorRef;

    @NotNull
    private final JsonAdapter<List<TravelFlightCheckTariffV2DTO.Tariff.Direction>> listOfDirectionAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelFlightCheckTariffV2DTO_TariffJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "price", "discount", "premiumBadge", "selectAction", "badge", "priceLabel", "borderColor", "isSelected", "directions");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "discount");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "premiumBadge");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "selectAction");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.listOfDirectionAdapter = moshi.f(D.e(List.class, TravelFlightCheckTariffV2DTO.Tariff.Direction.class), m11, "directions");
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(TravelFlightCheckTariffV2DTO.Tariff)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelFlightCheckTariffV2DTO.Tariff fromJson(@NotNull n reader) {
        Price price;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Price price2 = null;
        Boolean bool2 = bool;
        TextAtom textAtom = null;
        Badge badge = null;
        AtomActionDTO atomActionDTO = null;
        Badge badge2 = null;
        TextAtom textAtom2 = null;
        String str = null;
        List<TravelFlightCheckTariffV2DTO.Tariff.Direction> list = null;
        int i11 = -1;
        TextAtom textAtom3 = null;
        while (true) {
            TextAtom textAtom4 = textAtom;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -769) {
                    if (textAtom4 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (price2 == null) {
                        throw c.j("price", "price", reader);
                    }
                    if (atomActionDTO == null) {
                        throw c.j("selectAction", "selectAction", reader);
                    }
                    boolean booleanValue = bool2.booleanValue();
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data.TravelFlightCheckTariffV2DTO.Tariff.Direction>");
                    return new TravelFlightCheckTariffV2DTO.Tariff(textAtom4, price2, textAtom3, badge, atomActionDTO, badge2, textAtom2, str, booleanValue, list);
                }
                Constructor<TravelFlightCheckTariffV2DTO.Tariff> constructor = this.constructorRef;
                if (constructor == null) {
                    price = price2;
                    constructor = TravelFlightCheckTariffV2DTO.Tariff.class.getDeclaredConstructor(TextAtom.class, Price.class, TextAtom.class, Badge.class, AtomActionDTO.class, Badge.class, TextAtom.class, String.class, Boolean.TYPE, List.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    price = price2;
                }
                if (textAtom4 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (price == null) {
                    throw c.j("price", "price", reader);
                }
                if (atomActionDTO == null) {
                    throw c.j("selectAction", "selectAction", reader);
                }
                String str2 = str;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                Price price3 = price;
                TravelFlightCheckTariffV2DTO.Tariff newInstance = constructor.newInstance(textAtom4, price3, textAtom3, badge, atomActionDTO2, badge2, textAtom2, str2, bool2, list, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    continue;
                case 1:
                    price2 = this.priceAdapter.fromJson(reader);
                    if (price2 == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 2:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("selectAction", "selectAction", reader);
                    }
                    break;
                case 5:
                    badge2 = this.nullableBadgeAdapter.fromJson(reader);
                    break;
                case 6:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    list = this.listOfDirectionAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("directions", "directions", reader);
                    }
                    i11 &= -513;
                    break;
            }
            textAtom = textAtom4;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelFlightCheckTariffV2DTO.Tariff value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("discount");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDiscount());
        writer.w("premiumBadge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getPremiumBadge());
        writer.w("selectAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getSelectAction());
        writer.w("badge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("priceLabel");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getPriceLabel());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("directions");
        this.listOfDirectionAdapter.mo44toJson(writer, (x) value.getDirections());
        writer.p();
    }
}
