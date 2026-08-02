package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data;

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
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2DTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$ActionPane;", "actionPaneAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$Passenger;", "listOfPassengerAdapter", "", "booleanAdapter", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "nullableEmptyStateDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2DTOJsonAdapter extends JsonAdapter<AdditionalLuggageV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AdditionalLuggageV2DTO.ActionPane> actionPaneAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AdditionalLuggageV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<AdditionalLuggageV2DTO.Passenger>> listOfPassengerAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateDTO> nullableEmptyStateDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public AdditionalLuggageV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "actionPane", "passengers", "shouldFetchState", "emptyState");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.actionPaneAdapter = moshi.f(AdditionalLuggageV2DTO.ActionPane.class, m11, "actionPane");
        this.listOfPassengerAdapter = moshi.f(D.e(List.class, AdditionalLuggageV2DTO.Passenger.class), m11, "passengers");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "shouldFetchState");
        this.nullableEmptyStateDTOAdapter = moshi.f(EmptyStateDTO.class, m11, "emptyState");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(AdditionalLuggageV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdditionalLuggageV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        TextAtom textAtom = null;
        AdditionalLuggageV2DTO.ActionPane actionPane = null;
        List<AdditionalLuggageV2DTO.Passenger> list = null;
        EmptyStateDTO emptyStateDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                actionPane = this.actionPaneAdapter.fromJson(reader);
                if (actionPane == null) {
                    throw c.q("actionPane", "actionPane", reader);
                }
            } else if (v11 == 2) {
                list = this.listOfPassengerAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("passengers", "passengers", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("shouldFetchState", "shouldFetchState", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                emptyStateDTO = this.nullableEmptyStateDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -13) {
            if (textAtom == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (actionPane == null) {
                throw c.j("actionPane", "actionPane", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2DTO.Passenger>");
            return new AdditionalLuggageV2DTO(textAtom, actionPane, list, bool2.booleanValue(), emptyStateDTO);
        }
        Constructor<AdditionalLuggageV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AdditionalLuggageV2DTO.class.getDeclaredConstructor(TextAtom.class, AdditionalLuggageV2DTO.ActionPane.class, List.class, Boolean.TYPE, EmptyStateDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textAtom == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (actionPane == null) {
            throw c.j("actionPane", "actionPane", reader);
        }
        AdditionalLuggageV2DTO newInstance = constructor.newInstance(textAtom, actionPane, list, bool2, emptyStateDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdditionalLuggageV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("actionPane");
        this.actionPaneAdapter.mo44toJson(writer, (x) value.getActionPane());
        writer.w("passengers");
        this.listOfPassengerAdapter.mo44toJson(writer, (x) value.getPassengers());
        writer.w("shouldFetchState");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldFetchState()));
        writer.w("emptyState");
        this.nullableEmptyStateDTOAdapter.mo44toJson(writer, (x) value.getEmptyState());
        writer.p();
    }
}
