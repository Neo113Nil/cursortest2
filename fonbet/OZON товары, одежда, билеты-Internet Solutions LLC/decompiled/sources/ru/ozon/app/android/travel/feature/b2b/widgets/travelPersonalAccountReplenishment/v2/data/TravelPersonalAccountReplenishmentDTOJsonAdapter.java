package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data;

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
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO$InputDTO;", "inputDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "nullableTextAtomAdapter", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "listOfTagAtomAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPersonalAccountReplenishmentDTOJsonAdapter extends JsonAdapter<TravelPersonalAccountReplenishmentDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelPersonalAccountReplenishmentDTO> constructorRef;

    @NotNull
    private final JsonAdapter<TravelPersonalAccountReplenishmentDTO.InputDTO> inputDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<TagV3Atom.TagAtom>> listOfTagAtomAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelPersonalAccountReplenishmentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "input", "submitButton", "description", "agreementText", "inputVariants");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.inputDTOAdapter = moshi.f(TravelPersonalAccountReplenishmentDTO.InputDTO.class, m11, "input");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "submitButton");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "description");
        this.listOfTagAtomAdapter = moshi.f(D.e(List.class, TagV3Atom.TagAtom.class), m11, "inputVariants");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(TravelPersonalAccountReplenishmentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPersonalAccountReplenishmentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextAtom textAtom = null;
        TravelPersonalAccountReplenishmentDTO.InputDTO inputDTO = null;
        ButtonV3Atom.LargeButton largeButton = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        List<TagV3Atom.TagAtom> list = null;
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
                    inputDTO = this.inputDTOAdapter.fromJson(reader);
                    if (inputDTO == null) {
                        throw c.q("input", "input", reader);
                    }
                    break;
                case 2:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("submitButton", "submitButton", reader);
                    }
                    break;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.listOfTagAtomAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("inputVariants", "inputVariants", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            TextAtom textAtom4 = textAtom3;
            TextAtom textAtom5 = textAtom2;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            TravelPersonalAccountReplenishmentDTO.InputDTO inputDTO2 = inputDTO;
            TextAtom textAtom6 = textAtom;
            if (textAtom6 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (inputDTO2 == null) {
                throw c.j("input", "input", reader);
            }
            if (largeButton2 == null) {
                throw c.j("submitButton", "submitButton", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.tag.TagV3Atom.TagAtom>");
            return new TravelPersonalAccountReplenishmentDTO(textAtom6, inputDTO2, largeButton2, textAtom5, textAtom4, list);
        }
        TextAtom textAtom7 = textAtom3;
        TextAtom textAtom8 = textAtom2;
        ButtonV3Atom.LargeButton largeButton3 = largeButton;
        TravelPersonalAccountReplenishmentDTO.InputDTO inputDTO3 = inputDTO;
        TextAtom textAtom9 = textAtom;
        Constructor<TravelPersonalAccountReplenishmentDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelPersonalAccountReplenishmentDTO.class.getDeclaredConstructor(TextAtom.class, TravelPersonalAccountReplenishmentDTO.InputDTO.class, ButtonV3Atom.LargeButton.class, TextAtom.class, TextAtom.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TravelPersonalAccountReplenishmentDTO> constructor2 = constructor;
        if (textAtom9 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (inputDTO3 == null) {
            throw c.j("input", "input", reader);
        }
        if (largeButton3 == null) {
            throw c.j("submitButton", "submitButton", reader);
        }
        TravelPersonalAccountReplenishmentDTO newInstance = constructor2.newInstance(textAtom9, inputDTO3, largeButton3, textAtom8, textAtom7, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPersonalAccountReplenishmentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("input");
        this.inputDTOAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("submitButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("description");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("agreementText");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAgreementText());
        writer.w("inputVariants");
        this.listOfTagAtomAdapter.mo44toJson(writer, (x) value.getInputVariants());
        writer.p();
    }
}
