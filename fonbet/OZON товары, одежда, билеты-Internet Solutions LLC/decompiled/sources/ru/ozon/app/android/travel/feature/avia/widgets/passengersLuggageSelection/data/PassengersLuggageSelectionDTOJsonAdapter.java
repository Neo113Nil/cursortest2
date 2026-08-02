package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data;

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
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data.PassengersLuggageSelectionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO;", "listOfPassengerDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$AsyncBehaviorType;", "asyncBehaviorTypeAdapter", "", "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionDTOJsonAdapter extends JsonAdapter<PassengersLuggageSelectionDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PassengersLuggageSelectionDTO.AsyncBehaviorType> asyncBehaviorTypeAdapter;
    private volatile Constructor<PassengersLuggageSelectionDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<PassengersLuggageSelectionDTO.PassengerDTO>> listOfPassengerDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public PassengersLuggageSelectionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "passengers", "asyncBehaviorType", "asyncParams");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfPassengerDTOAdapter = moshi.f(D.e(List.class, PassengersLuggageSelectionDTO.PassengerDTO.class), m11, "passengers");
        this.asyncBehaviorTypeAdapter = moshi.f(PassengersLuggageSelectionDTO.AsyncBehaviorType.class, m11, "asyncBehaviorType");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "asyncParams");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(PassengersLuggageSelectionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PassengersLuggageSelectionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        List<PassengersLuggageSelectionDTO.PassengerDTO> list = null;
        PassengersLuggageSelectionDTO.AsyncBehaviorType asyncBehaviorType = null;
        Map<String, String> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                list = this.listOfPassengerDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("passengers", "passengers", reader);
                }
                i11 = -3;
            } else if (v11 == 2) {
                asyncBehaviorType = this.asyncBehaviorTypeAdapter.fromJson(reader);
                if (asyncBehaviorType == null) {
                    throw c.q("asyncBehaviorType", "asyncBehaviorType", reader);
                }
            } else if (v11 == 3) {
                map = this.nullableMapOfStringStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            if (textDTO == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data.PassengersLuggageSelectionDTO.PassengerDTO>");
            if (asyncBehaviorType != null) {
                return new PassengersLuggageSelectionDTO(textDTO, list, asyncBehaviorType, map);
            }
            throw c.j("asyncBehaviorType", "asyncBehaviorType", reader);
        }
        Constructor<PassengersLuggageSelectionDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PassengersLuggageSelectionDTO.class.getDeclaredConstructor(TextDTO.class, List.class, PassengersLuggageSelectionDTO.AsyncBehaviorType.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (asyncBehaviorType == null) {
            throw c.j("asyncBehaviorType", "asyncBehaviorType", reader);
        }
        PassengersLuggageSelectionDTO newInstance = constructor.newInstance(textDTO, list, asyncBehaviorType, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PassengersLuggageSelectionDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("passengers");
        this.listOfPassengerDTOAdapter.mo44toJson(writer, (x) value.getPassengers());
        writer.w("asyncBehaviorType");
        this.asyncBehaviorTypeAdapter.mo44toJson(writer, (x) value.getAsyncBehaviorType());
        writer.w("asyncParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getAsyncParams());
        writer.p();
    }
}
