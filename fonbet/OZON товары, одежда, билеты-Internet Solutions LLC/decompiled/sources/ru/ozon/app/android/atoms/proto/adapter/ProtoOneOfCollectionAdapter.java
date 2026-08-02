package ru.ozon.app.android.atoms.proto.adapter;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;
import ru.ozon.app.android.atoms.proto.ProtoOneOfCollection;

/* loaded from: classes11.dex */
public abstract class ProtoOneOfCollectionAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {
    private final JsonAdapter<T> elementAdapter;

    /* loaded from: classes6.dex */
    public static class ProtoOneOfCollectionFactory implements JsonAdapter.a {
        static <T> JsonAdapter<Collection<T>> newArrayListAdapter(Type type, Moshi moshi, ProtoOneOf protoOneOf) {
            Type a11 = D.a(type);
            HashSet hashSet = new HashSet();
            hashSet.add(protoOneOf);
            return new ProtoOneOfCollectionAdapter(moshi.e(a11, hashSet)) { // from class: ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter.ProtoOneOfCollectionFactory.1
                {
                    int i11 = 0;
                }

                @Override // ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter, com.squareup.moshi.JsonAdapter
                public /* bridge */ /* synthetic */ Object fromJson(n nVar) throws IOException {
                    return super.fromJson(nVar);
                }

                @Override // ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter
                Collection<T> newCollection() {
                    return new ArrayList();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter, com.squareup.moshi.JsonAdapter
                /* renamed from: toJson */
                public /* bridge */ /* synthetic */ void mo44toJson(x xVar, Object obj) throws IOException {
                    super.mo44toJson(xVar, (x) obj);
                }
            };
        }

        static <T> JsonAdapter<Set<T>> newLinkedHashSetAdapter(Type type, Moshi moshi, ProtoOneOf protoOneOf) {
            Type a11 = D.a(type);
            HashSet hashSet = new HashSet();
            hashSet.add(protoOneOf);
            return new ProtoOneOfCollectionAdapter(moshi.e(a11, hashSet)) { // from class: ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter.ProtoOneOfCollectionFactory.2
                {
                    int i11 = 0;
                }

                @Override // ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter, com.squareup.moshi.JsonAdapter
                public /* bridge */ /* synthetic */ Object fromJson(n nVar) throws IOException {
                    return super.fromJson(nVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter, com.squareup.moshi.JsonAdapter
                /* renamed from: toJson */
                public /* bridge */ /* synthetic */ void mo44toJson(x xVar, Object obj) throws IOException {
                    super.mo44toJson(xVar, (x) obj);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter
                public Set<T> newCollection() {
                    return new LinkedHashSet();
                }
            };
        }

        @Override // com.squareup.moshi.JsonAdapter.a
        public JsonAdapter<?> create(@NotNull Type type, Set<? extends Annotation> set, @NotNull Moshi moshi) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : set) {
                if (annotation instanceof ProtoOneOfCollection) {
                    arrayList.add((ProtoOneOfCollection) annotation);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() > 1) {
                throw new IllegalArgumentException("Annotation ProtoOneOfCollection must be only one.");
            }
            ProtoOneOfCollection protoOneOfCollection = (ProtoOneOfCollection) arrayList.get(0);
            if (Collection.class.isAssignableFrom(D.c(type))) {
                return type == Set.class ? newLinkedHashSetAdapter(type, moshi, protoOneOfCollection.oneOf()) : newArrayListAdapter(type, moshi, protoOneOfCollection.oneOf());
            }
            throw new IllegalStateException("Annotation ProtoOneOfCollection use only for Collection types. user ProtoOneOf");
        }
    }

    /* synthetic */ ProtoOneOfCollectionAdapter(JsonAdapter jsonAdapter, int i11) {
        this(jsonAdapter);
    }

    abstract C newCollection();

    @NotNull
    public String toString() {
        return this.elementAdapter + ".protoOneOfCollection()";
    }

    private ProtoOneOfCollectionAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public C fromJson(n nVar) throws IOException {
        C newCollection = newCollection();
        nVar.beginArray();
        while (nVar.hasNext()) {
            newCollection.add(this.elementAdapter.fromJson(nVar));
        }
        nVar.endArray();
        return newCollection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(x xVar, C c11) throws IOException {
        xVar.c();
        Iterator it = c11.iterator();
        while (it.hasNext()) {
            this.elementAdapter.mo44toJson(xVar, (x) it.next());
        }
        xVar.m();
    }
}
