package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.data;

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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.data.TravelPaymentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/data/TravelPaymentV3DTO$PaymentMethodDTO;", "listOfPaymentMethodDTOAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "listOfCellWithSubtitleCheckboxRadioAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "nullableSmallBorderlessButtonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPaymentV3DTOJsonAdapter extends JsonAdapter<TravelPaymentV3DTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelPaymentV3DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio>> listOfCellWithSubtitleCheckboxRadioAdapter;

    @NotNull
    private final JsonAdapter<List<TravelPaymentV3DTO.PaymentMethodDTO>> listOfPaymentMethodDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButton> nullableSmallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelPaymentV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "paymentMethods", "annotation", "optionsTitle", "paymentOptions", "confirmButton", "milesButton");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfPaymentMethodDTOAdapter = moshi.f(D.e(List.class, TravelPaymentV3DTO.PaymentMethodDTO.class), m11, "paymentMethods");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "optionsTitle");
        this.listOfCellWithSubtitleCheckboxRadioAdapter = moshi.f(D.e(List.class, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.class), m11, "paymentOptions");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "confirmButton");
        this.nullableSmallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "milesButton");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(TravelPaymentV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPaymentV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextAtom textAtom = null;
        List<TravelPaymentV3DTO.PaymentMethodDTO> list = null;
        DisclaimerAtom disclaimerAtom = null;
        TextAtom textAtom2 = null;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> list2 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        while (reader.hasNext()) {
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
                    break;
                case 1:
                    list = this.listOfPaymentMethodDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("paymentMethods", "paymentMethods", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.listOfCellWithSubtitleCheckboxRadioAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("paymentOptions", "paymentOptions", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 6:
                    smallBorderlessButton = this.nullableSmallBorderlessButtonAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -19) {
            TextAtom textAtom3 = textAtom;
            if (textAtom3 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.data.TravelPaymentV3DTO.PaymentMethodDTO>");
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio>");
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> list3 = list2;
            return new TravelPaymentV3DTO(textAtom3, list, disclaimerAtom, textAtom2, list3, largeButton2, smallBorderlessButton2);
        }
        TextAtom textAtom4 = textAtom;
        Constructor<TravelPaymentV3DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelPaymentV3DTO.class.getDeclaredConstructor(TextAtom.class, List.class, DisclaimerAtom.class, TextAtom.class, List.class, ButtonV3Atom.LargeButton.class, ButtonV3Atom.SmallBorderlessButton.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TravelPaymentV3DTO> constructor2 = constructor;
        if (textAtom4 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        TravelPaymentV3DTO newInstance = constructor2.newInstance(textAtom4, list, disclaimerAtom, textAtom2, list2, largeButton, smallBorderlessButton, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPaymentV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("paymentMethods");
        this.listOfPaymentMethodDTOAdapter.mo44toJson(writer, (x) value.getPaymentMethods());
        writer.w("annotation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("optionsTitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getOptionsTitle());
        writer.w("paymentOptions");
        this.listOfCellWithSubtitleCheckboxRadioAdapter.mo44toJson(writer, (x) value.getPaymentOptions());
        writer.w("confirmButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getConfirmButton());
        writer.w("milesButton");
        this.nullableSmallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getMilesButton());
        writer.p();
    }
}
