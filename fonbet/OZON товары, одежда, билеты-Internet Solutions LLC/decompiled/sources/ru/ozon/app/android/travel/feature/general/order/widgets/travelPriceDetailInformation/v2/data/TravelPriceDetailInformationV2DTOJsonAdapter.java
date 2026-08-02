package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data;

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
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R(\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020+\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextAtomAdapter", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;", "listOfPriceRowDTOAdapter", "priceRowDTOAdapter", "nullablePriceRowDTOAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;", "nullableBonusPriceRowDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "nullablePaymentButtonLargeAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$StickyInformationDTO;", "nullableStickyInformationDTOAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2DTOJsonAdapter extends JsonAdapter<TravelPriceDetailInformationV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TravelPriceDetailInformationV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<TravelPriceDetailInformationV2DTO.PriceRowDTO>> listOfPriceRowDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelPriceDetailInformationV2DTO.BonusPriceRowDTO> nullableBonusPriceRowDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.PaymentButtonLarge> nullablePaymentButtonLargeAdapter;

    @NotNull
    private final JsonAdapter<TravelPriceDetailInformationV2DTO.PriceRowDTO> nullablePriceRowDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelPriceDetailInformationV2DTO.StickyInformationDTO> nullableStickyInformationDTOAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TravelPriceDetailInformationV2DTO.PriceRowDTO> priceRowDTOAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelPriceDetailInformationV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "priceRows", "total", "rowUnderTotal", "bonusTotal", DynamicElementDTO.LARGE_BUTTON, "paymentButton", "agreement", "stickyInformation", "shouldHideMainButton", "trackingInfo");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.listOfPriceRowDTOAdapter = moshi.f(D.e(List.class, TravelPriceDetailInformationV2DTO.PriceRowDTO.class), m11, "priceRows");
        this.priceRowDTOAdapter = moshi.f(TravelPriceDetailInformationV2DTO.PriceRowDTO.class, m11, "total");
        this.nullablePriceRowDTOAdapter = moshi.f(TravelPriceDetailInformationV2DTO.PriceRowDTO.class, m11, "rowUnderTotal");
        this.nullableBonusPriceRowDTOAdapter = moshi.f(TravelPriceDetailInformationV2DTO.BonusPriceRowDTO.class, m11, "bonusTotal");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, DynamicElementDTO.LARGE_BUTTON);
        this.nullablePaymentButtonLargeAdapter = moshi.f(ButtonV3Atom.PaymentButtonLarge.class, m11, "paymentButton");
        this.nullableStickyInformationDTOAdapter = moshi.f(TravelPriceDetailInformationV2DTO.StickyInformationDTO.class, m11, "stickyInformation");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "shouldHideMainButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(TravelPriceDetailInformationV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPriceDetailInformationV2DTO fromJson(@NotNull n reader) {
        TravelPriceDetailInformationV2DTO.PriceRowDTO priceRowDTO;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        TextAtom textAtom = null;
        Boolean bool2 = bool;
        TextAtom textAtom2 = null;
        TravelPriceDetailInformationV2DTO.PriceRowDTO priceRowDTO2 = null;
        TravelPriceDetailInformationV2DTO.PriceRowDTO priceRowDTO3 = null;
        TravelPriceDetailInformationV2DTO.BonusPriceRowDTO bonusPriceRowDTO = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.PaymentButtonLarge paymentButtonLarge = null;
        TextAtom textAtom3 = null;
        TravelPriceDetailInformationV2DTO.StickyInformationDTO stickyInformationDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        List<TravelPriceDetailInformationV2DTO.PriceRowDTO> list = null;
        while (true) {
            TextAtom textAtom4 = textAtom2;
            TextAtom textAtom5 = textAtom;
            List<TravelPriceDetailInformationV2DTO.PriceRowDTO> list2 = list;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -1025) {
                    if (textAtom4 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (list2 == null) {
                        throw c.j("priceRows", "priceRows", reader);
                    }
                    if (priceRowDTO2 == null) {
                        throw c.j("total", "total", reader);
                    }
                    if (largeButton == null) {
                        throw c.j(DynamicElementDTO.LARGE_BUTTON, DynamicElementDTO.LARGE_BUTTON, reader);
                    }
                    return new TravelPriceDetailInformationV2DTO(textAtom4, textAtom5, list2, priceRowDTO2, priceRowDTO3, bonusPriceRowDTO, largeButton, paymentButtonLarge, textAtom3, stickyInformationDTO, bool2.booleanValue(), map);
                }
                Constructor<TravelPriceDetailInformationV2DTO> constructor = this.constructorRef;
                if (constructor == null) {
                    priceRowDTO = priceRowDTO2;
                    constructor = TravelPriceDetailInformationV2DTO.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, List.class, TravelPriceDetailInformationV2DTO.PriceRowDTO.class, TravelPriceDetailInformationV2DTO.PriceRowDTO.class, TravelPriceDetailInformationV2DTO.BonusPriceRowDTO.class, ButtonV3Atom.LargeButton.class, ButtonV3Atom.PaymentButtonLarge.class, TextAtom.class, TravelPriceDetailInformationV2DTO.StickyInformationDTO.class, Boolean.TYPE, Map.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    priceRowDTO = priceRowDTO2;
                }
                if (textAtom4 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (list2 == null) {
                    throw c.j("priceRows", "priceRows", reader);
                }
                if (priceRowDTO == null) {
                    throw c.j("total", "total", reader);
                }
                if (largeButton == null) {
                    throw c.j(DynamicElementDTO.LARGE_BUTTON, DynamicElementDTO.LARGE_BUTTON, reader);
                }
                TravelPriceDetailInformationV2DTO newInstance = constructor.newInstance(textAtom4, textAtom5, list2, priceRowDTO, priceRowDTO3, bonusPriceRowDTO, largeButton, paymentButtonLarge, textAtom3, stickyInformationDTO, bool2, map, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 0:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    textAtom = textAtom5;
                    list = list2;
                case 1:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    textAtom2 = textAtom4;
                    list = list2;
                case 2:
                    list = this.listOfPriceRowDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("priceRows", "priceRows", reader);
                    }
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                case 3:
                    priceRowDTO2 = this.priceRowDTOAdapter.fromJson(reader);
                    if (priceRowDTO2 == null) {
                        throw c.q("total", "total", reader);
                    }
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 4:
                    priceRowDTO3 = this.nullablePriceRowDTOAdapter.fromJson(reader);
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 5:
                    bonusPriceRowDTO = this.nullableBonusPriceRowDTOAdapter.fromJson(reader);
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 6:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q(DynamicElementDTO.LARGE_BUTTON, DynamicElementDTO.LARGE_BUTTON, reader);
                    }
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 7:
                    paymentButtonLarge = this.nullablePaymentButtonLargeAdapter.fromJson(reader);
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 8:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 9:
                    stickyInformationDTO = this.nullableStickyInformationDTOAdapter.fromJson(reader);
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                case 10:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("shouldHideMainButton", "shouldHideMainButton", reader);
                    }
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                    i11 = -1025;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
                default:
                    textAtom2 = textAtom4;
                    textAtom = textAtom5;
                    list = list2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPriceDetailInformationV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("priceRows");
        this.listOfPriceRowDTOAdapter.mo44toJson(writer, (x) value.getPriceRows());
        writer.w("total");
        this.priceRowDTOAdapter.mo44toJson(writer, (x) value.getTotal());
        writer.w("rowUnderTotal");
        this.nullablePriceRowDTOAdapter.mo44toJson(writer, (x) value.getRowUnderTotal());
        writer.w("bonusTotal");
        this.nullableBonusPriceRowDTOAdapter.mo44toJson(writer, (x) value.getBonusTotal());
        writer.w(DynamicElementDTO.LARGE_BUTTON);
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getLargeButton());
        writer.w("paymentButton");
        this.nullablePaymentButtonLargeAdapter.mo44toJson(writer, (x) value.getPaymentButton());
        writer.w("agreement");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAgreement());
        writer.w("stickyInformation");
        this.nullableStickyInformationDTOAdapter.mo44toJson(writer, (x) value.getStickyInformation());
        writer.w("shouldHideMainButton");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldHideMainButton()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
