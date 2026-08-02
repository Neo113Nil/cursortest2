package ru.ozon.app.android.geo.map.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO_Icons_SearchIcon_OptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "intAdapter", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableListOfTextAtomAdapter", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapDTO_Icons_SearchIcon_OptionsJsonAdapter extends JsonAdapter<AddressEditMapDTO.Icons.SearchIcon.Options> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> nullableListOfTextAtomAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AddressEditMapDTO_Icons_SearchIcon_OptionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, HammersV3BodyDTO.PLACEHOLDER, SearchIntents.EXTRA_QUERY, "threshold", "geocodingActionPath", "emptyStateElements", "unavailableStateElements", "initialElements");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, HammersV3BodyDTO.PLACEHOLDER);
        this.intAdapter = moshi.f(Integer.TYPE, m11, "threshold");
        this.nullableListOfTextAtomAdapter = moshi.f(D.e(List.class, TextAtom.class), m11, "emptyStateElements");
    }

    @NotNull
    public String toString() {
        return b.c(64, "GeneratedJsonAdapter(AddressEditMapDTO.Icons.SearchIcon.Options)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressEditMapDTO.Icons.SearchIcon.Options fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List<TextAtom> list = null;
        List<TextAtom> list2 = null;
        List<TextAtom> list3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, reader);
                    }
                    break;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("threshold", "threshold", reader);
                    }
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("geocodingActionPath", "geocodingActionPath", reader);
                    }
                    break;
                case 5:
                    list = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    list2 = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    list3 = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str2 == null) {
            throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
        }
        if (str3 == null) {
            throw c.j(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, reader);
        }
        if (num == null) {
            throw c.j("threshold", "threshold", reader);
        }
        int intValue = num.intValue();
        if (str4 != null) {
            return new AddressEditMapDTO.Icons.SearchIcon.Options(str, str2, str3, intValue, str4, list, list2, list3);
        }
        throw c.j("geocodingActionPath", "geocodingActionPath", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressEditMapDTO.Icons.SearchIcon.Options value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.stringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w(SearchIntents.EXTRA_QUERY);
        this.stringAdapter.mo44toJson(writer, (x) value.getQuery());
        writer.w("threshold");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getThreshold()));
        writer.w("geocodingActionPath");
        this.stringAdapter.mo44toJson(writer, (x) value.getGeocodingActionPath());
        writer.w("emptyStateElements");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getEmptyStateElements());
        writer.w("unavailableStateElements");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getUnavailableStateElements());
        writer.w("initialElements");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getInitialElements());
        writer.p();
    }
}
