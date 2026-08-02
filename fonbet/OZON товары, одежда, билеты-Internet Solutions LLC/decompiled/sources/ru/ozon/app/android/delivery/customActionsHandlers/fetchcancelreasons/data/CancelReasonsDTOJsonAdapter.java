package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data;

import Y9.b;
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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "listOfCellWithSubtitleCheckboxRadioAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO$Input;", "inputAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "nullableCheckboxTitleSubtitleCellDTOAdapter", "stringAdapter", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "nullableConfirmingCancellationPopoverAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonsDTOJsonAdapter extends JsonAdapter<CancelReasonsDTO> {

    @NotNull
    private final JsonAdapter<CancelReasonsDTO.Input> inputAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio>> listOfCellWithSubtitleCheckboxRadioAdapter;

    @NotNull
    private final JsonAdapter<CheckboxTitleSubtitleCellDTO> nullableCheckboxTitleSubtitleCellDTOAdapter;

    @NotNull
    private final JsonAdapter<ConfirmingCancellationPopover> nullableConfirmingCancellationPopoverAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CancelReasonsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("reasons", "input", "annotation", "button", "checkbox", SelectionItemFormDTO.TITLE_FIELD_NAME, "confirmPopover", "caption");
        b e11 = D.e(List.class, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.class);
        M m11 = M.f71699a;
        this.listOfCellWithSubtitleCheckboxRadioAdapter = moshi.f(e11, m11, "reasons");
        this.inputAdapter = moshi.f(CancelReasonsDTO.Input.class, m11, "input");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "button");
        this.nullableCheckboxTitleSubtitleCellDTOAdapter = moshi.f(CheckboxTitleSubtitleCellDTO.class, m11, "checkbox");
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableConfirmingCancellationPopoverAdapter = moshi.f(ConfirmingCancellationPopover.class, m11, "confirmPopover");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "caption");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(38, "GeneratedJsonAdapter(CancelReasonsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CancelReasonsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> list = null;
        CancelReasonsDTO.Input input = null;
        DisclaimerAtom disclaimerAtom = null;
        ButtonV3Atom.LargeButton largeButton = null;
        CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO = null;
        String str = null;
        ConfirmingCancellationPopover confirmingCancellationPopover = null;
        TextDTO textDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfCellWithSubtitleCheckboxRadioAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("reasons", "reasons", reader);
                    }
                    break;
                case 1:
                    input = this.inputAdapter.fromJson(reader);
                    if (input == null) {
                        throw c.q("input", "input", reader);
                    }
                    break;
                case 2:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 4:
                    checkboxTitleSubtitleCellDTO = this.nullableCheckboxTitleSubtitleCellDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 6:
                    confirmingCancellationPopover = this.nullableConfirmingCancellationPopoverAdapter.fromJson(reader);
                    break;
                case 7:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("reasons", "reasons", reader);
        }
        if (input == null) {
            throw c.j("input", "input", reader);
        }
        if (largeButton == null) {
            throw c.j("button", "button", reader);
        }
        if (str != null) {
            return new CancelReasonsDTO(list, input, disclaimerAtom, largeButton, checkboxTitleSubtitleCellDTO, str, confirmingCancellationPopover, textDTO);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CancelReasonsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("reasons");
        this.listOfCellWithSubtitleCheckboxRadioAdapter.mo44toJson(writer, (x) value.getReasons());
        writer.w("input");
        this.inputAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("annotation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("button");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("checkbox");
        this.nullableCheckboxTitleSubtitleCellDTOAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("confirmPopover");
        this.nullableConfirmingCancellationPopoverAdapter.mo44toJson(writer, (x) value.getConfirmPopover());
        writer.w("caption");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getCaption());
        writer.p();
    }
}
