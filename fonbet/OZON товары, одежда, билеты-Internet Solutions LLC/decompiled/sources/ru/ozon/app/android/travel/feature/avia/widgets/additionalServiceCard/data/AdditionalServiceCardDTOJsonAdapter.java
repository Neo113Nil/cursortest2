package ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data.AdditionalServiceCardDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "stringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "iconAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO$DetailDTO;", "listOfDetailDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "nullableEmptyStateDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalServiceCardDTOJsonAdapter extends JsonAdapter<AdditionalServiceCardDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;
    private volatile Constructor<AdditionalServiceCardDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Icon> iconAdapter;

    @NotNull
    private final JsonAdapter<List<AdditionalServiceCardDTO.DetailDTO>> listOfDetailDTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateDTO> nullableEmptyStateDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public AdditionalServiceCardDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "price", "priceSubtitle", "imageURL", "backgroundImageColor", "serviceAction", "disclosureIcon", "trackingInfo", "details", "emptyState");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.stringAdapter = moshi.f(String.class, m11, "imageURL");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundImageColor");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "serviceAction");
        this.iconAdapter = moshi.f(Icon.class, m11, "disclosureIcon");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.listOfDetailDTOAdapter = moshi.f(D.e(List.class, AdditionalServiceCardDTO.DetailDTO.class), m11, "details");
        this.nullableEmptyStateDTOAdapter = moshi.f(EmptyStateDTO.class, m11, "emptyState");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(AdditionalServiceCardDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdditionalServiceCardDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        Price price = null;
        TextAtom textAtom3 = null;
        String str = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        Icon icon = null;
        Map<String, TokenizedTrackingInfo> map = null;
        List<AdditionalServiceCardDTO.DetailDTO> list = null;
        EmptyStateDTO emptyStateDTO = null;
        while (true) {
            TextAtom textAtom4 = textAtom;
            TextAtom textAtom5 = textAtom2;
            Price price2 = price;
            TextAtom textAtom6 = textAtom3;
            if (!reader.hasNext()) {
                String str3 = str;
                reader.endObject();
                if (i12 == -513) {
                    if (textAtom4 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (price2 == null) {
                        throw c.j("price", "price", reader);
                    }
                    if (textAtom6 == null) {
                        throw c.j("priceSubtitle", "priceSubtitle", reader);
                    }
                    if (str3 == null) {
                        throw c.j("imageURL", "imageURL", reader);
                    }
                    if (atomActionDTO == null) {
                        throw c.j("serviceAction", "serviceAction", reader);
                    }
                    if (icon == null) {
                        throw c.j("disclosureIcon", "disclosureIcon", reader);
                    }
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data.AdditionalServiceCardDTO.DetailDTO>");
                    Map<String, TokenizedTrackingInfo> map2 = map;
                    return new AdditionalServiceCardDTO(textAtom4, textAtom5, price2, textAtom6, str3, str2, atomActionDTO, icon, map2, list, emptyStateDTO);
                }
                Constructor<AdditionalServiceCardDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = AdditionalServiceCardDTO.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, Price.class, TextAtom.class, String.class, String.class, AtomActionDTO.class, Icon.class, Map.class, List.class, EmptyStateDTO.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<AdditionalServiceCardDTO> constructor2 = constructor;
                if (textAtom4 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (price2 == null) {
                    throw c.j("price", "price", reader);
                }
                if (textAtom6 == null) {
                    throw c.j("priceSubtitle", "priceSubtitle", reader);
                }
                if (str3 == null) {
                    throw c.j("imageURL", "imageURL", reader);
                }
                if (atomActionDTO == null) {
                    throw c.j("serviceAction", "serviceAction", reader);
                }
                if (icon == null) {
                    throw c.j("disclosureIcon", "disclosureIcon", reader);
                }
                AdditionalServiceCardDTO newInstance = constructor2.newInstance(textAtom4, textAtom5, price2, textAtom6, str3, str2, atomActionDTO, icon, map, list, emptyStateDTO, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str4 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    str = str4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                case 1:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    str = str4;
                    textAtom = textAtom4;
                    price = price2;
                    textAtom3 = textAtom6;
                case 2:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    textAtom3 = textAtom6;
                case 3:
                    textAtom3 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom3 == null) {
                        throw c.q("priceSubtitle", "priceSubtitle", reader);
                    }
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                case 4:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("imageURL", "imageURL", reader);
                    }
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                case 6:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("serviceAction", "serviceAction", reader);
                    }
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                case 7:
                    icon = this.iconAdapter.fromJson(reader);
                    if (icon == null) {
                        throw c.q("disclosureIcon", "disclosureIcon", reader);
                    }
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                case 9:
                    list = this.listOfDetailDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("details", "details", reader);
                    }
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                    i12 = -513;
                case 10:
                    emptyStateDTO = this.nullableEmptyStateDTOAdapter.fromJson(reader);
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
                default:
                    str = str4;
                    textAtom = textAtom4;
                    textAtom2 = textAtom5;
                    price = price2;
                    textAtom3 = textAtom6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdditionalServiceCardDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceSubtitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPriceSubtitle());
        writer.w("imageURL");
        this.stringAdapter.mo44toJson(writer, (x) value.getImageURL());
        writer.w("backgroundImageColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundImageColor());
        writer.w("serviceAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getServiceAction());
        writer.w("disclosureIcon");
        this.iconAdapter.mo44toJson(writer, (x) value.getDisclosureIcon());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("details");
        this.listOfDetailDTOAdapter.mo44toJson(writer, (x) value.getDetails());
        writer.w("emptyState");
        this.nullableEmptyStateDTOAdapter.mo44toJson(writer, (x) value.getEmptyState());
        writer.p();
    }
}
