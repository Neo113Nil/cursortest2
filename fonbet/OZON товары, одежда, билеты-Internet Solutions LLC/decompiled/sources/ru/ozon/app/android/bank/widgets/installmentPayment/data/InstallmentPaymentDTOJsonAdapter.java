package ru.ozon.app.android.bank.widgets.installmentPayment.data;

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
import ru.ozon.app.android.bank.widgets.installmentPayment.data.InstallmentPaymentDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$PaymentDTO;", "listOfPaymentDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableListOfPaymentDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "nullableSmallBorderlessButtonWithIconAdapter", "Lru/ozon/app/android/bank/widgets/installmentPayment/data/InstallmentPaymentDTO$IconTitleDTO;", "nullableIconTitleDTOAdapter", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentPaymentDTOJsonAdapter extends JsonAdapter<InstallmentPaymentDTO> {

    @NotNull
    private final JsonAdapter<List<InstallmentPaymentDTO.PaymentDTO>> listOfPaymentDTOAdapter;

    @NotNull
    private final JsonAdapter<InstallmentPaymentDTO.IconTitleDTO> nullableIconTitleDTOAdapter;

    @NotNull
    private final JsonAdapter<List<InstallmentPaymentDTO.PaymentDTO>> nullableListOfPaymentDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButtonWithIcon> nullableSmallBorderlessButtonWithIconAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public InstallmentPaymentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "payments", "trackingInfo", "titleGrace", "subtitleGrace", "paymentsGrace", "paymentsSwitch", "paymentsGraceSwitch", "iconTitle");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfPaymentDTOAdapter = moshi.f(D.e(List.class, InstallmentPaymentDTO.PaymentDTO.class), m11, "payments");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableListOfPaymentDTOAdapter = moshi.f(D.e(List.class, InstallmentPaymentDTO.PaymentDTO.class), m11, "paymentsGrace");
        this.nullableSmallBorderlessButtonWithIconAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButtonWithIcon.class, m11, "paymentsSwitch");
        this.nullableIconTitleDTOAdapter = moshi.f(InstallmentPaymentDTO.IconTitleDTO.class, m11, "iconTitle");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(InstallmentPaymentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InstallmentPaymentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        List<InstallmentPaymentDTO.PaymentDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TextAtom textAtom3 = null;
        TextAtom textAtom4 = null;
        List<InstallmentPaymentDTO.PaymentDTO> list2 = null;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = null;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = null;
        InstallmentPaymentDTO.IconTitleDTO iconTitleDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.listOfPaymentDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("payments", "payments", reader);
                    }
                    break;
                case 3:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    textAtom4 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    list2 = this.nullableListOfPaymentDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    smallBorderlessButtonWithIcon = this.nullableSmallBorderlessButtonWithIconAdapter.fromJson(reader);
                    break;
                case 8:
                    smallBorderlessButtonWithIcon2 = this.nullableSmallBorderlessButtonWithIconAdapter.fromJson(reader);
                    break;
                case 9:
                    iconTitleDTO = this.nullableIconTitleDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list != null) {
            return new InstallmentPaymentDTO(textAtom, textAtom2, list, map, textAtom3, textAtom4, list2, smallBorderlessButtonWithIcon, smallBorderlessButtonWithIcon2, iconTitleDTO);
        }
        throw c.j("payments", "payments", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InstallmentPaymentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("payments");
        this.listOfPaymentDTOAdapter.mo44toJson(writer, (x) value.getPayments());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("titleGrace");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitleGrace());
        writer.w("subtitleGrace");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitleGrace());
        writer.w("paymentsGrace");
        this.nullableListOfPaymentDTOAdapter.mo44toJson(writer, (x) value.getPaymentsGrace());
        writer.w("paymentsSwitch");
        this.nullableSmallBorderlessButtonWithIconAdapter.mo44toJson(writer, (x) value.getPaymentsSwitch());
        writer.w("paymentsGraceSwitch");
        this.nullableSmallBorderlessButtonWithIconAdapter.mo44toJson(writer, (x) value.getPaymentsGraceSwitch());
        writer.w("iconTitle");
        this.nullableIconTitleDTOAdapter.mo44toJson(writer, (x) value.getIconTitle());
        writer.p();
    }
}
