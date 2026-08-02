package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.data.ChangeEmailDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R$\u0010!\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ChangeEmailInputDTO;", "nullableChangeEmailInputDTOAdapter", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$InputDTO;", "nullableListOfInputDTOAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ButtonDTO;", "nullableListOfNullableButtonDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeEmailDTOJsonAdapter extends JsonAdapter<ChangeEmailDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ChangeEmailDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<ChangeEmailDTO.ChangeEmailInputDTO> nullableChangeEmailInputDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ChangeEmailDTO.InputDTO>> nullableListOfInputDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ChangeEmailDTO.ButtonDTO>> nullableListOfNullableButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ChangeEmailDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("state", "changeEmail", "inputs", "cell", "buttons", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "state");
        this.nullableChangeEmailInputDTOAdapter = moshi.f(ChangeEmailDTO.ChangeEmailInputDTO.class, m11, "changeEmail");
        this.nullableListOfInputDTOAdapter = moshi.f(D.e(List.class, ChangeEmailDTO.InputDTO.class), m11, "inputs");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "cell");
        this.nullableListOfNullableButtonDTOAdapter = moshi.f(D.e(List.class, ChangeEmailDTO.ButtonDTO.class), m11, "buttons");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(ChangeEmailDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChangeEmailDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        ChangeEmailDTO.ChangeEmailInputDTO changeEmailInputDTO = null;
        List<ChangeEmailDTO.InputDTO> list = null;
        CellDTO cellDTO = null;
        List<ChangeEmailDTO.ButtonDTO> list2 = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("state", "state", reader);
                    }
                    break;
                case 1:
                    changeEmailInputDTO = this.nullableChangeEmailInputDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.nullableListOfInputDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.nullableListOfNullableButtonDTOAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 6:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -145) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            List<ChangeEmailDTO.ButtonDTO> list3 = list2;
            CellDTO cellDTO2 = cellDTO;
            List<ChangeEmailDTO.InputDTO> list4 = list;
            ChangeEmailDTO.ChangeEmailInputDTO changeEmailInputDTO2 = changeEmailInputDTO;
            String str2 = str;
            if (str2 == null) {
                throw c.j("state", "state", reader);
            }
            if (textDTO4 != null) {
                return new ChangeEmailDTO(str2, changeEmailInputDTO2, list4, cellDTO2, list3, textDTO4, textDTO3, map2);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        List<ChangeEmailDTO.ButtonDTO> list5 = list2;
        CellDTO cellDTO3 = cellDTO;
        List<ChangeEmailDTO.InputDTO> list6 = list;
        ChangeEmailDTO.ChangeEmailInputDTO changeEmailInputDTO3 = changeEmailInputDTO;
        String str3 = str;
        Constructor<ChangeEmailDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ChangeEmailDTO.class.getDeclaredConstructor(String.class, ChangeEmailDTO.ChangeEmailInputDTO.class, List.class, CellDTO.class, List.class, TextDTO.class, TextDTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<ChangeEmailDTO> constructor2 = constructor;
        if (str3 == null) {
            throw c.j("state", "state", reader);
        }
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        ChangeEmailDTO newInstance = constructor2.newInstance(str3, changeEmailInputDTO3, list6, cellDTO3, list5, textDTO6, textDTO5, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChangeEmailDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("state");
        this.stringAdapter.mo44toJson(writer, (x) value.getState());
        writer.w("changeEmail");
        this.nullableChangeEmailInputDTOAdapter.mo44toJson(writer, (x) value.getChangeEmail());
        writer.w("inputs");
        this.nullableListOfInputDTOAdapter.mo44toJson(writer, (x) value.getInputs());
        writer.w("cell");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("buttons");
        this.nullableListOfNullableButtonDTOAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
