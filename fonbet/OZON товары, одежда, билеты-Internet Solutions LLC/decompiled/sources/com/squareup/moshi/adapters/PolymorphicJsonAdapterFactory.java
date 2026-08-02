package com.squareup.moshi.adapters;

import B3.D;
import Tc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.F;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class PolymorphicJsonAdapterFactory<T> implements JsonAdapter.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<T> f60384a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f60385b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f60386c;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory$PolymorphicJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "", "labelKey", "", "labels", "Ljava/lang/reflect/Type;", "subtypes", "jsonAdapters", "fallbackJsonAdapter", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/n;", "reader", "", "labelIndex", "(Lcom/squareup/moshi/n;)I", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Ljava/util/List;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/n$a;", "labelKeyOptions", "Lcom/squareup/moshi/n$a;", "labelOptions", "moshi-adapters"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PolymorphicJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<Object> fallbackJsonAdapter;

        @NotNull
        private final List<JsonAdapter<Object>> jsonAdapters;

        @NotNull
        private final String labelKey;

        @NotNull
        private final n.a labelKeyOptions;

        @NotNull
        private final n.a labelOptions;

        @NotNull
        private final List<String> labels;

        @NotNull
        private final List<Type> subtypes;

        /* JADX WARN: Multi-variable type inference failed */
        public PolymorphicJsonAdapter(@NotNull String labelKey, @NotNull List<String> labels, @NotNull List<? extends Type> subtypes, @NotNull List<? extends JsonAdapter<Object>> jsonAdapters, JsonAdapter<Object> jsonAdapter) {
            Intrinsics.checkNotNullParameter(labelKey, "labelKey");
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(subtypes, "subtypes");
            Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
            this.labelKey = labelKey;
            this.labels = labels;
            this.subtypes = subtypes;
            this.jsonAdapters = jsonAdapters;
            this.fallbackJsonAdapter = jsonAdapter;
            this.labelKeyOptions = n.a.C0918a.a(labelKey);
            Object[] array = labels.toArray(new String[0]);
            Intrinsics.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            this.labelOptions = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        private final int labelIndex(n reader) {
            reader.beginObject();
            while (reader.hasNext()) {
                if (reader.v(this.labelKeyOptions) != -1) {
                    int w11 = reader.w(this.labelOptions);
                    if (w11 != -1 || this.fallbackJsonAdapter != null) {
                        return w11;
                    }
                    throw new k("Expected one of " + this.labels + " for key '" + this.labelKey + "' but found '" + reader.nextString() + "'. Register a subtype for this label.");
                }
                reader.y();
                reader.skipValue();
            }
            throw new k("Missing label for " + this.labelKey);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            n q11 = reader.q();
            q11.x(false);
            try {
                int labelIndex = labelIndex(q11);
                q11.close();
                if (labelIndex != -1) {
                    return this.jsonAdapters.get(labelIndex).fromJson(reader);
                }
                JsonAdapter<Object> jsonAdapter = this.fallbackJsonAdapter;
                if (jsonAdapter != null) {
                    return jsonAdapter.fromJson(reader);
                }
                return null;
            } finally {
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo44toJson(@NotNull x writer, Object value) throws IOException {
            JsonAdapter<Object> jsonAdapter;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.f(value);
            int indexOf = this.subtypes.indexOf(value.getClass());
            if (indexOf == -1) {
                jsonAdapter = this.fallbackJsonAdapter;
                if (jsonAdapter == null) {
                    throw new IllegalArgumentException(("Expected one of " + this.subtypes + " but found " + value + ", a " + value.getClass() + ". Register this subtype.").toString());
                }
            } else {
                jsonAdapter = this.jsonAdapters.get(indexOf);
            }
            writer.j();
            if (jsonAdapter != this.fallbackJsonAdapter) {
                writer.w(this.labelKey).R(this.labels.get(indexOf));
            }
            int d11 = writer.d();
            jsonAdapter.mo44toJson(writer, (x) value);
            writer.o(d11);
            writer.p();
        }

        @NotNull
        public String toString() {
            return D.c(new StringBuilder("PolymorphicJsonAdapter("), this.labelKey, ')');
        }
    }

    public PolymorphicJsonAdapterFactory(@NotNull Class baseType, @NotNull List labels, @NotNull List subtypes) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter("type", "labelKey");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(subtypes, "subtypes");
        this.f60384a = baseType;
        this.f60385b = labels;
        this.f60386c = subtypes;
    }

    @NotNull
    public static final PolymorphicJsonAdapterFactory b(@NotNull Class baseType) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter("type", "labelKey");
        K k11 = K.f71697a;
        return new PolymorphicJsonAdapterFactory(baseType, k11, k11);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @NotNull
    public final PolymorphicJsonAdapterFactory<T> c(@NotNull Class<? extends T> subtype, @NotNull String label) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(label, "label");
        ?? r02 = this.f60385b;
        if (r02.contains(label)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        b builder = C7714v.B();
        builder.addAll((Collection) r02);
        builder.add(label);
        Intrinsics.checkNotNullParameter(builder, "builder");
        b B11 = builder.B();
        b builder2 = C7714v.B();
        builder2.addAll((Collection) this.f60386c);
        builder2.add(subtype);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        return new PolymorphicJsonAdapterFactory<>(this.f60384a, B11, builder2.B());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (!Intrinsics.d(F.a(type), this.f60384a) || !annotations.isEmpty()) {
            return null;
        }
        ?? r32 = this.f60386c;
        Iterable iterable = (Iterable) r32;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(moshi.d((Type) it.next()));
        }
        return new PolymorphicJsonAdapter("type", this.f60385b, r32, arrayList, null).nullSafe();
    }
}
