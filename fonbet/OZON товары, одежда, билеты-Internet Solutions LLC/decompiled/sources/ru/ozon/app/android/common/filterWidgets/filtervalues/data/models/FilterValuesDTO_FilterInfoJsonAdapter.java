package ru.ozon.app.android.common.filterWidgets.filtervalues.data.models;

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
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO_FilterInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfStringAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesDTO_FilterInfoJsonAdapter extends JsonAdapter<FilterValuesDTO.FilterInfo> {
    private volatile Constructor<FilterValuesDTO.FilterInfo> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FilterValuesDTO_FilterInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("key", "type", "activeValues", "isSingle", "isInverted");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "key");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "activeValues");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSingle");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(FilterValuesDTO.FilterInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FilterValuesDTO.FilterInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        List<String> list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("key", "key", reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("type", "type", reader);
                }
            } else if (v11 == 2) {
                list = this.nullableListOfStringAdapter.fromJson(reader);
                i11 = -5;
            } else if (v11 == 3) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 4) {
                bool2 = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -5) {
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            List<String> list2 = list;
            String str3 = str2;
            String str4 = str;
            if (str4 == null) {
                throw c.j("key", "key", reader);
            }
            if (str3 != null) {
                return new FilterValuesDTO.FilterInfo(str4, str3, list2, bool4, bool3);
            }
            throw c.j("type", "type", reader);
        }
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        List<String> list3 = list;
        String str5 = str2;
        String str6 = str;
        Constructor<FilterValuesDTO.FilterInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FilterValuesDTO.FilterInfo.class.getDeclaredConstructor(String.class, String.class, List.class, Boolean.class, Boolean.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str6 == null) {
            throw c.j("key", "key", reader);
        }
        if (str5 == null) {
            throw c.j("type", "type", reader);
        }
        FilterValuesDTO.FilterInfo newInstance = constructor.newInstance(str6, str5, list3, bool6, bool5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FilterValuesDTO.FilterInfo value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("key");
        this.stringAdapter.mo44toJson(writer, (x) value.getKey());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("activeValues");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getActiveValues());
        writer.w("isSingle");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSingle());
        writer.w("isInverted");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isInverted());
        writer.p();
    }
}
