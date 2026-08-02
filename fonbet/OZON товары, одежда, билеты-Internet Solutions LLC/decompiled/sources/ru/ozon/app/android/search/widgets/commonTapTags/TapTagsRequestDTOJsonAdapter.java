package ru.ozon.app.android.search.widgets.commonTapTags;

import Ak.b;
import Y9.c;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsRequestDTOJsonAdapter extends JsonAdapter<TapTagsRequestDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TapTagsRequestDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TapTagsRequestDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SearchIntents.EXTRA_QUERY, "link", "widgetVersion");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SearchIntents.EXTRA_QUERY);
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "widgetVersion");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(TapTagsRequestDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TapTagsRequestDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Integer num = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("link", "link", reader);
                }
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
                i11 = -5;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            Integer num2 = num;
            String str3 = str2;
            String str4 = str;
            if (str4 == null) {
                throw c.j(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, reader);
            }
            if (str3 != null) {
                return new TapTagsRequestDTO(str4, str3, num2, false, null, 24, null);
            }
            throw c.j("link", "link", reader);
        }
        Integer num3 = num;
        String str5 = str2;
        String str6 = str;
        Constructor<TapTagsRequestDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TapTagsRequestDTO.class.getDeclaredConstructor(String.class, String.class, Integer.class, Boolean.TYPE, Long.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str6 == null) {
            throw c.j(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, reader);
        }
        if (str5 == null) {
            throw c.j("link", "link", reader);
        }
        TapTagsRequestDTO newInstance = constructor.newInstance(str6, str5, num3, Boolean.FALSE, null, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TapTagsRequestDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SearchIntents.EXTRA_QUERY);
        this.stringAdapter.mo44toJson(writer, (x) value.getQuery());
        writer.w("link");
        this.stringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("widgetVersion");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getWidgetVersion());
        writer.p();
    }
}
