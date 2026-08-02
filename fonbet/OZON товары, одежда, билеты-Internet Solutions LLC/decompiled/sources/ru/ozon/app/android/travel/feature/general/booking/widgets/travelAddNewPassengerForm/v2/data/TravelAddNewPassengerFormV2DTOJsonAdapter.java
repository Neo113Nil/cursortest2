package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.data;

import Y9.b;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.data.TravelAddNewPassengerFormV2DTO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "listOfCommonInputDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO;", "nullableBonusCardsDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "largeButtonAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV2DTOJsonAdapter extends JsonAdapter<TravelAddNewPassengerFormV2DTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TravelAddNewPassengerFormV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<CommonInputDTO>> listOfCommonInputDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelAddNewPassengerFormV2DTO.BonusCardsDTO> nullableBonusCardsDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public TravelAddNewPassengerFormV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("inputs", "bonusCards", "addBonusCardButtonApp", "saveButton", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "agreementText", "isClearButtonVisible", "useBankDetails", "trackingInfo");
        b e11 = D.e(List.class, CommonInputDTO.class);
        M m11 = M.f71699a;
        this.listOfCommonInputDTOAdapter = moshi.f(e11, m11, "inputs");
        this.nullableBonusCardsDTOAdapter = moshi.f(TravelAddNewPassengerFormV2DTO.BonusCardsDTO.class, m11, "bonusCards");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "addBonusCardButtonApp");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "saveButton");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isClearButtonVisible");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "useBankDetails");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(52, "GeneratedJsonAdapter(TravelAddNewPassengerFormV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelAddNewPassengerFormV2DTO fromJson(@NotNull n reader) {
        List<CommonInputDTO> list;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        TravelAddNewPassengerFormV2DTO.BonusCardsDTO bonusCardsDTO = null;
        Boolean bool2 = bool;
        List<CommonInputDTO> list2 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        CellDTO cellDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        ButtonV3Atom.LargeButton largeButton2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list2 = this.listOfCommonInputDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("inputs", "inputs", reader);
                    }
                    break;
                case 1:
                    bonusCardsDTO = this.nullableBonusCardsDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    largeButton2 = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 3:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("saveButton", "saveButton", reader);
                    }
                    break;
                case 4:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isClearButtonVisible", "isClearButtonVisible", reader);
                    }
                    i11 = -129;
                    break;
                case 8:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -129) {
            if (list2 == null) {
                throw c.j("inputs", "inputs", reader);
            }
            if (largeButton != null) {
                return new TravelAddNewPassengerFormV2DTO(list2, bonusCardsDTO, largeButton2, largeButton, textAtom, textAtom2, textAtom3, bool2.booleanValue(), cellDTO, map);
            }
            throw c.j("saveButton", "saveButton", reader);
        }
        Constructor<TravelAddNewPassengerFormV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            list = list2;
            constructor = TravelAddNewPassengerFormV2DTO.class.getDeclaredConstructor(List.class, TravelAddNewPassengerFormV2DTO.BonusCardsDTO.class, ButtonV3Atom.LargeButton.class, ButtonV3Atom.LargeButton.class, TextAtom.class, TextAtom.class, TextAtom.class, Boolean.TYPE, CellDTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            list = list2;
        }
        if (list == null) {
            throw c.j("inputs", "inputs", reader);
        }
        if (largeButton == null) {
            throw c.j("saveButton", "saveButton", reader);
        }
        CellDTO cellDTO2 = cellDTO;
        TextAtom textAtom4 = textAtom2;
        ButtonV3Atom.LargeButton largeButton3 = largeButton2;
        TravelAddNewPassengerFormV2DTO newInstance = constructor.newInstance(list, bonusCardsDTO, largeButton3, largeButton, textAtom, textAtom4, textAtom3, bool2, cellDTO2, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelAddNewPassengerFormV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("inputs");
        this.listOfCommonInputDTOAdapter.mo44toJson(writer, (x) value.getInputs());
        writer.w("bonusCards");
        this.nullableBonusCardsDTOAdapter.mo44toJson(writer, (x) value.getBonusCards());
        writer.w("addBonusCardButtonApp");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getAddBonusCardButtonApp());
        writer.w("saveButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSaveButton());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("agreementText");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAgreementText());
        writer.w("isClearButtonVisible");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isClearButtonVisible()));
        writer.w("useBankDetails");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getUseBankDetails());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
