package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data;

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
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO_BonusPriceRowDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButtonAdapter", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2DTO_BonusPriceRowDTOJsonAdapter extends JsonAdapter<TravelPriceDetailInformationV2DTO.BonusPriceRowDTO> {
    public static final int $stable = 8;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> smallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelPriceDetailInformationV2DTO_BonusPriceRowDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "bonusPrice", "bonusPriceBackgroundColor", "price", "bonusDetailsIconButton", "bonusDetailsTitle", "priceDetailsIconButton", "priceDetailsTitle");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "bonusPriceBackgroundColor");
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.smallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "bonusDetailsIconButton");
    }

    @NotNull
    public String toString() {
        return b.c(72, "GeneratedJsonAdapter(TravelPriceDetailInformationV2DTO.BonusPriceRowDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPriceDetailInformationV2DTO.BonusPriceRowDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        String str = null;
        Price price = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        TextAtom textAtom3 = null;
        ButtonV3Atom.SmallIconButton smallIconButton2 = null;
        TextAtom textAtom4 = null;
        while (true) {
            TextAtom textAtom5 = textAtom;
            TextAtom textAtom6 = textAtom2;
            if (!reader.hasNext()) {
                String str2 = str;
                reader.endObject();
                if (textAtom5 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textAtom6 == null) {
                    throw c.j("bonusPrice", "bonusPrice", reader);
                }
                if (str2 == null) {
                    throw c.j("bonusPriceBackgroundColor", "bonusPriceBackgroundColor", reader);
                }
                if (price == null) {
                    throw c.j("price", "price", reader);
                }
                if (smallIconButton == null) {
                    throw c.j("bonusDetailsIconButton", "bonusDetailsIconButton", reader);
                }
                if (textAtom3 == null) {
                    throw c.j("bonusDetailsTitle", "bonusDetailsTitle", reader);
                }
                if (smallIconButton2 == null) {
                    throw c.j("priceDetailsIconButton", "priceDetailsIconButton", reader);
                }
                if (textAtom4 != null) {
                    return new TravelPriceDetailInformationV2DTO.BonusPriceRowDTO(textAtom5, textAtom6, str2, price, smallIconButton, textAtom3, smallIconButton2, textAtom4);
                }
                throw c.j("priceDetailsTitle", "priceDetailsTitle", reader);
            }
            String str3 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str3;
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    str = str3;
                    textAtom2 = textAtom6;
                case 1:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("bonusPrice", "bonusPrice", reader);
                    }
                    str = str3;
                    textAtom = textAtom5;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("bonusPriceBackgroundColor", "bonusPriceBackgroundColor", reader);
                    }
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
                case 3:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    str = str3;
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
                case 4:
                    smallIconButton = this.smallIconButtonAdapter.fromJson(reader);
                    if (smallIconButton == null) {
                        throw c.q("bonusDetailsIconButton", "bonusDetailsIconButton", reader);
                    }
                    str = str3;
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
                case 5:
                    textAtom3 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom3 == null) {
                        throw c.q("bonusDetailsTitle", "bonusDetailsTitle", reader);
                    }
                    str = str3;
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
                case 6:
                    smallIconButton2 = this.smallIconButtonAdapter.fromJson(reader);
                    if (smallIconButton2 == null) {
                        throw c.q("priceDetailsIconButton", "priceDetailsIconButton", reader);
                    }
                    str = str3;
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
                case 7:
                    textAtom4 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom4 == null) {
                        throw c.q("priceDetailsTitle", "priceDetailsTitle", reader);
                    }
                    str = str3;
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
                default:
                    str = str3;
                    textAtom = textAtom5;
                    textAtom2 = textAtom6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPriceDetailInformationV2DTO.BonusPriceRowDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("bonusPrice");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getBonusPrice());
        writer.w("bonusPriceBackgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBonusPriceBackgroundColor());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("bonusDetailsIconButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getBonusDetailsIconButton());
        writer.w("bonusDetailsTitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getBonusDetailsTitle());
        writer.w("priceDetailsIconButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getPriceDetailsIconButton());
        writer.w("priceDetailsTitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPriceDetailsTitle());
        writer.p();
    }
}
