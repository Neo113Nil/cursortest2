package ru.ozon.tracker.model;

import Y9.b;
import Y9.c;
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
import ru.ozon.tracker.model.EventEntity;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0017\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/model/EventEntity_FilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/EventEntity$Filter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/EventEntity$Filter;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/EventEntity$Filter;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "", "nullableListOfIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableListOfStringAdapter", "nullableListOfListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventEntity_FilterJsonAdapter extends JsonAdapter<EventEntity.Filter> {
    private volatile Constructor<EventEntity.Filter> constructorRef;

    @NotNull
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;

    @NotNull
    private final JsonAdapter<List<List<String>>> nullableListOfListOfStringAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    public EventEntity_FilterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("ids", "names", "values");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, Integer.class);
        M m11 = M.f71699a;
        JsonAdapter<List<Integer>> f7 = moshi.f(e11, m11, "ids");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableListOfIntAdapter = f7;
        JsonAdapter<List<String>> f11 = moshi.f(D.e(List.class, String.class), m11, "names");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfStringAdapter = f11;
        JsonAdapter<List<List<String>>> f12 = moshi.f(D.e(List.class, D.e(List.class, String.class)), m11, "values");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfListOfStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(40, "GeneratedJsonAdapter(EventEntity.Filter)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EventEntity.Filter fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<Integer> list = null;
        List<String> list2 = null;
        List<List<String>> list3 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfIntAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                list2 = this.nullableListOfStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                list3 = this.nullableListOfListOfStringAdapter.fromJson(reader);
                i11 &= -5;
            }
        }
        reader.endObject();
        if (i11 == -8) {
            return new EventEntity.Filter(list, list2, list3);
        }
        Constructor<EventEntity.Filter> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EventEntity.Filter.class.getDeclaredConstructor(List.class, List.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        EventEntity.Filter newInstance = constructor.newInstance(list, list2, list3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EventEntity.Filter value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("ids");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getIds());
        writer.w("names");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getNames());
        writer.w("values");
        this.nullableListOfListOfStringAdapter.mo44toJson(writer, (x) value_.getValues());
        writer.p();
    }
}
