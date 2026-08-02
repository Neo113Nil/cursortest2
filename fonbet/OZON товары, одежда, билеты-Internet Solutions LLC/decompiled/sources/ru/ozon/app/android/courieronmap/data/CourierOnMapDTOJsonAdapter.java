package ru.ozon.app.android.courieronmap.data;

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
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.courieronmap.data.CourierOnMapDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/courieronmap/data/CourierOnMapDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;", "nullablePinInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "pinInfoAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "", "intAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$Cell;", "nullableListOfCellAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;", "nullableCourierDetailsAdapter", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierOnMapDTOJsonAdapter extends JsonAdapter<CourierOnMapDTO> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<CourierOnMapDTO.CourierDetails> nullableCourierDetailsAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<CourierOnMapDTO.Cell>> nullableListOfCellAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CourierOnMapDTO.PinInfo> nullablePinInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CourierOnMapDTO.PinInfo> pinInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public CourierOnMapDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("courier", "customer", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "refreshInterval", "annotation", "deliveryTime", "orderInfo", "button", "pinAnimationDuration", "trackingInfo", "courierDetails");
        M m11 = M.f71699a;
        this.nullablePinInfoAdapter = moshi.f(CourierOnMapDTO.PinInfo.class, m11, "courier");
        this.pinInfoAdapter = moshi.f(CourierOnMapDTO.PinInfo.class, m11, "customer");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "refreshInterval");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.nullableListOfCellAdapter = moshi.f(D.e(List.class, CourierOnMapDTO.Cell.class), m11, "orderInfo");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "button");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableCourierDetailsAdapter = moshi.f(CourierOnMapDTO.CourierDetails.class, m11, "courierDetails");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(CourierOnMapDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CourierOnMapDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        CourierOnMapDTO.PinInfo pinInfo = null;
        CourierOnMapDTO.PinInfo pinInfo2 = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        DisclaimerAtom disclaimerAtom = null;
        TextAtom textAtom3 = null;
        List<CourierOnMapDTO.Cell> list = null;
        ButtonV3Atom.LargeButton largeButton = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CourierOnMapDTO.CourierDetails courierDetails = null;
        while (true) {
            Integer num3 = num;
            Integer num4 = num2;
            CourierOnMapDTO.PinInfo pinInfo3 = pinInfo;
            if (!reader.hasNext()) {
                reader.endObject();
                if (pinInfo2 == null) {
                    throw c.j("customer", "customer", reader);
                }
                if (textAtom == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (num3 == null) {
                    throw c.j("refreshInterval", "refreshInterval", reader);
                }
                int intValue = num3.intValue();
                if (num4 != null) {
                    return new CourierOnMapDTO(pinInfo3, pinInfo2, textAtom, textAtom2, intValue, disclaimerAtom, textAtom3, list, largeButton, num4.intValue(), map, courierDetails);
                }
                throw c.j("pinAnimationDuration", "pinAnimationDuration", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 0:
                    pinInfo = this.nullablePinInfoAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                case 1:
                    pinInfo2 = this.pinInfoAdapter.fromJson(reader);
                    if (pinInfo2 == null) {
                        throw c.q("customer", "customer", reader);
                    }
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 2:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("refreshInterval", "refreshInterval", reader);
                    }
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 5:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 6:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 7:
                    list = this.nullableListOfCellAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 8:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 9:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("pinAnimationDuration", "pinAnimationDuration", reader);
                    }
                    num = num3;
                    pinInfo = pinInfo3;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                case 11:
                    courierDetails = this.nullableCourierDetailsAdapter.fromJson(reader);
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
                default:
                    num = num3;
                    num2 = num4;
                    pinInfo = pinInfo3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CourierOnMapDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("courier");
        this.nullablePinInfoAdapter.mo44toJson(writer, (x) value.getCourier());
        writer.w("customer");
        this.pinInfoAdapter.mo44toJson(writer, (x) value.getCustomer());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("refreshInterval");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getRefreshInterval()));
        writer.w("annotation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("deliveryTime");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDeliveryTime());
        writer.w("orderInfo");
        this.nullableListOfCellAdapter.mo44toJson(writer, (x) value.getOrderInfo());
        writer.w("button");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("pinAnimationDuration");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getPinAnimationDuration()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("courierDetails");
        this.nullableCourierDetailsAdapter.mo44toJson(writer, (x) value.getCourierDetails());
        writer.p();
    }
}
