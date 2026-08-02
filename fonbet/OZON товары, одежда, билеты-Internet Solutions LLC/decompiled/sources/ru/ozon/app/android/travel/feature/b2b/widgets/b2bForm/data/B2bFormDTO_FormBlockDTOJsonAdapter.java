package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data;

import Ak.b;
import C.o0;
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
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data.B2bFormDTO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO_FormBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "nullableTravelWidgetSettingsDTOAdapter", "", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "listOfCommonInputV2DTOAdapter", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;", "nullableCellListBlockDTOAdapter", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "nullableDisclaimerDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFormDTO_FormBlockDTOJsonAdapter extends JsonAdapter<B2bFormDTO.FormBlockDTO> {
    public static final int $stable = 8;
    private volatile Constructor<B2bFormDTO.FormBlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<CommonInputV2DTO>> listOfCommonInputV2DTOAdapter;

    @NotNull
    private final JsonAdapter<B2bFormDTO.FormBlockDTO.CellListBlockDTO> nullableCellListBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO> nullableDisclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelWidgetSettingsDTO> nullableTravelWidgetSettingsDTOAdapter;

    @NotNull
    private final n.a options;

    public B2bFormDTO_FormBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "settings", "inputList", "cellListBlock", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "gap");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "id");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTravelWidgetSettingsDTOAdapter = moshi.f(TravelWidgetSettingsDTO.class, m11, "settings");
        this.listOfCommonInputV2DTOAdapter = moshi.f(D.e(List.class, CommonInputV2DTO.class), m11, "inputList");
        this.nullableCellListBlockDTOAdapter = moshi.f(B2bFormDTO.FormBlockDTO.CellListBlockDTO.class, m11, "cellListBlock");
        this.nullableDisclaimerDTOAdapter = moshi.f(DisclaimerDTO.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public B2bFormDTO.FormBlockDTO fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = null;
        List<CommonInputV2DTO> list = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = null;
        B2bFormDTO.FormBlockDTO.CellListBlockDTO cellListBlockDTO = null;
        DisclaimerDTO disclaimerDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    travelWidgetSettingsDTO = this.nullableTravelWidgetSettingsDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.listOfCommonInputV2DTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("inputList", "inputList", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    cellListBlockDTO = this.nullableCellListBlockDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    disclaimerDTO = this.nullableDisclaimerDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("gap", "gap", reader);
                    }
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -145) {
            if (num == null) {
                throw c.j("id", "id", reader);
            }
            int intValue = num.intValue();
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO>");
            return new B2bFormDTO.FormBlockDTO(intValue, textDTO, textDTO2, travelWidgetSettingsDTO, list, cellListBlockDTO, disclaimerDTO, a11.intValue());
        }
        List<CommonInputV2DTO> list2 = list;
        Constructor<B2bFormDTO.FormBlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = B2bFormDTO.FormBlockDTO.class.getDeclaredConstructor(cls2, TextDTO.class, TextDTO.class, TravelWidgetSettingsDTO.class, List.class, B2bFormDTO.FormBlockDTO.CellListBlockDTO.class, DisclaimerDTO.class, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num == null) {
            throw c.j("id", "id", reader);
        }
        B2bFormDTO.FormBlockDTO newInstance = constructor.newInstance(num, textDTO, textDTO2, travelWidgetSettingsDTO, list2, cellListBlockDTO, disclaimerDTO, a11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(B2bFormDTO.FormBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, B2bFormDTO.FormBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getId()));
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("settings");
        this.nullableTravelWidgetSettingsDTOAdapter.mo44toJson(writer, (x) value.getSettings());
        writer.w("inputList");
        this.listOfCommonInputV2DTOAdapter.mo44toJson(writer, (x) value.getInputList());
        writer.w("cellListBlock");
        this.nullableCellListBlockDTOAdapter.mo44toJson(writer, (x) value.getCellListBlock());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerDTOAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.w("gap");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getGap()));
        writer.p();
    }
}
