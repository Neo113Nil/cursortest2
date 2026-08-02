package ru.ozon.app.android.geo.options.data;

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
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/options/data/OptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/options/data/Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/options/data/Options;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/options/data/Options;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/app/android/geo/options/data/ViewPort;", "viewPortAdapter", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableListOfTextAtomAdapter", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OptionsJsonAdapter extends JsonAdapter<Options> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> nullableListOfTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<ViewPort> viewPortAdapter;

    public OptionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, HammersV3BodyDTO.PLACEHOLDER, SearchIntents.EXTRA_QUERY, "threshold", "geocodingActionPath", "viewPort", "emptyStateElements", "unavailableStateElements", "initialElements");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.intAdapter = moshi.f(Integer.TYPE, m11, "threshold");
        this.viewPortAdapter = moshi.f(ViewPort.class, m11, "viewPort");
        this.nullableListOfTextAtomAdapter = moshi.f(D.e(List.class, TextAtom.class), m11, "emptyStateElements");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(Options)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Options fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ViewPort viewPort = null;
        List<TextAtom> list = null;
        List<TextAtom> list2 = null;
        List<TextAtom> list3 = null;
        while (true) {
            Integer num2 = num;
            if (!reader.hasNext()) {
                String str5 = str;
                reader.endObject();
                if (str5 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str2 == null) {
                    throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                }
                if (str3 == null) {
                    throw c.j(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, reader);
                }
                if (num2 == null) {
                    throw c.j("threshold", "threshold", reader);
                }
                int intValue = num2.intValue();
                if (str4 == null) {
                    throw c.j("geocodingActionPath", "geocodingActionPath", reader);
                }
                if (viewPort != null) {
                    return new Options(str5, str2, str3, intValue, str4, viewPort, list, list2, list3);
                }
                throw c.j("viewPort", "viewPort", reader);
            }
            String str6 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    str = str6;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    num = num2;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                    }
                    num = num2;
                    str = str6;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, reader);
                    }
                    num = num2;
                    str = str6;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("threshold", "threshold", reader);
                    }
                    str = str6;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("geocodingActionPath", "geocodingActionPath", reader);
                    }
                    num = num2;
                    str = str6;
                case 5:
                    viewPort = this.viewPortAdapter.fromJson(reader);
                    if (viewPort == null) {
                        throw c.q("viewPort", "viewPort", reader);
                    }
                    num = num2;
                    str = str6;
                case 6:
                    list = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    num = num2;
                    str = str6;
                case 7:
                    list2 = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    num = num2;
                    str = str6;
                case 8:
                    list3 = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    num = num2;
                    str = str6;
                default:
                    num = num2;
                    str = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Options value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.stringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w(SearchIntents.EXTRA_QUERY);
        this.stringAdapter.mo44toJson(writer, (x) value.getQuery());
        writer.w("threshold");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getThreshold()));
        writer.w("geocodingActionPath");
        this.stringAdapter.mo44toJson(writer, (x) value.getGeocodingActionPath());
        writer.w("viewPort");
        this.viewPortAdapter.mo44toJson(writer, (x) value.getViewPort());
        writer.w("emptyStateElements");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getEmptyStateElements());
        writer.w("unavailableStateElements");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getUnavailableStateElements());
        writer.w("initialElements");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getInitialElements());
        writer.p();
    }
}
