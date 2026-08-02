package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data;

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
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data.TravelDocumentsToEmailDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "disclaimerAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "cellWithSubtitleToggleAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Input;", "nullableInputAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "nullableSmallBorderlessButtonAdapter", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Email;", "listOfEmailAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelDocumentsToEmailDTOJsonAdapter extends JsonAdapter<TravelDocumentsToEmailDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> cellWithSubtitleToggleAdapter;
    private volatile Constructor<TravelDocumentsToEmailDTO> constructorRef;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> disclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<List<TravelDocumentsToEmailDTO.Email>> listOfEmailAdapter;

    @NotNull
    private final JsonAdapter<TravelDocumentsToEmailDTO.Input> nullableInputAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButton> nullableSmallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public TravelDocumentsToEmailDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("annotation", "receiveEmailToggle", "emailTitle", "emailInput", "submitEmailButton", "addEmailInputButton", "emails");
        M m11 = M.f71699a;
        this.disclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.cellWithSubtitleToggleAdapter = moshi.f(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class, m11, "receiveEmailToggle");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "emailTitle");
        this.nullableInputAdapter = moshi.f(TravelDocumentsToEmailDTO.Input.class, m11, "emailInput");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "submitEmailButton");
        this.nullableSmallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "addEmailInputButton");
        this.listOfEmailAdapter = moshi.f(D.e(List.class, TravelDocumentsToEmailDTO.Email.class), m11, "emails");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(TravelDocumentsToEmailDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelDocumentsToEmailDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        DisclaimerAtom disclaimerAtom = null;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = null;
        TextAtom textAtom = null;
        TravelDocumentsToEmailDTO.Input input = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        List<TravelDocumentsToEmailDTO.Email> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    disclaimerAtom = this.disclaimerAtomAdapter.fromJson(reader);
                    if (disclaimerAtom == null) {
                        throw c.q("annotation_", "annotation", reader);
                    }
                    break;
                case 1:
                    cellWithSubtitleToggle = this.cellWithSubtitleToggleAdapter.fromJson(reader);
                    if (cellWithSubtitleToggle == null) {
                        throw c.q("receiveEmailToggle", "receiveEmailToggle", reader);
                    }
                    break;
                case 2:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    input = this.nullableInputAdapter.fromJson(reader);
                    break;
                case 4:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    smallBorderlessButton = this.nullableSmallBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.listOfEmailAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("emails", "emails", reader);
                    }
                    i11 = -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65) {
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            TravelDocumentsToEmailDTO.Input input2 = input;
            TextAtom textAtom2 = textAtom;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle2 = cellWithSubtitleToggle;
            DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
            if (disclaimerAtom2 == null) {
                throw c.j("annotation_", "annotation", reader);
            }
            if (cellWithSubtitleToggle2 == null) {
                throw c.j("receiveEmailToggle", "receiveEmailToggle", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data.TravelDocumentsToEmailDTO.Email>");
            return new TravelDocumentsToEmailDTO(disclaimerAtom2, cellWithSubtitleToggle2, textAtom2, input2, largeButton2, smallBorderlessButton2, list);
        }
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton3 = smallBorderlessButton;
        ButtonV3Atom.LargeButton largeButton3 = largeButton;
        TravelDocumentsToEmailDTO.Input input3 = input;
        TextAtom textAtom3 = textAtom;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle3 = cellWithSubtitleToggle;
        DisclaimerAtom disclaimerAtom3 = disclaimerAtom;
        Constructor<TravelDocumentsToEmailDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelDocumentsToEmailDTO.class.getDeclaredConstructor(DisclaimerAtom.class, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class, TextAtom.class, TravelDocumentsToEmailDTO.Input.class, ButtonV3Atom.LargeButton.class, ButtonV3Atom.SmallBorderlessButton.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TravelDocumentsToEmailDTO> constructor2 = constructor;
        if (disclaimerAtom3 == null) {
            throw c.j("annotation_", "annotation", reader);
        }
        if (cellWithSubtitleToggle3 == null) {
            throw c.j("receiveEmailToggle", "receiveEmailToggle", reader);
        }
        TravelDocumentsToEmailDTO newInstance = constructor2.newInstance(disclaimerAtom3, cellWithSubtitleToggle3, textAtom3, input3, largeButton3, smallBorderlessButton3, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelDocumentsToEmailDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("annotation");
        this.disclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("receiveEmailToggle");
        this.cellWithSubtitleToggleAdapter.mo44toJson(writer, (x) value.getReceiveEmailToggle());
        writer.w("emailTitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getEmailTitle());
        writer.w("emailInput");
        this.nullableInputAdapter.mo44toJson(writer, (x) value.getEmailInput());
        writer.w("submitEmailButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getSubmitEmailButton());
        writer.w("addEmailInputButton");
        this.nullableSmallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getAddEmailInputButton());
        writer.w("emails");
        this.listOfEmailAdapter.mo44toJson(writer, (x) value.getEmails());
        writer.p();
    }
}
