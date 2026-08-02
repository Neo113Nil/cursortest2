package ru.ozon.moshi.adapters.serialize.collection;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.F;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.collection.reader.DefaultCollectionJsonReader;
import ru.ozon.moshi.adapters.serialize.collection.reader.JsonCollectionReader;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u001cB\u001f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00028\u0000H ¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/moshi/adapters/serialize/collection/JsonCollectionAdapter;", "", "C", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "collectionReader", "elementAdapter", "<init>", "(Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;Lcom/squareup/moshi/JsonAdapter;)V", "newCollection$moshi_adapters_release", "()Ljava/util/Collection;", "newCollection", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/util/Collection;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/util/Collection;)V", "", "toString", "()Ljava/lang/String;", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "Lcom/squareup/moshi/JsonAdapter;", "Factory", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JsonCollectionAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {

    @NotNull
    private final JsonCollectionReader collectionReader;

    @NotNull
    private final JsonAdapter<T> elementAdapter;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u000f0\u000e\"\u0004\b\u0002\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u00120\u000e\"\u0004\b\u0002\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\u0004\b\u0002\u0010\u0006*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/moshi/adapters/serialize/collection/JsonCollectionAdapter$Factory;", "Lcom/squareup/moshi/JsonAdapter$a;", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "reader", "<init>", "(Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;)V", "T", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "", "newArrayListAdapter", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "", "newLinkedHashSetAdapter", "getReader", "(Ljava/util/Set;)Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "elementType", "elementAdapter", "(Lcom/squareup/moshi/Moshi;Ljava/lang/reflect/Type;Ljava/util/Set;)Lcom/squareup/moshi/JsonAdapter;", "withoutJsonDecoding", "(Ljava/util/Set;)Ljava/util/Set;", "create", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements JsonAdapter.a {

        @NotNull
        private final JsonCollectionReader reader;

        public Factory(@NotNull JsonCollectionReader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.reader = reader;
        }

        private final <T> JsonAdapter<T> elementAdapter(Moshi moshi, Type type, Set<? extends Annotation> set) {
            JsonAdapter<T> e11 = moshi.e(type, withoutJsonDecoding(set));
            Intrinsics.checkNotNullExpressionValue(e11, "adapter(...)");
            return e11;
        }

        private final JsonCollectionReader getReader(Set<? extends Annotation> annotations) {
            Set<? extends Annotation> set = annotations;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof JsonCollectionDecoding) {
                        return this.reader;
                    }
                }
            }
            return DefaultCollectionJsonReader.INSTANCE;
        }

        private final <T> JsonAdapter<Collection<T>> newArrayListAdapter(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
            Type a11 = D.a(type);
            Intrinsics.f(a11);
            final JsonAdapter<T> elementAdapter = elementAdapter(moshi, a11, annotations);
            final JsonCollectionReader reader = getReader(annotations);
            return new JsonCollectionAdapter<Collection<T>, T>(elementAdapter, reader) { // from class: ru.ozon.moshi.adapters.serialize.collection.JsonCollectionAdapter$Factory$newArrayListAdapter$1
                @Override // ru.ozon.moshi.adapters.serialize.collection.JsonCollectionAdapter
                public Collection<T> newCollection$moshi_adapters_release() {
                    return new ArrayList();
                }
            };
        }

        private final <T> JsonAdapter<Set<T>> newLinkedHashSetAdapter(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
            Type a11 = D.a(type);
            Intrinsics.f(a11);
            final JsonAdapter<T> elementAdapter = elementAdapter(moshi, a11, annotations);
            final JsonCollectionReader reader = getReader(annotations);
            return new JsonCollectionAdapter<Set<T>, T>(elementAdapter, reader) { // from class: ru.ozon.moshi.adapters.serialize.collection.JsonCollectionAdapter$Factory$newLinkedHashSetAdapter$1
                @Override // ru.ozon.moshi.adapters.serialize.collection.JsonCollectionAdapter
                public Set<T> newCollection$moshi_adapters_release() {
                    return new LinkedHashSet();
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Set<Annotation> withoutJsonDecoding(Set<? extends Annotation> set) {
            Set<Annotation> f7 = D.f(set, JsonCollectionDecoding.class);
            return f7 == null ? set : f7;
        }

        @Override // com.squareup.moshi.JsonAdapter.a
        public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Class<?> a11 = F.a(type);
            if (Intrinsics.d(a11, List.class) || Intrinsics.d(a11, Collection.class)) {
                return newArrayListAdapter(type, annotations, moshi).nullSafe();
            }
            if (Intrinsics.d(a11, Set.class)) {
                return newLinkedHashSetAdapter(type, annotations, moshi).nullSafe();
            }
            return null;
        }
    }

    public JsonCollectionAdapter(@NotNull JsonCollectionReader collectionReader, @NotNull JsonAdapter<T> elementAdapter) {
        Intrinsics.checkNotNullParameter(collectionReader, "collectionReader");
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        this.collectionReader = collectionReader;
        this.elementAdapter = elementAdapter;
    }

    @NotNull
    public abstract C newCollection$moshi_adapters_release();

    @NotNull
    public String toString() {
        return this.elementAdapter + ".ozonCollection()";
    }

    @Override // com.squareup.moshi.JsonAdapter
    public C fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return (C) this.collectionReader.read(reader, newCollection$moshi_adapters_release(), this.elementAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, C value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            return;
        }
        writer.c();
        Iterator it = value.iterator();
        while (it.hasNext()) {
            this.elementAdapter.mo44toJson(writer, (x) it.next());
        }
        writer.m();
    }
}
