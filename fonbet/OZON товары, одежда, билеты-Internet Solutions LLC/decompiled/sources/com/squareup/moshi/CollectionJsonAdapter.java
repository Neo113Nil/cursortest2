package com.squareup.moshi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u0000 \u0018*\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0019B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/squareup/moshi/CollectionJsonAdapter;", "", "C", "T", "Lcom/squareup/moshi/JsonAdapter;", "elementAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "newCollection", "()Ljava/util/Collection;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/util/Collection;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/util/Collection;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonAdapter;", "Factory", "a", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final JsonAdapter<T> elementAdapter;

    /* renamed from: com.squareup.moshi.CollectionJsonAdapter$a, reason: from kotlin metadata */
    public static final class Companion implements JsonAdapter.a {
        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            if (!annotations.isEmpty()) {
                return null;
            }
            Class<?> a11 = F.a(type);
            if (Intrinsics.d(a11, List.class) ? true : Intrinsics.d(a11, Collection.class)) {
                final JsonAdapter<T> d11 = moshi.d(D.a(type));
                return new CollectionJsonAdapter<Collection<Object>, Object>(d11) { // from class: com.squareup.moshi.CollectionJsonAdapter$Factory$newArrayListAdapter$1
                    {
                        DefaultConstructorMarker defaultConstructorMarker = null;
                    }

                    @Override // com.squareup.moshi.CollectionJsonAdapter
                    @NotNull
                    public Collection<Object> newCollection() {
                        return new ArrayList();
                    }
                }.nullSafe();
            }
            if (!Intrinsics.d(a11, Set.class)) {
                return null;
            }
            final JsonAdapter<T> d12 = moshi.d(D.a(type));
            return new CollectionJsonAdapter<Set<Object>, Object>(d12) { // from class: com.squareup.moshi.CollectionJsonAdapter$Factory$newLinkedHashSetAdapter$1
                {
                    DefaultConstructorMarker defaultConstructorMarker = null;
                }

                @Override // com.squareup.moshi.CollectionJsonAdapter
                @NotNull
                public Set<Object> newCollection() {
                    return new LinkedHashSet();
                }
            }.nullSafe();
        }
    }

    public /* synthetic */ CollectionJsonAdapter(JsonAdapter jsonAdapter, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonAdapter);
    }

    @NotNull
    public abstract C newCollection();

    @NotNull
    public String toString() {
        return this.elementAdapter + ".collection()";
    }

    private CollectionJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public C fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        C newCollection = newCollection();
        reader.beginArray();
        while (reader.hasNext()) {
            newCollection.add(this.elementAdapter.fromJson(reader));
        }
        reader.endArray();
        return newCollection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, C value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.c();
        Iterator it = value.iterator();
        while (it.hasNext()) {
            this.elementAdapter.mo44toJson(writer, (x) it.next());
        }
        writer.m();
    }
}
