package ru.ozon.android.messenger.framework.data.remote.parser;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/parser/ItemJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/parser/ItemJson;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/remote/parser/ItemJson;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/remote/parser/ItemJson;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/models/items/b;", "modelTypeDTOAdapter", "", "intAdapter", "", "nullableDoubleAdapter", "stringAtDataStringAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ItemJsonJsonAdapter extends JsonAdapter<ItemJson> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ru.ozon.android.messenger.framework.data.remote.models.items.b> modelTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<String> stringAtDataStringAdapter;

    public /* synthetic */ class a implements DataString {
        @Override // java.lang.annotation.Annotation
        public final /* synthetic */ Class annotationType() {
            return DataString.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            return obj instanceof DataString;
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return 0;
        }

        @Override // java.lang.annotation.Annotation
        @NotNull
        public final String toString() {
            return "@ru.ozon.android.messenger.framework.data.remote.parser.DataString()";
        }
    }

    public ItemJsonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "type", "version", "orderBy", "model");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<ru.ozon.android.messenger.framework.data.remote.models.items.b> f11 = moshi.f(ru.ozon.android.messenger.framework.data.remote.models.items.b.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.modelTypeDTOAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.TYPE, m11, "version");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.intAdapter = f12;
        JsonAdapter<Double> f13 = moshi.f(Double.class, m11, "orderBy");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableDoubleAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, e0.h(new a()), "model");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.stringAtDataStringAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(30, "GeneratedJsonAdapter(ItemJson)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ItemJson fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        ru.ozon.android.messenger.framework.data.remote.models.items.b bVar = null;
        Double d11 = null;
        String str2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Y9.c.q("id", "id", reader);
                }
            } else if (v11 == 1) {
                bVar = this.modelTypeDTOAdapter.fromJson(reader);
                if (bVar == null) {
                    throw Y9.c.q("type", "type", reader);
                }
            } else if (v11 == 2) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw Y9.c.q("version", "version", reader);
                }
            } else if (v11 == 3) {
                d11 = this.nullableDoubleAdapter.fromJson(reader);
            } else if (v11 == 4 && (str2 = this.stringAtDataStringAdapter.fromJson(reader)) == null) {
                throw Y9.c.q("model", "model", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Y9.c.j("id", "id", reader);
        }
        if (bVar == null) {
            throw Y9.c.j("type", "type", reader);
        }
        if (num == null) {
            throw Y9.c.j("version", "version", reader);
        }
        int intValue = num.intValue();
        if (str2 != null) {
            return new ItemJson(str, bVar, intValue, d11, str2);
        }
        throw Y9.c.j("model", "model", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ItemJson value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("type");
        this.modelTypeDTOAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("version");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getVersion()));
        writer.w("orderBy");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value_.getOrderBy());
        writer.w("model");
        this.stringAtDataStringAdapter.mo44toJson(writer, (x) value_.getModel());
        writer.p();
    }
}
