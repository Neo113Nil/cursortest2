package ru.ozon.app.android.favorites.createshoppinglist.data;

import Y9.b;
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
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableListOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListDTOJsonAdapter extends JsonAdapter<CreateShoppingListDTO> {
    private volatile Constructor<CreateShoppingListDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CreateShoppingListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SuggestionDTO.TYPE_SUGGEST, "suggestsTitle", "errorForUser", "newListTitle", "sku", "hint", "saveButton");
        b e11 = D.e(List.class, String.class);
        M m11 = M.f71699a;
        this.nullableListOfStringAdapter = moshi.f(e11, m11, SuggestionDTO.TYPE_SUGGEST);
        this.nullableStringAdapter = moshi.f(String.class, m11, "suggestsTitle");
        this.longAdapter = moshi.f(Long.TYPE, m11, "sku");
        this.stringAdapter = moshi.f(String.class, m11, "hint");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "saveButton");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(43, "GeneratedJsonAdapter(CreateShoppingListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CreateShoppingListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Long l11 = 0L;
        List<String> list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("sku", "sku", reader);
                    }
                    i11 = -17;
                    break;
                case 5:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("hint", "hint", reader);
                    }
                    break;
                case 6:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("saveButton", "saveButton", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            long longValue = l11.longValue();
            if (str4 == null) {
                throw c.j("hint", "hint", reader);
            }
            if (largeButton != null) {
                return new CreateShoppingListDTO(list, str, str2, str3, longValue, str4, largeButton);
            }
            throw c.j("saveButton", "saveButton", reader);
        }
        Constructor<CreateShoppingListDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreateShoppingListDTO.class.getDeclaredConstructor(List.class, String.class, String.class, String.class, Long.TYPE, String.class, ButtonV3Atom.LargeButton.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str4 == null) {
            throw c.j("hint", "hint", reader);
        }
        if (largeButton == null) {
            throw c.j("saveButton", "saveButton", reader);
        }
        CreateShoppingListDTO newInstance = constructor.newInstance(list, str, str2, str3, l11, str4, largeButton, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CreateShoppingListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SuggestionDTO.TYPE_SUGGEST);
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getSuggests());
        writer.w("suggestsTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSuggestsTitle());
        writer.w("errorForUser");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getErrorForUser());
        writer.w("newListTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getNewListTitle());
        writer.w("sku");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSku()));
        writer.w("hint");
        this.stringAdapter.mo44toJson(writer, (x) value.getHint());
        writer.w("saveButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSaveButton());
        writer.p();
    }
}
