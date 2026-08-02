package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;", "listOfTariffDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;", "asyncBehaviorTypeAtEnumNullFallbackAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$LuggageCellStateDTO;", "nullableLuggageCellStateDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsDTOJsonAdapter extends JsonAdapter<AviaCheckTariffsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AviaCheckTariffsDTO.AsyncBehaviorType> asyncBehaviorTypeAtEnumNullFallbackAdapter;
    private volatile Constructor<AviaCheckTariffsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<AviaCheckTariffsDTO.TariffDTO>> listOfTariffDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<AviaCheckTariffsDTO.LuggageCellStateDTO> nullableLuggageCellStateDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AviaCheckTariffsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "tariffs", "asyncBehaviorType", "asyncParams", "priceDescriptionBadge", "luggageCellState");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.listOfTariffDTOAdapter = moshi.f(D.e(List.class, AviaCheckTariffsDTO.TariffDTO.class), m11, "tariffs");
        this.asyncBehaviorTypeAtEnumNullFallbackAdapter = moshi.f(AviaCheckTariffsDTO.AsyncBehaviorType.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "asyncBehaviorType");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "asyncParams");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "priceDescriptionBadge");
        this.nullableLuggageCellStateDTOAdapter = moshi.f(AviaCheckTariffsDTO.LuggageCellStateDTO.class, m11, "luggageCellState");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(AviaCheckTariffsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AviaCheckTariffsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        List<AviaCheckTariffsDTO.TariffDTO> list = null;
        AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType = null;
        Map<String, String> map = null;
        BadgeDTO badgeDTO = null;
        AviaCheckTariffsDTO.LuggageCellStateDTO luggageCellStateDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.listOfTariffDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("tariffs", "tariffs", reader);
                    }
                    break;
                case 3:
                    asyncBehaviorType = this.asyncBehaviorTypeAtEnumNullFallbackAdapter.fromJson(reader);
                    if (asyncBehaviorType == null) {
                        throw c.q("asyncBehaviorType", "asyncBehaviorType", reader);
                    }
                    i11 = -9;
                    break;
                case 4:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 5:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    luggageCellStateDTO = this.nullableLuggageCellStateDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            List<AviaCheckTariffsDTO.TariffDTO> list2 = list;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            if (textDTO4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (list2 == null) {
                throw c.j("tariffs", "tariffs", reader);
            }
            Intrinsics.g(asyncBehaviorType, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO.AsyncBehaviorType");
            AviaCheckTariffsDTO.LuggageCellStateDTO luggageCellStateDTO2 = luggageCellStateDTO;
            return new AviaCheckTariffsDTO(textDTO4, textDTO3, list2, asyncBehaviorType, map, badgeDTO, luggageCellStateDTO2);
        }
        List<AviaCheckTariffsDTO.TariffDTO> list3 = list;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        Constructor<AviaCheckTariffsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AviaCheckTariffsDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, List.class, AviaCheckTariffsDTO.AsyncBehaviorType.class, Map.class, BadgeDTO.class, AviaCheckTariffsDTO.LuggageCellStateDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<AviaCheckTariffsDTO> constructor2 = constructor;
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (list3 == null) {
            throw c.j("tariffs", "tariffs", reader);
        }
        AviaCheckTariffsDTO newInstance = constructor2.newInstance(textDTO6, textDTO5, list3, asyncBehaviorType, map, badgeDTO, luggageCellStateDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AviaCheckTariffsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("tariffs");
        this.listOfTariffDTOAdapter.mo44toJson(writer, (x) value.getTariffs());
        writer.w("asyncBehaviorType");
        this.asyncBehaviorTypeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getAsyncBehaviorType());
        writer.w("asyncParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getAsyncParams());
        writer.w("priceDescriptionBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getPriceDescriptionBadge());
        writer.w("luggageCellState");
        this.nullableLuggageCellStateDTOAdapter.mo44toJson(writer, (x) value.getLuggageCellState());
        writer.p();
    }
}
