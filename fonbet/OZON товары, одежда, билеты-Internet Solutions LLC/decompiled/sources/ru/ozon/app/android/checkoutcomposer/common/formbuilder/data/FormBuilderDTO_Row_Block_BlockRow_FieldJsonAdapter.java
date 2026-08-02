package ru.ozon.app.android.checkoutcomposer.common.formbuilder.data;

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
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO_Row_Block_BlockRow_FieldJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;", "nullableSearchOptionsAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions;", "nullableSelectOptionsAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$TextOptions;", "nullableTextOptionsAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ActionOptions;", "nullableActionOptionsAdapter", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField;", "nullableChipsWithFieldAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderDTO_Row_Block_BlockRow_FieldJsonAdapter extends JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FormBuilderDTO.Row.Block.BlockRow.Field> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.ActionOptions> nullableActionOptionsAdapter;

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField> nullableChipsWithFieldAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions> nullableSearchOptionsAdapter;

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions> nullableSelectOptionsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions> nullableTextOptionsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FormBuilderDTO_Row_Block_BlockRow_FieldJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("fieldType", "fieldSize", AppMeasurementSdk.ConditionalUserProperty.NAME, "label", "text", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isEnabled", "searchOptions", "selectOptions", "textOptions", "actionOptions", "error", "elements", "chipsWithField", "onboarding");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "fieldType");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "fieldSize");
        this.nullableStringAdapter = moshi.f(String.class, m11, "text");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isEnabled");
        this.nullableSearchOptionsAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.class, m11, "searchOptions");
        this.nullableSelectOptionsAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.class, m11, "selectOptions");
        this.nullableTextOptionsAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions.class, m11, "textOptions");
        this.nullableActionOptionsAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.ActionOptions.class, m11, "actionOptions");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "elements");
        this.nullableChipsWithFieldAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField.class, m11, "chipsWithField");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(FormBuilderDTO.Row.Block.BlockRow.Field)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FormBuilderDTO.Row.Block.BlockRow.Field fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions textOptions = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField chipsWithField = null;
        OnBoardingDTO onBoardingDTO = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions searchOptions = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions selectOptions = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.ActionOptions actionOptions = null;
        List<AtomDTO> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("fieldType", "fieldType", reader);
                    }
                    break;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("fieldSize", "fieldSize", reader);
                    }
                    break;
                case 2:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("label", "label", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("value_", AppMeasurementSdk.ConditionalUserProperty.VALUE, reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isEnabled", "isEnabled", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    searchOptions = this.nullableSearchOptionsAdapter.fromJson(reader);
                    break;
                case 8:
                    selectOptions = this.nullableSelectOptionsAdapter.fromJson(reader);
                    break;
                case 9:
                    textOptions = this.nullableTextOptionsAdapter.fromJson(reader);
                    break;
                case 10:
                    actionOptions = this.nullableActionOptionsAdapter.fromJson(reader);
                    break;
                case 11:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    list = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 13:
                    chipsWithField = this.nullableChipsWithFieldAdapter.fromJson(reader);
                    break;
                case 14:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -109) {
            if (str == null) {
                throw c.j("fieldType", "fieldType", reader);
            }
            if (num == null) {
                throw c.j("fieldSize", "fieldSize", reader);
            }
            FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions textOptions2 = textOptions;
            int intValue = num.intValue();
            Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            return new FormBuilderDTO.Row.Block.BlockRow.Field(str, intValue, str4, str2, str6, str3, bool2.booleanValue(), searchOptions, selectOptions, textOptions2, actionOptions, str5, list, chipsWithField, onBoardingDTO);
        }
        FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions textOptions3 = textOptions;
        String str7 = str5;
        FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField chipsWithField2 = chipsWithField;
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        String str8 = str2;
        String str9 = str3;
        Constructor<FormBuilderDTO.Row.Block.BlockRow.Field> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = FormBuilderDTO.Row.Block.BlockRow.Field.class.getDeclaredConstructor(String.class, cls2, String.class, String.class, String.class, String.class, Boolean.TYPE, FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.class, FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.class, FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions.class, FormBuilderDTO.Row.Block.BlockRow.Field.ActionOptions.class, String.class, List.class, FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField.class, OnBoardingDTO.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("fieldType", "fieldType", reader);
        }
        if (num == null) {
            throw c.j("fieldSize", "fieldSize", reader);
        }
        FormBuilderDTO.Row.Block.BlockRow.Field newInstance = constructor.newInstance(str, num, str4, str8, str6, str9, bool2, searchOptions, selectOptions, textOptions3, actionOptions, str7, list, chipsWithField2, onBoardingDTO2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FormBuilderDTO.Row.Block.BlockRow.Field value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("fieldType");
        this.stringAdapter.mo44toJson(writer, (x) value.getFieldType());
        writer.w("fieldSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getFieldSize()));
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("label");
        this.stringAdapter.mo44toJson(writer, (x) value.getLabel());
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.stringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("isEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isEnabled()));
        writer.w("searchOptions");
        this.nullableSearchOptionsAdapter.mo44toJson(writer, (x) value.getSearchOptions());
        writer.w("selectOptions");
        this.nullableSelectOptionsAdapter.mo44toJson(writer, (x) value.getSelectOptions());
        writer.w("textOptions");
        this.nullableTextOptionsAdapter.mo44toJson(writer, (x) value.getTextOptions());
        writer.w("actionOptions");
        this.nullableActionOptionsAdapter.mo44toJson(writer, (x) value.getActionOptions());
        writer.w("error");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getError());
        writer.w("elements");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getElements());
        writer.w("chipsWithField");
        this.nullableChipsWithFieldAdapter.mo44toJson(writer, (x) value.getChipsWithField());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.p();
    }
}
